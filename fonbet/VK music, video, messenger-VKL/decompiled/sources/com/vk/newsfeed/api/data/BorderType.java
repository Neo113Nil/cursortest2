package com.vk.newsfeed.api.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BorderType.kt */
/* loaded from: classes3.dex */
public final class BorderType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BorderType[] $VALUES;
    public static final BorderType BOTTOM;
    public static final BorderType MIDDLE;
    public static final BorderType NONE;
    public static final BorderType TOP;
    private final int type;

    static {
        BorderType borderType = new BorderType("NONE", 0, 0);
        NONE = borderType;
        BorderType borderType2 = new BorderType("TOP", 1, 1);
        TOP = borderType2;
        BorderType borderType3 = new BorderType("BOTTOM", 2, 2);
        BOTTOM = borderType3;
        BorderType borderType4 = new BorderType("MIDDLE", 3, 4);
        MIDDLE = borderType4;
        BorderType[] borderTypeArr = {borderType, borderType2, borderType3, borderType4};
        $VALUES = borderTypeArr;
        $ENTRIES = new asp(borderTypeArr);
    }

    public BorderType(String str, int i, int i2) {
        this.type = i2;
    }

    public static BorderType valueOf(String str) {
        return (BorderType) Enum.valueOf(BorderType.class, str);
    }

    public static BorderType[] values() {
        return (BorderType[]) $VALUES.clone();
    }

    public final int h() {
        return this.type;
    }
}
