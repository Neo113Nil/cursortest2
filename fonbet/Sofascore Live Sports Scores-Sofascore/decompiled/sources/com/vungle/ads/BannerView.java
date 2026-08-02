package com.vungle.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.vungle.internal.l;
import com.ironsource.C4018c8;
import com.ironsource.L6;
import com.ironsource.U3;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.c1;
import com.vungle.ads.internal.f1;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.omsdk.d;
import com.vungle.ads.internal.omsdk.e;
import com.vungle.ads.internal.presenter.a;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.f;
import com.vungle.ads.internal.ui.view.h;
import com.vungle.ads.internal.ui.view.k;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.joa;
import defpackage.wx4;
import defpackage.ypa;
import defpackage.ysa;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006,²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/BannerView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/model/i3;", "placement", "Lcom/vungle/ads/internal/model/h0;", "advertisement", "Lcom/vungle/ads/VungleAdSize;", U3.i.O, "Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/internal/presenter/b;", "adPlayCallback", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/i3;Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;Lcom/vungle/ads/internal/presenter/b;)V", "", C4018c8.k, "", "setAdVisibility", "(Z)V", "isFinishedByApi", "finishAdInternal", "a", "Lcom/vungle/ads/internal/model/i3;", "getPlacement", "()Lcom/vungle/ads/internal/model/i3;", "b", "Lcom/vungle/ads/internal/model/h0;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/h0;", "Lcom/vungle/ads/internal/f1;", "l", "Ljoa;", "getImpressionTracker", "()Lcom/vungle/ads/internal/f1;", "impressionTracker", "Companion", "Lcom/vungle/ads/internal/executor/a;", "executors", "Lcom/vungle/ads/internal/omsdk/d;", "omTrackerFactory", "Lcom/vungle/ads/internal/platform/f;", L6.H, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@wx4
/* loaded from: classes6.dex */
public final class BannerView extends RelativeLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final i3 placement;

    /* renamed from: b, reason: from kotlin metadata */
    public final h0 advertisement;
    public int c;
    public int d;
    public k e;
    public r f;
    public a0 g;
    public boolean h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;

    /* renamed from: l, reason: from kotlin metadata */
    public final joa impressionTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @NotNull i3 i3Var, @NotNull h0 h0Var, @NotNull VungleAdSize vungleAdSize, @NotNull AdConfig adConfig, @NotNull b bVar) throws InstantiationException {
        super(context);
        context.getClass();
        i3Var.getClass();
        h0Var.getClass();
        vungleAdSize.getClass();
        adConfig.getClass();
        bVar.getClass();
        this.placement = i3Var;
        this.advertisement = h0Var;
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.impressionTracker = ypa.b(new BannerView$impressionTracker$2(context));
        this.d = com.vungle.ads.internal.util.a0.a(context, vungleAdSize.getHeight());
        this.c = com.vungle.ads.internal.util.a0.a(context, vungleAdSize.getWidth());
        a aVar = new a(bVar, i3Var);
        try {
            k kVar = new k(context);
            this.e = kVar;
            kVar.setCloseDelegate(new f() { // from class: com.vungle.ads.BannerView.1
                @Override // com.vungle.ads.internal.ui.view.f
                public void close() {
                    BannerView.this.finishAdInternal(false);
                }
            });
            kVar.setOnViewTouchListener(new h() { // from class: com.vungle.ads.BannerView.2
                @Override // com.vungle.ads.internal.ui.view.h
                public boolean onTouch(@Nullable MotionEvent event) {
                    r rVar = BannerView.this.f;
                    if (rVar == null) {
                        return false;
                    }
                    rVar.a(event);
                    return false;
                }
            });
            ysa ysaVar = ysa.a;
            joa a = ypa.a(ysaVar, new BannerView$special$$inlined$inject$1(context));
            d b = b(ypa.a(ysaVar, new BannerView$special$$inlined$inject$2(context)));
            boolean C = h0Var.C();
            b.getClass();
            e a2 = d.a(C);
            joa a3 = ypa.a(ysaVar, new BannerView$special$$inlined$inject$3(context));
            z zVar = new z(h0Var, i3Var, ((com.vungle.ads.internal.executor.d) a(a)).f(), c(a3));
            zVar.a(a2);
            r rVar = new r(kVar, h0Var, i3Var, zVar, ((com.vungle.ads.internal.executor.d) a(a)).d(), a2, c(a3));
            rVar.a(aVar);
            this.f = rVar;
            String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.g = new a0(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e) {
            aVar.a(new AdCantPlayWithoutWebView(null, 1, null).setLogEntry$vungle_ads_release(this.advertisement.q()).logError$vungle_ads_release(), this.placement.b());
            throw e;
        }
    }

    public static final com.vungle.ads.internal.executor.a a(joa joaVar) {
        return (com.vungle.ads.internal.executor.a) joaVar.getValue();
    }

    public static final void access$checkHardwareAcceleration(BannerView bannerView) {
        bannerView.getClass();
        boolean z = u.a;
        StringBuilder a = l.a("hardwareAccelerated = ");
        a.append(bannerView.isHardwareAccelerated());
        t.c("BannerView", a.toString());
        if (bannerView.isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, bannerView.advertisement.h, null, 10);
    }

    public static final void access$logViewVisibleOnPlay(BannerView bannerView) {
        long j = bannerView.k.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = Long.valueOf(j);
        AnalyticsClient.a(analyticsClient, m2Var, bannerView.advertisement.h, 4);
        boolean z = u.a;
        t.a("BannerView", "Log metric AD_VISIBILITY: " + j);
    }

    public static final d b(joa joaVar) {
        return (d) joaVar.getValue();
    }

    public static final com.vungle.ads.internal.platform.f c(joa joaVar) {
        return (com.vungle.ads.internal.platform.f) joaVar.getValue();
    }

    private final f1 getImpressionTracker() {
        return (f1) this.impressionTracker.getValue();
    }

    private final void setAdVisibility(boolean isVisible) {
        r rVar;
        if (!this.h || this.i.get() || (rVar = this.f) == null) {
            return;
        }
        rVar.d.b(isVisible);
    }

    public final void finishAdInternal(boolean isFinishedByApi) {
        if (this.i.get()) {
            return;
        }
        this.i.set(true);
        int i = (isFinishedByApi ? 4 : 0) | 2;
        r rVar = this.f;
        if (rVar != null) {
            boolean z = u.a;
            t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
        r rVar2 = this.f;
        if (rVar2 != null) {
            rVar2.a(i);
        }
        getImpressionTracker().a();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e) {
            boolean z2 = u.a;
            t.a("BannerView", "Removing webView error: " + e);
        }
    }

    @NotNull
    public final h0 getAdvertisement() {
        return this.advertisement;
    }

    @NotNull
    public final i3 getPlacement() {
        return this.placement;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = u.a;
        t.a("BannerView", "onAttachedToWindow()");
        if (!this.j.getAndSet(true)) {
            r rVar = this.f;
            if (rVar != null) {
                rVar.g();
            }
            getImpressionTracker().a(this, new c1() { // from class: com.vungle.ads.BannerView$onAttachedToWindow$1
                @Override // com.vungle.ads.internal.c1
                public void onImpression(@Nullable View view) {
                    boolean z2 = u.a;
                    t.a("BannerView", "ImpressionTracker checked the banner view become visible.");
                    BannerView.this.h = true;
                    BannerView.access$logViewVisibleOnPlay(BannerView.this);
                    BannerView.access$checkHardwareAcceleration(BannerView.this);
                    r rVar2 = BannerView.this.f;
                    if (rVar2 != null) {
                        t.a("MRAIDPresenter", "start()");
                        rVar2.a.d();
                        rVar2.d.b(true);
                    }
                }

                @Override // com.vungle.ads.internal.c1
                public void onViewInvisible(@Nullable View view) {
                    AtomicBoolean atomicBoolean;
                    atomicBoolean = BannerView.this.k;
                    if (atomicBoolean.getAndSet(true)) {
                        return;
                    }
                    boolean z2 = u.a;
                    t.a("BannerView", "ImpressionTracker checked the banner view invisible on play.");
                    AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                    m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                    m2Var.c = 1L;
                    AnalyticsClient.a(analyticsClient, m2Var, BannerView.this.getAdvertisement().h, 4);
                }
            });
        }
        k kVar = this.e;
        if (kVar != null && !Intrinsics.c(kVar.getParent(), this)) {
            addView(this.e, this.c, this.d);
            a0 a0Var = this.g;
            if (a0Var != null) {
                addView(a0Var, this.c, this.d);
                a0 a0Var2 = this.g;
                if (a0Var2 != null) {
                    a0Var2.bringToFront();
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.d;
            layoutParams.width = this.c;
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        setAdVisibility(i == 0);
    }
}
