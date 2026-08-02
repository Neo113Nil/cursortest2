package com.vk.ecomm.market.good.good2.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCardListItem.kt */
/* loaded from: classes18.dex */
public final class IslandPart {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IslandPart[] $VALUES;
    public static final IslandPart Bottom;
    public static final IslandPart Middle;
    public static final IslandPart None;
    public static final IslandPart Top;
    public static final IslandPart TopBottom;

    static {
        IslandPart islandPart = new IslandPart("Top", 0);
        Top = islandPart;
        IslandPart islandPart2 = new IslandPart("Middle", 1);
        Middle = islandPart2;
        IslandPart islandPart3 = new IslandPart("Bottom", 2);
        Bottom = islandPart3;
        IslandPart islandPart4 = new IslandPart("TopBottom", 3);
        TopBottom = islandPart4;
        IslandPart islandPart5 = new IslandPart("None", 4);
        None = islandPart5;
        IslandPart[] islandPartArr = {islandPart, islandPart2, islandPart3, islandPart4, islandPart5};
        $VALUES = islandPartArr;
        $ENTRIES = new asp(islandPartArr);
    }

    public IslandPart() {
        throw null;
    }

    public static IslandPart valueOf(String str) {
        return (IslandPart) Enum.valueOf(IslandPart.class, str);
    }

    public static IslandPart[] values() {
        return (IslandPart[]) $VALUES.clone();
    }
}
