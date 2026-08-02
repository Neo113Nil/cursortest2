package com.tiktok.appevents;

import com.facebook.appevents.internal.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class TTInAppPurchaseManager {
    static final String TAG = "com.tiktok.appevents.TTInAppPurchaseManager";

    TTInAppPurchaseManager() {
    }

    static JSONObject getPurchaseProps(TTPurchaseInfo purchaseInfo) {
        try {
            JSONObject purchaseProperties = getPurchaseProperties(purchaseInfo.getPurchase().getString("productId"), purchaseInfo.getSkuDetails());
            if (purchaseInfo.isAutoTrack() && purchaseProperties != null) {
                purchaseProperties.putOpt("type", "auto");
                purchaseProperties.putOpt(TTContentsEventConstants.Params.EVENT_PROPERTY_ORDER_ID, purchaseInfo.getPurchase().optString("orderId"));
            }
            return purchaseProperties;
        } catch (JSONException e) {
            TTCrashHandler.handleCrash(TAG, e, 2);
            return null;
        }
    }

    private static JSONObject getPurchaseProperties(String sku, JSONObject skuDetails) throws JSONException {
        double d;
        JSONObject jSONObject = new JSONObject();
        JSONObject put = new JSONObject().put("content_id", sku);
        if (skuDetails != null) {
            put.put("content_type", safeJsonGetString(skuDetails, "type"));
            jSONObject.put("currency", safeJsonGetString(skuDetails, Constants.GP_IAP_PRICE_CURRENCY_CODE_V2V4));
            put.put("quantity", 1);
            try {
                d = new BigDecimal(skuDetails.optLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4, 0L) / 1000000.0d).doubleValue();
            } catch (Exception unused) {
                d = 0.0d;
            }
            put.put(FirebaseAnalytics.Param.PRICE, d);
            jSONObject.put("value", d);
        }
        jSONObject.put(TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS, new JSONArray().put(put));
        return jSONObject;
    }

    private static String safeJsonGetString(JSONObject jsonObject, String key) {
        try {
            return jsonObject.get(key).toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
