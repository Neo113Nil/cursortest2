package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionGamesNotificationsPopup.kt */
/* loaded from: classes6.dex */
public final class ActionGamesNotificationsPopup {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionGamesNotificationsPopup[] $VALUES;
    public static final ActionGamesNotificationsPopup CLOSED_BY_SWIPE;
    public static final ActionGamesNotificationsPopup CLOSED_BY_TIMEOUT;
    public static final ActionGamesNotificationsPopup SETTINGS_OPENED;
    public static final ActionGamesNotificationsPopup SHOWED;

    static {
        ActionGamesNotificationsPopup actionGamesNotificationsPopup = new ActionGamesNotificationsPopup("SHOWED", 0);
        SHOWED = actionGamesNotificationsPopup;
        ActionGamesNotificationsPopup actionGamesNotificationsPopup2 = new ActionGamesNotificationsPopup("CLOSED_BY_SWIPE", 1);
        CLOSED_BY_SWIPE = actionGamesNotificationsPopup2;
        ActionGamesNotificationsPopup actionGamesNotificationsPopup3 = new ActionGamesNotificationsPopup("CLOSED_BY_TIMEOUT", 2);
        CLOSED_BY_TIMEOUT = actionGamesNotificationsPopup3;
        ActionGamesNotificationsPopup actionGamesNotificationsPopup4 = new ActionGamesNotificationsPopup("SETTINGS_OPENED", 3);
        SETTINGS_OPENED = actionGamesNotificationsPopup4;
        ActionGamesNotificationsPopup[] actionGamesNotificationsPopupArr = {actionGamesNotificationsPopup, actionGamesNotificationsPopup2, actionGamesNotificationsPopup3, actionGamesNotificationsPopup4};
        $VALUES = actionGamesNotificationsPopupArr;
        $ENTRIES = new asp(actionGamesNotificationsPopupArr);
    }

    public ActionGamesNotificationsPopup() {
        throw null;
    }

    public static ActionGamesNotificationsPopup valueOf(String str) {
        return (ActionGamesNotificationsPopup) Enum.valueOf(ActionGamesNotificationsPopup.class, str);
    }

    public static ActionGamesNotificationsPopup[] values() {
        return (ActionGamesNotificationsPopup[]) $VALUES.clone();
    }
}
