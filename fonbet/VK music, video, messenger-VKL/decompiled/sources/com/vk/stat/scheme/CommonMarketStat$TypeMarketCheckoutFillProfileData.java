package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketCheckoutFillProfileData implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("owner_id")
    private final long ownerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("off")
        public static final EventType OFF;

        @pmi0("on")
        public static final EventType ON;

        static {
            EventType eventType = new EventType("ON", 0);
            ON = eventType;
            EventType eventType2 = new EventType("OFF", 1);
            OFF = eventType2;
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

    public CommonMarketStat$TypeMarketCheckoutFillProfileData(long j, EventType eventType) {
        this.ownerId = j;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketCheckoutFillProfileData)) {
            return false;
        }
        CommonMarketStat$TypeMarketCheckoutFillProfileData commonMarketStat$TypeMarketCheckoutFillProfileData = (CommonMarketStat$TypeMarketCheckoutFillProfileData) obj;
        return this.ownerId == commonMarketStat$TypeMarketCheckoutFillProfileData.ownerId && this.eventType == commonMarketStat$TypeMarketCheckoutFillProfileData.eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode() + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        return "TypeMarketCheckoutFillProfileData(ownerId=" + this.ownerId + ", eventType=" + this.eventType + ')';
    }
}
