package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
