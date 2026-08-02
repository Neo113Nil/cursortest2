package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* loaded from: classes12.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;

    public i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i) {
        this.b = eventDispatcher;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.b.listener;
        audioRendererEventListener.onAudioSessionId(this.a);
    }
}
