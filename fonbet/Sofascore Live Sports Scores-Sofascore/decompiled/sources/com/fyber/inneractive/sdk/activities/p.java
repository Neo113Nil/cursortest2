package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    public p(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.a.finish();
    }
}
