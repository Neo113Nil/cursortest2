package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import defpackage.fdi;
import defpackage.rd4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k {
    public final /* synthetic */ fdi k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u0(Context context, t0 t0Var, rd4 rd4Var, fdi fdiVar, String str) {
        super(context, str, r3, new com.moloco.sdk.service_locator.h(13), new com.appsflyer.internal.a(14), new com.appsflyer.internal.a(15), t0Var, false, rd4Var);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0 a0Var = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0.Interstitial;
        this.k = fdiVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k
    public final void e() {
        if (this.i == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c0.Expanded) {
            d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c0.Default);
        }
        this.k.m(null, Boolean.FALSE);
    }
}
