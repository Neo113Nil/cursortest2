package io.agora.meta;

import android.view.TextureView;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public interface IMetaSceneEventHandler {
    @CalledByNative
    void onAddSceneViewResult(TextureView textureView, int i10);

    @CalledByNative
    void onEnterSceneResult(int i10);

    @CalledByNative
    void onLeaveSceneResult(int i10);

    @CalledByNative
    void onReleasedScene(int i10);

    @CalledByNative
    void onRemoveSceneViewResult(TextureView textureView, int i10);

    @CalledByNative
    void onSceneMessageReceived(byte[] bArr);

    @CalledByNative
    void onSceneVideoFrameCaptured(TextureView textureView, VideoFrame videoFrame);

    @CalledByNative
    void onUserPositionChanged(String str, MetaUserPositionInfo metaUserPositionInfo);
}
