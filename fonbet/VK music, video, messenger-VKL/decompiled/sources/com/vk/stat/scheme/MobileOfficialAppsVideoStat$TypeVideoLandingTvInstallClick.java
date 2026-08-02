package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick implements SchemeStat$TypeClick.b {

    @pmi0("event_source")
    private final EventSource eventSource;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;

        @pmi0("help")
        public static final EventSource HELP;

        @pmi0("notification_settings")
        public static final EventSource NOTIFICATION_SETTINGS;

        @pmi0("retranslation_sheet")
        public static final EventSource RETRANSLATION_SHEET;

        @pmi0("settings")
        public static final EventSource SETTINGS;

        @pmi0("sidebar")
        public static final EventSource SIDEBAR;

        static {
            EventSource eventSource = new EventSource("SETTINGS", 0);
            SETTINGS = eventSource;
            EventSource eventSource2 = new EventSource("SIDEBAR", 1);
            SIDEBAR = eventSource2;
            EventSource eventSource3 = new EventSource("RETRANSLATION_SHEET", 2);
            RETRANSLATION_SHEET = eventSource3;
            EventSource eventSource4 = new EventSource("HELP", 3);
            HELP = eventSource4;
            EventSource eventSource5 = new EventSource("NOTIFICATION_SETTINGS", 4);
            NOTIFICATION_SETTINGS = eventSource5;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3, eventSource4, eventSource5};
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
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("landing_tv_install_click")
        public static final EventType LANDING_TV_INSTALL_CLICK;

        static {
            EventType eventType = new EventType("LANDING_TV_INSTALL_CLICK", 0);
            LANDING_TV_INSTALL_CLICK = eventType;
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

    public MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick(EventType eventType, EventSource eventSource) {
        this.eventType = eventType;
        this.eventSource = eventSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick = (MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick.eventType && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick.eventSource;
    }

    public final int hashCode() {
        return this.eventSource.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoLandingTvInstallClick(eventType=" + this.eventType + ", eventSource=" + this.eventSource + ')';
    }
}
