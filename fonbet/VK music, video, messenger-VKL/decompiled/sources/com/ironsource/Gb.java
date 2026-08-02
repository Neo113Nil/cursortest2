package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Gb {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public Gb(JSONObject jSONObject) {
        this.a = jSONObject.optInt(Hb.a, 3);
        this.b = jSONObject.optInt(Hb.b, 3);
        this.c = jSONObject.optInt("console", 3);
        this.d = jSONObject.optBoolean(Hb.d, false);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }
}
