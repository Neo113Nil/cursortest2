package com.vk.stat.scheme;

import com.ironsource.C4572u;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStickersStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("slot_id")
    private final int slotId;

    @pmi0("success")
    private final Boolean success;

    @pmi0("type_id")
    private final TypeId typeId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStickersStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("display")
        public static final EventType DISPLAY;

        @pmi0("load")
        public static final EventType LOAD;

        @pmi0("no_ad")
        public static final EventType NO_AD;

        @pmi0(C4572u.j)
        public static final EventType REWARD;

        static {
            EventType eventType = new EventType("NO_AD", 0);
            NO_AD = eventType;
            EventType eventType2 = new EventType("LOAD", 1);
            LOAD = eventType2;
            EventType eventType3 = new EventType("DISPLAY", 2);
            DISPLAY = eventType3;
            EventType eventType4 = new EventType("REWARD", 3);
            REWARD = eventType4;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStickersStat.kt */
    public static final class TypeId {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeId[] $VALUES;

        @pmi0("gifts")
        public static final TypeId GIFTS;

        static {
            TypeId typeId = new TypeId("GIFTS", 0);
            GIFTS = typeId;
            TypeId[] typeIdArr = {typeId};
            $VALUES = typeIdArr;
            $ENTRIES = new asp(typeIdArr);
        }

        private TypeId(String str, int i) {
        }

        public static TypeId valueOf(String str) {
            return (TypeId) Enum.valueOf(TypeId.class, str);
        }

        public static TypeId[] values() {
            return (TypeId[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem(int i, TypeId typeId, Boolean bool, EventType eventType) {
        this.slotId = i;
        this.typeId = typeId;
        this.success = bool;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem)) {
            return false;
        }
        MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem = (MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem) obj;
        return this.slotId == mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem.slotId && this.typeId == mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem.typeId && epx.f(this.success, mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem.success) && this.eventType == mobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem.eventType;
    }

    public final int hashCode() {
        int hashCode = (this.typeId.hashCode() + (Integer.hashCode(this.slotId) * 31)) * 31;
        Boolean bool = this.success;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        EventType eventType = this.eventType;
        return hashCode2 + (eventType != null ? eventType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeRewardedAdsShowActionItem(slotId=" + this.slotId + ", typeId=" + this.typeId + ", success=" + this.success + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ MobileOfficialAppsStickersStat$TypeRewardedAdsShowActionItem(int i, TypeId typeId, Boolean bool, EventType eventType, int i2, zcl zclVar) {
        this(i, typeId, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : eventType);
    }
}
