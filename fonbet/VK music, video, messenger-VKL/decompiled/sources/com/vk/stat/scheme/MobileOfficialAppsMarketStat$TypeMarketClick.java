package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.net.NetError;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketClick implements SchemeStat$TypeClick.b {

    @pmi0("analytics_version")
    private final Integer analyticsVersion;

    @pmi0("previous_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen previousScreen;

    @pmi0("ref_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen refScreen;

    @pmi0("ref_source")
    private final CommonMarketStat$TypeRefSource refSource;

    @pmi0("source_url")
    private final String sourceUrl;

    @pmi0("traffic_source")
    private final CommonMarketStat$TypeTrafficSource trafficSource;

    @pmi0("type")
    private final Type type;

    @pmi0("type_market_add_item_to_bookmarks")
    private final MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem typeMarketAddItemToBookmarks;

    @pmi0("type_market_add_items_to_video_click")
    private final CommonMarketStat$TypeMarketAddItemsToVideoClickItem typeMarketAddItemsToVideoClick;

    @pmi0("type_market_carousel_add_item_to_bookmarks")
    private final MobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks typeMarketCarouselAddItemToBookmarks;

    @pmi0("type_market_carousel_click_show_all_items")
    private final MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems typeMarketCarouselClickShowAllItems;

    @pmi0("type_market_carousel_remove_item_from_bookmarks")
    private final MobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks typeMarketCarouselRemoveItemFromBookmarks;

    @pmi0("type_market_carousel_transition_to_item")
    private final MobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem typeMarketCarouselTransitionToItem;

    @pmi0("type_market_carts_item")
    private final CommonMarketStat$TypeMarketCartsItem typeMarketCartsItem;

    @pmi0("type_market_change_items_to_video_click")
    private final CommonMarketStat$TypeMarketChangeItemsToVideoClickItem typeMarketChangeItemsToVideoClick;

    @pmi0("type_market_checkout_fill_profile_data")
    private final CommonMarketStat$TypeMarketCheckoutFillProfileData typeMarketCheckoutFillProfileData;

    @pmi0("type_market_clear_cart")
    private final m typeMarketClearCart;

    @pmi0("type_market_click_open_all_item_variants")
    private final CommonMarketStat$TypeMarketClickOpenAllItemVariantsItem typeMarketClickOpenAllItemVariants;

    @pmi0("type_market_copy_link_click")
    private final MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem typeMarketCopyLinkClick;

    @pmi0("type_market_cta_button_click")
    private final MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem typeMarketCtaButtonClick;

    @pmi0("type_market_delivery_block_click")
    private final CommonMarketStat$TypeMarketDeliveryBlockClickItem typeMarketDeliveryBlockClick;

    @pmi0("type_market_end_edit_item")
    private final CommonMarketStat$TypeMarketEndEditItem typeMarketEndEditItem;

    @pmi0("type_market_fomo_label_click")
    private final CommonMarketStat$TypeMarketFomoLabelClickItem typeMarketFomoLabelClick;

    @pmi0("type_market_hide_collection")
    private final MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem typeMarketHideCollection;

    @pmi0("type_market_hide_item")
    private final MobileOfficialAppsMarketStat$TypeMarketHideItemItem typeMarketHideItem;

    @pmi0("type_market_item_picker")
    private final CommonMarketStat$TypeMarketItemPicker typeMarketItemPicker;

    @pmi0("type_market_item_rating_click")
    private final CommonMarketStat$TypeMarketItemRatingItem typeMarketItemRatingClick;

    @pmi0("type_market_make_order_from_cart")
    private final CommonMarketStat$TypeMarketMakeOrderFromCart typeMarketMakeOrderFromCart;

    @pmi0("type_market_moderation_button_click")
    private final MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem typeMarketModerationButtonClick;

    @pmi0("type_market_open_items_from_video_click")
    private final CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem typeMarketOpenItemsFromVideoClick;

    @pmi0("type_market_open_items_modal")
    private final MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem typeMarketOpenItemsModal;

    @pmi0("type_market_open_market_album")
    private final o typeMarketOpenMarketAlbum;

    @pmi0("type_market_open_purchase_info")
    private final p typeMarketOpenPurchaseInfo;

    @pmi0("type_market_open_section_click")
    private final MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem typeMarketOpenSectionClick;

    @pmi0("type_market_orders_item")
    private final CommonMarketStat$TypeMarketOrdersItem typeMarketOrdersItem;

    @pmi0("type_market_pagination_in_product_tile")
    private final CommonMarketStat$TypeMarketPaginationInProductTile typeMarketPaginationInProductTile;

    @pmi0("type_market_pin_community_review_cancel_pinned_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem typeMarketPinCommunityReviewCancelPinnedClick;

    @pmi0("type_market_pin_community_review_left_active_pinned_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem typeMarketPinCommunityReviewLeftActivePinnedClick;

    @pmi0("type_market_pin_community_review_manage_pinned_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem typeMarketPinCommunityReviewManagePinnedClick;

    @pmi0("type_market_pin_community_review_pin_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem typeMarketPinCommunityReviewPinClick;

    @pmi0("type_market_pin_community_review_popup_error_pin_try_again_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem typeMarketPinCommunityReviewPopupErrorPinTryAgainClick;

    @pmi0("type_market_pin_community_review_popup_error_unpin_try_again_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem typeMarketPinCommunityReviewPopupErrorUnpinTryAgainClick;

    @pmi0("type_market_pin_community_review_popup_manage_pinned_cancel_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem typeMarketPinCommunityReviewPopupManagePinnedCancelClick;

    @pmi0("type_market_pin_community_review_popup_manage_pinned_resume_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem typeMarketPinCommunityReviewPopupManagePinnedResumeClick;

    @pmi0("type_market_pin_community_review_popup_pin_for_money_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem typeMarketPinCommunityReviewPopupPinForMoneyClick;

    @pmi0("type_market_pin_community_review_popup_vkpay_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem typeMarketPinCommunityReviewPopupVkpayClick;

    @pmi0("type_market_pin_community_review_repin_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem typeMarketPinCommunityReviewRepinClick;

    @pmi0("type_market_pin_community_review_resume_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem typeMarketPinCommunityReviewResumeClick;

    @pmi0("type_market_pin_community_review_unpin_click")
    private final CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem typeMarketPinCommunityReviewUnpinClick;

    @pmi0("type_market_play_item_video")
    private final CommonMarketStat$TypeMarketPlayItemVideoItem typeMarketPlayItemVideo;

    @pmi0("type_market_remove_item_from_bookmark")
    private final MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem typeMarketRemoveItemFromBookmark;

    @pmi0("type_market_search_click")
    private final g0 typeMarketSearchClick;

    @pmi0("type_market_send_message_to_owner_click")
    private final MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem typeMarketSendMessageToOwnerClick;

    @pmi0("type_market_subscribe_market_button_click")
    private final MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem typeMarketSubscribeMarketButtonClick;

    @pmi0("type_market_switch_item_variant")
    private final CommonMarketStat$TypeMarketSwitchItemVariantItem typeMarketSwitchItemVariant;

    @pmi0("type_market_transition_to_ads")
    private final CommonMarketStat$TypeMarketTransitionToAds typeMarketTransitionToAds;

    @pmi0("type_market_transition_to_bookmarks")
    private final CommonMarketStat$TypeMarketTransitionToBookmarks typeMarketTransitionToBookmarks;

    @pmi0("type_market_transition_to_categories_menu")
    private final CommonMarketStat$TypeMarketTransitionToCategoriesMenu typeMarketTransitionToCategoriesMenu;

    @pmi0("type_market_transition_to_collection")
    private final MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem typeMarketTransitionToCollection;

    @pmi0("type_market_transition_to_item")
    private final MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem typeMarketTransitionToItem;

    @pmi0("type_market_transition_to_linked_content")
    private final CommonMarketStat$TypeMarketTransitionToLinkedContent typeMarketTransitionToLinkedContent;

    @pmi0("type_market_transition_to_linked_content_block")
    private final q typeMarketTransitionToLinkedContentBlock;

    @pmi0("type_market_transition_to_market")
    private final MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem typeMarketTransitionToMarket;

    @pmi0("type_market_transition_to_owner")
    private final MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem typeMarketTransitionToOwner;

    @pmi0("type_market_transition_to_ozon_reviews")
    private final CommonMarketStat$TypeMarketTransitionToOzonReviewsItem typeMarketTransitionToOzonReviews;

    @pmi0("type_market_transition_to_profile")
    private final CommonMarketStat$TypeMarketTransitionToProfile typeMarketTransitionToProfile;

    @pmi0("type_market_transition_to_similars")
    private final MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem typeMarketTransitionToSimilars;

    @pmi0("type_market_transition_to_wishlists")
    private final CommonMarketStat$TypeMarketTransitionToWishlists typeMarketTransitionToWishlists;

    @pmi0("type_marketplace_add_to_bookmarks_click")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick typeMarketplaceAddToBookmarksClick;

    @pmi0("type_marketplace_item_click")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem typeMarketplaceItemClick;

    @pmi0("type_marketplace_market_click")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem typeMarketplaceMarketClick;

    @pmi0("type_marketplace_remove_from_bookmarks_click")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick typeMarketplaceRemoveFromBookmarksClick;

    @pmi0("type_marketplace_subscribe_market_button_click")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem typeMarketplaceSubscribeMarketButtonClick;

    @pmi0("type_marketplace_transition_to_block")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem typeMarketplaceTransitionToBlock;

    @pmi0("type_marketplace_transition_to_cart_click")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem typeMarketplaceTransitionToCartClick;

    @pmi0("type_marketplace_transition_to_carts_list_click")
    private final s typeMarketplaceTransitionToCartsListClick;

    @pmi0("type_marketplace_transition_to_checkout_click_item")
    private final CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem typeMarketplaceTransitionToCheckoutClickItem;

    @pmi0("type_smb_native_booking_cancel_click")
    private final CommonMarketStat$TypeSmbNativeBookingCancelClickItem typeSmbNativeBookingCancelClick;

    @pmi0("type_smb_native_booking_choose_master_click")
    private final CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem typeSmbNativeBookingChooseMasterClick;

    @pmi0("type_smb_native_booking_choose_service_click")
    private final CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem typeSmbNativeBookingChooseServiceClick;

    @pmi0("type_smb_native_booking_close_click")
    private final CommonMarketStat$TypeSmbNativeBookingCloseClickItem typeSmbNativeBookingCloseClick;

    @pmi0("type_smb_native_booking_finish_click")
    private final CommonMarketStat$TypeSmbNativeBookingFinishClickItem typeSmbNativeBookingFinishClick;

    @pmi0("type_smb_native_booking_reshedule_click")
    private final CommonMarketStat$TypeSmbNativeBookingResheduleClickItem typeSmbNativeBookingResheduleClick;

    @pmi0("type_smb_yclients_story_add_sticker_item")
    private final CommonMarketStat$TypeSmbYclientsStoryAddStickerItem typeSmbYclientsStoryAddStickerItem;

    @pmi0("type_smb_yclients_story_choose_service_click_item")
    private final CommonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem typeSmbYclientsStoryChooseServiceClickItem;

    @pmi0("type_smb_yclients_story_sticker_click_item")
    private final CommonMarketStat$TypeSmbYclientsStoryStickerClickItem typeSmbYclientsStoryStickerClickItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_marketplace_add_to_bookmarks_click")
        public static final Type TYPE_MARKETPLACE_ADD_TO_BOOKMARKS_CLICK;

        @pmi0("type_marketplace_item_click")
        public static final Type TYPE_MARKETPLACE_ITEM_CLICK;

        @pmi0("type_marketplace_market_click")
        public static final Type TYPE_MARKETPLACE_MARKET_CLICK;

        @pmi0("type_marketplace_remove_from_bookmarks_click")
        public static final Type TYPE_MARKETPLACE_REMOVE_FROM_BOOKMARKS_CLICK;

        @pmi0("type_marketplace_subscribe_market_button_click")
        public static final Type TYPE_MARKETPLACE_SUBSCRIBE_MARKET_BUTTON_CLICK;

        @pmi0("type_marketplace_transition_to_block")
        public static final Type TYPE_MARKETPLACE_TRANSITION_TO_BLOCK;

        @pmi0("type_marketplace_transition_to_carts_list_click")
        public static final Type TYPE_MARKETPLACE_TRANSITION_TO_CARTS_LIST_CLICK;

        @pmi0("type_marketplace_transition_to_cart_click")
        public static final Type TYPE_MARKETPLACE_TRANSITION_TO_CART_CLICK;

        @pmi0("type_marketplace_transition_to_checkout_click_item")
        public static final Type TYPE_MARKETPLACE_TRANSITION_TO_CHECKOUT_CLICK_ITEM;

        @pmi0("type_market_add_items_to_video_click")
        public static final Type TYPE_MARKET_ADD_ITEMS_TO_VIDEO_CLICK;

        @pmi0("type_market_add_item_to_bookmarks")
        public static final Type TYPE_MARKET_ADD_ITEM_TO_BOOKMARKS;

        @pmi0("type_market_carousel_add_item_to_bookmarks")
        public static final Type TYPE_MARKET_CAROUSEL_ADD_ITEM_TO_BOOKMARKS;

        @pmi0("type_market_carousel_click_show_all_items")
        public static final Type TYPE_MARKET_CAROUSEL_CLICK_SHOW_ALL_ITEMS;

        @pmi0("type_market_carousel_remove_item_from_bookmarks")
        public static final Type TYPE_MARKET_CAROUSEL_REMOVE_ITEM_FROM_BOOKMARKS;

        @pmi0("type_market_carousel_transition_to_item")
        public static final Type TYPE_MARKET_CAROUSEL_TRANSITION_TO_ITEM;

        @pmi0("type_market_carts_item")
        public static final Type TYPE_MARKET_CARTS_ITEM;

        @pmi0("type_market_change_items_to_video_click")
        public static final Type TYPE_MARKET_CHANGE_ITEMS_TO_VIDEO_CLICK;

        @pmi0("type_market_checkout_fill_profile_data")
        public static final Type TYPE_MARKET_CHECKOUT_FILL_PROFILE_DATA;

        @pmi0("type_market_clear_cart")
        public static final Type TYPE_MARKET_CLEAR_CART;

        @pmi0("type_market_click_open_all_item_variants")
        public static final Type TYPE_MARKET_CLICK_OPEN_ALL_ITEM_VARIANTS;

        @pmi0("type_market_copy_link_click")
        public static final Type TYPE_MARKET_COPY_LINK_CLICK;

        @pmi0("type_market_cta_button_click")
        public static final Type TYPE_MARKET_CTA_BUTTON_CLICK;

        @pmi0("type_market_delivery_block_click")
        public static final Type TYPE_MARKET_DELIVERY_BLOCK_CLICK;

        @pmi0("type_market_end_edit_item")
        public static final Type TYPE_MARKET_END_EDIT_ITEM;

        @pmi0("type_market_fomo_label_click")
        public static final Type TYPE_MARKET_FOMO_LABEL_CLICK;

        @pmi0("type_market_hide_collection")
        public static final Type TYPE_MARKET_HIDE_COLLECTION;

        @pmi0("type_market_hide_item")
        public static final Type TYPE_MARKET_HIDE_ITEM;

        @pmi0("type_market_items_control_click")
        public static final Type TYPE_MARKET_ITEMS_CONTROL_CLICK;

        @pmi0("type_market_item_picker")
        public static final Type TYPE_MARKET_ITEM_PICKER;

        @pmi0("type_market_item_rating_click")
        public static final Type TYPE_MARKET_ITEM_RATING_CLICK;

        @pmi0("type_market_make_order_from_cart")
        public static final Type TYPE_MARKET_MAKE_ORDER_FROM_CART;

        @pmi0("type_market_moderation_button_click")
        public static final Type TYPE_MARKET_MODERATION_BUTTON_CLICK;

        @pmi0("type_market_open_items_from_video_click")
        public static final Type TYPE_MARKET_OPEN_ITEMS_FROM_VIDEO_CLICK;

        @pmi0("type_market_open_items_modal")
        public static final Type TYPE_MARKET_OPEN_ITEMS_MODAL;

        @pmi0("type_market_open_market_album")
        public static final Type TYPE_MARKET_OPEN_MARKET_ALBUM;

        @pmi0("type_market_open_purchase_info")
        public static final Type TYPE_MARKET_OPEN_PURCHASE_INFO;

        @pmi0("type_market_open_section_click")
        public static final Type TYPE_MARKET_OPEN_SECTION_CLICK;

        @pmi0("type_market_orders_item")
        public static final Type TYPE_MARKET_ORDERS_ITEM;

        @pmi0("type_market_pagination_in_product_tile")
        public static final Type TYPE_MARKET_PAGINATION_IN_PRODUCT_TILE;

        @pmi0("type_market_pin_community_review_cancel_pinned_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_CANCEL_PINNED_CLICK;

        @pmi0("type_market_pin_community_review_left_active_pinned_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_LEFT_ACTIVE_PINNED_CLICK;

        @pmi0("type_market_pin_community_review_manage_pinned_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_MANAGE_PINNED_CLICK;

        @pmi0("type_market_pin_community_review_pin_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_PIN_CLICK;

        @pmi0("type_market_pin_community_review_popup_error_pin_try_again_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_TRY_AGAIN_CLICK;

        @pmi0("type_market_pin_community_review_popup_error_unpin_try_again_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_TRY_AGAIN_CLICK;

        @pmi0("type_market_pin_community_review_popup_manage_pinned_cancel_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_CANCEL_CLICK;

        @pmi0("type_market_pin_community_review_popup_manage_pinned_resume_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_RESUME_CLICK;

        @pmi0("type_market_pin_community_review_popup_pin_for_money_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_CLICK;

        @pmi0("type_market_pin_community_review_popup_vkpay_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_CLICK;

        @pmi0("type_market_pin_community_review_repin_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_REPIN_CLICK;

        @pmi0("type_market_pin_community_review_resume_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_RESUME_CLICK;

        @pmi0("type_market_pin_community_review_unpin_click")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_UNPIN_CLICK;

        @pmi0("type_market_play_item_video")
        public static final Type TYPE_MARKET_PLAY_ITEM_VIDEO;

        @pmi0("type_market_remove_item_from_bookmark")
        public static final Type TYPE_MARKET_REMOVE_ITEM_FROM_BOOKMARK;

        @pmi0("type_market_search_click")
        public static final Type TYPE_MARKET_SEARCH_CLICK;

        @pmi0("type_market_send_message_to_owner_click")
        public static final Type TYPE_MARKET_SEND_MESSAGE_TO_OWNER_CLICK;

        @pmi0("type_market_subscribe_market_button_click")
        public static final Type TYPE_MARKET_SUBSCRIBE_MARKET_BUTTON_CLICK;

        @pmi0("type_market_switch_item_variant")
        public static final Type TYPE_MARKET_SWITCH_ITEM_VARIANT;

        @pmi0("type_market_transition_to_ads")
        public static final Type TYPE_MARKET_TRANSITION_TO_ADS;

        @pmi0("type_market_transition_to_bookmarks")
        public static final Type TYPE_MARKET_TRANSITION_TO_BOOKMARKS;

        @pmi0("type_market_transition_to_categories_menu")
        public static final Type TYPE_MARKET_TRANSITION_TO_CATEGORIES_MENU;

        @pmi0("type_market_transition_to_collection")
        public static final Type TYPE_MARKET_TRANSITION_TO_COLLECTION;

        @pmi0("type_market_transition_to_item")
        public static final Type TYPE_MARKET_TRANSITION_TO_ITEM;

        @pmi0("type_market_transition_to_linked_content")
        public static final Type TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT;

        @pmi0("type_market_transition_to_linked_content_block")
        public static final Type TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT_BLOCK;

        @pmi0("type_market_transition_to_market")
        public static final Type TYPE_MARKET_TRANSITION_TO_MARKET;

        @pmi0("type_market_transition_to_owner")
        public static final Type TYPE_MARKET_TRANSITION_TO_OWNER;

        @pmi0("type_market_transition_to_ozon_reviews")
        public static final Type TYPE_MARKET_TRANSITION_TO_OZON_REVIEWS;

        @pmi0("type_market_transition_to_profile")
        public static final Type TYPE_MARKET_TRANSITION_TO_PROFILE;

        @pmi0("type_market_transition_to_similars")
        public static final Type TYPE_MARKET_TRANSITION_TO_SIMILARS;

        @pmi0("type_market_transition_to_wishlists")
        public static final Type TYPE_MARKET_TRANSITION_TO_WISHLISTS;

        @pmi0("type_smb_native_booking_cancel_click")
        public static final Type TYPE_SMB_NATIVE_BOOKING_CANCEL_CLICK;

        @pmi0("type_smb_native_booking_choose_master_click")
        public static final Type TYPE_SMB_NATIVE_BOOKING_CHOOSE_MASTER_CLICK;

        @pmi0("type_smb_native_booking_choose_service_click")
        public static final Type TYPE_SMB_NATIVE_BOOKING_CHOOSE_SERVICE_CLICK;

        @pmi0("type_smb_native_booking_close_click")
        public static final Type TYPE_SMB_NATIVE_BOOKING_CLOSE_CLICK;

        @pmi0("type_smb_native_booking_finish_click")
        public static final Type TYPE_SMB_NATIVE_BOOKING_FINISH_CLICK;

        @pmi0("type_smb_native_booking_reshedule_click")
        public static final Type TYPE_SMB_NATIVE_BOOKING_RESHEDULE_CLICK;

        @pmi0("type_smb_yclients_story_add_sticker_item")
        public static final Type TYPE_SMB_YCLIENTS_STORY_ADD_STICKER_ITEM;

        @pmi0("type_smb_yclients_story_choose_service_click_item")
        public static final Type TYPE_SMB_YCLIENTS_STORY_CHOOSE_SERVICE_CLICK_ITEM;

        @pmi0("type_smb_yclients_story_sticker_click_item")
        public static final Type TYPE_SMB_YCLIENTS_STORY_STICKER_CLICK_ITEM;

        static {
            Type type = new Type("TYPE_MARKET_CHECKOUT_FILL_PROFILE_DATA", 0);
            TYPE_MARKET_CHECKOUT_FILL_PROFILE_DATA = type;
            Type type2 = new Type("TYPE_MARKET_ADD_ITEM_TO_BOOKMARKS", 1);
            TYPE_MARKET_ADD_ITEM_TO_BOOKMARKS = type2;
            Type type3 = new Type("TYPE_MARKET_REMOVE_ITEM_FROM_BOOKMARK", 2);
            TYPE_MARKET_REMOVE_ITEM_FROM_BOOKMARK = type3;
            Type type4 = new Type("TYPE_MARKET_ORDERS_ITEM", 3);
            TYPE_MARKET_ORDERS_ITEM = type4;
            Type type5 = new Type("TYPE_MARKET_MAKE_ORDER_FROM_CART", 4);
            TYPE_MARKET_MAKE_ORDER_FROM_CART = type5;
            Type type6 = new Type("TYPE_MARKET_CLEAR_CART", 5);
            TYPE_MARKET_CLEAR_CART = type6;
            Type type7 = new Type("TYPE_MARKET_CARTS_ITEM", 6);
            TYPE_MARKET_CARTS_ITEM = type7;
            Type type8 = new Type("TYPE_MARKET_HIDE_ITEM", 7);
            TYPE_MARKET_HIDE_ITEM = type8;
            Type type9 = new Type("TYPE_MARKET_TRANSITION_TO_ITEM", 8);
            TYPE_MARKET_TRANSITION_TO_ITEM = type9;
            Type type10 = new Type("TYPE_MARKET_SEND_MESSAGE_TO_OWNER_CLICK", 9);
            TYPE_MARKET_SEND_MESSAGE_TO_OWNER_CLICK = type10;
            Type type11 = new Type("TYPE_MARKETPLACE_ITEM_CLICK", 10);
            TYPE_MARKETPLACE_ITEM_CLICK = type11;
            Type type12 = new Type("TYPE_MARKETPLACE_MARKET_CLICK", 11);
            TYPE_MARKETPLACE_MARKET_CLICK = type12;
            Type type13 = new Type("TYPE_MARKETPLACE_ADD_TO_BOOKMARKS_CLICK", 12);
            TYPE_MARKETPLACE_ADD_TO_BOOKMARKS_CLICK = type13;
            Type type14 = new Type("TYPE_MARKETPLACE_REMOVE_FROM_BOOKMARKS_CLICK", 13);
            TYPE_MARKETPLACE_REMOVE_FROM_BOOKMARKS_CLICK = type14;
            Type type15 = new Type("TYPE_MARKETPLACE_SUBSCRIBE_MARKET_BUTTON_CLICK", 14);
            TYPE_MARKETPLACE_SUBSCRIBE_MARKET_BUTTON_CLICK = type15;
            Type type16 = new Type("TYPE_MARKET_TRANSITION_TO_COLLECTION", 15);
            TYPE_MARKET_TRANSITION_TO_COLLECTION = type16;
            Type type17 = new Type("TYPE_MARKET_HIDE_COLLECTION", 16);
            TYPE_MARKET_HIDE_COLLECTION = type17;
            Type type18 = new Type("TYPE_MARKETPLACE_TRANSITION_TO_CART_CLICK", 17);
            TYPE_MARKETPLACE_TRANSITION_TO_CART_CLICK = type18;
            Type type19 = new Type("TYPE_MARKETPLACE_TRANSITION_TO_CARTS_LIST_CLICK", 18);
            TYPE_MARKETPLACE_TRANSITION_TO_CARTS_LIST_CLICK = type19;
            Type type20 = new Type("TYPE_MARKETPLACE_TRANSITION_TO_CHECKOUT_CLICK_ITEM", 19);
            TYPE_MARKETPLACE_TRANSITION_TO_CHECKOUT_CLICK_ITEM = type20;
            Type type21 = new Type("TYPE_MARKET_CTA_BUTTON_CLICK", 20);
            TYPE_MARKET_CTA_BUTTON_CLICK = type21;
            Type type22 = new Type("TYPE_MARKET_TRANSITION_TO_OZON_REVIEWS", 21);
            TYPE_MARKET_TRANSITION_TO_OZON_REVIEWS = type22;
            Type type23 = new Type("TYPE_MARKETPLACE_TRANSITION_TO_BLOCK", 22);
            TYPE_MARKETPLACE_TRANSITION_TO_BLOCK = type23;
            Type type24 = new Type("TYPE_MARKET_ITEMS_CONTROL_CLICK", 23);
            TYPE_MARKET_ITEMS_CONTROL_CLICK = type24;
            Type type25 = new Type("TYPE_MARKET_END_EDIT_ITEM", 24);
            TYPE_MARKET_END_EDIT_ITEM = type25;
            Type type26 = new Type("TYPE_MARKET_TRANSITION_TO_SIMILARS", 25);
            TYPE_MARKET_TRANSITION_TO_SIMILARS = type26;
            Type type27 = new Type("TYPE_MARKET_COPY_LINK_CLICK", 26);
            TYPE_MARKET_COPY_LINK_CLICK = type27;
            Type type28 = new Type("TYPE_MARKET_TRANSITION_TO_OWNER", 27);
            TYPE_MARKET_TRANSITION_TO_OWNER = type28;
            Type type29 = new Type("TYPE_MARKET_TRANSITION_TO_MARKET", 28);
            TYPE_MARKET_TRANSITION_TO_MARKET = type29;
            Type type30 = new Type("TYPE_MARKET_SUBSCRIBE_MARKET_BUTTON_CLICK", 29);
            TYPE_MARKET_SUBSCRIBE_MARKET_BUTTON_CLICK = type30;
            Type type31 = new Type("TYPE_MARKET_OPEN_SECTION_CLICK", 30);
            TYPE_MARKET_OPEN_SECTION_CLICK = type31;
            Type type32 = new Type("TYPE_MARKET_MODERATION_BUTTON_CLICK", 31);
            TYPE_MARKET_MODERATION_BUTTON_CLICK = type32;
            Type type33 = new Type("TYPE_MARKET_SEARCH_CLICK", 32);
            TYPE_MARKET_SEARCH_CLICK = type33;
            Type type34 = new Type("TYPE_MARKET_CAROUSEL_TRANSITION_TO_ITEM", 33);
            TYPE_MARKET_CAROUSEL_TRANSITION_TO_ITEM = type34;
            Type type35 = new Type("TYPE_MARKET_CAROUSEL_ADD_ITEM_TO_BOOKMARKS", 34);
            TYPE_MARKET_CAROUSEL_ADD_ITEM_TO_BOOKMARKS = type35;
            Type type36 = new Type("TYPE_MARKET_CAROUSEL_REMOVE_ITEM_FROM_BOOKMARKS", 35);
            TYPE_MARKET_CAROUSEL_REMOVE_ITEM_FROM_BOOKMARKS = type36;
            Type type37 = new Type("TYPE_MARKET_CAROUSEL_CLICK_SHOW_ALL_ITEMS", 36);
            TYPE_MARKET_CAROUSEL_CLICK_SHOW_ALL_ITEMS = type37;
            Type type38 = new Type("TYPE_MARKET_TRANSITION_TO_BOOKMARKS", 37);
            TYPE_MARKET_TRANSITION_TO_BOOKMARKS = type38;
            Type type39 = new Type("TYPE_MARKET_TRANSITION_TO_WISHLISTS", 38);
            TYPE_MARKET_TRANSITION_TO_WISHLISTS = type39;
            Type type40 = new Type("TYPE_MARKET_TRANSITION_TO_ADS", 39);
            TYPE_MARKET_TRANSITION_TO_ADS = type40;
            Type type41 = new Type("TYPE_MARKET_TRANSITION_TO_PROFILE", 40);
            TYPE_MARKET_TRANSITION_TO_PROFILE = type41;
            Type type42 = new Type("TYPE_MARKET_PLAY_ITEM_VIDEO", 41);
            TYPE_MARKET_PLAY_ITEM_VIDEO = type42;
            Type type43 = new Type("TYPE_MARKET_TRANSITION_TO_CATEGORIES_MENU", 42);
            TYPE_MARKET_TRANSITION_TO_CATEGORIES_MENU = type43;
            Type type44 = new Type("TYPE_MARKET_OPEN_PURCHASE_INFO", 43);
            TYPE_MARKET_OPEN_PURCHASE_INFO = type44;
            Type type45 = new Type("TYPE_MARKET_OPEN_MARKET_ALBUM", 44);
            TYPE_MARKET_OPEN_MARKET_ALBUM = type45;
            Type type46 = new Type("TYPE_MARKET_OPEN_ITEMS_MODAL", 45);
            TYPE_MARKET_OPEN_ITEMS_MODAL = type46;
            Type type47 = new Type("TYPE_MARKET_PAGINATION_IN_PRODUCT_TILE", 46);
            TYPE_MARKET_PAGINATION_IN_PRODUCT_TILE = type47;
            Type type48 = new Type("TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT", 47);
            TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT = type48;
            Type type49 = new Type("TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT_BLOCK", 48);
            TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT_BLOCK = type49;
            Type type50 = new Type("TYPE_SMB_NATIVE_BOOKING_CANCEL_CLICK", 49);
            TYPE_SMB_NATIVE_BOOKING_CANCEL_CLICK = type50;
            Type type51 = new Type("TYPE_SMB_NATIVE_BOOKING_CHOOSE_MASTER_CLICK", 50);
            TYPE_SMB_NATIVE_BOOKING_CHOOSE_MASTER_CLICK = type51;
            Type type52 = new Type("TYPE_SMB_NATIVE_BOOKING_CHOOSE_SERVICE_CLICK", 51);
            TYPE_SMB_NATIVE_BOOKING_CHOOSE_SERVICE_CLICK = type52;
            Type type53 = new Type("TYPE_SMB_NATIVE_BOOKING_CLOSE_CLICK", 52);
            TYPE_SMB_NATIVE_BOOKING_CLOSE_CLICK = type53;
            Type type54 = new Type("TYPE_SMB_NATIVE_BOOKING_FINISH_CLICK", 53);
            TYPE_SMB_NATIVE_BOOKING_FINISH_CLICK = type54;
            Type type55 = new Type("TYPE_SMB_NATIVE_BOOKING_RESHEDULE_CLICK", 54);
            TYPE_SMB_NATIVE_BOOKING_RESHEDULE_CLICK = type55;
            Type type56 = new Type("TYPE_SMB_YCLIENTS_STORY_STICKER_CLICK_ITEM", 55);
            TYPE_SMB_YCLIENTS_STORY_STICKER_CLICK_ITEM = type56;
            Type type57 = new Type("TYPE_SMB_YCLIENTS_STORY_CHOOSE_SERVICE_CLICK_ITEM", 56);
            TYPE_SMB_YCLIENTS_STORY_CHOOSE_SERVICE_CLICK_ITEM = type57;
            Type type58 = new Type("TYPE_SMB_YCLIENTS_STORY_ADD_STICKER_ITEM", 57);
            TYPE_SMB_YCLIENTS_STORY_ADD_STICKER_ITEM = type58;
            Type type59 = new Type("TYPE_MARKET_OPEN_ITEMS_FROM_VIDEO_CLICK", 58);
            TYPE_MARKET_OPEN_ITEMS_FROM_VIDEO_CLICK = type59;
            Type type60 = new Type("TYPE_MARKET_ADD_ITEMS_TO_VIDEO_CLICK", 59);
            TYPE_MARKET_ADD_ITEMS_TO_VIDEO_CLICK = type60;
            Type type61 = new Type("TYPE_MARKET_CHANGE_ITEMS_TO_VIDEO_CLICK", 60);
            TYPE_MARKET_CHANGE_ITEMS_TO_VIDEO_CLICK = type61;
            Type type62 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_PIN_CLICK", 61);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_PIN_CLICK = type62;
            Type type63 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_CLICK", 62);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_CLICK = type63;
            Type type64 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_CLICK", 63);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_CLICK = type64;
            Type type65 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_TRY_AGAIN_CLICK", 64);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_TRY_AGAIN_CLICK = type65;
            Type type66 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_UNPIN_CLICK", 65);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_UNPIN_CLICK = type66;
            Type type67 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_TRY_AGAIN_CLICK", 66);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_TRY_AGAIN_CLICK = type67;
            Type type68 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_REPIN_CLICK", 67);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_REPIN_CLICK = type68;
            Type type69 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_MANAGE_PINNED_CLICK", 68);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_MANAGE_PINNED_CLICK = type69;
            Type type70 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_CANCEL_CLICK", 69);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_CANCEL_CLICK = type70;
            Type type71 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_CANCEL_PINNED_CLICK", 70);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_CANCEL_PINNED_CLICK = type71;
            Type type72 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_LEFT_ACTIVE_PINNED_CLICK", 71);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_LEFT_ACTIVE_PINNED_CLICK = type72;
            Type type73 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_RESUME_CLICK", 72);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_RESUME_CLICK = type73;
            Type type74 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_RESUME_CLICK", 73);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_RESUME_CLICK = type74;
            Type type75 = new Type("TYPE_MARKET_FOMO_LABEL_CLICK", 74);
            TYPE_MARKET_FOMO_LABEL_CLICK = type75;
            Type type76 = new Type("TYPE_MARKET_DELIVERY_BLOCK_CLICK", 75);
            TYPE_MARKET_DELIVERY_BLOCK_CLICK = type76;
            Type type77 = new Type("TYPE_MARKET_ITEM_RATING_CLICK", 76);
            TYPE_MARKET_ITEM_RATING_CLICK = type77;
            Type type78 = new Type("TYPE_MARKET_ITEM_PICKER", 77);
            TYPE_MARKET_ITEM_PICKER = type78;
            Type type79 = new Type("TYPE_MARKET_SWITCH_ITEM_VARIANT", 78);
            TYPE_MARKET_SWITCH_ITEM_VARIANT = type79;
            Type type80 = new Type("TYPE_MARKET_CLICK_OPEN_ALL_ITEM_VARIANTS", 79);
            TYPE_MARKET_CLICK_OPEN_ALL_ITEM_VARIANTS = type80;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47, type48, type49, type50, type51, type52, type53, type54, type55, type56, type57, type58, type59, type60, type61, type62, type63, type64, type65, type66, type67, type68, type69, type70, type71, type72, type73, type74, type75, type76, type77, type78, type79, type80};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class a {
        public static MobileOfficialAppsMarketStat$TypeMarketClick a(Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2, String str, CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource, b bVar) {
            if (bVar instanceof CommonMarketStat$TypeMarketCheckoutFillProfileData) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CHECKOUT_FILL_PROFILE_DATA, null, null, (CommonMarketStat$TypeMarketCheckoutFillProfileData) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_ADD_ITEM_TO_BOOKMARKS, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -18, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_REMOVE_ITEM_FROM_BOOKMARK, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -34, -64, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketOrdersItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_ORDERS_ITEM, null, null, null, null, null, (CommonMarketStat$TypeMarketOrdersItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -66, -64, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketMakeOrderFromCart) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_MAKE_ORDER_FROM_CART, null, null, null, null, null, null, (CommonMarketStat$TypeMarketMakeOrderFromCart) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_PROXY_CONNECTION_FAILED, -64, 4194303, null);
            }
            if (bVar instanceof m) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CLEAR_CART, null, null, null, null, null, null, null, (m) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -258, -64, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketCartsItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CARTS_ITEM, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketCartsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -514, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketHideItemItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_HIDE_ITEM, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketHideItemItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1026, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_ITEM, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2050, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_SEND_MESSAGE_TO_OWNER_CLICK, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4098, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32770, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_MARKET_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65538, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_ADD_TO_BOOKMARKS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131074, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_REMOVE_FROM_BOOKMARKS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262146, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_SUBSCRIBE_MARKET_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem) bVar, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194306, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_COLLECTION, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8194, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_HIDE_COLLECTION, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16386, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_TRANSITION_TO_CART_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524290, -64, 4194303, null);
            }
            if (bVar instanceof s) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_TRANSITION_TO_CARTS_LIST_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (s) bVar, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048578, -64, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_TRANSITION_TO_CHECKOUT_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem) bVar, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097154, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CTA_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem) bVar, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388610, -64, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketTransitionToOzonReviewsItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_OZON_REVIEWS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketTransitionToOzonReviewsItem) bVar, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777218, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKETPLACE_TRANSITION_TO_BLOCK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem) bVar, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554434, -64, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketEndEditItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_END_EDIT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketEndEditItem) bVar, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108866, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_SIMILARS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem) bVar, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217730, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_COPY_LINK_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem) bVar, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435458, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_OWNER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem) bVar, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870914, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_MARKET, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem) bVar, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741826, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_SUBSCRIBE_MARKET_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem) bVar, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, -64, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_OPEN_SECTION_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, (MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -128, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_MODERATION_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, (MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -192, 4194303, null);
            }
            if (bVar instanceof g0) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_SEARCH_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, (g0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, NetError.ERR_INVALID_RESPONSE, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CAROUSEL_TRANSITION_TO_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -576, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CAROUSEL_ADD_ITEM_TO_BOOKMARKS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1088, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CAROUSEL_REMOVE_ITEM_FROM_BOOKMARKS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -2112, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CAROUSEL_CLICK_SHOW_ALL_ITEMS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -4160, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketTransitionToBookmarks) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_BOOKMARKS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketTransitionToBookmarks) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -8256, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketTransitionToWishlists) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_WISHLISTS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketTransitionToWishlists) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -16448, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketTransitionToAds) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_ADS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketTransitionToAds) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -32832, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketTransitionToProfile) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_PROFILE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketTransitionToProfile) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -65600, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPlayItemVideoItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PLAY_ITEM_VIDEO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPlayItemVideoItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -131136, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketTransitionToCategoriesMenu) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_CATEGORIES_MENU, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketTransitionToCategoriesMenu) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -262208, 4194303, null);
            }
            if (bVar instanceof p) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_OPEN_PURCHASE_INFO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, (p) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -524352, 4194303, null);
            }
            if (bVar instanceof o) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_OPEN_MARKET_ALBUM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (o) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1048640, 4194303, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_OPEN_ITEMS_MODAL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem) bVar, -2, -64, 2097151, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPaginationInProductTile) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PAGINATION_IN_PRODUCT_TILE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPaginationInProductTile) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -2097216, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketTransitionToLinkedContent) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketTransitionToLinkedContent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -4194368, 4194303, null);
            }
            if (bVar instanceof q) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_TRANSITION_TO_LINKED_CONTENT_BLOCK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (q) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -8388672, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingCancelClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_NATIVE_BOOKING_CANCEL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingCancelClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -16777280, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_NATIVE_BOOKING_CHOOSE_MASTER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -33554496, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_NATIVE_BOOKING_CHOOSE_SERVICE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -67108928, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingCloseClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_NATIVE_BOOKING_CLOSE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingCloseClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -134217792, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingFinishClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_NATIVE_BOOKING_FINISH_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingFinishClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -268435520, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingResheduleClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_NATIVE_BOOKING_RESHEDULE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingResheduleClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -536870976, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbYclientsStoryStickerClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_YCLIENTS_STORY_STICKER_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbYclientsStoryStickerClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1073741888, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_YCLIENTS_STORY_CHOOSE_SERVICE_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 2147483584, 4194303, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbYclientsStoryAddStickerItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_SMB_YCLIENTS_STORY_ADD_STICKER_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbYclientsStoryAddStickerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194302, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_OPEN_ITEMS_FROM_VIDEO_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194301, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketAddItemsToVideoClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_ADD_ITEMS_TO_VIDEO_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketAddItemsToVideoClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194299, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketChangeItemsToVideoClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CHANGE_ITEMS_TO_VIDEO_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketChangeItemsToVideoClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194295, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_PIN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194271, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194239, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_TRY_AGAIN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194175, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_UNPIN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4194047, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_TRY_AGAIN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4193791, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_REPIN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, -2, -64, 4193279, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_MANAGE_PINNED_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem) bVar, null, null, null, null, null, null, null, null, null, null, -2, -64, 4192255, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_CANCEL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem) bVar, null, null, null, null, null, null, null, null, null, -2, -64, 4190207, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_CANCEL_PINNED_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem) bVar, null, null, null, null, null, null, null, null, -2, -64, 4186111, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_LEFT_ACTIVE_PINNED_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem) bVar, null, null, null, null, null, null, null, -2, -64, 4177919, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_RESUME_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem) bVar, null, null, null, null, null, null, -2, -64, 4161535, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_RESUME_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem) bVar, null, null, null, null, null, -2, -64, 4128767, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketFomoLabelClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_FOMO_LABEL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketFomoLabelClickItem) bVar, null, null, null, null, -2, -64, 4063231, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketDeliveryBlockClickItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_DELIVERY_BLOCK_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketDeliveryBlockClickItem) bVar, null, null, null, -2, -64, 3932159, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketItemRatingItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_ITEM_RATING_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketItemRatingItem) bVar, null, null, -2, -64, 3670015, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketItemPicker) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_ITEM_PICKER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketItemPicker) bVar, null, -2, -64, 3145727, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketSwitchItemVariantItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_SWITCH_ITEM_VARIANT, (CommonMarketStat$TypeMarketSwitchItemVariantItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -64, 4194303, null);
            }
            if (!(bVar instanceof CommonMarketStat$TypeMarketClickOpenAllItemVariantsItem)) {
                throw new IllegalArgumentException("payload must be one of(TypeMarketCheckoutFillProfileData, TypeMarketAddItemToBookmarksItem, TypeMarketRemoveItemFromBookmarkItem, TypeMarketOrdersItem, TypeMarketMakeOrderFromCart, TypeMarketClearCart, TypeMarketCartsItem, TypeMarketHideItemItem, TypeMarketTransitionToItemItem, TypeMarketSendMessageToOwnerClickItem, TypeMarketplaceItemClickItem, TypeMarketplaceMarketClickItem, TypeMarketplaceAddToBookmarksClick, TypeMarketplaceRemoveFromBookmarksClick, TypeMarketplaceSubscribeMarketButtonClickItem, TypeMarketTransitionToCollectionItem, TypeMarketHideCollectionItem, TypeMarketplaceTransitionToCartClickItem, TypeMarketplaceTransitionToCartsListClickItem, TypeMarketplaceTransitionToCheckoutClickItem, TypeMarketCtaButtonClickItem, TypeMarketTransitionToOzonReviewsItem, TypeMarketplaceTransitionToBlockItem, TypeMarketEndEditItem, TypeMarketTransitionToSimilarsItem, TypeMarketCopyLinkClickItem, TypeMarketTransitionToOwnerItem, TypeMarketTransitionToMarketItem, TypeMarketSubscribeMarketButtonClickItem, TypeMarketOpenSectionClickItem, TypeMarketModerationButtonClickItem, TypeMarketSearchClickItem, TypeMarketCarouselTransitionToItem, TypeMarketCarouselAddItemToBookmarks, TypeMarketCarouselRemoveItemFromBookmarks, TypeMarketCarouselClickShowAllItems, TypeMarketTransitionToBookmarks, TypeMarketTransitionToWishlists, TypeMarketTransitionToAds, TypeMarketTransitionToProfile, TypeMarketPlayItemVideoItem, TypeMarketTransitionToCategoriesMenu, TypeMarketOpenPurchaseInfo, TypeMarketOpenMarketAlbumItem, TypeMarketOpenItemsModalItem, TypeMarketPaginationInProductTile, TypeMarketTransitionToLinkedContent, TypeMarketTransitionToLinkedContentBlock, TypeSmbNativeBookingCancelClickItem, TypeSmbNativeBookingChooseMasterClickItem, TypeSmbNativeBookingChooseServiceClickItem, TypeSmbNativeBookingCloseClickItem, TypeSmbNativeBookingFinishClickItem, TypeSmbNativeBookingResheduleClickItem, TypeSmbYclientsStoryStickerClickItem, TypeSmbYclientsStoryChooseServiceClickItem, TypeSmbYclientsStoryAddStickerItem, TypeMarketOpenItemsFromVideoClickItem, TypeMarketAddItemsToVideoClickItem, TypeMarketChangeItemsToVideoClickItem, TypeMarketPinCommunityReviewPinClickItem, TypeMarketPinCommunityReviewPopupPinForMoneyClickItem, TypeMarketPinCommunityReviewPopupVkpayClickItem, TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem, TypeMarketPinCommunityReviewUnpinClickItem, TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem, TypeMarketPinCommunityReviewRepinClickItem, TypeMarketPinCommunityReviewManagePinnedClickItem, TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem, TypeMarketPinCommunityReviewCancelPinnedClickItem, TypeMarketPinCommunityReviewLeftActivePinnedClickItem, TypeMarketPinCommunityReviewResumeClickItem, TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem, TypeMarketFomoLabelClickItem, TypeMarketDeliveryBlockClickItem, TypeMarketItemRatingItem, TypeMarketItemPicker, TypeMarketSwitchItemVariantItem, TypeMarketClickOpenAllItemVariantsItem)");
            }
            return new MobileOfficialAppsMarketStat$TypeMarketClick(Type.TYPE_MARKET_CLICK_OPEN_ALL_ITEM_VARIANTS, null, (CommonMarketStat$TypeMarketClickOpenAllItemVariantsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, -64, 4194303, null);
        }

        public static /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketClick b(Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2, String str, b bVar, int i) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                mobileOfficialAppsCoreNavStat$EventScreen = null;
            }
            if ((i & 4) != 0) {
                commonMarketStat$TypeRefSource = null;
            }
            if ((i & 8) != 0) {
                mobileOfficialAppsCoreNavStat$EventScreen2 = null;
            }
            if ((i & 16) != 0) {
                str = null;
            }
            return a(num, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, str, null, bVar);
        }
    }

    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public interface b {
    }

    private MobileOfficialAppsMarketStat$TypeMarketClick(Type type, CommonMarketStat$TypeMarketSwitchItemVariantItem commonMarketStat$TypeMarketSwitchItemVariantItem, CommonMarketStat$TypeMarketClickOpenAllItemVariantsItem commonMarketStat$TypeMarketClickOpenAllItemVariantsItem, CommonMarketStat$TypeMarketCheckoutFillProfileData commonMarketStat$TypeMarketCheckoutFillProfileData, MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem, MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem, CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem, CommonMarketStat$TypeMarketMakeOrderFromCart commonMarketStat$TypeMarketMakeOrderFromCart, m mVar, CommonMarketStat$TypeMarketCartsItem commonMarketStat$TypeMarketCartsItem, MobileOfficialAppsMarketStat$TypeMarketHideItemItem mobileOfficialAppsMarketStat$TypeMarketHideItemItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem, MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem, MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem, MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem, MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem, MobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick, MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick, MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem, s sVar, CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem, MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem, CommonMarketStat$TypeMarketTransitionToOzonReviewsItem commonMarketStat$TypeMarketTransitionToOzonReviewsItem, MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem, CommonMarketStat$TypeMarketEndEditItem commonMarketStat$TypeMarketEndEditItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem, MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem, MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2, String str, CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource, MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem, MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem mobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem, g0 g0Var, MobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem mobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem, MobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks mobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks, MobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks mobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks, MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems, CommonMarketStat$TypeMarketTransitionToBookmarks commonMarketStat$TypeMarketTransitionToBookmarks, CommonMarketStat$TypeMarketTransitionToWishlists commonMarketStat$TypeMarketTransitionToWishlists, CommonMarketStat$TypeMarketTransitionToAds commonMarketStat$TypeMarketTransitionToAds, CommonMarketStat$TypeMarketTransitionToProfile commonMarketStat$TypeMarketTransitionToProfile, CommonMarketStat$TypeMarketPlayItemVideoItem commonMarketStat$TypeMarketPlayItemVideoItem, CommonMarketStat$TypeMarketTransitionToCategoriesMenu commonMarketStat$TypeMarketTransitionToCategoriesMenu, p pVar, o oVar, CommonMarketStat$TypeMarketPaginationInProductTile commonMarketStat$TypeMarketPaginationInProductTile, CommonMarketStat$TypeMarketTransitionToLinkedContent commonMarketStat$TypeMarketTransitionToLinkedContent, q qVar, CommonMarketStat$TypeSmbNativeBookingCancelClickItem commonMarketStat$TypeSmbNativeBookingCancelClickItem, CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem, CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem commonMarketStat$TypeSmbNativeBookingChooseServiceClickItem, CommonMarketStat$TypeSmbNativeBookingCloseClickItem commonMarketStat$TypeSmbNativeBookingCloseClickItem, CommonMarketStat$TypeSmbNativeBookingFinishClickItem commonMarketStat$TypeSmbNativeBookingFinishClickItem, CommonMarketStat$TypeSmbNativeBookingResheduleClickItem commonMarketStat$TypeSmbNativeBookingResheduleClickItem, CommonMarketStat$TypeSmbYclientsStoryStickerClickItem commonMarketStat$TypeSmbYclientsStoryStickerClickItem, CommonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem commonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem, CommonMarketStat$TypeSmbYclientsStoryAddStickerItem commonMarketStat$TypeSmbYclientsStoryAddStickerItem, CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem commonMarketStat$TypeMarketOpenItemsFromVideoClickItem, CommonMarketStat$TypeMarketAddItemsToVideoClickItem commonMarketStat$TypeMarketAddItemsToVideoClickItem, CommonMarketStat$TypeMarketChangeItemsToVideoClickItem commonMarketStat$TypeMarketChangeItemsToVideoClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem commonMarketStat$TypeMarketPinCommunityReviewPinClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem, CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem commonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem, CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem, CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem, CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem, CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem, CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem commonMarketStat$TypeMarketPinCommunityReviewResumeClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem, CommonMarketStat$TypeMarketFomoLabelClickItem commonMarketStat$TypeMarketFomoLabelClickItem, CommonMarketStat$TypeMarketDeliveryBlockClickItem commonMarketStat$TypeMarketDeliveryBlockClickItem, CommonMarketStat$TypeMarketItemRatingItem commonMarketStat$TypeMarketItemRatingItem, CommonMarketStat$TypeMarketItemPicker commonMarketStat$TypeMarketItemPicker, MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem mobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem) {
        this.type = type;
        this.typeMarketSwitchItemVariant = commonMarketStat$TypeMarketSwitchItemVariantItem;
        this.typeMarketClickOpenAllItemVariants = commonMarketStat$TypeMarketClickOpenAllItemVariantsItem;
        this.typeMarketCheckoutFillProfileData = commonMarketStat$TypeMarketCheckoutFillProfileData;
        this.typeMarketAddItemToBookmarks = mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem;
        this.typeMarketRemoveItemFromBookmark = mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem;
        this.typeMarketOrdersItem = commonMarketStat$TypeMarketOrdersItem;
        this.typeMarketMakeOrderFromCart = commonMarketStat$TypeMarketMakeOrderFromCart;
        this.typeMarketClearCart = mVar;
        this.typeMarketCartsItem = commonMarketStat$TypeMarketCartsItem;
        this.typeMarketHideItem = mobileOfficialAppsMarketStat$TypeMarketHideItemItem;
        this.typeMarketTransitionToItem = mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem;
        this.typeMarketSendMessageToOwnerClick = mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem;
        this.typeMarketTransitionToCollection = mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem;
        this.typeMarketHideCollection = mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem;
        this.typeMarketplaceItemClick = mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem;
        this.typeMarketplaceMarketClick = mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem;
        this.typeMarketplaceAddToBookmarksClick = mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick;
        this.typeMarketplaceRemoveFromBookmarksClick = mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick;
        this.typeMarketplaceTransitionToCartClick = mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem;
        this.typeMarketplaceTransitionToCartsListClick = sVar;
        this.typeMarketplaceTransitionToCheckoutClickItem = commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem;
        this.typeMarketplaceSubscribeMarketButtonClick = mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem;
        this.typeMarketCtaButtonClick = mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
        this.typeMarketTransitionToOzonReviews = commonMarketStat$TypeMarketTransitionToOzonReviewsItem;
        this.typeMarketplaceTransitionToBlock = mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem;
        this.typeMarketEndEditItem = commonMarketStat$TypeMarketEndEditItem;
        this.typeMarketTransitionToSimilars = mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem;
        this.typeMarketCopyLinkClick = mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem;
        this.typeMarketTransitionToOwner = mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem;
        this.typeMarketTransitionToMarket = mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem;
        this.typeMarketSubscribeMarketButtonClick = mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem;
        this.analyticsVersion = num;
        this.previousScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.refSource = commonMarketStat$TypeRefSource;
        this.refScreen = mobileOfficialAppsCoreNavStat$EventScreen2;
        this.sourceUrl = str;
        this.trafficSource = commonMarketStat$TypeTrafficSource;
        this.typeMarketOpenSectionClick = mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem;
        this.typeMarketModerationButtonClick = mobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem;
        this.typeMarketSearchClick = g0Var;
        this.typeMarketCarouselTransitionToItem = mobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem;
        this.typeMarketCarouselAddItemToBookmarks = mobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks;
        this.typeMarketCarouselRemoveItemFromBookmarks = mobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks;
        this.typeMarketCarouselClickShowAllItems = mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems;
        this.typeMarketTransitionToBookmarks = commonMarketStat$TypeMarketTransitionToBookmarks;
        this.typeMarketTransitionToWishlists = commonMarketStat$TypeMarketTransitionToWishlists;
        this.typeMarketTransitionToAds = commonMarketStat$TypeMarketTransitionToAds;
        this.typeMarketTransitionToProfile = commonMarketStat$TypeMarketTransitionToProfile;
        this.typeMarketPlayItemVideo = commonMarketStat$TypeMarketPlayItemVideoItem;
        this.typeMarketTransitionToCategoriesMenu = commonMarketStat$TypeMarketTransitionToCategoriesMenu;
        this.typeMarketOpenPurchaseInfo = pVar;
        this.typeMarketOpenMarketAlbum = oVar;
        this.typeMarketPaginationInProductTile = commonMarketStat$TypeMarketPaginationInProductTile;
        this.typeMarketTransitionToLinkedContent = commonMarketStat$TypeMarketTransitionToLinkedContent;
        this.typeMarketTransitionToLinkedContentBlock = qVar;
        this.typeSmbNativeBookingCancelClick = commonMarketStat$TypeSmbNativeBookingCancelClickItem;
        this.typeSmbNativeBookingChooseMasterClick = commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem;
        this.typeSmbNativeBookingChooseServiceClick = commonMarketStat$TypeSmbNativeBookingChooseServiceClickItem;
        this.typeSmbNativeBookingCloseClick = commonMarketStat$TypeSmbNativeBookingCloseClickItem;
        this.typeSmbNativeBookingFinishClick = commonMarketStat$TypeSmbNativeBookingFinishClickItem;
        this.typeSmbNativeBookingResheduleClick = commonMarketStat$TypeSmbNativeBookingResheduleClickItem;
        this.typeSmbYclientsStoryStickerClickItem = commonMarketStat$TypeSmbYclientsStoryStickerClickItem;
        this.typeSmbYclientsStoryChooseServiceClickItem = commonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem;
        this.typeSmbYclientsStoryAddStickerItem = commonMarketStat$TypeSmbYclientsStoryAddStickerItem;
        this.typeMarketOpenItemsFromVideoClick = commonMarketStat$TypeMarketOpenItemsFromVideoClickItem;
        this.typeMarketAddItemsToVideoClick = commonMarketStat$TypeMarketAddItemsToVideoClickItem;
        this.typeMarketChangeItemsToVideoClick = commonMarketStat$TypeMarketChangeItemsToVideoClickItem;
        this.typeMarketPinCommunityReviewPinClick = commonMarketStat$TypeMarketPinCommunityReviewPinClickItem;
        this.typeMarketPinCommunityReviewPopupPinForMoneyClick = commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem;
        this.typeMarketPinCommunityReviewPopupVkpayClick = commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem;
        this.typeMarketPinCommunityReviewPopupErrorPinTryAgainClick = commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem;
        this.typeMarketPinCommunityReviewUnpinClick = commonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem;
        this.typeMarketPinCommunityReviewPopupErrorUnpinTryAgainClick = commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem;
        this.typeMarketPinCommunityReviewRepinClick = commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem;
        this.typeMarketPinCommunityReviewManagePinnedClick = commonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem;
        this.typeMarketPinCommunityReviewPopupManagePinnedCancelClick = commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem;
        this.typeMarketPinCommunityReviewCancelPinnedClick = commonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem;
        this.typeMarketPinCommunityReviewLeftActivePinnedClick = commonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem;
        this.typeMarketPinCommunityReviewResumeClick = commonMarketStat$TypeMarketPinCommunityReviewResumeClickItem;
        this.typeMarketPinCommunityReviewPopupManagePinnedResumeClick = commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem;
        this.typeMarketFomoLabelClick = commonMarketStat$TypeMarketFomoLabelClickItem;
        this.typeMarketDeliveryBlockClick = commonMarketStat$TypeMarketDeliveryBlockClickItem;
        this.typeMarketItemRatingClick = commonMarketStat$TypeMarketItemRatingItem;
        this.typeMarketItemPicker = commonMarketStat$TypeMarketItemPicker;
        this.typeMarketOpenItemsModal = mobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketClick)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketClick mobileOfficialAppsMarketStat$TypeMarketClick = (MobileOfficialAppsMarketStat$TypeMarketClick) obj;
        return this.type == mobileOfficialAppsMarketStat$TypeMarketClick.type && epx.f(this.typeMarketSwitchItemVariant, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketSwitchItemVariant) && epx.f(this.typeMarketClickOpenAllItemVariants, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketClickOpenAllItemVariants) && epx.f(this.typeMarketCheckoutFillProfileData, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCheckoutFillProfileData) && epx.f(this.typeMarketAddItemToBookmarks, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketAddItemToBookmarks) && epx.f(this.typeMarketRemoveItemFromBookmark, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketRemoveItemFromBookmark) && epx.f(this.typeMarketOrdersItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketOrdersItem) && epx.f(this.typeMarketMakeOrderFromCart, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketMakeOrderFromCart) && epx.f(this.typeMarketClearCart, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketClearCart) && epx.f(this.typeMarketCartsItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCartsItem) && epx.f(this.typeMarketHideItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketHideItem) && epx.f(this.typeMarketTransitionToItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToItem) && epx.f(this.typeMarketSendMessageToOwnerClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketSendMessageToOwnerClick) && epx.f(this.typeMarketTransitionToCollection, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToCollection) && epx.f(this.typeMarketHideCollection, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketHideCollection) && epx.f(this.typeMarketplaceItemClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceItemClick) && epx.f(this.typeMarketplaceMarketClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceMarketClick) && epx.f(this.typeMarketplaceAddToBookmarksClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceAddToBookmarksClick) && epx.f(this.typeMarketplaceRemoveFromBookmarksClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceRemoveFromBookmarksClick) && epx.f(this.typeMarketplaceTransitionToCartClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceTransitionToCartClick) && epx.f(this.typeMarketplaceTransitionToCartsListClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceTransitionToCartsListClick) && epx.f(this.typeMarketplaceTransitionToCheckoutClickItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceTransitionToCheckoutClickItem) && epx.f(this.typeMarketplaceSubscribeMarketButtonClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceSubscribeMarketButtonClick) && epx.f(this.typeMarketCtaButtonClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCtaButtonClick) && epx.f(this.typeMarketTransitionToOzonReviews, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToOzonReviews) && epx.f(this.typeMarketplaceTransitionToBlock, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketplaceTransitionToBlock) && epx.f(this.typeMarketEndEditItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketEndEditItem) && epx.f(this.typeMarketTransitionToSimilars, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToSimilars) && epx.f(this.typeMarketCopyLinkClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCopyLinkClick) && epx.f(this.typeMarketTransitionToOwner, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToOwner) && epx.f(this.typeMarketTransitionToMarket, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToMarket) && epx.f(this.typeMarketSubscribeMarketButtonClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketSubscribeMarketButtonClick) && epx.f(this.analyticsVersion, mobileOfficialAppsMarketStat$TypeMarketClick.analyticsVersion) && this.previousScreen == mobileOfficialAppsMarketStat$TypeMarketClick.previousScreen && this.refSource == mobileOfficialAppsMarketStat$TypeMarketClick.refSource && this.refScreen == mobileOfficialAppsMarketStat$TypeMarketClick.refScreen && epx.f(this.sourceUrl, mobileOfficialAppsMarketStat$TypeMarketClick.sourceUrl) && this.trafficSource == mobileOfficialAppsMarketStat$TypeMarketClick.trafficSource && epx.f(this.typeMarketOpenSectionClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketOpenSectionClick) && epx.f(this.typeMarketModerationButtonClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketModerationButtonClick) && epx.f(this.typeMarketSearchClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketSearchClick) && epx.f(this.typeMarketCarouselTransitionToItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCarouselTransitionToItem) && epx.f(this.typeMarketCarouselAddItemToBookmarks, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCarouselAddItemToBookmarks) && epx.f(this.typeMarketCarouselRemoveItemFromBookmarks, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCarouselRemoveItemFromBookmarks) && epx.f(this.typeMarketCarouselClickShowAllItems, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketCarouselClickShowAllItems) && epx.f(this.typeMarketTransitionToBookmarks, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToBookmarks) && epx.f(this.typeMarketTransitionToWishlists, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToWishlists) && epx.f(this.typeMarketTransitionToAds, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToAds) && epx.f(this.typeMarketTransitionToProfile, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToProfile) && epx.f(this.typeMarketPlayItemVideo, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPlayItemVideo) && epx.f(this.typeMarketTransitionToCategoriesMenu, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToCategoriesMenu) && epx.f(this.typeMarketOpenPurchaseInfo, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketOpenPurchaseInfo) && epx.f(this.typeMarketOpenMarketAlbum, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketOpenMarketAlbum) && epx.f(this.typeMarketPaginationInProductTile, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPaginationInProductTile) && epx.f(this.typeMarketTransitionToLinkedContent, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToLinkedContent) && epx.f(this.typeMarketTransitionToLinkedContentBlock, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketTransitionToLinkedContentBlock) && epx.f(this.typeSmbNativeBookingCancelClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbNativeBookingCancelClick) && epx.f(this.typeSmbNativeBookingChooseMasterClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbNativeBookingChooseMasterClick) && epx.f(this.typeSmbNativeBookingChooseServiceClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbNativeBookingChooseServiceClick) && epx.f(this.typeSmbNativeBookingCloseClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbNativeBookingCloseClick) && epx.f(this.typeSmbNativeBookingFinishClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbNativeBookingFinishClick) && epx.f(this.typeSmbNativeBookingResheduleClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbNativeBookingResheduleClick) && epx.f(this.typeSmbYclientsStoryStickerClickItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbYclientsStoryStickerClickItem) && epx.f(this.typeSmbYclientsStoryChooseServiceClickItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbYclientsStoryChooseServiceClickItem) && epx.f(this.typeSmbYclientsStoryAddStickerItem, mobileOfficialAppsMarketStat$TypeMarketClick.typeSmbYclientsStoryAddStickerItem) && epx.f(this.typeMarketOpenItemsFromVideoClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketOpenItemsFromVideoClick) && epx.f(this.typeMarketAddItemsToVideoClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketAddItemsToVideoClick) && epx.f(this.typeMarketChangeItemsToVideoClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketChangeItemsToVideoClick) && epx.f(this.typeMarketPinCommunityReviewPinClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewPinClick) && epx.f(this.typeMarketPinCommunityReviewPopupPinForMoneyClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewPopupPinForMoneyClick) && epx.f(this.typeMarketPinCommunityReviewPopupVkpayClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewPopupVkpayClick) && epx.f(this.typeMarketPinCommunityReviewPopupErrorPinTryAgainClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewPopupErrorPinTryAgainClick) && epx.f(this.typeMarketPinCommunityReviewUnpinClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewUnpinClick) && epx.f(this.typeMarketPinCommunityReviewPopupErrorUnpinTryAgainClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewPopupErrorUnpinTryAgainClick) && epx.f(this.typeMarketPinCommunityReviewRepinClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewRepinClick) && epx.f(this.typeMarketPinCommunityReviewManagePinnedClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewManagePinnedClick) && epx.f(this.typeMarketPinCommunityReviewPopupManagePinnedCancelClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewPopupManagePinnedCancelClick) && epx.f(this.typeMarketPinCommunityReviewCancelPinnedClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewCancelPinnedClick) && epx.f(this.typeMarketPinCommunityReviewLeftActivePinnedClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewLeftActivePinnedClick) && epx.f(this.typeMarketPinCommunityReviewResumeClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewResumeClick) && epx.f(this.typeMarketPinCommunityReviewPopupManagePinnedResumeClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketPinCommunityReviewPopupManagePinnedResumeClick) && epx.f(this.typeMarketFomoLabelClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketFomoLabelClick) && epx.f(this.typeMarketDeliveryBlockClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketDeliveryBlockClick) && epx.f(this.typeMarketItemRatingClick, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketItemRatingClick) && epx.f(this.typeMarketItemPicker, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketItemPicker) && epx.f(this.typeMarketOpenItemsModal, mobileOfficialAppsMarketStat$TypeMarketClick.typeMarketOpenItemsModal);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        CommonMarketStat$TypeMarketSwitchItemVariantItem commonMarketStat$TypeMarketSwitchItemVariantItem = this.typeMarketSwitchItemVariant;
        int hashCode2 = (hashCode + (commonMarketStat$TypeMarketSwitchItemVariantItem == null ? 0 : commonMarketStat$TypeMarketSwitchItemVariantItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketClickOpenAllItemVariantsItem commonMarketStat$TypeMarketClickOpenAllItemVariantsItem = this.typeMarketClickOpenAllItemVariants;
        int hashCode3 = (hashCode2 + (commonMarketStat$TypeMarketClickOpenAllItemVariantsItem == null ? 0 : commonMarketStat$TypeMarketClickOpenAllItemVariantsItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketCheckoutFillProfileData commonMarketStat$TypeMarketCheckoutFillProfileData = this.typeMarketCheckoutFillProfileData;
        int hashCode4 = (hashCode3 + (commonMarketStat$TypeMarketCheckoutFillProfileData == null ? 0 : commonMarketStat$TypeMarketCheckoutFillProfileData.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem = this.typeMarketAddItemToBookmarks;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem = this.typeMarketRemoveItemFromBookmark;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem = this.typeMarketOrdersItem;
        int hashCode7 = (hashCode6 + (commonMarketStat$TypeMarketOrdersItem == null ? 0 : commonMarketStat$TypeMarketOrdersItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketMakeOrderFromCart commonMarketStat$TypeMarketMakeOrderFromCart = this.typeMarketMakeOrderFromCart;
        int hashCode8 = (hashCode7 + (commonMarketStat$TypeMarketMakeOrderFromCart == null ? 0 : commonMarketStat$TypeMarketMakeOrderFromCart.hashCode())) * 31;
        m mVar = this.typeMarketClearCart;
        int hashCode9 = (hashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        CommonMarketStat$TypeMarketCartsItem commonMarketStat$TypeMarketCartsItem = this.typeMarketCartsItem;
        int hashCode10 = (hashCode9 + (commonMarketStat$TypeMarketCartsItem == null ? 0 : commonMarketStat$TypeMarketCartsItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketHideItemItem mobileOfficialAppsMarketStat$TypeMarketHideItemItem = this.typeMarketHideItem;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsMarketStat$TypeMarketHideItemItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketHideItemItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem = this.typeMarketTransitionToItem;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem = this.typeMarketSendMessageToOwnerClick;
        int hashCode13 = (hashCode12 + (mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem = this.typeMarketTransitionToCollection;
        int hashCode14 = (hashCode13 + (mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem = this.typeMarketHideCollection;
        int hashCode15 = (hashCode14 + (mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem = this.typeMarketplaceItemClick;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem = this.typeMarketplaceMarketClick;
        int hashCode17 = (hashCode16 + (mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick = this.typeMarketplaceAddToBookmarksClick;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick = this.typeMarketplaceRemoveFromBookmarksClick;
        int hashCode19 = (hashCode18 + (mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem = this.typeMarketplaceTransitionToCartClick;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem.hashCode())) * 31;
        s sVar = this.typeMarketplaceTransitionToCartsListClick;
        int hashCode21 = (hashCode20 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem = this.typeMarketplaceTransitionToCheckoutClickItem;
        int hashCode22 = (hashCode21 + (commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem == null ? 0 : commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem = this.typeMarketplaceSubscribeMarketButtonClick;
        int hashCode23 = (hashCode22 + (mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem = this.typeMarketCtaButtonClick;
        int hashCode24 = (hashCode23 + (mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketTransitionToOzonReviewsItem commonMarketStat$TypeMarketTransitionToOzonReviewsItem = this.typeMarketTransitionToOzonReviews;
        int hashCode25 = (hashCode24 + (commonMarketStat$TypeMarketTransitionToOzonReviewsItem == null ? 0 : commonMarketStat$TypeMarketTransitionToOzonReviewsItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem = this.typeMarketplaceTransitionToBlock;
        int hashCode26 = (hashCode25 + (mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketEndEditItem commonMarketStat$TypeMarketEndEditItem = this.typeMarketEndEditItem;
        int hashCode27 = (hashCode26 + (commonMarketStat$TypeMarketEndEditItem == null ? 0 : commonMarketStat$TypeMarketEndEditItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem = this.typeMarketTransitionToSimilars;
        int hashCode28 = (hashCode27 + (mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem = this.typeMarketCopyLinkClick;
        int hashCode29 = (hashCode28 + (mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem = this.typeMarketTransitionToOwner;
        int hashCode30 = (hashCode29 + (mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem = this.typeMarketTransitionToMarket;
        int hashCode31 = (hashCode30 + (mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem = this.typeMarketSubscribeMarketButtonClick;
        int hashCode32 = (hashCode31 + (mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem.hashCode())) * 31;
        Integer num = this.analyticsVersion;
        int hashCode33 = (hashCode32 + (num == null ? 0 : num.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.previousScreen;
        int hashCode34 = (hashCode33 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.refSource;
        int hashCode35 = (hashCode34 + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = this.refScreen;
        int hashCode36 = (hashCode35 + (mobileOfficialAppsCoreNavStat$EventScreen2 == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen2.hashCode())) * 31;
        String str = this.sourceUrl;
        int hashCode37 = (hashCode36 + (str == null ? 0 : str.hashCode())) * 31;
        CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource = this.trafficSource;
        int hashCode38 = (hashCode37 + (commonMarketStat$TypeTrafficSource == null ? 0 : commonMarketStat$TypeTrafficSource.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem = this.typeMarketOpenSectionClick;
        int hashCode39 = (hashCode38 + (mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem mobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem = this.typeMarketModerationButtonClick;
        int hashCode40 = (hashCode39 + (mobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem.hashCode())) * 31;
        g0 g0Var = this.typeMarketSearchClick;
        int hashCode41 = (hashCode40 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem mobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem = this.typeMarketCarouselTransitionToItem;
        int hashCode42 = (hashCode41 + (mobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks mobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks = this.typeMarketCarouselAddItemToBookmarks;
        int hashCode43 = (hashCode42 + (mobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks mobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks = this.typeMarketCarouselRemoveItemFromBookmarks;
        int hashCode44 = (hashCode43 + (mobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems = this.typeMarketCarouselClickShowAllItems;
        int hashCode45 = (hashCode44 + (mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems.hashCode())) * 31;
        CommonMarketStat$TypeMarketTransitionToBookmarks commonMarketStat$TypeMarketTransitionToBookmarks = this.typeMarketTransitionToBookmarks;
        int hashCode46 = (hashCode45 + (commonMarketStat$TypeMarketTransitionToBookmarks == null ? 0 : commonMarketStat$TypeMarketTransitionToBookmarks.hashCode())) * 31;
        CommonMarketStat$TypeMarketTransitionToWishlists commonMarketStat$TypeMarketTransitionToWishlists = this.typeMarketTransitionToWishlists;
        int hashCode47 = (hashCode46 + (commonMarketStat$TypeMarketTransitionToWishlists == null ? 0 : commonMarketStat$TypeMarketTransitionToWishlists.hashCode())) * 31;
        CommonMarketStat$TypeMarketTransitionToAds commonMarketStat$TypeMarketTransitionToAds = this.typeMarketTransitionToAds;
        int hashCode48 = (hashCode47 + (commonMarketStat$TypeMarketTransitionToAds == null ? 0 : commonMarketStat$TypeMarketTransitionToAds.hashCode())) * 31;
        CommonMarketStat$TypeMarketTransitionToProfile commonMarketStat$TypeMarketTransitionToProfile = this.typeMarketTransitionToProfile;
        int hashCode49 = (hashCode48 + (commonMarketStat$TypeMarketTransitionToProfile == null ? 0 : commonMarketStat$TypeMarketTransitionToProfile.hashCode())) * 31;
        CommonMarketStat$TypeMarketPlayItemVideoItem commonMarketStat$TypeMarketPlayItemVideoItem = this.typeMarketPlayItemVideo;
        int hashCode50 = (hashCode49 + (commonMarketStat$TypeMarketPlayItemVideoItem == null ? 0 : commonMarketStat$TypeMarketPlayItemVideoItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketTransitionToCategoriesMenu commonMarketStat$TypeMarketTransitionToCategoriesMenu = this.typeMarketTransitionToCategoriesMenu;
        int hashCode51 = (hashCode50 + (commonMarketStat$TypeMarketTransitionToCategoriesMenu == null ? 0 : commonMarketStat$TypeMarketTransitionToCategoriesMenu.hashCode())) * 31;
        p pVar = this.typeMarketOpenPurchaseInfo;
        int hashCode52 = (hashCode51 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        o oVar = this.typeMarketOpenMarketAlbum;
        int hashCode53 = (hashCode52 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        CommonMarketStat$TypeMarketPaginationInProductTile commonMarketStat$TypeMarketPaginationInProductTile = this.typeMarketPaginationInProductTile;
        int hashCode54 = (hashCode53 + (commonMarketStat$TypeMarketPaginationInProductTile == null ? 0 : commonMarketStat$TypeMarketPaginationInProductTile.hashCode())) * 31;
        CommonMarketStat$TypeMarketTransitionToLinkedContent commonMarketStat$TypeMarketTransitionToLinkedContent = this.typeMarketTransitionToLinkedContent;
        int hashCode55 = (hashCode54 + (commonMarketStat$TypeMarketTransitionToLinkedContent == null ? 0 : commonMarketStat$TypeMarketTransitionToLinkedContent.hashCode())) * 31;
        q qVar = this.typeMarketTransitionToLinkedContentBlock;
        int hashCode56 = (hashCode55 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingCancelClickItem commonMarketStat$TypeSmbNativeBookingCancelClickItem = this.typeSmbNativeBookingCancelClick;
        int hashCode57 = (hashCode56 + (commonMarketStat$TypeSmbNativeBookingCancelClickItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingCancelClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem = this.typeSmbNativeBookingChooseMasterClick;
        int hashCode58 = (hashCode57 + (commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem commonMarketStat$TypeSmbNativeBookingChooseServiceClickItem = this.typeSmbNativeBookingChooseServiceClick;
        int hashCode59 = (hashCode58 + (commonMarketStat$TypeSmbNativeBookingChooseServiceClickItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingChooseServiceClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingCloseClickItem commonMarketStat$TypeSmbNativeBookingCloseClickItem = this.typeSmbNativeBookingCloseClick;
        int hashCode60 = (hashCode59 + (commonMarketStat$TypeSmbNativeBookingCloseClickItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingCloseClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingFinishClickItem commonMarketStat$TypeSmbNativeBookingFinishClickItem = this.typeSmbNativeBookingFinishClick;
        int hashCode61 = (hashCode60 + (commonMarketStat$TypeSmbNativeBookingFinishClickItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingFinishClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingResheduleClickItem commonMarketStat$TypeSmbNativeBookingResheduleClickItem = this.typeSmbNativeBookingResheduleClick;
        int hashCode62 = (hashCode61 + (commonMarketStat$TypeSmbNativeBookingResheduleClickItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingResheduleClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbYclientsStoryStickerClickItem commonMarketStat$TypeSmbYclientsStoryStickerClickItem = this.typeSmbYclientsStoryStickerClickItem;
        int hashCode63 = (hashCode62 + (commonMarketStat$TypeSmbYclientsStoryStickerClickItem == null ? 0 : commonMarketStat$TypeSmbYclientsStoryStickerClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem commonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem = this.typeSmbYclientsStoryChooseServiceClickItem;
        int hashCode64 = (hashCode63 + (commonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem == null ? 0 : commonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbYclientsStoryAddStickerItem commonMarketStat$TypeSmbYclientsStoryAddStickerItem = this.typeSmbYclientsStoryAddStickerItem;
        int hashCode65 = (hashCode64 + (commonMarketStat$TypeSmbYclientsStoryAddStickerItem == null ? 0 : commonMarketStat$TypeSmbYclientsStoryAddStickerItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem commonMarketStat$TypeMarketOpenItemsFromVideoClickItem = this.typeMarketOpenItemsFromVideoClick;
        int hashCode66 = (hashCode65 + (commonMarketStat$TypeMarketOpenItemsFromVideoClickItem == null ? 0 : commonMarketStat$TypeMarketOpenItemsFromVideoClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketAddItemsToVideoClickItem commonMarketStat$TypeMarketAddItemsToVideoClickItem = this.typeMarketAddItemsToVideoClick;
        int hashCode67 = (hashCode66 + (commonMarketStat$TypeMarketAddItemsToVideoClickItem == null ? 0 : commonMarketStat$TypeMarketAddItemsToVideoClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketChangeItemsToVideoClickItem commonMarketStat$TypeMarketChangeItemsToVideoClickItem = this.typeMarketChangeItemsToVideoClick;
        int hashCode68 = (hashCode67 + (commonMarketStat$TypeMarketChangeItemsToVideoClickItem == null ? 0 : commonMarketStat$TypeMarketChangeItemsToVideoClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem commonMarketStat$TypeMarketPinCommunityReviewPinClickItem = this.typeMarketPinCommunityReviewPinClick;
        int hashCode69 = (hashCode68 + (commonMarketStat$TypeMarketPinCommunityReviewPinClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPinClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem = this.typeMarketPinCommunityReviewPopupPinForMoneyClick;
        int hashCode70 = (hashCode69 + (commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem = this.typeMarketPinCommunityReviewPopupVkpayClick;
        int hashCode71 = (hashCode70 + (commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem = this.typeMarketPinCommunityReviewPopupErrorPinTryAgainClick;
        int hashCode72 = (hashCode71 + (commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem commonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem = this.typeMarketPinCommunityReviewUnpinClick;
        int hashCode73 = (hashCode72 + (commonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem = this.typeMarketPinCommunityReviewPopupErrorUnpinTryAgainClick;
        int hashCode74 = (hashCode73 + (commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem = this.typeMarketPinCommunityReviewRepinClick;
        int hashCode75 = (hashCode74 + (commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem = this.typeMarketPinCommunityReviewManagePinnedClick;
        int hashCode76 = (hashCode75 + (commonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem = this.typeMarketPinCommunityReviewPopupManagePinnedCancelClick;
        int hashCode77 = (hashCode76 + (commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem = this.typeMarketPinCommunityReviewCancelPinnedClick;
        int hashCode78 = (hashCode77 + (commonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem = this.typeMarketPinCommunityReviewLeftActivePinnedClick;
        int hashCode79 = (hashCode78 + (commonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem commonMarketStat$TypeMarketPinCommunityReviewResumeClickItem = this.typeMarketPinCommunityReviewResumeClick;
        int hashCode80 = (hashCode79 + (commonMarketStat$TypeMarketPinCommunityReviewResumeClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewResumeClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem = this.typeMarketPinCommunityReviewPopupManagePinnedResumeClick;
        int hashCode81 = (hashCode80 + (commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketFomoLabelClickItem commonMarketStat$TypeMarketFomoLabelClickItem = this.typeMarketFomoLabelClick;
        int hashCode82 = (hashCode81 + (commonMarketStat$TypeMarketFomoLabelClickItem == null ? 0 : commonMarketStat$TypeMarketFomoLabelClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketDeliveryBlockClickItem commonMarketStat$TypeMarketDeliveryBlockClickItem = this.typeMarketDeliveryBlockClick;
        int hashCode83 = (hashCode82 + (commonMarketStat$TypeMarketDeliveryBlockClickItem == null ? 0 : commonMarketStat$TypeMarketDeliveryBlockClickItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketItemRatingItem commonMarketStat$TypeMarketItemRatingItem = this.typeMarketItemRatingClick;
        int hashCode84 = (hashCode83 + (commonMarketStat$TypeMarketItemRatingItem == null ? 0 : commonMarketStat$TypeMarketItemRatingItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketItemPicker commonMarketStat$TypeMarketItemPicker = this.typeMarketItemPicker;
        int hashCode85 = (hashCode84 + (commonMarketStat$TypeMarketItemPicker == null ? 0 : commonMarketStat$TypeMarketItemPicker.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem mobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem = this.typeMarketOpenItemsModal;
        return hashCode85 + (mobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem != null ? mobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketClick(type=" + this.type + ", typeMarketSwitchItemVariant=" + this.typeMarketSwitchItemVariant + ", typeMarketClickOpenAllItemVariants=" + this.typeMarketClickOpenAllItemVariants + ", typeMarketCheckoutFillProfileData=" + this.typeMarketCheckoutFillProfileData + ", typeMarketAddItemToBookmarks=" + this.typeMarketAddItemToBookmarks + ", typeMarketRemoveItemFromBookmark=" + this.typeMarketRemoveItemFromBookmark + ", typeMarketOrdersItem=" + this.typeMarketOrdersItem + ", typeMarketMakeOrderFromCart=" + this.typeMarketMakeOrderFromCart + ", typeMarketClearCart=" + this.typeMarketClearCart + ", typeMarketCartsItem=" + this.typeMarketCartsItem + ", typeMarketHideItem=" + this.typeMarketHideItem + ", typeMarketTransitionToItem=" + this.typeMarketTransitionToItem + ", typeMarketSendMessageToOwnerClick=" + this.typeMarketSendMessageToOwnerClick + ", typeMarketTransitionToCollection=" + this.typeMarketTransitionToCollection + ", typeMarketHideCollection=" + this.typeMarketHideCollection + ", typeMarketplaceItemClick=" + this.typeMarketplaceItemClick + ", typeMarketplaceMarketClick=" + this.typeMarketplaceMarketClick + ", typeMarketplaceAddToBookmarksClick=" + this.typeMarketplaceAddToBookmarksClick + ", typeMarketplaceRemoveFromBookmarksClick=" + this.typeMarketplaceRemoveFromBookmarksClick + ", typeMarketplaceTransitionToCartClick=" + this.typeMarketplaceTransitionToCartClick + ", typeMarketplaceTransitionToCartsListClick=" + this.typeMarketplaceTransitionToCartsListClick + ", typeMarketplaceTransitionToCheckoutClickItem=" + this.typeMarketplaceTransitionToCheckoutClickItem + ", typeMarketplaceSubscribeMarketButtonClick=" + this.typeMarketplaceSubscribeMarketButtonClick + ", typeMarketCtaButtonClick=" + this.typeMarketCtaButtonClick + ", typeMarketTransitionToOzonReviews=" + this.typeMarketTransitionToOzonReviews + ", typeMarketplaceTransitionToBlock=" + this.typeMarketplaceTransitionToBlock + ", typeMarketEndEditItem=" + this.typeMarketEndEditItem + ", typeMarketTransitionToSimilars=" + this.typeMarketTransitionToSimilars + ", typeMarketCopyLinkClick=" + this.typeMarketCopyLinkClick + ", typeMarketTransitionToOwner=" + this.typeMarketTransitionToOwner + ", typeMarketTransitionToMarket=" + this.typeMarketTransitionToMarket + ", typeMarketSubscribeMarketButtonClick=" + this.typeMarketSubscribeMarketButtonClick + ", analyticsVersion=" + this.analyticsVersion + ", previousScreen=" + this.previousScreen + ", refSource=" + this.refSource + ", refScreen=" + this.refScreen + ", sourceUrl=" + this.sourceUrl + ", trafficSource=" + this.trafficSource + ", typeMarketOpenSectionClick=" + this.typeMarketOpenSectionClick + ", typeMarketModerationButtonClick=" + this.typeMarketModerationButtonClick + ", typeMarketSearchClick=" + this.typeMarketSearchClick + ", typeMarketCarouselTransitionToItem=" + this.typeMarketCarouselTransitionToItem + ", typeMarketCarouselAddItemToBookmarks=" + this.typeMarketCarouselAddItemToBookmarks + ", typeMarketCarouselRemoveItemFromBookmarks=" + this.typeMarketCarouselRemoveItemFromBookmarks + ", typeMarketCarouselClickShowAllItems=" + this.typeMarketCarouselClickShowAllItems + ", typeMarketTransitionToBookmarks=" + this.typeMarketTransitionToBookmarks + ", typeMarketTransitionToWishlists=" + this.typeMarketTransitionToWishlists + ", typeMarketTransitionToAds=" + this.typeMarketTransitionToAds + ", typeMarketTransitionToProfile=" + this.typeMarketTransitionToProfile + ", typeMarketPlayItemVideo=" + this.typeMarketPlayItemVideo + ", typeMarketTransitionToCategoriesMenu=" + this.typeMarketTransitionToCategoriesMenu + ", typeMarketOpenPurchaseInfo=" + this.typeMarketOpenPurchaseInfo + ", typeMarketOpenMarketAlbum=" + this.typeMarketOpenMarketAlbum + ", typeMarketPaginationInProductTile=" + this.typeMarketPaginationInProductTile + ", typeMarketTransitionToLinkedContent=" + this.typeMarketTransitionToLinkedContent + ", typeMarketTransitionToLinkedContentBlock=" + this.typeMarketTransitionToLinkedContentBlock + ", typeSmbNativeBookingCancelClick=" + this.typeSmbNativeBookingCancelClick + ", typeSmbNativeBookingChooseMasterClick=" + this.typeSmbNativeBookingChooseMasterClick + ", typeSmbNativeBookingChooseServiceClick=" + this.typeSmbNativeBookingChooseServiceClick + ", typeSmbNativeBookingCloseClick=" + this.typeSmbNativeBookingCloseClick + ", typeSmbNativeBookingFinishClick=" + this.typeSmbNativeBookingFinishClick + ", typeSmbNativeBookingResheduleClick=" + this.typeSmbNativeBookingResheduleClick + ", typeSmbYclientsStoryStickerClickItem=" + this.typeSmbYclientsStoryStickerClickItem + ", typeSmbYclientsStoryChooseServiceClickItem=" + this.typeSmbYclientsStoryChooseServiceClickItem + ", typeSmbYclientsStoryAddStickerItem=" + this.typeSmbYclientsStoryAddStickerItem + ", typeMarketOpenItemsFromVideoClick=" + this.typeMarketOpenItemsFromVideoClick + ", typeMarketAddItemsToVideoClick=" + this.typeMarketAddItemsToVideoClick + ", typeMarketChangeItemsToVideoClick=" + this.typeMarketChangeItemsToVideoClick + ", typeMarketPinCommunityReviewPinClick=" + this.typeMarketPinCommunityReviewPinClick + ", typeMarketPinCommunityReviewPopupPinForMoneyClick=" + this.typeMarketPinCommunityReviewPopupPinForMoneyClick + ", typeMarketPinCommunityReviewPopupVkpayClick=" + this.typeMarketPinCommunityReviewPopupVkpayClick + ", typeMarketPinCommunityReviewPopupErrorPinTryAgainClick=" + this.typeMarketPinCommunityReviewPopupErrorPinTryAgainClick + ", typeMarketPinCommunityReviewUnpinClick=" + this.typeMarketPinCommunityReviewUnpinClick + ", typeMarketPinCommunityReviewPopupErrorUnpinTryAgainClick=" + this.typeMarketPinCommunityReviewPopupErrorUnpinTryAgainClick + ", typeMarketPinCommunityReviewRepinClick=" + this.typeMarketPinCommunityReviewRepinClick + ", typeMarketPinCommunityReviewManagePinnedClick=" + this.typeMarketPinCommunityReviewManagePinnedClick + ", typeMarketPinCommunityReviewPopupManagePinnedCancelClick=" + this.typeMarketPinCommunityReviewPopupManagePinnedCancelClick + ", typeMarketPinCommunityReviewCancelPinnedClick=" + this.typeMarketPinCommunityReviewCancelPinnedClick + ", typeMarketPinCommunityReviewLeftActivePinnedClick=" + this.typeMarketPinCommunityReviewLeftActivePinnedClick + ", typeMarketPinCommunityReviewResumeClick=" + this.typeMarketPinCommunityReviewResumeClick + ", typeMarketPinCommunityReviewPopupManagePinnedResumeClick=" + this.typeMarketPinCommunityReviewPopupManagePinnedResumeClick + ", typeMarketFomoLabelClick=" + this.typeMarketFomoLabelClick + ", typeMarketDeliveryBlockClick=" + this.typeMarketDeliveryBlockClick + ", typeMarketItemRatingClick=" + this.typeMarketItemRatingClick + ", typeMarketItemPicker=" + this.typeMarketItemPicker + ", typeMarketOpenItemsModal=" + this.typeMarketOpenItemsModal + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketClick(Type type, CommonMarketStat$TypeMarketSwitchItemVariantItem commonMarketStat$TypeMarketSwitchItemVariantItem, CommonMarketStat$TypeMarketClickOpenAllItemVariantsItem commonMarketStat$TypeMarketClickOpenAllItemVariantsItem, CommonMarketStat$TypeMarketCheckoutFillProfileData commonMarketStat$TypeMarketCheckoutFillProfileData, MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem, MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem, CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem, CommonMarketStat$TypeMarketMakeOrderFromCart commonMarketStat$TypeMarketMakeOrderFromCart, m mVar, CommonMarketStat$TypeMarketCartsItem commonMarketStat$TypeMarketCartsItem, MobileOfficialAppsMarketStat$TypeMarketHideItemItem mobileOfficialAppsMarketStat$TypeMarketHideItemItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem, MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem, MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem, MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem, MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem, MobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick, MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick, MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem, s sVar, CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem, MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem, CommonMarketStat$TypeMarketTransitionToOzonReviewsItem commonMarketStat$TypeMarketTransitionToOzonReviewsItem, MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem, CommonMarketStat$TypeMarketEndEditItem commonMarketStat$TypeMarketEndEditItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem, MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem, MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem, MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2, String str, CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource, MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem, MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem mobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem, g0 g0Var, MobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem mobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem, MobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks mobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks, MobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks mobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks, MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems, CommonMarketStat$TypeMarketTransitionToBookmarks commonMarketStat$TypeMarketTransitionToBookmarks, CommonMarketStat$TypeMarketTransitionToWishlists commonMarketStat$TypeMarketTransitionToWishlists, CommonMarketStat$TypeMarketTransitionToAds commonMarketStat$TypeMarketTransitionToAds, CommonMarketStat$TypeMarketTransitionToProfile commonMarketStat$TypeMarketTransitionToProfile, CommonMarketStat$TypeMarketPlayItemVideoItem commonMarketStat$TypeMarketPlayItemVideoItem, CommonMarketStat$TypeMarketTransitionToCategoriesMenu commonMarketStat$TypeMarketTransitionToCategoriesMenu, p pVar, o oVar, CommonMarketStat$TypeMarketPaginationInProductTile commonMarketStat$TypeMarketPaginationInProductTile, CommonMarketStat$TypeMarketTransitionToLinkedContent commonMarketStat$TypeMarketTransitionToLinkedContent, q qVar, CommonMarketStat$TypeSmbNativeBookingCancelClickItem commonMarketStat$TypeSmbNativeBookingCancelClickItem, CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem, CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem commonMarketStat$TypeSmbNativeBookingChooseServiceClickItem, CommonMarketStat$TypeSmbNativeBookingCloseClickItem commonMarketStat$TypeSmbNativeBookingCloseClickItem, CommonMarketStat$TypeSmbNativeBookingFinishClickItem commonMarketStat$TypeSmbNativeBookingFinishClickItem, CommonMarketStat$TypeSmbNativeBookingResheduleClickItem commonMarketStat$TypeSmbNativeBookingResheduleClickItem, CommonMarketStat$TypeSmbYclientsStoryStickerClickItem commonMarketStat$TypeSmbYclientsStoryStickerClickItem, CommonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem commonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem, CommonMarketStat$TypeSmbYclientsStoryAddStickerItem commonMarketStat$TypeSmbYclientsStoryAddStickerItem, CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem commonMarketStat$TypeMarketOpenItemsFromVideoClickItem, CommonMarketStat$TypeMarketAddItemsToVideoClickItem commonMarketStat$TypeMarketAddItemsToVideoClickItem, CommonMarketStat$TypeMarketChangeItemsToVideoClickItem commonMarketStat$TypeMarketChangeItemsToVideoClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem commonMarketStat$TypeMarketPinCommunityReviewPinClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem, CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem commonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem, CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem, CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem, CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem, CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem commonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem, CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem commonMarketStat$TypeMarketPinCommunityReviewResumeClickItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem, CommonMarketStat$TypeMarketFomoLabelClickItem commonMarketStat$TypeMarketFomoLabelClickItem, CommonMarketStat$TypeMarketDeliveryBlockClickItem commonMarketStat$TypeMarketDeliveryBlockClickItem, CommonMarketStat$TypeMarketItemRatingItem commonMarketStat$TypeMarketItemRatingItem, CommonMarketStat$TypeMarketItemPicker commonMarketStat$TypeMarketItemPicker, MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem mobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem, int i, int i2, int i3, zcl zclVar) {
        this(r70, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r71, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i2 & 4) != 0 ? null : commonMarketStat$TypeRefSource, (i2 & 8) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen2, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : commonMarketStat$TypeTrafficSource, (i2 & 64) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem, (i2 & 128) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem, (i2 & 256) != 0 ? null : g0Var, (i2 & 512) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketCarouselTransitionToItem, (i2 & 1024) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketCarouselAddItemToBookmarks, (i2 & 2048) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketCarouselRemoveItemFromBookmarks, (i2 & 4096) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems, (i2 & 8192) != 0 ? null : commonMarketStat$TypeMarketTransitionToBookmarks, (i2 & 16384) != 0 ? null : commonMarketStat$TypeMarketTransitionToWishlists, (i2 & 32768) != 0 ? null : commonMarketStat$TypeMarketTransitionToAds, (i2 & 65536) != 0 ? null : commonMarketStat$TypeMarketTransitionToProfile, (i2 & 131072) != 0 ? null : commonMarketStat$TypeMarketPlayItemVideoItem, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonMarketStat$TypeMarketTransitionToCategoriesMenu, (i2 & 524288) != 0 ? null : pVar, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : oVar, (i2 & 2097152) != 0 ? null : commonMarketStat$TypeMarketPaginationInProductTile, (i2 & 4194304) != 0 ? null : commonMarketStat$TypeMarketTransitionToLinkedContent, (i2 & 8388608) != 0 ? null : qVar, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonMarketStat$TypeSmbNativeBookingCancelClickItem, (i2 & 33554432) != 0 ? null : commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem, (i2 & 67108864) != 0 ? null : commonMarketStat$TypeSmbNativeBookingChooseServiceClickItem, (i2 & 134217728) != 0 ? null : commonMarketStat$TypeSmbNativeBookingCloseClickItem, (i2 & 268435456) != 0 ? null : commonMarketStat$TypeSmbNativeBookingFinishClickItem, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : commonMarketStat$TypeSmbNativeBookingResheduleClickItem, (i2 & 1073741824) != 0 ? null : commonMarketStat$TypeSmbYclientsStoryStickerClickItem, (i2 & Integer.MIN_VALUE) != 0 ? null : commonMarketStat$TypeSmbYclientsStoryChooseServiceClickItem, (i3 & 1) != 0 ? null : commonMarketStat$TypeSmbYclientsStoryAddStickerItem, (i3 & 2) != 0 ? null : commonMarketStat$TypeMarketOpenItemsFromVideoClickItem, (i3 & 4) != 0 ? null : commonMarketStat$TypeMarketAddItemsToVideoClickItem, (i3 & 8) != 0 ? null : commonMarketStat$TypeMarketChangeItemsToVideoClickItem, (i3 & 16) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPinClickItem, (i3 & 32) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem, (i3 & 64) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem, (i3 & 128) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem, (i3 & 256) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem, (i3 & 512) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem, (i3 & 1024) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem, (i3 & 2048) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem, (i3 & 4096) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem, (i3 & 8192) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem, (i3 & 16384) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem, (i3 & 32768) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewResumeClickItem, (i3 & 65536) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem, (i3 & 131072) != 0 ? null : commonMarketStat$TypeMarketFomoLabelClickItem, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonMarketStat$TypeMarketDeliveryBlockClickItem, (i3 & 524288) != 0 ? null : commonMarketStat$TypeMarketItemRatingItem, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : commonMarketStat$TypeMarketItemPicker, (i3 & 2097152) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem);
        Type type2 = (i & 1) != 0 ? null : type;
        CommonMarketStat$TypeMarketSwitchItemVariantItem commonMarketStat$TypeMarketSwitchItemVariantItem2 = (i & 2) != 0 ? null : commonMarketStat$TypeMarketSwitchItemVariantItem;
        CommonMarketStat$TypeMarketClickOpenAllItemVariantsItem commonMarketStat$TypeMarketClickOpenAllItemVariantsItem2 = (i & 4) != 0 ? null : commonMarketStat$TypeMarketClickOpenAllItemVariantsItem;
        CommonMarketStat$TypeMarketCheckoutFillProfileData commonMarketStat$TypeMarketCheckoutFillProfileData2 = (i & 8) != 0 ? null : commonMarketStat$TypeMarketCheckoutFillProfileData;
        MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem2 = (i & 16) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem;
        MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem2 = (i & 32) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem;
        CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem2 = (i & 64) != 0 ? null : commonMarketStat$TypeMarketOrdersItem;
        CommonMarketStat$TypeMarketMakeOrderFromCart commonMarketStat$TypeMarketMakeOrderFromCart2 = (i & 128) != 0 ? null : commonMarketStat$TypeMarketMakeOrderFromCart;
        m mVar2 = (i & 256) != 0 ? null : mVar;
        CommonMarketStat$TypeMarketCartsItem commonMarketStat$TypeMarketCartsItem2 = (i & 512) != 0 ? null : commonMarketStat$TypeMarketCartsItem;
        MobileOfficialAppsMarketStat$TypeMarketHideItemItem mobileOfficialAppsMarketStat$TypeMarketHideItemItem2 = (i & 1024) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketHideItemItem;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem2 = (i & 2048) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem;
        MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem2 = (i & 4096) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem;
        Type type3 = type2;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem2 = (i & 8192) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem;
        MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem2 = (i & 16384) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketHideCollectionItem;
        MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem2 = (i & 32768) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem;
        MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem2 = (i & 65536) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem;
        MobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick2 = (i & 131072) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceAddToBookmarksClick;
        MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick;
        MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem2 = (i & 524288) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem;
        s sVar2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : sVar;
        CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem2 = (i & 2097152) != 0 ? null : commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem;
        MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem2 = (i & 4194304) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem;
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem2 = (i & 8388608) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
        CommonMarketStat$TypeMarketTransitionToOzonReviewsItem commonMarketStat$TypeMarketTransitionToOzonReviewsItem2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonMarketStat$TypeMarketTransitionToOzonReviewsItem;
        MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem2 = (i & 33554432) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem;
        CommonMarketStat$TypeMarketEndEditItem commonMarketStat$TypeMarketEndEditItem2 = (i & 67108864) != 0 ? null : commonMarketStat$TypeMarketEndEditItem;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem2 = (i & 134217728) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem;
        MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem2 = (i & 268435456) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem;
        MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem2 = (i & 1073741824) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem;
        MobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem2 = (i & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketSubscribeMarketButtonClickItem;
    }
}
