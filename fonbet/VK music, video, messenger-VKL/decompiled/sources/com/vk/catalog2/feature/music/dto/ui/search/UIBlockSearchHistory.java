package com.vk.catalog2.feature.music.dto.ui.search;

import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.NftAudio;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockSearchHistory.kt */
/* loaded from: classes16.dex */
public abstract class UIBlockSearchHistory<T> extends UIBlock implements dfp0 {
    public final T y;
    public final String z;

    /* compiled from: UIBlockSearchHistory.kt */
    public static final class UIBlockSearchHistoryArtist extends UIBlockSearchHistory<Artist> implements a {
        public final Artist A;
        public final String B;
        public final String C;

        public UIBlockSearchHistoryArtist(com.vk.catalog2.common.dto.api.ui.a aVar, Artist artist, String str, String str2) {
            super(aVar, artist, str, null);
            this.A = artist;
            this.B = str;
            this.C = str2;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.B;
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory
        public final Artist Pb() {
            return this.A;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UIBlockSearchHistoryArtist) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            UIBlockSearchHistoryArtist uIBlockSearchHistoryArtist = (UIBlockSearchHistoryArtist) obj;
            return epx.f(this.A, uIBlockSearchHistoryArtist.A) && epx.f(this.B, uIBlockSearchHistoryArtist.B) && epx.f(this.C, uIBlockSearchHistoryArtist.C);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory.a
        public final Object g7() {
            return this.A;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.A, this.B, this.C);
        }

