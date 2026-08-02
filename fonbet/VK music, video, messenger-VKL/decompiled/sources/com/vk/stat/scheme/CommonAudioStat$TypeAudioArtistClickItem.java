package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioArtistClickItem implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("ref_source")
    private final RefSource refSource;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("buy_click")
        public static final EventType BUY_CLICK;

        @pmi0("item_click")
        public static final EventType ITEM_CLICK;

        @pmi0("item_follow_click")
        public static final EventType ITEM_FOLLOW_CLICK;

        @pmi0("item_unfollow_click")
        public static final EventType ITEM_UNFOLLOW_CLICK;

        @pmi0("show_all_click")
        public static final EventType SHOW_ALL_CLICK;

        static {
            EventType eventType = new EventType("ITEM_CLICK", 0);
            ITEM_CLICK = eventType;
            EventType eventType2 = new EventType("BUY_CLICK", 1);
            BUY_CLICK = eventType2;
            EventType eventType3 = new EventType("SHOW_ALL_CLICK", 2);
            SHOW_ALL_CLICK = eventType3;
            EventType eventType4 = new EventType("ITEM_FOLLOW_CLICK", 3);
            ITEM_FOLLOW_CLICK = eventType4;
            EventType eventType5 = new EventType("ITEM_UNFOLLOW_CLICK", 4);
            ITEM_UNFOLLOW_CLICK = eventType5;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

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

        @pmi0("audio_artist_header")
        public static final RefSource AUDIO_ARTIST_HEADER;

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
            RefSource refSource7 = new RefSource("AUDIO_ARTIST_HEADER", 6);
            AUDIO_ARTIST_HEADER = refSource7;
            RefSource refSource8 = new RefSource("ARTIST_BIO", 7);
            ARTIST_BIO = refSource8;
            RefSource[] refSourceArr = {refSource, refSource2, refSource3, refSource4, refSource5, refSource6, refSource7, refSource8};
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

    public CommonAudioStat$TypeAudioArtistClickItem(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, RefSource refSource, EventType eventType) {
        this.trackCode = commonStat$TypeTrackCodeItem;
        this.refSource = refSource;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioArtistClickItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioArtistClickItem commonAudioStat$TypeAudioArtistClickItem = (CommonAudioStat$TypeAudioArtistClickItem) obj;
        return epx.f(this.trackCode, commonAudioStat$TypeAudioArtistClickItem.trackCode) && this.refSource == commonAudioStat$TypeAudioArtistClickItem.refSource && this.eventType == commonAudioStat$TypeAudioArtistClickItem.eventType;
    }

    public final int hashCode() {
        int hashCode = this.trackCode.a.hashCode() * 31;
        RefSource refSource = this.refSource;
        int hashCode2 = (hashCode + (refSource == null ? 0 : refSource.hashCode())) * 31;
        EventType eventType = this.eventType;
        return hashCode2 + (eventType != null ? eventType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAudioArtistClickItem(trackCode=" + this.trackCode + ", refSource=" + this.refSource + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioArtistClickItem(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, RefSource refSource, EventType eventType, int i, zcl zclVar) {
        this(commonStat$TypeTrackCodeItem, (i & 2) != 0 ? null : refSource, (i & 4) != 0 ? null : eventType);
    }
}
