package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block_type")
    private final BlockType blockType;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class BlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockType[] $VALUES;

        @pmi0("external_integration")
        public static final BlockType EXTERNAL_INTEGRATION;

        @pmi0("free_delivery")
        public static final BlockType FREE_DELIVERY;

        @pmi0("friends_trust_mark")
        public static final BlockType FRIENDS_TRUST_MARK;

        @pmi0("has_derlivery")
        public static final BlockType HAS_DERLIVERY;

        @pmi0("many_years_in_vk")
        public static final BlockType MANY_YEARS_IN_VK;

        @pmi0("popular_shop")
        public static final BlockType POPULAR_SHOP;

        @pmi0("purchase_info")
        public static final BlockType PURCHASE_INFO;

        @pmi0("self_delivery")
        public static final BlockType SELF_DELIVERY;

        @pmi0("verified_business")
        public static final BlockType VERIFIED_BUSINESS;

        @pmi0("yc_integration")
        public static final BlockType YC_INTEGRATION;

        static {
            BlockType blockType = new BlockType("POPULAR_SHOP", 0);
            POPULAR_SHOP = blockType;
            BlockType blockType2 = new BlockType("FRIENDS_TRUST_MARK", 1);
            FRIENDS_TRUST_MARK = blockType2;
            BlockType blockType3 = new BlockType("VERIFIED_BUSINESS", 2);
            VERIFIED_BUSINESS = blockType3;
            BlockType blockType4 = new BlockType("EXTERNAL_INTEGRATION", 3);
            EXTERNAL_INTEGRATION = blockType4;
            BlockType blockType5 = new BlockType("YC_INTEGRATION", 4);
            YC_INTEGRATION = blockType5;
            BlockType blockType6 = new BlockType("FREE_DELIVERY", 5);
            FREE_DELIVERY = blockType6;
            BlockType blockType7 = new BlockType("SELF_DELIVERY", 6);
            SELF_DELIVERY = blockType7;
            BlockType blockType8 = new BlockType("HAS_DERLIVERY", 7);
            HAS_DERLIVERY = blockType8;
            BlockType blockType9 = new BlockType("PURCHASE_INFO", 8);
            PURCHASE_INFO = blockType9;
            BlockType blockType10 = new BlockType("MANY_YEARS_IN_VK", 9);
            MANY_YEARS_IN_VK = blockType10;
            BlockType[] blockTypeArr = {blockType, blockType2, blockType3, blockType4, blockType5, blockType6, blockType7, blockType8, blockType9, blockType10};
            $VALUES = blockTypeArr;
            $ENTRIES = new asp(blockTypeArr);
        }

        private BlockType(String str, int i) {
        }

        public static BlockType valueOf(String str) {
            return (BlockType) Enum.valueOf(BlockType.class, str);
        }

        public static BlockType[] values() {
            return (BlockType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("block_type")
        public static final EventType BLOCK_TYPE;

        @pmi0("open_community_goods")
        public static final EventType OPEN_COMMUNITY_GOODS;

        @pmi0("open_community_service_goods")
        public static final EventType OPEN_COMMUNITY_SERVICE_GOODS;

        @pmi0("open_discovery_feed")
        public static final EventType OPEN_DISCOVERY_FEED;

        @pmi0("open_moderation_rejected_section")
        public static final EventType OPEN_MODERATION_REJECTED_SECTION;

        @pmi0("open_not_in_marketplace_section")
        public static final EventType OPEN_NOT_IN_MARKETPLACE_SECTION;

        static {
            EventType eventType = new EventType("OPEN_MODERATION_REJECTED_SECTION", 0);
            OPEN_MODERATION_REJECTED_SECTION = eventType;
            EventType eventType2 = new EventType("OPEN_NOT_IN_MARKETPLACE_SECTION", 1);
            OPEN_NOT_IN_MARKETPLACE_SECTION = eventType2;
            EventType eventType3 = new EventType("OPEN_COMMUNITY_GOODS", 2);
            OPEN_COMMUNITY_GOODS = eventType3;
            EventType eventType4 = new EventType("OPEN_COMMUNITY_SERVICE_GOODS", 3);
            OPEN_COMMUNITY_SERVICE_GOODS = eventType4;
            EventType eventType5 = new EventType("OPEN_DISCOVERY_FEED", 4);
            OPEN_DISCOVERY_FEED = eventType5;
            EventType eventType6 = new EventType("BLOCK_TYPE", 5);
            BLOCK_TYPE = eventType6;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6};
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
    public MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem = (MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem) obj;
        return this.eventType == mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.eventType && this.blockType == mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.blockType;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        BlockType blockType = this.blockType;
        return hashCode + (blockType != null ? blockType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketOpenSectionClickItem(eventType=" + this.eventType + ", blockType=" + this.blockType + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem(EventType eventType, BlockType blockType) {
        this.eventType = eventType;
        this.blockType = blockType;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem(EventType eventType, BlockType blockType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : blockType);
    }
}
