package com.vk.games.presentation.catalog.model.items;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GameCatalogBadge.kt */
/* loaded from: classes17.dex */
public final class GameCatalogBadge {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GameCatalogBadge[] $VALUES;
    public static final GameCatalogBadge BONUS;
    public static final GameCatalogBadge NEW;

    static {
        GameCatalogBadge gameCatalogBadge = new GameCatalogBadge("NEW", 0);
        NEW = gameCatalogBadge;
        GameCatalogBadge gameCatalogBadge2 = new GameCatalogBadge("BONUS", 1);
        BONUS = gameCatalogBadge2;
        GameCatalogBadge[] gameCatalogBadgeArr = {gameCatalogBadge, gameCatalogBadge2};
        $VALUES = gameCatalogBadgeArr;
        $ENTRIES = new asp(gameCatalogBadgeArr);
    }

    public GameCatalogBadge() {
        throw null;
    }

    public static GameCatalogBadge valueOf(String str) {
        return (GameCatalogBadge) Enum.valueOf(GameCatalogBadge.class, str);
    }

    public static GameCatalogBadge[] values() {
        return (GameCatalogBadge[]) $VALUES.clone();
    }
}
