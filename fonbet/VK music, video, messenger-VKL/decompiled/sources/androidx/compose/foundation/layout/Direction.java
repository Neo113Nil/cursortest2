package androidx.compose.foundation.layout;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Size.kt */
/* loaded from: classes11.dex */
public final class Direction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction Both;
    public static final Direction Horizontal;
    public static final Direction Vertical;

    static {
        Direction direction = new Direction("Vertical", 0);
        Vertical = direction;
        Direction direction2 = new Direction("Horizontal", 1);
        Horizontal = direction2;
        Direction direction3 = new Direction("Both", 2);
        Both = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        $VALUES = directionArr;
        $ENTRIES = new asp(directionArr);
    }

    public Direction() {
        throw null;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
