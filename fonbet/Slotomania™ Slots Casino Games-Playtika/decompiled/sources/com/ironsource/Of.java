package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Of {
    private final If a;
    private final Pf b;
    private final R8 c;

    public Of(If adsManager, R8 uiLifeCycleListener, Pf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(adsManager, "adsManager");
        Intrinsics.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.a = adsManager;
        this.b = javaScriptEvaluator;
        this.c = uiLifeCycleListener;
    }

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d) {
        this.a.a(d);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.a.a();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, Yf.a.a(Boolean.valueOf(this.a.c())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, Yf.a.a(Boolean.valueOf(this.a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        loadBannerAd(null, adNetwork, z, z2, description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z, z2);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z, z2);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.a.f();
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        this.a.a(new Qf(adNetwork, z, Boolean.valueOf(z2), str), description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.a.b(new Qf(adNetwork, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.a.c(new Qf(adNetwork, z, Boolean.valueOf(z2), str));
    }
}
