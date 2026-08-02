package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("snackbar_connection_lost_quality_downloaded")
        public static final EventType SNACKBAR_CONNECTION_LOST_QUALITY_DOWNLOADED;

        @pmi0("snackbar_connection_restored_quality_upgrade")
        public static final EventType SNACKBAR_CONNECTION_RESTORED_QUALITY_UPGRADE;

        static {
            EventType eventType = new EventType("SNACKBAR_CONNECTION_LOST_QUALITY_DOWNLOADED", 0);
            SNACKBAR_CONNECTION_LOST_QUALITY_DOWNLOADED = eventType;
            EventType eventType2 = new EventType("SNACKBAR_CONNECTION_RESTORED_QUALITY_UPGRADE", 1);
            SNACKBAR_CONNECTION_RESTORED_QUALITY_UPGRADE = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent = (MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent.eventType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent.screenMode;
    }

    public final int hashCode() {
        return this.screenMode.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoOfflineSnackbarEvent(eventType=" + this.eventType + ", screenMode=" + this.screenMode + ')';
    }
}
