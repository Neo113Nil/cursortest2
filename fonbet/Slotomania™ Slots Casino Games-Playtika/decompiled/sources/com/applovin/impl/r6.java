package com.applovin.impl;

import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class r6 extends t6 {
    protected r6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private JSONObject a(q4 q4Var) {
        JSONObject e = e();
        JsonUtils.putString(e, "result", q4Var.b());
        Map a2 = q4Var.a();
        if (a2 != null) {
            JsonUtils.putJSONObject(e, "params", new JSONObject(a2));
        }
        return e;
    }

    protected abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.t6
    protected int g() {
        return ((Integer) this.a.a(z4.j1)).intValue();
    }

    protected abstract q4 h();

    protected abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        q4 h = h();
        if (h != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Reporting pending reward: " + h + "...");
            }
            a(a(h), new a());
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Pending reward not found");
            }
            i();
        }
    }

    class a implements r0.e {
        a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            r6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            r6.this.a(i);
        }
    }
}
