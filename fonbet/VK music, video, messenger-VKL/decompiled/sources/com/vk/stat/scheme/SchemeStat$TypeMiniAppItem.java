package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMiniAppItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("group_id")
    private final Long groupId;

    @pmi0("type")
    private final Type type;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("action_menu_about_screen")
        public static final Type ACTION_MENU_ABOUT_SCREEN;

        @pmi0("action_menu_add_to_favourites")
        public static final Type ACTION_MENU_ADD_TO_FAVOURITES;

        @pmi0("action_menu_add_to_home_screen")
        public static final Type ACTION_MENU_ADD_TO_HOME_SCREEN;

        @pmi0("action_menu_all_apps")
        public static final Type ACTION_MENU_ALL_APPS;

        @pmi0("action_menu_clear_cache")
        public static final Type ACTION_MENU_CLEAR_CACHE;

        @pmi0("action_menu_copy")
        public static final Type ACTION_MENU_COPY;

        @pmi0("action_menu_delete")
        public static final Type ACTION_MENU_DELETE;

        @pmi0("action_menu_disable_badges")
        public static final Type ACTION_MENU_DISABLE_BADGES;

        @pmi0("action_menu_disable_notifications")
        public static final Type ACTION_MENU_DISABLE_NOTIFICATIONS;

        @pmi0("action_menu_enable_badges")
        public static final Type ACTION_MENU_ENABLE_BADGES;

        @pmi0("action_menu_enable_notifications")
        public static final Type ACTION_MENU_ENABLE_NOTIFICATIONS;

        @pmi0("action_menu_fave_add")
        public static final Type ACTION_MENU_FAVE_ADD;

        @pmi0("action_menu_fave_remove")
        public static final Type ACTION_MENU_FAVE_REMOVE;

        @pmi0("action_menu_help")
        public static final Type ACTION_MENU_HELP;

        @pmi0("action_menu_open_recommended")
        public static final Type ACTION_MENU_OPEN_RECOMMENDED;

        @pmi0("action_menu_pip")
        public static final Type ACTION_MENU_PIP;

        @pmi0("action_menu_recommend")
        public static final Type ACTION_MENU_RECOMMEND;

        @pmi0("action_menu_remove_from_favourites")
        public static final Type ACTION_MENU_REMOVE_FROM_FAVOURITES;

        @pmi0("action_menu_report")
        public static final Type ACTION_MENU_REPORT;

        @pmi0("action_menu_share")
        public static final Type ACTION_MENU_SHARE;

        @pmi0("action_menu_unrecommend")
        public static final Type ACTION_MENU_UNRECOMMEND;

        @pmi0("add_to_home_screen")
        public static final Type ADD_TO_HOME_SCREEN;

        @pmi0("auto_add_to_home_screen")
        public static final Type AUTO_ADD_TO_HOME_SCREEN;

        @pmi0("auto_add_to_home_screen_click")
        public static final Type AUTO_ADD_TO_HOME_SCREEN_CLICK;

        @pmi0("auto_add_to_home_screen_show")
        public static final Type AUTO_ADD_TO_HOME_SCREEN_SHOW;

        @pmi0("catalog_featured_banner_view")
        public static final Type CATALOG_FEATURED_BANNER_VIEW;

        @pmi0("catalog_promo_banner_view")
        public static final Type CATALOG_PROMO_BANNER_VIEW;

        @pmi0("games_click_decline_open_pwa")
        public static final Type GAMES_CLICK_DECLINE_OPEN_PWA;

        @pmi0("games_click_open_pwa")
        public static final Type GAMES_CLICK_OPEN_PWA;

        @pmi0("hide_debug_console")
        public static final Type HIDE_DEBUG_CONSOLE;

        @pmi0("home_screen_app_delete")
        public static final Type HOME_SCREEN_APP_DELETE;

        @pmi0(NotificationCompat.CATEGORY_NAVIGATION)
        public static final Type NAVIGATION;

        @pmi0("notifications_request_disable")
        public static final Type NOTIFICATIONS_REQUEST_DISABLE;

        @pmi0("notifications_request_sent")
        public static final Type NOTIFICATIONS_REQUEST_SENT;

        @pmi0("notifications_request_settings_open")
        public static final Type NOTIFICATIONS_REQUEST_SETTINGS_OPEN;

        @pmi0("notifications_request_swipe")
        public static final Type NOTIFICATIONS_REQUEST_SWIPE;

        @pmi0("notifications_request_timeout")
        public static final Type NOTIFICATIONS_REQUEST_TIMEOUT;

        @pmi0("pip_close")
        public static final Type PIP_CLOSE;

        @pmi0("pip_expand")
        public static final Type PIP_EXPAND;

        @pmi0("promo_banner_click")
        public static final Type PROMO_BANNER_CLICK;

        @pmi0("recommendation_modal_cancel")
        public static final Type RECOMMENDATION_MODAL_CANCEL;

        @pmi0("recommendation_modal_recommend")
        public static final Type RECOMMENDATION_MODAL_RECOMMEND;

        @pmi0("show_debug_console")
        public static final Type SHOW_DEBUG_CONSOLE;

        @pmi0("unverified_screen")
        public static final Type UNVERIFIED_SCREEN;

        @pmi0("unverified_screen_about_app")
        public static final Type UNVERIFIED_SCREEN_ABOUT_APP;

        @pmi0("unverified_screen_launch")
        public static final Type UNVERIFIED_SCREEN_LAUNCH;

        @pmi0("unverified_screen_quit")
        public static final Type UNVERIFIED_SCREEN_QUIT;

        static {
            Type type = new Type("ADD_TO_HOME_SCREEN", 0);
            ADD_TO_HOME_SCREEN = type;
            Type type2 = new Type("NAVIGATION", 1);
            NAVIGATION = type2;
            Type type3 = new Type("AUTO_ADD_TO_HOME_SCREEN", 2);
            AUTO_ADD_TO_HOME_SCREEN = type3;
            Type type4 = new Type("AUTO_ADD_TO_HOME_SCREEN_SHOW", 3);
            AUTO_ADD_TO_HOME_SCREEN_SHOW = type4;
            Type type5 = new Type("AUTO_ADD_TO_HOME_SCREEN_CLICK", 4);
            AUTO_ADD_TO_HOME_SCREEN_CLICK = type5;
            Type type6 = new Type("PROMO_BANNER_CLICK", 5);
            PROMO_BANNER_CLICK = type6;
            Type type7 = new Type("ACTION_MENU_SHARE", 6);
            ACTION_MENU_SHARE = type7;
            Type type8 = new Type("ACTION_MENU_ADD_TO_FAVOURITES", 7);
            ACTION_MENU_ADD_TO_FAVOURITES = type8;
            Type type9 = new Type("ACTION_MENU_REMOVE_FROM_FAVOURITES", 8);
            ACTION_MENU_REMOVE_FROM_FAVOURITES = type9;
            Type type10 = new Type("ACTION_MENU_RECOMMEND", 9);
            ACTION_MENU_RECOMMEND = type10;
            Type type11 = new Type("ACTION_MENU_UNRECOMMEND", 10);
            ACTION_MENU_UNRECOMMEND = type11;
            Type type12 = new Type("ACTION_MENU_ADD_TO_HOME_SCREEN", 11);
            ACTION_MENU_ADD_TO_HOME_SCREEN = type12;
            Type type13 = new Type("ACTION_MENU_ABOUT_SCREEN", 12);
            ACTION_MENU_ABOUT_SCREEN = type13;
            Type type14 = new Type("ACTION_MENU_ENABLE_NOTIFICATIONS", 13);
            ACTION_MENU_ENABLE_NOTIFICATIONS = type14;
            Type type15 = new Type("ACTION_MENU_DISABLE_NOTIFICATIONS", 14);
            ACTION_MENU_DISABLE_NOTIFICATIONS = type15;
            Type type16 = new Type("ACTION_MENU_ALL_APPS", 15);
            ACTION_MENU_ALL_APPS = type16;
            Type type17 = new Type("ACTION_MENU_HELP", 16);
            ACTION_MENU_HELP = type17;
            Type type18 = new Type("ACTION_MENU_ENABLE_BADGES", 17);
            ACTION_MENU_ENABLE_BADGES = type18;
            Type type19 = new Type("ACTION_MENU_DISABLE_BADGES", 18);
            ACTION_MENU_DISABLE_BADGES = type19;
            Type type20 = new Type("ACTION_MENU_COPY", 19);
            ACTION_MENU_COPY = type20;
            Type type21 = new Type("ACTION_MENU_REPORT", 20);
            ACTION_MENU_REPORT = type21;
            Type type22 = new Type("ACTION_MENU_CLEAR_CACHE", 21);
            ACTION_MENU_CLEAR_CACHE = type22;
            Type type23 = new Type("ACTION_MENU_DELETE", 22);
            ACTION_MENU_DELETE = type23;
            Type type24 = new Type("ACTION_MENU_OPEN_RECOMMENDED", 23);
            ACTION_MENU_OPEN_RECOMMENDED = type24;
            Type type25 = new Type("ACTION_MENU_FAVE_ADD", 24);
            ACTION_MENU_FAVE_ADD = type25;
            Type type26 = new Type("ACTION_MENU_FAVE_REMOVE", 25);
            ACTION_MENU_FAVE_REMOVE = type26;
            Type type27 = new Type("ACTION_MENU_PIP", 26);
            ACTION_MENU_PIP = type27;
            Type type28 = new Type("NOTIFICATIONS_REQUEST_SENT", 27);
            NOTIFICATIONS_REQUEST_SENT = type28;
            Type type29 = new Type("NOTIFICATIONS_REQUEST_SWIPE", 28);
            NOTIFICATIONS_REQUEST_SWIPE = type29;
            Type type30 = new Type("NOTIFICATIONS_REQUEST_TIMEOUT", 29);
            NOTIFICATIONS_REQUEST_TIMEOUT = type30;
            Type type31 = new Type("NOTIFICATIONS_REQUEST_SETTINGS_OPEN", 30);
            NOTIFICATIONS_REQUEST_SETTINGS_OPEN = type31;
            Type type32 = new Type("NOTIFICATIONS_REQUEST_DISABLE", 31);
            NOTIFICATIONS_REQUEST_DISABLE = type32;
            Type type33 = new Type("CATALOG_FEATURED_BANNER_VIEW", 32);
            CATALOG_FEATURED_BANNER_VIEW = type33;
            Type type34 = new Type("CATALOG_PROMO_BANNER_VIEW", 33);
            CATALOG_PROMO_BANNER_VIEW = type34;
            Type type35 = new Type("SHOW_DEBUG_CONSOLE", 34);
            SHOW_DEBUG_CONSOLE = type35;
            Type type36 = new Type("HIDE_DEBUG_CONSOLE", 35);
            HIDE_DEBUG_CONSOLE = type36;
            Type type37 = new Type("HOME_SCREEN_APP_DELETE", 36);
            HOME_SCREEN_APP_DELETE = type37;
            Type type38 = new Type("RECOMMENDATION_MODAL_RECOMMEND", 37);
            RECOMMENDATION_MODAL_RECOMMEND = type38;
            Type type39 = new Type("RECOMMENDATION_MODAL_CANCEL", 38);
            RECOMMENDATION_MODAL_CANCEL = type39;
            Type type40 = new Type("UNVERIFIED_SCREEN", 39);
            UNVERIFIED_SCREEN = type40;
            Type type41 = new Type("UNVERIFIED_SCREEN_LAUNCH", 40);
            UNVERIFIED_SCREEN_LAUNCH = type41;
            Type type42 = new Type("UNVERIFIED_SCREEN_QUIT", 41);
            UNVERIFIED_SCREEN_QUIT = type42;
            Type type43 = new Type("UNVERIFIED_SCREEN_ABOUT_APP", 42);
            UNVERIFIED_SCREEN_ABOUT_APP = type43;
            Type type44 = new Type("PIP_EXPAND", 43);
            PIP_EXPAND = type44;
            Type type45 = new Type("PIP_CLOSE", 44);
            PIP_CLOSE = type45;
            Type type46 = new Type("GAMES_CLICK_OPEN_PWA", 45);
            GAMES_CLICK_OPEN_PWA = type46;
            Type type47 = new Type("GAMES_CLICK_DECLINE_OPEN_PWA", 46);
            GAMES_CLICK_DECLINE_OPEN_PWA = type47;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47};
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

    public SchemeStat$TypeMiniAppItem(Type type, String str, Long l) {
        this.type = type;
        this.webviewUrl = str;
        this.groupId = l;
    }

    public static SchemeStat$TypeMiniAppItem a(SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem) {
        Type type = schemeStat$TypeMiniAppItem.type;
        String str = schemeStat$TypeMiniAppItem.webviewUrl;
        Long l = schemeStat$TypeMiniAppItem.groupId;
        schemeStat$TypeMiniAppItem.getClass();
        return new SchemeStat$TypeMiniAppItem(type, str, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMiniAppItem)) {
            return false;
        }
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = (SchemeStat$TypeMiniAppItem) obj;
        return this.type == schemeStat$TypeMiniAppItem.type && epx.f(this.webviewUrl, schemeStat$TypeMiniAppItem.webviewUrl) && epx.f(this.groupId, schemeStat$TypeMiniAppItem.groupId);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.webviewUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.groupId;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppItem(type=");
        sb.append(this.type);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", groupId=");
        return iq.b(sb, this.groupId, ')');
    }

    public /* synthetic */ SchemeStat$TypeMiniAppItem(Type type, String str, Long l, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l);
    }
}
