package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import xsna.a9h0;
import xsna.a9y;
import xsna.asp;
import xsna.b9h0;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.iq;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeMarketItem implements SchemeStat$TypeNavgo.b, SchemeStat$TypeAction.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeView.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("ad_campaign")
    private final String adCampaign;

    @pmi0("ad_campaign_id")
    private final Integer adCampaignId;

    @pmi0("ad_campaign_source")
    private final String adCampaignSource;

    @pmi0("block")
    private final String block;

    @pmi0("block_idx")
    private final Integer blockIdx;

    @pmi0("catalog_filters")
    private final List<SchemeStat$MarketCatalogFilterItem> catalogFilters;

    @pmi0("contact_id")
    private final Long contactId;

    @pmi0("feedback_id")
    private final String feedbackId;

    @pmi0("banner_name")
    private final FilteredString filteredBannerName;

    @pmi0("has_attendant_items")
    private final Boolean hasAttendantItems;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("item_variant_position")
    private final Integer itemVariantPosition;

    @pmi0("miniatures")
    private final List<SchemeStat$MarketAliexpressMiniature> miniatures;

    @pmi0("referrer_item_id")
    private final Long referrerItemId;

    @pmi0("referrer_item_type")
    private final ReferrerItemType referrerItemType;

    @pmi0("search_query_id")
    private final Long searchQueryId;

    @pmi0("subtype")
    private final Subtype subtype;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeMarketItem>, a9y<SchemeStat$TypeMarketItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("subtype");
            Subtype subtype = (Subtype) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Subtype.class));
            Integer A = fai.A(x9yVar, "item_variant_position");
            String C = fai.C(x9yVar, "item_id");
            String C2 = fai.C(x9yVar, "block");
            Integer A2 = fai.A(x9yVar, "block_idx");
            Integer A3 = fai.A(x9yVar, "item_idx");
            String C3 = fai.C(x9yVar, "banner_name");
            String C4 = fai.C(x9yVar, "ad_campaign");
            Integer A4 = fai.A(x9yVar, "ad_campaign_id");
            String C5 = fai.C(x9yVar, "ad_campaign_source");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("catalog_filters");
            List list = (List) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(x9yVar.q("catalog_filters").k(), new a9h0().getType()));
            String C6 = fai.C(x9yVar, "feedback_id");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("miniatures");
            List list2 = (List) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(x9yVar.q("miniatures").k(), new b9h0().getType()));
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("referrer_item_type");
            return new SchemeStat$TypeMarketItem(subtype, A, C, C2, A2, A3, C3, C4, A4, C5, list, C6, list2, (ReferrerItemType) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(q4.k(), ReferrerItemType.class)), fai.B(x9yVar, "referrer_item_id"), fai.y(x9yVar, "has_attendant_items"), fai.B(x9yVar, "search_query_id"), fai.B(x9yVar, "contact_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = (SchemeStat$TypeMarketItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("subtype", tru.a().toJson(schemeStat$TypeMarketItem.r()));
            x9yVar.n("item_variant_position", schemeStat$TypeMarketItem.m());
            x9yVar.o("item_id", schemeStat$TypeMarketItem.k());
            x9yVar.o("block", schemeStat$TypeMarketItem.e());
            x9yVar.n("block_idx", schemeStat$TypeMarketItem.f());
            x9yVar.n("item_idx", schemeStat$TypeMarketItem.l());
            x9yVar.o("banner_name", schemeStat$TypeMarketItem.a);
            x9yVar.o("ad_campaign", schemeStat$TypeMarketItem.b());
            x9yVar.n("ad_campaign_id", schemeStat$TypeMarketItem.c());
            x9yVar.o("ad_campaign_source", schemeStat$TypeMarketItem.d());
            x9yVar.o("catalog_filters", tru.a().toJson(schemeStat$TypeMarketItem.g()));
            x9yVar.o("feedback_id", schemeStat$TypeMarketItem.i());
            x9yVar.o("miniatures", tru.a().toJson(schemeStat$TypeMarketItem.n()));
            x9yVar.o("referrer_item_type", tru.a().toJson(schemeStat$TypeMarketItem.p()));
            x9yVar.n("referrer_item_id", schemeStat$TypeMarketItem.o());
            x9yVar.m(schemeStat$TypeMarketItem.j(), "has_attendant_items");
            x9yVar.n("search_query_id", schemeStat$TypeMarketItem.q());
            x9yVar.n("contact_id", schemeStat$TypeMarketItem.h());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class ReferrerItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReferrerItemType[] $VALUES;

        @pmi0("other_goods")
        public static final ReferrerItemType OTHER_GOODS;

        @pmi0("recommended_goods")
        public static final ReferrerItemType RECOMMENDED_GOODS;

        @pmi0("similar_items")
        public static final ReferrerItemType SIMILAR_ITEMS;

        @pmi0("similar_items_bookmarks")
        public static final ReferrerItemType SIMILAR_ITEMS_BOOKMARKS;

        static {
            ReferrerItemType referrerItemType = new ReferrerItemType("OTHER_GOODS", 0);
            OTHER_GOODS = referrerItemType;
            ReferrerItemType referrerItemType2 = new ReferrerItemType("RECOMMENDED_GOODS", 1);
            RECOMMENDED_GOODS = referrerItemType2;
            ReferrerItemType referrerItemType3 = new ReferrerItemType("SIMILAR_ITEMS", 2);
            SIMILAR_ITEMS = referrerItemType3;
            ReferrerItemType referrerItemType4 = new ReferrerItemType("SIMILAR_ITEMS_BOOKMARKS", 3);
            SIMILAR_ITEMS_BOOKMARKS = referrerItemType4;
            ReferrerItemType[] referrerItemTypeArr = {referrerItemType, referrerItemType2, referrerItemType3, referrerItemType4};
            $VALUES = referrerItemTypeArr;
            $ENTRIES = new asp(referrerItemTypeArr);
        }

        private ReferrerItemType(String str, int i) {
        }

        public static ReferrerItemType valueOf(String str) {
            return (ReferrerItemType) Enum.valueOf(ReferrerItemType.class, str);
        }

        public static ReferrerItemType[] values() {
            return (ReferrerItemType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("add_item_to_bookmarks")
        public static final Subtype ADD_ITEM_TO_BOOKMARKS;

        @pmi0("add_item_to_cart")
        public static final Subtype ADD_ITEM_TO_CART;

        @pmi0("add_to_cart_hs")
        public static final Subtype ADD_TO_CART_HS;

        @pmi0(NotificationCompat.CATEGORY_CALL)
        public static final Subtype CALL;

        @pmi0("call_2")
        public static final Subtype CALL_2;

        @pmi0("create_item")
        public static final Subtype CREATE_ITEM;

        @pmi0("cta_link")
        public static final Subtype CTA_LINK;

        @pmi0("cta_link_2")
        public static final Subtype CTA_LINK_2;

        @pmi0("expand_item_description")
        public static final Subtype EXPAND_ITEM_DESCRIPTION;

        @pmi0("like_item")
        public static final Subtype LIKE_ITEM;

        @pmi0("open_chat_with_owner")
        public static final Subtype OPEN_CHAT_WITH_OWNER;

        @pmi0("open_chat_with_owner_2")
        public static final Subtype OPEN_CHAT_WITH_OWNER_2;

        @pmi0("open_feedback_photo")
        public static final Subtype OPEN_FEEDBACK_PHOTO;

        @pmi0("open_from_feed")
        public static final Subtype OPEN_FROM_FEED;

        @pmi0("open_marketplace")
        public static final Subtype OPEN_MARKETPLACE;

        @pmi0("open_search_goods")
        public static final Subtype OPEN_SEARCH_GOODS;

        @pmi0("open_search_goods_show_all")
        public static final Subtype OPEN_SEARCH_GOODS_SHOW_ALL;

        @pmi0("search")
        public static final Subtype SEARCH;

        @pmi0("search_filters_apply")
        public static final Subtype SEARCH_FILTERS_APPLY;

        @pmi0("select_delivery_point")
        public static final Subtype SELECT_DELIVERY_POINT;

        @pmi0("send_message_to_owner")
        public static final Subtype SEND_MESSAGE_TO_OWNER;

        @pmi0("send_message_to_owner_2")
        public static final Subtype SEND_MESSAGE_TO_OWNER_2;

        @pmi0("share_item")
        public static final Subtype SHARE_ITEM;

        @pmi0("switch_item_variant")
        public static final Subtype SWITCH_ITEM_VARIANT;

        @pmi0("transition_to_album")
        public static final Subtype TRANSITION_TO_ALBUM;

        @pmi0("transition_to_attendant_items")
        public static final Subtype TRANSITION_TO_ATTENDANT_ITEMS;

        @pmi0("transition_to_item")
        public static final Subtype TRANSITION_TO_ITEM;

        @pmi0("transition_to_item_attendant")
        public static final Subtype TRANSITION_TO_ITEM_ATTENDANT;

        @pmi0("transition_to_item_left")
        public static final Subtype TRANSITION_TO_ITEM_LEFT;

        @pmi0("transition_to_item_right")
        public static final Subtype TRANSITION_TO_ITEM_RIGHT;

        @pmi0("transition_to_market")
        public static final Subtype TRANSITION_TO_MARKET;

        @pmi0("unlike_item")
        public static final Subtype UNLIKE_ITEM;

        @pmi0("view_album")
        public static final Subtype VIEW_ALBUM;

        @pmi0("view_feedback")
        public static final Subtype VIEW_FEEDBACK;

        @pmi0("view_item")
        public static final Subtype VIEW_ITEM;

        @pmi0("view_market")
        public static final Subtype VIEW_MARKET;

        static {
            Subtype subtype = new Subtype("SWITCH_ITEM_VARIANT", 0);
            SWITCH_ITEM_VARIANT = subtype;
            Subtype subtype2 = new Subtype("EXPAND_ITEM_DESCRIPTION", 1);
            EXPAND_ITEM_DESCRIPTION = subtype2;
            Subtype subtype3 = new Subtype("SELECT_DELIVERY_POINT", 2);
            SELECT_DELIVERY_POINT = subtype3;
            Subtype subtype4 = new Subtype("OPEN_FROM_FEED", 3);
            OPEN_FROM_FEED = subtype4;
            Subtype subtype5 = new Subtype("OPEN_MARKETPLACE", 4);
            OPEN_MARKETPLACE = subtype5;
            Subtype subtype6 = new Subtype("OPEN_FEEDBACK_PHOTO", 5);
            OPEN_FEEDBACK_PHOTO = subtype6;
            Subtype subtype7 = new Subtype("VIEW_ITEM", 6);
            VIEW_ITEM = subtype7;
            Subtype subtype8 = new Subtype("VIEW_ALBUM", 7);
            VIEW_ALBUM = subtype8;
            Subtype subtype9 = new Subtype("VIEW_MARKET", 8);
            VIEW_MARKET = subtype9;
            Subtype subtype10 = new Subtype("VIEW_FEEDBACK", 9);
            VIEW_FEEDBACK = subtype10;
            Subtype subtype11 = new Subtype("TRANSITION_TO_ATTENDANT_ITEMS", 10);
            TRANSITION_TO_ATTENDANT_ITEMS = subtype11;
            Subtype subtype12 = new Subtype("TRANSITION_TO_ITEM_ATTENDANT", 11);
            TRANSITION_TO_ITEM_ATTENDANT = subtype12;
            Subtype subtype13 = new Subtype("TRANSITION_TO_ITEM", 12);
            TRANSITION_TO_ITEM = subtype13;
            Subtype subtype14 = new Subtype("TRANSITION_TO_ITEM_LEFT", 13);
            TRANSITION_TO_ITEM_LEFT = subtype14;
            Subtype subtype15 = new Subtype("TRANSITION_TO_ITEM_RIGHT", 14);
            TRANSITION_TO_ITEM_RIGHT = subtype15;
            Subtype subtype16 = new Subtype("TRANSITION_TO_ALBUM", 15);
            TRANSITION_TO_ALBUM = subtype16;
            Subtype subtype17 = new Subtype("TRANSITION_TO_MARKET", 16);
            TRANSITION_TO_MARKET = subtype17;
            Subtype subtype18 = new Subtype("ADD_ITEM_TO_CART", 17);
            ADD_ITEM_TO_CART = subtype18;
            Subtype subtype19 = new Subtype("ADD_TO_CART_HS", 18);
            ADD_TO_CART_HS = subtype19;
            Subtype subtype20 = new Subtype("CTA_LINK", 19);
            CTA_LINK = subtype20;
            Subtype subtype21 = new Subtype("CTA_LINK_2", 20);
            CTA_LINK_2 = subtype21;
            Subtype subtype22 = new Subtype("CALL", 21);
            CALL = subtype22;
            Subtype subtype23 = new Subtype("CALL_2", 22);
            CALL_2 = subtype23;
            Subtype subtype24 = new Subtype("OPEN_CHAT_WITH_OWNER", 23);
            OPEN_CHAT_WITH_OWNER = subtype24;
            Subtype subtype25 = new Subtype("OPEN_CHAT_WITH_OWNER_2", 24);
            OPEN_CHAT_WITH_OWNER_2 = subtype25;
            Subtype subtype26 = new Subtype("ADD_ITEM_TO_BOOKMARKS", 25);
            ADD_ITEM_TO_BOOKMARKS = subtype26;
            Subtype subtype27 = new Subtype("LIKE_ITEM", 26);
            LIKE_ITEM = subtype27;
            Subtype subtype28 = new Subtype("UNLIKE_ITEM", 27);
            UNLIKE_ITEM = subtype28;
            Subtype subtype29 = new Subtype("SHARE_ITEM", 28);
            SHARE_ITEM = subtype29;
            Subtype subtype30 = new Subtype("CREATE_ITEM", 29);
            CREATE_ITEM = subtype30;
            Subtype subtype31 = new Subtype("SEARCH", 30);
            SEARCH = subtype31;
            Subtype subtype32 = new Subtype("SEARCH_FILTERS_APPLY", 31);
            SEARCH_FILTERS_APPLY = subtype32;
            Subtype subtype33 = new Subtype("OPEN_SEARCH_GOODS", 32);
            OPEN_SEARCH_GOODS = subtype33;
            Subtype subtype34 = new Subtype("OPEN_SEARCH_GOODS_SHOW_ALL", 33);
            OPEN_SEARCH_GOODS_SHOW_ALL = subtype34;
            Subtype subtype35 = new Subtype("SEND_MESSAGE_TO_OWNER", 34);
            SEND_MESSAGE_TO_OWNER = subtype35;
            Subtype subtype36 = new Subtype("SEND_MESSAGE_TO_OWNER_2", 35);
            SEND_MESSAGE_TO_OWNER_2 = subtype36;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8, subtype9, subtype10, subtype11, subtype12, subtype13, subtype14, subtype15, subtype16, subtype17, subtype18, subtype19, subtype20, subtype21, subtype22, subtype23, subtype24, subtype25, subtype26, subtype27, subtype28, subtype29, subtype30, subtype31, subtype32, subtype33, subtype34, subtype35, subtype36};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeMarketItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static SchemeStat$TypeMarketItem a(SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, String str) {
        return new SchemeStat$TypeMarketItem(schemeStat$TypeMarketItem.subtype, schemeStat$TypeMarketItem.itemVariantPosition, str, schemeStat$TypeMarketItem.block, schemeStat$TypeMarketItem.blockIdx, schemeStat$TypeMarketItem.itemIdx, schemeStat$TypeMarketItem.a, schemeStat$TypeMarketItem.adCampaign, schemeStat$TypeMarketItem.adCampaignId, schemeStat$TypeMarketItem.adCampaignSource, schemeStat$TypeMarketItem.catalogFilters, schemeStat$TypeMarketItem.feedbackId, schemeStat$TypeMarketItem.miniatures, schemeStat$TypeMarketItem.referrerItemType, schemeStat$TypeMarketItem.referrerItemId, schemeStat$TypeMarketItem.hasAttendantItems, schemeStat$TypeMarketItem.searchQueryId, schemeStat$TypeMarketItem.contactId);
    }

    public final String b() {
        return this.adCampaign;
    }

    public final Integer c() {
        return this.adCampaignId;
    }

    public final String d() {
        return this.adCampaignSource;
    }

    public final String e() {
        return this.block;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMarketItem)) {
            return false;
        }
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = (SchemeStat$TypeMarketItem) obj;
        return this.subtype == schemeStat$TypeMarketItem.subtype && epx.f(this.itemVariantPosition, schemeStat$TypeMarketItem.itemVariantPosition) && epx.f(this.itemId, schemeStat$TypeMarketItem.itemId) && epx.f(this.block, schemeStat$TypeMarketItem.block) && epx.f(this.blockIdx, schemeStat$TypeMarketItem.blockIdx) && epx.f(this.itemIdx, schemeStat$TypeMarketItem.itemIdx) && epx.f(this.a, schemeStat$TypeMarketItem.a) && epx.f(this.adCampaign, schemeStat$TypeMarketItem.adCampaign) && epx.f(this.adCampaignId, schemeStat$TypeMarketItem.adCampaignId) && epx.f(this.adCampaignSource, schemeStat$TypeMarketItem.adCampaignSource) && epx.f(this.catalogFilters, schemeStat$TypeMarketItem.catalogFilters) && epx.f(this.feedbackId, schemeStat$TypeMarketItem.feedbackId) && epx.f(this.miniatures, schemeStat$TypeMarketItem.miniatures) && this.referrerItemType == schemeStat$TypeMarketItem.referrerItemType && epx.f(this.referrerItemId, schemeStat$TypeMarketItem.referrerItemId) && epx.f(this.hasAttendantItems, schemeStat$TypeMarketItem.hasAttendantItems) && epx.f(this.searchQueryId, schemeStat$TypeMarketItem.searchQueryId) && epx.f(this.contactId, schemeStat$TypeMarketItem.contactId);
    }

    public final Integer f() {
        return this.blockIdx;
    }

    public final List<SchemeStat$MarketCatalogFilterItem> g() {
        return this.catalogFilters;
    }

    public final Long h() {
        return this.contactId;
    }

    public final int hashCode() {
        Subtype subtype = this.subtype;
        int hashCode = (subtype == null ? 0 : subtype.hashCode()) * 31;
        Integer num = this.itemVariantPosition;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.itemId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.block;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.blockIdx;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemIdx;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.a;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adCampaign;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.adCampaignId;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.adCampaignSource;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<SchemeStat$MarketCatalogFilterItem> list = this.catalogFilters;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.feedbackId;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<SchemeStat$MarketAliexpressMiniature> list2 = this.miniatures;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ReferrerItemType referrerItemType = this.referrerItemType;
        int hashCode14 = (hashCode13 + (referrerItemType == null ? 0 : referrerItemType.hashCode())) * 31;
        Long l = this.referrerItemId;
        int hashCode15 = (hashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasAttendantItems;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.searchQueryId;
        int hashCode17 = (hashCode16 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.contactId;
        return hashCode17 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String i() {
        return this.feedbackId;
    }

    public final Boolean j() {
        return this.hasAttendantItems;
    }

    public final String k() {
        return this.itemId;
    }

    public final Integer l() {
        return this.itemIdx;
    }

    public final Integer m() {
        return this.itemVariantPosition;
    }

    public final List<SchemeStat$MarketAliexpressMiniature> n() {
        return this.miniatures;
    }

    public final Long o() {
        return this.referrerItemId;
    }

    public final ReferrerItemType p() {
        return this.referrerItemType;
    }

    public final Long q() {
        return this.searchQueryId;
    }

    public final Subtype r() {
        return this.subtype;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketItem(subtype=");
        sb.append(this.subtype);
        sb.append(", itemVariantPosition=");
        sb.append(this.itemVariantPosition);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", block=");
        sb.append(this.block);
        sb.append(", blockIdx=");
        sb.append(this.blockIdx);
        sb.append(", itemIdx=");
        sb.append(this.itemIdx);
        sb.append(", bannerName=");
        sb.append(this.a);
        sb.append(", adCampaign=");
        sb.append(this.adCampaign);
        sb.append(", adCampaignId=");
        sb.append(this.adCampaignId);
        sb.append(", adCampaignSource=");
        sb.append(this.adCampaignSource);
        sb.append(", catalogFilters=");
        sb.append(this.catalogFilters);
        sb.append(", feedbackId=");
        sb.append(this.feedbackId);
        sb.append(", miniatures=");
        sb.append(this.miniatures);
        sb.append(", referrerItemType=");
        sb.append(this.referrerItemType);
        sb.append(", referrerItemId=");
        sb.append(this.referrerItemId);
        sb.append(", hasAttendantItems=");
        sb.append(this.hasAttendantItems);
        sb.append(", searchQueryId=");
        sb.append(this.searchQueryId);
        sb.append(", contactId=");
        return iq.b(sb, this.contactId, ')');
    }

    public SchemeStat$TypeMarketItem(Subtype subtype, Integer num, String str, String str2, Integer num2, Integer num3, String str3, String str4, Integer num4, String str5, List<SchemeStat$MarketCatalogFilterItem> list, String str6, List<SchemeStat$MarketAliexpressMiniature> list2, ReferrerItemType referrerItemType, Long l, Boolean bool, Long l2, Long l3) {
        this.subtype = subtype;
        this.itemVariantPosition = num;
        this.itemId = str;
        this.block = str2;
        this.blockIdx = num2;
        this.itemIdx = num3;
        this.a = str3;
        this.adCampaign = str4;
        this.adCampaignId = num4;
        this.adCampaignSource = str5;
        this.catalogFilters = list;
        this.feedbackId = str6;
        this.miniatures = list2;
        this.referrerItemType = referrerItemType;
        this.referrerItemId = l;
        this.hasAttendantItems = bool;
        this.searchQueryId = l2;
        this.contactId = l3;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredBannerName = filteredString;
        filteredString.a(str3);
    }

    public /* synthetic */ SchemeStat$TypeMarketItem(Subtype subtype, Integer num, String str, String str2, Integer num2, Integer num3, String str3, String str4, Integer num4, String str5, List list, String str6, List list2, ReferrerItemType referrerItemType, Long l, Boolean bool, Long l2, Long l3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : subtype, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : list2, (i & 8192) != 0 ? null : referrerItemType, (i & 16384) != 0 ? null : l, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : l2, (i & 131072) != 0 ? null : l3);
    }
}
