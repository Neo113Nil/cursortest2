package com.ironsource;

import com.ironsource.X3;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class Bf {
    private final JSONObject a;

    public Bf(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.a.optBoolean(X3.a.o, false);
    }

    public boolean c() {
        return this.a.optBoolean(X3.a.p, false);
    }

    public boolean d() {
        return this.a.optBoolean(X3.a.l, false);
    }

    public boolean e() {
        return this.a.optBoolean(X3.a.n, false);
    }
}
