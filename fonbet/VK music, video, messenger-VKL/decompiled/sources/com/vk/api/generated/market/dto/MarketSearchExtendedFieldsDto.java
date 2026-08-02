package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchExtendedFieldsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchExtendedFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchExtendedFieldsDto[] $VALUES;

    @pmi0("action_buttons")
    public static final MarketSearchExtendedFieldsDto ACTION_BUTTONS;

    @pmi0("addresses")
    public static final MarketSearchExtendedFieldsDto ADDRESSES;

    @pmi0("ads_label")
    public static final MarketSearchExtendedFieldsDto ADS_LABEL;

    @pmi0("ad_id")
    public static final MarketSearchExtendedFieldsDto AD_ID;

    @pmi0("albums_ids")
    public static final MarketSearchExtendedFieldsDto ALBUMS_IDS;

    @pmi0("banner")
    public static final MarketSearchExtendedFieldsDto BANNER;

    @pmi0("cancel_info")
    public static final MarketSearchExtendedFieldsDto CANCEL_INFO;

    @pmi0("can_comment")
    public static final MarketSearchExtendedFieldsDto CAN_COMMENT;

    @pmi0("can_delete")
    public static final MarketSearchExtendedFieldsDto CAN_DELETE;

    @pmi0("can_delete_image")
    public static final MarketSearchExtendedFieldsDto CAN_DELETE_IMAGE;

    @pmi0("can_delete_with_reason")
    public static final MarketSearchExtendedFieldsDto CAN_DELETE_WITH_REASON;

    @pmi0("can_edit")
    public static final MarketSearchExtendedFieldsDto CAN_EDIT;

    @pmi0("can_recover")
    public static final MarketSearchExtendedFieldsDto CAN_RECOVER;

    @pmi0("can_repost")
    public static final MarketSearchExtendedFieldsDto CAN_REPOST;

    @pmi0("can_show_convert_to_service")
    public static final MarketSearchExtendedFieldsDto CAN_SHOW_CONVERT_TO_SERVICE;

    @pmi0("characteristics")
    public static final MarketSearchExtendedFieldsDto CHARACTERISTICS;
    public static final Parcelable.Creator<MarketSearchExtendedFieldsDto> CREATOR;

    @pmi0("custom_buttons")
    public static final MarketSearchExtendedFieldsDto CUSTOM_BUTTONS;

    @pmi0("delivery_methods_info")
    public static final MarketSearchExtendedFieldsDto DELIVERY_METHODS_INFO;

    @pmi0("dimensions")
    public static final MarketSearchExtendedFieldsDto DIMENSIONS;

    @pmi0("group")
    public static final MarketSearchExtendedFieldsDto GROUP;

    @pmi0("integration_info")
    public static final MarketSearchExtendedFieldsDto INTEGRATION_INFO;

    @pmi0("labels")
    public static final MarketSearchExtendedFieldsDto LABELS;

    @pmi0("likes")
    public static final MarketSearchExtendedFieldsDto LIKES;

    @pmi0("orders_count")
    public static final MarketSearchExtendedFieldsDto ORDERS_COUNT;

    @pmi0("other_items")
    public static final MarketSearchExtendedFieldsDto OTHER_ITEMS;

    @pmi0("owner_info")
    public static final MarketSearchExtendedFieldsDto OWNER_INFO;

    @pmi0("photos")
    public static final MarketSearchExtendedFieldsDto PHOTOS;

    @pmi0("promotion")
    public static final MarketSearchExtendedFieldsDto PROMOTION;

    @pmi0("properties")
    public static final MarketSearchExtendedFieldsDto PROPERTIES;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    public static final MarketSearchExtendedFieldsDto RATING;

    @pmi0("reactions")
    public static final MarketSearchExtendedFieldsDto REACTIONS;

    @pmi0("reaction_set_id")
    public static final MarketSearchExtendedFieldsDto REACTION_SET_ID;

    @pmi0("reposts")
    public static final MarketSearchExtendedFieldsDto REPOSTS;

    @pmi0("show_comments")
    public static final MarketSearchExtendedFieldsDto SHOW_COMMENTS;

    @pmi0("show_reviews")
    public static final MarketSearchExtendedFieldsDto SHOW_REVIEWS;

    @pmi0("similar_items")
    public static final MarketSearchExtendedFieldsDto SIMILAR_ITEMS;

    @pmi0("user_agreement_info")
    public static final MarketSearchExtendedFieldsDto USER_AGREEMENT_INFO;

    @pmi0("variants")
    public static final MarketSearchExtendedFieldsDto VARIANTS;

    @pmi0("variants_grid")
    public static final MarketSearchExtendedFieldsDto VARIANTS_GRID;

    @pmi0("videos")
    public static final MarketSearchExtendedFieldsDto VIDEOS;

    @pmi0("views_count")
    public static final MarketSearchExtendedFieldsDto VIEWS_COUNT;

    @pmi0("vk_pay_discount")
    public static final MarketSearchExtendedFieldsDto VK_PAY_DISCOUNT;

    @pmi0("weight")
    public static final MarketSearchExtendedFieldsDto WEIGHT;

    @pmi0("wishlist_item_id")
    public static final MarketSearchExtendedFieldsDto WISHLIST_ITEM_ID;
    private final String value;

    /* compiled from: MarketSearchExtendedFieldsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchExtendedFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedFieldsDto createFromParcel(Parcel parcel) {
            return MarketSearchExtendedFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedFieldsDto[] newArray(int i) {
            return new MarketSearchExtendedFieldsDto[i];
        }
    }

    static {
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto = new MarketSearchExtendedFieldsDto("ACTION_BUTTONS", 0, "action_buttons");
        ACTION_BUTTONS = marketSearchExtendedFieldsDto;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto2 = new MarketSearchExtendedFieldsDto("AD_ID", 1, "ad_id");
        AD_ID = marketSearchExtendedFieldsDto2;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto3 = new MarketSearchExtendedFieldsDto("ADDRESSES", 2, "addresses");
        ADDRESSES = marketSearchExtendedFieldsDto3;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto4 = new MarketSearchExtendedFieldsDto("ADS_LABEL", 3, "ads_label");
        ADS_LABEL = marketSearchExtendedFieldsDto4;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto5 = new MarketSearchExtendedFieldsDto("ALBUMS_IDS", 4, "albums_ids");
        ALBUMS_IDS = marketSearchExtendedFieldsDto5;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto6 = new MarketSearchExtendedFieldsDto("BANNER", 5, "banner");
        BANNER = marketSearchExtendedFieldsDto6;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto7 = new MarketSearchExtendedFieldsDto("CAN_COMMENT", 6, "can_comment");
        CAN_COMMENT = marketSearchExtendedFieldsDto7;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto8 = new MarketSearchExtendedFieldsDto("CAN_DELETE", 7, "can_delete");
        CAN_DELETE = marketSearchExtendedFieldsDto8;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto9 = new MarketSearchExtendedFieldsDto("CAN_DELETE_IMAGE", 8, "can_delete_image");
        CAN_DELETE_IMAGE = marketSearchExtendedFieldsDto9;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto10 = new MarketSearchExtendedFieldsDto("CAN_DELETE_WITH_REASON", 9, "can_delete_with_reason");
        CAN_DELETE_WITH_REASON = marketSearchExtendedFieldsDto10;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto11 = new MarketSearchExtendedFieldsDto("CAN_EDIT", 10, "can_edit");
        CAN_EDIT = marketSearchExtendedFieldsDto11;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto12 = new MarketSearchExtendedFieldsDto("CAN_RECOVER", 11, "can_recover");
        CAN_RECOVER = marketSearchExtendedFieldsDto12;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto13 = new MarketSearchExtendedFieldsDto("CAN_REPOST", 12, "can_repost");
        CAN_REPOST = marketSearchExtendedFieldsDto13;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto14 = new MarketSearchExtendedFieldsDto("CAN_SHOW_CONVERT_TO_SERVICE", 13, "can_show_convert_to_service");
        CAN_SHOW_CONVERT_TO_SERVICE = marketSearchExtendedFieldsDto14;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto15 = new MarketSearchExtendedFieldsDto("CANCEL_INFO", 14, "cancel_info");
        CANCEL_INFO = marketSearchExtendedFieldsDto15;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto16 = new MarketSearchExtendedFieldsDto("CHARACTERISTICS", 15, "characteristics");
        CHARACTERISTICS = marketSearchExtendedFieldsDto16;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto17 = new MarketSearchExtendedFieldsDto("CUSTOM_BUTTONS", 16, "custom_buttons");
        CUSTOM_BUTTONS = marketSearchExtendedFieldsDto17;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto18 = new MarketSearchExtendedFieldsDto("DELIVERY_METHODS_INFO", 17, "delivery_methods_info");
        DELIVERY_METHODS_INFO = marketSearchExtendedFieldsDto18;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto19 = new MarketSearchExtendedFieldsDto("DIMENSIONS", 18, "dimensions");
        DIMENSIONS = marketSearchExtendedFieldsDto19;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto20 = new MarketSearchExtendedFieldsDto("GROUP", 19, "group");
        GROUP = marketSearchExtendedFieldsDto20;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto21 = new MarketSearchExtendedFieldsDto("LABELS", 20, "labels");
        LABELS = marketSearchExtendedFieldsDto21;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto22 = new MarketSearchExtendedFieldsDto("LIKES", 21, "likes");
        LIKES = marketSearchExtendedFieldsDto22;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto23 = new MarketSearchExtendedFieldsDto("ORDERS_COUNT", 22, "orders_count");
        ORDERS_COUNT = marketSearchExtendedFieldsDto23;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto24 = new MarketSearchExtendedFieldsDto("OTHER_ITEMS", 23, "other_items");
        OTHER_ITEMS = marketSearchExtendedFieldsDto24;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto25 = new MarketSearchExtendedFieldsDto("OWNER_INFO", 24, "owner_info");
        OWNER_INFO = marketSearchExtendedFieldsDto25;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto26 = new MarketSearchExtendedFieldsDto("PHOTOS", 25, "photos");
        PHOTOS = marketSearchExtendedFieldsDto26;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto27 = new MarketSearchExtendedFieldsDto("PROMOTION", 26, "promotion");
        PROMOTION = marketSearchExtendedFieldsDto27;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto28 = new MarketSearchExtendedFieldsDto("PROPERTIES", 27, "properties");
        PROPERTIES = marketSearchExtendedFieldsDto28;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto29 = new MarketSearchExtendedFieldsDto(NativeAdContent.ViewTag.RATING, 28, CampaignEx.JSON_KEY_STAR);
        RATING = marketSearchExtendedFieldsDto29;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto30 = new MarketSearchExtendedFieldsDto("REACTION_SET_ID", 29, "reaction_set_id");
        REACTION_SET_ID = marketSearchExtendedFieldsDto30;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto31 = new MarketSearchExtendedFieldsDto("REACTIONS", 30, "reactions");
        REACTIONS = marketSearchExtendedFieldsDto31;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto32 = new MarketSearchExtendedFieldsDto("REPOSTS", 31, "reposts");
        REPOSTS = marketSearchExtendedFieldsDto32;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto33 = new MarketSearchExtendedFieldsDto("SHOW_COMMENTS", 32, "show_comments");
        SHOW_COMMENTS = marketSearchExtendedFieldsDto33;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto34 = new MarketSearchExtendedFieldsDto("SHOW_REVIEWS", 33, "show_reviews");
        SHOW_REVIEWS = marketSearchExtendedFieldsDto34;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto35 = new MarketSearchExtendedFieldsDto("SIMILAR_ITEMS", 34, "similar_items");
        SIMILAR_ITEMS = marketSearchExtendedFieldsDto35;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto36 = new MarketSearchExtendedFieldsDto("USER_AGREEMENT_INFO", 35, "user_agreement_info");
        USER_AGREEMENT_INFO = marketSearchExtendedFieldsDto36;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto37 = new MarketSearchExtendedFieldsDto("VARIANTS", 36, "variants");
        VARIANTS = marketSearchExtendedFieldsDto37;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto38 = new MarketSearchExtendedFieldsDto("VARIANTS_GRID", 37, "variants_grid");
        VARIANTS_GRID = marketSearchExtendedFieldsDto38;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto39 = new MarketSearchExtendedFieldsDto("VIDEOS", 38, "videos");
        VIDEOS = marketSearchExtendedFieldsDto39;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto40 = new MarketSearchExtendedFieldsDto("VIEWS_COUNT", 39, "views_count");
        VIEWS_COUNT = marketSearchExtendedFieldsDto40;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto41 = new MarketSearchExtendedFieldsDto("VK_PAY_DISCOUNT", 40, "vk_pay_discount");
        VK_PAY_DISCOUNT = marketSearchExtendedFieldsDto41;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto42 = new MarketSearchExtendedFieldsDto("WEIGHT", 41, "weight");
        WEIGHT = marketSearchExtendedFieldsDto42;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto43 = new MarketSearchExtendedFieldsDto("WISHLIST_ITEM_ID", 42, "wishlist_item_id");
        WISHLIST_ITEM_ID = marketSearchExtendedFieldsDto43;
        MarketSearchExtendedFieldsDto marketSearchExtendedFieldsDto44 = new MarketSearchExtendedFieldsDto("INTEGRATION_INFO", 43, "integration_info");
        INTEGRATION_INFO = marketSearchExtendedFieldsDto44;
        MarketSearchExtendedFieldsDto[] marketSearchExtendedFieldsDtoArr = {marketSearchExtendedFieldsDto, marketSearchExtendedFieldsDto2, marketSearchExtendedFieldsDto3, marketSearchExtendedFieldsDto4, marketSearchExtendedFieldsDto5, marketSearchExtendedFieldsDto6, marketSearchExtendedFieldsDto7, marketSearchExtendedFieldsDto8, marketSearchExtendedFieldsDto9, marketSearchExtendedFieldsDto10, marketSearchExtendedFieldsDto11, marketSearchExtendedFieldsDto12, marketSearchExtendedFieldsDto13, marketSearchExtendedFieldsDto14, marketSearchExtendedFieldsDto15, marketSearchExtendedFieldsDto16, marketSearchExtendedFieldsDto17, marketSearchExtendedFieldsDto18, marketSearchExtendedFieldsDto19, marketSearchExtendedFieldsDto20, marketSearchExtendedFieldsDto21, marketSearchExtendedFieldsDto22, marketSearchExtendedFieldsDto23, marketSearchExtendedFieldsDto24, marketSearchExtendedFieldsDto25, marketSearchExtendedFieldsDto26, marketSearchExtendedFieldsDto27, marketSearchExtendedFieldsDto28, marketSearchExtendedFieldsDto29, marketSearchExtendedFieldsDto30, marketSearchExtendedFieldsDto31, marketSearchExtendedFieldsDto32, marketSearchExtendedFieldsDto33, marketSearchExtendedFieldsDto34, marketSearchExtendedFieldsDto35, marketSearchExtendedFieldsDto36, marketSearchExtendedFieldsDto37, marketSearchExtendedFieldsDto38, marketSearchExtendedFieldsDto39, marketSearchExtendedFieldsDto40, marketSearchExtendedFieldsDto41, marketSearchExtendedFieldsDto42, marketSearchExtendedFieldsDto43, marketSearchExtendedFieldsDto44};
        $VALUES = marketSearchExtendedFieldsDtoArr;
        $ENTRIES = new asp(marketSearchExtendedFieldsDtoArr);
        CREATOR = new a();
    }

    private MarketSearchExtendedFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketSearchExtendedFieldsDto valueOf(String str) {
        return (MarketSearchExtendedFieldsDto) Enum.valueOf(MarketSearchExtendedFieldsDto.class, str);
    }

    public static MarketSearchExtendedFieldsDto[] values() {
        return (MarketSearchExtendedFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
