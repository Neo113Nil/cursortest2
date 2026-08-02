package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.x8h0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$NavigationScreenInfoItem {

    @pmi0("type")
    private final Type type;

    @pmi0("type_audio_domain_event_item")
    private final CommonAudioStat$TypeAudioDomainEventItem typeAudioDomainEventItem;

    @pmi0("type_autotest_item")
    private final SchemeStat$TypeAutotestItem typeAutotestItem;

    @pmi0("type_away_item")
    private final SchemeStat$TypeAwayItem typeAwayItem;

    @pmi0("type_background_item")
    private final SchemeStat$TypeBackgroundItem typeBackgroundItem;

    @pmi0("type_badges_screen_item")
    private final CommonVasStat$TypeBadgesScreenItem typeBadgesScreenItem;

    @pmi0("type_clip_grid_item")
    private final SchemeStat$TypeClipGridItem typeClipGridItem;

    @pmi0("type_clip_viewer_item")
    private final SchemeStat$TypeClipViewerItem typeClipViewerItem;

    @pmi0("type_dialog_item")
    private final SchemeStat$TypeDialogItem typeDialogItem;

    @pmi0("type_donut_description_nav_item")
    private final s0 typeDonutDescriptionNavItem;

    @pmi0("type_game_catalog_item")
    private final SchemeStat$TypeGameCatalogItem typeGameCatalogItem;

    @pmi0("type_market_item")
    private final SchemeStat$TypeMarketItem typeMarketItem;

    @pmi0("type_market_marketplace_item")
    private final SchemeStat$TypeMarketMarketplaceItem typeMarketMarketplaceItem;

    @pmi0("type_market_screen_item")
    private final SchemeStat$TypeMarketScreenItem typeMarketScreenItem;

    @pmi0("type_market_service")
    private final SchemeStat$TypeMarketService typeMarketService;

    @pmi0("type_marusia_conversation_item")
    private final MobileOfficialAppsMarusiaStat$TypeConversationItem typeMarusiaConversationItem;

    @pmi0("type_mini_app_catalog_item")
    private final SchemeStat$TypeMiniAppCatalogItem typeMiniAppCatalogItem;

    @pmi0("type_mini_app_item")
    private final SchemeStat$TypeMiniAppItem typeMiniAppItem;

    @pmi0("type_post_draft_item")
    private final SchemeStat$TypePostDraftItem typePostDraftItem;

    @pmi0("type_search_context_item")
    private final SchemeStat$TypeSearchContextItem typeSearchContextItem;

    @pmi0("type_share_item")
    private final SchemeStat$TypeShareItem typeShareItem;

    @pmi0("type_superapp_birthday_present_item")
    private final SchemeStat$TypeSuperappBirthdayPresentItem typeSuperappBirthdayPresentItem;

    @pmi0("type_superapp_burger_menu_item")
    private final MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem typeSuperappBurgerMenuItem;

    @pmi0("type_superapp_screen_item")
    private final SchemeStat$TypeSuperappScreenItem typeSuperappScreenItem;

    @pmi0("type_tabbar_item")
    private final MobileOfficialAppsTabbarStat$TypeTabbarItem typeTabbarItem;

    @pmi0("type_ugc_stickers_item")
    private final CommonVasStat$TypeUgcStickersItem typeUgcStickersItem;

    @pmi0("type_video_viewer_item")
    private final MobileOfficialAppsVideoStat$TypeVideoViewerItem typeVideoViewerItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_audio_domain_event_item")
        public static final Type TYPE_AUDIO_DOMAIN_EVENT_ITEM;

        @pmi0("type_autotest_item")
        public static final Type TYPE_AUTOTEST_ITEM;

        @pmi0("type_away_item")
        public static final Type TYPE_AWAY_ITEM;

        @pmi0("type_background_item")
        public static final Type TYPE_BACKGROUND_ITEM;

        @pmi0("type_badges_screen_item")
        public static final Type TYPE_BADGES_SCREEN_ITEM;

        @pmi0("type_clip_grid_item")
        public static final Type TYPE_CLIP_GRID_ITEM;

        @pmi0("type_clip_viewer_item")
        public static final Type TYPE_CLIP_VIEWER_ITEM;

        @pmi0("type_dialog_item")
        public static final Type TYPE_DIALOG_ITEM;

        @pmi0("type_donut_description_nav_item")
        public static final Type TYPE_DONUT_DESCRIPTION_NAV_ITEM;

        @pmi0("type_game_catalog_item")
        public static final Type TYPE_GAME_CATALOG_ITEM;

        @pmi0("type_market_item")
        public static final Type TYPE_MARKET_ITEM;

        @pmi0("type_market_marketplace_item")
        public static final Type TYPE_MARKET_MARKETPLACE_ITEM;

        @pmi0("type_market_screen_item")
        public static final Type TYPE_MARKET_SCREEN_ITEM;

        @pmi0("type_market_service")
        public static final Type TYPE_MARKET_SERVICE;

        @pmi0("type_marusia_conversation_item")
        public static final Type TYPE_MARUSIA_CONVERSATION_ITEM;

        @pmi0("type_mini_app_catalog_item")
        public static final Type TYPE_MINI_APP_CATALOG_ITEM;

        @pmi0("type_mini_app_item")
        public static final Type TYPE_MINI_APP_ITEM;

        @pmi0("type_post_draft_item")
        public static final Type TYPE_POST_DRAFT_ITEM;

        @pmi0("type_search_context_item")
        public static final Type TYPE_SEARCH_CONTEXT_ITEM;

        @pmi0("type_share_item")
        public static final Type TYPE_SHARE_ITEM;

        @pmi0("type_superapp_birthday_present_item")
        public static final Type TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM;

        @pmi0("type_superapp_burger_menu_item")
        public static final Type TYPE_SUPERAPP_BURGER_MENU_ITEM;

        @pmi0("type_superapp_screen_item")
        public static final Type TYPE_SUPERAPP_SCREEN_ITEM;

        @pmi0("type_tabbar_item")
        public static final Type TYPE_TABBAR_ITEM;

        @pmi0("type_ugc_stickers_item")
        public static final Type TYPE_UGC_STICKERS_ITEM;

        @pmi0("type_video_viewer_item")
        public static final Type TYPE_VIDEO_VIEWER_ITEM;

        static {
            Type type = new Type("TYPE_AUDIO_DOMAIN_EVENT_ITEM", 0);
            TYPE_AUDIO_DOMAIN_EVENT_ITEM = type;
            Type type2 = new Type("TYPE_DONUT_DESCRIPTION_NAV_ITEM", 1);
            TYPE_DONUT_DESCRIPTION_NAV_ITEM = type2;
            Type type3 = new Type("TYPE_SUPERAPP_SCREEN_ITEM", 2);
            TYPE_SUPERAPP_SCREEN_ITEM = type3;
            Type type4 = new Type("TYPE_DIALOG_ITEM", 3);
            TYPE_DIALOG_ITEM = type4;
            Type type5 = new Type("TYPE_BACKGROUND_ITEM", 4);
            TYPE_BACKGROUND_ITEM = type5;
            Type type6 = new Type("TYPE_AWAY_ITEM", 5);
            TYPE_AWAY_ITEM = type6;
            Type type7 = new Type("TYPE_MARKET_SCREEN_ITEM", 6);
            TYPE_MARKET_SCREEN_ITEM = type7;
            Type type8 = new Type("TYPE_POST_DRAFT_ITEM", 7);
            TYPE_POST_DRAFT_ITEM = type8;
            Type type9 = new Type("TYPE_CLIP_VIEWER_ITEM", 8);
            TYPE_CLIP_VIEWER_ITEM = type9;
            Type type10 = new Type("TYPE_CLIP_GRID_ITEM", 9);
            TYPE_CLIP_GRID_ITEM = type10;
            Type type11 = new Type("TYPE_MARKET_ITEM", 10);
            TYPE_MARKET_ITEM = type11;
            Type type12 = new Type("TYPE_MARKET_MARKETPLACE_ITEM", 11);
            TYPE_MARKET_MARKETPLACE_ITEM = type12;
            Type type13 = new Type("TYPE_MARKET_SERVICE", 12);
            TYPE_MARKET_SERVICE = type13;
            Type type14 = new Type("TYPE_MINI_APP_ITEM", 13);
            TYPE_MINI_APP_ITEM = type14;
            Type type15 = new Type("TYPE_SHARE_ITEM", 14);
            TYPE_SHARE_ITEM = type15;
            Type type16 = new Type("TYPE_MARUSIA_CONVERSATION_ITEM", 15);
            TYPE_MARUSIA_CONVERSATION_ITEM = type16;
            Type type17 = new Type("TYPE_AUTOTEST_ITEM", 16);
            TYPE_AUTOTEST_ITEM = type17;
            Type type18 = new Type("TYPE_SEARCH_CONTEXT_ITEM", 17);
            TYPE_SEARCH_CONTEXT_ITEM = type18;
            Type type19 = new Type("TYPE_MINI_APP_CATALOG_ITEM", 18);
            TYPE_MINI_APP_CATALOG_ITEM = type19;
            Type type20 = new Type("TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM", 19);
            TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM = type20;
            Type type21 = new Type("TYPE_GAME_CATALOG_ITEM", 20);
            TYPE_GAME_CATALOG_ITEM = type21;
            Type type22 = new Type("TYPE_SUPERAPP_BURGER_MENU_ITEM", 21);
            TYPE_SUPERAPP_BURGER_MENU_ITEM = type22;
            Type type23 = new Type("TYPE_BADGES_SCREEN_ITEM", 22);
            TYPE_BADGES_SCREEN_ITEM = type23;
            Type type24 = new Type("TYPE_UGC_STICKERS_ITEM", 23);
            TYPE_UGC_STICKERS_ITEM = type24;
            Type type25 = new Type("TYPE_VIDEO_VIEWER_ITEM", 24);
            TYPE_VIDEO_VIEWER_ITEM = type25;
            Type type26 = new Type("TYPE_TABBAR_ITEM", 25);
            TYPE_TABBAR_ITEM = type26;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26};
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

    /* compiled from: SchemeStat.kt */
    public static final class a {
        public static SchemeStat$NavigationScreenInfoItem a(b bVar) {
            if (bVar instanceof CommonAudioStat$TypeAudioDomainEventItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_AUDIO_DOMAIN_EVENT_ITEM, (CommonAudioStat$TypeAudioDomainEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217724, null);
            }
            if (bVar instanceof s0) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_DONUT_DESCRIPTION_NAV_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (s0) bVar, null, null, null, null, null, null, null, 133693438, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappScreenItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_SUPERAPP_SCREEN_ITEM, null, (SchemeStat$TypeSuperappScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217722, null);
            }
            if (bVar instanceof SchemeStat$TypeDialogItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_DIALOG_ITEM, null, null, (SchemeStat$TypeDialogItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217718, null);
            }
            if (bVar instanceof SchemeStat$TypeBackgroundItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_BACKGROUND_ITEM, null, null, null, (SchemeStat$TypeBackgroundItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217710, null);
            }
            if (bVar instanceof SchemeStat$TypeAwayItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_AWAY_ITEM, null, null, null, null, (SchemeStat$TypeAwayItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217694, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketScreenItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_MARKET_SCREEN_ITEM, null, null, null, null, null, (SchemeStat$TypeMarketScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217662, null);
            }
            if (bVar instanceof SchemeStat$TypePostDraftItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_POST_DRAFT_ITEM, null, null, null, null, null, null, (SchemeStat$TypePostDraftItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217598, null);
            }
            if (bVar instanceof SchemeStat$TypeClipViewerItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_CLIP_VIEWER_ITEM, null, null, null, null, null, null, null, (SchemeStat$TypeClipViewerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217470, null);
            }
            if (bVar instanceof SchemeStat$TypeClipGridItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_CLIP_GRID_ITEM, null, null, null, null, null, null, null, null, (SchemeStat$TypeClipGridItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217214, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_MARKET_ITEM, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134216702, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketMarketplaceItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_MARKET_MARKETPLACE_ITEM, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketMarketplaceItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134215678, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketService) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_MARKET_SERVICE, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketService) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134213630, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_MINI_APP_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, 134209534, null);
            }
            if (bVar instanceof SchemeStat$TypeShareItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_SHARE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeShareItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, 134201342, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeConversationItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_MARUSIA_CONVERSATION_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeConversationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, 134184958, null);
            }
            if (bVar instanceof SchemeStat$TypeAutotestItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_AUTOTEST_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeAutotestItem) bVar, null, null, null, null, null, null, null, null, null, null, 134152190, null);
            }
            if (bVar instanceof SchemeStat$TypeSearchContextItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_SEARCH_CONTEXT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSearchContextItem) bVar, null, null, null, null, null, null, null, null, null, 134086654, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppCatalogItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_MINI_APP_CATALOG_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppCatalogItem) bVar, null, null, null, null, null, null, null, null, 133955582, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappBirthdayPresentItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappBirthdayPresentItem) bVar, null, null, null, null, null, null, 133169150, null);
            }
            if (bVar instanceof SchemeStat$TypeGameCatalogItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_GAME_CATALOG_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeGameCatalogItem) bVar, null, null, null, null, null, 132120574, null);
            }
            if (bVar instanceof MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_SUPERAPP_BURGER_MENU_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem) bVar, null, null, null, null, 130023422, null);
            }
            if (bVar instanceof CommonVasStat$TypeBadgesScreenItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_BADGES_SCREEN_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVasStat$TypeBadgesScreenItem) bVar, null, null, null, 125829118, null);
            }
            if (bVar instanceof CommonVasStat$TypeUgcStickersItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_UGC_STICKERS_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVasStat$TypeUgcStickersItem) bVar, null, null, 117440510, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoViewerItem) {
                return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_VIDEO_VIEWER_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoViewerItem) bVar, null, 100663294, null);
            }
            if (!(bVar instanceof MobileOfficialAppsTabbarStat$TypeTabbarItem)) {
                throw new IllegalArgumentException("payload must be one of(TypeAudioDomainEventItem, TypeDonutDescriptionNavItem, TypeSuperappScreenItem, TypeDialogItem, TypeBackgroundItem, TypeAwayItem, TypeMarketScreenItem, TypePostDraftItem, TypeClipViewerItem, TypeClipGridItem, TypeMarketItem, TypeMarketMarketplaceItem, TypeMarketService, TypeMiniAppItem, TypeShareItem, TypeConversationItem, TypeAutotestItem, TypeSearchContextItem, TypeMiniAppCatalogItem, TypeSuperappBirthdayPresentItem, TypeGameCatalogItem, TypeSuperappBurgerMenuItem, TypeBadgesScreenItem, TypeUgcStickersItem, TypeVideoViewerItem, TypeTabbarItem)");
            }
            return new SchemeStat$NavigationScreenInfoItem(Type.TYPE_TABBAR_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsTabbarStat$TypeTabbarItem) bVar, 67108862, null);
        }
    }

    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public interface b extends x8h0 {
    }

    private SchemeStat$NavigationScreenInfoItem(Type type, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, SchemeStat$TypeDialogItem schemeStat$TypeDialogItem, SchemeStat$TypeBackgroundItem schemeStat$TypeBackgroundItem, SchemeStat$TypeAwayItem schemeStat$TypeAwayItem, SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem, SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, SchemeStat$TypeMarketService schemeStat$TypeMarketService, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, SchemeStat$TypeShareItem schemeStat$TypeShareItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, SchemeStat$TypeAutotestItem schemeStat$TypeAutotestItem, SchemeStat$TypeSearchContextItem schemeStat$TypeSearchContextItem, SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem, s0 s0Var, SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem, MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem, CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem, CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem, MobileOfficialAppsVideoStat$TypeVideoViewerItem mobileOfficialAppsVideoStat$TypeVideoViewerItem, MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem) {
        this.type = type;
        this.typeAudioDomainEventItem = commonAudioStat$TypeAudioDomainEventItem;
        this.typeSuperappScreenItem = schemeStat$TypeSuperappScreenItem;
        this.typeDialogItem = schemeStat$TypeDialogItem;
        this.typeBackgroundItem = schemeStat$TypeBackgroundItem;
        this.typeAwayItem = schemeStat$TypeAwayItem;
        this.typeMarketScreenItem = schemeStat$TypeMarketScreenItem;
        this.typePostDraftItem = schemeStat$TypePostDraftItem;
        this.typeClipViewerItem = schemeStat$TypeClipViewerItem;
        this.typeClipGridItem = schemeStat$TypeClipGridItem;
        this.typeMarketItem = schemeStat$TypeMarketItem;
        this.typeMarketMarketplaceItem = schemeStat$TypeMarketMarketplaceItem;
        this.typeMarketService = schemeStat$TypeMarketService;
        this.typeMiniAppItem = schemeStat$TypeMiniAppItem;
        this.typeShareItem = schemeStat$TypeShareItem;
        this.typeMarusiaConversationItem = mobileOfficialAppsMarusiaStat$TypeConversationItem;
        this.typeAutotestItem = schemeStat$TypeAutotestItem;
        this.typeSearchContextItem = schemeStat$TypeSearchContextItem;
        this.typeMiniAppCatalogItem = schemeStat$TypeMiniAppCatalogItem;
        this.typeDonutDescriptionNavItem = s0Var;
        this.typeSuperappBirthdayPresentItem = schemeStat$TypeSuperappBirthdayPresentItem;
        this.typeGameCatalogItem = schemeStat$TypeGameCatalogItem;
        this.typeSuperappBurgerMenuItem = mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem;
        this.typeBadgesScreenItem = commonVasStat$TypeBadgesScreenItem;
        this.typeUgcStickersItem = commonVasStat$TypeUgcStickersItem;
        this.typeVideoViewerItem = mobileOfficialAppsVideoStat$TypeVideoViewerItem;
        this.typeTabbarItem = mobileOfficialAppsTabbarStat$TypeTabbarItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$NavigationScreenInfoItem)) {
            return false;
        }
        SchemeStat$NavigationScreenInfoItem schemeStat$NavigationScreenInfoItem = (SchemeStat$NavigationScreenInfoItem) obj;
        return this.type == schemeStat$NavigationScreenInfoItem.type && epx.f(this.typeAudioDomainEventItem, schemeStat$NavigationScreenInfoItem.typeAudioDomainEventItem) && epx.f(this.typeSuperappScreenItem, schemeStat$NavigationScreenInfoItem.typeSuperappScreenItem) && epx.f(this.typeDialogItem, schemeStat$NavigationScreenInfoItem.typeDialogItem) && epx.f(this.typeBackgroundItem, schemeStat$NavigationScreenInfoItem.typeBackgroundItem) && epx.f(this.typeAwayItem, schemeStat$NavigationScreenInfoItem.typeAwayItem) && epx.f(this.typeMarketScreenItem, schemeStat$NavigationScreenInfoItem.typeMarketScreenItem) && epx.f(this.typePostDraftItem, schemeStat$NavigationScreenInfoItem.typePostDraftItem) && epx.f(this.typeClipViewerItem, schemeStat$NavigationScreenInfoItem.typeClipViewerItem) && epx.f(this.typeClipGridItem, schemeStat$NavigationScreenInfoItem.typeClipGridItem) && epx.f(this.typeMarketItem, schemeStat$NavigationScreenInfoItem.typeMarketItem) && epx.f(this.typeMarketMarketplaceItem, schemeStat$NavigationScreenInfoItem.typeMarketMarketplaceItem) && epx.f(this.typeMarketService, schemeStat$NavigationScreenInfoItem.typeMarketService) && epx.f(this.typeMiniAppItem, schemeStat$NavigationScreenInfoItem.typeMiniAppItem) && epx.f(this.typeShareItem, schemeStat$NavigationScreenInfoItem.typeShareItem) && epx.f(this.typeMarusiaConversationItem, schemeStat$NavigationScreenInfoItem.typeMarusiaConversationItem) && epx.f(this.typeAutotestItem, schemeStat$NavigationScreenInfoItem.typeAutotestItem) && epx.f(this.typeSearchContextItem, schemeStat$NavigationScreenInfoItem.typeSearchContextItem) && epx.f(this.typeMiniAppCatalogItem, schemeStat$NavigationScreenInfoItem.typeMiniAppCatalogItem) && epx.f(this.typeDonutDescriptionNavItem, schemeStat$NavigationScreenInfoItem.typeDonutDescriptionNavItem) && epx.f(this.typeSuperappBirthdayPresentItem, schemeStat$NavigationScreenInfoItem.typeSuperappBirthdayPresentItem) && epx.f(this.typeGameCatalogItem, schemeStat$NavigationScreenInfoItem.typeGameCatalogItem) && epx.f(this.typeSuperappBurgerMenuItem, schemeStat$NavigationScreenInfoItem.typeSuperappBurgerMenuItem) && epx.f(this.typeBadgesScreenItem, schemeStat$NavigationScreenInfoItem.typeBadgesScreenItem) && epx.f(this.typeUgcStickersItem, schemeStat$NavigationScreenInfoItem.typeUgcStickersItem) && epx.f(this.typeVideoViewerItem, schemeStat$NavigationScreenInfoItem.typeVideoViewerItem) && epx.f(this.typeTabbarItem, schemeStat$NavigationScreenInfoItem.typeTabbarItem);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem = this.typeAudioDomainEventItem;
        int hashCode2 = (hashCode + (commonAudioStat$TypeAudioDomainEventItem == null ? 0 : commonAudioStat$TypeAudioDomainEventItem.hashCode())) * 31;
        SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = this.typeSuperappScreenItem;
        int hashCode3 = (hashCode2 + (schemeStat$TypeSuperappScreenItem == null ? 0 : schemeStat$TypeSuperappScreenItem.hashCode())) * 31;
        SchemeStat$TypeDialogItem schemeStat$TypeDialogItem = this.typeDialogItem;
        int hashCode4 = (hashCode3 + (schemeStat$TypeDialogItem == null ? 0 : schemeStat$TypeDialogItem.hashCode())) * 31;
        SchemeStat$TypeBackgroundItem schemeStat$TypeBackgroundItem = this.typeBackgroundItem;
        int hashCode5 = (hashCode4 + (schemeStat$TypeBackgroundItem == null ? 0 : schemeStat$TypeBackgroundItem.hashCode())) * 31;
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem = this.typeAwayItem;
        int hashCode6 = (hashCode5 + (schemeStat$TypeAwayItem == null ? 0 : schemeStat$TypeAwayItem.hashCode())) * 31;
        SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem = this.typeMarketScreenItem;
        int hashCode7 = (hashCode6 + (schemeStat$TypeMarketScreenItem == null ? 0 : schemeStat$TypeMarketScreenItem.hashCode())) * 31;
        SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem = this.typePostDraftItem;
        int hashCode8 = (hashCode7 + (schemeStat$TypePostDraftItem == null ? 0 : schemeStat$TypePostDraftItem.hashCode())) * 31;
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem = this.typeClipViewerItem;
        int hashCode9 = (hashCode8 + (schemeStat$TypeClipViewerItem == null ? 0 : schemeStat$TypeClipViewerItem.hashCode())) * 31;
        SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem = this.typeClipGridItem;
        int hashCode10 = (hashCode9 + (schemeStat$TypeClipGridItem == null ? 0 : schemeStat$TypeClipGridItem.hashCode())) * 31;
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = this.typeMarketItem;
        int hashCode11 = (hashCode10 + (schemeStat$TypeMarketItem == null ? 0 : schemeStat$TypeMarketItem.hashCode())) * 31;
        SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem = this.typeMarketMarketplaceItem;
        int hashCode12 = (hashCode11 + (schemeStat$TypeMarketMarketplaceItem == null ? 0 : schemeStat$TypeMarketMarketplaceItem.hashCode())) * 31;
        SchemeStat$TypeMarketService schemeStat$TypeMarketService = this.typeMarketService;
        int hashCode13 = (hashCode12 + (schemeStat$TypeMarketService == null ? 0 : schemeStat$TypeMarketService.hashCode())) * 31;
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.typeMiniAppItem;
        int hashCode14 = (hashCode13 + (schemeStat$TypeMiniAppItem == null ? 0 : schemeStat$TypeMiniAppItem.hashCode())) * 31;
        SchemeStat$TypeShareItem schemeStat$TypeShareItem = this.typeShareItem;
        int hashCode15 = (hashCode14 + (schemeStat$TypeShareItem == null ? 0 : schemeStat$TypeShareItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem = this.typeMarusiaConversationItem;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsMarusiaStat$TypeConversationItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeConversationItem.hashCode())) * 31;
        SchemeStat$TypeAutotestItem schemeStat$TypeAutotestItem = this.typeAutotestItem;
        int hashCode17 = (hashCode16 + (schemeStat$TypeAutotestItem == null ? 0 : schemeStat$TypeAutotestItem.hashCode())) * 31;
        SchemeStat$TypeSearchContextItem schemeStat$TypeSearchContextItem = this.typeSearchContextItem;
        int hashCode18 = (hashCode17 + (schemeStat$TypeSearchContextItem == null ? 0 : schemeStat$TypeSearchContextItem.hashCode())) * 31;
        SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem = this.typeMiniAppCatalogItem;
        int hashCode19 = (hashCode18 + (schemeStat$TypeMiniAppCatalogItem == null ? 0 : schemeStat$TypeMiniAppCatalogItem.hashCode())) * 31;
        s0 s0Var = this.typeDonutDescriptionNavItem;
        int hashCode20 = (hashCode19 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem = this.typeSuperappBirthdayPresentItem;
        int hashCode21 = (hashCode20 + (schemeStat$TypeSuperappBirthdayPresentItem == null ? 0 : schemeStat$TypeSuperappBirthdayPresentItem.hashCode())) * 31;
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem = this.typeGameCatalogItem;
        int hashCode22 = (hashCode21 + (schemeStat$TypeGameCatalogItem == null ? 0 : schemeStat$TypeGameCatalogItem.hashCode())) * 31;
        MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem = this.typeSuperappBurgerMenuItem;
        int hashCode23 = (hashCode22 + (mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem == null ? 0 : mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.hashCode())) * 31;
        CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem = this.typeBadgesScreenItem;
        int hashCode24 = (hashCode23 + (commonVasStat$TypeBadgesScreenItem == null ? 0 : commonVasStat$TypeBadgesScreenItem.hashCode())) * 31;
        CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem = this.typeUgcStickersItem;
        int hashCode25 = (hashCode24 + (commonVasStat$TypeUgcStickersItem == null ? 0 : commonVasStat$TypeUgcStickersItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoViewerItem mobileOfficialAppsVideoStat$TypeVideoViewerItem = this.typeVideoViewerItem;
        int hashCode26 = (hashCode25 + (mobileOfficialAppsVideoStat$TypeVideoViewerItem == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoViewerItem.hashCode())) * 31;
        MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem = this.typeTabbarItem;
        return hashCode26 + (mobileOfficialAppsTabbarStat$TypeTabbarItem != null ? mobileOfficialAppsTabbarStat$TypeTabbarItem.hashCode() : 0);
    }

    public final String toString() {
        return "NavigationScreenInfoItem(type=" + this.type + ", typeAudioDomainEventItem=" + this.typeAudioDomainEventItem + ", typeSuperappScreenItem=" + this.typeSuperappScreenItem + ", typeDialogItem=" + this.typeDialogItem + ", typeBackgroundItem=" + this.typeBackgroundItem + ", typeAwayItem=" + this.typeAwayItem + ", typeMarketScreenItem=" + this.typeMarketScreenItem + ", typePostDraftItem=" + this.typePostDraftItem + ", typeClipViewerItem=" + this.typeClipViewerItem + ", typeClipGridItem=" + this.typeClipGridItem + ", typeMarketItem=" + this.typeMarketItem + ", typeMarketMarketplaceItem=" + this.typeMarketMarketplaceItem + ", typeMarketService=" + this.typeMarketService + ", typeMiniAppItem=" + this.typeMiniAppItem + ", typeShareItem=" + this.typeShareItem + ", typeMarusiaConversationItem=" + this.typeMarusiaConversationItem + ", typeAutotestItem=" + this.typeAutotestItem + ", typeSearchContextItem=" + this.typeSearchContextItem + ", typeMiniAppCatalogItem=" + this.typeMiniAppCatalogItem + ", typeDonutDescriptionNavItem=" + this.typeDonutDescriptionNavItem + ", typeSuperappBirthdayPresentItem=" + this.typeSuperappBirthdayPresentItem + ", typeGameCatalogItem=" + this.typeGameCatalogItem + ", typeSuperappBurgerMenuItem=" + this.typeSuperappBurgerMenuItem + ", typeBadgesScreenItem=" + this.typeBadgesScreenItem + ", typeUgcStickersItem=" + this.typeUgcStickersItem + ", typeVideoViewerItem=" + this.typeVideoViewerItem + ", typeTabbarItem=" + this.typeTabbarItem + ')';
    }

    public /* synthetic */ SchemeStat$NavigationScreenInfoItem(Type type, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, SchemeStat$TypeDialogItem schemeStat$TypeDialogItem, SchemeStat$TypeBackgroundItem schemeStat$TypeBackgroundItem, SchemeStat$TypeAwayItem schemeStat$TypeAwayItem, SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem, SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, SchemeStat$TypeMarketService schemeStat$TypeMarketService, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, SchemeStat$TypeShareItem schemeStat$TypeShareItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, SchemeStat$TypeAutotestItem schemeStat$TypeAutotestItem, SchemeStat$TypeSearchContextItem schemeStat$TypeSearchContextItem, SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem, s0 s0Var, SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem, MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem, CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem, CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem, MobileOfficialAppsVideoStat$TypeVideoViewerItem mobileOfficialAppsVideoStat$TypeVideoViewerItem, MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : commonAudioStat$TypeAudioDomainEventItem, (i & 4) != 0 ? null : schemeStat$TypeSuperappScreenItem, (i & 8) != 0 ? null : schemeStat$TypeDialogItem, (i & 16) != 0 ? null : schemeStat$TypeBackgroundItem, (i & 32) != 0 ? null : schemeStat$TypeAwayItem, (i & 64) != 0 ? null : schemeStat$TypeMarketScreenItem, (i & 128) != 0 ? null : schemeStat$TypePostDraftItem, (i & 256) != 0 ? null : schemeStat$TypeClipViewerItem, (i & 512) != 0 ? null : schemeStat$TypeClipGridItem, (i & 1024) != 0 ? null : schemeStat$TypeMarketItem, (i & 2048) != 0 ? null : schemeStat$TypeMarketMarketplaceItem, (i & 4096) != 0 ? null : schemeStat$TypeMarketService, (i & 8192) != 0 ? null : schemeStat$TypeMiniAppItem, (i & 16384) != 0 ? null : schemeStat$TypeShareItem, (i & 32768) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeConversationItem, (i & 65536) != 0 ? null : schemeStat$TypeAutotestItem, (i & 131072) != 0 ? null : schemeStat$TypeSearchContextItem, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : schemeStat$TypeMiniAppCatalogItem, (i & 524288) != 0 ? null : s0Var, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : schemeStat$TypeSuperappBirthdayPresentItem, (i & 2097152) != 0 ? null : schemeStat$TypeGameCatalogItem, (i & 4194304) != 0 ? null : mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem, (i & 8388608) != 0 ? null : commonVasStat$TypeBadgesScreenItem, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonVasStat$TypeUgcStickersItem, (i & 33554432) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoViewerItem, (i & 67108864) != 0 ? null : mobileOfficialAppsTabbarStat$TypeTabbarItem);
    }
}
