package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class CodecCapLevels {
    public int hwDecodingLevel;
    public int swDecodingLevel;

    public CodecCapLevels() {
        this.hwDecodingLevel = -1;
        this.swDecodingLevel = -1;
    }

    @CalledByNative
    public CodecCapLevels(int i10, int i11) {
        this.hwDecodingLevel = i10;
        this.swDecodingLevel = i11;
    }
}
