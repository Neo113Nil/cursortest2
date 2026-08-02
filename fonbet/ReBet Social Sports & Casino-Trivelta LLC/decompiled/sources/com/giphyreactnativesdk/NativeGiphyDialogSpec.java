package com.giphyreactnativesdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes2.dex */
public abstract class NativeGiphyDialogSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RTNGiphyDialogModule";

    public NativeGiphyDialogSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void configure(ReadableMap readableMap);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNGiphyDialogModule";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void hide();

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void show();
}
