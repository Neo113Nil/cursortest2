package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$TypeView;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketView implements SchemeStat$TypeView.b {

    @pmi0("analytics_version")
    private final Integer analyticsVersion;

    @pmi0("previous_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen previousScreen;

    @pmi0("ref_source")
    private final CommonMarketStat$TypeRefSource refSource;

    @pmi0("source_url")
    private final String sourceUrl;

    @pmi0("traffic_source")
    private final CommonMarketStat$TypeTrafficSource trafficSource;

    @pmi0("type")
    private final Type type;

    @pmi0("type_market_delivery_block_view")
    private final CommonMarketStat$TypeMarketDeliveryBlockViewItem typeMarketDeliveryBlockView;

    @pmi0("type_market_item_picker")
    private final CommonMarketStat$TypeMarketItemPicker typeMarketItemPicker;

    @pmi0("type_market_item_reviews_show")
    private final CommonMarketStat$TypeMarketItemRatingItem typeMarketItemReviewsShow;

    @pmi0("type_market_open_marketplace")
    private final MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem typeMarketOpenMarketplace;

    @pmi0("type_market_pin_community_review_popup_already_pinned_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem typeMarketPinCommunityReviewPopupAlreadyPinnedView;

    @pmi0("type_market_pin_community_review_popup_canceled_pinned_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem typeMarketPinCommunityReviewPopupCanceledPinnedView;

    @pmi0("type_market_pin_community_review_popup_ensure_cancel_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem typeMarketPinCommunityReviewPopupEnsureCancelView;

    @pmi0("type_market_pin_community_review_popup_error_loading_pinned_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem typeMarketPinCommunityReviewPopupErrorLoadingPinnedView;

    @pmi0("type_market_pin_community_review_popup_error_pin_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem typeMarketPinCommunityReviewPopupErrorPinView;

    @pmi0("type_market_pin_community_review_popup_error_unpin_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem typeMarketPinCommunityReviewPopupErrorUnpinView;

    @pmi0("type_market_pin_community_review_popup_manage_pinned_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem typeMarketPinCommunityReviewPopupManagePinnedView;

    @pmi0("type_market_pin_community_review_popup_pin_for_money_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem typeMarketPinCommunityReviewPopupPinForMoneyView;

    @pmi0("type_market_pin_community_review_popup_repin_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem typeMarketPinCommunityReviewPopupRepinView;

    @pmi0("type_market_pin_community_review_popup_vkpay_view")
    private final CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem typeMarketPinCommunityReviewPopupVkpayView;

    @pmi0("type_market_show_items_from_video_view")
    private final CommonMarketStat$TypeMarketShowItemsFromVideoViewItem typeMarketShowItemsFromVideoView;

    @pmi0("type_market_view_ads_carousel_item")
    private final MobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem typeMarketViewAdsCarouselItem;

    @pmi0("type_market_view_checkout")
    private final CommonMarketStat$TypeMarketViewCheckout typeMarketViewCheckout;

    @pmi0("type_market_view_collection")
    private final MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem typeMarketViewCollection;

    @pmi0("type_market_view_empty_cart")
    private final MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart typeMarketViewEmptyCart;

    @pmi0("type_market_view_item")
    private final MobileOfficialAppsMarketStat$TypeMarketViewItemItem typeMarketViewItem;

    @pmi0("type_market_view_item_media")
    private final CommonMarketStat$TypeMarketViewItemMediaItem typeMarketViewItemMedia;

    @pmi0("type_market_view_linked_content")
    private final CommonMarketStat$TypeMarketViewLinkedContent typeMarketViewLinkedContent;

    @pmi0("type_market_view_linked_content_block")
    private final r typeMarketViewLinkedContentBlock;

    @pmi0("type_market_view_portlet")
    private final h0 typeMarketViewPortlet;

    @pmi0("type_market_view_post_with_market")
    private final MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem typeMarketViewPostWithMarket;

    @pmi0("type_marketplace_block_view")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem typeMarketplaceBlockView;

    @pmi0("type_marketplace_item_view")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem typeMarketplaceItemView;

    @pmi0("type_marketplace_market_view")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem typeMarketplaceMarketView;

    @pmi0("type_marketplace_search_view")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem typeMarketplaceSearchView;

    @pmi0("type_smb_native_booking_cancel_success_view")
    private final CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem typeSmbNativeBookingCancelSuccessView;

    @pmi0("type_smb_native_booking_check_view")
    private final CommonMarketStat$TypeSmbNativeBookingCheckViewItem typeSmbNativeBookingCheckView;

    @pmi0("type_smb_native_booking_error_view")
    private final CommonMarketStat$TypeSmbNativeBookingErrorViewItem typeSmbNativeBookingErrorView;

    @pmi0("type_smb_native_booking_master_view")
    private final CommonMarketStat$TypeSmbNativeBookingMasterViewItem typeSmbNativeBookingMasterView;

    @pmi0("type_smb_native_booking_no_timeslots_view")
    private final CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem typeSmbNativeBookingNoTimeslotsView;

    @pmi0("type_smb_native_booking_repeat_records_master_unavailable_view")
    private final CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem typeSmbNativeBookingRepeatRecordsMasterUnavailableView;

    @pmi0("type_smb_native_booking_repeat_records_service_unavailable_view")
    private final CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem typeSmbNativeBookingRepeatRecordsServiceUnavailableView;

    @pmi0("type_smb_native_booking_repeat_records_widget_view")
    private final CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem typeSmbNativeBookingRepeatRecordsWidgetView;

    @pmi0("type_smb_native_booking_reshedule_success_view")
    private final CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem typeSmbNativeBookingResheduleSuccessView;

    @pmi0("type_smb_native_booking_schedule_view")
    private final CommonMarketStat$TypeSmbNativeBookingScheduleViewItem typeSmbNativeBookingScheduleView;

    @pmi0("type_smb_native_booking_services_view")
    private final CommonMarketStat$TypeSmbNativeBookingServicesViewItem typeSmbNativeBookingServicesView;

    @pmi0("type_smb_native_booking_start_view")
    private final CommonMarketStat$TypeSmbNativeBookingStartViewItem typeSmbNativeBookingStartView;

    @pmi0("type_smb_native_booking_starting_menu_view")
    private final CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem typeSmbNativeBookingStartingMenuView;

    @pmi0("type_smb_native_booking_success")
    private final CommonMarketStat$TypeSmbNativeBookingSuccessItem typeSmbNativeBookingSuccess;

    @pmi0("type_smb_native_booking_success_view")
    private final CommonMarketStat$TypeSmbNativeBookingSuccessViewItem typeSmbNativeBookingSuccessView;

    @pmi0("type_smb_native_booking_timeslots_view")
    private final CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem typeSmbNativeBookingTimeslotsView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_marketplace_block_view")
        public static final Type TYPE_MARKETPLACE_BLOCK_VIEW;

        @pmi0("type_marketplace_item_view")
        public static final Type TYPE_MARKETPLACE_ITEM_VIEW;

        @pmi0("type_marketplace_market_view")
        public static final Type TYPE_MARKETPLACE_MARKET_VIEW;

        @pmi0("type_marketplace_search_view")
        public static final Type TYPE_MARKETPLACE_SEARCH_VIEW;

        @pmi0("type_market_delivery_block_view")
        public static final Type TYPE_MARKET_DELIVERY_BLOCK_VIEW;

        @pmi0("type_market_item_picker")
        public static final Type TYPE_MARKET_ITEM_PICKER;

        @pmi0("type_market_item_reviews_show")
        public static final Type TYPE_MARKET_ITEM_REVIEWS_SHOW;

        @pmi0("type_market_open_marketplace")
        public static final Type TYPE_MARKET_OPEN_MARKETPLACE;

        @pmi0("type_market_pin_community_review_popup_already_pinned_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ALREADY_PINNED_VIEW;

        @pmi0("type_market_pin_community_review_popup_canceled_pinned_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_CANCELED_PINNED_VIEW;

        @pmi0("type_market_pin_community_review_popup_ensure_cancel_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ENSURE_CANCEL_VIEW;

        @pmi0("type_market_pin_community_review_popup_error_loading_pinned_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_LOADING_PINNED_VIEW;

        @pmi0("type_market_pin_community_review_popup_error_pin_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_VIEW;

        @pmi0("type_market_pin_community_review_popup_error_unpin_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_VIEW;

        @pmi0("type_market_pin_community_review_popup_manage_pinned_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_VIEW;

        @pmi0("type_market_pin_community_review_popup_pin_for_money_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_VIEW;

        @pmi0("type_market_pin_community_review_popup_repin_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_REPIN_VIEW;

        @pmi0("type_market_pin_community_review_popup_vkpay_view")
        public static final Type TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_VIEW;

        @pmi0("type_market_show_items_from_video_view")
        public static final Type TYPE_MARKET_SHOW_ITEMS_FROM_VIDEO_VIEW;

        @pmi0("type_market_view_ads_carousel_item")
        public static final Type TYPE_MARKET_VIEW_ADS_CAROUSEL_ITEM;

        @pmi0("type_market_view_checkout")
        public static final Type TYPE_MARKET_VIEW_CHECKOUT;

        @pmi0("type_market_view_collection")
        public static final Type TYPE_MARKET_VIEW_COLLECTION;

        @pmi0("type_market_view_empty_cart")
        public static final Type TYPE_MARKET_VIEW_EMPTY_CART;

        @pmi0("type_market_view_item")
        public static final Type TYPE_MARKET_VIEW_ITEM;

        @pmi0("type_market_view_item_media")
        public static final Type TYPE_MARKET_VIEW_ITEM_MEDIA;

        @pmi0("type_market_view_linked_content")
        public static final Type TYPE_MARKET_VIEW_LINKED_CONTENT;

        @pmi0("type_market_view_linked_content_block")
        public static final Type TYPE_MARKET_VIEW_LINKED_CONTENT_BLOCK;

        @pmi0("type_market_view_portlet")
        public static final Type TYPE_MARKET_VIEW_PORTLET;

        @pmi0("type_market_view_post_with_market")
        public static final Type TYPE_MARKET_VIEW_POST_WITH_MARKET;

        @pmi0("type_smb_native_booking_cancel_success_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_CANCEL_SUCCESS_VIEW;

        @pmi0("type_smb_native_booking_check_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_CHECK_VIEW;

        @pmi0("type_smb_native_booking_error_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_ERROR_VIEW;

        @pmi0("type_smb_native_booking_master_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_MASTER_VIEW;

        @pmi0("type_smb_native_booking_no_timeslots_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_NO_TIMESLOTS_VIEW;

        @pmi0("type_smb_native_booking_repeat_records_master_unavailable_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_MASTER_UNAVAILABLE_VIEW;

        @pmi0("type_smb_native_booking_repeat_records_service_unavailable_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_SERVICE_UNAVAILABLE_VIEW;

        @pmi0("type_smb_native_booking_repeat_records_widget_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_WIDGET_VIEW;

        @pmi0("type_smb_native_booking_reshedule_success_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_RESHEDULE_SUCCESS_VIEW;

        @pmi0("type_smb_native_booking_schedule_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_SCHEDULE_VIEW;

        @pmi0("type_smb_native_booking_services_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_SERVICES_VIEW;

        @pmi0("type_smb_native_booking_starting_menu_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_STARTING_MENU_VIEW;

        @pmi0("type_smb_native_booking_start_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_START_VIEW;

        @pmi0("type_smb_native_booking_success")
        public static final Type TYPE_SMB_NATIVE_BOOKING_SUCCESS;

        @pmi0("type_smb_native_booking_success_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_SUCCESS_VIEW;

        @pmi0("type_smb_native_booking_timeslots_view")
        public static final Type TYPE_SMB_NATIVE_BOOKING_TIMESLOTS_VIEW;

        static {
            Type type = new Type("TYPE_MARKET_VIEW_ITEM", 0);
            TYPE_MARKET_VIEW_ITEM = type;
            Type type2 = new Type("TYPE_MARKET_VIEW_EMPTY_CART", 1);
            TYPE_MARKET_VIEW_EMPTY_CART = type2;
            Type type3 = new Type("TYPE_MARKET_OPEN_MARKETPLACE", 2);
            TYPE_MARKET_OPEN_MARKETPLACE = type3;
            Type type4 = new Type("TYPE_MARKET_VIEW_COLLECTION", 3);
            TYPE_MARKET_VIEW_COLLECTION = type4;
            Type type5 = new Type("TYPE_MARKET_VIEW_CHECKOUT", 4);
            TYPE_MARKET_VIEW_CHECKOUT = type5;
            Type type6 = new Type("TYPE_MARKET_VIEW_PORTLET", 5);
            TYPE_MARKET_VIEW_PORTLET = type6;
            Type type7 = new Type("TYPE_MARKET_VIEW_ADS_CAROUSEL_ITEM", 6);
            TYPE_MARKET_VIEW_ADS_CAROUSEL_ITEM = type7;
            Type type8 = new Type("TYPE_MARKETPLACE_ITEM_VIEW", 7);
            TYPE_MARKETPLACE_ITEM_VIEW = type8;
            Type type9 = new Type("TYPE_MARKETPLACE_SEARCH_VIEW", 8);
            TYPE_MARKETPLACE_SEARCH_VIEW = type9;
            Type type10 = new Type("TYPE_MARKETPLACE_MARKET_VIEW", 9);
            TYPE_MARKETPLACE_MARKET_VIEW = type10;
            Type type11 = new Type("TYPE_MARKETPLACE_BLOCK_VIEW", 10);
            TYPE_MARKETPLACE_BLOCK_VIEW = type11;
            Type type12 = new Type("TYPE_MARKET_VIEW_ITEM_MEDIA", 11);
            TYPE_MARKET_VIEW_ITEM_MEDIA = type12;
            Type type13 = new Type("TYPE_MARKET_VIEW_POST_WITH_MARKET", 12);
            TYPE_MARKET_VIEW_POST_WITH_MARKET = type13;
            Type type14 = new Type("TYPE_MARKET_VIEW_LINKED_CONTENT", 13);
            TYPE_MARKET_VIEW_LINKED_CONTENT = type14;
            Type type15 = new Type("TYPE_MARKET_VIEW_LINKED_CONTENT_BLOCK", 14);
            TYPE_MARKET_VIEW_LINKED_CONTENT_BLOCK = type15;
            Type type16 = new Type("TYPE_SMB_NATIVE_BOOKING_CANCEL_SUCCESS_VIEW", 15);
            TYPE_SMB_NATIVE_BOOKING_CANCEL_SUCCESS_VIEW = type16;
            Type type17 = new Type("TYPE_SMB_NATIVE_BOOKING_CHECK_VIEW", 16);
            TYPE_SMB_NATIVE_BOOKING_CHECK_VIEW = type17;
            Type type18 = new Type("TYPE_SMB_NATIVE_BOOKING_ERROR_VIEW", 17);
            TYPE_SMB_NATIVE_BOOKING_ERROR_VIEW = type18;
            Type type19 = new Type("TYPE_SMB_NATIVE_BOOKING_MASTER_VIEW", 18);
            TYPE_SMB_NATIVE_BOOKING_MASTER_VIEW = type19;
            Type type20 = new Type("TYPE_SMB_NATIVE_BOOKING_NO_TIMESLOTS_VIEW", 19);
            TYPE_SMB_NATIVE_BOOKING_NO_TIMESLOTS_VIEW = type20;
            Type type21 = new Type("TYPE_SMB_NATIVE_BOOKING_RESHEDULE_SUCCESS_VIEW", 20);
            TYPE_SMB_NATIVE_BOOKING_RESHEDULE_SUCCESS_VIEW = type21;
            Type type22 = new Type("TYPE_SMB_NATIVE_BOOKING_SCHEDULE_VIEW", 21);
            TYPE_SMB_NATIVE_BOOKING_SCHEDULE_VIEW = type22;
            Type type23 = new Type("TYPE_SMB_NATIVE_BOOKING_SERVICES_VIEW", 22);
            TYPE_SMB_NATIVE_BOOKING_SERVICES_VIEW = type23;
            Type type24 = new Type("TYPE_SMB_NATIVE_BOOKING_START_VIEW", 23);
            TYPE_SMB_NATIVE_BOOKING_START_VIEW = type24;
            Type type25 = new Type("TYPE_SMB_NATIVE_BOOKING_SUCCESS", 24);
            TYPE_SMB_NATIVE_BOOKING_SUCCESS = type25;
            Type type26 = new Type("TYPE_SMB_NATIVE_BOOKING_SUCCESS_VIEW", 25);
            TYPE_SMB_NATIVE_BOOKING_SUCCESS_VIEW = type26;
            Type type27 = new Type("TYPE_SMB_NATIVE_BOOKING_STARTING_MENU_VIEW", 26);
            TYPE_SMB_NATIVE_BOOKING_STARTING_MENU_VIEW = type27;
            Type type28 = new Type("TYPE_SMB_NATIVE_BOOKING_TIMESLOTS_VIEW", 27);
            TYPE_SMB_NATIVE_BOOKING_TIMESLOTS_VIEW = type28;
            Type type29 = new Type("TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_WIDGET_VIEW", 28);
            TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_WIDGET_VIEW = type29;
            Type type30 = new Type("TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_MASTER_UNAVAILABLE_VIEW", 29);
            TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_MASTER_UNAVAILABLE_VIEW = type30;
            Type type31 = new Type("TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_SERVICE_UNAVAILABLE_VIEW", 30);
            TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_SERVICE_UNAVAILABLE_VIEW = type31;
            Type type32 = new Type("TYPE_MARKET_SHOW_ITEMS_FROM_VIDEO_VIEW", 31);
            TYPE_MARKET_SHOW_ITEMS_FROM_VIDEO_VIEW = type32;
            Type type33 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_VIEW", 32);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_VIEW = type33;
            Type type34 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_VIEW", 33);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_VIEW = type34;
            Type type35 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_VIEW", 34);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_VIEW = type35;
            Type type36 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ALREADY_PINNED_VIEW", 35);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ALREADY_PINNED_VIEW = type36;
            Type type37 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_REPIN_VIEW", 36);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_REPIN_VIEW = type37;
            Type type38 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_VIEW", 37);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_VIEW = type38;
            Type type39 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ENSURE_CANCEL_VIEW", 38);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ENSURE_CANCEL_VIEW = type39;
            Type type40 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_CANCELED_PINNED_VIEW", 39);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_CANCELED_PINNED_VIEW = type40;
            Type type41 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_LOADING_PINNED_VIEW", 40);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_LOADING_PINNED_VIEW = type41;
            Type type42 = new Type("TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_VIEW", 41);
            TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_VIEW = type42;
            Type type43 = new Type("TYPE_MARKET_DELIVERY_BLOCK_VIEW", 42);
            TYPE_MARKET_DELIVERY_BLOCK_VIEW = type43;
            Type type44 = new Type("TYPE_MARKET_ITEM_REVIEWS_SHOW", 43);
            TYPE_MARKET_ITEM_REVIEWS_SHOW = type44;
            Type type45 = new Type("TYPE_MARKET_ITEM_PICKER", 44);
            TYPE_MARKET_ITEM_PICKER = type45;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45};
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
        public static MobileOfficialAppsMarketStat$TypeMarketView a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, b bVar) {
            CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource = null;
            if (bVar == null) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(null, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketViewItemItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_ITEM, null, mobileOfficialAppsCoreNavStat$EventScreen, (MobileOfficialAppsMarketStat$TypeMarketViewItemItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983054, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_EMPTY_CART, null, mobileOfficialAppsCoreNavStat$EventScreen, null, (MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart) bVar, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983062, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_OPEN_MARKETPLACE, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, (MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem) bVar, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983078, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_COLLECTION, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem) bVar, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983110, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketViewCheckout) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_CHECKOUT, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, (CommonMarketStat$TypeMarketViewCheckout) bVar, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983174, 524287, null);
            }
            if (bVar instanceof h0) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_PORTLET, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, (h0) bVar, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983302, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_ADS_CAROUSEL_ITEM, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem) bVar, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -991238, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKETPLACE_ITEM_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem) bVar, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983558, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKETPLACE_SEARCH_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem) bVar, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -984070, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKETPLACE_MARKET_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem) bVar, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -985094, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKETPLACE_BLOCK_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem) bVar, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -987142, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketViewItemMediaItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_ITEM_MEDIA, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketViewItemMediaItem) bVar, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -999430, 524287, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_POST_WITH_MARKET, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem) bVar, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1015814, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketViewLinkedContent) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_LINKED_CONTENT, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, (CommonMarketStat$TypeMarketViewLinkedContent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2031622, 524287, null);
            }
            if (bVar instanceof r) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_VIEW_LINKED_CONTENT_BLOCK, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, (r) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3080198, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_CANCEL_SUCCESS_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, (CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5177350, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingCheckViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_CHECK_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, (CommonMarketStat$TypeSmbNativeBookingCheckViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9371654, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingErrorViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_ERROR_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingErrorViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17760262, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingMasterViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_MASTER_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingMasterViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -34537478, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_NO_TIMESLOTS_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -68091910, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_RESHEDULE_SUCCESS_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -135200774, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingScheduleViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_SCHEDULE_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingScheduleViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -269418502, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingServicesViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_SERVICES_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingServicesViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -537853958, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingStartViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_START_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingStartViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1074724870, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingSuccessItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_SUCCESS, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingSuccessItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2146500602, 524287, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingSuccessViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_SUCCESS_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingSuccessViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524286, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_STARTING_MENU_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524283, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_TIMESLOTS_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524279, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_WIDGET_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524271, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_MASTER_UNAVAILABLE_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524255, null);
            }
            if (bVar instanceof CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_SMB_NATIVE_BOOKING_REPEAT_RECORDS_SERVICE_UNAVAILABLE_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524223, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketShowItemsFromVideoViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_SHOW_ITEMS_FROM_VIDEO_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketShowItemsFromVideoViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983046, 524285, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_PIN_FOR_MONEY_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem) bVar, null, null, null, null, null, null, null, null, null, null, null, -983046, 524159, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_VKPAY_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem) bVar, null, null, null, null, null, null, null, null, null, null, -983046, 524031, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_PIN_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem) bVar, null, null, null, null, null, null, null, null, null, -983046, 523775, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ALREADY_PINNED_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem) bVar, null, null, null, null, null, null, null, null, -983046, 523263, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_REPIN_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem) bVar, null, null, null, null, null, null, null, -983046, 522239, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_MANAGE_PINNED_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem) bVar, null, null, null, null, null, null, -983046, 520191, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ENSURE_CANCEL_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem) bVar, null, null, null, null, null, -983046, 516095, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_CANCELED_PINNED_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem) bVar, null, null, null, null, -983046, 507903, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_LOADING_PINNED_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem) bVar, null, null, null, -983046, 491519, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_PIN_COMMUNITY_REVIEW_POPUP_ERROR_UNPIN_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem) bVar, null, null, -983046, 458751, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketDeliveryBlockViewItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_DELIVERY_BLOCK_VIEW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketDeliveryBlockViewItem) bVar, null, -983046, 393215, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketItemRatingItem) {
                return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_ITEM_REVIEWS_SHOW, null, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketItemRatingItem) bVar, -983046, 262143, null);
            }
            if (!(bVar instanceof CommonMarketStat$TypeMarketItemPicker)) {
                throw new IllegalArgumentException("payload must be one of(TypeMarketViewItemItem, TypeMarketViewEmptyCart, TypeMarketOpenMarketplaceItem, TypeMarketViewCollectionItem, TypeMarketViewCheckout, TypeMarketViewPortletItem, TypeMarketViewAdsCarouselItem, TypeMarketplaceItemViewItem, TypeMarketplaceSearchViewItem, TypeMarketplaceMarketViewItem, TypeMarketplaceBlockViewItem, TypeMarketViewItemMediaItem, TypeMarketViewPostWithMarketItem, TypeMarketViewLinkedContent, TypeMarketViewLinkedContentBlock, TypeSmbNativeBookingCancelSuccessViewItem, TypeSmbNativeBookingCheckViewItem, TypeSmbNativeBookingErrorViewItem, TypeSmbNativeBookingMasterViewItem, TypeSmbNativeBookingNoTimeslotsViewItem, TypeSmbNativeBookingResheduleSuccessViewItem, TypeSmbNativeBookingScheduleViewItem, TypeSmbNativeBookingServicesViewItem, TypeSmbNativeBookingStartViewItem, TypeSmbNativeBookingSuccessItem, TypeSmbNativeBookingSuccessViewItem, TypeSmbNativeBookingStartingMenuViewItem, TypeSmbNativeBookingTimeslotsViewItem, TypeSmbNativeBookingRepeatRecordsWidgetViewItem, TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem, TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem, TypeMarketShowItemsFromVideoViewItem, TypeMarketPinCommunityReviewPopupPinForMoneyViewItem, TypeMarketPinCommunityReviewPopupVkpayViewItem, TypeMarketPinCommunityReviewPopupErrorPinViewItem, TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem, TypeMarketPinCommunityReviewPopupRepinViewItem, TypeMarketPinCommunityReviewPopupManagePinnedViewItem, TypeMarketPinCommunityReviewPopupEnsureCancelViewItem, TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem, TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem, TypeMarketPinCommunityReviewPopupErrorUnpinViewItem, TypeMarketDeliveryBlockViewItem, TypeMarketItemRatingItem, TypeMarketItemPicker)");
            }
            return new MobileOfficialAppsMarketStat$TypeMarketView(Type.TYPE_MARKET_ITEM_PICKER, (CommonMarketStat$TypeMarketItemPicker) bVar, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, num, commonMarketStat$TypeRefSource, str, commonMarketStat$TypeTrafficSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -983048, 524287, null);
        }

        public static /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketView b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, b bVar, int i) {
            if ((i & 1) != 0) {
                mobileOfficialAppsCoreNavStat$EventScreen = null;
            }
            Integer num = (i & 2) != 0 ? null : 1;
            if ((i & 4) != 0) {
                commonMarketStat$TypeRefSource = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            return a(mobileOfficialAppsCoreNavStat$EventScreen, num, commonMarketStat$TypeRefSource, str, bVar);
        }
    }

    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public interface b {
    }

    private MobileOfficialAppsMarketStat$TypeMarketView(Type type, CommonMarketStat$TypeMarketItemPicker commonMarketStat$TypeMarketItemPicker, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsMarketStat$TypeMarketViewItemItem mobileOfficialAppsMarketStat$TypeMarketViewItemItem, MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart mobileOfficialAppsMarketStat$TypeMarketViewEmptyCart, MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem, MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem mobileOfficialAppsMarketStat$TypeMarketViewCollectionItem, CommonMarketStat$TypeMarketViewCheckout commonMarketStat$TypeMarketViewCheckout, h0 h0Var, MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem, MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem, MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem mobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem, MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem mobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem, MobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem mobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem, CommonMarketStat$TypeMarketViewItemMediaItem commonMarketStat$TypeMarketViewItemMediaItem, MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem mobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource, CommonMarketStat$TypeMarketViewLinkedContent commonMarketStat$TypeMarketViewLinkedContent, r rVar, CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem, CommonMarketStat$TypeSmbNativeBookingCheckViewItem commonMarketStat$TypeSmbNativeBookingCheckViewItem, CommonMarketStat$TypeSmbNativeBookingErrorViewItem commonMarketStat$TypeSmbNativeBookingErrorViewItem, CommonMarketStat$TypeSmbNativeBookingMasterViewItem commonMarketStat$TypeSmbNativeBookingMasterViewItem, CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem commonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem, CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem commonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem, CommonMarketStat$TypeSmbNativeBookingScheduleViewItem commonMarketStat$TypeSmbNativeBookingScheduleViewItem, CommonMarketStat$TypeSmbNativeBookingServicesViewItem commonMarketStat$TypeSmbNativeBookingServicesViewItem, CommonMarketStat$TypeSmbNativeBookingStartViewItem commonMarketStat$TypeSmbNativeBookingStartViewItem, CommonMarketStat$TypeSmbNativeBookingSuccessItem commonMarketStat$TypeSmbNativeBookingSuccessItem, CommonMarketStat$TypeSmbNativeBookingSuccessViewItem commonMarketStat$TypeSmbNativeBookingSuccessViewItem, CommonMarketStat$TypeMarketShowItemsFromVideoViewItem commonMarketStat$TypeMarketShowItemsFromVideoViewItem, CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem, CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem commonMarketStat$TypeSmbNativeBookingTimeslotsViewItem, CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem, CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem, CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem, CommonMarketStat$TypeMarketDeliveryBlockViewItem commonMarketStat$TypeMarketDeliveryBlockViewItem, CommonMarketStat$TypeMarketItemRatingItem commonMarketStat$TypeMarketItemRatingItem) {
        this.type = type;
        this.typeMarketItemPicker = commonMarketStat$TypeMarketItemPicker;
        this.previousScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.typeMarketViewItem = mobileOfficialAppsMarketStat$TypeMarketViewItemItem;
        this.typeMarketViewEmptyCart = mobileOfficialAppsMarketStat$TypeMarketViewEmptyCart;
        this.typeMarketOpenMarketplace = mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem;
        this.typeMarketViewCollection = mobileOfficialAppsMarketStat$TypeMarketViewCollectionItem;
        this.typeMarketViewCheckout = commonMarketStat$TypeMarketViewCheckout;
        this.typeMarketViewPortlet = h0Var;
        this.typeMarketplaceItemView = mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem;
        this.typeMarketplaceSearchView = mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem;
        this.typeMarketplaceMarketView = mobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem;
        this.typeMarketplaceBlockView = mobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem;
        this.typeMarketViewAdsCarouselItem = mobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem;
        this.typeMarketViewItemMedia = commonMarketStat$TypeMarketViewItemMediaItem;
        this.typeMarketViewPostWithMarket = mobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem;
        this.analyticsVersion = num;
        this.refSource = commonMarketStat$TypeRefSource;
        this.sourceUrl = str;
        this.trafficSource = commonMarketStat$TypeTrafficSource;
        this.typeMarketViewLinkedContent = commonMarketStat$TypeMarketViewLinkedContent;
        this.typeMarketViewLinkedContentBlock = rVar;
        this.typeSmbNativeBookingCancelSuccessView = commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem;
        this.typeSmbNativeBookingCheckView = commonMarketStat$TypeSmbNativeBookingCheckViewItem;
        this.typeSmbNativeBookingErrorView = commonMarketStat$TypeSmbNativeBookingErrorViewItem;
        this.typeSmbNativeBookingMasterView = commonMarketStat$TypeSmbNativeBookingMasterViewItem;
        this.typeSmbNativeBookingNoTimeslotsView = commonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem;
        this.typeSmbNativeBookingResheduleSuccessView = commonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem;
        this.typeSmbNativeBookingScheduleView = commonMarketStat$TypeSmbNativeBookingScheduleViewItem;
        this.typeSmbNativeBookingServicesView = commonMarketStat$TypeSmbNativeBookingServicesViewItem;
        this.typeSmbNativeBookingStartView = commonMarketStat$TypeSmbNativeBookingStartViewItem;
        this.typeSmbNativeBookingSuccess = commonMarketStat$TypeSmbNativeBookingSuccessItem;
        this.typeSmbNativeBookingSuccessView = commonMarketStat$TypeSmbNativeBookingSuccessViewItem;
        this.typeMarketShowItemsFromVideoView = commonMarketStat$TypeMarketShowItemsFromVideoViewItem;
        this.typeSmbNativeBookingStartingMenuView = commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem;
        this.typeSmbNativeBookingTimeslotsView = commonMarketStat$TypeSmbNativeBookingTimeslotsViewItem;
        this.typeSmbNativeBookingRepeatRecordsWidgetView = commonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem;
        this.typeSmbNativeBookingRepeatRecordsMasterUnavailableView = commonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem;
        this.typeSmbNativeBookingRepeatRecordsServiceUnavailableView = commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem;
        this.typeMarketPinCommunityReviewPopupPinForMoneyView = commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem;
        this.typeMarketPinCommunityReviewPopupVkpayView = commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem;
        this.typeMarketPinCommunityReviewPopupErrorPinView = commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem;
        this.typeMarketPinCommunityReviewPopupAlreadyPinnedView = commonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem;
        this.typeMarketPinCommunityReviewPopupRepinView = commonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem;
        this.typeMarketPinCommunityReviewPopupManagePinnedView = commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem;
        this.typeMarketPinCommunityReviewPopupEnsureCancelView = commonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem;
        this.typeMarketPinCommunityReviewPopupCanceledPinnedView = commonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem;
        this.typeMarketPinCommunityReviewPopupErrorLoadingPinnedView = commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem;
        this.typeMarketPinCommunityReviewPopupErrorUnpinView = commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem;
        this.typeMarketDeliveryBlockView = commonMarketStat$TypeMarketDeliveryBlockViewItem;
        this.typeMarketItemReviewsShow = commonMarketStat$TypeMarketItemRatingItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketView)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketView mobileOfficialAppsMarketStat$TypeMarketView = (MobileOfficialAppsMarketStat$TypeMarketView) obj;
        return this.type == mobileOfficialAppsMarketStat$TypeMarketView.type && epx.f(this.typeMarketItemPicker, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketItemPicker) && this.previousScreen == mobileOfficialAppsMarketStat$TypeMarketView.previousScreen && epx.f(this.typeMarketViewItem, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewItem) && epx.f(this.typeMarketViewEmptyCart, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewEmptyCart) && epx.f(this.typeMarketOpenMarketplace, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketOpenMarketplace) && epx.f(this.typeMarketViewCollection, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewCollection) && epx.f(this.typeMarketViewCheckout, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewCheckout) && epx.f(this.typeMarketViewPortlet, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewPortlet) && epx.f(this.typeMarketplaceItemView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketplaceItemView) && epx.f(this.typeMarketplaceSearchView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketplaceSearchView) && epx.f(this.typeMarketplaceMarketView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketplaceMarketView) && epx.f(this.typeMarketplaceBlockView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketplaceBlockView) && epx.f(this.typeMarketViewAdsCarouselItem, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewAdsCarouselItem) && epx.f(this.typeMarketViewItemMedia, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewItemMedia) && epx.f(this.typeMarketViewPostWithMarket, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewPostWithMarket) && epx.f(this.analyticsVersion, mobileOfficialAppsMarketStat$TypeMarketView.analyticsVersion) && this.refSource == mobileOfficialAppsMarketStat$TypeMarketView.refSource && epx.f(this.sourceUrl, mobileOfficialAppsMarketStat$TypeMarketView.sourceUrl) && this.trafficSource == mobileOfficialAppsMarketStat$TypeMarketView.trafficSource && epx.f(this.typeMarketViewLinkedContent, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewLinkedContent) && epx.f(this.typeMarketViewLinkedContentBlock, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketViewLinkedContentBlock) && epx.f(this.typeSmbNativeBookingCancelSuccessView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingCancelSuccessView) && epx.f(this.typeSmbNativeBookingCheckView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingCheckView) && epx.f(this.typeSmbNativeBookingErrorView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingErrorView) && epx.f(this.typeSmbNativeBookingMasterView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingMasterView) && epx.f(this.typeSmbNativeBookingNoTimeslotsView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingNoTimeslotsView) && epx.f(this.typeSmbNativeBookingResheduleSuccessView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingResheduleSuccessView) && epx.f(this.typeSmbNativeBookingScheduleView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingScheduleView) && epx.f(this.typeSmbNativeBookingServicesView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingServicesView) && epx.f(this.typeSmbNativeBookingStartView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingStartView) && epx.f(this.typeSmbNativeBookingSuccess, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingSuccess) && epx.f(this.typeSmbNativeBookingSuccessView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingSuccessView) && epx.f(this.typeMarketShowItemsFromVideoView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketShowItemsFromVideoView) && epx.f(this.typeSmbNativeBookingStartingMenuView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingStartingMenuView) && epx.f(this.typeSmbNativeBookingTimeslotsView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingTimeslotsView) && epx.f(this.typeSmbNativeBookingRepeatRecordsWidgetView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingRepeatRecordsWidgetView) && epx.f(this.typeSmbNativeBookingRepeatRecordsMasterUnavailableView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingRepeatRecordsMasterUnavailableView) && epx.f(this.typeSmbNativeBookingRepeatRecordsServiceUnavailableView, mobileOfficialAppsMarketStat$TypeMarketView.typeSmbNativeBookingRepeatRecordsServiceUnavailableView) && epx.f(this.typeMarketPinCommunityReviewPopupPinForMoneyView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupPinForMoneyView) && epx.f(this.typeMarketPinCommunityReviewPopupVkpayView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupVkpayView) && epx.f(this.typeMarketPinCommunityReviewPopupErrorPinView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupErrorPinView) && epx.f(this.typeMarketPinCommunityReviewPopupAlreadyPinnedView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupAlreadyPinnedView) && epx.f(this.typeMarketPinCommunityReviewPopupRepinView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupRepinView) && epx.f(this.typeMarketPinCommunityReviewPopupManagePinnedView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupManagePinnedView) && epx.f(this.typeMarketPinCommunityReviewPopupEnsureCancelView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupEnsureCancelView) && epx.f(this.typeMarketPinCommunityReviewPopupCanceledPinnedView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupCanceledPinnedView) && epx.f(this.typeMarketPinCommunityReviewPopupErrorLoadingPinnedView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupErrorLoadingPinnedView) && epx.f(this.typeMarketPinCommunityReviewPopupErrorUnpinView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketPinCommunityReviewPopupErrorUnpinView) && epx.f(this.typeMarketDeliveryBlockView, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketDeliveryBlockView) && epx.f(this.typeMarketItemReviewsShow, mobileOfficialAppsMarketStat$TypeMarketView.typeMarketItemReviewsShow);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        CommonMarketStat$TypeMarketItemPicker commonMarketStat$TypeMarketItemPicker = this.typeMarketItemPicker;
        int hashCode2 = (hashCode + (commonMarketStat$TypeMarketItemPicker == null ? 0 : commonMarketStat$TypeMarketItemPicker.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.previousScreen;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketViewItemItem mobileOfficialAppsMarketStat$TypeMarketViewItemItem = this.typeMarketViewItem;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsMarketStat$TypeMarketViewItemItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketViewItemItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart mobileOfficialAppsMarketStat$TypeMarketViewEmptyCart = this.typeMarketViewEmptyCart;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsMarketStat$TypeMarketViewEmptyCart == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketViewEmptyCart.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem = this.typeMarketOpenMarketplace;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem mobileOfficialAppsMarketStat$TypeMarketViewCollectionItem = this.typeMarketViewCollection;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsMarketStat$TypeMarketViewCollectionItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketViewCollectionItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketViewCheckout commonMarketStat$TypeMarketViewCheckout = this.typeMarketViewCheckout;
        int hashCode8 = (hashCode7 + (commonMarketStat$TypeMarketViewCheckout == null ? 0 : commonMarketStat$TypeMarketViewCheckout.hashCode())) * 31;
        h0 h0Var = this.typeMarketViewPortlet;
        int hashCode9 = (hashCode8 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem = this.typeMarketplaceItemView;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem = this.typeMarketplaceSearchView;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem mobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem = this.typeMarketplaceMarketView;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem mobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem = this.typeMarketplaceBlockView;
        int hashCode13 = (hashCode12 + (mobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem mobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem = this.typeMarketViewAdsCarouselItem;
        int hashCode14 = (hashCode13 + (mobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketViewItemMediaItem commonMarketStat$TypeMarketViewItemMediaItem = this.typeMarketViewItemMedia;
        int hashCode15 = (hashCode14 + (commonMarketStat$TypeMarketViewItemMediaItem == null ? 0 : commonMarketStat$TypeMarketViewItemMediaItem.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem mobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem = this.typeMarketViewPostWithMarket;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem.hashCode())) * 31;
        Integer num = this.analyticsVersion;
        int hashCode17 = (hashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.refSource;
        int hashCode18 = (hashCode17 + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31;
        String str = this.sourceUrl;
        int hashCode19 = (hashCode18 + (str == null ? 0 : str.hashCode())) * 31;
        CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource = this.trafficSource;
        int hashCode20 = (hashCode19 + (commonMarketStat$TypeTrafficSource == null ? 0 : commonMarketStat$TypeTrafficSource.hashCode())) * 31;
        CommonMarketStat$TypeMarketViewLinkedContent commonMarketStat$TypeMarketViewLinkedContent = this.typeMarketViewLinkedContent;
        int hashCode21 = (hashCode20 + (commonMarketStat$TypeMarketViewLinkedContent == null ? 0 : commonMarketStat$TypeMarketViewLinkedContent.hashCode())) * 31;
        r rVar = this.typeMarketViewLinkedContentBlock;
        int hashCode22 = (hashCode21 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem = this.typeSmbNativeBookingCancelSuccessView;
        int hashCode23 = (hashCode22 + (commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingCheckViewItem commonMarketStat$TypeSmbNativeBookingCheckViewItem = this.typeSmbNativeBookingCheckView;
        int hashCode24 = (hashCode23 + (commonMarketStat$TypeSmbNativeBookingCheckViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingCheckViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingErrorViewItem commonMarketStat$TypeSmbNativeBookingErrorViewItem = this.typeSmbNativeBookingErrorView;
        int hashCode25 = (hashCode24 + (commonMarketStat$TypeSmbNativeBookingErrorViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingErrorViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingMasterViewItem commonMarketStat$TypeSmbNativeBookingMasterViewItem = this.typeSmbNativeBookingMasterView;
        int hashCode26 = (hashCode25 + (commonMarketStat$TypeSmbNativeBookingMasterViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingMasterViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem commonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem = this.typeSmbNativeBookingNoTimeslotsView;
        int hashCode27 = (hashCode26 + (commonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem commonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem = this.typeSmbNativeBookingResheduleSuccessView;
        int hashCode28 = (hashCode27 + (commonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingScheduleViewItem commonMarketStat$TypeSmbNativeBookingScheduleViewItem = this.typeSmbNativeBookingScheduleView;
        int hashCode29 = (hashCode28 + (commonMarketStat$TypeSmbNativeBookingScheduleViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingScheduleViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingServicesViewItem commonMarketStat$TypeSmbNativeBookingServicesViewItem = this.typeSmbNativeBookingServicesView;
        int hashCode30 = (hashCode29 + (commonMarketStat$TypeSmbNativeBookingServicesViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingServicesViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingStartViewItem commonMarketStat$TypeSmbNativeBookingStartViewItem = this.typeSmbNativeBookingStartView;
        int hashCode31 = (hashCode30 + (commonMarketStat$TypeSmbNativeBookingStartViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingStartViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingSuccessItem commonMarketStat$TypeSmbNativeBookingSuccessItem = this.typeSmbNativeBookingSuccess;
        int hashCode32 = (hashCode31 + (commonMarketStat$TypeSmbNativeBookingSuccessItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingSuccessItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingSuccessViewItem commonMarketStat$TypeSmbNativeBookingSuccessViewItem = this.typeSmbNativeBookingSuccessView;
        int hashCode33 = (hashCode32 + (commonMarketStat$TypeSmbNativeBookingSuccessViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingSuccessViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketShowItemsFromVideoViewItem commonMarketStat$TypeMarketShowItemsFromVideoViewItem = this.typeMarketShowItemsFromVideoView;
        int hashCode34 = (hashCode33 + (commonMarketStat$TypeMarketShowItemsFromVideoViewItem == null ? 0 : commonMarketStat$TypeMarketShowItemsFromVideoViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem = this.typeSmbNativeBookingStartingMenuView;
        int hashCode35 = (hashCode34 + (commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem commonMarketStat$TypeSmbNativeBookingTimeslotsViewItem = this.typeSmbNativeBookingTimeslotsView;
        int hashCode36 = (hashCode35 + (commonMarketStat$TypeSmbNativeBookingTimeslotsViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingTimeslotsViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem = this.typeSmbNativeBookingRepeatRecordsWidgetView;
        int hashCode37 = (hashCode36 + (commonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem = this.typeSmbNativeBookingRepeatRecordsMasterUnavailableView;
        int hashCode38 = (hashCode37 + (commonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = this.typeSmbNativeBookingRepeatRecordsServiceUnavailableView;
        int hashCode39 = (hashCode38 + (commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem == null ? 0 : commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem = this.typeMarketPinCommunityReviewPopupPinForMoneyView;
        int hashCode40 = (hashCode39 + (commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem = this.typeMarketPinCommunityReviewPopupVkpayView;
        int hashCode41 = (hashCode40 + (commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem = this.typeMarketPinCommunityReviewPopupErrorPinView;
        int hashCode42 = (hashCode41 + (commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem = this.typeMarketPinCommunityReviewPopupAlreadyPinnedView;
        int hashCode43 = (hashCode42 + (commonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem = this.typeMarketPinCommunityReviewPopupRepinView;
        int hashCode44 = (hashCode43 + (commonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem = this.typeMarketPinCommunityReviewPopupManagePinnedView;
        int hashCode45 = (hashCode44 + (commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem = this.typeMarketPinCommunityReviewPopupEnsureCancelView;
        int hashCode46 = (hashCode45 + (commonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem = this.typeMarketPinCommunityReviewPopupCanceledPinnedView;
        int hashCode47 = (hashCode46 + (commonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem = this.typeMarketPinCommunityReviewPopupErrorLoadingPinnedView;
        int hashCode48 = (hashCode47 + (commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem = this.typeMarketPinCommunityReviewPopupErrorUnpinView;
        int hashCode49 = (hashCode48 + (commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem == null ? 0 : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketDeliveryBlockViewItem commonMarketStat$TypeMarketDeliveryBlockViewItem = this.typeMarketDeliveryBlockView;
        int hashCode50 = (hashCode49 + (commonMarketStat$TypeMarketDeliveryBlockViewItem == null ? 0 : commonMarketStat$TypeMarketDeliveryBlockViewItem.hashCode())) * 31;
        CommonMarketStat$TypeMarketItemRatingItem commonMarketStat$TypeMarketItemRatingItem = this.typeMarketItemReviewsShow;
        return hashCode50 + (commonMarketStat$TypeMarketItemRatingItem != null ? commonMarketStat$TypeMarketItemRatingItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketView(type=" + this.type + ", typeMarketItemPicker=" + this.typeMarketItemPicker + ", previousScreen=" + this.previousScreen + ", typeMarketViewItem=" + this.typeMarketViewItem + ", typeMarketViewEmptyCart=" + this.typeMarketViewEmptyCart + ", typeMarketOpenMarketplace=" + this.typeMarketOpenMarketplace + ", typeMarketViewCollection=" + this.typeMarketViewCollection + ", typeMarketViewCheckout=" + this.typeMarketViewCheckout + ", typeMarketViewPortlet=" + this.typeMarketViewPortlet + ", typeMarketplaceItemView=" + this.typeMarketplaceItemView + ", typeMarketplaceSearchView=" + this.typeMarketplaceSearchView + ", typeMarketplaceMarketView=" + this.typeMarketplaceMarketView + ", typeMarketplaceBlockView=" + this.typeMarketplaceBlockView + ", typeMarketViewAdsCarouselItem=" + this.typeMarketViewAdsCarouselItem + ", typeMarketViewItemMedia=" + this.typeMarketViewItemMedia + ", typeMarketViewPostWithMarket=" + this.typeMarketViewPostWithMarket + ", analyticsVersion=" + this.analyticsVersion + ", refSource=" + this.refSource + ", sourceUrl=" + this.sourceUrl + ", trafficSource=" + this.trafficSource + ", typeMarketViewLinkedContent=" + this.typeMarketViewLinkedContent + ", typeMarketViewLinkedContentBlock=" + this.typeMarketViewLinkedContentBlock + ", typeSmbNativeBookingCancelSuccessView=" + this.typeSmbNativeBookingCancelSuccessView + ", typeSmbNativeBookingCheckView=" + this.typeSmbNativeBookingCheckView + ", typeSmbNativeBookingErrorView=" + this.typeSmbNativeBookingErrorView + ", typeSmbNativeBookingMasterView=" + this.typeSmbNativeBookingMasterView + ", typeSmbNativeBookingNoTimeslotsView=" + this.typeSmbNativeBookingNoTimeslotsView + ", typeSmbNativeBookingResheduleSuccessView=" + this.typeSmbNativeBookingResheduleSuccessView + ", typeSmbNativeBookingScheduleView=" + this.typeSmbNativeBookingScheduleView + ", typeSmbNativeBookingServicesView=" + this.typeSmbNativeBookingServicesView + ", typeSmbNativeBookingStartView=" + this.typeSmbNativeBookingStartView + ", typeSmbNativeBookingSuccess=" + this.typeSmbNativeBookingSuccess + ", typeSmbNativeBookingSuccessView=" + this.typeSmbNativeBookingSuccessView + ", typeMarketShowItemsFromVideoView=" + this.typeMarketShowItemsFromVideoView + ", typeSmbNativeBookingStartingMenuView=" + this.typeSmbNativeBookingStartingMenuView + ", typeSmbNativeBookingTimeslotsView=" + this.typeSmbNativeBookingTimeslotsView + ", typeSmbNativeBookingRepeatRecordsWidgetView=" + this.typeSmbNativeBookingRepeatRecordsWidgetView + ", typeSmbNativeBookingRepeatRecordsMasterUnavailableView=" + this.typeSmbNativeBookingRepeatRecordsMasterUnavailableView + ", typeSmbNativeBookingRepeatRecordsServiceUnavailableView=" + this.typeSmbNativeBookingRepeatRecordsServiceUnavailableView + ", typeMarketPinCommunityReviewPopupPinForMoneyView=" + this.typeMarketPinCommunityReviewPopupPinForMoneyView + ", typeMarketPinCommunityReviewPopupVkpayView=" + this.typeMarketPinCommunityReviewPopupVkpayView + ", typeMarketPinCommunityReviewPopupErrorPinView=" + this.typeMarketPinCommunityReviewPopupErrorPinView + ", typeMarketPinCommunityReviewPopupAlreadyPinnedView=" + this.typeMarketPinCommunityReviewPopupAlreadyPinnedView + ", typeMarketPinCommunityReviewPopupRepinView=" + this.typeMarketPinCommunityReviewPopupRepinView + ", typeMarketPinCommunityReviewPopupManagePinnedView=" + this.typeMarketPinCommunityReviewPopupManagePinnedView + ", typeMarketPinCommunityReviewPopupEnsureCancelView=" + this.typeMarketPinCommunityReviewPopupEnsureCancelView + ", typeMarketPinCommunityReviewPopupCanceledPinnedView=" + this.typeMarketPinCommunityReviewPopupCanceledPinnedView + ", typeMarketPinCommunityReviewPopupErrorLoadingPinnedView=" + this.typeMarketPinCommunityReviewPopupErrorLoadingPinnedView + ", typeMarketPinCommunityReviewPopupErrorUnpinView=" + this.typeMarketPinCommunityReviewPopupErrorUnpinView + ", typeMarketDeliveryBlockView=" + this.typeMarketDeliveryBlockView + ", typeMarketItemReviewsShow=" + this.typeMarketItemReviewsShow + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketView(Type type, CommonMarketStat$TypeMarketItemPicker commonMarketStat$TypeMarketItemPicker, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsMarketStat$TypeMarketViewItemItem mobileOfficialAppsMarketStat$TypeMarketViewItemItem, MobileOfficialAppsMarketStat$TypeMarketViewEmptyCart mobileOfficialAppsMarketStat$TypeMarketViewEmptyCart, MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem, MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem mobileOfficialAppsMarketStat$TypeMarketViewCollectionItem, CommonMarketStat$TypeMarketViewCheckout commonMarketStat$TypeMarketViewCheckout, h0 h0Var, MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem, MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem, MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem mobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem, MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem mobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem, MobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem mobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem, CommonMarketStat$TypeMarketViewItemMediaItem commonMarketStat$TypeMarketViewItemMediaItem, MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem mobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, CommonMarketStat$TypeTrafficSource commonMarketStat$TypeTrafficSource, CommonMarketStat$TypeMarketViewLinkedContent commonMarketStat$TypeMarketViewLinkedContent, r rVar, CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem, CommonMarketStat$TypeSmbNativeBookingCheckViewItem commonMarketStat$TypeSmbNativeBookingCheckViewItem, CommonMarketStat$TypeSmbNativeBookingErrorViewItem commonMarketStat$TypeSmbNativeBookingErrorViewItem, CommonMarketStat$TypeSmbNativeBookingMasterViewItem commonMarketStat$TypeSmbNativeBookingMasterViewItem, CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem commonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem, CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem commonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem, CommonMarketStat$TypeSmbNativeBookingScheduleViewItem commonMarketStat$TypeSmbNativeBookingScheduleViewItem, CommonMarketStat$TypeSmbNativeBookingServicesViewItem commonMarketStat$TypeSmbNativeBookingServicesViewItem, CommonMarketStat$TypeSmbNativeBookingStartViewItem commonMarketStat$TypeSmbNativeBookingStartViewItem, CommonMarketStat$TypeSmbNativeBookingSuccessItem commonMarketStat$TypeSmbNativeBookingSuccessItem, CommonMarketStat$TypeSmbNativeBookingSuccessViewItem commonMarketStat$TypeSmbNativeBookingSuccessViewItem, CommonMarketStat$TypeMarketShowItemsFromVideoViewItem commonMarketStat$TypeMarketShowItemsFromVideoViewItem, CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem, CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem commonMarketStat$TypeSmbNativeBookingTimeslotsViewItem, CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem, CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem, CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem, CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem, CommonMarketStat$TypeMarketDeliveryBlockViewItem commonMarketStat$TypeMarketDeliveryBlockViewItem, CommonMarketStat$TypeMarketItemRatingItem commonMarketStat$TypeMarketItemRatingItem, int i, int i2, zcl zclVar) {
        this(r2, (i & 2) != 0 ? null : commonMarketStat$TypeMarketItemPicker, (i & 4) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 8) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketViewItemItem, (i & 16) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketViewEmptyCart, (i & 32) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem, (i & 64) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketViewCollectionItem, (i & 128) != 0 ? null : commonMarketStat$TypeMarketViewCheckout, (i & 256) != 0 ? null : h0Var, (i & 512) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem, (i & 1024) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem, (i & 2048) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem, (i & 4096) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem, (i & 8192) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketViewAdsCarouselItem, (i & 16384) != 0 ? null : commonMarketStat$TypeMarketViewItemMediaItem, (i & 32768) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem, (i & 65536) != 0 ? null : num, (i & 131072) != 0 ? null : commonMarketStat$TypeRefSource, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str, (i & 524288) != 0 ? null : commonMarketStat$TypeTrafficSource, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : commonMarketStat$TypeMarketViewLinkedContent, (i & 2097152) != 0 ? null : rVar, (i & 4194304) != 0 ? null : commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem, (i & 8388608) != 0 ? null : commonMarketStat$TypeSmbNativeBookingCheckViewItem, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonMarketStat$TypeSmbNativeBookingErrorViewItem, (i & 33554432) != 0 ? null : commonMarketStat$TypeSmbNativeBookingMasterViewItem, (i & 67108864) != 0 ? null : commonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem, (i & 134217728) != 0 ? null : commonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem, (i & 268435456) != 0 ? null : commonMarketStat$TypeSmbNativeBookingScheduleViewItem, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : commonMarketStat$TypeSmbNativeBookingServicesViewItem, (i & 1073741824) != 0 ? null : commonMarketStat$TypeSmbNativeBookingStartViewItem, (i & Integer.MIN_VALUE) != 0 ? null : commonMarketStat$TypeSmbNativeBookingSuccessItem, (i2 & 1) != 0 ? null : commonMarketStat$TypeSmbNativeBookingSuccessViewItem, (i2 & 2) != 0 ? null : commonMarketStat$TypeMarketShowItemsFromVideoViewItem, (i2 & 4) != 0 ? null : commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem, (i2 & 8) != 0 ? null : commonMarketStat$TypeSmbNativeBookingTimeslotsViewItem, (i2 & 16) != 0 ? null : commonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem, (i2 & 32) != 0 ? null : commonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem, (i2 & 64) != 0 ? null : commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem, (i2 & 128) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem, (i2 & 256) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem, (i2 & 512) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem, (i2 & 1024) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem, (i2 & 2048) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem, (i2 & 4096) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem, (i2 & 8192) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem, (i2 & 16384) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem, (i2 & 32768) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem, (i2 & 65536) != 0 ? null : commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem, (i2 & 131072) != 0 ? null : commonMarketStat$TypeMarketDeliveryBlockViewItem, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonMarketStat$TypeMarketItemRatingItem);
        Type type2 = (i & 1) != 0 ? null : type;
    }
}
