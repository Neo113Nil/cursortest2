package androidx.compose.material3.tokens;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShapeKeyTokens.kt */
/* loaded from: classes11.dex */
public final class ShapeKeyTokens {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShapeKeyTokens[] $VALUES;
    public static final ShapeKeyTokens CornerExtraExtraLarge;
    public static final ShapeKeyTokens CornerExtraLarge;
    public static final ShapeKeyTokens CornerExtraLargeIncreased;
    public static final ShapeKeyTokens CornerExtraLargeTop;
    public static final ShapeKeyTokens CornerExtraSmall;
    public static final ShapeKeyTokens CornerExtraSmallTop;
    public static final ShapeKeyTokens CornerFull;
    public static final ShapeKeyTokens CornerLarge;
    public static final ShapeKeyTokens CornerLargeEnd;
    public static final ShapeKeyTokens CornerLargeIncreased;
    public static final ShapeKeyTokens CornerLargeStart;
    public static final ShapeKeyTokens CornerLargeTop;
    public static final ShapeKeyTokens CornerMedium;
    public static final ShapeKeyTokens CornerNone;
    public static final ShapeKeyTokens CornerSmall;

    static {
        ShapeKeyTokens shapeKeyTokens = new ShapeKeyTokens("CornerExtraExtraLarge", 0);
        CornerExtraExtraLarge = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = new ShapeKeyTokens("CornerExtraLarge", 1);
        CornerExtraLarge = shapeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens3 = new ShapeKeyTokens("CornerExtraLargeIncreased", 2);
        CornerExtraLargeIncreased = shapeKeyTokens3;
        ShapeKeyTokens shapeKeyTokens4 = new ShapeKeyTokens("CornerExtraLargeTop", 3);
        CornerExtraLargeTop = shapeKeyTokens4;
        ShapeKeyTokens shapeKeyTokens5 = new ShapeKeyTokens("CornerExtraSmall", 4);
        CornerExtraSmall = shapeKeyTokens5;
        ShapeKeyTokens shapeKeyTokens6 = new ShapeKeyTokens("CornerExtraSmallTop", 5);
        CornerExtraSmallTop = shapeKeyTokens6;
        ShapeKeyTokens shapeKeyTokens7 = new ShapeKeyTokens("CornerFull", 6);
        CornerFull = shapeKeyTokens7;
        ShapeKeyTokens shapeKeyTokens8 = new ShapeKeyTokens("CornerLarge", 7);
        CornerLarge = shapeKeyTokens8;
        ShapeKeyTokens shapeKeyTokens9 = new ShapeKeyTokens("CornerLargeEnd", 8);
        CornerLargeEnd = shapeKeyTokens9;
        ShapeKeyTokens shapeKeyTokens10 = new ShapeKeyTokens("CornerLargeIncreased", 9);
        CornerLargeIncreased = shapeKeyTokens10;
        ShapeKeyTokens shapeKeyTokens11 = new ShapeKeyTokens("CornerLargeStart", 10);
        CornerLargeStart = shapeKeyTokens11;
        ShapeKeyTokens shapeKeyTokens12 = new ShapeKeyTokens("CornerLargeTop", 11);
        CornerLargeTop = shapeKeyTokens12;
        ShapeKeyTokens shapeKeyTokens13 = new ShapeKeyTokens("CornerMedium", 12);
        CornerMedium = shapeKeyTokens13;
        ShapeKeyTokens shapeKeyTokens14 = new ShapeKeyTokens("CornerNone", 13);
        CornerNone = shapeKeyTokens14;
        ShapeKeyTokens shapeKeyTokens15 = new ShapeKeyTokens("CornerSmall", 14);
        CornerSmall = shapeKeyTokens15;
        ShapeKeyTokens[] shapeKeyTokensArr = {shapeKeyTokens, shapeKeyTokens2, shapeKeyTokens3, shapeKeyTokens4, shapeKeyTokens5, shapeKeyTokens6, shapeKeyTokens7, shapeKeyTokens8, shapeKeyTokens9, shapeKeyTokens10, shapeKeyTokens11, shapeKeyTokens12, shapeKeyTokens13, shapeKeyTokens14, shapeKeyTokens15};
        $VALUES = shapeKeyTokensArr;
        $ENTRIES = new asp(shapeKeyTokensArr);
    }

    public ShapeKeyTokens() {
        throw null;
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) $VALUES.clone();
    }
}
