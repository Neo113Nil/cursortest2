package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import defpackage.b98;
import defpackage.fdi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.z88;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fdi b;

    public /* synthetic */ l(fdi fdiVar, int i) {
        this.a = i;
        this.b = fdiVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        fdi fdiVar = this.b;
        switch (i) {
            case 0:
                fdiVar.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(b98Var, 3), rq3Var);
                break;
            default:
                fdiVar.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(b98Var, 5), rq3Var);
                break;
        }
        return lu3.a;
    }
}
