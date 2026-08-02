package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.app.y;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C5059d;
import androidx.appcompat.widget.C5072q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import l7.C7891a;
import u7.C9978a;

/* loaded from: classes9.dex */
public class MaterialComponentsViewInflater extends y {
    @Override // androidx.appcompat.app.y
    @NonNull
    protected final C5059d a(@NonNull Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.y
    @NonNull
    protected final AppCompatButton b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.y
    @NonNull
    protected final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new C7891a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.y
    @NonNull
    protected final C5072q d(Context context, AttributeSet attributeSet) {
        return new C9978a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.y
    @NonNull
    protected final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
