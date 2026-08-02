package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f4067a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f4068b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4069c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4070d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4071e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4072f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4073g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4074h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4075i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4076k;

    public q(String str) {
        this.f4067a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4068b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f4069c = optString;
        String optString2 = jSONObject.optString("type");
        this.f4070d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f4071e = jSONObject.optString("title");
        this.f4072f = jSONObject.optString("name");
        this.f4073g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f4074h = jSONObject.optString("skuDetailsToken");
        this.f4075i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                arrayList.add(new p(optJSONArray.getJSONObject(i5)));
            }
            this.j = arrayList;
        } else {
            this.j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f4068b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f4068b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                arrayList2.add(new n(optJSONArray2.getJSONObject(i10)));
            }
            this.f4076k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f4076k = null;
        } else {
            arrayList2.add(new n(optJSONObject));
            this.f4076k = arrayList2;
        }
    }

    public final n a() {
        ArrayList arrayList = this.f4076k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (n) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return TextUtils.equals(this.f4067a, ((q) obj).f4067a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4067a.hashCode();
    }

    public final String toString() {
        String obj = this.f4068b.toString();
        String valueOf = String.valueOf(this.j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        r4.k.s(sb2, this.f4067a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f4069c);
        sb2.append("', productType='");
        sb2.append(this.f4070d);
        sb2.append("', title='");
        sb2.append(this.f4071e);
        sb2.append("', productDetailsToken='");
        return d9.e.n(sb2, this.f4074h, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
