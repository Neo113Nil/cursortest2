package com.ironsource;

import com.ironsource.X3;
import org.json.JSONObject;
import xsna.epx;

/* loaded from: classes13.dex */
public final class M1 {
    private final JSONObject a;
    private final boolean b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final JSONObject l;

    public M1(JSONObject jSONObject) {
        this.a = jSONObject;
        this.b = jSONObject.optBoolean("isExternalArmEventsEnabled", true);
        this.c = jSONObject.optString("externalArmEventsUrl", Q5.j);
        this.d = jSONObject.optBoolean(O6.e1, true);
        this.e = jSONObject.optBoolean("radvid", false);
        this.f = jSONObject.optInt("uaeh", 0);
        this.g = jSONObject.optBoolean("sharedThreadPool", false);
        this.h = jSONObject.optBoolean("sharedThreadPoolADP", true);
        this.i = jSONObject.optInt(O6.V0, -1);
        this.j = jSONObject.optBoolean("axal", false);
        this.k = jSONObject.optBoolean("psrt", false);
        this.l = jSONObject.optJSONObject(X3.a.c);
    }

    private final JSONObject a() {
        return this.a;
    }

    public final int b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.l;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M1) && epx.f(this.a, ((M1) obj).a);
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.g;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        return this.h;
    }

    public final int j() {
        return this.f;
    }

    public final boolean k() {
        return this.j;
    }

    public final boolean l() {
        return this.b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.a + ")";
    }

    public final M1 a(JSONObject jSONObject) {
        return new M1(jSONObject);
    }

    public static /* synthetic */ M1 a(M1 m1, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = m1.a;
        }
        return m1.a(jSONObject);
    }
}
