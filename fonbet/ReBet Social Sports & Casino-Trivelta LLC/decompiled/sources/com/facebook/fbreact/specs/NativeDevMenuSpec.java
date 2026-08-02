package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes2.dex */
public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevMenu";

    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevMenu";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void reload();

    @ReactMethod
    @InterfaceC4488a
    public abstract void setHotLoadingEnabled(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setProfilingEnabled(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void show();
}
