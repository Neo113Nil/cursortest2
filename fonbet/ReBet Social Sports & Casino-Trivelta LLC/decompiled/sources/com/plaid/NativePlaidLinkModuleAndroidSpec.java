package com.plaid;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes3.dex */
public abstract class NativePlaidLinkModuleAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PlaidAndroid";

    public NativePlaidLinkModuleAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void createPlaidLink(String str, boolean z10, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void destroy(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlaidAndroid";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void open(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startLinkActivityForResult(String str, boolean z10, String str2, Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void submit(String str, String str2, ReadableMap readableMap);
}
