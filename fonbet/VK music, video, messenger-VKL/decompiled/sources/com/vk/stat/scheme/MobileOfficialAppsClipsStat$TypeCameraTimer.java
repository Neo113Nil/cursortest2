package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeCameraTimer {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("cancel_timer_settings")
        public static final EventType CANCEL_TIMER_SETTINGS;

        @pmi0("open_timer")
        public static final EventType OPEN_TIMER;

        @pmi0("start_timer")
        public static final EventType START_TIMER;

        static {
            EventType eventType = new EventType("CANCEL_TIMER_SETTINGS", 0);
            CANCEL_TIMER_SETTINGS = eventType;
            EventType eventType2 = new EventType("OPEN_TIMER", 1);
            OPEN_TIMER = eventType2;
            EventType eventType3 = new EventType("START_TIMER", 2);
            START_TIMER = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public MobileOfficialAppsClipsStat$TypeCameraTimer(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeCameraTimer) && this.eventType == ((MobileOfficialAppsClipsStat$TypeCameraTimer) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeCameraTimer(eventType=" + this.eventType + ')';
    }
}
