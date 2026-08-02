package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoCardEvent implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen_mode")
    private final CommonVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click")
        public static final EventType CLICK;

        @pmi0("show")
        public static final EventType SHOW;

        static {
            EventType eventType = new EventType("SHOW", 0);
            SHOW = eventType;
            EventType eventType2 = new EventType("CLICK", 1);
            CLICK = eventType2;
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

    public CommonVideoStat$TypeVideoCardEvent(EventType eventType, CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.screenMode = commonVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoCardEvent)) {
            return false;
        }
        CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = (CommonVideoStat$TypeVideoCardEvent) obj;
        return this.eventType == commonVideoStat$TypeVideoCardEvent.eventType && this.screenMode == commonVideoStat$TypeVideoCardEvent.screenMode;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode = this.screenMode;
        return hashCode + (commonVideoStat$TypeScreenMode == null ? 0 : commonVideoStat$TypeScreenMode.hashCode());
    }

    public final String toString() {
        return "TypeVideoCardEvent(eventType=" + this.eventType + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoCardEvent(EventType eventType, CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : commonVideoStat$TypeScreenMode);
    }
}
