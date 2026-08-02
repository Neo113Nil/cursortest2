package ru.ozon.uni.core.models;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/core/models/GradientDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_BOTTOM", "TR_BL", "RIGHT_LEFT", "BR_TL", "BOTTOM_TOP", "BL_TR", "LEFT_RIGHT", "TL_BR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GradientDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GradientDirection[] $VALUES;
    public static final GradientDirection TOP_BOTTOM = new GradientDirection("TOP_BOTTOM", 0);
    public static final GradientDirection TR_BL = new GradientDirection("TR_BL", 1);
    public static final GradientDirection RIGHT_LEFT = new GradientDirection("RIGHT_LEFT", 2);
    public static final GradientDirection BR_TL = new GradientDirection("BR_TL", 3);
    public static final GradientDirection BOTTOM_TOP = new GradientDirection("BOTTOM_TOP", 4);
    public static final GradientDirection BL_TR = new GradientDirection("BL_TR", 5);
    public static final GradientDirection LEFT_RIGHT = new GradientDirection("LEFT_RIGHT", 6);
    public static final GradientDirection TL_BR = new GradientDirection("TL_BR", 7);

    private static final /* synthetic */ GradientDirection[] $values() {
        return new GradientDirection[]{TOP_BOTTOM, TR_BL, RIGHT_LEFT, BR_TL, BOTTOM_TOP, BL_TR, LEFT_RIGHT, TL_BR};
    }

    static {
        GradientDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private GradientDirection(String str, int i11) {
    }

    @NotNull
    public static a<GradientDirection> getEntries() {
        return $ENTRIES;
    }

    public static GradientDirection valueOf(String str) {
        return (GradientDirection) Enum.valueOf(GradientDirection.class, str);
    }

    public static GradientDirection[] values() {
        return (GradientDirection[]) $VALUES.clone();
    }
}
