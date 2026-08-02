package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.a3;
import com.applovin.impl.d3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.h8;
import com.applovin.impl.i;
import com.applovin.impl.i8;
import com.applovin.impl.j;
import com.applovin.impl.k5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.p0;
import com.applovin.impl.q7;
import com.applovin.impl.s;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements g.a, i8.a, j.b {
    private static final Map E = new HashMap();
    private static final Object F = new Object();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final Context a;
    private final MaxAdView b;
    private final String c;
    private final View d;
    private long e;
    private d3 f;
    private String g;
    private String h;
    private final MaxAdViewConfiguration i;
    private final b j;
    private final d k;
    private final g l;
    private final h8 m;
    private final i8 n;
    private final Object o;
    private final Object p;
    private d3 q;
    private MaxAd r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final AtomicBoolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    private class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            v2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.Z().destroyAd(maxAd);
                return;
            }
            d3 d3Var = (d3) maxAd;
            d3Var.g(MaxAdViewImpl.this.g);
            d3Var.f(MaxAdViewImpl.this.h);
            if (d3Var.z() == null) {
                MaxAdViewImpl.this.sdk.Z().destroyAd(d3Var);
                onAdLoadFailed(d3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (d3Var.z0()) {
                long u0 = d3Var.u0();
                MaxAdViewImpl.this.sdk.Q();
                if (p.a()) {
                    MaxAdViewImpl.this.sdk.Q().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + u0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.l.a(u0);
                if (MaxAdViewImpl.this.l.g() || MaxAdViewImpl.this.u) {
                    p pVar2 = MaxAdViewImpl.this.logger;
                    if (p.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.l.j();
                }
            }
            p pVar3 = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            v2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(d3Var);
        }
    }

    private abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0103a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.r)) {
                MaxAdViewImpl.this.r = null;
                if ((MaxAdViewImpl.this.q.A0() || MaxAdViewImpl.this.B) && MaxAdViewImpl.this.s) {
                    MaxAdViewImpl.this.s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.q)) {
                MaxAdViewImpl.this.r = maxAd;
                if ((MaxAdViewImpl.this.q.A0() || MaxAdViewImpl.this.B) && !MaxAdViewImpl.this.l.g()) {
                    MaxAdViewImpl.this.s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.q)) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            v2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            v2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    private class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            p pVar = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.x) {
                p pVar = MaxAdViewImpl.this.logger;
                if (p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.Z().destroyAd(maxAd);
                return;
            }
            p pVar2 = MaxAdViewImpl.this.logger;
            if (p.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Successfully precached ad for refresh");
            }
            if (((Boolean) MaxAdViewImpl.this.sdk.a(t3.S7)).booleanValue()) {
                MaxAdViewImpl.this.b(maxAd);
            } else {
                MaxAdViewImpl.this.a(maxAd);
            }
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.e = Long.MAX_VALUE;
        this.o = new Object();
        this.p = new Object();
        this.q = null;
        this.r = null;
        this.v = new AtomicBoolean();
        this.x = false;
        this.a = context.getApplicationContext();
        this.b = maxAdView;
        this.d = view;
        this.j = new b();
        this.k = new d();
        this.l = new g(this.sdk, this);
        this.m = new h8(maxAdView, this.sdk);
        this.n = new i8(maxAdView, this.sdk, this);
        this.i = maxAdViewConfiguration;
        this.sdk.k().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        a(str);
        if (p.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(t3.T7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MaxAdViewImpl.this.g();
                }
            });
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.g;
    }

    public void loadAd() {
        loadAd(i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.g.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(t3.S7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        d3 d3Var = this.q;
        if (d3Var != null && d3Var.T().equalsIgnoreCase(str)) {
            this.q.h(str2);
            v2.b(this.adReviewListener, str2, this.q);
            return;
        }
        d3 d3Var2 = this.f;
        if (d3Var2 == null || !d3Var2.T().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
    }

    @Override // com.applovin.impl.i8.a
    public void onLogVisibilityImpression() {
        a(this.q, this.m.a(this.q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.a(t3.P7)).booleanValue() && this.l.h()) {
            if (g8.b(i)) {
                if (p.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.l.d();
            } else {
                if (p.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.q != null && p.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        q7.b(str, this.tag);
        this.h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.q != null && p.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.e = i;
    }

    public void startAutoRefresh() {
        this.u = false;
        if (!this.l.g()) {
            if (p.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
            }
        } else {
            this.l.m();
            if (p.a()) {
                this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.l.b() + "ms");
            }
        }
    }

    public void stopAutoRefresh() {
        if (this.q != null) {
            if (p.a()) {
                this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.l.b() + "ms");
            }
            this.l.j();
        } else if (this.y || ((Boolean) this.sdk.a(t3.R7)).booleanValue()) {
            this.u = true;
        } else {
            p.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public String toString() {
        StringBuilder append = new StringBuilder("MaxAdView{adUnitId='").append(this.adUnitId).append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.b) {
            obj = "this";
        }
        return append.append(obj).append(", isDestroyed=").append(a()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final d3 d3Var) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.b(d3Var);
            }
        });
    }

    private void e() {
        this.v.set(false);
        if (this.f != null) {
            i();
            return;
        }
        if (!b()) {
            if (p.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(i.REFRESH);
        } else if (this.t) {
            if (p.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(i.REFRESH);
        } else {
            if (p.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.v.set(true);
        }
    }

    private void f() {
        boolean z;
        boolean z2;
        synchronized (this.p) {
            z = false;
            this.v.set(false);
            z2 = this.f != null;
            if (!z2) {
                if (b()) {
                    if (!this.t) {
                        if (p.a()) {
                            this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                        }
                        this.v.set(true);
                    } else if (p.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                    }
                } else if (p.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network...");
                }
                z = true;
            }
        }
        if (z2) {
            i();
        } else if (z) {
            loadAd(i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f != null) {
            this.sdk.Z().destroyAd(this.f);
        }
        synchronized (this.o) {
            this.x = true;
        }
        this.l.a();
        this.sdk.k().b(this);
        if (this.sdk.T() != null) {
            this.sdk.T().c(this.adUnitId, this.c);
        } else {
            this.sdk.S().c(this.adUnitId, this.c);
        }
        super.destroy();
    }

    private void h() {
        d3 d3Var;
        if (this.b != null) {
            if (((Boolean) this.sdk.a(z4.Z6)).booleanValue()) {
                s.b(this.b, this.d);
            } else {
                s.a(this.b, this.d);
            }
        }
        this.n.b();
        synchronized (this.o) {
            d3Var = this.q;
        }
        MaxAd maxAd = this.r;
        if (maxAd != null && maxAd.equals(d3Var)) {
            if (p.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            v2.b(this.j, maxAd);
        }
        if (d3Var != null) {
            this.sdk.Z().destroyAd(d3Var);
        }
    }

    private void i() {
        if (p.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f + "...");
        }
        this.j.onAdLoaded(this.f);
        this.f = null;
    }

    public void loadAd(i iVar) {
        if (p.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z = this.y || ((Boolean) this.sdk.a(t3.R7)).booleanValue();
        if (z && !this.l.g() && this.l.h()) {
            p.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.l.b()) + " seconds.");
            return;
        }
        if (!z) {
            if (p.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.j);
        } else if (this.f != null) {
            if (p.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.w) {
            if (p.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.v.set(true);
        } else {
            if (p.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final d3 d3Var) {
        View z = d3Var.z();
        String str = z == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (p.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (p.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + d3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, (MaxAd) d3Var, (MaxError) maxErrorImpl, true);
            this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, d3Var);
            return;
        }
        h();
        a((a3) d3Var);
        if (d3Var.t0()) {
            this.n.a(d3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (d3Var.v0() != Long.MAX_VALUE) {
            this.d.setBackgroundColor((int) d3Var.v0());
        } else {
            long j = this.e;
            if (j != Long.MAX_VALUE) {
                this.d.setBackgroundColor((int) j);
            } else {
                this.d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(z);
        a(z, d3Var);
        this.sdk.z().d(d3Var);
        c(d3Var);
        synchronized (this.o) {
            this.q = d3Var;
        }
        if (p.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.Z().processRawAdImpression(d3Var, this.j);
        if (StringUtils.isValidString(this.q.getAdReviewCreativeId())) {
            v2.a(this.adReviewListener, this.q.getAdReviewCreativeId(), (MaxAd) this.q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.a(d3Var);
            }
        }, d3Var.x0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (p.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(i.SEQUENTIAL_OR_PRECACHE, this.k);
    }

    private void d() {
        if (b()) {
            if (p.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.w = true;
            this.sdk.s0().a((k5) new u6(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    MaxAdViewImpl.this.c();
                }
            }), f6.b.MEDIATION);
        }
    }

    private void c(d3 d3Var) {
        int height = this.b.getHeight();
        int width = this.b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.a, width);
            MaxAdFormat format = d3Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(pxToDp2, this.b.getContext()) : format.getSize()).getHeight();
            int min = Math.min(format.getSize().getWidth(), p0.b(this.a).x);
            if (pxToDp < height2 || pxToDp2 < min) {
                String str = "\n**************************************************\n`MaxAdView` size " + pxToDp2 + "x" + pxToDp + " dp smaller than required " + (this.D ? "adaptive " : "") + "size: " + min + "x" + height2 + " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n";
                if (p.a()) {
                    this.logger.b("AppLovinSdk", str);
                }
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "container_width_dp", pxToDp2);
                JsonUtils.putInt(jSONObject, "container_height_dp", pxToDp);
                JsonUtils.putInt(jSONObject, "required_width_dp", min);
                JsonUtils.putInt(jSONObject, "required_height_dp", height2);
                JsonUtils.putBoolean(jSONObject, "is_adaptive", this.D);
                this.sdk.E().a(f2.b1, "adViewContainerUndersized", CollectionUtils.hashMap("details", jSONObject.toString()), this.c);
            }
        }
    }

    private void a(final i iVar, final a.InterfaceC0103a interfaceC0103a) {
        if (a()) {
            boolean c2 = q7.c(this.sdk);
            this.sdk.E().a(f2.b1, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + c2));
            if (!c2) {
                p.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.a(interfaceC0103a, iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0103a interfaceC0103a, i iVar) {
        int adaptiveWidth;
        d3 d3Var = this.q;
        if (d3Var != null) {
            long a2 = this.m.a(d3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(a2));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getWidth());
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.l.g() || this.u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && pxToDp != adaptiveWidth) {
            p.j(this.tag, "The requested adaptive ad view width (" + adaptiveWidth + " dp) is different from the MaxAdView width (" + pxToDp + " dp).");
        }
        if (p.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0103a + "...");
        }
        this.sdk.Z().loadAd(this.adUnitId, this.c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.a, interfaceC0103a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (p.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (p.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (p.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (p.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.B = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (p.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.C = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (p.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            if (this.i == null) {
                p.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean compareAndSet;
        this.w = false;
        synchronized (this.p) {
            compareAndSet = this.v.compareAndSet(true, false);
            if (!compareAndSet) {
                if (p.a()) {
                    this.logger.a(this.tag, "Saving precache ad...");
                }
                d3 d3Var = (d3) maxAd;
                this.f = d3Var;
                d3Var.g(this.g);
                this.f.f(this.h);
            }
        }
        if (compareAndSet) {
            if (p.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.j.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d3 d3Var) {
        long a2 = this.m.a(d3Var);
        if (!d3Var.t0()) {
            a(d3Var, a2);
        }
        a(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (p.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(t3.L7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.u && !this.l.g()) {
            this.t = true;
            this.w = false;
            long longValue = ((Long) this.sdk.a(t3.K7)).longValue();
            if (longValue >= 0) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a(this.tag, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.l.a(longValue);
                return;
            }
            return;
        }
        if (this.w) {
            if (p.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.w = false;
        }
        if (this.v.get()) {
            if (p.a()) {
                this.logger.a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(t3.Y7)).booleanValue();
    }

    private void a(String str) {
        int intValue;
        synchronized (F) {
            Map map = E;
            Integer num = (Integer) map.get(str);
            intValue = num != null ? 1 + num.intValue() : 1;
            map.put(str, Integer.valueOf(intValue));
        }
        if (intValue == ((Integer) this.sdk.a(t3.G8)).intValue()) {
            p.j(this.tag, "You are creating multiple MaxAdView instances for ad unit (" + str + ")! For best ad performance, please use a single MaxAdView instance and call loadAd() to refresh.");
            this.sdk.E().a(f2.b1, "excessiveAdViewAllocations", CollectionUtils.hashMap("ad_unit_id", str));
        }
    }

    private void a(View view, d3 d3Var) {
        int y0 = d3Var.y0();
        int w0 = d3Var.w0();
        int dpToPx = y0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), y0);
        int dpToPx2 = w0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), w0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (p.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + dpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : g8.a(this.b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(d3 d3Var, long j) {
        if (p.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.Z().processViewabilityAdImpressionPostback(d3Var, j, this.j);
    }

    private void a(long j) {
        if (q7.a(j, ((Long) this.sdk.a(t3.X7)).longValue()) && !this.C) {
            if (p.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            }
            if (p.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.t = true;
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.w = false;
        if (this.v.compareAndSet(true, false)) {
            if (p.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.j.onAdLoaded(maxAd);
        } else {
            if (p.a()) {
                this.logger.a(this.tag, "Saving precache ad...");
            }
            d3 d3Var = (d3) maxAd;
            this.f = d3Var;
            d3Var.g(this.g);
            this.f.f(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z;
        synchronized (this.o) {
            z = this.x;
        }
        return z;
    }
}
