package com.moloco.sdk.internal.publisher.nativead;

import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.e0;
import com.moloco.sdk.internal.m0;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.c0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.y6a;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c extends hoi implements Function2 {
    public c0 r;
    public int s;
    public final /* synthetic */ d t;
    public final /* synthetic */ AdLoad.Listener u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AdLoad.Listener listener, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = dVar;
        this.u = listener;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new c(this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        String str;
        Object obj2;
        d dVar = this.t;
        String str2 = dVar.a;
        AdFormatType adFormatType = dVar.k;
        com.moloco.sdk.acm.h hVar = dVar.m;
        com.moloco.sdk.acm.recorder.c cVar = dVar.i;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            adFormatType.getClass();
            c0Var = new c0(this.u, (m0) com.moloco.sdk.internal.a.a.getValue(), hVar, adFormatType, cVar, null);
            str = null;
            m mVar = dVar.b;
            this.r = c0Var;
            this.s = 1;
            Object g = mVar.g(this.v, hVar, c0Var, this);
            if (g == lu3Var) {
                return lu3Var;
            }
            obj2 = g;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0 c0Var2 = this.r;
            y6a.M(obj);
            obj2 = ((w2g) obj).a;
            c0Var = c0Var2;
            str = null;
        }
        Throwable a = w2g.a(obj2);
        if (a != null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "Failed to load native ad.", a, false, 8, null);
            return Unit.a;
        }
        e eVar = (e) obj2;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = eVar.c;
        y yVar = eVar.a;
        com.moloco.sdk.internal.publisher.nativead.model.l lVar = (com.moloco.sdk.internal.publisher.nativead.model.l) nVar.d.get(2);
        boolean z = (lVar != null ? lVar.b : null) != null;
        boolean z2 = nVar.b(1) != null;
        if (z && !com.facebook.appevents.g.i(yVar)) {
            try {
                int i2 = ComposeView.m;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.error$default(molocoLogger, "NativeAdImpl", "Compose dependency not available for native video ad", null, false, 12, null);
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("native_ad_compose_not_available");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                dVar2.a("ad_type", lowerCase);
                cVar.a(dVar2);
                if (!z2) {
                    c0Var.a(e0.a(str2, MolocoAdError.ErrorType.AD_LOAD_FAILED, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f), yVar.d.d);
                    return Unit.a;
                }
                MolocoLogger.warn$default(molocoLogger, "NativeAdImpl", "Compose not available, native video ad will fall back to image view", null, false, 12, null);
            }
        }
        String str3 = dVar.a;
        a aVar = dVar.c;
        dVar.n = new com.moloco.sdk.acm.eventprocessing.f(str3, eVar.a, eVar.b, dVar.d, dVar.e, dVar.k, dVar.g, dVar.f, cVar);
        aVar.i = nVar;
        aVar.g = new b(0, dVar, d.class, "handleGeneralAdClick", "handleGeneralAdClick()V", 0, 0);
        aVar.h = com.facebook.appevents.g.i(yVar);
        c0Var.c(MolocoAdKt.createAdInfo$default(str2, new Float(yVar.b), str, 4, str), yVar.d.d);
        return Unit.a;
    }
}
