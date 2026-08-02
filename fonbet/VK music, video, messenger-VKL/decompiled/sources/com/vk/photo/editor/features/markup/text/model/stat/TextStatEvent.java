package com.vk.photo.editor.features.markup.text.model.stat;

import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.jax0;
import xsna.shy;
import xsna.srk0;
import xsna.urd0;
import xsna.y8g;
import xsna.zrp;

/* compiled from: TextStatEvent.kt */
/* loaded from: classes4.dex */
public interface TextStatEvent extends srk0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextStatEvent.kt */
    public static final class Align {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;
        public static final Align Center;
        public static final Align End;
        public static final Align Start;

        static {
            Align align = new Align("Start", 0);
            Start = align;
            Align align2 = new Align("Center", 1);
            Center = align2;
            Align align3 = new Align("End", 2);
            End = align3;
            Align[] alignArr = {align, align2, align3};
            $VALUES = alignArr;
            $ENTRIES = new asp(alignArr);
        }

        public Align() {
            throw null;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    /* compiled from: TextStatEvent.kt */
    public static final class a implements TextStatEvent {
        public static final a a = new a();
    }

    /* compiled from: TextStatEvent.kt */
    public static final class b implements TextStatEvent {
        public static final b a = new b();
    }

    /* compiled from: TextStatEvent.kt */
    public static final class c implements TextStatEvent {
        public static final c a = new c();
    }

    /* compiled from: TextStatEvent.kt */
    public static final class d implements TextStatEvent {
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
            return "Save(texts=" + this.a + ")";
        }
    }

    /* compiled from: TextStatEvent.kt */
    public static final class e {
        public final Align a;
        public final String b;
        public final int c;
        public final String d;
        public final y8g e;
        public final y8g f;

        public e(Align align, String str, int i, String str2, y8g y8gVar, y8g y8gVar2) {
            this.a = align;
            this.b = str;
            this.c = i;
            this.d = str2;
            this.e = y8gVar;
            this.f = y8gVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b) && this.c == eVar.c && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + urd0.a(shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextStatData(align=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", size=");
            jax0.a(this.c, ", fontName=", this.d, ", textColor=", sb);
            sb.append(this.e);
            sb.append(", backgroundColor=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }
}
