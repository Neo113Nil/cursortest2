package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.f6;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class k2 {
    protected final com.applovin.impl.sdk.l b;
    protected final AppLovinAdServiceImpl c;
    private AppLovinAd d;
    private String e;
    private SoftReference f;
    private volatile String h;
    private volatile double j;
    public final Map a = Collections.synchronizedMap(new HashMap());
    private final Object g = new Object();
    private volatile boolean i = false;

    class a implements AppLovinAdRewardListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            k2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.b.Q().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            k2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.b.Q().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            k2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.b.Q().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            k2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.b.Q().b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    private class c implements n2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {
        private final AppLovinAd a;
        private final AppLovinAdDisplayListener b;
        private final AppLovinAdClickListener c;
        private final AppLovinAdVideoPlaybackListener d;
        private final AppLovinAdRewardListener e;

        /* synthetic */ c(k2 k2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i;
            k2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.b.Q().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String b = k2.this.b();
            if (!StringUtils.isValidString(b) || !k2.this.i) {
                k2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.b.Q().b("IncentivizedAdController", "Invalid reward state - result: " + b + " and wasFullyEngaged: " + k2.this.i);
                }
                k2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.b.Q().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (k2.this.i) {
                    k2.this.b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        k2.this.b.Q().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    k2.this.b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        k2.this.b.Q().b("IncentivizedAdController", "Ad closed prematurely from source: " + str);
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(q4.a(str));
                k2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.b.Q().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                v2.a(this.e, bVar, i);
                HashMap<String, String> hashMap = CollectionUtils.hashMap("details", String.valueOf(k2.this.j));
                CollectionUtils.putStringIfValid("source", str, hashMap);
                k2.this.b.g().a(f2.K, bVar, hashMap);
            }
            if (bVar.A0().getAndSet(true)) {
                return;
            }
            k2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.b.Q().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            k2.this.b.s0().a((k5) new p6(bVar, k2.this.b), f6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            v2.a(this.c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            v2.a(this.b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            AppLovinAd f = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (f instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) f;
                a(bVar, a(bVar, false));
            } else {
                String str = f == null ? "null/expired ad" : "invalid ad of type: " + f;
                k2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.b.Q().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            k2.this.a(f);
            k2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.b.Q().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            v2.b(this.b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.n2
        public void onAdDisplayFailed(String str) {
            ?? r0 = this.a;
            boolean z = r0 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVar = r0;
            if (z) {
                bVar = ((com.applovin.impl.sdk.ad.c) r0).f();
            }
            boolean z2 = this.b instanceof n2;
            if (bVar instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar2 = bVar;
                a(bVar2, a(bVar2, StringUtils.isValidString(str)));
            } else {
                String str2 = bVar == null ? "null/expired ad" : "invalid ad of type: " + bVar;
                k2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.b.Q().b("IncentivizedAdController", "Received `" + (z2 ? "adDisplayFailed" : "adHidden") + "` callback for " + str2);
                }
            }
            k2.this.a(bVar);
            if (z2) {
                v2.a(this.b, str);
            } else {
                v2.b(this.b, this.a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            k2.this.a("quota_exceeded");
            v2.b(this.e, appLovinAd, map);
            k2.this.b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            k2.this.a("rejected");
            v2.a(this.e, appLovinAd, map);
            k2.this.b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            k2.this.a("accepted");
            v2.c(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            k2.this.a("network_timeout");
            v2.a(this.e, appLovinAd, i);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", "network_timeout");
            hashMap.put("code", String.valueOf(i));
            k2.this.b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, hashMap);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            v2.a(this.d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            AppLovinAd f = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z2 = true;
            boolean z3 = (f instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) f).I0();
            k2 k2Var = k2.this;
            if (z3) {
                d = 100.0d;
            }
            k2Var.j = d;
            k2 k2Var2 = k2.this;
            if (!z && !z3) {
                z2 = false;
            }
            k2Var2.i = z2;
            v2.a(this.d, appLovinAd, k2.this.j, k2.this.i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.a = appLovinAd;
            this.b = appLovinAdDisplayListener;
            this.c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z) {
            if (StringUtils.isValidString(bVar.w())) {
                return bVar.w();
            }
            if (z) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public k2(String str, AppLovinSdk appLovinSdk) {
        this.b = appLovinSdk.a();
        this.c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.d != null;
    }

    public String c() {
        return this.e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.b.Q().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements AppLovinAdLoadListener {
        private final AppLovinAdLoadListener a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.a = appLovinAdLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                k2.this.b.E().a("IncentivizedAdController", com.safedk.android.analytics.brandsafety.creatives.discoveries.h.ae, th);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            k2.this.d = appLovinAd;
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.k2$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k2.b.this.a(appLovinAd);
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.k2$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        k2.b.this.a(i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            try {
                this.a.failedToReceiveAd(i);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                k2.this.b.E().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.loadNextIncentivizedAd(this.e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.g) {
            str = this.h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.b.s0().a((k5) new w6(bVar, appLovinAdRewardListener, this.b), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.h = str;
        }
    }

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map a2 = h2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", a2);
        this.b.g().d(f2.D, a2);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a3 = q7.a(appLovinAdImpl, this.b);
        String a4 = a(a3, appLovinAdImpl);
        if (StringUtils.isValidString(a4)) {
            a(appLovinAdImpl, a4, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.A0(), context);
        for (String str : this.a.keySet()) {
            create.setExtraInfo(str, this.a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a3);
        a((com.applovin.impl.sdk.ad.b) a3, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map a2 = h2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", a2);
        this.b.g().d(f2.D, a2);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a3 = q7.a(appLovinAdImpl, this.b);
        String a4 = a(a3, appLovinAdImpl);
        if (StringUtils.isValidString(a4)) {
            a(appLovinAdImpl, a4, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.A0(), context);
        for (String str : this.a.keySet()) {
            create.setExtraInfo(str, this.a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a3, viewGroup, lifecycle);
        a((com.applovin.impl.sdk.ad.b) a3, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, n2 n2Var) {
        v2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        v2.a(n2Var, str);
        Map a2 = h2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", a2);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        this.b.g().d(f2.G, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
