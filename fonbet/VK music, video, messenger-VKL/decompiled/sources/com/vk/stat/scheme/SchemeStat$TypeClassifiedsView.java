package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.z8h0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsView implements SchemeStat$TypeView.b {

    @pmi0("autorecognition_bar_render")
    private final SchemeStat$TypeClassifiedsAutorecognitionBarRenderItem autorecognitionBarRender;

    @pmi0("autorecognition_bar_show")
    private final SchemeStat$TypeClassifiedsAutorecognitionBarShowItem autorecognitionBarShow;

    @pmi0("autorecognition_popup_show")
    private final SchemeStat$TypeClassifiedsAutorecognitionPopupShowItem autorecognitionPopupShow;

    @pmi0("autorecognition_revert_bar_render")
    private final SchemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem autorecognitionRevertBarRender;

    @pmi0("autorecognition_revert_bar_show")
    private final SchemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem autorecognitionRevertBarShow;

    @pmi0("autorecognition_snippet_attached")
    private final SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem autorecognitionSnippetAttached;

    @pmi0("block_carousel_view")
    private final SchemeStat$TypeClassifiedsBlockCarouselViewItem blockCarouselView;

    @pmi0("category_view")
    private final SchemeStat$TypeClassifiedsCategoryViewItem categoryView;

    @pmi0("classified")
    private final Classified classified;

    @pmi0("create_item_category_view")
    private final SchemeStat$TypeClassifiedsCreateItemCategoryView createItemCategoryView;

    @pmi0("onboarding_block_view")
    private final SchemeStat$TypeClassifiedsOnboardingBlockView onboardingBlockView;

    @pmi0("open_community_view")
    private final SchemeStat$TypeClassifiedsOpenCommunityViewItem openCommunityView;

    @pmi0("open_vko")
    private final SchemeStat$TypeClassifiedsOpenVkoItem openVko;

    @pmi0("post_view")
    private final SchemeStat$TypeClassifiedsPostViewItem postView;

    @pmi0("product_view")
    private final SchemeStat$TypeClassifiedsProductViewItem productView;

    @pmi0("retro_recognition_popup_show")
    private final z8h0 retroRecognitionPopupShow;

    @pmi0("type")
    private final Type type;

    @pmi0("view_collection")
    private final MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem viewCollection;

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

        @pmi0("autorecognition_bar_render")
        public static final Type AUTORECOGNITION_BAR_RENDER;

        @pmi0("autorecognition_bar_show")
        public static final Type AUTORECOGNITION_BAR_SHOW;

        @pmi0("autorecognition_popup_show")
        public static final Type AUTORECOGNITION_POPUP_SHOW;

        @pmi0("autorecognition_revert_bar_render")
        public static final Type AUTORECOGNITION_REVERT_BAR_RENDER;

        @pmi0("autorecognition_revert_bar_show")
        public static final Type AUTORECOGNITION_REVERT_BAR_SHOW;

        @pmi0("autorecognition_snippet_attached")
        public static final Type AUTORECOGNITION_SNIPPET_ATTACHED;

        @pmi0("block_carousel_view")
        public static final Type BLOCK_CAROUSEL_VIEW;

        @pmi0("category_view")
        public static final Type CATEGORY_VIEW;

        @pmi0("create_item_category_view")
        public static final Type CREATE_ITEM_CATEGORY_VIEW;

        @pmi0("onboarding_block_view")
        public static final Type ONBOARDING_BLOCK_VIEW;

        @pmi0("open_community_view")
        public static final Type OPEN_COMMUNITY_VIEW;

        @pmi0("open_vko")
        public static final Type OPEN_VKO;

        @pmi0("post_view")
        public static final Type POST_VIEW;

        @pmi0("product_view")
        public static final Type PRODUCT_VIEW;

        @pmi0("retro_recognition_popup_show")
        public static final Type RETRO_RECOGNITION_POPUP_SHOW;

        @pmi0("view_collection")
        public static final Type VIEW_COLLECTION;

        static {
            Type type = new Type("PRODUCT_VIEW", 0);
            PRODUCT_VIEW = type;
            Type type2 = new Type("CATEGORY_VIEW", 1);
            CATEGORY_VIEW = type2;
            Type type3 = new Type("BLOCK_CAROUSEL_VIEW", 2);
            BLOCK_CAROUSEL_VIEW = type3;
            Type type4 = new Type("OPEN_VKO", 3);
            OPEN_VKO = type4;
            Type type5 = new Type("POST_VIEW", 4);
            POST_VIEW = type5;
            Type type6 = new Type("ONBOARDING_BLOCK_VIEW", 5);
            ONBOARDING_BLOCK_VIEW = type6;
            Type type7 = new Type("AUTORECOGNITION_POPUP_SHOW", 6);
            AUTORECOGNITION_POPUP_SHOW = type7;
            Type type8 = new Type("AUTORECOGNITION_BAR_SHOW", 7);
            AUTORECOGNITION_BAR_SHOW = type8;
            Type type9 = new Type("AUTORECOGNITION_BAR_RENDER", 8);
            AUTORECOGNITION_BAR_RENDER = type9;
            Type type10 = new Type("OPEN_COMMUNITY_VIEW", 9);
            OPEN_COMMUNITY_VIEW = type10;
            Type type11 = new Type("AUTORECOGNITION_SNIPPET_ATTACHED", 10);
            AUTORECOGNITION_SNIPPET_ATTACHED = type11;
            Type type12 = new Type("AUTORECOGNITION_REVERT_BAR_RENDER", 11);
            AUTORECOGNITION_REVERT_BAR_RENDER = type12;
            Type type13 = new Type("AUTORECOGNITION_REVERT_BAR_SHOW", 12);
            AUTORECOGNITION_REVERT_BAR_SHOW = type13;
            Type type14 = new Type("RETRO_RECOGNITION_POPUP_SHOW", 13);
            RETRO_RECOGNITION_POPUP_SHOW = type14;
            Type type15 = new Type("CREATE_ITEM_CATEGORY_VIEW", 14);
            CREATE_ITEM_CATEGORY_VIEW = type15;
            Type type16 = new Type("VIEW_COLLECTION", 15);
            VIEW_COLLECTION = type16;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16};
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

    private SchemeStat$TypeClassifiedsView(Type type, Classified classified, SchemeStat$TypeClassifiedsProductViewItem schemeStat$TypeClassifiedsProductViewItem, SchemeStat$TypeClassifiedsCategoryViewItem schemeStat$TypeClassifiedsCategoryViewItem, SchemeStat$TypeClassifiedsBlockCarouselViewItem schemeStat$TypeClassifiedsBlockCarouselViewItem, SchemeStat$TypeClassifiedsOpenVkoItem schemeStat$TypeClassifiedsOpenVkoItem, SchemeStat$TypeClassifiedsPostViewItem schemeStat$TypeClassifiedsPostViewItem, SchemeStat$TypeClassifiedsOnboardingBlockView schemeStat$TypeClassifiedsOnboardingBlockView, SchemeStat$TypeClassifiedsAutorecognitionPopupShowItem schemeStat$TypeClassifiedsAutorecognitionPopupShowItem, SchemeStat$TypeClassifiedsAutorecognitionBarShowItem schemeStat$TypeClassifiedsAutorecognitionBarShowItem, SchemeStat$TypeClassifiedsAutorecognitionBarRenderItem schemeStat$TypeClassifiedsAutorecognitionBarRenderItem, SchemeStat$TypeClassifiedsOpenCommunityViewItem schemeStat$TypeClassifiedsOpenCommunityViewItem, SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem, SchemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem schemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem, SchemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem schemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem, z8h0 z8h0Var, SchemeStat$TypeClassifiedsCreateItemCategoryView schemeStat$TypeClassifiedsCreateItemCategoryView, MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem mobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem) {
        this.type = type;
        this.classified = classified;
        this.productView = schemeStat$TypeClassifiedsProductViewItem;
        this.categoryView = schemeStat$TypeClassifiedsCategoryViewItem;
        this.blockCarouselView = schemeStat$TypeClassifiedsBlockCarouselViewItem;
        this.openVko = schemeStat$TypeClassifiedsOpenVkoItem;
        this.postView = schemeStat$TypeClassifiedsPostViewItem;
        this.onboardingBlockView = schemeStat$TypeClassifiedsOnboardingBlockView;
        this.autorecognitionPopupShow = schemeStat$TypeClassifiedsAutorecognitionPopupShowItem;
        this.autorecognitionBarShow = schemeStat$TypeClassifiedsAutorecognitionBarShowItem;
        this.autorecognitionBarRender = schemeStat$TypeClassifiedsAutorecognitionBarRenderItem;
        this.openCommunityView = schemeStat$TypeClassifiedsOpenCommunityViewItem;
        this.autorecognitionSnippetAttached = schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem;
        this.autorecognitionRevertBarRender = schemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem;
        this.autorecognitionRevertBarShow = schemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem;
        this.createItemCategoryView = schemeStat$TypeClassifiedsCreateItemCategoryView;
        this.viewCollection = mobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsView)) {
            return false;
        }
        SchemeStat$TypeClassifiedsView schemeStat$TypeClassifiedsView = (SchemeStat$TypeClassifiedsView) obj;
        return this.type == schemeStat$TypeClassifiedsView.type && this.classified == schemeStat$TypeClassifiedsView.classified && epx.f(this.productView, schemeStat$TypeClassifiedsView.productView) && epx.f(this.categoryView, schemeStat$TypeClassifiedsView.categoryView) && epx.f(this.blockCarouselView, schemeStat$TypeClassifiedsView.blockCarouselView) && epx.f(this.openVko, schemeStat$TypeClassifiedsView.openVko) && epx.f(this.postView, schemeStat$TypeClassifiedsView.postView) && epx.f(this.onboardingBlockView, schemeStat$TypeClassifiedsView.onboardingBlockView) && epx.f(this.autorecognitionPopupShow, schemeStat$TypeClassifiedsView.autorecognitionPopupShow) && epx.f(this.autorecognitionBarShow, schemeStat$TypeClassifiedsView.autorecognitionBarShow) && epx.f(this.autorecognitionBarRender, schemeStat$TypeClassifiedsView.autorecognitionBarRender) && epx.f(this.openCommunityView, schemeStat$TypeClassifiedsView.openCommunityView) && epx.f(this.autorecognitionSnippetAttached, schemeStat$TypeClassifiedsView.autorecognitionSnippetAttached) && epx.f(this.autorecognitionRevertBarRender, schemeStat$TypeClassifiedsView.autorecognitionRevertBarRender) && epx.f(this.autorecognitionRevertBarShow, schemeStat$TypeClassifiedsView.autorecognitionRevertBarShow) && epx.f(this.createItemCategoryView, schemeStat$TypeClassifiedsView.createItemCategoryView) && epx.f(this.viewCollection, schemeStat$TypeClassifiedsView.viewCollection);
    }

    public final int hashCode() {
        int hashCode = (this.classified.hashCode() + (this.type.hashCode() * 31)) * 31;
        SchemeStat$TypeClassifiedsProductViewItem schemeStat$TypeClassifiedsProductViewItem = this.productView;
        int hashCode2 = (hashCode + (schemeStat$TypeClassifiedsProductViewItem == null ? 0 : schemeStat$TypeClassifiedsProductViewItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCategoryViewItem schemeStat$TypeClassifiedsCategoryViewItem = this.categoryView;
        int hashCode3 = (hashCode2 + (schemeStat$TypeClassifiedsCategoryViewItem == null ? 0 : schemeStat$TypeClassifiedsCategoryViewItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsBlockCarouselViewItem schemeStat$TypeClassifiedsBlockCarouselViewItem = this.blockCarouselView;
        int hashCode4 = (hashCode3 + (schemeStat$TypeClassifiedsBlockCarouselViewItem == null ? 0 : schemeStat$TypeClassifiedsBlockCarouselViewItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsOpenVkoItem schemeStat$TypeClassifiedsOpenVkoItem = this.openVko;
        int hashCode5 = (hashCode4 + (schemeStat$TypeClassifiedsOpenVkoItem == null ? 0 : schemeStat$TypeClassifiedsOpenVkoItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsPostViewItem schemeStat$TypeClassifiedsPostViewItem = this.postView;
        int hashCode6 = (hashCode5 + (schemeStat$TypeClassifiedsPostViewItem == null ? 0 : schemeStat$TypeClassifiedsPostViewItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsOnboardingBlockView schemeStat$TypeClassifiedsOnboardingBlockView = this.onboardingBlockView;
        int hashCode7 = (hashCode6 + (schemeStat$TypeClassifiedsOnboardingBlockView == null ? 0 : schemeStat$TypeClassifiedsOnboardingBlockView.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionPopupShowItem schemeStat$TypeClassifiedsAutorecognitionPopupShowItem = this.autorecognitionPopupShow;
        int hashCode8 = (hashCode7 + (schemeStat$TypeClassifiedsAutorecognitionPopupShowItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionPopupShowItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionBarShowItem schemeStat$TypeClassifiedsAutorecognitionBarShowItem = this.autorecognitionBarShow;
        int hashCode9 = (hashCode8 + (schemeStat$TypeClassifiedsAutorecognitionBarShowItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionBarShowItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionBarRenderItem schemeStat$TypeClassifiedsAutorecognitionBarRenderItem = this.autorecognitionBarRender;
        int hashCode10 = (hashCode9 + (schemeStat$TypeClassifiedsAutorecognitionBarRenderItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionBarRenderItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsOpenCommunityViewItem schemeStat$TypeClassifiedsOpenCommunityViewItem = this.openCommunityView;
        int hashCode11 = (hashCode10 + (schemeStat$TypeClassifiedsOpenCommunityViewItem == null ? 0 : schemeStat$TypeClassifiedsOpenCommunityViewItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem = this.autorecognitionSnippetAttached;
        int hashCode12 = (hashCode11 + (schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem schemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem = this.autorecognitionRevertBarRender;
        int hashCode13 = (hashCode12 + (schemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem schemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem = this.autorecognitionRevertBarShow;
        int hashCode14 = (hashCode13 + (schemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem == null ? 0 : schemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem.hashCode())) * 961;
        SchemeStat$TypeClassifiedsCreateItemCategoryView schemeStat$TypeClassifiedsCreateItemCategoryView = this.createItemCategoryView;
        int hashCode15 = (hashCode14 + (schemeStat$TypeClassifiedsCreateItemCategoryView == null ? 0 : schemeStat$TypeClassifiedsCreateItemCategoryView.hashCode())) * 31;
        MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem mobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem = this.viewCollection;
        return hashCode15 + (mobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem != null ? mobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsView(type=" + this.type + ", classified=" + this.classified + ", productView=" + this.productView + ", categoryView=" + this.categoryView + ", blockCarouselView=" + this.blockCarouselView + ", openVko=" + this.openVko + ", postView=" + this.postView + ", onboardingBlockView=" + this.onboardingBlockView + ", autorecognitionPopupShow=" + this.autorecognitionPopupShow + ", autorecognitionBarShow=" + this.autorecognitionBarShow + ", autorecognitionBarRender=" + this.autorecognitionBarRender + ", openCommunityView=" + this.openCommunityView + ", autorecognitionSnippetAttached=" + this.autorecognitionSnippetAttached + ", autorecognitionRevertBarRender=" + this.autorecognitionRevertBarRender + ", autorecognitionRevertBarShow=" + this.autorecognitionRevertBarShow + ", retroRecognitionPopupShow=null, createItemCategoryView=" + this.createItemCategoryView + ", viewCollection=" + this.viewCollection + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsView(Type type, Classified classified, SchemeStat$TypeClassifiedsProductViewItem schemeStat$TypeClassifiedsProductViewItem, SchemeStat$TypeClassifiedsCategoryViewItem schemeStat$TypeClassifiedsCategoryViewItem, SchemeStat$TypeClassifiedsBlockCarouselViewItem schemeStat$TypeClassifiedsBlockCarouselViewItem, SchemeStat$TypeClassifiedsOpenVkoItem schemeStat$TypeClassifiedsOpenVkoItem, SchemeStat$TypeClassifiedsPostViewItem schemeStat$TypeClassifiedsPostViewItem, SchemeStat$TypeClassifiedsOnboardingBlockView schemeStat$TypeClassifiedsOnboardingBlockView, SchemeStat$TypeClassifiedsAutorecognitionPopupShowItem schemeStat$TypeClassifiedsAutorecognitionPopupShowItem, SchemeStat$TypeClassifiedsAutorecognitionBarShowItem schemeStat$TypeClassifiedsAutorecognitionBarShowItem, SchemeStat$TypeClassifiedsAutorecognitionBarRenderItem schemeStat$TypeClassifiedsAutorecognitionBarRenderItem, SchemeStat$TypeClassifiedsOpenCommunityViewItem schemeStat$TypeClassifiedsOpenCommunityViewItem, SchemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem, SchemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem schemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem, SchemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem schemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem, z8h0 z8h0Var, SchemeStat$TypeClassifiedsCreateItemCategoryView schemeStat$TypeClassifiedsCreateItemCategoryView, MobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem mobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem, int i, zcl zclVar) {
        this(type, classified, (i & 4) != 0 ? null : schemeStat$TypeClassifiedsProductViewItem, (i & 8) != 0 ? null : schemeStat$TypeClassifiedsCategoryViewItem, (i & 16) != 0 ? null : schemeStat$TypeClassifiedsBlockCarouselViewItem, (i & 32) != 0 ? null : schemeStat$TypeClassifiedsOpenVkoItem, (i & 64) != 0 ? null : schemeStat$TypeClassifiedsPostViewItem, (i & 128) != 0 ? null : schemeStat$TypeClassifiedsOnboardingBlockView, (i & 256) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionPopupShowItem, (i & 512) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionBarShowItem, (i & 1024) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionBarRenderItem, (i & 2048) != 0 ? null : schemeStat$TypeClassifiedsOpenCommunityViewItem, (i & 4096) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionSnippetAttachedItem, (i & 8192) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionRevertBarRenderItem, (i & 16384) != 0 ? null : schemeStat$TypeClassifiedsAutorecognitionRevertBarShowItem, (32768 & i) != 0 ? null : z8h0Var, (65536 & i) != 0 ? null : schemeStat$TypeClassifiedsCreateItemCategoryView, (i & 131072) != 0 ? null : mobileOfficialAppsClassifiedsStat$TypeClassifiedsViewCollectionItem);
    }
}
