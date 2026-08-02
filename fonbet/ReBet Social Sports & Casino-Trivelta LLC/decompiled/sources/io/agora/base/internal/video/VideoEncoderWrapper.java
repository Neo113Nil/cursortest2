package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.video.VideoEncoder;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class VideoEncoderWrapper {
    @CalledByNative
    public static VideoEncoder.Callback createEncoderCallback(final long j10) {
        return new VideoEncoder.Callback() { // from class: io.agora.base.internal.video.VideoEncoderWrapper.1
            @Override // io.agora.base.internal.video.VideoEncoder.Callback
            public void onEncodeBufferPrepared(long j11) {
                VideoEncoderWrapper.nativeOnEncodeBufferPrepared(j10, j11);
            }

            @Override // io.agora.base.internal.video.VideoEncoder.Callback
            public void onEncodeReset() {
                VideoEncoderWrapper.nativeOnEncodeReset(j10);
            }

            @Override // io.agora.base.internal.video.VideoEncoder.Callback
            public void onEncodedFrame(EncodedImage encodedImage, int i10, int i11, int i12, int i13, int i14, CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.nativeOnEncodedFrame(j10, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative(), encodedImage.rotation, encodedImage.completeFrame, encodedImage.qp, encodedImage.shouldSkipColorSpaceOverride, i10, i11, i12, i13, i14, codecSpecificInfo);
            }
        };
    }

    @CalledByNative
    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    @CalledByNative
    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    @CalledByNative
    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodeBufferPrepared(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodeReset(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j10, ByteBuffer byteBuffer, int i10, int i11, long j11, int i12, int i13, boolean z10, Integer num, boolean z11, int i14, int i15, int i16, int i17, int i18, CodecSpecificInfo codecSpecificInfo);

    private static native int nativeRewriteSpsInConfigBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11);

    private static native boolean nativeShouldUseBaseline();

    public static int rewriteSpsInConfigBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11) {
        return nativeRewriteSpsInConfigBuffer(byteBuffer, byteBuffer2, i10, i11);
    }

    public static boolean shouldUseBaseline() {
        return nativeShouldUseBaseline();
    }
}
