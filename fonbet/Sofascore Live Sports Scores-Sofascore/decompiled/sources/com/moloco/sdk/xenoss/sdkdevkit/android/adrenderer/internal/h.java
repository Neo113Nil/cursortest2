package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.mqi;
import defpackage.rob;
import defpackage.s9a;
import defpackage.ypa;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {
    public final Context a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b b;
    public final com.moloco.sdk.acm.recorder.c c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m d;
    public final ad2 e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c f;
    public final d g;
    public final fdi h;
    public final mqi i;
    public final fdi j;

    public h(Context context, com.moloco.sdk.internal.services.events.c cVar, String str, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, com.moloco.sdk.acm.recorder.c cVar2) {
        str.getClass();
        this.a = context;
        this.b = bVar;
        this.c = cVar2;
        this.d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.c;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.e = c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c(context, new com.moloco.sdk.internal.services.z(t0Var, cVar), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n(), false, 50);
        this.f = cVar3;
        this.g = new d(str, c, cVar3);
        Boolean bool = Boolean.FALSE;
        this.h = gdi.a(bool);
        this.i = ypa.b(new com.moloco.sdk.acm.services.d(this, 10));
        this.j = gdi.a(bool);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.g.a(j, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.e, null);
        this.f.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.g.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final ddi k() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return (ddi) this.i.getValue();
    }
}
