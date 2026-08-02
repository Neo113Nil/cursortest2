package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.ad2;
import defpackage.dy9;
import defpackage.hs4;
import defpackage.it8;
import defpackage.rob;
import defpackage.s9a;
import defpackage.ux4;
import defpackage.xw3;
import defpackage.yda;
import defpackage.z45;
import java.util.Locale;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q0 extends Banner implements v0 {
    public final Context a;
    public final com.moloco.sdk.internal.services.r b;
    public final com.moloco.sdk.internal.services.events.c c;
    public final String d;
    public final boolean e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 f;
    public final it8 g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b h;
    public final dy9 i;
    public final com.moloco.sdk.internal.d j;
    public final com.moloco.sdk.internal.x k;
    public final com.moloco.sdk.internal.services.z l;
    public final com.moloco.sdk.acm.recorder.c m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 n;
    public final AdFormatType o;
    public boolean p;
    public final com.moloco.sdk.acm.h q;
    public com.moloco.sdk.acm.h r;
    public final ad2 s;
    public final ux4 t;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n u;
    public com.facebook.internal.t v;
    public BannerAdShowListener w;
    public final a0 x;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.events.c cVar, String str, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, dy9 dy9Var, com.moloco.sdk.internal.d dVar, com.moloco.sdk.internal.x xVar, com.moloco.sdk.internal.services.z zVar, com.moloco.sdk.acm.recorder.c cVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, AdFormatType adFormatType) {
        super(context);
        e0 e0Var = e0.b;
        f0 f0Var = f0.b;
        str.getClass();
        adFormatType.getClass();
        this.a = context;
        this.b = rVar;
        this.c = cVar;
        this.d = str;
        this.e = z;
        this.f = t0Var;
        this.g = e0Var;
        this.h = bVar;
        this.i = dy9Var;
        this.j = dVar;
        this.k = xVar;
        this.l = zVar;
        this.m = cVar2;
        this.n = w0Var;
        this.o = adFormatType;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        com.moloco.sdk.acm.h c = cVar2.c("ad_create_to_load_ms");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        c.a("ad_type", lowerCase);
        this.q = c;
        hs4 hs4Var = z45.a;
        ad2 c2 = s9a.c(rob.a);
        this.s = c2;
        ux4 ux4Var = new ux4();
        ux4Var.d = null;
        ux4Var.e = null;
        ux4Var.f = null;
        ux4Var.g = null;
        ux4Var.b = false;
        ux4Var.h = null;
        ux4Var.i = null;
        ux4Var.c = false;
        this.t = ux4Var;
        this.u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n();
        this.x = b0.a(c2, new i0(this, 0), str, new l0(1, this, q0.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0, 0), adFormatType, (com.moloco.sdk.internal.services.j) com.moloco.sdk.service_locator.a.a.getValue(), cVar2, new j0(this, 0));
        this.y = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) f0Var.invoke(new p0(this));
    }

    @Override // com.moloco.sdk.internal.publisher.v0
    public final void a(long j, long j2) {
        this.i.a(j, j2);
    }

    public final void b(com.moloco.sdk.internal.d0 d0Var) {
        boolean booleanValue;
        com.facebook.internal.t tVar;
        com.facebook.internal.t tVar2;
        ux4 ux4Var = this.t;
        yda ydaVar = (yda) ux4Var.g;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        ux4Var.g = null;
        AdFormatType adFormatType = AdFormatType.MREC;
        AdFormatType adFormatType2 = this.o;
        if (adFormatType2 == adFormatType && this.p) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "MREC : isAdShowing state set from ViewVisibilityTracker (ImpressionViewVisibilityTracker).", false, 4, null);
            booleanValue = ux4Var.b;
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "Banner: isAdShowing state set from isAdShowing function.", false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) ux4Var.d;
            booleanValue = ((Boolean) ((this.e || eVar == null) ? getIsViewShown() : eVar.l()).getValue()).booleanValue();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) ux4Var.d;
        if (eVar2 != null) {
            eVar2.destroy();
        }
        ux4Var.d = null;
        if (d0Var != null && (tVar2 = this.v) != null) {
            ((b) tVar2.b).b(d0Var);
        }
        if (booleanValue && (tVar = this.v) != null) {
            tVar.onAdHidden(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        ux4Var.e = null;
        if (adFormatType2 == adFormatType && this.p) {
            ux4Var.b = false;
        }
        ux4Var.f = null;
    }

    public final String c() {
        Object parent = getParent();
        while (parent != null) {
            String simpleName = parent.getClass().getSimpleName();
            if (StringsKt.J(simpleName, "RecyclerView", false) || StringsKt.J(simpleName, "ScrollView", false) || StringsKt.J(simpleName, "ListView", false) || StringsKt.J(simpleName, "ViewPager", false) || StringsKt.J(simpleName, "HorizontalScrollView", false) || StringsKt.J(simpleName, "AndroidComposeView", false)) {
                return simpleName;
            }
            View view = parent instanceof View ? (View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
        return "none";
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        s9a.o(this.s, null);
        b(null);
        setAdShowListener(null);
        this.v = null;
    }

    @Override // com.moloco.sdk.publisher.Banner
    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.w;
    }

    /* renamed from: getCreateAdObjectDuration-UwyO8pc, reason: not valid java name */
    public long m673getCreateAdObjectDurationUwyO8pc() {
        return this.i.b;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.x.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String str, AdLoad.Listener listener) {
        str.getClass();
        com.moloco.sdk.acm.h hVar = this.q;
        com.moloco.sdk.acm.recorder.c cVar = this.m;
        cVar.b(hVar);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        this.r = cVar.c("load_to_show_time");
        xw3.L(this.s, null, null, new n0(this, str, listener, null), 3);
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        com.facebook.internal.t tVar = new com.facebook.internal.t(bannerAdShowListener, this.b, this.c, new j0(this, 1), new j0(this, 2), this.o, this.m, new j0(this, 3));
        this.v = tVar;
        this.w = (BannerAdShowListener) tVar.c;
    }

    /* renamed from: setCreateAdObjectDuration-LRDsOJo, reason: not valid java name */
    public void m674setCreateAdObjectDurationLRDsOJo(long j) {
        this.i.b = j;
    }
}
