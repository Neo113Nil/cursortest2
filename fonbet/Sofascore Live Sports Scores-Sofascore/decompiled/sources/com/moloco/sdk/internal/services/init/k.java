package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.publisher.MediationInfo;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k extends sq3 {
    public n r;
    public String s;
    public MediationInfo t;
    public com.moloco.sdk.acm.recorder.c u;
    public /* synthetic */ Object v;
    public final /* synthetic */ n w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = nVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(null, null, null, this);
    }
}
