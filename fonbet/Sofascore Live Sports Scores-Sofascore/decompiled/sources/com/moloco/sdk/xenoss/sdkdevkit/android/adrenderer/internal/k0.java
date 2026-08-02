package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a70;
import defpackage.b98;
import defpackage.c40;
import defpackage.dsf;
import defpackage.fdi;
import defpackage.hs4;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.pdk;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y7k;
import defpackage.z45;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(3:34|35|(1:37))|13|(4:15|(2:17|(1:(1:20)(2:27|28))(1:29))(1:30)|21|(1:23))(1:31)|24|25))|41|6|7|(0)(0)|13|(0)(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0136, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0138, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "TemplateWebView", "Failed to access WebView settings", r0, false, 8, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[Catch: Exception -> 0x0136, TryCatch #0 {Exception -> 0x0136, blocks: (B:11:0x0034, B:13:0x007b, B:15:0x00a8, B:20:0x00ea, B:21:0x00f8, B:23:0x010c, B:27:0x00ed, B:28:0x00f2, B:29:0x00f3, B:30:0x00f6, B:31:0x0119, B:35:0x0046), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119 A[Catch: Exception -> 0x0136, TRY_LEAVE, TryCatch #0 {Exception -> 0x0136, blocks: (B:11:0x0034, B:13:0x007b, B:15:0x00a8, B:20:0x00ea, B:21:0x00f8, B:23:0x010c, B:27:0x00ed, B:28:0x00f2, B:29:0x00f3, B:30:0x00f6, B:31:0x0119, B:35:0x0046), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar, rq3 rq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e eVar2;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar;
        k0 k0Var = this;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar3 = eVar;
        if (rq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e) {
            eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e) rq3Var;
            int i2 = eVar2.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar2.v = i2 - Integer.MIN_VALUE;
                Object obj = eVar2.t;
                lu3 lu3Var = lu3.a;
                i = eVar2.v;
                int i3 = 1;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Playlist item displaying event received: " + eVar3, null, false, 12, null);
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    pdk pdkVar = new pdk((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) k0Var.b, eVar3, rq3Var2, 24);
                    eVar2.r = k0Var;
                    eVar2.s = eVar3;
                    eVar2.v = 1;
                    if (xw3.R(r69Var, pdkVar, eVar2) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar4 = eVar2.s;
                    k0 k0Var2 = eVar2.r;
                    y6a.M(obj);
                    eVar3 = eVar4;
                    k0Var = k0Var2;
                }
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder("Set playback: ");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) k0Var.b;
                c40 c40Var = (c40) k0Var.c;
                sb.append(fVar.getSettings().getMediaPlaybackRequiresUserGesture());
                MolocoLogger.info$default(molocoLogger, "TemplateWebView", sb.toString(), null, false, 12, null);
                if (eVar3 != com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e.MRAID) {
                    MolocoLogger.info$default(molocoLogger, "TemplateWebView", "Playlist item displaying event is MRAID, setting orientation to: " + ((fdi) c40Var.k).getValue(), null, false, 12, null);
                    fdi fdiVar = fVar.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w wVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w) ((fdi) c40Var.k).getValue();
                    wVar.getClass();
                    int i4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.z.a[wVar.c.ordinal()];
                    if (i4 == 1) {
                        aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.a;
                    } else if (i4 == 2) {
                        aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.b;
                    } else {
                        if (i4 != 3) {
                            throw new ndd();
                        }
                        aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.c;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(aVar, wVar.b);
                    fdiVar.getClass();
                    fdiVar.m(null, bVar);
                    c40Var.k();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) k0Var.d;
                    if (aVar2 != null) {
                        xw3.L(fVar.d, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(fVar, aVar2, rq3Var2, i3), 3);
                    }
                } else {
                    MolocoLogger.info$default(molocoLogger, "TemplateWebView", "Playlist item displaying event is not MRAID, setting orientation to none", null, false, 12, null);
                    fdi fdiVar2 = fVar.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b();
                    fdiVar2.getClass();
                    fdiVar2.m(null, bVar2);
                }
                return Unit.a;
            }
        }
        eVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e(k0Var, rq3Var);
        Object obj2 = eVar2.t;
        lu3 lu3Var2 = lu3.a;
        i = eVar2.v;
        int i32 = 1;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("Set playback: ");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) k0Var.b;
        c40 c40Var2 = (c40) k0Var.c;
        sb2.append(fVar2.getSettings().getMediaPlaybackRequiresUserGesture());
        MolocoLogger.info$default(molocoLogger2, "TemplateWebView", sb2.toString(), null, false, 12, null);
        if (eVar3 != com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e.MRAID) {
        }
        return Unit.a;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        switch (this.a) {
            case 0:
                y7k y7kVar = (y7k) obj;
                int i = y7kVar.a;
                ((dsf) this.b).a = i;
                dsf dsfVar = (dsf) this.c;
                if (i == dsfVar.a) {
                    return Unit.a;
                }
                dsfVar.a = i;
                Object q = ((j8f) ((k8f) this.d)).e.q(rq3Var, y7kVar);
                return q == lu3.a ? q : Unit.a;
            default:
                return a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e) obj, rq3Var);
        }
    }
}
