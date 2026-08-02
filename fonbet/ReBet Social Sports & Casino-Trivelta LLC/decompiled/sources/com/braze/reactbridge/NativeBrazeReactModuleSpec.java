package com.braze.reactbridge;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes.dex */
public abstract class NativeBrazeReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BrazeReactBridge";

    public NativeBrazeReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addAlias(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void addToCustomUserAttributeArray(String str, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void addToSubscriptionGroup(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void changeUser(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void disableSDK();

    @ReactMethod
    @InterfaceC4488a
    public abstract void enableSDK();

    @ReactMethod
    @InterfaceC4488a
    public abstract void getAllFeatureFlags(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getBanner(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getCachedContentCards(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getContentCards(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getDeviceId(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFeatureFlag(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFeatureFlagBooleanProperty(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFeatureFlagImageProperty(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFeatureFlagJSONProperty(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFeatureFlagNumberProperty(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFeatureFlagStringProperty(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFeatureFlagTimestampProperty(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getInitialPushPayload(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getInitialURL(Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getUserId(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void hideCurrentInAppMessage();

    @ReactMethod
    @InterfaceC4488a
    public abstract void incrementCustomUserAttribute(String str, double d10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void initialize(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void launchContentCards(Boolean bool);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logBannerClick(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logBannerImpression(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logContentCardClicked(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logContentCardDismissed(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logContentCardImpression(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logCustomEvent(String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logFeatureFlagImpression(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logInAppMessageButtonClicked(String str, double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logInAppMessageClicked(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logInAppMessageImpression(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void logPurchase(String str, String str2, String str3, double d10, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void performInAppMessageAction(String str, double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void processContentCardClickAction(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void refreshFeatureFlags();

    @ReactMethod
    @InterfaceC4488a
    public abstract void registerPushToken(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeFromCustomUserAttributeArray(String str, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeFromSubscriptionGroup(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void requestBannersRefresh(ReadableArray readableArray);

    @ReactMethod
    @InterfaceC4488a
    public abstract void requestContentCardsRefresh();

    @ReactMethod
    @InterfaceC4488a
    public abstract void requestGeofences(double d10, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void requestImmediateDataFlush();

    @ReactMethod
    @InterfaceC4488a
    public abstract void requestLocationInitialization();

    @ReactMethod
    @InterfaceC4488a
    public abstract void requestPushPermission(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setAdTrackingEnabled(boolean z10, String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setAttributionData(String str, String str2, String str3, String str4);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setBoolCustomUserAttribute(String str, boolean z10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setCountry(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setCustomUserAttributeArray(String str, ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setCustomUserAttributeObject(String str, ReadableMap readableMap, boolean z10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setCustomUserAttributeObjectArray(String str, ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setDateCustomUserAttribute(String str, double d10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setDateOfBirth(double d10, double d11, double d12);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setDoubleCustomUserAttribute(String str, double d10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setEmail(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setEmailNotificationSubscriptionType(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setFirstName(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setGender(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setHomeCity(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setIdentifierForAdvertiser(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setIdentifierForVendor(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setIntCustomUserAttribute(String str, double d10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLanguage(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLastKnownLocation(double d10, double d11, Double d12, Double d13, Double d14);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLastName(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLocationCustomAttribute(String str, double d10, double d11, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setPhoneNumber(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setPushNotificationSubscriptionType(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setSdkAuthenticationSignature(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setStringCustomUserAttribute(String str, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void subscribeToInAppMessage(boolean z10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void unsetCustomUserAttribute(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void updateTrackingPropertyAllowList(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void wipeData();
}
