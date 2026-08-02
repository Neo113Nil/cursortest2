package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = mVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
