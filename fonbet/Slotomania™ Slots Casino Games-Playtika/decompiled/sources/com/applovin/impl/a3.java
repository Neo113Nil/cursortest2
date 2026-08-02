package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class a3 extends m3 implements MaxAd {
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final c3 n;
    protected com.applovin.impl.mediation.h o;
    private final String p;
    private MaxAdWaterfallInfo q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private String y;
    private String z;

    protected a3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.l lVar) {
        super(c3Var.e(), jSONObject, jSONObject2, lVar);
        this.k = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.m = new AtomicBoolean();
        this.n = c3Var;
        this.o = hVar;
        this.p = hVar != null ? hVar.b() : null;
    }

    private long M() {
        return a("load_started_time_ms", 0L);
    }

    public static a3 a(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new d3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new f3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new e3(c3Var, jSONObject, jSONObject2, lVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(j5 j5Var) {
        JSONObject a;
        if (j5Var.a("credentials")) {
            a = j5Var.a("credentials", new JSONObject());
        } else {
            a = j5Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", U());
        }
        return JsonUtils.toBundle(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(j5 j5Var) {
        return Double.valueOf(JsonUtils.getDouble(j5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(j5 j5Var) {
        return JsonUtils.getString(j5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public String A() {
        return this.p;
    }

    public com.applovin.impl.mediation.h B() {
        return this.o;
    }

    public String C() {
        return a("bcode", "");
    }

    public long D() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String E() {
        return a("bid_response", (String) null);
    }

    public Bundle F() {
        JSONObject a;
        j5 j5Var = this.h;
        if (j5Var != null) {
            return (Bundle) j5Var.a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Bundle c;
                    c = a3.this.c((j5) obj);
                    return c;
                }
            });
        }
        if (c("credentials")) {
            a = a("credentials", new JSONObject());
        } else {
            a = a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", U());
        }
        return JsonUtils.toBundle(a);
    }

    public long G() {
        return this.x;
    }

    public double H() {
        return a("ecpm", -1.0f);
    }

    public long I() {
        if (M() > 0) {
            return L() - M();
        }
        return -1L;
    }

    public double J() {
        return a("floor", -1.0d);
    }

    public long K() {
        return this.v;
    }

    public long L() {
        return a("load_completed_time_ms", 0L);
    }

    public String N() {
        return this.y;
    }

    public int O() {
        return a("mspc", ((Integer) this.a.a(t3.s8)).intValue());
    }

    public JSONObject P() {
        j5 j5Var = this.h;
        return j5Var != null ? (JSONObject) j5Var.a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda3
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                JSONObject d;
                d = a3.d((j5) obj);
                return d;
            }
        }) : a("publisher_extra_info", new JSONObject());
    }

    public c3 Q() {
        return this.n;
    }

    public String R() {
        return JsonUtils.getString(S(), "revenue_event", "");
    }

    public JSONObject S() {
        j5 j5Var = this.h;
        return j5Var != null ? (JSONObject) j5Var.a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                JSONObject f;
                f = a3.f((j5) obj);
                return f;
            }
        }) : a("revenue_parameters", new JSONObject());
    }

    public String T() {
        return b("event_id", "");
    }

    public String U() {
        return a(BrandSafetyEvent.k, (String) null);
    }

    public long V() {
        return this.w;
    }

    public List W() {
        return b("mwf_info_urls");
    }

    public String X() {
        return b("waterfall_name", "");
    }

    public String Y() {
        return b("waterfall_test_name", "");
    }

    public boolean Z() {
        return StringUtils.isValidString(E());
    }

    public abstract a3 a(com.applovin.impl.mediation.h hVar);

    public boolean a0() {
        com.applovin.impl.mediation.h hVar = this.o;
        return hVar != null && hVar.k() && this.o.j();
    }

    public boolean b0() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean c0() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void d0() {
        this.x = SystemClock.elapsedRealtime() - this.t;
    }

    public void e0() {
        this.s = SystemClock.elapsedRealtime();
        this.u = this.a.o0().getTotalBackgroundDurationMillis();
    }

    public void f0() {
        long totalBackgroundDurationMillis = this.a.o0().getTotalBackgroundDurationMillis() - this.u;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.s;
        this.w = elapsedRealtime;
        this.v = elapsedRealtime - totalBackgroundDurationMillis;
    }

    public void g0() {
        this.t = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.z;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.o;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a(BrandSafetyEvent.ad, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(U());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.a.a(t3.x8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            j5 j5Var = this.h;
            return j5Var != null ? ((Double) j5Var.a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Double e;
                    e = a3.e((j5) obj);
                    return e;
                }
            })).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.a.Q();
        if (!com.applovin.impl.sdk.p.a()) {
            return 0.0d;
        }
        this.a.Q().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        j5 j5Var = this.h;
        return j5Var != null ? (String) j5Var.a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                String g;
                g = a3.g((j5) obj);
                return g;
            }
        }) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int a = a("ad_width", -3);
        int a2 = a("ad_height", -3);
        return (a == -3 || a2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(a, a2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.q;
    }

    public void h(String str) {
        this.z = str;
    }

    public void h0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void i(String str) {
        this.y = str;
    }

    public void i0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean j0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    public Boolean k0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public Boolean l0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    public void t() {
        this.o = null;
        this.q = null;
    }

    @Override // com.applovin.impl.m3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + U() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public AtomicBoolean u() {
        return this.k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.m;
    }

    public AtomicBoolean x() {
        return this.l;
    }

    public JSONObject y() {
        j5 j5Var = this.h;
        return j5Var != null ? (JSONObject) j5Var.a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                JSONObject b;
                b = a3.b((j5) obj);
                return b;
            }
        }) : a("ad_values", new JSONObject());
    }

    public View z() {
        com.applovin.impl.mediation.h hVar;
        if (!a0() || (hVar = this.o) == null) {
            return null;
        }
        return hVar.d();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject y = y();
        if (y.has(str)) {
            return JsonUtils.getString(y, str, str2);
        }
        Bundle l = l();
        if (l.containsKey(str)) {
            return l.getString(str);
        }
        JSONObject P = P();
        return P.has(str) ? JsonUtils.getString(P, str, str2) : a(str, str2);
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.q = maxAdWaterfallInfo;
    }

    public void a(long j) {
        this.r = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject P = P();
        JsonUtils.putAll(P, jSONObject);
        a("publisher_extra_info", (Object) P);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
