package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Qd {
    private final String a;
    private final Integer b;

    public Qd(JSONObject features, String nameKey, String amountKey) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    public final Integer a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
