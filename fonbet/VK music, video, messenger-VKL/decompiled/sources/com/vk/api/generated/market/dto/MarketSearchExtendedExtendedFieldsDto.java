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
/* compiled from: MarketSearchExtendedExtendedFieldsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchExtendedExtendedFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchExtendedExtendedFieldsDto[] $VALUES;

    @pmi0("action_buttons")
    public static final MarketSearchExtendedExtendedFieldsDto ACTION_BUTTONS;

    @pmi0("addresses")
    public static final MarketSearchExtendedExtendedFieldsDto ADDRESSES;

    @pmi0("ads_label")
    public static final MarketSearchExtendedExtendedFieldsDto ADS_LABEL;

    @pmi0("ad_id")
    public static final MarketSearchExtendedExtendedFieldsDto AD_ID;

    @pmi0("albums_ids")
    public static final MarketSearchExtendedExtendedFieldsDto ALBUMS_IDS;

    @pmi0("banner")
    public static final MarketSearchExtendedExtendedFieldsDto BANNER;

    @pmi0("cancel_info")
    public static final MarketSearchExtendedExtendedFieldsDto CANCEL_INFO;

    @pmi0("can_comment")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_COMMENT;

    @pmi0("can_delete")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_DELETE;

    @pmi0("can_delete_image")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_DELETE_IMAGE;

    @pmi0("can_delete_with_reason")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_DELETE_WITH_REASON;

    @pmi0("can_edit")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_EDIT;

    @pmi0("can_recover")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_RECOVER;

    @pmi0("can_repost")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_REPOST;

    @pmi0("can_show_convert_to_service")
    public static final MarketSearchExtendedExtendedFieldsDto CAN_SHOW_CONVERT_TO_SERVICE;

    @pmi0("characteristics")
    public static final MarketSearchExtendedExtendedFieldsDto CHARACTERISTICS;
    public static final Parcelable.Creator<MarketSearchExtendedExtendedFieldsDto> CREATOR;

    @pmi0("custom_buttons")
    public static final MarketSearchExtendedExtendedFieldsDto CUSTOM_BUTTONS;

    @pmi0("delivery_methods_info")
    public static final MarketSearchExtendedExtendedFieldsDto DELIVERY_METHODS_INFO;

    @pmi0("dimensions")
    public static final MarketSearchExtendedExtendedFieldsDto DIMENSIONS;

    @pmi0("group")
    public static final MarketSearchExtendedExtendedFieldsDto GROUP;

    @pmi0("integration_info")
    public static final MarketSearchExtendedExtendedFieldsDto INTEGRATION_INFO;

    @pmi0("labels")
    public static final MarketSearchExtendedExtendedFieldsDto LABELS;

    @pmi0("likes")
    public static final MarketSearchExtendedExtendedFieldsDto LIKES;

    @pmi0("orders_count")
    public static final MarketSearchExtendedExtendedFieldsDto ORDERS_COUNT;

    @pmi0("other_items")
    public static final MarketSearchExtendedExtendedFieldsDto OTHER_ITEMS;

    @pmi0("owner_info")
    public static final MarketSearchExtendedExtendedFieldsDto OWNER_INFO;

    @pmi0("photos")
    public static final MarketSearchExtendedExtendedFieldsDto PHOTOS;

    @pmi0("promotion")
    public static final MarketSearchExtendedExtendedFieldsDto PROMOTION;

    @pmi0("properties")
    public static final MarketSearchExtendedExtendedFieldsDto PROPERTIES;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    public static final MarketSearchExtendedExtendedFieldsDto RATING;

    @pmi0("reactions")
    public static final MarketSearchExtendedExtendedFieldsDto REACTIONS;

    @pmi0("reaction_set_id")
    public static final MarketSearchExtendedExtendedFieldsDto REACTION_SET_ID;

    @pmi0("reposts")
    public static final MarketSearchExtendedExtendedFieldsDto REPOSTS;

    @pmi0("show_comments")
    public static final MarketSearchExtendedExtendedFieldsDto SHOW_COMMENTS;

    @pmi0("show_reviews")
    public static final MarketSearchExtendedExtendedFieldsDto SHOW_REVIEWS;

    @pmi0("similar_items")
    public static final MarketSearchExtendedExtendedFieldsDto SIMILAR_ITEMS;

    @pmi0("user_agreement_info")
    public static final MarketSearchExtendedExtendedFieldsDto USER_AGREEMENT_INFO;

    @pmi0("variants")
    public static final MarketSearchExtendedExtendedFieldsDto VARIANTS;

    @pmi0("variants_grid")
    public static final MarketSearchExtendedExtendedFieldsDto VARIANTS_GRID;

    @pmi0("videos")
    public static final MarketSearchExtendedExtendedFieldsDto VIDEOS;

    @pmi0("views_count")
    public static final MarketSearchExtendedExtendedFieldsDto VIEWS_COUNT;

    @pmi0("vk_pay_discount")
    public static final MarketSearchExtendedExtendedFieldsDto VK_PAY_DISCOUNT;

    @pmi0("weight")
    public static final MarketSearchExtendedExtendedFieldsDto WEIGHT;

    @pmi0("wishlist_item_id")
    public static final MarketSearchExtendedExtendedFieldsDto WISHLIST_ITEM_ID;
    private final String value;

    /* compiled from: MarketSearchExtendedExtendedFieldsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchExtendedExtendedFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedExtendedFieldsDto createFromParcel(Parcel parcel) {
            return MarketSearchExtendedExtendedFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedExtendedFieldsDto[] newArray(int i) {
            return new MarketSearchExtendedExtendedFieldsDto[i];
        }
    }

    static {
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto = new MarketSearchExtendedExtendedFieldsDto("ACTION_BUTTONS", 0, "action_buttons");
        ACTION_BUTTONS = marketSearchExtendedExtendedFieldsDto;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto2 = new MarketSearchExtendedExtendedFieldsDto("AD_ID", 1, "ad_id");
        AD_ID = marketSearchExtendedExtendedFieldsDto2;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto3 = new MarketSearchExtendedExtendedFieldsDto("ADDRESSES", 2, "addresses");
        ADDRESSES = marketSearchExtendedExtendedFieldsDto3;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto4 = new MarketSearchExtendedExtendedFieldsDto("ADS_LABEL", 3, "ads_label");
        ADS_LABEL = marketSearchExtendedExtendedFieldsDto4;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto5 = new MarketSearchExtendedExtendedFieldsDto("ALBUMS_IDS", 4, "albums_ids");
        ALBUMS_IDS = marketSearchExtendedExtendedFieldsDto5;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto6 = new MarketSearchExtendedExtendedFieldsDto("BANNER", 5, "banner");
        BANNER = marketSearchExtendedExtendedFieldsDto6;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto7 = new MarketSearchExtendedExtendedFieldsDto("CAN_COMMENT", 6, "can_comment");
        CAN_COMMENT = marketSearchExtendedExtendedFieldsDto7;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto8 = new MarketSearchExtendedExtendedFieldsDto("CAN_DELETE", 7, "can_delete");
        CAN_DELETE = marketSearchExtendedExtendedFieldsDto8;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto9 = new MarketSearchExtendedExtendedFieldsDto("CAN_DELETE_IMAGE", 8, "can_delete_image");
        CAN_DELETE_IMAGE = marketSearchExtendedExtendedFieldsDto9;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto10 = new MarketSearchExtendedExtendedFieldsDto("CAN_DELETE_WITH_REASON", 9, "can_delete_with_reason");
        CAN_DELETE_WITH_REASON = marketSearchExtendedExtendedFieldsDto10;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto11 = new MarketSearchExtendedExtendedFieldsDto("CAN_EDIT", 10, "can_edit");
        CAN_EDIT = marketSearchExtendedExtendedFieldsDto11;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto12 = new MarketSearchExtendedExtendedFieldsDto("CAN_RECOVER", 11, "can_recover");
        CAN_RECOVER = marketSearchExtendedExtendedFieldsDto12;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto13 = new MarketSearchExtendedExtendedFieldsDto("CAN_REPOST", 12, "can_repost");
        CAN_REPOST = marketSearchExtendedExtendedFieldsDto13;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto14 = new MarketSearchExtendedExtendedFieldsDto("CAN_SHOW_CONVERT_TO_SERVICE", 13, "can_show_convert_to_service");
        CAN_SHOW_CONVERT_TO_SERVICE = marketSearchExtendedExtendedFieldsDto14;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto15 = new MarketSearchExtendedExtendedFieldsDto("CANCEL_INFO", 14, "cancel_info");
        CANCEL_INFO = marketSearchExtendedExtendedFieldsDto15;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto16 = new MarketSearchExtendedExtendedFieldsDto("CHARACTERISTICS", 15, "characteristics");
        CHARACTERISTICS = marketSearchExtendedExtendedFieldsDto16;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto17 = new MarketSearchExtendedExtendedFieldsDto("CUSTOM_BUTTONS", 16, "custom_buttons");
        CUSTOM_BUTTONS = marketSearchExtendedExtendedFieldsDto17;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto18 = new MarketSearchExtendedExtendedFieldsDto("DELIVERY_METHODS_INFO", 17, "delivery_methods_info");
        DELIVERY_METHODS_INFO = marketSearchExtendedExtendedFieldsDto18;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto19 = new MarketSearchExtendedExtendedFieldsDto("DIMENSIONS", 18, "dimensions");
        DIMENSIONS = marketSearchExtendedExtendedFieldsDto19;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto20 = new MarketSearchExtendedExtendedFieldsDto("GROUP", 19, "group");
        GROUP = marketSearchExtendedExtendedFieldsDto20;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto21 = new MarketSearchExtendedExtendedFieldsDto("LABELS", 20, "labels");
        LABELS = marketSearchExtendedExtendedFieldsDto21;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto22 = new MarketSearchExtendedExtendedFieldsDto("LIKES", 21, "likes");
        LIKES = marketSearchExtendedExtendedFieldsDto22;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto23 = new MarketSearchExtendedExtendedFieldsDto("ORDERS_COUNT", 22, "orders_count");
        ORDERS_COUNT = marketSearchExtendedExtendedFieldsDto23;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto24 = new MarketSearchExtendedExtendedFieldsDto("OTHER_ITEMS", 23, "other_items");
        OTHER_ITEMS = marketSearchExtendedExtendedFieldsDto24;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto25 = new MarketSearchExtendedExtendedFieldsDto("OWNER_INFO", 24, "owner_info");
        OWNER_INFO = marketSearchExtendedExtendedFieldsDto25;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto26 = new MarketSearchExtendedExtendedFieldsDto("PHOTOS", 25, "photos");
        PHOTOS = marketSearchExtendedExtendedFieldsDto26;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto27 = new MarketSearchExtendedExtendedFieldsDto("PROMOTION", 26, "promotion");
        PROMOTION = marketSearchExtendedExtendedFieldsDto27;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto28 = new MarketSearchExtendedExtendedFieldsDto("PROPERTIES", 27, "properties");
        PROPERTIES = marketSearchExtendedExtendedFieldsDto28;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto29 = new MarketSearchExtendedExtendedFieldsDto(NativeAdContent.ViewTag.RATING, 28, CampaignEx.JSON_KEY_STAR);
        RATING = marketSearchExtendedExtendedFieldsDto29;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto30 = new MarketSearchExtendedExtendedFieldsDto("REACTION_SET_ID", 29, "reaction_set_id");
        REACTION_SET_ID = marketSearchExtendedExtendedFieldsDto30;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto31 = new MarketSearchExtendedExtendedFieldsDto("REACTIONS", 30, "reactions");
        REACTIONS = marketSearchExtendedExtendedFieldsDto31;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto32 = new MarketSearchExtendedExtendedFieldsDto("REPOSTS", 31, "reposts");
        REPOSTS = marketSearchExtendedExtendedFieldsDto32;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto33 = new MarketSearchExtendedExtendedFieldsDto("SHOW_COMMENTS", 32, "show_comments");
        SHOW_COMMENTS = marketSearchExtendedExtendedFieldsDto33;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto34 = new MarketSearchExtendedExtendedFieldsDto("SHOW_REVIEWS", 33, "show_reviews");
        SHOW_REVIEWS = marketSearchExtendedExtendedFieldsDto34;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto35 = new MarketSearchExtendedExtendedFieldsDto("SIMILAR_ITEMS", 34, "similar_items");
        SIMILAR_ITEMS = marketSearchExtendedExtendedFieldsDto35;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto36 = new MarketSearchExtendedExtendedFieldsDto("USER_AGREEMENT_INFO", 35, "user_agreement_info");
        USER_AGREEMENT_INFO = marketSearchExtendedExtendedFieldsDto36;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto37 = new MarketSearchExtendedExtendedFieldsDto("VARIANTS", 36, "variants");
        VARIANTS = marketSearchExtendedExtendedFieldsDto37;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto38 = new MarketSearchExtendedExtendedFieldsDto("VARIANTS_GRID", 37, "variants_grid");
        VARIANTS_GRID = marketSearchExtendedExtendedFieldsDto38;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto39 = new MarketSearchExtendedExtendedFieldsDto("VIDEOS", 38, "videos");
        VIDEOS = marketSearchExtendedExtendedFieldsDto39;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto40 = new MarketSearchExtendedExtendedFieldsDto("VIEWS_COUNT", 39, "views_count");
        VIEWS_COUNT = marketSearchExtendedExtendedFieldsDto40;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto41 = new MarketSearchExtendedExtendedFieldsDto("VK_PAY_DISCOUNT", 40, "vk_pay_discount");
        VK_PAY_DISCOUNT = marketSearchExtendedExtendedFieldsDto41;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto42 = new MarketSearchExtendedExtendedFieldsDto("WEIGHT", 41, "weight");
        WEIGHT = marketSearchExtendedExtendedFieldsDto42;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto43 = new MarketSearchExtendedExtendedFieldsDto("WISHLIST_ITEM_ID", 42, "wishlist_item_id");
        WISHLIST_ITEM_ID = marketSearchExtendedExtendedFieldsDto43;
        MarketSearchExtendedExtendedFieldsDto marketSearchExtendedExtendedFieldsDto44 = new MarketSearchExtendedExtendedFieldsDto("INTEGRATION_INFO", 43, "integration_info");
        INTEGRATION_INFO = marketSearchExtendedExtendedFieldsDto44;
        MarketSearchExtendedExtendedFieldsDto[] marketSearchExtendedExtendedFieldsDtoArr = {marketSearchExtendedExtendedFieldsDto, marketSearchExtendedExtendedFieldsDto2, marketSearchExtendedExtendedFieldsDto3, marketSearchExtendedExtendedFieldsDto4, marketSearchExtendedExtendedFieldsDto5, marketSearchExtendedExtendedFieldsDto6, marketSearchExtendedExtendedFieldsDto7, marketSearchExtendedExtendedFieldsDto8, marketSearchExtendedExtendedFieldsDto9, marketSearchExtendedExtendedFieldsDto10, marketSearchExtendedExtendedFieldsDto11, marketSearchExtendedExtendedFieldsDto12, marketSearchExtendedExtendedFieldsDto13, marketSearchExtendedExtendedFieldsDto14, marketSearchExtendedExtendedFieldsDto15, marketSearchExtendedExtendedFieldsDto16, marketSearchExtendedExtendedFieldsDto17, marketSearchExtendedExtendedFieldsDto18, marketSearchExtendedExtendedFieldsDto19, marketSearchExtendedExtendedFieldsDto20, marketSearchExtendedExtendedFieldsDto21, marketSearchExtendedExtendedFieldsDto22, marketSearchExtendedExtendedFieldsDto23, marketSearchExtendedExtendedFieldsDto24, marketSearchExtendedExtendedFieldsDto25, marketSearchExtendedExtendedFieldsDto26, marketSearchExtendedExtendedFieldsDto27, marketSearchExtendedExtendedFieldsDto28, marketSearchExtendedExtendedFieldsDto29, marketSearchExtendedExtendedFieldsDto30, marketSearchExtendedExtendedFieldsDto31, marketSearchExtendedExtendedFieldsDto32, marketSearchExtendedExtendedFieldsDto33, marketSearchExtendedExtendedFieldsDto34, marketSearchExtendedExtendedFieldsDto35, marketSearchExtendedExtendedFieldsDto36, marketSearchExtendedExtendedFieldsDto37, marketSearchExtendedExtendedFieldsDto38, marketSearchExtendedExtendedFieldsDto39, marketSearchExtendedExtendedFieldsDto40, marketSearchExtendedExtendedFieldsDto41, marketSearchExtendedExtendedFieldsDto42, marketSearchExtendedExtendedFieldsDto43, marketSearchExtendedExtendedFieldsDto44};
        $VALUES = marketSearchExtendedExtendedFieldsDtoArr;
        $ENTRIES = new asp(marketSearchExtendedExtendedFieldsDtoArr);
        CREATOR = new a();
    }

    private MarketSearchExtendedExtendedFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketSearchExtendedExtendedFieldsDto valueOf(String str) {
        return (MarketSearchExtendedExtendedFieldsDto) Enum.valueOf(MarketSearchExtendedExtendedFieldsDto.class, str);
    }

    public static MarketSearchExtendedExtendedFieldsDto[] values() {
        return (MarketSearchExtendedExtendedFieldsDto[]) $VALUES.clone();
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
