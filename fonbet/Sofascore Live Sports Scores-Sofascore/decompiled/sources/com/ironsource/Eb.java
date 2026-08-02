package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Eb {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public Eb(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optInt(Fb.a, 3);
        this.b = jSONObject.optInt(Fb.b, 3);
        this.c = jSONObject.optInt("console", 3);
        this.d = jSONObject.optBoolean(Fb.d, false);
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
