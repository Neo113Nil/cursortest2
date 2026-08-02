package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;

    public f(AudioRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.b = eventDispatcher;
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.b.listener;
        audioRendererEventListener.onAudioInputFormatChanged(this.a);
    }
}
