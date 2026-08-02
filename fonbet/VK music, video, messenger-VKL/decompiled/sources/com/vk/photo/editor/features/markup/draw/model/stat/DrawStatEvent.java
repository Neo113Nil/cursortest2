package com.vk.photo.editor.features.markup.draw.model.stat;

import java.util.ArrayList;
import xsna.asp;
import xsna.shy;
import xsna.srk0;
import xsna.y8g;
import xsna.zrp;

/* compiled from: DrawStatEvent.kt */
/* loaded from: classes4.dex */
public interface DrawStatEvent extends srk0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DrawStatEvent.kt */
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

    /* compiled from: DrawStatEvent.kt */
    public static final class a implements DrawStatEvent {
        public static final a a = new a();
    }

    /* compiled from: DrawStatEvent.kt */
    public static final class b {
        public final y8g.c a;
        public final int b;
        public final BrushType c;

        public b(y8g.c cVar, int i, BrushType brushType) {
            this.a = cVar;
            this.b = i;
            this.c = brushType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a.a) * 31, 31);
        }

        public final String toString() {
            return "DrawStatData(color=" + this.a + ", size=" + this.b + ", brush=" + this.c + ")";
        }
    }

    /* compiled from: DrawStatEvent.kt */
    public static final class c implements DrawStatEvent {
        public static final c a = new c();
    }

    /* compiled from: DrawStatEvent.kt */
    public static final class d implements DrawStatEvent {
        public final ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Save(draws=" + this.a + ")";
        }
    }
}
