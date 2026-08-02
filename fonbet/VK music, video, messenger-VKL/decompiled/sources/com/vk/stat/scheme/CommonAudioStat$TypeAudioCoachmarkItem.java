package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.onelog.UploadService;
import xsna.asp;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioCoachmarkItem implements SchemeStat$TypeAction.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("item_id")
    private final int itemId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("accept")
        public static final EventSubtype ACCEPT;

        @pmi0("next")
        public static final EventSubtype NEXT;

        @pmi0("tap_cross")
        public static final EventSubtype TAP_CROSS;

        @pmi0("tap_out")
        public static final EventSubtype TAP_OUT;

        @pmi0("timeout")
        public static final EventSubtype TIMEOUT;

        @pmi0(UploadService.EXTRA_TRIGGER)
        public static final EventSubtype TRIGGER;

        static {
            EventSubtype eventSubtype = new EventSubtype("TRIGGER", 0);
            TRIGGER = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("TIMEOUT", 1);
            TIMEOUT = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("TAP_CROSS", 2);
            TAP_CROSS = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("TAP_OUT", 3);
            TAP_OUT = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("NEXT", 4);
            NEXT = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("ACCEPT", 5);
            ACCEPT = eventSubtype6;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6};
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
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("button")
        public static final EventType BUTTON;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventType CLOSE;

        @pmi0("show")
        public static final EventType SHOW;

        @pmi0("target")
        public static final EventType TARGET;

        static {
            EventType eventType = new EventType("SHOW", 0);
            SHOW = eventType;
            EventType eventType2 = new EventType("CLOSE", 1);
            CLOSE = eventType2;
            EventType eventType3 = new EventType("TARGET", 2);
            TARGET = eventType3;
            EventType eventType4 = new EventType("BUTTON", 3);
            BUTTON = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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

    public CommonAudioStat$TypeAudioCoachmarkItem(EventType eventType, int i, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.itemId = i;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioCoachmarkItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioCoachmarkItem commonAudioStat$TypeAudioCoachmarkItem = (CommonAudioStat$TypeAudioCoachmarkItem) obj;
        return this.eventType == commonAudioStat$TypeAudioCoachmarkItem.eventType && this.itemId == commonAudioStat$TypeAudioCoachmarkItem.itemId && this.eventSubtype == commonAudioStat$TypeAudioCoachmarkItem.eventSubtype;
    }

    public final int hashCode() {
        int a = shy.a(this.itemId, this.eventType.hashCode() * 31, 31);
        EventSubtype eventSubtype = this.eventSubtype;
        return a + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeAudioCoachmarkItem(eventType=" + this.eventType + ", itemId=" + this.itemId + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioCoachmarkItem(EventType eventType, int i, EventSubtype eventSubtype, int i2, zcl zclVar) {
        this(eventType, i, (i2 & 4) != 0 ? null : eventSubtype);
    }
}
