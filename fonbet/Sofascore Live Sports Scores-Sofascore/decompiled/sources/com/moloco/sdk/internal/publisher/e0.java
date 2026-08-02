package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.ortb.model.k1;
import com.unity3d.services.UnityAdsConstants;
import defpackage.hs4;
import defpackage.it8;
import defpackage.kn4;
import defpackage.ot8;
import defpackage.rob;
import defpackage.s9a;
import defpackage.tz9;
import defpackage.z45;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 extends ot8 implements it8 {
    public static final e0 b = new e0(8, h0.class, "createXenossAggregatedBanner", "createXenossAggregatedBanner(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService;Lcom/moloco/sdk/internal/ortb/model/Bid;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/Watermark;Lcom/moloco/sdk/internal/ViewLifecycleOwner;Lcom/moloco/sdk/internal/services/ClickthroughService;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/ButtonTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/XenossBannerView;", 1);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    @Override // defpackage.it8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        float f;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar2;
        com.moloco.sdk.internal.ortb.model.b1 b1Var;
        Float f2;
        com.moloco.sdk.internal.ortb.model.b1 b1Var2;
        Context context = (Context) obj;
        com.moloco.sdk.internal.services.events.c cVar = (com.moloco.sdk.internal.services.events.c) obj2;
        com.moloco.sdk.internal.ortb.model.y yVar = (com.moloco.sdk.internal.ortb.model.y) obj3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0) obj4;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t) obj5;
        com.moloco.sdk.internal.d dVar = (com.moloco.sdk.internal.d) obj6;
        com.moloco.sdk.internal.services.z zVar = (com.moloco.sdk.internal.services.z) obj7;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n) obj8;
        context.getClass();
        cVar.getClass();
        t0Var.getClass();
        tVar.getClass();
        dVar.getClass();
        zVar.getClass();
        nVar.getClass();
        com.moloco.sdk.internal.ortb.model.a0 a0Var = yVar.d;
        com.moloco.sdk.internal.ortb.model.d dVar2 = a0Var.a;
        k1 k1Var = a0Var.c;
        boolean c = (k1Var == null || (b1Var2 = k1Var.b) == null) ? false : Intrinsics.c(b1Var2.c, Boolean.TRUE);
        if (k1Var != null && (b1Var = k1Var.b) != null && (f2 = b1Var.d) != null) {
            float floatValue = f2.floatValue();
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > floatValue || floatValue > 1.0f) {
                f2 = null;
            }
            if (f2 != null) {
                f = f2.floatValue();
                Integer num = yVar.g;
                int b2 = num == null ? com.facebook.appevents.n.b(num.intValue()) : 0;
                Integer num2 = yVar.h;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j(c, b2, f, num2 != null ? com.facebook.appevents.n.b(num2.intValue()) : 0);
                if (com.facebook.appevents.g.i(yVar)) {
                    if (dVar2 != null) {
                        kn4 b3 = com.moloco.sdk.internal.r.b(dVar2, true);
                        lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l(com.moloco.sdk.internal.r.d(dVar2, true, jVar), b3, b3);
                    } else {
                        com.moloco.sdk.internal.ortb.model.d dVar3 = (com.moloco.sdk.internal.ortb.model.d) com.moloco.sdk.internal.r.a.getValue();
                        dVar3.getClass();
                        kn4 b4 = com.moloco.sdk.internal.r.b(dVar3, true);
                        lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l(com.moloco.sdk.internal.r.d(dVar3, true, jVar), b4, b4);
                    }
                    lVar2 = lVar;
                } else {
                    lVar2 = dVar2 != null ? com.moloco.sdk.internal.r.f(dVar2, jVar) : com.moloco.sdk.internal.r.f((com.moloco.sdk.internal.ortb.model.d) com.moloco.sdk.internal.r.a.getValue(), jVar);
                }
                hs4 hs4Var = z45.a;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0(context, cVar, yVar, lVar2, t0Var, tVar, dVar, s9a.c(rob.a.plus(tz9.o())), zVar, nVar);
            }
        }
        f = 0.1f;
        Integer num3 = yVar.g;
        if (num3 == null) {
        }
        Integer num22 = yVar.h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j(c, b2, f, num22 != null ? com.facebook.appevents.n.b(num22.intValue()) : 0);
        if (com.facebook.appevents.g.i(yVar)) {
        }
        hs4 hs4Var2 = z45.a;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0(context, cVar, yVar, lVar2, t0Var, tVar, dVar, s9a.c(rob.a.plus(tz9.o())), zVar, nVar);
    }
}
