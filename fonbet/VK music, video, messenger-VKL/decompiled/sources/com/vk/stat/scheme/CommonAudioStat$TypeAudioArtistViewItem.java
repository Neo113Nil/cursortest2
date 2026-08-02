package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioArtistViewItem implements SchemeStat$TypeView.b {

    @pmi0("ref_source")
    private final RefSource refSource;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class RefSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RefSource[] $VALUES;

        @pmi0("artist_bio")
        public static final RefSource ARTIST_BIO;

        @pmi0("audio_artist_concert")
        public static final RefSource AUDIO_ARTIST_CONCERT;

        @pmi0("audio_artist_concert_fullpage")
        public static final RefSource AUDIO_ARTIST_CONCERT_FULLPAGE;

        @pmi0("concert_player_chips")
        public static final RefSource CONCERT_PLAYER_CHIPS;

        @pmi0("concert_player_informer")
        public static final RefSource CONCERT_PLAYER_INFORMER;

        @pmi0("search_audio_artist_concert")
        public static final RefSource SEARCH_AUDIO_ARTIST_CONCERT;

        @pmi0("search_audio_artist_concert_fullpage")
        public static final RefSource SEARCH_AUDIO_ARTIST_CONCERT_FULLPAGE;

        static {
            RefSource refSource = new RefSource("AUDIO_ARTIST_CONCERT", 0);
            AUDIO_ARTIST_CONCERT = refSource;
            RefSource refSource2 = new RefSource("AUDIO_ARTIST_CONCERT_FULLPAGE", 1);
            AUDIO_ARTIST_CONCERT_FULLPAGE = refSource2;
            RefSource refSource3 = new RefSource("SEARCH_AUDIO_ARTIST_CONCERT", 2);
            SEARCH_AUDIO_ARTIST_CONCERT = refSource3;
            RefSource refSource4 = new RefSource("SEARCH_AUDIO_ARTIST_CONCERT_FULLPAGE", 3);
            SEARCH_AUDIO_ARTIST_CONCERT_FULLPAGE = refSource4;
            RefSource refSource5 = new RefSource("CONCERT_PLAYER_INFORMER", 4);
            CONCERT_PLAYER_INFORMER = refSource5;
            RefSource refSource6 = new RefSource("CONCERT_PLAYER_CHIPS", 5);
            CONCERT_PLAYER_CHIPS = refSource6;
            RefSource refSource7 = new RefSource("ARTIST_BIO", 6);
            ARTIST_BIO = refSource7;
            RefSource[] refSourceArr = {refSource, refSource2, refSource3, refSource4, refSource5, refSource6, refSource7};
            $VALUES = refSourceArr;
            $ENTRIES = new asp(refSourceArr);
        }

        private RefSource(String str, int i) {
        }

        public static RefSource valueOf(String str) {
            return (RefSource) Enum.valueOf(RefSource.class, str);
        }

        public static RefSource[] values() {
            return (RefSource[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioArtistViewItem(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, RefSource refSource) {
        this.trackCode = commonStat$TypeTrackCodeItem;
        this.refSource = refSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioArtistViewItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem = (CommonAudioStat$TypeAudioArtistViewItem) obj;
        return epx.f(this.trackCode, commonAudioStat$TypeAudioArtistViewItem.trackCode) && this.refSource == commonAudioStat$TypeAudioArtistViewItem.refSource;
    }

    public final int hashCode() {
        int hashCode = this.trackCode.a.hashCode() * 31;
        RefSource refSource = this.refSource;
        return hashCode + (refSource == null ? 0 : refSource.hashCode());
    }

    public final String toString() {
        return "TypeAudioArtistViewItem(trackCode=" + this.trackCode + ", refSource=" + this.refSource + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioArtistViewItem(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, RefSource refSource, int i, zcl zclVar) {
        this(commonStat$TypeTrackCodeItem, (i & 2) != 0 ? null : refSource);
    }
}
