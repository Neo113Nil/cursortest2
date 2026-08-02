package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.onelog.UploadService;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdTrialAction implements SchemeStat$TypeAction.b {

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

        @pmi0("hide")
        public static final EventSubtype HIDE;

        @pmi0("show")
        public static final EventSubtype SHOW;

        static {
            EventSubtype eventSubtype = new EventSubtype("SHOW", 0);
            SHOW = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("HIDE", 1);
            HIDE = eventSubtype2;
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

        @pmi0("request")
        public static final EventType REQUEST;

        @pmi0(UploadService.EXTRA_TRIGGER)
        public static final EventType TRIGGER;

        @pmi0("turned_on")
        public static final EventType TURNED_ON;

        static {
            EventType eventType = new EventType("REQUEST", 0);
            REQUEST = eventType;
            EventType eventType2 = new EventType("TURNED_ON", 1);
            TURNED_ON = eventType2;
            EventType eventType3 = new EventType("TRIGGER", 2);
            TRIGGER = eventType3;
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

    public MobileOfficialAppsVideoStat$TypeVideoAdTrialAction(EventType eventType, EventSubtype eventSubtype, String str) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.objectValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAdTrialAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAdTrialAction mobileOfficialAppsVideoStat$TypeVideoAdTrialAction = (MobileOfficialAppsVideoStat$TypeVideoAdTrialAction) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAdTrialAction.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAdTrialAction.eventSubtype && epx.f(this.objectValue, mobileOfficialAppsVideoStat$TypeVideoAdTrialAction.objectValue);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        String str = this.objectValue;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAdTrialAction(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", objectValue=");
        return ho8.a(sb, this.objectValue, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdTrialAction(EventType eventType, EventSubtype eventSubtype, String str, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype, (i & 4) != 0 ? null : str);
    }
}
