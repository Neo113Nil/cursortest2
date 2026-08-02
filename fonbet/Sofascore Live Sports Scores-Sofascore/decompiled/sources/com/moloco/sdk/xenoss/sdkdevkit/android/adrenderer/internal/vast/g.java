package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g extends sq3 {
    public u r;
    public String s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = uVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.i(null, null, false, this);
    }
}
