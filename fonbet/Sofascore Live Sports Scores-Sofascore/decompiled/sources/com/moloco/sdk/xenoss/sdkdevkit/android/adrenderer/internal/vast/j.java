package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.b98;
import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public k t;
    public final /* synthetic */ k u;
    public b98 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, rq3 rq3Var) {
        super(rq3Var);
        this.u = kVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
