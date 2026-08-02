package com.vk.music.playlist.display.domain;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jqz;
import xsna.ms9;
import xsna.vby;
import xsna.xl50;

/* compiled from: DisplayMusicPlaylistPatch.kt */
/* loaded from: classes3.dex */
public interface e extends xl50 {

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    public static final class a implements e {
        public final ArrayList b;

        public /* synthetic */ a(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AlbumBanners(banners=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    public static final class b implements e {
        public final LoadPlaylistTracksRequest b;
        public final List<MusicTrack> c;

        public b(LoadPlaylistTracksRequest loadPlaylistTracksRequest, List<MusicTrack> list) {
            this.b = loadPlaylistTracksRequest;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppendTracks(request=");
            sb.append(this.b);
            sb.append(", tracks=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    public static final class c implements e {
        public final String b;
        public final boolean c;

        public c(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            String str = this.b;
            return Boolean.hashCode(this.c) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurrentTrackInPlayer(mid=");
            sb.append(this.b);
            sb.append(", isPlaying=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    public static final class d implements e {
        public final boolean b;

        public /* synthetic */ d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.b == ((d) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "HasActionsForBottomSheet(hasActionsForBottomSheet=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    /* renamed from: com.vk.music.playlist.display.domain.e$e, reason: collision with other inner class name */
    public static final class C1348e implements e {
        public final UIBlockList b;

        public /* synthetic */ C1348e(UIBlockList uIBlockList) {
            this.b = uIBlockList;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C1348e) {
                return epx.f(this.b, ((C1348e) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            UIBlockList uIBlockList = this.b;
            if (uIBlockList == null) {
                return 0;
            }
            return uIBlockList.hashCode();
        }

        public final String toString() {
            return "RecommendedPlaylists(list=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    public static final class f implements e {
        public final boolean b;

        public /* synthetic */ f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.b == ((f) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "ShuffleMode(isShuffleOn=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    public static final class g implements e {
        public static final g b = new g();
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    public static final class h implements e {
        public final MusicTrack b;

        public /* synthetic */ h(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof h) {
                return epx.f(this.b, ((h) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TrackRemoved(removedTrack=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    public static final class i implements e {
        public final String b;
        public final DownloadingState c;

        public i(String str, DownloadingState downloadingState) {
            this.b = str;
            this.c = downloadingState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateDownloadingState(mid=" + this.b + ", downloadingState=" + this.c + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    public static final class j implements e {
        public final Map<String, DownloadingState> b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Map<String, ? extends DownloadingState> map) {
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("UpdateDownloadingStates(states="), this.b, ')');
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    public static final class k implements e {
        public final jqz b;

        public /* synthetic */ k(jqz jqzVar) {
            this.b = jqzVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof k) {
                return epx.f(this.b, ((k) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateLoadPlaylistState(updateResult=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    public static final class l implements e {
        public final LoadPlaylistTracksRequest b;

        public /* synthetic */ l(LoadPlaylistTracksRequest loadPlaylistTracksRequest) {
            this.b = loadPlaylistTracksRequest;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof l) {
                return epx.f(this.b, ((l) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateLoadTracksRequest(request=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    @vby
    public static final class m implements e {
        public final Playlist b;

        public /* synthetic */ m(Playlist playlist) {
            this.b = playlist;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof m) {
                return epx.f(this.b, ((m) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePlaylist(playlist=" + this.b + ')';
        }
    }

    /* compiled from: DisplayMusicPlaylistPatch.kt */
    public static final class n implements e {
        public final DownloadingState b;

        public n(DownloadingState downloadingState) {
            this.b = downloadingState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePlaylistDownloadingState(downloadingState=" + this.b + ')';
        }
    }
}
