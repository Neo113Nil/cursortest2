package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.video.VideoEncoder;

/* loaded from: classes2.dex */
abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus attachProxyThread() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public abstract long createNativeVideoEncoder();

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus detachProxyThread() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo, CodecSpecificInfo codecSpecificInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus flush() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoEncoder.EncoderStyle getEncoderStyle() {
        return null;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public long getResetCoolDownTimeMs() {
        return 0L;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // io.agora.base.internal.video.VideoEncoder
    public boolean isQcomHardware() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus resume() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus setChannelParameters(short s10, long j10) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus setRates(int i10, int i11) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
