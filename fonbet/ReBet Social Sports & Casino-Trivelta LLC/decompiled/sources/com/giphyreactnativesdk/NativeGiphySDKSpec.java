package com.giphyreactnativesdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes2.dex */
public abstract class NativeGiphySDKSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RTNGiphySDKModule";

    public NativeGiphySDKSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void configure(String str, boolean z10, double d10);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNGiphySDKModule";
    }
}
