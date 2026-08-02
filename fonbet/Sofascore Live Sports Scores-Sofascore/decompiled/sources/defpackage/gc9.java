package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gc9 {
    public final dma a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final l0d f = new l0d();
    public final bed g = new bed();
    public final b0d h = new b0d(10);

    public gc9(dma dmaVar) {
        this.a = dmaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(List list, boolean z, long j) {
        b0d b0dVar;
        long[] jArr;
        long[] jArr2;
        int i;
        odd oddVar;
        odd oddVar2;
        int size = list.size();
        bed bedVar = this.g;
        bed bedVar2 = bedVar;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            b0dVar = this.h;
            if (i2 >= size) {
                break;
            }
            wtc wtcVar = (wtc) list.get(i2);
            if (wtcVar.n) {
                wtcVar.m = new z07(24, this, wtcVar);
                if (z2) {
                    i1d i1dVar = bedVar2.a;
                    ?? r14 = i1dVar.a;
                    int i3 = i1dVar.c;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            oddVar2 = 0;
                            break;
                        }
                        oddVar2 = r14[i4];
                        if (((odd) oddVar2).c.equals(wtcVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    oddVar = oddVar2;
                    if (oddVar != null) {
                        oddVar.i = true;
                        oddVar.d.a(j);
                        if (z) {
                            Object d = b0dVar.d(j);
                            if (d == null) {
                                d = new l0d();
                                b0dVar.g(d, j);
                            }
                            ((l0d) d).a(oddVar);
                        }
                        bedVar2 = oddVar;
                    } else {
                        z2 = false;
                    }
                }
                oddVar = new odd(wtcVar);
                oddVar.d.a(j);
                if (z) {
                    Object d2 = b0dVar.d(j);
                    if (d2 == null) {
                        d2 = new l0d();
                        b0dVar.g(d2, j);
                    }
                    ((l0d) d2).a(oddVar);
                }
                bedVar2.a.b(oddVar);
                bedVar2 = oddVar;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = b0dVar.b;
            Object[] objArr = b0dVar.c;
            long[] jArr4 = b0dVar.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                l0d l0dVar = (l0d) objArr[i9];
                                i1d i1dVar2 = bedVar.a;
                                i = i6;
                                Object[] objArr2 = i1dVar2.a;
                                int i10 = i1dVar2.c;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((odd) objArr2[i11]).f(j3, l0dVar);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        b0dVar.a();
    }

    public final boolean b(yih yihVar, boolean z) {
        bed bedVar = this.g;
        i1d i1dVar = bedVar.a;
        if (!bedVar.a((nkb) yihVar.c, this.a, yihVar, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((odd) objArr[i2]).e(yihVar, z) || z3;
        }
        Object[] objArr2 = i1dVar.a;
        int i3 = i1dVar.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((odd) objArr2[i4]).d(yihVar) || z4;
        }
        bedVar.b(yihVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            l0d l0dVar = this.f;
            int i5 = l0dVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((wtc) l0dVar.f(i6));
            }
            l0dVar.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            bedVar.a.n();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        bed bedVar = this.g;
        i1d i1dVar = bedVar.a;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((odd) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            bedVar.a.n();
        }
    }

    public final void d(wtc wtcVar) {
        if (this.b) {
            this.e = true;
            this.f.a(wtcVar);
            return;
        }
        bed bedVar = this.g;
        l0d l0dVar = bedVar.b;
        l0dVar.d();
        l0dVar.a(bedVar);
        while (l0dVar.i()) {
            bed bedVar2 = (bed) l0dVar.k(l0dVar.b - 1);
            int i = 0;
            while (true) {
                i1d i1dVar = bedVar2.a;
                if (i < i1dVar.c) {
                    odd oddVar = (odd) i1dVar.a[i];
                    if (oddVar.c.equals(wtcVar)) {
                        bedVar2.a.q(oddVar);
                        oddVar.c();
                    } else {
                        l0dVar.a(oddVar);
                        i++;
                    }
                }
            }
        }
    }
}
