package com.reactnativedetector;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetectorModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/reactnativedetector/DetectorModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/reactnativedetector/ScreenshotDetectionListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "screenshotDetectionDelegate", "Lcom/reactnativedetector/ScreenshotDetectionDelegate;", "getName", "", "startScreenshotDetection", "", "stopScreenshotDetection", "onScreenCaptured", "path", "onScreenCapturedWithDeniedPermission", "react-native-detector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DetectorModule extends ReactContextBaseJavaModule implements ScreenshotDetectionListener {
    private final ReactApplicationContext reactContext;
    private final ScreenshotDetectionDelegate screenshotDetectionDelegate;

    @Override // com.reactnativedetector.ScreenshotDetectionListener
    public void onScreenCapturedWithDeniedPermission() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectorModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.screenshotDetectionDelegate = new ScreenshotDetectionDelegate(reactContext, this);
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Detector";
    }

    @ReactMethod
    public final void startScreenshotDetection() {
        this.screenshotDetectionDelegate.startScreenshotDetection();
    }

    @ReactMethod
    public final void stopScreenshotDetection() {
        this.screenshotDetectionDelegate.stopScreenshotDetection();
    }

    @Override // com.reactnativedetector.ScreenshotDetectionListener
    public void onScreenCaptured(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("UIApplicationUserDidTakeScreenshotNotification", null);
    }
}
