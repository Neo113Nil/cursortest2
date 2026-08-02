package com.unity3d.coherence;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
final class CoherenceBridge {
    static {
        System.loadLibrary("unitycoherencenative");
    }

    private CoherenceBridge() {
    }

    @Nullable
    public static native byte[] getCommonAttributes(long j, int i, int i2);

    @Nullable
    public static native byte[] getVersions(long j);

    public static native long init(Coherence coherence, String str, int i);

    public static native boolean isInitialized(long j);

    public static native void setExternalUserId(long j, String str);

    public static native void setLogHandler(LogHandler logHandler);

    public static native long vmCreate(long j, byte[] bArr);

    public static native void vmDrop(long j, long j2);

    public static native VmInvokeResult vmInvokeMain(long j, long j2, byte[] bArr);

    @Nullable
    public static native String vmLastError(long j);
}
