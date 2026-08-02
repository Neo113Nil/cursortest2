package com.mkuczera;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public class RNReactNativeHapticFeedbackModule extends NativeHapticFeedbackSpec {
    ReactApplicationContext reactContext;

    public RNReactNativeHapticFeedbackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.mkuczera.NativeHapticFeedbackSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeHapticFeedbackSpec.NAME;
    }

    @Override // com.mkuczera.NativeHapticFeedbackSpec
    public void trigger(String str, ReadableMap readableMap) {
        a.b(this.reactContext, str, readableMap);
    }
}
