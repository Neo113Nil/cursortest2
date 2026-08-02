package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.a70;
import defpackage.g9i;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ a0 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ AdLoad.Listener u;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, String str, AdLoad.Listener listener, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = a0Var;
        this.t = str;
        this.u = listener;
        this.v = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new v(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object b;
        com.moloco.sdk.internal.ortb.model.a0 a0Var;
        com.moloco.sdk.internal.ortb.model.a0 a0Var2;
        a0 a0Var3 = this.s;
        com.moloco.sdk.acm.h hVar = a0Var3.n;
        com.moloco.sdk.acm.recorder.c cVar = a0Var3.h;
        String str = a0Var3.b;
        AdFormatType adFormatType = a0Var3.f;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        com.moloco.sdk.internal.ortb.model.h hVar2 = null;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            b = a0Var3.b(this.t, this);
            if (b == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            b = obj;
        }
        String str2 = (String) b;
        AdLoad.Listener listener = this.u;
        if (str2 == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(str, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
            }
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            hVar.a("result", "failure");
            MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
            hVar.a("reason", String.valueOf(errorType.getErrorCode()));
            String name = adFormatType.name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            lowerCase.getClass();
            hVar.a("ad_type", lowerCase);
            cVar.b(hVar);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("load_ad_failed");
            dVar.a("reason", String.valueOf(errorType.getErrorCode()));
            String lowerCase2 = adFormatType.name().toLowerCase(locale);
            lowerCase2.getClass();
            dVar.a("ad_type", lowerCase2);
            cVar.a(dVar);
            return Unit.a;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "AdLoad", "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
        Function0 function0 = a0Var3.i;
        adFormatType.getClass();
        c0 c0Var = new c0(listener, (com.moloco.sdk.internal.m0) com.moloco.sdk.internal.a.a.getValue(), hVar, adFormatType, cVar, function0);
        if (Intrinsics.c(a0Var3.l, str2)) {
            if (a0Var3.k) {
                MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(str, null, null, 6, null);
                com.moloco.sdk.internal.ortb.model.y a = a0.a(a0Var3.m);
                c0Var.b(createAdInfo$default, this.v, (a == null || (a0Var2 = a.d) == null) ? null : a0Var2.d);
                com.moloco.sdk.internal.ortb.model.y a2 = a0.a(a0Var3.m);
                if (a2 != null && (a0Var = a2.d) != null) {
                    hVar2 = a0Var.d;
                }
                c0Var.c(createAdInfo$default, hVar2);
                return Unit.a;
            }
            g9i g9iVar = a0Var3.o;
            if (g9iVar != null && g9iVar.isActive()) {
                MolocoLogger.info$default(molocoLogger, "AdLoad", "Already loading ad " + adFormatType + ' ' + str + ". Returning", null, false, 12, null);
                return Unit.a;
            }
        }
        g9i g9iVar2 = a0Var3.o;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        a0Var3.o = xw3.L(a0Var3.j, null, null, new z(a0Var3, str2, c0Var, this.v, null), 3);
        return Unit.a;
    }
}
