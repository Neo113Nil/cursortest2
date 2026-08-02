package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesCatalogScreenTab.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogScreenTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesCatalogScreenTab[] $VALUES;
    public static final GamesCatalogScreenTab CATALOG;
    public static final GamesCatalogScreenTab CATEGORIES;

    static {
        GamesCatalogScreenTab gamesCatalogScreenTab = new GamesCatalogScreenTab("CATALOG", 0);
        CATALOG = gamesCatalogScreenTab;
        GamesCatalogScreenTab gamesCatalogScreenTab2 = new GamesCatalogScreenTab("CATEGORIES", 1);
        CATEGORIES = gamesCatalogScreenTab2;
        GamesCatalogScreenTab[] gamesCatalogScreenTabArr = {gamesCatalogScreenTab, gamesCatalogScreenTab2};
        $VALUES = gamesCatalogScreenTabArr;
        $ENTRIES = new asp(gamesCatalogScreenTabArr);
    }

    public GamesCatalogScreenTab() {
        throw null;
    }

    public static zrp<GamesCatalogScreenTab> h() {
        return $ENTRIES;
    }

    public static GamesCatalogScreenTab valueOf(String str) {
        return (GamesCatalogScreenTab) Enum.valueOf(GamesCatalogScreenTab.class, str);
    }

    public static GamesCatalogScreenTab[] values() {
        return (GamesCatalogScreenTab[]) $VALUES.clone();
    }
}
