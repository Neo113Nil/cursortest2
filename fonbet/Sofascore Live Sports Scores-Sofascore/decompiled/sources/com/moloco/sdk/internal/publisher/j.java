package com.moloco.sdk.internal.publisher;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j extends sq3 {
    public w0 r;
    public com.moloco.sdk.acm.recorder.c s;
    public com.moloco.sdk.acm.h t;
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = sVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, null, null, this);
    }
}
