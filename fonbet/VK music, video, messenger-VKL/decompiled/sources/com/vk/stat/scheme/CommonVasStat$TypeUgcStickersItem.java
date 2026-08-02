package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVasStat.kt */
/* loaded from: classes5.dex */
public final class CommonVasStat$TypeUgcStickersItem implements SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("pack_id")
    private final Integer packId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVasStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("pack_ban_ok")
        public static final EventType PACK_BAN_OK;

        @pmi0("pack_ban_show")
        public static final EventType PACK_BAN_SHOW;

        static {
            EventType eventType = new EventType("PACK_BAN_SHOW", 0);
            PACK_BAN_SHOW = eventType;
            EventType eventType2 = new EventType("PACK_BAN_OK", 1);
            PACK_BAN_OK = eventType2;
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

    public CommonVasStat$TypeUgcStickersItem(EventType eventType, Long l, Integer num) {
        this.eventType = eventType;
        this.ownerId = l;
        this.packId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVasStat$TypeUgcStickersItem)) {
            return false;
        }
        CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem = (CommonVasStat$TypeUgcStickersItem) obj;
        return this.eventType == commonVasStat$TypeUgcStickersItem.eventType && epx.f(this.ownerId, commonVasStat$TypeUgcStickersItem.ownerId) && epx.f(this.packId, commonVasStat$TypeUgcStickersItem.packId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.packId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeUgcStickersItem(eventType=");
        sb.append(this.eventType);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", packId=");
        return uqi.b(sb, this.packId, ')');
    }

    public /* synthetic */ CommonVasStat$TypeUgcStickersItem(EventType eventType, Long l, Integer num, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num);
    }
}
