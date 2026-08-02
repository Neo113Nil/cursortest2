package com.fyber.inneractive.sdk.web;

/* loaded from: classes12.dex */
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
