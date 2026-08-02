package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface IAudioEncodedFrameObserver {
    @CalledByNative
    void onMixedAudioEncodedFrame(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);

    @CalledByNative
    void onPlaybackAudioEncodedFrame(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);

    @CalledByNative
    void onRecordAudioEncodedFrame(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);
}
