package io.agora.mediaplayer;

import android.view.Surface;
import io.agora.base.VideoFrame;

/* loaded from: classes2.dex */
public interface IPlayerTextureHelper {
    void dispose();

    VideoFrame getAvailableTextureInfo(int i10);

    long getEglContextHandler();

    VideoFrame getFakeTextureInfo();

    Surface getRenderGlSurface();

    void releaseRenderedTextureInfo(VideoFrame videoFrame);

    void resetTextureBufferQueue();

    void setTextureSize(int i10, int i11);
}
