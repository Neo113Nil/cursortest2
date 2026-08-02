package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.publisher.z0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.rob;
import defpackage.s9a;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {
    public final Context a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b b;
    public final x0 c;
    public final u0 d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o e;
    public final String f;
    public final com.moloco.sdk.acm.recorder.c g;
    public final ad2 h;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g i;
    public z0 j;
    public boolean k;
    public final fdi l;
    public final fdi m;
    public final fdi n;
    public final fdi o;

    public c(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, x0 x0Var, u0 u0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o oVar, String str, com.moloco.sdk.acm.recorder.c cVar) {
        aeh aehVar = MraidActivity.h;
        this.a = context;
        this.b = bVar;
        this.c = x0Var;
        this.d = u0Var;
        this.e = oVar;
        this.f = str;
        this.g = cVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a;
        hs4 hs4Var = z45.a;
        this.h = s9a.c(rob.a);
        Boolean bool = Boolean.FALSE;
        fdi a = gdi.a(bool);
        this.l = a;
        this.m = a;
        fdi a2 = gdi.a(bool);
        this.n = a2;
        this.o = a2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.i = gVar;
        this.d.e = new com.moloco.sdk.internal.publisher.l0(1, this, c.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0, 2);
        this.c.a(j, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.h, null);
        this.d.destroy();
        this.l.m(null, Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.c.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final ddi k() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return this.m;
    }
}
