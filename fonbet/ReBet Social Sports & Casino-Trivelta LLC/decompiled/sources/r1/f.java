package r1;

import D1.f;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.source.C2201b;
import androidx.media3.exoplayer.trackselection.AbstractC2227c;
import androidx.media3.exoplayer.trackselection.y;
import b1.P;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.I;
import e1.AbstractC4134a;
import e1.U;
import e1.Z;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import i3.C4527h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m1.o1;
import n1.G1;
import s1.f;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final h f63754a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4411g f63755b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4411g f63756c;

    /* renamed from: d, reason: collision with root package name */
    public final v f63757d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.m f63758e;

    /* renamed from: f, reason: collision with root package name */
    public final P f63759f;

    /* renamed from: g, reason: collision with root package name */
    public final List f63760g;

    /* renamed from: i, reason: collision with root package name */
    public final G1 f63762i;

    /* renamed from: j, reason: collision with root package name */
    public final D1.e f63763j;

    /* renamed from: k, reason: collision with root package name */
    public final long f63764k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f63765l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f63766m;

    /* renamed from: n, reason: collision with root package name */
    public Uri f63767n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f63768o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f63769p;
    private final androidx.media3.common.a[] playlistFormats;
    private final Uri[] playlistUrls;

    /* renamed from: q, reason: collision with root package name */
    public y f63770q;

    /* renamed from: s, reason: collision with root package name */
    public long f63772s = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public final r1.e f63761h = new r1.e(4);
    private byte[] scratchSpace = Z.EMPTY_BYTE_ARRAY;

    /* renamed from: r, reason: collision with root package name */
    public long f63771r = -9223372036854775807L;

    public static final class a extends B1.k {
        private byte[] result;

        public a(InterfaceC4411g interfaceC4411g, C4418n c4418n, androidx.media3.common.a aVar, int i10, Object obj, byte[] bArr) {
            super(interfaceC4411g, c4418n, 3, aVar, i10, obj, bArr);
        }

        @Override // B1.k
        public void g(byte[] bArr, int i10) {
            this.result = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.result;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public B1.e f63773a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f63774b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f63775c;

        public b() {
            a();
        }

        public void a() {
            this.f63773a = null;
            this.f63774b = false;
            this.f63775c = null;
        }
    }

    public static final class c extends B1.b {

        /* renamed from: e, reason: collision with root package name */
        public final List f63776e;

        /* renamed from: f, reason: collision with root package name */
        public final long f63777f;

        /* renamed from: g, reason: collision with root package name */
        public final String f63778g;

        public c(String str, long j10, List list) {
            super(0L, list.size() - 1);
            this.f63778g = str;
            this.f63777f = j10;
            this.f63776e = list;
        }

        @Override // B1.n
        public long a() {
            c();
            return this.f63777f + ((f.g) this.f63776e.get((int) d())).f64533e;
        }

        @Override // B1.n
        public long b() {
            c();
            f.g gVar = (f.g) this.f63776e.get((int) d());
            return this.f63777f + gVar.f64533e + gVar.f64531c;
        }
    }

    public static final class d extends AbstractC2227c {

        /* renamed from: f, reason: collision with root package name */
        public int f63779f;

        public d(P p10, int[] iArr) {
            super(p10, iArr);
            this.f63779f = c(p10.a(iArr[0]));
        }

        @Override // androidx.media3.exoplayer.trackselection.y
        public int d() {
            return this.f63779f;
        }

        @Override // androidx.media3.exoplayer.trackselection.y
        public Object j() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.y
        public void n(long j10, long j11, long j12, List list, B1.n[] nVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.f63779f, elapsedRealtime)) {
                for (int i10 = this.f21943b - 1; i10 >= 0; i10--) {
                    if (!b(i10, elapsedRealtime)) {
                        this.f63779f = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // androidx.media3.exoplayer.trackselection.y
        public int s() {
            return 0;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final f.g f63780a;

        /* renamed from: b, reason: collision with root package name */
        public final long f63781b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63782c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f63783d;

        public e(f.g gVar, long j10, int i10) {
            this.f63780a = gVar;
            this.f63781b = j10;
            this.f63782c = i10;
            this.f63783d = (gVar instanceof f.d) && ((f.d) gVar).f64523m;
        }
    }

    public f(h hVar, s1.m mVar, Uri[] uriArr, androidx.media3.common.a[] aVarArr, g gVar, InterfaceC4403F interfaceC4403F, v vVar, long j10, List list, G1 g12, D1.e eVar) {
        this.f63754a = hVar;
        this.f63758e = mVar;
        this.playlistUrls = uriArr;
        this.playlistFormats = aVarArr;
        this.f63757d = vVar;
        this.f63764k = j10;
        this.f63760g = list;
        this.f63762i = g12;
        this.f63763j = eVar;
        InterfaceC4411g a10 = gVar.a(1);
        this.f63755b = a10;
        if (interfaceC4403F != null) {
            a10.c(interfaceC4403F);
        }
        this.f63756c = gVar.a(3);
        this.f63759f = new P(aVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((aVarArr[i10].f20534f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f63770q = new d(this.f63759f, com.google.common.primitives.f.o(arrayList));
    }

    public static boolean A(boolean z10, s1.f fVar, long j10, int i10, j jVar, long j11, long j12) {
        if (!z10 || jVar == null) {
            return false;
        }
        if (j10 < fVar.f64471k) {
            return true;
        }
        e h10 = h(fVar, j10, i10);
        return h10 != null && j11 + h10.f63780a.f64533e < j12;
    }

    public static Uri e(s1.f fVar, f.g gVar) {
        String str;
        if (gVar == null || (str = gVar.f64535g) == null) {
            return null;
        }
        return U.g(fVar.f64566a, str);
    }

    public static e h(s1.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f64471k);
        if (i11 == fVar.f64478r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < fVar.f64479s.size()) {
                return new e((f.g) fVar.f64479s.get(i10), j10, i10);
            }
            return null;
        }
        f.C0896f c0896f = (f.C0896f) fVar.f64478r.get(i11);
        if (i10 == -1) {
            return new e(c0896f, j10, -1);
        }
        if (i10 < c0896f.f64528m.size()) {
            return new e((f.g) c0896f.f64528m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < fVar.f64478r.size()) {
            return new e((f.g) fVar.f64478r.get(i12), j10 + 1, -1);
        }
        if (fVar.f64479s.isEmpty()) {
            return null;
        }
        return new e((f.g) fVar.f64479s.get(0), j10 + 1, 0);
    }

    public static List k(s1.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f64471k);
        if (i11 < 0 || fVar.f64478r.size() < i11) {
            return AbstractC3445z.t();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < fVar.f64478r.size()) {
            if (i10 != -1) {
                f.C0896f c0896f = (f.C0896f) fVar.f64478r.get(i11);
                if (i10 == 0) {
                    arrayList.add(c0896f);
                } else if (i10 < c0896f.f64528m.size()) {
                    List list = c0896f.f64528m;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List list2 = fVar.f64478r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (fVar.f64474n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < fVar.f64479s.size()) {
                List list3 = fVar.f64479s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean o(e eVar, s1.f fVar) {
        f.g gVar = eVar.f63780a;
        if (!(gVar instanceof f.d)) {
            return fVar.f64568c;
        }
        if (((f.d) gVar).f64522l) {
            return true;
        }
        return eVar.f63782c == 0 && fVar.f64568c;
    }

    public final void B(s1.f fVar) {
        this.f63771r = fVar.f64475o ? -9223372036854775807L : fVar.e() - this.f63758e.d();
    }

    public B1.n[] a(j jVar, long j10) {
        int b10 = jVar == null ? -1 : this.f63759f.b(jVar.f559d);
        int length = this.f63770q.length();
        B1.n[] nVarArr = new B1.n[length];
        for (int i10 = 0; i10 < length; i10++) {
            int f10 = this.f63770q.f(i10);
            Uri uri = this.playlistUrls[f10];
            if (this.f63758e.g(uri)) {
                s1.f q10 = this.f63758e.q(uri, false);
                AbstractC4134a.e(q10);
                long d10 = q10.f64468h - this.f63758e.d();
                Pair g10 = g(jVar, f10 != b10, q10, d10, j10);
                nVarArr[i10] = new c(q10.f64566a, d10, k(q10, ((Long) g10.first).longValue(), ((Integer) g10.second).intValue()));
            } else {
                nVarArr[i10] = B1.n.f606a;
            }
        }
        return nVarArr;
    }

    public final void b() {
        this.f63758e.a(this.playlistUrls[this.f63770q.q()]);
    }

    public long c(long j10, o1 o1Var) {
        int d10 = this.f63770q.d();
        Uri[] uriArr = this.playlistUrls;
        s1.f q10 = (d10 >= uriArr.length || d10 == -1) ? null : this.f63758e.q(uriArr[this.f63770q.q()], true);
        if (q10 == null || q10.f64478r.isEmpty()) {
            return j10;
        }
        long d11 = q10.f64468h - this.f63758e.d();
        long j11 = j10 - d11;
        int f10 = Z.f(q10.f64478r, Long.valueOf(j11), true, true);
        long j12 = ((f.C0896f) q10.f64478r.get(f10)).f64533e;
        return o1Var.a(j11, j12, (!q10.f64568c || f10 == q10.f64478r.size() - 1) ? j12 : ((f.C0896f) q10.f64478r.get(f10 + 1)).f64533e) + d11;
    }

    public int d(j jVar) {
        if (jVar.f63805o == -1) {
            return 1;
        }
        s1.f fVar = (s1.f) AbstractC4134a.e(this.f63758e.q(this.playlistUrls[this.f63759f.b(jVar.f559d)], false));
        int i10 = (int) (jVar.f605j - fVar.f64471k);
        if (i10 < 0) {
            return 1;
        }
        List list = i10 < fVar.f64478r.size() ? ((f.C0896f) fVar.f64478r.get(i10)).f64528m : fVar.f64479s;
        if (jVar.f63805o >= list.size()) {
            return 2;
        }
        f.d dVar = (f.d) list.get(jVar.f63805o);
        if (dVar.f64523m) {
            return 0;
        }
        return Objects.equals(Uri.parse(U.f(fVar.f64566a, dVar.f64529a)), jVar.f557b.f47554a) ? 1 : 2;
    }

    public void f(androidx.media3.exoplayer.k kVar, long j10, long j11, List list, boolean z10, b bVar) {
        boolean z11;
        int i10;
        long j12;
        long j13;
        boolean z12;
        j jVar = list.isEmpty() ? null : (j) I.f(list);
        int b10 = jVar == null ? -1 : this.f63759f.b(jVar.f559d);
        long j14 = kVar.f21352a;
        long j15 = j10 - j14;
        long w10 = w(j14);
        if (jVar != null && !this.f63769p) {
            long d10 = jVar.d();
            j15 = Math.max(0L, j15 - d10);
            if (w10 != -9223372036854775807L) {
                w10 = Math.max(0L, w10 - d10);
            }
        }
        long j16 = j15;
        this.f63770q.n(j14, j16, w10, list, a(jVar, j10));
        int q10 = this.f63770q.q();
        boolean z13 = b10 != q10;
        Uri uri = this.playlistUrls[q10];
        if (!this.f63758e.g(uri)) {
            bVar.f63775c = uri;
            this.f63768o = uri;
            return;
        }
        s1.f q11 = this.f63758e.q(uri, true);
        AbstractC4134a.e(q11);
        this.f63769p = q11.f64568c;
        B(q11);
        long d11 = q11.f64468h - this.f63758e.d();
        Uri uri2 = uri;
        Pair g10 = g(jVar, z13, q11, d11, j10);
        long longValue = ((Long) g10.first).longValue();
        int intValue = ((Integer) g10.second).intValue();
        int i11 = b10;
        s1.f fVar = q11;
        j jVar2 = jVar;
        long j17 = d11;
        int i12 = q10;
        long j18 = j16;
        long j19 = longValue;
        if (A(z13, fVar, j19, intValue, jVar2, j17, j11)) {
            uri2 = this.playlistUrls[i11];
            s1.f q12 = this.f63758e.q(uri2, true);
            AbstractC4134a.e(q12);
            long d12 = q12.f64468h - this.f63758e.d();
            i10 = i11;
            Pair g11 = g(jVar2, false, q12, d12, j10);
            long longValue2 = ((Long) g11.first).longValue();
            intValue = ((Integer) g11.second).intValue();
            fVar = q12;
            i12 = i10;
            z11 = true;
            j19 = longValue2;
            j18 = j18;
            j17 = d12;
        } else {
            z11 = true;
            i10 = i11;
        }
        if (i12 != i10 && i10 != -1) {
            this.f63758e.a(this.playlistUrls[i10]);
        }
        if (j19 < fVar.f64471k) {
            this.f63766m = new C2201b();
            return;
        }
        e h10 = h(fVar, j19, intValue);
        if (h10 != null) {
            j12 = j18;
            j13 = 1;
        } else if (!fVar.f64475o) {
            bVar.f63775c = uri2;
            this.f63768o = uri2;
            return;
        } else if (z10 || fVar.f64478r.isEmpty()) {
            bVar.f63774b = z11;
            return;
        } else {
            j13 = 1;
            j12 = j18;
            h10 = new e((f.g) I.f(fVar.f64478r), (fVar.f64471k + fVar.f64478r.size()) - 1, -1);
        }
        f.C0047f c0047f = null;
        this.f63768o = null;
        if (this.f63763j != null) {
            z12 = z11;
            c0047f = new f.C0047f(this.f63763j, C4527h.f48087o).n(this.f63770q).e(Math.max(0L, j12)).m(kVar.f21353b).i(fVar.f64475o ^ z12).g(kVar.b(this.f63772s)).h(list.isEmpty()).f(h10.f63780a.f64531c);
            int i13 = h10.f63782c;
            e h11 = h(fVar, i13 == -1 ? h10.f63781b + j13 : h10.f63781b, i13 == -1 ? -1 : i13 + 1);
            if (h11 != null) {
                c0047f.j(U.a(U.g(fVar.f64566a, h10.f63780a.f64529a), U.g(fVar.f64566a, h11.f63780a.f64529a)));
                String str = h11.f63780a.f64537i + "-";
                if (h11.f63780a.f64538j != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    f.g gVar = h11.f63780a;
                    sb2.append(gVar.f64537i + gVar.f64538j);
                    str = sb2.toString();
                }
                c0047f.k(str);
            }
        } else {
            z12 = z11;
        }
        f.C0047f c0047f2 = c0047f;
        this.f63772s = SystemClock.elapsedRealtime();
        Uri e10 = e(fVar, h10.f63780a.f64530b);
        B1.e p10 = p(e10, i12, z12, c0047f2);
        bVar.f63773a = p10;
        if (p10 == null) {
            Uri e11 = e(fVar, h10.f63780a);
            B1.e p11 = p(e11, i12, false, c0047f2);
            bVar.f63773a = p11;
            if (p11 == null) {
                boolean o10 = o(h10, fVar);
                int i14 = i12;
                e eVar = h10;
                Uri uri3 = uri2;
                long j20 = j17;
                boolean y10 = j.y(jVar2, j10, uri3, o10, eVar, j20);
                if (y10 && eVar.f63783d) {
                    return;
                }
                bVar.f63773a = j.k(this.f63754a, this.f63755b, this.playlistFormats[i14], j20, fVar, eVar, uri3, this.f63760g, this.f63770q.s(), this.f63770q.j(), this.f63765l, this.f63757d, this.f63764k, jVar2, this.f63761h.a(e11), this.f63761h.a(e10), y10, o10, this.f63762i, c0047f2);
            }
        }
    }

    public final Pair g(j jVar, boolean z10, s1.f fVar, long j10, long j11) {
        if (jVar != null && !z10) {
            if (!jVar.h()) {
                return new Pair(Long.valueOf(jVar.f605j), Integer.valueOf(jVar.f63805o));
            }
            Long valueOf = Long.valueOf(jVar.f63805o == -1 ? jVar.g() : jVar.f605j);
            int i10 = jVar.f63805o;
            return new Pair(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = fVar.f64481u + j10;
        if (jVar != null && !this.f63769p) {
            j11 = jVar.f562g;
        }
        if (!fVar.f64475o && j11 >= j12) {
            return new Pair(Long.valueOf(fVar.f64471k + fVar.f64478r.size()), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int f10 = Z.f(fVar.f64478r, Long.valueOf(j13), true, !this.f63758e.m() || jVar == null);
        long j14 = f10 + fVar.f64471k;
        if (f10 >= 0) {
            f.C0896f c0896f = (f.C0896f) fVar.f64478r.get(f10);
            List list = j13 < c0896f.f64533e + c0896f.f64531c ? c0896f.f64528m : fVar.f64479s;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                f.d dVar = (f.d) list.get(i11);
                if (j13 >= dVar.f64533e + dVar.f64531c) {
                    i11++;
                } else if (dVar.f64522l) {
                    j14 += list == fVar.f64479s ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(r1));
    }

    public int i(long j10, List list) {
        return (this.f63766m != null || this.f63770q.length() < 2) ? list.size() : this.f63770q.p(j10, list);
    }

    public long j(j jVar) {
        AbstractC4134a.g(jVar.f63805o != -1);
        s1.f fVar = (s1.f) AbstractC4134a.e(this.f63758e.q(this.playlistUrls[this.f63759f.b(jVar.f559d)], false));
        int i10 = (int) (jVar.f605j - fVar.f64471k);
        if (i10 < 0) {
            return 0L;
        }
        return ((f.d) (i10 < fVar.f64478r.size() ? ((f.C0896f) fVar.f64478r.get(i10)).f64528m : fVar.f64479s).get(jVar.f63805o)).f64531c;
    }

    public P l() {
        return this.f63759f;
    }

    public y m() {
        return this.f63770q;
    }

    public boolean n() {
        return this.f63769p;
    }

    public final B1.e p(Uri uri, int i10, boolean z10, f.C0047f c0047f) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f63761h.c(uri);
        if (c10 != null) {
            this.f63761h.b(uri, c10);
            return null;
        }
        C4418n a10 = new C4418n.b().i(uri).b(1).a();
        if (c0047f != null) {
            if (z10) {
                c0047f.l(com.google.android.material.shape.i.f35755A);
            }
            a10 = c0047f.a().a(a10);
        }
        return new a(this.f63756c, a10, this.playlistFormats[i10], this.f63770q.s(), this.f63770q.j(), this.scratchSpace);
    }

    public boolean q(B1.e eVar, long j10) {
        y yVar = this.f63770q;
        return yVar.h(yVar.l(this.f63759f.b(eVar.f559d)), j10);
    }

    public void r() {
        IOException iOException = this.f63766m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f63767n;
        if (uri == null || !uri.equals(this.f63768o)) {
            return;
        }
        this.f63758e.c(this.f63767n);
    }

    public boolean s(Uri uri) {
        return Z.r(this.playlistUrls, uri);
    }

    public void t(B1.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.scratchSpace = aVar.h();
            this.f63761h.b(aVar.f557b.f47554a, (byte[]) AbstractC4134a.e(aVar.j()));
        }
    }

    public boolean u(Uri uri, long j10) {
        int l10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.playlistUrls;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (l10 = this.f63770q.l(i10)) == -1) {
            return true;
        }
        this.f63767n = uri;
        return j10 != -9223372036854775807L && this.f63770q.h(l10, j10) && this.f63758e.n(uri, j10);
    }

    public void v() {
        b();
        this.f63766m = null;
    }

    public final long w(long j10) {
        long j11 = this.f63771r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    public void x(boolean z10) {
        this.f63765l = z10;
    }

    public void y(y yVar) {
        b();
        this.f63770q = yVar;
    }

    public boolean z(long j10, B1.e eVar, List list) {
        if (this.f63766m != null) {
            return false;
        }
        return this.f63770q.g(j10, eVar, list);
    }
}
