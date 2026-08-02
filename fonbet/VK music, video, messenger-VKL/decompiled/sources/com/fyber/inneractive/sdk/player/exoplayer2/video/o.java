package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes12.dex */
public final class o implements Runnable {
    public final /* synthetic */ DecoderCounters a;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;

    public o(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        this.a.ensureUpdated();
        videoRendererEventListener = this.b.listener;
        videoRendererEventListener.onVideoDisabled(this.a);
    }
}
