package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Pf {

    @NotNull
    private final Jf a;

    @NotNull
    private final Qf b;

    @NotNull
    private final P8 c;

    public Pf(@NotNull Jf jf, @NotNull P8 p8, @NotNull Qf qf) {
        jf.getClass();
        p8.getClass();
        qf.getClass();
        this.a = jf;
        this.b = qf;
        this.c = p8;
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
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, Zf.a.a(Boolean.valueOf(this.a.c())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, Zf.a.a(Boolean.valueOf(this.a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(@Nullable String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, int i, int i2) {
        str2.getClass();
        str3.getClass();
        this.a.a(new Rf(str2, z, Boolean.valueOf(z2), str), str3, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@Nullable String str, @NotNull String str2, boolean z, boolean z2) {
        str2.getClass();
        this.a.b(new Rf(str2, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@Nullable String str, @NotNull String str2, boolean z, boolean z2) {
        str2.getClass();
        this.a.c(new Rf(str2, z, Boolean.valueOf(z2), str));
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
    public final void loadInterstitialAd(@NotNull String str, boolean z, boolean z2) {
        str.getClass();
        loadInterstitialAd(null, str, z, z2);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@NotNull String str, boolean z, boolean z2) {
        str.getClass();
        loadRewardedVideoAd(null, str, z, z2);
    }

    @JavascriptInterface
    public final void loadBannerAd(@NotNull String str, boolean z, boolean z2, @NotNull String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        loadBannerAd(null, str, z, z2, str2, i, i2);
    }
}
