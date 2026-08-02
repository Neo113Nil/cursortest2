package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.f6;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v;
import com.applovin.impl.w4;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.security.ProviderInstaller;
import com.ironsource.X3;
import com.safedk.android.utils.SdksMapping;
import com.vungle.ads.internal.model.Cookie;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class v5 extends k5 {
    private static final AtomicBoolean j = new AtomicBoolean();
    private final int g;
    private final Object h;
    private b i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    private class c extends k5 {
        public c(com.applovin.impl.sdk.l lVar) {
            super("TaskTimeoutFetchBasicSettings", lVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v5.this.i != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Timing out fetch basic settings...");
                }
                v5.this.a(new JSONObject());
            }
        }
    }

    public v5(int i, com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskFetchBasicSettings", lVar, true);
        this.h = new Object();
        this.g = i;
        this.i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return s0.a((String) this.a.a(z4.k0), "5.0/i", b());
    }

    private String g() {
        return s0.a((String) this.a.a(z4.j0), "5.0/i", b());
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.l lVar = this.a;
            z4 z4Var = z4.E5;
            if (((Boolean) lVar.a(z4Var)).booleanValue() || ((Boolean) this.a.a(z4Var)).booleanValue()) {
                jSONObject.put(com.safedk.android.analytics.brandsafety.m.x, UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.g);
            jSONObject.put("server_installed_at", this.a.a(z4.o));
            if (this.a.E0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.a.B0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", q7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", q7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.a.a(z4.R3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.a.X());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.a.D());
            jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, y3.b(this.a));
            Map G = this.a.B().G();
            jSONObject.put("package_name", G.get("package_name"));
            jSONObject.put(App.JsonKeys.APP_VERSION, G.get(App.JsonKeys.APP_VERSION));
            jSONObject.put("debug", G.get("debug"));
            jSONObject.put("tg", G.get("tg"));
            jSONObject.put("target_sdk", G.get("target_sdk"));
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, G.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID));
            List list = (List) G.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) G.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.a.L() != null ? this.a.L().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", G.get("IABTCF_TCString"));
            jSONObject.put(Cookie.IABTCF_GDPR_APPLIES, G.get(Cookie.IABTCF_GDPR_APPLIES));
            Object obj = G.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.a.y().b());
            Map N = this.a.B().N();
            jSONObject.put("platform", N.get("platform"));
            jSONObject.put("os", N.get("os"));
            jSONObject.put(Device.JsonKeys.LOCALE, N.get(Device.JsonKeys.LOCALE));
            jSONObject.put(Device.JsonKeys.BRAND, N.get(Device.JsonKeys.BRAND));
            jSONObject.put("brand_name", N.get("brand_name"));
            jSONObject.put("hardware", N.get("hardware"));
            jSONObject.put("model", N.get("model"));
            jSONObject.put("revision", N.get("revision"));
            jSONObject.put("is_tablet", N.get("is_tablet"));
            jSONObject.put("screen_size_in", N.get("screen_size_in"));
            jSONObject.put("supported_abis", N.get("supported_abis"));
            if (((Boolean) this.a.a(z4.c4)).booleanValue()) {
                jSONObject.put("mtl", this.a.o0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.l.p().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a f = this.a.B().f();
            jSONObject.put("dnt", f.c());
            jSONObject.put("dnt_code", f.b().b());
            Boolean b2 = q0.c().b(a());
            if (((Boolean) this.a.a(z4.M3)).booleanValue() && StringUtils.isValidString(f.a()) && !Boolean.TRUE.equals(b2)) {
                jSONObject.put("idfa", f.a());
            }
            m.b H = this.a.B().H();
            if (((Boolean) this.a.a(z4.F3)).booleanValue() && H != null && !Boolean.TRUE.equals(b2)) {
                jSONObject.put("idfv", H.a);
                jSONObject.put("idfv_scope", H.b);
            }
            if (((Boolean) this.a.a(z4.I3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.a.v());
            }
            if (((Boolean) this.a.a(z4.K3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.a.j0());
            }
            if (((Boolean) this.a.a(z4.O3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.a.s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.a.F());
            if (this.a.u0().c()) {
                jSONObject.put("test_mode", true);
            }
            List b3 = this.a.u0().b();
            if (b3 != null && !b3.isEmpty()) {
                jSONObject.put("test_mode_networks", b3);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.a.p0().getExtraParameters()));
            Map m0 = this.a.m0();
            if (!CollectionUtils.isEmpty(m0)) {
                jSONObject.put("segments", new JSONObject(m0));
            }
        } catch (JSONException e) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Failed to create JSON body", e);
            }
            this.a.E().a(this.b, "createJSONBody", e);
        }
        return jSONObject;
    }

    protected Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.a.a(z4.F5)).booleanValue() && !((Boolean) this.a.a(z4.E5)).booleanValue()) {
            hashMap.put(com.safedk.android.analytics.brandsafety.m.x, UUID.randomUUID().toString());
        }
        if (!((Boolean) this.a.a(z4.p5)).booleanValue()) {
            hashMap.put("sdk_key", this.a.k0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.a.r(), hashMap);
        Boolean b2 = q0.b().b(a());
        if (b2 != null) {
            hashMap.put("huc", b2.toString());
        }
        Boolean b3 = q0.c().b(a());
        if (b3 != null) {
            hashMap.put("aru", b3.toString());
        }
        Boolean b4 = q0.a().b(a());
        if (b4 != null) {
            hashMap.put("dns", b4.toString());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!p0.g() && j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.l.p());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Cannot update security provider", th);
                }
            }
        }
        this.a.x0().d(f2.g, b(g()));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a a2 = com.applovin.impl.sdk.network.a.a(this.a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.a.a(z4.R5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.a.a(z4.h3)).intValue()).b(((Integer) this.a.a(z4.k3)).intValue()).c(((Integer) this.a.a(z4.g3)).intValue()).e(((Boolean) this.a.a(z4.t3)).booleanValue()).a(w4.a.a(((Integer) this.a.a(z4.u5)).intValue())).f(true).a();
        this.a.s0().a(new c(this.a), f6.b.TIMEOUT, ((Integer) this.a.a(r3)).intValue() + 250);
        a aVar = new a(a2, this.a, d(), elapsedRealtime);
        aVar.c(z4.j0);
        aVar.b(z4.k0);
        this.a.s0().a(aVar);
    }

    class a extends o6 {
        final /* synthetic */ long n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z, long j) {
            super(aVar, lVar, z);
            this.n = j;
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.n;
            v5.this.a(jSONObject);
            this.a.x0().d(f2.h, v5.this.a(str, elapsedRealtime, i, jSONObject, null));
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.n;
            v5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.a.x0().d(f2.i, v5.this.a(str, elapsedRealtime, i, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j2, int i, JSONObject jSONObject, String str2) {
        Uri build = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, X3.j.D, build.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("attempt_number", Integer.toString(this.g));
        hashMap.put("error_message", str2);
        hashMap.put("url", build.toString());
        hashMap.put("details", jSONObject2.toString());
        hashMap.put("duration_ms", Long.toString(j2));
        hashMap.put("code", Integer.toString(i));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.h) {
            bVar = this.i;
            this.i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
