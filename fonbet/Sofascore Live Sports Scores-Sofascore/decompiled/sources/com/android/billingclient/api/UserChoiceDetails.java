package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.U3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzv
/* loaded from: classes.dex */
public final class UserChoiceDetails {
    public final JSONObject a;
    public final ArrayList b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zzv
    public static class Product {
        public final String a;
        public final String b;
        public final String c;

        public Product(JSONObject jSONObject) {
            this.a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.b = jSONObject.optString(U3.i.m);
            String optString = jSONObject.optString("offerToken");
            this.c = true == optString.isEmpty() ? null : optString;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.a.equals(product.getId()) && this.b.equals(product.getType()) && Objects.equals(this.c, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.a;
        }

        @Nullable
        public String getOfferToken() {
            return this.c;
        }

        @NonNull
        public String getType() {
            return this.b;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }

        @NonNull
        public String toString() {
            return mz1.o(mz1.s("{id: ", this.a, ", type: ", this.b, ", offer token: "), this.c, "}");
        }
    }

    public UserChoiceDetails(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new Product(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.a.optString("externalTransactionToken");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String optString = this.a.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.b;
    }
}
