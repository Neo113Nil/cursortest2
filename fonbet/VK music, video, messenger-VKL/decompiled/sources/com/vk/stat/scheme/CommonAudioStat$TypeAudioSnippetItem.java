package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudioSnippetItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_id_new")
    private final Integer audioIdNew;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("audio_owner_id_new")
    private final Long audioOwnerIdNew;

    @pmi0("event_category")
    private final EventCategory eventCategory;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("playback_duration")
    private final Integer playbackDuration;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("playlist_owner_id")
    private final Long playlistOwnerId;

    @pmi0("playlist_pos")
    private final Integer playlistPos;

    @pmi0("progress_pos")
    private final Integer progressPos;

    @pmi0("timeline_position")
    private final Integer timelinePosition;

    @pmi0("volume")
    private final Integer volume;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventCategory {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventCategory[] $VALUES;

        @pmi0("action")
        public static final EventCategory ACTION;

        @pmi0("nav")
        public static final EventCategory NAV;

        @pmi0("play")
        public static final EventCategory PLAY;

        @pmi0("system")
        public static final EventCategory SYSTEM;

        static {
            EventCategory eventCategory = new EventCategory("NAV", 0);
            NAV = eventCategory;
            EventCategory eventCategory2 = new EventCategory("PLAY", 1);
            PLAY = eventCategory2;
            EventCategory eventCategory3 = new EventCategory("ACTION", 2);
            ACTION = eventCategory3;
            EventCategory eventCategory4 = new EventCategory("SYSTEM", 3);
            SYSTEM = eventCategory4;
            EventCategory[] eventCategoryArr = {eventCategory, eventCategory2, eventCategory3, eventCategory4};
            $VALUES = eventCategoryArr;
            $ENTRIES = new asp(eventCategoryArr);
        }

        private EventCategory(String str, int i) {
        }

        public static EventCategory valueOf(String str) {
            return (EventCategory) Enum.valueOf(EventCategory.class, str);
        }

        public static EventCategory[] values() {
            return (EventCategory[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("add_snippet")
        public static final EventSubtype ADD_SNIPPET;

        @pmi0("add_track")
        public static final EventSubtype ADD_TRACK;

        @pmi0("autoplay")
        public static final EventSubtype AUTOPLAY;

        @pmi0("change_source")
        public static final EventSubtype CHANGE_SOURCE;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventSubtype CLOSE;

        @pmi0("error")
        public static final EventSubtype ERROR;

        @pmi0("goto_artist")
        public static final EventSubtype GOTO_ARTIST;

        @pmi0("goto_playlist")
        public static final EventSubtype GOTO_PLAYLIST;

        @pmi0("goto_track")
        public static final EventSubtype GOTO_TRACK;

        @pmi0("next")
        public static final EventSubtype NEXT;

        @pmi0("next_btn")
        public static final EventSubtype NEXT_BTN;

        @pmi0("overlay")
        public static final EventSubtype OVERLAY;

        @pmi0("play_btn")
        public static final EventSubtype PLAY_BTN;

        @pmi0("prev")
        public static final EventSubtype PREV;

        @pmi0("prev_btn")
        public static final EventSubtype PREV_BTN;

        @pmi0("remove_snippet")
        public static final EventSubtype REMOVE_SNIPPET;

        @pmi0("session_terminated")
        public static final EventSubtype SESSION_TERMINATED;

        @pmi0("swipe")
        public static final EventSubtype SWIPE;

        @pmi0("tap")
        public static final EventSubtype TAP;

        static {
            EventSubtype eventSubtype = new EventSubtype("SWIPE", 0);
            SWIPE = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("OVERLAY", 1);
            OVERLAY = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("GOTO_TRACK", 2);
            GOTO_TRACK = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("GOTO_PLAYLIST", 3);
            GOTO_PLAYLIST = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("GOTO_ARTIST", 4);
            GOTO_ARTIST = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("PLAY_BTN", 5);
            PLAY_BTN = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("SESSION_TERMINATED", 6);
            SESSION_TERMINATED = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("CLOSE", 7);
            CLOSE = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("ERROR", 8);
            ERROR = eventSubtype9;
            EventSubtype eventSubtype10 = new EventSubtype("NEXT", 9);
            NEXT = eventSubtype10;
            EventSubtype eventSubtype11 = new EventSubtype("PREV", 10);
            PREV = eventSubtype11;
            EventSubtype eventSubtype12 = new EventSubtype("AUTOPLAY", 11);
            AUTOPLAY = eventSubtype12;
            EventSubtype eventSubtype13 = new EventSubtype("CHANGE_SOURCE", 12);
            CHANGE_SOURCE = eventSubtype13;
            EventSubtype eventSubtype14 = new EventSubtype("ADD_TRACK", 13);
            ADD_TRACK = eventSubtype14;
            EventSubtype eventSubtype15 = new EventSubtype("NEXT_BTN", 14);
            NEXT_BTN = eventSubtype15;
            EventSubtype eventSubtype16 = new EventSubtype("PREV_BTN", 15);
            PREV_BTN = eventSubtype16;
            EventSubtype eventSubtype17 = new EventSubtype("ADD_SNIPPET", 16);
            ADD_SNIPPET = eventSubtype17;
            EventSubtype eventSubtype18 = new EventSubtype("REMOVE_SNIPPET", 17);
            REMOVE_SNIPPET = eventSubtype18;
            EventSubtype eventSubtype19 = new EventSubtype("TAP", 18);
            TAP = eventSubtype19;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9, eventSubtype10, eventSubtype11, eventSubtype12, eventSubtype13, eventSubtype14, eventSubtype15, eventSubtype16, eventSubtype17, eventSubtype18, eventSubtype19};
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
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("added")
        public static final EventType ADDED;

        @pmi0("next_snippet")
        public static final EventType NEXT_SNIPPET;

        @pmi0("pause")
        public static final EventType PAUSE;

        @pmi0("prev_snippet")
        public static final EventType PREV_SNIPPET;

        @pmi0("removed")
        public static final EventType REMOVED;

        @pmi0("snippet_feed_drilldown")
        public static final EventType SNIPPET_FEED_DRILLDOWN;

        @pmi0("snippet_feed_end")
        public static final EventType SNIPPET_FEED_END;

        @pmi0("snippet_feed_exit")
        public static final EventType SNIPPET_FEED_EXIT;

        @pmi0("snippet_feed_open")
        public static final EventType SNIPPET_FEED_OPEN;

        @pmi0("snippet_feed_playlist_down")
        public static final EventType SNIPPET_FEED_PLAYLIST_DOWN;

        @pmi0("snippet_feed_playlist_up")
        public static final EventType SNIPPET_FEED_PLAYLIST_UP;

        @pmi0("snippet_playlist_end")
        public static final EventType SNIPPET_PLAYLIST_END;

        @pmi0("start")
        public static final EventType START;

        @pmi0("stop")
        public static final EventType STOP;

        static {
            EventType eventType = new EventType("SNIPPET_FEED_OPEN", 0);
            SNIPPET_FEED_OPEN = eventType;
            EventType eventType2 = new EventType("SNIPPET_FEED_EXIT", 1);
            SNIPPET_FEED_EXIT = eventType2;
            EventType eventType3 = new EventType("SNIPPET_FEED_DRILLDOWN", 2);
            SNIPPET_FEED_DRILLDOWN = eventType3;
            EventType eventType4 = new EventType("PAUSE", 3);
            PAUSE = eventType4;
            EventType eventType5 = new EventType("STOP", 4);
            STOP = eventType5;
            EventType eventType6 = new EventType("START", 5);
            START = eventType6;
            EventType eventType7 = new EventType("ADDED", 6);
            ADDED = eventType7;
            EventType eventType8 = new EventType(SignalingProtocol.HUNGUP_REASON_REMOVED, 7);
            REMOVED = eventType8;
            EventType eventType9 = new EventType("NEXT_SNIPPET", 8);
            NEXT_SNIPPET = eventType9;
            EventType eventType10 = new EventType("PREV_SNIPPET", 9);
            PREV_SNIPPET = eventType10;
            EventType eventType11 = new EventType("SNIPPET_FEED_PLAYLIST_UP", 10);
            SNIPPET_FEED_PLAYLIST_UP = eventType11;
            EventType eventType12 = new EventType("SNIPPET_FEED_PLAYLIST_DOWN", 11);
            SNIPPET_FEED_PLAYLIST_DOWN = eventType12;
            EventType eventType13 = new EventType("SNIPPET_PLAYLIST_END", 12);
            SNIPPET_PLAYLIST_END = eventType13;
            EventType eventType14 = new EventType("SNIPPET_FEED_END", 13);
            SNIPPET_FEED_END = eventType14;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14};
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

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioSnippetItem>, a9y<CommonAudioStat$TypeAudioSnippetItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventCategory eventCategory = (EventCategory) dq.f(x9yVar, "event_category", tru.a(), EventCategory.class);
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("event_subtype");
            return new CommonAudioStat$TypeAudioSnippetItem(eventCategory, eventType, (EventSubtype) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), EventSubtype.class)), fai.A(x9yVar, "volume"), fai.C(x9yVar, "track_code"), fai.A(x9yVar, "audio_id"), fai.B(x9yVar, "audio_owner_id"), fai.A(x9yVar, "audio_id_new"), fai.B(x9yVar, "audio_owner_id_new"), fai.A(x9yVar, "playlist_id"), fai.B(x9yVar, "playlist_owner_id"), fai.A(x9yVar, "playlist_pos"), fai.A(x9yVar, "timeline_position"), fai.A(x9yVar, "playback_duration"), fai.A(x9yVar, "progress_pos"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem = (CommonAudioStat$TypeAudioSnippetItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_category", tru.a().toJson(commonAudioStat$TypeAudioSnippetItem.f()));
            x9yVar.o("event_type", tru.a().toJson(commonAudioStat$TypeAudioSnippetItem.h()));
            x9yVar.o("event_subtype", tru.a().toJson(commonAudioStat$TypeAudioSnippetItem.g()));
            x9yVar.n("volume", commonAudioStat$TypeAudioSnippetItem.o());
            x9yVar.o("track_code", commonAudioStat$TypeAudioSnippetItem.a);
            x9yVar.n("audio_id", commonAudioStat$TypeAudioSnippetItem.b());
            x9yVar.n("audio_owner_id", commonAudioStat$TypeAudioSnippetItem.d());
            x9yVar.n("audio_id_new", commonAudioStat$TypeAudioSnippetItem.c());
            x9yVar.n("audio_owner_id_new", commonAudioStat$TypeAudioSnippetItem.e());
            x9yVar.n("playlist_id", commonAudioStat$TypeAudioSnippetItem.j());
            x9yVar.n("playlist_owner_id", commonAudioStat$TypeAudioSnippetItem.k());
            x9yVar.n("playlist_pos", commonAudioStat$TypeAudioSnippetItem.l());
            x9yVar.n("timeline_position", commonAudioStat$TypeAudioSnippetItem.n());
            x9yVar.n("playback_duration", commonAudioStat$TypeAudioSnippetItem.i());
            x9yVar.n("progress_pos", commonAudioStat$TypeAudioSnippetItem.m());
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioSnippetItem(EventCategory eventCategory, EventType eventType, EventSubtype eventSubtype, Integer num, String str, Integer num2, Long l, Integer num3, Long l2, Integer num4, Long l3, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.eventCategory = eventCategory;
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.volume = num;
        this.a = str;
        this.audioId = num2;
        this.audioOwnerId = l;
        this.audioIdNew = num3;
        this.audioOwnerIdNew = l2;
        this.playlistId = num4;
        this.playlistOwnerId = l3;
        this.playlistPos = num5;
        this.timelinePosition = num6;
        this.playbackDuration = num7;
        this.progressPos = num8;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public static CommonAudioStat$TypeAudioSnippetItem a(CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem, Integer num, String str, Integer num2, Long l, Integer num3, Integer num4, Integer num5, Integer num6) {
        return new CommonAudioStat$TypeAudioSnippetItem(commonAudioStat$TypeAudioSnippetItem.eventCategory, commonAudioStat$TypeAudioSnippetItem.eventType, commonAudioStat$TypeAudioSnippetItem.eventSubtype, num, str, num2, l, commonAudioStat$TypeAudioSnippetItem.audioIdNew, commonAudioStat$TypeAudioSnippetItem.audioOwnerIdNew, null, null, num3, num4, num5, num6);
    }

    public final Integer b() {
        return this.audioId;
    }

    public final Integer c() {
        return this.audioIdNew;
    }

    public final Long d() {
        return this.audioOwnerId;
    }

    public final Long e() {
        return this.audioOwnerIdNew;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioSnippetItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem = (CommonAudioStat$TypeAudioSnippetItem) obj;
        return this.eventCategory == commonAudioStat$TypeAudioSnippetItem.eventCategory && this.eventType == commonAudioStat$TypeAudioSnippetItem.eventType && this.eventSubtype == commonAudioStat$TypeAudioSnippetItem.eventSubtype && epx.f(this.volume, commonAudioStat$TypeAudioSnippetItem.volume) && epx.f(this.a, commonAudioStat$TypeAudioSnippetItem.a) && epx.f(this.audioId, commonAudioStat$TypeAudioSnippetItem.audioId) && epx.f(this.audioOwnerId, commonAudioStat$TypeAudioSnippetItem.audioOwnerId) && epx.f(this.audioIdNew, commonAudioStat$TypeAudioSnippetItem.audioIdNew) && epx.f(this.audioOwnerIdNew, commonAudioStat$TypeAudioSnippetItem.audioOwnerIdNew) && epx.f(this.playlistId, commonAudioStat$TypeAudioSnippetItem.playlistId) && epx.f(this.playlistOwnerId, commonAudioStat$TypeAudioSnippetItem.playlistOwnerId) && epx.f(this.playlistPos, commonAudioStat$TypeAudioSnippetItem.playlistPos) && epx.f(this.timelinePosition, commonAudioStat$TypeAudioSnippetItem.timelinePosition) && epx.f(this.playbackDuration, commonAudioStat$TypeAudioSnippetItem.playbackDuration) && epx.f(this.progressPos, commonAudioStat$TypeAudioSnippetItem.progressPos);
    }

    public final EventCategory f() {
        return this.eventCategory;
    }

    public final EventSubtype g() {
        return this.eventSubtype;
    }

    public final EventType h() {
        return this.eventType;
    }

    public final int hashCode() {
        int hashCode = (this.eventType.hashCode() + (this.eventCategory.hashCode() * 31)) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        Integer num = this.volume;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.a;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.audioId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.audioOwnerId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.audioIdNew;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.audioOwnerIdNew;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num4 = this.playlistId;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l3 = this.playlistOwnerId;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num5 = this.playlistPos;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.timelinePosition;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.playbackDuration;
        int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.progressPos;
        return hashCode13 + (num8 != null ? num8.hashCode() : 0);
    }

    public final Integer i() {
        return this.playbackDuration;
    }

    public final Integer j() {
        return this.playlistId;
    }

    public final Long k() {
        return this.playlistOwnerId;
    }

    public final Integer l() {
        return this.playlistPos;
    }

    public final Integer m() {
        return this.progressPos;
    }

    public final Integer n() {
        return this.timelinePosition;
    }

    public final Integer o() {
        return this.volume;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioSnippetItem(eventCategory=");
        sb.append(this.eventCategory);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", audioIdNew=");
        sb.append(this.audioIdNew);
        sb.append(", audioOwnerIdNew=");
        sb.append(this.audioOwnerIdNew);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", playlistOwnerId=");
        sb.append(this.playlistOwnerId);
        sb.append(", playlistPos=");
        sb.append(this.playlistPos);
        sb.append(", timelinePosition=");
        sb.append(this.timelinePosition);
        sb.append(", playbackDuration=");
        sb.append(this.playbackDuration);
        sb.append(", progressPos=");
        return uqi.b(sb, this.progressPos, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioSnippetItem(EventCategory eventCategory, EventType eventType, EventSubtype eventSubtype, Integer num, String str, Integer num2, Long l, Integer num3, Long l2, Integer num4, Long l3, Integer num5, Integer num6, Integer num7, Integer num8, int i, zcl zclVar) {
        this(eventCategory, eventType, (i & 4) != 0 ? null : eventSubtype, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : l3, (i & 2048) != 0 ? null : num5, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) != 0 ? null : num8);
    }
}
