package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.a70;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.d11;
import defpackage.ddi;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.mp1;
import defpackage.rd0;
import defpackage.rd4;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.v98;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ k t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        k kVar = this.t;
        switch (i) {
            case 0:
                return new h(kVar, rq3Var, 0);
            default:
                return new h(kVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((h) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        k kVar = this.t;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                rd4 rd4Var = kVar.g;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                rq3 rq3Var2 = null;
                if (i3 == 0) {
                    y6a.M(obj);
                    String str = kVar.a;
                    this.s = 1;
                    h0 h0Var = (h0) rd4Var.e;
                    boolean z = rd4Var.a;
                    h0Var.getClass();
                    obj = s9a.r(new g0(z, h0Var, str, rq3Var2, 1), this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                l0 l0Var = (l0) obj;
                boolean z2 = l0Var instanceof j0;
                if (!z2) {
                    rd4Var.g("mraidbridge.setSupports(false,false,false,false,true)");
                    a0 a0Var = kVar.b;
                    ad2 ad2Var = kVar.h;
                    b0 b0Var = kVar.j;
                    fdi fdiVar = (fdi) b0Var.i;
                    fdi fdiVar2 = (fdi) b0Var.f;
                    rd4Var.g("mraidbridge.setPlacementType(" + JSONObject.quote(a0Var.a) + ')');
                    rd4Var.g("mraidbridge.setIsViewable(" + ((Boolean) fdiVar2.getValue()).booleanValue() + ')');
                    rd4Var.d(((e0) fdiVar.getValue()).a);
                    kVar.d(c0.Default);
                    xw3.L(ad2Var, null, null, new h(kVar, rq3Var2, i2), 3);
                    fcp.m0(new v98((aeh) rd4Var.d, new j(kVar, rq3Var2, 0), 3), ad2Var);
                    fcp.m0(new v98(fdiVar2, new mp1(kVar, rq3Var2, 12), 3), ad2Var);
                    fcp.m0(new v98(fdiVar, new j(kVar, rq3Var2, i2), 3), ad2Var);
                    rd4Var.g("mraidbridge.notifyReadyEvent()");
                    if (l0Var instanceof k0) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "MraidBaseAd", "Mraid Html data successfully loaded", null, false, 12, null);
                    } else {
                        if (!z2) {
                            zzl.b();
                            return null;
                        }
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidBaseAd", "Mraid Html data load failed.", null, false, 12, null);
                    }
                }
                return l0Var;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                int i5 = 2;
                if (i4 == 0) {
                    y6a.M(obj);
                    ddi ddiVar = (ddi) kVar.g.g;
                    d11 d11Var = new d11(i5, rq3Var, 22);
                    this.s = 1;
                    obj = rd0.z(ddiVar, d11Var, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
                if (dVar != null) {
                    int i6 = i.a[kVar.b.ordinal()];
                    if (i6 == 1) {
                        kVar.e.invoke(f1.s(dVar));
                    } else {
                        if (i6 != 2) {
                            zzl.b();
                            return null;
                        }
                        kVar.e.invoke(f1.f(dVar));
                    }
                }
                return Unit.a;
        }
    }
}
