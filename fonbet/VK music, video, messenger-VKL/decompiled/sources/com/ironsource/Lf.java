package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.R8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import xsna.aaq;
import xsna.aw;
import xsna.s3q0;

/* loaded from: classes13.dex */
public final class Lf {
    private final WeakReference<TestSuiteActivity> b;
    private final Handler c;
    private final R8.a a = Kb.u.a().d();
    private final AtomicReference<LevelPlayBannerAdView> d = new AtomicReference<>();
    private final AtomicReference<LevelPlayInterstitialAd> e = new AtomicReference<>();
    private final AtomicReference<LevelPlayRewardedAd> f = new AtomicReference<>();

    public Lf(TestSuiteActivity testSuiteActivity, Handler handler) {
        this.b = new WeakReference<>(testSuiteActivity);
        this.c = handler;
    }

    public final void a(Tf tf, String str, int i, int i2) {
        a();
        TestSuiteActivity b = b();
        if (b != null) {
            this.a.a(tf);
            a(tf);
            LevelPlayBannerAdView.Config build = new LevelPlayBannerAdView.Config.Builder().setAdSize(Wf.a.b(str, i, i2)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.d;
            String b2 = tf.b();
            if (b2 == null) {
                b2 = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(b, b2, build);
            levelPlayBannerAdView.setBannerListener(new Mf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    public final void b(Tf tf) {
        this.a.a(tf);
        a(tf);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.e;
        String b = tf.b();
        if (b == null) {
            b = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(b);
        levelPlayInterstitialAd.setListener(new Qf());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void e() {
        TestSuiteActivity b = b();
        if (b != null) {
            LevelPlayInterstitialAd.showAd$default(this.e.get(), b, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity b = b();
        if (b != null) {
            LevelPlayRewardedAd.showAd$default(this.f.get(), b, null, 2, null);
        }
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public final void c(Tf tf) {
        this.a.a(tf);
        a(tf);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f;
        String b = tf.b();
        if (b == null) {
            b = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(b);
        levelPlayRewardedAd.setListener(new Zf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        testSuiteActivity.getContainer().removeView(levelPlayBannerAdView);
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
        this.c.post(new aw(4, b, levelPlayBannerAdView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        testSuiteActivity.getContainer().addView(levelPlayBannerAdView, C4249bg.a.a((Context) testSuiteActivity));
    }

    public final void a() {
        LevelPlayBannerAdView andSet;
        TestSuiteActivity b = b();
        if (b == null || (andSet = this.d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.c.post(new aaq(2, b, andSet));
    }

    private final void a(Tf tf) {
        s3q0 s3q0Var;
        String a = tf.a();
        if (a != null) {
            com.ironsource.mediationsdk.c.b().a(tf.c(), a);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            IronLog.INTERNAL.verbose("applyTestMode: adNetworkName is null");
        }
    }
}
