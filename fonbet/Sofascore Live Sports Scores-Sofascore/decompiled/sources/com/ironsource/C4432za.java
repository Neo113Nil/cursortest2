package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.E0;
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
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import defpackage.q1n;
import defpackage.r1n;
import defpackage.s1n;
import defpackage.ti5;
import defpackage.wem;
import defpackage.zol;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4432za implements InterfaceC4388x2 {

    @NotNull
    public static final a o = new a(null);

    @NotNull
    private final UUID a;

    @NotNull
    private final String b;

    @NotNull
    private final U2 c;

    @NotNull
    private final LevelPlayBannerAdView.Config d;

    @NotNull
    private final C4243p0 e;

    @NotNull
    private final W8 f;

    @NotNull
    private final O8 g;

    @NotNull
    private final LevelPlayAdSize h;

    @Nullable
    private LevelPlayBannerAdViewListener i;

    @NotNull
    private final String j;

    @Nullable
    private C4378wa k;

    @Nullable
    private Boolean l;
    private C4077fd m;
    private boolean n;

    public C4432za(@NotNull UUID uuid, @NotNull String str, @NotNull U2 u2, @NotNull LevelPlayBannerAdView.Config config, @NotNull C4243p0 c4243p0, @NotNull W8 w8) {
        uuid.getClass();
        str.getClass();
        u2.getClass();
        config.getClass();
        c4243p0.getClass();
        w8.getClass();
        this.a = uuid;
        this.b = str;
        this.c = u2;
        this.d = config;
        this.e = c4243p0;
        this.f = w8;
        this.g = Ib.v.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.h = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.j = placementName == null ? "" : placementName;
        c4243p0.a(new q1n(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4307sb
    private final C4378wa a() {
        this.m = this.e.a(this.j);
        Context context = this.c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.a;
        String str = this.b;
        C4077fd c4077fd = this.m;
        if (c4077fd == null) {
            Intrinsics.i("bannerPlacement");
            throw null;
        }
        H2 h2 = new H2(uuid, str, c4077fd, this.h, null, null, this.g.a(), this.d.getBidFloor(), 48, null);
        this.e.f().a(new C0(this.e, h2, null, 4, 0 == true ? 1 : 0));
        ISBannerSize a2 = this.e.a(h2.i());
        C4391x5 f = this.e.f();
        C4243p0 c4243p0 = this.e;
        C4077fd c4077fd2 = this.m;
        if (c4077fd2 != null) {
            f.a(new W2(c4243p0, a2, c4077fd2.c()));
            return new C4378wa(this, this.e, h2, this.c, this.f);
        }
        Intrinsics.i("bannerPlacement");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4432za c4432za) {
        c4432za.getClass();
        if (!c4432za.n) {
            IronLog.INTERNAL.warning(C4243p0.a(c4432za.e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (c4432za.k == null) {
            IronLog.INTERNAL.warning(C4243p0.a(c4432za.e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C4325tb.a(c4432za.e, new q1n(c4432za, 1), 0L, 2, null);
        C4378wa c4378wa = c4432za.k;
        if (c4378wa != null) {
            c4378wa.c();
        }
        c4432za.k = null;
        c4432za.l = null;
        c4432za.i = null;
        c4432za.f.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo levelPlayAdInfo, C4432za c4432za) {
        levelPlayAdInfo.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4432za c4432za) {
        c4432za.getClass();
        if (c4432za.n) {
            IronLog.INTERNAL.warning(C4243p0.a(c4432za.e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        c4432za.n = true;
        if (c4432za.h()) {
            C4378wa a2 = c4432za.a();
            c4432za.k = a2;
            Boolean bool = c4432za.l;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo levelPlayAdInfo, C4432za c4432za) {
        levelPlayAdInfo.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(levelPlayAdInfo);
        }
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            String uuid = this.a.toString();
            uuid.getClass();
            a(new LevelPlayAdError(uuid, this.b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.e.a()) {
            String uuid2 = this.a.toString();
            uuid2.getClass();
            a(new LevelPlayAdError(uuid2, this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        Sa a2 = Ib.v.d().f().a();
        if (a2 != null && a2.a(this.b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.i;
        if (levelPlayBannerAdViewListener != null) {
            String uuid3 = this.a.toString();
            uuid3.getClass();
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(uuid3, this.b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.e.a(new q1n(this, 0));
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        C4378wa c4378wa = this.k;
        if (c4378wa != null) {
            this.e.a(new s1n(this, c4378wa, 1));
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.l = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        C4378wa c4378wa = this.k;
        if (c4378wa != null) {
            this.e.a(new s1n(this, c4378wa, 0));
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.l = Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.za$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Pair<String, LevelPlayBannerAdView.Config> a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            context.getClass();
            String str = "";
            if (attributeSet == null) {
                return new Pair<>("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            obtainStyledAttributes.getClass();
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
                Pair<String, LevelPlayBannerAdView.Config> pair = new Pair<>(str, builder.build());
                obtainStyledAttributes.recycle();
                return pair;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }

        private a() {
        }
    }

    @Nullable
    public final LevelPlayBannerAdViewListener f() {
        return this.i;
    }

    @NotNull
    public final String g() {
        return this.j;
    }

    @NotNull
    public final UUID c() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void e(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.e.b(new r1n(levelPlayAdInfo, this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4432za c4432za) {
        c4432za.getClass();
        c4432za.c.removeAllViews();
        ViewParent parent = c4432za.c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c4432za.c);
        }
    }

    @NotNull
    public final String e() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.e.b(new r1n(levelPlayAdInfo, this, 2));
    }

    @NotNull
    public final LevelPlayAdSize d() {
        return this.h;
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void d(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.e.b(new r1n(levelPlayAdInfo, this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo levelPlayAdInfo, C4432za c4432za) {
        levelPlayAdInfo.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(levelPlayAdInfo);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4432za(UUID uuid, String str, U2 u2, LevelPlayBannerAdView.Config config, C4243p0 c4243p0, W8 w8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, u2, config, c4243p0, (i & 32) != 0 ? new W8(c4243p0) : w8);
        uuid = (i & 1) != 0 ? C4303s7.a.a() : uuid;
        c4243p0 = (i & 16) != 0 ? new C4243p0(IronSource.a.BANNER, E0.b.MEDIATION) : c4243p0;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.a(new q1n(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4432za c4432za, C4378wa c4378wa) {
        c4432za.getClass();
        c4378wa.getClass();
        c4432za.e.f().f().c();
        c4378wa.f();
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.e.b(new r1n(levelPlayAdInfo, this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo levelPlayAdInfo, C4432za c4432za) {
        levelPlayAdInfo.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(levelPlayAdInfo);
        }
    }

    public final void a(@Nullable LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.a(new wem(28, this, levelPlayBannerAdViewListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4432za c4432za, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        c4432za.getClass();
        c4432za.i = levelPlayBannerAdViewListener;
    }

    public final void a(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("LevelPlayBannerAdView.setImpressionDataListener()");
        this.e.a(new wem(26, this, levelPlayImpressionDataListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4432za c4432za, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        c4432za.getClass();
        c4432za.f.a(levelPlayImpressionDataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4432za c4432za, C4378wa c4378wa) {
        c4432za.getClass();
        c4378wa.getClass();
        c4432za.e.f().f().b();
        c4378wa.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4432za c4432za) {
        c4432za.getClass();
        c4432za.e.f().a(new C4206n(IronSource.a.BANNER, c4432za.a, c4432za.b));
        Double bidFloor = c4432za.d.getBidFloor();
        if (bidFloor != null) {
            c4432za.e.f().f().a(bidFloor.doubleValue());
        }
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo, boolean z) {
        levelPlayAdInfo.getClass();
        this.e.b(new ti5(z, levelPlayAdInfo, this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo levelPlayAdInfo, C4432za c4432za) {
        levelPlayAdInfo.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void a(@Nullable LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.b(new wem(27, levelPlayAdError, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, C4432za c4432za) {
        levelPlayAdError.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(levelPlayAdError);
        }
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo, @Nullable LevelPlayAdError levelPlayAdError) {
        levelPlayAdInfo.getClass();
        if (levelPlayAdError != null) {
            this.e.b(new zol(17, levelPlayAdInfo, levelPlayAdError, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError, C4432za c4432za) {
        levelPlayAdInfo.getClass();
        levelPlayAdError.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + levelPlayAdInfo + " error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(levelPlayAdInfo, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, C4432za c4432za) {
        levelPlayAdInfo.getClass();
        c4432za.getClass();
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = c4432za.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4388x2
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.e.b(new r1n(levelPlayAdInfo, this, 1));
    }
}
