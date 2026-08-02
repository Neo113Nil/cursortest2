package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class odd extends bed {
    public final wtc c;
    public final ojb d;
    public final nkb e;
    public wdd f;
    public fze g;
    public boolean h;
    public boolean i;
    public boolean j;

    public odd(wtc wtcVar) {
        this.c = wtcVar;
        ojb ojbVar = new ojb((byte) 0, 2);
        ojbVar.c = new long[2];
        this.d = ojbVar;
        this.e = new nkb(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [wtc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [wtc] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // defpackage.bed
    public final boolean a(nkb nkbVar, dma dmaVar, yih yihVar, boolean z) {
        ojb ojbVar;
        nkb nkbVar2;
        Object obj;
        boolean z2;
        boolean z3;
        fze fzeVar;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        int i5;
        mze mzeVar;
        dma dmaVar2 = dmaVar;
        boolean a = super.a(nkbVar, dmaVar, yihVar, z);
        bw4 bw4Var = this.c;
        boolean z7 = true;
        if (bw4Var.n) {
            ?? r8 = 0;
            while (bw4Var != 0) {
                if (bw4Var instanceof pze) {
                    this.f = c6o.a0((pze) bw4Var, 16);
                } else if ((bw4Var.c & 16) != 0 && (bw4Var instanceof bw4)) {
                    wtc wtcVar = bw4Var.p;
                    int i6 = 0;
                    bw4Var = bw4Var;
                    r8 = r8;
                    while (wtcVar != null) {
                        if ((wtcVar.c & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                bw4Var = wtcVar;
                            } else {
                                if (r8 == 0) {
                                    r8 = new i1d(new wtc[16], 0);
                                }
                                if (bw4Var != 0) {
                                    r8.b(bw4Var);
                                    bw4Var = 0;
                                }
                                r8.b(wtcVar);
                            }
                        }
                        wtcVar = wtcVar.f;
                        bw4Var = bw4Var;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                bw4Var = c6o.X(r8);
            }
            if (this.f != null) {
                int i7 = nkbVar.i();
                int i8 = 0;
                while (true) {
                    ojbVar = this.d;
                    nkbVar2 = this.e;
                    if (i8 >= i7) {
                        break;
                    }
                    long f = nkbVar.f(i8);
                    mze mzeVar2 = (mze) nkbVar.j(i8);
                    if (ojbVar.c(f)) {
                        boolean z8 = z7;
                        long j = mzeVar2.g;
                        ArrayList arrayList = mzeVar2.m;
                        long j2 = mzeVar2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z6 = z8;
                            z5 = a;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? km5.a : arrayList).size());
                            List list = arrayList == null ? km5.a : arrayList;
                            i3 = i7;
                            int size = list.size();
                            i4 = i8;
                            int i9 = 0;
                            while (i9 < size) {
                                List list2 = list;
                                gb9 gb9Var = (gb9) list.get(i9);
                                nkb nkbVar3 = nkbVar2;
                                long j3 = f;
                                long j4 = gb9Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    mzeVar = mzeVar2;
                                    long j5 = gb9Var.a;
                                    i5 = size;
                                    wdd wddVar = this.f;
                                    wddVar.getClass();
                                    arrayList2.add(new gb9(j5, wddVar.o(dmaVar2, j4), gb9Var.c, gb9Var.d, gb9Var.e));
                                } else {
                                    i5 = size;
                                    mzeVar = mzeVar2;
                                }
                                i9++;
                                size = i5;
                                list = list2;
                                nkbVar2 = nkbVar3;
                                f = j3;
                                mzeVar2 = mzeVar;
                            }
                            nkb nkbVar4 = nkbVar2;
                            long j6 = f;
                            wdd wddVar2 = this.f;
                            wddVar2.getClass();
                            long o = wddVar2.o(dmaVar2, j);
                            wdd wddVar3 = this.f;
                            wddVar3.getClass();
                            mze mzeVar3 = new mze(mzeVar2.a, mzeVar2.b, wddVar3.o(dmaVar2, j2), mzeVar2.d, mzeVar2.e, mzeVar2.f, o, mzeVar2.h, mzeVar2.i, arrayList2, mzeVar2.j, mzeVar2.k, mzeVar2.l, mzeVar2.n);
                            mze mzeVar4 = mzeVar2.q;
                            if (mzeVar4 == null) {
                                mzeVar4 = mzeVar2;
                            }
                            mzeVar3.q = mzeVar4;
                            mze mzeVar5 = mzeVar2.q;
                            if (mzeVar5 != null) {
                                mzeVar2 = mzeVar5;
                            }
                            mzeVar3.q = mzeVar2;
                            nkbVar4.g(mzeVar3, j6);
                        } else {
                            z5 = a;
                            i3 = i7;
                            i4 = i8;
                            z6 = z8;
                        }
                    } else {
                        z5 = a;
                        i3 = i7;
                        z6 = z7;
                        i4 = i8;
                    }
                    i8 = i4 + 1;
                    dmaVar2 = dmaVar;
                    i7 = i3;
                    z7 = z6;
                    a = z5;
                }
                boolean z9 = a;
                boolean z10 = z7;
                if (nkbVar2.e()) {
                    ojbVar.b = 0;
                    this.a.n();
                    return z10;
                }
                int i10 = ojbVar.b;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    if (!nkbVar.b(ojbVar.c[i10]) && i10 < (i2 = ojbVar.b)) {
                        int i11 = i2 - 1;
                        int i12 = i10;
                        while (i12 < i11) {
                            long[] jArr = ojbVar.c;
                            int i13 = i12 + 1;
                            jArr[i12] = jArr[i13];
                            i12 = i13;
                        }
                        ojbVar.b--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(nkbVar2.i());
                int i14 = nkbVar2.i();
                for (int i15 = 0; i15 < i14; i15++) {
                    arrayList3.add(nkbVar2.j(i15));
                }
                fze fzeVar2 = new fze(arrayList3, yihVar);
                int size2 = arrayList3.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i16);
                    if (yihVar.h(((mze) obj).a)) {
                        break;
                    }
                    i16++;
                }
                mze mzeVar6 = (mze) obj;
                if (mzeVar6 != null) {
                    boolean z11 = mzeVar6.d;
                    if (z) {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z11 || mzeVar6.h)) {
                            wdd wddVar4 = this.f;
                            wddVar4.getClass();
                            long j7 = wddVar4.c;
                            long j8 = mzeVar6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i17 = (int) (j7 >> 32);
                            z4 = !((intBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z10 : false) | (intBitsToFloat > ((float) i17) ? z10 : false) | (intBitsToFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z10 : false) | (intBitsToFloat2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z10 : false));
                            this.i = z4;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    }
                    boolean z12 = this.h;
                    if (z4 == z12 || !((i = fzeVar2.f) == 3 || i == 4 || i == 5)) {
                        int i18 = fzeVar2.f;
                        if (i18 == 4 && z12 && !this.j) {
                            fzeVar2.f = 3;
                        } else if (i18 == 5 && z4 && z11) {
                            fzeVar2.f = 3;
                        }
                    } else {
                        fzeVar2.f = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z9 && fzeVar2.f == 3 && (fzeVar = this.g) != null) {
                    ?? r1 = fzeVar.a;
                    int size3 = r1.size();
                    ?? r5 = fzeVar2.a;
                    if (size3 == r5.size()) {
                        int size4 = r5.size();
                        for (?? r6 = z2; r6 < size4; r6++) {
                            if (dnd.c(((mze) r1.get(r6)).c, ((mze) r5.get(r6)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = fzeVar2;
                        return z3;
                    }
                }
                z3 = z10;
                this.g = fzeVar2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.bed
    public final void b(yih yihVar) {
        super.b(yihVar);
        fze fzeVar = this.g;
        if (fzeVar == null) {
            return;
        }
        this.h = this.i;
        List list = fzeVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mze mzeVar = (mze) list.get(i);
            boolean z = mzeVar.d;
            long j = mzeVar.a;
            boolean h = yihVar.h(j);
            boolean z2 = this.i;
            if ((!z && !h) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = fzeVar.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [i1d] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [i1d] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        i1d i1dVar = this.a;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((odd) objArr[i2]).c();
        }
        bw4 bw4Var = this.c;
        ?? r1 = 0;
        while (bw4Var != 0) {
            if (bw4Var instanceof pze) {
                ((pze) bw4Var).y0();
            } else if ((bw4Var.c & 16) != 0 && (bw4Var instanceof bw4)) {
                wtc wtcVar = bw4Var.p;
                int i3 = 0;
                r1 = r1;
                bw4Var = bw4Var;
                while (wtcVar != null) {
                    if ((wtcVar.c & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            bw4Var = wtcVar;
                        } else {
                            if (r1 == 0) {
                                r1 = new i1d(new wtc[16], 0);
                            }
                            if (bw4Var != 0) {
                                r1.b(bw4Var);
                                bw4Var = 0;
                            }
                            r1.b(wtcVar);
                        }
                    }
                    wtcVar = wtcVar.f;
                    r1 = r1;
                    bw4Var = bw4Var;
                }
                if (i3 == 1) {
                }
            }
            bw4Var = c6o.X(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [wtc] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(yih yihVar) {
        wma wmaVar;
        nkb nkbVar = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!nkbVar.e()) {
            wtc wtcVar = this.c;
            if (wtcVar.n) {
                wdd wddVar = wtcVar.h;
                if ((wddVar == null || (wmaVar = wddVar.o) == null) ? false : wmaVar.I()) {
                    fze fzeVar = this.g;
                    fzeVar.getClass();
                    wdd wddVar2 = this.f;
                    wddVar2.getClass();
                    long j = wddVar2.c;
                    bw4 bw4Var = wtcVar;
                    ?? r8 = 0;
                    while (bw4Var != 0) {
                        if (bw4Var instanceof pze) {
                            ((pze) bw4Var).B(fzeVar, gze.c, j);
                        } else if ((bw4Var.c & 16) != 0 && (bw4Var instanceof bw4)) {
                            wtc wtcVar2 = bw4Var.p;
                            int i = 0;
                            bw4Var = bw4Var;
                            r8 = r8;
                            while (wtcVar2 != null) {
                                if ((wtcVar2.c & 16) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        bw4Var = wtcVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new i1d(new wtc[16], 0);
                                        }
                                        if (bw4Var != 0) {
                                            r8.b(bw4Var);
                                            bw4Var = 0;
                                        }
                                        r8.b(wtcVar2);
                                    }
                                }
                                wtcVar2 = wtcVar2.f;
                                bw4Var = bw4Var;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        bw4Var = c6o.X(r8);
                    }
                    if (wtcVar.n) {
                        i1d i1dVar = this.a;
                        Object[] objArr = i1dVar.a;
                        int i2 = i1dVar.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((odd) objArr[i3]).d(yihVar);
                        }
                    }
                    z = true;
                }
            }
        }
        b(yihVar);
        nkbVar.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [wtc] */
    /* JADX WARN: Type inference failed for: r0v3, types: [wtc] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [wtc] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [i1d] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [i1d] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r6v10, types: [wtc] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i1d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [i1d] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(yih yihVar, boolean z) {
        wma wmaVar;
        if (!this.e.e()) {
            bw4 bw4Var = this.c;
            if (bw4Var.n) {
                wdd wddVar = bw4Var.h;
                if ((wddVar == null || (wmaVar = wddVar.o) == null) ? false : wmaVar.I()) {
                    fze fzeVar = this.g;
                    fzeVar.getClass();
                    wdd wddVar2 = this.f;
                    wddVar2.getClass();
                    long j = wddVar2.c;
                    bw4 bw4Var2 = bw4Var;
                    ?? r7 = 0;
                    while (bw4Var2 != 0) {
                        if (bw4Var2 instanceof pze) {
                            ((pze) bw4Var2).B(fzeVar, gze.a, j);
                        } else if ((bw4Var2.c & 16) != 0 && (bw4Var2 instanceof bw4)) {
                            wtc wtcVar = bw4Var2.p;
                            int i = 0;
                            bw4Var2 = bw4Var2;
                            r7 = r7;
                            while (wtcVar != null) {
                                if ((wtcVar.c & 16) != 0) {
                                    i++;
                                    r7 = r7;
                                    if (i == 1) {
                                        bw4Var2 = wtcVar;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new i1d(new wtc[16], 0);
                                        }
                                        if (bw4Var2 != 0) {
                                            r7.b(bw4Var2);
                                            bw4Var2 = 0;
                                        }
                                        r7.b(wtcVar);
                                    }
                                }
                                wtcVar = wtcVar.f;
                                bw4Var2 = bw4Var2;
                                r7 = r7;
                            }
                            if (i == 1) {
                            }
                        }
                        bw4Var2 = c6o.X(r7);
                    }
                    if (bw4Var.n) {
                        i1d i1dVar = this.a;
                        Object[] objArr = i1dVar.a;
                        int i2 = i1dVar.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            odd oddVar = (odd) objArr[i3];
                            this.f.getClass();
                            oddVar.e(yihVar, z);
                        }
                    }
                    if (bw4Var.n) {
                        ?? r13 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof pze) {
                                ((pze) bw4Var).B(fzeVar, gze.b, j);
                            } else if ((bw4Var.c & 16) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar2 = bw4Var.p;
                                int i4 = 0;
                                bw4Var = bw4Var;
                                r13 = r13;
                                while (wtcVar2 != null) {
                                    if ((wtcVar2.c & 16) != 0) {
                                        i4++;
                                        r13 = r13;
                                        if (i4 == 1) {
                                            bw4Var = wtcVar2;
                                        } else {
                                            if (r13 == 0) {
                                                r13 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r13.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r13.b(wtcVar2);
                                        }
                                    }
                                    wtcVar2 = wtcVar2.f;
                                    bw4Var = bw4Var;
                                    r13 = r13;
                                }
                                if (i4 == 1) {
                                }
                            }
                            bw4Var = c6o.X(r13);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, l0d l0dVar) {
        ojb ojbVar = this.d;
        if (ojbVar.c(j) && l0dVar.g(this) < 0) {
            ojbVar.e(j);
            this.e.h(j);
        }
        i1d i1dVar = this.a;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((odd) objArr[i2]).f(j, l0dVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
