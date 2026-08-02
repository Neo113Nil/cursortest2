package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoScreenLockAction implements SchemeStat$TypeAction.b {

    @pmi0("event_source")
    private final EventSource eventSource;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;

        @pmi0("auto")
        public static final EventSource AUTO;

        @pmi0("button")
        public static final EventSource BUTTON;

        @pmi0("settings")
        public static final EventSource SETTINGS;

        static {
            EventSource eventSource = new EventSource("BUTTON", 0);
            BUTTON = eventSource;
            EventSource eventSource2 = new EventSource("AUTO", 1);
            AUTO = eventSource2;
            EventSource eventSource3 = new EventSource("SETTINGS", 2);
            SETTINGS = eventSource3;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3};
            $VALUES = eventSourceArr;
            $ENTRIES = new asp(eventSourceArr);
        }

        private EventSource(String str, int i) {
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("annoncement_trap")
        public static final EventSubtype ANNONCEMENT_TRAP;

        @pmi0("announcement_cross")
        public static final EventSubtype ANNOUNCEMENT_CROSS;

        @pmi0("exit_app")
        public static final EventSubtype EXIT_APP;

        static {
            EventSubtype eventSubtype = new EventSubtype("EXIT_APP", 0);
            EXIT_APP = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("ANNONCEMENT_TRAP", 1);
            ANNONCEMENT_TRAP = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("ANNOUNCEMENT_CROSS", 2);
            ANNOUNCEMENT_CROSS = eventSubtype3;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3};
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

        @pmi0("screen_lock")
        public static final EventType SCREEN_LOCK;

        @pmi0("screen_unlock")
        public static final EventType SCREEN_UNLOCK;

        static {
            EventType eventType = new EventType("SCREEN_LOCK", 0);
            SCREEN_LOCK = eventType;
            EventType eventType2 = new EventType("SCREEN_UNLOCK", 1);
            SCREEN_UNLOCK = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoScreenLockAction(EventType eventType, EventSource eventSource, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSource = eventSource;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoScreenLockAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoScreenLockAction mobileOfficialAppsVideoStat$TypeVideoScreenLockAction = (MobileOfficialAppsVideoStat$TypeVideoScreenLockAction) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoScreenLockAction.eventType && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoScreenLockAction.eventSource && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoScreenLockAction.screenMode && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoScreenLockAction.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = (this.screenMode.hashCode() + ((this.eventSource.hashCode() + (this.eventType.hashCode() * 31)) * 31)) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeVideoScreenLockAction(eventType=" + this.eventType + ", eventSource=" + this.eventSource + ", screenMode=" + this.screenMode + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoScreenLockAction(EventType eventType, EventSource eventSource, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, eventSource, mobileOfficialAppsVideoStat$TypeScreenMode, (i & 8) != 0 ? null : eventSubtype);
    }
}
