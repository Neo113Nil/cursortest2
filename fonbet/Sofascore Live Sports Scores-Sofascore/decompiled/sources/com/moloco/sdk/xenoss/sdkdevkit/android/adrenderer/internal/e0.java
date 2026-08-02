package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e0 extends sq3 {
    public g0 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ g0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = g0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(this);
    }
}
