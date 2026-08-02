package ru.ozon.fintech.base.bottom;

import android.view.View;

/* loaded from: classes3.dex */
final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f94994a;

    d(g gVar) {
        this.f94994a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g gVar = this.f94994a;
        if (gVar.f95001f && gVar.isShowing() && gVar.shouldWindowCloseOnTouchOutside()) {
            gVar.cancel();
        }
    }
}
