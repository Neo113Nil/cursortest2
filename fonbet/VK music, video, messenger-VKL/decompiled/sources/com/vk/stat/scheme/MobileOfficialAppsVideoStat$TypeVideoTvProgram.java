package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoTvProgram implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("position_in_block")
    private final Integer positionInBlock;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("tv_program_click")
        public static final EventType TV_PROGRAM_CLICK;

        @pmi0("tv_program_item_click")
        public static final EventType TV_PROGRAM_ITEM_CLICK;

        static {
            EventType eventType = new EventType("TV_PROGRAM_CLICK", 0);
            TV_PROGRAM_CLICK = eventType;
            EventType eventType2 = new EventType("TV_PROGRAM_ITEM_CLICK", 1);
            TV_PROGRAM_ITEM_CLICK = eventType2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoTvProgram() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoTvProgram)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoTvProgram mobileOfficialAppsVideoStat$TypeVideoTvProgram = (MobileOfficialAppsVideoStat$TypeVideoTvProgram) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoTvProgram.eventType && epx.f(this.positionInBlock, mobileOfficialAppsVideoStat$TypeVideoTvProgram.positionInBlock);
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        Integer num = this.positionInBlock;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoTvProgram(eventType=");
        sb.append(this.eventType);
        sb.append(", positionInBlock=");
        return uqi.b(sb, this.positionInBlock, ')');
    }

    public MobileOfficialAppsVideoStat$TypeVideoTvProgram(EventType eventType, Integer num) {
        this.eventType = eventType;
        this.positionInBlock = num;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoTvProgram(EventType eventType, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : num);
    }
}
