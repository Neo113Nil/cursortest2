package com.bytedance.shadowhook;

/* loaded from: classes12.dex */
public final class ShadowHook {

    public enum Mode {
        SHARED(0),
        UNIQUE(1),
        MULTI(2);

        private final int value;

        Mode(int i) {
            this.value = i;
        }
    }

    static {
        Mode.SHARED.getClass();
    }

    private static native String nativeGetArch();

    private static native boolean nativeGetDebuggable();

    private static native boolean nativeGetDisable();

    private static native int nativeGetInitErrno();

    private static native int nativeGetMode();

    private static native boolean nativeGetRecordable();

    private static native String nativeGetRecords(int i);

    private static native String nativeGetVersion();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebuggable(boolean z);

    private static native void nativeSetDisable(boolean z);

    private static native void nativeSetRecordable(boolean z);

    private static native String nativeToErrmsg(int i);
}
