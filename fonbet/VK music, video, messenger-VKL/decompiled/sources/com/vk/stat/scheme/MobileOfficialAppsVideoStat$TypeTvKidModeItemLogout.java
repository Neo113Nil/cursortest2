package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final int objectValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("kid_mode_logout")
        public static final EventType KID_MODE_LOGOUT;

        @pmi0("kid_mode_logout_failed")
        public static final EventType KID_MODE_LOGOUT_FAILED;

        static {
            EventType eventType = new EventType("KID_MODE_LOGOUT", 0);
            KID_MODE_LOGOUT = eventType;
            EventType eventType2 = new EventType("KID_MODE_LOGOUT_FAILED", 1);
            KID_MODE_LOGOUT_FAILED = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout(EventType eventType, int i) {
        this.eventType = eventType;
        this.objectValue = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout = (MobileOfficialAppsVideoStat$TypeTvKidModeItemLogout) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout.eventType && this.objectValue == mobileOfficialAppsVideoStat$TypeTvKidModeItemLogout.objectValue;
    }

    public final int hashCode() {
        return Integer.hashCode(this.objectValue) + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeTvKidModeItemLogout(eventType=");
        sb.append(this.eventType);
        sb.append(", objectValue=");
        return vu5.b(sb, this.objectValue, ')');
    }
}
