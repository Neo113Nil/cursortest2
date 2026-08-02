package com.moloco.sdk.internal.services.bidtoken;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v extends sq3 {
    public com.facebook.login.i r;
    public m s;
    public com.moloco.sdk.internal.bidtoken.a t;
    public /* synthetic */ Object u;
    public final /* synthetic */ com.facebook.login.i v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.facebook.login.i iVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = iVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.f(null, this);
    }
}
