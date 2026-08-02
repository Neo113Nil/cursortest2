package com.vk.core.sticky_header;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScrollRepository.kt */
/* loaded from: classes17.dex */
public final class OffsetOrientation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OffsetOrientation[] $VALUES;
    public static final OffsetOrientation HORIZONTAL;
    public static final OffsetOrientation VERTICAL;

    static {
        OffsetOrientation offsetOrientation = new OffsetOrientation("VERTICAL", 0);
        VERTICAL = offsetOrientation;
        OffsetOrientation offsetOrientation2 = new OffsetOrientation("HORIZONTAL", 1);
        HORIZONTAL = offsetOrientation2;
        OffsetOrientation[] offsetOrientationArr = {offsetOrientation, offsetOrientation2};
        $VALUES = offsetOrientationArr;
        $ENTRIES = new asp(offsetOrientationArr);
    }

    public OffsetOrientation() {
        throw null;
    }

    public static OffsetOrientation valueOf(String str) {
        return (OffsetOrientation) Enum.valueOf(OffsetOrientation.class, str);
    }

    public static OffsetOrientation[] values() {
        return (OffsetOrientation[]) $VALUES.clone();
    }
}
