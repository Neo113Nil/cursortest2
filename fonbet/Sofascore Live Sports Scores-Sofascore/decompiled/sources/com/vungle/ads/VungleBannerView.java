package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.vungle.internal.l;
import com.ironsource.C4018c8;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.c1;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.f1;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.i0;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.omsdk.d;
import com.vungle.ads.internal.omsdk.e;
import com.vungle.ads.internal.presenter.a;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.presenter.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.f;
import com.vungle.ads.internal.ui.view.k;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.w;
import com.vungle.ads.internal.util.y;
import defpackage.joa;
import defpackage.ypa;
import defpackage.ysa;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u0011J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR\u0013\u00106\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR(\u0010:\u001a\u0004\u0018\u00010\u00052\b\u00107\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u0011R\u0014\u0010>\u001a\u00020;8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006F²\u0006\f\u0010A\u001a\u00020@8\nX\u008a\u0084\u0002²\u0006\f\u0010C\u001a\u00020B8\nX\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u00020D8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/VungleBannerView;", "Landroid/widget/RelativeLayout;", "Lcom/vungle/ads/VungleAdType;", "Landroid/content/Context;", "context", "", "placementId", "Lcom/vungle/ads/VungleAdSize;", U3.i.O, "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "getAdViewSize", "()Lcom/vungle/ads/VungleAdSize;", "", "load", "()V", "adMarkup", "(Ljava/lang/String;)V", "Lcom/vungle/ads/VungleCSBData;", "csbData", "(Lcom/vungle/ads/VungleCSBData;)V", "finishAd", "", C4018c8.k, "setAdVisibility", "(Z)V", "a", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "b", "Lcom/vungle/ads/VungleAdSize;", "getAdSize", "Lcom/vungle/ads/BannerAdListener;", "d", "Lcom/vungle/ads/BannerAdListener;", "getAdListener", "()Lcom/vungle/ads/BannerAdListener;", "setAdListener", "(Lcom/vungle/ads/BannerAdListener;)V", "adListener", "Lcom/vungle/ads/internal/f1;", CampaignEx.JSON_KEY_AD_Q, "Ljoa;", "getImpressionTracker", "()Lcom/vungle/ads/internal/f1;", "impressionTracker", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adConfig", "getCreativeId", "creativeId", "getEventId", "eventId", U3.i.X, "getAdapterAdFormat", "setAdapterAdFormat", "adapterAdFormat", "Lcom/vungle/ads/internal/util/s;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/s;", "logEntry", "Companion", "Lcom/vungle/ads/internal/executor/a;", "executors", "Lcom/vungle/ads/internal/omsdk/d;", "omTrackerFactory", "Lcom/vungle/ads/internal/platform/f;", L6.H, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class VungleBannerView extends RelativeLayout implements VungleAdType {

    /* renamed from: a, reason: from kotlin metadata */
    public final String placementId;

    /* renamed from: b, reason: from kotlin metadata */
    public final VungleAdSize adSize;
    public final w c;

    /* renamed from: d, reason: from kotlin metadata */
    public BannerAdListener adListener;
    public final i0 e;
    public int f;
    public int g;
    public k h;
    public r i;
    public a0 j;
    public boolean k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;

    /* renamed from: q, reason: from kotlin metadata */
    public final joa impressionTracker;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView(@NotNull Context context, @NotNull String str, @NotNull VungleAdSize vungleAdSize) {
        super(context);
        context.getClass();
        str.getClass();
        vungleAdSize.getClass();
        this.placementId = str;
        this.adSize = vungleAdSize;
        this.c = new w();
        i0 i0Var = new i0(context, str, vungleAdSize, new AdConfig());
        this.e = i0Var;
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        this.impressionTracker = ypa.b(new VungleBannerView$impressionTracker$2(context));
        i0Var.setAdListener(new BannerAdListener() { // from class: com.vungle.ads.VungleBannerView.1
            @Override // com.vungle.ads.BaseAdListener
            public void onAdClicked(@NotNull BaseAd baseAd) {
                baseAd.getClass();
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdEnd(@NotNull BaseAd baseAd) {
                baseAd.getClass();
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
                baseAd.getClass();
                adError.getClass();
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
                baseAd.getClass();
                adError.getClass();
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdImpression(@NotNull BaseAd baseAd) {
                baseAd.getClass();
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLeftApplication(@NotNull BaseAd baseAd) {
                baseAd.getClass();
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLoaded(@NotNull BaseAd baseAd) {
                baseAd.getClass();
                VungleBannerView.access$onBannerAdLoaded(VungleBannerView.this, baseAd);
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdStart(@NotNull BaseAd baseAd) {
                baseAd.getClass();
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(baseAd);
                }
            }
        });
    }

    public static final void access$checkHardwareAcceleration(VungleBannerView vungleBannerView) {
        vungleBannerView.getClass();
        boolean z = u.a;
        StringBuilder a = l.a("hardwareAccelerated = ");
        a.append(vungleBannerView.isHardwareAccelerated());
        t.c("VungleBannerView", a.toString());
        if (vungleBannerView.isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, vungleBannerView.e.getLogEntry(), null, 10);
    }

    public static final void access$finishAdInternal(VungleBannerView vungleBannerView, boolean z) {
        if (vungleBannerView.l.get()) {
            return;
        }
        vungleBannerView.l.set(true);
        int i = (z ? 4 : 0) | 2;
        r rVar = vungleBannerView.i;
        if (rVar != null) {
            boolean z2 = u.a;
            t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
        r rVar2 = vungleBannerView.i;
        if (rVar2 != null) {
            rVar2.a(i);
        }
        vungleBannerView.getImpressionTracker().a();
        try {
            ViewParent parent = vungleBannerView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(vungleBannerView);
            }
            vungleBannerView.removeAllViews();
        } catch (Exception e) {
            boolean z3 = u.a;
            t.a("VungleBannerView", "Removing webView error: " + e);
        }
    }

    public static final void access$logViewInvisibleOnPlay(VungleBannerView vungleBannerView) {
        if (vungleBannerView.p.getAndSet(true)) {
            return;
        }
        boolean z = u.a;
        StringBuilder a = l.a("ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. ");
        a.append(vungleBannerView.hashCode());
        t.a("VungleBannerView", a.toString());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = 1L;
        AnalyticsClient.a(analyticsClient, m2Var, vungleBannerView.e.getLogEntry(), 4);
    }

    public static final void access$logViewVisibleOnPlay(VungleBannerView vungleBannerView) {
        long j = vungleBannerView.p.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = Long.valueOf(j);
        AnalyticsClient.a(analyticsClient, m2Var, vungleBannerView.e.getLogEntry(), 4);
        boolean z = u.a;
        t.a("VungleBannerView", "Log metric AD_VISIBILITY: " + j);
    }

    public static final void access$onBannerAdLoaded(VungleBannerView vungleBannerView, BaseAd baseAd) {
        vungleBannerView.getClass();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), vungleBannerView.e.getLogEntry(), 4);
        vungleBannerView.e.getResponseToShowMetric().d();
        t1 responseToShowMetric = vungleBannerView.e.getResponseToShowMetric();
        analyticsClient.a(responseToShowMetric, vungleBannerView.e.getLogEntry(), responseToShowMetric.b);
        vungleBannerView.e.getAdInternal$vungle_ads_release().k.e();
        vungleBannerView.e.getShowToCloseMetric().e();
        vungleBannerView.e.getShowToFailMetric().e();
        VungleError a = vungleBannerView.e.getAdInternal$vungle_ads_release().a(true);
        i0 i0Var = vungleBannerView.e;
        if (a != null) {
            if (i0Var.getAdInternal$vungle_ads_release().a(a.getCode())) {
                vungleBannerView.e.getAdInternal$vungle_ads_release().a(h.g);
            }
            BannerAdListener bannerAdListener = vungleBannerView.adListener;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToPlay(baseAd, a);
                return;
            }
            return;
        }
        h0 h0Var = i0Var.getAdInternal$vungle_ads_release().c;
        i3 i3Var = vungleBannerView.e.getAdInternal$vungle_ads_release().d;
        if (h0Var == null || i3Var == null) {
            BannerAdListener bannerAdListener2 = vungleBannerView.adListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onAdFailedToPlay(baseAd, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(vungleBannerView.e.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        vungleBannerView.e.getAdInternal$vungle_ads_release().a();
        vungleBannerView.e.getAdInternal$vungle_ads_release().k.d();
        t1 t1Var = vungleBannerView.e.getAdInternal$vungle_ads_release().k;
        analyticsClient.a(t1Var, vungleBannerView.e.getLogEntry(), t1Var.b);
        vungleBannerView.e.getAdInternal$vungle_ads_release().l.e();
        try {
            vungleBannerView.a(h0Var, i3Var, vungleBannerView.getAdViewSize());
            vungleBannerView.n.set(true);
            BannerAdListener bannerAdListener3 = vungleBannerView.adListener;
            if (bannerAdListener3 != null) {
                bannerAdListener3.onAdLoaded(baseAd);
            }
            vungleBannerView.a();
        } catch (InstantiationException unused) {
        }
    }

    private final f1 getImpressionTracker() {
        return (f1) this.impressionTracker.getValue();
    }

    public static /* synthetic */ void load$default(VungleBannerView vungleBannerView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    private final void setAdVisibility(boolean isVisible) {
        r rVar;
        if (!this.k || this.l.get() || (rVar = this.i) == null) {
            return;
        }
        rVar.d.b(isVisible);
    }

    public final void a(h0 h0Var, i3 i3Var, VungleAdSize vungleAdSize) {
        Context context = getContext();
        context.getClass();
        this.g = com.vungle.ads.internal.util.a0.a(context, vungleAdSize.getHeight());
        Context context2 = getContext();
        context2.getClass();
        this.f = com.vungle.ads.internal.util.a0.a(context2, vungleAdSize.getWidth());
        a aVar = new a(this.e.a(), this.e.getAdInternal$vungle_ads_release().f());
        try {
            Context context3 = getContext();
            context3.getClass();
            k kVar = new k(context3, h0Var.h());
            this.h = kVar;
            kVar.setCloseDelegate(new f() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$1
                @Override // com.vungle.ads.internal.ui.view.f
                public void close() {
                    VungleBannerView.access$finishAdInternal(VungleBannerView.this, false);
                }
            });
            kVar.setOnViewTouchListener(new com.vungle.ads.internal.ui.view.h() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$2
                @Override // com.vungle.ads.internal.ui.view.h
                public boolean onTouch(@Nullable MotionEvent event) {
                    r rVar;
                    rVar = VungleBannerView.this.i;
                    if (rVar == null) {
                        return false;
                    }
                    rVar.a(event);
                    return false;
                }
            });
            Context context4 = getContext();
            context4.getClass();
            ysa ysaVar = ysa.a;
            joa a = ypa.a(ysaVar, new VungleBannerView$willPresentAdView$$inlined$inject$1(context4));
            Context context5 = getContext();
            context5.getClass();
            d dVar = (d) ypa.a(ysaVar, new VungleBannerView$willPresentAdView$$inlined$inject$2(context5)).getValue();
            boolean C = h0Var.C();
            dVar.getClass();
            e a2 = d.a(C);
            Context context6 = getContext();
            context6.getClass();
            joa a3 = ypa.a(ysaVar, new VungleBannerView$willPresentAdView$$inlined$inject$3(context6));
            j f = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a.getValue())).f();
            ReentrantLock reentrantLock = e0.a;
            z a4 = e0.a(h0Var, i3Var, f, (com.vungle.ads.internal.platform.f) a3.getValue());
            this.c.a(a4);
            a4.a(a2);
            r rVar = new r(kVar, h0Var, i3Var, a4, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a.getValue())).d(), a2, (com.vungle.ads.internal.platform.f) a3.getValue());
            rVar.a(aVar);
            this.i = rVar;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                context7.getClass();
                this.j = new a0(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e) {
            aVar.a(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.e.getLogEntry()).logError$vungle_ads_release(), this.placementId);
            throw e;
        }
    }

    public final void finishAd() {
        Handler handler = y.a;
        y.a(new VungleBannerView$finishAd$1(this));
    }

    @NotNull
    public final AdConfig getAdConfig() {
        return this.e.getAdConfig();
    }

    @Nullable
    public final BannerAdListener getAdListener() {
        return this.adListener;
    }

    @NotNull
    public final VungleAdSize getAdSize() {
        return this.adSize;
    }

    @NotNull
    public final VungleAdSize getAdViewSize() {
        return this.e.getAdViewSize();
    }

    @Override // com.vungle.ads.VungleAdType
    @Nullable
    public String getAdapterAdFormat() {
        return this.e.getAdapterAdFormat();
    }

    @Nullable
    public final String getCreativeId() {
        return this.e.getCreativeId();
    }

    @Nullable
    public final String getEventId() {
        return this.e.getEventId();
    }

    @NotNull
    public final s getLogEntry$vungle_ads_release() {
        return this.e.getLogEntry();
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load(@NotNull VungleCSBData csbData) {
        csbData.getClass();
        this.e.load(csbData);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = u.a;
        StringBuilder a = l.a("onAttachedToWindow(): ");
        a.append(hashCode());
        t.a("VungleBannerView", a.toString());
        this.o.set(true);
        if (this.e.getAdInternal$vungle_ads_release().d != null) {
            try {
                if (!this.r) {
                    getContext().registerReceiver(this.c, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.r = true;
                    t.a("VungleBannerView", "registerReceiver(): " + this.c.hashCode());
                }
            } catch (Exception e) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("registerReceiver error: ");
                a2.append(e.getLocalizedMessage());
                t.b("VungleBannerView", a2.toString());
            }
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        boolean z = u.a;
        StringBuilder a = l.a("onDetachedFromWindow(): ");
        a.append(hashCode());
        t.a("VungleBannerView", a.toString());
        this.o.set(false);
        if (this.e.getAdInternal$vungle_ads_release().d != null) {
            try {
                if (this.r) {
                    getContext().unregisterReceiver(this.c);
                    this.r = false;
                }
            } catch (Exception e) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("unregisterReceiver error: ");
                a2.append(e.getLocalizedMessage());
                t.b("VungleBannerView", a2.toString());
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        setAdVisibility(i == 0);
    }

    public final void setAdListener(@Nullable BannerAdListener bannerAdListener) {
        this.adListener = bannerAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(@Nullable String str) {
        this.e.setAdapterAdFormat(str);
    }

    public final void load(@Nullable String adMarkup) {
        this.e.load(adMarkup);
    }

    public final void load() {
        this.e.load();
    }

    public final void a() {
        if (this.l.get()) {
            boolean z = u.a;
            t.c("VungleBannerView", "renderAd() - destroyed");
            return;
        }
        if (!this.n.get()) {
            boolean z2 = u.a;
            t.a("VungleBannerView", "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.o.get()) {
            boolean z3 = u.a;
            t.a("VungleBannerView", "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.m.getAndSet(true)) {
            r rVar = this.i;
            if (rVar != null) {
                rVar.g();
            }
            getImpressionTracker().a(this, new c1() { // from class: com.vungle.ads.VungleBannerView$renderAd$1
                @Override // com.vungle.ads.internal.c1
                public void onImpression(@Nullable View view) {
                    r rVar2;
                    boolean z4 = u.a;
                    t.a("VungleBannerView", "ImpressionTracker checked the banner view become visible.");
                    VungleBannerView.this.k = true;
                    VungleBannerView.access$logViewVisibleOnPlay(VungleBannerView.this);
                    VungleBannerView.access$checkHardwareAcceleration(VungleBannerView.this);
                    rVar2 = VungleBannerView.this.i;
                    if (rVar2 != null) {
                        t.a("MRAIDPresenter", "start()");
                        rVar2.a.d();
                        rVar2.d.b(true);
                    }
                }

                @Override // com.vungle.ads.internal.c1
                public void onViewInvisible(@Nullable View view) {
                    VungleBannerView.access$logViewInvisibleOnPlay(VungleBannerView.this);
                }
            });
        }
        k kVar = this.h;
        if (kVar != null && !Intrinsics.c(kVar.getParent(), this)) {
            ViewParent parent = kVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(kVar);
            }
            addView(kVar, this.f, this.g);
        }
        a0 a0Var = this.j;
        if (a0Var != null && !Intrinsics.c(a0Var.getParent(), this)) {
            ViewParent parent2 = a0Var.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(a0Var);
            }
            addView(a0Var, this.f, this.g);
            a0Var.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.g;
            layoutParams.width = this.f;
            requestLayout();
        }
    }
}
