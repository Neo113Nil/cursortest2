package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventProductMain;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.x8h0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeNavgo implements SchemeStat$EventProductMain.b {

    @pmi0("cause")
    private final Cause cause;

    @pmi0("destination_item")
    private final SchemeStat$EventItem destinationItem;

    @pmi0("destination_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen destinationScreen;

    @pmi0("destination_screens_info")
    private final List<SchemeStat$NavigationScreenInfoItem> destinationScreensInfo;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final SchemeStat$EventItem item;

    @pmi0("prev_nav_timestamp")
    private final String prevNavTimestamp;

    @pmi0("source_screens_info")
    private final List<SchemeStat$NavigationScreenInfoItem> sourceScreensInfo;

    @pmi0("subtype")
    private final Subtype subtype;

    @pmi0("type")
    private final Type type;

    @pmi0("type_audio_artist_ui_navigation_item")
    private final CommonAudioStat$TypeAudioArtistUiNavigationItem typeAudioArtistUiNavigationItem;

    @pmi0("type_audio_ui_navigation_item")
    private final CommonAudioStat$TypeAudioUiNavigationItem typeAudioUiNavigationItem;

    @pmi0("type_away_item")
    private final SchemeStat$TypeAwayItem typeAwayItem;

    @pmi0("type_clip_grid_item")
    private final SchemeStat$TypeClipGridItem typeClipGridItem;

    @pmi0("type_clip_viewer_item")
    private final SchemeStat$TypeClipViewerItem typeClipViewerItem;

    @pmi0("type_communities_ozon_invite_banner_adb_navgo")
    private final CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo typeCommunitiesOzonInviteBannerAdbNavgo;

    @pmi0("type_dialog_item")
    private final SchemeStat$TypeDialogItem typeDialogItem;

    @pmi0("type_donut_description_nav_item")
    private final s0 typeDonutDescriptionNavItem;

    @pmi0("type_donut_navgo_item")
    private final CommonCommunitiesStat$TypeDonutNavgo typeDonutNavgoItem;

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

    @pmi0("type_mini_app_catalog_item")
    private final SchemeStat$TypeMiniAppCatalogItem typeMiniAppCatalogItem;

    @pmi0("type_mini_app_item")
    private final SchemeStat$TypeMiniAppItem typeMiniAppItem;

    @pmi0("type_post_draft_item")
    private final SchemeStat$TypePostDraftItem typePostDraftItem;

    @pmi0("type_share_item")
    private final SchemeStat$TypeShareItem typeShareItem;

    @pmi0("type_superapp_birthday_present_item")
    private final SchemeStat$TypeSuperappBirthdayPresentItem typeSuperappBirthdayPresentItem;

    @pmi0("type_superapp_burger_menu_item")
    private final MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem typeSuperappBurgerMenuItem;

    @pmi0("type_superapp_screen_item")
    private final SchemeStat$TypeSuperappScreenItem typeSuperappScreenItem;

    @pmi0("type_video_viewer_item")
    private final MobileOfficialAppsVideoStat$TypeVideoViewerItem typeVideoViewerItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Cause {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Cause[] $VALUES;

        @pmi0("suggestion_gifts")
        public static final Cause SUGGESTION_GIFTS;

        @pmi0("tab_bar")
        public static final Cause TAB_BAR;

        static {
            Cause cause = new Cause("TAB_BAR", 0);
            TAB_BAR = cause;
            Cause cause2 = new Cause("SUGGESTION_GIFTS", 1);
            SUGGESTION_GIFTS = cause2;
            Cause[] causeArr = {cause, cause2};
            $VALUES = causeArr;
            $ENTRIES = new asp(causeArr);
        }

        private Cause(String str, int i) {
        }

        public static Cause valueOf(String str) {
            return (Cause) Enum.valueOf(Cause.class, str);
        }

        public static Cause[] values() {
            return (Cause[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("app_close")
        public static final Subtype APP_CLOSE;

        @pmi0("app_start")
        public static final Subtype APP_START;

        @pmi0("away")
        public static final Subtype AWAY;

        @pmi0("back")
        public static final Subtype BACK;

        @pmi0("go")
        public static final Subtype GO;

        @pmi0("hide")
        public static final Subtype HIDE;

        @pmi0("link")
        public static final Subtype LINK;

        @pmi0("push")
        public static final Subtype PUSH;

        @pmi0("show")
        public static final Subtype SHOW;

        @pmi0("system")
        public static final Subtype SYSTEM;

        static {
            Subtype subtype = new Subtype("GO", 0);
            GO = subtype;
            Subtype subtype2 = new Subtype("APP_START", 1);
            APP_START = subtype2;
            Subtype subtype3 = new Subtype("APP_CLOSE", 2);
            APP_CLOSE = subtype3;
            Subtype subtype4 = new Subtype("SHOW", 3);
            SHOW = subtype4;
            Subtype subtype5 = new Subtype("HIDE", 4);
            HIDE = subtype5;
            Subtype subtype6 = new Subtype("AWAY", 5);
            AWAY = subtype6;
            Subtype subtype7 = new Subtype("BACK", 6);
            BACK = subtype7;
            Subtype subtype8 = new Subtype("SYSTEM", 7);
            SYSTEM = subtype8;
            Subtype subtype9 = new Subtype("PUSH", 8);
            PUSH = subtype9;
            Subtype subtype10 = new Subtype("LINK", 9);
            LINK = subtype10;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8, subtype9, subtype10};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_audio_artist_ui_navigation_item")
        public static final Type TYPE_AUDIO_ARTIST_UI_NAVIGATION_ITEM;

        @pmi0("type_audio_ui_navigation_item")
        public static final Type TYPE_AUDIO_UI_NAVIGATION_ITEM;

        @pmi0("type_away_item")
        public static final Type TYPE_AWAY_ITEM;

        @pmi0("type_clip_grid_item")
        public static final Type TYPE_CLIP_GRID_ITEM;

        @pmi0("type_clip_viewer_item")
        public static final Type TYPE_CLIP_VIEWER_ITEM;

        @pmi0("type_communities_ozon_invite_banner_adb_navgo")
        public static final Type TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_NAVGO;

        @pmi0("type_dialog_item")
        public static final Type TYPE_DIALOG_ITEM;

        @pmi0("type_donut_description_nav_item")
        public static final Type TYPE_DONUT_DESCRIPTION_NAV_ITEM;

        @pmi0("type_donut_navgo_item")
        public static final Type TYPE_DONUT_NAVGO_ITEM;

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

        @pmi0("type_mini_app_catalog_item")
        public static final Type TYPE_MINI_APP_CATALOG_ITEM;

        @pmi0("type_mini_app_item")
        public static final Type TYPE_MINI_APP_ITEM;

        @pmi0("type_post_draft_item")
        public static final Type TYPE_POST_DRAFT_ITEM;

        @pmi0("type_share_item")
        public static final Type TYPE_SHARE_ITEM;

        @pmi0("type_superapp_birthday_present_item")
        public static final Type TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM;

        @pmi0("type_superapp_burger_menu_item")
        public static final Type TYPE_SUPERAPP_BURGER_MENU_ITEM;

        @pmi0("type_superapp_screen_item")
        public static final Type TYPE_SUPERAPP_SCREEN_ITEM;

        @pmi0("type_video_viewer_item")
        public static final Type TYPE_VIDEO_VIEWER_ITEM;

        static {
            Type type = new Type("TYPE_DONUT_DESCRIPTION_NAV_ITEM", 0);
            TYPE_DONUT_DESCRIPTION_NAV_ITEM = type;
            Type type2 = new Type("TYPE_SUPERAPP_SCREEN_ITEM", 1);
            TYPE_SUPERAPP_SCREEN_ITEM = type2;
            Type type3 = new Type("TYPE_DIALOG_ITEM", 2);
            TYPE_DIALOG_ITEM = type3;
            Type type4 = new Type("TYPE_DONUT_NAVGO_ITEM", 3);
            TYPE_DONUT_NAVGO_ITEM = type4;
            Type type5 = new Type("TYPE_AWAY_ITEM", 4);
            TYPE_AWAY_ITEM = type5;
            Type type6 = new Type("TYPE_MARKET_SCREEN_ITEM", 5);
            TYPE_MARKET_SCREEN_ITEM = type6;
            Type type7 = new Type("TYPE_GAME_CATALOG_ITEM", 6);
            TYPE_GAME_CATALOG_ITEM = type7;
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
            Type type15 = new Type("TYPE_MINI_APP_CATALOG_ITEM", 14);
            TYPE_MINI_APP_CATALOG_ITEM = type15;
            Type type16 = new Type("TYPE_SHARE_ITEM", 15);
            TYPE_SHARE_ITEM = type16;
            Type type17 = new Type("TYPE_AUDIO_ARTIST_UI_NAVIGATION_ITEM", 16);
            TYPE_AUDIO_ARTIST_UI_NAVIGATION_ITEM = type17;
            Type type18 = new Type("TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM", 17);
            TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM = type18;
            Type type19 = new Type("TYPE_SUPERAPP_BURGER_MENU_ITEM", 18);
            TYPE_SUPERAPP_BURGER_MENU_ITEM = type19;
            Type type20 = new Type("TYPE_VIDEO_VIEWER_ITEM", 19);
            TYPE_VIDEO_VIEWER_ITEM = type20;
            Type type21 = new Type("TYPE_AUDIO_UI_NAVIGATION_ITEM", 20);
            TYPE_AUDIO_UI_NAVIGATION_ITEM = type21;
            Type type22 = new Type("TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_NAVGO", 21);
            TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_NAVGO = type22;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22};
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
        public static SchemeStat$TypeNavgo a(Subtype subtype, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str, Cause cause, SchemeStat$EventItem schemeStat$EventItem, List list, SchemeStat$EventItem schemeStat$EventItem2, List list2, b bVar) {
            if (bVar == null) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483136, null);
            }
            if (bVar instanceof s0) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_DONUT_DESCRIPTION_NAV_ITEM, (s0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147482624, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappScreenItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_SUPERAPP_SCREEN_ITEM, null, (SchemeStat$TypeSuperappScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147482112, null);
            }
            if (bVar instanceof SchemeStat$TypeDialogItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_DIALOG_ITEM, null, null, (SchemeStat$TypeDialogItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147481088, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutNavgo) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_DONUT_NAVGO_ITEM, null, null, null, null, (CommonCommunitiesStat$TypeDonutNavgo) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147474944, null);
            }
            if (bVar instanceof SchemeStat$TypeAwayItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_AWAY_ITEM, null, null, null, null, null, null, (SchemeStat$TypeAwayItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147450368, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketScreenItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_MARKET_SCREEN_ITEM, null, null, null, null, null, null, null, (SchemeStat$TypeMarketScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147417600, null);
            }
            if (bVar instanceof SchemeStat$TypeGameCatalogItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_GAME_CATALOG_ITEM, null, null, null, null, null, (SchemeStat$TypeGameCatalogItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147466752, null);
            }
            if (bVar instanceof SchemeStat$TypePostDraftItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_POST_DRAFT_ITEM, null, null, null, null, null, null, null, null, (SchemeStat$TypePostDraftItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147352064, null);
            }
            if (bVar instanceof SchemeStat$TypeClipViewerItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_CLIP_VIEWER_ITEM, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClipViewerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, 2147220992, null);
            }
            if (bVar instanceof SchemeStat$TypeClipGridItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_CLIP_GRID_ITEM, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClipGridItem) bVar, null, null, null, null, null, null, null, null, null, null, null, 2146958848, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_MARKET_ITEM, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketItem) bVar, null, null, null, null, null, null, null, null, null, null, 2146434560, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketMarketplaceItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_MARKET_MARKETPLACE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketMarketplaceItem) bVar, null, null, null, null, null, null, null, null, 2143288832, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketService) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_MARKET_SERVICE, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketService) bVar, null, null, null, null, null, null, null, null, null, 2145385984, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_MINI_APP_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppItem) bVar, null, null, null, null, null, null, null, 2139094528, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppCatalogItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_MINI_APP_CATALOG_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppCatalogItem) bVar, null, null, null, null, null, null, 2130705920, null);
            }
            if (bVar instanceof SchemeStat$TypeShareItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_SHARE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeShareItem) bVar, null, null, null, null, null, 2113928704, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioArtistUiNavigationItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_AUDIO_ARTIST_UI_NAVIGATION_ITEM, null, null, null, (CommonAudioStat$TypeAudioArtistUiNavigationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147479040, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappBirthdayPresentItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_SUPERAPP_BIRTHDAY_PRESENT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappBirthdayPresentItem) bVar, null, null, null, null, 2080374272, null);
            }
            if (bVar instanceof MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_SUPERAPP_BURGER_MENU_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem) bVar, null, null, null, 2013265408, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoViewerItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_VIDEO_VIEWER_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoViewerItem) bVar, null, null, 1879047680, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioUiNavigationItem) {
                return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_AUDIO_UI_NAVIGATION_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioUiNavigationItem) bVar, null, 1610612224, null);
            }
            if (!(bVar instanceof CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo)) {
                throw new IllegalArgumentException("payload must be one of(TypeDonutDescriptionNavItem, TypeSuperappScreenItem, TypeDialogItem, TypeDonutNavgo, TypeAwayItem, TypeMarketScreenItem, TypeGameCatalogItem, TypePostDraftItem, TypeClipViewerItem, TypeClipGridItem, TypeMarketItem, TypeMarketMarketplaceItem, TypeMarketService, TypeMiniAppItem, TypeMiniAppCatalogItem, TypeShareItem, TypeAudioArtistUiNavigationItem, TypeSuperappBirthdayPresentItem, TypeSuperappBurgerMenuItem, TypeVideoViewerItem, TypeAudioUiNavigationItem, TypeCommunitiesOzonInviteBannerAdbNavgo)");
            }
            return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, Type.TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_NAVGO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo) bVar, 1073741312, null);
        }
    }

    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public interface b extends x8h0 {
    }

    private SchemeStat$TypeNavgo(Subtype subtype, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str, Cause cause, SchemeStat$EventItem schemeStat$EventItem, List<SchemeStat$NavigationScreenInfoItem> list, SchemeStat$EventItem schemeStat$EventItem2, List<SchemeStat$NavigationScreenInfoItem> list2, Type type, s0 s0Var, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, SchemeStat$TypeDialogItem schemeStat$TypeDialogItem, CommonAudioStat$TypeAudioArtistUiNavigationItem commonAudioStat$TypeAudioArtistUiNavigationItem, CommonCommunitiesStat$TypeDonutNavgo commonCommunitiesStat$TypeDonutNavgo, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem, SchemeStat$TypeAwayItem schemeStat$TypeAwayItem, SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem, SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketService schemeStat$TypeMarketService, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem, SchemeStat$TypeShareItem schemeStat$TypeShareItem, SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem, MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem, MobileOfficialAppsVideoStat$TypeVideoViewerItem mobileOfficialAppsVideoStat$TypeVideoViewerItem, CommonAudioStat$TypeAudioUiNavigationItem commonAudioStat$TypeAudioUiNavigationItem, CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo) {
        this.subtype = subtype;
        this.destinationScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.prevNavTimestamp = str;
        this.cause = cause;
        this.item = schemeStat$EventItem;
        this.sourceScreensInfo = list;
        this.destinationItem = schemeStat$EventItem2;
        this.destinationScreensInfo = list2;
        this.type = type;
        this.typeDonutDescriptionNavItem = s0Var;
        this.typeSuperappScreenItem = schemeStat$TypeSuperappScreenItem;
        this.typeDialogItem = schemeStat$TypeDialogItem;
        this.typeAudioArtistUiNavigationItem = commonAudioStat$TypeAudioArtistUiNavigationItem;
        this.typeDonutNavgoItem = commonCommunitiesStat$TypeDonutNavgo;
        this.typeGameCatalogItem = schemeStat$TypeGameCatalogItem;
        this.typeAwayItem = schemeStat$TypeAwayItem;
        this.typeMarketScreenItem = schemeStat$TypeMarketScreenItem;
        this.typePostDraftItem = schemeStat$TypePostDraftItem;
        this.typeClipViewerItem = schemeStat$TypeClipViewerItem;
        this.typeClipGridItem = schemeStat$TypeClipGridItem;
        this.typeMarketItem = schemeStat$TypeMarketItem;
        this.typeMarketService = schemeStat$TypeMarketService;
        this.typeMarketMarketplaceItem = schemeStat$TypeMarketMarketplaceItem;
        this.typeMiniAppItem = schemeStat$TypeMiniAppItem;
        this.typeMiniAppCatalogItem = schemeStat$TypeMiniAppCatalogItem;
        this.typeShareItem = schemeStat$TypeShareItem;
        this.typeSuperappBirthdayPresentItem = schemeStat$TypeSuperappBirthdayPresentItem;
        this.typeSuperappBurgerMenuItem = mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem;
        this.typeVideoViewerItem = mobileOfficialAppsVideoStat$TypeVideoViewerItem;
        this.typeAudioUiNavigationItem = commonAudioStat$TypeAudioUiNavigationItem;
        this.typeCommunitiesOzonInviteBannerAdbNavgo = commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo;
    }

    public static SchemeStat$TypeNavgo a(SchemeStat$TypeNavgo schemeStat$TypeNavgo, String str) {
        Subtype subtype = schemeStat$TypeNavgo.subtype;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = schemeStat$TypeNavgo.destinationScreen;
        Cause cause = schemeStat$TypeNavgo.cause;
        SchemeStat$EventItem schemeStat$EventItem = schemeStat$TypeNavgo.item;
        List<SchemeStat$NavigationScreenInfoItem> list = schemeStat$TypeNavgo.sourceScreensInfo;
        SchemeStat$EventItem schemeStat$EventItem2 = schemeStat$TypeNavgo.destinationItem;
        List<SchemeStat$NavigationScreenInfoItem> list2 = schemeStat$TypeNavgo.destinationScreensInfo;
        Type type = schemeStat$TypeNavgo.type;
        s0 s0Var = schemeStat$TypeNavgo.typeDonutDescriptionNavItem;
        SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = schemeStat$TypeNavgo.typeSuperappScreenItem;
        SchemeStat$TypeDialogItem schemeStat$TypeDialogItem = schemeStat$TypeNavgo.typeDialogItem;
        CommonAudioStat$TypeAudioArtistUiNavigationItem commonAudioStat$TypeAudioArtistUiNavigationItem = schemeStat$TypeNavgo.typeAudioArtistUiNavigationItem;
        CommonCommunitiesStat$TypeDonutNavgo commonCommunitiesStat$TypeDonutNavgo = schemeStat$TypeNavgo.typeDonutNavgoItem;
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem = schemeStat$TypeNavgo.typeGameCatalogItem;
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem = schemeStat$TypeNavgo.typeAwayItem;
        SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem = schemeStat$TypeNavgo.typeMarketScreenItem;
        SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem = schemeStat$TypeNavgo.typePostDraftItem;
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem = schemeStat$TypeNavgo.typeClipViewerItem;
        SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem = schemeStat$TypeNavgo.typeClipGridItem;
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = schemeStat$TypeNavgo.typeMarketItem;
        SchemeStat$TypeMarketService schemeStat$TypeMarketService = schemeStat$TypeNavgo.typeMarketService;
        SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem = schemeStat$TypeNavgo.typeMarketMarketplaceItem;
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = schemeStat$TypeNavgo.typeMiniAppItem;
        SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem = schemeStat$TypeNavgo.typeMiniAppCatalogItem;
        SchemeStat$TypeShareItem schemeStat$TypeShareItem = schemeStat$TypeNavgo.typeShareItem;
        SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem = schemeStat$TypeNavgo.typeSuperappBirthdayPresentItem;
        MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem = schemeStat$TypeNavgo.typeSuperappBurgerMenuItem;
        MobileOfficialAppsVideoStat$TypeVideoViewerItem mobileOfficialAppsVideoStat$TypeVideoViewerItem = schemeStat$TypeNavgo.typeVideoViewerItem;
        CommonAudioStat$TypeAudioUiNavigationItem commonAudioStat$TypeAudioUiNavigationItem = schemeStat$TypeNavgo.typeAudioUiNavigationItem;
        CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo = schemeStat$TypeNavgo.typeCommunitiesOzonInviteBannerAdbNavgo;
        schemeStat$TypeNavgo.getClass();
        return new SchemeStat$TypeNavgo(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, list, schemeStat$EventItem2, list2, type, s0Var, schemeStat$TypeSuperappScreenItem, schemeStat$TypeDialogItem, commonAudioStat$TypeAudioArtistUiNavigationItem, commonCommunitiesStat$TypeDonutNavgo, schemeStat$TypeGameCatalogItem, schemeStat$TypeAwayItem, schemeStat$TypeMarketScreenItem, schemeStat$TypePostDraftItem, schemeStat$TypeClipViewerItem, schemeStat$TypeClipGridItem, schemeStat$TypeMarketItem, schemeStat$TypeMarketService, schemeStat$TypeMarketMarketplaceItem, schemeStat$TypeMiniAppItem, schemeStat$TypeMiniAppCatalogItem, schemeStat$TypeShareItem, schemeStat$TypeSuperappBirthdayPresentItem, mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem, mobileOfficialAppsVideoStat$TypeVideoViewerItem, commonAudioStat$TypeAudioUiNavigationItem, commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeNavgo)) {
            return false;
        }
        SchemeStat$TypeNavgo schemeStat$TypeNavgo = (SchemeStat$TypeNavgo) obj;
        return this.subtype == schemeStat$TypeNavgo.subtype && this.destinationScreen == schemeStat$TypeNavgo.destinationScreen && epx.f(this.prevNavTimestamp, schemeStat$TypeNavgo.prevNavTimestamp) && this.cause == schemeStat$TypeNavgo.cause && epx.f(this.item, schemeStat$TypeNavgo.item) && epx.f(this.sourceScreensInfo, schemeStat$TypeNavgo.sourceScreensInfo) && epx.f(this.destinationItem, schemeStat$TypeNavgo.destinationItem) && epx.f(this.destinationScreensInfo, schemeStat$TypeNavgo.destinationScreensInfo) && this.type == schemeStat$TypeNavgo.type && epx.f(this.typeDonutDescriptionNavItem, schemeStat$TypeNavgo.typeDonutDescriptionNavItem) && epx.f(this.typeSuperappScreenItem, schemeStat$TypeNavgo.typeSuperappScreenItem) && epx.f(this.typeDialogItem, schemeStat$TypeNavgo.typeDialogItem) && epx.f(this.typeAudioArtistUiNavigationItem, schemeStat$TypeNavgo.typeAudioArtistUiNavigationItem) && epx.f(this.typeDonutNavgoItem, schemeStat$TypeNavgo.typeDonutNavgoItem) && epx.f(this.typeGameCatalogItem, schemeStat$TypeNavgo.typeGameCatalogItem) && epx.f(this.typeAwayItem, schemeStat$TypeNavgo.typeAwayItem) && epx.f(this.typeMarketScreenItem, schemeStat$TypeNavgo.typeMarketScreenItem) && epx.f(this.typePostDraftItem, schemeStat$TypeNavgo.typePostDraftItem) && epx.f(this.typeClipViewerItem, schemeStat$TypeNavgo.typeClipViewerItem) && epx.f(this.typeClipGridItem, schemeStat$TypeNavgo.typeClipGridItem) && epx.f(this.typeMarketItem, schemeStat$TypeNavgo.typeMarketItem) && epx.f(this.typeMarketService, schemeStat$TypeNavgo.typeMarketService) && epx.f(this.typeMarketMarketplaceItem, schemeStat$TypeNavgo.typeMarketMarketplaceItem) && epx.f(this.typeMiniAppItem, schemeStat$TypeNavgo.typeMiniAppItem) && epx.f(this.typeMiniAppCatalogItem, schemeStat$TypeNavgo.typeMiniAppCatalogItem) && epx.f(this.typeShareItem, schemeStat$TypeNavgo.typeShareItem) && epx.f(this.typeSuperappBirthdayPresentItem, schemeStat$TypeNavgo.typeSuperappBirthdayPresentItem) && epx.f(this.typeSuperappBurgerMenuItem, schemeStat$TypeNavgo.typeSuperappBurgerMenuItem) && epx.f(this.typeVideoViewerItem, schemeStat$TypeNavgo.typeVideoViewerItem) && epx.f(this.typeAudioUiNavigationItem, schemeStat$TypeNavgo.typeAudioUiNavigationItem) && epx.f(this.typeCommunitiesOzonInviteBannerAdbNavgo, schemeStat$TypeNavgo.typeCommunitiesOzonInviteBannerAdbNavgo);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.destinationScreen.hashCode() + (this.subtype.hashCode() * 31)) * 31, 31, this.prevNavTimestamp);
        Cause cause = this.cause;
        int hashCode = (a2 + (cause == null ? 0 : cause.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.item;
        int hashCode2 = (hashCode + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode())) * 31;
        List<SchemeStat$NavigationScreenInfoItem> list = this.sourceScreensInfo;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem2 = this.destinationItem;
        int hashCode4 = (hashCode3 + (schemeStat$EventItem2 == null ? 0 : schemeStat$EventItem2.hashCode())) * 31;
        List<SchemeStat$NavigationScreenInfoItem> list2 = this.destinationScreensInfo;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Type type = this.type;
        int hashCode6 = (hashCode5 + (type == null ? 0 : type.hashCode())) * 31;
        s0 s0Var = this.typeDonutDescriptionNavItem;
        int hashCode7 = (hashCode6 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = this.typeSuperappScreenItem;
        int hashCode8 = (hashCode7 + (schemeStat$TypeSuperappScreenItem == null ? 0 : schemeStat$TypeSuperappScreenItem.hashCode())) * 31;
        SchemeStat$TypeDialogItem schemeStat$TypeDialogItem = this.typeDialogItem;
        int hashCode9 = (hashCode8 + (schemeStat$TypeDialogItem == null ? 0 : schemeStat$TypeDialogItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioArtistUiNavigationItem commonAudioStat$TypeAudioArtistUiNavigationItem = this.typeAudioArtistUiNavigationItem;
        int hashCode10 = (hashCode9 + (commonAudioStat$TypeAudioArtistUiNavigationItem == null ? 0 : commonAudioStat$TypeAudioArtistUiNavigationItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeDonutNavgo commonCommunitiesStat$TypeDonutNavgo = this.typeDonutNavgoItem;
        int hashCode11 = (hashCode10 + (commonCommunitiesStat$TypeDonutNavgo == null ? 0 : commonCommunitiesStat$TypeDonutNavgo.hashCode())) * 31;
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem = this.typeGameCatalogItem;
        int hashCode12 = (hashCode11 + (schemeStat$TypeGameCatalogItem == null ? 0 : schemeStat$TypeGameCatalogItem.hashCode())) * 31;
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem = this.typeAwayItem;
        int hashCode13 = (hashCode12 + (schemeStat$TypeAwayItem == null ? 0 : schemeStat$TypeAwayItem.hashCode())) * 31;
        SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem = this.typeMarketScreenItem;
        int hashCode14 = (hashCode13 + (schemeStat$TypeMarketScreenItem == null ? 0 : schemeStat$TypeMarketScreenItem.hashCode())) * 31;
        SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem = this.typePostDraftItem;
        int hashCode15 = (hashCode14 + (schemeStat$TypePostDraftItem == null ? 0 : schemeStat$TypePostDraftItem.hashCode())) * 31;
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem = this.typeClipViewerItem;
        int hashCode16 = (hashCode15 + (schemeStat$TypeClipViewerItem == null ? 0 : schemeStat$TypeClipViewerItem.hashCode())) * 31;
        SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem = this.typeClipGridItem;
        int hashCode17 = (hashCode16 + (schemeStat$TypeClipGridItem == null ? 0 : schemeStat$TypeClipGridItem.hashCode())) * 31;
        SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = this.typeMarketItem;
        int hashCode18 = (hashCode17 + (schemeStat$TypeMarketItem == null ? 0 : schemeStat$TypeMarketItem.hashCode())) * 31;
        SchemeStat$TypeMarketService schemeStat$TypeMarketService = this.typeMarketService;
        int hashCode19 = (hashCode18 + (schemeStat$TypeMarketService == null ? 0 : schemeStat$TypeMarketService.hashCode())) * 31;
        SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem = this.typeMarketMarketplaceItem;
        int hashCode20 = (hashCode19 + (schemeStat$TypeMarketMarketplaceItem == null ? 0 : schemeStat$TypeMarketMarketplaceItem.hashCode())) * 31;
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.typeMiniAppItem;
        int hashCode21 = (hashCode20 + (schemeStat$TypeMiniAppItem == null ? 0 : schemeStat$TypeMiniAppItem.hashCode())) * 31;
        SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem = this.typeMiniAppCatalogItem;
        int hashCode22 = (hashCode21 + (schemeStat$TypeMiniAppCatalogItem == null ? 0 : schemeStat$TypeMiniAppCatalogItem.hashCode())) * 31;
        SchemeStat$TypeShareItem schemeStat$TypeShareItem = this.typeShareItem;
        int hashCode23 = (hashCode22 + (schemeStat$TypeShareItem == null ? 0 : schemeStat$TypeShareItem.hashCode())) * 31;
        SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem = this.typeSuperappBirthdayPresentItem;
        int hashCode24 = (hashCode23 + (schemeStat$TypeSuperappBirthdayPresentItem == null ? 0 : schemeStat$TypeSuperappBirthdayPresentItem.hashCode())) * 31;
        MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem = this.typeSuperappBurgerMenuItem;
        int hashCode25 = (hashCode24 + (mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem == null ? 0 : mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeVideoViewerItem mobileOfficialAppsVideoStat$TypeVideoViewerItem = this.typeVideoViewerItem;
        int hashCode26 = (hashCode25 + (mobileOfficialAppsVideoStat$TypeVideoViewerItem == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoViewerItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioUiNavigationItem commonAudioStat$TypeAudioUiNavigationItem = this.typeAudioUiNavigationItem;
        int hashCode27 = (hashCode26 + (commonAudioStat$TypeAudioUiNavigationItem == null ? 0 : commonAudioStat$TypeAudioUiNavigationItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo = this.typeCommunitiesOzonInviteBannerAdbNavgo;
        return hashCode27 + (commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo != null ? commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo.hashCode() : 0);
    }

    public final String toString() {
        return "TypeNavgo(subtype=" + this.subtype + ", destinationScreen=" + this.destinationScreen + ", prevNavTimestamp=" + this.prevNavTimestamp + ", cause=" + this.cause + ", item=" + this.item + ", sourceScreensInfo=" + this.sourceScreensInfo + ", destinationItem=" + this.destinationItem + ", destinationScreensInfo=" + this.destinationScreensInfo + ", type=" + this.type + ", typeDonutDescriptionNavItem=" + this.typeDonutDescriptionNavItem + ", typeSuperappScreenItem=" + this.typeSuperappScreenItem + ", typeDialogItem=" + this.typeDialogItem + ", typeAudioArtistUiNavigationItem=" + this.typeAudioArtistUiNavigationItem + ", typeDonutNavgoItem=" + this.typeDonutNavgoItem + ", typeGameCatalogItem=" + this.typeGameCatalogItem + ", typeAwayItem=" + this.typeAwayItem + ", typeMarketScreenItem=" + this.typeMarketScreenItem + ", typePostDraftItem=" + this.typePostDraftItem + ", typeClipViewerItem=" + this.typeClipViewerItem + ", typeClipGridItem=" + this.typeClipGridItem + ", typeMarketItem=" + this.typeMarketItem + ", typeMarketService=" + this.typeMarketService + ", typeMarketMarketplaceItem=" + this.typeMarketMarketplaceItem + ", typeMiniAppItem=" + this.typeMiniAppItem + ", typeMiniAppCatalogItem=" + this.typeMiniAppCatalogItem + ", typeShareItem=" + this.typeShareItem + ", typeSuperappBirthdayPresentItem=" + this.typeSuperappBirthdayPresentItem + ", typeSuperappBurgerMenuItem=" + this.typeSuperappBurgerMenuItem + ", typeVideoViewerItem=" + this.typeVideoViewerItem + ", typeAudioUiNavigationItem=" + this.typeAudioUiNavigationItem + ", typeCommunitiesOzonInviteBannerAdbNavgo=" + this.typeCommunitiesOzonInviteBannerAdbNavgo + ')';
    }

    public /* synthetic */ SchemeStat$TypeNavgo(Subtype subtype, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str, Cause cause, SchemeStat$EventItem schemeStat$EventItem, List list, SchemeStat$EventItem schemeStat$EventItem2, List list2, Type type, s0 s0Var, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, SchemeStat$TypeDialogItem schemeStat$TypeDialogItem, CommonAudioStat$TypeAudioArtistUiNavigationItem commonAudioStat$TypeAudioArtistUiNavigationItem, CommonCommunitiesStat$TypeDonutNavgo commonCommunitiesStat$TypeDonutNavgo, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem, SchemeStat$TypeAwayItem schemeStat$TypeAwayItem, SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem, SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketService schemeStat$TypeMarketService, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem, SchemeStat$TypeShareItem schemeStat$TypeShareItem, SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem, MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem, MobileOfficialAppsVideoStat$TypeVideoViewerItem mobileOfficialAppsVideoStat$TypeVideoViewerItem, CommonAudioStat$TypeAudioUiNavigationItem commonAudioStat$TypeAudioUiNavigationItem, CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo, int i, zcl zclVar) {
        this(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, (i & 8) != 0 ? null : cause, (i & 16) != 0 ? null : schemeStat$EventItem, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : schemeStat$EventItem2, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : type, (i & 512) != 0 ? null : s0Var, (i & 1024) != 0 ? null : schemeStat$TypeSuperappScreenItem, (i & 2048) != 0 ? null : schemeStat$TypeDialogItem, (i & 4096) != 0 ? null : commonAudioStat$TypeAudioArtistUiNavigationItem, (i & 8192) != 0 ? null : commonCommunitiesStat$TypeDonutNavgo, (i & 16384) != 0 ? null : schemeStat$TypeGameCatalogItem, (32768 & i) != 0 ? null : schemeStat$TypeAwayItem, (65536 & i) != 0 ? null : schemeStat$TypeMarketScreenItem, (131072 & i) != 0 ? null : schemeStat$TypePostDraftItem, (262144 & i) != 0 ? null : schemeStat$TypeClipViewerItem, (524288 & i) != 0 ? null : schemeStat$TypeClipGridItem, (1048576 & i) != 0 ? null : schemeStat$TypeMarketItem, (2097152 & i) != 0 ? null : schemeStat$TypeMarketService, (4194304 & i) != 0 ? null : schemeStat$TypeMarketMarketplaceItem, (8388608 & i) != 0 ? null : schemeStat$TypeMiniAppItem, (16777216 & i) != 0 ? null : schemeStat$TypeMiniAppCatalogItem, (33554432 & i) != 0 ? null : schemeStat$TypeShareItem, (67108864 & i) != 0 ? null : schemeStat$TypeSuperappBirthdayPresentItem, (134217728 & i) != 0 ? null : mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem, (268435456 & i) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoViewerItem, (536870912 & i) != 0 ? null : commonAudioStat$TypeAudioUiNavigationItem, (i & 1073741824) != 0 ? null : commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo);
    }
}
