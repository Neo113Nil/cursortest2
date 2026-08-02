package com.vk.core.tool.view.galvitalayout;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChildSize.kt */
/* loaded from: classes17.dex */
public final class ChildSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChildSize[] $VALUES;
    public static final a Companion;
    public static final ChildSize NARROW;
    public static final ChildSize SQUARE;
    public static final ChildSize WIDE;
    private final float ratio;

    /* compiled from: ChildSize.kt */
    public static final class a {
        public static ChildSize a(float f) {
            ChildSize childSize = ChildSize.NARROW;
            float h = childSize.h();
            if (Math.abs(f - h) < 0.01d) {
                return childSize;
            }
            if (f < h) {
                return childSize;
            }
            ChildSize childSize2 = ChildSize.WIDE;
            float h2 = childSize2.h();
            return ((double) Math.abs(f - h2)) < 0.01d ? childSize2 : f > h2 ? childSize2 : ChildSize.SQUARE;
        }
    }

    static {
        ChildSize childSize = new ChildSize("SQUARE", 0, 1.0f);
        SQUARE = childSize;
        ChildSize childSize2 = new ChildSize("NARROW", 1, 0.75f);
        NARROW = childSize2;
        ChildSize childSize3 = new ChildSize("WIDE", 2, 1.3333334f);
        WIDE = childSize3;
        ChildSize[] childSizeArr = {childSize, childSize2, childSize3};
        $VALUES = childSizeArr;
        $ENTRIES = new asp(childSizeArr);
        Companion = new a();
    }

    public ChildSize(String str, int i, float f) {
        this.ratio = f;
    }

    public static ChildSize valueOf(String str) {
        return (ChildSize) Enum.valueOf(ChildSize.class, str);
    }

    public static ChildSize[] values() {
        return (ChildSize[]) $VALUES.clone();
    }

    public final float h() {
        return this.ratio;
    }
}
