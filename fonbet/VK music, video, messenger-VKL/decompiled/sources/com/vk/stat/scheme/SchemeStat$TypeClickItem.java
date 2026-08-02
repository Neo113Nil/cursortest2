package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClickItem implements SchemeStat$TypeClick.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("add_friend_from_search")
        public static final Subtype ADD_FRIEND_FROM_SEARCH;

        @pmi0("click_up")
        public static final Subtype CLICK_UP;

        @pmi0("clip_grid_owner_subscription_button")
        public static final Subtype CLIP_GRID_OWNER_SUBSCRIPTION_BUTTON;

        @pmi0("donut_wall_block_about_article")
        public static final Subtype DONUT_WALL_BLOCK_ABOUT_ARTICLE;

        @pmi0("donut_wall_block_hide_button")
        public static final Subtype DONUT_WALL_BLOCK_HIDE_BUTTON;

        @pmi0("donut_wall_block_payment_button")
        public static final Subtype DONUT_WALL_BLOCK_PAYMENT_BUTTON;

        @pmi0("friend_entrypoint_block_item")
        public static final Subtype FRIEND_ENTRYPOINT_BLOCK_ITEM;

        @pmi0("join_group_from_search")
        public static final Subtype JOIN_GROUP_FROM_SEARCH;

        @pmi0("mention_icon")
        public static final Subtype MENTION_ICON;

        @pmi0("owner_button_app_click")
        public static final Subtype OWNER_BUTTON_APP_CLICK;

        @pmi0("screen_edge_tap")
        public static final Subtype SCREEN_EDGE_TAP;

        @pmi0("search_icon")
        public static final Subtype SEARCH_ICON;

        @pmi0("smart_navigation_tab_hint_accept")
        public static final Subtype SMART_NAVIGATION_TAB_HINT_ACCEPT;

        @pmi0("theme_auto")
        public static final Subtype THEME_AUTO;

        @pmi0("theme_dark")
        public static final Subtype THEME_DARK;

        @pmi0("theme_light")
        public static final Subtype THEME_LIGHT;

        @pmi0("theme_switch")
        public static final Subtype THEME_SWITCH;

        @pmi0("theme_system")
        public static final Subtype THEME_SYSTEM;

        @pmi0("theme_timetable")
        public static final Subtype THEME_TIMETABLE;

        @pmi0("theme_timetable_settings")
        public static final Subtype THEME_TIMETABLE_SETTINGS;

        @pmi0("video_content_block_show_all_button")
        public static final Subtype VIDEO_CONTENT_BLOCK_SHOW_ALL_BUTTON;

        @pmi0("voice_search_icon")
        public static final Subtype VOICE_SEARCH_ICON;

        static {
            Subtype subtype = new Subtype("MENTION_ICON", 0);
            MENTION_ICON = subtype;
            Subtype subtype2 = new Subtype("SCREEN_EDGE_TAP", 1);
            SCREEN_EDGE_TAP = subtype2;
            Subtype subtype3 = new Subtype("SEARCH_ICON", 2);
            SEARCH_ICON = subtype3;
            Subtype subtype4 = new Subtype("VOICE_SEARCH_ICON", 3);
            VOICE_SEARCH_ICON = subtype4;
            Subtype subtype5 = new Subtype("THEME_SWITCH", 4);
            THEME_SWITCH = subtype5;
            Subtype subtype6 = new Subtype("THEME_LIGHT", 5);
            THEME_LIGHT = subtype6;
            Subtype subtype7 = new Subtype("THEME_DARK", 6);
            THEME_DARK = subtype7;
            Subtype subtype8 = new Subtype("THEME_AUTO", 7);
            THEME_AUTO = subtype8;
            Subtype subtype9 = new Subtype("THEME_SYSTEM", 8);
            THEME_SYSTEM = subtype9;
            Subtype subtype10 = new Subtype("THEME_TIMETABLE", 9);
            THEME_TIMETABLE = subtype10;
            Subtype subtype11 = new Subtype("THEME_TIMETABLE_SETTINGS", 10);
            THEME_TIMETABLE_SETTINGS = subtype11;
            Subtype subtype12 = new Subtype("ADD_FRIEND_FROM_SEARCH", 11);
            ADD_FRIEND_FROM_SEARCH = subtype12;
            Subtype subtype13 = new Subtype("CLICK_UP", 12);
            CLICK_UP = subtype13;
            Subtype subtype14 = new Subtype("JOIN_GROUP_FROM_SEARCH", 13);
            JOIN_GROUP_FROM_SEARCH = subtype14;
            Subtype subtype15 = new Subtype("CLIP_GRID_OWNER_SUBSCRIPTION_BUTTON", 14);
            CLIP_GRID_OWNER_SUBSCRIPTION_BUTTON = subtype15;
            Subtype subtype16 = new Subtype("VIDEO_CONTENT_BLOCK_SHOW_ALL_BUTTON", 15);
            VIDEO_CONTENT_BLOCK_SHOW_ALL_BUTTON = subtype16;
            Subtype subtype17 = new Subtype("SMART_NAVIGATION_TAB_HINT_ACCEPT", 16);
            SMART_NAVIGATION_TAB_HINT_ACCEPT = subtype17;
            Subtype subtype18 = new Subtype("OWNER_BUTTON_APP_CLICK", 17);
            OWNER_BUTTON_APP_CLICK = subtype18;
            Subtype subtype19 = new Subtype("FRIEND_ENTRYPOINT_BLOCK_ITEM", 18);
            FRIEND_ENTRYPOINT_BLOCK_ITEM = subtype19;
            Subtype subtype20 = new Subtype("DONUT_WALL_BLOCK_PAYMENT_BUTTON", 19);
            DONUT_WALL_BLOCK_PAYMENT_BUTTON = subtype20;
            Subtype subtype21 = new Subtype("DONUT_WALL_BLOCK_ABOUT_ARTICLE", 20);
            DONUT_WALL_BLOCK_ABOUT_ARTICLE = subtype21;
            Subtype subtype22 = new Subtype("DONUT_WALL_BLOCK_HIDE_BUTTON", 21);
            DONUT_WALL_BLOCK_HIDE_BUTTON = subtype22;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8, subtype9, subtype10, subtype11, subtype12, subtype13, subtype14, subtype15, subtype16, subtype17, subtype18, subtype19, subtype20, subtype21, subtype22};
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

    public SchemeStat$TypeClickItem(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeClickItem) && this.subtype == ((SchemeStat$TypeClickItem) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeClickItem(subtype=" + this.subtype + ')';
    }
}
