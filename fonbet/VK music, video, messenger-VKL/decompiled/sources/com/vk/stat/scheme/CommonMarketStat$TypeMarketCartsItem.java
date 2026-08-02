package com.vk.stat.scheme;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketCartsItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("delivery_point_external_id")
    private final String deliveryPointExternalId;

    @pmi0("delivery_point_group_id")
    private final Integer deliveryPointGroupId;

    @pmi0("delivery_point_id")
    private final Integer deliveryPointId;

    @pmi0("delivery_point_partner_id")
    private final Integer deliveryPointPartnerId;

    @pmi0("event_name")
    private final EventName eventName;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("item_id")
    private final Integer itemId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class EventName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventName[] $VALUES;

        @pmi0("add_item_to_cart")
        public static final EventName ADD_ITEM_TO_CART;

        @pmi0("change_item_variant")
        public static final EventName CHANGE_ITEM_VARIANT;

        @pmi0("clear_cart")
        public static final EventName CLEAR_CART;

        @pmi0("open_chat_with_owner")
        public static final EventName OPEN_CHAT_WITH_OWNER;

        @pmi0("open_chat_with_owner_2")
        public static final EventName OPEN_CHAT_WITH_OWNER_2;

        @pmi0("open_delivery_point_info")
        public static final EventName OPEN_DELIVERY_POINT_INFO;

        @pmi0("remove_item_from_cart")
        public static final EventName REMOVE_ITEM_FROM_CART;

        @pmi0("select_delivery_point")
        public static final EventName SELECT_DELIVERY_POINT;

        @pmi0("send_message_to_owner")
        public static final EventName SEND_MESSAGE_TO_OWNER;

        @pmi0("send_message_to_owner_2")
        public static final EventName SEND_MESSAGE_TO_OWNER_2;

        @pmi0("set_item_amount")
        public static final EventName SET_ITEM_AMOUNT;

        @pmi0("transition_to_cart")
        public static final EventName TRANSITION_TO_CART;

        @pmi0("transition_to_carts_list")
        public static final EventName TRANSITION_TO_CARTS_LIST;

        @pmi0("transition_to_checkout")
        public static final EventName TRANSITION_TO_CHECKOUT;

        @pmi0("transition_to_select_delivery_point")
        public static final EventName TRANSITION_TO_SELECT_DELIVERY_POINT;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventName VIEW;

        static {
            EventName eventName = new EventName("TRANSITION_TO_CART", 0);
            TRANSITION_TO_CART = eventName;
            EventName eventName2 = new EventName("TRANSITION_TO_CHECKOUT", 1);
            TRANSITION_TO_CHECKOUT = eventName2;
            EventName eventName3 = new EventName("ADD_ITEM_TO_CART", 2);
            ADD_ITEM_TO_CART = eventName3;
            EventName eventName4 = new EventName("REMOVE_ITEM_FROM_CART", 3);
            REMOVE_ITEM_FROM_CART = eventName4;
            EventName eventName5 = new EventName("SET_ITEM_AMOUNT", 4);
            SET_ITEM_AMOUNT = eventName5;
            EventName eventName6 = new EventName("CHANGE_ITEM_VARIANT", 5);
            CHANGE_ITEM_VARIANT = eventName6;
            EventName eventName7 = new EventName("TRANSITION_TO_SELECT_DELIVERY_POINT", 6);
            TRANSITION_TO_SELECT_DELIVERY_POINT = eventName7;
            EventName eventName8 = new EventName("OPEN_DELIVERY_POINT_INFO", 7);
            OPEN_DELIVERY_POINT_INFO = eventName8;
            EventName eventName9 = new EventName("SELECT_DELIVERY_POINT", 8);
            SELECT_DELIVERY_POINT = eventName9;
            EventName eventName10 = new EventName("TRANSITION_TO_CARTS_LIST", 9);
            TRANSITION_TO_CARTS_LIST = eventName10;
            EventName eventName11 = new EventName("VIEW", 10);
            VIEW = eventName11;
            EventName eventName12 = new EventName("SEND_MESSAGE_TO_OWNER", 11);
            SEND_MESSAGE_TO_OWNER = eventName12;
            EventName eventName13 = new EventName("SEND_MESSAGE_TO_OWNER_2", 12);
            SEND_MESSAGE_TO_OWNER_2 = eventName13;
            EventName eventName14 = new EventName("OPEN_CHAT_WITH_OWNER", 13);
            OPEN_CHAT_WITH_OWNER = eventName14;
            EventName eventName15 = new EventName("OPEN_CHAT_WITH_OWNER_2", 14);
            OPEN_CHAT_WITH_OWNER_2 = eventName15;
            EventName eventName16 = new EventName("CLEAR_CART", 15);
            CLEAR_CART = eventName16;
            EventName[] eventNameArr = {eventName, eventName2, eventName3, eventName4, eventName5, eventName6, eventName7, eventName8, eventName9, eventName10, eventName11, eventName12, eventName13, eventName14, eventName15, eventName16};
            $VALUES = eventNameArr;
            $ENTRIES = new asp(eventNameArr);
        }

        private EventName(String str, int i) {
        }

        public static EventName valueOf(String str) {
            return (EventName) Enum.valueOf(EventName.class, str);
        }

        public static EventName[] values() {
            return (EventName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("all")
        public static final EventType ALL;

        @pmi0("cart")
        public static final EventType CART;

        @pmi0("dec")
        public static final EventType DEC;

        @pmi0("first")
        public static final EventType FIRST;

        @pmi0("item_card")
        public static final EventType ITEM_CARD;

        @pmi0("remove_item_from_cart")
        public static final EventType REMOVE_ITEM_FROM_CART;

        static {
            EventType eventType = new EventType("FIRST", 0);
            FIRST = eventType;
            EventType eventType2 = new EventType("ITEM_CARD", 1);
            ITEM_CARD = eventType2;
            EventType eventType3 = new EventType("CART", 2);
            CART = eventType3;
            EventType eventType4 = new EventType("REMOVE_ITEM_FROM_CART", 3);
            REMOVE_ITEM_FROM_CART = eventType4;
            EventType eventType5 = new EventType("DEC", 4);
            DEC = eventType5;
            EventType eventType6 = new EventType("ALL", 5);
            ALL = eventType6;
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

    public CommonMarketStat$TypeMarketCartsItem(EventName eventName, EventType eventType, Integer num, Integer num2, Integer num3, String str, Integer num4) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.itemId = num;
        this.deliveryPointId = num2;
        this.deliveryPointPartnerId = num3;
        this.deliveryPointExternalId = str;
        this.deliveryPointGroupId = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketCartsItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketCartsItem commonMarketStat$TypeMarketCartsItem = (CommonMarketStat$TypeMarketCartsItem) obj;
        return this.eventName == commonMarketStat$TypeMarketCartsItem.eventName && this.eventType == commonMarketStat$TypeMarketCartsItem.eventType && epx.f(this.itemId, commonMarketStat$TypeMarketCartsItem.itemId) && epx.f(this.deliveryPointId, commonMarketStat$TypeMarketCartsItem.deliveryPointId) && epx.f(this.deliveryPointPartnerId, commonMarketStat$TypeMarketCartsItem.deliveryPointPartnerId) && epx.f(this.deliveryPointExternalId, commonMarketStat$TypeMarketCartsItem.deliveryPointExternalId) && epx.f(this.deliveryPointGroupId, commonMarketStat$TypeMarketCartsItem.deliveryPointGroupId);
    }

    public final int hashCode() {
        int hashCode = this.eventName.hashCode() * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        Integer num = this.itemId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.deliveryPointId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.deliveryPointPartnerId;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.deliveryPointExternalId;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.deliveryPointGroupId;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketCartsItem(eventName=");
        sb.append(this.eventName);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", deliveryPointId=");
        sb.append(this.deliveryPointId);
        sb.append(", deliveryPointPartnerId=");
        sb.append(this.deliveryPointPartnerId);
        sb.append(", deliveryPointExternalId=");
        sb.append(this.deliveryPointExternalId);
        sb.append(", deliveryPointGroupId=");
        return uqi.b(sb, this.deliveryPointGroupId, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeMarketCartsItem(EventName eventName, EventType eventType, Integer num, Integer num2, Integer num3, String str, Integer num4, int i, zcl zclVar) {
        this(eventName, (i & 2) != 0 ? null : eventType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num4);
    }
}
