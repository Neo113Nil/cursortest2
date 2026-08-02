package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.video.AgoraMetadata;

/* loaded from: classes3.dex */
public interface IMetadataObserver {
    public static final int UNKNOWN_METADATA = -1;
    public static final int VIDEO_METADATA = 0;

    @CalledByNative
    int getMaxMetadataSize();

    @CalledByNative
    void onMetadataReceived(AgoraMetadata agoraMetadata);

    @CalledByNative
    byte[] onReadyToSendMetadata(long j10, int i10);
}
