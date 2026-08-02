package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.ux4;
import defpackage.y6a;
import defpackage.yda;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public final /* synthetic */ q0 t;
    public final /* synthetic */ ux4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(q0 q0Var, ux4 ux4Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = q0Var;
        this.u = ux4Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                m0 m0Var = new m0(this.t, this.u, rq3Var, 0);
                m0Var.s = ((Boolean) obj).booleanValue();
                return m0Var;
            default:
                m0 m0Var2 = new m0(this.t, this.u, rq3Var, 1);
                m0Var2.s = ((Boolean) obj).booleanValue();
                return m0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
        }
        return ((m0) create(bool, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m creativeType;
        String name;
        String lowerCase2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m creativeType2;
        String name2;
        int i = this.r;
        ux4 ux4Var = this.u;
        q0 q0Var = this.t;
        switch (i) {
            case 0:
                Locale locale = Locale.ROOT;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                boolean z = this.s;
                ux4 ux4Var2 = q0Var.t;
                String str = q0Var.d;
                ux4Var2.b = z;
                if (z) {
                    com.moloco.sdk.acm.h hVar = q0Var.r;
                    if (hVar != null) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) ux4Var2.d;
                        if (eVar == null || (creativeType = eVar.getCreativeType()) == null || (name = creativeType.name()) == null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a;
                            lowerCase = "UNKNOWN".toLowerCase(locale);
                        } else {
                            lowerCase = name.toLowerCase(locale);
                        }
                        lowerCase.getClass();
                        com.moloco.sdk.acm.recorder.c cVar = q0Var.m;
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                        String lowerCase3 = q0Var.o.name().toLowerCase(locale);
                        lowerCase3.getClass();
                        hVar.a("ad_type", lowerCase3);
                        hVar.a("creative_type", lowerCase);
                        cVar.b(hVar);
                    }
                    String c = q0Var.c();
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "Banner parent view type: ".concat(c), false, 4, null);
                    com.facebook.internal.t tVar = q0Var.v;
                    if (tVar != null) {
                        tVar.c(MolocoAdKt.createAdInfo$default(str, null, null, 6, null), c);
                    }
                } else {
                    com.facebook.internal.t tVar2 = q0Var.v;
                    if (tVar2 != null) {
                        tVar2.onAdHidden(MolocoAdKt.createAdInfo$default(str, null, null, 6, null));
                    }
                    yda ydaVar = (yda) ux4Var.g;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                }
                break;
            default:
                Locale locale2 = Locale.ROOT;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (this.s) {
                    com.moloco.sdk.acm.h hVar2 = q0Var.r;
                    if (hVar2 != null) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) q0Var.t.d;
                        if (eVar2 == null || (creativeType2 = eVar2.getCreativeType()) == null || (name2 = creativeType2.name()) == null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a;
                            lowerCase2 = "UNKNOWN".toLowerCase(locale2);
                        } else {
                            lowerCase2 = name2.toLowerCase(locale2);
                        }
                        lowerCase2.getClass();
                        com.moloco.sdk.acm.recorder.c cVar2 = q0Var.m;
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        String lowerCase4 = q0Var.o.name().toLowerCase(locale2);
                        lowerCase4.getClass();
                        hVar2.a("ad_type", lowerCase4);
                        hVar2.a("creative_type", lowerCase2);
                        cVar2.b(hVar2);
                    }
                    String c2 = q0Var.c();
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "Banner parent view type: ".concat(c2), false, 4, null);
                    com.facebook.internal.t tVar3 = q0Var.v;
                    if (tVar3 != null) {
                        tVar3.c(MolocoAdKt.createAdInfo$default(q0Var.d, null, null, 6, null), c2);
                    }
                } else {
                    com.facebook.internal.t tVar4 = q0Var.v;
                    if (tVar4 != null) {
                        tVar4.onAdHidden(MolocoAdKt.createAdInfo$default(q0Var.d, null, null, 6, null));
                    }
                    yda ydaVar2 = (yda) ux4Var.g;
                    if (ydaVar2 != null) {
                        ydaVar2.e(null);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
