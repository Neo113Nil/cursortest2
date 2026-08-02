package com.reactnativesystemnavigationbar;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.reactnativesystemnavigationbar.SystemNavigationBarModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ReactModule(name = SystemNavigationBarModule.NAME)
/* loaded from: classes4.dex */
public class SystemNavigationBarModule extends ReactContextBaseJavaModule {
    public static final String NAME = "NavigationBar";
    public static final Integer NO_MODE = -1;
    public static final Integer LIGHT = 0;
    public static final Integer DARK = 1;
    public static final Integer NAVIGATION_BAR = 2;
    public static final Integer STATUS_BAR = 3;
    public static final Integer NAVIGATION_BAR_STATUS_BAR = 4;
    private static final Integer INSETS_TYPE_HIDE = 5;
    private static final Integer INSETS_TYPE_SHOW = 6;
    private static final Integer INSETS_TYPE_APPEARANCE = 7;
    private static final Integer INSETS_TYPE_APPEARANCE_CLEAR = 8;
    private static final Integer INSETS_TYPE_BEHAVIOR = 9;

    public SystemNavigationBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static /* synthetic */ void c(Window window, Boolean bool) {
        window.clearFlags(512);
        window.clearFlags(134217728);
        if (bool.booleanValue()) {
            window.setFlags(134217728, 134217728);
        }
    }

    private String convertColorToHexCode(int i10) {
        return String.format("#%06X", Integer.valueOf(i10 & 16777215));
    }

    public static /* synthetic */ void d(Boolean bool, Window window) {
        if (bool.booleanValue()) {
            window.getDecorView().setSystemUiVisibility(0);
        } else {
            window.getDecorView().setSystemUiVisibility(1792);
        }
    }

    private String errorMessage(int i10) {
        return "Your device version: " + Build.VERSION.SDK_INT + ". Supported API Level: " + i10;
    }

