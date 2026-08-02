package com.vk.attachpicker.widget;

import android.media.MediaPlayer;
import com.vk.media.player.video.view.SystemVideoView;
import xsna.pro0;

/* compiled from: PagerVideoPlayer.java */
/* loaded from: classes15.dex */
public final class b implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ c b;

    /* compiled from: PagerVideoPlayer.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SystemVideoView systemVideoView = b.this.b.g;
            if (systemVideoView != null) {
                systemVideoView.g(1);
            }
        }
    }

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.b.b();
        pro0.c(new a());
    }
}
