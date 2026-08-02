package com.reactnativecommunity.netinfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import nc.f;

/* loaded from: classes4.dex */
public class NetInfoModule extends NativeRNCNetInfoSpec {
    private f implementation;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.implementation = new f(reactApplicationContext);
    }

    @Override // com.reactnativecommunity.netinfo.NativeRNCNetInfoSpec
    @ReactMethod
    public void addListener(String str) {
        this.implementation.b(str);
    }

    @Override // com.reactnativecommunity.netinfo.NativeRNCNetInfoSpec
    @ReactMethod
    public void configure(ReadableMap readableMap) {
    }

    @Override // com.reactnativecommunity.netinfo.NativeRNCNetInfoSpec
    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.implementation.c(str, promise);
    }

    @Override // com.reactnativecommunity.netinfo.NativeRNCNetInfoSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeRNCNetInfoSpec.NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.implementation.d();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.implementation.f();
    }

    @Override // com.reactnativecommunity.netinfo.NativeRNCNetInfoSpec
    @ReactMethod
    public void removeListeners(double d10) {
        this.implementation.g(d10);
    }
}
