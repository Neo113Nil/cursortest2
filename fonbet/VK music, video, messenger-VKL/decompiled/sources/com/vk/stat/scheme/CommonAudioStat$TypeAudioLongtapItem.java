package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeView;
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
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudioLongtapItem implements SchemeStat$TypeAction.b, SchemeStat$TypeView.b {
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

    @pmi0("nav_info")
    private final CommonAudioStat$AudioListeningNavInfo navInfo;

    @pmi0("playback_duration")
    private final Integer playbackDuration;

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

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventCategory VIEW;

        static {
            EventCategory eventCategory = new EventCategory("NAV", 0);
            NAV = eventCategory;
            EventCategory eventCategory2 = new EventCategory("PLAY", 1);
            PLAY = eventCategory2;
            EventCategory eventCategory3 = new EventCategory("VIEW", 2);
            VIEW = eventCategory3;
            EventCategory eventCategory4 = new EventCategory("ACTION", 3);
            ACTION = eventCategory4;
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

        @pmi0("add_longtap")
        public static final EventSubtype ADD_LONGTAP;

        @pmi0("add_track")
        public static final EventSubtype ADD_TRACK;

        @pmi0("auto_finish")
        public static final EventSubtype AUTO_FINISH;

        @pmi0("click_exit")
        public static final EventSubtype CLICK_EXIT;

        @pmi0("click_outside")
        public static final EventSubtype CLICK_OUTSIDE;

        @pmi0("close_app")
        public static final EventSubtype CLOSE_APP;

        @pmi0("goto_artist")
        public static final EventSubtype GOTO_ARTIST;

        @pmi0("goto_track")
        public static final EventSubtype GOTO_TRACK;

        @pmi0("hint_longtap")
        public static final EventSubtype HINT_LONGTAP;

        @pmi0("longtap")
        public static final EventSubtype LONGTAP;

        @pmi0("open_longtap")
        public static final EventSubtype OPEN_LONGTAP;

        @pmi0("reopen_longtap")
        public static final EventSubtype REOPEN_LONGTAP;

        static {
            EventSubtype eventSubtype = new EventSubtype("LONGTAP", 0);
            LONGTAP = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("OPEN_LONGTAP", 1);
            OPEN_LONGTAP = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("REOPEN_LONGTAP", 2);
            REOPEN_LONGTAP = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("CLICK_OUTSIDE", 3);
            CLICK_OUTSIDE = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("CLICK_EXIT", 4);
            CLICK_EXIT = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("CLOSE_APP", 5);
            CLOSE_APP = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("ADD_TRACK", 6);
            ADD_TRACK = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("AUTO_FINISH", 7);
            AUTO_FINISH = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("ADD_LONGTAP", 8);
            ADD_LONGTAP = eventSubtype9;
            EventSubtype eventSubtype10 = new EventSubtype("HINT_LONGTAP", 9);
            HINT_LONGTAP = eventSubtype10;
            EventSubtype eventSubtype11 = new EventSubtype("GOTO_TRACK", 10);
            GOTO_TRACK = eventSubtype11;
            EventSubtype eventSubtype12 = new EventSubtype("GOTO_ARTIST", 11);
            GOTO_ARTIST = eventSubtype12;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9, eventSubtype10, eventSubtype11, eventSubtype12};
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

        @pmi0("hint")
        public static final EventType HINT;

        @pmi0("longtap_drilldown")
        public static final EventType LONGTAP_DRILLDOWN;

        @pmi0("open")
        public static final EventType OPEN;

        @pmi0("start")
        public static final EventType START;

        @pmi0("stop")
        public static final EventType STOP;

        static {
            EventType eventType = new EventType("ADDED", 0);
            ADDED = eventType;
            EventType eventType2 = new EventType("HINT", 1);
            HINT = eventType2;
            EventType eventType3 = new EventType("OPEN", 2);
            OPEN = eventType3;
            EventType eventType4 = new EventType("START", 3);
            START = eventType4;
            EventType eventType5 = new EventType("STOP", 4);
            STOP = eventType5;
            EventType eventType6 = new EventType("LONGTAP_DRILLDOWN", 5);
            LONGTAP_DRILLDOWN = eventType6;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6};
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
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioLongtapItem>, a9y<CommonAudioStat$TypeAudioLongtapItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventCategory eventCategory = (EventCategory) dq.f(x9yVar, "event_category", tru.a(), EventCategory.class);
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            EventSubtype eventSubtype = (EventSubtype) dq.f(x9yVar, "event_subtype", tru.a(), EventSubtype.class);
            Integer A = fai.A(x9yVar, "timeline_position");
            Integer A2 = fai.A(x9yVar, "playback_duration");
            String C = fai.C(x9yVar, "track_code");
            Integer A3 = fai.A(x9yVar, "audio_id");
            Long B = fai.B(x9yVar, "audio_owner_id");
            Integer A4 = fai.A(x9yVar, "audio_id_new");
            Long B2 = fai.B(x9yVar, "audio_owner_id_new");
            Integer A5 = fai.A(x9yVar, "volume");
            Gson a = tru.a();
            b9y q = x9yVar.q("nav_info");
            return new CommonAudioStat$TypeAudioLongtapItem(eventCategory, eventType, eventSubtype, A, A2, C, A3, B, A4, B2, A5, (CommonAudioStat$AudioListeningNavInfo) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonAudioStat$AudioListeningNavInfo.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem = (CommonAudioStat$TypeAudioLongtapItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_category", tru.a().toJson(commonAudioStat$TypeAudioLongtapItem.f()));
            x9yVar.o("event_type", tru.a().toJson(commonAudioStat$TypeAudioLongtapItem.h()));
            x9yVar.o("event_subtype", tru.a().toJson(commonAudioStat$TypeAudioLongtapItem.g()));
            x9yVar.n("timeline_position", commonAudioStat$TypeAudioLongtapItem.k());
            x9yVar.n("playback_duration", commonAudioStat$TypeAudioLongtapItem.j());
            x9yVar.o("track_code", commonAudioStat$TypeAudioLongtapItem.a);
            x9yVar.n("audio_id", commonAudioStat$TypeAudioLongtapItem.b());
            x9yVar.n("audio_owner_id", commonAudioStat$TypeAudioLongtapItem.d());
            x9yVar.n("audio_id_new", commonAudioStat$TypeAudioLongtapItem.c());
            x9yVar.n("audio_owner_id_new", commonAudioStat$TypeAudioLongtapItem.e());
            x9yVar.n("volume", commonAudioStat$TypeAudioLongtapItem.l());
            x9yVar.o("nav_info", tru.a().toJson(commonAudioStat$TypeAudioLongtapItem.i()));
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioLongtapItem(EventCategory eventCategory, EventType eventType, EventSubtype eventSubtype, Integer num, Integer num2, String str, Integer num3, Long l, Integer num4, Long l2, Integer num5, CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo) {
        this.eventCategory = eventCategory;
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.timelinePosition = num;
        this.playbackDuration = num2;
        this.a = str;
        this.audioId = num3;
        this.audioOwnerId = l;
        this.audioIdNew = num4;
        this.audioOwnerIdNew = l2;
        this.volume = num5;
        this.navInfo = commonAudioStat$AudioListeningNavInfo;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public static CommonAudioStat$TypeAudioLongtapItem a(CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem, String str, Integer num, Long l, Integer num2, Long l2, Integer num3) {
        return new CommonAudioStat$TypeAudioLongtapItem(commonAudioStat$TypeAudioLongtapItem.eventCategory, commonAudioStat$TypeAudioLongtapItem.eventType, commonAudioStat$TypeAudioLongtapItem.eventSubtype, commonAudioStat$TypeAudioLongtapItem.timelinePosition, commonAudioStat$TypeAudioLongtapItem.playbackDuration, str, num, l, num2, l2, num3, commonAudioStat$TypeAudioLongtapItem.navInfo);
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
        if (!(obj instanceof CommonAudioStat$TypeAudioLongtapItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem = (CommonAudioStat$TypeAudioLongtapItem) obj;
        return this.eventCategory == commonAudioStat$TypeAudioLongtapItem.eventCategory && this.eventType == commonAudioStat$TypeAudioLongtapItem.eventType && this.eventSubtype == commonAudioStat$TypeAudioLongtapItem.eventSubtype && epx.f(this.timelinePosition, commonAudioStat$TypeAudioLongtapItem.timelinePosition) && epx.f(this.playbackDuration, commonAudioStat$TypeAudioLongtapItem.playbackDuration) && epx.f(this.a, commonAudioStat$TypeAudioLongtapItem.a) && epx.f(this.audioId, commonAudioStat$TypeAudioLongtapItem.audioId) && epx.f(this.audioOwnerId, commonAudioStat$TypeAudioLongtapItem.audioOwnerId) && epx.f(this.audioIdNew, commonAudioStat$TypeAudioLongtapItem.audioIdNew) && epx.f(this.audioOwnerIdNew, commonAudioStat$TypeAudioLongtapItem.audioOwnerIdNew) && epx.f(this.volume, commonAudioStat$TypeAudioLongtapItem.volume) && epx.f(this.navInfo, commonAudioStat$TypeAudioLongtapItem.navInfo);
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
        int hashCode = (this.eventSubtype.hashCode() + ((this.eventType.hashCode() + (this.eventCategory.hashCode() * 31)) * 31)) * 31;
        Integer num = this.timelinePosition;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.playbackDuration;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.a;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.audioId;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.audioOwnerId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.audioIdNew;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l2 = this.audioOwnerIdNew;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num5 = this.volume;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = this.navInfo;
        return hashCode9 + (commonAudioStat$AudioListeningNavInfo != null ? commonAudioStat$AudioListeningNavInfo.hashCode() : 0);
    }

    public final CommonAudioStat$AudioListeningNavInfo i() {
        return this.navInfo;
    }

    public final Integer j() {
        return this.playbackDuration;
    }

    public final Integer k() {
        return this.timelinePosition;
    }

    public final Integer l() {
        return this.volume;
    }

    public final String toString() {
        return "TypeAudioLongtapItem(eventCategory=" + this.eventCategory + ", eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", timelinePosition=" + this.timelinePosition + ", playbackDuration=" + this.playbackDuration + ", trackCode=" + this.a + ", audioId=" + this.audioId + ", audioOwnerId=" + this.audioOwnerId + ", audioIdNew=" + this.audioIdNew + ", audioOwnerIdNew=" + this.audioOwnerIdNew + ", volume=" + this.volume + ", navInfo=" + this.navInfo + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioLongtapItem(EventCategory eventCategory, EventType eventType, EventSubtype eventSubtype, Integer num, Integer num2, String str, Integer num3, Long l, Integer num4, Long l2, Integer num5, CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo, int i, zcl zclVar) {
        this(eventCategory, eventType, eventSubtype, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : commonAudioStat$AudioListeningNavInfo);
    }
}
