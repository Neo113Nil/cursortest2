package com.vk.music.playlist.display.domain;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import xsna.air;
import xsna.epx;
import xsna.ho8;
import xsna.vby;

/* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class a implements d {
        public static final a a = new a();
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class b implements d {
        public static final b a = new b();
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    @vby
    public static final class c implements d {
        public final Playlist a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return epx.f(this.a, ((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ConfirmDownloadingWithAddingToMM(playlist=" + this.a + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    @vby
    /* renamed from: com.vk.music.playlist.display.domain.d$d, reason: collision with other inner class name */
    public static final class C1347d implements d {
        public final Playlist a;

        public final boolean equals(Object obj) {
            if (obj instanceof C1347d) {
                return epx.f(this.a, ((C1347d) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ConfirmUnfollowPlaylist(playlist=" + this.a + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class e implements d {
        public static final e a = new e();
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class f implements d {
        public final Playlist a;
        public final MusicPlaybackLaunchContext b;

        public f(Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = playlist;
            this.b = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenArtist(playlist=" + this.a + ", refer=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class g implements d {
        public final Playlist a;
        public final MusicPlaybackLaunchContext b;

        public g(Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = playlist;
            this.b = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenDeleteDownloadedPlaylistMenu(playlist=" + this.a + ", refer=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class h implements d {
        public static final h a = new h();
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    @vby
    public static final class i implements d {
        public final Playlist a;

        public final boolean equals(Object obj) {
            if (obj instanceof i) {
                return epx.f(this.a, ((i) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenEditPlaylist(playlist=" + this.a + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class j implements d {
        public final MusicTrack a;
        public final MusicPlaybackLaunchContext b;

        public j(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = musicTrack;
            this.b = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenLongtapSnippet(track=" + this.a + ", refer=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class k implements d {
        public final Playlist a;
        public final MusicPlaybackLaunchContext b;

        public k(Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = playlist;
            this.b = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenPlaylistMenu(playlist=" + this.a + ", refer=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    @vby
    public static final class l implements d {
        public final UserId a;

        public final boolean equals(Object obj) {
            if (obj instanceof l) {
                return epx.f(this.a, ((l) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return "OpenPlaylistOwner(owner=" + this.a + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class m implements d {
        public final Playlist a;
        public final String b;

        public m(Playlist playlist, String str) {
            this.a = playlist;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenRecommendedPlaylist(playlist=");
            sb.append(this.a);
            sb.append(", blockId=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class n implements d {
        public final MusicTrack a;
        public final Playlist b;
        public final MusicPlaybackLaunchContext c;

        public n(MusicTrack musicTrack, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = musicTrack;
            this.b = playlist;
            this.c = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b) && epx.f(this.c, nVar.c);
        }

        public final int hashCode() {
            return this.c.b.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "OpenTrackMenu(track=" + this.a + ", playlist=" + this.b + ", refer=" + this.c + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    @vby
    public static final class o implements d {
        public final String a;

        public final boolean equals(Object obj) {
            if (obj instanceof o) {
                return epx.f(this.a, ((o) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return air.b(')', "OpenUrl(url=", this.a);
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class p implements d {
        public static final p a = new p();
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    public static final class q implements d {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 66936544;
        }

        public final String toString() {
            return "ShowKidsRestrictionSnack";
        }
    }

    /* compiled from: DisplayMusicPlaylistNavigationEvent.kt */
    @vby
    public static final class r implements d {
        public final MusicDynamicRestriction a;

        public final boolean equals(Object obj) {
            if (obj instanceof r) {
                return epx.f(this.a, ((r) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSubscriptionRestriction(restriction=" + this.a + ')';
        }
    }
}
