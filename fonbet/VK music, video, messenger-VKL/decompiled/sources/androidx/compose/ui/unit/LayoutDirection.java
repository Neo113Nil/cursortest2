package androidx.compose.ui.unit;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutDirection.kt */
/* loaded from: classes11.dex */
public final class LayoutDirection {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LayoutDirection[] $VALUES;
    public static final LayoutDirection Ltr;
    public static final LayoutDirection Rtl;

    static {
        LayoutDirection layoutDirection = new LayoutDirection("Ltr", 0);
        Ltr = layoutDirection;
        LayoutDirection layoutDirection2 = new LayoutDirection("Rtl", 1);
        Rtl = layoutDirection2;
        LayoutDirection[] layoutDirectionArr = {layoutDirection, layoutDirection2};
        $VALUES = layoutDirectionArr;
        $ENTRIES = new asp(layoutDirectionArr);
    }

    public LayoutDirection() {
        throw null;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) $VALUES.clone();
    }
}
