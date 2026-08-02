package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeTvKidModeItem implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final String objectValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("auto")
        public static final EventSubtype AUTO;

        @pmi0("button")
        public static final EventSubtype BUTTON;

        static {
            EventSubtype eventSubtype = new EventSubtype("BUTTON", 0);
            BUTTON = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("AUTO", 1);
            AUTO = eventSubtype2;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2};
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

        @pmi0("age_filter_button_tap")
        public static final EventType AGE_FILTER_BUTTON_TAP;

        @pmi0("age_filter_reset")
        public static final EventType AGE_FILTER_RESET;

        @pmi0("age_filter_select")
        public static final EventType AGE_FILTER_SELECT;

        @pmi0("kid_mode_login")
        public static final EventType KID_MODE_LOGIN;

        @pmi0("kid_mode_make_pin")
        public static final EventType KID_MODE_MAKE_PIN;

        @pmi0("kid_mode_pin_restore_start")
        public static final EventType KID_MODE_PIN_RESTORE_START;

        static {
            EventType eventType = new EventType("KID_MODE_MAKE_PIN", 0);
            KID_MODE_MAKE_PIN = eventType;
            EventType eventType2 = new EventType("KID_MODE_LOGIN", 1);
            KID_MODE_LOGIN = eventType2;
            EventType eventType3 = new EventType("KID_MODE_PIN_RESTORE_START", 2);
            KID_MODE_PIN_RESTORE_START = eventType3;
            EventType eventType4 = new EventType("AGE_FILTER_BUTTON_TAP", 3);
            AGE_FILTER_BUTTON_TAP = eventType4;
            EventType eventType5 = new EventType("AGE_FILTER_SELECT", 4);
            AGE_FILTER_SELECT = eventType5;
            EventType eventType6 = new EventType("AGE_FILTER_RESET", 5);
            AGE_FILTER_RESET = eventType6;
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

    public MobileOfficialAppsVideoStat$TypeTvKidModeItem(EventType eventType, String str, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.objectValue = str;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeTvKidModeItem)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem = (MobileOfficialAppsVideoStat$TypeTvKidModeItem) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeTvKidModeItem.eventType && epx.f(this.objectValue, mobileOfficialAppsVideoStat$TypeTvKidModeItem.objectValue) && this.eventSubtype == mobileOfficialAppsVideoStat$TypeTvKidModeItem.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.objectValue;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode2 + (eventSubtype != null ? eventSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "TypeTvKidModeItem(eventType=" + this.eventType + ", objectValue=" + this.objectValue + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeTvKidModeItem(EventType eventType, String str, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : eventSubtype);
    }
}
