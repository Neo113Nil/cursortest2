package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.Aa;
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
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Aa implements InterfaceC4665z2 {
    public static final a n = new a(null);
    private final UUID a;
    private final String b;
    private final W2 c;
    private final LevelPlayBannerAdView.Config d;
    private final C4484p0 e;
    private final R8 f;
    private final LevelPlayAdSize g;
    private LevelPlayBannerAdViewListener h;
    private final String i;
    private C4637xa j;
    private Boolean k;
    private C4336gd l;
    private boolean m;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            String str = "";
            if (attributeSet == null) {
                return new Pair<>("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
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

    public Aa(UUID uuid, String str, W2 w2, LevelPlayBannerAdView.Config config, C4484p0 c4484p0) {
        this.a = uuid;
        this.b = str;
        this.c = w2;
        this.d = config;
        this.e = c4484p0;
        this.f = Kb.u.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.i = placementName == null ? "" : placementName;
        c4484p0.d().a(new C4447n(IronSource.a.BANNER, uuid, str));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            c4484p0.d().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa aa) {
        if (!aa.m) {
            IronLog.INTERNAL.warning(C4484p0.a(aa.e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (aa.j == null) {
            IronLog.INTERNAL.warning(C4484p0.a(aa.e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C4602vb.a(aa.e, new xsna.d0(aa, 0), 0L, 2, null);
        C4637xa c4637xa = aa.j;
        if (c4637xa != null) {
            c4637xa.c();
        }
        aa.j = null;
        aa.k = null;
        aa.h = null;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.c(new xsna.g0(this, 0));
    }

    public final String e() {
        return this.b;
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            a(new LevelPlayAdError(this.a.toString(), this.b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        Va a2 = Kb.u.d().f().a();
        if (a2 != null && a2.a(this.b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(this.a.toString(), this.b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final UUID c() {
        return this.a;
    }

    public final LevelPlayAdSize d() {
        return this.g;
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void e(LevelPlayAdInfo levelPlayAdInfo) {
        this.e.d(new xsna.h0(0, levelPlayAdInfo, this));
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.h;
    }

    public final String g() {
        return this.i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        if (this.e.f()) {
            this.e.c(new xsna.j0(this, 0));
        } else {
            a(new LevelPlayAdError(this.a.toString(), this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
        }
    }

    public final void j() {
        s3q0 s3q0Var;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        C4637xa c4637xa = this.j;
        if (c4637xa != null) {
            this.e.c(new xsna.y(0, this, c4637xa));
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            this.k = Boolean.FALSE;
        }
    }

    public final void k() {
        s3q0 s3q0Var;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        C4637xa c4637xa = this.j;
        if (c4637xa != null) {
            this.e.c(new xsna.i0(0, this, c4637xa));
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            this.k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Aa aa) {
        aa.c.removeAllViews();
        ViewParent parent = aa.c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(aa.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Aa aa) {
        if (aa.m) {
            IronLog.INTERNAL.warning(C4484p0.a(aa.e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        aa.m = true;
        if (aa.h()) {
            C4637xa a2 = aa.a();
            aa.j = a2;
            Boolean bool = aa.k;
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
    public static final void e(LevelPlayAdInfo levelPlayAdInfo, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void d(LevelPlayAdInfo levelPlayAdInfo) {
        this.e.d(new xsna.z(0, levelPlayAdInfo, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo levelPlayAdInfo, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Aa aa, C4637xa c4637xa) {
        aa.e.d().f().c();
        c4637xa.f();
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        this.e.d(new xsna.e0(0, levelPlayAdInfo, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo levelPlayAdInfo, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(levelPlayAdInfo);
        }
    }

    public final void a(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.c(new xsna.k0(0, this, levelPlayBannerAdViewListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa aa, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        aa.h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo levelPlayAdInfo, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa aa, C4637xa c4637xa) {
        aa.e.d().f().b();
        c4637xa.d();
    }

    public /* synthetic */ Aa(UUID uuid, String str, W2 w2, LevelPlayBannerAdView.Config config, C4484p0 c4484p0, int i, zcl zclVar) {
        this((i & 1) != 0 ? C4616w7.a.a() : uuid, str, w2, config, (i & 16) != 0 ? new C4484p0(IronSource.a.BANNER, F0.b.MEDIATION) : c4484p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C4637xa a() {
        this.l = this.e.a(this.i);
        Context context = this.c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.a;
        String str = this.b;
        C4336gd c4336gd = this.l;
        J2 j2 = new J2(uuid, str, c4336gd == null ? null : c4336gd, this.g, null, null, this.f.a(), this.d.getBidFloor(), 48, null);
        this.e.d().a(new D0(this.e, j2, null, 4, 0 == true ? 1 : 0));
        ISBannerSize a2 = this.e.a(j2.i());
        C4668z5 d = this.e.d();
        C4484p0 c4484p0 = this.e;
        C4336gd c4336gd2 = this.l;
        d.a(new Y2(c4484p0, a2, (c4336gd2 != null ? c4336gd2 : null).c()));
        return new C4637xa(this, this.e, j2, this.c);
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        this.e.d(new xsna.c0(0, levelPlayAdInfo, this));
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void a(final LevelPlayAdInfo levelPlayAdInfo, final boolean z) {
        this.e.d(new Runnable() { // from class: xsna.a0
            @Override // java.lang.Runnable
            public final void run() {
                Aa.a(z, levelPlayAdInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo levelPlayAdInfo, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void a(LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.d(new xsna.b0(0, levelPlayAdError, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(levelPlayAdError);
        }
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.d(new xsna.x(levelPlayAdInfo, levelPlayAdError, this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + levelPlayAdInfo + " error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(levelPlayAdInfo, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, Aa aa) {
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = aa.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4665z2
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        this.e.d(new xsna.f0(0, levelPlayAdInfo, this));
    }
}
