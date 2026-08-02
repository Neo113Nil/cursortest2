package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypePageShow implements SchemeStat$TypeView.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("page_show")
        public static final EventType PAGE_SHOW;

        static {
            EventType eventType = new EventType("PAGE_SHOW", 0);
            PAGE_SHOW = eventType;
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

    public CommonVideoStat$TypePageShow(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonVideoStat$TypePageShow) && this.eventType == ((CommonVideoStat$TypePageShow) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypePageShow(eventType=" + this.eventType + ')';
    }
}
