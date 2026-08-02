package com.vk.catalog2.common.dto.api.layout;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutSize.kt */
/* loaded from: classes16.dex */
public final class LayoutSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LayoutSize[] $VALUES;
    public static final a Companion;
    public static final LayoutSize EXTRA_LARGE;
    public static final LayoutSize EXTRA_SMALL;
    public static final LayoutSize LARGE;
    public static final LayoutSize MEDIUM;
    public static final LayoutSize NO_INSETS;
    public static final LayoutSize SMALL;
    private final String id;

    /* compiled from: LayoutSize.kt */
    public static final class a {
        public static LayoutSize a(String str) {
            for (LayoutSize layoutSize : LayoutSize.values()) {
                if (epx.f(layoutSize.getId(), str)) {
                    return layoutSize;
                }
            }
            return null;
        }
    }

    static {
        LayoutSize layoutSize = new LayoutSize("SMALL", 0, "small");
        SMALL = layoutSize;
        LayoutSize layoutSize2 = new LayoutSize("MEDIUM", 1, "medium");
        MEDIUM = layoutSize2;
        LayoutSize layoutSize3 = new LayoutSize("LARGE", 2, "large");
        LARGE = layoutSize3;
        LayoutSize layoutSize4 = new LayoutSize("NO_INSETS", 3, "no_insets");
        NO_INSETS = layoutSize4;
        LayoutSize layoutSize5 = new LayoutSize("EXTRA_SMALL", 4, "extra_small");
        EXTRA_SMALL = layoutSize5;
        LayoutSize layoutSize6 = new LayoutSize("EXTRA_LARGE", 5, "extra_large");
        EXTRA_LARGE = layoutSize6;
        LayoutSize[] layoutSizeArr = {layoutSize, layoutSize2, layoutSize3, layoutSize4, layoutSize5, layoutSize6};
        $VALUES = layoutSizeArr;
        $ENTRIES = new asp(layoutSizeArr);
        Companion = new a();
    }

    public LayoutSize(String str, int i, String str2) {
        this.id = str2;
    }

    public static LayoutSize valueOf(String str) {
        return (LayoutSize) Enum.valueOf(LayoutSize.class, str);
    }

    public static LayoutSize[] values() {
        return (LayoutSize[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
