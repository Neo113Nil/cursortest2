package io.agora.rtc.ng.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes3.dex */
public abstract class NativeAgoraRtcNgSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AgoraRtcNg";

    public NativeAgoraRtcNgSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract String callApi(ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean destroyIrisApiEngine();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AgoraRtcNg";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean isPipActivated();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean newIrisApiEngine();

    @ReactMethod
    @InterfaceC4488a
    public abstract void pipDispose();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean pipIsAutoEnterSupported();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean pipIsSupported();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean pipSetup(ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC4488a
    public abstract boolean pipStart();

    @ReactMethod
    @InterfaceC4488a
    public abstract void pipStop();

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showRPSystemBroadcastPickerView(boolean z10, Promise promise);
}
