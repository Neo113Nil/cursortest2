package com.vk.superapp.catalog.impl.v1.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppItems.kt */
/* loaded from: classes6.dex */
public final class Placement {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Placement[] $VALUES;
    public static final Placement BOTTOM;
    public static final Placement MIDDLE;
    public static final Placement TOP;

    static {
        Placement placement = new Placement("TOP", 0);
        TOP = placement;
        Placement placement2 = new Placement("MIDDLE", 1);
        MIDDLE = placement2;
        Placement placement3 = new Placement("BOTTOM", 2);
        BOTTOM = placement3;
        Placement[] placementArr = {placement, placement2, placement3};
        $VALUES = placementArr;
        $ENTRIES = new asp(placementArr);
    }

    public Placement() {
        throw null;
    }

    public static Placement valueOf(String str) {
        return (Placement) Enum.valueOf(Placement.class, str);
    }

    public static Placement[] values() {
        return (Placement[]) $VALUES.clone();
    }
}
