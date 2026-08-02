package com.rebetmobileapp;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.rebetmobileapp.NativeTestCrashModule;

/* loaded from: classes4.dex */
public class NativeTestCrashModule extends ReactContextBaseJavaModule {
    public NativeTestCrashModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static /* synthetic */ void a() {
        throw new RuntimeException("NativeTestCrashModule: intentional crash from sportsbook (remove before release)");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativeTestCrashModule";
    }

    @ReactMethod
    public void triggerNativeTestCrash() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: uc.a
            @Override // java.lang.Runnable
            public final void run() {
                NativeTestCrashModule.a();
            }
        });
    }
}
