package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import g6.InterfaceC4350j;
import t8.C6447a;

/* loaded from: classes2.dex */
public abstract class FBSDKCallbackManagerBaseJavaModule extends ReactContextBaseJavaModule {
    private final C6447a mActivityEventListener;

    public FBSDKCallbackManagerBaseJavaModule(ReactApplicationContext reactApplicationContext, C6447a c6447a) {
        super(reactApplicationContext);
        this.mActivityEventListener = c6447a;
        reactApplicationContext.addActivityEventListener(c6447a);
    }

    public InterfaceC4350j getCallbackManager() {
        return this.mActivityEventListener.a();
    }
}
