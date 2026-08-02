package com.vk.superapp.ui.widgets;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppWidgetSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppWidgetSize[] $VALUES;
    public static final SuperAppWidgetSize COMPACT;
    public static final SuperAppWidgetSize REGULAR;

    static {
        SuperAppWidgetSize superAppWidgetSize = new SuperAppWidgetSize("REGULAR", 0);
        REGULAR = superAppWidgetSize;
        SuperAppWidgetSize superAppWidgetSize2 = new SuperAppWidgetSize("COMPACT", 1);
        COMPACT = superAppWidgetSize2;
        SuperAppWidgetSize[] superAppWidgetSizeArr = {superAppWidgetSize, superAppWidgetSize2};
        $VALUES = superAppWidgetSizeArr;
        $ENTRIES = new asp(superAppWidgetSizeArr);
    }

    public SuperAppWidgetSize() {
        throw null;
    }

    public static SuperAppWidgetSize valueOf(String str) {
        return (SuperAppWidgetSize) Enum.valueOf(SuperAppWidgetSize.class, str);
    }

    public static SuperAppWidgetSize[] values() {
        return (SuperAppWidgetSize[]) $VALUES.clone();
    }
}
