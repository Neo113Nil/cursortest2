package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick implements SchemeStat$TypeClick.b {

    @pmi0("event_source")
    private final EventSource eventSource;

    @pmi0("event_subtype")
    private final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;

        @pmi0("anywhere")
        public static final EventSource ANYWHERE;

        @pmi0("cross")
        public static final EventSource CROSS;

        @pmi0("timeout")
        public static final EventSource TIMEOUT;

        static {
            EventSource eventSource = new EventSource("CROSS", 0);
            CROSS = eventSource;
            EventSource eventSource2 = new EventSource("TIMEOUT", 1);
            TIMEOUT = eventSource2;
            EventSource eventSource3 = new EventSource("ANYWHERE", 2);
            ANYWHERE = eventSource3;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3};
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

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventType CLOSE;

        @pmi0("conditions")
        public static final EventType CONDITIONS;

        @pmi0("subscribe")
        public static final EventType SUBSCRIBE;

        static {
            EventType eventType = new EventType("SUBSCRIBE", 0);
            SUBSCRIBE = eventType;
            EventType eventType2 = new EventType("CLOSE", 1);
            CLOSE = eventType2;
            EventType eventType3 = new EventType("CONDITIONS", 2);
            CONDITIONS = eventType3;
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

    public MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick(EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, EventSource eventSource, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.eventSubtype = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
        this.eventSource = eventSource;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick = (MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.eventSubtype && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.eventSource && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.screenMode;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi = this.eventSubtype;
        int hashCode2 = (hashCode + (mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.hashCode())) * 31;
        EventSource eventSource = this.eventSource;
        int hashCode3 = (hashCode2 + (eventSource == null ? 0 : eventSource.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode3 + (mobileOfficialAppsVideoStat$TypeScreenMode != null ? mobileOfficialAppsVideoStat$TypeScreenMode.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoAdSubscriptionOfferClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", eventSource=" + this.eventSource + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick(EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, EventSource eventSource, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, (i & 4) != 0 ? null : eventSource, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}
