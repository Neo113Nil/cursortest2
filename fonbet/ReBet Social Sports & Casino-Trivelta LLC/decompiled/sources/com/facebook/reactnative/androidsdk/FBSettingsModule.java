package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import g6.C4331C;
import t8.AbstractC6451e;

@ReactModule(name = FBSettingsModule.NAME)
/* loaded from: classes2.dex */
public class FBSettingsModule extends BaseJavaModule {
    public static final String NAME = "FBSettings";

    @ReactMethod
    public static void setAdvertiserIDCollectionEnabled(Boolean bool) {
        C4331C.W(bool.booleanValue());
    }

    @ReactMethod
    public static void setAppID(String str) {
        C4331C.X(str);
    }

    @ReactMethod
    public static void setAppName(String str) {
        C4331C.Y(str);
    }

    @ReactMethod
    public static void setAutoLogAppEventsEnabled(Boolean bool) {
        C4331C.Z(bool.booleanValue());
    }

    @ReactMethod
    public static void setClientToken(String str) {
        C4331C.a0(str);
    }

    @ReactMethod
    public static void setGraphAPIVersion(String str) {
        C4331C.c0(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void initializeSDK() {
        C4331C.j();
    }

    @ReactMethod
    public void setDataProcessingOptions(ReadableArray readableArray, int i10, int i11) {
        C4331C.b0((String[]) AbstractC6451e.p(readableArray).toArray(new String[0]), i10, i11);
    }
}
