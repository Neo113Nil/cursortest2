package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2332ad {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public C2332ad(JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.c = H3.Second;
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
