package androidx.media3.exoplayer.dash;

import B1.h;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.n;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2217s;
import androidx.media3.exoplayer.source.InterfaceC2209j;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.y;
import b1.P;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.N;
import e1.Z;
import h1.InterfaceC4403F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m1.o1;
import n1.G1;
import p1.C6031a;
import p1.C6033c;
import p1.C6035e;
import p1.C6036f;
import q1.t;
import q1.u;

/* loaded from: classes.dex */
public final class f implements C, d0.a, h.b {

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f21017y = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f21018z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a, reason: collision with root package name */
    public final int f21019a;

    /* renamed from: b, reason: collision with root package name */
    public final c.a f21020b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4403F f21021c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.e f21022d;

    /* renamed from: e, reason: collision with root package name */
    public final u f21023e;

    /* renamed from: f, reason: collision with root package name */
    public final D1.k f21024f;

    /* renamed from: g, reason: collision with root package name */
    public final b f21025g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21026h;

    /* renamed from: i, reason: collision with root package name */
    public final D1.n f21027i;

    /* renamed from: j, reason: collision with root package name */
    public final D1.b f21028j;

    /* renamed from: k, reason: collision with root package name */
    public final m0 f21029k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2209j f21030l;

    /* renamed from: m, reason: collision with root package name */
    public final n f21031m;

    /* renamed from: o, reason: collision with root package name */
    public final L.a f21033o;

    /* renamed from: p, reason: collision with root package name */
    public final t.a f21034p;

    /* renamed from: q, reason: collision with root package name */
    public final G1 f21035q;

    /* renamed from: r, reason: collision with root package name */
    public C.a f21036r;

    /* renamed from: s, reason: collision with root package name */
    public d0 f21037s;

    /* renamed from: t, reason: collision with root package name */
    public C6033c f21038t;
    private final a[] trackGroupInfos;

    /* renamed from: u, reason: collision with root package name */
    public int f21039u;

    /* renamed from: v, reason: collision with root package name */
    public List f21040v;

    /* renamed from: x, reason: collision with root package name */
    public long f21042x;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21041w = true;
    private B1.h[] sampleStreams = I(0);
    private m[] eventSampleStreams = new m[0];

