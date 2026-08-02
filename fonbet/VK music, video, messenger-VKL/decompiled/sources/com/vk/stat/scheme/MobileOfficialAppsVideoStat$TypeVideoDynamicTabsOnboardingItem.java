package com.vk.stat.scheme;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem implements SchemeStat$TypeAction.b {

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

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventSubtype VIEW;

        static {
            EventSubtype eventSubtype = new EventSubtype("VIEW", 0);
            VIEW = eventSubtype;
            EventSubtype[] eventSubtypeArr = {eventSubtype};
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

        @pmi0("onboarding_dynamic_tabs_doc2doc")
        public static final EventType ONBOARDING_DYNAMIC_TABS_DOC2DOC;

        static {
            EventType eventType = new EventType("ONBOARDING_DYNAMIC_TABS_DOC2DOC", 0);
            ONBOARDING_DYNAMIC_TABS_DOC2DOC = eventType;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem = (MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem.eventSubtype;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype != null ? eventSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoDynamicTabsOnboardingItem(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoDynamicTabsOnboardingItem(EventType eventType, EventSubtype eventSubtype, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : eventSubtype);
    }
}
