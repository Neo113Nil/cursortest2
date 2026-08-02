package com.vk.superapp.ui.widgets.half_tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class HalfTileTitleSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HalfTileTitleSize[] $VALUES;
    public static final HalfTileTitleSize LARGE;
    public static final HalfTileTitleSize REGULAR;

    static {
        HalfTileTitleSize halfTileTitleSize = new HalfTileTitleSize("REGULAR", 0);
        REGULAR = halfTileTitleSize;
        HalfTileTitleSize halfTileTitleSize2 = new HalfTileTitleSize("LARGE", 1);
        LARGE = halfTileTitleSize2;
        HalfTileTitleSize[] halfTileTitleSizeArr = {halfTileTitleSize, halfTileTitleSize2};
        $VALUES = halfTileTitleSizeArr;
        $ENTRIES = new asp(halfTileTitleSizeArr);
    }

    public HalfTileTitleSize() {
        throw null;
    }

    public static HalfTileTitleSize valueOf(String str) {
        return (HalfTileTitleSize) Enum.valueOf(HalfTileTitleSize.class, str);
    }

    public static HalfTileTitleSize[] values() {
        return (HalfTileTitleSize[]) $VALUES.clone();
    }
}
