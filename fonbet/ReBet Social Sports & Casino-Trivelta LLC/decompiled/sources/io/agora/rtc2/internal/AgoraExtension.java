package io.agora.rtc2.internal;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class AgoraExtension {
    private long nativeProvider;
    private String vendor;

    public AgoraExtension(String str, long j10) {
        this.vendor = str;
        this.nativeProvider = j10;
    }

    @CalledByNative
    public long getNativeProvider() {
        return this.nativeProvider;
    }

    @CalledByNative
    public String getVendor() {
        return this.vendor;
    }
}
