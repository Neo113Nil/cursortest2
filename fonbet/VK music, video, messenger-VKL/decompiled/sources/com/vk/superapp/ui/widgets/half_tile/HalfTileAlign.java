package com.vk.superapp.ui.widgets.half_tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class HalfTileAlign {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HalfTileAlign[] $VALUES;
    public static final HalfTileAlign BOTTOM;
    public static final HalfTileAlign TOP;

    static {
        HalfTileAlign halfTileAlign = new HalfTileAlign("TOP", 0);
        TOP = halfTileAlign;
        HalfTileAlign halfTileAlign2 = new HalfTileAlign("BOTTOM", 1);
        BOTTOM = halfTileAlign2;
        HalfTileAlign[] halfTileAlignArr = {halfTileAlign, halfTileAlign2};
        $VALUES = halfTileAlignArr;
        $ENTRIES = new asp(halfTileAlignArr);
    }

    public HalfTileAlign() {
        throw null;
    }

    public static HalfTileAlign valueOf(String str) {
        return (HalfTileAlign) Enum.valueOf(HalfTileAlign.class, str);
    }

    public static HalfTileAlign[] values() {
        return (HalfTileAlign[]) $VALUES.clone();
    }
}
