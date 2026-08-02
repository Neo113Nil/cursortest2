package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.ad2;
import defpackage.dy9;
import defpackage.g9i;
import defpackage.hs4;
import defpackage.rob;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c1 implements FullscreenAd, v0 {
    public final Context a;
    public final com.moloco.sdk.internal.services.r b;
    public final com.moloco.sdk.internal.services.events.c c;
    public final String d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 f;
    public final Function1 g;
    public final com.moloco.sdk.internal.ilrd.n h;
    public final AdFormatType i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b j;
    public final dy9 k;
    public final com.moloco.sdk.acm.recorder.c l;
    public final ad2 m;
    public final com.moloco.sdk.acm.h n;
    public com.moloco.sdk.acm.h o;
    public final a0 p;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l q;
    public com.moloco.sdk.internal.ortb.model.u r;
    public com.appsflyer.f s;
    public com.moloco.sdk.acm.services.d t;

    public c1(Context context, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.events.c cVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var, Function1 function1, com.moloco.sdk.internal.ilrd.n nVar, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, dy9 dy9Var, com.moloco.sdk.acm.recorder.c cVar2) {
        str.getClass();
        adFormatType.getClass();
        this.a = context;
        this.b = rVar;
        this.c = cVar;
        this.d = str;
        this.e = kVar;
        this.f = t0Var;
        this.g = function1;
        this.h = nVar;
        this.i = adFormatType;
        this.j = bVar;
        this.k = dy9Var;
        this.l = cVar2;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.m = c;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        com.moloco.sdk.acm.h c2 = cVar2.c("ad_create_to_load_ms");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        c2.a("ad_type", lowerCase);
        this.n = c2;
        this.p = b0.a(c, new com.moloco.sdk.acm.db.e(this, 3), str, new l0(1, this, c1.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0, 1), adFormatType, (com.moloco.sdk.internal.services.j) com.moloco.sdk.service_locator.a.a.getValue(), cVar2, new x0(this, 0));
        this.q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l) function1.invoke(null);
    }

    @Override // com.moloco.sdk.internal.publisher.v0
    public final void a(long j, long j2) {
        this.k.a(j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (((java.lang.Boolean) r1.getValue()).booleanValue() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(com.moloco.sdk.internal.d0 d0Var) {
        com.moloco.sdk.internal.ilrd.n nVar = this.h;
        g9i g9iVar = (g9i) nVar.b;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        nVar.b = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) nVar.a;
        boolean z = (pVar == null || (r1 = pVar.l()) == null) ? false : true;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) nVar.a;
        if (pVar2 != null) {
            pVar2.destroy();
        }
        nVar.a = null;
        com.facebook.internal.t tVar = (com.facebook.internal.t) nVar.e;
        nVar.e = null;
        if (d0Var != null && tVar != null) {
            ((b) tVar.b).b(d0Var);
        }
        if (z && tVar != null) {
            tVar.onAdHidden(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        nVar.c = null;
        nVar.d = null;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m c() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) this.h.a;
        if (pVar != null) {
            return pVar.getCreativeType();
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        s9a.o(this.m, null);
        b(null);
        this.s = null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.p.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String str, AdLoad.Listener listener) {
        str.getClass();
        com.moloco.sdk.acm.h hVar = this.n;
        com.moloco.sdk.acm.recorder.c cVar = this.l;
        cVar.b(hVar);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        this.o = cVar.c("load_to_show_time");
        xw3.L(this.m, null, null, new y0(this, str, listener, null), 3);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public final void show(AdShowListener adShowListener) {
        String str;
        Locale locale = Locale.ROOT;
        com.moloco.sdk.acm.h hVar = this.o;
        AdFormatType adFormatType = this.i;
        com.moloco.sdk.acm.recorder.c cVar = this.l;
        if (hVar != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m c = c();
            if (c == null || (str = c.name()) == null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a;
                str = "UNKNOWN";
            }
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            String lowerCase2 = adFormatType.name().toLowerCase(locale);
            lowerCase2.getClass();
            hVar.a("ad_type", lowerCase2);
            hVar.a("creative_type", lowerCase);
            cVar.b(hVar);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("show_ad_attempted");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase3 = adFormatType.name().toLowerCase(locale);
        lowerCase3.getClass();
        dVar.a("ad_type", lowerCase3);
        cVar.a(dVar);
        xw3.L(this.m, null, null, new b1(adShowListener, this, null), 3);
    }
}
