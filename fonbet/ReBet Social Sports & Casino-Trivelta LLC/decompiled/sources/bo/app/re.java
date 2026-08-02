package bo.app;

import bo.app.re;
import com.braze.support.BrazeLogger;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class re {

    /* renamed from: A, reason: collision with root package name */
    public String f25992A;

    /* renamed from: B, reason: collision with root package name */
    public Long f25993B;

    /* renamed from: C, reason: collision with root package name */
    public long f25994C;

    /* renamed from: D, reason: collision with root package name */
    public long f25995D;

    /* renamed from: E, reason: collision with root package name */
    public long f25996E;

    /* renamed from: F, reason: collision with root package name */
    public Map f25997F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f25998G;

    /* renamed from: H, reason: collision with root package name */
    public int f25999H;

    /* renamed from: I, reason: collision with root package name */
    public int f26000I;

    /* renamed from: a, reason: collision with root package name */
    public long f26001a;

    /* renamed from: b, reason: collision with root package name */
    public Set f26002b;

    /* renamed from: c, reason: collision with root package name */
    public Set f26003c;

    /* renamed from: d, reason: collision with root package name */
    public Set f26004d;

    /* renamed from: e, reason: collision with root package name */
    public int f26005e;

    /* renamed from: f, reason: collision with root package name */
    public int f26006f;

    /* renamed from: g, reason: collision with root package name */
    public int f26007g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26008h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26009i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26010j;

    /* renamed from: k, reason: collision with root package name */
    public long f26011k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26012l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26013m;

    /* renamed from: n, reason: collision with root package name */
    public int f26014n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26015o;

    /* renamed from: p, reason: collision with root package name */
    public long f26016p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26017q;

    /* renamed from: r, reason: collision with root package name */
    public int f26018r;

    /* renamed from: s, reason: collision with root package name */
    public int f26019s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f26020t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26021u;

    /* renamed from: v, reason: collision with root package name */
    public long f26022v;

    /* renamed from: w, reason: collision with root package name */
    public int f26023w;

    /* renamed from: x, reason: collision with root package name */
    public int f26024x;

    /* renamed from: y, reason: collision with root package name */
    public int f26025y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26026z;

    public re() {
        int i10 = ue.f26122f;
        int i11 = ue.f26123g;
        this.f26001a = 0L;
        this.f26002b = null;
        this.f26003c = null;
        this.f26004d = null;
        this.f26005e = -1;
        this.f26006f = -1;
        this.f26007g = -1;
        this.f26008h = false;
        this.f26009i = false;
        this.f26010j = false;
        this.f26011k = -1L;
        this.f26012l = false;
        this.f26013m = false;
        this.f26014n = -1;
        this.f26015o = false;
        this.f26016p = 86400L;
        this.f26017q = true;
        this.f26018r = 30;
        this.f26019s = 30;
        this.f26020t = false;
        this.f26021u = false;
        this.f26022v = -1L;
        this.f26023w = i10;
        this.f26024x = i11;
        this.f26025y = 3;
        this.f26026z = false;
        this.f25992A = null;
        this.f25993B = null;
        this.f25994C = 0L;
        this.f25995D = 0L;
        this.f25996E = 0L;
        this.f25997F = null;
        this.f25998G = false;
        this.f25999H = 0;
        this.f26000I = 200;
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public static final String k(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public final void a(JSONObject jSONObject) {
        int i10;
        JSONObject optJSONObject = jSONObject.optJSONObject("banners");
        if (optJSONObject != null) {
            try {
                this.f25998G = optJSONObject.getBoolean(ViewProps.ENABLED);
                i10 = optJSONObject.getInt("max_placements");
                this.f25999H = i10;
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.ya
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.a();
                    }
                }, 4, (Object) null);
            }
            if (this.f25998G && i10 <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.xa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.a(re.this);
                    }
                }, 7, (Object) null);
                this.f25998G = false;
                this.f25999H = 0;
            }
            int optInt = optJSONObject.optInt("dismissals_cache_size", 200);
            this.f26000I = optInt > 0 ? optInt : 200;
        }
    }

    public final void b(JSONObject jSONObject) {
        re reVar;
        boolean z10;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z10 = optJSONObject.getBoolean(ViewProps.ENABLED);
                reVar = this;
            } catch (JSONException e10) {
                reVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) reVar, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.va
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.b();
                    }
                }, 4, (Object) null);
                z10 = false;
            }
            reVar.f26010j = z10;
        }
    }

    public final void c(JSONObject jSONObject) {
        re reVar;
        boolean z10;
        JSONObject optJSONObject = jSONObject.optJSONObject("dust");
        if (optJSONObject != null) {
            try {
                z10 = optJSONObject.getBoolean(ViewProps.ENABLED);
                reVar = this;
            } catch (JSONException e10) {
                reVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) reVar, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Aa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.c();
                    }
                }, 4, (Object) null);
                z10 = false;
            }
            reVar.f26020t = z10;
            reVar.f26021u = optJSONObject.optBoolean("should_block_cc_refresh", false);
        }
    }

    public final void d(JSONObject jSONObject) {
        re reVar;
        boolean z10;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z10 = optJSONObject.getBoolean(ViewProps.ENABLED);
                reVar = this;
            } catch (JSONException e10) {
                reVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) reVar, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.ta
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.d();
                    }
                }, 4, (Object) null);
                z10 = false;
            }
            reVar.f26012l = z10;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.f26013m = optJSONObject.optBoolean(ViewProps.ENABLED);
                this.f26014n = optJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Ba
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.e();
                    }
                }, 4, (Object) null);
                this.f26013m = false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return this.f26001a == reVar.f26001a && Intrinsics.areEqual(this.f26002b, reVar.f26002b) && Intrinsics.areEqual(this.f26003c, reVar.f26003c) && Intrinsics.areEqual(this.f26004d, reVar.f26004d) && this.f26005e == reVar.f26005e && this.f26006f == reVar.f26006f && this.f26007g == reVar.f26007g && this.f26008h == reVar.f26008h && this.f26009i == reVar.f26009i && this.f26010j == reVar.f26010j && this.f26011k == reVar.f26011k && this.f26012l == reVar.f26012l && this.f26013m == reVar.f26013m && this.f26014n == reVar.f26014n && this.f26015o == reVar.f26015o && this.f26016p == reVar.f26016p && this.f26017q == reVar.f26017q && this.f26018r == reVar.f26018r && this.f26019s == reVar.f26019s && this.f26020t == reVar.f26020t && this.f26021u == reVar.f26021u && this.f26022v == reVar.f26022v && this.f26023w == reVar.f26023w && this.f26024x == reVar.f26024x && this.f26025y == reVar.f26025y && this.f26026z == reVar.f26026z && Intrinsics.areEqual(this.f25992A, reVar.f25992A) && Intrinsics.areEqual(this.f25993B, reVar.f25993B) && this.f25994C == reVar.f25994C && this.f25995D == reVar.f25995D && this.f25996E == reVar.f25996E && Intrinsics.areEqual(this.f25997F, reVar.f25997F) && this.f25998G == reVar.f25998G && this.f25999H == reVar.f25999H && this.f26000I == reVar.f26000I;
    }

    public final void f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.f26005e = optJSONObject.getInt("min_time_since_last_request");
                this.f26006f = optJSONObject.getInt("min_time_since_last_report");
                this.f26009i = optJSONObject.getBoolean(ViewProps.ENABLED);
                this.f26008h = true;
                this.f26007g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.za
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.f();
                    }
                }, 4, (Object) null);
                this.f26005e = -1;
                this.f26006f = -1;
                this.f26007g = -1;
                this.f26009i = false;
                this.f26008h = false;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (optJSONObject != null) {
                if (!optJSONObject.getBoolean(ViewProps.ENABLED)) {
                    this.f26017q = false;
                    return;
                }
                int i10 = optJSONObject.getInt("refill_rate");
                int i11 = optJSONObject.getInt("capacity");
                if (i11 < 10) {
                    this.f26017q = false;
                } else {
                    if (i10 <= 0) {
                        return;
                    }
                    this.f26017q = true;
                    this.f26019s = i11;
                    this.f26018r = i10;
                    g(optJSONObject);
                }
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.ua
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return re.g();
                }
            }, 4, (Object) null);
            this.f26017q = false;
            this.f25997F = null;
        }
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f26001a) * 31;
        Set set = this.f26002b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f26003c;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f26004d;
        int hashCode4 = (Boolean.hashCode(this.f26026z) + ((Integer.hashCode(this.f26025y) + ((Integer.hashCode(this.f26024x) + ((Integer.hashCode(this.f26023w) + ((Long.hashCode(this.f26022v) + ((Boolean.hashCode(this.f26021u) + ((Boolean.hashCode(this.f26020t) + ((Integer.hashCode(this.f26019s) + ((Integer.hashCode(this.f26018r) + ((Boolean.hashCode(this.f26017q) + ((Long.hashCode(this.f26016p) + ((Boolean.hashCode(this.f26015o) + ((Integer.hashCode(this.f26014n) + ((Boolean.hashCode(this.f26013m) + ((Boolean.hashCode(this.f26012l) + ((Long.hashCode(this.f26011k) + ((Boolean.hashCode(this.f26010j) + ((Boolean.hashCode(this.f26009i) + ((Boolean.hashCode(this.f26008h) + ((Integer.hashCode(this.f26007g) + ((Integer.hashCode(this.f26006f) + ((Integer.hashCode(this.f26005e) + ((hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f25992A;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f25993B;
        int hashCode6 = (Long.hashCode(this.f25996E) + ((Long.hashCode(this.f25995D) + ((Long.hashCode(this.f25994C) + ((hashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.f25997F;
        return Integer.hashCode(this.f26000I) + ((Integer.hashCode(this.f25999H) + ((Boolean.hashCode(this.f25998G) + ((hashCode6 + (map != null ? map.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("push_max");
        if (optJSONObject != null) {
            try {
                this.f26015o = optJSONObject.optBoolean(ViewProps.ENABLED);
                this.f26016p = optJSONObject.optLong("redeliver_buffer", 86400L);
                this.f26022v = optJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.wa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return re.h();
                    }
                }, 4, (Object) null);
                this.f26015o = false;
                this.f26016p = 0L;
                this.f26022v = -1L;
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (optJSONObject == null) {
            return;
        }
        try {
            td a10 = xd.f26273k.a(optJSONObject, false);
            if (a10.f26084a) {
                this.f26026z = true;
                this.f25992A = a10.f26086c;
                Long l10 = a10.f26085b;
                if (l10 != null) {
                    this.f25993B = Long.valueOf(l10.longValue());
                }
                this.f25994C = a10.f26087d;
                this.f25995D = a10.f26088e;
                this.f25996E = a10.f26089f;
            }
            String str = this.f25992A;
            if (str != null && !StringsKt.isBlank(str) && this.f25994C > 0 && this.f25995D > 0 && this.f25996E > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ca
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return re.k(optJSONObject);
                }
            }, 7, (Object) null);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Da
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return re.i();
                }
            }, 4, (Object) null);
        }
        this.f26026z = false;
        this.f25992A = null;
        this.f25994C = 0L;
        this.f25995D = 0L;
        this.f25996E = 0L;
    }

    public final String toString() {
        return "ServerConfig(configTime=" + this.f26001a + ", blocklistedEvents=" + this.f26002b + ", blocklistedAttributes=" + this.f26003c + ", blocklistedPurchases=" + this.f26004d + ", minTimeSinceLastRequest=" + this.f26005e + ", minTimeSinceLastReport=" + this.f26006f + ", maxNumToRegister=" + this.f26007g + ", geofencesEnabledSet=" + this.f26008h + ", geofencesEnabled=" + this.f26009i + ", isContentCardsFeatureEnabled=" + this.f26010j + ", messagingSessionTimeout=" + this.f26011k + ", ephemeralEventsEnabled=" + this.f26012l + ", featureFlagsEnabled=" + this.f26013m + ", featureFlagsRefreshRateLimit=" + this.f26014n + ", pushMaxEnabled=" + this.f26015o + ", pushMaxRedeliverBuffer=" + this.f26016p + ", globalRequestRateLimitEnabled=" + this.f26017q + ", globalRequestRateLimitBucketRefillRate=" + this.f26018r + ", globalRequestRateLimitBucketCapacity=" + this.f26019s + ", isDustFeatureEnabled=" + this.f26020t + ", dustShouldBlockCcRefresh=" + this.f26021u + ", pushMaxRedeliverDedupeBuffer=" + this.f26022v + ", defaultBackoffMinSleepMs=" + this.f26023w + ", defaultBackoffMaxSleepMs=" + this.f26024x + ", defaultBackoffScaleFactor=" + this.f26025y + ", sdkDebuggerEnabled=" + this.f26026z + ", sdkDebuggerAuthCode=" + this.f25992A + ", sdkDebuggerExpirationTime=" + this.f25993B + ", sdkDebuggerFlushIntervalBytes=" + this.f25994C + ", sdkDebuggerFlushIntervalSeconds=" + this.f25995D + ", sdkDebuggerMaxPayloadBytes=" + this.f25996E + ", globalRequestRateLimitOverrides=" + this.f25997F + ", bannersEnabled=" + this.f25998G + ", maxBannerPlacements=" + this.f25999H + ", dismissalsCacheSize=" + this.f26000I + ")";
    }

    public final void g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (optJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String destinationSuffix = keys.next();
                b9 b9Var = c9.f25332b;
                Intrinsics.checkNotNull(destinationSuffix);
                b9Var.getClass();
                Intrinsics.checkNotNullParameter(destinationSuffix, "destinationSuffix");
                c9 c9Var = (c9) c9.f25333c.get(destinationSuffix);
                if (c9Var != null) {
                    JSONObject jSONObject2 = optJSONObject.getJSONObject(destinationSuffix);
                    int i10 = jSONObject2.getInt("capacity");
                    int i11 = jSONObject2.getInt("refill_rate");
                    if (i10 > 0 && i11 > 0) {
                        linkedHashMap.put(c9Var, new oe(i10, i11));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.f25997F = linkedHashMap;
        }
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String a(re reVar) {
        return "Banners enabled but maxBannerPlacement is " + reVar.f25999H + ". Not enabling banners.";
    }

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator it;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                it = CollectionsKt.emptyList().iterator();
            } else {
                it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new pe(optJSONArray)), new qe(optJSONArray)).iterator();
            }
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    public static final String f() {
        return "Error getting required geofence fields. Using defaults.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public re(JSONObject configJson) {
        this();
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        this.f26001a = configJson.optLong("time", 0L);
        this.f26011k = configJson.optLong("messaging_session_timeout", -1L);
        this.f26002b = a(configJson, "events_blacklist");
        this.f26003c = a(configJson, "attributes_blacklist");
        this.f26004d = a(configJson, "purchases_blacklist");
        b(configJson);
        f(configJson);
        d(configJson);
        e(configJson);
        i(configJson);
        h(configJson);
        c(configJson);
        JSONObject optJSONObject = configJson.optJSONObject("request_backoff");
        if (optJSONObject != null) {
            this.f26023w = optJSONObject.optInt("min_sleep_duration_ms", this.f26023w);
            this.f26024x = optJSONObject.optInt("max_sleep_duration_ms", this.f26024x);
            this.f26025y = optJSONObject.optInt("scale_factor", this.f26025y);
        }
        j(configJson);
        a(configJson);
    }
}
