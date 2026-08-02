package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.mqi;
import defpackage.ph0;
import defpackage.rob;
import defpackage.s9a;
import defpackage.ypa;
import defpackage.z45;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {
    public final Context a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b b;
    public final com.moloco.sdk.acm.recorder.c c;
    public final ad2 d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m j;
    public final fdi k;
    public final mqi l;
    public final fdi m;

    public k(Context context, String str, com.moloco.sdk.internal.services.z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, com.moloco.sdk.acm.recorder.c cVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar) {
        str.getClass();
        kVar.getClass();
        this.a = context;
        this.b = bVar;
        this.c = cVar;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.d = c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(1, c);
        this.e = cVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(1, c);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b(zVar, c);
        this.f = bVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(0, c);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(2, c);
        this.g = cVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(0, c);
        this.h = cVar4;
        this.i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b(context, str, ph0.a0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a[]{cVar2, bVar2, fVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(cVar, 0), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(t0Var, 1), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d(kVar), fVar2, cVar3, cVar4}), bVar2, fVar, fVar2, cVar, z, aVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m a = l0.a(str);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Template ad resolved creativeType: " + a, false, 4, null);
        this.j = a;
        Boolean bool = Boolean.FALSE;
        this.k = gdi.a(bool);
        this.l = ypa.b(new com.moloco.sdk.acm.services.d(this, 11));
        this.m = gdi.a(bool);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.i.a(j, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "destroy called", null, false, 12, null);
        this.i.destroy();
        WeakReference weakReference = FullscreenWebviewActivity.j;
        com.facebook.appevents.j.e();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.i.i.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final ddi k() {
        return this.m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return (ddi) this.l.getValue();
    }
}
