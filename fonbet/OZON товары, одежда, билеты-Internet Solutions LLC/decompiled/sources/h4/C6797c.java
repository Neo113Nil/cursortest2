package h4;

import m3.N;

/* renamed from: h4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6797c {

    /* renamed from: h4.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f64794a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f64795b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64796c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f64797d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f64798e;

        /* renamed from: f, reason: collision with root package name */
        public final long f64799f;

        /* renamed from: g, reason: collision with root package name */
        public final long f64800g;

        a(long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11, long j12) {
            this.f64794a = jArr;
            this.f64795b = iArr;
            this.f64796c = i11;
            this.f64797d = jArr2;
            this.f64798e = iArr2;
            this.f64799f = j11;
            this.f64800g = j12;
        }
    }

    public static a a(int i11, long[] jArr, int[] iArr, long j11) {
        int[] iArr2 = iArr;
        int i12 = 8192 / i11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 : iArr2) {
            i14 += N.f(i15, i12);
        }
        long[] jArr2 = new long[i14];
        int[] iArr3 = new int[i14];
        long[] jArr3 = new long[i14];
        int[] iArr4 = new int[i14];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i13 < iArr2.length) {
            int i21 = iArr2[i13];
            long j12 = jArr[i13];
            while (i21 > 0) {
                int min = Math.min(i12, i21);
                jArr2[i18] = j12;
                int i22 = i11 * min;
                iArr3[i18] = i22;
                i17 += i22;
                i19 = Math.max(i19, i22);
                jArr3[i18] = i16 * j11;
                iArr4[i18] = 1;
                j12 += iArr3[i18];
                i16 += min;
                i21 -= min;
                i18++;
                i12 = i12;
            }
            i13++;
            iArr2 = iArr;
        }
        return new a(jArr2, iArr3, i19, jArr3, iArr4, j11 * i16, i17);
    }
}
