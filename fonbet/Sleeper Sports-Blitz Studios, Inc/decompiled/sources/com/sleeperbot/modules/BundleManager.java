package com.sleeperbot.modules;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.microsoft.codepush.react.CodePush;

/* loaded from: classes8.dex */
public class BundleManager extends ReactContextBaseJavaModule {
    public BundleManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BundleManager";
    }

    @ReactMethod
    public void getMainBundleURL(Promise promise) {
        try {
            promise.resolve(CodePush.getJSBundleFile());
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not fetch main bundle url: " + e.getMessage()));
        }
    }
}
