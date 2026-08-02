package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.a3;
import com.applovin.impl.e3;
import com.applovin.impl.f5;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.m3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class h {
    private final l b;
    private final p c;
    private final String d;
    private final m3 e;
    private final String f;
    private MaxAdapter g;
    private String h;
    private a3 i;
    private View j;
    private MaxNativeAd k;
    private MaxNativeAdView l;
    private ViewGroup m;
    private MaxAdapterResponseParameters o;
    private final boolean s;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final b n = new b(this, null);
    private final AtomicBoolean p = new AtomicBoolean(true);
    private final AtomicBoolean q = new AtomicBoolean(false);
    private final AtomicBoolean r = new AtomicBoolean(false);

    class a implements MaxSignalCollectionListener {
        final /* synthetic */ f5 a;
        final /* synthetic */ u4 b;

        a(f5 f5Var, u4 u4Var) {
            this.a = f5Var;
            this.b = u4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.a.y() && TextUtils.isEmpty(str)) {
                this.b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.b.a(new MaxErrorImpl(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {
        private MediationServiceImpl.b a;

        private b() {
        }

        private void b(String str, final Bundle bundle) {
            if (h.this.i.x().compareAndSet(false, true)) {
                a(str, this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b.this.i(bundle);
                    }
                });
            }
        }

        private void c(String str, final Bundle bundle) {
            if (!h.this.i.x().get()) {
                h.this.r.set(true);
                a(str, this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b.this.j(bundle);
                    }
                });
            } else {
                p unused = h.this.c;
                if (p.a()) {
                    h.this.c.b("MediationAdapterWrapper", h.this.f + ": blocking ad loaded callback for " + h.this.i + " since onAdHidden() has been called");
                }
                h.this.b.u().a(h.this.i, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.a.c(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.a.c(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.a.e(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.q.compareAndSet(false, true)) {
                this.a.f(h.this.i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.k("MediationAdapterWrapper", h.this.f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            p unused = h.this.c;
            if (p.a()) {
                h.this.c.d("MediationAdapterWrapper", h.this.f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (h.this.i instanceof e3) {
                final e3 e3Var = (e3) h.this.i;
                if (e3Var.w0().compareAndSet(false, true)) {
                    p unused = h.this.c;
                    if (p.a()) {
                        h.this.c.d("MediationAdapterWrapper", h.this.f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.b.this.a(e3Var, maxReward, bundle);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.a.d(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (h.this.i.x().get()) {
                p unused = h.this.c;
                if (p.a()) {
                    h.this.c.b("MediationAdapterWrapper", h.this.f + ": blocking ad load failed callback for " + h.this.i + " since onAdHidden() has been called");
                }
                h.this.b.u().a(h.this.i, str);
                return;
            }
            a(str, this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.a(maxError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.q.compareAndSet(false, true)) {
                this.a.onAdLoadFailed(h.this.h, maxError);
            }
        }

        private void a(String str, final Bundle bundle) {
            if (h.this.i.x().get()) {
                p unused = h.this.c;
                if (p.a()) {
                    h.this.c.b("MediationAdapterWrapper", h.this.f + ": blocking ad displayed callback for " + h.this.i + " since onAdHidden() has been called");
                }
                h.this.b.u().a(h.this.i, str);
                return;
            }
            if (!((Boolean) h.this.b.a(t3.J8)).booleanValue()) {
                if (h.this.i.u().compareAndSet(false, true)) {
                    a(str, this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.b.this.h(bundle);
                        }
                    });
                    return;
                }
                return;
            }
            a(str, this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.g(bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (h.this.i.x().get()) {
                p unused = h.this.c;
                if (p.a()) {
                    h.this.c.b("MediationAdapterWrapper", h.this.f + ": blocking ad display failed callback for " + h.this.i + " since onAdHidden() has been called");
                }
                h.this.b.u().a(h.this.i, str);
                return;
            }
            a(str, this.a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.a(maxError, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.a.a(h.this.i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var, MaxReward maxReward, Bundle bundle) {
            this.a.a(e3Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.a.a(h.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.a.onAdCollapsed(h.this.i);
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            h.this.a.post(new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                p.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                h.this.b.E().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", h.this.e.b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements MaxAdapter.OnCompletionListener {
        private final l a;
        private final m3 b;
        private final long c;
        private final MaxAdapter.OnCompletionListener d;

        public c(l lVar, m3 m3Var, long j, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.a = lVar;
            this.b = m3Var;
            this.c = j;
            this.d = onCompletionListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.a.U().a(this.b, SystemClock.elapsedRealtime() - this.c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.h$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    h.c.this.a(initializationStatus, str);
                }
            }, this.b.h());
        }
    }

    private class d extends k5 {
        private final WeakReference g;

        /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(a3 a3Var) {
            if (a3Var != null) {
                this.a.b0().a(a3Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.q.get()) {
                return;
            }
            if (p.a()) {
                this.c.b(this.b, h.this.f + " is timing out " + h.this.i + "...");
            }
            b(h.this.i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.g.get();
            if (bVar != null) {
                bVar.a(this.b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.b);
            this.g = new WeakReference(h.this.n);
        }
    }

    h(m3 m3Var, MaxAdapter maxAdapter, boolean z, l lVar) {
        if (m3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.d = m3Var.c();
        this.g = maxAdapter;
        this.b = lVar;
        this.c = lVar.Q();
        this.e = m3Var;
        this.f = maxAdapter.getClass().getSimpleName();
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter != null) {
            this.g = null;
            maxAdapter.onDestroy();
        } else if (p.a()) {
            this.c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is already destroyed");
        }
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    public boolean k() {
        return this.p.get();
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f + "'}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.n);
    }

    public MediationServiceImpl.b c() {
        return this.n.a;
    }

    public View d() {
        return this.j;
    }

    public MaxNativeAd e() {
        return this.k;
    }

    public MaxNativeAdView f() {
        return this.l;
    }

    public String g() {
        return this.d;
    }

    public ViewGroup h() {
        return this.m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            p.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.d, th);
            this.b.E().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("sdk_version");
            this.b.V().a(this.e.b(), "sdk_version", this.i);
            return null;
        }
    }

    public boolean j() {
        return this.q.get() && this.r.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.g).loadRewardedAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.g).loadNativeAd(maxAdapterResponseParameters, activity, this.n);
    }

    void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        b(MobileAdsBridgeBase.initializeMethodName, new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                h.this.a(onCompletionListener, maxAdapterInitializationParameters, activity);
            }
        });
    }

    public void b(a3 a3Var, final Activity activity) {
        Runnable runnable;
        if (a(a3Var, activity)) {
            if (a3Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.a(activity);
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.b(activity);
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.c(activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, a3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (p.a()) {
            this.c.a("MediationAdapterWrapper", "Initializing " + this.f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.e.r());
        }
        this.g.initialize(maxAdapterInitializationParameters, activity, new c(this.b, this.e, elapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.g).showRewardedAd(this.o, activity, this.n);
    }

    void a(String str, a3 a3Var) {
        this.h = str;
        this.i = a3Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.m = viewGroup;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final a3 a3Var, final Activity activity, MediationServiceImpl.b bVar) {
        final Runnable runnable;
        if (a3Var != null) {
            if (!this.p.get()) {
                String str2 = "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                p.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.o = maxAdapterResponseParameters;
            this.n.a(bVar);
            final MaxAdFormat format = a3Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.a(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.b(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.c(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.d(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format.isAdViewAd()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.a(maxAdapterResponseParameters, format, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            a(Constants.LOAD_AD, format, new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.a(a3Var, runnable);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.g).showAppOpenAd(this.o, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.g).showRewardedAd(this.o, viewGroup, lifecycle, activity, this.n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            p.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.d, th);
            this.b.E().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("adapter_version");
            this.b.V().a(this.e.b(), "adapter_version", this.i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a3 a3Var, Runnable runnable) {
        a(this.e, a3Var);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.d + " due to: " + th;
            p.h("MediationAdapterWrapper", str);
            this.n.a(Constants.LOAD_AD, new MaxErrorImpl(-1, str));
            this.b.E().a("MediationAdapterWrapper", Constants.LOAD_AD, th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a(Constants.LOAD_AD);
            this.b.V().a(this.e.b(), Constants.LOAD_AD, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.g).showInterstitialAd(this.o, activity, this.n);
    }

    public void a(a3 a3Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (a(a3Var, activity)) {
            if (a3Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.a(viewGroup, lifecycle, activity);
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.b(viewGroup, lifecycle, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, a3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.g).showInterstitialAd(this.o, viewGroup, lifecycle, activity, this.n);
    }

    private boolean a(a3 a3Var, Activity activity) {
        if (a3Var != null) {
            if (a3Var.B() == null) {
                p.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (a3Var.B() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != a3Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.p.get()) {
                    String str = "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.";
                    p.h("MediationAdapterWrapper", str);
                    this.n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException("Mediation adapter '" + this.f + "' does not have an ad loaded. Please load an ad first");
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(final Runnable runnable, a3 a3Var) {
        a3Var.g0();
        a("show_ad", a3Var.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                h.this.a(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.d + " due to: " + th;
            p.h("MediationAdapterWrapper", str);
            this.n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.b.E().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("show_ad");
            this.b.V().a(this.e.b(), "show_ad", this.i);
        }
    }

    void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final f5 f5Var, final Activity activity, final u4 u4Var) {
        if (u4Var != null) {
            if (!this.p.get()) {
                p.h("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
                u4Var.a(new MaxErrorImpl("The adapter (" + this.f + ") is disabled"));
                return;
            }
            MaxAdapter maxAdapter = this.g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.a(maxSignalProvider, maxAdapterSignalCollectionParameters, activity, f5Var, u4Var);
                    }
                });
                return;
            } else {
                u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f + ") does not support signal collection"));
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, f5 f5Var, u4 u4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(f5Var, u4Var));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.d + " due to: " + th);
            p.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            u4Var.a(maxErrorImpl);
            this.b.E().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("collect_signal");
            this.b.V().a(this.e.b(), "collect_signal", this.i);
        }
        if (!u4Var.d() && f5Var.m() == 0) {
            if (p.a()) {
                this.c.a("MediationAdapterWrapper", "Failing signal collection " + f5Var + " since it has 0 timeout");
            }
            u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f + ") has 0 timeout"));
        }
    }

    void a() {
        if (this.s) {
            return;
        }
        b("destroy", new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                h.this.l();
            }
        });
    }

    private void a(m3 m3Var, a3 a3Var) {
        a(new d(this, null), m3Var, a3Var);
    }

    private void a(k5 k5Var, m3 m3Var, a3 a3Var) {
        long m = m3Var.m();
        if (m <= 0) {
            if (p.a()) {
                p pVar = this.c;
                StringBuilder sb = new StringBuilder("Non-positive timeout set for ");
                if (a3Var != null) {
                    m3Var = a3Var;
                }
                pVar.a("MediationAdapterWrapper", sb.append(m3Var).append(", not scheduling a timeout").toString());
                return;
            }
            return;
        }
        if (p.a()) {
            p pVar2 = this.c;
            StringBuilder append = new StringBuilder("Setting timeout ").append(m).append("ms for ");
            if (a3Var != null) {
                m3Var = a3Var;
            }
            pVar2.a("MediationAdapterWrapper", append.append(m3Var).toString());
        }
        this.b.s0().a(k5Var, f6.b.TIMEOUT, m);
    }

    private void a(String str) {
        if (p.a()) {
            this.c.d("MediationAdapterWrapper", "Marking " + this.f + " as disabled due to: " + str);
        }
        this.p.set(false);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                h.this.a(str, runnable);
            }
        };
        if (a(str, maxAdFormat)) {
            this.a.post(runnable2);
            return;
        }
        u6 u6Var = new u6(this.b, str + ":" + this.e.c(), runnable2);
        if (((Boolean) this.b.a(z4.Z)).booleanValue()) {
            this.b.s0().a(u6Var, this.e);
        } else {
            this.b.s0().a(u6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (p.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": running " + str + "...");
            }
            runnable.run();
            if (p.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            p.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.d, th);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.b.V().a(this.e.b(), str, this.i);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.e.b(), hashMap);
            this.b.E().a("MediationAdapterWrapper", str, th, hashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean j0;
        Boolean l0;
        Boolean k0;
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return this.e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean shouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (shouldInitializeOnUiThread != null) {
                return shouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean shouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (shouldCollectSignalsOnUiThread != null) {
                return shouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if (Constants.LOAD_AD.equals(str) && maxAdFormat != null) {
            a3 a3Var = this.i;
            if (a3Var != null && (k0 = a3Var.k0()) != null) {
                return k0.booleanValue();
            }
            Boolean shouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (shouldLoadAdsOnUiThread != null) {
                return shouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            a3 a3Var2 = this.i;
            if (a3Var2 != null && (l0 = a3Var2.l0()) != null) {
                return l0.booleanValue();
            }
            Boolean shouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (shouldShowAdsOnUiThread != null) {
                return shouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            a3 a3Var3 = this.i;
            if (a3Var3 != null && (j0 = a3Var3.j0()) != null) {
                return j0.booleanValue();
            }
            Boolean shouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (shouldDestroyOnUiThread != null) {
                return shouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.e.r();
    }
}
