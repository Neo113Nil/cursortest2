package com.reactnativecommunity.clipboard;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public abstract class NativeClipboardModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCClipboard";

    public NativeClipboardModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getImage(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getImageJPG(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getImagePNG(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCClipboard";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getString(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getStrings(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void hasImage(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void hasNumber(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void hasString(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void hasURL(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void hasWebURL(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListener();

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setImage(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setListener();

    @ReactMethod
    @InterfaceC4488a
    public abstract void setString(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setStrings(ReadableArray readableArray);
}
