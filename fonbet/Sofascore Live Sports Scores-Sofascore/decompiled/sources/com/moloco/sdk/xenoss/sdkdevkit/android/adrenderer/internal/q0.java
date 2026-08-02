package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q0 extends sq3 {
    public com.facebook.internal.t r;
    public m0 s;
    public String t;
    public String u;
    public /* synthetic */ Object v;
    public final /* synthetic */ com.facebook.internal.t w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.facebook.internal.t tVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = tVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.d(null, null, this);
    }
}
