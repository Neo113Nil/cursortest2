package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class l implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AutoCompleteTextView f58747a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f58748b;

    l(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f58748b = hVar;
        this.f58747a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            h hVar = this.f58748b;
            if (h.k(hVar)) {
                hVar.f58724l = false;
            }
            h.q(hVar, this.f58747a);
            h.r(hVar);
        }
        return false;
    }
}
