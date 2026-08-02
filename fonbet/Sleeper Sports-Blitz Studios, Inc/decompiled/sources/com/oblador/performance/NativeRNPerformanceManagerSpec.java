package com.oblador.performance;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes8.dex */
public abstract class NativeRNPerformanceManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNPerformanceManager";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeRNPerformanceManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNPerformanceManager";
    }
}
