package com.vk.camera.editor.stories.impl.base;

import com.vk.photo.editor.markup.view.DrawingView;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import xsna.alk;
import xsna.asp;
import xsna.shy;
import xsna.vu5;
import xsna.y8g;
import xsna.zrp;

/* compiled from: StoryDrawingManager.kt */
/* loaded from: classes16.dex */
public final class StoryDrawingManager {
    public static final int b = alk.p(3);
    public static final int c = alk.p(50);
    public static final int d = alk.p(2);
    public static final int e = alk.p(10);
    public static final y8g.c f = new y8g.c(-1);
    public final DrawingView a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryDrawingManager.kt */
    public static final class BrushTypeMeta {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BrushTypeMeta[] $VALUES;
        public static final BrushTypeMeta ARROW;
        public static final BrushTypeMeta ERASER;
        public static final BrushTypeMeta MARKER;
        public static final BrushTypeMeta NEON;
        public static final BrushTypeMeta PEN;
        private final int code;

        static {
            BrushTypeMeta brushTypeMeta = new BrushTypeMeta("ERASER", 0, 0);
            ERASER = brushTypeMeta;
            BrushTypeMeta brushTypeMeta2 = new BrushTypeMeta("PEN", 1, 1);
            PEN = brushTypeMeta2;
            BrushTypeMeta brushTypeMeta3 = new BrushTypeMeta("MARKER", 2, 2);
            MARKER = brushTypeMeta3;
            BrushTypeMeta brushTypeMeta4 = new BrushTypeMeta("NEON", 3, 3);
            NEON = brushTypeMeta4;
            BrushTypeMeta brushTypeMeta5 = new BrushTypeMeta("ARROW", 4, 4);
            ARROW = brushTypeMeta5;
            BrushTypeMeta[] brushTypeMetaArr = {brushTypeMeta, brushTypeMeta2, brushTypeMeta3, brushTypeMeta4, brushTypeMeta5};
            $VALUES = brushTypeMetaArr;
            $ENTRIES = new asp(brushTypeMetaArr);
        }

        public BrushTypeMeta(String str, int i, int i2) {
            this.code = i2;
        }

        public static BrushTypeMeta valueOf(String str) {
            return (BrushTypeMeta) Enum.valueOf(BrushTypeMeta.class, str);
        }

        public static BrushTypeMeta[] values() {
            return (BrushTypeMeta[]) $VALUES.clone();
        }

        public final int h() {
            return this.code;
        }
    }

    /* compiled from: StoryDrawingManager.kt */
    public static final class a {
        public final BrushTypeMeta a;
        public final int b;
        public final int c;

        public a(BrushTypeMeta brushTypeMeta, int i, int i2) {
            this.a = brushTypeMeta;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BrushStatInfo(brushType=");
            sb.append(this.a);
            sb.append(", strokeWidth=");
            sb.append(this.b);
            sb.append(", color=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: StoryDrawingManager.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrushesPanel.BrushType.values().length];
            try {
                iArr[BrushesPanel.BrushType.Pen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrushesPanel.BrushType.Arrow.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrushesPanel.BrushType.Marker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrushesPanel.BrushType.Glow.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrushesPanel.BrushType.Eraser.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoryDrawingManager(DrawingView drawingView) {
        this.a = drawingView;
    }

    public static float a(float f2) {
        int i = c;
        return ((f2 * (i - r1)) + b) / 1.0f;
    }
}
