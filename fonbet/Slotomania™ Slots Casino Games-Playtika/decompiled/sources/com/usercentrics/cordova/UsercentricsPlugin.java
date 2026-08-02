package com.usercentrics.cordova;

import android.app.Activity;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.usercentrics.sdk.BannerSettings;
import com.usercentrics.sdk.GeneralStyleSettings;
import com.usercentrics.sdk.GeolocationRuleset;
import com.usercentrics.sdk.Usercentrics;
import com.usercentrics.sdk.UsercentricsBanner;
import com.usercentrics.sdk.UsercentricsConsentUserResponse;
import com.usercentrics.sdk.UsercentricsOptions;
import com.usercentrics.sdk.UsercentricsReadyStatus;
import com.usercentrics.sdk.UsercentricsServiceConsent;
import com.usercentrics.sdk.errors.UsercentricsError;
import com.usercentrics.sdk.models.api.ApiConstants;
import com.usercentrics.sdk.models.common.UsercentricsLoggerLevel;
import com.usercentrics.sdk.models.settings.UsercentricsConsentType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class UsercentricsPlugin extends CordovaPlugin {
    private boolean isInitialized = false;
    private boolean isReady = false;

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (str.equals(MobileAdsBridgeBase.initializeMethodName)) {
            initializeSdk(jSONArray.optJSONObject(0), callbackContext);
            return true;
        }
        if (!this.isInitialized) {
            callbackContext.error("SDK is not initialized. Call initialize() first.");
            return false;
        }
        if (str.equals("isReady")) {
            isReady(callbackContext);
            return true;
        }
        if (!this.isReady) {
            callbackContext.error("SDK is not ready. Call isReady() first and wait for it to complete successfully.");
            return false;
        }
        str.hashCode();
        switch (str) {
            case "acceptAll":
                acceptAll(callbackContext);
                return true;
            case "showSecondLayer":
                showSecondLayer(callbackContext);
                return true;
            case "clearUserSession":
                clearUserSession(callbackContext);
                return true;
            case "showFirstLayer":
                showFirstLayer(callbackContext);
                return true;
            case "getConsents":
                getConsents(callbackContext);
                return true;
            case "denyAll":
                denyAll(callbackContext);
                return true;
            default:
                return false;
        }
    }

    private void initializeSdk(JSONObject jSONObject, CallbackContext callbackContext) {
        if (jSONObject == null) {
            callbackContext.error("initialize: options are required");
            return;
        }
        UsercentricsOptions usercentricsOptions = new UsercentricsOptions();
        usercentricsOptions.setSettingsId(jSONObject.optString("settingsId", ""));
        usercentricsOptions.setRuleSetId(jSONObject.optString("ruleSetId", ""));
        usercentricsOptions.setConsentMediation(jSONObject.optBoolean("consentMediation", false));
        usercentricsOptions.setVersion(jSONObject.optString("version", ApiConstants.FALLBACK_VERSION));
        usercentricsOptions.setTimeoutMillis(jSONObject.optLong("timeoutMillis", 10000L));
        usercentricsOptions.setInitTimeoutMillis(jSONObject.optLong("initTimeoutMillis", 10000L));
        usercentricsOptions.setDefaultLanguage(jSONObject.optString("defaultLanguage", ""));
        usercentricsOptions.setLoggerLevel(UsercentricsLoggerLevel.valueOf(jSONObject.optString("loggerLevel", "NONE")));
        Usercentrics.initialize(this.f3354cordova.getContext(), usercentricsOptions);
        this.isInitialized = true;
        callbackContext.success();
    }

    private void isReady(final CallbackContext callbackContext) {
        Usercentrics.isReady(new Function1() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$isReady$0;
                lambda$isReady$0 = UsercentricsPlugin.this.lambda$isReady$0(callbackContext, (UsercentricsReadyStatus) obj);
                return lambda$isReady$0;
            }
        }, new Function1() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UsercentricsPlugin.lambda$isReady$1(CallbackContext.this, (UsercentricsError) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$isReady$0(CallbackContext callbackContext, UsercentricsReadyStatus usercentricsReadyStatus) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shouldCollectConsent", usercentricsReadyStatus.getShouldCollectConsent());
            GeolocationRuleset geolocationRuleset = usercentricsReadyStatus.getGeolocationRuleset();
            if (geolocationRuleset != null) {
                jSONObject.put("bannerRequiredAtLocation", geolocationRuleset.getBannerRequiredAtLocation());
            }
            this.isReady = true;
            callbackContext.success(jSONObject);
        } catch (Exception e) {
            callbackContext.error("isReady: response failed: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit lambda$isReady$1(CallbackContext callbackContext, UsercentricsError usercentricsError) {
        callbackContext.error("isReady: SDK failed: " + usercentricsError.getMessage());
        return Unit.INSTANCE;
    }

    private void showFirstLayer(final CallbackContext callbackContext) {
        final Activity activity = this.f3354cordova.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UsercentricsPlugin.this.lambda$showFirstLayer$3(activity, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showFirstLayer$3(Activity activity, final CallbackContext callbackContext) {
        new UsercentricsBanner(activity, new BannerSettings(new GeneralStyleSettings(null, null, null, null, null, null, null, null, null, null, true, null, null), null, null, null)).showFirstLayer(new Function1() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$showFirstLayer$2;
                lambda$showFirstLayer$2 = UsercentricsPlugin.this.lambda$showFirstLayer$2(callbackContext, (UsercentricsConsentUserResponse) obj);
                return lambda$showFirstLayer$2;
            }
        });
    }

    private void showSecondLayer(final CallbackContext callbackContext) {
        final Activity activity = this.f3354cordova.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UsercentricsPlugin.this.lambda$showSecondLayer$5(activity, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSecondLayer$5(Activity activity, final CallbackContext callbackContext) {
        new UsercentricsBanner(activity, null).showSecondLayer(new Function1() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$showSecondLayer$4;
                lambda$showSecondLayer$4 = UsercentricsPlugin.this.lambda$showSecondLayer$4(callbackContext, (UsercentricsConsentUserResponse) obj);
                return lambda$showSecondLayer$4;
            }
        });
    }

    private void getConsents(CallbackContext callbackContext) {
        sendConsentsResponse(Usercentrics.getInstance().getConsents(), callbackContext);
    }

    private void acceptAll(CallbackContext callbackContext) {
        sendConsentsResponse(Usercentrics.getInstance().acceptAll(UsercentricsConsentType.EXPLICIT), callbackContext);
    }

    private void denyAll(CallbackContext callbackContext) {
        sendConsentsResponse(Usercentrics.getInstance().denyAll(UsercentricsConsentType.EXPLICIT), callbackContext);
    }

    private void clearUserSession(final CallbackContext callbackContext) {
        Usercentrics.getInstance().clearUserSession(new Function1() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UsercentricsPlugin.lambda$clearUserSession$6(CallbackContext.this, (UsercentricsReadyStatus) obj);
            }
        }, new Function1() { // from class: com.usercentrics.cordova.UsercentricsPlugin$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UsercentricsPlugin.lambda$clearUserSession$7(CallbackContext.this, (UsercentricsError) obj);
            }
        });
    }

    static /* synthetic */ Unit lambda$clearUserSession$6(CallbackContext callbackContext, UsercentricsReadyStatus usercentricsReadyStatus) {
        callbackContext.success();
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit lambda$clearUserSession$7(CallbackContext callbackContext, UsercentricsError usercentricsError) {
        callbackContext.error("clearUserSession: " + usercentricsError.getMessage());
        return Unit.INSTANCE;
    }

    private void sendConsentsResponse(List<UsercentricsServiceConsent> list, CallbackContext callbackContext) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (UsercentricsServiceConsent usercentricsServiceConsent : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("templateId", usercentricsServiceConsent.getTemplateId());
                jSONObject.put("status", usercentricsServiceConsent.getStatus());
                jSONArray.put(jSONObject);
            }
            callbackContext.success(jSONArray);
        } catch (Exception e) {
            callbackContext.error("Failed to serialize consents: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBannerResponse, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Unit lambda$showSecondLayer$4(UsercentricsConsentUserResponse usercentricsConsentUserResponse, CallbackContext callbackContext) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userInteraction", usercentricsConsentUserResponse.getUserInteraction().name());
            jSONObject.put("controllerId", usercentricsConsentUserResponse.getControllerId());
            JSONArray jSONArray = new JSONArray();
            for (UsercentricsServiceConsent usercentricsServiceConsent : usercentricsConsentUserResponse.getConsents()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("templateId", usercentricsServiceConsent.getTemplateId());
                jSONObject2.put("status", usercentricsServiceConsent.getStatus());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("consents", jSONArray);
            callbackContext.success(jSONObject);
        } catch (Exception e) {
            callbackContext.error("handleBannerResponse: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
