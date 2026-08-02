package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("section_id")
    private final CommonStat$TypeTrackCodeItem sectionId;

    @pmi0("tab_position")
    private final Integer tabPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_tab")
        public static final EventType CLICK_TAB;

        @pmi0("show_tab")
        public static final EventType SHOW_TAB;

        static {
            EventType eventType = new EventType("SHOW_TAB", 0);
            SHOW_TAB = eventType;
            EventType eventType2 = new EventType("CLICK_TAB", 1);
            CLICK_TAB = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction(EventType eventType, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Integer num) {
        this.eventType = eventType;
        this.sectionId = commonStat$TypeTrackCodeItem;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.tabPosition = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction = (MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.eventType && epx.f(this.sectionId, mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.sectionId) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.screenMode && epx.f(this.tabPosition, mobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.tabPosition);
    }

    public final int hashCode() {
        int hashCode = (this.screenMode.hashCode() + urd0.a(this.eventType.hashCode() * 31, 31, this.sectionId.a)) * 31;
        Integer num = this.tabPosition;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoDiscoveryTabsAction(eventType=");
        sb.append(this.eventType);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", screenMode=");
        sb.append(this.screenMode);
        sb.append(", tabPosition=");
        return uqi.b(sb, this.tabPosition, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction(EventType eventType, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Integer num, int i, zcl zclVar) {
        this(eventType, commonStat$TypeTrackCodeItem, mobileOfficialAppsVideoStat$TypeScreenMode, (i & 8) != 0 ? null : num);
    }
}
