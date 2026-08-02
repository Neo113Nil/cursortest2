package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionMenuCloseCause.kt */
/* loaded from: classes6.dex */
public final class ActionMenuCloseCause {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionMenuCloseCause[] $VALUES;
    public static final ActionMenuCloseCause ABOUT_SCREEN;
    public static final ActionMenuCloseCause ADD_TO_HOME_SCREEN;
    public static final ActionMenuCloseCause ADD_TO_RECOMMENDATIONS;
    public static final ActionMenuCloseCause CLEAR_CACHE;
    public static final ActionMenuCloseCause COPY;
    public static final ActionMenuCloseCause DELETE;
    public static final ActionMenuCloseCause FAVE_ADD;
    public static final ActionMenuCloseCause FAVE_REMOVE;
    public static final ActionMenuCloseCause PIP_MODE;
    public static final ActionMenuCloseCause REMOVE_FROM_FAVORITES;
    public static final ActionMenuCloseCause REMOVE_FROM_RECOMMENDATIONS;
    public static final ActionMenuCloseCause REPORT;
    public static final ActionMenuCloseCause SHARE;

    static {
        ActionMenuCloseCause actionMenuCloseCause = new ActionMenuCloseCause("SHARE", 0);
        SHARE = actionMenuCloseCause;
        ActionMenuCloseCause actionMenuCloseCause2 = new ActionMenuCloseCause("REMOVE_FROM_FAVORITES", 1);
        REMOVE_FROM_FAVORITES = actionMenuCloseCause2;
        ActionMenuCloseCause actionMenuCloseCause3 = new ActionMenuCloseCause("COPY", 2);
        COPY = actionMenuCloseCause3;
        ActionMenuCloseCause actionMenuCloseCause4 = new ActionMenuCloseCause("ADD_TO_HOME_SCREEN", 3);
        ADD_TO_HOME_SCREEN = actionMenuCloseCause4;
        ActionMenuCloseCause actionMenuCloseCause5 = new ActionMenuCloseCause("ABOUT_SCREEN", 4);
        ABOUT_SCREEN = actionMenuCloseCause5;
        ActionMenuCloseCause actionMenuCloseCause6 = new ActionMenuCloseCause("REPORT", 5);
        REPORT = actionMenuCloseCause6;
        ActionMenuCloseCause actionMenuCloseCause7 = new ActionMenuCloseCause("CLEAR_CACHE", 6);
        CLEAR_CACHE = actionMenuCloseCause7;
        ActionMenuCloseCause actionMenuCloseCause8 = new ActionMenuCloseCause("DELETE", 7);
        DELETE = actionMenuCloseCause8;
        ActionMenuCloseCause actionMenuCloseCause9 = new ActionMenuCloseCause("ADD_TO_RECOMMENDATIONS", 8);
        ADD_TO_RECOMMENDATIONS = actionMenuCloseCause9;
        ActionMenuCloseCause actionMenuCloseCause10 = new ActionMenuCloseCause("REMOVE_FROM_RECOMMENDATIONS", 9);
        REMOVE_FROM_RECOMMENDATIONS = actionMenuCloseCause10;
        ActionMenuCloseCause actionMenuCloseCause11 = new ActionMenuCloseCause("FAVE_ADD", 10);
        FAVE_ADD = actionMenuCloseCause11;
        ActionMenuCloseCause actionMenuCloseCause12 = new ActionMenuCloseCause("FAVE_REMOVE", 11);
        FAVE_REMOVE = actionMenuCloseCause12;
        ActionMenuCloseCause actionMenuCloseCause13 = new ActionMenuCloseCause("PIP_MODE", 12);
        PIP_MODE = actionMenuCloseCause13;
        ActionMenuCloseCause[] actionMenuCloseCauseArr = {actionMenuCloseCause, actionMenuCloseCause2, actionMenuCloseCause3, actionMenuCloseCause4, actionMenuCloseCause5, actionMenuCloseCause6, actionMenuCloseCause7, actionMenuCloseCause8, actionMenuCloseCause9, actionMenuCloseCause10, actionMenuCloseCause11, actionMenuCloseCause12, actionMenuCloseCause13};
        $VALUES = actionMenuCloseCauseArr;
        $ENTRIES = new asp(actionMenuCloseCauseArr);
    }

    public ActionMenuCloseCause() {
        throw null;
    }

    public static ActionMenuCloseCause valueOf(String str) {
        return (ActionMenuCloseCause) Enum.valueOf(ActionMenuCloseCause.class, str);
    }

    public static ActionMenuCloseCause[] values() {
        return (ActionMenuCloseCause[]) $VALUES.clone();
    }
}
