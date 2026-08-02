package com.vk.superapp.browser.internal.ui.menu.action;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionMenuItem.kt */
/* loaded from: classes6.dex */
public final class HorizontalAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HorizontalAction[] $VALUES;
    public static final HorizontalAction ADD_TO_FAVORITES;
    public static final HorizontalAction ADD_TO_RECOMMENDATION;
    public static final HorizontalAction ALL_GAMES;
    public static final HorizontalAction ALL_SERVICES;
    public static final HorizontalAction HOME;
    public static final HorizontalAction REMOVE_FROM_FAVORITES;
    public static final HorizontalAction REMOVE_FROM_RECOMMENDATION;
    public static final HorizontalAction SHARE;
    private final int iconId;
    private final int textId;

    static {
        HorizontalAction horizontalAction = new HorizontalAction("SHARE", 0, R.string.vk_apps_share, R.drawable.vk_icon_share_outline_28);
        SHARE = horizontalAction;
        HorizontalAction horizontalAction2 = new HorizontalAction("ADD_TO_FAVORITES", 1, R.string.vk_apps_add_to_favorite, R.drawable.vk_icon_favorite_outline_28);
        ADD_TO_FAVORITES = horizontalAction2;
        HorizontalAction horizontalAction3 = new HorizontalAction("REMOVE_FROM_FAVORITES", 2, R.string.vk_apps_remove_from_favorites, R.drawable.vk_icon_unfavorite_outline_28);
        REMOVE_FROM_FAVORITES = horizontalAction3;
        HorizontalAction horizontalAction4 = new HorizontalAction("HOME", 3, R.string.vk_apps_on_home_screen, R.drawable.vk_icon_add_square_outline_28);
        HOME = horizontalAction4;
        HorizontalAction horizontalAction5 = new HorizontalAction("ALL_SERVICES", 4, R.string.vk_apps_all_services, R.drawable.vk_icon_services_outline_28);
        ALL_SERVICES = horizontalAction5;
        HorizontalAction horizontalAction6 = new HorizontalAction("ALL_GAMES", 5, R.string.vk_apps_all_games, R.drawable.vk_icon_game_outline_28);
        ALL_GAMES = horizontalAction6;
        HorizontalAction horizontalAction7 = new HorizontalAction("REMOVE_FROM_RECOMMENDATION", 6, R.string.vk_apps_remove_from_recommendation, R.drawable.vk_icon_done_outline_28);
        REMOVE_FROM_RECOMMENDATION = horizontalAction7;
        HorizontalAction horizontalAction8 = new HorizontalAction("ADD_TO_RECOMMENDATION", 7, R.string.vk_apps_add_to_recommendation, R.drawable.vk_icon_thumbs_up_outline_28);
        ADD_TO_RECOMMENDATION = horizontalAction8;
        HorizontalAction[] horizontalActionArr = {horizontalAction, horizontalAction2, horizontalAction3, horizontalAction4, horizontalAction5, horizontalAction6, horizontalAction7, horizontalAction8};
        $VALUES = horizontalActionArr;
        $ENTRIES = new asp(horizontalActionArr);
    }

    public HorizontalAction(String str, int i, int i2, int i3) {
        this.textId = i2;
        this.iconId = i3;
    }

    public static HorizontalAction valueOf(String str) {
        return (HorizontalAction) Enum.valueOf(HorizontalAction.class, str);
    }

    public static HorizontalAction[] values() {
        return (HorizontalAction[]) $VALUES.clone();
    }

    public final int h() {
        return this.iconId;
    }

    public final int i() {
        return this.textId;
    }
}
