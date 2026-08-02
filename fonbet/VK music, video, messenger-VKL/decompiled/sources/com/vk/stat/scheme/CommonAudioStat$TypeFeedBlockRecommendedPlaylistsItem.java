package com.vk.stat.scheme;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem implements SchemeStat$TypeAction.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("is_music")
    private final Boolean isMusic;

    @pmi0("playlist_id")
    private final String playlistId;

    @pmi0("playlist_ids")
    private final List<String> playlistIds;

    @pmi0("session_id")
    private final String sessionId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final Style style;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("feed")
        public static final EventSubtype FEED;

        @pmi0(X3.i.Z)
        public static final EventSubtype MAIN;

        @pmi0("play")
        public static final EventSubtype PLAY;

        @pmi0("playlist")
        public static final EventSubtype PLAYLIST;

        @pmi0("playlist_play")
        public static final EventSubtype PLAYLIST_PLAY;

        @pmi0("scroll")
        public static final EventSubtype SCROLL;

        @pmi0("show_all")
        public static final EventSubtype SHOW_ALL;

        @pmi0("shuffle")
        public static final EventSubtype SHUFFLE;

        @pmi0("track_play")
        public static final EventSubtype TRACK_PLAY;

        static {
            EventSubtype eventSubtype = new EventSubtype("FEED", 0);
            FEED = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("PLAY", 1);
            PLAY = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("PLAYLIST", 2);
            PLAYLIST = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("SCROLL", 3);
            SCROLL = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("SHOW_ALL", 4);
            SHOW_ALL = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("SHUFFLE", 5);
            SHUFFLE = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("TRACK_PLAY", 6);
            TRACK_PLAY = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("PLAYLIST_PLAY", 7);
            PLAYLIST_PLAY = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("MAIN", 8);
            MAIN = eventSubtype9;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click")
        public static final EventType CLICK;

        @pmi0("ignore")
        public static final EventType IGNORE;

        @pmi0("swipe")
        public static final EventType SWIPE;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventType VIEW;

        static {
            EventType eventType = new EventType("IGNORE", 0);
            IGNORE = eventType;
            EventType eventType2 = new EventType("VIEW", 1);
            VIEW = eventType2;
            EventType eventType3 = new EventType("CLICK", 2);
            CLICK = eventType3;
            EventType eventType4 = new EventType("SWIPE", 3);
            SWIPE = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @pmi0("compact")
        public static final Style COMPACT;

        @pmi0("extended")
        public static final Style EXTENDED;

        static {
            Style style = new Style("COMPACT", 0);
            COMPACT = style;
            Style style2 = new Style("EXTENDED", 1);
            EXTENDED = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        private Style(String str, int i) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("recommended_playlist")
        public static final Type RECOMMENDED_PLAYLIST;

        @pmi0("recommended_playlist_official")
        public static final Type RECOMMENDED_PLAYLIST_OFFICIAL;

        static {
            Type type = new Type("RECOMMENDED_PLAYLIST", 0);
            RECOMMENDED_PLAYLIST = type;
            Type type2 = new Type("RECOMMENDED_PLAYLIST_OFFICIAL", 1);
            RECOMMENDED_PLAYLIST_OFFICIAL = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem(EventType eventType, EventSubtype eventSubtype, Style style, Boolean bool, Type type, String str, List<String> list, String str2, String str3) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.style = style;
        this.isMusic = bool;
        this.type = type;
        this.sessionId = str;
        this.playlistIds = list;
        this.playlistId = str2;
        this.trackCode = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem)) {
            return false;
        }
        CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem = (CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem) obj;
        return this.eventType == commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.eventType && this.eventSubtype == commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.eventSubtype && this.style == commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.style && epx.f(this.isMusic, commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.isMusic) && this.type == commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.type && epx.f(this.sessionId, commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.sessionId) && epx.f(this.playlistIds, commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.playlistIds) && epx.f(this.playlistId, commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.playlistId) && epx.f(this.trackCode, commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.trackCode);
    }

    public final int hashCode() {
        int hashCode = (this.style.hashCode() + ((this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31)) * 31;
        Boolean bool = this.isMusic;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Type type = this.type;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        String str = this.sessionId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.playlistIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.playlistId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedBlockRecommendedPlaylistsItem(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", isMusic=");
        sb.append(this.isMusic);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", playlistIds=");
        sb.append(this.playlistIds);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem(EventType eventType, EventSubtype eventSubtype, Style style, Boolean bool, Type type, String str, List list, String str2, String str3, int i, zcl zclVar) {
        this(eventType, eventSubtype, style, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : type, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3);
    }
}
