package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick implements SchemeStat$TypeClick.b {

    @pmi0("event_source")
    private final EventSource eventSource;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;

        @pmi0("anywhere")
        public static final EventSource ANYWHERE;

        @pmi0("button")
        public static final EventSource BUTTON;

        static {
            EventSource eventSource = new EventSource("BUTTON", 0);
            BUTTON = eventSource;
            EventSource eventSource2 = new EventSource("ANYWHERE", 1);
            ANYWHERE = eventSource2;
            EventSource[] eventSourceArr = {eventSource, eventSource2};
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
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("button")
        public static final EventSubtype BUTTON;

        @pmi0("popup")
        public static final EventSubtype POPUP;

        static {
            EventSubtype eventSubtype = new EventSubtype("BUTTON", 0);
            BUTTON = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("POPUP", 1);
            POPUP = eventSubtype2;
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

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventType CLOSE;

        @pmi0("open_popup")
        public static final EventType OPEN_POPUP;

        static {
            EventType eventType = new EventType("OPEN_POPUP", 0);
            OPEN_POPUP = eventType;
            EventType eventType2 = new EventType("CLOSE", 1);
            CLOSE = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick(EventType eventType, EventSubtype eventSubtype, EventSource eventSource) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.eventSource = eventSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick = (MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick.eventSubtype && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick.eventSource;
    }

    public final int hashCode() {
        int hashCode = (this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        EventSource eventSource = this.eventSource;
        return hashCode + (eventSource == null ? 0 : eventSource.hashCode());
    }

    public final String toString() {
        return "TypeVideoInfoAboutDrugClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", eventSource=" + this.eventSource + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick(EventType eventType, EventSubtype eventSubtype, EventSource eventSource, int i, zcl zclVar) {
        this(eventType, eventSubtype, (i & 4) != 0 ? null : eventSource);
    }
}
