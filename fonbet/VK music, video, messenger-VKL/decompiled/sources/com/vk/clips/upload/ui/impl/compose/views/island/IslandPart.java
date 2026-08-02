package com.vk.clips.upload.ui.impl.compose.views.island;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IslandPart.kt */
/* loaded from: classes17.dex */
public final class IslandPart {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IslandPart[] $VALUES;
    public static final IslandPart Bottom;
    public static final IslandPart Middle;
    public static final IslandPart None;
    public static final IslandPart Top;

    static {
        IslandPart islandPart = new IslandPart("Top", 0);
        Top = islandPart;
        IslandPart islandPart2 = new IslandPart("Middle", 1);
        Middle = islandPart2;
        IslandPart islandPart3 = new IslandPart("Bottom", 2);
        Bottom = islandPart3;
        IslandPart islandPart4 = new IslandPart("None", 3);
        None = islandPart4;
        IslandPart[] islandPartArr = {islandPart, islandPart2, islandPart3, islandPart4};
        $VALUES = islandPartArr;
        $ENTRIES = new asp(islandPartArr);
    }

    public IslandPart() {
        throw null;
    }

    public static IslandPart valueOf(String str) {
        return (IslandPart) Enum.valueOf(IslandPart.class, str);
    }

    public static IslandPart[] values() {
        return (IslandPart[]) $VALUES.clone();
    }
}
