package com.ironsource;

import com.ironsource.U3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K1 {

    @NotNull
    private final JSONObject a;
    private final boolean b;

    @NotNull
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;

    @Nullable
    private final JSONObject l;

    @Nullable
    private final JSONArray m;

    public K1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        this.b = jSONObject.optBoolean("isExternalArmEventsEnabled", true);
        String optString = jSONObject.optString("externalArmEventsUrl", N5.j);
        optString.getClass();
        this.c = optString;
        this.d = jSONObject.optBoolean(L6.e1, true);
        this.e = jSONObject.optBoolean("radvid", false);
        this.f = jSONObject.optInt("uaeh", 0);
        this.g = jSONObject.optBoolean("sharedThreadPool", false);
        this.h = jSONObject.optBoolean("sharedThreadPoolADP", true);
        this.i = jSONObject.optInt(L6.V0, -1);
        this.j = jSONObject.optBoolean("axal", false);
        this.k = jSONObject.optBoolean("psrt", false);
        this.l = jSONObject.optJSONObject(U3.a.c);
        this.m = jSONObject.optJSONArray("ilrSubscribers");
    }

    public static /* synthetic */ K1 a(K1 k1, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = k1.a;
        }
        return k1.a(jSONObject);
    }

    public final int b() {
        return this.i;
    }

    @Nullable
    public final JSONObject c() {
        return this.l;
    }

    @NotNull
    public final String d() {
        return this.c;
    }

    @Nullable
    public final JSONArray e() {
        return this.m;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K1) && Intrinsics.c(this.a, ((K1) obj).a);
    }

    public final boolean f() {
        return this.k;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.f;
    }

    public final boolean l() {
        return this.j;
    }

    public final boolean m() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.a + ")";
    }

    @NotNull
    public final K1 a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        return new K1(jSONObject);
    }

    private final JSONObject a() {
        return this.a;
    }
}
