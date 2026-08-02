package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeScreencastCodeAction implements SchemeStat$TypeAction.b {

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

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

        @pmi0("cross_click")
        public static final EventSubtype CROSS_CLICK;

        @pmi0("hide_swipe")
        public static final EventSubtype HIDE_SWIPE;

        static {
            EventSubtype eventSubtype = new EventSubtype("HIDE_SWIPE", 0);
            HIDE_SWIPE = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("CROSS_CLICK", 1);
            CROSS_CLICK = eventSubtype2;
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

        @pmi0("cast_code_input_start")
        public static final EventType CAST_CODE_INPUT_START;

        @pmi0("cast_code_invalid_error")
        public static final EventType CAST_CODE_INVALID_ERROR;

        @pmi0("cast_code_modal_close")
        public static final EventType CAST_CODE_MODAL_CLOSE;

        @pmi0("cast_code_modal_open")
        public static final EventType CAST_CODE_MODAL_OPEN;

        @pmi0("cast_code_submit")
        public static final EventType CAST_CODE_SUBMIT;

        static {
            EventType eventType = new EventType("CAST_CODE_MODAL_OPEN", 0);
            CAST_CODE_MODAL_OPEN = eventType;
            EventType eventType2 = new EventType("CAST_CODE_MODAL_CLOSE", 1);
            CAST_CODE_MODAL_CLOSE = eventType2;
            EventType eventType3 = new EventType("CAST_CODE_INPUT_START", 2);
            CAST_CODE_INPUT_START = eventType3;
            EventType eventType4 = new EventType("CAST_CODE_SUBMIT", 3);
            CAST_CODE_SUBMIT = eventType4;
            EventType eventType5 = new EventType("CAST_CODE_INVALID_ERROR", 4);
            CAST_CODE_INVALID_ERROR = eventType5;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
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

    public MobileOfficialAppsVideoStat$TypeScreencastCodeAction(EventType eventType, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeScreencastCodeAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeScreencastCodeAction mobileOfficialAppsVideoStat$TypeScreencastCodeAction = (MobileOfficialAppsVideoStat$TypeScreencastCodeAction) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeScreencastCodeAction.eventType && this.eventSource == mobileOfficialAppsVideoStat$TypeScreencastCodeAction.eventSource && this.eventSubtype == mobileOfficialAppsVideoStat$TypeScreencastCodeAction.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.eventSource;
        int hashCode2 = (hashCode + (mobileOfficialAppsVideoStat$VideoEventSource == null ? 0 : mobileOfficialAppsVideoStat$VideoEventSource.hashCode())) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode2 + (eventSubtype != null ? eventSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "TypeScreencastCodeAction(eventType=" + this.eventType + ", eventSource=" + this.eventSource + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeScreencastCodeAction(EventType eventType, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource, (i & 4) != 0 ? null : eventSubtype);
    }
}
