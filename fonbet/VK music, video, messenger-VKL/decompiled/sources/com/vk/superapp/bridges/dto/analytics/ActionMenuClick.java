package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionMenuClick.kt */
/* loaded from: classes6.dex */
public final class ActionMenuClick {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionMenuClick[] $VALUES;
    public static final ActionMenuClick ABOUT_APP;
    public static final ActionMenuClick ADD_TO_FAVORITES;
    public static final ActionMenuClick ADD_TO_HOME_SCREEN;
    public static final ActionMenuClick ADD_TO_RECOMMENDATIONS;
    public static final ActionMenuClick ALL_APPS;
    public static final ActionMenuClick ALL_GAMES;
    public static final ActionMenuClick CLEAR_CACHE;
    public static final ActionMenuClick COPY;
    public static final ActionMenuClick DELETE;
    public static final ActionMenuClick DISABLE_BADGES;
    public static final ActionMenuClick DISABLE_NOTIFICATIONS;
    public static final ActionMenuClick ENABLE_BADGES;
    public static final ActionMenuClick ENABLE_NOTIFICATIONS;
    public static final ActionMenuClick FAVE_ADD;
    public static final ActionMenuClick FAVE_REMOVE;
    public static final ActionMenuClick HELP;
    public static final ActionMenuClick HIDE_DEBUG_MENU;
    public static final ActionMenuClick PIP;
    public static final ActionMenuClick REMOVE_FROM_FAVORITES;
    public static final ActionMenuClick REMOVE_FROM_RECOMMENDATIONS;
    public static final ActionMenuClick REPORT;
    public static final ActionMenuClick SHARE;
    public static final ActionMenuClick SHOW_DEBUG_MENU;

    static {
        ActionMenuClick actionMenuClick = new ActionMenuClick("SHARE", 0);
        SHARE = actionMenuClick;
        ActionMenuClick actionMenuClick2 = new ActionMenuClick("COPY", 1);
        COPY = actionMenuClick2;
        ActionMenuClick actionMenuClick3 = new ActionMenuClick("CLEAR_CACHE", 2);
        CLEAR_CACHE = actionMenuClick3;
        ActionMenuClick actionMenuClick4 = new ActionMenuClick("ADD_TO_HOME_SCREEN", 3);
        ADD_TO_HOME_SCREEN = actionMenuClick4;
        ActionMenuClick actionMenuClick5 = new ActionMenuClick("ADD_TO_FAVORITES", 4);
        ADD_TO_FAVORITES = actionMenuClick5;
        ActionMenuClick actionMenuClick6 = new ActionMenuClick("REMOVE_FROM_FAVORITES", 5);
        REMOVE_FROM_FAVORITES = actionMenuClick6;
        ActionMenuClick actionMenuClick7 = new ActionMenuClick("ENABLE_NOTIFICATIONS", 6);
        ENABLE_NOTIFICATIONS = actionMenuClick7;
        ActionMenuClick actionMenuClick8 = new ActionMenuClick("DISABLE_NOTIFICATIONS", 7);
        DISABLE_NOTIFICATIONS = actionMenuClick8;
        ActionMenuClick actionMenuClick9 = new ActionMenuClick("DELETE", 8);
        DELETE = actionMenuClick9;
        ActionMenuClick actionMenuClick10 = new ActionMenuClick("REPORT", 9);
        REPORT = actionMenuClick10;
        ActionMenuClick actionMenuClick11 = new ActionMenuClick("ENABLE_BADGES", 10);
        ENABLE_BADGES = actionMenuClick11;
        ActionMenuClick actionMenuClick12 = new ActionMenuClick("DISABLE_BADGES", 11);
        DISABLE_BADGES = actionMenuClick12;
        ActionMenuClick actionMenuClick13 = new ActionMenuClick("SHOW_DEBUG_MENU", 12);
        SHOW_DEBUG_MENU = actionMenuClick13;
        ActionMenuClick actionMenuClick14 = new ActionMenuClick("HIDE_DEBUG_MENU", 13);
        HIDE_DEBUG_MENU = actionMenuClick14;
        ActionMenuClick actionMenuClick15 = new ActionMenuClick("ADD_TO_RECOMMENDATIONS", 14);
        ADD_TO_RECOMMENDATIONS = actionMenuClick15;
        ActionMenuClick actionMenuClick16 = new ActionMenuClick("REMOVE_FROM_RECOMMENDATIONS", 15);
        REMOVE_FROM_RECOMMENDATIONS = actionMenuClick16;
        ActionMenuClick actionMenuClick17 = new ActionMenuClick("FAVE_ADD", 16);
        FAVE_ADD = actionMenuClick17;
        ActionMenuClick actionMenuClick18 = new ActionMenuClick("FAVE_REMOVE", 17);
        FAVE_REMOVE = actionMenuClick18;
        ActionMenuClick actionMenuClick19 = new ActionMenuClick("PIP", 18);
        PIP = actionMenuClick19;
        ActionMenuClick actionMenuClick20 = new ActionMenuClick("ABOUT_APP", 19);
        ABOUT_APP = actionMenuClick20;
        ActionMenuClick actionMenuClick21 = new ActionMenuClick("HELP", 20);
        HELP = actionMenuClick21;
        ActionMenuClick actionMenuClick22 = new ActionMenuClick("ALL_GAMES", 21);
        ALL_GAMES = actionMenuClick22;
        ActionMenuClick actionMenuClick23 = new ActionMenuClick("ALL_APPS", 22);
        ALL_APPS = actionMenuClick23;
        ActionMenuClick[] actionMenuClickArr = {actionMenuClick, actionMenuClick2, actionMenuClick3, actionMenuClick4, actionMenuClick5, actionMenuClick6, actionMenuClick7, actionMenuClick8, actionMenuClick9, actionMenuClick10, actionMenuClick11, actionMenuClick12, actionMenuClick13, actionMenuClick14, actionMenuClick15, actionMenuClick16, actionMenuClick17, actionMenuClick18, actionMenuClick19, actionMenuClick20, actionMenuClick21, actionMenuClick22, actionMenuClick23};
        $VALUES = actionMenuClickArr;
        $ENTRIES = new asp(actionMenuClickArr);
    }

    public ActionMenuClick() {
        throw null;
    }

    public static ActionMenuClick valueOf(String str) {
        return (ActionMenuClick) Enum.valueOf(ActionMenuClick.class, str);
    }

    public static ActionMenuClick[] values() {
        return (ActionMenuClick[]) $VALUES.clone();
    }
}
