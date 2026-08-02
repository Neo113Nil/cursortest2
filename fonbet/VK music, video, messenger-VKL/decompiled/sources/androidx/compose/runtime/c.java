package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import org.chromium.net.NetError;
import xsna.abk0;
import xsna.at;
import xsna.at80;
import xsna.bbk0;
import xsna.be;
import xsna.blk;
import xsna.bvi;
import xsna.c9e0;
import xsna.ci50;
import xsna.csa;
import xsna.cvi;
import xsna.d5x;
import xsna.dlu;
import xsna.e43;
import xsna.egx;
import xsna.eh50;
import xsna.epx;
import xsna.evi;
import xsna.fc30;
import xsna.fd3;
import xsna.fh50;
import xsna.fto0;
import xsna.g1m;
import xsna.g5g;
import xsna.ghj0;
import xsna.gvi;
import xsna.gxc0;
import xsna.gzs;
import xsna.h08;
import xsna.h20;
import xsna.h5h0;
import xsna.hc30;
import xsna.hg10;
import xsna.hqj;
import xsna.huf0;
import xsna.hvi;
import xsna.i1m;
import xsna.ic30;
import xsna.iuf0;
import xsna.ivi;
import xsna.j5g;
import xsna.j5h0;
import xsna.jai;
import xsna.jw5;
import xsna.jxb0;
import xsna.k0x;
import xsna.k5h0;
import xsna.kq80;
import xsna.ldy;
import xsna.lnr;
import xsna.lvi;
import xsna.m5z;
import xsna.m9x;
import xsna.mg50;
import xsna.myk0;
import xsna.oc;
import xsna.oe5;
import xsna.pg50;
import xsna.ph50;
import xsna.qak0;
import xsna.qh50;
import xsna.qp80;
import xsna.qq9;
import xsna.qqi;
import xsna.qv20;
import xsna.qx;
import xsna.r2k0;
import xsna.rfg0;
import xsna.rgt;
import xsna.rh50;
import xsna.ry90;
import xsna.s3q0;
import xsna.s640;
import xsna.s9x;
import xsna.sdi;
import xsna.sri;
import xsna.ss80;
import xsna.sy90;
import xsna.tgt;
import xsna.tqi;
import xsna.ttp0;
import xsna.tvi;
import xsna.u0y;
import xsna.upx;
import xsna.v2k0;
import xsna.vef0;
import xsna.vgt;
import xsna.vqi;
import xsna.wef0;
import xsna.wh50;
import xsna.wzs;
import xsna.x2k0;
import xsna.xjr0;
import xsna.xo9;
import xsna.xy9;
import xsna.y2k0;
import xsna.y7f0;
import xsna.ygt;
import xsna.ypi;
import xsna.yy1;
import xsna.zak0;
import xsna.zgt;
import xsna.znk0;

/* compiled from: GapComposer.kt */
/* loaded from: classes11.dex */
public final class c extends egx {
    public int A;
    public int B;
    public boolean C;
    public final tgt D;
    public final ArrayList<f> E;
    public boolean F;
    public r2k0 G;
    public v2k0 H;
    public y2k0 I;
    public boolean J;
    public sy90 K;
    public csa L;
    public final sri M;
    public rgt N;
    public lnr O;
    public ghj0 P;
    public final gvi Q;
    public final kotlin.coroutines.d R;
    public boolean S;
    public long T;
    public vgt U;
    public final oc a;
    public final cvi b;
    public final v2k0 c;
    public final rh50 d;
    public final csa e;
    public final csa f;
    public final jxb0 g;
    public final ivi h;
    public ygt j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public mg50 p;
    public boolean q;
    public boolean r;
    public pg50<sy90> v;
    public boolean w;
    public boolean y;
    public final ArrayList<ygt> i = new ArrayList<>();
    public final s9x n = new s9x();
    public final ArrayList s = new ArrayList();
    public final s9x t = new s9x();
    public sy90 u = ry90.e;
    public final s9x x = new s9x();
    public int z = -1;

    /* compiled from: GapComposer.kt */
    public final class b extends cvi {
        public final long a;
        public final boolean b;
        public final boolean c;
        public HashSet d;
        public final qh50<c> e = k5h0.a();
        public final wh50 f = new ParcelableSnapshotMutableState(ry90.e, hg10.g);

        public b(long j, boolean z, boolean z2, jxb0 jxb0Var) {
            this.a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // xsna.cvi
        public final void a(hqj hqjVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
            c.this.b.a(hqjVar, wzsVar);
        }

        @Override // xsna.cvi
        public final j5h0<f> b(hqj hqjVar, ghj0 ghj0Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
            return c.this.b.b(hqjVar, ghj0Var, wzsVar);
        }

        @Override // xsna.cvi
        public final void c(ic30 ic30Var) {
            c.this.b.c(ic30Var);
        }

        @Override // xsna.cvi
        public final void d() {
            c cVar = c.this;
            cVar.A--;
        }

        @Override // xsna.cvi
        public final boolean e() {
            return c.this.b.e();
        }

        @Override // xsna.cvi
        public final boolean f() {
            return this.b;
        }

        @Override // xsna.cvi
        public final boolean g() {
            return this.c;
        }

        @Override // xsna.cvi
        public final long h() {
            return this.a;
        }

        @Override // xsna.cvi
        public final bvi i() {
            return c.this.h;
        }

        @Override // xsna.cvi
        public final sy90 j() {
            return (sy90) ((zak0) this.f).getValue();
        }

        @Override // xsna.cvi
        public final kotlin.coroutines.d k() {
            return c.this.b.k();
        }

        @Override // xsna.cvi
        public final boolean l() {
            return c.this.b.l();
        }

        @Override // xsna.cvi
        public final void m(ic30 ic30Var) {
            c.this.b.m(ic30Var);
        }

        @Override // xsna.cvi
        public final void n(hqj hqjVar) {
            c cVar = c.this;
            cvi cviVar = cVar.b;
            cviVar.n(cVar.h);
            cviVar.n(hqjVar);
        }

        @Override // xsna.cvi
        public final void o(ic30 ic30Var, hc30 hc30Var, fd3<?> fd3Var) {
            c.this.b.o(ic30Var, hc30Var, fd3Var);
        }

        @Override // xsna.cvi
        public final hc30 p(ic30 ic30Var) {
            return c.this.b.p(ic30Var);
        }

        @Override // xsna.cvi
        public final j5h0<f> q(hqj hqjVar, ghj0 ghj0Var, j5h0<f> j5h0Var) {
            return c.this.b.q(hqjVar, ghj0Var, j5h0Var);
        }

        @Override // xsna.cvi
        public final void r(Set<evi> set) {
            HashSet hashSet = this.d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // xsna.cvi
        public final void s(c cVar) {
            this.e.e(cVar);
        }

        @Override // xsna.cvi
        public final void t(f fVar) {
            c.this.b.t(fVar);
        }

        @Override // xsna.cvi
        public final void u(hqj hqjVar) {
            c.this.b.u(hqjVar);
        }

        @Override // xsna.cvi
        public final qq9 v(m5z m5zVar) {
            return c.this.b.v(m5zVar);
        }

        @Override // xsna.cvi
        public final void w() {
            c.this.A++;
        }

        @Override // xsna.cvi
        public final void x(c cVar) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(cVar.U());
                }
            }
            if (cVar != null) {
                this.e.m(cVar);
            }
        }

        @Override // xsna.cvi
        public final void y(ivi iviVar) {
            c.this.b.y(iviVar);
        }

