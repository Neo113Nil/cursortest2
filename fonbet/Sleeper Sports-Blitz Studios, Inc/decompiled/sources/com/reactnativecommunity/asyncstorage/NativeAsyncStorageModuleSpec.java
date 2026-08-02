package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes8.dex */
public abstract class NativeAsyncStorageModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCAsyncStorage";

    @ReactMethod
    public abstract void clear(Callback callback);

    @ReactMethod
    public abstract void getAllKeys(Callback callback);

    @ReactMethod
    public abstract void multiGet(ReadableArray keys, Callback callback);

    @ReactMethod
    public abstract void multiMerge(ReadableArray kvPairs, Callback callback);

    @ReactMethod
    public abstract void multiRemove(ReadableArray keys, Callback callback);

    @ReactMethod
    public abstract void multiSet(ReadableArray kvPairs, Callback callback);

    public NativeAsyncStorageModuleSpec(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNCAsyncStorage";
    }
}
