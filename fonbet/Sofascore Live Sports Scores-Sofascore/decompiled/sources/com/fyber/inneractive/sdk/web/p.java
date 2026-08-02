package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ i0 a;

    public p(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar = this.a.b;
        if (mVar == null) {
            return false;
        }
        mVar.getViewTreeObserver().removeOnPreDrawListener(this);
        i0 i0Var = this.a;
        i0Var.a(i0Var.b.getContext(), true);
        return false;
    }
}
