package com.moloco.sdk.internal.publisher;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r0 extends sq3 {
    public u0 r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ u0 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(u0 u0Var, sq3 sq3Var) {
        super(sq3Var);
        this.u = u0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, null, this);
    }
}
