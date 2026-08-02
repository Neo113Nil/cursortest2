package com.braze.models.response;

import com.braze.managers.d1;
import com.braze.managers.h1;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.microsoft.codepush.react.CodePushConstants;
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
import org.chromium.base.TimeUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class m {
    public String A;
    public Long B;
    public long C;
    public long D;
    public long E;
    public Map F;
    public boolean G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public long f659a;
    public Set b;
    public Set c;
    public Set d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public long p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public long v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public m() {
        int i = b3.f;
        int i2 = b3.g;
        this.f659a = 0L;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = -1L;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = false;
        this.p = TimeUtils.SECONDS_PER_DAY;
        this.q = true;
        this.r = 30;
        this.s = 30;
        this.t = false;
        this.u = false;
        this.v = -1L;
        this.w = i;
        this.x = i2;
        this.y = 3;
        this.z = false;
        this.A = null;
        this.B = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = null;
        this.G = false;
        this.H = 0;
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public static final String k(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public final void a(JSONObject jSONObject) {
        int i;
        JSONObject optJSONObject = jSONObject.optJSONObject("banners");
        if (optJSONObject != null) {
            try {
                this.G = optJSONObject.getBoolean("enabled");
                i = optJSONObject.getInt("max_placements");
                this.H = i;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.a();
                    }
                }, 4, (Object) null);
            }
            if (!this.G || i > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.a(m.this);
                }
            }, 7, (Object) null);
            this.G = false;
            this.H = 0;
        }
    }

    public final void b(JSONObject jSONObject) {
        m mVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.b();
                    }
                }, 4, (Object) null);
                z = false;
            }
            mVar.j = z;
        }
    }

    public final void c(JSONObject jSONObject) {
        m mVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("dust");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.c();
                    }
                }, 4, (Object) null);
                z = false;
            }
            mVar.t = z;
            mVar.u = optJSONObject.optBoolean("should_block_cc_refresh", false);
        }
    }

    public final void d(JSONObject jSONObject) {
        m mVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.d();
                    }
                }, 4, (Object) null);
                z = false;
            }
            mVar.l = z;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.m = optJSONObject.optBoolean("enabled");
                this.n = optJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.e();
                    }
                }, 4, (Object) null);
                this.m = false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f659a == mVar.f659a && Intrinsics.areEqual(this.b, mVar.b) && Intrinsics.areEqual(this.c, mVar.c) && Intrinsics.areEqual(this.d, mVar.d) && this.e == mVar.e && this.f == mVar.f && this.g == mVar.g && this.h == mVar.h && this.i == mVar.i && this.j == mVar.j && this.k == mVar.k && this.l == mVar.l && this.m == mVar.m && this.n == mVar.n && this.o == mVar.o && this.p == mVar.p && this.q == mVar.q && this.r == mVar.r && this.s == mVar.s && this.t == mVar.t && this.u == mVar.u && this.v == mVar.v && this.w == mVar.w && this.x == mVar.x && this.y == mVar.y && this.z == mVar.z && Intrinsics.areEqual(this.A, mVar.A) && Intrinsics.areEqual(this.B, mVar.B) && this.C == mVar.C && this.D == mVar.D && this.E == mVar.E && Intrinsics.areEqual(this.F, mVar.F) && this.G == mVar.G && this.H == mVar.H;
    }

    public final void f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.e = optJSONObject.getInt("min_time_since_last_request");
                this.f = optJSONObject.getInt("min_time_since_last_report");
                this.i = optJSONObject.getBoolean("enabled");
                this.h = true;
                this.g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.f();
                    }
                }, 4, (Object) null);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                this.i = false;
                this.h = false;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (optJSONObject != null) {
                if (!optJSONObject.getBoolean("enabled")) {
                    this.q = false;
                    return;
                }
                int i = optJSONObject.getInt("refill_rate");
                int i2 = optJSONObject.getInt("capacity");
                if (i2 < 10) {
                    this.q = false;
                } else {
                    if (i <= 0) {
                        return;
                    }
                    this.q = true;
                    this.s = i2;
                    this.r = i;
                    g(optJSONObject);
                }
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.g();
                }
            }, 4, (Object) null);
            this.q = false;
            this.F = null;
        }
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f659a) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.c;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.d;
        int hashCode4 = (Boolean.hashCode(this.z) + ((Integer.hashCode(this.y) + ((Integer.hashCode(this.x) + ((Integer.hashCode(this.w) + ((Long.hashCode(this.v) + ((Boolean.hashCode(this.u) + ((Boolean.hashCode(this.t) + ((Integer.hashCode(this.s) + ((Integer.hashCode(this.r) + ((Boolean.hashCode(this.q) + ((Long.hashCode(this.p) + ((Boolean.hashCode(this.o) + ((Integer.hashCode(this.n) + ((Boolean.hashCode(this.m) + ((Boolean.hashCode(this.l) + ((Long.hashCode(this.k) + ((Boolean.hashCode(this.j) + ((Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Integer.hashCode(this.g) + ((Integer.hashCode(this.f) + ((Integer.hashCode(this.e) + ((hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.A;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.B;
        int hashCode6 = (Long.hashCode(this.E) + ((Long.hashCode(this.D) + ((Long.hashCode(this.C) + ((hashCode5 + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.F;
        return Integer.hashCode(this.H) + ((Boolean.hashCode(this.G) + ((hashCode6 + (map != null ? map.hashCode() : 0)) * 31)) * 31);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("push_max");
        if (optJSONObject != null) {
            try {
                this.o = optJSONObject.optBoolean("enabled");
                this.p = optJSONObject.optLong("redeliver_buffer", TimeUtils.SECONDS_PER_DAY);
                this.v = optJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.h();
                    }
                }, 4, (Object) null);
                this.o = false;
                this.p = 0L;
                this.v = -1L;
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (optJSONObject == null) {
            return;
        }
        try {
            d1 a2 = h1.k.a(optJSONObject, false);
            if (a2.f580a) {
                this.z = true;
                this.A = a2.c;
                Long l = a2.b;
                if (l != null) {
                    this.B = Long.valueOf(l.longValue());
                }
                this.C = a2.d;
                this.D = a2.e;
                this.E = a2.f;
            }
            String str = this.A;
            if (str != null && !StringsKt.isBlank(str) && this.C > 0 && this.D > 0 && this.E > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.k(optJSONObject);
                }
            }, 7, (Object) null);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.m$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.i();
                }
            }, 4, (Object) null);
        }
        this.z = false;
        this.A = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
    }

    public final String toString() {
        return "ServerConfig(configTime=" + this.f659a + ", blocklistedEvents=" + this.b + ", blocklistedAttributes=" + this.c + ", blocklistedPurchases=" + this.d + ", minTimeSinceLastRequest=" + this.e + ", minTimeSinceLastReport=" + this.f + ", maxNumToRegister=" + this.g + ", geofencesEnabledSet=" + this.h + ", geofencesEnabled=" + this.i + ", isContentCardsFeatureEnabled=" + this.j + ", messagingSessionTimeout=" + this.k + ", ephemeralEventsEnabled=" + this.l + ", featureFlagsEnabled=" + this.m + ", featureFlagsRefreshRateLimit=" + this.n + ", pushMaxEnabled=" + this.o + ", pushMaxRedeliverBuffer=" + this.p + ", globalRequestRateLimitEnabled=" + this.q + ", globalRequestRateLimitBucketRefillRate=" + this.r + ", globalRequestRateLimitBucketCapacity=" + this.s + ", isDustFeatureEnabled=" + this.t + ", dustShouldBlockCcRefresh=" + this.u + ", pushMaxRedeliverDedupeBuffer=" + this.v + ", defaultBackoffMinSleepMs=" + this.w + ", defaultBackoffMaxSleepMs=" + this.x + ", defaultBackoffScaleFactor=" + this.y + ", sdkDebuggerEnabled=" + this.z + ", sdkDebuggerAuthCode=" + this.A + ", sdkDebuggerExpirationTime=" + this.B + ", sdkDebuggerFlushIntervalBytes=" + this.C + ", sdkDebuggerFlushIntervalSeconds=" + this.D + ", sdkDebuggerMaxPayloadBytes=" + this.E + ", globalRequestRateLimitOverrides=" + this.F + ", bannersEnabled=" + this.G + ", maxBannerPlacements=" + this.H + ")";
    }

    public final void g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (optJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String destinationSuffix = keys.next();
                com.braze.requests.m mVar = com.braze.requests.n.b;
                Intrinsics.checkNotNull(destinationSuffix);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(destinationSuffix, "destinationSuffix");
                com.braze.requests.n nVar = (com.braze.requests.n) com.braze.requests.n.c.get(destinationSuffix);
                if (nVar != null) {
                    JSONObject jSONObject2 = optJSONObject.getJSONObject(destinationSuffix);
                    int i = jSONObject2.getInt("capacity");
                    int i2 = jSONObject2.getInt("refill_rate");
                    if (i > 0 && i2 > 0) {
                        linkedHashMap.put(nVar, new j(i, i2));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.F = linkedHashMap;
        }
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String a(m mVar) {
        return "Banners enabled but maxBannerPlacement is " + mVar.H + ". Not enabling banners.";
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator it;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                it = CollectionsKt.emptyList().iterator();
            } else {
                it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new k(optJSONArray)), new l(optJSONArray)).iterator();
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

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(JSONObject configJson) {
        this();
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        this.f659a = configJson.optLong(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, 0L);
        this.k = configJson.optLong("messaging_session_timeout", -1L);
        this.b = a(configJson, "events_blacklist");
        this.c = a(configJson, "attributes_blacklist");
        this.d = a(configJson, "purchases_blacklist");
        b(configJson);
        f(configJson);
        d(configJson);
        e(configJson);
        i(configJson);
        h(configJson);
        c(configJson);
        JSONObject optJSONObject = configJson.optJSONObject("request_backoff");
        if (optJSONObject != null) {
            this.w = optJSONObject.optInt("min_sleep_duration_ms", this.w);
            this.x = optJSONObject.optInt("max_sleep_duration_ms", this.x);
            this.y = optJSONObject.optInt("scale_factor", this.y);
        }
        j(configJson);
        a(configJson);
    }
}
