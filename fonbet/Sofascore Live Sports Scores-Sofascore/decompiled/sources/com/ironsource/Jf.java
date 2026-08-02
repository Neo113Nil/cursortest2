package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.O8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import defpackage.wda;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Jf {

    @NotNull
    private final O8.a a;

    @NotNull
    private final WeakReference<TestSuiteActivity> b;

    @NotNull
    private final Handler c;

    @NotNull
    private final AtomicReference<LevelPlayBannerAdView> d;

    @NotNull
    private final AtomicReference<LevelPlayInterstitialAd> e;

    @NotNull
    private final AtomicReference<LevelPlayRewardedAd> f;

    public Jf(@NotNull TestSuiteActivity testSuiteActivity, @NotNull Handler handler) {
        testSuiteActivity.getClass();
        handler.getClass();
        this.a = Ib.v.a().d();
        this.b = new WeakReference<>(testSuiteActivity);
        this.c = handler;
        this.d = new AtomicReference<>();
        this.e = new AtomicReference<>();
        this.f = new AtomicReference<>();
    }

    public final void a(@NotNull Rf rf, @NotNull String str, int i, int i2) {
        rf.getClass();
        str.getClass();
        a();
        TestSuiteActivity b = b();
        if (b != null) {
            this.a.a(rf);
            a(rf);
            LevelPlayBannerAdView.Config build = new LevelPlayBannerAdView.Config.Builder().setAdSize(Uf.a.b(str, i, i2)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.d;
            String b2 = rf.b();
            if (b2 == null) {
                b2 = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(b, b2, build);
            levelPlayBannerAdView.setBannerListener(new Kf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    public final void b(@NotNull Rf rf) {
        rf.getClass();
        this.a.a(rf);
        a(rf);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.e;
        String b = rf.b();
        if (b == null) {
            b = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(b);
        levelPlayInterstitialAd.setListener(new Of());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void c(@NotNull Rf rf) {
        rf.getClass();
        this.a.a(rf);
        a(rf);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f;
        String b = rf.b();
        if (b == null) {
            b = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(b);
        levelPlayRewardedAd.setListener(new Xf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public final void e() {
        TestSuiteActivity b = b();
        if (b != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
            levelPlayInterstitialAd.getClass();
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, b, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity b = b();
        if (b != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
            levelPlayRewardedAd.getClass();
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, b, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        testSuiteActivity.getClass();
        levelPlayBannerAdView.getClass();
        testSuiteActivity.getContainer().removeView(levelPlayBannerAdView);
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    private final TestSuiteActivity b() {
        return this.b.get();
    }

    public final void a(double d) {
        LevelPlayBannerAdView levelPlayBannerAdView;
        TestSuiteActivity b = b();
        if (b == null || (levelPlayBannerAdView = this.d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.c.post(new wda(b, levelPlayBannerAdView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        testSuiteActivity.getClass();
        levelPlayBannerAdView.getClass();
        testSuiteActivity.getContainer().addView(levelPlayBannerAdView, Zf.a.a((Context) testSuiteActivity));
    }

    public final void a() {
        LevelPlayBannerAdView andSet;
        TestSuiteActivity b = b();
        if (b == null || (andSet = this.d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.c.post(new wda(b, andSet, 0));
    }

    private final void a(Rf rf) {
        Unit unit;
        String a = rf.a();
        if (a != null) {
            com.ironsource.mediationsdk.c.d().a(rf.c(), a);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.verbose("applyTestMode: adNetworkName is null");
        }
    }
}
