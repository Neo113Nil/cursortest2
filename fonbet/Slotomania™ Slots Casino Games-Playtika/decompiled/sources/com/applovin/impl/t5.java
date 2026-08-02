package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class t5 extends k5 {
    protected final u g;
    private final String h;

    public t5(u uVar, String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
        this.g = uVar;
        this.h = lVar.b();
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.g.e());
        if (this.g.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.g.g().getLabel());
        }
        return hashMap;
    }

    protected abstract k5 a(JSONObject jSONObject);

    protected void a(int i, String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Unable to fetch " + this.g + " ad: server returned " + i);
        }
        this.a.g().a(f2.A, this.g, new AppLovinError(i, str));
    }

    protected void b(JSONObject jSONObject) {
        s0.c(jSONObject, this.a);
        s0.b(jSONObject, this.a);
        s0.a(jSONObject, this.a);
        u.a(jSONObject);
        this.a.s0().a(a(jSONObject));
    }

    protected abstract String e();

    protected abstract String f();

    protected Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put(BrandSafetyEvent.f, this.g.e());
        if (this.g.f() != null) {
            hashMap.put("size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            hashMap.put("require", this.g.g().getLabel());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        w4.a aVar;
        Map map;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Fetching next ad of zone: " + this.g);
        }
        if (((Boolean) this.a.a(z4.Z3)).booleanValue() && q7.k() && com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        q7.a(this.a, this.b);
        this.a.g().a(f2.y, this.g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.a.l().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.a.a(z4.m3)).booleanValue()) {
                aVar = w4.a.a(((Integer) this.a.a(z4.x5)).intValue());
                JSONObject jSONObject = new JSONObject(this.a.B().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.a.a(z4.I5)).booleanValue() && !((Boolean) this.a.a(z4.E5)).booleanValue()) {
                    map.put(com.safedk.android.analytics.brandsafety.m.x, UUID.randomUUID().toString());
                }
                if (!((Boolean) this.a.a(z4.p5)).booleanValue()) {
                    map.put("sdk_key", this.a.k0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                w4.a a2 = w4.a.a(((Integer) this.a.a(z4.y5)).intValue());
                Map a3 = q7.a(this.a.B().a(h(), false, false));
                if (!((Boolean) this.a.a(z4.Q6)).booleanValue()) {
                    a3.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVar = a2;
                map = a3;
            }
            if (q7.h(a()) || q7.j(a())) {
                map.putAll(this.a.l().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.h)) {
                map.put("sts", this.h);
            }
            a.C0111a f = com.applovin.impl.sdk.network.a.a(this.a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.a.a(z4.b3)).intValue()).c(((Boolean) this.a.a(z4.c3)).booleanValue()).d(((Boolean) this.a.a(z4.d3)).booleanValue()).c(((Integer) this.a.a(z4.a3)).intValue()).a(aVar).f(true);
            if (andResetCustomPostBody != null) {
                f.a(andResetCustomPostBody);
                f.b(((Boolean) this.a.a(z4.T5)).booleanValue());
            }
            a aVar2 = new a(f.a(), this.a);
            aVar2.c(z4.l0);
            aVar2.b(z4.m0);
            this.a.s0().a(aVar2);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Unable to fetch ad for zone id: " + this.g, th);
            }
            a(0, th.getMessage());
        }
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
                HashMap hashMap = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
                CollectionUtils.putStringIfValid("code", String.valueOf(i), hashMap);
                CollectionUtils.putStringIfValid("ad_zone_id", t5.this.g.e(), hashMap);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.m.a()), hashMap);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.m.b()), hashMap);
                this.a.g().d(f2.z, hashMap);
                t5.this.b(jSONObject);
                return;
            }
            t5.this.a(i, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            t5.this.a(i, str2);
            this.a.E().a("fetchAd", str, i, str2);
        }
    }
}
