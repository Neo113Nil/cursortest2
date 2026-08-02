package io.sentry.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes3.dex */
public abstract class NativeRNSentrySpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSentry";

    public NativeRNSentrySpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addBreadcrumb(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void captureEnvelope(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void captureReplay(boolean z10, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void captureScreenshot(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void clearBreadcrumbs();

    @ReactMethod
    @InterfaceC4488a
    public abstract void closeNativeSdk(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void crash();

    @ReactMethod
    @InterfaceC4488a
    public abstract void crashedLastRun(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void disableNativeFramesTracking();

    @ReactMethod
    @InterfaceC4488a
    public abstract void disableShakeDetection();

    @ReactMethod
    @InterfaceC4488a
    public abstract void enableNativeFramesTracking();

    @ReactMethod
    @InterfaceC4488a
    public abstract void enableShakeDetection();

    @ReactMethod
    @InterfaceC4488a
    public abstract void encodeToBase64(ReadableArray readableArray, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchModules(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchNativeAppStart(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchNativeDeviceContexts(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchNativeFrames(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchNativeFramesDelay(double d10, double d11, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchNativeLogAttributes(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract String fetchNativePackageName();

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchNativeRelease(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchNativeSdkInfo(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract WritableMap fetchNativeStackFramesBy(ReadableArray readableArray);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchViewHierarchy(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract String getCurrentReplayId();

    @ReactMethod
    @InterfaceC4488a
    public abstract void getDataFromUri(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getNewScreenTimeToDisplay(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void initNativeReactNavigationNewFrameTracking(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void initNativeSdk(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void pauseAppHangTracking();

    @ReactMethod
    @InterfaceC4488a
    public abstract void popTimeToDisplayFor(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeAttribute(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void resumeAppHangTracking();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean setActiveSpanId(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setAttribute(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setAttributes(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setContext(String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setExtra(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setTag(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setUser(ReadableMap readableMap, ReadableMap readableMap2);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract WritableMap startProfiling(boolean z10);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract WritableMap stopProfiling();
}
