package com.moloco.sdk.internal.services.bidtoken;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class w extends sq3 {
    public x r;
    public Object s;
    public m t;
    public com.moloco.sdk.acm.h u;
    public boolean v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ x y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, sq3 sq3Var) {
        super(sq3Var);
        this.y = xVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, null, false, false, this);
    }
}