        @Override // xsna.dfp0
        public final String r() {
            return this.C;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(qjg.a(this));
            sb.append('<');
            return ho8.a(sb, this.A.c, '>');
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new UIBlockSearchHistoryArtist(a.C0482a.a(this), Artist.zb(this.A), this.B, this.C);
        }
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public static final class UIBlockSearchHistoryAudioBook extends UIBlockSearchHistory<AudioBook> implements a {
        public final AudioBook A;
        public final String B;
        public final String C;

        public UIBlockSearchHistoryAudioBook(com.vk.catalog2.common.dto.api.ui.a aVar, AudioBook audioBook, String str, String str2) {
            super(aVar, audioBook, str, null);
            this.A = audioBook;
            this.B = str;
            this.C = str2;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.B;
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory
        public final AudioBook Pb() {
            return this.A;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UIBlockSearchHistoryAudioBook) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            UIBlockSearchHistoryAudioBook uIBlockSearchHistoryAudioBook = (UIBlockSearchHistoryAudioBook) obj;
            return epx.f(this.A, uIBlockSearchHistoryAudioBook.A) && epx.f(this.B, uIBlockSearchHistoryAudioBook.B) && epx.f(this.C, uIBlockSearchHistoryAudioBook.C);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory.a
        public final Object g7() {
            return this.A;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.A, this.B, this.C);
        }

        @Override // xsna.dfp0
        public final String r() {
            return this.C;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(qjg.a(this));
            sb.append('<');
            return ho8.a(sb, this.A.c, '>');
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new UIBlockSearchHistoryAudioBook(a.C0482a.a(this), AudioBook.zb(this.A, null, false, 4194303), this.B, this.C);
        }
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public static final class UIBlockSearchHistoryPlaylist extends UIBlockSearchHistory<Playlist> {
        public final Playlist A;
        public final String B;

        public UIBlockSearchHistoryPlaylist(com.vk.catalog2.common.dto.api.ui.a aVar, Playlist playlist, String str) {
            super(aVar, playlist, playlist.Hb(), null);
            this.A = playlist;
            this.B = str;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.A.Hb();
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory
        public final Playlist Pb() {
            return this.A;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UIBlockSearchHistoryPlaylist) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            UIBlockSearchHistoryPlaylist uIBlockSearchHistoryPlaylist = (UIBlockSearchHistoryPlaylist) obj;
            return epx.f(this.A, uIBlockSearchHistoryPlaylist.A) && epx.f(this.z, uIBlockSearchHistoryPlaylist.z) && epx.f(this.B, uIBlockSearchHistoryPlaylist.B);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.A, this.z, this.B);
        }

        @Override // xsna.dfp0
        public final String r() {
            return this.B;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(qjg.a(this));
            sb.append('<');
            return ho8.a(sb, this.A.h, '>');
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new UIBlockSearchHistoryPlaylist(a.C0482a.a(this), Playlist.zb(this.A, null, null, null, null, -1, 255), this.B);
        }
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public static final class UIBlockSearchHistoryPodcast extends UIBlockSearchHistory<Podcast> implements a {
        public final Podcast A;
        public final String B;
        public final String C;

        public UIBlockSearchHistoryPodcast(com.vk.catalog2.common.dto.api.ui.a aVar, Podcast podcast, String str, String str2) {
            super(aVar, podcast, str, null);
            this.A = podcast;
            this.B = str;
            this.C = str2;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.B;
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory
        public final Podcast Pb() {
            return this.A;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UIBlockSearchHistoryPodcast) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            UIBlockSearchHistoryPodcast uIBlockSearchHistoryPodcast = (UIBlockSearchHistoryPodcast) obj;
            return epx.f(this.A, uIBlockSearchHistoryPodcast.A) && epx.f(this.B, uIBlockSearchHistoryPodcast.B) && epx.f(this.C, uIBlockSearchHistoryPodcast.C);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory.a
        public final Object g7() {
            return this.A;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.A, this.B, this.C);
        }

        @Override // xsna.dfp0
        public final String r() {
            return this.C;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(qjg.a(this));
            sb.append('<');
            return ho8.a(sb, this.A.d, '>');
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new UIBlockSearchHistoryPodcast(a.C0482a.a(this), Podcast.a(this.A, false, 8191), this.B, this.C);
        }
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public static final class UIBlockSearchHistoryRadioStation extends UIBlockSearchHistory<RadioStation> implements b {
        public final com.vk.catalog2.common.dto.api.ui.a A;
        public final RadioStation B;
        public final String C;

        public UIBlockSearchHistoryRadioStation(com.vk.catalog2.common.dto.api.ui.a aVar, RadioStation radioStation, String str) {
            super(aVar, radioStation, radioStation.f, null);
            this.A = aVar;
            this.B = radioStation;
            this.C = str;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return String.valueOf(this.B.b);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory
        public final RadioStation Pb() {
            return this.B;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UIBlockSearchHistoryRadioStation) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            UIBlockSearchHistoryRadioStation uIBlockSearchHistoryRadioStation = (UIBlockSearchHistoryRadioStation) obj;
            return epx.f(this.B, uIBlockSearchHistoryRadioStation.B) && epx.f(this.z, uIBlockSearchHistoryRadioStation.z) && epx.f(this.C, uIBlockSearchHistoryRadioStation.C);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.B, this.z, this.C);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory.b
        public final boolean o6(MusicTrack musicTrack) {
            return musicTrack.Wb() && musicTrack.b == this.B.b;
        }

        @Override // xsna.dfp0
        public final String r() {
            return this.C;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(qjg.a(this));
            sb.append('<');
            return ho8.a(sb, this.B.e, '>');
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new UIBlockSearchHistoryRadioStation(a.C0482a.a(this), RadioStation.zb(this.B, false, 255), this.C);
        }
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public static final class UIBlockSearchHistoryVideo extends UIBlockSearchHistory<VideoFile> {
        public final VideoFile A;
        public final String B;

        public UIBlockSearchHistoryVideo(com.vk.catalog2.common.dto.api.ui.a aVar, VideoFile videoFile, String str) {
            super(aVar, videoFile, videoFile.a1(), null);
            this.A = videoFile;
            this.B = str;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.A.a1();
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory
        public final VideoFile Pb() {
            return this.A;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UIBlockSearchHistoryVideo) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            UIBlockSearchHistoryVideo uIBlockSearchHistoryVideo = (UIBlockSearchHistoryVideo) obj;
            return epx.f(this.A, uIBlockSearchHistoryVideo.A) && epx.f(this.z, uIBlockSearchHistoryVideo.z) && epx.f(this.B, uIBlockSearchHistoryVideo.B);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.A, this.z, this.B);
        }

        @Override // xsna.dfp0
        public final String r() {
            return this.B;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            return qjg.a(this) + '<' + this.A.getTitle() + '>';
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new UIBlockSearchHistoryVideo(a.C0482a.a(this), this.A.copy(), this.B);
        }
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public interface a {
        Object g7();
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public interface b {
        boolean o6(MusicTrack musicTrack);
    }

    public UIBlockSearchHistory() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockSearchHistory(com.vk.catalog2.common.dto.api.ui.a aVar, Object obj, String str, zcl zclVar) {
        super(aVar);
        this.y = obj;
        this.z = str;
    }

    public T Pb() {
        return this.y;
    }

    /* compiled from: UIBlockSearchHistory.kt */
    public static final class UIBlockSearchHistoryTrack extends UIBlockSearchHistory<MusicTrack> implements b {
        public final MusicTrack A;
        public final String B;
        public final CatalogMusicTrackLocalState C;
        public final String D;

        public /* synthetic */ UIBlockSearchHistoryTrack(com.vk.catalog2.common.dto.api.ui.a aVar, MusicTrack musicTrack, String str, CatalogMusicTrackLocalState catalogMusicTrackLocalState, String str2, int i, zcl zclVar) {
            this(aVar, musicTrack, str, (i & 8) != 0 ? new CatalogMusicTrackLocalState(false, false, false, 7, null) : catalogMusicTrackLocalState, (i & 16) != 0 ? musicTrack.Fb() : str2);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.D;
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory
        public final MusicTrack Pb() {
            return this.A;
        }

        public final boolean Qb(MusicTrack musicTrack) {
            return epx.f(this.D, musicTrack.Fb());
        }

        public final MusicTrack Rb() {
            return this.A;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UIBlockSearchHistoryTrack) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistoryTrack) obj;
            MusicTrack musicTrack = uIBlockSearchHistoryTrack.A;
            MusicTrack musicTrack2 = uIBlockSearchHistoryTrack.A;
            MusicTrack musicTrack3 = this.A;
            return epx.f(musicTrack3, musicTrack) && epx.f(musicTrack3.J, musicTrack2.J) && musicTrack3.U == musicTrack2.U && musicTrack3.l == musicTrack2.l && musicTrack3.P == musicTrack2.P && musicTrack3.g == musicTrack2.g && musicTrack3.M == musicTrack2.M && epx.f(musicTrack3.W, musicTrack2.W) && epx.f(this.B, uIBlockSearchHistoryTrack.B) && epx.f(this.C, uIBlockSearchHistoryTrack.C);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            Integer valueOf = Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p));
            MusicTrack musicTrack = this.A;
            UserId userId = musicTrack.c;
            Integer valueOf2 = Integer.valueOf(musicTrack.b);
            NftAudio nftAudio = musicTrack.x;
            return Objects.hash(valueOf, userId, valueOf2, nftAudio != null ? nftAudio.b : null, musicTrack.J, Boolean.valueOf(musicTrack.U), Boolean.valueOf(musicTrack.l), Boolean.valueOf(musicTrack.P), Integer.valueOf(musicTrack.g), Boolean.valueOf(musicTrack.M), musicTrack.W, this.B, this.C);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory.b
        public final boolean o6(MusicTrack musicTrack) {
            if (musicTrack.Tb()) {
                return epx.f(this.A.Fb(), musicTrack.Fb()) || Qb(musicTrack);
            }
            return false;
        }

        @Override // xsna.dfp0
        public final String r() {
            return this.B;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(qjg.a(this));
            sb.append('<');
            return ho8.a(sb, this.A.d, '>');
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new UIBlockSearchHistoryTrack(a.C0482a.a(this), MusicTrack.zb(this.A, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575), this.B, CatalogMusicTrackLocalState.zb(this.C, false, false, 7), this.D);
        }

        public UIBlockSearchHistoryTrack(com.vk.catalog2.common.dto.api.ui.a aVar, MusicTrack musicTrack, String str, CatalogMusicTrackLocalState catalogMusicTrackLocalState, String str2) {
            super(aVar, musicTrack, str2, null);
            this.A = musicTrack;
            this.B = str;
            this.C = catalogMusicTrackLocalState;
            this.D = str2;
        }

        public /* synthetic */ UIBlockSearchHistoryTrack(UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack, MusicTrack musicTrack, CatalogMusicTrackLocalState catalogMusicTrackLocalState, int i, zcl zclVar) {
            this(uIBlockSearchHistoryTrack, musicTrack, (i & 4) != 0 ? null : catalogMusicTrackLocalState);
        }

        public UIBlockSearchHistoryTrack(UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack, MusicTrack musicTrack, CatalogMusicTrackLocalState catalogMusicTrackLocalState) {
            this(a.C0482a.a(uIBlockSearchHistoryTrack), musicTrack, uIBlockSearchHistoryTrack.B, catalogMusicTrackLocalState == null ? CatalogMusicTrackLocalState.zb(uIBlockSearchHistoryTrack.C, false, false, 7) : catalogMusicTrackLocalState, uIBlockSearchHistoryTrack.D);
        }
    }
}
