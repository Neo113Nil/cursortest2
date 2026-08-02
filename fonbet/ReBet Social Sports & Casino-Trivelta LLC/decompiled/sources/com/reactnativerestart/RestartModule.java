package com.reactnativerestart;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.jakewharton.processphoenix.ProcessPhoenix;
import rc.InterfaceC6216a;

/* loaded from: classes4.dex */
public class RestartModule extends ReactContextBaseJavaModule {
    private static final String REACT_APPLICATION_CLASS_NAME = "com.facebook.react.ReactApplication";
    private static final String REACT_NATIVE_HOST_CLASS_NAME = "com.facebook.react.ReactNativeHost";
    private static InterfaceC6216a mReactInstanceHolder;
    private LifecycleEventListener mLifecycleEventListener;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f41412a;

        public a(Activity activity) {
            this.f41412a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41412a.recreate();
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReactInstanceManager f41414a;

        public b(ReactInstanceManager reactInstanceManager) {
            this.f41414a = reactInstanceManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41414a.recreateReactContextInBackground();
            } catch (Throwable unused) {
                RestartModule.this.loadBundleLegacy();
            }
        }
    }

    public RestartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mLifecycleEventListener = null;
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    public static ReactInstanceManager getReactInstanceManager() {
        return null;
    }

    private void loadBundle() {
        clearLifecycleEventListener();
        try {
            ReactInstanceManager resolveInstanceManager = resolveInstanceManager();
            if (resolveInstanceManager == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new b(resolveInstanceManager));
        } catch (Throwable unused) {
            loadBundleLegacy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadBundleLegacy() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new a(currentActivity));
    }

    private ReactInstanceManager resolveInstanceManager() {
        ReactInstanceManager reactInstanceManager = getReactInstanceManager();
        if (reactInstanceManager != null) {
            return reactInstanceManager;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((ReactApplication) currentActivity.getApplication()).getReactNativeHost().getReactInstanceManager();
    }

    @ReactMethod
    public void Restart() {
        ProcessPhoenix.b(getReactApplicationContext());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRestart";
    }

    @ReactMethod
    public void restart() {
        ProcessPhoenix.b(getReactApplicationContext());
    }
}
