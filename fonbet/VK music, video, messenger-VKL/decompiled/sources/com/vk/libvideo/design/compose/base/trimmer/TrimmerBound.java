package com.vk.libvideo.design.compose.base.trimmer;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrimmerInternalState.kt */
/* loaded from: classes2.dex */
public final class TrimmerBound {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TrimmerBound[] $VALUES;
    public static final TrimmerBound EXTERNAL;
    public static final TrimmerBound INTERNAL;
    public static final TrimmerBound LEFT;
    public static final TrimmerBound RIGHT;

    static {
        TrimmerBound trimmerBound = new TrimmerBound("LEFT", 0);
        LEFT = trimmerBound;
        TrimmerBound trimmerBound2 = new TrimmerBound("RIGHT", 1);
        RIGHT = trimmerBound2;
        TrimmerBound trimmerBound3 = new TrimmerBound("INTERNAL", 2);
        INTERNAL = trimmerBound3;
        TrimmerBound trimmerBound4 = new TrimmerBound("EXTERNAL", 3);
        EXTERNAL = trimmerBound4;
        TrimmerBound[] trimmerBoundArr = {trimmerBound, trimmerBound2, trimmerBound3, trimmerBound4};
        $VALUES = trimmerBoundArr;
        $ENTRIES = new asp(trimmerBoundArr);
    }

    public TrimmerBound() {
        throw null;
    }

    public static TrimmerBound valueOf(String str) {
        return (TrimmerBound) Enum.valueOf(TrimmerBound.class, str);
    }

    public static TrimmerBound[] values() {
        return (TrimmerBound[]) $VALUES.clone();
    }
}
