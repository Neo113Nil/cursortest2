package com.vk.core.compose.component.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TileDefaults.kt */
/* loaded from: classes17.dex */
public final class TileContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TileContentType[] $VALUES;
    public static final TileContentType Avatar;
    public static final TileContentType Other;

    static {
        TileContentType tileContentType = new TileContentType("Avatar", 0);
        Avatar = tileContentType;
        TileContentType tileContentType2 = new TileContentType("Other", 1);
        Other = tileContentType2;
        TileContentType[] tileContentTypeArr = {tileContentType, tileContentType2};
        $VALUES = tileContentTypeArr;
        $ENTRIES = new asp(tileContentTypeArr);
    }

    public TileContentType() {
        throw null;
    }

    public static TileContentType valueOf(String str) {
        return (TileContentType) Enum.valueOf(TileContentType.class, str);
    }

    public static TileContentType[] values() {
        return (TileContentType[]) $VALUES.clone();
    }
}
