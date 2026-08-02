package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeDonutBanner implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("donut_banner_hide")
        public static final EventType DONUT_BANNER_HIDE;

        @pmi0("donut_banner_view")
        public static final EventType DONUT_BANNER_VIEW;

        static {
            EventType eventType = new EventType("DONUT_BANNER_VIEW", 0);
            DONUT_BANNER_VIEW = eventType;
            EventType eventType2 = new EventType("DONUT_BANNER_HIDE", 1);
            DONUT_BANNER_HIDE = eventType2;
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

    public CommonCommunitiesStat$TypeDonutBanner(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeDonutBanner) && this.eventType == ((CommonCommunitiesStat$TypeDonutBanner) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeDonutBanner(eventType=" + this.eventType + ')';
    }
}
