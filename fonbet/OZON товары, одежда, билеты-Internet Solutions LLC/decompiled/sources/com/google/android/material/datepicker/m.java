package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes9.dex */
final class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f58268a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f58269b;

    m(h hVar, x xVar) {
        this.f58269b = hVar;
        this.f58268a = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f58269b;
        int findFirstVisibleItemPosition = hVar.F().findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < hVar.f58254i.getAdapter().getCardsCount()) {
            hVar.G(this.f58268a.g(findFirstVisibleItemPosition));
        }
    }
}
