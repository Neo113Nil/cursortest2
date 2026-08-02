package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver;

/* loaded from: classes9.dex */
final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f58418a;

    f(d dVar) {
        this.f58418a = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f58418a.u();
        return true;
    }
}
