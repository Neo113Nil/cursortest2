package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* loaded from: classes9.dex */
final class i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f58744a;

    i(h hVar) {
        this.f58744a = hVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        h hVar = this.f58744a;
        h.r(hVar);
        h.o(hVar, false);
    }
}
