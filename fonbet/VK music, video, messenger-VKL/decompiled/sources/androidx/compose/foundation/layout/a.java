package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.azl;
import xsna.dg1;
import xsna.dt1;
import xsna.epx;
import xsna.oq;
import xsna.pco;
import xsna.qoy;
import xsna.yh1;

/* compiled from: Arrangement.kt */
/* loaded from: classes11.dex */
public final class a {
    public static final l a = new l();
    public static final d b = new d();
    public static final m c = new m();
    public static final b d = new b();
    public static final c e = new c();
    public static final i f = new i();
    public static final h g = new h();
    public static final g h = new g();

    /* compiled from: Arrangement.kt */
    /* renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    public static final class C0007a {
        public static final C0008a a = new C0008a();
        public static final b b = new b();

        /* compiled from: Arrangement.kt */
        /* renamed from: androidx.compose.foundation.layout.a$a$a, reason: collision with other inner class name */
        public static final class C0008a implements e {
            @Override // androidx.compose.foundation.layout.a.e
            public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                a.b(iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* compiled from: Arrangement.kt */
        /* renamed from: androidx.compose.foundation.layout.a$a$b */
        public static final class b implements e {
            @Override // androidx.compose.foundation.layout.a.e
            public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                a.c(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class b implements n {
        @Override // androidx.compose.foundation.layout.a.n
        public final void c(azl azlVar, int i, int[] iArr, int[] iArr2) {
            a.c(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class c implements f {
        public final float a = 0;

        @Override // androidx.compose.foundation.layout.a.f, androidx.compose.foundation.layout.a.e, androidx.compose.foundation.layout.a.n
        public final float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.a.e
        public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                a.a(i, iArr, iArr2, false);
            } else {
                a.a(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.a.n
        public final void c(azl azlVar, int i, int[] iArr, int[] iArr2) {
            a.a(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class d implements e {
        @Override // androidx.compose.foundation.layout.a.e
        public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                a.c(i, iArr, iArr2, false);
            } else {
                a.b(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    public interface e {
        default float a() {
            return 0;
        }

        void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    public interface f extends e, n {
        @Override // androidx.compose.foundation.layout.a.e, androidx.compose.foundation.layout.a.n
        default float a() {
            return 0;
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class g implements f {
        public final float a = 0;

        @Override // androidx.compose.foundation.layout.a.f, androidx.compose.foundation.layout.a.e, androidx.compose.foundation.layout.a.n
        public final float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.a.e
        public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                a.d(i, iArr, iArr2, false);
            } else {
                a.d(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.a.n
        public final void c(azl azlVar, int i, int[] iArr, int[] iArr2) {
            a.d(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class h implements f {
        public final float a = 0;

        @Override // androidx.compose.foundation.layout.a.f, androidx.compose.foundation.layout.a.e, androidx.compose.foundation.layout.a.n
        public final float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.a.e
        public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                a.e(i, iArr, iArr2, false);
            } else {
                a.e(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.a.n
        public final void c(azl azlVar, int i, int[] iArr, int[] iArr2) {
            a.e(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class i implements f {
        public final float a = 0;

        @Override // androidx.compose.foundation.layout.a.f, androidx.compose.foundation.layout.a.e, androidx.compose.foundation.layout.a.n
        public final float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.a.e
        public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                a.f(i, iArr, iArr2, false);
            } else {
                a.f(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.a.n
        public final void c(azl azlVar, int i, int[] iArr, int[] iArr2) {
            a.f(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class j implements f {
        public final float a;
        public final boolean b;
        public final k c;
        public final float d;

        public j(float f, boolean z, k kVar) {
            this.a = f;
            this.b = z;
            this.c = kVar;
            this.d = f;
        }

        @Override // androidx.compose.foundation.layout.a.f, androidx.compose.foundation.layout.a.e, androidx.compose.foundation.layout.a.n
        public final float a() {
            return this.d;
        }

        @Override // androidx.compose.foundation.layout.a.e
        public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            if (iArr.length == 0) {
                return;
            }
            int r0 = azlVar.r0(this.a);
            boolean z = this.b && layoutDirection == LayoutDirection.Rtl;
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int max = Math.max(0, i - iArr[i3]);
                    iArr2[i5] = max;
                    i4 = Math.min(r0, max);
                    i = iArr2[i5] - i4;
                    i3++;
                    i5++;
                }
                i2 = i + i4;
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i6 < length2) {
                    int i10 = iArr[i6];
                    int min = Math.min(i7, i - i10);
                    iArr2[i9] = min;
                    int min2 = Math.min(r0, (i - min) - i10);
                    int i11 = iArr2[i9] + i10 + min2;
                    i6++;
                    i8 = min2;
                    i7 = i11;
                    i9++;
                }
                i2 = i - (i7 - i8);
            }
            k kVar = this.c;
            if (kVar == null || i2 <= 0) {
                return;
            }
            int b = kVar.b(i2, layoutDirection);
            if (z) {
                b -= i2;
            }
            if (b != 0) {
                int length3 = iArr2.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    iArr2[i12] = iArr2[i12] + b;
                }
            }
        }

        @Override // androidx.compose.foundation.layout.a.n
        public final void c(azl azlVar, int i, int[] iArr, int[] iArr2) {
            b(azlVar, i, iArr, LayoutDirection.Ltr, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return pco.b(this.a, jVar.a) && this.b == jVar.b && epx.f(this.c, jVar.c);
        }

        public final int hashCode() {
            int b = qoy.b(Float.hashCode(this.a) * 31, 31, this.b);
            k kVar = this.c;
            return b + (kVar == null ? 0 : kVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            oq.f(this.a, ", ", sb);
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: Arrangement.kt */
    public interface k {
        int b(int i, LayoutDirection layoutDirection);
    }

    /* compiled from: Arrangement.kt */
    public static final class l implements e {
        @Override // androidx.compose.foundation.layout.a.e
        public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                a.b(iArr, iArr2, false);
            } else {
                a.c(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class m implements n {
        @Override // androidx.compose.foundation.layout.a.n
        public final void c(azl azlVar, int i, int[] iArr, int[] iArr2) {
            a.b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    public interface n {
        default float a() {
            return 0;
        }

        void c(azl azlVar, int i, int[] iArr, int[] iArr2);
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public static void d(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = iArr.length == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (i2 - i4) / iArr.length;
        float f2 = length / 2;
        if (!z) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i8 + length;
        }
    }

    public static void e(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? max : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public static void f(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static j g(float f2) {
        return new j(f2, true, new io.reactivex.rxjava3.internal.operators.mixed.k(3));
    }

    public static j h(float f2, dt1.b bVar) {
        return new j(f2, true, new yh1(bVar, 1));
    }

    public static j i(float f2, dt1.c cVar) {
        return new j(f2, false, new dg1(cVar, 2));
    }
}
