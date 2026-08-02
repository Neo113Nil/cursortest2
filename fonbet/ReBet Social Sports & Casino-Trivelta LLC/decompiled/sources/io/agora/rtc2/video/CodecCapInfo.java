package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class CodecCapInfo {
    public int codecCapMask;
    public CodecCapLevels codecLevels;
    public int codecType;

    @CalledByNative
    public CodecCapInfo(int i10, int i11, CodecCapLevels codecCapLevels) {
        this.codecType = i10;
        this.codecCapMask = i11;
        this.codecLevels = codecCapLevels;
    }

    @CalledByNative
    public void SetCodecCapMask(int i10) {
        this.codecCapMask = i10;
    }

    @CalledByNative
    public void SetCodecType(int i10) {
        this.codecType = i10;
    }
}
