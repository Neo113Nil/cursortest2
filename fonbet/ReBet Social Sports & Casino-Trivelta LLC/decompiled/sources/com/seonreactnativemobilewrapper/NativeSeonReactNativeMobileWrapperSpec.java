package com.seonreactnativemobilewrapper;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public abstract class NativeSeonReactNativeMobileWrapperSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SeonReactNativeMobileWrapperSpec";

    public NativeSeonReactNativeMobileWrapperSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getFingerprintBase64(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SeonReactNativeMobileWrapperSpec";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void setDnsTimeout(double d10, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setGeoLocationConfig(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setGeolocationEnabled(boolean z10, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLoggingEnabled(boolean z10, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setSessionId(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startBehaviourMonitoring(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void stopBehaviourMonitoring(Promise promise);
}
