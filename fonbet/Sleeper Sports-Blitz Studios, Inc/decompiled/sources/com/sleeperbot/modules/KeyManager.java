package com.sleeperbot.modules;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* loaded from: classes8.dex */
public class KeyManager extends ReactContextBaseJavaModule {
    public KeyManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyManager";
    }

    @ReactMethod
    public void getEncryptionKey(Promise promise) {
        try {
            promise.resolve("SbW#W3s7y2!yP7bD5R4BKpLwBUD#z#");
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get encryption key: " + e.getMessage()));
        }
    }
}
