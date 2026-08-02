package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.i5s;
import xsna.xe9;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@zzk
/* loaded from: classes12.dex */
public final class UserChoiceDetails {
    private final String mOriginalJson;
    private final JSONObject mParsedJson;
    private final List<Product> mProducts;

    public UserChoiceDetails(String str) throws JSONException {
        this.mOriginalJson = str;
        JSONObject jSONObject = new JSONObject(str);
        this.mParsedJson = jSONObject;
        this.mProducts = toProductList(jSONObject.optJSONArray("products"));
    }

    private static List<Product> toProductList(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new Product(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.mParsedJson.optString("externalTransactionToken");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String optString = this.mParsedJson.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.mProducts;
    }

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    @zzk
    public static class Product {
        private final String id;

        @Nullable
        private final String offerToken;
        private final String type;

        public Product(String str, String str2, @Nullable String str3) {
            this.id = str;
            this.type = str2;
            this.offerToken = str3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.id.equals(product.getId()) && this.type.equals(product.getType()) && Objects.equals(this.offerToken, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public String getOfferToken() {
            return this.offerToken;
        }

        @NonNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.id, this.type, this.offerToken);
        }

        @NonNull
        public String toString() {
            String str = this.id;
            String str2 = this.type;
            return i5s.a(xe9.a("{id: ", str, ", type: ", str2, ", offer token: "), this.offerToken, "}");
        }

        private Product(JSONObject jSONObject) {
            this.id = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.type = jSONObject.optString(X3.i.m);
            String optString = jSONObject.optString("offerToken");
            this.offerToken = true == optString.isEmpty() ? null : optString;
        }
    }
}
