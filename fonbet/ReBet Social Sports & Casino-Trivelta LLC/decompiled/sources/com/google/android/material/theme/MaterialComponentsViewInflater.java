package com.google.android.material.theme;

import Ba.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.C2048c;
import androidx.appcompat.widget.C2062q;
import androidx.appcompat.widget.C2068x;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import m.t;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends t {
    @Override // m.t
    public C2048c c(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // m.t
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // m.t
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // m.t
    public C2062q k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // m.t
    public C2068x o(Context context, AttributeSet attributeSet) {
        return new Ka.a(context, attributeSet);
    }
}
