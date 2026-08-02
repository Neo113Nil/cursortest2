package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class t implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextInputLayout f58796a;

    t(TextInputLayout textInputLayout) {
        this.f58796a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NonNull Editable editable) {
        boolean z11;
        boolean z12;
        TextInputLayout textInputLayout = this.f58796a;
        z11 = textInputLayout.f58654Z0;
        textInputLayout.w0(!z11);
        if (textInputLayout.f58666l) {
            textInputLayout.p0(editable.length());
        }
        z12 = textInputLayout.f58674s;
        if (z12) {
            textInputLayout.y0(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
