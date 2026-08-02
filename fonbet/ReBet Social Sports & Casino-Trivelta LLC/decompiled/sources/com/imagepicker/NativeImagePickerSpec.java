package com.imagepicker;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes3.dex */
public abstract class NativeImagePickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImagePicker";

    public NativeImagePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void launchCamera(ReadableMap readableMap, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void launchImageLibrary(ReadableMap readableMap, Callback callback);
}
