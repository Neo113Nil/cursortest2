package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.a70;
import defpackage.be5;
import defpackage.dy9;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.wkn;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q extends hoi implements Function2 {
    public final /* synthetic */ String A;
    public w0 r;
    public String s;
    public com.moloco.sdk.acm.h t;
    public long u;
    public int v;
    public final /* synthetic */ s w;
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = sVar;
        this.x = cVar;
        this.y = str;
        this.z = str2;
        this.A = str3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new q(this.w, this.x, this.y, this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        String c;
        Context context;
        Object b;
        com.moloco.sdk.acm.h hVar;
        long j;
        s sVar = this.w;
        com.moloco.sdk.internal.services.i iVar = sVar.b;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        String str = this.y;
        com.moloco.sdk.acm.recorder.c cVar = this.x;
        if (i == 0) {
            y6a.M(obj);
            w0Var = w0.f;
            iVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            c = sVar.c();
            com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
            com.moloco.sdk.acm.h c2 = cVar.c("create_ad_time_ms");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            context = null;
            c2.a("ad_type", "NATIVE_AD_MEDIATION");
            c2.a("initial_sdk_init_state", c);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + w0Var + " ad with adUnitId: " + str, null, false, 12, null);
            Function1 function1 = sVar.d;
            this.r = w0Var;
            this.s = c;
            this.t = c2;
            this.u = currentTimeMillis;
            this.v = 1;
            b = sVar.b(function1, w0Var, cVar, this);
            if (b == lu3Var) {
                return lu3Var;
            }
            hVar = c2;
            j = currentTimeMillis;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.u;
            hVar = this.t;
            c = this.s;
            w0Var = this.r;
            y6a.M(obj);
            context = null;
            b = obj;
        }
        String str2 = c;
        com.moloco.sdk.internal.h hVar2 = (com.moloco.sdk.internal.h) b;
        if (hVar2 == null) {
            w0 w0Var2 = w0Var;
            MolocoAdError.AdCreateError a = sVar.a(this.y, str2, hVar, w0Var2, cVar);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + w0Var2 + " with reason: " + a, null, false, 12, null);
            return new com.moloco.sdk.internal.j0(a);
        }
        Context e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1.e(context);
        com.moloco.sdk.internal.services.r a2 = com.moloco.sdk.service_locator.b.a();
        com.moloco.sdk.internal.services.w wVar = (com.moloco.sdk.internal.services.w) com.moloco.sdk.service_locator.e.c.getValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 a3 = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k b2 = com.moloco.sdk.service_locator.j.b();
        com.moloco.sdk.internal.d c3 = com.moloco.sdk.service_locator.i.c();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.z);
        AdFormatType adFormatType = AdFormatType.NATIVE;
        String str3 = this.A;
        com.moloco.sdk.acm.h hVar3 = hVar;
        dy9 dy9Var = new dy9(adFormatType, Intrinsics.c(str3, "MAX") ? wkn.R(8, be5.SECONDS) : Intrinsics.c(str3, MolocoMediationAdapter.MEDIATION_PLATFORM_NAME) ? wkn.R(58, be5.SECONDS) : wkn.R(60, be5.SECONDS));
        com.moloco.sdk.internal.services.i b3 = com.moloco.sdk.service_locator.i.b();
        a2.getClass();
        wVar.getClass();
        str.getClass();
        b2.getClass();
        c3.getClass();
        b3.getClass();
        w0 w0Var3 = w0Var;
        com.moloco.sdk.internal.publisher.nativead.d dVar = new com.moloco.sdk.internal.publisher.nativead.d(str, new com.moloco.sdk.internal.publisher.nativead.m(e, str, new u0((com.moloco.sdk.internal.ortb.d) com.moloco.sdk.internal.ortb.e.a.getValue(), new com.facebook.b(17)), new com.facebook.b(16), dy9Var, cVar, b3), new com.moloco.sdk.internal.publisher.nativead.a(e, qVar, c3, bVar, new com.moloco.sdk.internal.g(hVar2, a3, e), cVar), a2, hVar2.b, a3, b2, dy9Var, cVar);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("create_ad");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar2.a("result", "success");
        dVar2.a("ad_type", w0Var3.name());
        dVar2.a("initial_sdk_init_state", str2.toString());
        cVar.a(dVar2);
        hVar3.a("result", "success");
        cVar.b(hVar3);
        iVar.getClass();
        dVar.a(j, System.currentTimeMillis());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + w0Var3 + " ad with adUnitId: " + str, null, false, 12, null);
        return new com.moloco.sdk.internal.k0(dVar);
    }
}
