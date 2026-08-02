package androidx.compose.ui.node;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeasureAndLayoutDelegate.kt */
/* loaded from: classes11.dex */
public final class Invalidation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Invalidation[] $VALUES;
    public static final Invalidation LookaheadMeasurement;
    public static final Invalidation LookaheadPlacement;
    public static final Invalidation Measurement;
    public static final Invalidation Placement;

    static {
        Invalidation invalidation = new Invalidation("LookaheadMeasurement", 0);
        LookaheadMeasurement = invalidation;
        Invalidation invalidation2 = new Invalidation("LookaheadPlacement", 1);
        LookaheadPlacement = invalidation2;
        Invalidation invalidation3 = new Invalidation("Measurement", 2);
        Measurement = invalidation3;
        Invalidation invalidation4 = new Invalidation("Placement", 3);
        Placement = invalidation4;
        Invalidation[] invalidationArr = {invalidation, invalidation2, invalidation3, invalidation4};
        $VALUES = invalidationArr;
        $ENTRIES = new asp(invalidationArr);
    }

    public Invalidation() {
        throw null;
    }

    public static Invalidation valueOf(String str) {
        return (Invalidation) Enum.valueOf(Invalidation.class, str);
    }

    public static Invalidation[] values() {
        return (Invalidation[]) $VALUES.clone();
    }
}
