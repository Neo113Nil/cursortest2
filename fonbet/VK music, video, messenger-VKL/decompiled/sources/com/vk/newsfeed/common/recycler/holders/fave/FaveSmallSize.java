package com.vk.newsfeed.common.recycler.holders.fave;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveSmallHolder.kt */
/* loaded from: classes4.dex */
public final class FaveSmallSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveSmallSize[] $VALUES;
    public static final FaveSmallSize BIG;
    public static final FaveSmallSize SMALL;
    public static final FaveSmallSize SQUARE;

    static {
        FaveSmallSize faveSmallSize = new FaveSmallSize("SMALL", 0);
        SMALL = faveSmallSize;
        FaveSmallSize faveSmallSize2 = new FaveSmallSize("BIG", 1);
        BIG = faveSmallSize2;
        FaveSmallSize faveSmallSize3 = new FaveSmallSize("SQUARE", 2);
        SQUARE = faveSmallSize3;
        FaveSmallSize[] faveSmallSizeArr = {faveSmallSize, faveSmallSize2, faveSmallSize3};
        $VALUES = faveSmallSizeArr;
        $ENTRIES = new asp(faveSmallSizeArr);
    }

    public FaveSmallSize() {
        throw null;
    }

    public static FaveSmallSize valueOf(String str) {
        return (FaveSmallSize) Enum.valueOf(FaveSmallSize.class, str);
    }

    public static FaveSmallSize[] values() {
        return (FaveSmallSize[]) $VALUES.clone();
    }
}
