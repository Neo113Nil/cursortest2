package com.vk.photo.editor.features.crop.models.stat;

import xsna.asp;
import xsna.srk0;
import xsna.zrp;

/* compiled from: CropStatEvent.kt */
/* loaded from: classes4.dex */
public interface CropStatEvent extends srk0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CropStatEvent.kt */
    public static final class Format {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Format[] $VALUES;
        public static final Format Crop16X9;
        public static final Format Crop3X4;
        public static final Format Crop4X3;
        public static final Format Crop9X16;
        public static final Format CropFree;
        public static final Format CropOriginal;
        public static final Format CropSquare;

        static {
            Format format = new Format("CropOriginal", 0);
            CropOriginal = format;
            Format format2 = new Format("CropFree", 1);
            CropFree = format2;
            Format format3 = new Format("CropSquare", 2);
            CropSquare = format3;
            Format format4 = new Format("Crop3X4", 3);
            Crop3X4 = format4;
            Format format5 = new Format("Crop4X3", 4);
            Crop4X3 = format5;
            Format format6 = new Format("Crop16X9", 5);
            Crop16X9 = format6;
            Format format7 = new Format("Crop9X16", 6);
            Crop9X16 = format7;
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

    /* compiled from: CropStatEvent.kt */
    public static final class a implements CropStatEvent {
        public static final a a = new a();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class b implements CropStatEvent {
        public static final b a = new b();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class c implements CropStatEvent {
        public final Format a;

        public c(Format format) {
            this.a = format;
        }
    }

    /* compiled from: CropStatEvent.kt */
    public static final class d implements CropStatEvent {
        public static final d a = new d();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class e implements CropStatEvent {
        public static final e a = new e();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class f implements CropStatEvent {
        public static final f a = new f();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class g implements CropStatEvent {
        public static final g a = new g();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class h implements CropStatEvent {
        public static final h a = new h();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class i implements CropStatEvent {
        public static final i a = new i();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class j implements CropStatEvent {
        public final int a;
        public final Format b;
        public final int c;
        public final int d;

        public j(int i, Format format, int i2, int i3) {
            this.a = i;
            this.b = format;
            this.c = i2;
            this.d = i3;
        }
    }

    /* compiled from: CropStatEvent.kt */
    public static final class k implements CropStatEvent {
        public static final k a = new k();
    }

    /* compiled from: CropStatEvent.kt */
    public static final class l implements CropStatEvent {
        public static final l a = new l();
    }
}
