package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public interface VideoEncoderFactory {
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z10);

    @CalledByNative
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z10, boolean z11);

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs(boolean z10);
}
