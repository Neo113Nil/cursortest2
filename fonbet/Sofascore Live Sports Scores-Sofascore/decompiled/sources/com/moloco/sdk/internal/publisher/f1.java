package com.moloco.sdk.internal.publisher;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f1 extends sq3 {
    public Object r;
    public com.moloco.sdk.acm.recorder.c s;
    public com.moloco.sdk.internal.services.init.h t;
    public /* synthetic */ Object u;
    public final /* synthetic */ g1 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, sq3 sq3Var) {
        super(sq3Var);
        this.v = g1Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, null, null, null, this);
    }
}