    public static /* synthetic */ void h(Window window, Integer num) {
        window.setNavigationBarDividerColor(num.intValue());
        window.getDecorView().setSystemUiVisibility(-2013265920);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBarColor$3(Promise promise, Integer num) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                promise.reject("Error: ", "current activity is null");
                return;
            }
            Window window = currentActivity.getWindow();
            int navigationBarColor = window.getNavigationBarColor();
            int statusBarColor = window.getStatusBarColor();
            if (num.equals(STATUS_BAR)) {
                promise.resolve(convertColorToHexCode(statusBarColor));
            } else if (num.equals(NAVIGATION_BAR)) {
                promise.resolve(convertColorToHexCode(navigationBarColor));
            } else if (num.equals(NAVIGATION_BAR_STATUS_BAR)) {
                promise.resolve(String.format("{ \"status\": \"%s\", \"navigation\": \"%s\" }", convertColorToHexCode(statusBarColor), convertColorToHexCode(navigationBarColor)));
            }
        } catch (IllegalViewOperationException e10) {
            e10.printStackTrace();
            promise.reject("Error: ", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setModeStyle$8(Promise promise, Boolean bool, Integer num) {
        if (getCurrentActivity() == null) {
            promise.reject("Error: ", "current activity is null");
        } else {
            setModeStyle(bool, num);
            promise.resolve("true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNavigationColor$1(Window window, Boolean bool, Integer num, Integer num2, Integer num3) {
        window.clearFlags(512);
        window.clearFlags(134217728);
        if (bool.booleanValue()) {
            window.setFlags(134217728, 134217728);
        }
        if (num.equals(0) && !bool.booleanValue()) {
            window.setFlags(512, 512);
            window.setFlags(134217728, 134217728);
        }
        window.setNavigationBarColor(num.intValue());
        if (Objects.equals(num2, NO_MODE)) {
            return;
        }
        setModeStyle(Boolean.valueOf(!num2.equals(LIGHT)), num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSystemInsetsController$6(Promise promise, Integer num, int i10) {
        WindowInsetsController insetsController;
        if (Build.VERSION.SDK_INT < 30) {
            promise.reject("Error: ", errorMessage(30));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("Error: ", "current activity is null");
            return;
        }
        insetsController = currentActivity.getWindow().getInsetsController();
        if (insetsController != null) {
            if (num.equals(INSETS_TYPE_HIDE)) {
                insetsController.hide(i10);
            } else if (num.equals(INSETS_TYPE_SHOW)) {
                insetsController.show(i10);
            } else if (num.equals(INSETS_TYPE_APPEARANCE)) {
                insetsController.setSystemBarsAppearance(i10, i10);
            } else if (num.equals(INSETS_TYPE_APPEARANCE_CLEAR)) {
                insetsController.setSystemBarsAppearance(0, i10);
            } else if (num.equals(INSETS_TYPE_BEHAVIOR)) {
                insetsController.setSystemBarsBehavior(i10);
            }
        }
        promise.resolve("true");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSystemUIFlags$7(Promise promise, int i10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("Error: ", "current activity is null");
        } else {
            currentActivity.getWindow().getDecorView().setSystemUiVisibility(i10);
            promise.resolve("true");
        }
    }

    private void setModeStyle(Boolean bool, Integer num) {
        int i10;
        WindowInsetsController insetsController;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30) {
            if (i11 >= 26) {
                View decorView = getCurrentActivity().getWindow().getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                i10 = num.equals(NAVIGATION_BAR) ? 16 : num.equals(STATUS_BAR) ? 8192 : num.equals(NAVIGATION_BAR_STATUS_BAR) ? 8208 : 0;
                decorView.setSystemUiVisibility(bool.booleanValue() ? systemUiVisibility | i10 : (~i10) & systemUiVisibility);
                return;
            }
            return;
        }
        insetsController = currentActivity.getWindow().getInsetsController();
        if (insetsController != null) {
            i10 = num.equals(NAVIGATION_BAR) ? 16 : num.equals(STATUS_BAR) ? 8 : num.equals(NAVIGATION_BAR_STATUS_BAR) ? 24 : 0;
            if (bool.booleanValue()) {
                insetsController.setSystemBarsAppearance(i10, i10);
            } else {
                insetsController.setSystemBarsAppearance(0, i10);
            }
        }
    }

    private void setSystemInsetsController(final int i10, final Integer num, final Promise promise) {
        try {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.g
                @Override // java.lang.Runnable
                public final void run() {
                    SystemNavigationBarModule.this.lambda$setSystemInsetsController$6(promise, num, i10);
                }
            });
        } catch (IllegalViewOperationException e10) {
            e10.printStackTrace();
            promise.reject("Error: ", e10.getMessage());
        }
    }

    private void setSystemUIFlags(final int i10, final Promise promise) {
        try {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.h
                @Override // java.lang.Runnable
                public final void run() {
                    SystemNavigationBarModule.this.lambda$setSystemUIFlags$7(promise, i10);
                }
            });
        } catch (IllegalViewOperationException e10) {
            e10.printStackTrace();
            promise.reject("Error: ", e10.getMessage());
        }
    }

    @ReactMethod
    public void fullScreen(final Boolean bool, Promise promise) {
        int navigationBars;
        int statusBars;
        if (Build.VERSION.SDK_INT >= 30) {
            navigationBars = WindowInsets.Type.navigationBars();
            statusBars = WindowInsets.Type.statusBars();
            int i10 = navigationBars | statusBars;
            Integer num = bool.booleanValue() ? INSETS_TYPE_HIDE : INSETS_TYPE_SHOW;
            num.intValue();
            setSystemInsetsController(i10, num, promise);
        } else if (bool.booleanValue()) {
            setSystemUIFlags(3846, promise);
        } else {
            setSystemUIFlags(1792, promise);
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("Error: ", "current activity is null");
        } else {
            final Window window = currentActivity.getWindow();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.d
                @Override // java.lang.Runnable
                public final void run() {
                    SystemNavigationBarModule.c(window, bool);
                }
            });
        }
    }

    @ReactMethod
    public void getBarColor(final Integer num, final Promise promise) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.i
            @Override // java.lang.Runnable
            public final void run() {
                SystemNavigationBarModule.this.lambda$getBarColor$3(promise, num);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("NO_MODE", NO_MODE);
        hashMap.put("LIGHT", LIGHT);
        hashMap.put("DARK", DARK);
        hashMap.put("NAVIGATION_BAR", NAVIGATION_BAR);
        hashMap.put("STATUS_BAR", STATUS_BAR);
        hashMap.put("NAVIGATION_BAR_STATUS_BAR", NAVIGATION_BAR_STATUS_BAR);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void immersive(Promise promise) {
        int navigationBars;
        int statusBars;
        if (Build.VERSION.SDK_INT < 30) {
            setSystemUIFlags(2054, promise);
            return;
        }
        navigationBars = WindowInsets.Type.navigationBars();
        statusBars = WindowInsets.Type.statusBars();
        setSystemInsetsController(navigationBars | statusBars, INSETS_TYPE_HIDE, promise);
        setSystemInsetsController(1, INSETS_TYPE_BEHAVIOR, promise);
    }

    @ReactMethod
    public void leanBack(Boolean bool, Promise promise) {
        if (bool.booleanValue()) {
            setSystemUIFlags(6, promise);
        } else {
            setSystemUIFlags(0, promise);
        }
    }

    @ReactMethod
    public void lowProfile(Boolean bool, Promise promise) {
        if (bool.booleanValue()) {
            setSystemUIFlags(1, promise);
        } else {
            setSystemUIFlags(0, promise);
        }
    }

    @ReactMethod
    public void navigationHide(Promise promise) {
        int navigationBars;
        if (Build.VERSION.SDK_INT < 30) {
            setSystemUIFlags(4610, promise);
        } else {
            navigationBars = WindowInsets.Type.navigationBars();
            setSystemInsetsController(navigationBars, INSETS_TYPE_HIDE, promise);
        }
    }

    @ReactMethod
    public void navigationShow(Promise promise) {
        int navigationBars;
        if (Build.VERSION.SDK_INT < 30) {
            setSystemUIFlags(0, promise);
        } else {
            navigationBars = WindowInsets.Type.navigationBars();
            setSystemInsetsController(navigationBars, INSETS_TYPE_SHOW, promise);
        }
    }

    @ReactMethod
    public void setBarMode(Integer num, Integer num2, Promise promise) {
        setModeStyle(Boolean.valueOf(!num.equals(LIGHT)), num2, promise);
    }

    @ReactMethod
    public void setFitsSystemWindows(final Boolean bool, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                promise.reject("Error: ", "current activity is null");
                return;
            }
            final Window window = currentActivity.getWindow();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.j
                @Override // java.lang.Runnable
                public final void run() {
                    SystemNavigationBarModule.d(bool, window);
                }
            });
            promise.resolve("true");
        } catch (IllegalViewOperationException e10) {
            e10.printStackTrace();
            promise.reject("Error: ", e10.getMessage());
        }
    }

    @ReactMethod
    public void setNavigationBarContrastEnforced(final Boolean bool, Promise promise) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                promise.reject("Error: ", errorMessage(29));
                return;
            }
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                promise.reject("Error: ", "current activity is null");
                return;
            }
            final Window window = currentActivity.getWindow();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.f
                @Override // java.lang.Runnable
                public final void run() {
                    window.setNavigationBarContrastEnforced(bool.booleanValue());
                }
            });
            promise.resolve("true");
        } catch (IllegalViewOperationException e10) {
            e10.printStackTrace();
            promise.reject("Error: ", e10.getMessage());
        }
    }

    @ReactMethod
    public void setNavigationBarDividerColor(final Integer num, Promise promise) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                promise.reject("Error: ", errorMessage(28));
                return;
            }
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                promise.reject("Error: ", "current activity is null");
                return;
            }
            final Window window = currentActivity.getWindow();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.b
                @Override // java.lang.Runnable
                public final void run() {
                    SystemNavigationBarModule.h(window, num);
                }
            });
            promise.resolve("true");
        } catch (IllegalViewOperationException e10) {
            e10.printStackTrace();
            promise.reject("Error: ", e10.getMessage());
        }
    }

    @ReactMethod
    public void setNavigationColor(final Integer num, final Boolean bool, final Integer num2, final Integer num3, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                promise.reject("Error: ", "current activity is null");
                return;
            }
            final Window window = currentActivity.getWindow();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.c
                @Override // java.lang.Runnable
                public final void run() {
                    SystemNavigationBarModule.this.lambda$setNavigationColor$1(window, bool, num, num2, num3);
                }
            });
            promise.resolve("true");
        } catch (IllegalViewOperationException e10) {
            e10.printStackTrace();
            promise.reject("Error: ", e10.getMessage());
        }
    }

    @ReactMethod
    public void stickyImmersive(Boolean bool, Promise promise) {
        int navigationBars;
        int statusBars;
        if (Build.VERSION.SDK_INT < 30) {
            if (bool.booleanValue()) {
                setSystemUIFlags(4102, promise);
                return;
            } else {
                setSystemUIFlags(0, promise);
                return;
            }
        }
        navigationBars = WindowInsets.Type.navigationBars();
        statusBars = WindowInsets.Type.statusBars();
        int i10 = navigationBars | statusBars;
        if (bool.booleanValue()) {
            setSystemInsetsController(i10, INSETS_TYPE_HIDE, promise);
            setSystemInsetsController(2, INSETS_TYPE_BEHAVIOR, promise);
        } else {
            setSystemInsetsController(i10, INSETS_TYPE_SHOW, promise);
            setSystemInsetsController(1, INSETS_TYPE_APPEARANCE_CLEAR, promise);
        }
    }

    private void setModeStyle(final Boolean bool, final Integer num, final Promise promise) {
        try {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sc.e
                @Override // java.lang.Runnable
                public final void run() {
                    SystemNavigationBarModule.this.lambda$setModeStyle$8(promise, bool, num);
                }
            });
        } catch (IllegalViewOperationException e10) {
            promise.reject("Error: ", e10.getMessage());
        }
    }
}
