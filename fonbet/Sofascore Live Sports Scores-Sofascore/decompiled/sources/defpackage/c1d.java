package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class c1d extends nnh {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public y0d h;
    public ArrayList i;
    public rnh j;
    public int[] k;
    public int l;
    public boolean m;

    public c1d(long j, rnh rnhVar, Function1 function1, Function1 function12) {
        super(j, rnhVar);
        this.e = function1;
        this.f = function12;
        this.j = rnh.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (snh.c) {
            this.j = this.j.m(j);
            Unit unit = Unit.a;
        }
    }

    public void B(y0d y0dVar) {
        this.h = y0dVar;
    }

    public c1d C(Function1 function1, Function1 function12) {
        c9d c9dVar;
        if (this.c) {
            h3f.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            h3f.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = snh.c;
        synchronized (obj) {
            long j = snh.e;
            snh.e = j + 1;
            snh.d = snh.d.m(j);
            rnh d = d();
            r(d.m(j));
            c9dVar = new c9d(j, snh.a(d, g() + 1, j), snh.i(function1, e(), true), snh.j(function12, i()), this);
        }
        if (this.m || this.c) {
            return c9dVar;
        }
        long g = g();
        synchronized (obj) {
            long j2 = snh.e;
            snh.e = j2 + 1;
            s(j2);
            snh.d = snh.d.m(g());
            Unit unit = Unit.a;
        }
        r(snh.a(d(), g + 1, g()));
        return c9dVar;
    }

    @Override // defpackage.nnh
    public final void b() {
        snh.d = snh.d.c(g()).a(this.j);
    }

    @Override // defpackage.nnh
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // defpackage.nnh
    public boolean f() {
        return false;
    }

    @Override // defpackage.nnh
    public int h() {
        return this.g;
    }

    @Override // defpackage.nnh
    public Function1 i() {
        return this.f;
    }

    @Override // defpackage.nnh
    public void k() {
        this.l++;
    }

    @Override // defpackage.nnh
    public void l() {
        if (this.l <= 0) {
            h3f.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        y0d x = x();
        if (x != null) {
            if (this.m) {
                h3f.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (sdi d = ((qdi) objArr[(i2 << 3) + i4]).d(); d != null; d = d.b) {
                                    long j2 = d.a;
                                    if (j2 == g || CollectionsKt.R(this.j, Long.valueOf(j2))) {
                                        z1h z1hVar = snh.a;
                                        d.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.nnh
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.nnh
    public void n(qdi qdiVar) {
        y0d x = x();
        if (x == null) {
            y0d y0dVar = rrg.a;
            x = new y0d();
            B(x);
        }
        x.a(qdiVar);
    }

    @Override // defpackage.nnh
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            snh.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.nnh
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.nnh
    public nnh u(Function1 function1) {
        d9d d9dVar;
        if (this.c) {
            h3f.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            h3f.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = snh.c;
        synchronized (obj) {
            long j = snh.e;
            snh.e = j + 1;
            snh.d = snh.d.m(j);
            d9dVar = new d9d(j, snh.a(d(), g + 1, j), snh.i(function1, e(), true), this);
        }
        if (this.m || this.c) {
            return d9dVar;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = snh.e;
            snh.e = j2 + 1;
            s(j2);
            snh.d = snh.d.m(g());
            Unit unit = Unit.a;
        }
        r(snh.a(d(), g2 + 1, g()));
        return d9dVar;
    }

    public final void v() {
        A(g());
        Unit unit = Unit.a;
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (snh.c) {
            long j = snh.e;
            snh.e = j + 1;
            s(j);
            snh.d = snh.d.m(g());
        }
        r(snh.a(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[LOOP:1: B:32:0x00ab->B:33:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:38:0x00bc, B:40:0x00cc, B:43:0x00d8, B:45:0x00e4, B:47:0x00ee, B:49:0x00f4, B:51:0x0103, B:57:0x0114, B:60:0x011e, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x0142, B:74:0x014a, B:76:0x014d, B:78:0x0151, B:80:0x0158, B:82:0x0164, B:88:0x010b), top: B:37:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:38:0x00bc, B:40:0x00cc, B:43:0x00d8, B:45:0x00e4, B:47:0x00ee, B:49:0x00f4, B:51:0x0103, B:57:0x0114, B:60:0x011e, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x0142, B:74:0x014a, B:76:0x014d, B:78:0x0151, B:80:0x0158, B:82:0x0164, B:88:0x010b), top: B:37:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oea w() {
        HashMap hashMap;
        List list;
        y0d y0dVar;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        y0d x = x();
        if (x != null) {
            long j3 = snh.j.b;
            hashMap = snh.m(j3, this, snh.d.c(j3));
        } else {
            hashMap = null;
        }
        km5 km5Var = km5.a;
        synchronized (snh.c) {
            try {
                snh.v(this);
                if (x != null && x.d != 0) {
                    d09 d09Var = snh.j;
                    oea z = z(snh.e, x, hashMap, snh.d.c(d09Var.b));
                    if (!z.equals(pnh.g)) {
                        return z;
                    }
                    b();
                    y0dVar = d09Var.h;
                    snh.u(d09Var, snh.a);
                    B(null);
                    d09Var.h = null;
                    list = snh.h;
                    Unit unit = Unit.a;
                    this.m = true;
                    if (y0dVar != null) {
                        srg srgVar = new srg(y0dVar);
                        if (!y0dVar.g()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Function2) list.get(i2)).invoke(srgVar, this);
                            }
                        }
                    }
                    if (x != null && x.h()) {
                        srg srgVar2 = new srg(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((Function2) list.get(i)).invoke(srgVar2, this);
                        }
                    }
                    synchronized (snh.c) {
                        try {
                            p();
                            snh.d();
                            if (y0dVar != null) {
                                Object[] objArr = y0dVar.b;
                                long[] jArr = y0dVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    snh.p((qdi) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
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
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            snh.p((qdi) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            snh.p((qdi) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                    Unit unit2 = Unit.a;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                            Unit unit22 = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return pnh.g;
                }
                b();
                d09 d09Var2 = snh.j;
                y0d y0dVar2 = d09Var2.h;
                snh.u(d09Var2, snh.a);
                if (y0dVar2 == null || !y0dVar2.h()) {
                    list = km5Var;
                    y0dVar = null;
                } else {
                    list = snh.h;
                    y0dVar = y0dVar2;
                }
                Unit unit3 = Unit.a;
                this.m = true;
                if (y0dVar != null) {
                }
                if (x != null) {
                    srg srgVar22 = new srg(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (snh.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public y0d x() {
        return this.h;
    }

    @Override // defpackage.nnh
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    public final oea z(long j, y0d y0dVar, HashMap hashMap, rnh rnhVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        rnh rnhVar2;
        Object[] objArr;
        long[] jArr;
        rnh rnhVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        sdi n2;
        rnh e = d().m(g()).e(this.j);
        Object[] objArr3 = y0dVar.b;
        long[] jArr3 = y0dVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            qdi qdiVar = (qdi) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            sdi d = qdiVar.d();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            sdi r = snh.r(d, j, rnhVar);
                            if (r == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                sdi r2 = snh.r(d, g(), e);
                                if (r2 != null && r2.a != 1 && !r.equals(r2)) {
                                    rnhVar3 = e;
                                    sdi r3 = snh.r(d, g(), d());
                                    if (r3 == null) {
                                        snh.q();
                                        throw null;
                                    }
                                    if (hashMap == null || (n2 = (sdi) hashMap.get(r)) == null) {
                                        n2 = qdiVar.n(r2, r, r3);
                                    }
                                    if (n2 == null) {
                                        return new onh(this);
                                    }
                                    if (!n2.equals(r3)) {
                                        if (n2.equals(r)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(qdiVar, r.c(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(qdiVar);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!n2.equals(r2) ? new Pair(qdiVar, n2) : new Pair(qdiVar, r2.c(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            rnhVar3 = e;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            rnhVar3 = e;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        e = rnhVar3;
                    }
                    rnhVar2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    rnhVar2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                e = rnhVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList3.get(i5);
                qdi qdiVar2 = (qdi) pair.a;
                sdi sdiVar = (sdi) pair.b;
                sdiVar.a = j;
                synchronized (snh.c) {
                    sdiVar.b = qdiVar2.d();
                    qdiVar2.c(sdiVar);
                    Unit unit = Unit.a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                y0dVar.l((qdi) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = CollectionsKt.w0(arrayList2, arrayList7);
            }
            this.i = arrayList2;
        }
        return pnh.g;
    }
}
