package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeNextVideoAnnouncement implements SchemeStat$TypeClick.b {

    @pmi0("destination_item")
    private final CommonStat$TypeCommonEventItem destinationItem;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("auto")
        public static final EventSubtype AUTO;

        @pmi0("cancel")
        public static final EventSubtype CANCEL;

        @pmi0("click")
        public static final EventSubtype CLICK;

        @pmi0("show")
        public static final EventSubtype SHOW;

        static {
            EventSubtype eventSubtype = new EventSubtype("CLICK", 0);
            CLICK = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("CANCEL", 1);
            CANCEL = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("AUTO", 2);
            AUTO = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("SHOW", 3);
            SHOW = eventSubtype4;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4};
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

    public CommonVideoStat$TypeNextVideoAnnouncement(EventSubtype eventSubtype, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventSubtype = eventSubtype;
        this.destinationItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeNextVideoAnnouncement)) {
            return false;
        }
        CommonVideoStat$TypeNextVideoAnnouncement commonVideoStat$TypeNextVideoAnnouncement = (CommonVideoStat$TypeNextVideoAnnouncement) obj;
        return this.eventSubtype == commonVideoStat$TypeNextVideoAnnouncement.eventSubtype && epx.f(this.destinationItem, commonVideoStat$TypeNextVideoAnnouncement.destinationItem);
    }

    public final int hashCode() {
        return this.destinationItem.hashCode() + (this.eventSubtype.hashCode() * 31);
    }

    public final String toString() {
        return "TypeNextVideoAnnouncement(eventSubtype=" + this.eventSubtype + ", destinationItem=" + this.destinationItem + ')';
    }
}
