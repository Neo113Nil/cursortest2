package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class B1 {
    private final Gb a;
    private final I1 b;
    private final boolean c;
    private final F1 d;
    private final M1 e;
    private final C4664z1 f;

    public B1(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(D1.a);
        this.a = new Gb(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("events");
        this.b = new I1(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        this.c = jSONObject.optBoolean(D1.g, false);
        JSONObject optJSONObject3 = jSONObject.optJSONObject(D1.h);
        this.d = new F1(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("settings");
        this.e = new M1(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
        JSONObject optJSONObject5 = jSONObject.optJSONObject(D1.f);
        this.f = new C4664z1(optJSONObject5 == null ? new JSONObject() : optJSONObject5);
    }

    public final C4664z1 a() {
        return this.f;
    }

    public final F1 b() {
        return this.d;
    }

    public final I1 c() {
        return this.b;
    }

    public final M1 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public final Gb f() {
        return this.a;
    }
}
