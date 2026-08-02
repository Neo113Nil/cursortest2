package com.playtika.pras.sdk.network.models;

import com.playtika.pras.c.d;
import com.playtika.pras.sdk.network.ResponseDto;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Product extends ResponseDto {
    private String billingCycle;
    private String description;
    private ArrayList<Price> prices;
    private String productId;
    private String title;
    private String trialPeriod;
    private ProductType type;

    public Product(JSONObject jSONObject) {
        this.productId = getJsonString(jSONObject, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.title = getJsonString(jSONObject, "title");
        this.description = getJsonString(jSONObject, "description");
        this.type = ProductType.fromString(getJsonString(jSONObject, "type"));
        this.billingCycle = getJsonString(jSONObject, "billingCycle");
        this.trialPeriod = getJsonString(jSONObject, "trialPeriod");
        JSONArray jsonArray = getJsonArray(jSONObject, "prices");
        int length = jsonArray.length();
        this.prices = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            this.prices.add(new Price(jsonArray.getJSONObject(i)));
        }
    }

    private JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, this.productId);
            jSONObject.put("title", this.title);
            jSONObject.put("description", this.description);
            ProductType productType = this.type;
            if (productType != null) {
                jSONObject.put("type", productType.getType());
            }
            String str = this.billingCycle;
            if (str != null) {
                jSONObject.put("billingCycle", str);
            }
            String str2 = this.trialPeriod;
            if (str2 != null) {
                jSONObject.put("trialPeriod", str2);
            }
            JSONArray jSONArray = new JSONArray();
            ArrayList<Price> arrayList = this.prices;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Price price = arrayList.get(i);
                i++;
                jSONArray.put(price.toJson());
            }
            jSONObject.put("prices", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            d.b(e.getMessage());
            return null;
        }
    }

    public String toString() {
        JSONObject json = toJson();
        return json == null ? "" : json.toString();
    }
}
