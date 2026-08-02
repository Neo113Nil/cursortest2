package com.moloco.sdk.internal.services.bidtoken;

import com.ironsource.Ua;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.g1;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.vxd;
import defpackage.y6a;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k implements i {
    public final o a;
    public final g1 b;
    public final com.moloco.sdk.internal.services.i c;

    public k(o oVar, g1 g1Var, com.moloco.sdk.internal.services.i iVar) {
        oVar.getClass();
        g1Var.getClass();
        iVar.getClass();
        this.a = oVar;
        this.b = g1Var;
        this.c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.acm.recorder.b bVar, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, sq3 sq3Var) {
        j jVar;
        int i;
        long currentTimeMillis;
        Object a;
        com.moloco.sdk.acm.recorder.c cVar;
        String str;
        k kVar = this;
        MolocoBidTokenListener molocoBidTokenListener2 = molocoBidTokenListener;
        if (sq3Var instanceof j) {
            jVar = (j) sq3Var;
            int i2 = jVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.x = i2 - Integer.MIN_VALUE;
                Object obj = jVar.v;
                lu3 lu3Var = lu3.a;
                i = jVar.x;
                MolocoAdError.ErrorType errorType = null;
                if (i != 0) {
                    y6a.M(obj);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar;
                    cVar2.a(new com.moloco.sdk.acm.d("bid_token_get_request"));
                    g1 g1Var = kVar.b;
                    g1Var.getClass();
                    try {
                        com.moloco.sdk.service_locator.j.b();
                        if (g1Var.c.a.getValue() == Initialization.FAILURE || Moloco.INSTANCE.getFailedMediations$moloco_sdk_release().contains(mediationInfo.getName())) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenHandlerImpl", "Bid token cannot be fetched because SDK initialization has failed", null, false, 12, null);
                            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("bid_token_get_response");
                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                            dVar.a("result", "failure");
                            dVar.a("reason", "sdk_init_failed");
                            cVar2.a(dVar);
                            molocoBidTokenListener2.onBidTokenResult("", MolocoAdError.ErrorType.SDK_INIT_ERROR);
                            return Unit.a;
                        }
                        kVar.c.getClass();
                        currentTimeMillis = System.currentTimeMillis();
                        jVar.r = kVar;
                        jVar.s = cVar2;
                        jVar.t = molocoBidTokenListener2;
                        jVar.u = currentTimeMillis;
                        jVar.x = 1;
                        a = kVar.a.a(cVar2, jVar);
                        if (a == lu3Var) {
                            return lu3Var;
                        }
                        cVar = cVar2;
                    } catch (IllegalStateException unused) {
                        MolocoAdError.ErrorType errorType2 = MolocoAdError.ErrorType.SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT;
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenHandlerImpl", "Bid token cannot be fetched because SDK initialization cannot happen due to WM issue", null, false, 12, null);
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("bid_token_get_response");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar2.a("result", "failure");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar2.a("reason", "sdk_cannot_initialize");
                        cVar2.a(dVar2);
                        molocoBidTokenListener2.onBidTokenResult("", errorType2);
                        return Unit.a;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = jVar.u;
                    MolocoBidTokenListener molocoBidTokenListener3 = jVar.t;
                    cVar = jVar.s;
                    k kVar2 = jVar.r;
                    y6a.M(obj);
                    a = obj;
                    molocoBidTokenListener2 = molocoBidTokenListener3;
                    currentTimeMillis = j;
                    kVar = kVar2;
                }
                str = (String) a;
                kVar.c.getClass();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "BidTokenHandlerImpl", vxd.m("Bid token fetched in ", currentTimeMillis2, " ms"), null, false, 12, null);
                if (str.length() != 0) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("bid_token_get_response");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar3.a("result", "failure");
                    dVar3.a("reason", "bid_token_fetch_failed");
                    cVar.a(dVar3);
                    if (currentTimeMillis2 >= 1000) {
                        com.moloco.sdk.acm.d dVar4 = new com.moloco.sdk.acm.d("bid_token_duration_crossed_1s");
                        dVar4.a("result", "failure");
                        dVar4.a("reason", "bid_token_fetch_failed");
                        cVar.a(dVar4);
                    }
                    if (currentTimeMillis2 >= Ua.C) {
                        com.moloco.sdk.acm.d dVar5 = new com.moloco.sdk.acm.d("bid_token_duration_crossed_3s");
                        dVar5.a("result", "failure");
                        dVar5.a("reason", "bid_token_fetch_failed");
                        cVar.a(dVar5);
                    }
                    errorType = MolocoAdError.ErrorType.AD_SIGNAL_COLLECTION_FAILED;
                } else {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar6 = new com.moloco.sdk.acm.d("bid_token_get_response");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr5 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar6.a("result", "success");
                    cVar.a(dVar6);
                    if (currentTimeMillis2 >= 1000) {
                        com.moloco.sdk.acm.d dVar7 = new com.moloco.sdk.acm.d("bid_token_duration_crossed_1s");
                        dVar7.a("result", "success");
                        cVar.a(dVar7);
                    }
                    if (currentTimeMillis2 >= Ua.C) {
                        com.moloco.sdk.acm.d dVar8 = new com.moloco.sdk.acm.d("bid_token_duration_crossed_3s");
                        dVar8.a("result", "success");
                        cVar.a(dVar8);
                    }
                }
                StringBuilder sb = new StringBuilder("Returning bid token result, hasError: ");
                sb.append(errorType != null);
                sb.append(", SDK init complete: ");
                sb.append(Moloco.isInitialized());
                MolocoLogger.info$default(molocoLogger, "BidTokenHandlerImpl", sb.toString(), null, false, 12, null);
                molocoBidTokenListener2.onBidTokenResult(str, errorType);
                return Unit.a;
            }
        }
        jVar = new j(kVar, sq3Var);
        Object obj2 = jVar.v;
        lu3 lu3Var2 = lu3.a;
        i = jVar.x;
        MolocoAdError.ErrorType errorType3 = null;
        if (i != 0) {
        }
        str = (String) a;
        kVar.c.getClass();
        long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "BidTokenHandlerImpl", vxd.m("Bid token fetched in ", currentTimeMillis22, " ms"), null, false, 12, null);
        if (str.length() != 0) {
        }
        StringBuilder sb2 = new StringBuilder("Returning bid token result, hasError: ");
        sb2.append(errorType3 != null);
        sb2.append(", SDK init complete: ");
        sb2.append(Moloco.isInitialized());
        MolocoLogger.info$default(molocoLogger2, "BidTokenHandlerImpl", sb2.toString(), null, false, 12, null);
        molocoBidTokenListener2.onBidTokenResult(str, errorType3);
        return Unit.a;
    }
}
