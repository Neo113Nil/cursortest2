package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes2.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevSettings";
    }

    @ReactMethod
    @InterfaceC4488a
    public void onFastRefresh() {
    }

    @ReactMethod
    @InterfaceC4488a
    public void openDebugger() {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void reload();

    @ReactMethod
    @InterfaceC4488a
    public void reloadWithReason(String str) {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setHotLoadingEnabled(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setProfilingEnabled(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void toggleElementInspector();
}
