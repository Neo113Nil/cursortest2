package com.playtika.plugins.googleplay.billingclient;

import android.util.Log;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingProgramReportingDetails;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.safedk.android.analytics.brandsafety.m;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class DataFormatter {
    private static final String TAG = "DataFormatter";
    private static final Map<String, ProductDetails> productDetailsCache = new ConcurrentHashMap();

    public static JSONObject fromBillingConfig(BillingConfig billingConfig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countryCode", billingConfig.getCountryCode());
        return jSONObject;
    }

    public static String fromBillingReportingDetails(BillingProgramReportingDetails billingProgramReportingDetails) {
        if (billingProgramReportingDetails == null) {
            return null;
        }
        return billingProgramReportingDetails.getExternalTransactionToken();
    }

    public static JSONObject fromBillingResult(BillingResult billingResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("responseCode", billingResult.getResponseCode());
        jSONObject.put("debugMessage", billingResult.getDebugMessage());
        return jSONObject;
    }

    public static JSONArray fromPurchaseList(List<Purchase> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(fromPurchase(it.next()));
        }
        return jSONArray;
    }

    private static JSONObject fromPurchase(Purchase purchase) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("originalJson", purchase.getOriginalJson());
        jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, purchase.getSignature());
        jSONObject.put(SDKConstants.PARAM_PURCHASE_TOKEN, purchase.getPurchaseToken());
        jSONObject.put("orderId", purchase.getOrderId());
        jSONObject.put("purchaseState", purchase.getPurchaseState());
        ArrayList<String> skus = purchase.getSkus();
        if (skus.size() > 1) {
            throw new RuntimeException("Cordova billing client does not support multi skus purchases");
        }
        jSONObject.put(AppLovinEventParameters.PRODUCT_IDENTIFIER, skus.get(0));
        jSONObject.put("isAcknowledged", purchase.isAcknowledged());
        jSONObject.put("isAutoRenewing", purchase.isAutoRenewing());
        return jSONObject;
    }

    public static JSONArray fromProductDetailsList(QueryProductDetailsResult queryProductDetailsResult) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (queryProductDetailsResult != null) {
            Iterator<ProductDetails> it = queryProductDetailsResult.getProductDetailsList().iterator();
            while (it.hasNext()) {
                jSONArray.put(fromProductDetails(it.next()));
            }
        }
        return jSONArray;
    }

    private static JSONObject fromProductDetails(ProductDetails productDetails) throws JSONException {
        String str;
        String str2;
        String str3;
        String productType = productDetails.getProductType();
        String productId = productDetails.getProductId();
        if (productDetails.getOneTimePurchaseOfferDetails() != null) {
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
            str = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
            str3 = oneTimePurchaseOfferDetails.getFormattedPrice();
            str2 = oneTimePurchaseOfferDetails.getOfferToken();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        String normalizeProductDetailsKey = normalizeProductDetailsKey(productId, productType, str2);
        productDetailsCache.put(normalizeProductDetailsKey, productDetails);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", normalizeProductDetailsKey);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("originalJson", jSONObject.toString());
        jSONObject2.put("currencySymbol", parseCurrencySymbol(str3, str));
        return jSONObject2;
    }

    public static ProductDetails toProductDetails(String str) {
        try {
            return productDetailsCache.get(new JSONObject(str).getString("key"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void removeProductDetailsFromCache(ProductDetails productDetails) {
        try {
            productDetailsCache.remove(normalizeProductDetailsKey(productDetails.getProductId(), productDetails.getProductType(), productDetails.getOneTimePurchaseOfferDetails() != null ? productDetails.getOneTimePurchaseOfferDetails().getOfferToken() : null));
        } catch (Exception e) {
            Log.w(TAG, "Remove ProductDetails from cache is failed", e);
        }
    }

    public static List<String> toProductList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    private static String parseCurrencySymbol(String str, String str2) {
        for (Locale locale : Locale.getAvailableLocales()) {
            try {
                Currency currency = Currency.getInstance(locale);
                String symbol = currency.getSymbol(locale);
                if (currency.getCurrencyCode().equals(str2) && str.contains(symbol)) {
                    return symbol;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static String normalizeProductDetailsKey(String str, String str2, String str3) {
        String str4 = str + m.ad + str2;
        return (str3 == null || str3.isEmpty()) ? str4 : str4 + m.ad + str3;
    }
}
