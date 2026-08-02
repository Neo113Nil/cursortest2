package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.a70;
import defpackage.dmi;
import defpackage.e7b;
import defpackage.hs4;
import defpackage.jof;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.wba;
import defpackage.xd5;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s {
    public final jof a;
    public final com.moloco.sdk.internal.services.i b;
    public final u c;
    public final Function1 d;
    public final hs4 e;

    public s(jof jofVar, com.moloco.sdk.internal.services.i iVar, u uVar, Function1 function1) {
        iVar.getClass();
        this.a = jofVar;
        this.b = iVar;
        this.c = uVar;
        this.d = function1;
        this.e = z45.a;
    }

    public final MolocoAdError.AdCreateError a(String str, String str2, com.moloco.sdk.acm.h hVar, w0 w0Var, com.moloco.sdk.acm.recorder.c cVar) {
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("create_ad");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar.a("result", "failure");
        dVar.a("initial_sdk_init_state", str2);
        dVar.a("ad_type", w0Var.name());
        Initialization initialization = (Initialization) this.a.a.getValue();
        int i = initialization == null ? -1 : i.a[initialization.ordinal()];
        if (i == -1) {
            com.moloco.sdk.internal.error.b b = com.moloco.sdk.service_locator.b.b();
            StringBuilder sb = new StringBuilder("CREATE_");
            String upperCase = w0Var.name().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append(upperCase);
            sb.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            b.a(sb.toString(), new com.moloco.sdk.internal.error.a(null));
            hVar.a("result", "failure");
            hVar.a("reason", "sdk_init_not_completed");
            cVar.b(hVar);
            dVar.a("reason", "sdk_init_not_completed");
            cVar.a(dVar);
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i == 1) {
            com.moloco.sdk.service_locator.b.b().a("UNABLE_TO_CREATE_AD", new com.moloco.sdk.internal.error.a(null));
            hVar.a("result", "failure");
            hVar.a("reason", "unable_to_create_ad");
            cVar.b(hVar);
            dVar.a("reason", "unable_to_create_ad");
            cVar.a(dVar);
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", dmi.q("Could not find the adUnitId that was requested for load: ", str), null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i != 2) {
            zzl.b();
            return null;
        }
        com.moloco.sdk.internal.error.b b2 = com.moloco.sdk.service_locator.b.b();
        StringBuilder sb2 = new StringBuilder("CREATE_");
        String upperCase2 = w0Var.name().toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        sb2.append(upperCase2);
        sb2.append("_AD_FAILED_SDK_INIT_FAILED");
        b2.a(sb2.toString(), new com.moloco.sdk.internal.error.a(null));
        hVar.a("result", "failure");
        hVar.a("reason", "sdk_init_failed");
        cVar.b(hVar);
        dVar.a("reason", "sdk_init_failed");
        cVar.a(dVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
        return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, w0 w0Var, com.moloco.sdk.acm.recorder.c cVar, sq3 sq3Var) {
        j jVar;
        int i;
        com.moloco.sdk.acm.h hVar;
        w0 w0Var2 = w0Var;
        com.moloco.sdk.acm.recorder.c cVar2 = cVar;
        if (sq3Var instanceof j) {
            jVar = (j) sq3Var;
            int i2 = jVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.w = i2 - Integer.MIN_VALUE;
                Object obj = jVar.u;
                lu3 lu3Var = lu3.a;
                i = jVar.w;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                    com.moloco.sdk.acm.h c = cVar2.c("create_ad_await_ad_factory_time_ms");
                    u uVar = this.c;
                    xd5 xd5Var = (xd5) uVar.a.get(w0Var2);
                    long j = xd5Var != null ? xd5Var.a : uVar.b;
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Waiting for AdFactory with timeout: " + ((Object) xd5.l(j)), null, false, 12, null);
                    e7b e7bVar = new e7b(function1, rq3Var, 5);
                    jVar.r = w0Var2;
                    jVar.s = cVar2;
                    jVar.t = c;
                    jVar.w = 1;
                    Object W = wba.W(j, e7bVar, jVar);
                    if (W == lu3Var) {
                        return lu3Var;
                    }
                    obj = W;
                    hVar = c;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar = jVar.t;
                    com.moloco.sdk.acm.recorder.c cVar3 = jVar.s;
                    w0 w0Var3 = jVar.r;
                    y6a.M(obj);
                    cVar2 = cVar3;
                    w0Var2 = w0Var3;
                }
                com.moloco.sdk.internal.h hVar2 = (com.moloco.sdk.internal.h) obj;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder("AdFactory received: ");
                sb.append(hVar2 != null);
                MolocoLogger.info$default(molocoLogger, "AdCreator", sb.toString(), null, false, 12, null);
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                hVar.a("ad_type", w0Var2.name());
                hVar.a("result", hVar2 == null ? "success" : "failure");
                cVar2.b(hVar);
                return obj;
            }
        }
        jVar = new j(this, sq3Var);
        Object obj2 = jVar.u;
        lu3 lu3Var2 = lu3.a;
        i = jVar.w;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        com.moloco.sdk.internal.h hVar22 = (com.moloco.sdk.internal.h) obj2;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("AdFactory received: ");
        sb2.append(hVar22 != null);
        MolocoLogger.info$default(molocoLogger2, "AdCreator", sb2.toString(), null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
        hVar.a("ad_type", w0Var2.name());
        hVar.a("result", hVar22 == null ? "success" : "failure");
        cVar2.b(hVar);
        return obj2;
    }

    public final String c() {
        String name;
        Initialization initialization = (Initialization) this.a.a.getValue();
        if (initialization == null || (name = initialization.name()) == null) {
            return "not_invoked_or_in_progress";
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
