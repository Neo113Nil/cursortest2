package com.appsflyer;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.moloco.sdk.internal.publisher.g;
import com.moloco.sdk.internal.publisher.z0;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dma;
import defpackage.dnd;
import defpackage.e1d;
import defpackage.fdi;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unregisterClient;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                unregisterClient = AFLogger.unregisterClient((LogTag) obj3, (String) obj2, (AFLoggerBase) obj);
                return unregisterClient;
            case 1:
                ((Boolean) obj).getClass();
                ((g) obj3).onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(((com.moloco.sdk.internal.publisher.f) obj2).b, null, null, 6, null));
                return Unit.a;
            case 2:
                fdi fdiVar = ((p) obj3).g;
                z0 z0Var = (z0) obj2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) obj;
                dVar.getClass();
                if (dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.e)) {
                    fdiVar.m(null, Boolean.TRUE);
                } else if (dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.a)) {
                    fdiVar.m(null, Boolean.TRUE);
                } else if (dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.c)) {
                    fdiVar.m(null, Boolean.TRUE);
                } else if (dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.g)) {
                    z0Var.a(true);
                } else if (dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.h)) {
                    z0Var.c();
                } else if (dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.b)) {
                    z0Var.a(false);
                } else if (dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.a)) {
                    z0Var.b();
                } else if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c) {
                    z0Var.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c) dVar).a);
                } else if (!dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f) && !dVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.d)) {
                    zzl.b();
                    return null;
                }
                return Unit.a;
            case 3:
                k kVar = (k) obj2;
                String str = (String) obj;
                str.getClass();
                ((Function0) obj3).invoke();
                if (kVar != null) {
                    kVar.a(str);
                }
                return Unit.a;
            case 4:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar2.getClass();
                ((e1d) obj2).setValue(dVar2);
                ((Function1) obj3).invoke(dVar2);
                return Unit.a;
            case 5:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj3;
                Function1 function1 = (Function1) obj2;
                ((dma) obj).getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar = dVar3.a;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) dnd.f(r10.P(0L))) / Resources.getSystem().getDisplayMetrics().density, ((int) dnd.g(r10.P(0L))) / Resources.getSystem().getDisplayMetrics().density);
                float e = ((int) (r10.e() & 4294967295L)) / Resources.getSystem().getDisplayMetrics().density;
                float e2 = ((int) (r10.e() >> 32)) / Resources.getSystem().getDisplayMetrics().density;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar4 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(cVar, gVar, new h(e2, e));
                if (e > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && e2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !dVar4.equals(dVar3)) {
                    function1.invoke(dVar4);
                }
                return Unit.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                return (View) ((Function2) obj3).invoke(context, (m) obj2);
        }
    }
}
