package com.vk.libvideo.minified_player;

import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.pip.VideoPipStateHolder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: VideoMinifiedPlayerStateHolder.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements izs<VideoPipStateHolder.State, VideoMinifiedPlayerStateHolder.State> {
    @Override // xsna.izs
    public final VideoMinifiedPlayerStateHolder.State invoke(VideoPipStateHolder.State state) {
        VideoMinifiedPlayerStateHolder videoMinifiedPlayerStateHolder = (VideoMinifiedPlayerStateHolder) this.receiver;
        VideoMinifiedPlayerStateHolder videoMinifiedPlayerStateHolder2 = VideoMinifiedPlayerStateHolder.a;
        videoMinifiedPlayerStateHolder.getClass();
        int i = VideoMinifiedPlayerStateHolder.a.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return VideoMinifiedPlayerStateHolder.State.HIDDEN;
        }
        if (i == 2) {
            return VideoMinifiedPlayerStateHolder.State.ACTIVATED;
        }
        if (i == 3) {
            return VideoMinifiedPlayerStateHolder.State.OPENED;
        }
        if (i == 4) {
            return VideoMinifiedPlayerStateHolder.State.OPENED;
        }
        if (i == 5) {
            return VideoMinifiedPlayerStateHolder.State.DESTROYING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
