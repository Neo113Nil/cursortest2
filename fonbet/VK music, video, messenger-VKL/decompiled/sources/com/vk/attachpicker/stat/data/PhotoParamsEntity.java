package com.vk.attachpicker.stat.data;

import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: PhotoParamsEntity.kt */
/* loaded from: classes15.dex */
public final class PhotoParamsEntity {
    public final Integer a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    public final Integer k;
    public final boolean l;
    public final Integer m;
    public final boolean n;
    public final String o;
    public final Integer p;
    public final Ratio q;
    public final int r;
    public final int s;
    public final String t;
    public final Integer u;
    public final Integer v;
    public final String w;
    public final List<String> x;
    public final List<Float> y;
    public final boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoParamsEntity.kt */
    public static final class Ratio {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Ratio[] $VALUES;
        public static final Ratio Crop16X9;
        public static final Ratio Crop3X4;
        public static final Ratio Crop4X3;
        public static final Ratio Crop9X16;
        public static final Ratio CropFree;
        public static final Ratio CropOriginal;
        public static final Ratio CropSquare;

        static {
            Ratio ratio = new Ratio("CropOriginal", 0);
            CropOriginal = ratio;
            Ratio ratio2 = new Ratio("CropFree", 1);
            CropFree = ratio2;
            Ratio ratio3 = new Ratio("CropSquare", 2);
            CropSquare = ratio3;
            Ratio ratio4 = new Ratio("Crop3X4", 3);
            Crop3X4 = ratio4;
            Ratio ratio5 = new Ratio("Crop4X3", 4);
            Crop4X3 = ratio5;
            Ratio ratio6 = new Ratio("Crop16X9", 5);
            Crop16X9 = ratio6;
            Ratio ratio7 = new Ratio("Crop9X16", 6);
            Crop9X16 = ratio7;
            Ratio[] ratioArr = {ratio, ratio2, ratio3, ratio4, ratio5, ratio6, ratio7};
            $VALUES = ratioArr;
            $ENTRIES = new asp(ratioArr);
        }

        public Ratio() {
            throw null;
        }

        public static Ratio valueOf(String str) {
            return (Ratio) Enum.valueOf(Ratio.class, str);
        }

        public static Ratio[] values() {
            return (Ratio[]) $VALUES.clone();
        }
    }

    public PhotoParamsEntity(Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num2, Integer num3, boolean z7, Integer num4, boolean z8, String str3, Integer num5, Ratio ratio, int i, int i2, String str4, Integer num6, Integer num7, String str5, List<String> list, List<Float> list2, boolean z9) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = num2;
        this.k = num3;
        this.l = z7;
        this.m = num4;
        this.n = z8;
        this.o = str3;
        this.p = num5;
        this.q = ratio;
        this.r = i;
        this.s = i2;
        this.t = str4;
        this.u = num6;
        this.v = num7;
        this.w = str5;
        this.x = list;
        this.y = list2;
        this.z = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoParamsEntity)) {
            return false;
        }
        PhotoParamsEntity photoParamsEntity = (PhotoParamsEntity) obj;
        return epx.f(this.a, photoParamsEntity.a) && epx.f(this.b, photoParamsEntity.b) && epx.f(this.c, photoParamsEntity.c) && this.d == photoParamsEntity.d && this.e == photoParamsEntity.e && this.f == photoParamsEntity.f && this.g == photoParamsEntity.g && this.h == photoParamsEntity.h && this.i == photoParamsEntity.i && epx.f(this.j, photoParamsEntity.j) && epx.f(this.k, photoParamsEntity.k) && this.l == photoParamsEntity.l && epx.f(this.m, photoParamsEntity.m) && this.n == photoParamsEntity.n && epx.f(this.o, photoParamsEntity.o) && epx.f(this.p, photoParamsEntity.p) && this.q == photoParamsEntity.q && this.r == photoParamsEntity.r && this.s == photoParamsEntity.s && epx.f(this.t, photoParamsEntity.t) && epx.f(this.u, photoParamsEntity.u) && epx.f(this.v, photoParamsEntity.v) && epx.f(this.w, photoParamsEntity.w) && epx.f(this.x, photoParamsEntity.x) && epx.f(this.y, photoParamsEntity.y) && this.z == photoParamsEntity.z;
    }

    public final int hashCode() {
        Integer num = this.a;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Integer num2 = this.j;
        int hashCode = (b + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.k;
        int b2 = qoy.b((hashCode + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.l);
        Integer num4 = this.m;
        int b3 = qoy.b((b2 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.n);
        String str = this.o;
        int hashCode2 = (b3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.p;
        int hashCode3 = (hashCode2 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Ratio ratio = this.q;
        int a = shy.a(this.s, shy.a(this.r, (hashCode3 + (ratio == null ? 0 : ratio.hashCode())) * 31, 31), 31);
        String str2 = this.t;
        int hashCode4 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num6 = this.u;
        int hashCode5 = (hashCode4 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.v;
        int hashCode6 = (hashCode5 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str3 = this.w;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.x;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.y;
        return Boolean.hashCode(this.z) + ((hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoParamsEntity(id=");
        sb.append(this.a);
        sb.append(", mediaKey=");
        sb.append(this.b);
        sb.append(", createEntryPoint=");
        sb.append(this.c);
        sb.append(", isCropped=");
        sb.append(this.d);
        sb.append(", isRotated=");
        sb.append(this.e);
        sb.append(", isZoomed=");
        sb.append(this.f);
        sb.append(", hasGraffity=");
        sb.append(this.g);
        sb.append(", hasSticker=");
        sb.append(this.h);
        sb.append(", hasText=");
        sb.append(this.i);
        sb.append(", zoomPercentage=");
        sb.append(this.j);
        sb.append(", rotationDegrees=");
        sb.append(this.k);
        sb.append(", isAutocorrected=");
        sb.append(this.l);
        sb.append(", autocorrectionValue=");
        sb.append(this.m);
        sb.append(", hasFilter=");
        sb.append(this.n);
        sb.append(", filterName=");
        sb.append(this.o);
        sb.append(", filterValue=");
        sb.append(this.p);
        sb.append(", cropperRatio=");
        sb.append(this.q);
        sb.append(", height=");
        sb.append(this.r);
        sb.append(", width=");
        sb.append(this.s);
        sb.append(", collageGrid=");
        sb.append(this.t);
        sb.append(", collageBorderWidth=");
        sb.append(this.u);
        sb.append(", collageCornerRadius=");
        sb.append(this.v);
        sb.append(", collageBorderColor=");
        sb.append(this.w);
        sb.append(", colorGradingParams=");
        sb.append(this.x);
        sb.append(", colorGradingValues=");
        sb.append(this.y);
        sb.append(", isUpgraded=");
        return q0.a(sb, this.z, ')');
    }
}
