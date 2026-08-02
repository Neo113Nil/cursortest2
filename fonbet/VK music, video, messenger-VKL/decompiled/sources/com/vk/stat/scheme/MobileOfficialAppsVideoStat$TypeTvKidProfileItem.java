package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeTvKidProfileItem implements SchemeStat$TypeAction.b {

    @pmi0("child_profile_id")
    private final long childProfileId;

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

        @pmi0("login")
        public static final EventSubtype LOGIN;

        @pmi0("select")
        public static final EventSubtype SELECT;

        static {
            EventSubtype eventSubtype = new EventSubtype("LOGIN", 0);
            LOGIN = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("SELECT", 1);
            SELECT = eventSubtype2;
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

        @pmi0("kid_profile_create")
        public static final EventType KID_PROFILE_CREATE;

        @pmi0("kid_profile_login")
        public static final EventType KID_PROFILE_LOGIN;

        static {
            EventType eventType = new EventType("KID_PROFILE_CREATE", 0);
            KID_PROFILE_CREATE = eventType;
            EventType eventType2 = new EventType("KID_PROFILE_LOGIN", 1);
            KID_PROFILE_LOGIN = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeTvKidProfileItem(EventType eventType, long j, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.childProfileId = j;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeTvKidProfileItem)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeTvKidProfileItem mobileOfficialAppsVideoStat$TypeTvKidProfileItem = (MobileOfficialAppsVideoStat$TypeTvKidProfileItem) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeTvKidProfileItem.eventType && this.childProfileId == mobileOfficialAppsVideoStat$TypeTvKidProfileItem.childProfileId && this.eventSubtype == mobileOfficialAppsVideoStat$TypeTvKidProfileItem.eventSubtype;
    }

    public final int hashCode() {
        int a = bh10.a(this.eventType.hashCode() * 31, 31, this.childProfileId);
        EventSubtype eventSubtype = this.eventSubtype;
        return a + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeTvKidProfileItem(eventType=" + this.eventType + ", childProfileId=" + this.childProfileId + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeTvKidProfileItem(EventType eventType, long j, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, j, (i & 4) != 0 ? null : eventSubtype);
    }
}
