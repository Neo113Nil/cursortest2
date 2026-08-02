package com.vk.music.player.playback;

import com.vk.core.serialize.Serializer;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;
import xsna.msy;
import xsna.urd0;
import xsna.x84;
import xsna.zcl;

/* compiled from: PlaybackLaunchMeta.kt */
/* loaded from: classes3.dex */
public final class PlaybackLaunchMeta extends Serializer.StreamParcelableAdapter {
    public final MusicPlaybackLaunchContext b;
    public final String c;
    public final PlayableType d;
    public final PlaySourceMeta e;
    public final AdsAudioPixelsContainer f;
    public static final Object g = msy.a(LazyThreadSafetyMode.NONE, new x84(26));
    public static final Serializer.c<PlaybackLaunchMeta> CREATOR = new b();

    /* compiled from: PlaybackLaunchMeta.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static PlaybackLaunchMeta a() {
            return (PlaybackLaunchMeta) PlaybackLaunchMeta.g.getValue();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PlaybackLaunchMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaybackLaunchMeta a(Serializer serializer) {
            Object obj;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) serializer.G(MusicPlaybackLaunchContext.class.getClassLoader());
            if (musicPlaybackLaunchContext == null) {
                musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
            }
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            PlayableType.a aVar = PlayableType.Companion;
            int u = serializer.u();
            aVar.getClass();
            Iterator<E> it = PlayableType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PlayableType) obj).i() == u) {
                    break;
                }
            }
            PlayableType playableType = (PlayableType) obj;
            if (playableType == null) {
                playableType = PlayableType.MUSIC_TRACK;
            }
            PlayableType playableType2 = playableType;
            PlaySourceMeta playSourceMeta = (PlaySourceMeta) serializer.G(PlaySourceMeta.class.getClassLoader());
            if (playSourceMeta == null) {
                playSourceMeta = PlaySourceMeta.Default.b;
            }
            return new PlaybackLaunchMeta(musicPlaybackLaunchContext, H, playableType2, playSourceMeta, (AdsAudioPixelsContainer) serializer.G(AdsAudioPixelsContainer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaybackLaunchMeta[i];
        }
    }

    public /* synthetic */ PlaybackLaunchMeta(MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str, PlayableType playableType, PlaySourceMeta playSourceMeta, AdsAudioPixelsContainer adsAudioPixelsContainer, int i, zcl zclVar) {
        this(musicPlaybackLaunchContext, str, playableType, playSourceMeta, (i & 16) != 0 ? null : adsAudioPixelsContainer);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.S(this.d.i());
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackLaunchMeta)) {
            return false;
        }
        PlaybackLaunchMeta playbackLaunchMeta = (PlaybackLaunchMeta) obj;
        return epx.f(this.b, playbackLaunchMeta.b) && epx.f(this.c, playbackLaunchMeta.c) && this.d == playbackLaunchMeta.d && epx.f(this.e, playbackLaunchMeta.e) && epx.f(this.f, playbackLaunchMeta.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.b.hashCode() * 31, 31, this.c)) * 31)) * 31;
        AdsAudioPixelsContainer adsAudioPixelsContainer = this.f;
        return hashCode + (adsAudioPixelsContainer == null ? 0 : adsAudioPixelsContainer.hashCode());
    }

    public final String toString() {
        return "PlaybackLaunchMeta(launchContext=" + this.b + ", sectionId=" + this.c + ", playableType=" + this.d + ", playSourceMeta=" + this.e + ", audioPixels=" + this.f + ')';
    }

    public final String zb() {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.b;
        String string = musicPlaybackLaunchContext.b.getString("__META_CATALOG_BLOCK_ID", "");
        if (string.length() == 0) {
            string = null;
        }
        return string == null ? musicPlaybackLaunchContext.t() : string;
    }

    public PlaybackLaunchMeta(MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str, PlayableType playableType, PlaySourceMeta playSourceMeta, AdsAudioPixelsContainer adsAudioPixelsContainer) {
        this.b = musicPlaybackLaunchContext;
        this.c = str;
        this.d = playableType;
        this.e = playSourceMeta;
        this.f = adsAudioPixelsContainer;
    }
}
