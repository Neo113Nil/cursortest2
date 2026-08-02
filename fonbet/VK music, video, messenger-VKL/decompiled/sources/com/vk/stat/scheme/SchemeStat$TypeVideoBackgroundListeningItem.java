package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.scheme.SchemeStat$TypeBackgroundItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeVideoBackgroundListeningItem implements SchemeStat$TypeBackgroundItem.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("position_sec")
    private final Integer positionSec;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0(TtmlNode.END)
        public static final EventType END;

        @pmi0("start")
        public static final EventType START;

        static {
            EventType eventType = new EventType("START", 0);
            START = eventType;
            EventType eventType2 = new EventType("END", 1);
            END = eventType2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeVideoBackgroundListeningItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVideoBackgroundListeningItem)) {
            return false;
        }
        SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem = (SchemeStat$TypeVideoBackgroundListeningItem) obj;
        return this.eventType == schemeStat$TypeVideoBackgroundListeningItem.eventType && epx.f(this.positionSec, schemeStat$TypeVideoBackgroundListeningItem.positionSec);
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        Integer num = this.positionSec;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoBackgroundListeningItem(eventType=");
        sb.append(this.eventType);
        sb.append(", positionSec=");
        return uqi.b(sb, this.positionSec, ')');
    }

    public SchemeStat$TypeVideoBackgroundListeningItem(EventType eventType, Integer num) {
        this.eventType = eventType;
        this.positionSec = num;
    }

    public /* synthetic */ SchemeStat$TypeVideoBackgroundListeningItem(EventType eventType, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : num);
    }
}
