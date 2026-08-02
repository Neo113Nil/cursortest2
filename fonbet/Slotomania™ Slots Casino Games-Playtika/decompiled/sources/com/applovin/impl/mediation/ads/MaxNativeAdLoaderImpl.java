package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.a3;
import com.applovin.impl.f3;
import com.applovin.impl.f6;
import com.applovin.impl.i;
import com.applovin.impl.j;
import com.applovin.impl.k5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.t3;
import com.applovin.impl.u1;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0108a, j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";
    private final c a;
    private String b;
    private String c;
    private i d;
    private final Object e;
    private MaxNativeAdListener f;
    private final Map g;
    private final Set h;

    class a implements Runnable {
        final /* synthetic */ MaxNativeAd a;
        final /* synthetic */ List b;
        final /* synthetic */ ViewGroup c;

        a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.a = maxNativeAd;
            this.b = list;
            this.c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.prepareForInteraction(this.b, this.c)) {
                return;
            }
            p.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    class b implements Runnable {
        final /* synthetic */ MaxNativeAdView a;
        final /* synthetic */ f3 b;
        final /* synthetic */ MaxNativeAd c;

        b(MaxNativeAdView maxNativeAdView, f3 f3Var, MaxNativeAd maxNativeAd) {
            this.a = maxNativeAdView;
            this.b = f3Var;
            this.c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.a);
            }
            MaxNativeAdLoaderImpl.this.sdk.z().d(this.b);
            this.a.render(this.b, MaxNativeAdLoaderImpl.this.a, MaxNativeAdLoaderImpl.this.sdk);
            this.c.setNativeAdView(this.a);
            if (this.c.prepareForInteraction(this.a.getClickableViews(), this.a)) {
                return;
            }
            this.c.prepareViewForInteraction(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements a.InterfaceC0103a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            f3 f3Var = (f3) maxAd;
            f3Var.g(MaxNativeAdLoaderImpl.this.b);
            f3Var.f(MaxNativeAdLoaderImpl.this.c);
            synchronized (MaxNativeAdLoaderImpl.this.e) {
                MaxNativeAdLoaderImpl.this.h.add(f3Var);
            }
            MaxNativeAdView a = MaxNativeAdLoaderImpl.this.a(f3Var.N());
            if (a != null) {
                a(a);
                MaxNativeAdLoaderImpl.this.a(a, f3Var, f3Var.getNativeAd());
                p pVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (p.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f);
                }
                v2.a(MaxNativeAdLoaderImpl.this.f, a, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(f3Var);
                MaxNativeAdLoaderImpl.this.a(a);
                return;
            }
            p pVar3 = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "No native ad view to render. Returning the native ad to be rendered later.");
            }
            p pVar4 = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f, (MaxNativeAdView) null, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(f3Var);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MaxNativeAdLoaderImpl.c.this.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            v2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            f3 b;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (b = adViewTracker.b()) == null) {
                return;
            }
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(b);
        }
    }

    public MaxNativeAdLoaderImpl(String str, l lVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", lVar);
        this.a = new c(this, null);
        this.d = i.PUBLISHER_INITIATED;
        this.e = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        lVar.k().a(this);
        if (p.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f = null;
        this.sdk.k().b(this);
        synchronized (this.e) {
            this.g.clear();
            this.h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((f3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (p.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (p.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.Z().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.d, this.localExtraParameters, this.extraParameters, l.p(), this.a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0108a
    public void onAdExpired(u1 u1Var) {
        if (p.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (p.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + u1Var + "), listener=" + this.f);
        }
        v2.b(this.f, (MaxAd) u1Var, true);
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        f3 f3Var;
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                f3Var = null;
                break;
            } else {
                f3Var = (f3) it.next();
                if (f3Var.T().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (f3Var != null) {
            f3Var.h(str2);
            v2.b(this.adReviewListener, str2, f3Var);
            synchronized (this.e) {
                this.h.remove(f3Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        f3 f3Var = (f3) maxAd;
        MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        f3Var.a(viewGroup);
        this.sdk.z().d(f3Var);
        a((a3) f3Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(f3Var, viewGroup, this.a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.s0().a((k5) new u6(this.sdk, "renderMaxNativeAd", aVar), f6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof f3)) {
            p.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            p.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        f3 f3Var = (f3) maxAd;
        MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(t3.e8)).booleanValue()) {
            p.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, f3Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        q7.b(str, this.tag);
        this.c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof i)) {
            this.d = (i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f + ", revenueListener=" + this.revenueListener + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f3 f3Var) {
        if (f3Var.x0().get()) {
            return;
        }
        this.sdk.f().a(f3Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.e) {
            this.g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof f3) {
            f3 f3Var = (f3) maxAd;
            if (f3Var.A0()) {
                if (p.a()) {
                    this.logger.a(this.tag, "Native ad (" + f3Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.e) {
                this.h.remove(f3Var);
            }
            MaxNativeAdView v0 = f3Var.v0();
            if (v0 != null && (adViewTracker = v0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                v0.recycle();
            }
            MaxNativeAd nativeAd = f3Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(f3Var);
            this.sdk.Z().destroyAd(f3Var);
            if (this.sdk.T() != null) {
                this.sdk.T().c(this.adUnitId, f3Var.N());
                return;
            } else {
                this.sdk.S().c(this.adUnitId, f3Var.N());
                return;
            }
        }
        if (p.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.e) {
            maxNativeAdView = (MaxNativeAdView) this.g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, f3 f3Var, MaxNativeAd maxNativeAd) {
        f3Var.a(maxNativeAdView);
        a((a3) f3Var);
        b bVar = new b(maxNativeAdView, f3Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.s0().a((k5) new u6(this.sdk, "renderMaxNativeAd", bVar), f6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
