package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import defpackage.a70;
import defpackage.a74;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.ddi;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hje;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rd4;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.v98;
import defpackage.x7k;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y7k;
import defpackage.z45;
import defpackage.zzl;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {
    public final Context a;
    public final com.moloco.sdk.internal.services.events.c b;
    public final com.moloco.sdk.internal.ortb.model.y c;
    public final t0 d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b e;
    public final com.moloco.sdk.acm.recorder.c f;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m g = null;
    public final ad2 h;
    public p i;
    public c j;
    public h k;
    public final com.facebook.b l;
    public final fdi m;
    public final fdi n;
    public final fdi o;
    public final fdi p;
    public final fdi q;
    public final fdi r;

    public g0(Context context, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.internal.ortb.model.y yVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, com.moloco.sdk.acm.recorder.c cVar2) {
        this.a = context;
        this.b = cVar;
        this.c = yVar;
        this.d = t0Var;
        this.e = bVar;
        this.f = cVar2;
        hs4 hs4Var = z45.a;
        this.h = s9a.c(rob.a);
        this.l = new com.facebook.b(21);
        Boolean bool = Boolean.FALSE;
        fdi a = gdi.a(bool);
        this.m = a;
        this.n = a;
        fdi a2 = gdi.a(bool);
        this.o = a2;
        this.p = a2;
        fdi a3 = gdi.a(bool);
        this.q = a3;
        this.r = a3;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        xw3.L(this.h, null, null, new a74(this, j, gVar, (rq3) null, 14), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rq3 rq3Var) {
        e0 e0Var;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar;
        int i2;
        com.moloco.sdk.internal.ortb.model.b bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d;
        ad2 ad2Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d3;
        ddi k;
        ddi l;
        ddi isLoaded;
        g0 g0Var = this;
        if (rq3Var instanceof e0) {
            e0Var = (e0) rq3Var;
            int i3 = e0Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e0Var.u = i3 - Integer.MIN_VALUE;
                Object obj = e0Var.s;
                lu3 lu3Var = lu3.a;
                i = e0Var.u;
                int i4 = 1;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    mVar = g0Var.g;
                    if (mVar == null) {
                        hs4 hs4Var = z45.a;
                        hje hjeVar = new hje(g0Var, rq3Var2, 23);
                        e0Var.r = g0Var;
                        e0Var.u = 1;
                        obj = xw3.R(hs4Var, hjeVar, e0Var);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    i2 = 0;
                    switch (c0.a[mVar.ordinal()]) {
                        case 1:
                            com.facebook.b bVar2 = g0Var.l;
                            Context context = g0Var.a;
                            com.moloco.sdk.internal.ortb.model.y yVar = g0Var.c;
                            boolean z = com.moloco.sdk.service_locator.g.b().b;
                            g0Var.i = new p(context, yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x.b(context), com.moloco.sdk.service_locator.a.a(), com.moloco.sdk.service_locator.g.b().b, g0Var.e, g0Var.f);
                            break;
                        case 2:
                            com.facebook.b bVar3 = g0Var.l;
                            Context context2 = g0Var.a;
                            ad2 ad2Var2 = g0Var.h;
                            com.moloco.sdk.internal.ortb.model.y yVar2 = g0Var.c;
                            t0 t0Var = g0Var.d;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar4 = g0Var.e;
                            fdi fdiVar = g0Var.o;
                            com.moloco.sdk.internal.ortb.model.d dVar = yVar2.d.a;
                            boolean z2 = (dVar == null || (bVar = dVar.d) == null) ? false : bVar.a;
                            com.moloco.sdk.acm.recorder.c cVar = g0Var.f;
                            rd4 rd4Var = new rd4(context2, ad2Var2, z2);
                            String str = yVar2.a;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0 a0Var = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0.Inline;
                            u0 u0Var = new u0(context2, t0Var, rd4Var, fdiVar, str);
                            int i5 = 0;
                            Class<u0> cls = u0.class;
                            com.moloco.sdk.internal.publisher.nativead.b bVar5 = new com.moloco.sdk.internal.publisher.nativead.b(0, u0Var, cls, "closeFullscreenAdRepresentation", "closeFullscreenAdRepresentation()V", i5, 9);
                            x7k x7kVar = y7k.b;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o oVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o(bVar5, ad2Var2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h0) rd4Var.f, (aeh) rd4Var.d);
                            x0 x0Var = new x0(ad2Var2, yVar2, com.moloco.sdk.service_locator.a.a(), new com.moloco.sdk.internal.publisher.l0(1, u0Var, cls, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i5, 5));
                            aeh aehVar = MraidActivity.h;
                            g0Var.j = new c(context2, bVar4, x0Var, u0Var, oVar, yVar2.f, cVar);
                            break;
                        case 3:
                            com.facebook.b bVar6 = g0Var.l;
                            Context context3 = g0Var.a;
                            com.moloco.sdk.internal.services.events.c cVar2 = g0Var.b;
                            String str2 = g0Var.c.a;
                            t0 t0Var2 = g0Var.d;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar7 = g0Var.e;
                            com.moloco.sdk.acm.recorder.c cVar3 = g0Var.f;
                            str2.getClass();
                            g0Var.k = new h(context3, cVar2, str2, t0Var2, bVar7, cVar3);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            g0Var.getClass();
                            MolocoLogger.error$default(molocoLogger, "AggregatedFullscreenAd", "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                            break;
                        case 7:
                            MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                            g0Var.getClass();
                            MolocoLogger.error$default(molocoLogger2, "AggregatedFullscreenAd", "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                            break;
                        default:
                            zzl.b();
                            return null;
                    }
                    d = g0Var.d();
                    ad2Var = g0Var.h;
                    if (d != null && (isLoaded = d.isLoaded()) != null) {
                        fcp.m0(new v98(isLoaded, new f0(g0Var, rq3Var2, i2), 3), ad2Var);
                    }
                    d2 = g0Var.d();
                    if (d2 != null && (l = d2.l()) != null) {
                        fcp.m0(new v98(l, new f0(g0Var, rq3Var2, i4), 3), ad2Var);
                    }
                    d3 = g0Var.d();
                    if (d3 != null && (k = d3.k()) != null) {
                        fcp.m0(new v98(k, new f0(g0Var, rq3Var2, 2), 3), ad2Var);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g0Var = e0Var.r;
                y6a.M(obj);
                mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m) obj;
                i2 = 0;
                switch (c0.a[mVar.ordinal()]) {
                }
                d = g0Var.d();
                ad2Var = g0Var.h;
                if (d != null) {
                    fcp.m0(new v98(isLoaded, new f0(g0Var, rq3Var2, i2), 3), ad2Var);
                }
                d2 = g0Var.d();
                if (d2 != null) {
                    fcp.m0(new v98(l, new f0(g0Var, rq3Var2, i4), 3), ad2Var);
                }
                d3 = g0Var.d();
                if (d3 != null) {
                    fcp.m0(new v98(k, new f0(g0Var, rq3Var2, 2), 3), ad2Var);
                }
                return Unit.a;
            }
        }
        e0Var = new e0(g0Var, (sq3) rq3Var);
        Object obj2 = e0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = e0Var.u;
        int i42 = 1;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m) obj2;
        i2 = 0;
        switch (c0.a[mVar.ordinal()]) {
        }
        d = g0Var.d();
        ad2Var = g0Var.h;
        if (d != null) {
        }
        d2 = g0Var.d();
        if (d2 != null) {
        }
        d3 = g0Var.d();
        if (d3 != null) {
        }
        return Unit.a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar = this.i;
        return (pVar == null && (pVar = this.j) == null) ? this.k : pVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.h, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p d = d();
        if (d != null) {
            d.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return this.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final ddi k() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return this.p;
    }
}
