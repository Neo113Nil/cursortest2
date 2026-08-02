package io.agora.base.internal.video;

import android.graphics.SurfaceTexture;
import android.os.Handler;

/* loaded from: classes2.dex */
public interface ISurfaceTextureHelper {
    void dispose();

    Handler getHandler();

    SurfaceTexture getSurfaceTexture();

    boolean isOesTextureInUse();

    void setFrameRotation(int i10);

    void setTextureSize(int i10, int i11);

    void startListening(VideoSink videoSink);

    void stopListening();
}
