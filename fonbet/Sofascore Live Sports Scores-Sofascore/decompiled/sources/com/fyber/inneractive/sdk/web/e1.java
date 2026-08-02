package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
