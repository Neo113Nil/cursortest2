package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s extends m {
    public final InneractiveAdRequest e;
    public final q0 f;

    public s(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.flow.o oVar) {
        super(rVar, str, oVar);
        this.e = inneractiveAdRequest;
        q0 q0Var = new q0(new q(this), inneractiveAdRequest, rVar);
        this.f = q0Var;
        q0Var.d = new r(this);
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final void a() {
        this.b = true;
        this.a = null;
        this.f.a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final String b() {
        return this.f.r();
    }
}
