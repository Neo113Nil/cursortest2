package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeNextPrevVideoButtonTap implements SchemeStat$TypeClick.b {

    @pmi0("context_place")
    private final ContextPlace contextPlace;

    @pmi0("destination_item")
    private final CommonStat$TypeCommonEventItem destinationItem;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class ContextPlace {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContextPlace[] $VALUES;

        @pmi0("remote_button")
        public static final ContextPlace REMOTE_BUTTON;

        static {
            ContextPlace contextPlace = new ContextPlace("REMOTE_BUTTON", 0);
            REMOTE_BUTTON = contextPlace;
            ContextPlace[] contextPlaceArr = {contextPlace};
            $VALUES = contextPlaceArr;
            $ENTRIES = new asp(contextPlaceArr);
        }

        private ContextPlace(String str, int i) {
        }

        public static ContextPlace valueOf(String str) {
            return (ContextPlace) Enum.valueOf(ContextPlace.class, str);
        }

        public static ContextPlace[] values() {
            return (ContextPlace[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("next")
        public static final EventSubtype NEXT;

        @pmi0("prev")
        public static final EventSubtype PREV;

        static {
            EventSubtype eventSubtype = new EventSubtype("PREV", 0);
            PREV = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("NEXT", 1);
            NEXT = eventSubtype2;
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

    public CommonVideoStat$TypeNextPrevVideoButtonTap(EventSubtype eventSubtype, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, ContextPlace contextPlace) {
        this.eventSubtype = eventSubtype;
        this.destinationItem = commonStat$TypeCommonEventItem;
        this.contextPlace = contextPlace;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeNextPrevVideoButtonTap)) {
            return false;
        }
        CommonVideoStat$TypeNextPrevVideoButtonTap commonVideoStat$TypeNextPrevVideoButtonTap = (CommonVideoStat$TypeNextPrevVideoButtonTap) obj;
        return this.eventSubtype == commonVideoStat$TypeNextPrevVideoButtonTap.eventSubtype && epx.f(this.destinationItem, commonVideoStat$TypeNextPrevVideoButtonTap.destinationItem) && this.contextPlace == commonVideoStat$TypeNextPrevVideoButtonTap.contextPlace;
    }

    public final int hashCode() {
        int hashCode = (this.destinationItem.hashCode() + (this.eventSubtype.hashCode() * 31)) * 31;
        ContextPlace contextPlace = this.contextPlace;
        return hashCode + (contextPlace == null ? 0 : contextPlace.hashCode());
    }

    public final String toString() {
        return "TypeNextPrevVideoButtonTap(eventSubtype=" + this.eventSubtype + ", destinationItem=" + this.destinationItem + ", contextPlace=" + this.contextPlace + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeNextPrevVideoButtonTap(EventSubtype eventSubtype, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, ContextPlace contextPlace, int i, zcl zclVar) {
        this(eventSubtype, commonStat$TypeCommonEventItem, (i & 4) != 0 ? null : contextPlace);
    }
}
