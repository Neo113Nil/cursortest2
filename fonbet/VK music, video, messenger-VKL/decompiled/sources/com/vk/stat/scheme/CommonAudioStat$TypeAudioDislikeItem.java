package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.iq;
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
public final class CommonAudioStat$TypeAudioDislikeItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("playlist_owner_id")
    private final Long playlistOwnerId;

    @pmi0("timeline_position")
    private final Integer timelinePosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("added_to_mm")
        public static final EventSubtype ADDED_TO_MM;

        static {
            EventSubtype eventSubtype = new EventSubtype("ADDED_TO_MM", 0);
            ADDED_TO_MM = eventSubtype;
            EventSubtype[] eventSubtypeArr = {eventSubtype};
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

        @pmi0("add_dislike")
        public static final EventType ADD_DISLIKE;

        @pmi0("remove_dislike")
        public static final EventType REMOVE_DISLIKE;

        static {
            EventType eventType = new EventType("ADD_DISLIKE", 0);
            ADD_DISLIKE = eventType;
            EventType eventType2 = new EventType("REMOVE_DISLIKE", 1);
            REMOVE_DISLIKE = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioDislikeItem>, a9y<CommonAudioStat$TypeAudioDislikeItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("event_subtype");
            return new CommonAudioStat$TypeAudioDislikeItem(eventType, (EventSubtype) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), EventSubtype.class)), fai.C(x9yVar, "track_code"), fai.A(x9yVar, "timeline_position"), fai.A(x9yVar, "audio_id"), fai.B(x9yVar, "audio_owner_id"), fai.A(x9yVar, "playlist_id"), fai.B(x9yVar, "playlist_owner_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioDislikeItem commonAudioStat$TypeAudioDislikeItem = (CommonAudioStat$TypeAudioDislikeItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(commonAudioStat$TypeAudioDislikeItem.e()));
            x9yVar.o("event_subtype", tru.a().toJson(commonAudioStat$TypeAudioDislikeItem.d()));
            x9yVar.o("track_code", commonAudioStat$TypeAudioDislikeItem.a);
            x9yVar.n("timeline_position", commonAudioStat$TypeAudioDislikeItem.h());
            x9yVar.n("audio_id", commonAudioStat$TypeAudioDislikeItem.b());
            x9yVar.n("audio_owner_id", commonAudioStat$TypeAudioDislikeItem.c());
            x9yVar.n("playlist_id", commonAudioStat$TypeAudioDislikeItem.f());
            x9yVar.n("playlist_owner_id", commonAudioStat$TypeAudioDislikeItem.g());
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioDislikeItem(EventType eventType, EventSubtype eventSubtype, String str, Integer num, Integer num2, Long l, Integer num3, Long l2) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.a = str;
        this.timelinePosition = num;
        this.audioId = num2;
        this.audioOwnerId = l;
        this.playlistId = num3;
        this.playlistOwnerId = l2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public static CommonAudioStat$TypeAudioDislikeItem a(CommonAudioStat$TypeAudioDislikeItem commonAudioStat$TypeAudioDislikeItem, String str, Integer num, Integer num2, Long l, Integer num3, Long l2) {
        return new CommonAudioStat$TypeAudioDislikeItem(commonAudioStat$TypeAudioDislikeItem.eventType, commonAudioStat$TypeAudioDislikeItem.eventSubtype, str, num, num2, l, num3, l2);
    }

    public final Integer b() {
        return this.audioId;
    }

    public final Long c() {
        return this.audioOwnerId;
    }

    public final EventSubtype d() {
        return this.eventSubtype;
    }

    public final EventType e() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioDislikeItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioDislikeItem commonAudioStat$TypeAudioDislikeItem = (CommonAudioStat$TypeAudioDislikeItem) obj;
        return this.eventType == commonAudioStat$TypeAudioDislikeItem.eventType && this.eventSubtype == commonAudioStat$TypeAudioDislikeItem.eventSubtype && epx.f(this.a, commonAudioStat$TypeAudioDislikeItem.a) && epx.f(this.timelinePosition, commonAudioStat$TypeAudioDislikeItem.timelinePosition) && epx.f(this.audioId, commonAudioStat$TypeAudioDislikeItem.audioId) && epx.f(this.audioOwnerId, commonAudioStat$TypeAudioDislikeItem.audioOwnerId) && epx.f(this.playlistId, commonAudioStat$TypeAudioDislikeItem.playlistId) && epx.f(this.playlistOwnerId, commonAudioStat$TypeAudioDislikeItem.playlistOwnerId);
    }

    public final Integer f() {
        return this.playlistId;
    }

    public final Long g() {
        return this.playlistOwnerId;
    }

    public final Integer h() {
        return this.timelinePosition;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.timelinePosition;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.audioId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.audioOwnerId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.playlistId;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.playlistOwnerId;
        return hashCode7 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioDislikeItem(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", timelinePosition=");
        sb.append(this.timelinePosition);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", playlistOwnerId=");
        return iq.b(sb, this.playlistOwnerId, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioDislikeItem(EventType eventType, EventSubtype eventSubtype, String str, Integer num, Integer num2, Long l, Integer num3, Long l2, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : l2);
    }
}
