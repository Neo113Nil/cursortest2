package com.reactnativeimageresizer;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public abstract class NativeImageResizerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageResizer";

    public NativeImageResizerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void createResizedImage(String str, double d10, double d11, String str2, double d12, String str3, boolean z10, Double d13, String str4, Boolean bool, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageResizer";
    }
}
