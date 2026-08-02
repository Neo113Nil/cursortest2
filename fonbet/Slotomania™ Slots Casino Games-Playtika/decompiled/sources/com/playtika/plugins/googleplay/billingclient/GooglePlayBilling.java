package com.playtika.plugins.googleplay.billingclient;

import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingProgramAvailabilityDetails;
import com.android.billingclient.api.BillingProgramAvailabilityListener;
import com.android.billingclient.api.BillingProgramReportingDetails;
import com.android.billingclient.api.BillingProgramReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.LaunchExternalLinkResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.playtika.plugins.googleplay.billingclient.BillingService;
import com.playtika.plugins.googleplay.billingclient.adapters.BillingClientAdapter;
import com.playtika.plugins.googleplay.billingclient.adapters.BillingClientResult;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import java.util.Objects;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class GooglePlayBilling extends CordovaPlugin {
    private static final String TAG = "GooglePlayBilling";
    private CallbackContext _observerCallback;
    private BillingService _service;

    @Override // org.apache.cordova.CordovaPlugin
    public void pluginInitialize() {
        this._service = new BillingService(this.f3354cordova.getActivity(), new IGooglePlayPurchaseObserver() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling.1
            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onInitStarted() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onInitStarted");
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onInitCompleted() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onInitCompleted");
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onInitFailed() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onInitFailed");
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onGetPurchasesCompleted(String str, Boolean bool) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onGetPurchasesCompleted");
                    jSONObject.put("response", str);
                    jSONObject.put("recovery", bool);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onGetPurchasesFailed(String str, Boolean bool) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onGetPurchasesFailed");
                    jSONObject.put("message", str);
                    jSONObject.put("recovery", bool);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onLaunchStoreViewCompleted(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onLaunchStoreViewCompleted");
                    jSONObject.put("response", str);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onLaunchStoreViewFailed(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onLaunchStoreViewFailed");
                    jSONObject.put("message", str);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onPurchaseCompleted(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onPurchaseCompleted");
                    jSONObject.put("response", str);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onPurchaseCanceled(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onPurchaseCanceled");
                    jSONObject.put("response", str);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onPurchaseFailed(String str, String str2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onPurchaseFailed");
                    jSONObject.put("response", str);
                    jSONObject.put("message", str2);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onPurchaseConsumed(Boolean bool) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onPurchaseConsumed");
                    jSONObject.put("recovery", bool);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }

            @Override // com.playtika.plugins.googleplay.billingclient.IGooglePlayPurchaseObserver
            public void onPurchaseConsumeFailed(String str, Boolean bool) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", "onPurchaseConsumeFailed");
                    jSONObject.put("message", str);
                    jSONObject.put("recovery", bool);
                    GooglePlayBilling.this.sendObserverResult(jSONObject);
                } catch (JSONException e) {
                    GooglePlayBilling.this.sendObserverError(e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendObserverResult(JSONObject jSONObject) {
        if (this._observerCallback != null) {
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jSONObject);
            pluginResult.setKeepCallback(true);
            this._observerCallback.sendPluginResult(pluginResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendObserverError(String str) {
        if (this._observerCallback != null) {
            PluginResult pluginResult = new PluginResult(PluginResult.Status.ERROR, str);
            pluginResult.setKeepCallback(true);
            this._observerCallback.sendPluginResult(pluginResult);
        }
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        try {
        } catch (Exception e) {
            callbackContext.error(e.getMessage());
            Log.w(TAG, e.getMessage());
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            initialize(callbackContext);
            return true;
        }
        if ("acknowledgePurchase".equals(str)) {
            acknowledgePurchase(jSONArray.getString(0), callbackContext);
            return true;
        }
        if ("consumePurchase".equals(str)) {
            consumePurchase(jSONArray.getString(0), callbackContext);
            return true;
        }
        if ("queryPurchases".equals(str)) {
            queryPurchases(ItemType.fromInt(jSONArray.getInt(0)), callbackContext);
            return true;
        }
        if ("querySkuDetails".equals(str)) {
            querySkuDetails(DataFormatter.toProductList(jSONArray.getJSONArray(0)), ItemType.fromInt(jSONArray.getInt(1)), callbackContext);
            return true;
        }
        if ("launchBillingFlow".equals(str)) {
            String string = jSONArray.getString(0);
            ProductDetails productDetails = DataFormatter.toProductDetails(string);
            if (productDetails == null) {
                callbackContext.error("ProductDetails not found in cache for arg: " + string);
                return true;
            }
            launchBillingFlow(productDetails, callbackContext);
            return true;
        }
        if ("addPurchaseObserver".equals(str)) {
            this._observerCallback = callbackContext;
            return true;
        }
        if ("getBillingConfigAsync".equals(str)) {
            getBillingConfigAsync(callbackContext);
            return true;
        }
        if ("isExternalContentLinkProgramAvailable".equals(str)) {
            isExternalContentLinkProgramAvailable(callbackContext);
            return true;
        }
        if ("getExternalTransactionToken".equals(str)) {
            getExternalTransactionToken(callbackContext);
            return true;
        }
        if ("launchExternalLink".equals(str)) {
            launchExternalLink(callbackContext, jSONArray.getString(0), ExternalContentLinksUtil.fromIntToType(jSONArray.getInt(1)), ExternalContentLinksUtil.fromIntToMode(jSONArray.getInt(2)));
            return true;
        }
        if ("dispose".equals(str)) {
            dispose(callbackContext);
            return true;
        }
        return false;
    }

    private void initialize(final CallbackContext callbackContext) {
        BillingService billingService = this._service;
        Objects.requireNonNull(callbackContext);
        billingService.initialize(new BillingService.InitializeCallback() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda4
            @Override // com.playtika.plugins.googleplay.billingclient.BillingService.InitializeCallback
            public final void run(byte b) {
                CallbackContext.this.success(b);
            }
        });
    }

    private void dispose(CallbackContext callbackContext) {
        this._service.dispose();
        callbackContext.success();
    }

    private void acknowledgePurchase(String str, final CallbackContext callbackContext) {
        this._service.acknowledgePurchase(str, new AcknowledgePurchaseResponseListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                GooglePlayBilling.lambda$acknowledgePurchase$0(CallbackContext.this, billingResult);
            }
        });
    }

    static /* synthetic */ void lambda$acknowledgePurchase$0(CallbackContext callbackContext, BillingResult billingResult) {
        try {
            callbackContext.success(DataFormatter.fromBillingResult(billingResult));
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void consumePurchase(String str, final CallbackContext callbackContext) {
        this._service.consumePurchase(str, new ConsumeResponseListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda9
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str2) {
                GooglePlayBilling.lambda$consumePurchase$1(CallbackContext.this, billingResult, str2);
            }
        });
    }

    static /* synthetic */ void lambda$consumePurchase$1(CallbackContext callbackContext, BillingResult billingResult, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingResult));
            jSONObject.put(SDKConstants.PARAM_PURCHASE_TOKEN, str);
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void queryPurchases(String str, final CallbackContext callbackContext) {
        this._service.queryPurchases(str, new BillingClientAdapter.BillingClientResultListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda6
            @Override // com.playtika.plugins.googleplay.billingclient.adapters.BillingClientAdapter.BillingClientResultListener
            public final void run(BillingClientResult billingClientResult) {
                GooglePlayBilling.lambda$queryPurchases$2(CallbackContext.this, billingClientResult);
            }
        });
    }

    static /* synthetic */ void lambda$queryPurchases$2(CallbackContext callbackContext, BillingClientResult billingClientResult) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingClientResult.billingResult));
            jSONObject.put("purchaseList", DataFormatter.fromPurchaseList(billingClientResult.purchaseList));
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void querySkuDetails(List<String> list, String str, final CallbackContext callbackContext) {
        this._service.querySkuDetails(list, str, new ProductDetailsResponseListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda8
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                GooglePlayBilling.lambda$querySkuDetails$3(CallbackContext.this, billingResult, queryProductDetailsResult);
            }
        });
    }

    static /* synthetic */ void lambda$querySkuDetails$3(CallbackContext callbackContext, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingResult));
            jSONObject.put("skuDetailsList", DataFormatter.fromProductDetailsList(queryProductDetailsResult));
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void launchBillingFlow(ProductDetails productDetails, final CallbackContext callbackContext) {
        this._service.launchBillingFlow(productDetails, new BillingClientAdapter.BillingClientResultListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda7
            @Override // com.playtika.plugins.googleplay.billingclient.adapters.BillingClientAdapter.BillingClientResultListener
            public final void run(BillingClientResult billingClientResult) {
                GooglePlayBilling.lambda$launchBillingFlow$4(CallbackContext.this, billingClientResult);
            }
        });
    }

    static /* synthetic */ void lambda$launchBillingFlow$4(CallbackContext callbackContext, BillingClientResult billingClientResult) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingClientResult.billingResult));
            jSONObject.put("purchaseList", DataFormatter.fromPurchaseList(billingClientResult.purchaseList));
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void getBillingConfigAsync(final CallbackContext callbackContext) {
        this._service.getBillingConfigAsync(new BillingConfigResponseListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda3
            @Override // com.android.billingclient.api.BillingConfigResponseListener
            public final void onBillingConfigResponse(BillingResult billingResult, BillingConfig billingConfig) {
                GooglePlayBilling.lambda$getBillingConfigAsync$5(CallbackContext.this, billingResult, billingConfig);
            }
        });
    }

    static /* synthetic */ void lambda$getBillingConfigAsync$5(CallbackContext callbackContext, BillingResult billingResult, BillingConfig billingConfig) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingResult));
            jSONObject.put("billingConfig", billingConfig != null ? DataFormatter.fromBillingConfig(billingConfig) : null);
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void isExternalContentLinkProgramAvailable(final CallbackContext callbackContext) {
        this._service.isExternalContentLinkProgramAvailableAsync(new BillingProgramAvailabilityListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda5
            @Override // com.android.billingclient.api.BillingProgramAvailabilityListener
            public final void onBillingProgramAvailabilityResponse(BillingResult billingResult, BillingProgramAvailabilityDetails billingProgramAvailabilityDetails) {
                GooglePlayBilling.lambda$isExternalContentLinkProgramAvailable$6(CallbackContext.this, billingResult, billingProgramAvailabilityDetails);
            }
        });
    }

    static /* synthetic */ void lambda$isExternalContentLinkProgramAvailable$6(CallbackContext callbackContext, BillingResult billingResult, BillingProgramAvailabilityDetails billingProgramAvailabilityDetails) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingResult));
            jSONObject.put("isAvailable", billingResult.getResponseCode() == 0);
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void getExternalTransactionToken(final CallbackContext callbackContext) {
        this._service.getExternalTransactionTokenAsync(new BillingProgramReportingDetailsListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.BillingProgramReportingDetailsListener
            public final void onCreateBillingProgramReportingDetailsResponse(BillingResult billingResult, BillingProgramReportingDetails billingProgramReportingDetails) {
                GooglePlayBilling.lambda$getExternalTransactionToken$7(CallbackContext.this, billingResult, billingProgramReportingDetails);
            }
        });
    }

    static /* synthetic */ void lambda$getExternalTransactionToken$7(CallbackContext callbackContext, BillingResult billingResult, BillingProgramReportingDetails billingProgramReportingDetails) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingResult));
            jSONObject.put("externalToken", DataFormatter.fromBillingReportingDetails(billingProgramReportingDetails));
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void launchExternalLink(final CallbackContext callbackContext, String str, int i, int i2) {
        this._service.launchExternalLinkAsync(str, i, i2, new LaunchExternalLinkResponseListener() { // from class: com.playtika.plugins.googleplay.billingclient.GooglePlayBilling$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.LaunchExternalLinkResponseListener
            public final void onLaunchExternalLinkResponse(BillingResult billingResult) {
                GooglePlayBilling.lambda$launchExternalLink$8(CallbackContext.this, billingResult);
            }
        });
    }

    static /* synthetic */ void lambda$launchExternalLink$8(CallbackContext callbackContext, BillingResult billingResult) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("billingResult", DataFormatter.fromBillingResult(billingResult));
            callbackContext.success(jSONObject);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }
}
