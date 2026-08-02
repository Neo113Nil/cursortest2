package com.fyber.inneractive.sdk.web;

/* loaded from: classes12.dex */
public final class e1 implements Runnable {
    public final /* synthetic */ i1 a;

    public e1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.a.b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.a.K);
        }
    }
}
