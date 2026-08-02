package ru.ozon.uni.core.models;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/core/models/UniGradientDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TopBottom", "TopRightBottomLeft", "RightLeft", "BottomRightTopLeft", "BottomTop", "BottomLeftTopRight", "LeftRight", "TopLeftBottomRight", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniGradientDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniGradientDirection[] $VALUES;
    public static final UniGradientDirection TopBottom = new UniGradientDirection("TopBottom", 0);
    public static final UniGradientDirection TopRightBottomLeft = new UniGradientDirection("TopRightBottomLeft", 1);
    public static final UniGradientDirection RightLeft = new UniGradientDirection("RightLeft", 2);
    public static final UniGradientDirection BottomRightTopLeft = new UniGradientDirection("BottomRightTopLeft", 3);
    public static final UniGradientDirection BottomTop = new UniGradientDirection("BottomTop", 4);
    public static final UniGradientDirection BottomLeftTopRight = new UniGradientDirection("BottomLeftTopRight", 5);
    public static final UniGradientDirection LeftRight = new UniGradientDirection("LeftRight", 6);
    public static final UniGradientDirection TopLeftBottomRight = new UniGradientDirection("TopLeftBottomRight", 7);

    private static final /* synthetic */ UniGradientDirection[] $values() {
        return new UniGradientDirection[]{TopBottom, TopRightBottomLeft, RightLeft, BottomRightTopLeft, BottomTop, BottomLeftTopRight, LeftRight, TopLeftBottomRight};
    }

    static {
        UniGradientDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniGradientDirection(String str, int i11) {
    }

    public static UniGradientDirection valueOf(String str) {
        return (UniGradientDirection) Enum.valueOf(UniGradientDirection.class, str);
    }

    public static UniGradientDirection[] values() {
        return (UniGradientDirection[]) $VALUES.clone();
    }
}
