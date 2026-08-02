package com.vk.superapp.ui.widgets.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TileBackgroundImage.kt */
/* loaded from: classes6.dex */
public final class TileType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TileType[] $VALUES;
    public static final TileType CIRCLE;
    public static final TileType NONE;

    static {
        TileType tileType = new TileType("CIRCLE", 0);
        CIRCLE = tileType;
        TileType tileType2 = new TileType("NONE", 1);
        NONE = tileType2;
        TileType[] tileTypeArr = {tileType, tileType2};
        $VALUES = tileTypeArr;
        $ENTRIES = new asp(tileTypeArr);
    }

    public TileType() {
        throw null;
    }

    public static TileType valueOf(String str) {
        return (TileType) Enum.valueOf(TileType.class, str);
    }

    public static TileType[] values() {
        return (TileType[]) $VALUES.clone();
    }
}
