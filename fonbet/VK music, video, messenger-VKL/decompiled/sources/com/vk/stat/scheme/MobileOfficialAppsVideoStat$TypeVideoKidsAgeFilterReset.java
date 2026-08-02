package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset implements SchemeStat$TypeAction.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

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
            EventSubtype eventSubtype = new EventSubtype("AUTO", 0);
            AUTO = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("BUTTON", 1);
            BUTTON = eventSubtype2;
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

    public MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset(EventSubtype eventSubtype) {
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset) && this.eventSubtype == ((MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset) obj).eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode();
    }

    public final String toString() {
        return "TypeVideoKidsAgeFilterReset(eventSubtype=" + this.eventSubtype + ')';
    }
}
