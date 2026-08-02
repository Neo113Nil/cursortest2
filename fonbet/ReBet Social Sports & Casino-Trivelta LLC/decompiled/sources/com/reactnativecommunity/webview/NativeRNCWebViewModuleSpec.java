package com.reactnativecommunity.webview;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public abstract class NativeRNCWebViewModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCWebViewModule";

    public NativeRNCWebViewModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void isFileUploadSupported(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void shouldStartLoadWithLockIdentifier(boolean z10, double d10);
}
