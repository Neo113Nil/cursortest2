package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.F0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2777za implements InterfaceC2769z2 {
    public static final a n = new a(null);
    private final UUID a;
    private final String b;
    private final W2 c;
    private final LevelPlayBannerAdView.Config d;
    private final C2588p0 e;
    private final Q8 f;
    private final LevelPlayAdSize g;
    private LevelPlayBannerAdViewListener h;
    private final String i;
    private C2723wa j;
    private Boolean k;
    private C2440gd l;
    private boolean m;

    /* renamed from: com.ironsource.za$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return TuplesKt.to("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (obtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(obtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return TuplesKt.to(str, builder.build());
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private a() {
        }
    }

    public C2777za(UUID adId, String adUnitId, W2 bannerContainer, LevelPlayBannerAdView.Config config, C2588p0 adTools) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adId;
        this.b = adUnitId;
        this.c = bannerContainer;
        this.d = config;
        this.e = adTools;
        this.f = Jb.u.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.i = placementName == null ? "" : placementName;
        adTools.e().a(new C2551n(IronSource.a.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.e().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C2777za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.m) {
            IronLog.INTERNAL.warning(C2588p0.a(this$0.e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.j == null) {
            IronLog.INTERNAL.warning(C2588p0.a(this$0.e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C2688ub.a(this$0.e, new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.b(C2777za.this);
            }
        }, 0L, 2, (Object) null);
        C2723wa c2723wa = this$0.j;
        if (c2723wa != null) {
            c2723wa.c();
        }
        this$0.j = null;
        this$0.k = null;
        this$0.h = null;
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            String uuid = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
            a(new LevelPlayAdError(uuid, this.b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.e.g()) {
            String uuid2 = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "adId.toString()");
            a(new LevelPlayAdError(uuid2, this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        Ua a2 = Jb.u.d().f().a();
        if (a2 != null && a2.a(this.b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.h;
        if (levelPlayBannerAdViewListener != null) {
            String uuid3 = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(uuid3, this.b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.d(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.a(C2777za.this);
            }
        });
    }

    public final UUID c() {
        return this.a;
    }

    public final LevelPlayAdSize d() {
        return this.g;
    }

    public final String e() {
        return this.b;
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.h;
    }

    public final String g() {
        return this.i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.e.d(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.c(C2777za.this);
            }
        });
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final C2723wa c2723wa = this.j;
        if (c2723wa != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    C2777za.a(C2777za.this, c2723wa);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final C2723wa c2723wa = this.j;
        if (c2723wa != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    C2777za.b(C2777za.this, c2723wa);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C2777za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m) {
            IronLog.INTERNAL.warning(C2588p0.a(this$0.e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.m = true;
        if (this$0.h()) {
            C2723wa a2 = this$0.a();
            this$0.j = a2;
            Boolean bool = this$0.k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    a2.f();
                } else {
                    a2.d();
                }
            }
            a2.b();
        }
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void d(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.a(LevelPlayAdInfo.this, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void e(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.c(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2777za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c.removeAllViews();
        ViewParent parent = this$0.c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, C2777za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, C2777za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2777za this$0, C2723wa it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().c();
        it.f();
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.b(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, C2777za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, C2777za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    public final void a(final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.d(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.a(C2777za.this, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2777za this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2777za this$0, C2723wa it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().b();
        it.d();
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void c(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.d(LevelPlayAdInfo.this, this);
            }
        });
    }

    private final C2723wa a() {
        C2440gd c2440gd;
        this.l = this.e.a(this.i);
        Context context = this.c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.a;
        String str = this.b;
        C2440gd c2440gd2 = this.l;
        C2440gd c2440gd3 = null;
        if (c2440gd2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            c2440gd = null;
        } else {
            c2440gd = c2440gd2;
        }
        J2 j2 = new J2(uuid, str, c2440gd, this.g, null, null, this.f.a(), this.d.getBidFloor(), 48, null);
        this.e.e().a(new D0(this.e, j2, null, 4, null));
        ISBannerSize a2 = this.e.a(j2.i());
        C2772z5 e = this.e.e();
        C2588p0 c2588p0 = this.e;
        C2440gd c2440gd4 = this.l;
        if (c2440gd4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            c2440gd3 = c2440gd4;
        }
        e.a(new Y2(c2588p0, a2, c2440gd3.c()));
        return new C2723wa(this, this.e, j2, this.c);
    }

    public /* synthetic */ C2777za(UUID uuid, String str, W2 w2, LevelPlayBannerAdView.Config config, C2588p0 c2588p0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2702v7.a.a() : uuid, str, w2, config, (i & 16) != 0 ? new C2588p0(IronSource.a.BANNER, F0.b.MEDIATION) : c2588p0);
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void a(final LevelPlayAdInfo adInfo, final boolean z) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.a(z, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo adInfo, C2777za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void a(final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    C2777za.a(LevelPlayAdError.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, C2777za this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void a(final LevelPlayAdInfo adInfo, final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C2777za.a(LevelPlayAdInfo.this, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, C2777za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, C2777za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC2769z2
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C2777za.e(LevelPlayAdInfo.this, this);
            }
        });
    }
}
