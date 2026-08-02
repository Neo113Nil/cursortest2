package com.vk.core.compose.utils.swipable;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismiss.kt */
/* loaded from: classes17.dex */
public final class DismissValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DismissValue[] $VALUES;
    public static final DismissValue Default;
    public static final DismissValue DismissedToBottom;
    public static final DismissValue DismissedToEnd;
    public static final DismissValue DismissedToStart;
    public static final DismissValue DismissedToTop;

    static {
        DismissValue dismissValue = new DismissValue("Default", 0);
        Default = dismissValue;
        DismissValue dismissValue2 = new DismissValue("DismissedToEnd", 1);
        DismissedToEnd = dismissValue2;
        DismissValue dismissValue3 = new DismissValue("DismissedToStart", 2);
        DismissedToStart = dismissValue3;
        DismissValue dismissValue4 = new DismissValue("DismissedToBottom", 3);
        DismissedToBottom = dismissValue4;
        DismissValue dismissValue5 = new DismissValue("DismissedToTop", 4);
        DismissedToTop = dismissValue5;
        DismissValue[] dismissValueArr = {dismissValue, dismissValue2, dismissValue3, dismissValue4, dismissValue5};
        $VALUES = dismissValueArr;
        $ENTRIES = new asp(dismissValueArr);
    }

    public DismissValue() {
        throw null;
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) $VALUES.clone();
    }
}
