package com.ironsource;

import com.ironsource.X3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
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

    public M1(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = config;
        this.b = config.optBoolean("isExternalArmEventsEnabled", true);
        String optString = config.optString("externalArmEventsUrl", O5.j);
        Intrinsics.checkNotNullExpressionValue(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.c = optString;
        this.d = config.optBoolean("sid", true);
        this.e = config.optBoolean("radvid", false);
        this.f = config.optInt("uaeh", 0);
        this.g = config.optBoolean("sharedThreadPool", false);
        this.h = config.optBoolean("sharedThreadPoolADP", true);
        this.i = config.optInt(M6.V0, -1);
        this.j = config.optBoolean("axal", false);
        this.k = config.optBoolean("psrt", false);
        this.l = config.optJSONObject(X3.a.c);
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
        return (obj instanceof M1) && Intrinsics.areEqual(this.a, ((M1) obj).a);
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

    public final M1 a(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new M1(config);
    }

    public static /* synthetic */ M1 a(M1 m1, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = m1.a;
        }
        return m1.a(jSONObject);
    }
}
