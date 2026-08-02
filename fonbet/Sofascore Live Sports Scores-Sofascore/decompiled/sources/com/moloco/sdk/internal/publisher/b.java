package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.a74;
import defpackage.rq3;
import defpackage.xw3;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements a {
    public final AdShowListener a;
    public final com.moloco.sdk.internal.services.r b;
    public final com.moloco.sdk.internal.services.events.c c;
    public final Function0 d;
    public final Function0 e;
    public final com.moloco.sdk.internal.m0 f;
    public final com.moloco.sdk.internal.s g;
    public final AdFormatType h;
    public final com.moloco.sdk.acm.recorder.b i;
    public final com.facebook.internal.t j;
    public final Function0 k;

    public b(AdShowListener adShowListener, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.events.c cVar, Function0 function0, Function0 function02, com.moloco.sdk.internal.m0 m0Var, com.moloco.sdk.internal.s sVar, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.b bVar, com.facebook.internal.t tVar, Function0 function03) {
        rVar.getClass();
        adFormatType.getClass();
        bVar.getClass();
        this.a = adShowListener;
        this.b = rVar;
        this.c = cVar;
        this.d = function0;
        this.e = function02;
        this.f = m0Var;
        this.g = sVar;
        this.h = adFormatType;
        this.i = bVar;
        this.j = tVar;
        this.k = function03;
    }

    @Override // com.moloco.sdk.internal.publisher.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public final void a() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onCloseOrSkipButtonShown triggered in InternalAdShowListenerImpl", false, 4, null);
    }

    public final void b(com.moloco.sdk.internal.d0 d0Var) {
        String str;
        d0Var.getClass();
        MolocoAdError molocoAdError = d0Var.a;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdShowFailed: " + d0Var, false, 4, null);
        com.moloco.sdk.internal.ortb.model.h hVar = (com.moloco.sdk.internal.ortb.model.h) this.d.invoke();
        if (hVar != null && (str = hVar.d) != null) {
            this.f.a(str, System.currentTimeMillis(), d0Var);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("show_ad_failed");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        dVar.a("ad_type", lowerCase);
        dVar.a("reason", String.valueOf(molocoAdError.getErrorType()));
        ((com.moloco.sdk.acm.recorder.c) this.i).a(dVar);
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.a
    public final void c(MolocoAd molocoAd, String str) {
        Function0 function0;
        String str2;
        molocoAd.getClass();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("onAdShowSuccess: ");
        sb.append(molocoAd);
        sb.append(", creativeType: ");
        Function0 function02 = this.k;
        sb.append(function02 != null ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m) function02.invoke() : null);
        MolocoLogger.debug$default(molocoLogger, "InternalAdShowListenerImpl", sb.toString(), false, 4, null);
        com.moloco.sdk.internal.ortb.model.h hVar = (com.moloco.sdk.internal.ortb.model.h) this.d.invoke();
        if (hVar != null && (str2 = hVar.e) != null) {
            this.f.a(str2, System.currentTimeMillis(), null);
        }
        ((AtomicBoolean) this.j.c).set(false);
        d0 d0Var = (d0) this.e.invoke();
        if (d0Var != null) {
            function0 = function02;
            xw3.L(com.moloco.sdk.internal.scheduling.a.a, null, null, new a74(this, System.currentTimeMillis(), d0Var, (rq3) null, 9), 3);
        } else {
            function0 = function02;
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("show_ad_success");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        dVar.a("ad_type", lowerCase);
        com.facebook.appevents.n.d(dVar, function0);
        if (str != null) {
            dVar.a("parent_view_type", str);
        }
        ((com.moloco.sdk.acm.recorder.c) this.i).a(dVar);
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.a
    public final void onAdClicked(MolocoAd molocoAd) {
        String str;
        molocoAd.getClass();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "InternalAdShowListenerImpl", "onAdClicked: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.services.r rVar = this.b;
        xw3.L(rVar.c, null, null, new com.moloco.sdk.internal.services.q(rVar, null, 1), 3);
        com.moloco.sdk.internal.ortb.model.h hVar = (com.moloco.sdk.internal.ortb.model.h) this.d.invoke();
        if (hVar != null && (str = hVar.f) != null) {
            this.f.a(str, System.currentTimeMillis(), null);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("ad_clicked");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        AdFormatType adFormatType = this.h;
        String name = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        dVar.a("ad_type", lowerCase);
        com.facebook.appevents.n.d(dVar, this.k);
        ((com.moloco.sdk.acm.recorder.c) this.i).a(dVar);
        com.facebook.internal.t tVar = this.j;
        AtomicBoolean atomicBoolean = (AtomicBoolean) tVar.c;
        if (atomicBoolean.compareAndSet(false, true)) {
            MolocoLogger.info$default(molocoLogger, "AcmClickDeduper", "Deduped click logged", null, false, 12, null);
            com.moloco.sdk.acm.recorder.b bVar = (com.moloco.sdk.acm.recorder.b) tVar.b;
            com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("ad_clicked_deduped");
            String lowerCase2 = adFormatType.name().toLowerCase(locale);
            lowerCase2.getClass();
            dVar2.a("ad_type", lowerCase2);
            ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar2);
        }
        atomicBoolean.set(true);
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.a
    public final void onAdHidden(MolocoAd molocoAd) {
        String str;
        molocoAd.getClass();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdHidden: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.h hVar = (com.moloco.sdk.internal.ortb.model.h) this.d.invoke();
        if (hVar != null && (str = hVar.g) != null) {
            this.f.a(str, System.currentTimeMillis(), null);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("ad_hidden");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        dVar.a("ad_type", lowerCase);
        com.facebook.appevents.n.d(dVar, this.k);
        ((com.moloco.sdk.acm.recorder.c) this.i).a(dVar);
        AdShowListener adShowListener = this.a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }
}
