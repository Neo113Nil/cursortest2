package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class RecorderInfo {
    public int durationMs;
    public String fileName;
    public int fileSize;

    @CalledByNative
    public RecorderInfo(String str, int i10, int i11) {
        this.fileName = str;
        this.durationMs = i10;
        this.fileSize = i11;
    }
}
