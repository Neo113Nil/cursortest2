package androidx.compose.foundation.text.selection;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionLayout.kt */
/* loaded from: classes11.dex */
public final class Direction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction AFTER;
    public static final Direction BEFORE;
    public static final Direction ON;

    static {
        Direction direction = new Direction("BEFORE", 0);
        BEFORE = direction;
        Direction direction2 = new Direction("ON", 1);
        ON = direction2;
        Direction direction3 = new Direction("AFTER", 2);
        AFTER = direction3;
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
