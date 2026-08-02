package com.applovin.impl;

import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class t6 extends k5 {
    protected t6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    protected abstract void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, r0.e eVar) {
        Map c = s0.c(this.a);
        if (((Boolean) this.a.a(z4.L5)).booleanValue() || ((Boolean) this.a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c);
            c = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).b(s0.b(f(), this.a)).a(s0.a(f(), this.a)).b(c).a(jSONObject).c("POST").b(((Boolean) this.a.a(z4.V5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(w4.a.a(((Integer) this.a.a(z4.C5)).intValue())).a(), this.a, eVar);
        aVar.c(z4.n0);
        aVar.b(z4.o0);
        this.a.s0().a(aVar);
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String e = this.a.y0().e();
        if (((Boolean) this.a.a(z4.H3)).booleanValue() && StringUtils.isValidString(e)) {
            JsonUtils.putString(jSONObject, "cuid", e);
        }
        if (((Boolean) this.a.a(z4.J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.a.v());
        }
        if (((Boolean) this.a.a(z4.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.a.j0());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected abstract String f();

    protected abstract int g();

    class a extends o6 {
        final /* synthetic */ r0.e n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, r0.e eVar) {
            super(aVar, lVar);
            this.n = eVar;
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.n.a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.n.a(str, i, str2, jSONObject);
        }
    }

    protected void a(int i) {
        s0.a(i, this.a);
    }
}
