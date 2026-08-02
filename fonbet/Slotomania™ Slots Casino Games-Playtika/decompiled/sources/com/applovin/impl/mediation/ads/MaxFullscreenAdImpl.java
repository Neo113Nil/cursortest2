package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.e3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.i;
import com.applovin.impl.i0;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u1;
import com.applovin.impl.u6;
import com.applovin.impl.v1;
import com.applovin.impl.v2;
import com.applovin.impl.y3;
import com.applovin.impl.z3;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0108a, j.b {
    private final a a;
    private final WeakReference b;
    private final b c;
    private final com.applovin.impl.mediation.b d;
    private final Object e;
    private e3 f;
    private c g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private i0 j;
    private long k;
    private boolean l;
    private d m;
    private String n;
    private String o;
    private String p;
    private WeakReference q;
    private WeakReference r;
    private WeakReference s;

    public interface a {
        Activity getActivity();
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    private enum d {
        NONE("none"),
        FAILOVER_CACHE("failover_cache"),
        PRELOADED_ADS_QUEUE("preloaded_ads_queue");

        private final String a;

        d(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, l lVar, Context context) {
        super(str, maxAdFormat, str2, lVar);
        this.e = new Object();
        this.f = null;
        this.g = c.IDLE;
        this.h = new AtomicBoolean();
        this.i = new AtomicBoolean();
        this.m = d.NONE;
        this.q = new WeakReference(null);
        this.r = new WeakReference(null);
        this.s = new WeakReference(null);
        this.a = aVar;
        this.c = createAdListenerWrapper();
        this.d = new com.applovin.impl.mediation.b(lVar);
        this.b = new WeakReference(context);
        lVar.k().a(this);
        p.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    protected b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.c();
            }
        });
    }

    public boolean isLoading() {
        boolean z;
        synchronized (this.e) {
            z = this.g == c.LOADING;
        }
        return z;
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.e) {
            e3 e3Var = this.f;
            z = e3Var != null && e3Var.a0() && this.g == c.READY;
        }
        if (!z) {
            this.sdk.J().c(this.adUnitId);
        }
        return z;
    }

    public boolean isShowing() {
        boolean z;
        synchronized (this.e) {
            z = this.g == c.SHOWING;
        }
        return z;
    }

    public void loadAd() {
        loadAd(i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0108a
    public void onAdExpired(u1 u1Var) {
        if (p.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.h.set(true);
        a aVar = this.a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            f();
            this.c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.Z().loadAd(this.adUnitId, null, this.adFormat, i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        e3 e3Var = this.f;
        if (e3Var == null || !e3Var.T().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
        v2.b(this.adReviewListener, str2, this.f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        e3 e3Var;
        List b2 = this.sdk.u0().b();
        if (this.sdk.u0().d() && b2 != null && (e3Var = this.f) != null && !b2.contains(e3Var.c())) {
            final String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + b2;
            p.h(this.tag, str3);
            a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.this.b(str3);
                }
            });
        } else {
            if (activity == null) {
                activity = this.sdk.w0();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.a(str, str2, activity);
                    }
                });
            }
        }
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append(this.tag).append("{adUnitId='").append(this.adUnitId).append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.a) {
            obj = "this";
        }
        return append.append(obj).append(", revenueListener=").append(this.revenueListener).append(", requestListener").append(this.requestListener).append(", adReviewListener").append(this.adReviewListener).append(", isReady=").append(isReady()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(e3 e3Var) {
        if (this.sdk.f().a(e3Var, this)) {
            if (p.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + e3Var);
            }
            this.f = e3Var;
        } else {
            if (p.a()) {
                this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired(e3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(e3 e3Var) {
        if (((Boolean) this.sdk.a(z4.G2)).booleanValue()) {
            List b2 = e3Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(b2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) b2));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(h2.a((a3) e3Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(y3.a(e3Var, this.sdk)));
            HashMap hashMap = new HashMap(this.sdk.B().e());
            hashMap.put("mcode", e3Var.v0());
            hashMap.put("bcode", e3Var.C());
            JsonUtils.putJSONObject(jSONObject, "postback_body", new JSONObject(hashMap));
            this.sdk.r0().b(b5.R, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        e3 e3Var;
        if (this.h.compareAndSet(true, false)) {
            synchronized (this.e) {
                e3Var = this.f;
                this.f = null;
            }
            this.sdk.Z().destroyAd(e3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        final Long l = (Long) this.sdk.a(z4.H2);
        if (l.longValue() <= 0) {
            return;
        }
        this.j = i0.a(l.longValue(), true, this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.a(l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Activity activity = (Activity) this.q.get();
        if (activity == null) {
            activity = this.sdk.w0();
        }
        Activity activity2 = activity;
        if (this.l) {
            showAd(this.n, this.o, (ViewGroup) this.r.get(), (Lifecycle) this.s.get(), activity2);
        } else {
            showAd(this.n, this.o, activity2);
        }
    }

    public void loadAd(final i iVar) {
        if (p.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.g == c.DESTROYED) {
            boolean c2 = q7.c(this.sdk);
            this.sdk.E().a(f2.b1, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.a;
            final Activity activity = aVar != null ? aVar.getActivity() : null;
            final Context context = (Context) this.b.get();
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.this.a(activity, context, iVar);
                }
            });
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f + "), listener=" + this.adListener);
        }
        v2.f(this.adListener, (MaxAd) this.f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        e3 e3Var = this.f;
        a((MaxAd) e3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + e3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) e3Var, (MaxError) maxErrorImpl, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.e) {
            if (this.f != null) {
                if (p.a()) {
                    this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f + "...");
                }
                this.sdk.Z().destroyAd(this.f);
            }
        }
        this.sdk.k().b(this);
        this.d.a();
        i0 i0Var = this.j;
        if (i0Var != null) {
            i0Var.a();
            this.j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, i iVar) {
        Context context2;
        Context context3 = activity;
        if (activity == null) {
            if (context == null) {
                if (this.sdk.w0() != null) {
                    context3 = this.sdk.w0();
                } else {
                    context3 = l.p();
                }
            } else {
                context2 = context;
                this.sdk.Z().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.c);
            }
        }
        context2 = context3;
        this.sdk.Z().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.c);
    }

    private boolean g(e3 e3Var) {
        if (!e3Var.E0()) {
            return false;
        }
        if (!b()) {
            a(d.PRELOADED_ADS_QUEUE, e3Var);
            return false;
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.d();
            }
        });
        return true;
    }

    private boolean b() {
        if (this.sdk.T() != null) {
            return this.sdk.T().e(this.adUnitId);
        }
        return this.sdk.S().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.m = d.PRELOADED_ADS_QUEUE;
        loadAd();
    }

    protected class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0103a {
        protected b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.m == d.NONE) {
                p pVar = MaxFullscreenAdImpl.this.logger;
                if (p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                }
                v2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                return;
            }
            p pVar2 = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "Attempting ad failover from: " + MaxFullscreenAdImpl.this.m.b());
            }
            e3Var.j(MaxFullscreenAdImpl.this.p);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.p);
            CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.m.b(), hashMap);
            MaxFullscreenAdImpl.this.sdk.R().a(f2.A0, e3Var, hashMap);
            MaxFullscreenAdImpl.this.h();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final e3 e3Var = (e3) maxAd;
            MaxFullscreenAdImpl.this.e();
            d dVar = MaxFullscreenAdImpl.this.m;
            d dVar2 = d.NONE;
            final boolean z = dVar != dVar2;
            if (z) {
                p pVar = MaxFullscreenAdImpl.this.logger;
                if (p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed from: " + MaxFullscreenAdImpl.this.m.b());
                }
                HashMap<String, String> hashMap = CollectionUtils.hashMap("details", e3Var.x0());
                CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.m.b(), hashMap);
                MaxFullscreenAdImpl.this.sdk.R().a(f2.C0, e3Var, hashMap);
                MaxFullscreenAdImpl.this.m = dVar2;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(maxAd, z, e3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final e3 e3Var = (e3) maxAd;
            d dVar = MaxFullscreenAdImpl.this.m;
            d dVar2 = d.NONE;
            if (dVar != dVar2) {
                p pVar = MaxFullscreenAdImpl.this.logger;
                if (p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded from: " + MaxFullscreenAdImpl.this.m.b());
                }
                HashMap<String, String> hashMap = CollectionUtils.hashMap("details", e3Var.x0());
                CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.m.b(), hashMap);
                MaxFullscreenAdImpl.this.sdk.R().a(f2.B0, e3Var, hashMap);
                MaxFullscreenAdImpl.this.m = dVar2;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(e3Var);
            MaxFullscreenAdImpl.this.e(e3Var);
            MaxFullscreenAdImpl.this.g();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(t3.B8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.s0().b(new u6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.b.this.a(e3Var);
                    }
                }), f6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            p pVar2 = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m = d.NONE;
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.f();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            e3 e3Var;
            synchronized (MaxFullscreenAdImpl.this.e) {
                e3Var = MaxFullscreenAdImpl.this.f;
            }
            MaxFullscreenAdImpl.this.sdk.J().a(MaxFullscreenAdImpl.this.adUnitId);
            final e3 e3Var2 = (e3) maxAd;
            MaxFullscreenAdImpl.this.d(e3Var2);
            if (!MaxFullscreenAdImpl.this.h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.b.this.a(e3Var2, maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.h();
            }
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + e3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            v2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) e3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            v2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            v2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var) {
            if (e3Var.x().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.R().a(f2.u0, e3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z, e3 e3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z ? MaxFullscreenAdImpl.this.c(e3Var) : false) {
                return;
            }
            p pVar = MaxFullscreenAdImpl.this.logger;
            if (p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.l = false;
        this.q = new WeakReference(activity);
        this.sdk.Z().showFullscreenAd(this.f, activity, this.localExtraParameters, this.extraParameters, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final e3 e3Var) {
        this.m = d.FAILOVER_CACHE;
        e3Var.B().c().a(this.c);
        a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.a(e3Var);
            }
        });
    }

    private boolean f(e3 e3Var) {
        if (!e3Var.D0()) {
            return false;
        }
        v1 H = this.sdk.H();
        final e3 a2 = H.a(this.adUnitId);
        if (a2 == null) {
            a(d.FAILOVER_CACHE, e3Var);
            return false;
        }
        if (a2.H() < e3Var.J()) {
            if (p.a()) {
                this.logger.a(this.tag, "The failover ad's eCPM does not exceed floor value");
            }
            this.sdk.R().a(f2.H0, e3Var);
            return false;
        }
        if (p.a()) {
            this.logger.a(this.tag, "Loading ad from failover cache");
        }
        H.b(a2);
        if (a2.R().endsWith("load")) {
            this.c.onAdRevenuePaid(a2);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.b(a2);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (((Boolean) this.sdk.a(z4.G2)).booleanValue()) {
            this.sdk.r0().b(b5.R);
        }
        if (this.j != null) {
            this.sdk.r0().b(b5.S);
            this.j.a();
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        a(str, str2);
        this.l = true;
        this.q = new WeakReference(activity);
        this.r = new WeakReference(viewGroup);
        this.s = new WeakReference(lifecycle);
        this.sdk.Z().showFullscreenAd(this.f, viewGroup, lifecycle, activity, this.localExtraParameters, this.extraParameters, this.c);
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        e3 e3Var;
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(t3.w8)).booleanValue()) {
                p.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                v2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl, true);
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
                return;
            }
            List b2 = this.sdk.u0().b();
            if (this.sdk.u0().d() && b2 != null && (e3Var = this.f) != null && !b2.contains(e3Var.c())) {
                final String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + b2;
                p.h(this.tag, str3);
                a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.c(str3);
                    }
                });
                return;
            } else {
                if (activity == null) {
                    activity = this.sdk.w0();
                }
                final Activity activity2 = activity;
                if (a(activity2, str)) {
                    a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MaxFullscreenAdImpl.this.a(str, str2, activity2, viewGroup, lifecycle);
                        }
                    });
                    return;
                }
                return;
            }
        }
        p.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl2, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        e3 e3Var = this.f;
        a((MaxAd) e3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + e3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) e3Var, (MaxError) maxErrorImpl, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(e3 e3Var) {
        if (f(e3Var)) {
            return true;
        }
        return g(e3Var);
    }

    private boolean a(Activity activity, final String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.g == c.DESTROYED) {
            boolean c2 = q7.c(this.sdk);
            this.sdk.E().a(f2.b1, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            p.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            z3 z3Var = new z3(this.adUnitId, this.adFormat, str);
            if (p.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + z3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, (MaxAd) z3Var, (MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
            return false;
        }
        Long l = (Long) this.sdk.a(t3.g8);
        Long l2 = (Long) this.sdk.a(t3.Z7);
        if (l.longValue() > 0 && (this.f.getTimeToLiveMillis() < l2.longValue() || this.h.get())) {
            this.i.set(true);
            this.sdk.s0().a(new u6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.this.a(str);
                }
            }), f6.b.TIMEOUT, l.longValue());
            return false;
        }
        if (q7.a(l.p()) != 0 && this.sdk.p0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!q7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(t3.v8)).booleanValue()) {
                    p.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (p.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    v2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl2, true);
                    this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.J().e() && !this.sdk.J().d()) {
            return true;
        }
        p.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl3, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.i.compareAndSet(true, false)) {
            p.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.J().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            z3 z3Var = new z3(this.adUnitId, this.adFormat, str);
            if (p.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + z3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, (MaxAd) z3Var, (MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
        }
    }

    private void a(String str, String str2) {
        this.d.e(this.f);
        this.f.g(str);
        this.f.f(str2);
        this.n = str;
        this.o = str2;
        this.p = this.f.getNetworkName();
        this.sdk.z().d(this.f);
        if (p.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f + "...");
        }
        a((a3) this.f);
    }

    private void a() {
        e3 e3Var;
        synchronized (this.e) {
            e3Var = this.f;
            this.f = null;
        }
        this.sdk.Z().destroyAd(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.k += l.longValue();
        this.sdk.r0().b(b5.S, Long.valueOf(this.k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z;
        c cVar2 = this.g;
        synchronized (this.e) {
            c cVar3 = c.IDLE;
            if (cVar2 == cVar3) {
                if (cVar != c.LOADING && cVar != c.DESTROYED) {
                    if (cVar == c.SHOWING) {
                        p.h(this.tag, "No ad is loading or loaded");
                    } else if (p.a()) {
                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                    }
                    z = false;
                }
                z = true;
            } else {
                c cVar4 = c.LOADING;
                if (cVar2 == cVar4) {
                    if (cVar != cVar3) {
                        if (cVar == cVar4) {
                            p.h(this.tag, "An ad is already loading");
                        } else if (cVar != c.READY) {
                            if (cVar == c.SHOWING) {
                                p.h(this.tag, "An ad is not ready to be shown yet");
                            } else if (cVar != c.DESTROYED) {
                                if (p.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    c cVar5 = c.READY;
                    if (cVar2 == cVar5) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                p.h(this.tag, "An ad is already loaded");
                            } else if (cVar == cVar5) {
                                if (p.a()) {
                                    this.logger.b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                if (p.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        c cVar6 = c.SHOWING;
                        if (cVar2 == cVar6) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    p.h(this.tag, "Can not load another ad while the ad is showing");
                                } else if (cVar == cVar5) {
                                    if (p.a()) {
                                        this.logger.b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (cVar == cVar6) {
                                    p.h(this.tag, "The ad is already showing, not showing another one");
                                } else if (cVar != c.DESTROYED) {
                                    if (p.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z = true;
                        } else if (cVar2 == c.DESTROYED) {
                            p.h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (p.a()) {
                            this.logger.b(this.tag, "Unknown state: " + this.g);
                        }
                        z = false;
                    }
                }
            }
            if (z) {
                if (p.a()) {
                    this.logger.a(this.tag, "Transitioning from " + this.g + " to " + cVar + "...");
                }
                this.g = cVar;
            } else if (p.a()) {
                this.logger.k(this.tag, "Not allowed to transition from " + this.g + " to " + cVar);
            }
        }
        if (z) {
            runnable.run();
            return;
        }
        HashMap<String, String> hashMap = CollectionUtils.hashMap("ad_unit_id", this.adUnitId);
        CollectionUtils.putStringIfValid("ad_format", this.adFormat.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("details", "current_state=" + this.g + ",target_state=" + cVar, hashMap);
        this.sdk.E().a(f2.j1, "stateTransitionFailed", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((e3) maxAd);
        this.d.a();
        a();
        this.sdk.c0().a((a3) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var) {
        this.c.onAdLoaded(e3Var);
    }

    private void a(d dVar, e3 e3Var) {
        if (p.a()) {
            this.logger.a(this.tag, "Failover ad missing from: " + dVar.b());
        }
        this.sdk.R().a(f2.z0, e3Var, CollectionUtils.hashMap("source", dVar.b()));
    }
}
