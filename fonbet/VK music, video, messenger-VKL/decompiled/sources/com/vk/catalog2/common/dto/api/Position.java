package com.vk.catalog2.common.dto.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TitleIcon.kt */
/* loaded from: classes16.dex */
public final class Position {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Position[] $VALUES;
    public static final a Companion;
    public static final Position POSITION_AFTER;
    public static final Position POSITION_BEFORE;
    private final String serverName;

    /* compiled from: TitleIcon.kt */
    public static final class a {
    }

    static {
        Position position = new Position("POSITION_BEFORE", 0, "before");
        POSITION_BEFORE = position;
        Position position2 = new Position("POSITION_AFTER", 1, "after");
        POSITION_AFTER = position2;
        Position[] positionArr = {position, position2};
        $VALUES = positionArr;
        $ENTRIES = new asp(positionArr);
        Companion = new a();
    }

    public Position(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
