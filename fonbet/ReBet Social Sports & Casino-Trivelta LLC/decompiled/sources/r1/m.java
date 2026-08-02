package r1;

import D1.k;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.InterfaceC2209j;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2335D;
import b1.C2334C;
import b1.P;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.Z;
import h1.InterfaceC4403F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m1.o1;
import n1.G1;
import q1.t;
import r1.s;
import s1.i;
import s1.m;

/* loaded from: classes.dex */
public final class m implements C, m.b {

    /* renamed from: a, reason: collision with root package name */
    public final h f63817a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.m f63818b;

    /* renamed from: c, reason: collision with root package name */
    public final g f63819c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4403F f63820d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.e f63821e;

    /* renamed from: f, reason: collision with root package name */
    public final q1.u f63822f;

    /* renamed from: g, reason: collision with root package name */
    public final t.a f63823g;

    /* renamed from: h, reason: collision with root package name */
    public final D1.k f63824h;

    /* renamed from: i, reason: collision with root package name */
    public final L.a f63825i;

    /* renamed from: j, reason: collision with root package name */
    public final D1.b f63826j;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2209j f63829m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f63830n;

    /* renamed from: o, reason: collision with root package name */
    public final int f63831o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f63832p;

    /* renamed from: q, reason: collision with root package name */
    public final G1 f63833q;

    /* renamed from: s, reason: collision with root package name */
    public final long f63835s;

    /* renamed from: t, reason: collision with root package name */
    public C.a f63836t;

    /* renamed from: u, reason: collision with root package name */
    public int f63837u;

    /* renamed from: v, reason: collision with root package name */
    public m0 f63838v;

    /* renamed from: x, reason: collision with root package name */
    public int f63840x;

    /* renamed from: y, reason: collision with root package name */
    public d0 f63841y;

    /* renamed from: r, reason: collision with root package name */
    public final s.b f63834r = new b();

    /* renamed from: k, reason: collision with root package name */
    public final IdentityHashMap f63827k = new IdentityHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final v f63828l = new v();
    private s[] sampleStreamWrappers = new s[0];
    private s[] enabledSampleStreamWrappers = new s[0];

    /* renamed from: w, reason: collision with root package name */
    public int[][] f63839w = new int[0][];

    public class b implements s.b {
        public b() {
        }

        @Override // androidx.media3.exoplayer.source.d0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(s sVar) {
            m.this.f63836t.j(m.this);
        }

        @Override // r1.s.b
        public void c() {
            if (m.j(m.this) > 0) {
                return;
            }
            int i10 = 0;
            for (s sVar : m.this.sampleStreamWrappers) {
                i10 += sVar.u().f21832a;
            }
            P[] pArr = new P[i10];
            int i11 = 0;
            for (s sVar2 : m.this.sampleStreamWrappers) {
                int i12 = sVar2.u().f21832a;
                int i13 = 0;
                while (i13 < i12) {
                    pArr[i11] = sVar2.u().b(i13);
                    i13++;
                    i11++;
                }
            }
            m.this.f63838v = new m0(pArr);
            m.this.f63836t.i(m.this);
        }

