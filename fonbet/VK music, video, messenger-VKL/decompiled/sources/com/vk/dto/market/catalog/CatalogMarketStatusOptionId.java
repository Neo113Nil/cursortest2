package com.vk.dto.market.catalog;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogMarketFilter.kt */
/* loaded from: classes18.dex */
public final class CatalogMarketStatusOptionId {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogMarketStatusOptionId[] $VALUES;
    public static final CatalogMarketStatusOptionId ALL_ITEMS;
    public static final CatalogMarketStatusOptionId BANNED;
    public static final a Companion;
    public static final CatalogMarketStatusOptionId DISABLED;
    public static final CatalogMarketStatusOptionId NOT_IN_MARKET;
    private final String value;

    /* compiled from: CatalogMarketFilter.kt */
    public static final class a {
    }

    static {
        CatalogMarketStatusOptionId catalogMarketStatusOptionId = new CatalogMarketStatusOptionId("ALL_ITEMS", 0, "all_items");
        ALL_ITEMS = catalogMarketStatusOptionId;
        CatalogMarketStatusOptionId catalogMarketStatusOptionId2 = new CatalogMarketStatusOptionId("BANNED", 1, "banned");
        BANNED = catalogMarketStatusOptionId2;
        CatalogMarketStatusOptionId catalogMarketStatusOptionId3 = new CatalogMarketStatusOptionId("DISABLED", 2, C4217a2.e);
        DISABLED = catalogMarketStatusOptionId3;
        CatalogMarketStatusOptionId catalogMarketStatusOptionId4 = new CatalogMarketStatusOptionId("NOT_IN_MARKET", 3, "not_in_market");
        NOT_IN_MARKET = catalogMarketStatusOptionId4;
        CatalogMarketStatusOptionId[] catalogMarketStatusOptionIdArr = {catalogMarketStatusOptionId, catalogMarketStatusOptionId2, catalogMarketStatusOptionId3, catalogMarketStatusOptionId4};
        $VALUES = catalogMarketStatusOptionIdArr;
        $ENTRIES = new asp(catalogMarketStatusOptionIdArr);
        Companion = new a();
    }

    public CatalogMarketStatusOptionId(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogMarketStatusOptionId valueOf(String str) {
        return (CatalogMarketStatusOptionId) Enum.valueOf(CatalogMarketStatusOptionId.class, str);
    }

    public static CatalogMarketStatusOptionId[] values() {
        return (CatalogMarketStatusOptionId[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
