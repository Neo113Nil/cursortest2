package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPlaceholderDefaults.kt */
/* loaded from: classes17.dex */
public final class PlaceholderSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaceholderSize[] $VALUES;
    public static final PlaceholderSize Large;
    public static final PlaceholderSize Medium;
    public static final PlaceholderSize Small;

    static {
        PlaceholderSize placeholderSize = new PlaceholderSize("Large", 0);
        Large = placeholderSize;
        PlaceholderSize placeholderSize2 = new PlaceholderSize("Medium", 1);
        Medium = placeholderSize2;
        PlaceholderSize placeholderSize3 = new PlaceholderSize("Small", 2);
        Small = placeholderSize3;
        PlaceholderSize[] placeholderSizeArr = {placeholderSize, placeholderSize2, placeholderSize3};
        $VALUES = placeholderSizeArr;
        $ENTRIES = new asp(placeholderSizeArr);
    }

    public PlaceholderSize() {
        throw null;
    }

    public static PlaceholderSize valueOf(String str) {
        return (PlaceholderSize) Enum.valueOf(PlaceholderSize.class, str);
    }

    public static PlaceholderSize[] values() {
        return (PlaceholderSize[]) $VALUES.clone();
    }
}
