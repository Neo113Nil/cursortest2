package io.agora.base.internal.video;

import io.agora.base.VideoFrame;

/* loaded from: classes2.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z10);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
