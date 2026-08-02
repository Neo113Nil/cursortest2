package androidx.compose.foundation.layout;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsic.kt */
/* loaded from: classes11.dex */
public final class IntrinsicSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IntrinsicSize[] $VALUES;
    public static final IntrinsicSize Max;
    public static final IntrinsicSize Min;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        Min = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        Max = intrinsicSize2;
        IntrinsicSize[] intrinsicSizeArr = {intrinsicSize, intrinsicSize2};
        $VALUES = intrinsicSizeArr;
        $ENTRIES = new asp(intrinsicSizeArr);
    }

    public IntrinsicSize() {
        throw null;
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) $VALUES.clone();
    }
}
