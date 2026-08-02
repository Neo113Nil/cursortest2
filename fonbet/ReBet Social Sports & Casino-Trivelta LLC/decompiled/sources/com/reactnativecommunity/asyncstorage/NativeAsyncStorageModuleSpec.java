package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public abstract class NativeAsyncStorageModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCAsyncStorage";

    public NativeAsyncStorageModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void clear(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getAllKeys(Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void multiSet(ReadableArray readableArray, Callback callback);
}
