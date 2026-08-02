package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreEncodingStat$EventTimeItem {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("timestamp")
    private final long timestamp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("encoder_fallback")
        public static final EventType ENCODER_FALLBACK;

        @pmi0("error")
        public static final EventType ERROR;

        @pmi0("finish")
        public static final EventType FINISH;

        @pmi0("start")
        public static final EventType START;

        static {
            EventType eventType = new EventType("START", 0);
            START = eventType;
            EventType eventType2 = new EventType("FINISH", 1);
            FINISH = eventType2;
            EventType eventType3 = new EventType("ERROR", 2);
            ERROR = eventType3;
            EventType eventType4 = new EventType("ENCODER_FALLBACK", 3);
            ENCODER_FALLBACK = eventType4;
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

    public MobileOfficialAppsCoreEncodingStat$EventTimeItem(EventType eventType, long j) {
        this.eventType = eventType;
        this.timestamp = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreEncodingStat$EventTimeItem)) {
            return false;
        }
        MobileOfficialAppsCoreEncodingStat$EventTimeItem mobileOfficialAppsCoreEncodingStat$EventTimeItem = (MobileOfficialAppsCoreEncodingStat$EventTimeItem) obj;
        return this.eventType == mobileOfficialAppsCoreEncodingStat$EventTimeItem.eventType && this.timestamp == mobileOfficialAppsCoreEncodingStat$EventTimeItem.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventTimeItem(eventType=");
        sb.append(this.eventType);
        sb.append(", timestamp=");
        return vu5.a(')', this.timestamp, sb);
    }
}
