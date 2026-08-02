package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public interface VideoDecoderFactory {
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo, boolean z10);

    @Deprecated
    VideoDecoder createDecoder(String str);

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}
