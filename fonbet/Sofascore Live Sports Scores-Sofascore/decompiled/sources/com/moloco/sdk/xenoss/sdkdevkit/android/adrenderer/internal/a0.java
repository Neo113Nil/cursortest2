package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.i1;
import defpackage.a70;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.h2;
import defpackage.hs4;
import defpackage.jof;
import defpackage.lu3;
import defpackage.mp1;
import defpackage.nea;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.un0;
import defpackage.v98;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {
    public final fdi a;
    public final jof b;
    public final /* synthetic */ b0 c;
    public final /* synthetic */ com.moloco.sdk.internal.services.events.c d;

    public a0(b0 b0Var, com.moloco.sdk.internal.services.events.c cVar) {
        this.c = b0Var;
        this.d = cVar;
        fdi a = gdi.a(Boolean.FALSE);
        this.a = a;
        this.b = un0.u(a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        b0 b0Var = this.c;
        xw3.L(b0Var.m, null, null, new h2(this, b0Var, j, gVar, null, 13), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rq3 rq3Var) {
        y yVar;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m creativeType;
        b0 b0Var;
        ad2 ad2Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e bannerImpl;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e bannerImpl2;
        ddi l;
        ddi isLoaded;
        a0 a0Var = this;
        if (rq3Var instanceof y) {
            yVar = (y) rq3Var;
            int i2 = yVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.u = i2 - Integer.MIN_VALUE;
                Object obj = yVar.s;
                lu3 lu3Var = lu3.a;
                i = yVar.u;
                int i3 = 0;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    b0 b0Var2 = a0Var.c;
                    MolocoLogger.debug$default(molocoLogger, b0Var2.p, "Preparing banner", false, 4, null);
                    creativeType = b0Var2.getCreativeType();
                    if (creativeType == null) {
                        hs4 hs4Var = z45.a;
                        z zVar = new z(b0Var2, rq3Var2, i3);
                        yVar.r = a0Var;
                        yVar.u = 1;
                        obj = xw3.R(hs4Var, zVar, yVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    int i4 = 3;
                    switch (w.a[creativeType.ordinal()]) {
                        case 1:
                            b0 b0Var3 = a0Var.c;
                            com.moloco.sdk.internal.d dVar = b0Var3.l;
                            dVar.getClass();
                            xw3.L(com.moloco.sdk.internal.scheduling.b.a, null, null, new nea(new com.moloco.sdk.internal.b(i3, b0Var3, dVar), rq3Var2, i4), 3);
                            Context context = b0Var3.g;
                            com.moloco.sdk.internal.services.events.c cVar = a0Var.d;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar = b0Var3.i.a;
                            t0 t0Var = b0Var3.j;
                            ad2 ad2Var2 = b0Var3.m;
                            b0Var3.s = new o(context, cVar, sVar, t0Var, ad2Var2, new n(b0Var3.h, ad2Var2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x.b(context), com.moloco.sdk.service_locator.a.a(), true, null));
                            break;
                        case 2:
                            b0 b0Var4 = a0Var.c;
                            b0 b0Var5 = a0Var.c;
                            b0Var4.t = new y0(b0Var5.g, b0Var5.h.a, b0Var5.j, b0Var5.k, b0Var5.m);
                            break;
                        case 3:
                            b0 b0Var6 = a0Var.c;
                            Context context2 = b0Var6.g;
                            com.moloco.sdk.internal.services.z zVar2 = b0Var6.n;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n nVar = b0Var6.o;
                            i1 i1Var = b0Var6.h.d.e;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c(context2, zVar2, nVar, (i1Var != null ? i1Var.a : null) != null, 34);
                            b0Var6.u = new f(b0Var6.g, b0Var6.k, cVar2, new d(b0Var6.h.a, b0Var6.m, cVar2), b0Var6.m);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, a0Var.c.p, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                            break;
                        case 7:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, a0Var.c.p, "Unknown creative type for timeout error", null, false, 12, null);
                            break;
                        default:
                            zzl.b();
                            return null;
                    }
                    b0Var = a0Var.c;
                    ad2Var = b0Var.m;
                    bannerImpl = b0Var.getBannerImpl();
                    if (bannerImpl != null && (isLoaded = bannerImpl.isLoaded()) != null) {
                        fcp.m0(new v98(isLoaded, new mp1(a0Var, rq3Var2, 10), 3), ad2Var);
                    }
                    bannerImpl2 = b0Var.getBannerImpl();
                    if (bannerImpl2 != null && (l = bannerImpl2.l()) != null) {
                        fcp.m0(new v98(l, new mp1(b0Var, rq3Var2, 11), 3), ad2Var);
                    }
                    b0Var.setAdShowListener(b0Var.getAdShowListener());
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a0Var = yVar.r;
                y6a.M(obj);
                creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m) obj;
                int i42 = 3;
                switch (w.a[creativeType.ordinal()]) {
                }
                b0Var = a0Var.c;
                ad2Var = b0Var.m;
                bannerImpl = b0Var.getBannerImpl();
                if (bannerImpl != null) {
                    fcp.m0(new v98(isLoaded, new mp1(a0Var, rq3Var2, 10), 3), ad2Var);
                }
                bannerImpl2 = b0Var.getBannerImpl();
                if (bannerImpl2 != null) {
                    fcp.m0(new v98(l, new mp1(b0Var, rq3Var2, 11), 3), ad2Var);
                }
                b0Var.setAdShowListener(b0Var.getAdShowListener());
                return Unit.a;
            }
        }
        yVar = new y(a0Var, (sq3) rq3Var);
        Object obj2 = yVar.s;
        lu3 lu3Var2 = lu3.a;
        i = yVar.u;
        int i32 = 0;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m) obj2;
        int i422 = 3;
        switch (w.a[creativeType.ordinal()]) {
        }
        b0Var = a0Var.c;
        ad2Var = b0Var.m;
        bannerImpl = b0Var.getBannerImpl();
        if (bannerImpl != null) {
        }
        bannerImpl2 = b0Var.getBannerImpl();
        if (bannerImpl2 != null) {
        }
        b0Var.setAdShowListener(b0Var.getAdShowListener());
        return Unit.a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.b;
    }
}
