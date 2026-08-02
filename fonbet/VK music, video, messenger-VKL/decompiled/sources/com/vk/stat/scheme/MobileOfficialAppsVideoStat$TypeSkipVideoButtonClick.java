package com.vk.stat.scheme;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick implements SchemeStat$TypeClick.b {

    @pmi0("destination_item")
    private final CommonStat$TypeCommonEventItem destinationItem;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0(ToolBar.FORWARD)
        public static final EventSubtype FORWARD;

        @pmi0("previous")
        public static final EventSubtype PREVIOUS;

        static {
            EventSubtype eventSubtype = new EventSubtype("PREVIOUS", 0);
            PREVIOUS = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("FORWARD", 1);
            FORWARD = eventSubtype2;
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

    public MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick(EventSubtype eventSubtype, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventSubtype = eventSubtype;
        this.destinationItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick = (MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick) obj;
        return this.eventSubtype == mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick.eventSubtype && epx.f(this.destinationItem, mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick.destinationItem);
    }

    public final int hashCode() {
        return this.destinationItem.hashCode() + (this.eventSubtype.hashCode() * 31);
    }

    public final String toString() {
        return "TypeSkipVideoButtonClick(eventSubtype=" + this.eventSubtype + ", destinationItem=" + this.destinationItem + ')';
    }
}
