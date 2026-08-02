package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes9.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f58749a;

    /* renamed from: b, reason: collision with root package name */
    Context f58750b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f58751c;

    /* renamed from: d, reason: collision with root package name */
    final int f58752d;

    m(@NonNull TextInputLayout textInputLayout, int i11) {
        this.f58749a = textInputLayout;
        this.f58750b = textInputLayout.getContext();
        this.f58751c = textInputLayout.u();
        this.f58752d = i11;
    }

    abstract void a();

    boolean b(int i11) {
        return true;
    }

    void c(boolean z11) {
    }
}
