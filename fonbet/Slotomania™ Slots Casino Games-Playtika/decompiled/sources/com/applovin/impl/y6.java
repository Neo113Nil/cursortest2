package com.applovin.impl;

import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class y6 extends t6 {
    protected y6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private q4 b(JSONObject jSONObject) {
        Map<String, String> emptyMap;
        String str;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        s0.c(jSONObject2, this.a);
        s0.b(jSONObject, this.a);
        s0.a(jSONObject, this.a);
        try {
            emptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            emptyMap = Collections.emptyMap();
        }
        try {
            str = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            str = "network_timeout";
        }
        return q4.a(str, emptyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        q4 b = b(jSONObject);
        a(b);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Pending reward handled: " + b);
        }
    }

    protected abstract void a(q4 q4Var);

    @Override // com.applovin.impl.t6
    protected int g() {
        return ((Integer) this.a.a(z4.i1)).intValue();
    }

    protected abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    class a implements r0.e {
        a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (y6.this.h()) {
                com.applovin.impl.sdk.p pVar = y6.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var = y6.this;
                    y6Var.c.b(y6Var.b, "Reward validation succeeded with code " + i + " but task was cancelled already");
                }
                com.applovin.impl.sdk.p pVar2 = y6.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var2 = y6.this;
                    y6Var2.c.b(y6Var2.b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar3 = y6.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                y6 y6Var3 = y6.this;
                y6Var3.c.a(y6Var3.b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
            }
            y6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (y6.this.h()) {
                com.applovin.impl.sdk.p pVar = y6.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var = y6.this;
                    y6Var.c.b(y6Var.b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar2 = y6.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                y6 y6Var2 = y6.this;
                y6Var2.c.b(y6Var2.b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            y6.this.a(i);
        }
    }
}
