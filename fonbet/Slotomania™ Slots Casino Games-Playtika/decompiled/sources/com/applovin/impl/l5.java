package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.w4;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class l5 extends k5 {
    l5(com.applovin.impl.sdk.l lVar) {
        super("TaskApiSubmitData", lVar);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.m B = this.a.B();
        Map p = B.p();
        q7.a("platform", "type", p);
        q7.a("api_level", "sdk_version", p);
        JsonUtils.putObject(jSONObject, DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(p));
        Map G = B.G();
        q7.a("sdk_version", "applovin_sdk_version", G);
        q7.a("ia", "installed_at", G);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(G));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d(this.b, "Submitting user data...");
        }
        Map c = s0.c(this.a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.a.a(z4.K5)).booleanValue() || ((Boolean) this.a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c);
            c = null;
        }
        a(c, jSONObject);
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            l5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            s0.a(i, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.a.q0().a(z4.f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.a.q0().a(z4.j, JsonUtils.getString(jSONObject2, "device_token", ""));
        s0.a(jSONObject2, this.a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).b(s0.b("2.0/device", this.a)).a(s0.a("2.0/device", this.a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.a.a(z4.S5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.a.a(z4.e3)).intValue()).a(w4.a.a(((Integer) this.a.a(z4.B5)).intValue())).a(), this.a);
        aVar.c(z4.n0);
        aVar.b(z4.o0);
        this.a.s0().a(aVar);
    }
}
