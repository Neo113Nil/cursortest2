package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import xsna.e23;
import xsna.fpo0;
import xsna.ll10;
import xsna.pm10;
import xsna.qm10;
import xsna.u33;
import xsna.zm10;

/* loaded from: classes13.dex */
public class MaterialComponentsViewInflater extends u33 {
    @Override // xsna.u33
    @NonNull
    public final e23 a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return new ll10(context, attributeSet);
    }

    @Override // xsna.u33
    @NonNull
    public final AppCompatButton b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // xsna.u33
    @NonNull
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // xsna.u33
    @NonNull
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        int i = R$attr.radioButtonStyle;
        int i2 = pm10.h;
        pm10 pm10Var = new pm10(zm10.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = pm10Var.getContext();
        TypedArray d = fpo0.d(context2, attributeSet, R$styleable.MaterialRadioButton, i, i2, new int[0]);
        if (d.hasValue(R$styleable.MaterialRadioButton_buttonTint)) {
            pm10Var.setButtonTintList(qm10.a(context2, d, R$styleable.MaterialRadioButton_buttonTint));
        }
        pm10Var.g = d.getBoolean(R$styleable.MaterialRadioButton_useMaterialThemeColors, false);
        d.recycle();
        return pm10Var;
    }

    @Override // xsna.u33
    @NonNull
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
