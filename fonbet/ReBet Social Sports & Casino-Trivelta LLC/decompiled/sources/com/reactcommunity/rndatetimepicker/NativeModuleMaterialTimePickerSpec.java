package com.reactcommunity.rndatetimepicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public abstract class NativeModuleMaterialTimePickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCMaterialTimePicker";

    public NativeModuleMaterialTimePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void dismiss(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCMaterialTimePicker";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void open(ReadableMap readableMap, Promise promise);
}
