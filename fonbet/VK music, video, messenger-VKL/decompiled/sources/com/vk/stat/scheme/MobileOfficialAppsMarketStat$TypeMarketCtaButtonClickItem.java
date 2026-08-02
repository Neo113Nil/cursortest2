package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("ad_campaign")
    private final CommonMarketStat$TypeAdCampaign adCampaign;

    @pmi0("context_content")
    private final CommonMarketStat$TypeMarketContextContent contextContent;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("fomo_labels")
    private final CommonMarketStat$ProductCardFomoLabels fomoLabels;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("message_template")
    private final String messageTemplate;

    @pmi0("owner_response_time_minutes")
    private final Integer ownerResponseTimeMinutes;

    @pmi0("ozon_click")
    private final CommonMarketStat$TypeOzonClick ozonClick;

    @pmi0("referrer_item_id")
    private final Integer referrerItemId;

    @pmi0("referrer_item_type")
    private final MobileOfficialAppsMarketStat$ReferrerItemType referrerItemType;

    @pmi0("referrer_owner_id")
    private final Long referrerOwnerId;

    @pmi0("search_query_id")
    private final Long searchQueryId;

    @pmi0("traffic_source")
    private final String trafficSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_item_to_cart")
        public static final EventType ADD_ITEM_TO_CART;

        @pmi0("add_to_cart_hs")
        public static final EventType ADD_TO_CART_HS;

        @pmi0("buy_now")
        public static final EventType BUY_NOW;

        @pmi0("call_click")
        public static final EventType CALL_CLICK;

        @pmi0("call_click_2")
        public static final EventType CALL_CLICK_2;

        @pmi0("cta_link")
        public static final EventType CTA_LINK;

        @pmi0("cta_link_2")
        public static final EventType CTA_LINK_2;

        @pmi0("open_chat_with_owner")
        public static final EventType OPEN_CHAT_WITH_OWNER;

        @pmi0("open_chat_with_owner_2")
        public static final EventType OPEN_CHAT_WITH_OWNER_2;

        @pmi0("open_chat_with_owner_suggestions")
        public static final EventType OPEN_CHAT_WITH_OWNER_SUGGESTIONS;

        static {
            EventType eventType = new EventType("ADD_ITEM_TO_CART", 0);
            ADD_ITEM_TO_CART = eventType;
            EventType eventType2 = new EventType("ADD_TO_CART_HS", 1);
            ADD_TO_CART_HS = eventType2;
            EventType eventType3 = new EventType("CALL_CLICK", 2);
            CALL_CLICK = eventType3;
            EventType eventType4 = new EventType("CALL_CLICK_2", 3);
            CALL_CLICK_2 = eventType4;
            EventType eventType5 = new EventType("CTA_LINK", 4);
            CTA_LINK = eventType5;
            EventType eventType6 = new EventType("CTA_LINK_2", 5);
            CTA_LINK_2 = eventType6;
            EventType eventType7 = new EventType("OPEN_CHAT_WITH_OWNER", 6);
            OPEN_CHAT_WITH_OWNER = eventType7;
            EventType eventType8 = new EventType("OPEN_CHAT_WITH_OWNER_2", 7);
            OPEN_CHAT_WITH_OWNER_2 = eventType8;
            EventType eventType9 = new EventType("OPEN_CHAT_WITH_OWNER_SUGGESTIONS", 8);
            OPEN_CHAT_WITH_OWNER_SUGGESTIONS = eventType9;
            EventType eventType10 = new EventType("BUY_NOW", 9);
            BUY_NOW = eventType10;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10};
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

    public MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem = (MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem) obj;
        return this.eventType == mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.eventType && epx.f(this.searchQueryId, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.searchQueryId) && epx.f(this.itemIdx, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.itemIdx) && epx.f(this.referrerItemId, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.referrerItemId) && epx.f(this.referrerOwnerId, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.referrerOwnerId) && this.referrerItemType == mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.referrerItemType && epx.f(this.trafficSource, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.trafficSource) && epx.f(this.messageTemplate, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.messageTemplate) && epx.f(this.ownerResponseTimeMinutes, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.ownerResponseTimeMinutes) && epx.f(this.contextContent, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.contextContent) && epx.f(this.adCampaign, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.adCampaign) && epx.f(this.ozonClick, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.ozonClick) && epx.f(this.fomoLabels, mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.fomoLabels);
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        Long l = this.searchQueryId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.itemIdx;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.referrerItemId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.referrerOwnerId;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.referrerItemType;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsMarketStat$ReferrerItemType == null ? 0 : mobileOfficialAppsMarketStat$ReferrerItemType.hashCode())) * 31;
        String str = this.trafficSource;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageTemplate;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.ownerResponseTimeMinutes;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent = this.contextContent;
        int hashCode10 = (hashCode9 + (commonMarketStat$TypeMarketContextContent == null ? 0 : commonMarketStat$TypeMarketContextContent.hashCode())) * 31;
        CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = this.adCampaign;
        int hashCode11 = (hashCode10 + (commonMarketStat$TypeAdCampaign == null ? 0 : commonMarketStat$TypeAdCampaign.hashCode())) * 31;
        CommonMarketStat$TypeOzonClick commonMarketStat$TypeOzonClick = this.ozonClick;
        int hashCode12 = (hashCode11 + (commonMarketStat$TypeOzonClick == null ? 0 : commonMarketStat$TypeOzonClick.hashCode())) * 31;
        CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels = this.fomoLabels;
        return hashCode12 + (commonMarketStat$ProductCardFomoLabels != null ? commonMarketStat$ProductCardFomoLabels.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketCtaButtonClickItem(eventType=" + this.eventType + ", searchQueryId=" + this.searchQueryId + ", itemIdx=" + this.itemIdx + ", referrerItemId=" + this.referrerItemId + ", referrerOwnerId=" + this.referrerOwnerId + ", referrerItemType=" + this.referrerItemType + ", trafficSource=" + this.trafficSource + ", messageTemplate=" + this.messageTemplate + ", ownerResponseTimeMinutes=" + this.ownerResponseTimeMinutes + ", contextContent=" + this.contextContent + ", adCampaign=" + this.adCampaign + ", ozonClick=" + this.ozonClick + ", fomoLabels=" + this.fomoLabels + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem(EventType eventType, Long l, Integer num, Integer num2, Long l2, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, String str2, Integer num3, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent, CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, CommonMarketStat$TypeOzonClick commonMarketStat$TypeOzonClick, CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels) {
        this.eventType = eventType;
        this.searchQueryId = l;
        this.itemIdx = num;
        this.referrerItemId = num2;
        this.referrerOwnerId = l2;
        this.referrerItemType = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.trafficSource = str;
        this.messageTemplate = str2;
        this.ownerResponseTimeMinutes = num3;
        this.contextContent = commonMarketStat$TypeMarketContextContent;
        this.adCampaign = commonMarketStat$TypeAdCampaign;
        this.ozonClick = commonMarketStat$TypeOzonClick;
        this.fomoLabels = commonMarketStat$ProductCardFomoLabels;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem(EventType eventType, Long l, Integer num, Integer num2, Long l2, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, String str2, Integer num3, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent, CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, CommonMarketStat$TypeOzonClick commonMarketStat$TypeOzonClick, CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : commonMarketStat$TypeMarketContextContent, (i & 1024) != 0 ? null : commonMarketStat$TypeAdCampaign, (i & 2048) != 0 ? null : commonMarketStat$TypeOzonClick, (i & 4096) != 0 ? null : commonMarketStat$ProductCardFomoLabels);
    }
}
