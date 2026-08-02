package com.vk.core.compose.component.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Tile.kt */
/* loaded from: classes17.dex */
public final class Tile$TextSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Tile$TextSize[] $VALUES;
    public static final Tile$TextSize Medium;
    public static final Tile$TextSize Small;

    static {
        Tile$TextSize tile$TextSize = new Tile$TextSize("Small", 0);
        Small = tile$TextSize;
        Tile$TextSize tile$TextSize2 = new Tile$TextSize("Medium", 1);
        Medium = tile$TextSize2;
        Tile$TextSize[] tile$TextSizeArr = {tile$TextSize, tile$TextSize2};
        $VALUES = tile$TextSizeArr;
        $ENTRIES = new asp(tile$TextSizeArr);
    }

    public Tile$TextSize() {
        throw null;
    }

    public static Tile$TextSize valueOf(String str) {
        return (Tile$TextSize) Enum.valueOf(Tile$TextSize.class, str);
    }

    public static Tile$TextSize[] values() {
        return (Tile$TextSize[]) $VALUES.clone();
    }
}
