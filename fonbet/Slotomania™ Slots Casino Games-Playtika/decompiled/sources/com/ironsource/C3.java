package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class C3 {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public C3(JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.c = features.has("unit") ? H3.c.a(features.optString("unit")) : null;
    }

    public final Boolean a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final H3 c() {
        return this.c;
    }
}
