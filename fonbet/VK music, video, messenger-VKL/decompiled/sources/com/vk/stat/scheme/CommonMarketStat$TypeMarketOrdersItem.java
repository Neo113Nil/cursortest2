package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketOrdersItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("color_tags")
    private final List<CommonMarketStat$MarketOrderColorTag> colorTags;

    @pmi0("event_name")
    private final EventName eventName;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class EventName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventName[] $VALUES;

        @pmi0("add_internal_comment")
        public static final EventName ADD_INTERNAL_COMMENT;

        @pmi0("add_track_code")
        public static final EventName ADD_TRACK_CODE;

        @pmi0("attach_color_tag")
        public static final EventName ATTACH_COLOR_TAG;

        @pmi0("cancel_order")
        public static final EventName CANCEL_ORDER;

        @pmi0("cancel_payment")
        public static final EventName CANCEL_PAYMENT;

        @pmi0("change_order_status")
        public static final EventName CHANGE_ORDER_STATUS;

        @pmi0("change_track_code")
        public static final EventName CHANGE_TRACK_CODE;

        @pmi0("create_color_tag")
        public static final EventName CREATE_COLOR_TAG;

        @pmi0("delete_color_tag")
        public static final EventName DELETE_COLOR_TAG;

        @pmi0("detach_color_tag")
        public static final EventName DETACH_COLOR_TAG;

        @pmi0("expand_order_info")
        public static final EventName EXPAND_ORDER_INFO;

        @pmi0("export_orders_data")
        public static final EventName EXPORT_ORDERS_DATA;

        @pmi0("filter_orders_by_status")
        public static final EventName FILTER_ORDERS_BY_STATUS;

        @pmi0("make_order")
        public static final EventName MAKE_ORDER;

        @pmi0("open_chat_with_customer")
        public static final EventName OPEN_CHAT_WITH_CUSTOMER;

        @pmi0("open_delivery_point_info")
        public static final EventName OPEN_DELIVERY_POINT_INFO;

        @pmi0("open_market_group_delivery")
        public static final EventName OPEN_MARKET_GROUP_DELIVERY;

        @pmi0("open_market_group_items")
        public static final EventName OPEN_MARKET_GROUP_ITEMS;

        @pmi0("open_market_group_orders")
        public static final EventName OPEN_MARKET_GROUP_ORDERS;

        @pmi0("open_market_group_settings")
        public static final EventName OPEN_MARKET_GROUP_SETTINGS;

        @pmi0("open_market_payment_settings")
        public static final EventName OPEN_MARKET_PAYMENT_SETTINGS;

        @pmi0("open_order_history")
        public static final EventName OPEN_ORDER_HISTORY;

        @pmi0("open_order_info")
        public static final EventName OPEN_ORDER_INFO;

        @pmi0("open_payment")
        public static final EventName OPEN_PAYMENT;

        @pmi0("open_receipt_link")
        public static final EventName OPEN_RECEIPT_LINK;

        @pmi0("open_track_code_link")
        public static final EventName OPEN_TRACK_CODE_LINK;

        @pmi0("open_vkpay_form")
        public static final EventName OPEN_VKPAY_FORM;

        @pmi0("remove_track_code")
        public static final EventName REMOVE_TRACK_CODE;

        @pmi0("send_message_to_customer")
        public static final EventName SEND_MESSAGE_TO_CUSTOMER;

        @pmi0("transition_to_carts_list")
        public static final EventName TRANSITION_TO_CARTS_LIST;

        @pmi0("transition_to_market_support")
        public static final EventName TRANSITION_TO_MARKET_SUPPORT;

        @pmi0("transition_to_orders")
        public static final EventName TRANSITION_TO_ORDERS;

        @pmi0("transition_to_orders_list")
        public static final EventName TRANSITION_TO_ORDERS_LIST;

        static {
            EventName eventName = new EventName("MAKE_ORDER", 0);
            MAKE_ORDER = eventName;
            EventName eventName2 = new EventName("CANCEL_ORDER", 1);
            CANCEL_ORDER = eventName2;
            EventName eventName3 = new EventName("EXPAND_ORDER_INFO", 2);
            EXPAND_ORDER_INFO = eventName3;
            EventName eventName4 = new EventName("TRANSITION_TO_ORDERS", 3);
            TRANSITION_TO_ORDERS = eventName4;
            EventName eventName5 = new EventName("TRANSITION_TO_ORDERS_LIST", 4);
            TRANSITION_TO_ORDERS_LIST = eventName5;
            EventName eventName6 = new EventName("TRANSITION_TO_CARTS_LIST", 5);
            TRANSITION_TO_CARTS_LIST = eventName6;
            EventName eventName7 = new EventName("OPEN_MARKET_GROUP_ORDERS", 6);
            OPEN_MARKET_GROUP_ORDERS = eventName7;
            EventName eventName8 = new EventName("OPEN_MARKET_GROUP_ITEMS", 7);
            OPEN_MARKET_GROUP_ITEMS = eventName8;
            EventName eventName9 = new EventName("OPEN_MARKET_GROUP_SETTINGS", 8);
            OPEN_MARKET_GROUP_SETTINGS = eventName9;
            EventName eventName10 = new EventName("OPEN_MARKET_GROUP_DELIVERY", 9);
            OPEN_MARKET_GROUP_DELIVERY = eventName10;
            EventName eventName11 = new EventName("OPEN_MARKET_PAYMENT_SETTINGS", 10);
            OPEN_MARKET_PAYMENT_SETTINGS = eventName11;
            EventName eventName12 = new EventName("OPEN_VKPAY_FORM", 11);
            OPEN_VKPAY_FORM = eventName12;
            EventName eventName13 = new EventName("TRANSITION_TO_MARKET_SUPPORT", 12);
            TRANSITION_TO_MARKET_SUPPORT = eventName13;
            EventName eventName14 = new EventName("OPEN_ORDER_INFO", 13);
            OPEN_ORDER_INFO = eventName14;
            EventName eventName15 = new EventName("ADD_TRACK_CODE", 14);
            ADD_TRACK_CODE = eventName15;
            EventName eventName16 = new EventName("ADD_INTERNAL_COMMENT", 15);
            ADD_INTERNAL_COMMENT = eventName16;
            EventName eventName17 = new EventName("CHANGE_ORDER_STATUS", 16);
            CHANGE_ORDER_STATUS = eventName17;
            EventName eventName18 = new EventName("OPEN_CHAT_WITH_CUSTOMER", 17);
            OPEN_CHAT_WITH_CUSTOMER = eventName18;
            EventName eventName19 = new EventName("SEND_MESSAGE_TO_CUSTOMER", 18);
            SEND_MESSAGE_TO_CUSTOMER = eventName19;
            EventName eventName20 = new EventName("OPEN_ORDER_HISTORY", 19);
            OPEN_ORDER_HISTORY = eventName20;
            EventName eventName21 = new EventName("FILTER_ORDERS_BY_STATUS", 20);
            FILTER_ORDERS_BY_STATUS = eventName21;
            EventName eventName22 = new EventName("EXPORT_ORDERS_DATA", 21);
            EXPORT_ORDERS_DATA = eventName22;
            EventName eventName23 = new EventName("REMOVE_TRACK_CODE", 22);
            REMOVE_TRACK_CODE = eventName23;
            EventName eventName24 = new EventName("CHANGE_TRACK_CODE", 23);
            CHANGE_TRACK_CODE = eventName24;
            EventName eventName25 = new EventName("CREATE_COLOR_TAG", 24);
            CREATE_COLOR_TAG = eventName25;
            EventName eventName26 = new EventName("DELETE_COLOR_TAG", 25);
            DELETE_COLOR_TAG = eventName26;
            EventName eventName27 = new EventName("ATTACH_COLOR_TAG", 26);
            ATTACH_COLOR_TAG = eventName27;
            EventName eventName28 = new EventName("DETACH_COLOR_TAG", 27);
            DETACH_COLOR_TAG = eventName28;
            EventName eventName29 = new EventName("OPEN_DELIVERY_POINT_INFO", 28);
            OPEN_DELIVERY_POINT_INFO = eventName29;
            EventName eventName30 = new EventName("OPEN_TRACK_CODE_LINK", 29);
            OPEN_TRACK_CODE_LINK = eventName30;
            EventName eventName31 = new EventName("OPEN_PAYMENT", 30);
            OPEN_PAYMENT = eventName31;
            EventName eventName32 = new EventName("CANCEL_PAYMENT", 31);
            CANCEL_PAYMENT = eventName32;
            EventName eventName33 = new EventName("OPEN_RECEIPT_LINK", 32);
            OPEN_RECEIPT_LINK = eventName33;
            EventName[] eventNameArr = {eventName, eventName2, eventName3, eventName4, eventName5, eventName6, eventName7, eventName8, eventName9, eventName10, eventName11, eventName12, eventName13, eventName14, eventName15, eventName16, eventName17, eventName18, eventName19, eventName20, eventName21, eventName22, eventName23, eventName24, eventName25, eventName26, eventName27, eventName28, eventName29, eventName30, eventName31, eventName32, eventName33};
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
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("cart")
        public static final Source CART;

        @pmi0("im_reminder")
        public static final Source IM_REMINDER;

        @pmi0("main_menu")
        public static final Source MAIN_MENU;

        @pmi0("marketplace")
        public static final Source MARKETPLACE;

        @pmi0("marketplace_main")
        public static final Source MARKETPLACE_MAIN;

        @pmi0("order_button")
        public static final Source ORDER_BUTTON;

        @pmi0("order_link")
        public static final Source ORDER_LINK;

        @pmi0("order_list_link")
        public static final Source ORDER_LIST_LINK;

        @pmi0("order_screen")
        public static final Source ORDER_SCREEN;

        @pmi0("superapp_widget")
        public static final Source SUPERAPP_WIDGET;

        @pmi0("superapp_widget_body")
        public static final Source SUPERAPP_WIDGET_BODY;

        @pmi0("superapp_widget_cart")
        public static final Source SUPERAPP_WIDGET_CART;

        @pmi0("superapp_widget_goods")
        public static final Source SUPERAPP_WIDGET_GOODS;

        static {
            Source source = new Source("CART", 0);
            CART = source;
            Source source2 = new Source("MAIN_MENU", 1);
            MAIN_MENU = source2;
            Source source3 = new Source("MARKETPLACE", 2);
            MARKETPLACE = source3;
            Source source4 = new Source("MARKETPLACE_MAIN", 3);
            MARKETPLACE_MAIN = source4;
            Source source5 = new Source("ORDER_LIST_LINK", 4);
            ORDER_LIST_LINK = source5;
            Source source6 = new Source("ORDER_LINK", 5);
            ORDER_LINK = source6;
            Source source7 = new Source("ORDER_BUTTON", 6);
            ORDER_BUTTON = source7;
            Source source8 = new Source("ORDER_SCREEN", 7);
            ORDER_SCREEN = source8;
            Source source9 = new Source("IM_REMINDER", 8);
            IM_REMINDER = source9;
            Source source10 = new Source("SUPERAPP_WIDGET", 9);
            SUPERAPP_WIDGET = source10;
            Source source11 = new Source("SUPERAPP_WIDGET_CART", 10);
            SUPERAPP_WIDGET_CART = source11;
            Source source12 = new Source("SUPERAPP_WIDGET_GOODS", 11);
            SUPERAPP_WIDGET_GOODS = source12;
            Source source13 = new Source("SUPERAPP_WIDGET_BODY", 12);
            SUPERAPP_WIDGET_BODY = source13;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8, source9, source10, source11, source12, source13};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public CommonMarketStat$TypeMarketOrdersItem(EventName eventName, Source source, Long l, List<CommonMarketStat$MarketOrderColorTag> list) {
        this.eventName = eventName;
        this.source = source;
        this.ownerId = l;
        this.colorTags = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketOrdersItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem = (CommonMarketStat$TypeMarketOrdersItem) obj;
        return this.eventName == commonMarketStat$TypeMarketOrdersItem.eventName && this.source == commonMarketStat$TypeMarketOrdersItem.source && epx.f(this.ownerId, commonMarketStat$TypeMarketOrdersItem.ownerId) && epx.f(this.colorTags, commonMarketStat$TypeMarketOrdersItem.colorTags);
    }

    public final int hashCode() {
        int hashCode = this.eventName.hashCode() * 31;
        Source source = this.source;
        int hashCode2 = (hashCode + (source == null ? 0 : source.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<CommonMarketStat$MarketOrderColorTag> list = this.colorTags;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketOrdersItem(eventName=");
        sb.append(this.eventName);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", colorTags=");
        return ms9.a(')', sb, this.colorTags);
    }

    public /* synthetic */ CommonMarketStat$TypeMarketOrdersItem(EventName eventName, Source source, Long l, List list, int i, zcl zclVar) {
        this(eventName, (i & 2) != 0 ? null : source, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list);
    }
}
