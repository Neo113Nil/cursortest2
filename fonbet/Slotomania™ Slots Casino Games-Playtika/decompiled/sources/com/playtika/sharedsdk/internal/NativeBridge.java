package com.playtika.sharedsdk.internal;

/* loaded from: classes8.dex */
public final class NativeBridge {
    public static native void nativeBackPressed();

    public static native void nativeDebugConfigReady(String str);

    public static native void nativeExecuteScript(String str, boolean z);

    public static native void nativeHandleIntent(String str);

    public static native void nativeInitApp(Object obj, Object obj2, String str, String str2, String str3, String str4, int i);

    public static native void nativeKeyDown(int i);

    public static native void nativeKeyUp(int i);

    public static native void nativeKeyboardVisibilityChanged(int i);

    public static native void nativeLowMemory();

    public static native void nativeOnPause();

    public static native void nativeOnResume();

    public static native void nativeOnSurfaceChanged(int i, int i2);

    public static native void nativeOnSurfaceCreated(int i, int i2);

    public static native void nativeReloadApp(Object obj);

    public static native void nativeRender();

    public static native void nativeSetDefaultAudioStreamValues(int i, int i2);

    public static native void nativeSetFps(int i);

    public static native void nativeSetSafeInsets(int i, int i2, int i3, int i4);

    public static native void nativeTextInput(String str);

    public static native void nativeTouchBegin(float f, float f2);

    public static native void nativeTouchEnd(float f, float f2);

    public static native void nativeTouchMove(float f, float f2);

    public static native void nativeWheel(float f, float f2, float f3, float f4);

    public static native void onAppDestroyed();

    static {
        System.loadLibrary("SharedSdk");
    }

    private NativeBridge() {
    }
}
