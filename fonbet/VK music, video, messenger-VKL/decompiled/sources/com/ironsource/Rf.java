package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;

/* loaded from: classes13.dex */
public final class Rf {
    private final Lf a;
    private final Sf b;
    private final S8 c;

    public Rf(Lf lf, S8 s8, Sf sf) {
        this.a = lf;
        this.b = sf;
        this.c = s8;
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
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, C4249bg.a.a(Boolean.valueOf(this.a.c())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, C4249bg.a.a(Boolean.valueOf(this.a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, boolean z, boolean z2, String str2, int i, int i2) {
        loadBannerAd(null, str, z, z2, str2, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, boolean z, boolean z2) {
        loadInterstitialAd(null, str, z, z2);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, boolean z, boolean z2) {
        loadRewardedVideoAd(null, str, z, z2);
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
    public final void loadBannerAd(String str, String str2, boolean z, boolean z2, String str3, int i, int i2) {
        this.a.a(new Tf(str2, z, Boolean.valueOf(z2), str), str3, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String str2, boolean z, boolean z2) {
        this.a.b(new Tf(str2, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String str2, boolean z, boolean z2) {
        this.a.c(new Tf(str2, z, Boolean.valueOf(z2), str));
    }
}
