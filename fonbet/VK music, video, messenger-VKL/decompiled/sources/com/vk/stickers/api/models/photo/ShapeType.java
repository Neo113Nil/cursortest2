package com.vk.stickers.api.models.photo;

import xsna.asp;
import xsna.iah0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoStickerStyle.kt */
/* loaded from: classes5.dex */
public final class ShapeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShapeType[] $VALUES;
    public static final ShapeType CIRCLE;
    public static final ShapeType NONE;
    public static final ShapeType RECTANGLE;
    public static final ShapeType SQUARE;
    private final float cornerRadius;
    private final String key;

    static {
        float f = 2;
        ShapeType shapeType = new ShapeType("NONE", 0, "none", iah0.a(f));
        NONE = shapeType;
        ShapeType shapeType2 = new ShapeType("SQUARE", 1, "square", iah0.a(f));
        SQUARE = shapeType2;
        ShapeType shapeType3 = new ShapeType("RECTANGLE", 2, "rectangle", iah0.a(f));
        RECTANGLE = shapeType3;
        ShapeType shapeType4 = new ShapeType("CIRCLE", 3, "circle", Float.MAX_VALUE);
        CIRCLE = shapeType4;
        ShapeType[] shapeTypeArr = {shapeType, shapeType2, shapeType3, shapeType4};
        $VALUES = shapeTypeArr;
        $ENTRIES = new asp(shapeTypeArr);
    }

    public ShapeType(String str, int i, String str2, float f) {
        this.key = str2;
        this.cornerRadius = f;
    }

    public static ShapeType valueOf(String str) {
        return (ShapeType) Enum.valueOf(ShapeType.class, str);
    }

    public static ShapeType[] values() {
        return (ShapeType[]) $VALUES.clone();
    }

    public final float h() {
        return this.cornerRadius;
    }
}
