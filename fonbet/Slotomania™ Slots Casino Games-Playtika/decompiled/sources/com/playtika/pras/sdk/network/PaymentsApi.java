package com.playtika.pras.sdk.network;

import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.ServerError;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.playtika.pras.d.a;
import com.playtika.pras.d.b;
import com.playtika.pras.sdk.PrasSDK;
import com.playtika.pras.sdk.network.models.Products;
import com.playtika.pras.sdk.network.models.Purchases;
import com.playtika.pras.sdk.network.models.results.BillingResult;
import com.playtika.pras.sdk.network.models.results.GetPurchasesResult;
import com.playtika.pras.sdk.network.models.results.ProductDetailsResult;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PaymentsApi {
    private final String appSessionId;
    private final String appUserId;
    private final a es;
    private final String networkType;
    private final String packageName;
    private final String userToken;
    private final int PPS_REQUEST_DEFAULT_TIMEOUT = 30000;
    private final int PPS_REQUEST_DEFAULT_RETRIES_NUMBER = 0;

    public PaymentsApi(String str, String str2, String str3, String str4, a aVar, String str5) {
        this.appUserId = str2;
        this.packageName = str;
        this.appSessionId = str3;
        this.userToken = str4;
        this.es = aVar;
        this.networkType = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseCode getErrorCodeFromException(Exception exc) {
        NetworkResponse networkResponse;
        return ((exc.getCause() instanceof ServerError) && (networkResponse = ((ServerError) exc.getCause()).networkResponse) != null && networkResponse.statusCode == 503) ? ResponseCode.RESULT_SERVICE_UNAVAILABLE : ResponseCode.RESULT_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAnalyticsErrorEvent(String str, String str2) {
        a aVar = this.es;
        if (aVar != null) {
            aVar.a("request_error", str, str2, b.SDK_PAYMENT_API, false);
        }
    }

    public void consumePurchase(String str, String str2, final PrasSDK.ResponseHandler responseHandler, final String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
            jSONObject.put(SDKConstants.PARAM_PURCHASE_TOKEN, str3);
            PPSJsonRequest pPSJsonRequest = new PPSJsonRequest(str, jSONObject, new NetworkApiListener<ApiResponse>() { // from class: com.playtika.pras.sdk.network.PaymentsApi.2
                @Override // com.playtika.pras.sdk.network.NetworkApiListener
                public void onResponse(ApiResponse apiResponse) {
                    PPSResponse pPSResponse;
                    if (apiResponse.getException() == null) {
                        try {
                            pPSResponse = new PPSResponse(apiResponse.getResponseData());
                            if (pPSResponse.getResponseCode() != ResponseCode.RESULT_OK) {
                                PaymentsApi.this.sendAnalyticsErrorEvent("consumePurchase:" + str3, "response code: " + pPSResponse.getResponseCode().getCode());
                            }
                        } catch (Exception e) {
                            pPSResponse = new PPSResponse(PaymentsApi.this.getErrorCodeFromException(e));
                            PaymentsApi.this.sendAnalyticsErrorEvent("consumePurchase:" + str3, e.getMessage());
                        }
                    } else {
                        PaymentsApi.this.sendAnalyticsErrorEvent("consumePurchase:" + str3, apiResponse.getException().getMessage());
                        pPSResponse = new PPSResponse(PaymentsApi.this.getErrorCodeFromException(apiResponse.getException()));
                    }
                    responseHandler.onResponse(new BillingResult(pPSResponse).toBundle());
                }
            }, this.networkType);
            pPSJsonRequest.setTag(str2);
            NetworkApi.getInstance().addRequest(pPSJsonRequest, 30000, 0);
        } catch (JSONException e) {
            responseHandler.onResponse(new BillingResult(ResponseCode.RESULT_DEVELOPER_ERROR).toBundle());
            sendAnalyticsErrorEvent("consumePurchase:" + str3, "Invalid params: " + e.getMessage());
        }
    }

    public void getProductDetails(String str, String str2, final PrasSDK.ResponseHandler responseHandler, ArrayList<String> arrayList, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
            jSONObject.put("skus", new JSONArray((Collection) arrayList));
            jSONObject.put("appUid", this.appUserId);
            if (str3 != null) {
                jSONObject.put(Device.JsonKeys.LOCALE, str3);
            }
            PPSJsonRequest pPSJsonRequest = new PPSJsonRequest(str, jSONObject, new NetworkApiListener<ApiResponse>() { // from class: com.playtika.pras.sdk.network.PaymentsApi.1
                @Override // com.playtika.pras.sdk.network.NetworkApiListener
                public void onResponse(ApiResponse apiResponse) {
                    Products products;
                    if (apiResponse.getException() == null) {
                        try {
                            products = new Products(apiResponse.getResponseData());
                            if (products.getResponseCode() != ResponseCode.RESULT_OK) {
                                PaymentsApi.this.sendAnalyticsErrorEvent("getProductDetails", "response code:" + products.getResponseCode().getCode());
                            }
                        } catch (Exception e) {
                            PaymentsApi.this.sendAnalyticsErrorEvent("getProductDetails", e.getMessage());
                            products = new Products(PaymentsApi.this.getErrorCodeFromException(e));
                        }
                    } else {
                        PaymentsApi.this.sendAnalyticsErrorEvent("getProductDetails", apiResponse.getException().getMessage());
                        products = new Products(PaymentsApi.this.getErrorCodeFromException(apiResponse.getException()));
                    }
                    responseHandler.onResponse(new ProductDetailsResult(products).toBundle());
                }
            }, this.networkType);
            pPSJsonRequest.setTag(str2);
            NetworkApi.getInstance().addRequest(pPSJsonRequest, 30000, 0);
        } catch (JSONException e) {
            sendAnalyticsErrorEvent("getProductDetails", e.getMessage());
            responseHandler.onResponse(new BillingResult(ResponseCode.RESULT_DEVELOPER_ERROR).toBundle());
        }
    }

    public void getPurchases(String str, String str2, final PrasSDK.ResponseHandler responseHandler, JSONObject jSONObject, final String str3, String str4) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
            jSONObject2.put("appUid", this.appUserId);
            if (!TextUtils.isEmpty(this.appSessionId)) {
                jSONObject2.put(JsonStorageKeyNames.SESSION_ID_KEY, this.appSessionId);
            }
            if (!TextUtils.isEmpty(this.userToken)) {
                jSONObject2.put("userToken", this.userToken);
            }
            jSONObject2.put("device", jSONObject);
            if (str4 != null) {
                jSONObject2.put("type", str4);
            }
            PPSJsonRequest pPSJsonRequest = new PPSJsonRequest(str, jSONObject2, new NetworkApiListener<ApiResponse>() { // from class: com.playtika.pras.sdk.network.PaymentsApi.3
                @Override // com.playtika.pras.sdk.network.NetworkApiListener
                public void onResponse(ApiResponse apiResponse) {
                    Purchases purchases;
                    if (apiResponse.getException() == null) {
                        try {
                            purchases = new Purchases(apiResponse.getResponseData());
                        } catch (Exception e) {
                            purchases = new Purchases(PaymentsApi.this.getErrorCodeFromException(e));
                            PaymentsApi.this.sendAnalyticsErrorEvent(str3, e.getMessage());
                        }
                        if (purchases.getResponseCode() != ResponseCode.RESULT_OK) {
                            PaymentsApi.this.sendAnalyticsErrorEvent(str3, "response code:" + purchases.getResponseCode().getCode());
                        }
                    } else {
                        purchases = new Purchases(PaymentsApi.this.getErrorCodeFromException(apiResponse.getException()));
                        PaymentsApi.this.sendAnalyticsErrorEvent(str3, apiResponse.getException().getMessage());
                    }
                    responseHandler.onResponse(new GetPurchasesResult(purchases).toBundle());
                }
            }, this.networkType);
            pPSJsonRequest.setTag(str2);
            NetworkApi.getInstance().addRequest(pPSJsonRequest, 30000, 0);
        } catch (JSONException e) {
            responseHandler.onResponse(new BillingResult(ResponseCode.RESULT_DEVELOPER_ERROR).toBundle());
            sendAnalyticsErrorEvent(str3, "Invalid params: " + e.getMessage());
        }
    }
}
