package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogActionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesCatalogActionType[] $VALUES;
    public static final GamesCatalogActionType OPEN_ACHIEVEMENT_MODAL;
    public static final GamesCatalogActionType OPEN_GAME;
    public static final GamesCatalogActionType OPEN_MINI_APP;
    public static final GamesCatalogActionType OPEN_URL;

    static {
        GamesCatalogActionType gamesCatalogActionType = new GamesCatalogActionType("OPEN_URL", 0);
        OPEN_URL = gamesCatalogActionType;
        GamesCatalogActionType gamesCatalogActionType2 = new GamesCatalogActionType("OPEN_MINI_APP", 1);
        OPEN_MINI_APP = gamesCatalogActionType2;
        GamesCatalogActionType gamesCatalogActionType3 = new GamesCatalogActionType("OPEN_GAME", 2);
        OPEN_GAME = gamesCatalogActionType3;
        GamesCatalogActionType gamesCatalogActionType4 = new GamesCatalogActionType("OPEN_ACHIEVEMENT_MODAL", 3);
        OPEN_ACHIEVEMENT_MODAL = gamesCatalogActionType4;
        GamesCatalogActionType[] gamesCatalogActionTypeArr = {gamesCatalogActionType, gamesCatalogActionType2, gamesCatalogActionType3, gamesCatalogActionType4};
        $VALUES = gamesCatalogActionTypeArr;
        $ENTRIES = new asp(gamesCatalogActionTypeArr);
    }

    public GamesCatalogActionType() {
        throw null;
    }

    public static GamesCatalogActionType valueOf(String str) {
        return (GamesCatalogActionType) Enum.valueOf(GamesCatalogActionType.class, str);
    }

    public static GamesCatalogActionType[] values() {
        return (GamesCatalogActionType[]) $VALUES.clone();
    }
}
