package androidx.compose.ui.layout;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Layout.kt */
/* loaded from: classes11.dex */
public final class IntrinsicMinMax {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
    public static final IntrinsicMinMax Max;
    public static final IntrinsicMinMax Min;

    static {
        IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
        Min = intrinsicMinMax;
        IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
        Max = intrinsicMinMax2;
        IntrinsicMinMax[] intrinsicMinMaxArr = {intrinsicMinMax, intrinsicMinMax2};
        $VALUES = intrinsicMinMaxArr;
        $ENTRIES = new asp(intrinsicMinMaxArr);
    }

    public IntrinsicMinMax() {
        throw null;
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) $VALUES.clone();
    }
}
