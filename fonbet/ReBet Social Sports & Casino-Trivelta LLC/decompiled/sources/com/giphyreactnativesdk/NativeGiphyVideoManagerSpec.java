package com.giphyreactnativesdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes2.dex */
public abstract class NativeGiphyVideoManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RTNGiphyVideoManager";

    public NativeGiphyVideoManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNGiphyVideoManager";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void muteAll();

    @ReactMethod
    @InterfaceC4488a
    public abstract void pauseAll();

    @ReactMethod
    @InterfaceC4488a
    public abstract void resume();
}
