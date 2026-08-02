package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class SkuDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f3963a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f3964b;

    public SkuDetails(String str) {
        this.f3963a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3964b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.f3964b.optString("introductoryPrice");
    }

    public final String b() {
        JSONObject jSONObject = this.f3964b;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : jSONObject.optString("price");
    }

    public final long c() {
        JSONObject jSONObject = this.f3964b;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : d();
    }

    public final long d() {
        return this.f3964b.optLong("price_amount_micros");
    }

    public final String e() {
        return this.f3964b.optString("price_currency_code");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f3963a, ((SkuDetails) obj).f3963a);
        }
        return false;
    }

    public final String f() {
        return this.f3964b.optString("productId");
    }

    public final String g() {
        return this.f3964b.optString("type");
    }

    public final int hashCode() {
        return this.f3963a.hashCode();
    }

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f3963a));
    }
}
