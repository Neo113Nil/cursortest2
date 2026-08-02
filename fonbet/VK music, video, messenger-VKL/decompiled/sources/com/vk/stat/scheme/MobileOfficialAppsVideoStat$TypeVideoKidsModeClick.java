package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoKidsModeClick implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("disable_kids_mode")
        public static final Event DISABLE_KIDS_MODE;

        @pmi0("enable_kids_mode")
        public static final Event ENABLE_KIDS_MODE;

        @pmi0("set_pin_code")
        public static final Event SET_PIN_CODE;

        static {
            Event event = new Event("ENABLE_KIDS_MODE", 0);
            ENABLE_KIDS_MODE = event;
            Event event2 = new Event("DISABLE_KIDS_MODE", 1);
            DISABLE_KIDS_MODE = event2;
            Event event3 = new Event("SET_PIN_CODE", 2);
            SET_PIN_CODE = event3;
            Event[] eventArr = {event, event2, event3};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoKidsModeClick(Event event) {
        this.event = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoKidsModeClick) && this.event == ((MobileOfficialAppsVideoStat$TypeVideoKidsModeClick) obj).event;
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "TypeVideoKidsModeClick(event=" + this.event + ')';
    }
}
