package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r0 {
    public final /* synthetic */ v0 a;

    public r0(v0 v0Var) {
        this.a = v0Var;
    }

    public final void a(boolean z) {
        if (this.a.u.compareAndSet(false, true)) {
            this.a.d("onCancelResult(" + z + ");");
            this.a.v.set(false);
        }
    }
}
