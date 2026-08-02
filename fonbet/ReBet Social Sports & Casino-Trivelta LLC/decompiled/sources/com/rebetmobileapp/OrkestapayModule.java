package com.rebetmobileapp;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.orkestapay.orkestapay.client.OrkestapayClient;

/* loaded from: classes4.dex */
public class OrkestapayModule extends ReactContextBaseJavaModule {
    private static final String TAG = "OrkestapayBridge";
    private OrkestapayClient client;

    public OrkestapayModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getDeviceInfo(Promise promise) {
        promise.reject("NOT_IMPLEMENTED", "OrkestaPay getDeviceInfo not implemented on Android yet");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void initialize(String str, String str2, boolean z10) {
        try {
            this.client = new OrkestapayClient(str, str2, !z10);
        } catch (Exception e10) {
            Log.e(TAG, "Failed to initialize OrkestaPay SDK: " + e10.getMessage());
        }
    }

    @ReactMethod
    public void tokenize(ReadableMap readableMap, boolean z10, String str, Promise promise) {
        promise.reject("NOT_IMPLEMENTED", "OrkestaPay tokenize not implemented on Android yet");
    }
}
