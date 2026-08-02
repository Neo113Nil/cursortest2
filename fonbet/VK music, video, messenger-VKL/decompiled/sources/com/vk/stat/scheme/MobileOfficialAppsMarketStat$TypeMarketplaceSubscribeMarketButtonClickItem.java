package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceBlock block;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("subscribe")
        public static final EventType SUBSCRIBE;

        @pmi0("unsubscribe")
        public static final EventType UNSUBSCRIBE;

        static {
            EventType eventType = new EventType("SUBSCRIBE", 0);
            SUBSCRIBE = eventType;
            EventType eventType2 = new EventType("UNSUBSCRIBE", 1);
            UNSUBSCRIBE = eventType2;
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
    public MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem = (MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem) obj;
        return epx.f(this.block, mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.block) && this.eventType == mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.eventType;
    }

    public final int hashCode() {
        MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock = this.block;
        int hashCode = (mobileOfficialAppsMarketStat$TypeMarketplaceBlock == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceBlock.hashCode()) * 31;
        EventType eventType = this.eventType;
        return hashCode + (eventType != null ? eventType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketplaceSubscribeMarketButtonClickItem(block=" + this.block + ", eventType=" + this.eventType + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem(MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock, EventType eventType) {
        this.block = mobileOfficialAppsMarketStat$TypeMarketplaceBlock;
        this.eventType = eventType;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem(MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock, EventType eventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceBlock, (i & 2) != 0 ? null : eventType);
    }
}
