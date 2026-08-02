package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes9.dex */
final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f58270a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f58271b;

    n(h hVar, x xVar) {
        this.f58271b = hVar;
        this.f58270a = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f58271b;
        int findLastVisibleItemPosition = hVar.F().findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            hVar.G(this.f58270a.g(findLastVisibleItemPosition));
        }
    }
}
