package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.f6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.q;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v3;
import com.applovin.impl.w4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.ironsource.C2321a2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class x5 extends k5 {
    private final c3 g;
    private final JSONArray h;
    private final Context i;
    private final a.InterfaceC0103a j;

    public x5(c3 c3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.l lVar, a.InterfaceC0103a interfaceC0103a) {
        super("TaskFetchMediatedAd", lVar, c3Var.b());
        this.g = c3Var;
        this.h = jSONArray;
        this.i = context;
        this.j = interfaceC0103a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            s0.c(jSONObject, this.a);
            s0.b(jSONObject, this.a);
            s0.a(jSONObject, this.a);
            n3.f(jSONObject, this.a);
            n3.d(jSONObject, this.a);
            n3.e(jSONObject, this.a);
            n3.g(jSONObject, this.a);
            this.a.n().a();
            MaxAdFormat a2 = this.g.a();
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (a2 == formatFromString) {
                a(jSONObject);
                return;
            }
            String b = this.g.b();
            if (formatFromString == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Mediated ad response is missing the ad format field for ad unit " + b);
                }
                if (jSONObject.has(com.safedk.android.analytics.brandsafety.m.S)) {
                    HashMap hashMap = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", hashMap);
                    CollectionUtils.putStringIfValid("ad_unit_id", b, hashMap);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), hashMap);
                    this.a.E().a(f2.j1, this.b, hashMap);
                }
                this.j.onAdLoadFailed(b, MaxAdapterError.NO_FILL);
                return;
            }
            String label = formatFromString.getLabel();
            String label2 = a2.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + b + ") is assigned to the correct ad format.";
            if (q7.a(a2, formatFromString)) {
                com.applovin.impl.sdk.p.j(this.b, str);
                a(jSONObject);
                return;
            }
            m1.a(str, new Object[0]);
            com.applovin.impl.sdk.p.h(this.b, str);
            this.j.onAdLoadFailed(b, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> hashMap2 = CollectionUtils.hashMap("ad_unit_id", b);
            CollectionUtils.putStringIfValid("name", label2, hashMap2);
            CollectionUtils.putStringIfValid("details", label, hashMap2);
            this.a.E().a(f2.b1, "incompatible_ad_format", hashMap2);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Unable to process mediated ad response for ad unit " + this.g.b(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.a.Z().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !q7.h(com.applovin.impl.sdk.l.p())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.a.a(z4.R4)).booleanValue()) {
            w3 a0 = this.a.a0();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            u3 u3Var = u3.f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) a0.a(u3Var, v3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) a0.a(u3Var, v3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) a0.a(u3.g, v3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return n3.a(this.a);
    }

    private String f() {
        return n3.b(this.a);
    }

    private JSONObject g() {
        Map a2 = this.a.B().a((Map) null, false, true);
        a2.putAll(this.g.c());
        JSONObject jSONObject = new JSONObject(a2);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("AppLovin-Ad-Unit-Id", this.g.b());
        hashMap.put("AppLovin-Ad-Format", this.g.a().getLabel());
        Map d = this.g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", d.get("retry_attempt"), hashMap);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", d.get("retry_delay_sec"), hashMap);
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        x5 x5Var;
        MaxAdFormat a2 = this.g.a();
        String b = this.g.b();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Fetching next ad for " + a2.getLabel() + " ad unit " + b);
        }
        m2.a();
        if (((Boolean) this.a.a(z4.Z3)).booleanValue() && q7.k() && com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        this.a.R().a(f2.i0, a2, b, (MaxError) null);
        if (((Boolean) this.a.a(z4.R4)).booleanValue()) {
            w3 a0 = this.a.a0();
            u3 u3Var = u3.f;
            a0.a(u3Var, v3.a(b));
            a0.a(u3Var, v3.a(a2));
        }
        q7.a(this.a, this.b);
        try {
            JSONObject g = g();
            HashMap hashMap = new HashMap();
            if (!((Boolean) this.a.a(z4.G5)).booleanValue() && !((Boolean) this.a.a(z4.E5)).booleanValue()) {
                hashMap.put(com.safedk.android.analytics.brandsafety.m.x, UUID.randomUUID().toString());
            }
            if (!((Boolean) this.a.a(z4.p5)).booleanValue()) {
                hashMap.put("sdk_key", this.a.k0());
            }
            if (this.a.u0().c()) {
                hashMap.put("test_mode", "1");
            }
            List b2 = this.a.u0().b();
            String str = this.a.p0().getExtraParameters().get("fan");
            if (b2 != null && !b2.isEmpty()) {
                String m = UByte$$ExternalSyntheticBackport0.m(",", b2);
                hashMap.put("filter_ad_network", m);
                if (!this.a.u0().c()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.a.u0().d()) {
                    hashMap.put("force_ad_network", m);
                }
            } else if (StringUtils.isValidString(str)) {
                hashMap.put("filter_ad_network", str);
            }
            x5Var = this;
            try {
                a aVar = x5Var.new a(com.applovin.impl.sdk.network.a.a(this.a).c("POST").a(h()).b(f()).a(e()).b(hashMap).a(g).b(((Boolean) this.a.a(t3.L8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.a.a(t3.D7)).intValue()).a(((Integer) this.a.a(z4.b3)).intValue()).b(((Long) this.a.a(t3.C7)).intValue()).a(w4.a.a(((Integer) this.a.a(z4.v5)).intValue())).f(true).a(), this.a, b, a2);
                aVar.c(t3.A7);
                aVar.b(t3.B7);
                x5Var.a.s0().a(aVar);
            } catch (Throwable th) {
                th = th;
                if (com.applovin.impl.sdk.p.a()) {
                    x5Var.c.a(x5Var.b, "Unable to fetch ad for Ad Unit ID: " + b, th);
                }
                a("", 0, th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            x5Var = this;
        }
    }

    class a extends o6 {
        final /* synthetic */ String n;
        final /* synthetic */ MaxAdFormat o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, lVar);
            this.n = str;
            this.o = maxAdFormat;
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i != 200) {
                x5.this.a(str, i, null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
            HashMap hashMap = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
            CollectionUtils.putStringIfValid("code", String.valueOf(i), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", this.n, hashMap);
            CollectionUtils.putStringIfValid("ad_format", this.o.getLabel(), hashMap);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.m.a()), hashMap);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.m.b()), hashMap);
            this.a.R().d(f2.j0, hashMap);
            x5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            x5.this.a(str, i, str2);
            this.a.E().a("fetchMediatedAd", str, i, str2);
        }
    }

    private void e(JSONObject jSONObject) {
        String b = this.g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", b);
        jSONObject2.put("ad_format", this.g.a().getLabel());
        Map map = CollectionUtils.map(this.g.d());
        com.applovin.impl.sdk.q c0 = this.a.c0();
        CollectionUtils.putStringIfValid("previous_request_id", c0.b(b), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", c0.a(b), map);
        q.a c = c0.c(b);
        if (c != null) {
            if (Boolean.parseBoolean(this.a.p0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", c.a());
                map.put("previous_winning_network_name", c.c());
            }
            if (this.a.T() != null) {
                Queue<a3> c2 = this.a.T().c(b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (a3 a3Var : c2) {
                    arrayList.add(a3Var.c());
                    arrayList2.add(a3Var.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", UByte$$ExternalSyntheticBackport0.m(",", arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", UByte$$ExternalSyntheticBackport0.m(",", arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C2321a2.e, new JSONArray(this.a.V().a()));
            jSONObject2.put("installed", y3.b(this.a));
            jSONObject2.put("initialized", this.a.U().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.a.U().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.a.V().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.a.V().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        k5 h6Var;
        if (((Boolean) this.a.a(t3.Q8)).booleanValue()) {
            jSONObject2 = jSONObject;
            h6Var = new i6(this.g, jSONObject2, this.i, this.a, this.j);
        } else {
            jSONObject2 = jSONObject;
            h6Var = new h6(this.g, jSONObject, this.i, this.a, this.j);
        }
        long j = JsonUtils.getLong(jSONObject2, "process_waterfall_delay_ms", -1L);
        if (j > 0) {
            this.a.s0().a(h6Var, f6.b.MEDIATION, j, true);
        } else {
            this.a.s0().a(h6Var);
        }
    }

    private void h(JSONObject jSONObject) {
        JSONArray jSONArray = this.h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.a.p0().getExtraParameters()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String str2) {
        MaxErrorImpl maxErrorImpl;
        String b = this.g.b();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Unable to fetch ad for ad unit " + b + ": server returned " + i);
        }
        if (i == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap hashMap = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
        CollectionUtils.putStringIfValid("code", String.valueOf(i), hashMap);
        CollectionUtils.putStringIfValid("error_message", str2, hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", b, hashMap);
        CollectionUtils.putStringIfValid("ad_format", this.g.a().getLabel(), hashMap);
        this.a.R().d(f2.k0, hashMap);
        v2.a(this.j, b, maxErrorImpl);
    }
}
