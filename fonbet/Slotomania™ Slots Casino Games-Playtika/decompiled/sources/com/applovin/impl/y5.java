package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v;
import com.applovin.impl.w4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.utils.SdksMapping;
import io.sentry.protocol.App;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y5 extends k5 {
    private final r0.e g;

    public y5(r0.e eVar, com.applovin.impl.sdk.l lVar) {
        super("TaskFetchMediationDebuggerInfo", lVar, true);
        this.g = eVar;
    }

    protected Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.a.a(z4.p5)).booleanValue()) {
            hashMap.put("sdk_key", this.a.k0());
        }
        Map G = this.a.B().G();
        hashMap.put("package_name", String.valueOf(G.get("package_name")));
        hashMap.put(App.JsonKeys.APP_VERSION, String.valueOf(G.get(App.JsonKeys.APP_VERSION)));
        Map N = this.a.B().N();
        hashMap.put("platform", String.valueOf(N.get("platform")));
        hashMap.put("os", String.valueOf(N.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map e = e();
        JSONObject a2 = a(a());
        if (((Boolean) this.a.a(z4.H5)).booleanValue() || ((Boolean) this.a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(a2, (Map<String, ?>) e);
            e = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).c("POST").b(n3.i(this.a)).a(n3.h(this.a)).b(e).a(a2).a((Object) new JSONObject()).c(((Long) this.a.a(t3.E7)).intValue()).a(w4.a.a(((Integer) this.a.a(z4.w5)).intValue())).a(), this.a, d());
        aVar.c(t3.A7);
        aVar.b(t3.B7);
        this.a.s0().a(aVar);
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z) {
            super(aVar, lVar, z);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            y5.this.g.a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            y5.this.g.a(str, i, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, y3.b(this.a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a f = this.a.B().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", f.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", f.a());
        Map m0 = this.a.m0();
        if (!CollectionUtils.isEmpty(m0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(m0));
        }
        return jSONObject;
    }
}
