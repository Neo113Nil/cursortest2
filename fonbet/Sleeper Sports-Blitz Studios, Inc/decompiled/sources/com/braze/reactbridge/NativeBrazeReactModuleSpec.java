package com.braze.reactbridge;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public abstract class NativeBrazeReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BrazeReactBridge";

    @ReactMethod
    public abstract void addAlias(String str, String str2);

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void addToCustomUserAttributeArray(String str, String str2, @Nullable Callback callback);

    @ReactMethod
    public abstract void addToSubscriptionGroup(String str, @Nullable Callback callback);

    @ReactMethod
    public abstract void changeUser(String str, @Nullable String str2);

    @ReactMethod
    public abstract void disableSDK();

    @ReactMethod
    public abstract void enableSDK();

    @ReactMethod
    public abstract void getAllFeatureFlags(Promise promise);

    @ReactMethod
    public abstract void getBanner(String str, Promise promise);

    @ReactMethod
    public abstract void getCachedContentCards(Promise promise);

    @ReactMethod
    public abstract void getContentCards(Promise promise);

    @ReactMethod
    public abstract void getDeviceId(Callback callback);

    @ReactMethod
    public abstract void getFeatureFlag(String str, Promise promise);

    @ReactMethod
    public abstract void getFeatureFlagBooleanProperty(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getFeatureFlagImageProperty(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getFeatureFlagJSONProperty(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getFeatureFlagNumberProperty(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getFeatureFlagStringProperty(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getFeatureFlagTimestampProperty(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getInitialPushPayload(Callback callback);

    @ReactMethod
    public abstract void getInitialURL(Callback callback);

    @ReactMethod
    public abstract void getUserId(Callback callback);

    @ReactMethod
    public abstract void hideCurrentInAppMessage();

    @ReactMethod
    public abstract void incrementCustomUserAttribute(String str, double d, @Nullable Callback callback);

    @ReactMethod
    public abstract void launchContentCards(@Nullable Boolean bool);

    @ReactMethod
    public abstract void logBannerClick(String str, @Nullable String str2);

    @ReactMethod
    public abstract void logBannerImpression(String str);

    @ReactMethod
    public abstract void logContentCardClicked(String str);

    @ReactMethod
    public abstract void logContentCardDismissed(String str);

    @ReactMethod
    public abstract void logContentCardImpression(String str);

    @ReactMethod
    public abstract void logCustomEvent(String str, @Nullable ReadableMap readableMap);

    @ReactMethod
    public abstract void logFeatureFlagImpression(String str);

    @ReactMethod
    public abstract void logInAppMessageButtonClicked(String str, double d);

    @ReactMethod
    public abstract void logInAppMessageClicked(String str);

    @ReactMethod
    public abstract void logInAppMessageImpression(String str);

    @ReactMethod
    public abstract void logPurchase(String str, String str2, String str3, double d, @Nullable ReadableMap readableMap);

    @ReactMethod
    public abstract void performInAppMessageAction(String str, double d);

    @ReactMethod
    public abstract void processContentCardClickAction(String str);

    @ReactMethod
    public abstract void refreshFeatureFlags();

    @ReactMethod
    public abstract void registerPushToken(String str);

    @ReactMethod
    public abstract void removeFromCustomUserAttributeArray(String str, String str2, @Nullable Callback callback);

    @ReactMethod
    public abstract void removeFromSubscriptionGroup(String str, @Nullable Callback callback);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void requestBannersRefresh(ReadableArray readableArray);

    @ReactMethod
    public abstract void requestContentCardsRefresh();

    @ReactMethod
    public abstract void requestGeofences(double d, double d2);

    @ReactMethod
    public abstract void requestImmediateDataFlush();

    @ReactMethod
    public abstract void requestLocationInitialization();

    @ReactMethod
    public abstract void requestPushPermission(@Nullable ReadableMap readableMap);

    @ReactMethod
    public abstract void setAdTrackingEnabled(boolean z, @Nullable String str);

    @ReactMethod
    public abstract void setAttributionData(String str, String str2, String str3, String str4);

    @ReactMethod
    public abstract void setBoolCustomUserAttribute(String str, boolean z, @Nullable Callback callback);

    @ReactMethod
    public abstract void setCountry(@Nullable String str);

    @ReactMethod
    public abstract void setCustomUserAttributeArray(String str, ReadableArray readableArray, @Nullable Callback callback);

    @ReactMethod
    public abstract void setCustomUserAttributeObject(String str, @Nullable ReadableMap readableMap, boolean z, @Nullable Callback callback);

    @ReactMethod
    public abstract void setCustomUserAttributeObjectArray(String str, ReadableArray readableArray, @Nullable Callback callback);

    @ReactMethod
    public abstract void setDateCustomUserAttribute(String str, double d, @Nullable Callback callback);

    @ReactMethod
    public abstract void setDateOfBirth(double d, double d2, double d3);

    @ReactMethod
    public abstract void setDoubleCustomUserAttribute(String str, double d, @Nullable Callback callback);

    @ReactMethod
    public abstract void setEmail(@Nullable String str);

    @ReactMethod
    public abstract void setEmailNotificationSubscriptionType(String str, @Nullable Callback callback);

    @ReactMethod
    public abstract void setFirstName(@Nullable String str);

    @ReactMethod
    public abstract void setGender(@Nullable String str, @Nullable Callback callback);

    @ReactMethod
    public abstract void setHomeCity(@Nullable String str);

    @ReactMethod
    public abstract void setIdentifierForAdvertiser(String str);

    @ReactMethod
    public abstract void setIdentifierForVendor(String str);

    @ReactMethod
    public abstract void setIntCustomUserAttribute(String str, double d, @Nullable Callback callback);

    @ReactMethod
    public abstract void setLanguage(@Nullable String str);

    @ReactMethod
    public abstract void setLastKnownLocation(double d, double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5);

    @ReactMethod
    public abstract void setLastName(@Nullable String str);

    @ReactMethod
    public abstract void setLocationCustomAttribute(String str, double d, double d2, @Nullable Callback callback);

    @ReactMethod
    public abstract void setPhoneNumber(@Nullable String str);

    @ReactMethod
    public abstract void setPushNotificationSubscriptionType(String str, @Nullable Callback callback);

    @ReactMethod
    public abstract void setSdkAuthenticationSignature(String str);

    @ReactMethod
    public abstract void setStringCustomUserAttribute(String str, String str2, @Nullable Callback callback);

    @ReactMethod
    public abstract void subscribeToInAppMessage(boolean z, @Nullable Callback callback);

    @ReactMethod
    public abstract void unsetCustomUserAttribute(String str, @Nullable Callback callback);

    @ReactMethod
    public abstract void updateTrackingPropertyAllowList(ReadableMap readableMap);

    @ReactMethod
    public abstract void wipeData();

    public NativeBrazeReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "BrazeReactBridge";
    }
}
