package com.vk.core.compose.component.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Tile.kt */
/* loaded from: classes17.dex */
public final class Tile$BottomPaddingPreset {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Tile$BottomPaddingPreset[] $VALUES;
    public static final Tile$BottomPaddingPreset Default;
    public static final Tile$BottomPaddingPreset Grid2Columns;
    public static final Tile$BottomPaddingPreset Grid3Columns;

    static {
        Tile$BottomPaddingPreset tile$BottomPaddingPreset = new Tile$BottomPaddingPreset("Default", 0);
        Default = tile$BottomPaddingPreset;
        Tile$BottomPaddingPreset tile$BottomPaddingPreset2 = new Tile$BottomPaddingPreset("Grid3Columns", 1);
        Grid3Columns = tile$BottomPaddingPreset2;
        Tile$BottomPaddingPreset tile$BottomPaddingPreset3 = new Tile$BottomPaddingPreset("Grid2Columns", 2);
        Grid2Columns = tile$BottomPaddingPreset3;
        Tile$BottomPaddingPreset[] tile$BottomPaddingPresetArr = {tile$BottomPaddingPreset, tile$BottomPaddingPreset2, tile$BottomPaddingPreset3};
        $VALUES = tile$BottomPaddingPresetArr;
        $ENTRIES = new asp(tile$BottomPaddingPresetArr);
    }

    public Tile$BottomPaddingPreset() {
        throw null;
    }

    public static Tile$BottomPaddingPreset valueOf(String str) {
        return (Tile$BottomPaddingPreset) Enum.valueOf(Tile$BottomPaddingPreset.class, str);
    }

    public static Tile$BottomPaddingPreset[] values() {
        return (Tile$BottomPaddingPreset[]) $VALUES.clone();
    }
}