        @Override // r1.s.b
        public void l(Uri uri) {
            m.this.f63818b.f(uri);
        }
    }

    public m(h hVar, s1.m mVar, g gVar, InterfaceC4403F interfaceC4403F, D1.e eVar, q1.u uVar, t.a aVar, D1.k kVar, L.a aVar2, D1.b bVar, InterfaceC2209j interfaceC2209j, boolean z10, int i10, boolean z11, G1 g12, long j10) {
        this.f63817a = hVar;
        this.f63818b = mVar;
        this.f63819c = gVar;
        this.f63820d = interfaceC4403F;
        this.f63821e = eVar;
        this.f63822f = uVar;
        this.f63823g = aVar;
        this.f63824h = kVar;
        this.f63825i = aVar2;
        this.f63826j = bVar;
        this.f63829m = interfaceC2209j;
        this.f63830n = z10;
        this.f63831o = i10;
        this.f63832p = z11;
        this.f63833q = g12;
        this.f63835s = j10;
        this.f63841y = interfaceC2209j.empty();
    }

    public static androidx.media3.common.a A(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, boolean z10) {
        C2334C c2334c;
        int i10;
        String str;
        String str2;
        List list;
        int i11;
        int i12;
        String str3;
        AbstractC3445z t10 = AbstractC3445z.t();
        if (aVar2 != null) {
            str2 = aVar2.f20539k;
            c2334c = aVar2.f20540l;
            i11 = aVar2.f20518F;
            i10 = aVar2.f20533e;
            i12 = aVar2.f20534f;
            str = aVar2.f20532d;
            str3 = aVar2.f20530b;
            list = aVar2.f20531c;
        } else {
            String V10 = Z.V(aVar.f20539k, 1);
            c2334c = aVar.f20540l;
            if (z10) {
                i11 = aVar.f20518F;
                i10 = aVar.f20533e;
                i12 = aVar.f20534f;
                str = aVar.f20532d;
                str3 = aVar.f20530b;
                str2 = V10;
                list = aVar.f20531c;
            } else {
                i10 = 0;
                str = null;
                str2 = V10;
                list = t10;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        return new a.b().j0(aVar.f20529a).l0(str3).m0(list).W(aVar.f20542n).y0(AbstractC2335D.g(str2)).U(str2).r0(c2334c).S(z10 ? aVar.f20536h : -1).t0(z10 ? aVar.f20537i : -1).T(i11).A0(i10).w0(i12).n0(str).P();
    }

    public static Map B(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitData = (DrmInitData) list.get(i10);
            String str = drmInitData.f20463b;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData2.f20463b, str)) {
                    drmInitData = drmInitData.J(drmInitData2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, drmInitData);
        }
        return hashMap;
    }

    public static androidx.media3.common.a C(androidx.media3.common.a aVar) {
        String V10 = Z.V(aVar.f20539k, 2);
        return new a.b().j0(aVar.f20529a).l0(aVar.f20530b).m0(aVar.f20531c).W(aVar.f20542n).y0(AbstractC2335D.g(V10)).U(V10).r0(aVar.f20540l).S(aVar.f20536h).t0(aVar.f20537i).F0(aVar.f20550v).h0(aVar.f20551w).f0(aVar.f20554z).A0(aVar.f20533e).w0(aVar.f20534f).P();
    }

    public static /* synthetic */ int j(m mVar) {
        int i10 = mVar.f63837u - 1;
        mVar.f63837u = i10;
        return i10;
    }

    public void D() {
        this.f63818b.b(this);
        for (s sVar : this.sampleStreamWrappers) {
            sVar.j0();
        }
        this.f63836t = null;
    }

    @Override // s1.m.b
    public boolean a(Uri uri, k.c cVar, boolean z10) {
        boolean z11 = true;
        for (s sVar : this.sampleStreamWrappers) {
            z11 &= sVar.e0(uri, cVar, z10);
        }
        this.f63836t.j(this);
        return z11;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        if (this.f63838v != null) {
            return this.f63841y.b(kVar);
        }
        for (s sVar : this.sampleStreamWrappers) {
            sVar.D();
        }
        return false;
    }

    @Override // s1.m.b
    public void c() {
        for (s sVar : this.sampleStreamWrappers) {
            sVar.f0();
        }
        this.f63836t.j(this);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return this.f63841y.d();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f63841y.e();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        for (s sVar : this.enabledSampleStreamWrappers) {
            if (sVar.T()) {
                return sVar.f(j10, o1Var);
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        return this.f63841y.g();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        this.f63841y.h(j10);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        s[] sVarArr = this.enabledSampleStreamWrappers;
        if (sVarArr.length > 0) {
            boolean m02 = sVarArr[0].m0(j10, false);
            int i10 = 1;
            while (true) {
                s[] sVarArr2 = this.enabledSampleStreamWrappers;
                if (i10 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i10].m0(j10, m02);
                i10++;
            }
            if (m02) {
                this.f63828l.b();
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[yVarArr.length];
        int[] iArr2 = new int[yVarArr.length];
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            iArr[i10] = c0Var == null ? -1 : ((Integer) this.f63827k.get(c0Var)).intValue();
            iArr2[i10] = -1;
            y yVar = yVarArr[i10];
            if (yVar != null) {
                P m10 = yVar.m();
                int i11 = 0;
                while (true) {
                    s[] sVarArr = this.sampleStreamWrappers;
                    if (i11 >= sVarArr.length) {
                        break;
                    }
                    if (sVarArr[i11].u().d(m10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f63827k.clear();
        int length = yVarArr.length;
        c0[] c0VarArr2 = new c0[length];
        c0[] c0VarArr3 = new c0[yVarArr.length];
        y[] yVarArr2 = new y[yVarArr.length];
        s[] sVarArr2 = new s[this.sampleStreamWrappers.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i12 < this.sampleStreamWrappers.length) {
            for (int i14 = 0; i14 < yVarArr.length; i14++) {
                y yVar2 = null;
                c0VarArr3[i14] = iArr[i14] == i12 ? c0VarArr[i14] : null;
                if (iArr2[i14] == i12) {
                    yVar2 = yVarArr[i14];
                }
                yVarArr2[i14] = yVar2;
            }
            s sVar = this.sampleStreamWrappers[i12];
            int[] iArr3 = iArr;
            int i15 = i12;
            int i16 = i13;
            boolean n02 = sVar.n0(yVarArr2, zArr, c0VarArr3, zArr2, j10, z10);
            boolean z11 = false;
            for (int i17 = 0; i17 < yVarArr.length; i17++) {
                c0 c0Var2 = c0VarArr3[i17];
                if (iArr2[i17] == i15) {
                    AbstractC4134a.e(c0Var2);
                    c0VarArr2[i17] = c0Var2;
                    this.f63827k.put(c0Var2, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr3[i17] == i15) {
                    AbstractC4134a.g(c0Var2 == null);
                }
            }
            if (z11) {
                sVarArr2[i16] = sVar;
                i13 = i16 + 1;
                if (i16 == 0) {
                    sVar.q0(true);
                    if (!n02) {
                        s[] sVarArr3 = this.enabledSampleStreamWrappers;
                        if (sVarArr3.length != 0 && sVar == sVarArr3[0]) {
                        }
                    }
                    this.f63828l.b();
                    z10 = true;
                } else {
                    sVar.q0(i15 < this.f63840x);
                }
            } else {
                i13 = i16;
            }
            i12 = i15 + 1;
            iArr = iArr3;
        }
        System.arraycopy(c0VarArr2, 0, c0VarArr, 0, length);
        s[] sVarArr4 = (s[]) Z.g1(sVarArr2, i13);
        this.enabledSampleStreamWrappers = sVarArr4;
        AbstractC3445z q10 = AbstractC3445z.q(sVarArr4);
        this.f63841y = this.f63829m.a(q10, com.google.common.collect.L.k(q10, new Ra.f() { // from class: r1.l
            @Override // Ra.f
            public final Object apply(Object obj) {
                List c10;
                c10 = ((s) obj).u().c();
                return c10;
            }
        }));
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        for (s sVar : this.sampleStreamWrappers) {
            sVar.r();
        }
    }

    public final void s(long j10, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = ((i.a) list.get(i10)).f64559d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (Objects.equals(str, ((i.a) list.get(i11)).f64559d)) {
                        i.a aVar = (i.a) list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f64556a);
                        arrayList2.add(aVar.f64557b);
                        z10 &= Z.U(aVar.f64557b.f20539k, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                s z11 = z(str2, 1, (Uri[]) arrayList.toArray((Uri[]) Z.j(new Uri[0])), (androidx.media3.common.a[]) arrayList2.toArray(new androidx.media3.common.a[0]), null, Collections.EMPTY_LIST, map, j10);
                list3.add(com.google.common.primitives.f.o(arrayList3));
                list2.add(z11);
                if (this.f63830n && z10) {
                    z11.h0(new P[]{new P(str2, (androidx.media3.common.a[]) arrayList2.toArray(new androidx.media3.common.a[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f63836t = aVar;
        this.f63818b.k(this);
        x(j10);
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return (m0) AbstractC4134a.e(this.f63838v);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        for (s sVar : this.enabledSampleStreamWrappers) {
            sVar.v(j10, z10);
        }
    }

    public final void w(s1.i iVar, long j10, List list, List list2, Map map) {
        int i10;
        boolean z10;
        boolean z11;
        int size = iVar.f64547e.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iVar.f64547e.size(); i13++) {
            androidx.media3.common.a aVar = ((i.b) iVar.f64547e.get(i13)).f64561b;
            if (aVar.f20551w > 0 || Z.V(aVar.f20539k, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (Z.V(aVar.f20539k, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            i10 = i11;
            z11 = false;
            z10 = true;
        } else if (i12 < size) {
            i10 = size - i12;
            z10 = false;
            z11 = true;
        } else {
            i10 = size;
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[i10];
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i10];
        int[] iArr2 = new int[i10];
        int i14 = 0;
        for (int i15 = 0; i15 < iVar.f64547e.size(); i15++) {
            if ((!z10 || iArr[i15] == 2) && (!z11 || iArr[i15] != 1)) {
                i.b bVar = (i.b) iVar.f64547e.get(i15);
                uriArr[i14] = bVar.f64560a;
                aVarArr[i14] = bVar.f64561b;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = aVarArr[0].f20539k;
        int U10 = Z.U(str, 2);
        int U11 = Z.U(str, 1);
        boolean z12 = (U11 == 1 || (U11 == 0 && iVar.f64549g.isEmpty())) && U10 <= 1 && U11 + U10 > 0;
        s z13 = z("main", (z10 || U11 <= 0) ? 0 : 1, uriArr, aVarArr, iVar.f64552j, iVar.f64553k, map, j10);
        list.add(z13);
        list2.add(iArr2);
        if (this.f63830n && z12) {
            ArrayList arrayList = new ArrayList();
            if (U10 > 0) {
                androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    aVarArr2[i16] = C(aVarArr[i16]);
                }
                arrayList.add(new P("main", aVarArr2));
                if (U11 > 0 && (iVar.f64552j != null || iVar.f64549g.isEmpty())) {
                    arrayList.add(new P("main:audio", A(aVarArr[0], iVar.f64552j, false)));
                }
                List list3 = iVar.f64553k;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new P("main:cc:" + i17, this.f63817a.d((androidx.media3.common.a) list3.get(i17))));
                    }
                }
            } else {
                androidx.media3.common.a[] aVarArr3 = new androidx.media3.common.a[i10];
                for (int i18 = 0; i18 < i10; i18++) {
                    aVarArr3[i18] = A(aVarArr[i18], iVar.f64552j, true);
                }
                arrayList.add(new P("main", aVarArr3));
            }
            P p10 = new P("main:id3", new a.b().j0("ID3").y0("application/id3").P());
            arrayList.add(p10);
            z13.h0((P[]) arrayList.toArray(new P[0]), 0, arrayList.indexOf(p10));
        }
    }

    public final void x(long j10) {
        long j11;
        s1.i iVar = (s1.i) AbstractC4134a.e(this.f63818b.e());
        Map B10 = this.f63832p ? B(iVar.f64555m) : Collections.EMPTY_MAP;
        boolean isEmpty = iVar.f64547e.isEmpty();
        List list = iVar.f64549g;
        List list2 = iVar.f64550h;
        this.f63837u = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (isEmpty) {
            j11 = j10;
        } else {
            w(iVar, j10, arrayList, arrayList2, B10);
            arrayList = arrayList;
            j11 = j10;
        }
        s(j11, list, arrayList, arrayList2, B10);
        this.f63840x = arrayList.size();
        y(j11, list2, arrayList, arrayList2, B10);
        this.sampleStreamWrappers = (s[]) arrayList.toArray(new s[0]);
        this.f63839w = (int[][]) arrayList2.toArray(new int[0][]);
        this.f63837u = this.sampleStreamWrappers.length;
        for (int i10 = 0; i10 < this.f63840x; i10++) {
            this.sampleStreamWrappers[i10].q0(true);
        }
        for (s sVar : this.sampleStreamWrappers) {
            sVar.D();
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    public final void y(long j10, List list, List list2, List list3, Map map) {
        List list4 = list;
        ArrayList arrayList = new ArrayList(list4.size());
        ArrayList arrayList2 = new ArrayList(list4.size());
        ArrayList arrayList3 = new ArrayList(list4.size());
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = 0;
        while (i11 < list4.size()) {
            String str = ((i.a) list4.get(i11)).f64559d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                for (int i12 = i10; i12 < list4.size(); i12++) {
                    if (Objects.equals(str, ((i.a) list4.get(i12)).f64559d)) {
                        i.a aVar = (i.a) list4.get(i12);
                        arrayList3.add(Integer.valueOf(i12));
                        arrayList.add(aVar.f64556a);
                        arrayList2.add(aVar.f64557b);
                    }
                }
                String str2 = "subtitle:" + str;
                androidx.media3.common.a[] aVarArr = (androidx.media3.common.a[]) arrayList2.toArray(new androidx.media3.common.a[i10]);
                s z10 = z(str2, 3, (Uri[]) arrayList.toArray((Uri[]) Z.j(new Uri[i10])), aVarArr, null, AbstractC3445z.t(), map, j10);
                list3.add(com.google.common.primitives.f.o(arrayList3));
                list2.add(z10);
                int length = aVarArr.length;
                androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[length];
                for (int i13 = i10; i13 < length; i13++) {
                    aVarArr2[i13] = this.f63817a.d(aVarArr[i13]);
                }
                i10 = 0;
                z10.h0(new P[]{new P(str2, aVarArr2)}, 0, new int[0]);
            }
            i11++;
            list4 = list;
        }
    }

    public final s z(String str, int i10, Uri[] uriArr, androidx.media3.common.a[] aVarArr, androidx.media3.common.a aVar, List list, Map map, long j10) {
        return new s(str, i10, this.f63834r, new f(this.f63817a, this.f63818b, uriArr, aVarArr, this.f63819c, this.f63820d, this.f63828l, this.f63835s, list, this.f63833q, this.f63821e), map, this.f63826j, j10, aVar, this.f63822f, this.f63823g, this.f63824h, this.f63825i, this.f63831o);
    }
}