        public final void z() {
            qh50<c> qh50Var = this.e;
            if (qh50Var.d()) {
                HashSet hashSet = this.d;
                if (hashSet != null) {
                    Object[] objArr = qh50Var.b;
                    long[] jArr = qh50Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        c cVar = (c) objArr[(i << 3) + i3];
                                        Iterator it = hashSet.iterator();
                                        while (it.hasNext()) {
                                            ((Set) it.next()).remove(cVar.U());
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                qh50Var.f();
            }
        }
    }

    public c(oc ocVar, cvi cviVar, v2k0 v2k0Var, rh50 rh50Var, csa csaVar, csa csaVar2, jxb0 jxb0Var, ivi iviVar) {
        this.a = ocVar;
        this.b = cviVar;
        this.c = v2k0Var;
        this.d = rh50Var;
        this.e = csaVar;
        this.f = csaVar2;
        this.g = jxb0Var;
        this.h = iviVar;
        this.C = cviVar.g() || cviVar.e();
        this.D = new tgt(this);
        this.E = new ArrayList<>();
        r2k0 e0 = v2k0Var.e0();
        e0.c();
        this.G = e0;
        v2k0 v2k0Var2 = new v2k0();
        if (cviVar.g()) {
            v2k0Var2.c0();
        }
        if (cviVar.e()) {
            v2k0Var2.b0();
        }
        this.H = v2k0Var2;
        y2k0 f0 = v2k0Var2.f0();
        f0.e(true);
        this.I = f0;
        this.M = new sri(this, csaVar);
        r2k0 e02 = this.H.e0();
        try {
            rgt a2 = e02.a(0);
            e02.c();
            this.N = a2;
            this.O = new lnr();
            this.Q = new gvi(this);
            kotlin.coroutines.d k = cviVar.k();
            kotlin.coroutines.d q0 = q0();
            this.R = k.plus(q0 == null ? EmptyCoroutineContext.b : q0);
        } catch (Throwable th) {
            e02.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ic30 C0(c cVar, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int h;
        int i2 = cVar.G.i(i);
        r2k0 r2k0Var = cVar.G;
        Object p = r2k0Var.p(i, r2k0Var.b);
        if (i2 != 126665345 || !(p instanceof fc30)) {
            return null;
        }
        if (cVar.G.d(i)) {
            ArrayList arrayList3 = new ArrayList();
            D0(cVar, arrayList3, i);
            if (!arrayList3.isEmpty()) {
                arrayList = arrayList3;
                r2k0 r2k0Var2 = cVar.G;
                fc30 fc30Var = (fc30) r2k0Var2.p(i, r2k0Var2.b);
                Object h2 = cVar.G.h(i, 0);
                rgt a2 = cVar.G.a(i);
                int a3 = x2k0.a(i, cVar.G.b) + i;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = cVar.s;
                h = xo9.h(i, arrayList2);
                if (h < 0) {
                    h = -(h + 1);
                }
                while (h < arrayList2.size()) {
                    upx upxVar = (upx) arrayList2.get(h);
                    if (upxVar.b >= a3) {
                        break;
                    }
                    arrayList4.add(new Pair(upxVar.a, upxVar.c));
                    h++;
                }
                return new ic30(fc30Var, h2, cVar.h, cVar.c, a2, arrayList4, cVar.h0(i), arrayList);
            }
        }
        arrayList = null;
        r2k0 r2k0Var22 = cVar.G;
        fc30 fc30Var2 = (fc30) r2k0Var22.p(i, r2k0Var22.b);
        Object h22 = cVar.G.h(i, 0);
        rgt a22 = cVar.G.a(i);
        int a32 = x2k0.a(i, cVar.G.b) + i;
        ArrayList arrayList42 = new ArrayList();
        arrayList2 = cVar.s;
        h = xo9.h(i, arrayList2);
        if (h < 0) {
        }
        while (h < arrayList2.size()) {
        }
        return new ic30(fc30Var2, h22, cVar.h, cVar.c, a22, arrayList42, cVar.h0(i), arrayList);
    }

    public static final void D0(c cVar, ArrayList arrayList, int i) {
        int a2 = x2k0.a(i, cVar.G.b) + i;
        int i2 = i + 1;
        while (i2 < a2) {
            if (cVar.G.j(i2)) {
                ic30 C0 = C0(cVar, i2);
                if (C0 != null) {
                    arrayList.add(C0);
                }
            } else if (cVar.G.d(i2)) {
                D0(cVar, arrayList, i2);
            }
            i2 += x2k0.a(i2, cVar.G.b);
        }
    }

    public static final int E0(c cVar, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        long[] jArr2;
        Object[] objArr2;
        int i6;
        int i7;
        r2k0 r2k0Var = cVar.G;
        cvi cviVar = cVar.b;
        sri sriVar = cVar.M;
        boolean j = r2k0Var.j(i2);
        int[] iArr = r2k0Var.b;
        int i8 = 0;
        if (j) {
            int i9 = r2k0Var.i(i2);
            Object p = r2k0Var.p(i2, iArr);
            if (i9 == 126665345 && (p instanceof fc30)) {
                ic30 C0 = C0(cVar, i2);
                if (C0 != null) {
                    cviVar.c(C0);
                    sriVar.e();
                    ivi iviVar = cVar.h;
                    at80 at80Var = sriVar.b.b;
                    at80Var.b0(ss80.u.c);
                    at80.b.c(at80Var, iviVar, cviVar, C0);
                }
                if (!z || i2 == i) {
                    return r2k0Var.o(i2);
                }
                sriVar.c();
                sriVar.b();
                c cVar2 = sriVar.a;
                int o = cVar2.G.l(i2) ? 1 : cVar2.G.o(i2);
                if (o > 0) {
                    sriVar.f(i3, o);
                }
                return 0;
            }
            if (i9 == 206 && epx.f(p, androidx.compose.runtime.b.f)) {
                Object h = r2k0Var.h(i2, 0);
                iuf0 iuf0Var = h instanceof iuf0 ? (iuf0) h : null;
                Object b2 = iuf0Var != null ? iuf0Var.b() : null;
                a aVar = b2 instanceof a ? (a) b2 : null;
                if (aVar != null) {
                    qh50<c> qh50Var = aVar.b.e;
                    Object[] objArr3 = qh50Var.b;
                    long[] jArr3 = qh50Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr3[i10];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = i8;
                                while (i13 < i12) {
                                    if ((255 & j2) < 128) {
                                        c cVar3 = (c) objArr3[(i10 << 3) + i13];
                                        sri sriVar2 = cVar3.M;
                                        ivi iviVar2 = cVar3.h;
                                        i6 = i11;
                                        v2k0 v2k0Var = cVar3.c;
                                        if (v2k0Var.c <= 0 || (v2k0Var.b[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i7 = 0;
                                        } else {
                                            synchronized (iviVar2.e) {
                                                iviVar2.H();
                                                objArr2 = objArr3;
                                                ph50<Object, Object> ph50Var = iviVar2.o;
                                                jArr2 = jArr3;
                                                iviVar2.o = h5h0.b();
                                                try {
                                                    iviVar2.w.M0(ph50Var);
                                                    s3q0 s3q0Var = s3q0.a;
                                                } finally {
                                                }
                                            }
                                            csa csaVar = new csa();
                                            cVar3.L = csaVar;
                                            r2k0 e0 = v2k0Var.e0();
                                            try {
                                                cVar3.G = e0;
                                                csa csaVar2 = sriVar2.b;
                                                try {
                                                    sriVar2.b = csaVar;
                                                    cVar3.B0(0);
                                                    sriVar2.b();
                                                    if (sriVar2.c) {
                                                        sriVar2.b.b.b0(ss80.b0.c);
                                                        if (sriVar2.c) {
                                                            i7 = 0;
                                                            sriVar2.d(false);
                                                            sriVar2.d(false);
                                                            sriVar2.b.b.b0(ss80.j.c);
                                                            sriVar2.c = false;
                                                            sriVar2.b = csaVar2;
                                                            s3q0 s3q0Var2 = s3q0.a;
                                                        }
                                                    }
                                                    i7 = 0;
                                                    sriVar2.b = csaVar2;
                                                    s3q0 s3q0Var22 = s3q0.a;
                                                } finally {
                                                }
                                            } finally {
                                                e0.c();
                                            }
                                        }
                                        cviVar.u(iviVar2);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i6 = i11;
                                        i7 = i8;
                                    }
                                    j2 >>= i6;
                                    i13++;
                                    jArr3 = jArr2;
                                    i8 = i7;
                                    objArr3 = objArr2;
                                    i11 = i6;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                int i14 = i11;
                                i5 = i8;
                                if (i12 != i14) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i5 = i8;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            jArr3 = jArr;
                            i8 = i5;
                            objArr3 = objArr;
                        }
                    }
                }
                return r2k0Var.o(i2);
            }
            i4 = 1;
            if (!r2k0Var.l(i2)) {
                return r2k0Var.o(i2);
            }
        } else {
            i4 = 1;
            if (r2k0Var.d(i2)) {
                int a2 = x2k0.a(i2, iArr) + i2;
                int i15 = 0;
                for (int i16 = i2 + 1; i16 < a2; i16 += iArr[(i16 * 5) + 3]) {
                    boolean l = r2k0Var.l(i16);
                    if (l) {
                        sriVar.c();
                        Object n = r2k0Var.n(i16);
                        sriVar.c();
                        sriVar.h.add(n);
                    }
                    i15 += E0(cVar, i, i16, l || z, l ? 0 : i3 + i15);
                    if (l) {
                        sriVar.c();
                        sriVar.a();
                    }
                }
                if (!r2k0Var.l(i2)) {
                    return i15;
                }
            } else if (!r2k0Var.l(i2)) {
                return r2k0Var.o(i2);
            }
        }
        return i4;
    }

    @Override // androidx.compose.runtime.a
    public final void A(boolean z) {
        if (this.l != 0) {
            androidx.compose.runtime.b.a("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (this.S) {
            return;
        }
        if (!z) {
            G0();
            return;
        }
        r2k0 r2k0Var = this.G;
        int i = r2k0Var.g;
        int i2 = r2k0Var.h;
        sri sriVar = this.M;
        sriVar.getClass();
        sriVar.d(false);
        sriVar.b.b.b0(ss80.f.c);
        xo9.d(this.s, i, i2);
        this.G.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(int i, int i2, int i3) {
        r2k0 r2k0Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (r2k0Var.q(i) == i2) {
                    i3 = i2;
                } else if (r2k0Var.q(i2) != i) {
                    if (r2k0Var.q(i) == r2k0Var.q(i2)) {
                        i3 = r2k0Var.q(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = r2k0Var.q(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = r2k0Var.q(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = r2k0Var.q(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = r2k0Var.q(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = r2k0Var.q(i14)) {
                            i3 = r2k0Var.q(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!r2k0Var.l(i)) {
                    this.M.a();
                }
                i = r2k0Var.q(i);
            }
            k0(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!r2k0Var.l(i)) {
            }
            i = r2k0Var.q(i);
        }
        k0(i2, i3);
    }

    @Override // androidx.compose.runtime.a
    public final long B() {
        return this.T;
    }

    public final void B0(int i) {
        boolean l = this.G.l(i);
        sri sriVar = this.M;
        if (l) {
            sriVar.c();
            Object n = this.G.n(i);
            sriVar.c();
            sriVar.h.add(n);
        }
        E0(this, i, i, l, 0);
        sriVar.c();
        if (l) {
            sriVar.a();
        }
    }

    @Override // androidx.compose.runtime.a
    public final void C(int i) {
        if (i < 0) {
            int i2 = -i;
            y2k0 y2k0Var = this.I;
            while (true) {
                int i3 = y2k0Var.v;
                if (i3 <= i2) {
                    return;
                } else {
                    l0(y2k0Var.D(i3));
                }
            }
        } else {
            if (this.S) {
                y2k0 y2k0Var2 = this.I;
                while (this.S) {
                    l0(y2k0Var2.D(y2k0Var2.v));
                }
            }
            r2k0 r2k0Var = this.G;
            while (true) {
                int i4 = r2k0Var.i;
                if (i4 <= i) {
                    return;
                } else {
                    l0(r2k0Var.l(i4));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.a
    public final sy90 D() {
        return g0();
    }

    @Override // androidx.compose.runtime.a
    public final void E(fc30 fc30Var) {
        s0(fc30Var, g0(), null, false);
    }

    @Override // androidx.compose.runtime.a
    public final void F() {
        l0(false);
        l0(false);
        this.w = this.x.b() != 0;
        this.K = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0() {
        int i;
        long rotateLeft;
        long j;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        r2k0 r2k0Var = this.G;
        int g = r2k0Var.g();
        int[] iArr = r2k0Var.b;
        int i2 = r2k0Var.g;
        Object p = i2 < r2k0Var.h ? r2k0Var.p(i2, iArr) : null;
        Object f = r2k0Var.f();
        int i3 = this.m;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (p != null) {
            if (p instanceof Enum) {
                rotateLeft = Long.rotateLeft(((Enum) p).ordinal() ^ Long.rotateLeft(this.T, 3), 3);
                i = 0;
            } else {
                i = 0;
                rotateLeft = Long.rotateLeft(p.hashCode() ^ Long.rotateLeft(this.T, 3), 3);
            }
            j = rotateLeft ^ i;
        } else {
            if (f != null && g == 207 && !f.equals(c0012a)) {
                this.T = Long.rotateLeft(f.hashCode() ^ Long.rotateLeft(this.T, 3), 3) ^ i3;
                J0(null, (iArr[(r2k0Var.g * 5) + 1] & 1073741824) != 0);
                x0();
                r2k0Var.e();
                if (p == null) {
                    if (p instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ ((Enum) p).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ p.hashCode(), 3);
                        return;
                    }
                }
                if (f == null || g != 207 || f.equals(c0012a)) {
                    this.T = Long.rotateRight(g ^ Long.rotateRight(this.T ^ i3, 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i3, 3) ^ f.hashCode(), 3);
                    return;
                }
            }
            j = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g, 3) ^ i3;
        }
        this.T = j;
        J0(null, (iArr[(r2k0Var.g * 5) + 1] & 1073741824) != 0);
        x0();
        r2k0Var.e();
        if (p == null) {
        }
    }

    @Override // androidx.compose.runtime.a
    public final void G() {
        l0(true);
    }

    public final void G0() {
        r2k0 r2k0Var = this.G;
        int i = r2k0Var.i;
        this.l = i >= 0 ? r2k0Var.b[(i * 5) + 1] & 67108863 : 0;
        r2k0Var.t();
    }

    @Override // androidx.compose.runtime.a
    public final void H() {
        H0(null, 125, 2, null);
        this.r = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(Object obj, int i, int i2, Object obj2) {
        long rotateLeft;
        long j;
        boolean z;
        boolean z2;
        ygt ygtVar;
        ygt ygtVar2;
        int i3;
        Object[] objArr;
        Object[] objArr2;
        int i4;
        int i5;
        boolean z3;
        ?? r3;
        Object obj3 = obj;
        if (this.r) {
            androidx.compose.runtime.b.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i6 = this.m;
        Object obj4 = a.C0011a.a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
            j = 0;
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i6;
                boolean z4 = true;
                if (obj3 == null) {
                    this.m++;
                }
                boolean z5 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    y2k0 y2k0Var = this.I;
                    int i7 = y2k0Var.t;
                    if (z5) {
                        y2k0Var.Z(obj4, obj4, true, i);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        y2k0Var.Z(obj3, obj2, false, i);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        y2k0Var.Y(i, obj3);
                    }
                    ygt ygtVar3 = this.j;
                    if (ygtVar3 != null) {
                        int i8 = (-2) - i7;
                        ldy ldyVar = new ldy(i, i8, -1, -1);
                        ygtVar3.e.k(i8, new dlu(-1, this.k - ygtVar3.b, 0));
                        ygtVar3.d.add(ldyVar);
                    }
                    n0(z5, null);
                    return;
                }
                boolean z6 = i2 == 1 && this.y;
                if (this.j == null) {
                    int g = this.G.g();
                    if (!z6 && g == i) {
                        r2k0 r2k0Var = this.G;
                        int i9 = r2k0Var.g;
                        if (epx.f(obj3, i9 < r2k0Var.h ? r2k0Var.p(i9, r2k0Var.b) : null)) {
                            J0(obj2, z5);
                        }
                    }
                    r2k0 r2k0Var2 = this.G;
                    int[] iArr = r2k0Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (r2k0Var2.k <= 0) {
                        int i10 = r2k0Var2.g;
                        while (i10 < r2k0Var2.h) {
                            int i11 = i10 * 5;
                            boolean z7 = z4;
                            int i12 = iArr[i11];
                            Object p = r2k0Var2.p(i10, iArr);
                            int i13 = iArr[i11 + 1];
                            if ((i13 & 1073741824) != 0) {
                                z3 = z6;
                                r3 = z7;
                            } else {
                                z3 = z6;
                                r3 = i13 & 67108863;
                            }
                            arrayList.add(new ldy(i12, i10, r3, p));
                            i10 += iArr[i11 + 3];
                            z6 = z3;
                            z4 = z7;
                        }
                    }
                    z = z6;
                    z2 = z4;
                    this.j = new ygt(arrayList, this.k);
                    ygtVar = this.j;
                    if (ygtVar != null) {
                        ArrayList arrayList2 = ygtVar.d;
                        pg50<dlu> pg50Var = ygtVar.e;
                        int i14 = ygtVar.b;
                        Object u0yVar = obj3 != null ? new u0y(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        ph50<Object, Object> ph50Var = ((s640) ygtVar.f.getValue()).a;
                        Object d = ph50Var.d(u0yVar);
                        if (d == null) {
                            d = null;
                        } else if (d instanceof fh50) {
                            fh50 fh50Var = (fh50) d;
                            Object o = fh50Var.o(0);
                            if (fh50Var.f()) {
                                ph50Var.n(u0yVar);
                            }
                            if (fh50Var.b == 1) {
                                ph50Var.p(u0yVar, fh50Var.c());
                            }
                            d = o;
                        } else {
                            ph50Var.n(u0yVar);
                        }
                        ldy ldyVar2 = (ldy) d;
                        if (z || ldyVar2 == null) {
                            this.G.k++;
                            this.S = z2;
                            this.K = null;
                            if (this.I.w) {
                                y2k0 f0 = this.H.f0();
                                this.I = f0;
                                f0.U();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            y2k0 y2k0Var2 = this.I;
                            int i15 = y2k0Var2.t;
                            if (z5) {
                                y2k0Var2.Z(obj4, obj4, true, i);
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                y2k0Var2.Z(obj4, obj2, false, i);
                            } else {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                y2k0Var2.Y(i, obj4);
                            }
                            this.N = this.I.b(i15);
                            int i16 = (-2) - i15;
                            ldy ldyVar3 = new ldy(i, i16, -1, -1);
                            pg50Var.k(i16, new dlu(-1, this.k - i14, 0));
                            arrayList2.add(ldyVar3);
                            ygtVar2 = new ygt(new ArrayList(), z5 ? 0 : this.k);
                            n0(z5, ygtVar2);
                            return;
                        }
                        int i17 = ldyVar2.c;
                        arrayList2.add(ldyVar2);
                        dlu b2 = pg50Var.b(i17);
                        this.k = (b2 != null ? b2.b : -1) + i14;
                        dlu b3 = pg50Var.b(i17);
                        int i18 = b3 != null ? b3.a : -1;
                        int i19 = ygtVar.c;
                        int i20 = i18 - i19;
                        int i21 = 8;
                        if (i18 > i19) {
                            Object[] objArr3 = pg50Var.c;
                            long[] jArr = pg50Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j2 = jArr[i22];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j2 & 255) < 128) {
                                                i5 = i21;
                                                dlu dluVar = (dlu) objArr3[(i22 << 3) + i24];
                                                i4 = i20;
                                                int i25 = dluVar.a;
                                                if (i25 == i18) {
                                                    dluVar.a = i19;
                                                } else if (i19 <= i25 && i25 < i18) {
                                                    dluVar.a = i25 + 1;
                                                }
                                            } else {
                                                i4 = i20;
                                                i5 = i21;
                                            }
                                            j2 >>= i5;
                                            i24++;
                                            i20 = i4;
                                            i21 = i5;
                                        }
                                        i3 = i20;
                                        if (i23 != i21) {
                                            break;
                                        }
                                    } else {
                                        i3 = i20;
                                    }
                                    if (i22 == length) {
                                        break;
                                    }
                                    i22++;
                                    i20 = i3;
                                    i21 = 8;
                                }
                            } else {
                                i3 = i20;
                            }
                        } else {
                            i3 = i20;
                            if (i19 > i18) {
                                Object[] objArr4 = pg50Var.c;
                                long[] jArr2 = pg50Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i26 = 0;
                                    while (true) {
                                        long j3 = jArr2[i26];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                            int i28 = 0;
                                            while (i28 < i27) {
                                                if ((j3 & 255) < 128) {
                                                    dlu dluVar2 = (dlu) objArr4[(i26 << 3) + i28];
                                                    int i29 = dluVar2.a;
                                                    if (i29 == i18) {
                                                        dluVar2.a = i19;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i18 + 1 <= i29 && i29 < i19) {
                                                            dluVar2.a = i29 - 1;
                                                        }
                                                        j3 >>= 8;
                                                        i28++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j3 >>= 8;
                                                i28++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i27 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i26 == length2) {
                                            break;
                                        }
                                        i26++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        sri sriVar = this.M;
                        sriVar.f = (i17 - sriVar.a.G.g) + sriVar.f;
                        this.G.r(i17);
                        if (i3 > 0) {
                            sriVar.d(false);
                            sriVar.e();
                            at80 at80Var = sriVar.b.b;
                            at80Var.b0(ss80.r.c);
                            at80Var.d[at80Var.e - at80Var.b[at80Var.c - 1].a] = i3;
                        }
                        J0(obj2, z5);
                    }
                    ygtVar2 = null;
                    n0(z5, ygtVar2);
                    return;
                }
                z = z6;
                z2 = true;
                ygtVar = this.j;
                if (ygtVar != null) {
                }
                ygtVar2 = null;
                n0(z5, ygtVar2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3);
            j = i6;
        }
        this.T = rotateLeft ^ j;
        boolean z42 = true;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    @Override // androidx.compose.runtime.a
    public final <T> void I(gzs<? extends T> gzsVar) {
        if (!this.r) {
            androidx.compose.runtime.b.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            androidx.compose.runtime.b.a("createNode() can only be called when inserting");
        }
        s9x s9xVar = this.n;
        int i = s9xVar.a[s9xVar.b - 1];
        y2k0 y2k0Var = this.I;
        rgt b2 = y2k0Var.b(y2k0Var.v);
        this.l++;
        lnr lnrVar = this.O;
        at80 at80Var = lnrVar.b;
        at80Var.b0(ss80.o.c);
        at80.b.a(at80Var, 0, gzsVar);
        at80Var.d[at80Var.e - at80Var.b[at80Var.c - 1].a] = i;
        at80.b.a(at80Var, 1, b2);
        at80 at80Var2 = lnrVar.c;
        at80Var2.b0(ss80.t.c);
        at80Var2.d[at80Var2.e - at80Var2.b[at80Var2.c - 1].a] = i;
        at80.b.a(at80Var2, 0, b2);
    }

    public final void I0(int i, qp80 qp80Var) {
        H0(qp80Var, i, 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final boolean J(Object obj) {
        if (epx.f(t0(), obj)) {
            return false;
        }
        P0(obj);
        return true;
    }

    public final void J0(Object obj, boolean z) {
        if (z) {
            r2k0 r2k0Var = this.G;
            if (r2k0Var.k <= 0) {
                if ((r2k0Var.b[(r2k0Var.g * 5) + 1] & 1073741824) == 0) {
                    gxc0.a("Expected a node group");
                }
                r2k0Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            sri sriVar = this.M;
            sriVar.getClass();
            sriVar.d(false);
            at80 at80Var = sriVar.b.b;
            at80Var.b0(ss80.f0.c);
            at80.b.a(at80Var, 0, obj);
        }
        this.G.u();
    }

    @Override // androidx.compose.runtime.a
    public final void K(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            H0(null, i, 0, null);
            return;
        }
        if (this.r) {
            androidx.compose.runtime.b.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        r2k0 r2k0Var = this.G;
        boolean z = this.S;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (z) {
            r2k0Var.k++;
            this.I.Y(i, c0012a);
            n0(false, null);
            return;
        }
        if (r2k0Var.g() == i && ((i3 = r2k0Var.g) >= r2k0Var.h || (r2k0Var.b[(i3 * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0)) {
            r2k0Var.u();
            n0(false, null);
            return;
        }
        if (r2k0Var.k <= 0 && (i2 = r2k0Var.g) != r2k0Var.h) {
            int i4 = this.k;
            y0();
            this.M.f(i4, r2k0Var.s());
            xo9.d(this.s, i2, r2k0Var.g);
        }
        r2k0Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            y2k0 f0 = this.H.f0();
            this.I = f0;
            f0.U();
            this.J = false;
            this.K = null;
        }
        y2k0 y2k0Var = this.I;
        y2k0Var.d();
        int i5 = y2k0Var.t;
        y2k0Var.Y(i, c0012a);
        this.N = y2k0Var.b(i5);
        n0(false, null);
    }

    public final void K0() {
        this.m = 0;
        this.G = this.c.e0();
        H0(null, 100, 0, null);
        cvi cviVar = this.b;
        cviVar.w();
        sy90 j = cviVar.j();
        this.x.c(this.w ? 1 : 0);
        this.w = J(j);
        this.K = null;
        if (!this.q) {
            this.q = cviVar.f();
        }
        if (!this.C) {
            this.C = cviVar.g();
        }
        if (this.C) {
            j = j.f3(hvi.a, new myk0(q0()));
        }
        this.u = j;
        Set<evi> set = (Set) tvi.a(j, d5x.a);
        if (set != null) {
            set.add(U());
            cviVar.r(set);
        }
        H0(null, Long.hashCode(cviVar.h()), 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final boolean L() {
        return this.S;
    }

    public final boolean L0(f fVar, Object obj) {
        yy1 yy1Var = fVar.c;
        if (yy1Var == null) {
            return false;
        }
        int a0 = this.G.a.a0(sdi.d(yy1Var));
        if (!this.F || a0 < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int h = xo9.h(a0, arrayList);
        if (h < 0) {
            int i = -(h + 1);
            if (!(obj instanceof g1m)) {
                obj = null;
            }
            arrayList.add(i, new upx(fVar, a0, obj));
            return true;
        }
        upx upxVar = (upx) arrayList.get(h);
        if (!(obj instanceof g1m)) {
            upxVar.c = null;
            return true;
        }
        Object obj2 = upxVar.c;
        if (obj2 == null) {
            upxVar.c = obj;
            return true;
        }
        if (obj2 instanceof qh50) {
            ((qh50) obj2).e(obj);
            return true;
        }
        qh50<Object> qh50Var = k5h0.a;
        qh50 qh50Var2 = new qh50(2);
        qh50Var2.k(obj2);
        qh50Var2.k(obj);
        upxVar.c = qh50Var2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    @Override // androidx.compose.runtime.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.runtime.a M(int i) {
        f fVar;
        boolean z;
        K(i);
        boolean z2 = this.S;
        jxb0 jxb0Var = this.g;
        ArrayList<f> arrayList = this.E;
        ivi iviVar = this.h;
        if (z2) {
            f fVar2 = new f(iviVar);
            arrayList.add(fVar2);
            P0(fVar2);
            fVar2.e = this.B;
            fVar2.b &= -17;
            jxb0Var.b();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int h = xo9.h(i2, arrayList2);
        upx upxVar = h >= 0 ? (upx) arrayList2.remove(h) : null;
        Object m = this.G.m();
        if (epx.f(m, a.C0011a.a)) {
            fVar = new f(iviVar);
            P0(fVar);
        } else {
            fVar = (f) m;
        }
        if (upxVar == null) {
            int i3 = fVar.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                fVar.b = i3 & (-65);
            }
            if (!z3) {
                z = false;
                fVar.f(z);
                arrayList.add(fVar);
                fVar.e = this.B;
                fVar.b &= -17;
                jxb0Var.b();
                if ((fVar.b & 256) != 0) {
                    fVar.e(false);
                    fVar.i(true);
                    at80 at80Var = this.M.b.b;
                    at80Var.b0(ss80.c0.c);
                    at80.b.a(at80Var, 0, fVar);
                    if (!this.y && (fVar.b & 128) != 0) {
                        this.y = true;
                        this.z = this.G.i;
                        fVar.h(true);
                    }
                }
                return this;
            }
        }
        z = true;
        fVar.f(z);
        arrayList.add(fVar);
        fVar.e = this.B;
        fVar.b &= -17;
        jxb0Var.b();
        if ((fVar.b & 256) != 0) {
        }
        return this;
    }

    public final void M0(ph50<Object, Object> ph50Var) {
        ArrayList arrayList = this.s;
        for (int h = e43.h(arrayList); -1 < h; h--) {
            upx upxVar = (upx) arrayList.get(h);
            yy1 yy1Var = upxVar.a.c;
            rgt d = yy1Var != null ? sdi.d(yy1Var) : null;
            if (d == null || !d.a()) {
                arrayList.remove(h);
            } else {
                int i = upxVar.b;
                int i2 = d.a;
                if (i != i2) {
                    upxVar.b = i2;
                }
            }
        }
        Object[] objArr = ph50Var.b;
        Object[] objArr2 = ph50Var.c;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            f fVar = (f) obj;
                            yy1 yy1Var2 = fVar.c;
                            if (yy1Var2 != null) {
                                int i7 = sdi.d(yy1Var2).a;
                                if (obj2 == fto0.k) {
                                    obj2 = null;
                                }
                                arrayList.add(new upx(fVar, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        g5g.L(arrayList, xo9.e);
    }

    @Override // androidx.compose.runtime.a
    public final fd3<?> N() {
        return this.a;
    }

    public final void N0(int i, int i2) {
        if (Q0(i) != i2) {
            if (i < 0) {
                mg50 mg50Var = this.p;
                if (mg50Var == null) {
                    mg50Var = new mg50();
                    this.p = mg50Var;
                }
                mg50Var.g(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                jw5.o(-1, 0, 6, iArr);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    @Override // androidx.compose.runtime.a
    public final Object O(Object obj, Object obj2) {
        r2k0 r2k0Var = this.G;
        int i = r2k0Var.g;
        Object k = xo9.k(i < r2k0Var.h ? r2k0Var.p(i, r2k0Var.b) : null, obj, obj2);
        return k == null ? new u0y(obj, obj2) : k;
    }

    public final void O0(int i, int i2) {
        int Q0 = Q0(i);
        if (Q0 != i2) {
            int i3 = i2 - Q0;
            ArrayList<ygt> arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int Q02 = Q0(i) + i3;
                N0(i, Q02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        ygt ygtVar = arrayList.get(i4);
                        if (ygtVar != null && ygtVar.a(i, Q02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.G.i;
                } else if (this.G.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.a
    public final void P() {
        H0(null, 125, 1, null);
        this.r = true;
    }

    public final void P0(Object obj) {
        if (this.S) {
            this.I.b0(obj);
            return;
        }
        r2k0 r2k0Var = this.G;
        boolean z = r2k0Var.n;
        sri sriVar = this.M;
        if (!z) {
            rgt a2 = r2k0Var.a(r2k0Var.i);
            at80 at80Var = sriVar.b.b;
            at80Var.b0(ss80.b.c);
            at80.b.b(at80Var, 0, a2, 1, obj);
            return;
        }
        int c = (r2k0Var.l - x2k0.c(r2k0Var.i, r2k0Var.b)) - 1;
        if (sriVar.a.G.i - sriVar.f >= 0) {
            sriVar.d(true);
            at80 at80Var2 = sriVar.b.b;
            at80Var2.b0(ss80.h0.c);
            at80.b.a(at80Var2, 0, obj);
            at80Var2.d[at80Var2.e - at80Var2.b[at80Var2.c - 1].a] = c;
            return;
        }
        r2k0 r2k0Var2 = this.G;
        rgt a3 = r2k0Var2.a(r2k0Var2.i);
        at80 at80Var3 = sriVar.b.b;
        at80Var3.b0(ss80.e0.c);
        at80.b.b(at80Var3, 0, obj, 1, a3);
        at80Var3.d[at80Var3.e - at80Var3.b[at80Var3.c - 1].a] = c;
    }

    @Override // androidx.compose.runtime.a
    public final kotlin.coroutines.d Q() {
        return this.R;
    }

    public final int Q0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        mg50 mg50Var = this.p;
        if (mg50Var == null || mg50Var.a(i) < 0) {
            return 0;
        }
        return mg50Var.b(i);
    }

    @Override // androidx.compose.runtime.a
    public final void R(Object obj) {
        if (obj instanceof huf0) {
            zgt zgtVar = new zgt((huf0) obj, this.m - 1);
            if (this.S) {
                at80 at80Var = this.M.b.b;
                at80Var.b0(ss80.v.c);
                at80.b.a(at80Var, 0, zgtVar);
            }
            this.d.add(obj);
            obj = zgtVar;
        }
        P0(obj);
    }

    @Override // androidx.compose.runtime.a
    public final void S() {
        l0(false);
        f p0 = p0();
        if (p0 != null) {
            int i = p0.b;
            if ((i & 1) != 0) {
                p0.b = i | 2;
            }
        }
    }

    @Override // androidx.compose.runtime.a
    public final void T(int i) {
        H0(null, i, 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final evi U() {
        vgt vgtVar = this.U;
        if (vgtVar != null) {
            return vgtVar;
        }
        vgt vgtVar2 = new vgt(this.h);
        this.U = vgtVar2;
        return vgtVar2;
    }

    @Override // androidx.compose.runtime.a
    public final void V() {
        H0(null, NetError.ERR_PROXY_AUTH_REQUESTED, 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final void W(int i, Object obj) {
        H0(obj, i, 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final void X() {
        l0(false);
        l0(false);
        this.w = this.x.b() != 0;
        this.K = null;
    }

    @Override // androidx.compose.runtime.a
    public final void Y(vef0 vef0Var) {
        f fVar = vef0Var instanceof f ? (f) vef0Var : null;
        if (fVar != null) {
            fVar.k();
        }
    }

    @Override // xsna.egx
    public final void a() {
        if (this.F || this.z != 0) {
            gxc0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    @Override // androidx.compose.runtime.a
    public final void a0() {
        l0(false);
    }

    @Override // androidx.compose.runtime.a
    public final <V, T> void b(V v, wzs<? super T, ? super V, s3q0> wzsVar) {
        if (this.S) {
            at80 at80Var = this.O.b;
            at80Var.b0(ss80.g0.c);
            at80.b.a(at80Var, 0, v);
            ttp0.d(2, wzsVar);
            at80.b.a(at80Var, 1, wzsVar);
            return;
        }
        sri sriVar = this.M;
        sriVar.b();
        at80 at80Var2 = sriVar.b.b;
        at80Var2.b0(ss80.g0.c);
        ttp0.d(2, wzsVar);
        at80.b.b(at80Var2, 0, v, 1, wzsVar);
    }

    @Override // androidx.compose.runtime.a
    public final void b0() {
        l0(false);
    }

    @Override // androidx.compose.runtime.a
    public final int c() {
        return this.S ? -this.I.v : this.G.i;
    }

    @Override // androidx.compose.runtime.a
    public final void c0(gzs<s3q0> gzsVar) {
        at80 at80Var = this.M.b.b;
        at80Var.b0(ss80.a0.c);
        at80.b.a(at80Var, 0, gzsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (xsna.epx.f(r0, r1) != false) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xsna.sy90] */
    @Override // androidx.compose.runtime.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(c9e0<?>[] c9e0VarArr) {
        ry90 build;
        sy90 g0 = g0();
        I0(201, androidx.compose.runtime.b.c);
        boolean z = this.S;
        qp80 qp80Var = androidx.compose.runtime.b.e;
        boolean z2 = true;
        if (z) {
            sy90 b2 = tvi.b(c9e0VarArr, g0, ry90.e);
            ry90.a builder = g0.builder();
            builder.putAll(b2);
            build = builder.build();
            I0(204, qp80Var);
            t0();
            P0(build);
            t0();
            P0(b2);
            l0(false);
            this.J = true;
        } else {
            r2k0 r2k0Var = this.G;
            ?? r1 = (sy90) r2k0Var.h(r2k0Var.g, 0);
            r2k0 r2k0Var2 = this.G;
            sy90 sy90Var = (sy90) r2k0Var2.h(r2k0Var2.g, 1);
            sy90 b3 = tvi.b(c9e0VarArr, g0, sy90Var);
            if (!e() || this.y || !epx.f(sy90Var, b3)) {
                ry90.a builder2 = g0.builder();
                builder2.putAll(b3);
                build = builder2.build();
                I0(204, qp80Var);
                t0();
                P0(build);
                t0();
                P0(b3);
                l0(false);
                if (!this.y) {
                }
                if (z2 && !this.S) {
                    z0(build);
                }
                this.x.c(this.w ? 1 : 0);
                this.w = z2;
                this.K = build;
                H0(androidx.compose.runtime.b.d, 202, 0, build);
            }
            this.l = this.G.s() + this.l;
            build = r1;
        }
        z2 = false;
        if (z2) {
            z0(build);
        }
        this.x.c(this.w ? 1 : 0);
        this.w = z2;
        this.K = build;
        H0(androidx.compose.runtime.b.d, 202, 0, build);
    }

    @Override // xsna.egx
    public final void d0() {
        this.z = 0;
        this.y = true;
    }

    @Override // androidx.compose.runtime.a
    public final boolean e() {
        f p0;
        return (this.S || this.y || this.w || (p0 = p0()) == null || (p0.b & 8) != 0) ? false : true;
    }

    public final void e0() {
        f0();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        lnr lnrVar = this.O;
        lnrVar.c.clear();
        lnrVar.b.clear();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        r2k0 r2k0Var = this.G;
        if (!r2k0Var.f) {
            r2k0Var.c();
        }
        if (this.I.w) {
            return;
        }
        o0();
    }

    @Override // androidx.compose.runtime.a
    public final void f() {
        if (!this.r) {
            androidx.compose.runtime.b.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            androidx.compose.runtime.b.a("useNode() called while inserting");
        }
        r2k0 r2k0Var = this.G;
        Object n = r2k0Var.n(r2k0Var.i);
        sri sriVar = this.M;
        sriVar.c();
        sriVar.h.add(n);
        if (this.y && (n instanceof ypi)) {
            sriVar.b();
            csa csaVar = sriVar.b;
            if (n != null) {
                csaVar.b.b0(ss80.j0.c);
            } else {
                csaVar.getClass();
            }
        }
    }

    public final void f0() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        sri sriVar = this.M;
        sriVar.c = false;
        sriVar.d.b = 0;
        sriVar.f = 0;
        sriVar.e = true;
        sriVar.g = 0;
        sriVar.h.clear();
        sriVar.i = -1;
        sriVar.j = -1;
        sriVar.k = -1;
        sriVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    @Override // androidx.compose.runtime.a
    public final void g(Object obj) {
        if (!this.S && this.G.g() == 207 && !epx.f(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        H0(null, 207, 0, obj);
    }

    public final sy90 g0() {
        sy90 sy90Var = this.K;
        return sy90Var != null ? sy90Var : h0(this.G.i);
    }

    @Override // androidx.compose.runtime.a
    public final void h() {
        if (this.l != 0) {
            androidx.compose.runtime.b.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        f p0 = p0();
        if (p0 != null) {
            int i = p0.b;
            if ((i & 128) == 0) {
                p0.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            G0();
        } else {
            x0();
        }
    }

    public final sy90 h0(int i) {
        sy90 sy90Var;
        boolean z = this.S;
        qp80 qp80Var = androidx.compose.runtime.b.d;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.w(i2) == 202 && epx.f(this.I.x(i2), qp80Var)) {
                    sy90 sy90Var2 = (sy90) this.I.u(i2);
                    this.K = sy90Var2;
                    return sy90Var2;
                }
                y2k0 y2k0Var = this.I;
                i2 = y2k0Var.M(i2, y2k0Var.b);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    r2k0 r2k0Var = this.G;
                    if (epx.f(r2k0Var.p(i, r2k0Var.b), qp80Var)) {
                        pg50<sy90> pg50Var = this.v;
                        if (pg50Var == null || (sy90Var = pg50Var.b(i)) == null) {
                            r2k0 r2k0Var2 = this.G;
                            sy90Var = (sy90) r2k0Var2.b(i, r2k0Var2.b);
                        }
                        this.K = sy90Var;
                        return sy90Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        sy90 sy90Var3 = this.u;
        this.K = sy90Var3;
        return sy90Var3;
    }

    @Override // androidx.compose.runtime.a
    public final boolean i() {
        if (!e() || this.w) {
            return true;
        }
        f p0 = p0();
        return (p0 == null || (p0.b & 4) == 0) ? false : true;
    }

    public final qqi i0() {
        Collection collection;
        if (!this.b.l()) {
            return null;
        }
        ListBuilder e = e43.e();
        y2k0 y2k0Var = this.I;
        e.addAll(tqi.a(y2k0Var, null, y2k0Var.t, null));
        r2k0 r2k0Var = this.G;
        boolean z = r2k0Var.f;
        int[] iArr = r2k0Var.b;
        if (z || r2k0Var.c == 0) {
            collection = EmptyList.b;
        } else {
            y7f0 y7f0Var = new y7f0(r2k0Var);
            int i = r2k0Var.i;
            Object valueOf = Integer.valueOf(r2k0Var.l - x2k0.c(i, iArr));
            while (i >= 0) {
                y7f0Var.d(r2k0Var.i(i), r2k0Var.k(i) ? r2k0Var.p(i, iArr) : a.C0011a.a, r2k0Var.a.h0(i), valueOf);
                valueOf = r2k0Var.a(i);
                i = r2k0Var.q(i);
            }
            collection = y7f0Var.a;
        }
        e.addAll(collection);
        e.addAll(u0());
        return new qqi(e.g(), this.C);
    }

    @Override // androidx.compose.runtime.a
    public final void j() {
        l0(false);
    }

    public final void j0(ph50<Object, Object> ph50Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        ArrayList arrayList = this.s;
        if (this.F) {
            androidx.compose.runtime.b.a("Reentrant composition is not supported");
        }
        this.g.b();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(qak0.j().g());
            this.v = null;
            M0(ph50Var);
            this.k = 0;
            this.F = true;
            try {
                K0();
                Object t0 = t0();
                if (t0 != wzsVar && wzsVar != null) {
                    P0(wzsVar);
                }
                tgt tgtVar = this.D;
                ci50<i1m> a2 = bbk0.a();
                try {
                    a2.b(tgtVar);
                    qp80 qp80Var = androidx.compose.runtime.b.b;
                    if (wzsVar != null) {
                        I0(200, qp80Var);
                        blk.R(this, wzsVar);
                        l0(false);
                    } else if (!this.w || t0 == null || t0.equals(a.C0011a.a)) {
                        F0();
                    } else {
                        I0(200, qp80Var);
                        ttp0.d(2, t0);
                        blk.R(this, (wzs) t0);
                        l0(false);
                    }
                    a2.k(a2.d - 1);
                    m0();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        androidx.compose.runtime.b.a("Check failed");
                    }
                    o0();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    a2.k(a2.d - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.runtime.a
    public final cvi k() {
        I0(206, androidx.compose.runtime.b.f);
        if (this.S) {
            y2k0.E(this.I);
        }
        Object t0 = t0();
        iuf0 iuf0Var = t0 instanceof iuf0 ? (iuf0) t0 : null;
        if (iuf0Var == null) {
            iuf0Var = new rfg0(new a(new b(this.T, this.q, this.C, this.h.u)), -1);
            P0(iuf0Var);
        }
        a aVar = (a) iuf0Var.b();
        ((zak0) aVar.b.f).setValue(g0());
        l0(false);
        return aVar.b;
    }

    public final void k0(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        k0(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object n = this.G.n(i);
            sri sriVar = this.M;
            sriVar.c();
            sriVar.h.add(n);
        }
    }

    @Override // androidx.compose.runtime.a
    public final boolean l(boolean z) {
        Object t0 = t0();
        if ((t0 instanceof Boolean) && z == ((Boolean) t0).booleanValue()) {
            return false;
        }
        P0(Boolean.valueOf(z));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d2  */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(boolean z) {
        long rotateRight;
        s9x s9xVar;
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        int i3;
        r2k0 r2k0Var;
        ygt ygtVar;
        ?? r6;
        int i4;
        s9x s9xVar2;
        int i5;
        int i6;
        ArrayList arrayList2;
        qh50 qh50Var;
        int i7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i8;
        int i9;
        ygt ygtVar2;
        int i10;
        Object[] objArr;
        long[] jArr;
        int i11;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        Object[] objArr3;
        long[] jArr3;
        int i13;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        s9x s9xVar3 = this.n;
        int i14 = s9xVar3.a[s9xVar3.b - 2] - 1;
        boolean z3 = this.S;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (z3) {
            y2k0 y2k0Var = this.I;
            int i15 = y2k0Var.v;
            int w = y2k0Var.w(i15);
            Object x = this.I.x(i15);
            Object u = this.I.u(i15);
            if (x != null) {
                rotateRight2 = Long.rotateRight(this.T ^ 0, 3) ^ (x instanceof Enum ? ((Enum) x).ordinal() : x.hashCode());
            } else if (u == null || w != 207 || u.equals(c0012a)) {
                rotateRight2 = Long.rotateRight(this.T ^ i14, 3) ^ w;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i14, 3) ^ u.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            r2k0 r2k0Var2 = this.G;
            int i16 = r2k0Var2.i;
            int i17 = r2k0Var2.i(i16);
            r2k0 r2k0Var3 = this.G;
            Object p = r2k0Var3.p(i16, r2k0Var3.b);
            r2k0 r2k0Var4 = this.G;
            Object b2 = r2k0Var4.b(i16, r2k0Var4.b);
            if (p != null) {
                rotateRight = Long.rotateRight(this.T ^ 0, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode());
            } else if (b2 == null || i17 != 207 || b2.equals(c0012a)) {
                rotateRight = Long.rotateRight(this.T ^ i14, 3) ^ i17;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i14, 3) ^ b2.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i18 = this.l;
        ygt ygtVar3 = this.j;
        ArrayList arrayList5 = this.s;
        sri sriVar = this.M;
        if (ygtVar3 != null) {
            pg50<dlu> pg50Var = ygtVar3.e;
            int i19 = ygtVar3.b;
            ArrayList arrayList6 = ygtVar3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = ygtVar3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i20 = 0; i20 < size; i20++) {
                    hashSet2.add(arrayList7.get(i20));
                }
                i2 = -1;
                qh50 a2 = k5h0.a();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                i = 1;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size3) {
                    ldy ldyVar = (ldy) arrayList6.get(i21);
                    if (hashSet2.contains(ldyVar)) {
                        s9xVar2 = s9xVar3;
                        i5 = i21;
                        if (!a2.a(ldyVar)) {
                            int i24 = i22;
                            if (i24 < size2) {
                                ldy ldyVar2 = (ldy) arrayList7.get(i24);
                                if (ldyVar2 != ldyVar) {
                                    dlu b3 = pg50Var.b(ldyVar2.c);
                                    int i25 = b3 != null ? b3.b : -1;
                                    a2.e(ldyVar2);
                                    i6 = i24;
                                    i9 = i23;
                                    ygtVar2 = ygtVar3;
                                    if (i25 != i9) {
                                        dlu b4 = pg50Var.b(ldyVar2.c);
                                        int i26 = b4 != null ? b4.c : ldyVar2.d;
                                        qh50Var = a2;
                                        int i27 = i25 + i19;
                                        i7 = i19;
                                        int i28 = i9 + i7;
                                        if (i26 > 0) {
                                            arrayList3 = arrayList6;
                                            int i29 = sriVar.l;
                                            if (i29 > 0) {
                                                arrayList4 = arrayList7;
                                                if (sriVar.j == i27 - i29 && sriVar.k == i28 - i29) {
                                                    sriVar.l = i29 + i26;
                                                }
                                            } else {
                                                arrayList4 = arrayList7;
                                            }
                                            sriVar.c();
                                            sriVar.j = i27;
                                            sriVar.k = i28;
                                            sriVar.l = i26;
                                        } else {
                                            arrayList3 = arrayList6;
                                            arrayList4 = arrayList7;
                                            sriVar.getClass();
                                        }
                                        if (i25 > i9) {
                                            Object[] objArr5 = pg50Var.c;
                                            long[] jArr5 = pg50Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                hashSet = hashSet2;
                                                i8 = size2;
                                                int i30 = 0;
                                                while (true) {
                                                    long j = jArr5[i30];
                                                    int i31 = i26;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i32 = 8 - ((~(i30 - length)) >>> 31);
                                                        int i33 = 0;
                                                        while (i33 < i32) {
                                                            if ((j & 255) < 128) {
                                                                i13 = i33;
                                                                dlu dluVar = (dlu) objArr5[(i30 << 3) + i33];
                                                                objArr4 = objArr5;
                                                                int i34 = dluVar.b;
                                                                jArr4 = jArr5;
                                                                if (i25 <= i34 && i34 < i25 + i31) {
                                                                    dluVar.b = (i34 - i25) + i9;
                                                                } else if (i9 <= i34 && i34 < i25) {
                                                                    dluVar.b = i34 + i31;
                                                                }
                                                            } else {
                                                                i13 = i33;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i33 = i13 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i32 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i30 == length) {
                                                        break;
                                                    }
                                                    i30++;
                                                    arrayList5 = arrayList2;
                                                    i26 = i31;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i35 = i26;
                                            arrayList2 = arrayList5;
                                            hashSet = hashSet2;
                                            i8 = size2;
                                            if (i9 > i25) {
                                                Object[] objArr6 = pg50Var.c;
                                                long[] jArr6 = pg50Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i36 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i36];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i37 = 8 - ((~(i36 - length2)) >>> 31);
                                                            int i38 = 0;
                                                            while (i38 < i37) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    dlu dluVar2 = (dlu) objArr6[(i36 << 3) + i38];
                                                                    jArr2 = jArr6;
                                                                    int i39 = dluVar2.b;
                                                                    i12 = i25;
                                                                    if (i25 <= i39 && i39 < i12 + i35) {
                                                                        dluVar2.b = (i39 - i12) + i9;
                                                                    } else if (i12 + 1 <= i39 && i39 < i9) {
                                                                        dluVar2.b = i39 - i35;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i12 = i25;
                                                                }
                                                                j2 >>= 8;
                                                                i38++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i25 = i12;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i25;
                                                            if (i37 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i25;
                                                        }
                                                        if (i36 == length2) {
                                                            break;
                                                        }
                                                        i36++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i25 = i11;
                                                    }
                                                }
                                            }
                                        }
                                        i10 = i5;
                                    } else {
                                        arrayList2 = arrayList5;
                                        qh50Var = a2;
                                        i7 = i19;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList7;
                                    }
                                    hashSet = hashSet2;
                                    i8 = size2;
                                    i10 = i5;
                                } else {
                                    i6 = i24;
                                    arrayList2 = arrayList5;
                                    qh50Var = a2;
                                    i7 = i19;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i8 = size2;
                                    i9 = i23;
                                    ygtVar2 = ygtVar3;
                                    i10 = i5 + 1;
                                }
                                i22 = i6 + 1;
                                dlu b5 = pg50Var.b(ldyVar2.c);
                                int i40 = i9 + (b5 != null ? b5.c : ldyVar2.d);
                                i21 = i10;
                                ygtVar3 = ygtVar2;
                                a2 = qh50Var;
                                i19 = i7;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                size2 = i8;
                                arrayList5 = arrayList2;
                                i23 = i40;
                                s9xVar3 = s9xVar2;
                            } else {
                                i22 = i24;
                                s9xVar3 = s9xVar2;
                                i21 = i5;
                            }
                        }
                    } else {
                        s9xVar2 = s9xVar3;
                        dlu b6 = pg50Var.b(ldyVar.c);
                        int i41 = b6 != null ? b6.b : -1;
                        int i42 = ldyVar.c;
                        i5 = i21;
                        sriVar.f(i41 + i19, ldyVar.d);
                        ygtVar3.a(i42, 0);
                        sriVar.f = (i42 - sriVar.a.G.g) + sriVar.f;
                        this.G.r(i42);
                        y0();
                        this.G.s();
                        xo9.d(arrayList5, i42, x2k0.a(i42, this.G.b) + i42);
                    }
                    i21 = i5 + 1;
                    s9xVar3 = s9xVar2;
                }
                s9xVar = s9xVar3;
                arrayList = arrayList5;
                sriVar.c();
                if (arrayList6.size() > 0) {
                    r2k0 r2k0Var5 = this.G;
                    sriVar.f = (r2k0Var5.h - sriVar.a.G.g) + sriVar.f;
                    r2k0Var5.t();
                }
                z2 = this.S;
                if (!z2) {
                    r2k0 r2k0Var6 = this.G;
                    int i43 = r2k0Var6.m - r2k0Var6.l;
                    if (i43 > 0) {
                        if (i43 > 0) {
                            sriVar.d(false);
                            sriVar.e();
                            at80 at80Var = sriVar.b.b;
                            at80Var.b0(ss80.d0.c);
                            at80Var.d[at80Var.e - at80Var.b[at80Var.c - 1].a] = i43;
                        } else {
                            sriVar.getClass();
                        }
                    }
                }
                i3 = this.k;
                while (true) {
                    r2k0Var = this.G;
                    if (r2k0Var.k > 0 && (i4 = r2k0Var.g) != r2k0Var.h) {
                        y0();
                        sriVar.f(i3, this.G.s());
                        xo9.d(arrayList, i4, this.G.g);
                    }
                }
                if (z2) {
                    if (z) {
                        sriVar.a();
                    }
                    int i44 = sriVar.a.G.i;
                    s9x s9xVar4 = sriVar.d;
                    int i45 = i2;
                    if (s9xVar4.a(i45) > i44) {
                        androidx.compose.runtime.b.a("Missed recording an endGroup");
                    }
                    if (s9xVar4.a(i45) == i44) {
                        sriVar.d(false);
                        s9xVar4.b();
                        sriVar.b.b.b0(ss80.j.c);
                    }
                    int i46 = this.G.i;
                    if (i18 != Q0(i46)) {
                        O0(i46, i18);
                    }
                    if (z) {
                        i18 = 1;
                    }
                    this.G.e();
                    sriVar.c();
                } else {
                    if (z) {
                        lnr lnrVar = this.O;
                        at80 at80Var2 = lnrVar.c;
                        if (at80Var2.c == 0) {
                            androidx.compose.runtime.b.a("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        at80 at80Var3 = lnrVar.b;
                        ss80[] ss80VarArr = at80Var2.b;
                        int i47 = at80Var2.c - 1;
                        at80Var2.c = i47;
                        ss80 ss80Var = ss80VarArr[i47];
                        ss80VarArr[i47] = null;
                        at80Var3.b0(ss80Var);
                        Object[] objArr7 = at80Var2.f;
                        Object[] objArr8 = at80Var3.f;
                        int i48 = at80Var3.g;
                        int i49 = ss80Var.b;
                        int i50 = at80Var2.g;
                        int i51 = i50 - i49;
                        System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                        Object[] objArr9 = at80Var2.f;
                        int i52 = at80Var2.g;
                        Arrays.fill(objArr9, i52 - i49, i52, (Object) null);
                        int[] iArr = at80Var2.d;
                        int[] iArr2 = at80Var3.d;
                        int i53 = at80Var3.e;
                        int i54 = ss80Var.a;
                        int i55 = at80Var2.e;
                        jw5.e(i53 - i54, i55 - i54, i55, iArr, iArr2);
                        at80Var2.g -= i49;
                        at80Var2.e -= i54;
                        i18 = i;
                    }
                    if (this.G.k <= 0) {
                        gxc0.a("Unbalanced begin/end empty");
                    }
                    r3.k--;
                    y2k0 y2k0Var2 = this.I;
                    int i56 = y2k0Var2.v;
                    y2k0Var2.j();
                    if (this.G.k <= 0) {
                        int i57 = (-2) - i56;
                        this.I.k();
                        this.I.e(i);
                        rgt rgtVar = this.N;
                        if (this.O.b.isEmpty()) {
                            v2k0 v2k0Var = this.H;
                            sriVar.b();
                            r6 = 0;
                            sriVar.d(false);
                            sriVar.e();
                            sriVar.c();
                            at80 at80Var4 = sriVar.b.b;
                            at80Var4.b0(ss80.p.c);
                            at80.b.b(at80Var4, 0, rgtVar, 1, v2k0Var);
                        } else {
                            v2k0 v2k0Var2 = this.H;
                            lnr lnrVar2 = this.O;
                            sriVar.b();
                            sriVar.d(false);
                            sriVar.e();
                            sriVar.c();
                            at80 at80Var5 = sriVar.b.b;
                            at80Var5.b0(ss80.q.c);
                            at80.b.c(at80Var5, rgtVar, v2k0Var2, lnrVar2);
                            this.O = new lnr();
                            r6 = 0;
                        }
                        this.S = r6;
                        if (this.c.c != 0) {
                            N0(i57, r6);
                            O0(i57, i18);
                        }
                    }
                }
                ygtVar = (ygt) znk0.J(this.i);
                if (ygtVar != null && !z2) {
                    ygtVar.c++;
                }
                this.j = ygtVar;
                this.k = s9xVar.b() + i18;
                this.m = s9xVar.b();
                this.l = s9xVar.b() + i18;
            }
        }
        s9xVar = s9xVar3;
        i = 1;
        arrayList = arrayList5;
        i2 = -1;
        z2 = this.S;
        if (!z2) {
        }
        i3 = this.k;
        while (true) {
            r2k0Var = this.G;
            if (r2k0Var.k > 0) {
                break;
            }
            y0();
            sriVar.f(i3, this.G.s());
            xo9.d(arrayList, i4, this.G.g);
        }
        if (z2) {
        }
        ygtVar = (ygt) znk0.J(this.i);
        if (ygtVar != null) {
            ygtVar.c++;
        }
        this.j = ygtVar;
        this.k = s9xVar.b() + i18;
        this.m = s9xVar.b();
        this.l = s9xVar.b() + i18;
    }

    @Override // androidx.compose.runtime.a
    public final boolean m(short s) {
        Object t0 = t0();
        if ((t0 instanceof Short) && s == ((Number) t0).shortValue()) {
            return false;
        }
        P0(Short.valueOf(s));
        return true;
    }

    public final void m0() {
        l0(false);
        this.b.d();
        l0(false);
        sri sriVar = this.M;
        if (sriVar.c) {
            sriVar.d(false);
            sriVar.d(false);
            sriVar.b.b.b0(ss80.j.c);
            sriVar.c = false;
        }
        sriVar.b();
        if (sriVar.d.b != 0) {
            androidx.compose.runtime.b.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            androidx.compose.runtime.b.a("Start/end imbalance");
        }
        f0();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    @Override // androidx.compose.runtime.a
    public final boolean n(float f) {
        Object t0 = t0();
        if ((t0 instanceof Float) && f == ((Number) t0).floatValue()) {
            return false;
        }
        P0(Float.valueOf(f));
        return true;
    }

    public final void n0(boolean z, ygt ygtVar) {
        this.i.add(this.j);
        this.j = ygtVar;
        int i = this.l;
        s9x s9xVar = this.n;
        s9xVar.c(i);
        s9xVar.c(this.m);
        s9xVar.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    @Override // androidx.compose.runtime.a
    public final boolean o(int i) {
        Object t0 = t0();
        if ((t0 instanceof Integer) && i == ((Number) t0).intValue()) {
            return false;
        }
        P0(Integer.valueOf(i));
        return true;
    }

    public final void o0() {
        v2k0 v2k0Var = new v2k0();
        if (this.C) {
            v2k0Var.c0();
        }
        if (this.b.e()) {
            v2k0Var.b0();
        }
        this.H = v2k0Var;
        y2k0 f0 = v2k0Var.f0();
        f0.e(true);
        this.I = f0;
    }

    @Override // androidx.compose.runtime.a
    public final boolean p(long j) {
        Object t0 = t0();
        if ((t0 instanceof Long) && j == ((Number) t0).longValue()) {
            return false;
        }
        P0(Long.valueOf(j));
        return true;
    }

    public final f p0() {
        if (this.A != 0) {
            return null;
        }
        ArrayList<f> arrayList = this.E;
        if (znk0.E(arrayList)) {
            return (f) xy9.b(1, arrayList);
        }
        return null;
    }

    @Override // androidx.compose.runtime.a
    public final boolean q(double d) {
        Object t0 = t0();
        if ((t0 instanceof Double) && d == ((Number) t0).doubleValue()) {
            return false;
        }
        P0(Double.valueOf(d));
        return true;
    }

    public final gvi q0() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    @Override // androidx.compose.runtime.a
    public final <T> T r(lvi<T> lviVar) {
        return (T) tvi.a(g0(), lviVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0220 A[Catch: all -> 0x024b, TRY_LEAVE, TryCatch #7 {all -> 0x024b, blocks: (B:100:0x0215, B:102:0x0220, B:114:0x0276, B:115:0x0278), top: B:99:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:7:0x0012, B:9:0x0023, B:11:0x0062, B:13:0x006a, B:15:0x0070, B:16:0x0075, B:17:0x0078, B:29:0x00b7, B:30:0x0235, B:35:0x00d3, B:36:0x00d6, B:44:0x00d7, B:46:0x00e0, B:48:0x00e4, B:50:0x00ec, B:52:0x00f6, B:54:0x00fc, B:55:0x0102, B:58:0x010c, B:60:0x0119, B:63:0x013b, B:66:0x0151, B:68:0x015a, B:70:0x0165, B:71:0x0176, B:73:0x017c, B:74:0x018f, B:105:0x0232, B:107:0x0288, B:108:0x028b, B:147:0x028d, B:148:0x0290, B:149:0x0139, B:150:0x0127, B:151:0x0107, B:156:0x0291, B:65:0x0148), top: B:6:0x0012, inners: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(ArrayList arrayList) {
        hc30 hc30Var;
        cvi cviVar;
        int i;
        yy1 yy1Var;
        ArrayList arrayList2;
        r2k0 e0;
        rgt rgtVar;
        r2k0 e02;
        r2k0 r2k0Var;
        r2k0 r2k0Var2;
        int[] iArr;
        pg50<sy90> pg50Var;
        pg50<sy90> pg50Var2;
        int[] iArr2;
        csa csaVar;
        csa csaVar2;
        csa csaVar3;
        v2k0 v2k0Var;
        boolean z;
        int i2;
        be beVar;
        r2k0 r2k0Var3;
        c cVar = this;
        v2k0 v2k0Var2 = cVar.c;
        cvi cviVar2 = cVar.b;
        csa csaVar4 = cVar.f;
        if (csaVar4 == null) {
            csaVar4 = null;
        }
        if (csaVar4 == null) {
            throw at.b("Inconsistent composition");
        }
        sri sriVar = cVar.M;
        csa csaVar5 = sriVar.b;
        try {
            sriVar.b = csaVar4;
            csaVar4.b.b0(ss80.z.c);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Pair pair = (Pair) arrayList.get(i4);
                ic30 ic30Var = (ic30) pair.d();
                ic30 ic30Var2 = (ic30) pair.g();
                rgt d = sdi.d(ic30Var.e);
                v2k0 e = x2k0.e(ic30Var.d);
                int a0 = e.a0(d);
                m9x m9xVar = new m9x(i3);
                sriVar.b();
                at80 at80Var = sriVar.b.b;
                at80Var.b0(ss80.g.c);
                at80.b.b(at80Var, 0, m9xVar, 1, d);
                if (ic30Var2 == null) {
                    if (e.equals(cVar.H)) {
                        if (!cVar.I.w) {
                            androidx.compose.runtime.b.a("Check failed");
                        }
                        cVar.o0();
                    }
                    r2k0 e03 = e.e0();
                    try {
                        e03.r(a0);
                        sriVar.f = a0;
                        csa csaVar6 = new csa();
                        qx qxVar = new qx(cVar, csaVar6, e03, ic30Var, 2);
                        try {
                            r2k0Var3 = e03;
                            cVar = this;
                            try {
                                cVar.w0(null, null, null, EmptyList.b, qxVar);
                                csa csaVar7 = sriVar.b;
                                csaVar7.getClass();
                                if (!csaVar6.s0()) {
                                    at80 at80Var2 = csaVar7.b;
                                    at80Var2.b0(ss80.c.c);
                                    at80.b.b(at80Var2, 0, csaVar6, 1, m9xVar);
                                }
                                s3q0 s3q0Var = s3q0.a;
                                r2k0Var3.c();
                                v2k0Var = v2k0Var2;
                                cviVar = cviVar2;
                                i = size;
                                i2 = i4;
                            } catch (Throwable th) {
                                th = th;
                                r2k0Var3.c();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2k0Var3 = e03;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2k0Var3 = e03;
                    }
                } else {
                    hc30 p = cviVar2.p(ic30Var2);
                    v2k0 e2 = (p == null || (beVar = p.a) == null) ? null : x2k0.e(beVar);
                    v2k0 e3 = e2 == null ? x2k0.e(ic30Var2.d) : e2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (e2 != null) {
                                                                        hc30Var = p;
                                                                        if (e2.h) {
                                                                            androidx.compose.runtime.b.a("use active SlotWriter to create an anchor location instead");
                                                                        }
                                                                        if (e2.c <= 0) {
                                                                            gxc0.a("Parameter index is out of range");
                                                                        }
                                                                        ArrayList<rgt> arrayList3 = e2.j;
                                                                        cviVar = cviVar2;
                                                                        int f = x2k0.f(arrayList3, 0, e2.c);
                                                                        if (f < 0) {
                                                                            i = size;
                                                                            yy1Var = new rgt(0);
                                                                            arrayList3.add(-(f + 1), yy1Var);
                                                                        } else {
                                                                            i = size;
                                                                            yy1Var = (rgt) arrayList3.get(f);
                                                                        }
                                                                        if (yy1Var != null) {
                                                                            rgt d2 = sdi.d(yy1Var);
                                                                            arrayList2 = new ArrayList();
                                                                            e0 = e3.e0();
                                                                            xo9.e(e0, arrayList2, e3.a0(d2));
                                                                            s3q0 s3q0Var2 = s3q0.a;
                                                                            e0.c();
                                                                            if (arrayList2.isEmpty()) {
                                                                                csa csaVar8 = sriVar.b;
                                                                                csaVar8.getClass();
                                                                                if (arrayList2.isEmpty()) {
                                                                                    rgtVar = d2;
                                                                                } else {
                                                                                    at80 at80Var3 = csaVar8.b;
                                                                                    at80Var3.b0(ss80.d.c);
                                                                                    rgtVar = d2;
                                                                                    at80.b.b(at80Var3, 1, arrayList2, 0, m9xVar);
                                                                                }
                                                                                if (e.equals(v2k0Var2)) {
                                                                                    int a02 = v2k0Var2.a0(d);
                                                                                    cVar.N0(a02, cVar.Q0(a02) + arrayList2.size());
                                                                                }
                                                                            } else {
                                                                                rgtVar = d2;
                                                                            }
                                                                            at80 at80Var4 = sriVar.b.b;
                                                                            at80Var4.b0(ss80.e.c);
                                                                            int i5 = at80Var4.g - at80Var4.b[at80Var4.c - 1].b;
                                                                            Object[] objArr = at80Var4.f;
                                                                            objArr[i5] = hc30Var;
                                                                            objArr[i5 + 1] = cviVar;
                                                                            objArr[i5 + 3] = ic30Var;
                                                                            objArr[i5 + 2] = ic30Var2;
                                                                            e02 = e3.e0();
                                                                            r2k0Var2 = cVar.G;
                                                                            iArr = cVar.o;
                                                                            pg50Var = cVar.v;
                                                                            cVar.o = null;
                                                                            cVar.v = null;
                                                                            cVar.G = e02;
                                                                            int a03 = e3.a0(sdi.d(rgtVar));
                                                                            e02.r(a03);
                                                                            sriVar.f = a03;
                                                                            csaVar = new csa();
                                                                            csaVar2 = sriVar.b;
                                                                            sriVar.b = csaVar;
                                                                            v2k0Var = v2k0Var2;
                                                                            z = sriVar.e;
                                                                            sriVar.e = false;
                                                                            hqj hqjVar = ic30Var2.c;
                                                                            hqj hqjVar2 = ic30Var.c;
                                                                            Integer valueOf = Integer.valueOf(e02.g);
                                                                            List<? extends Pair<f, ? extends Object>> list = ic30Var2.f;
                                                                            r2k0Var = e02;
                                                                            i2 = i4;
                                                                            pg50Var2 = pg50Var;
                                                                            csaVar3 = csaVar2;
                                                                            iArr2 = iArr;
                                                                            cVar.w0(hqjVar, hqjVar2, valueOf, list, new oe5(9, cVar, ic30Var));
                                                                            sriVar.e = z;
                                                                            sriVar.b = csaVar3;
                                                                            csaVar3.getClass();
                                                                            if (!csaVar.s0()) {
                                                                                at80 at80Var5 = csaVar3.b;
                                                                                at80Var5.b0(ss80.c.c);
                                                                                at80.b.b(at80Var5, 0, csaVar, 1, m9xVar);
                                                                            }
                                                                            cVar.G = r2k0Var2;
                                                                            cVar.o = iArr2;
                                                                            cVar.v = pg50Var2;
                                                                            r2k0Var.c();
                                                                        }
                                                                    } else {
                                                                        hc30Var = p;
                                                                        cviVar = cviVar2;
                                                                        i = size;
                                                                    }
                                                                    cVar.G = r2k0Var2;
                                                                    cVar.o = iArr2;
                                                                    cVar.v = pg50Var2;
                                                                    r2k0Var.c();
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    r2k0Var.c();
                                                                    throw th;
                                                                }
                                                                sriVar.b = csaVar3;
                                                                csaVar3.getClass();
                                                                if (!csaVar.s0()) {
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                cVar.G = r2k0Var2;
                                                                cVar.o = iArr2;
                                                                cVar.v = pg50Var2;
                                                                throw th;
                                                            }
                                                            sriVar.e = z;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            sriVar.b = csaVar3;
                                                            throw th;
                                                        }
                                                        cVar.w0(hqjVar, hqjVar2, valueOf, list, new oe5(9, cVar, ic30Var));
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        sriVar.e = z;
                                                        throw th;
                                                    }
                                                    r2k0Var = e02;
                                                    i2 = i4;
                                                    pg50Var2 = pg50Var;
                                                    csaVar3 = csaVar2;
                                                    iArr2 = iArr;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    r2k0Var = e02;
                                                    pg50Var2 = pg50Var;
                                                    csaVar3 = csaVar2;
                                                    iArr2 = iArr;
                                                    sriVar.e = z;
                                                    throw th;
                                                }
                                                hqj hqjVar22 = ic30Var.c;
                                                Integer valueOf2 = Integer.valueOf(e02.g);
                                                List<? extends Pair<f, ? extends Object>> list2 = ic30Var2.f;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                csaVar3 = csaVar2;
                                                r2k0Var = e02;
                                                pg50Var2 = pg50Var;
                                            }
                                            hqj hqjVar3 = ic30Var2.c;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            pg50Var2 = pg50Var;
                                            csaVar3 = csaVar2;
                                            r2k0Var = e02;
                                        }
                                        sriVar.e = false;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        pg50Var2 = pg50Var;
                                        csaVar3 = csaVar2;
                                        r2k0Var = e02;
                                        iArr2 = iArr;
                                    }
                                    sriVar.b = csaVar;
                                    v2k0Var = v2k0Var2;
                                    z = sriVar.e;
                                } catch (Throwable th12) {
                                    th = th12;
                                    pg50Var2 = pg50Var;
                                    csaVar3 = csaVar2;
                                    r2k0Var = e02;
                                    iArr2 = iArr;
                                }
                                cVar.G = e02;
                                int a032 = e3.a0(sdi.d(rgtVar));
                                e02.r(a032);
                                sriVar.f = a032;
                                csaVar = new csa();
                                csaVar2 = sriVar.b;
                            } catch (Throwable th13) {
                                th = th13;
                                pg50Var2 = pg50Var;
                                r2k0Var = e02;
                                iArr2 = iArr;
                            }
                            r2k0Var2 = cVar.G;
                            iArr = cVar.o;
                            pg50Var = cVar.v;
                            cVar.o = null;
                            cVar.v = null;
                        } catch (Throwable th14) {
                            th = th14;
                            r2k0Var = e02;
                        }
                        xo9.e(e0, arrayList2, e3.a0(d2));
                        s3q0 s3q0Var22 = s3q0.a;
                        e0.c();
                        if (arrayList2.isEmpty()) {
                        }
                        at80 at80Var42 = sriVar.b.b;
                        at80Var42.b0(ss80.e.c);
                        int i52 = at80Var42.g - at80Var42.b[at80Var42.c - 1].b;
                        Object[] objArr2 = at80Var42.f;
                        objArr2[i52] = hc30Var;
                        objArr2[i52 + 1] = cviVar;
                        objArr2[i52 + 3] = ic30Var;
                        objArr2[i52 + 2] = ic30Var2;
                        e02 = e3.e0();
                    } catch (Throwable th15) {
                        e0.c();
                        throw th15;
                    }
                    yy1Var = ic30Var2.e;
                    rgt d22 = sdi.d(yy1Var);
                    arrayList2 = new ArrayList();
                    e0 = e3.e0();
                }
                sriVar.b.b.b0(ss80.b0.c);
                i4 = i2 + 1;
                v2k0Var2 = v2k0Var;
                cviVar2 = cviVar;
                size = i;
                i3 = 0;
            }
            sriVar.b();
            sriVar.b.b.b0(ss80.k.c);
            sriVar.f = 0;
            sriVar.b = csaVar5;
        } catch (Throwable th16) {
            sriVar.b = csaVar5;
            throw th16;
        }
    }

    @Override // androidx.compose.runtime.a
    public final f s() {
        f fVar;
        rgt a2;
        kq80 kq80Var;
        ArrayList<f> arrayList = this.E;
        f remove = znk0.E(arrayList) ? arrayList.remove(arrayList.size() - 1) : null;
        if (remove != null) {
            remove.f(false);
            this.g.b();
            int i = this.B;
            eh50<Object> eh50Var = remove.f;
            if (eh50Var != null && (remove.b & 16) == 0) {
                Object[] objArr = eh50Var.b;
                int[] iArr = eh50Var.c;
                long[] jArr = eh50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        Object[] objArr2 = objArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr2[i5];
                                    if (iArr[i5] != i) {
                                        kq80Var = new kq80(remove, i, eh50Var);
                                        break loop0;
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
                        }
                        i2++;
                        objArr = objArr2;
                    }
                }
            }
            kq80Var = null;
            sri sriVar = this.M;
            if (kq80Var != null) {
                at80 at80Var = sriVar.b.b;
                at80Var.b0(ss80.i.c);
                at80.b.b(at80Var, 0, kq80Var, 1, this.h);
            }
            if ((remove.b & 512) != 0) {
                remove.i(false);
                at80 at80Var2 = sriVar.b.b;
                at80Var2.b0(ss80.l.c);
                at80.b.a(at80Var2, 0, remove);
                remove.j(false);
                if ((remove.b & 1024) != 0) {
                    remove.h(false);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (remove != null) {
            int i6 = remove.b;
            if ((i6 & 16) == 0 && ((1 & i6) != 0 || this.q)) {
                if (remove.c == null) {
                    if (this.S) {
                        y2k0 y2k0Var = this.I;
                        a2 = y2k0Var.b(y2k0Var.v);
                    } else {
                        r2k0 r2k0Var = this.G;
                        a2 = r2k0Var.a(r2k0Var.i);
                    }
                    remove.c = a2;
                }
                remove.b &= -5;
                fVar = remove;
                l0(false);
                return fVar;
            }
        }
        fVar = null;
        l0(false);
        return fVar;
    }

    public final void s0(fc30<Object> fc30Var, sy90 sy90Var, Object obj, boolean z) {
        W(126665345, fc30Var);
        t0();
        P0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                y2k0.E(this.I);
            }
            boolean z2 = (this.S || epx.f(this.G.f(), sy90Var)) ? false : true;
            if (z2) {
                z0(sy90Var);
            }
            H0(androidx.compose.runtime.b.d, 202, 0, sy90Var);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                blk.R(this, new jai(-59194059, new h08(4, fc30Var, obj), true));
                this.w = z3;
            } else {
                this.J = true;
                y2k0 y2k0Var = this.I;
                this.b.m(new ic30(fc30Var, obj, this.h, this.H, y2k0Var.b(y2k0Var.M(y2k0Var.v, y2k0Var.b)), EmptyList.b, g0(), null));
            }
        } catch (Throwable th) {
            try {
                qv20.p(th, new h20(this, 29));
                throw th;
            } finally {
                l0(false);
                this.K = null;
                this.T = j;
                l0(false);
            }
        }
    }

    @Override // androidx.compose.runtime.a
    public final boolean t(int i, boolean z) {
        f p0;
        if ((i & 1) == 0 && (this.S || this.y)) {
            ghj0 ghj0Var = this.P;
            if (ghj0Var == null || (p0 = p0()) == null || !ghj0Var.b() || (p0.b & 512) != 0) {
                return true;
            }
            p0.k();
            p0.j(this.y);
            p0.e(true);
            at80 at80Var = this.M.b.b;
            at80Var.b0(ss80.w.c);
            at80.b.a(at80Var, 0, p0);
            this.b.t(p0);
            return false;
        }
        if (!z && e()) {
            return false;
        }
        return true;
    }

    public final Object t0() {
        boolean z = this.S;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof rfg0)) {
                return m;
            }
        } else if (this.r) {
            androidx.compose.runtime.b.a("A call to createNode(), emitNode() or useNode() expected");
            return c0012a;
        }
        return c0012a;
    }

    @Override // androidx.compose.runtime.a
    public final void u() {
        this.q = true;
        this.C = true;
        this.c.c0();
        this.H.c0();
        y2k0 y2k0Var = this.I;
        v2k0 v2k0Var = y2k0Var.a;
        y2k0Var.e = v2k0Var.k;
        y2k0Var.f = v2k0Var.l;
    }

    public final List<vqi> u0() {
        cvi cviVar = this.b;
        bvi i = cviVar.i();
        ivi iviVar = i != null ? (ivi) i : null;
        if (iviVar == null) {
            return EmptyList.b;
        }
        v2k0 v2k0Var = iviVar.g;
        r2k0 e0 = x2k0.e(v2k0Var).e0();
        try {
            Integer b2 = tqi.b(e0, cviVar, 0, e0.c);
            if (b2 == null) {
                return EmptyList.b;
            }
            e0 = x2k0.e(v2k0Var).e0();
            try {
                ArrayList c = tqi.c(e0, b2.intValue(), 0);
                e0.c();
                return j5g.u0(iviVar.w.u0(), c);
            } finally {
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.a
    public final f v() {
        return p0();
    }

    public final int v0(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += x2k0.a(q, this.G.b);
        }
        return i2;
    }

    @Override // androidx.compose.runtime.a
    public final void w() {
        if (this.y && this.G.i == this.z) {
            this.z = -1;
            this.y = false;
        }
        l0(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> R w0(hqj hqjVar, hqj hqjVar2, Integer num, List<? extends Pair<f, ? extends Object>> list, gzs<? extends R> gzsVar) {
        R invoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair<f, ? extends Object> pair = list.get(i2);
                f d = pair.d();
                Object g = pair.g();
                if (g != null) {
                    L0(d, g);
                } else {
                    L0(d, null);
                }
            }
            if (hqjVar != null) {
                invoke = (R) hqjVar.t(hqjVar2, num != null ? num.intValue() : -1, gzsVar);
            }
            invoke = gzsVar.invoke();
            this.F = z;
            this.k = i;
            return invoke;
        } catch (Throwable th) {
            this.F = z;
            this.k = i;
            throw th;
        }
    }

    @Override // androidx.compose.runtime.a
    public final Object x() {
        boolean z = this.S;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof rfg0)) {
                return m instanceof iuf0 ? ((iuf0) m).b() : m;
            }
        } else if (this.r) {
            androidx.compose.runtime.b.a("A call to createNode(), emitNode() or useNode() expected");
            return c0012a;
        }
        return c0012a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r10.b < r3) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0() {
        upx upxVar;
        int i;
        int i2;
        f fVar;
        int i3;
        ArrayList arrayList;
        int i4;
        long j;
        ArrayList<f> arrayList2;
        int i5;
        eh50<Object> eh50Var;
        long j2;
        ArrayList arrayList3;
        int h;
        int i6;
        long rotateLeft;
        int hashCode;
        Object b2;
        boolean z = this.F;
        int i7 = 1;
        this.F = true;
        r2k0 r2k0Var = this.G;
        int i8 = r2k0Var.i;
        int a2 = x2k0.a(i8, r2k0Var.b) + i8;
        int i9 = this.k;
        long j3 = this.T;
        int i10 = this.l;
        int i11 = this.m;
        int i12 = this.G.g;
        ArrayList arrayList4 = this.s;
        int h2 = xo9.h(i12, arrayList4);
        if (h2 < 0) {
            h2 = -(h2 + 1);
        }
        if (h2 < arrayList4.size()) {
            upxVar = (upx) arrayList4.get(h2);
        }
        upxVar = null;
        int i13 = i8;
        int i14 = 0;
        while (upxVar != null) {
            int i15 = i7;
            f fVar2 = upxVar.a;
            int i16 = upxVar.b;
            int h3 = xo9.h(i16, arrayList4);
            if (h3 >= 0) {
            }
            Object obj = upxVar.c;
            fVar2.getClass();
            abk0 abk0Var = k0x.c;
            boolean z2 = true;
            if (obj == null) {
                fVar = fVar2;
                i3 = a2;
                i = i9;
            } else {
                i = i9;
                ph50<g1m<?>, Object> ph50Var = fVar2.g;
                if (ph50Var == null) {
                    fVar = fVar2;
                    i3 = a2;
                } else {
                    i2 = i10;
                    if (obj instanceof g1m) {
                        g1m<?> g1mVar = (g1m) obj;
                        abk0 d = g1mVar.d();
                        if (d != null) {
                            abk0Var = d;
                        }
                        z2 = !abk0Var.b(g1mVar.u().f, ph50Var.d(g1mVar));
                    } else if (obj instanceof j5h0) {
                        j5h0 j5h0Var = (j5h0) obj;
                        if (j5h0Var.d()) {
                            Object[] objArr = j5h0Var.b;
                            long[] jArr = j5h0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                arrayList = arrayList4;
                                int i17 = 0;
                                while (true) {
                                    long j4 = jArr[i17];
                                    fVar = fVar2;
                                    i3 = a2;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            if ((j4 & 255) < 128) {
                                                i4 = i19;
                                                Object obj2 = objArr[(i17 << 3) + i19];
                                                j = j4;
                                                if (!(obj2 instanceof g1m)) {
                                                    break;
                                                }
                                                g1m<?> g1mVar2 = (g1m) obj2;
                                                abk0 d2 = g1mVar2.d();
                                                if (d2 == null) {
                                                    d2 = abk0Var;
                                                }
                                                if (!d2.b(g1mVar2.u().f, ph50Var.d(g1mVar2))) {
                                                    break;
                                                }
                                            } else {
                                                i4 = i19;
                                                j = j4;
                                            }
                                            j4 = j >> 8;
                                            i19 = i4 + 1;
                                        }
                                        if (i18 != 8) {
                                            break;
                                        }
                                    }
                                    if (i17 == length) {
                                        break;
                                    }
                                    i17++;
                                    a2 = i3;
                                    fVar2 = fVar;
                                }
                                z2 = false;
                                if (z2) {
                                    f fVar3 = fVar;
                                    ArrayList<f> arrayList5 = this.E;
                                    arrayList5.add(fVar3);
                                    this.g.b();
                                    wef0 wef0Var = fVar3.a;
                                    if (wef0Var == null || (eh50Var = fVar3.f) == null) {
                                        arrayList2 = arrayList5;
                                        i5 = i14;
                                    } else {
                                        fVar3.g(true);
                                        try {
                                            Object[] objArr2 = eh50Var.b;
                                            int[] iArr = eh50Var.c;
                                            long[] jArr2 = eh50Var.a;
                                            int length2 = jArr2.length - 2;
                                            arrayList2 = arrayList5;
                                            if (length2 >= 0) {
                                                int i20 = 0;
                                                while (true) {
                                                    long j5 = jArr2[i20];
                                                    Object[] objArr3 = objArr2;
                                                    i5 = i14;
                                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                        for (int i22 = 0; i22 < i21; i22++) {
                                                            if ((j5 & 255) < 128) {
                                                                int i23 = (i20 << 3) + i22;
                                                                j2 = j5;
                                                                Object obj3 = objArr3[i23];
                                                                int i24 = iArr[i23];
                                                                wef0Var.a(obj3);
                                                            } else {
                                                                j2 = j5;
                                                            }
                                                            j5 = j2 >> 8;
                                                        }
                                                        if (i21 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i20 == length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    i14 = i5;
                                                    objArr2 = objArr3;
                                                }
                                            } else {
                                                i5 = i14;
                                            }
                                            fVar3.g(false);
                                        } catch (Throwable th) {
                                            fVar3.g(false);
                                            throw th;
                                        }
                                    }
                                    znk0.J(arrayList2);
                                    i14 = i5;
                                } else {
                                    this.G.r(i16);
                                    int i25 = this.G.g;
                                    A0(i13, i25, i8);
                                    int q = this.G.q(i25);
                                    while (q != i8 && !this.G.l(q)) {
                                        q = this.G.q(q);
                                    }
                                    int i26 = this.G.l(q) ? 0 : i;
                                    if (q != i25) {
                                        int Q0 = (Q0(q) - this.G.o(i25)) + i26;
                                        while (i26 < Q0 && q != i16) {
                                            q++;
                                            while (q < i16) {
                                                int a3 = x2k0.a(q, this.G.b) + q;
                                                if (i16 >= a3) {
                                                    i26 += this.G.l(q) ? i15 : Q0(q);
                                                    q = a3;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    this.k = i26;
                                    this.m = v0(i25);
                                    int q2 = this.G.q(i25);
                                    long j6 = 0;
                                    int i27 = 3;
                                    int i28 = 0;
                                    while (q2 >= 0) {
                                        if (q2 == i8) {
                                            rotateLeft = Long.rotateLeft(j3, i28);
                                        } else {
                                            r2k0 r2k0Var2 = this.G;
                                            boolean k = r2k0Var2.k(q2);
                                            int[] iArr2 = r2k0Var2.b;
                                            if (k) {
                                                Object p = r2k0Var2.p(q2, iArr2);
                                                hashCode = p != null ? p instanceof Enum ? ((Enum) p).ordinal() : p instanceof fc30 ? 126665345 : p.hashCode() : 0;
                                            } else {
                                                int i29 = r2k0Var2.i(q2);
                                                hashCode = (i29 != 207 || (b2 = r2k0Var2.b(q2, iArr2)) == null || b2.equals(a.C0011a.a)) ? i29 : b2.hashCode();
                                            }
                                            if (hashCode == 126665345) {
                                                rotateLeft = Long.rotateLeft(hashCode, i28);
                                            } else {
                                                j6 = (j6 ^ Long.rotateLeft(hashCode, i27)) ^ Long.rotateLeft(this.G.k(q2) ? 0 : v0(q2), i28);
                                                i27 = (i27 + 6) % 64;
                                                i28 = (i28 + 6) % 64;
                                                q2 = this.G.q(q2);
                                            }
                                        }
                                        j6 ^= rotateLeft;
                                        break;
                                    }
                                    this.T = j6;
                                    this.K = null;
                                    wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar = fVar.d;
                                    if (wzsVar == null) {
                                        throw new IllegalStateException("Invalid restart scope");
                                    }
                                    wzsVar.invoke(this, Integer.valueOf(i15));
                                    this.K = null;
                                    r2k0 r2k0Var3 = this.G;
                                    int a4 = x2k0.a(i8, r2k0Var3.b) + i8;
                                    int i30 = r2k0Var3.g;
                                    if (i30 < i8 || i30 > a4) {
                                        androidx.compose.runtime.b.a("Index " + i8 + " is not a parent of " + i30);
                                    }
                                    r2k0Var3.i = i8;
                                    r2k0Var3.h = a4;
                                    r2k0Var3.l = 0;
                                    r2k0Var3.m = 0;
                                    i13 = i25;
                                    i14 = i15;
                                }
                                arrayList3 = arrayList;
                                h = xo9.h(this.G.g, arrayList3);
                                if (h < 0) {
                                    h = -(h + 1);
                                }
                                if (h >= arrayList3.size()) {
                                    upx upxVar2 = (upx) arrayList3.get(h);
                                    i6 = i3;
                                    if (upxVar2.b < i6) {
                                        upxVar = upxVar2;
                                        arrayList4 = arrayList3;
                                        a2 = i6;
                                        i7 = i15;
                                        i9 = i;
                                        i10 = i2;
                                    }
                                } else {
                                    i6 = i3;
                                }
                                upxVar = null;
                                arrayList4 = arrayList3;
                                a2 = i6;
                                i7 = i15;
                                i9 = i;
                                i10 = i2;
                            }
                        }
                        fVar = fVar2;
                        i3 = a2;
                        arrayList = arrayList4;
                        z2 = false;
                        if (z2) {
                        }
                        arrayList3 = arrayList;
                        h = xo9.h(this.G.g, arrayList3);
                        if (h < 0) {
                        }
                        if (h >= arrayList3.size()) {
                        }
                        upxVar = null;
                        arrayList4 = arrayList3;
                        a2 = i6;
                        i7 = i15;
                        i9 = i;
                        i10 = i2;
                    }
                    fVar = fVar2;
                    i3 = a2;
                    arrayList = arrayList4;
                    if (z2) {
                    }
                    arrayList3 = arrayList;
                    h = xo9.h(this.G.g, arrayList3);
                    if (h < 0) {
                    }
                    if (h >= arrayList3.size()) {
                    }
                    upxVar = null;
                    arrayList4 = arrayList3;
                    a2 = i6;
                    i7 = i15;
                    i9 = i;
                    i10 = i2;
                }
            }
            i2 = i10;
            arrayList = arrayList4;
            if (z2) {
            }
            arrayList3 = arrayList;
            h = xo9.h(this.G.g, arrayList3);
            if (h < 0) {
            }
            if (h >= arrayList3.size()) {
            }
            upxVar = null;
            arrayList4 = arrayList3;
            a2 = i6;
            i7 = i15;
            i9 = i;
            i10 = i2;
        }
        int i31 = i9;
        int i32 = i10;
        if (i14 != 0) {
            A0(i13, i8, i8);
            this.G.t();
            int Q02 = Q0(i8);
            this.k = i31 + Q02;
            this.l = i32 + Q02;
            this.m = i11;
        } else {
            G0();
        }
        this.T = j3;
        this.F = z;
    }

    @Override // androidx.compose.runtime.a
    public final boolean y(Object obj) {
        if (t0() == obj) {
            return false;
        }
        P0(obj);
        return true;
    }

    public final void y0() {
        B0(this.G.g);
        sri sriVar = this.M;
        sriVar.d(false);
        sriVar.e();
        sriVar.b.b.b0(ss80.x.c);
        int i = sriVar.f;
        r2k0 r2k0Var = sriVar.a.G;
        sriVar.f = x2k0.a(r2k0Var.g, r2k0Var.b) + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r4 == r0) goto L17;
     */
    @Override // androidx.compose.runtime.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(c9e0<?> c9e0Var) {
        sy90 g0 = g0();
        I0(201, androidx.compose.runtime.b.c);
        Object x = x();
        xjr0 xjr0Var = epx.f(x, a.C0011a.a) ? null : (xjr0) x;
        e eVar = c9e0Var.a;
        xjr0 c = eVar.c(c9e0Var, xjr0Var);
        boolean equals = c.equals(xjr0Var);
        if (!equals) {
            R(c);
        }
        boolean z = true;
        if (!this.S) {
            r2k0 r2k0Var = this.G;
            sy90 sy90Var = (sy90) r2k0Var.b(r2k0Var.g, r2k0Var.b);
            if (!(e() && equals) && (c9e0Var.f || !g0.containsKey(eVar))) {
                g0 = g0.f3(eVar, c);
            } else if ((equals && !this.w) || !this.w) {
                g0 = sy90Var;
            }
            if (!this.y) {
            }
            if (z && !this.S) {
                z0(g0);
            }
            this.x.c(this.w ? 1 : 0);
            this.w = z;
            this.K = g0;
            H0(androidx.compose.runtime.b.d, 202, 0, g0);
        }
        if (c9e0Var.f || !g0.containsKey(eVar)) {
            g0 = g0.f3(eVar, c);
        }
        this.J = true;
        z = false;
        if (z) {
            z0(g0);
        }
        this.x.c(this.w ? 1 : 0);
        this.w = z;
        this.K = g0;
        H0(androidx.compose.runtime.b.d, 202, 0, g0);
    }

    public final void z0(sy90 sy90Var) {
        pg50<sy90> pg50Var = this.v;
        if (pg50Var == null) {
            pg50Var = new pg50<>((Object) null);
            this.v = pg50Var;
        }
        pg50Var.k(this.G.g, sy90Var);
    }

    /* compiled from: GapComposer.kt */
    public static final class a implements huf0 {
        public final b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // xsna.huf0
        public final void d() {
            this.b.z();
        }

        @Override // xsna.huf0
        public final void f() {
            this.b.z();
        }

        @Override // xsna.huf0
        public final void e() {
        }
    }
}
