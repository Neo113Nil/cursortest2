package com.vk.attachpicker.impl.graffiti.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrushType.kt */
/* loaded from: classes15.dex */
public final class BrushType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BrushType[] $VALUES;
    public static final BrushType Arrow;
    public static final BrushType Eraser;
    public static final BrushType Glow;
    public static final BrushType Marker;
    public static final BrushType Pen;

    static {
        BrushType brushType = new BrushType("Pen", 0);
        Pen = brushType;
        BrushType brushType2 = new BrushType("Arrow", 1);
        Arrow = brushType2;
        BrushType brushType3 = new BrushType("Marker", 2);
        Marker = brushType3;
        BrushType brushType4 = new BrushType("Glow", 3);
        Glow = brushType4;
        BrushType brushType5 = new BrushType("Eraser", 4);
        Eraser = brushType5;
        BrushType[] brushTypeArr = {brushType, brushType2, brushType3, brushType4, brushType5};
        $VALUES = brushTypeArr;
        $ENTRIES = new asp(brushTypeArr);
    }

    public BrushType() {
        throw null;
    }

    public static BrushType valueOf(String str) {
        return (BrushType) Enum.valueOf(BrushType.class, str);
    }

    public static BrushType[] values() {
        return (BrushType[]) $VALUES.clone();
    }
}
