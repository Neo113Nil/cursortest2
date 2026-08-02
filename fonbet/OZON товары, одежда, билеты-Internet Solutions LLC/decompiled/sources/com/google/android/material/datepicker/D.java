package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.h;

/* loaded from: classes9.dex */
final class D implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f58209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E f58210b;

    D(E e11, int i11) {
        this.f58210b = e11;
        this.f58209a = i11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        E e11 = this.f58210b;
        hVar = e11.f58211a;
        u b11 = u.b(this.f58209a, hVar.D().f58306b);
        hVar2 = e11.f58211a;
        u e12 = hVar2.B().e(b11);
        hVar3 = e11.f58211a;
        hVar3.G(e12);
        hVar4 = e11.f58211a;
        hVar4.H(h.d.DAY);
    }
}
