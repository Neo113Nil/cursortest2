package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.y8h0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsClick implements SchemeStat$TypeClick.b {

    @pmi0("autorecognition_bar_click")
    private final SchemeStat$TypeClassifiedsAutorecognitionBarClickItem autorecognitionBarClick;

    @pmi0("autorecognition_popup_classifieds_click")
    private final SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem autorecognitionPopupClassifiedsClick;

    @pmi0("autorecognition_popup_post_click")
    private final SchemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem autorecognitionPopupPostClick;

    @pmi0("autorecognition_revert_bar_click")
    private final SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem autorecognitionRevertBarClick;

    @pmi0("autorecognition_snippet_auto_deleted_click")
    private final SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem autorecognitionSnippetAutoDeletedClick;

    @pmi0("autorecognition_snippet_user_deleted_click")
    private final SchemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem autorecognitionSnippetUserDeletedClick;

    @pmi0("block_carousel_click")
    private final SchemeStat$TypeClassifiedsBlockCarouselClickItem blockCarouselClick;

    @pmi0("category_click")
    private final SchemeStat$TypeClassifiedsCategoryClickItem categoryClick;

    @pmi0("classified")
    private final Classified classified;

    @pmi0("classified_detect_start_click")
    private final SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem classifiedDetectStartClick;

    @pmi0("create_item_continue_click")
    private final SchemeStat$TypeClassifiedsCreateItemContinueClick createItemContinueClick;

    @pmi0("create_post_click")
    private final SchemeStat$TypeClassifiedsCreatePostClickItem createPostClick;

    @pmi0("create_postponed_post_click")
    private final SchemeStat$TypeClassifiedsCreatePostponedPostClickItem createPostponedPostClick;

    @pmi0("create_product_click")
    private final SchemeStat$TypeClassifiedsCreateProductClickItem createProductClick;

    @pmi0("create_suggest_post_click")
    private final SchemeStat$TypeClassifiedsCreateSuggestPostClickItem createSuggestPostClick;

    @pmi0("is_geo_changed_click")
    private final SchemeStat$TypeClassifiedsIsGeoChangedClick isGeoChangedClick;

    @pmi0("native_form_loaded_click")
    private final SchemeStat$TypeClassifiedsNativeFormLoadedClickItem nativeFormLoadedClick;

    @pmi0("native_form_sent_click")
    private final SchemeStat$TypeClassifiedsNativeFormSentClickItem nativeFormSentClick;

    @pmi0("new_post_ml_data_click")
    private final SchemeStat$TypeClassifiedsNewPostMlDataClickItem newPostMlDataClick;

    @pmi0("new_post_onboarding_click")
    private final SchemeStat$TypeClassifiedsNewPostOnboardingClickItem newPostOnboardingClick;

    @pmi0("onboarding_block_hide")
    private final SchemeStat$TypeClassifiedsOnboardingBlockHide onboardingBlockHide;

    @pmi0("product_click")
    private final SchemeStat$TypeClassifiedsProductClickItem productClick;

    @pmi0("publish_item_click")
    private final SchemeStat$TypeClassifiedsPublishItemClick publishItemClick;

    @pmi0("publish_product_click")
    private final SchemeStat$TypeClassifiedsPublishProductClickItem publishProductClick;

    @pmi0("retro_recognition_popup_click")
    private final y8h0 retroRecognitionPopupClick;

    @pmi0("show_phone_click")
    private final SchemeStat$TypeClassifiedsShowPhoneClick showPhoneClick;

    @pmi0("type")
    private final Type type;

    @pmi0("type_filter_apply_click")
    private final SchemeStat$TypeClassifiedsFilterApplyClick typeFilterApplyClick;

    @pmi0("type_first_message_click")
    private final SchemeStat$TypeClassifiedsFirstMessageClick typeFirstMessageClick;

    @pmi0("type_open_chat_with_owner_click")
    private final SchemeStat$TypeClassifiedsOpenChatWithOwnerClick typeOpenChatWithOwnerClick;

    @pmi0("type_open_item")
    private final SchemeStat$TypeClassifiedsOpenItem typeOpenItem;

    @pmi0("type_phone_call_click")
    private final SchemeStat$TypeClassifiedsPhoneCallClick typePhoneCallClick;

    @pmi0("type_profile_reviews_click")
    private final SchemeStat$TypeClassifiedsProfileReviewsClick typeProfileReviewsClick;

    @pmi0("type_transition_to_author_click")
    private final SchemeStat$TypeClassifiedsTransitionToAuthorClick typeTransitionToAuthorClick;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Classified {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Classified[] $VALUES;

        @pmi0("worki")
        public static final Classified WORKI;

        @pmi0("youla")
        public static final Classified YOULA;

        static {
            Classified classified = new Classified("YOULA", 0);
            YOULA = classified;
            Classified classified2 = new Classified("WORKI", 1);
            WORKI = classified2;
            Classified[] classifiedArr = {classified, classified2};
            $VALUES = classifiedArr;
            $ENTRIES = new asp(classifiedArr);
        }

        private Classified(String str, int i) {
        }

        public static Classified valueOf(String str) {
            return (Classified) Enum.valueOf(Classified.class, str);
        }

        public static Classified[] values() {
            return (Classified[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("autorecognition_bar_click")
        public static final Type AUTORECOGNITION_BAR_CLICK;

        @pmi0("autorecognition_popup_classifieds_click")
        public static final Type AUTORECOGNITION_POPUP_CLASSIFIEDS_CLICK;

        @pmi0("autorecognition_popup_post_click")
        public static final Type AUTORECOGNITION_POPUP_POST_CLICK;

        @pmi0("autorecognition_revert_bar_click")
        public static final Type AUTORECOGNITION_REVERT_BAR_CLICK;

        @pmi0("autorecognition_snippet_auto_deleted")
        public static final Type AUTORECOGNITION_SNIPPET_AUTO_DELETED;

        @pmi0("autorecognition_snippet_user_deleted")
        public static final Type AUTORECOGNITION_SNIPPET_USER_DELETED;

        @pmi0("block_carousel_click")
        public static final Type BLOCK_CAROUSEL_CLICK;

        @pmi0("category_click")
        public static final Type CATEGORY_CLICK;

        @pmi0("classified_detect_start_click")
        public static final Type CLASSIFIED_DETECT_START_CLICK;

        @pmi0("create_item_continue_click")
        public static final Type CREATE_ITEM_CONTINUE_CLICK;

        @pmi0("create_postponed_post_click")
        public static final Type CREATE_POSTPONED_POST_CLICK;

        @pmi0("create_post_click")
        public static final Type CREATE_POST_CLICK;

        @pmi0("create_product_click")
        public static final Type CREATE_PRODUCT_CLICK;

        @pmi0("create_suggest_post_click")
        public static final Type CREATE_SUGGEST_POST_CLICK;

        @pmi0("is_geo_changed_click")
        public static final Type IS_GEO_CHANGED_CLICK;

        @pmi0("native_form_loaded_click")
        public static final Type NATIVE_FORM_LOADED_CLICK;

        @pmi0("native_form_sent_click")
        public static final Type NATIVE_FORM_SENT_CLICK;

        @pmi0("new_post_ml_data_click")
        public static final Type NEW_POST_ML_DATA_CLICK;

        @pmi0("new_post_onboarding_click")
        public static final Type NEW_POST_ONBOARDING_CLICK;

        @pmi0("onboarding_block_hide")
        public static final Type ONBOARDING_BLOCK_HIDE;

        @pmi0("product_click")
        public static final Type PRODUCT_CLICK;

        @pmi0("publish_item_click")
        public static final Type PUBLISH_ITEM_CLICK;

        @pmi0("publish_product_click")
        public static final Type PUBLISH_PRODUCT_CLICK;

        @pmi0("retro_recognition_popup_click")
        public static final Type RETRO_RECOGNITION_POPUP_CLICK;

        @pmi0("show_phone_click")
        public static final Type SHOW_PHONE_CLICK;

        @pmi0("type_filter_apply_click")
        public static final Type TYPE_FILTER_APPLY_CLICK;

        @pmi0("type_first_message_click")
        public static final Type TYPE_FIRST_MESSAGE_CLICK;

        @pmi0("type_open_chat_with_owner_click")
        public static final Type TYPE_OPEN_CHAT_WITH_OWNER_CLICK;

        @pmi0("type_open_item")
        public static final Type TYPE_OPEN_ITEM;

        @pmi0("type_phone_call_click")
        public static final Type TYPE_PHONE_CALL_CLICK;

        @pmi0("type_profile_reviews_click")
        public static final Type TYPE_PROFILE_REVIEWS_CLICK;

        @pmi0("type_transition_to_author_click")
        public static final Type TYPE_TRANSITION_TO_AUTHOR_CLICK;

        static {
            Type type = new Type("PRODUCT_CLICK", 0);
            PRODUCT_CLICK = type;
            Type type2 = new Type("CATEGORY_CLICK", 1);
            CATEGORY_CLICK = type2;
            Type type3 = new Type("CREATE_PRODUCT_CLICK", 2);
            CREATE_PRODUCT_CLICK = type3;
            Type type4 = new Type("BLOCK_CAROUSEL_CLICK", 3);
            BLOCK_CAROUSEL_CLICK = type4;
            Type type5 = new Type("PUBLISH_PRODUCT_CLICK", 4);
            PUBLISH_PRODUCT_CLICK = type5;
            Type type6 = new Type("PUBLISH_ITEM_CLICK", 5);
            PUBLISH_ITEM_CLICK = type6;
            Type type7 = new Type("CREATE_ITEM_CONTINUE_CLICK", 6);
            CREATE_ITEM_CONTINUE_CLICK = type7;
            Type type8 = new Type("NEW_POST_ONBOARDING_CLICK", 7);
            NEW_POST_ONBOARDING_CLICK = type8;
            Type type9 = new Type("CREATE_POST_CLICK", 8);
            CREATE_POST_CLICK = type9;
            Type type10 = new Type("CREATE_SUGGEST_POST_CLICK", 9);
            CREATE_SUGGEST_POST_CLICK = type10;
            Type type11 = new Type("CREATE_POSTPONED_POST_CLICK", 10);
            CREATE_POSTPONED_POST_CLICK = type11;
            Type type12 = new Type("NEW_POST_ML_DATA_CLICK", 11);
            NEW_POST_ML_DATA_CLICK = type12;
            Type type13 = new Type("SHOW_PHONE_CLICK", 12);
            SHOW_PHONE_CLICK = type13;
            Type type14 = new Type("TYPE_OPEN_CHAT_WITH_OWNER_CLICK", 13);
            TYPE_OPEN_CHAT_WITH_OWNER_CLICK = type14;
            Type type15 = new Type("TYPE_PHONE_CALL_CLICK", 14);
            TYPE_PHONE_CALL_CLICK = type15;
            Type type16 = new Type("ONBOARDING_BLOCK_HIDE", 15);
            ONBOARDING_BLOCK_HIDE = type16;
            Type type17 = new Type("AUTORECOGNITION_POPUP_POST_CLICK", 16);
            AUTORECOGNITION_POPUP_POST_CLICK = type17;
            Type type18 = new Type("AUTORECOGNITION_POPUP_CLASSIFIEDS_CLICK", 17);
            AUTORECOGNITION_POPUP_CLASSIFIEDS_CLICK = type18;
            Type type19 = new Type("AUTORECOGNITION_BAR_CLICK", 18);
            AUTORECOGNITION_BAR_CLICK = type19;
            Type type20 = new Type("IS_GEO_CHANGED_CLICK", 19);
            IS_GEO_CHANGED_CLICK = type20;
            Type type21 = new Type("TYPE_FILTER_APPLY_CLICK", 20);
            TYPE_FILTER_APPLY_CLICK = type21;
            Type type22 = new Type("CLASSIFIED_DETECT_START_CLICK", 21);
            CLASSIFIED_DETECT_START_CLICK = type22;
            Type type23 = new Type("NATIVE_FORM_LOADED_CLICK", 22);
            NATIVE_FORM_LOADED_CLICK = type23;
            Type type24 = new Type("NATIVE_FORM_SENT_CLICK", 23);
            NATIVE_FORM_SENT_CLICK = type24;
            Type type25 = new Type("AUTORECOGNITION_SNIPPET_AUTO_DELETED", 24);
            AUTORECOGNITION_SNIPPET_AUTO_DELETED = type25;
            Type type26 = new Type("AUTORECOGNITION_SNIPPET_USER_DELETED", 25);
            AUTORECOGNITION_SNIPPET_USER_DELETED = type26;
            Type type27 = new Type("TYPE_TRANSITION_TO_AUTHOR_CLICK", 26);
            TYPE_TRANSITION_TO_AUTHOR_CLICK = type27;
            Type type28 = new Type("TYPE_FIRST_MESSAGE_CLICK", 27);
            TYPE_FIRST_MESSAGE_CLICK = type28;
            Type type29 = new Type("AUTORECOGNITION_REVERT_BAR_CLICK", 28);
            AUTORECOGNITION_REVERT_BAR_CLICK = type29;
            Type type30 = new Type("RETRO_RECOGNITION_POPUP_CLICK", 29);
            RETRO_RECOGNITION_POPUP_CLICK = type30;
            Type type31 = new Type("TYPE_PROFILE_REVIEWS_CLICK", 30);
            TYPE_PROFILE_REVIEWS_CLICK = type31;
            Type type32 = new Type("TYPE_OPEN_ITEM", 31);
            TYPE_OPEN_ITEM = type32;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32};
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

    private SchemeStat$TypeClassifiedsClick(Type type, Classified classified, SchemeStat$TypeClassifiedsProductClickItem schemeStat$TypeClassifiedsProductClickItem, SchemeStat$TypeClassifiedsCategoryClickItem schemeStat$TypeClassifiedsCategoryClickItem, SchemeStat$TypeClassifiedsCreateProductClickItem schemeStat$TypeClassifiedsCreateProductClickItem, SchemeStat$TypeClassifiedsBlockCarouselClickItem schemeStat$TypeClassifiedsBlockCarouselClickItem, SchemeStat$TypeClassifiedsPublishProductClickItem schemeStat$TypeClassifiedsPublishProductClickItem, SchemeStat$TypeClassifiedsNewPostOnboardingClickItem schemeStat$TypeClassifiedsNewPostOnboardingClickItem, SchemeStat$TypeClassifiedsCreatePostClickItem schemeStat$TypeClassifiedsCreatePostClickItem, SchemeStat$TypeClassifiedsPublishItemClick schemeStat$TypeClassifiedsPublishItemClick, SchemeStat$TypeClassifiedsCreateItemContinueClick schemeStat$TypeClassifiedsCreateItemContinueClick, SchemeStat$TypeClassifiedsCreateSuggestPostClickItem schemeStat$TypeClassifiedsCreateSuggestPostClickItem, SchemeStat$TypeClassifiedsCreatePostponedPostClickItem schemeStat$TypeClassifiedsCreatePostponedPostClickItem, SchemeStat$TypeClassifiedsNewPostMlDataClickItem schemeStat$TypeClassifiedsNewPostMlDataClickItem, SchemeStat$TypeClassifiedsShowPhoneClick schemeStat$TypeClassifiedsShowPhoneClick, SchemeStat$TypeClassifiedsOpenChatWithOwnerClick schemeStat$TypeClassifiedsOpenChatWithOwnerClick, SchemeStat$TypeClassifiedsTransitionToAuthorClick schemeStat$TypeClassifiedsTransitionToAuthorClick, SchemeStat$TypeClassifiedsProfileReviewsClick schemeStat$TypeClassifiedsProfileReviewsClick, SchemeStat$TypeClassifiedsOpenItem schemeStat$TypeClassifiedsOpenItem, SchemeStat$TypeClassifiedsPhoneCallClick schemeStat$TypeClassifiedsPhoneCallClick, SchemeStat$TypeClassifiedsOnboardingBlockHide schemeStat$TypeClassifiedsOnboardingBlockHide, SchemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem schemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem, SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem, SchemeStat$TypeClassifiedsAutorecognitionBarClickItem schemeStat$TypeClassifiedsAutorecognitionBarClickItem, SchemeStat$TypeClassifiedsIsGeoChangedClick schemeStat$TypeClassifiedsIsGeoChangedClick, SchemeStat$TypeClassifiedsFilterApplyClick schemeStat$TypeClassifiedsFilterApplyClick, SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem schemeStat$TypeClassifiedsClassifiedDetectStartClickItem, SchemeStat$TypeClassifiedsNativeFormLoadedClickItem schemeStat$TypeClassifiedsNativeFormLoadedClickItem, SchemeStat$TypeClassifiedsNativeFormSentClickItem schemeStat$TypeClassifiedsNativeFormSentClickItem, SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem, SchemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem schemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem, SchemeStat$TypeClassifiedsFirstMessageClick schemeStat$TypeClassifiedsFirstMessageClick, SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem, y8h0 y8h0Var) {
        this.type = type;
        this.classified = classified;
        this.productClick = schemeStat$TypeClassifiedsProductClickItem;
        this.categoryClick = schemeStat$TypeClassifiedsCategoryClickItem;
        this.createProductClick = schemeStat$TypeClassifiedsCreateProductClickItem;
        this.blockCarouselClick = schemeStat$TypeClassifiedsBlockCarouselClickItem;
        this.publishProductClick = schemeStat$TypeClassifiedsPublishProductClickItem;
        this.newPostOnboardingClick = schemeStat$TypeClassifiedsNewPostOnboardingClickItem;
        this.createPostClick = schemeStat$TypeClassifiedsCreatePostClickItem;
        this.publishItemClick = schemeStat$TypeClassifiedsPublishItemClick;
        this.createItemContinueClick = schemeStat$TypeClassifiedsCreateItemContinueClick;
        this.createSuggestPostClick = schemeStat$TypeClassifiedsCreateSuggestPostClickItem;
        this.createPostponedPostClick = schemeStat$TypeClassifiedsCreatePostponedPostClickItem;
        this.newPostMlDataClick = schemeStat$TypeClassifiedsNewPostMlDataClickItem;
        this.showPhoneClick = schemeStat$TypeClassifiedsShowPhoneClick;
        this.typeOpenChatWithOwnerClick = schemeStat$TypeClassifiedsOpenChatWithOwnerClick;
        this.typeTransitionToAuthorClick = schemeStat$TypeClassifiedsTransitionToAuthorClick;
        this.typeProfileReviewsClick = schemeStat$TypeClassifiedsProfileReviewsClick;
        this.typeOpenItem = schemeStat$TypeClassifiedsOpenItem;
        this.typePhoneCallClick = schemeStat$TypeClassifiedsPhoneCallClick;
        this.onboardingBlockHide = schemeStat$TypeClassifiedsOnboardingBlockHide;
        this.autorecognitionPopupPostClick = schemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem;
        this.autorecognitionPopupClassifiedsClick = schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem;
        this.autorecognitionBarClick = schemeStat$TypeClassifiedsAutorecognitionBarClickItem;
        this.isGeoChangedClick = schemeStat$TypeClassifiedsIsGeoChangedClick;
        this.typeFilterApplyClick = schemeStat$TypeClassifiedsFilterApplyClick;
        this.classifiedDetectStartClick = schemeStat$TypeClassifiedsClassifiedDetectStartClickItem;
        this.nativeFormLoadedClick = schemeStat$TypeClassifiedsNativeFormLoadedClickItem;
        this.nativeFormSentClick = schemeStat$TypeClassifiedsNativeFormSentClickItem;
        this.autorecognitionSnippetAutoDeletedClick = schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem;
        this.autorecognitionSnippetUserDeletedClick = schemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem;
        this.typeFirstMessageClick = schemeStat$TypeClassifiedsFirstMessageClick;
        this.autorecognitionRevertBarClick = schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsClick schemeStat$TypeClassifiedsClick = (SchemeStat$TypeClassifiedsClick) obj;
        return this.type == schemeStat$TypeClassifiedsClick.type && this.classified == schemeStat$TypeClassifiedsClick.classified && epx.f(this.productClick, schemeStat$TypeClassifiedsClick.productClick) && epx.f(this.categoryClick, schemeStat$TypeClassifiedsClick.categoryClick) && epx.f(this.createProductClick, schemeStat$TypeClassifiedsClick.createProductClick) && epx.f(this.blockCarouselClick, schemeStat$TypeClassifiedsClick.blockCarouselClick) && epx.f(this.publishProductClick, schemeStat$TypeClassifiedsClick.publishProductClick) && epx.f(this.newPostOnboardingClick, schemeStat$TypeClassifiedsClick.newPostOnboardingClick) && epx.f(this.createPostClick, schemeStat$TypeClassifiedsClick.createPostClick) && epx.f(this.publishItemClick, schemeStat$TypeClassifiedsClick.publishItemClick) && epx.f(this.createItemContinueClick, schemeStat$TypeClassifiedsClick.createItemContinueClick) && epx.f(this.createSuggestPostClick, schemeStat$TypeClassifiedsClick.createSuggestPostClick) && epx.f(this.createPostponedPostClick, schemeStat$TypeClassifiedsClick.createPostponedPostClick) && epx.f(this.newPostMlDataClick, schemeStat$TypeClassifiedsClick.newPostMlDataClick) && epx.f(this.showPhoneClick, schemeStat$TypeClassifiedsClick.showPhoneClick) && epx.f(this.typeOpenChatWithOwnerClick, schemeStat$TypeClassifiedsClick.typeOpenChatWithOwnerClick) && epx.f(this.typeTransitionToAuthorClick, schemeStat$TypeClassifiedsClick.typeTransitionToAuthorClick) && epx.f(this.typeProfileReviewsClick, schemeStat$TypeClassifiedsClick.typeProfileReviewsClick) && epx.f(this.typeOpenItem, schemeStat$TypeClassifiedsClick.typeOpenItem) && epx.f(this.typePhoneCallClick, schemeStat$TypeClassifiedsClick.typePhoneCallClick) && epx.f(this.onboardingBlockHide, schemeStat$TypeClassifiedsClick.onboardingBlockHide) && epx.f(this.autorecognitionPopupPostClick, schemeStat$TypeClassifiedsClick.autorecognitionPopupPostClick) && epx.f(this.autorecognitionPopupClassifiedsClick, schemeStat$TypeClassifiedsClick.autorecognitionPopupClassifiedsClick) && epx.f(this.autorecognitionBarClick, schemeStat$TypeClassifiedsClick.autorecognitionBarClick) && epx.f(this.isGeoChangedClick, schemeStat$TypeClassifiedsClick.isGeoChangedClick) && epx.f(this.typeFilterApplyClick, schemeStat$TypeClassifiedsClick.typeFilterApplyClick) && epx.f(this.classifiedDetectStartClick, schemeStat$TypeClassifiedsClick.classifiedDetectStartClick) && epx.f(this.nativeFormLoadedClick, schemeStat$TypeClassifiedsClick.nativeFormLoadedClick) && epx.f(this.nativeFormSentClick, schemeStat$TypeClassifiedsClick.nativeFormSentClick) && epx.f(this.autorecognitionSnippetAutoDeletedClick, schemeStat$TypeClassifiedsClick.autorecognitionSnippetAutoDeletedClick) && epx.f(this.autorecognitionSnippetUserDeletedClick, schemeStat$TypeClassifiedsClick.autorecognitionSnippetUserDeletedClick) && epx.f(this.typeFirstMessageClick, schemeStat$TypeClassifiedsClick.typeFirstMessageClick) && epx.f(this.autorecognitionRevertBarClick, schemeStat$TypeClassifiedsClick.autorecognitionRevertBarClick);
    }

    public final int hashCode() {
        int hashCode = (this.classified.hashCode() + (this.type.hashCode() * 31)) * 31;
        SchemeStat$TypeClassifiedsProductClickItem schemeStat$TypeClassifiedsProductClickItem = this.productClick;
        int hashCode2 = (hashCode + (schemeStat$TypeClassifiedsProductClickItem == null ? 0 : schemeStat$TypeClassifiedsProductClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCategoryClickItem schemeStat$TypeClassifiedsCategoryClickItem = this.categoryClick;
        int hashCode3 = (hashCode2 + (schemeStat$TypeClassifiedsCategoryClickItem == null ? 0 : schemeStat$TypeClassifiedsCategoryClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCreateProductClickItem schemeStat$TypeClassifiedsCreateProductClickItem = this.createProductClick;
        int hashCode4 = (hashCode3 + (schemeStat$TypeClassifiedsCreateProductClickItem == null ? 0 : schemeStat$TypeClassifiedsCreateProductClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsBlockCarouselClickItem schemeStat$TypeClassifiedsBlockCarouselClickItem = this.blockCarouselClick;
        int hashCode5 = (hashCode4 + (schemeStat$TypeClassifiedsBlockCarouselClickItem == null ? 0 : schemeStat$TypeClassifiedsBlockCarouselClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsPublishProductClickItem schemeStat$TypeClassifiedsPublishProductClickItem = this.publishProductClick;
        int hashCode6 = (hashCode5 + (schemeStat$TypeClassifiedsPublishProductClickItem == null ? 0 : schemeStat$TypeClassifiedsPublishProductClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsNewPostOnboardingClickItem schemeStat$TypeClassifiedsNewPostOnboardingClickItem = this.newPostOnboardingClick;
        int hashCode7 = (hashCode6 + (schemeStat$TypeClassifiedsNewPostOnboardingClickItem == null ? 0 : schemeStat$TypeClassifiedsNewPostOnboardingClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCreatePostClickItem schemeStat$TypeClassifiedsCreatePostClickItem = this.createPostClick;
        int hashCode8 = (hashCode7 + (schemeStat$TypeClassifiedsCreatePostClickItem == null ? 0 : schemeStat$TypeClassifiedsCreatePostClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsPublishItemClick schemeStat$TypeClassifiedsPublishItemClick = this.publishItemClick;
        int hashCode9 = (hashCode8 + (schemeStat$TypeClassifiedsPublishItemClick == null ? 0 : schemeStat$TypeClassifiedsPublishItemClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCreateItemContinueClick schemeStat$TypeClassifiedsCreateItemContinueClick = this.createItemContinueClick;
        int hashCode10 = (hashCode9 + (schemeStat$TypeClassifiedsCreateItemContinueClick == null ? 0 : schemeStat$TypeClassifiedsCreateItemContinueClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCreateSuggestPostClickItem schemeStat$TypeClassifiedsCreateSuggestPostClickItem = this.createSuggestPostClick;
        int hashCode11 = (hashCode10 + (schemeStat$TypeClassifiedsCreateSuggestPostClickItem == null ? 0 : schemeStat$TypeClassifiedsCreateSuggestPostClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCreatePostponedPostClickItem schemeStat$TypeClassifiedsCreatePostponedPostClickItem = this.createPostponedPostClick;
        int hashCode12 = (hashCode11 + (schemeStat$TypeClassifiedsCreatePostponedPostClickItem == null ? 0 : schemeStat$TypeClassifiedsCreatePostponedPostClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsNewPostMlDataClickItem schemeStat$TypeClassifiedsNewPostMlDataClickItem = this.newPostMlDataClick;
        int hashCode13 = (hashCode12 + (schemeStat$TypeClassifiedsNewPostMlDataClickItem == null ? 0 : schemeStat$TypeClassifiedsNewPostMlDataClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsShowPhoneClick schemeStat$TypeClassifiedsShowPhoneClick = this.showPhoneClick;
        int hashCode14 = (hashCode13 + (schemeStat$TypeClassifiedsShowPhoneClick == null ? 0 : schemeStat$TypeClassifiedsShowPhoneClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsOpenChatWithOwnerClick schemeStat$TypeClassifiedsOpenChatWithOwnerClick = this.typeOpenChatWithOwnerClick;
        int hashCode15 = (hashCode14 + (schemeStat$TypeClassifiedsOpenChatWithOwnerClick == null ? 0 : schemeStat$TypeClassifiedsOpenChatWithOwnerClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsTransitionToAuthorClick schemeStat$TypeClassifiedsTransitionToAuthorClick = this.typeTransitionToAuthorClick;
        int hashCode16 = (hashCode15 + (schemeStat$TypeClassifiedsTransitionToAuthorClick == null ? 0 : schemeStat$TypeClassifiedsTransitionToAuthorClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsProfileReviewsClick schemeStat$TypeClassifiedsProfileReviewsClick = this.typeProfileReviewsClick;
        int hashCode17 = (hashCode16 + (schemeStat$TypeClassifiedsProfileReviewsClick == null ? 0 : schemeStat$TypeClassifiedsProfileReviewsClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsOpenItem schemeStat$TypeClassifiedsOpenItem = this.typeOpenItem;
        int hashCode18 = (hashCode17 + (schemeStat$TypeClassifiedsOpenItem == null ? 0 : schemeStat$TypeClassifiedsOpenItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsPhoneCallClick schemeStat$TypeClassifiedsPhoneCallClick = this.typePhoneCallClick;
        int hashCode19 = (hashCode18 + (schemeStat$TypeClassifiedsPhoneCallClick == null ? 0 : schemeStat$TypeClassifiedsPhoneCallClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsOnboardingBlockHide schemeStat$TypeClassifiedsOnboardingBlockHide = this.onboardingBlockHide;
        int hashCode20 = (hashCode19 + (schemeStat$TypeClassifiedsOnboardingBlockHide == null ? 0 : schemeStat$TypeClassifiedsOnboardingBlockHide.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem schemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem = this.autorecognitionPopupPostClick;
        int hashCode21 = (hashCode20 + (schemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem = this.autorecognitionPopupClassifiedsClick;
        int hashCode22 = (hashCode21 + (schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionBarClickItem schemeStat$TypeClassifiedsAutorecognitionBarClickItem = this.autorecognitionBarClick;
        int hashCode23 = (hashCode22 + (schemeStat$TypeClassifiedsAutorecognitionBarClickItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionBarClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsIsGeoChangedClick schemeStat$TypeClassifiedsIsGeoChangedClick = this.isGeoChangedClick;
        int hashCode24 = (hashCode23 + (schemeStat$TypeClassifiedsIsGeoChangedClick == null ? 0 : schemeStat$TypeClassifiedsIsGeoChangedClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsFilterApplyClick schemeStat$TypeClassifiedsFilterApplyClick = this.typeFilterApplyClick;
        int hashCode25 = (hashCode24 + (schemeStat$TypeClassifiedsFilterApplyClick == null ? 0 : schemeStat$TypeClassifiedsFilterApplyClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem schemeStat$TypeClassifiedsClassifiedDetectStartClickItem = this.classifiedDetectStartClick;
        int hashCode26 = (hashCode25 + (schemeStat$TypeClassifiedsClassifiedDetectStartClickItem == null ? 0 : schemeStat$TypeClassifiedsClassifiedDetectStartClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsNativeFormLoadedClickItem schemeStat$TypeClassifiedsNativeFormLoadedClickItem = this.nativeFormLoadedClick;
        int hashCode27 = (hashCode26 + (schemeStat$TypeClassifiedsNativeFormLoadedClickItem == null ? 0 : schemeStat$TypeClassifiedsNativeFormLoadedClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsNativeFormSentClickItem schemeStat$TypeClassifiedsNativeFormSentClickItem = this.nativeFormSentClick;
        int hashCode28 = (hashCode27 + (schemeStat$TypeClassifiedsNativeFormSentClickItem == null ? 0 : schemeStat$TypeClassifiedsNativeFormSentClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem = this.autorecognitionSnippetAutoDeletedClick;
        int hashCode29 = (hashCode28 + (schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem schemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem = this.autorecognitionSnippetUserDeletedClick;
        int hashCode30 = (hashCode29 + (schemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsFirstMessageClick schemeStat$TypeClassifiedsFirstMessageClick = this.typeFirstMessageClick;
        int hashCode31 = (hashCode30 + (schemeStat$TypeClassifiedsFirstMessageClick == null ? 0 : schemeStat$TypeClassifiedsFirstMessageClick.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem = this.autorecognitionRevertBarClick;
        return (hashCode31 + (schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem != null ? schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "TypeClassifiedsClick(type=" + this.type + ", classified=" + this.classified + ", productClick=" + this.productClick + ", categoryClick=" + this.categoryClick + ", createProductClick=" + this.createProductClick + ", blockCarouselClick=" + this.blockCarouselClick + ", publishProductClick=" + this.publishProductClick + ", newPostOnboardingClick=" + this.newPostOnboardingClick + ", createPostClick=" + this.createPostClick + ", publishItemClick=" + this.publishItemClick + ", createItemContinueClick=" + this.createItemContinueClick + ", createSuggestPostClick=" + this.createSuggestPostClick + ", createPostponedPostClick=" + this.createPostponedPostClick + ", newPostMlDataClick=" + this.newPostMlDataClick + ", showPhoneClick=" + this.showPhoneClick + ", typeOpenChatWithOwnerClick=" + this.typeOpenChatWithOwnerClick + ", typeTransitionToAuthorClick=" + this.typeTransitionToAuthorClick + ", typeProfileReviewsClick=" + this.typeProfileReviewsClick + ", typeOpenItem=" + this.typeOpenItem + ", typePhoneCallClick=" + this.typePhoneCallClick + ", onboardingBlockHide=" + this.onboardingBlockHide + ", autorecognitionPopupPostClick=" + this.autorecognitionPopupPostClick + ", autorecognitionPopupClassifiedsClick=" + this.autorecognitionPopupClassifiedsClick + ", autorecognitionBarClick=" + this.autorecognitionBarClick + ", isGeoChangedClick=" + this.isGeoChangedClick + ", typeFilterApplyClick=" + this.typeFilterApplyClick + ", classifiedDetectStartClick=" + this.classifiedDetectStartClick + ", nativeFormLoadedClick=" + this.nativeFormLoadedClick + ", nativeFormSentClick=" + this.nativeFormSentClick + ", autorecognitionSnippetAutoDeletedClick=" + this.autorecognitionSnippetAutoDeletedClick + ", autorecognitionSnippetUserDeletedClick=" + this.autorecognitionSnippetUserDeletedClick + ", typeFirstMessageClick=" + this.typeFirstMessageClick + ", autorecognitionRevertBarClick=" + this.autorecognitionRevertBarClick + ", retroRecognitionPopupClick=null)";
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsClick(Type type, Classified classified, SchemeStat$TypeClassifiedsProductClickItem schemeStat$TypeClassifiedsProductClickItem, SchemeStat$TypeClassifiedsCategoryClickItem schemeStat$TypeClassifiedsCategoryClickItem, SchemeStat$TypeClassifiedsCreateProductClickItem schemeStat$TypeClassifiedsCreateProductClickItem, SchemeStat$TypeClassifiedsBlockCarouselClickItem schemeStat$TypeClassifiedsBlockCarouselClickItem, SchemeStat$TypeClassifiedsPublishProductClickItem schemeStat$TypeClassifiedsPublishProductClickItem, SchemeStat$TypeClassifiedsNewPostOnboardingClickItem schemeStat$TypeClassifiedsNewPostOnboardingClickItem, SchemeStat$TypeClassifiedsCreatePostClickItem schemeStat$TypeClassifiedsCreatePostClickItem, SchemeStat$TypeClassifiedsPublishItemClick schemeStat$TypeClassifiedsPublishItemClick, SchemeStat$TypeClassifiedsCreateItemContinueClick schemeStat$TypeClassifiedsCreateItemContinueClick, SchemeStat$TypeClassifiedsCreateSuggestPostClickItem schemeStat$TypeClassifiedsCreateSuggestPostClickItem, SchemeStat$TypeClassifiedsCreatePostponedPostClickItem schemeStat$TypeClassifiedsCreatePostponedPostClickItem, SchemeStat$TypeClassifiedsNewPostMlDataClickItem schemeStat$TypeClassifiedsNewPostMlDataClickItem, SchemeStat$TypeClassifiedsShowPhoneClick schemeStat$TypeClassifiedsShowPhoneClick, SchemeStat$TypeClassifiedsOpenChatWithOwnerClick schemeStat$TypeClassifiedsOpenChatWithOwnerClick, SchemeStat$TypeClassifiedsTransitionToAuthorClick schemeStat$TypeClassifiedsTransitionToAuthorClick, SchemeStat$TypeClassifiedsProfileReviewsClick schemeStat$TypeClassifiedsProfileReviewsClick, SchemeStat$TypeClassifiedsOpenItem schemeStat$TypeClassifiedsOpenItem, SchemeStat$TypeClassifiedsPhoneCallClick schemeStat$TypeClassifiedsPhoneCallClick, SchemeStat$TypeClassifiedsOnboardingBlockHide schemeStat$TypeClassifiedsOnboardingBlockHide, SchemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem schemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem, SchemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem, SchemeStat$TypeClassifiedsAutorecognitionBarClickItem schemeStat$TypeClassifiedsAutorecognitionBarClickItem, SchemeStat$TypeClassifiedsIsGeoChangedClick schemeStat$TypeClassifiedsIsGeoChangedClick, SchemeStat$TypeClassifiedsFilterApplyClick schemeStat$TypeClassifiedsFilterApplyClick, SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem schemeStat$TypeClassifiedsClassifiedDetectStartClickItem, SchemeStat$TypeClassifiedsNativeFormLoadedClickItem schemeStat$TypeClassifiedsNativeFormLoadedClickItem, SchemeStat$TypeClassifiedsNativeFormSentClickItem schemeStat$TypeClassifiedsNativeFormSentClickItem, SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem, SchemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem schemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem, SchemeStat$TypeClassifiedsFirstMessageClick schemeStat$TypeClassifiedsFirstMessageClick, SchemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem, y8h0 y8h0Var, int i, int i2, zcl zclVar) {
        this(type, classified, (i & 4) != 0 ? null : schemeStat$TypeClassifiedsProductClickItem, (i & 8) != 0 ? null : schemeStat$TypeClassifiedsCategoryClickItem, (i & 16) != 0 ? null : schemeStat$TypeClassifiedsCreateProductClickItem, (i & 32) != 0 ? null : schemeStat$TypeClassifiedsBlockCarouselClickItem, (i & 64) != 0 ? null : schemeStat$TypeClassifiedsPublishProductClickItem, (i & 128) != 0 ? null : schemeStat$TypeClassifiedsNewPostOnboardingClickItem, (i & 256) != 0 ? null : schemeStat$TypeClassifiedsCreatePostClickItem, (i & 512) != 0 ? null : schemeStat$TypeClassifiedsPublishItemClick, (i & 1024) != 0 ? null : schemeStat$TypeClassifiedsCreateItemContinueClick, (i & 2048) != 0 ? null : schemeStat$TypeClassifiedsCreateSuggestPostClickItem, (i & 4096) != 0 ? null : schemeStat$TypeClassifiedsCreatePostponedPostClickItem, (i & 8192) != 0 ? null : schemeStat$TypeClassifiedsNewPostMlDataClickItem, (i & 16384) != 0 ? null : schemeStat$TypeClassifiedsShowPhoneClick, (32768 & i) != 0 ? null : schemeStat$TypeClassifiedsOpenChatWithOwnerClick, (i & 65536) != 0 ? null : schemeStat$TypeClassifiedsTransitionToAuthorClick, (i & 131072) != 0 ? null : schemeStat$TypeClassifiedsProfileReviewsClick, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : schemeStat$TypeClassifiedsOpenItem, (i & 524288) != 0 ? null : schemeStat$TypeClassifiedsPhoneCallClick, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : schemeStat$TypeClassifiedsOnboardingBlockHide, (i & 2097152) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionPopupPostClickItem, (i & 4194304) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionPopupClassifiedsClickItem, (i & 8388608) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionBarClickItem, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : schemeStat$TypeClassifiedsIsGeoChangedClick, (i & 33554432) != 0 ? null : schemeStat$TypeClassifiedsFilterApplyClick, (i & 67108864) != 0 ? null : schemeStat$TypeClassifiedsClassifiedDetectStartClickItem, (i & 134217728) != 0 ? null : schemeStat$TypeClassifiedsNativeFormLoadedClickItem, (i & 268435456) != 0 ? null : schemeStat$TypeClassifiedsNativeFormSentClickItem, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem, (i & 1073741824) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionSnippetUserDeletedClickItem, (i & Integer.MIN_VALUE) != 0 ? null : schemeStat$TypeClassifiedsFirstMessageClick, (i2 & 1) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionRevertBarClickItem, (i2 & 2) != 0 ? null : y8h0Var);
    }
}
