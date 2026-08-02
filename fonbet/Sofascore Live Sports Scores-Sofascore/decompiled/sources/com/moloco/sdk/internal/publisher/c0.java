package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c0 implements h1 {
    public final AdLoad.Listener a;
    public final com.moloco.sdk.internal.m0 b;
    public final com.moloco.sdk.acm.h c;
    public final AdFormatType d;
    public final com.moloco.sdk.acm.recorder.c e;
    public final Function0 f;

    public c0(AdLoad.Listener listener, com.moloco.sdk.internal.m0 m0Var, com.moloco.sdk.acm.h hVar, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c cVar, Function0 function0) {
        m0Var.getClass();
        adFormatType.getClass();
        this.a = listener;
        this.b = m0Var;
        this.c = hVar;
        this.d = adFormatType;
        this.e = cVar;
        this.f = function0;
    }

    public final void a(com.moloco.sdk.internal.d0 d0Var, com.moloco.sdk.internal.ortb.model.h hVar) {
        String str;
        d0Var.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadFailed: " + d0Var, null, false, 12, null);
        if (hVar != null && (str = hVar.b) != null) {
            this.b.a(str, System.currentTimeMillis(), d0Var);
        }
        Map map = d0Var.c;
        MolocoAdError molocoAdError = d0Var.a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = d0Var.b;
        String str2 = (String) map.get("missing_fields");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        com.moloco.sdk.acm.h hVar2 = this.c;
        hVar2.a("result", "failure");
        hVar2.a("reason", cVar.a());
        AdFormatType adFormatType = this.d;
        String name = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        hVar2.a("ad_type", lowerCase);
        com.moloco.sdk.acm.recorder.c cVar2 = this.e;
        cVar2.b(hVar2);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("load_ad_failed");
        dVar.a("network", molocoAdError.getNetworkName());
        dVar.a("reason", cVar.a());
        String lowerCase2 = adFormatType.name().toLowerCase(locale);
        lowerCase2.getClass();
        dVar.a("ad_type", lowerCase2);
        com.facebook.appevents.n.d(dVar, this.f);
        if (str2 != null && !StringsKt.R(str2)) {
            dVar.a("missing_fields", str2);
        }
        cVar2.a(dVar);
        AdLoad.Listener listener = this.a;
        if (listener != null) {
            listener.onAdLoadFailed(molocoAdError);
        }
    }

    public final void b(MolocoAd molocoAd, long j, com.moloco.sdk.internal.ortb.model.h hVar) {
        String str;
        molocoAd.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadStarted: " + molocoAd + ", " + j, null, false, 12, null);
        if (hVar == null || (str = hVar.a) == null) {
            return;
        }
        this.b.a(str, j, null);
    }

    public final void c(MolocoAd molocoAd, com.moloco.sdk.internal.ortb.model.h hVar) {
        String str;
        molocoAd.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadSuccess: " + molocoAd, null, false, 12, null);
        if (hVar != null && (str = hVar.c) != null) {
            this.b.a(str, System.currentTimeMillis(), null);
        }
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        com.moloco.sdk.acm.h hVar2 = this.c;
        hVar2.a("result", "success");
        AdFormatType adFormatType = this.d;
        String name = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        hVar2.a("ad_type", lowerCase);
        Function0 function0 = this.f;
        String g = com.facebook.appevents.n.g(function0);
        if (g != null) {
            hVar2.a("creative_type", g);
        }
        com.moloco.sdk.acm.recorder.c cVar = this.e;
        cVar.b(hVar2);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("load_ad_success");
        String lowerCase2 = adFormatType.name().toLowerCase(locale);
        lowerCase2.getClass();
        dVar.a("ad_type", lowerCase2);
        com.facebook.appevents.n.d(dVar, function0);
        cVar.a(dVar);
        AdLoad.Listener listener = this.a;
        if (listener != null) {
            listener.onAdLoadSuccess(molocoAd);
        }
    }
}
