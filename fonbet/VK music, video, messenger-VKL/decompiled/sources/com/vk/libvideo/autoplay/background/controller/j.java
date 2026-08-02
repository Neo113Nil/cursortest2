package com.vk.libvideo.autoplay.background.controller;

import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.models.videotracker.PlayerType;
import one.video.player.OneVideoPlayer;
import xsna.qoy;

/* compiled from: VideoBackgroundVideoTrackStateResolver.kt */
/* loaded from: classes2.dex */
public interface j {

    /* compiled from: VideoBackgroundVideoTrackStateResolver.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final PlayerType f;
        public final AutoPlayMinifiedState g;
        public final boolean h;
        public final boolean i;
        public final OneVideoPlayer.State j;

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, PlayerType playerType, AutoPlayMinifiedState autoPlayMinifiedState, boolean z6, boolean z7, OneVideoPlayer.State state) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = playerType;
            this.g = autoPlayMinifiedState;
            this.h = z6;
            this.i = z7;
            this.j = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j;
        }

        public final int hashCode() {
            return this.j.hashCode() + qoy.b(qoy.b((this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i);
        }

        public final String toString() {
            return "VideoState(isOfflineMode=" + this.a + ", isClipFeed=" + this.b + ", isGif=" + this.c + ", isInteractive=" + this.d + ", canPlayInBackground=" + this.e + ", playerType=" + this.f + ", minifiedState=" + this.g + ", isPlayingIntent=" + this.h + ", isAdActive=" + this.i + ", oneVideoPlayerState=" + this.j + ')';
        }
    }

    boolean k(a aVar);
}
