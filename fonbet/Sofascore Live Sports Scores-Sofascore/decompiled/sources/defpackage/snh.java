package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class snh {
    public static final z1h a;
    public static final l2a b = new l2a(20);
    public static final Object c = new Object();
    public static rnh d;
    public static long e;
    public static final pic f;
    public static final b10 g;
    public static List h;
    public static List i;
    public static final d09 j;
    public static final em0 k;

    static {
        int i2 = 13;
        a = new z1h(i2);
        rnh rnhVar = rnh.e;
        d = rnhVar;
        e = 2L;
        pic picVar = new pic();
        picVar.c = new long[16];
        picVar.d = new int[16];
        int[] iArr = new int[16];
        char c2 = 0;
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i3 + 1;
            iArr[i3] = i4;
            i3 = i4;
        }
        picVar.e = iArr;
        f = picVar;
        b10 b10Var = new b10(c2, i2);
        b10Var.c = new int[16];
        b10Var.d = new f0l[16];
        g = b10Var;
        km5 km5Var = km5.a;
        h = km5Var;
        i = km5Var;
        long j2 = e;
        e = 1 + j2;
        d09 d09Var = new d09(j2, rnhVar, null, new ol8(14));
        d = d.m(d09Var.b);
        j = d09Var;
        k = new em0(0);
    }

    public static final rnh a(rnh rnhVar, long j2, long j3) {
        while (Intrinsics.e(j2, j3) < 0) {
            rnhVar = rnhVar.m(j2);
            j2++;
        }
        return rnhVar;
    }

    public static final Object b(Function1 function1) {
        y0d y0dVar;
        Object u;
        d09 d09Var = j;
        synchronized (c) {
            try {
                y0dVar = d09Var.h;
                if (y0dVar != null) {
                    k.addAndGet(1);
                }
                u = u(d09Var, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (y0dVar != null) {
            try {
                List list = h;
                srg srgVar = new srg(y0dVar);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) list.get(i2)).invoke(srgVar, d09Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            try {
                d();
                if (y0dVar != null) {
                    Object[] objArr = y0dVar.b;
                    long[] jArr = y0dVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j2) < 128) {
                                        p((qdi) objArr[(i3 << 3) + i5]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                        }
                    }
                    Unit unit = Unit.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        b10 b10Var = g;
        int i2 = b10Var.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            f0l f0lVar = ((f0l[]) b10Var.d)[i3];
            Object obj = f0lVar != null ? f0lVar.get() : null;
            if (obj != null && o((qdi) obj)) {
                if (i4 != i3) {
                    ((f0l[]) b10Var.d)[i4] = f0lVar;
                    int[] iArr = (int[]) b10Var.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((f0l[]) b10Var.d)[i5] = null;
            ((int[]) b10Var.c)[i5] = 0;
        }
        if (i4 != i2) {
            b10Var.b = i4;
        }
    }

    public static final nnh e(nnh nnhVar, Function1 function1, boolean z) {
        boolean z2 = nnhVar instanceof c1d;
        if (z2 || nnhVar == null) {
            return new rxj(z2 ? (c1d) nnhVar : null, function1, null, false, z);
        }
        return new sxj(nnhVar, function1, false, z);
    }

    public static final sdi f(sdi sdiVar) {
        sdi r;
        nnh h2 = h();
        sdi r2 = r(sdiVar, h2.g(), h2.d());
        if (r2 != null) {
            return r2;
        }
        synchronized (c) {
            nnh h3 = h();
            r = r(sdiVar, h3.g(), h3.d());
        }
        if (r != null) {
            return r;
        }
        q();
        throw null;
    }

    public static final sdi g(sdi sdiVar, nnh nnhVar) {
        sdi r;
        sdi r2 = r(sdiVar, nnhVar.g(), nnhVar.d());
        if (r2 != null) {
            return r2;
        }
        synchronized (c) {
            r = r(sdiVar, nnhVar.g(), nnhVar.d());
        }
        if (r != null) {
            return r;
        }
        q();
        throw null;
    }

    public static final nnh h() {
        nnh nnhVar = (nnh) b.l();
        return nnhVar == null ? j : nnhVar;
    }

    public static final Function1 i(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new ja1(function1, function12, 3);
    }

    public static final Function1 j(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new ja1(function1, function12, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sdi k(sdi sdiVar, qdi qdiVar) {
        sdi d2 = qdiVar.d();
        long j2 = e;
        pic picVar = f;
        if (picVar.a > 0) {
            j2 = ((long[]) picVar.c)[0];
        }
        long j3 = j2 - 1;
        sdi sdiVar2 = null;
        sdi sdiVar3 = null;
        while (true) {
            if (d2 == null) {
                break;
            }
            long j4 = d2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && Intrinsics.e(j4, j3) <= 0 && !rnh.e.d(j4)) {
                if (sdiVar3 == null) {
                    sdiVar3 = d2;
                } else if (Intrinsics.e(d2.a, sdiVar3.a) >= 0) {
                    sdiVar2 = sdiVar3;
                }
            }
            d2 = d2.b;
        }
        if (sdiVar2 != null) {
            sdiVar2.a = Long.MAX_VALUE;
            return sdiVar2;
        }
        sdi c2 = sdiVar.c(Long.MAX_VALUE);
        c2.b = qdiVar.d();
        qdiVar.c(c2);
        return c2;
    }

    public static final void l(nnh nnhVar, qdi qdiVar) {
        nnhVar.t(nnhVar.h() + 1);
        Function1 i2 = nnhVar.i();
        if (i2 != null) {
            i2.invoke(qdiVar);
        }
    }

    public static final HashMap m(long j2, c1d c1dVar, rnh rnhVar) {
        long[] jArr;
        rnh rnhVar2;
        long[] jArr2;
        rnh rnhVar3;
        int i2;
        int i3;
        sdi r;
        y0d x = c1dVar.x();
        if (x != null) {
            long g2 = c1dVar.g();
            rnh e2 = c1dVar.d().m(g2).e(c1dVar.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                qdi qdiVar = (qdi) objArr[(i4 << 3) + i7];
                                sdi d2 = qdiVar.d();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                sdi r2 = r(d2, j2, rnhVar);
                                if (r2 == null || (r = r(d2, g2, e2)) == null || r2.equals(r)) {
                                    rnhVar3 = e2;
                                } else {
                                    rnhVar3 = e2;
                                    sdi r3 = r(d2, g2, c1dVar.d());
                                    if (r3 == null) {
                                        q();
                                        throw null;
                                    }
                                    sdi n = qdiVar.n(r, r2, r3);
                                    if (n == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(r2, n);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                rnhVar3 = e2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            e2 = rnhVar3;
                        }
                        jArr = jArr3;
                        rnhVar2 = e2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        rnhVar2 = e2;
                    }
                    if (i4 == length) {
                        return hashMap;
                    }
                    i4++;
                    jArr3 = jArr;
                    e2 = rnhVar2;
                }
            }
        }
        return null;
    }

    public static final sdi n(sdi sdiVar, rdi rdiVar, nnh nnhVar, sdi sdiVar2) {
        sdi k2;
        if (nnhVar.f()) {
            nnhVar.n(rdiVar);
        }
        long g2 = nnhVar.g();
        if (sdiVar2.a == g2) {
            return sdiVar2;
        }
        synchronized (c) {
            k2 = k(sdiVar, rdiVar);
        }
        k2.a = g2;
        if (sdiVar2.a != 1) {
            nnhVar.n(rdiVar);
        }
        return k2;
    }

    public static final boolean o(qdi qdiVar) {
        sdi sdiVar;
        long j2 = e;
        pic picVar = f;
        if (picVar.a > 0) {
            j2 = ((long[]) picVar.c)[0];
        }
        sdi sdiVar2 = null;
        sdi sdiVar3 = null;
        int i2 = 0;
        for (sdi d2 = qdiVar.d(); d2 != null; d2 = d2.b) {
            long j3 = d2.a;
            if (j3 != 0) {
                if (Intrinsics.e(j3, j2) >= 0) {
                    i2++;
                } else if (sdiVar2 == null) {
                    i2++;
                    sdiVar2 = d2;
                } else {
                    if (Intrinsics.e(d2.a, sdiVar2.a) < 0) {
                        sdiVar = sdiVar2;
                        sdiVar2 = d2;
                    } else {
                        sdiVar = d2;
                    }
                    if (sdiVar3 == null) {
                        sdiVar3 = qdiVar.d();
                        sdi sdiVar4 = sdiVar3;
                        while (true) {
                            if (sdiVar3 == null) {
                                sdiVar3 = sdiVar4;
                                break;
                            }
                            if (Intrinsics.e(sdiVar3.a, j2) >= 0) {
                                break;
                            }
                            if (Intrinsics.e(sdiVar4.a, sdiVar3.a) < 0) {
                                sdiVar4 = sdiVar3;
                            }
                            sdiVar3 = sdiVar3.b;
                        }
                    }
                    sdiVar2.a = 0L;
                    sdiVar2.a(sdiVar3);
                    sdiVar2 = sdiVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(qdi qdiVar) {
        if (o(qdiVar)) {
            b10 b10Var = g;
            int i2 = b10Var.b;
            int identityHashCode = System.identityHashCode(qdiVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = b10Var.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) b10Var.c)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        f0l f0lVar = ((f0l[]) b10Var.d)[i6];
                        if (qdiVar != (f0lVar != null ? f0lVar.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) b10Var.c)[i8] == identityHashCode; i8--) {
                                f0l f0lVar2 = ((f0l[]) b10Var.d)[i8];
                                if ((f0lVar2 != null ? f0lVar2.get() : null) == qdiVar) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = b10Var.b;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(b10Var.b + 1);
                                    break;
                                } else {
                                    if (((int[]) b10Var.c)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    f0l f0lVar3 = ((f0l[]) b10Var.d)[i6];
                                    if ((f0lVar3 != null ? f0lVar3.get() : null) == qdiVar) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            f0l[] f0lVarArr = (f0l[]) b10Var.d;
            int length = f0lVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                f0l[] f0lVarArr2 = new f0l[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(f0lVarArr, i10, f0lVarArr2, i12, i2 - i10);
                System.arraycopy((f0l[]) b10Var.d, 0, f0lVarArr2, 0, i10);
                mh0.e(i12, i10, (int[]) b10Var.c, iArr, i2);
                mh0.j(0, i10, (int[]) b10Var.c, iArr, 6);
                b10Var.d = f0lVarArr2;
                b10Var.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(f0lVarArr, i10, f0lVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) b10Var.c;
                mh0.e(i13, i10, iArr2, iArr2, i2);
            }
            ((f0l[]) b10Var.d)[i10] = new f0l(qdiVar);
            ((int[]) b10Var.c)[i10] = identityHashCode;
            b10Var.b++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final sdi r(sdi sdiVar, long j2, rnh rnhVar) {
        sdi sdiVar2 = null;
        while (sdiVar != null) {
            long j3 = sdiVar.a;
            if (j3 != 0 && Intrinsics.e(j3, j2) <= 0 && !rnhVar.d(j3) && (sdiVar2 == null || Intrinsics.e(sdiVar2.a, sdiVar.a) < 0)) {
                sdiVar2 = sdiVar;
            }
            sdiVar = sdiVar.b;
        }
        if (sdiVar2 != null) {
            return sdiVar2;
        }
        return null;
    }

    public static final sdi s(sdi sdiVar, qdi qdiVar) {
        sdi r;
        nnh h2 = h();
        Function1 e2 = h2.e();
        if (e2 != null) {
            e2.invoke(qdiVar);
        }
        sdi r2 = r(sdiVar, h2.g(), h2.d());
        if (r2 != null) {
            return r2;
        }
        synchronized (c) {
            nnh h3 = h();
            sdi d2 = qdiVar.d();
            d2.getClass();
            r = r(d2, h3.g(), h3.d());
            if (r == null) {
                q();
                throw null;
            }
        }
        return r;
    }

    public static final void t(int i2) {
        pic picVar = f;
        int i3 = ((int[]) picVar.e)[i2];
        picVar.g(i3, picVar.a - 1);
        picVar.a--;
        long[] jArr = (long[]) picVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.e(jArr[i5], j2) <= 0) {
                break;
            }
            picVar.g(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) picVar.c;
        int i6 = picVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < picVar.a && Intrinsics.e(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.e(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                picVar.g(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.e(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                picVar.g(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) picVar.e)[i2] = picVar.b;
        picVar.b = i2;
    }

    public static final Object u(d09 d09Var, Function1 function1) {
        long j2 = d09Var.b;
        Object invoke = function1.invoke(d.c(j2));
        long j3 = e;
        e = 1 + j3;
        rnh c2 = d.c(j2);
        d = c2;
        d09Var.b = j3;
        d09Var.a = c2;
        d09Var.g = 0;
        d09Var.h = null;
        d09Var.o();
        d = d.m(j3);
        return invoke;
    }

    public static final void v(nnh nnhVar) {
        long j2;
        if (d.d(nnhVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(nnhVar.g());
        sb.append(", disposed=");
        sb.append(nnhVar.c);
        sb.append(", applied=");
        c1d c1dVar = nnhVar instanceof c1d ? (c1d) nnhVar : null;
        sb.append(c1dVar != null ? Boolean.valueOf(c1dVar.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            pic picVar = f;
            j2 = picVar.a > 0 ? ((long[]) picVar.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final sdi w(sdi sdiVar, qdi qdiVar, nnh nnhVar) {
        sdi r;
        if (nnhVar.f()) {
            nnhVar.n(qdiVar);
        }
        long g2 = nnhVar.g();
        sdi r2 = r(sdiVar, g2, nnhVar.d());
        if (r2 == null) {
            q();
            throw null;
        }
        if (r2.a == nnhVar.g()) {
            return r2;
        }
        synchronized (c) {
            r = r(qdiVar.d(), g2, nnhVar.d());
            if (r == null) {
                q();
                throw null;
            }
            if (r.a != g2) {
                sdi k2 = k(r, qdiVar);
                k2.a(r);
                k2.a = nnhVar.g();
                r = k2;
            }
        }
        if (r2.a != 1) {
            nnhVar.n(qdiVar);
        }
        return r;
    }
}
