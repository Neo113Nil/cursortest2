package com.vk.core.compose.component.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Tile.kt */
/* loaded from: classes17.dex */
public final class Tile$TextAlignment {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Tile$TextAlignment[] $VALUES;
    public static final Tile$TextAlignment Center;
    public static final Tile$TextAlignment Start;

    static {
        Tile$TextAlignment tile$TextAlignment = new Tile$TextAlignment("Start", 0);
        Start = tile$TextAlignment;
        Tile$TextAlignment tile$TextAlignment2 = new Tile$TextAlignment("Center", 1);
        Center = tile$TextAlignment2;
        Tile$TextAlignment[] tile$TextAlignmentArr = {tile$TextAlignment, tile$TextAlignment2};
        $VALUES = tile$TextAlignmentArr;
        $ENTRIES = new asp(tile$TextAlignmentArr);
    }

    public Tile$TextAlignment() {
        throw null;
    }

    public static Tile$TextAlignment valueOf(String str) {
        return (Tile$TextAlignment) Enum.valueOf(Tile$TextAlignment.class, str);
    }

    public static Tile$TextAlignment[] values() {
        return (Tile$TextAlignment[]) $VALUES.clone();
    }
}
