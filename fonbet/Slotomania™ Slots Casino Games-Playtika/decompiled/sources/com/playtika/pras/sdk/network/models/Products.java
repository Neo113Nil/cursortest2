package com.playtika.pras.sdk.network.models;

import com.playtika.pras.sdk.network.PPSResponse;
import com.playtika.pras.sdk.network.ResponseCode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class Products extends PPSResponse {
    private ArrayList<Product> products;

    public Products(JSONObject jSONObject) {
        super(jSONObject);
        if (ResponseCode.RESULT_OK != getResponseCode()) {
            this.products = new ArrayList<>();
            return;
        }
        JSONArray jsonArray = getJsonArray(jSONObject, "details");
        int length = jsonArray.length();
        this.products = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            this.products.add(new Product(jsonArray.getJSONObject(i)));
        }
    }

    public ArrayList<String> getProducts() {
        ArrayList<String> arrayList = new ArrayList<>(this.products.size());
        ArrayList<Product> arrayList2 = this.products;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Product product = arrayList2.get(i);
            i++;
            arrayList.add(product.toString());
        }
        return arrayList;
    }

    public Products(ResponseCode responseCode) {
        this(responseCode, new ArrayList());
    }

    private Products(ResponseCode responseCode, ArrayList<Product> arrayList) {
        super(responseCode);
        this.products = arrayList;
    }
}
