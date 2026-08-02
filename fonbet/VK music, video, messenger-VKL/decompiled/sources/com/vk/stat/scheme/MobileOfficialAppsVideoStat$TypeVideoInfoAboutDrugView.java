package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView implements SchemeStat$TypeView.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("popup")
        public static final EventSubtype POPUP;

        static {
            EventSubtype eventSubtype = new EventSubtype("POPUP", 0);
            POPUP = eventSubtype;
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
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("show")
        public static final EventType SHOW;

        static {
            EventType eventType = new EventType("SHOW", 0);
            SHOW = eventType;
            EventType[] eventTypeArr = {eventType};
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

    public MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView = (MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugView.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoInfoAboutDrugView(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
