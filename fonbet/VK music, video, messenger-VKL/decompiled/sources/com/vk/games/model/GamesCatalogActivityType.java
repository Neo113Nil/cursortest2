package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesCatalogActivityType.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogActivityType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesCatalogActivityType[] $VALUES;
    public static final GamesCatalogActivityType ACHIEVEMENT;
    public static final GamesCatalogActivityType INSTALL;
    public static final GamesCatalogActivityType LEVEL;
    public static final GamesCatalogActivityType SCORE;
    public static final GamesCatalogActivityType STICKERS_ACHIEVEMENT;

    static {
        GamesCatalogActivityType gamesCatalogActivityType = new GamesCatalogActivityType("INSTALL", 0);
        INSTALL = gamesCatalogActivityType;
        GamesCatalogActivityType gamesCatalogActivityType2 = new GamesCatalogActivityType("LEVEL", 1);
        LEVEL = gamesCatalogActivityType2;
        GamesCatalogActivityType gamesCatalogActivityType3 = new GamesCatalogActivityType("ACHIEVEMENT", 2);
        ACHIEVEMENT = gamesCatalogActivityType3;
        GamesCatalogActivityType gamesCatalogActivityType4 = new GamesCatalogActivityType("SCORE", 3);
        SCORE = gamesCatalogActivityType4;
        GamesCatalogActivityType gamesCatalogActivityType5 = new GamesCatalogActivityType("STICKERS_ACHIEVEMENT", 4);
        STICKERS_ACHIEVEMENT = gamesCatalogActivityType5;
        GamesCatalogActivityType[] gamesCatalogActivityTypeArr = {gamesCatalogActivityType, gamesCatalogActivityType2, gamesCatalogActivityType3, gamesCatalogActivityType4, gamesCatalogActivityType5};
        $VALUES = gamesCatalogActivityTypeArr;
        $ENTRIES = new asp(gamesCatalogActivityTypeArr);
    }

    public GamesCatalogActivityType() {
        throw null;
    }

    public static GamesCatalogActivityType valueOf(String str) {
        return (GamesCatalogActivityType) Enum.valueOf(GamesCatalogActivityType.class, str);
    }

    public static GamesCatalogActivityType[] values() {
        return (GamesCatalogActivityType[]) $VALUES.clone();
    }
}
