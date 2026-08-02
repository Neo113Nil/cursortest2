package b2;

import e1.Z;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2374d {

    /* renamed from: b2.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f24836a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24837b;

        /* renamed from: c, reason: collision with root package name */
        public final long f24838c;
        public final int[] flags;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        public b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10, long j11) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.f24836a = i10;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.f24837b = j10;
            this.f24838c = j11;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int[] iArr2 = iArr;
        int i11 = 8192 / i10;
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr2) {
            i13 += Z.k(i14, i11);
        }
        long[] jArr2 = new long[i13];
        int[] iArr3 = new int[i13];
        long[] jArr3 = new long[i13];
        int[] iArr4 = new int[i13];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i12 < iArr2.length) {
            int i19 = iArr2[i12];
            long j11 = jArr[i12];
            while (i19 > 0) {
                int min = Math.min(i11, i19);
                jArr2[i17] = j11;
                int i20 = i10 * min;
                iArr3[i17] = i20;
                i16 += i20;
                i18 = Math.max(i18, i20);
                jArr3[i17] = i15 * j10;
                iArr4[i17] = 1;
                j11 += iArr3[i17];
                i15 += min;
                i19 -= min;
                i17++;
                i11 = i11;
            }
            i12++;
            iArr2 = iArr;
        }
        return new b(jArr2, iArr3, i18, jArr3, iArr4, j10 * i15, i16);
    }
}
