package com.radar;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public abstract class NativeRadarSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNRadar";

    @ReactMethod
    public abstract void acceptEvent(String str, String str2);

    @ReactMethod
    public abstract void addTags(ReadableArray readableArray);

    @ReactMethod
    public abstract void autocomplete(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void cancelTrip(Promise promise);

    @ReactMethod
    public abstract void clearVerifiedLocationToken();

    @ReactMethod
    public abstract void completeTrip(Promise promise);

    @ReactMethod
    public abstract void geocode(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getContext(@Nullable ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getDescription(Promise promise);

    @ReactMethod
    public abstract void getDistance(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getHost(Promise promise);

    @ReactMethod
    public abstract void getLocation(@Nullable String str, Promise promise);

    @ReactMethod
    public abstract void getMatrix(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getMetadata(Promise promise);

    @ReactMethod
    public abstract void getPermissionsStatus(Promise promise);

    @ReactMethod
    public abstract void getProduct(Promise promise);

    @ReactMethod
    public abstract void getPublishableKey(Promise promise);

    @ReactMethod
    public abstract void getTags(Promise promise);

    @ReactMethod
    public abstract void getTrackingOptions(Promise promise);

    @ReactMethod
    public abstract void getTripOptions(Promise promise);

    @ReactMethod
    public abstract void getUserId(Promise promise);

    @ReactMethod
    public abstract void getVerifiedLocationToken(Promise promise);

    @ReactMethod
    public abstract void initialize(String str, boolean z);

    @ReactMethod
    public abstract void ipGeocode(Promise promise);

    @ReactMethod
    public abstract void isTracking(Promise promise);

    @ReactMethod
    public abstract void isTrackingVerified(Promise promise);

    @ReactMethod
    public abstract void isUsingRemoteTrackingOptions(Promise promise);

    @ReactMethod
    public abstract void logConversion(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void mockTracking(ReadableMap readableMap);

    @ReactMethod
    public abstract void nativeSdkVersion(Promise promise);

    @ReactMethod
    public abstract void rejectEvent(String str);

    @ReactMethod
    public abstract void removeTags(ReadableArray readableArray);

    @ReactMethod
    public abstract void requestPermissions(boolean z, Promise promise);

    @ReactMethod
    public abstract void reverseGeocode(@Nullable ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void searchGeofences(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void searchPlaces(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void setAnonymousTrackingEnabled(boolean z);

    @ReactMethod
    public abstract void setDescription(String str);

    @ReactMethod
    public abstract void setForegroundServiceOptions(ReadableMap readableMap);

    @ReactMethod
    public abstract void setLogLevel(String str);

    @ReactMethod
    public abstract void setMetadata(ReadableMap readableMap);

    @ReactMethod
    public abstract void setNotificationOptions(ReadableMap readableMap);

    @ReactMethod
    public abstract void setProduct(String str);

    @ReactMethod
    public abstract void setTags(ReadableArray readableArray);

    @ReactMethod
    public abstract void setUserId(String str);

    @ReactMethod
    public abstract void showInAppMessage(ReadableMap readableMap);

    @ReactMethod
    public abstract void startTrackingContinuous();

    @ReactMethod
    public abstract void startTrackingCustom(ReadableMap readableMap);

    @ReactMethod
    public abstract void startTrackingEfficient();

    @ReactMethod
    public abstract void startTrackingResponsive();

    @ReactMethod
    public abstract void startTrackingVerified(@Nullable ReadableMap readableMap);

    @ReactMethod
    public abstract void startTrip(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void stopTracking();

    @ReactMethod
    public abstract void stopTrackingVerified();

    @ReactMethod
    public abstract void trackOnce(@Nullable ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void trackVerified(@Nullable ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void updateTrip(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void validateAddress(ReadableMap readableMap, Promise promise);

    public NativeRadarSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNRadar";
    }

    protected final void emitLocationEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("locationEmitter", readableMap);
    }

    protected final void emitClientLocationEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("clientLocationEmitter", readableMap);
    }

    protected final void emitErrorEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("errorEmitter", readableMap);
    }

    protected final void emitLogEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("logEmitter", readableMap);
    }

    protected final void emitEventsEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("eventsEmitter", readableMap);
    }

    protected final void emitTokenEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("tokenEmitter", readableMap);
    }

    protected final void emitNewInAppMessageEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("newInAppMessageEmitter", readableMap);
    }

    protected final void emitInAppMessageDismissedEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("inAppMessageDismissedEmitter", readableMap);
    }

    protected final void emitInAppMessageClickedEmitter(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("inAppMessageClickedEmitter", readableMap);
    }
}
