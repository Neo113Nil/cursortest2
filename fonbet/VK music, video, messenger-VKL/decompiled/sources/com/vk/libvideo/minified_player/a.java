package com.vk.libvideo.minified_player;

import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: VideoMinifiedPlayerStateHolder.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<VideoMinimizableState, VideoMinifiedPlayerStateHolder.State> {
    @Override // xsna.izs
    public final VideoMinifiedPlayerStateHolder.State invoke(VideoMinimizableState videoMinimizableState) {
        VideoMinifiedPlayerStateHolder videoMinifiedPlayerStateHolder = (VideoMinifiedPlayerStateHolder) this.receiver;
        VideoMinifiedPlayerStateHolder videoMinifiedPlayerStateHolder2 = VideoMinifiedPlayerStateHolder.a;
        videoMinifiedPlayerStateHolder.getClass();
        return videoMinimizableState instanceof VideoMinimizableState.Hidden ? VideoMinifiedPlayerStateHolder.State.HIDDEN : VideoMinifiedPlayerStateHolder.State.OPENED;
    }
}
