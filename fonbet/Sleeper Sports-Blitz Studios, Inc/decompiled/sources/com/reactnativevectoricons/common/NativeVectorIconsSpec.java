package com.reactnativevectoricons.common;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes8.dex */
public abstract class NativeVectorIconsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "VectorIcons";

    @ReactMethod
    public abstract void getImageForFont(String str, String str2, double d, double d2, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getImageForFontSync(String str, String str2, double d, double d2);

    public NativeVectorIconsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "VectorIcons";
    }
}
