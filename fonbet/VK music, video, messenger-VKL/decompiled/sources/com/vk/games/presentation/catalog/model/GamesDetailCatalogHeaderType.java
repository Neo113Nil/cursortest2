package com.vk.games.presentation.catalog.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesDetailCatalogHeaderType.kt */
/* loaded from: classes17.dex */
public final class GamesDetailCatalogHeaderType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesDetailCatalogHeaderType[] $VALUES;
    public static final GamesDetailCatalogHeaderType NEW;
    public static final GamesDetailCatalogHeaderType OLD;

    static {
        GamesDetailCatalogHeaderType gamesDetailCatalogHeaderType = new GamesDetailCatalogHeaderType("NEW", 0);
        NEW = gamesDetailCatalogHeaderType;
        GamesDetailCatalogHeaderType gamesDetailCatalogHeaderType2 = new GamesDetailCatalogHeaderType("OLD", 1);
        OLD = gamesDetailCatalogHeaderType2;
        GamesDetailCatalogHeaderType[] gamesDetailCatalogHeaderTypeArr = {gamesDetailCatalogHeaderType, gamesDetailCatalogHeaderType2};
        $VALUES = gamesDetailCatalogHeaderTypeArr;
        $ENTRIES = new asp(gamesDetailCatalogHeaderTypeArr);
    }

    public GamesDetailCatalogHeaderType() {
        throw null;
    }

    public static GamesDetailCatalogHeaderType valueOf(String str) {
        return (GamesDetailCatalogHeaderType) Enum.valueOf(GamesDetailCatalogHeaderType.class, str);
    }

    public static GamesDetailCatalogHeaderType[] values() {
        return (GamesDetailCatalogHeaderType[]) $VALUES.clone();
    }
}
