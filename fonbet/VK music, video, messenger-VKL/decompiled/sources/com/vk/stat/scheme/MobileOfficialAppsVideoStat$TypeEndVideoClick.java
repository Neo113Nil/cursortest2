package com.vk.stat.scheme;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeEndVideoClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add")
        public static final EventType ADD;

        @pmi0(ToolBar.FORWARD)
        public static final EventType FORWARD;

        @pmi0("like")
        public static final EventType LIKE;

        @pmi0("previous")
        public static final EventType PREVIOUS;

        @pmi0("replay")
        public static final EventType REPLAY;

        static {
            EventType eventType = new EventType("FORWARD", 0);
            FORWARD = eventType;
            EventType eventType2 = new EventType("PREVIOUS", 1);
            PREVIOUS = eventType2;
            EventType eventType3 = new EventType("ADD", 2);
            ADD = eventType3;
            EventType eventType4 = new EventType("LIKE", 3);
            LIKE = eventType4;
            EventType eventType5 = new EventType("REPLAY", 4);
            REPLAY = eventType5;
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

    public MobileOfficialAppsVideoStat$TypeEndVideoClick(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeEndVideoClick) && this.eventType == ((MobileOfficialAppsVideoStat$TypeEndVideoClick) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeEndVideoClick(eventType=" + this.eventType + ')';
    }
}
