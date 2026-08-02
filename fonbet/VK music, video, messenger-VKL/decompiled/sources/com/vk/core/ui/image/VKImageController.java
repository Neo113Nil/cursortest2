package com.vk.core.ui.image;

import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.tcr0;
import xsna.zrp;

/* compiled from: VKImageController.kt */
/* loaded from: classes17.dex */
public interface VKImageController<V extends View> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VKImageController.kt */
    public static final class ScaleType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScaleType[] $VALUES;
        public static final ScaleType CENTER_CROP;
        public static final ScaleType CENTER_INSIDE;
        public static final ScaleType FIT_CENTER;
        public static final ScaleType FIT_XY;

        static {
            ScaleType scaleType = new ScaleType("CENTER_INSIDE", 0);
            CENTER_INSIDE = scaleType;
            ScaleType scaleType2 = new ScaleType("CENTER_CROP", 1);
            CENTER_CROP = scaleType2;
            ScaleType scaleType3 = new ScaleType("FIT_XY", 2);
            FIT_XY = scaleType3;
            ScaleType scaleType4 = new ScaleType("FIT_CENTER", 3);
            FIT_CENTER = scaleType4;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3, scaleType4};
            $VALUES = scaleTypeArr;
            $ENTRIES = new asp(scaleTypeArr);
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    /* compiled from: VKImageController.kt */
    public static final class a {
        public static void a(VKImageController vKImageController, String str) {
            vKImageController.f(str, b.q);
        }
    }

    /* compiled from: VKImageController.kt */
    public static final class b {
        public static final b q = new b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, MinElf.PN_XNUM);
        public final float a;
        public final c b;
        public final boolean c;
        public final Double d;
        public final int e;
        public final Drawable f;
        public final Integer g;
        public final ScaleType h;
        public final ScaleType i;
        public final float j;
        public final int k;
        public final Integer l;
        public final boolean m;
        public final boolean n;
        public final Size o;
        public final Path p;

        public b() {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, MinElf.PN_XNUM);
        }

        public static b a(b bVar, Drawable drawable, ScaleType scaleType, Path path, int i) {
            float f = bVar.a;
            c cVar = bVar.b;
            boolean z = (i & 4) != 0 ? bVar.c : true;
            Double d = bVar.d;
            boolean z2 = z;
            int i2 = bVar.e;
            Drawable drawable2 = (i & 32) != 0 ? bVar.f : drawable;
            Integer num = bVar.g;
            ScaleType scaleType2 = (i & 128) != 0 ? bVar.h : scaleType;
            ScaleType scaleType3 = bVar.i;
            Drawable drawable3 = drawable2;
            ScaleType scaleType4 = scaleType2;
            float f2 = bVar.j;
            int i3 = bVar.k;
            Integer num2 = bVar.l;
            boolean z3 = bVar.m;
            boolean z4 = bVar.n;
            Size size = bVar.o;
            Path path2 = (i & 32768) != 0 ? bVar.p : path;
            bVar.getClass();
            return new b(f, cVar, z2, d, i2, drawable3, num, scaleType4, scaleType3, f2, i3, num2, z3, z4, size, path2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && this.h == bVar.h && this.i == bVar.i && Float.compare(this.j, bVar.j) == 0 && this.k == bVar.k && epx.f(this.l, bVar.l) && this.m == bVar.m && this.n == bVar.n && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p);
        }

        public final int hashCode() {
            int b = qoy.b((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
            Double d = this.d;
            int a = shy.a(this.e, (b + (d == null ? 0 : d.hashCode())) * 31, 31);
            Drawable drawable = this.f;
            int hashCode = (a + (drawable == null ? 0 : drawable.hashCode())) * 31;
            Integer num = this.g;
            int hashCode2 = (this.h.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
            ScaleType scaleType = this.i;
            int a2 = shy.a(this.k, io.reactivex.rxjava3.subjects.b.a(this.j, (hashCode2 + (scaleType == null ? 0 : scaleType.hashCode())) * 31, 31), 31);
            Integer num2 = this.l;
            int b2 = qoy.b(qoy.b((a2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.m), 31, this.n);
            Size size = this.o;
            int hashCode3 = (b2 + (size == null ? 0 : size.hashCode())) * 31;
            Path path = this.p;
            return hashCode3 + (path != null ? path.hashCode() : 0);
        }

        public final String toString() {
            return "ImageParams(cornerRadiusF=" + this.a + ", roundingParams=" + this.b + ", isCircle=" + this.c + ", squircleCurvature=" + this.d + ", placeholderRes=" + this.e + ", placeholder=" + this.f + ", placeholderLayerTint=" + this.g + ", scaleType=" + this.h + ", placeholderScaleType=" + this.i + ", borderWidth=" + this.j + ", borderColor=" + this.k + ", tintColor=" + this.l + ", paintFilterBitmap=" + this.m + ", disableCache=" + this.n + ", size=" + this.o + ", clipPath=" + this.p + ')';
        }

        public b(float f, c cVar, boolean z, Double d, int i, Drawable drawable, Integer num, ScaleType scaleType, ScaleType scaleType2, float f2, int i2, Integer num2, boolean z2, boolean z3, Size size, Path path) {
            this.a = f;
            this.b = cVar;
            this.c = z;
            this.d = d;
            this.e = i;
            this.f = drawable;
            this.g = num;
            this.h = scaleType;
            this.i = scaleType2;
            this.j = f2;
            this.k = i2;
            this.l = num2;
            this.m = z2;
            this.n = z3;
            this.o = size;
            this.p = path;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(float f, c cVar, boolean z, int i, Drawable drawable, Integer num, ScaleType scaleType, ScaleType scaleType2, float f2, int i2, Integer num2, Size size, Path path, int i3) {
            this(r5, (i3 & 2) != 0 ? new c(r5, r5, r5, r5) : cVar, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? null : r1, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? null : drawable, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? ScaleType.CENTER_CROP : scaleType, (i3 & 256) != 0 ? ScaleType.FIT_XY : scaleType2, (i3 & 512) != 0 ? 0.0f : f2, (i3 & 1024) != 0 ? 0 : i2, (i3 & 2048) != 0 ? null : num2, (i3 & 4096) == 0, (i3 & 8192) == 0, (i3 & 16384) != 0 ? null : size, (i3 & 32768) != 0 ? null : path);
            Double valueOf = Double.valueOf(3.9d);
            float f3 = (i3 & 1) != 0 ? 0.0f : f;
        }
    }

    /* compiled from: VKImageController.kt */
    public static final class c {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public c(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }
    }

    void a(Drawable drawable, b bVar);

    void clear();

    void d(String str, b bVar, tcr0 tcr0Var);

    void f(String str, b bVar);

    V getView();

    void j(int i, b bVar);
}
