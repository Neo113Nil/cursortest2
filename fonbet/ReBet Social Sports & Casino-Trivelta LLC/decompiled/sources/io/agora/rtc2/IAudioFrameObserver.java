package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.audio.AudioParams;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface IAudioFrameObserver {
    @CalledByNative
    AudioParams getEarMonitoringAudioParams();

    @CalledByNative
    AudioParams getMixedAudioParams();

    @CalledByNative
    int getObservedAudioFramePosition();

    @CalledByNative
    AudioParams getPlaybackAudioParams();

    @CalledByNative
    AudioParams getRecordAudioParams();

    @CalledByNative
    boolean onEarMonitoringAudioFrame(int i10, int i11, int i12, int i13, int i14, ByteBuffer byteBuffer, long j10, int i15);

    @CalledByNative
    boolean onMixedAudioFrame(String str, int i10, int i11, int i12, int i13, int i14, ByteBuffer byteBuffer, long j10, int i15);

    @CalledByNative
    boolean onPlaybackAudioFrame(String str, int i10, int i11, int i12, int i13, int i14, ByteBuffer byteBuffer, long j10, int i15);

    @CalledByNative
    boolean onPlaybackAudioFrameBeforeMixing(String str, int i10, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, long j10, int i16, int i17, long j11);

    @CalledByNative
    boolean onRecordAudioFrame(String str, int i10, int i11, int i12, int i13, int i14, ByteBuffer byteBuffer, long j10, int i15);
}
