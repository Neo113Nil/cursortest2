package com.vk.core.compose.component.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Tile.kt */
/* loaded from: classes17.dex */
public final class Tile$VisualAndTextGap {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Tile$VisualAndTextGap[] $VALUES;
    public static final Tile$VisualAndTextGap Default;
    public static final Tile$VisualAndTextGap Grid2Or3Columns;

    static {
        Tile$VisualAndTextGap tile$VisualAndTextGap = new Tile$VisualAndTextGap("Default", 0);
        Default = tile$VisualAndTextGap;
        Tile$VisualAndTextGap tile$VisualAndTextGap2 = new Tile$VisualAndTextGap("Grid2Or3Columns", 1);
        Grid2Or3Columns = tile$VisualAndTextGap2;
        Tile$VisualAndTextGap[] tile$VisualAndTextGapArr = {tile$VisualAndTextGap, tile$VisualAndTextGap2};
        $VALUES = tile$VisualAndTextGapArr;
        $ENTRIES = new asp(tile$VisualAndTextGapArr);
    }

    public Tile$VisualAndTextGap() {
        throw null;
    }

    public static Tile$VisualAndTextGap valueOf(String str) {
        return (Tile$VisualAndTextGap) Enum.valueOf(Tile$VisualAndTextGap.class, str);
    }

    public static Tile$VisualAndTextGap[] values() {
        return (Tile$VisualAndTextGap[]) $VALUES.clone();
    }
}
