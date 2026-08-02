package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* loaded from: classes12.dex */
public final class n0 implements u1 {
    public final /* synthetic */ p0 a;

    public n0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.b.post(this.a.l);
        p0 p0Var = this.a;
        v1 v1Var = p0Var.m;
        if (v1Var != null) {
            v1Var.e = null;
            p0Var.m = null;
        }
        p0Var.q = false;
    }
}
