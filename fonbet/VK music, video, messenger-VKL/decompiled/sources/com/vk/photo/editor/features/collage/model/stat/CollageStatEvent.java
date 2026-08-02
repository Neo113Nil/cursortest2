package com.vk.photo.editor.features.collage.model.stat;

import xsna.asp;
import xsna.epx;
import xsna.srk0;
import xsna.zr;
import xsna.zrp;

/* compiled from: CollageStatEvent.kt */
/* loaded from: classes4.dex */
public interface CollageStatEvent extends srk0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CollageStatEvent.kt */
    public static final class Format {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Format[] $VALUES;
        public static final Format Collage16X9;
        public static final Format Collage3X4;
        public static final Format Collage4X3;
        public static final Format Collage9X16;
        public static final Format CollageFree;
        public static final Format CollageOriginal;
        public static final Format CollageSquare;

        static {
            Format format = new Format("CollageOriginal", 0);
            CollageOriginal = format;
            Format format2 = new Format("CollageFree", 1);
            CollageFree = format2;
            Format format3 = new Format("CollageSquare", 2);
            CollageSquare = format3;
            Format format4 = new Format("Collage3X4", 3);
            Collage3X4 = format4;
            Format format5 = new Format("Collage4X3", 4);
            Collage4X3 = format5;
            Format format6 = new Format("Collage16X9", 5);
            Collage16X9 = format6;
            Format format7 = new Format("Collage9X16", 6);
            Collage9X16 = format7;
            Format[] formatArr = {format, format2, format3, format4, format5, format6, format7};
            $VALUES = formatArr;
            $ENTRIES = new asp(formatArr);
        }

        public Format() {
            throw null;
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class a implements CollageStatEvent {
        public static final a a = new a();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class b implements CollageStatEvent {
        public static final b a = new b();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class c implements CollageStatEvent {
        public static final c a = new c();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class d implements CollageStatEvent {
        public static final d a = new d();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class e implements CollageStatEvent {
        public final Format a;

        public e(Format format) {
            this.a = format;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeFormat(format=" + this.a + ")";
        }
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class f implements CollageStatEvent {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return zr.a("ChangeGrid(gridName=", this.a, ")");
        }
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class g implements CollageStatEvent {
        public static final g a = new g();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class h implements CollageStatEvent {
        public static final h a = new h();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class i implements CollageStatEvent {
        public static final i a = new i();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class j implements CollageStatEvent {
        public static final j a = new j();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class k implements CollageStatEvent {
        public static final k a = new k();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class l implements CollageStatEvent {
        public static final l a = new l();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class m implements CollageStatEvent {
        public static final m a = new m();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class n implements CollageStatEvent {
        public static final n a = new n();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class o implements CollageStatEvent {
        public static final o a = new o();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class p implements CollageStatEvent {
        public static final p a = new p();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class q implements CollageStatEvent {
        public static final q a = new q();
    }

    /* compiled from: CollageStatEvent.kt */
    public static final class r implements CollageStatEvent {
        public static final r a = new r();
    }
}
