package com.moloco.sdk.internal.publisher;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class t0 extends sq3 {
    public String r;
    public /* synthetic */ Object s;
    public final /* synthetic */ u0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = u0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
