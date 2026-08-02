package com.appsflyer.cordova.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import com.facebook.login.LoginLogger;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AppsFlyerPlugin extends CordovaPlugin {
    private Activity c;
    private CallbackContext mConversionListener = null;
    private CallbackContext mAttributionDataListener = null;
    private Map<String, String> mAttributionData = null;
    private CallbackContext mInviteListener = null;
    private Uri intentURI = null;
    private Uri newIntentURI = null;
    private CallbackContext mDeepLinkListener = null;

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onNewIntent(Intent intent) {
        this.f3354cordova.getActivity().setIntent(intent);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        Log.d("AppsFlyer", "Executing...");
        if ("setCurrencyCode".equals(str)) {
            return setCurrencyCode(jSONArray);
        }
        if ("setOutOfStore".equals(str)) {
            return setOutOfStore(jSONArray);
        }
        if ("registerOnAppOpenAttribution".equals(str)) {
            return registerOnAppOpenAttribution(callbackContext);
        }
        if ("registerDeepLink".equals(str)) {
            return registerDeepLink(callbackContext);
        }
        if ("setAppUserId".equals(str)) {
            return setAppUserId(jSONArray, callbackContext);
        }
        if ("getAppsFlyerUID".equals(str)) {
            return getAppsFlyerUID(callbackContext);
        }
        if ("anonymizeUser".equals(str)) {
            return anonymizeUser(jSONArray);
        }
        if ("Stop".equals(str)) {
            return stop(jSONArray);
        }
        if ("initSdk".equals(str)) {
            return initSdk(jSONArray, callbackContext);
        }
        if ("logEvent".equals(str)) {
            return logEvent(jSONArray, callbackContext);
        }
        if ("updateServerUninstallToken".equals(str)) {
            return updateServerUninstallToken(jSONArray, callbackContext);
        }
        if ("setAppInviteOneLinkID".equals(str)) {
            return setAppInviteOneLinkID(jSONArray, callbackContext);
        }
        if ("generateInviteLink".equals(str)) {
            return generateInviteLink(jSONArray, callbackContext);
        }
        if ("logCrossPromotionImpression".equals(str)) {
            return logCrossPromotionImpression(jSONArray, callbackContext);
        }
        if ("logCrossPromotionAndOpenStore".equals(str)) {
            return logAndOpenStore(jSONArray, callbackContext);
        }
        if ("resumeSDK".equals(str)) {
            return onResume(jSONArray, callbackContext);
        }
        if ("getSdkVersion".equals(str)) {
            return getSdkVersion(callbackContext);
        }
        if ("setSharingFilter".equals(str)) {
            return setSharingFilter(jSONArray, callbackContext);
        }
        if ("setSharingFilterForAllPartners".equals(str)) {
            return setSharingFilterForAllPartners(callbackContext);
        }
        if ("validateAndLogInAppPurchase".equals(str)) {
            return validateAndLogInAppPurchase(jSONArray, callbackContext);
        }
        if ("setOneLinkCustomDomains".equals(str)) {
            return setOneLinkCustomDomains(jSONArray, callbackContext);
        }
        if ("addPushNotificationDeepLinkPath".equals(str)) {
            return addPushNotificationDeepLinkPath(jSONArray);
        }
        if ("setResolveDeepLinkURLs".equals(str)) {
            return setResolveDeepLinkURLs(jSONArray);
        }
        return false;
    }

    private boolean registerDeepLink(CallbackContext callbackContext) {
        this.mDeepLinkListener = callbackContext;
        return true;
    }

    private boolean registerOnAppOpenAttribution(CallbackContext callbackContext) {
        this.mAttributionDataListener = callbackContext;
        return true;
    }

    private boolean initSdk(JSONArray jSONArray, final CallbackContext callbackContext) {
        AppsFlyerConversionListener appsFlyerConversionListener;
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            String optString = jSONObject.optString("devKey", "");
            if (optString.trim().equals("")) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "AppsFlyer 'devKey' is missing or empty"));
            }
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, false);
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            boolean optBoolean = jSONObject.optBoolean("onInstallConversionDataListener", false);
            boolean optBoolean2 = jSONObject.optBoolean("isDebug", false);
            boolean optBoolean3 = jSONObject.optBoolean("onDeepLinkListener", false);
            boolean optBoolean4 = jSONObject.optBoolean("shouldStartSdk", true);
            if (jSONObject.has("collectAndroidID")) {
                AppsFlyerLib.getInstance().setCollectAndroidID(jSONObject.optBoolean("collectAndroidID", true));
            }
            if (jSONObject.has(AppsFlyerProperties.COLLECT_IMEI)) {
                AppsFlyerLib.getInstance().setCollectIMEI(jSONObject.optBoolean(AppsFlyerProperties.COLLECT_IMEI, true));
            }
            if (optBoolean3) {
                appsFlyerLib.subscribeForDeepLink(registerDeepLinkListener());
            }
            setPluginInfo();
            appsFlyerLib.setDebugLog(optBoolean2);
            if (optBoolean2) {
                Log.d("AppsFlyer", "Starting Tracking");
            }
            if (optBoolean) {
                if (this.mConversionListener == null) {
                    this.mConversionListener = callbackContext;
                }
                appsFlyerConversionListener = registerConversionListener(appsFlyerLib);
            } else {
                appsFlyerConversionListener = null;
            }
            appsFlyerLib.init(optString, appsFlyerConversionListener, this.f3354cordova.getActivity());
            if (optBoolean4) {
                if (this.mConversionListener == null) {
                    appsFlyerLib.start(this.f3354cordova.getActivity(), optString, new AppsFlyerRequestListener() { // from class: com.appsflyer.cordova.plugin.AppsFlyerPlugin.1
                        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                        public void onSuccess() {
                            callbackContext.success("Success");
                        }

                        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                        public void onError(int i, String str) {
                            callbackContext.error("Failure");
                        }
                    });
                } else {
                    startSdk();
                }
            }
            if (appsFlyerConversionListener != null) {
                sendPluginNoResult(callbackContext);
            } else {
                callbackContext.success("Success");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean startSdk() {
        AppsFlyerLib.getInstance().start(this.f3354cordova.getActivity());
        return true;
    }

    private void setPluginInfo() {
        AppsFlyerLib.getInstance().setPluginInfo(new PluginInfo(Plugin.CORDOVA, "6.16.2"));
    }

    private DeepLinkListener registerDeepLinkListener() {
        return new DeepLinkListener() { // from class: com.appsflyer.cordova.plugin.AppsFlyerPlugin.2
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                try {
                    DeepLinkResult.Error error = deepLinkResult.getError();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("deepLinkStatus", deepLinkResult.getStatus());
                    jSONObject.put("type", "onDeepLinking");
                    if (error != null) {
                        jSONObject.put("status", LoginLogger.EVENT_EXTRAS_FAILURE);
                        jSONObject.put("data", error.toString());
                    } else {
                        jSONObject.put("status", "success");
                        if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                            jSONObject.put("data", deepLinkResult.getDeepLink().getClickEvent());
                            jSONObject.put("isDeferred", deepLinkResult.getDeepLink().isDeferred());
                        }
                    }
                    AppsFlyerPlugin.this.sendEvent(jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if ((jSONObject.optString("type") == "onAttributionFailure" || jSONObject.optString("type") == "onAppOpenAttribution") && this.mAttributionDataListener != null) {
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jSONObject2);
            pluginResult.setKeepCallback(true);
            this.mAttributionDataListener.sendPluginResult(pluginResult);
        } else if ((jSONObject.optString("type") == "onInstallConversionDataLoaded" || jSONObject.optString("type") == "onInstallConversionFailure") && this.mConversionListener != null) {
            PluginResult pluginResult2 = new PluginResult(PluginResult.Status.OK, jSONObject2);
            pluginResult2.setKeepCallback(true);
            this.mConversionListener.sendPluginResult(pluginResult2);
        } else {
            if (jSONObject.optString("type") != "onDeepLinking" || this.mDeepLinkListener == null) {
                return;
            }
            PluginResult pluginResult3 = new PluginResult(PluginResult.Status.OK, jSONObject2);
            pluginResult3.setKeepCallback(true);
            this.mDeepLinkListener.sendPluginResult(pluginResult3);
        }
    }

    private AppsFlyerConversionListener registerConversionListener(AppsFlyerLib appsFlyerLib) {
        return new AppsFlyerConversionListener() { // from class: com.appsflyer.cordova.plugin.AppsFlyerPlugin.3
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                handleSuccess("onInstallConversionDataLoaded", map, null);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                handleError("onInstallConversionFailure", str);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                AppsFlyerPlugin.this.mAttributionData = map;
                AppsFlyerPlugin appsFlyerPlugin = AppsFlyerPlugin.this;
                appsFlyerPlugin.intentURI = appsFlyerPlugin.c.getIntent().getData();
                handleSuccess("onAppOpenAttribution", null, AppsFlyerPlugin.this.mAttributionData);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                handleError("onAttributionFailure", str);
            }

            private void handleError(String str, String str2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", LoginLogger.EVENT_EXTRAS_FAILURE);
                    jSONObject.put("type", str);
                    jSONObject.put("data", str2);
                    sendEvent(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            private void handleSuccess(String str, Map<String, Object> map, Map<String, String> map2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (map == null) {
                        map = map2;
                    }
                    JSONObject jSONObject2 = new JSONObject(map);
                    jSONObject.put("status", "success");
                    jSONObject.put("type", str);
                    jSONObject.put("data", jSONObject2);
                    sendEvent(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            private void sendEvent(JSONObject jSONObject) {
                String jSONObject2 = jSONObject.toString();
                if ((jSONObject.optString("type") == "onAttributionFailure" || jSONObject.optString("type") == "onAppOpenAttribution") && AppsFlyerPlugin.this.mAttributionDataListener != null) {
                    PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jSONObject2);
                    pluginResult.setKeepCallback(false);
                    AppsFlyerPlugin.this.mAttributionDataListener.sendPluginResult(pluginResult);
                    AppsFlyerPlugin.this.mAttributionDataListener = null;
                    return;
                }
                if ((jSONObject.optString("type") == "onInstallConversionDataLoaded" || jSONObject.optString("type") == "onInstallConversionFailure") && AppsFlyerPlugin.this.mConversionListener != null) {
                    PluginResult pluginResult2 = new PluginResult(PluginResult.Status.OK, jSONObject2);
                    pluginResult2.setKeepCallback(false);
                    AppsFlyerPlugin.this.mConversionListener.sendPluginResult(pluginResult2);
                    AppsFlyerPlugin.this.mConversionListener = null;
                }
            }
        };
    }

    private boolean logEvent(JSONArray jSONArray, CallbackContext callbackContext) {
        try {
            String string = jSONArray.getString(0);
            Map<String, Object> map = null;
            if (jSONArray.length() > 1 && !jSONArray.get(1).equals(null)) {
                map = jsonToMap(jSONArray.getJSONObject(1).toString());
            }
            if (string == null || string.trim().length() == 0) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "No 'eventName' found or its empty"));
                return true;
            }
            AppsFlyerLib.getInstance().logEvent(this.f3354cordova.getActivity().getApplicationContext(), string, map);
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, string));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private boolean setCurrencyCode(JSONArray jSONArray) {
        try {
            String string = jSONArray.getString(0);
            if (string != null && string.length() != 0) {
                AppsFlyerLib.getInstance().setCurrencyCode(string);
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private boolean setOutOfStore(JSONArray jSONArray) {
        try {
            String string = jSONArray.getString(0);
            if (string != null && string.length() != 0) {
                AppsFlyerLib.getInstance().setOutOfStore(string);
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private boolean setAppUserId(JSONArray jSONArray, CallbackContext callbackContext) {
        try {
            String string = jSONArray.getString(0);
            if (string != null && string.length() != 0) {
                AppsFlyerLib.getInstance().setCustomerUserId(string);
                PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
                pluginResult.setKeepCallback(false);
                callbackContext.sendPluginResult(pluginResult);
                return true;
            }
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "No customer id found"));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private boolean getAppsFlyerUID(CallbackContext callbackContext) {
        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, AppsFlyerLib.getInstance().getAppsFlyerUID(this.f3354cordova.getActivity().getApplicationContext()));
        pluginResult.setKeepCallback(false);
        callbackContext.sendPluginResult(pluginResult);
        return true;
    }

    private boolean anonymizeUser(JSONArray jSONArray) {
        try {
            AppsFlyerLib.getInstance().anonymizeUser(jSONArray.getBoolean(0));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private boolean stop(JSONArray jSONArray) {
        try {
            AppsFlyerLib.getInstance().stop(jSONArray.getBoolean(0), this.f3354cordova.getActivity().getApplicationContext());
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private static Map<String, Object> jsonToMap(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean updateServerUninstallToken(final JSONArray jSONArray, final CallbackContext callbackContext) {
        this.f3354cordova.getThreadPool().execute(new Runnable() { // from class: com.appsflyer.cordova.plugin.AppsFlyerPlugin.4
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONArray.optString(0);
                if (optString != null && optString.length() > 0) {
                    AppsFlyerLib.getInstance().updateServerUninstallToken(AppsFlyerPlugin.this.f3354cordova.getActivity().getApplicationContext(), optString);
                    callbackContext.success("Success");
                    return;
                }
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "Not a valid token"));
            }
        });
        return true;
    }

    private boolean onResume(JSONArray jSONArray, CallbackContext callbackContext) {
        Uri data = this.f3354cordova.getActivity().getIntent().getData();
        this.newIntentURI = data;
        if (data == this.intentURI) {
            return true;
        }
        if (this.mAttributionData != null) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, new JSONObject(this.mAttributionData).toString()));
            this.mAttributionData = null;
        } else {
            this.mAttributionDataListener = callbackContext;
            sendPluginNoResult(callbackContext);
        }
        this.intentURI = this.newIntentURI;
        return true;
    }

    private boolean setAppInviteOneLinkID(JSONArray jSONArray, CallbackContext callbackContext) {
        try {
            String string = jSONArray.getString(0);
            if (string != null && string.length() != 0) {
                AppsFlyerLib.getInstance().setAppInviteOneLink(string);
                callbackContext.success("Success");
                return true;
            }
            callbackContext.error("Failure");
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error("Failure");
            return true;
        }
    }

    private boolean generateInviteLink(JSONArray jSONArray, CallbackContext callbackContext) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            String optString = jSONObject.optString(AppsFlyerProperties.CHANNEL, "");
            String optString2 = jSONObject.optString("campaign", "");
            String optString3 = jSONObject.optString("referrerName", "");
            String optString4 = jSONObject.optString("referrerImageURL", "");
            String optString5 = jSONObject.optString("customerID", "");
            String optString6 = jSONObject.optString("baseDeepLink", "");
            String optString7 = jSONObject.optString("brandDomain", "");
            Context applicationContext = this.f3354cordova.getActivity().getApplicationContext();
            LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(applicationContext);
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
            if (jSONObject.length() > 1 && !jSONObject.get("userParams").equals("")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("userParams");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    generateInviteUrl.addParameter(next, jSONObject2.get(next).toString());
                }
            }
            generateInviteUrl.generateLink(applicationContext, new inviteCallbacksImpl());
            this.mInviteListener = callbackContext;
            sendPluginNoResult(callbackContext);
        } catch (JSONException unused) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "Could not create invite link"));
        }
        return true;
    }

    private boolean enableFacebookDeferredApplinks(JSONArray jSONArray) {
        try {
            boolean z = jSONArray.getBoolean(0);
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(z);
            Log.d("AppsFlyer", "set enableFacebookDeferredApplinks to " + z);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private class inviteCallbacksImpl implements CreateOneLinkHttpTask.ResponseListener {
        @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
        public void onResponseError(String str) {
        }

        private inviteCallbacksImpl() {
        }

        @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
        public void onResponse(String str) {
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, str);
            pluginResult.setKeepCallback(false);
            AppsFlyerPlugin.this.mInviteListener.sendPluginResult(pluginResult);
        }
    }

    public boolean logCrossPromotionImpression(JSONArray jSONArray, CallbackContext callbackContext) {
        String optString;
        String optString2;
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            optString = jSONObject.optString("promotedAppId", "");
            optString2 = jSONObject.optString("campaign", "");
        } catch (JSONException unused) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "CrossPromotionImpression Failed"));
        }
        if (optString != null && optString != "") {
            CrossPromotionHelper.logCrossPromoteImpression(this.f3354cordova.getActivity().getApplicationContext(), optString, optString2);
            return true;
        }
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "CrossPromoted App ID Not set"));
        return true;
    }

    public boolean logAndOpenStore(JSONArray jSONArray, CallbackContext callbackContext) {
        String string;
        String string2;
        HashMap hashMap;
        try {
            string = jSONArray.getString(0);
            string2 = jSONArray.getString(1);
        } catch (JSONException unused) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "CrossPromotion Failed"));
        }
        if (string != null && string != "") {
            Context applicationContext = this.f3354cordova.getActivity().getApplicationContext();
            if (jSONArray.isNull(2)) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                JSONObject optJSONObject = jSONArray.optJSONObject(2);
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.get(next).toString());
                }
            }
            CrossPromotionHelper.logAndOpenStore(applicationContext, string, string2, hashMap);
            return true;
        }
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "CrossPromoted App ID Not set"));
        return true;
    }

    private void sendPluginNoResult(CallbackContext callbackContext) {
        PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
        pluginResult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginResult);
    }

    private boolean getSdkVersion(CallbackContext callbackContext) {
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, AppsFlyerLib.getInstance().getSdkVersion()));
        return true;
    }

    private boolean setSharingFilter(JSONArray jSONArray, CallbackContext callbackContext) {
        String string;
        try {
            string = jSONArray.getString(0);
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error("Failure");
        }
        if (!string.equals(AbstractJsonLexerKt.NULL) && jSONArray.length() != 0) {
            String[] split = string.substring(1, string.length() - 1).replaceAll(ServerSentEventKt.SPACE, "").split("[ ,]");
            for (String str : split) {
                str.substring(1, str.length() - 1);
            }
            AppsFlyerLib.getInstance().setSharingFilter(split);
            callbackContext.success("Success");
            return true;
        }
        callbackContext.error("Failure");
        return true;
    }

    private boolean setSharingFilterForAllPartners(CallbackContext callbackContext) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        callbackContext.success("Success");
        return true;
    }

    public boolean validateAndLogInAppPurchase(JSONArray jSONArray, CallbackContext callbackContext) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            String optString = jSONObject.optString("publicKey", "");
            String optString2 = jSONObject.optString(InAppPurchaseMetaData.KEY_SIGNATURE, "");
            String optString3 = jSONObject.optString("purchaseData", "");
            String optString4 = jSONObject.optString("price", "");
            String optString5 = jSONObject.optString("currency", "");
            Map<String, String> map = jSONObject.has("additionalParameters") ? toMap(jSONObject.optJSONObject("additionalParameters")) : null;
            if (optString == "" || optString2 == "" || optString3 == "" || optString4 == "" || optString5 == "") {
                callbackContext.error("Please provide purchase parameters");
                return true;
            }
            initInAppPurchaseValidatorListener(callbackContext);
            AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.f3354cordova.getContext(), optString, optString2, optString3, optString4, optString5, map);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error("Failure");
            return true;
        }
    }

    public void initInAppPurchaseValidatorListener(final CallbackContext callbackContext) {
        AppsFlyerLib.getInstance().registerValidatorListener(this.f3354cordova.getContext(), new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.cordova.plugin.AppsFlyerPlugin.5
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                callbackContext.success("In-App Purchase Validation success");
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str) {
                callbackContext.error("In-App Purchase Validation failed with error: " + str);
            }
        });
    }

    private boolean setOneLinkCustomDomains(JSONArray jSONArray, CallbackContext callbackContext) {
        String string;
        try {
            string = jSONArray.getString(0);
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error("Failure");
        }
        if (!string.equals(AbstractJsonLexerKt.NULL) && jSONArray.length() != 0) {
            String[] split = string.substring(1, string.length() - 1).replaceAll(ServerSentEventKt.SPACE, "").split("[ ,]");
            for (String str : split) {
                Log.i(X3.j.D, str.substring(1, str.length() - 1));
            }
            AppsFlyerLib.getInstance().setOneLinkCustomDomain(split);
            callbackContext.success("Success");
            return true;
        }
        callbackContext.error("Failure");
        return true;
    }

    private boolean addPushNotificationDeepLinkPath(JSONArray jSONArray) {
        try {
            jSONArray.getString(0);
            String[] convertToStringArray = convertToStringArray(jSONArray);
            if (convertToStringArray == null || convertToStringArray.length <= 0) {
                return true;
            }
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath(convertToStringArray);
            Log.d("AppsFlyer", convertToStringArray.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    private boolean setResolveDeepLinkURLs(JSONArray jSONArray) {
        try {
            String[] convertToStringArray = convertToStringArray(jSONArray);
            if (convertToStringArray == null || convertToStringArray.length <= 0) {
                return true;
            }
            AppsFlyerLib.getInstance().setResolveDeepLinkURLs(convertToStringArray);
            Log.d("AppsFlyer", convertToStringArray.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    private String[] convertToStringArray(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            try {
                Object obj = jSONArray.get(0);
                if (obj instanceof String) {
                    return stringToArray((String) obj);
                }
                if (obj instanceof JSONArray) {
                    return jsonArrayToStringArray((JSONArray) obj);
                }
                return null;
            } catch (ClassCastException | JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private String[] jsonArrayToStringArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray.length() == 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    private String[] stringToArray(String str) {
        String[] split = str.substring(1, str.length() - 1).replaceAll(ServerSentEventKt.SPACE, "").split("[ ,]");
        for (String str2 : split) {
            Log.i("element", str2.substring(1, str2.length() - 1));
        }
        return split;
    }

    private Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, (String) jSONObject.get(next));
        }
        return hashMap;
    }
}
