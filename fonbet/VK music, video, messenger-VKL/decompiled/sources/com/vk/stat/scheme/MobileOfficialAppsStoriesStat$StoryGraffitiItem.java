package com.vk.stat.scheme;

import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.hay;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsStoriesStat$StoryGraffitiItem {
    public final transient String a;

    @pmi0("brush")
    private final Brush brush;

    @pmi0("color")
    private final FilteredString filteredColor;

    @pmi0("size")
    private final Size size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class Brush {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Brush[] $VALUES;
        public static final Brush BRUSH_ARROW;
        public static final Brush BRUSH_ERASER;
        public static final Brush BRUSH_MARKER;
        public static final Brush BRUSH_NEON;
        public static final Brush BRUSH_PEN;
        private final int value;

        /* compiled from: MobileOfficialAppsStoriesStat.kt */
        public static final class Serializer implements uay<Brush> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((Brush) obj).value));
            }
        }

        static {
            Brush brush = new Brush("BRUSH_ERASER", 0, 0);
            BRUSH_ERASER = brush;
            Brush brush2 = new Brush("BRUSH_PEN", 1, 1);
            BRUSH_PEN = brush2;
            Brush brush3 = new Brush("BRUSH_MARKER", 2, 2);
            BRUSH_MARKER = brush3;
            Brush brush4 = new Brush("BRUSH_NEON", 3, 3);
            BRUSH_NEON = brush4;
            Brush brush5 = new Brush("BRUSH_ARROW", 4, 4);
            BRUSH_ARROW = brush5;
            Brush[] brushArr = {brush, brush2, brush3, brush4, brush5};
            $VALUES = brushArr;
            $ENTRIES = new asp(brushArr);
        }

        public Brush(String str, int i, int i2) {
            this.value = i2;
        }

        public static Brush valueOf(String str) {
            return (Brush) Enum.valueOf(Brush.class, str);
        }

        public static Brush[] values() {
            return (Brush[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsStoriesStat$StoryGraffitiItem>, a9y<MobileOfficialAppsStoriesStat$StoryGraffitiItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsStoriesStat$StoryGraffitiItem((Brush) dq.f(x9yVar, "brush", tru.a(), Brush.class), (Size) dq.f(x9yVar, "size", tru.a(), Size.class), fai.s(x9yVar, "color"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsStoriesStat$StoryGraffitiItem mobileOfficialAppsStoriesStat$StoryGraffitiItem = (MobileOfficialAppsStoriesStat$StoryGraffitiItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("brush", tru.a().toJson(mobileOfficialAppsStoriesStat$StoryGraffitiItem.a()));
            x9yVar.o("size", tru.a().toJson(mobileOfficialAppsStoriesStat$StoryGraffitiItem.b()));
            x9yVar.o("color", mobileOfficialAppsStoriesStat$StoryGraffitiItem.a);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    /* loaded from: classes5.dex */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        @pmi0("size_100")
        public static final Size SIZE_100;

        @pmi0("size_20")
        public static final Size SIZE_20;

        @pmi0("size_40")
        public static final Size SIZE_40;

        @pmi0("size_60")
        public static final Size SIZE_60;

        @pmi0("size_80")
        public static final Size SIZE_80;

        static {
            Size size = new Size("SIZE_20", 0);
            SIZE_20 = size;
            Size size2 = new Size("SIZE_40", 1);
            SIZE_40 = size2;
            Size size3 = new Size("SIZE_60", 2);
            SIZE_60 = size3;
            Size size4 = new Size("SIZE_80", 3);
            SIZE_80 = size4;
            Size size5 = new Size("SIZE_100", 4);
            SIZE_100 = size5;
            Size[] sizeArr = {size, size2, size3, size4, size5};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        private Size(String str, int i) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsStoriesStat$StoryGraffitiItem(Brush brush, Size size, String str) {
        this.brush = brush;
        this.size = size;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(7));
        this.filteredColor = filteredString;
        filteredString.a(str);
    }

    public final Brush a() {
        return this.brush;
    }

    public final Size b() {
        return this.size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$StoryGraffitiItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$StoryGraffitiItem mobileOfficialAppsStoriesStat$StoryGraffitiItem = (MobileOfficialAppsStoriesStat$StoryGraffitiItem) obj;
        return this.brush == mobileOfficialAppsStoriesStat$StoryGraffitiItem.brush && this.size == mobileOfficialAppsStoriesStat$StoryGraffitiItem.size && epx.f(this.a, mobileOfficialAppsStoriesStat$StoryGraffitiItem.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.size.hashCode() + (this.brush.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryGraffitiItem(brush=");
        sb.append(this.brush);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", color=");
        return ho8.a(sb, this.a, ')');
    }
}
