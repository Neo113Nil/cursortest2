package com.appsflyer.reactnative;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.MediationNetwork;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.login.LoginLogger;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RNAppsFlyerModule extends ReactContextBaseJavaModule {
    private Application application;
    private String personalDevKey;
    private ReactApplicationContext reactContext;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public RNAppsFlyerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.application = (Application) reactApplicationContext.getApplicationContext();
        this.personalDevKey = "";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAppsFlyer";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ACHIEVEMENT_UNLOCKED", AFInAppEventType.ACHIEVEMENT_UNLOCKED);
        hashMap.put(ViewHierarchyConstants.ADD_PAYMENT_INFO, AFInAppEventType.ADD_PAYMENT_INFO);
        hashMap.put(ViewHierarchyConstants.ADD_TO_CART, AFInAppEventType.ADD_TO_CART);
        hashMap.put("ADD_TO_WISH_LIST", AFInAppEventType.ADD_TO_WISH_LIST);
        hashMap.put(ViewHierarchyConstants.COMPLETE_REGISTRATION, AFInAppEventType.COMPLETE_REGISTRATION);
        hashMap.put("CONTENT_VIEW", AFInAppEventType.CONTENT_VIEW);
        hashMap.put("INITIATED_CHECKOUT", AFInAppEventType.INITIATED_CHECKOUT);
        hashMap.put("INVITE", AFInAppEventType.INVITE);
        hashMap.put("LEVEL_ACHIEVED", AFInAppEventType.LEVEL_ACHIEVED);
        hashMap.put("LOCATION_CHANGED", AFInAppEventType.LOCATION_CHANGED);
        hashMap.put("LOCATION_COORDINATES", AFInAppEventType.LOCATION_COORDINATES);
        hashMap.put("LOGIN", AFInAppEventType.LOGIN);
        hashMap.put("OPENED_FROM_PUSH_NOTIFICATION", AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION);
        hashMap.put("ORDER_ID", "af_order_id");
        hashMap.put(ViewHierarchyConstants.PURCHASE, AFInAppEventType.PURCHASE);
        hashMap.put("RATE", AFInAppEventType.RATE);
        hashMap.put("RE_ENGAGE", AFInAppEventType.RE_ENGAGE);
        hashMap.put(ViewHierarchyConstants.SEARCH, AFInAppEventType.SEARCH);
        hashMap.put("SHARE", AFInAppEventType.SHARE);
        hashMap.put("SPENT_CREDIT", AFInAppEventType.SPENT_CREDIT);
        hashMap.put("TRAVEL_BOOKING", AFInAppEventType.TRAVEL_BOOKING);
        hashMap.put("TUTORIAL_COMPLETION", AFInAppEventType.TUTORIAL_COMPLETION);
        hashMap.put("UPDATE", AFInAppEventType.UPDATE);
        return hashMap;
    }

    @ReactMethod
    public void initSdkWithCallBack(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            String callSdkInternal = callSdkInternal(readableMap);
            if (callSdkInternal == null) {
                callback.invoke("Success");
            } else {
                callback2.invoke(new Exception(callSdkInternal).getMessage());
            }
        } catch (Exception e) {
            callback2.invoke(e.getMessage());
        }
    }

    @ReactMethod
    public void initSdkWithPromise(ReadableMap readableMap, Promise promise) {
        try {
            String callSdkInternal = callSdkInternal(readableMap);
            if (callSdkInternal == null) {
                promise.resolve("Success");
            } else {
                promise.reject(callSdkInternal, new Exception(callSdkInternal).getMessage());
            }
        } catch (Exception e) {
            promise.reject("AF Unknown Error", e);
        }
    }

    private String callSdkInternal(ReadableMap readableMap) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        String optString = readableMapToJson.optString("devKey", "");
        if (optString.trim().equals("")) {
            return "No 'devKey' found or its empty";
        }
        this.personalDevKey = optString;
        boolean optBoolean = readableMapToJson.optBoolean("isDebug", false);
        appsFlyerLib.setDebugLog(optBoolean);
        boolean optBoolean2 = readableMapToJson.optBoolean("onInstallConversionDataListener", true);
        if (optBoolean) {
            Log.d("AppsFlyer", "Starting SDK");
        }
        boolean optBoolean3 = readableMapToJson.optBoolean("onDeepLinkListener", false);
        boolean optBoolean4 = readableMapToJson.optBoolean("manualStart", false);
        appsFlyerLib.setPluginInfo(new PluginInfo(isExpoApp() ? Plugin.EXPO : Plugin.REACT_NATIVE, "6.15.1"));
        appsFlyerLib.init(optString, optBoolean2 ? registerConversionListener() : null, this.application.getApplicationContext());
        if (optBoolean3) {
            appsFlyerLib.subscribeForDeepLink(registerDeepLinkListener());
        }
        if (!optBoolean4) {
            startSdk();
        }
        return null;
    }

    private boolean isExpoApp() {
        try {
            Class.forName("expo.modules.devmenu.react.DevMenuAwareReactActivity");
            return true;
        } catch (ClassNotFoundException | Exception unused) {
            return false;
        }
    }

    private DeepLinkListener registerDeepLinkListener() {
        return new DeepLinkListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.1
            /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:9:0x006e). Please report as a decompilation issue!!! */
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                JSONObject jSONObject;
                ?? jSONObject2 = new JSONObject();
                DeepLinkResult.Error error = deepLinkResult.getError();
                try {
                    jSONObject2.put("deepLinkStatus", deepLinkResult.getStatus());
                    jSONObject2.put("status", "success");
                    jSONObject2.put("type", "onDeepLinking");
                    if (error != null && deepLinkResult.getStatus() == DeepLinkResult.Status.ERROR) {
                        jSONObject2.put("status", LoginLogger.EVENT_EXTRAS_FAILURE);
                        jSONObject2.put("data", error.toString());
                        jSONObject2.put("isDeferred", false);
                        jSONObject = jSONObject2;
                    } else if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                        jSONObject2.put("data", deepLinkResult.getDeepLink().getClickEvent());
                        jSONObject2.put("isDeferred", deepLinkResult.getDeepLink().isDeferred());
                        jSONObject = jSONObject2;
                    } else {
                        jSONObject2.put("data", "deep link not found");
                        jSONObject2.put("isDeferred", false);
                        jSONObject = jSONObject2;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                }
                try {
                    RNAppsFlyerModule rNAppsFlyerModule = RNAppsFlyerModule.this;
                    ReactApplicationContext reactApplicationContext = rNAppsFlyerModule.reactContext;
                    jSONObject2 = jSONObject.toString();
                    rNAppsFlyerModule.sendEvent(reactApplicationContext, "onDeepLinking", jSONObject2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    private AppsFlyerConversionListener registerConversionListener() {
        return new AppsFlyerConversionListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.2
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                RNAppsFlyerModule.this.handleSuccess("onAppOpenAttribution", null, map);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                RNAppsFlyerModule.this.handleError("onAttributionFailure", str);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                RNAppsFlyerModule.this.handleSuccess("onInstallConversionDataLoaded", map, null);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                RNAppsFlyerModule.this.handleError("onInstallConversionFailure", str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSuccess(String str, Map<String, Object> map, Map<String, String> map2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (map == null) {
                map = map2;
            }
            JSONObject jSONObject2 = new JSONObject(map);
            jSONObject.put("status", "success");
            jSONObject.put("type", str);
            jSONObject.put("data", jSONObject2);
            if (str.equals("onInstallConversionDataLoaded")) {
                sendEvent(this.reactContext, "onInstallConversionDataLoaded", jSONObject.toString());
            } else if (str.equals("onAppOpenAttribution")) {
                sendEvent(this.reactContext, "onAppOpenAttribution", jSONObject.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", LoginLogger.EVENT_EXTRAS_FAILURE);
            jSONObject.put("type", str);
            jSONObject.put("data", str2);
            sendEvent(this.reactContext, "onInstallConversionDataLoaded", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @ReactMethod
    public void startSdk() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            AppsFlyerLib.getInstance().start(currentActivity, this.personalDevKey);
        } else {
            AppsFlyerLib.getInstance().logEvent(this.application, null, null);
            AppsFlyerLib.getInstance().start(this.application, this.personalDevKey);
        }
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, final Callback callback, final Callback callback2) {
        try {
            if (str.trim().equals("")) {
                callback2.invoke("No 'eventName' found or its empty");
                return;
            }
            Map<String, Object> map = RNUtil.toMap(readableMap);
            if (map == null) {
                map = new HashMap<>();
            }
            if (getCurrentActivity() != null) {
                AppsFlyerLib.getInstance().logEvent(getCurrentActivity(), str, map, new AppsFlyerRequestListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.3
                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onSuccess() {
                        callback.invoke("Success");
                    }

                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onError(int i, String str2) {
                        callback2.invoke(str2);
                    }
                });
            }
        } catch (Exception e) {
            callback2.invoke(e.getMessage());
        }
    }

    @ReactMethod
    public void logEventWithPromise(String str, ReadableMap readableMap, final Promise promise) {
        try {
            if (str.trim().equals("")) {
                promise.reject("No 'eventName' found or its empty", new Exception("No 'eventName' found or its empty").getMessage());
                return;
            }
            Map<String, Object> map = RNUtil.toMap(readableMap);
            if (map == null) {
                map = new HashMap<>();
            }
            if (getCurrentActivity() != null) {
                AppsFlyerLib.getInstance().logEvent(getCurrentActivity(), str, map, new AppsFlyerRequestListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.4
                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onSuccess() {
                        promise.resolve("Success");
                    }

                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onError(int i, String str2) {
                        promise.reject(str2);
                    }
                });
            }
        } catch (Exception e) {
            promise.reject("AF Unknown Error", e);
        }
    }

    @ReactMethod
    public void logAdRevenue(ReadableMap readableMap) {
        if (readableMap == null || !readableMap.keySetIterator().hasNextKey()) {
            Log.d("AppsFlyer", "adRevenueData is missing, the data is mandatory to use this API.");
            return;
        }
        String string = readableMap.getString("monetizationNetwork");
        if (string == null) {
            Log.d("AppsFlyer", "monetizationNetwork is missing");
            return;
        }
        String string2 = readableMap.getString("currencyIso4217Code");
        if (string2 == null) {
            Log.d("AppsFlyer", "currencyIso4217Code is missing");
            return;
        }
        if (!readableMap.hasKey("revenue") || readableMap.getType("revenue") != ReadableType.Number) {
            Log.d("AppsFlyer", "revenue is missing or not a number");
            return;
        }
        double d = readableMap.getDouble("revenue");
        ReadableMap map = (readableMap.hasKey("additionalParameters") && readableMap.getType("additionalParameters") == ReadableType.Map) ? readableMap.getMap("additionalParameters") : null;
        String string3 = readableMap.getString("mediationNetwork");
        if (string3 == null || string3.isEmpty()) {
            Log.d("AppsFlyer", "mediationNetwork is missing");
            return;
        }
        MediationNetwork valueOf = MediationNetwork.valueOf(string3.toUpperCase());
        if (valueOf == null) {
            Log.d("AppsFlyer", "Invalid mediation network");
        } else {
            AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData(string, valueOf, string2, d), RNUtil.toMap(map));
        }
    }

    @ReactMethod
    public void getAppsFlyerUID(Callback callback) {
        callback.invoke(null, AppsFlyerLib.getInstance().getAppsFlyerUID(getReactApplicationContext()));
    }

    @ReactMethod
    public void updateServerUninstallToken(String str, Callback callback) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(getReactApplicationContext(), str);
        if (callback != null) {
            callback.invoke("Success");
        }
    }

    @ReactMethod
    public void setCustomerUserId(String str, Callback callback) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
        callback.invoke("Success");
    }

    @ReactMethod
    public void setCollectIMEI(boolean z, Callback callback) {
        AppsFlyerLib.getInstance().setCollectIMEI(z);
        if (callback != null) {
            callback.invoke("Success");
        }
    }

    @ReactMethod
    public void setCollectAndroidID(boolean z, Callback callback) {
        AppsFlyerLib.getInstance().setCollectAndroidID(z);
        if (callback != null) {
            callback.invoke("Success");
        }
    }

    @ReactMethod
    public void stop(boolean z, Callback callback) {
        AppsFlyerLib.getInstance().stop(z, getReactApplicationContext());
        callback.invoke("Success");
    }

    @ReactMethod
    public void setAdditionalData(ReadableMap readableMap, Callback callback) {
        try {
            Map map = RNUtil.toMap(readableMap);
            if (map == null) {
                map = new HashMap();
            }
            AppsFlyerLib.getInstance().setAdditionalData(new HashMap(map));
            callback.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void setUserEmails(ReadableMap readableMap, Callback callback, Callback callback2) {
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        int optInt = readableMapToJson.optInt("emailsCryptType", 0);
        JSONArray optJSONArray = readableMapToJson.optJSONArray("emails");
        if (optJSONArray.length() == 0) {
            callback2.invoke(new Exception("No arguments found or list is corrupted").getMessage());
            return;
        }
        AppsFlyerProperties.EmailsCryptType emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        AppsFlyerProperties.EmailsCryptType[] values = AppsFlyerProperties.EmailsCryptType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AppsFlyerProperties.EmailsCryptType emailsCryptType2 = values[i];
            if (emailsCryptType2.getValue() == optInt) {
                emailsCryptType = emailsCryptType2;
                break;
            }
            i++;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            try {
                strArr[i2] = optJSONArray.getString(i2);
            } catch (JSONException e) {
                e.printStackTrace();
                callback2.invoke(new Exception("No arguments found or list is corrupted").getMessage());
                return;
            }
        }
        AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, strArr);
        callback.invoke("Success");
    }

    @ReactMethod
    public void setAppInviteOneLinkID(String str, Callback callback) {
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
        callback.invoke("Success");
    }

    @ReactMethod
    public void setCurrencyCode(String str, Callback callback) {
        AppsFlyerLib.getInstance().setCurrencyCode(str);
        callback.invoke("Success");
    }

    @ReactMethod
    public void generateInviteLink(ReadableMap readableMap, final Callback callback, final Callback callback2) {
        LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(getReactApplicationContext());
        try {
            JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
            String optString = readableMapToJson.optString(AppsFlyerProperties.CHANNEL, "");
            String optString2 = readableMapToJson.optString("campaign", "");
            String optString3 = readableMapToJson.optString("referrerName", "");
            String optString4 = readableMapToJson.optString("referreImageURL", "");
            String optString5 = readableMapToJson.optString("customerID", "");
            String optString6 = readableMapToJson.optString("baseDeepLink", "");
            String optString7 = readableMapToJson.optString("brandDomain", "");
            if (optString != null && optString != "") {
                generateInviteUrl.setChannel(optString);
            }
            if (optString2 != null && optString2 != "") {
                generateInviteUrl.setCampaign(optString2);
            }
            if (optString3 != null && optString3 != "") {
                generateInviteUrl.setReferrerName(optString3);
            }
            if (optString4 != null && optString4 != "") {
                generateInviteUrl.setReferrerImageURL(optString4);
            }
            if (optString5 != null && optString5 != "") {
                generateInviteUrl.setReferrerCustomerId(optString5);
            }
            if (optString6 != null && optString6 != "") {
                generateInviteUrl.setBaseDeeplink(optString6);
            }
            if (optString7 != null && optString7 != "") {
                generateInviteUrl.setBrandDomain(optString7);
            }
            if (readableMapToJson.length() > 1 && !readableMapToJson.get("userParams").equals("")) {
                JSONObject jSONObject = readableMapToJson.getJSONObject("userParams");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    generateInviteUrl.addParameter(next, jSONObject.get(next).toString());
                }
            }
        } catch (JSONException unused) {
        }
        generateInviteUrl.generateLink(getReactApplicationContext(), new CreateOneLinkHttpTask.ResponseListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.5
            @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
            public void onResponse(String str) {
                callback.invoke(str);
            }

            @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
            public void onResponseError(String str) {
                callback2.invoke(str);
            }
        });
    }

    @ReactMethod
    public void logCrossPromotionImpression(String str, String str2, ReadableMap readableMap) {
        try {
            CrossPromotionHelper.logCrossPromoteImpression(getReactApplicationContext(), str, str2, RNUtil.toMap(readableMap));
        } catch (Exception unused) {
            CrossPromotionHelper.logCrossPromoteImpression(getReactApplicationContext(), str, str2);
        }
    }

    @ReactMethod
    public void logCrossPromotionAndOpenStore(String str, String str2, ReadableMap readableMap) {
        Map<String, Object> map;
        try {
            map = RNUtil.toMap(readableMap);
        } catch (Exception unused) {
            map = null;
        }
        CrossPromotionHelper.logAndOpenStore(getReactApplicationContext(), str, str2, map);
    }

    @ReactMethod
    public void anonymizeUser(boolean z, Callback callback) {
        AppsFlyerLib.getInstance().anonymizeUser(z);
        callback.invoke("Success");
    }

    @ReactMethod
    public void setOneLinkCustomDomains(ReadableArray readableArray, Callback callback, Callback callback2) {
        if (readableArray.size() <= 0) {
            callback2.invoke("No arguments found or list is corrupted");
            return;
        }
        List<Object> list = RNUtil.toList(readableArray);
        try {
            AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[]) list.toArray(new String[list.size()]));
            callback.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callback2.invoke("No arguments found or list is corrupted");
        }
    }

    @ReactMethod
    public void setResolveDeepLinkURLs(ReadableArray readableArray, Callback callback, Callback callback2) {
        if (readableArray.size() <= 0) {
            callback2.invoke("No arguments found or list is corrupted");
            return;
        }
        List<Object> list = RNUtil.toList(readableArray);
        try {
            AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[]) list.toArray(new String[list.size()]));
            callback.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callback2.invoke("No arguments found or list is corrupted");
        }
    }

    @ReactMethod
    public void performOnAppAttribution(String str, Callback callback, Callback callback2) {
        try {
            URI create = URI.create(str);
            AppsFlyerLib.getInstance().performOnAppAttribution(this.application.getApplicationContext(), create);
            callback.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callback2.invoke("Passed string is not a valid URI");
        }
    }

    @ReactMethod
    public void setSharingFilterForPartners(ReadableArray readableArray) {
        List<Object> list = RNUtil.toList(readableArray);
        if (list == null) {
            AppsFlyerLib.getInstance().setSharingFilterForPartners(null);
            return;
        }
        try {
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[]) list.toArray(new String[list.size()]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void logLocation(double d, double d2, Callback callback) {
        AppsFlyerLib.getInstance().logLocation(getReactApplicationContext(), d2, d);
        callback.invoke("Success");
    }

    @ReactMethod
    public void validateAndLogInAppPurchase(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            readableMap.hasKey("additionalParameters");
            JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
            String optString = readableMapToJson.optString("publicKey", "");
            String optString2 = readableMapToJson.optString("signature", "");
            String optString3 = readableMapToJson.optString("purchaseData", "");
            String optString4 = readableMapToJson.optString(FirebaseAnalytics.Param.PRICE, "");
            String optString5 = readableMapToJson.optString("currency", "");
            Map<String, String> jsonObjectToMap = readableMap.hasKey("additionalParameters") ? RNUtil.jsonObjectToMap(readableMapToJson.optJSONObject("additionalParameters")) : null;
            if (optString == "" || optString2 == "" || optString3 == "" || optString4 == "" || optString5 == "") {
                callback2.invoke("Please provide purchase parameters");
            } else {
                initInAppPurchaseValidatorListener(callback, callback2);
                AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.reactContext, optString, optString2, optString3, optString4, optString5, jsonObjectToMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            callback2.invoke(e);
        }
    }

    @ReactMethod
    public void initInAppPurchaseValidatorListener(final Callback callback, final Callback callback2) {
        AppsFlyerLib.getInstance().registerValidatorListener(this.reactContext, new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.6
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                callback.invoke("In-App Purchase Validation success");
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str) {
                callback2.invoke("In-App Purchase Validation failed with error: " + str);
            }
        });
    }

    @ReactMethod
    public void sendPushNotificationData(ReadableMap readableMap, Callback callback) {
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        if (readableMapToJson == null) {
            handleErrorMessage("PushNotification payload is null", callback);
            return;
        }
        try {
            Bundle jsonToBundle = RNUtil.jsonToBundle(readableMapToJson);
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                if (intent != null) {
                    intent.putExtras(jsonToBundle);
                    currentActivity.setIntent(intent);
                    AppsFlyerLib.getInstance().sendPushNotificationData(currentActivity);
                    return;
                }
                handleErrorMessage("The intent is null. Push payload has not been sent!", callback);
                return;
            }
            handleErrorMessage("The activity is null. Push payload has not been sent!", callback);
        } catch (JSONException e) {
            e.printStackTrace();
            handleErrorMessage("Can't parse pushPayload to bundle", callback);
        }
    }

    private void handleErrorMessage(String str, Callback callback) {
        Log.d("AppsFlyer", str);
        if (callback != null) {
            callback.invoke(str);
        }
    }

    @ReactMethod
    public void setHost(String str, String str2, Callback callback) {
        AppsFlyerLib.getInstance().setHost(str, str2);
        callback.invoke("Success");
    }

    @ReactMethod
    public void addPushNotificationDeepLinkPath(ReadableArray readableArray, Callback callback, Callback callback2) {
        if (readableArray.size() <= 0) {
            callback2.invoke("No arguments found or list is corrupted");
            return;
        }
        List<Object> list = RNUtil.toList(readableArray);
        try {
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[]) list.toArray(new String[list.size()]));
            callback.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callback2.invoke(e);
        }
    }

    @ReactMethod
    public void disableAdvertisingIdentifier(Boolean bool) {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(bool.booleanValue());
    }

    @ReactMethod
    public void setPartnerData(String str, ReadableMap readableMap) {
        AppsFlyerLib.getInstance().setPartnerData(str, RNUtil.toMap(readableMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactMethod
    public void appendParametersToDeepLinkingURL(String str, ReadableMap readableMap) {
        AppsFlyerLib.getInstance().appendParametersToDeepLinkingURL(str, RNUtil.toMap(readableMap));
    }

    @ReactMethod
    public void setDisableNetworkData(Boolean bool) {
        AppsFlyerLib.getInstance().setDisableNetworkData(bool.booleanValue());
    }

    @ReactMethod
    public void performOnDeepLinking() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.d("AppsFlyer", "performOnDeepLinking: activity is null!");
            return;
        }
        Intent intent = currentActivity.getIntent();
        if (intent == null) {
            Log.d("AppsFlyer", "performOnDeepLinking: intent is null!");
        } else {
            AppsFlyerLib.getInstance().performOnDeepLinking(intent, this.application);
        }
    }

    @ReactMethod
    public void enableTCFDataCollection(Boolean bool) {
        AppsFlyerLib.getInstance().enableTCFDataCollection(bool.booleanValue());
    }

    @ReactMethod
    public void setConsentData(ReadableMap readableMap) {
        AppsFlyerConsent forNonGDPRUser;
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        boolean optBoolean = readableMapToJson.optBoolean("isUserSubjectToGDPR");
        boolean optBoolean2 = readableMapToJson.optBoolean("hasConsentForDataUsage");
        boolean optBoolean3 = readableMapToJson.optBoolean("hasConsentForAdsPersonalization");
        if (optBoolean) {
            forNonGDPRUser = AppsFlyerConsent.forGDPRUser(optBoolean2, optBoolean3);
        } else {
            forNonGDPRUser = AppsFlyerConsent.forNonGDPRUser();
        }
        AppsFlyerLib.getInstance().setConsentData(forNonGDPRUser);
    }
}
