package com.vk.friends.discover;

import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Direction.kt */
/* loaded from: classes13.dex */
public final class Direction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction Bottom;
    public static final a Companion;
    private static final List<Direction> HORIZONTAL;
    public static final Direction Left;
    public static final Direction Right;
    public static final Direction Top;
    private static final List<Direction> VERTICAL;

    /* compiled from: Direction.kt */
    public static final class a {
    }

    static {
        Direction direction = new Direction("Left", 0);
        Left = direction;
        Direction direction2 = new Direction("Right", 1);
        Right = direction2;
        Direction direction3 = new Direction("Top", 2);
        Top = direction3;
        Direction direction4 = new Direction("Bottom", 3);
        Bottom = direction4;
        Direction[] directionArr = {direction, direction2, direction3, direction4};
        $VALUES = directionArr;
        $ENTRIES = new asp(directionArr);
        Companion = new a();
        HORIZONTAL = e43.l(direction, direction2);
        VERTICAL = e43.l(direction3, direction4);
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
