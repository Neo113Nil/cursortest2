package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeVideoMiniplayerItem implements SchemeStat$TypeClick.b {

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

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventType CLOSE;

        @pmi0("open")
        public static final EventType OPEN;

        @pmi0("open_on_cold_start")
        public static final EventType OPEN_ON_COLD_START;

        @pmi0("open_on_start")
        public static final EventType OPEN_ON_START;

        @pmi0("restore")
        public static final EventType RESTORE;

        static {
            EventType eventType = new EventType("OPEN", 0);
            OPEN = eventType;
            EventType eventType2 = new EventType("OPEN_ON_START", 1);
            OPEN_ON_START = eventType2;
            EventType eventType3 = new EventType("OPEN_ON_COLD_START", 2);
            OPEN_ON_COLD_START = eventType3;
            EventType eventType4 = new EventType("CLOSE", 3);
            CLOSE = eventType4;
            EventType eventType5 = new EventType("RESTORE", 4);
            RESTORE = eventType5;
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

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeVideoMiniplayerItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVideoMiniplayerItem)) {
            return false;
        }
        SchemeStat$TypeVideoMiniplayerItem schemeStat$TypeVideoMiniplayerItem = (SchemeStat$TypeVideoMiniplayerItem) obj;
        return this.eventType == schemeStat$TypeVideoMiniplayerItem.eventType && epx.f(this.positionSec, schemeStat$TypeVideoMiniplayerItem.positionSec);
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        Integer num = this.positionSec;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoMiniplayerItem(eventType=");
        sb.append(this.eventType);
        sb.append(", positionSec=");
        return uqi.b(sb, this.positionSec, ')');
    }

    public SchemeStat$TypeVideoMiniplayerItem(EventType eventType, Integer num) {
        this.eventType = eventType;
        this.positionSec = num;
    }

    public /* synthetic */ SchemeStat$TypeVideoMiniplayerItem(EventType eventType, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : num);
    }
}
