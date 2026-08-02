package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import com.facebook.internal.t;
import com.facebook.login.i;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.acm.services.d;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.ad2;
import defpackage.c40;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.mqi;
import defpackage.rob;
import defpackage.s9a;
import defpackage.ypa;
import defpackage.z45;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements h, f, o {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a a;
    public final ad2 b;
    public final c40 c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f d;
    public final t e;
    public final mqi f;
    public final fdi g;
    public final mqi h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a i;

    public b(Context context, String str, Set set, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar2, c cVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar) {
        str.getClass();
        set.getClass();
        this.a = aVar;
        hs4 hs4Var = z45.a;
        this.b = s9a.c(rob.a);
        i iVar = new i(set, cVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f(context, fVar, fVar2, cVar, z);
        fVar3.addJavascriptInterface(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b(iVar), "AndroidTemplateBridge");
        c40 c40Var = new c40(context, fVar3, bVar);
        this.c = c40Var;
        fVar3.addJavascriptInterface((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a) c40Var.g, "AndroidMraid");
        this.d = fVar3;
        this.e = new t(15, fVar3, cVar);
        mqi b = ypa.b(new com.moloco.sdk.internal.b(4, str, this));
        this.f = b;
        this.g = gdi.a(Boolean.FALSE);
        this.h = ypa.b(new d(this, 14));
        this.i = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) b.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, g gVar) {
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) this.f.getValue()).a(j, new t(14, this, gVar));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad destroy called", null, false, 12, null);
        Boolean bool = Boolean.FALSE;
        fdi fdiVar = this.g;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) this.c.c).removeJavascriptInterface("AndroidMraid");
        this.d.destroy();
        s9a.o(this.b, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.i.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return (ddi) this.h.getValue();
    }
}
