package org.devio.rn.splashscreen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import xi.AbstractC6830c;

/* loaded from: classes5.dex */
public class SplashScreenModule extends ReactContextBaseJavaModule {
    public SplashScreenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SplashScreen";
    }

    @ReactMethod
    public void hide() {
        AbstractC6830c.d(getCurrentActivity());
    }

    @ReactMethod
    public void show() {
        AbstractC6830c.f(getCurrentActivity());
    }
}
