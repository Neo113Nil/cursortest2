package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$IdfaPermissionScreenClick implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("allow")
        public static final EventSubtype ALLOW;

        @pmi0("deny")
        public static final EventSubtype DENY;

        static {
            EventSubtype eventSubtype = new EventSubtype("ALLOW", 0);
            ALLOW = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("DENY", 1);
            DENY = eventSubtype2;
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

    public MobileOfficialAppsVideoStat$IdfaPermissionScreenClick(EventSubtype eventSubtype) {
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$IdfaPermissionScreenClick) && this.eventSubtype == ((MobileOfficialAppsVideoStat$IdfaPermissionScreenClick) obj).eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode();
    }

    public final String toString() {
        return "IdfaPermissionScreenClick(eventSubtype=" + this.eventSubtype + ')';
    }
}
