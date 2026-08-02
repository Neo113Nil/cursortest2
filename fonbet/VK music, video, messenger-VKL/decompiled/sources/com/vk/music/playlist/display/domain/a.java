package com.vk.music.playlist.display.domain;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import xsna.air;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;
import xsna.shy;
import xsna.vby;

/* compiled from: DisplayMusicPlaylistAction.kt */
/* loaded from: classes3.dex */
public interface a extends kj50 {

    /* compiled from: DisplayMusicPlaylistAction.kt */
    /* renamed from: com.vk.music.playlist.display.domain.a$a, reason: collision with other inner class name */
    public interface InterfaceC1338a extends a {

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$a$a, reason: collision with other inner class name */
        public static final class C1339a implements InterfaceC1338a {
            public static final C1339a b = new C1339a();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$a$b */
        public static final class b implements InterfaceC1338a {
            public static final b b = new b();
        }
    }

    /* compiled from: DisplayMusicPlaylistAction.kt */
    public interface b extends a {

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$b$a, reason: collision with other inner class name */
        public static final class C1340a implements b {
            public static final C1340a b = new C1340a();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$b$b, reason: collision with other inner class name */
        public static final class C1341b implements b {
            public static final C1341b b = new C1341b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1341b);
            }

            public final int hashCode() {
                return -387421265;
            }

            public final String toString() {
                return "FreeSubtitleClick";
            }
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class c implements b {
            public static final c b = new c();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class d implements b {
            public static final d b = new d();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class e implements b {
            public static final e b = new e();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class f implements b {
            public static final f b = new f();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class g implements b {
            public static final g b = new g();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class h implements b {
            public static final h b = new h();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class i implements b {
            public static final i b = new i();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class j implements b {
            public static final j b = new j();
        }
    }

    /* compiled from: DisplayMusicPlaylistAction.kt */
    public interface c extends a {

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$c$a, reason: collision with other inner class name */
        public static final class C1342a implements c {
            public final UserId b;
            public final int c;
            public final String d;

            public C1342a(UserId userId, int i, String str) {
                this.b = userId;
                this.c = i;
                this.d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1342a)) {
                    return false;
                }
                C1342a c1342a = (C1342a) obj;
                return epx.f(this.b, c1342a.b) && this.c == c1342a.c && epx.f(this.d, c1342a.d);
            }

            public final int hashCode() {
                int a = shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
                String str = this.d;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadPlaylist(ownerId=");
                sb.append(this.b);
                sb.append(", playlistId=");
                sb.append(this.c);
                sb.append(", accessKey=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        @vby
        public static final class b implements c {
            public final Playlist b;

            public final boolean equals(Object obj) {
                if (obj instanceof b) {
                    return epx.f(this.b, ((b) obj).b);
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenPlaylist(playlist=" + this.b + ')';
            }
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$c$c, reason: collision with other inner class name */
        public static final class C1343c implements c {
            public static final C1343c b = new C1343c();
        }
    }

    /* compiled from: DisplayMusicPlaylistAction.kt */
    public interface d extends a {

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$d$a, reason: collision with other inner class name */
        public static final class C1344a implements d {
            public final Playlist b;
            public final String c;

            public C1344a(Playlist playlist, String str) {
                this.b = playlist;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1344a)) {
                    return false;
                }
                C1344a c1344a = (C1344a) obj;
                return epx.f(this.b, c1344a.b) && epx.f(this.c, c1344a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenRecommendedPlaylist(playlist=");
                sb.append(this.b);
                sb.append(", blockId=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: DisplayMusicPlaylistAction.kt */
    public interface e extends a {

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$e$a, reason: collision with other inner class name */
        public static final class C1345a implements e {
            public static final C1345a b = new C1345a();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class b implements e {
            public static final b b = new b();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        @vby
        public static final class c implements e {
            public final String b;

            public final boolean equals(Object obj) {
                if (obj instanceof c) {
                    return epx.f(this.b, ((c) obj).b);
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return air.b(')', "OpenUrl(url=", this.b);
            }
        }
    }

    /* compiled from: DisplayMusicPlaylistAction.kt */
    public interface f extends a {

        /* compiled from: DisplayMusicPlaylistAction.kt */
        /* renamed from: com.vk.music.playlist.display.domain.a$f$a, reason: collision with other inner class name */
        public static final class C1346a implements f {
            public static final C1346a b = new C1346a();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        @vby
        public static final class b implements f {
            public final String b;

            public final boolean equals(Object obj) {
                if (obj instanceof b) {
                    return epx.f(this.b, ((b) obj).b);
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return air.b(')', "OpenLongtap(mid=", this.b);
            }
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        @vby
        public static final class c implements f {
            public final String b;

            public final boolean equals(Object obj) {
                if (obj instanceof c) {
                    return epx.f(this.b, ((c) obj).b);
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return air.b(')', "OpenMenu(mid=", this.b);
            }
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        public static final class d implements f {
            public static final d b = new d();
        }

        /* compiled from: DisplayMusicPlaylistAction.kt */
        @vby
        public static final class e implements f {
            public final String b;

            public final boolean equals(Object obj) {
                if (obj instanceof e) {
                    return epx.f(this.b, ((e) obj).b);
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return air.b(')', "ToggleResumePause(mid=", this.b);
            }
        }
    }
}
