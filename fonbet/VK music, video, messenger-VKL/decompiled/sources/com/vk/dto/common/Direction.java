package com.vk.dto.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Direction.kt */
/* loaded from: classes18.dex */
public final class Direction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction AFTER;
    public static final Direction BEFORE;

    static {
        Direction direction = new Direction("AFTER", 0);
        AFTER = direction;
        Direction direction2 = new Direction("BEFORE", 1);
        BEFORE = direction2;
        Direction[] directionArr = {direction, direction2};
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