    /* renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f21032n = new IdentityHashMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f21043a;
        public final int[] adaptationSetIndices;

        /* renamed from: b, reason: collision with root package name */
        public final int f21044b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21045c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21046d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21047e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21048f;

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC3445z f21049g;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, AbstractC3445z abstractC3445z) {
            this.f21043a = i10;
            this.adaptationSetIndices = iArr;
            this.f21044b = i11;
            this.f21046d = i12;
            this.f21047e = i13;
            this.f21048f = i14;
            this.f21045c = i15;
            this.f21049g = abstractC3445z;
        }

        public static a a(int[] iArr, int i10, AbstractC3445z abstractC3445z) {
            return new a(3, 1, iArr, i10, -1, -1, -1, abstractC3445z);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1, AbstractC3445z.t());
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10, AbstractC3445z.t());
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1, AbstractC3445z.t());
        }
    }

    public f(int i10, C6033c c6033c, b bVar, int i11, c.a aVar, InterfaceC4403F interfaceC4403F, D1.e eVar, u uVar, t.a aVar2, D1.k kVar, L.a aVar3, long j10, D1.n nVar, D1.b bVar2, InterfaceC2209j interfaceC2209j, n.b bVar3, G1 g12) {
        this.f21019a = i10;
        this.f21038t = c6033c;
        this.f21025g = bVar;
        this.f21039u = i11;
        this.f21020b = aVar;
        this.f21021c = interfaceC4403F;
        this.f21022d = eVar;
        this.f21023e = uVar;
        this.f21034p = aVar2;
        this.f21024f = kVar;
        this.f21033o = aVar3;
        this.f21026h = j10;
        this.f21027i = nVar;
        this.f21028j = bVar2;
        this.f21030l = interfaceC2209j;
        this.f21035q = g12;
        this.f21031m = new n(c6033c, bVar3, bVar2);
        this.f21037s = interfaceC2209j.empty();
        p1.g d10 = c6033c.d(i11);
        List list = d10.f62935d;
        this.f21040v = list;
        Pair w10 = w(uVar, aVar, d10.f62934c, list);
        this.f21029k = (m0) w10.first;
        this.trackGroupInfos = (a[]) w10.second;
    }

    public static C6035e A(List list) {
        return z(list, "http://dashif.org/guidelines/trickmode");
    }

    public static androidx.media3.common.a[] B(List list, int[] iArr) {
        for (int i10 : iArr) {
            C6031a c6031a = (C6031a) list.get(i10);
            List list2 = ((C6031a) list.get(i10)).f62893d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                C6035e c6035e = (C6035e) list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(c6035e.f62926a)) {
                    return K(c6035e, f21017y, new a.b().y0("application/cea-608").j0(c6031a.f62890a + ":cea608").P());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(c6035e.f62926a)) {
                    return K(c6035e, f21018z, new a.b().y0("application/cea-708").j0(c6031a.f62890a + ":cea708").P());
                }
            }
        }
        return new androidx.media3.common.a[0];
    }

    public static int[][] C(List list) {
        C6035e y10;
        Integer num;
        int size = list.size();
        HashMap g10 = N.g(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            g10.put(Long.valueOf(((C6031a) list.get(i10)).f62890a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            C6031a c6031a = (C6031a) list.get(i11);
            C6035e A10 = A(c6031a.f62894e);
            if (A10 == null) {
                A10 = A(c6031a.f62895f);
            }
            int intValue = (A10 == null || (num = (Integer) g10.get(Long.valueOf(Long.parseLong(A10.f62927b)))) == null || !x(c6031a, (C6031a) list.get(num.intValue()))) ? i11 : num.intValue();
            if (intValue == i11 && (y10 = y(c6031a.f62895f)) != null) {
                for (String str : Z.A1(y10.f62927b, ",")) {
                    Integer num2 = (Integer) g10.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && x(c6031a, (C6031a) list.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(intValue);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] o10 = com.google.common.primitives.f.o((Collection) arrayList.get(i12));
            iArr[i12] = o10;
            Arrays.sort(o10);
        }
        return iArr;
    }

    public static boolean F(List list, int[] iArr) {
        for (int i10 : iArr) {
            List list2 = ((C6031a) list.get(i10)).f62892c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!((p1.j) list2.get(i11)).f62950e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int G(int i10, List list, int[][] iArr, boolean[] zArr, androidx.media3.common.a[][] aVarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (F(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            androidx.media3.common.a[] B10 = B(list, iArr[i12]);
            aVarArr[i12] = B10;
            if (B10.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    public static void H(c.a aVar, androidx.media3.common.a[] aVarArr) {
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr[i10] = aVar.d(aVarArr[i10]);
        }
    }

    public static B1.h[] I(int i10) {
        return new B1.h[i10];
    }

    public static androidx.media3.common.a[] K(C6035e c6035e, Pattern pattern, androidx.media3.common.a aVar) {
        String str = c6035e.f62927b;
        if (str == null) {
            return new androidx.media3.common.a[]{aVar};
        }
        String[] A12 = Z.A1(str, ";");
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[A12.length];
        for (int i10 = 0; i10 < A12.length; i10++) {
            Matcher matcher = pattern.matcher(A12[i10]);
            if (!matcher.matches()) {
                return new androidx.media3.common.a[]{aVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            aVarArr[i10] = aVar.b().j0(aVar.f20529a + ":" + parseInt).Q(parseInt).n0(matcher.group(2)).P();
        }
        return aVarArr;
    }

    public static void p(List list, P[] pArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            C6036f c6036f = (C6036f) list.get(i11);
            pArr[i10] = new P(c6036f.a() + ":" + i11, new a.b().j0(c6036f.a()).y0("application/x-emsg").P());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    public static int q(u uVar, c.a aVar, List list, int[][] iArr, int i10, boolean[] zArr, androidx.media3.common.a[][] aVarArr, P[] pArr, a[] aVarArr2) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(((C6031a) list.get(i15)).f62892c);
            }
            int size = arrayList.size();
            androidx.media3.common.a[] aVarArr3 = new androidx.media3.common.a[size];
            for (int i16 = 0; i16 < size; i16++) {
                androidx.media3.common.a aVar2 = ((p1.j) arrayList.get(i16)).f62947b;
                aVarArr3[i16] = aVar2.b().X(uVar.b(aVar2)).P();
            }
            C6031a c6031a = (C6031a) list.get(iArr2[0]);
            long j10 = c6031a.f62890a;
            String l10 = j10 != -1 ? Long.toString(j10) : "unset:" + i13;
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i14 + 2;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (aVarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            H(aVar, aVarArr3);
            pArr[i14] = new P(l10, aVarArr3);
            aVarArr2[i14] = a.d(c6031a.f62891b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                String str = l10 + ":emsg";
                pArr[i17] = new P(str, new a.b().j0(str).y0("application/x-emsg").P());
                aVarArr2[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                aVarArr2[i11] = a.a(iArr2, i14, AbstractC3445z.q(aVarArr[i13]));
                H(aVar, aVarArr[i13]);
                pArr[i11] = new P(l10 + ":cc", aVarArr[i13]);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    public static Pair w(u uVar, c.a aVar, List list, List list2) {
        int[][] C10 = C(list);
        int length = C10.length;
        boolean[] zArr = new boolean[length];
        androidx.media3.common.a[][] aVarArr = new androidx.media3.common.a[length][];
        int G10 = G(length, list, C10, zArr, aVarArr) + length + list2.size();
        P[] pArr = new P[G10];
        a[] aVarArr2 = new a[G10];
        p(list2, pArr, aVarArr2, q(uVar, aVar, list, C10, length, zArr, aVarArr, pArr, aVarArr2));
        return Pair.create(new m0(pArr), aVarArr2);
    }

    public static boolean x(C6031a c6031a, C6031a c6031a2) {
        if (c6031a.f62891b != c6031a2.f62891b) {
            return false;
        }
        if (c6031a.f62892c.isEmpty() || c6031a2.f62892c.isEmpty()) {
            return true;
        }
        androidx.media3.common.a aVar = ((p1.j) c6031a.f62892c.get(0)).f62947b;
        androidx.media3.common.a aVar2 = ((p1.j) c6031a2.f62892c.get(0)).f62947b;
        return Objects.equals(aVar.f20532d, aVar2.f20532d) && (aVar.f20534f & (-16385)) == (aVar2.f20534f & (-16385));
    }

    public static C6035e y(List list) {
        return z(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static C6035e z(List list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6035e c6035e = (C6035e) list.get(i10);
            if (str.equals(c6035e.f62926a)) {
                return c6035e;
            }
        }
        return null;
    }

    public final int D(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.trackGroupInfos[i11].f21046d;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.trackGroupInfos[i14].f21044b == 0) {
                return i13;
            }
        }
        return -1;
    }

    public final int[] E(y[] yVarArr) {
        int[] iArr = new int[yVarArr.length];
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            y yVar = yVarArr[i10];
            if (yVar != null) {
                iArr[i10] = this.f21029k.d(yVar.m());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    @Override // androidx.media3.exoplayer.source.d0.a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void j(B1.h hVar) {
        this.f21036r.j(this);
    }

    public void L() {
        this.f21031m.o();
        for (B1.h hVar : this.sampleStreams) {
            hVar.U(this);
        }
        this.f21036r = null;
    }

    public final void M(y[] yVarArr, boolean[] zArr, c0[] c0VarArr) {
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            if (yVarArr[i10] == null || !zArr[i10]) {
                c0 c0Var = c0VarArr[i10];
                if (c0Var instanceof B1.h) {
                    ((B1.h) c0Var).U(this);
                } else if (c0Var instanceof h.a) {
                    ((h.a) c0Var).d();
                }
                c0VarArr[i10] = null;
            }
        }
    }

    public final void N(y[] yVarArr, c0[] c0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if ((c0Var instanceof C2217s) || (c0Var instanceof h.a)) {
                int D10 = D(i10, iArr);
                if (D10 == -1) {
                    z10 = c0VarArr[i10] instanceof C2217s;
                } else {
                    c0 c0Var2 = c0VarArr[i10];
                    z10 = (c0Var2 instanceof h.a) && ((h.a) c0Var2).f588a == c0VarArr[D10];
                }
                if (!z10) {
                    c0 c0Var3 = c0VarArr[i10];
                    if (c0Var3 instanceof h.a) {
                        ((h.a) c0Var3).d();
                    }
                    c0VarArr[i10] = null;
                }
            }
        }
    }

    public final void O(y[] yVarArr, c0[] c0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            y yVar = yVarArr[i10];
            if (yVar != null) {
                c0 c0Var = c0VarArr[i10];
                if (c0Var == null) {
                    zArr[i10] = true;
                    a aVar = this.trackGroupInfos[iArr[i10]];
                    int i11 = aVar.f21044b;
                    if (i11 == 0) {
                        c0VarArr[i10] = s(aVar, yVar, j10);
                    } else if (i11 == 2) {
                        c0VarArr[i10] = new m((C6036f) this.f21040v.get(aVar.f21045c), yVar.m().a(0), this.f21038t.f62903d);
                    }
                } else if (c0Var instanceof B1.h) {
                    ((c) ((B1.h) c0Var).H()).b(yVar);
                }
            }
        }
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            if (c0VarArr[i12] == null && yVarArr[i12] != null) {
                a aVar2 = this.trackGroupInfos[iArr[i12]];
                if (aVar2.f21044b == 1) {
                    int D10 = D(i12, iArr);
                    if (D10 == -1) {
                        c0VarArr[i12] = new C2217s();
                    } else {
                        c0VarArr[i12] = ((B1.h) c0VarArr[D10]).X(j10, aVar2.f21043a);
                    }
                }
            }
        }
    }

    public void P(C6033c c6033c, int i10) {
        this.f21038t = c6033c;
        this.f21039u = i10;
        this.f21031m.q(c6033c);
        B1.h[] hVarArr = this.sampleStreams;
        if (hVarArr != null) {
            for (B1.h hVar : hVarArr) {
                ((c) hVar.H()).c(c6033c, i10);
            }
            this.f21036r.j(this);
        }
        this.f21040v = c6033c.d(i10).f62935d;
        for (m mVar : this.eventSampleStreams) {
            Iterator it = this.f21040v.iterator();
            while (true) {
                if (it.hasNext()) {
                    C6036f c6036f = (C6036f) it.next();
                    if (c6036f.a().equals(mVar.b())) {
                        mVar.e(c6036f, c6033c.f62903d && i10 == c6033c.e() - 1);
                    }
                }
            }
        }
    }

    @Override // B1.h.b
    public synchronized void a(B1.h hVar) {
        n.c cVar = (n.c) this.f21032n.remove(hVar);
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        return this.f21037s.b(kVar);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return this.f21037s.d();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f21037s.e();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        for (B1.h hVar : this.sampleStreams) {
            if (hVar.f567a == 2) {
                return hVar.f(j10, o1Var);
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        return this.f21037s.g();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        for (B1.h hVar : this.sampleStreams) {
            if (!hVar.e()) {
                hVar.G(this.f21038t.g(this.f21039u));
            }
        }
        this.f21037s.h(j10);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        for (B1.h hVar : this.sampleStreams) {
            hVar.W(j10);
        }
        for (m mVar : this.eventSampleStreams) {
            mVar.d(j10);
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] E10 = E(yVarArr);
        M(yVarArr, zArr, c0VarArr);
        N(yVarArr, c0VarArr, E10);
        O(yVarArr, c0VarArr, zArr2, j10, E10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (c0 c0Var : c0VarArr) {
            if (c0Var instanceof B1.h) {
                arrayList.add((B1.h) c0Var);
            } else if (c0Var instanceof m) {
                arrayList2.add((m) c0Var);
            }
        }
        B1.h[] I10 = I(arrayList.size());
        this.sampleStreams = I10;
        arrayList.toArray(I10);
        m[] mVarArr = new m[arrayList2.size()];
        this.eventSampleStreams = mVarArr;
        arrayList2.toArray(mVarArr);
        this.f21037s = this.f21030l.a(arrayList, com.google.common.collect.L.k(arrayList, new Ra.f() { // from class: androidx.media3.exoplayer.dash.e
            @Override // Ra.f
            public final Object apply(Object obj) {
                List u10;
                u10 = AbstractC3445z.u(Integer.valueOf(((B1.h) obj).f567a));
                return u10;
            }
        }));
        if (this.f21041w) {
            this.f21041w = false;
            this.f21042x = j10;
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        for (B1.h hVar : this.sampleStreams) {
            if (hVar.C()) {
                return this.f21042x;
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        this.f21027i.a();
    }

    public final B1.h s(a aVar, y yVar, long j10) {
        int i10;
        P p10;
        int i11;
        int i12 = aVar.f21047e;
        boolean z10 = i12 != -1;
        n.c cVar = null;
        if (z10) {
            p10 = this.f21029k.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            p10 = null;
        }
        int i13 = aVar.f21048f;
        AbstractC3445z t10 = i13 != -1 ? this.trackGroupInfos[i13].f21049g : AbstractC3445z.t();
        int size = i10 + t10.size();
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[size];
        int[] iArr = new int[size];
        if (z10) {
            aVarArr[0] = p10.a(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < t10.size(); i14++) {
            androidx.media3.common.a aVar2 = (androidx.media3.common.a) t10.get(i14);
            aVarArr[i11] = aVar2;
            iArr[i11] = 3;
            arrayList.add(aVar2);
            i11++;
        }
        if (this.f21038t.f62903d && z10) {
            cVar = this.f21031m.k();
        }
        n.c cVar2 = cVar;
        B1.h hVar = new B1.h(aVar.f21043a, iArr, aVarArr, this.f21020b.e(this.f21027i, this.f21038t, this.f21025g, this.f21039u, aVar.adaptationSetIndices, yVar, aVar.f21043a, this.f21026h, z10, arrayList, cVar2, this.f21021c, this.f21035q, this.f21022d), this, this.f21028j, j10, this.f21023e, this.f21034p, this.f21024f, this.f21033o, this.f21041w, null);
        synchronized (this) {
            this.f21032n.put(hVar, cVar2);
        }
        return hVar;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f21036r = aVar;
        aVar.i(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return this.f21029k;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        for (B1.h hVar : this.sampleStreams) {
            hVar.v(j10, z10);
        }
    }
}
