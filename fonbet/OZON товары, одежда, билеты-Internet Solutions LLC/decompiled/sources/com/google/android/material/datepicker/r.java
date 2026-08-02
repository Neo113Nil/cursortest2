package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes9.dex */
final class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f58300a;

    r(p pVar) {
        this.f58300a = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CheckableImageButton checkableImageButton;
        CheckableImageButton checkableImageButton2;
        p pVar = this.f58300a;
        pVar.f58292u.setEnabled(pVar.B().D0());
        checkableImageButton = pVar.f58290s;
        checkableImageButton.toggle();
        checkableImageButton2 = pVar.f58290s;
        pVar.H(checkableImageButton2);
        pVar.F();
    }
}
