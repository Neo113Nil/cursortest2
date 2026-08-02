package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem implements CommonCommunitiesStat$TypeCommunitiesClick.b {

    @pmi0("block_type")
    private final BlockType blockType;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
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
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("click_community_trust_marks")
        public static final Event CLICK_COMMUNITY_TRUST_MARKS;

        static {
            Event event = new Event("CLICK_COMMUNITY_TRUST_MARKS", 0);
            CLICK_COMMUNITY_TRUST_MARKS = event;
            Event[] eventArr = {event};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem(Event event, BlockType blockType) {
        this.event = event;
        this.blockType = blockType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem = (CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem) obj;
        return this.event == commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.event && this.blockType == commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.blockType;
    }

    public final int hashCode() {
        return this.blockType.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        return "TypeCommunitiesTrustMarksClickItem(event=" + this.event + ", blockType=" + this.blockType + ')';
    }
}
