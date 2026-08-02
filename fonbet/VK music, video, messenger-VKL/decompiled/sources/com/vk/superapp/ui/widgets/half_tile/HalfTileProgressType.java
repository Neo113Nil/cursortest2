package com.vk.superapp.ui.widgets.half_tile;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class HalfTileProgressType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HalfTileProgressType[] $VALUES;
    public static final HalfTileProgressType NUMBER;
    public static final HalfTileProgressType PERCENT;
    public static final HalfTileProgressType UNKNOWN;

    static {
        HalfTileProgressType halfTileProgressType = new HalfTileProgressType("PERCENT", 0);
        PERCENT = halfTileProgressType;
        HalfTileProgressType halfTileProgressType2 = new HalfTileProgressType("NUMBER", 1);
        NUMBER = halfTileProgressType2;
        HalfTileProgressType halfTileProgressType3 = new HalfTileProgressType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = halfTileProgressType3;
        HalfTileProgressType[] halfTileProgressTypeArr = {halfTileProgressType, halfTileProgressType2, halfTileProgressType3};
        $VALUES = halfTileProgressTypeArr;
        $ENTRIES = new asp(halfTileProgressTypeArr);
    }

    public HalfTileProgressType() {
        throw null;
    }

    public static HalfTileProgressType valueOf(String str) {
        return (HalfTileProgressType) Enum.valueOf(HalfTileProgressType.class, str);
    }

    public static HalfTileProgressType[] values() {
        return (HalfTileProgressType[]) $VALUES.clone();
    }
}
