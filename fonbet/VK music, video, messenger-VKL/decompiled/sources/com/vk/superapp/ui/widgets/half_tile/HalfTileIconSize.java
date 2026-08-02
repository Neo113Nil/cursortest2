package com.vk.superapp.ui.widgets.half_tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class HalfTileIconSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HalfTileIconSize[] $VALUES;
    public static final HalfTileIconSize LARGE;
    public static final HalfTileIconSize REGULAR;

    static {
        HalfTileIconSize halfTileIconSize = new HalfTileIconSize("REGULAR", 0);
        REGULAR = halfTileIconSize;
        HalfTileIconSize halfTileIconSize2 = new HalfTileIconSize("LARGE", 1);
        LARGE = halfTileIconSize2;
        HalfTileIconSize[] halfTileIconSizeArr = {halfTileIconSize, halfTileIconSize2};
        $VALUES = halfTileIconSizeArr;
        $ENTRIES = new asp(halfTileIconSizeArr);
    }

    public HalfTileIconSize() {
        throw null;
    }

    public static HalfTileIconSize valueOf(String str) {
        return (HalfTileIconSize) Enum.valueOf(HalfTileIconSize.class, str);
    }

    public static HalfTileIconSize[] values() {
        return (HalfTileIconSize[]) $VALUES.clone();
    }
}
