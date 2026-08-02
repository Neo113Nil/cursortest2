package com.braze.reactbridge;

import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b:\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000bH\u0016J\u001a\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J2\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020/2\b\u0010C\u001a\u0004\u0018\u00010=H\u0016J\"\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010G\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010H\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020I2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010J\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010K\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020L2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010M\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020L2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010N\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J.\u0010O\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010\u000b2\b\u0010F\u001a\u0004\u0018\u00010=2\u0006\u0010P\u001a\u00020I2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010Q\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010R\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010S\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010T\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J0\u0010U\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\b\u0010X\u001a\u0004\u0018\u00010\u000b2\b\u0010Y\u001a\u0004\u0018\u00010\u000bH\u0016J\u0017\u0010Z\u001a\u00020\r2\b\u0010[\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0002\u0010\\J\b\u0010]\u001a\u00020\rH\u0016J\u0010\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\u000bH\u0016J\u0010\u0010`\u001a\u00020\r2\u0006\u0010_\u001a\u00020\u000bH\u0016J\u0010\u0010a\u001a\u00020\r2\u0006\u0010_\u001a\u00020\u000bH\u0016J\u0010\u0010b\u001a\u00020\r2\u0006\u0010_\u001a\u00020\u000bH\u0016J\u0010\u0010c\u001a\u00020\r2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010f\u001a\u00020\r2\u0006\u0010d\u001a\u00020eH\u0016J\u0018\u0010g\u001a\u00020\r2\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010i\u001a\u00020\r2\u0006\u0010j\u001a\u00020LH\u0016J\u0010\u0010k\u001a\u00020\r2\u0006\u0010h\u001a\u00020\u000bH\u0016J\u001a\u0010l\u001a\u00020\r2\u0006\u0010h\u001a\u00020\u000b2\b\u0010m\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010n\u001a\u00020\rH\u0016J\b\u0010o\u001a\u00020\rH\u0016J\b\u0010p\u001a\u00020\rH\u0016J\b\u0010q\u001a\u00020\rH\u0016J\b\u0010r\u001a\u00020\rH\u0016J\u0018\u0010s\u001a\u00020\r2\u0006\u0010t\u001a\u00020/2\u0006\u0010u\u001a\u00020/H\u0016J*\u0010v\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020/2\u0006\u0010u\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J;\u0010w\u001a\u00020\r2\u0006\u0010t\u001a\u00020/2\u0006\u0010u\u001a\u00020/2\b\u0010x\u001a\u0004\u0018\u00010/2\b\u0010y\u001a\u0004\u0018\u00010/2\b\u0010z\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0002\u0010{J\u001a\u0010|\u001a\u00020\r2\u0006\u0010}\u001a\u00020I2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010~\u001a\u00020\rH\u0016J\u0011\u0010\u007f\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u0081\u0001\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u000bH\u0016J\u001a\u0010\u0082\u0001\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020/H\u0016J\u001a\u0010\u0083\u0001\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020/H\u0016J\u0014\u0010\u0084\u0001\u001a\u00020\r2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010=H\u0016J\u0011\u0010\u0086\u0001\u001a\u00020\r2\u0006\u0010d\u001a\u00020eH\u0016J\u001a\u0010\u0087\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0016J\"\u0010\u0089\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0017J\"\u0010\u008a\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0017J\"\u0010\u008b\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0017J\"\u0010\u008c\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0017J\"\u0010\u008d\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0017J\"\u0010\u008e\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020eH\u0017J\t\u0010\u008f\u0001\u001a\u00020\rH\u0016J\u0012\u0010\u0090\u0001\u001a\u00020\r2\u0007\u0010\u0091\u0001\u001a\u00020\u000bH\u0016J\u001d\u0010\u0092\u0001\u001a\u00020\r2\u0007\u0010\u0093\u0001\u001a\u00020I2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0095\u0001\u001a\u00020\r2\u0007\u0010\u0096\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u0097\u0001\u001a\u00020\r2\u0007\u0010\u0098\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u0099\u0001\u001a\u00020\r2\u0007\u0010\u009a\u0001\u001a\u00020=H\u0016J\u0012\u0010\u009b\u0001\u001a\u00020\r2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u009d\u0001\u001a\u00020\r2\u0007\u0010\u009e\u0001\u001a\u00020/H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u009f\u0001"}, d2 = {"Lcom/braze/reactbridge/BrazeReactBridge;", "Lcom/braze/reactbridge/NativeBrazeReactModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "brazeImpl", "Lcom/braze/reactbridge/BrazeReactBridgeImpl;", "getBrazeImpl", "()Lcom/braze/reactbridge/BrazeReactBridgeImpl;", "getName", "", "initialize", "", "apiKey", "endpoint", "getInitialURL", "callback", "Lcom/facebook/react/bridge/Callback;", "getInitialPushPayload", "getDeviceId", "changeUser", "userId", "signature", "getUserId", "setSdkAuthenticationSignature", "addAlias", "aliasName", "aliasLabel", "setFirstName", "firstName", "setLastName", "lastName", "setEmail", "email", "setGender", "gender", "setLanguage", "language", "setCountry", AdRevenueScheme.COUNTRY, "setHomeCity", "homeCity", "setPhoneNumber", "phoneNumber", "setDateOfBirth", "year", "", "month", "day", "registerPushToken", "token", "addToSubscriptionGroup", "groupId", "removeFromSubscriptionGroup", "setPushNotificationSubscriptionType", "notificationSubscriptionType", "setEmailNotificationSubscriptionType", "logCustomEvent", "eventName", "eventProperties", "Lcom/facebook/react/bridge/ReadableMap;", "logPurchase", "productId", "price", AppsFlyerProperties.CURRENCY_CODE, "quantity", "purchaseProperties", "setIntCustomUserAttribute", "key", EventKeys.VALUE_KEY, "setDoubleCustomUserAttribute", "setBoolCustomUserAttribute", "", "setStringCustomUserAttribute", "setCustomUserAttributeArray", "Lcom/facebook/react/bridge/ReadableArray;", "setCustomUserAttributeObjectArray", "setDateCustomUserAttribute", "setCustomUserAttributeObject", "merge", "addToCustomUserAttributeArray", "removeFromCustomUserAttributeArray", "unsetCustomUserAttribute", "incrementCustomUserAttribute", "setAttributionData", "network", "campaign", "adGroup", "creative", "launchContentCards", "dismissAutomaticallyOnCardClick", "(Ljava/lang/Boolean;)V", "requestContentCardsRefresh", "logContentCardClicked", "cardId", "logContentCardDismissed", "logContentCardImpression", "processContentCardClickAction", "getContentCards", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getCachedContentCards", "getBanner", "placementId", "requestBannersRefresh", "placementIds", "logBannerImpression", "logBannerClick", "buttonId", "requestImmediateDataFlush", "wipeData", "disableSDK", "enableSDK", "requestLocationInitialization", "requestGeofences", "latitude", "longitude", "setLocationCustomAttribute", "setLastKnownLocation", "altitude", "horizontalAccuracy", "verticalAccuracy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "subscribeToInAppMessage", "useBrazeUI", "hideCurrentInAppMessage", "logInAppMessageClicked", "inAppMessageString", "logInAppMessageImpression", "logInAppMessageButtonClicked", "performInAppMessageAction", "requestPushPermission", "permissionOptions", "getAllFeatureFlags", "getFeatureFlag", "flagId", "getFeatureFlagBooleanProperty", "getFeatureFlagStringProperty", "getFeatureFlagNumberProperty", "getFeatureFlagTimestampProperty", "getFeatureFlagJSONProperty", "getFeatureFlagImageProperty", "refreshFeatureFlags", "logFeatureFlagImpression", StackTraceHelper.ID_KEY, "setAdTrackingEnabled", "adTrackingEnabled", "googleAdvertisingId", "setIdentifierForAdvertiser", "identifierForAdvertiser", "setIdentifierForVendor", "identifierForVendor", "updateTrackingPropertyAllowList", "allowList", "addListener", "eventType", "removeListeners", "count", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeReactBridge extends NativeBrazeReactModuleSpec {

    @NotNull
    private final BrazeReactBridgeImpl brazeImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeReactBridge(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.brazeImpl = new BrazeReactBridgeImpl(reactContext, reactContext.getCurrentActivity());
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void addAlias(@NotNull String aliasName, @NotNull String aliasLabel) {
        Intrinsics.checkNotNullParameter(aliasName, "aliasName");
        Intrinsics.checkNotNullParameter(aliasLabel, "aliasLabel");
        this.brazeImpl.addAlias(aliasName, aliasLabel);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void addListener(@NotNull String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.brazeImpl.addListener(eventType);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void addToCustomUserAttributeArray(@NotNull String key, @NotNull String value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.brazeImpl.addToCustomAttributeArray(key, value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void addToSubscriptionGroup(@NotNull String groupId, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.brazeImpl.addToSubscriptionGroup(groupId, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void changeUser(@NotNull String userId, @Nullable String signature) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.brazeImpl.changeUser(userId, signature);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void disableSDK() {
        this.brazeImpl.disableSDK();
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void enableSDK() {
        this.brazeImpl.enableSDK();
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getAllFeatureFlags(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getAllFeatureFlags(promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getBanner(@NotNull String placementId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getBanner(placementId, promise);
    }

    @NotNull
    public final BrazeReactBridgeImpl getBrazeImpl() {
        return this.brazeImpl;
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getCachedContentCards(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getCachedContentCards(promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getContentCards(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getContentCards(promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getDeviceId(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.brazeImpl.getDeviceId(callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getFeatureFlag(@NotNull String flagId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(flagId, "flagId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getFeatureFlag(flagId, promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    @Deprecated(message = "Use getBooleanProperty instead")
    public void getFeatureFlagBooleanProperty(@NotNull String flagId, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(flagId, "flagId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getFeatureFlagBooleanProperty(flagId, key, promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    @Deprecated(message = "Use getImageProperty instead")
    public void getFeatureFlagImageProperty(@NotNull String flagId, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(flagId, "flagId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getFeatureFlagImageProperty(flagId, key, promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    @Deprecated(message = "Use getJSONProperty instead")
    public void getFeatureFlagJSONProperty(@NotNull String flagId, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(flagId, "flagId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getFeatureFlagJSONProperty(flagId, key, promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    @Deprecated(message = "Use getNumberProperty instead")
    public void getFeatureFlagNumberProperty(@NotNull String flagId, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(flagId, "flagId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getFeatureFlagNumberProperty(flagId, key, promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    @Deprecated(message = "Use getStringProperty instead")
    public void getFeatureFlagStringProperty(@NotNull String flagId, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(flagId, "flagId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getFeatureFlagStringProperty(flagId, key, promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    @Deprecated(message = "Use getTimestampProperty instead")
    public void getFeatureFlagTimestampProperty(@NotNull String flagId, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(flagId, "flagId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.brazeImpl.getFeatureFlagTimestampProperty(flagId, key, promise);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getInitialPushPayload(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.brazeImpl.getInitialPushPayload(callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getInitialURL(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NativeBrazeReactModuleSpec.NAME;
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void getUserId(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.brazeImpl.getUserId(callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void hideCurrentInAppMessage() {
        this.brazeImpl.hideCurrentInAppMessage();
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void incrementCustomUserAttribute(@NotNull String key, double value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.brazeImpl.incrementCustomUserAttribute(key, (int) value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void initialize(@NotNull String apiKey, @NotNull String endpoint) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.brazeImpl.initialize(apiKey, endpoint);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void launchContentCards(@Nullable Boolean dismissAutomaticallyOnCardClick) {
        this.brazeImpl.launchContentCards(dismissAutomaticallyOnCardClick);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logBannerClick(@NotNull String placementId, @Nullable String buttonId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.brazeImpl.logBannerClick(placementId, buttonId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logBannerImpression(@NotNull String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.brazeImpl.logBannerImpression(placementId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logContentCardClicked(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.brazeImpl.logContentCardClicked(cardId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logContentCardDismissed(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.brazeImpl.logContentCardDismissed(cardId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logContentCardImpression(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.brazeImpl.logContentCardImpression(cardId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logCustomEvent(@NotNull String eventName, @Nullable ReadableMap eventProperties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.brazeImpl.logCustomEvent(eventName, eventProperties);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logFeatureFlagImpression(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.brazeImpl.logFeatureFlagImpression(id2);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logInAppMessageButtonClicked(@NotNull String inAppMessageString, double buttonId) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        this.brazeImpl.logInAppMessageButtonClicked(inAppMessageString, (int) buttonId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logInAppMessageClicked(@NotNull String inAppMessageString) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        this.brazeImpl.logInAppMessageClicked(inAppMessageString);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logInAppMessageImpression(@NotNull String inAppMessageString) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        this.brazeImpl.logInAppMessageImpression(inAppMessageString);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void logPurchase(@NotNull String productId, @NotNull String price, @NotNull String currencyCode, double quantity, @Nullable ReadableMap purchaseProperties) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.brazeImpl.logPurchase(productId, price, currencyCode, (int) quantity, purchaseProperties);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void performInAppMessageAction(@NotNull String inAppMessageString, double buttonId) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        this.brazeImpl.performInAppMessageAction(inAppMessageString, (int) buttonId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void processContentCardClickAction(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.brazeImpl.processContentCardClickAction(cardId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void refreshFeatureFlags() {
        this.brazeImpl.refreshFeatureFlags();
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void registerPushToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.brazeImpl.registerPushToken(token);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void removeFromCustomUserAttributeArray(@NotNull String key, @NotNull String value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.brazeImpl.removeFromCustomAttributeArray(key, value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void removeFromSubscriptionGroup(@NotNull String groupId, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.brazeImpl.removeFromSubscriptionGroup(groupId, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void removeListeners(double count) {
        this.brazeImpl.removeListeners((int) count);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void requestBannersRefresh(@NotNull ReadableArray placementIds) {
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        this.brazeImpl.requestBannersRefresh(placementIds);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void requestContentCardsRefresh() {
        this.brazeImpl.requestContentCardsRefresh();
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void requestGeofences(double latitude, double longitude) {
        this.brazeImpl.requestGeofences(latitude, longitude);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void requestImmediateDataFlush() {
        this.brazeImpl.requestImmediateDataFlush();
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void requestLocationInitialization() {
        this.brazeImpl.requestLocationInitialization();
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void requestPushPermission(@Nullable ReadableMap permissionOptions) {
        this.brazeImpl.requestPushPermission(permissionOptions);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setAdTrackingEnabled(boolean adTrackingEnabled, @Nullable String googleAdvertisingId) {
        this.brazeImpl.setAdTrackingEnabled(adTrackingEnabled, googleAdvertisingId);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setAttributionData(@Nullable String network, @Nullable String campaign, @Nullable String adGroup, @Nullable String creative) {
        this.brazeImpl.setAttributionData(network, campaign, adGroup, creative);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setBoolCustomUserAttribute(@NotNull String key, boolean value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.brazeImpl.setBoolCustomUserAttribute(key, value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setCountry(@Nullable String country) {
        this.brazeImpl.setCountry(country);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setCustomUserAttributeArray(@NotNull String key, @NotNull ReadableArray value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.brazeImpl.setCustomUserAttributeArray(key, value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setCustomUserAttributeObject(@Nullable String key, @Nullable ReadableMap value, boolean merge, @Nullable Callback callback) {
        this.brazeImpl.setCustomUserAttributeObject(key, value, merge, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setCustomUserAttributeObjectArray(@NotNull String key, @NotNull ReadableArray value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.brazeImpl.setCustomUserAttributeObjectArray(key, value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setDateCustomUserAttribute(@NotNull String key, double value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.brazeImpl.setDateCustomUserAttribute(key, (int) value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setDateOfBirth(double year, double month, double day) {
        this.brazeImpl.setDateOfBirth((int) year, (int) month, (int) day);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setDoubleCustomUserAttribute(@NotNull String key, double value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.brazeImpl.setDoubleCustomUserAttribute(key, (float) value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setEmail(@Nullable String email) {
        this.brazeImpl.setEmail(email);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setEmailNotificationSubscriptionType(@NotNull String notificationSubscriptionType, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(notificationSubscriptionType, "notificationSubscriptionType");
        this.brazeImpl.setEmailNotificationSubscriptionType(notificationSubscriptionType, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setFirstName(@Nullable String firstName) {
        this.brazeImpl.setFirstName(firstName);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setGender(@Nullable String gender, @Nullable Callback callback) {
        this.brazeImpl.setGender(gender, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setHomeCity(@Nullable String homeCity) {
        this.brazeImpl.setHomeCity(homeCity);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setIdentifierForAdvertiser(@NotNull String identifierForAdvertiser) {
        Intrinsics.checkNotNullParameter(identifierForAdvertiser, "identifierForAdvertiser");
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setIdentifierForVendor(@NotNull String identifierForVendor) {
        Intrinsics.checkNotNullParameter(identifierForVendor, "identifierForVendor");
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setIntCustomUserAttribute(@NotNull String key, double value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.brazeImpl.setIntCustomUserAttribute(key, (int) value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setLanguage(@Nullable String language) {
        this.brazeImpl.setLanguage(language);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setLastKnownLocation(double latitude, double longitude, @Nullable Double altitude, @Nullable Double horizontalAccuracy, @Nullable Double verticalAccuracy) {
        this.brazeImpl.setLastKnownLocation(latitude, longitude, altitude, horizontalAccuracy, verticalAccuracy);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setLastName(@Nullable String lastName) {
        this.brazeImpl.setLastName(lastName);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setLocationCustomAttribute(@NotNull String key, double latitude, double longitude, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.brazeImpl.setLocationCustomAttribute(key, latitude, longitude, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setPhoneNumber(@Nullable String phoneNumber) {
        this.brazeImpl.setPhoneNumber(phoneNumber);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setPushNotificationSubscriptionType(@NotNull String notificationSubscriptionType, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(notificationSubscriptionType, "notificationSubscriptionType");
        this.brazeImpl.setPushNotificationSubscriptionType(notificationSubscriptionType, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setSdkAuthenticationSignature(@NotNull String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.brazeImpl.setSdkAuthenticationSignature(signature);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void setStringCustomUserAttribute(@NotNull String key, @NotNull String value, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.brazeImpl.setStringCustomUserAttribute(key, value, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void subscribeToInAppMessage(boolean useBrazeUI, @Nullable Callback callback) {
        this.brazeImpl.subscribeToInAppMessage(useBrazeUI);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void unsetCustomUserAttribute(@NotNull String key, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.brazeImpl.unsetCustomUserAttribute(key, callback);
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void updateTrackingPropertyAllowList(@NotNull ReadableMap allowList) {
        Intrinsics.checkNotNullParameter(allowList, "allowList");
    }

    @Override // com.braze.reactbridge.NativeBrazeReactModuleSpec
    public void wipeData() {
        this.brazeImpl.wipeData();
    }
}
