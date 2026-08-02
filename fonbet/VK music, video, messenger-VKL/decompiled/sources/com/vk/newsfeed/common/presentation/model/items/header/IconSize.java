package com.vk.newsfeed.common.presentation.model.items.header;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostHeaderHolderBindUiDto.kt */
/* loaded from: classes4.dex */
public final class IconSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconSize[] $VALUES;
    public static final IconSize DP_12;
    public static final IconSize DP_16;

    static {
        IconSize iconSize = new IconSize("DP_12", 0);
        DP_12 = iconSize;
        IconSize iconSize2 = new IconSize("DP_16", 1);
        DP_16 = iconSize2;
        IconSize[] iconSizeArr = {iconSize, iconSize2};
        $VALUES = iconSizeArr;
        $ENTRIES = new asp(iconSizeArr);
    }

    public IconSize() {
        throw null;
    }

    public static IconSize valueOf(String str) {
        return (IconSize) Enum.valueOf(IconSize.class, str);
    }

    public static IconSize[] values() {
        return (IconSize[]) $VALUES.clone();
    }
}
