package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("subscribe")
        public static final EventType SUBSCRIBE;

        @pmi0("unsubscribe")
        public static final EventType UNSUBSCRIBE;

        static {
            EventType eventType = new EventType("SUBSCRIBE", 0);
            SUBSCRIBE = eventType;
            EventType eventType2 = new EventType("UNSUBSCRIBE", 1);
            UNSUBSCRIBE = eventType2;
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
    public MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem) && this.eventType == ((MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem) obj).eventType;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        if (eventType == null) {
            return 0;
        }
        return eventType.hashCode();
    }

    public final String toString() {
        return "TypeMarketSubscribeMarketButtonClickItem(eventType=" + this.eventType + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem(EventType eventType) {
        this.eventType = eventType;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem(EventType eventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType);
    }
}
