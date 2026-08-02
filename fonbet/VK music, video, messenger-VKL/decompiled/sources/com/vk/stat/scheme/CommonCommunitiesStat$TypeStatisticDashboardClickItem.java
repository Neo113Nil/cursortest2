package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeStatisticDashboardClickItem implements CommonCommunitiesStat$TypeCommunitiesClick.b {

    @pmi0("block_type")
    private final CommonCommunitiesStat$TypeStatisticDashboardBlockType blockType;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("event_data")
    private final CommonCommunitiesStat$TypeStatisticDashboardEventData eventData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("statistic_dashboard_export_click")
        public static final Event STATISTIC_DASHBOARD_EXPORT_CLICK;

        @pmi0("statistic_dashboard_open")
        public static final Event STATISTIC_DASHBOARD_OPEN;

        static {
            Event event = new Event("STATISTIC_DASHBOARD_OPEN", 0);
            STATISTIC_DASHBOARD_OPEN = event;
            Event event2 = new Event("STATISTIC_DASHBOARD_EXPORT_CLICK", 1);
            STATISTIC_DASHBOARD_EXPORT_CLICK = event2;
            Event[] eventArr = {event, event2};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$TypeStatisticDashboardClickItem(Event event, CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType, CommonCommunitiesStat$TypeStatisticDashboardEventData commonCommunitiesStat$TypeStatisticDashboardEventData) {
        this.event = event;
        this.blockType = commonCommunitiesStat$TypeStatisticDashboardBlockType;
        this.eventData = commonCommunitiesStat$TypeStatisticDashboardEventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeStatisticDashboardClickItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeStatisticDashboardClickItem commonCommunitiesStat$TypeStatisticDashboardClickItem = (CommonCommunitiesStat$TypeStatisticDashboardClickItem) obj;
        return this.event == commonCommunitiesStat$TypeStatisticDashboardClickItem.event && this.blockType == commonCommunitiesStat$TypeStatisticDashboardClickItem.blockType && this.eventData == commonCommunitiesStat$TypeStatisticDashboardClickItem.eventData;
    }

    public final int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType = this.blockType;
        int hashCode2 = (hashCode + (commonCommunitiesStat$TypeStatisticDashboardBlockType == null ? 0 : commonCommunitiesStat$TypeStatisticDashboardBlockType.hashCode())) * 31;
        CommonCommunitiesStat$TypeStatisticDashboardEventData commonCommunitiesStat$TypeStatisticDashboardEventData = this.eventData;
        return hashCode2 + (commonCommunitiesStat$TypeStatisticDashboardEventData != null ? commonCommunitiesStat$TypeStatisticDashboardEventData.hashCode() : 0);
    }

    public final String toString() {
        return "TypeStatisticDashboardClickItem(event=" + this.event + ", blockType=" + this.blockType + ", eventData=" + this.eventData + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeStatisticDashboardClickItem(Event event, CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType, CommonCommunitiesStat$TypeStatisticDashboardEventData commonCommunitiesStat$TypeStatisticDashboardEventData, int i, zcl zclVar) {
        this(event, (i & 2) != 0 ? null : commonCommunitiesStat$TypeStatisticDashboardBlockType, (i & 4) != 0 ? null : commonCommunitiesStat$TypeStatisticDashboardEventData);
    }
}
