package com.android.billingclient.api;

import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f4056a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4057b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4058c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4059d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4060e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4061f;

    public o(JSONObject jSONObject) {
        this.f4059d = jSONObject.optString("billingPeriod");
        this.f4058c = jSONObject.optString("priceCurrencyCode");
        this.f4056a = jSONObject.optString("formattedPrice");
        this.f4057b = jSONObject.optLong("priceAmountMicros");
        this.f4061f = jSONObject.optInt("recurrenceMode");
        this.f4060e = jSONObject.optInt("billingCycleCount");
    }
}
