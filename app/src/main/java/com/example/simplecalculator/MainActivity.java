package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private TextView tvResult;
    private Button bSumar, bRestar, bMultiplicar, bDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //IDs other variables
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        tvResult = findViewById(R.id.tvResult);

        //Buttons
        Button sumar = findViewById(R.id.bSumar);
        Button restar = findViewById(R.id.bRestar);
        Button multiplicar = findViewById(R.id.bMultiplicar);
        Button dividir = findViewById(R.id.bDividir);
    }

    public void sumar (View view){
       String numero1 = n1.getText().toString();
       String numero2 = n2.getText().toString();
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int result = num1 + num2;
        String resultado ="El resultado es " + String.valueOf(result);
        tvResult.setText(resultado);
    }

    public void restar (View view){
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int result = num1 - num2;
        String resultado ="El resultado es " + String.valueOf(result);
        tvResult.setText(resultado);
    }

    public void multiplicar (View view){
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int result = num1 * num2;
        String resultado ="El resultado es " + String.valueOf(result);
        tvResult.setText(resultado);
    }

    public void dividir (View view){
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int result = num1 / num2;
        String resultado ="El resultado es " + String.valueOf(result);
        tvResult.setText(resultado);
    }

}
