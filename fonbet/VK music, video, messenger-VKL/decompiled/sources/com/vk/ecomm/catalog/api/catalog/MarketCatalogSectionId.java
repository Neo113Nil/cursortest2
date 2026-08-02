package com.vk.ecomm.catalog.api.catalog;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketCatalogSectionId.kt */
/* loaded from: classes18.dex */
public final class MarketCatalogSectionId {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketCatalogSectionId[] $VALUES;
    public static final MarketCatalogSectionId ALBUM;
    public static final MarketCatalogSectionId CATEGORY;
    public static final MarketCatalogSectionId SEARCH;
    public static final MarketCatalogSectionId SEARCH_STOREFRONT;
    public static final MarketCatalogSectionId SIMILAR_ITEMS_LIGHT;
    public static final MarketCatalogSectionId VIEWED_PRODUCTS;
    private final String sectionId;

    static {
        MarketCatalogSectionId marketCatalogSectionId = new MarketCatalogSectionId("SEARCH", 0, "search");
        SEARCH = marketCatalogSectionId;
        MarketCatalogSectionId marketCatalogSectionId2 = new MarketCatalogSectionId("CATEGORY", 1, "category");
        CATEGORY = marketCatalogSectionId2;
        MarketCatalogSectionId marketCatalogSectionId3 = new MarketCatalogSectionId("SEARCH_STOREFRONT", 2, "search_storefront");
        SEARCH_STOREFRONT = marketCatalogSectionId3;
        MarketCatalogSectionId marketCatalogSectionId4 = new MarketCatalogSectionId("SIMILAR_ITEMS_LIGHT", 3, "similar_items_light");
        SIMILAR_ITEMS_LIGHT = marketCatalogSectionId4;
        MarketCatalogSectionId marketCatalogSectionId5 = new MarketCatalogSectionId("ALBUM", 4, "album");
        ALBUM = marketCatalogSectionId5;
        MarketCatalogSectionId marketCatalogSectionId6 = new MarketCatalogSectionId("VIEWED_PRODUCTS", 5, "viewed_products");
        VIEWED_PRODUCTS = marketCatalogSectionId6;
        MarketCatalogSectionId[] marketCatalogSectionIdArr = {marketCatalogSectionId, marketCatalogSectionId2, marketCatalogSectionId3, marketCatalogSectionId4, marketCatalogSectionId5, marketCatalogSectionId6};
        $VALUES = marketCatalogSectionIdArr;
        $ENTRIES = new asp(marketCatalogSectionIdArr);
    }

    public MarketCatalogSectionId(String str, int i, String str2) {
        this.sectionId = str2;
    }

    public static MarketCatalogSectionId valueOf(String str) {
        return (MarketCatalogSectionId) Enum.valueOf(MarketCatalogSectionId.class, str);
    }

    public static MarketCatalogSectionId[] values() {
        return (MarketCatalogSectionId[]) $VALUES.clone();
    }

    public final String h() {
        return this.sectionId;
    }
}
