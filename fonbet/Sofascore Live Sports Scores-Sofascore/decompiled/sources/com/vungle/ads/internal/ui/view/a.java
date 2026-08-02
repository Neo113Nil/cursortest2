package com.vungle.ads.internal.ui.view;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a implements Runnable {
    public final WeakReference a;

    public a(d dVar) {
        dVar.getClass();
        this.a = new WeakReference(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer;
        d dVar = (d) this.a.get();
        if (dVar == null) {
            return;
        }
        dVar.b();
        if (!dVar.i.get() || (mediaPlayer = dVar.g) == null || !mediaPlayer.isPlaying() || dVar.q) {
            return;
        }
        dVar.w.postDelayed(this, 1000L);
    }
}
