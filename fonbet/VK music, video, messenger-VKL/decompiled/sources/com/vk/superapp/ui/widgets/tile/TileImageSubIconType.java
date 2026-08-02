package com.vk.superapp.ui.widgets.tile;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TileBackgroundImage.kt */
/* loaded from: classes6.dex */
public final class TileImageSubIconType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TileImageSubIconType[] $VALUES;
    public static final TileImageSubIconType ICON;
    public static final TileImageSubIconType TEXT;
    public static final TileImageSubIconType VERIFIED;

    static {
        TileImageSubIconType tileImageSubIconType = new TileImageSubIconType("VERIFIED", 0);
        VERIFIED = tileImageSubIconType;
        TileImageSubIconType tileImageSubIconType2 = new TileImageSubIconType(NativeAdContent.ViewTag.AD_ICON, 1);
        ICON = tileImageSubIconType2;
        TileImageSubIconType tileImageSubIconType3 = new TileImageSubIconType("TEXT", 2);
        TEXT = tileImageSubIconType3;
        TileImageSubIconType[] tileImageSubIconTypeArr = {tileImageSubIconType, tileImageSubIconType2, tileImageSubIconType3};
        $VALUES = tileImageSubIconTypeArr;
        $ENTRIES = new asp(tileImageSubIconTypeArr);
    }

    public TileImageSubIconType() {
        throw null;
    }

    public static TileImageSubIconType valueOf(String str) {
        return (TileImageSubIconType) Enum.valueOf(TileImageSubIconType.class, str);
    }

    public static TileImageSubIconType[] values() {
        return (TileImageSubIconType[]) $VALUES.clone();
    }
}
