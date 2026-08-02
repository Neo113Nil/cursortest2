package com.vk.dto.newsfeed.discover;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCategory.kt */
/* loaded from: classes18.dex */
public final class DiscoverCategoryType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCategoryType[] $VALUES;
    public static final a Companion;

    @ozl
    public static final DiscoverCategoryType DISCOVER;
    public static final DiscoverCategoryType DISCOVER_FULL;
    public static final DiscoverCategoryType DISCOVER_MEDIA;
    public static final DiscoverCategoryType SHOPPING_CATALOG;
    private final String serverName;

    /* compiled from: DiscoverCategory.kt */
    public static final class a {
    }

    static {
        DiscoverCategoryType discoverCategoryType = new DiscoverCategoryType("DISCOVER", 0, "discover");
        DISCOVER = discoverCategoryType;
        DiscoverCategoryType discoverCategoryType2 = new DiscoverCategoryType("DISCOVER_FULL", 1, "discover_full");
        DISCOVER_FULL = discoverCategoryType2;
        DiscoverCategoryType discoverCategoryType3 = new DiscoverCategoryType("SHOPPING_CATALOG", 2, "shopping_catalog");
        SHOPPING_CATALOG = discoverCategoryType3;
        DiscoverCategoryType discoverCategoryType4 = new DiscoverCategoryType("DISCOVER_MEDIA", 3, "discover_media");
        DISCOVER_MEDIA = discoverCategoryType4;
        DiscoverCategoryType[] discoverCategoryTypeArr = {discoverCategoryType, discoverCategoryType2, discoverCategoryType3, discoverCategoryType4};
        $VALUES = discoverCategoryTypeArr;
        $ENTRIES = new asp(discoverCategoryTypeArr);
        Companion = new a();
    }

    public DiscoverCategoryType(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static DiscoverCategoryType valueOf(String str) {
        return (DiscoverCategoryType) Enum.valueOf(DiscoverCategoryType.class, str);
    }

    public static DiscoverCategoryType[] values() {
        return (DiscoverCategoryType[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
