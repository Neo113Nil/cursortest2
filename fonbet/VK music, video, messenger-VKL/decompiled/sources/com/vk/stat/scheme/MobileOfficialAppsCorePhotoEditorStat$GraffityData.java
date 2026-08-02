package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$GraffityData {

    @pmi0("brush")
    private final Brush brush;

    @pmi0("color")
    private final String color;

    @pmi0("size")
    private final Integer size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
    public static final class Brush {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Brush[] $VALUES;

        @pmi0("arrow")
        public static final Brush ARROW;

        @pmi0("eraser")
        public static final Brush ERASER;

        @pmi0("glow")
        public static final Brush GLOW;

        @pmi0("marker")
        public static final Brush MARKER;

        @pmi0("pen")
        public static final Brush PEN;

        static {
            Brush brush = new Brush("PEN", 0);
            PEN = brush;
            Brush brush2 = new Brush("ARROW", 1);
            ARROW = brush2;
            Brush brush3 = new Brush("MARKER", 2);
            MARKER = brush3;
            Brush brush4 = new Brush("GLOW", 3);
            GLOW = brush4;
            Brush brush5 = new Brush("ERASER", 4);
            ERASER = brush5;
            Brush[] brushArr = {brush, brush2, brush3, brush4, brush5};
            $VALUES = brushArr;
            $ENTRIES = new asp(brushArr);
        }

        private Brush(String str, int i) {
        }

        public static Brush valueOf(String str) {
            return (Brush) Enum.valueOf(Brush.class, str);
        }

        public static Brush[] values() {
            return (Brush[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePhotoEditorStat$GraffityData() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePhotoEditorStat$GraffityData)) {
            return false;
        }
        MobileOfficialAppsCorePhotoEditorStat$GraffityData mobileOfficialAppsCorePhotoEditorStat$GraffityData = (MobileOfficialAppsCorePhotoEditorStat$GraffityData) obj;
        return epx.f(this.size, mobileOfficialAppsCorePhotoEditorStat$GraffityData.size) && epx.f(this.color, mobileOfficialAppsCorePhotoEditorStat$GraffityData.color) && this.brush == mobileOfficialAppsCorePhotoEditorStat$GraffityData.brush;
    }

    public final int hashCode() {
        Integer num = this.size;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Brush brush = this.brush;
        return hashCode2 + (brush != null ? brush.hashCode() : 0);
    }

    public final String toString() {
        return "GraffityData(size=" + this.size + ", color=" + this.color + ", brush=" + this.brush + ')';
    }

    public MobileOfficialAppsCorePhotoEditorStat$GraffityData(Integer num, String str, Brush brush) {
        this.size = num;
        this.color = str;
        this.brush = brush;
    }

    public /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$GraffityData(Integer num, String str, Brush brush, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : brush);
    }
}
