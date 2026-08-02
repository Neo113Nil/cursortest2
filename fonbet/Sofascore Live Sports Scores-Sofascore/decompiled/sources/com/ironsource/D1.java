package com.ironsource;

import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class D1 {
    private final boolean a;

    @Nullable
    private final HashSet<String> b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;
    private final boolean e;
    private final int f;
    private final boolean g;

    public D1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optBoolean("enabled", false);
        List<String> b = C4110ha.b(jSONObject.optJSONArray(F1.b));
        this.b = b != null ? CollectionsKt.Q0(b) : null;
        String optString = jSONObject.optString(F1.c);
        optString.getClass();
        this.c = optString;
        String optString2 = jSONObject.optString(F1.d);
        optString2.getClass();
        this.d = optString2;
        this.e = jSONObject.optBoolean(F1.e, false);
        this.f = jSONObject.optInt("timeout", 5000);
        this.g = jSONObject.optBoolean(F1.g, false);
    }

    public final int a() {
        return this.f;
    }

    @Nullable
    public final HashSet<String> b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.d;
    }

    @NotNull
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
