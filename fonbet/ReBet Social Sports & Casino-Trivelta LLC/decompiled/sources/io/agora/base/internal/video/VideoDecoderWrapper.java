package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.video.VideoDecoder;

/* loaded from: classes2.dex */
class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(final long j10) {
        return new VideoDecoder.Callback() { // from class: io.agora.base.internal.video.VideoDecoderWrapper.1
            @Override // io.agora.base.internal.video.VideoDecoder.Callback
            public void onDecodeBufferPrepared(long j11) {
                VideoDecoderWrapper.nativeOnDecodeBufferPrepared(j10, j11);
            }

            @Override // io.agora.base.internal.video.VideoDecoder.Callback
            public void onDecodeReset() {
                VideoDecoderWrapper.nativeOnDecodeReset(j10);
            }

            @Override // io.agora.base.internal.video.VideoDecoder.Callback
            public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2, int i10, int i11, int i12, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j10, videoFrame, num, num2, i10, i11, i12, codecSpecificInfo, frameExtraInfo);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodeBufferPrepared(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodeReset(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j10, VideoFrame videoFrame, Integer num, Integer num2, int i10, int i11, int i12, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);
}
