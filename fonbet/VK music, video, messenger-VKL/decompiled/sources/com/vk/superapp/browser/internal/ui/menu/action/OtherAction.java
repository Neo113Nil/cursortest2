package com.vk.superapp.browser.internal.ui.menu.action;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionMenuItem.kt */
/* loaded from: classes6.dex */
public final class OtherAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OtherAction[] $VALUES;
    public static final OtherAction ADD_TO_RECOMMENDATION;
    public static final OtherAction ALLOW_BADGES;
    public static final OtherAction ALLOW_NOTIFICATIONS;
    public static final OtherAction CLEAR_CACHE;
    public static final OtherAction COPY;
    public static final OtherAction DELETE_GAME;
    public static final OtherAction DELETE_MINI_APP;
    public static final OtherAction DISALLOW_BADGES;
    public static final OtherAction DISALLOW_NOTIFICATIONS;
    public static final OtherAction HELP;
    public static final OtherAction HIDE_DEBUG_MODE;
    public static final OtherAction HOME;
    public static final OtherAction PIP_MODE;
    public static final OtherAction REMOVE_FROM_RECOMMENDATION;
    public static final OtherAction REPORT;
    public static final OtherAction SHOW_DEBUG_MODE;
    private final int iconColor;
    private final int iconId;
    private final long id;
    private final int textId;

    static {
        OtherAction otherAction = new OtherAction(0, R.string.vk_apps_copy_link, R.drawable.vk_icon_copy_outline_28, R.attr.vk_ui_text_accent, "COPY", 4L);
        COPY = otherAction;
        OtherAction otherAction2 = new OtherAction(1, R.string.vk_apps_allow_notifications, R.drawable.vk_icon_notifications_28, R.attr.vk_ui_text_accent, "ALLOW_NOTIFICATIONS", 5L);
        ALLOW_NOTIFICATIONS = otherAction2;
        OtherAction otherAction3 = new OtherAction(2, R.string.vk_apps_disallow_notifications, R.drawable.vk_icon_notification_disable_outline_28, R.attr.vk_ui_text_accent, "DISALLOW_NOTIFICATIONS", 5L);
        DISALLOW_NOTIFICATIONS = otherAction3;
        OtherAction otherAction4 = new OtherAction(3, R.string.vk_apps_report_content, R.drawable.vk_icon_report_outline_28, R.attr.vk_ui_text_accent, "REPORT", 6L);
        REPORT = otherAction4;
        OtherAction otherAction5 = new OtherAction(4, R.string.vk_apps_clear_cache, R.drawable.vk_icon_clear_data_outline_28, R.attr.vk_ui_text_accent, "CLEAR_CACHE", 7L);
        CLEAR_CACHE = otherAction5;
        OtherAction otherAction6 = new OtherAction(5, R.string.vk_apps_games_delete_game, R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_background_negative, "DELETE_GAME", 8L);
        DELETE_GAME = otherAction6;
        OtherAction otherAction7 = new OtherAction(6, R.string.vk_apps_app_uninstall, R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_background_negative, "DELETE_MINI_APP", 8L);
        DELETE_MINI_APP = otherAction7;
        OtherAction otherAction8 = new OtherAction(7, R.string.vk_show_debug_console, R.drawable.vk_icon_brackets_square_outline_28, R.attr.vk_ui_text_accent, "SHOW_DEBUG_MODE", 9L);
        SHOW_DEBUG_MODE = otherAction8;
        OtherAction otherAction9 = new OtherAction(8, R.string.vk_hide_debug_console, R.drawable.vk_icon_brackets_slash_square_outline_28, R.attr.vk_ui_text_accent, "HIDE_DEBUG_MODE", 9L);
        HIDE_DEBUG_MODE = otherAction9;
        OtherAction otherAction10 = new OtherAction(9, R.string.vk_allow_badges, R.drawable.vk_icon_app_badge_outline_28, R.attr.vk_ui_text_accent, "ALLOW_BADGES", 11L);
        ALLOW_BADGES = otherAction10;
        OtherAction otherAction11 = new OtherAction(10, R.string.vk_disallow_badges, R.drawable.vk_icon_app_badge_outline_28, R.attr.vk_ui_text_accent, "DISALLOW_BADGES", 11L);
        DISALLOW_BADGES = otherAction11;
        OtherAction otherAction12 = new OtherAction(11, R.string.vk_apps_on_home_screen, R.drawable.vk_icon_add_square_outline_28, R.attr.vk_ui_text_accent, "HOME", 12L);
        HOME = otherAction12;
        OtherAction otherAction13 = new OtherAction(12, R.string.vk_apps_pip_mode, R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_text_accent, "PIP_MODE", 14L);
        PIP_MODE = otherAction13;
        OtherAction otherAction14 = new OtherAction(13, R.string.vk_apps_help, R.drawable.vk_icon_help_circle_outline_28, R.attr.vk_ui_text_accent, "HELP", 15L);
        HELP = otherAction14;
        OtherAction otherAction15 = new OtherAction(14, R.string.vk_apps_add_to_recommendation, R.drawable.vk_icon_thumbs_up_outline_28, R.attr.vk_ui_text_accent, "ADD_TO_RECOMMENDATION", 16L);
        ADD_TO_RECOMMENDATION = otherAction15;
        OtherAction otherAction16 = new OtherAction(15, R.string.vk_apps_remove_from_recommendation, R.drawable.vk_icon_done_outline_28, R.attr.vk_ui_text_accent, "REMOVE_FROM_RECOMMENDATION", 16L);
        REMOVE_FROM_RECOMMENDATION = otherAction16;
        OtherAction[] otherActionArr = {otherAction, otherAction2, otherAction3, otherAction4, otherAction5, otherAction6, otherAction7, otherAction8, otherAction9, otherAction10, otherAction11, otherAction12, otherAction13, otherAction14, otherAction15, otherAction16};
        $VALUES = otherActionArr;
        $ENTRIES = new asp(otherActionArr);
    }

    public OtherAction(int i, int i2, int i3, int i4, String str, long j) {
        this.textId = i2;
        this.iconId = i3;
        this.iconColor = i4;
        this.id = j;
    }

    public static OtherAction valueOf(String str) {
        return (OtherAction) Enum.valueOf(OtherAction.class, str);
    }

    public static OtherAction[] values() {
        return (OtherAction[]) $VALUES.clone();
    }

    public final long getId() {
        return this.id;
    }

    public final int h() {
        return this.iconColor;
    }

    public final int i() {
        return this.iconId;
    }

    public final int j() {
        return this.textId;
    }
}
