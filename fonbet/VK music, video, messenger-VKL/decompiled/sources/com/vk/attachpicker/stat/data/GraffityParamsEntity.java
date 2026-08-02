package com.vk.attachpicker.stat.data;

import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.zrp;

/* compiled from: GraffityParamsEntity.kt */
/* loaded from: classes15.dex */
public final class GraffityParamsEntity {
    public final Integer a;
    public final int b;
    public final int c;
    public final int d;
    public final BrushType e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GraffityParamsEntity.kt */
    public static final class BrushType {
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

    public GraffityParamsEntity(Integer num, int i, int i2, int i3, BrushType brushType) {
        this.a = num;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = brushType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraffityParamsEntity)) {
            return false;
        }
        GraffityParamsEntity graffityParamsEntity = (GraffityParamsEntity) obj;
        return epx.f(this.a, graffityParamsEntity.a) && this.b == graffityParamsEntity.b && this.c == graffityParamsEntity.c && this.d == graffityParamsEntity.d && this.e == graffityParamsEntity.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.e.hashCode() + shy.a(this.d, shy.a(this.c, shy.a(this.b, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "GraffityParamsEntity(id=" + this.a + ", photoId=" + this.b + ", size=" + this.c + ", color=" + this.d + ", brush=" + this.e + ')';
    }
}
