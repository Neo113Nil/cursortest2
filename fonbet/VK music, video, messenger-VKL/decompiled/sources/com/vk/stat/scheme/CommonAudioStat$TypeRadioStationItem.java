package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeRadioStationItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("radio_station_id")
    private final int radioStationId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("follow")
        public static final EventType FOLLOW;

        @pmi0("off")
        public static final EventType OFF;

        @pmi0("on")
        public static final EventType ON;

        @pmi0("unfollow")
        public static final EventType UNFOLLOW;

        static {
            EventType eventType = new EventType("ON", 0);
            ON = eventType;
            EventType eventType2 = new EventType("OFF", 1);
            OFF = eventType2;
            EventType eventType3 = new EventType("FOLLOW", 2);
            FOLLOW = eventType3;
            EventType eventType4 = new EventType("UNFOLLOW", 3);
            UNFOLLOW = eventType4;
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

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeRadioStationItem>, a9y<CommonAudioStat$TypeRadioStationItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonAudioStat$TypeRadioStationItem(fai.p(x9yVar, "radio_station_id"), (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class), fai.A(x9yVar, "duration"), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem = (CommonAudioStat$TypeRadioStationItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("radio_station_id", Integer.valueOf(commonAudioStat$TypeRadioStationItem.c()));
            x9yVar.o("event_type", tru.a().toJson(commonAudioStat$TypeRadioStationItem.b()));
            x9yVar.n("duration", commonAudioStat$TypeRadioStationItem.a());
            x9yVar.o("track_code", commonAudioStat$TypeRadioStationItem.a);
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeRadioStationItem(int i, EventType eventType, Integer num, String str) {
        this.radioStationId = i;
        this.eventType = eventType;
        this.duration = num;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final Integer a() {
        return this.duration;
    }

    public final EventType b() {
        return this.eventType;
    }

    public final int c() {
        return this.radioStationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeRadioStationItem)) {
            return false;
        }
        CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem = (CommonAudioStat$TypeRadioStationItem) obj;
        return this.radioStationId == commonAudioStat$TypeRadioStationItem.radioStationId && this.eventType == commonAudioStat$TypeRadioStationItem.eventType && epx.f(this.duration, commonAudioStat$TypeRadioStationItem.duration) && epx.f(this.a, commonAudioStat$TypeRadioStationItem.a);
    }

    public final int hashCode() {
        int hashCode = (this.eventType.hashCode() + (Integer.hashCode(this.radioStationId) * 31)) * 31;
        Integer num = this.duration;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.a;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeRadioStationItem(radioStationId=");
        sb.append(this.radioStationId);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeRadioStationItem(int i, EventType eventType, Integer num, String str, int i2, zcl zclVar) {
        this(i, eventType, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str);
    }
}
