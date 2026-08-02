package com.ironsource;

import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import xsna.j5g;

/* loaded from: classes13.dex */
public final class F1 {
    private final boolean a;
    private final HashSet<String> b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final boolean g;

    public F1(JSONObject jSONObject) {
        this.a = jSONObject.optBoolean("enabled", false);
        List<String> b = C4369ia.b(jSONObject.optJSONArray(H1.b));
        this.b = b != null ? j5g.M0(b) : null;
        this.c = jSONObject.optString(H1.c);
        this.d = jSONObject.optString(H1.d);
        this.e = jSONObject.optBoolean(H1.e, false);
        this.f = jSONObject.optInt("timeout", 5000);
        this.g = jSONObject.optBoolean(H1.g, false);
    }

    public final int a() {
        return this.f;
    }

    public final HashSet<String> b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.g;
    }
}
