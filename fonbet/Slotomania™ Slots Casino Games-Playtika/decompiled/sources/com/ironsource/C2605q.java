package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2605q {
    private final Boolean a;

    public C2605q(JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.a = adFormatAuctionSettings.has(r.a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(r.a)) : null;
    }

    public final Boolean a() {
        return this.a;
    }
}
