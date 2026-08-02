package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen implements SchemeStat$TypeClick.b {

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

        @pmi0("button")
        public static final EventSubtype BUTTON;

        @pmi0("rotate")
        public static final EventSubtype ROTATE;

        @pmi0("shevron")
        public static final EventSubtype SHEVRON;

        @pmi0("swipe")
        public static final EventSubtype SWIPE;

        static {
            EventSubtype eventSubtype = new EventSubtype("BUTTON", 0);
            BUTTON = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("SWIPE", 1);
            SWIPE = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("ROTATE", 2);
            ROTATE = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("SHEVRON", 3);
            SHEVRON = eventSubtype4;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4};
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

        @pmi0("exit_fullscreen")
        public static final EventType EXIT_FULLSCREEN;

        @pmi0("go_to_fullscreen")
        public static final EventType GO_TO_FULLSCREEN;

        static {
            EventType eventType = new EventType("GO_TO_FULLSCREEN", 0);
            GO_TO_FULLSCREEN = eventType;
            EventType eventType2 = new EventType("EXIT_FULLSCREEN", 1);
            EXIT_FULLSCREEN = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen = (MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoToggleFullscreen(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
