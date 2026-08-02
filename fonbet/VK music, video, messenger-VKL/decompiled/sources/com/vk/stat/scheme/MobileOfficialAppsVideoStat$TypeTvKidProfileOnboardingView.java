package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView implements SchemeStat$TypeView.b {

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

        @pmi0("qr_1")
        public static final EventSubtype QR_1;

        @pmi0("qr_2")
        public static final EventSubtype QR_2;

        static {
            EventSubtype eventSubtype = new EventSubtype("QR_1", 0);
            QR_1 = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("QR_2", 1);
            QR_2 = eventSubtype2;
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

        @pmi0("kid_profile_create_start")
        public static final EventType KID_PROFILE_CREATE_START;

        static {
            EventType eventType = new EventType("KID_PROFILE_CREATE_START", 0);
            KID_PROFILE_CREATE_START = eventType;
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

    public MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView = (MobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeTvKidProfileOnboardingView.eventSubtype;
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeTvKidProfileOnboardingView(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }
}
