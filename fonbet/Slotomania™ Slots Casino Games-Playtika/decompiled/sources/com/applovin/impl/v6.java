package com.applovin.impl;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v;
import com.applovin.impl.w4;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class v6 extends k5 {
    private final r2 g;
    private final Exception h;

    public v6(com.applovin.impl.sdk.l lVar, r2 r2Var, Exception exc) {
        super("TaskValidateLicense", lVar);
        this.g = r2Var;
        this.h = exc;
    }

    private String e() {
        return s0.a((String) this.a.a(z4.v0), (String) this.a.a(z4.w0), this.a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a f = this.a.B().f();
        JsonUtils.putBoolean(jSONObject, "dnt", f.c());
        JsonUtils.putString(jSONObject, "dnt_code", f.b().b());
        if (((Boolean) this.a.a(z4.E3)).booleanValue() && StringUtils.isValidString(f.a())) {
            JsonUtils.putString(jSONObject, "idfa", f.a());
        }
        m.b H = this.a.B().H();
        if (((Boolean) this.a.a(z4.F3)).booleanValue() && H != null) {
            JsonUtils.putString(jSONObject, "idfv", H.a);
            JsonUtils.putInt(jSONObject, "idfv_scope", H.b);
        }
        String e = this.a.y0().e();
        if (((Boolean) this.a.a(z4.G3)).booleanValue() && StringUtils.isValidString(e)) {
            JsonUtils.putString(jSONObject, "cuid", e);
        }
        if (((Boolean) this.a.a(z4.J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.a.v());
        }
        if (((Boolean) this.a.a(z4.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.a.j0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.a.B().e());
        JSONObject jSONObject2 = new JSONObject();
        r2 r2Var = this.g;
        if (r2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", r2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.g.c());
            JsonUtils.putInt(jSONObject2, "n", this.g.b());
        }
        Exception exc = this.h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return s0.a((String) this.a.a(z4.u0), (String) this.a.a(z4.w0), this.a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.a.a(z4.W5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.a.a(z4.y3)).intValue()).a(w4.a.a(((Integer) this.a.a(z4.D5)).intValue())).a(), this.a);
        aVar.c(z4.u0);
        aVar.b(z4.v0);
        this.a.s0().a(aVar);
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "License Validation successful");
            }
            c5.b(b5.i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            Map map = CollectionUtils.map("code", String.valueOf(i));
            CollectionUtils.putStringIfValid("url", str, map);
            this.a.x0().d(f2.l, map);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to validate license: ");
            }
            if (!this.a.c(z4.A).contains(String.valueOf(i))) {
                c5.b(b5.i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.a.x0().d(f2.m, map);
        }
    }
}
