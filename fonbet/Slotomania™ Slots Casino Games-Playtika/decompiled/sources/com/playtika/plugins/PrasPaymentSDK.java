package com.playtika.plugins;

import android.app.Activity;
import android.os.Bundle;
import com.playtika.pras.sdk.IPrasSDK;
import com.playtika.pras.sdk.PrasSDK;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PrasPaymentSDK extends CordovaPlugin {
    private static final String LOG_TAG = "CVD_PrasPaymentSDK";
    private IPrasSDK _sdk;

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            initialize(jSONArray.getJSONObject(0), jSONArray.getString(1), jSONArray.optString(2), jSONArray.optString(3), Boolean.valueOf(jSONArray.optBoolean(4, false)), callbackContext);
            return true;
        }
        if ("getProductDetails".equals(str)) {
            getProductDetails(jSONArray.getJSONArray(0), jSONArray.getString(1), callbackContext);
            return true;
        }
        if ("startPurchase".equals(str)) {
            startPurchase(jSONArray.getString(0), jSONArray.optString(1), jSONArray.getJSONObject(2), callbackContext);
            return true;
        }
        if ("consumePurchase".equals(str)) {
            consumePurchase(jSONArray.getString(0), callbackContext);
            return true;
        }
        if ("getApprovedUnacknowledgedTransactions".equals(str)) {
            getApprovedUnacknowledgedTransactions(callbackContext);
            return true;
        }
        if (!"openPaymentSettings".equals(str)) {
            return false;
        }
        openPaymentSettings(jSONArray.getString(0), callbackContext);
        return true;
    }

    private void initialize(JSONObject jSONObject, String str, String str2, String str3, Boolean bool, final CallbackContext callbackContext) {
        if (this._sdk != null) {
            this._sdk = null;
        }
        Activity activity = this.f3354cordova.getActivity();
        String stringOrDefault = getStringOrDefault(str2, activity.getApplicationContext().getPackageName());
        try {
            Bundle bundle = new Bundle();
            bundle.putString(PrasSDK.APP_USER_ID_KEY, jSONObject.getString(PrasSDK.APP_USER_ID_KEY));
            bundle.putString(PrasSDK.APP_SESSION_ID_KEY, jSONObject.getString(PrasSDK.APP_SESSION_ID_KEY));
            bundle.putString(PrasSDK.APP_USER_TOKEN_KEY, jSONObject.getString(PrasSDK.APP_USER_TOKEN_KEY));
            bundle.putInt(PrasSDK.CLIENT_TYPE_KEY, jSONObject.getInt(PrasSDK.CLIENT_TYPE_KEY));
            bundle.putString(PrasSDK.PLATFORM_KEY, jSONObject.getString(PrasSDK.PLATFORM_KEY));
            PrasSDK.create(activity, bundle, str, stringOrDefault, new PrasSDK.CreateHandlerV2() { // from class: com.playtika.plugins.PrasPaymentSDK.1
                @Override // com.playtika.pras.sdk.PrasSDK.CreateHandlerV2
                public void onCreate(IPrasSDK iPrasSDK) {
                    PrasPaymentSDK.this._sdk = iPrasSDK;
                    callbackContext.success();
                }
            });
        } catch (JSONException e) {
            LOG.e(LOG_TAG, e.getMessage(), e);
            callbackContext.error("JSONException");
        }
    }

    private void getProductDetails(JSONArray jSONArray, String str, final CallbackContext callbackContext) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            this._sdk.getProductDetails(arrayList, new PrasSDK.ResponseHandler() { // from class: com.playtika.plugins.PrasPaymentSDK.2
                @Override // com.playtika.pras.sdk.PrasSDK.ResponseHandler
                public void onResponse(Bundle bundle) {
                    callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, PrasPaymentSDK.convertBundleToObject(bundle)));
                }
            }, str);
        } catch (JSONException e) {
            LOG.e(LOG_TAG, e.getMessage(), e);
            callbackContext.error("JSONException");
        }
    }

    private void startPurchase(String str, String str2, JSONObject jSONObject, final CallbackContext callbackContext) {
        Bundle bundle;
        if (jSONObject != null) {
            try {
                bundle = new Bundle();
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i = 0; i < names.length(); i++) {
                        String string = names.getString(i);
                        bundle.putString(string, jSONObject.getString(string));
                    }
                }
            } catch (JSONException e) {
                callbackContext.error(e.getMessage());
                return;
            }
        } else {
            bundle = null;
        }
        this._sdk.startPurchase(str, getStringOrDefault(str2, null), bundle, new PrasSDK.ResponseHandler() { // from class: com.playtika.plugins.PrasPaymentSDK.3
            @Override // com.playtika.pras.sdk.PrasSDK.ResponseHandler
            public void onResponse(Bundle bundle2) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, PrasPaymentSDK.convertBundleToObject(bundle2)));
            }
        });
    }

    private void consumePurchase(String str, final CallbackContext callbackContext) {
        this._sdk.consumePurchase(str, new PrasSDK.ResponseHandler() { // from class: com.playtika.plugins.PrasPaymentSDK.4
            @Override // com.playtika.pras.sdk.PrasSDK.ResponseHandler
            public void onResponse(Bundle bundle) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, PrasPaymentSDK.convertBundleToObject(bundle)));
            }
        });
    }

    private void getApprovedUnacknowledgedTransactions(final CallbackContext callbackContext) {
        this._sdk.getApprovedUnacknowledgedTransactions(new PrasSDK.ResponseHandler() { // from class: com.playtika.plugins.PrasPaymentSDK.5
            @Override // com.playtika.pras.sdk.PrasSDK.ResponseHandler
            public void onResponse(Bundle bundle) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, PrasPaymentSDK.convertBundleToObject(bundle)));
            }
        });
    }

    private void openPaymentSettings(String str, final CallbackContext callbackContext) {
        this._sdk.openPaymentSettings(new PrasSDK.ResponseHandler() { // from class: com.playtika.plugins.PrasPaymentSDK.6
            @Override // com.playtika.pras.sdk.PrasSDK.ResponseHandler
            public void onResponse(Bundle bundle) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, PrasPaymentSDK.convertBundleToObject(bundle)));
            }
        }, str);
    }

    static JSONObject convertBundleToObject(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static String getStringOrDefault(String str, String str2) {
        return (str == null || str.isEmpty() || AbstractJsonLexerKt.NULL.equals(str)) ? str2 : str;
    }
}
