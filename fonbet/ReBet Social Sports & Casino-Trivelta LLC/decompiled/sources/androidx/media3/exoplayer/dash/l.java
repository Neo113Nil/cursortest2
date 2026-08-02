package androidx.media3.exoplayer.dash;

import B1.d;
import B1.f;
import B1.o;
import D1.f;
import D1.k;
import H1.C1174g;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.n;
import androidx.media3.exoplayer.source.C2201b;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2335D;
import com.google.common.collect.B;
import e1.AbstractC4134a;
import e1.U;
import e1.Z;
import e2.s;
import h1.C4418n;
import h1.C4428x;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m1.o1;
import n1.G1;
import p1.C6031a;
import p1.C6032b;
import p1.C6033c;

/* loaded from: classes.dex */
public class l implements androidx.media3.exoplayer.dash.c {

    /* renamed from: a, reason: collision with root package name */
    public final D1.n f21054a;
    private final int[] adaptationSetIndices;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.dash.b f21055b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21056c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4411g f21057d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21058e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21059f;

    /* renamed from: g, reason: collision with root package name */
    public final n.c f21060g;

    /* renamed from: h, reason: collision with root package name */
    public final D1.e f21061h;

    /* renamed from: i, reason: collision with root package name */
    public y f21062i;

    /* renamed from: j, reason: collision with root package name */
    public C6033c f21063j;

    /* renamed from: k, reason: collision with root package name */
    public int f21064k;

    /* renamed from: l, reason: collision with root package name */
    public IOException f21065l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21066m;

    /* renamed from: n, reason: collision with root package name */
    public long f21067n = -9223372036854775807L;
    protected final b[] representationHolders;

    public static final class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4411g.a f21068a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21069b;

        /* renamed from: c, reason: collision with root package name */
        public final f.a f21070c;

        public a(InterfaceC4411g.a aVar) {
            this(aVar, 1);
        }

        @Override // androidx.media3.exoplayer.dash.c.a
        public androidx.media3.common.a d(androidx.media3.common.a aVar) {
            return this.f21070c.d(aVar);
        }

        @Override // androidx.media3.exoplayer.dash.c.a
        public androidx.media3.exoplayer.dash.c e(D1.n nVar, C6033c c6033c, androidx.media3.exoplayer.dash.b bVar, int i10, int[] iArr, y yVar, int i11, long j10, boolean z10, List list, n.c cVar, InterfaceC4403F interfaceC4403F, G1 g12, D1.e eVar) {
            InterfaceC4411g a10 = this.f21068a.a();
            if (interfaceC4403F != null) {
                a10.c(interfaceC4403F);
            }
            return new l(this.f21070c, nVar, c6033c, bVar, i10, iArr, yVar, i11, a10, j10, this.f21069b, z10, list, cVar, g12, eVar);
        }

        @Override // androidx.media3.exoplayer.dash.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f21070c.b(z10);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f21070c.c(i10);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.c.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(s.a aVar) {
            this.f21070c.a(aVar);
            return this;
        }

        public a(InterfaceC4411g.a aVar, int i10) {
            this(new d.b(), aVar, i10);
        }

        public a(f.a aVar, InterfaceC4411g.a aVar2, int i10) {
            this.f21070c = aVar;
            this.f21068a = aVar2;
            this.f21069b = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final B1.f f21071a;

        /* renamed from: b, reason: collision with root package name */
        public final p1.j f21072b;

        /* renamed from: c, reason: collision with root package name */
        public final C6032b f21073c;

        /* renamed from: d, reason: collision with root package name */
        public final i f21074d;

        /* renamed from: e, reason: collision with root package name */
        public final long f21075e;

        /* renamed from: f, reason: collision with root package name */
        public final long f21076f;

        public b(long j10, p1.j jVar, C6032b c6032b, B1.f fVar, long j11, i iVar) {
            this.f21075e = j10;
            this.f21072b = jVar;
            this.f21073c = c6032b;
            this.f21076f = j11;
            this.f21071a = fVar;
            this.f21074d = iVar;
        }

        public b b(long j10, p1.j jVar) {
            long f10;
            long f11;
            i l10 = this.f21072b.l();
            i l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f21073c, this.f21071a, this.f21076f, l10);
            }
            if (!l10.h()) {
                return new b(j10, jVar, this.f21073c, this.f21071a, this.f21076f, l11);
            }
            long g10 = l10.g(j10);
            if (g10 == 0) {
                return new b(j10, jVar, this.f21073c, this.f21071a, this.f21076f, l11);
            }
            AbstractC4134a.i(l11);
            long i10 = l10.i();
            long b10 = l10.b(i10);
            long j11 = g10 + i10;
            long j12 = j11 - 1;
            long b11 = l10.b(j12) + l10.a(j12, j10);
            long i11 = l11.i();
            long b12 = l11.b(i11);
            long j13 = this.f21076f;
            if (b11 == b12) {
                f10 = j11 - i11;
            } else {
                if (b11 < b12) {
                    throw new C2201b();
                }
                if (b12 < b10) {
                    f11 = j13 - (l11.f(b10, j10) - i10);
                    return new b(j10, jVar, this.f21073c, this.f21071a, f11, l11);
                }
                f10 = l10.f(b12, j10) - i11;
            }
            f11 = j13 + f10;
            return new b(j10, jVar, this.f21073c, this.f21071a, f11, l11);
        }

        public b c(i iVar) {
            return new b(this.f21075e, this.f21072b, this.f21073c, this.f21071a, this.f21076f, iVar);
        }

        public b d(C6032b c6032b) {
            return new b(this.f21075e, this.f21072b, c6032b, this.f21071a, this.f21076f, this.f21074d);
        }

        public long e(long j10) {
            return ((i) AbstractC4134a.i(this.f21074d)).c(this.f21075e, j10) + this.f21076f;
        }

        public long f() {
            return ((i) AbstractC4134a.i(this.f21074d)).i() + this.f21076f;
        }

        public long g(long j10) {
            return (e(j10) + ((i) AbstractC4134a.i(this.f21074d)).j(this.f21075e, j10)) - 1;
        }

        public long h() {
            return ((i) AbstractC4134a.i(this.f21074d)).g(this.f21075e);
        }

        public long i(long j10) {
            return k(j10) + ((i) AbstractC4134a.i(this.f21074d)).a(j10 - this.f21076f, this.f21075e);
        }

        public long j(long j10) {
            return ((i) AbstractC4134a.i(this.f21074d)).f(j10, this.f21075e) + this.f21076f;
        }

        public long k(long j10) {
            return ((i) AbstractC4134a.i(this.f21074d)).b(j10 - this.f21076f);
        }

        public p1.i l(long j10) {
            return ((i) AbstractC4134a.i(this.f21074d)).e(j10 - this.f21076f);
        }

        public boolean m(long j10, long j11) {
            return ((i) AbstractC4134a.i(this.f21074d)).h() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    public static final class c extends B1.b {

        /* renamed from: e, reason: collision with root package name */
        public final b f21077e;

        /* renamed from: f, reason: collision with root package name */
        public final long f21078f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f21077e = bVar;
            this.f21078f = j12;
        }

        @Override // B1.n
        public long a() {
            c();
            return this.f21077e.k(d());
        }

        @Override // B1.n
        public long b() {
            c();
            return this.f21077e.i(d());
        }
    }

    public l(f.a aVar, D1.n nVar, C6033c c6033c, androidx.media3.exoplayer.dash.b bVar, int i10, int[] iArr, y yVar, int i11, InterfaceC4411g interfaceC4411g, long j10, int i12, boolean z10, List list, n.c cVar, G1 g12, D1.e eVar) {
        this.f21054a = nVar;
        this.f21063j = c6033c;
        this.f21055b = bVar;
        this.adaptationSetIndices = iArr;
        this.f21062i = yVar;
        int i13 = i11;
        this.f21056c = i13;
        this.f21057d = interfaceC4411g;
        this.f21064k = i10;
        this.f21058e = j10;
        this.f21059f = i12;
        n.c cVar2 = cVar;
        this.f21060g = cVar2;
        this.f21061h = eVar;
        long g10 = c6033c.g(i10);
        ArrayList o10 = o();
        this.representationHolders = new b[yVar.length()];
        int i14 = 0;
        while (i14 < this.representationHolders.length) {
            p1.j jVar = (p1.j) o10.get(yVar.f(i14));
            C6032b j11 = bVar.j(jVar.f62948c);
            b[] bVarArr = this.representationHolders;
            C6032b c6032b = j11 == null ? (C6032b) jVar.f62948c.get(0) : j11;
            B1.f e10 = aVar.e(i13, jVar.f62947b, z10, list, cVar2, g12);
            long j12 = g10;
            int i15 = i14;
            bVarArr[i15] = new b(j12, jVar, c6032b, e10, 0L, jVar.l());
            i14 = i15 + 1;
            i13 = i11;
            g10 = j12;
            cVar2 = cVar;
        }
    }

    @Override // B1.i
    public void a() {
        IOException iOException = this.f21065l;
        if (iOException != null) {
            throw iOException;
        }
        this.f21054a.a();
    }

    @Override // androidx.media3.exoplayer.dash.c
    public void b(y yVar) {
        this.f21062i = yVar;
    }

    @Override // androidx.media3.exoplayer.dash.c
    public void c(C6033c c6033c, int i10) {
        try {
            this.f21063j = c6033c;
            this.f21064k = i10;
            long g10 = c6033c.g(i10);
            ArrayList o10 = o();
            for (int i11 = 0; i11 < this.representationHolders.length; i11++) {
                p1.j jVar = (p1.j) o10.get(this.f21062i.f(i11));
                b[] bVarArr = this.representationHolders;
                bVarArr[i11] = bVarArr[i11].b(g10, jVar);
            }
        } catch (C2201b e10) {
            this.f21065l = e10;
        }
    }

    public final k.a e(y yVar, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = yVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (yVar.b(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = androidx.media3.exoplayer.dash.b.f(list);
        return new k.a(f10, f10 - this.f21055b.g(list), length, i10);
    }

    @Override // B1.i
    public long f(long j10, o1 o1Var) {
        long j11 = j10;
        b[] bVarArr = this.representationHolders;
        int length = bVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            b bVar = bVarArr[i10];
            if (bVar.f21074d != null) {
                long h10 = bVar.h();
                if (h10 != 0) {
                    long j12 = bVar.j(j11);
                    long k10 = bVar.k(j12);
                    return o1Var.a(j11, k10, (k10 >= j11 || (h10 != -1 && j12 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j12 + 1));
                }
            }
            i10++;
            j11 = j10;
        }
        return j10;
    }

    @Override // B1.i
    public boolean g(long j10, B1.e eVar, List list) {
        if (this.f21065l != null) {
            return false;
        }
        return this.f21062i.g(j10, eVar, list);
    }

    @Override // B1.i
    public void h(androidx.media3.exoplayer.k kVar, long j10, List list, B1.g gVar) {
        B1.n[] nVarArr;
        int i10;
        boolean z10;
        int i11;
        l lVar;
        B1.m mVar;
        long j11;
        l lVar2 = this;
        if (lVar2.f21065l != null) {
            return;
        }
        long j12 = kVar.f21352a;
        long j13 = j10 - j12;
        long a12 = Z.a1(lVar2.f21063j.f62900a) + Z.a1(lVar2.f21063j.d(lVar2.f21064k).f62933b) + j10;
        n.c cVar = lVar2.f21060g;
        if (cVar == null || !cVar.i(a12)) {
            long a13 = Z.a1(Z.m0(lVar2.f21058e));
            long n10 = lVar2.n(a13);
            boolean z11 = true;
            B1.m mVar2 = list.isEmpty() ? null : (B1.m) list.get(list.size() - 1);
            int length = lVar2.f21062i.length();
            B1.n[] nVarArr2 = new B1.n[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = lVar2.representationHolders[i12];
                if (bVar.f21074d == null) {
                    nVarArr2[i12] = B1.n.f606a;
                    lVar = lVar2;
                    mVar = mVar2;
                    z10 = z11;
                    i11 = length;
                    nVarArr = nVarArr2;
                    i10 = i12;
                } else {
                    nVarArr = nVarArr2;
                    long e10 = bVar.e(a13);
                    boolean z12 = z11;
                    B1.m mVar3 = mVar2;
                    long g10 = bVar.g(a13);
                    i10 = i12;
                    z10 = z12;
                    i11 = length;
                    long p10 = lVar2.p(bVar, mVar3, j10, e10, g10);
                    lVar = lVar2;
                    mVar = mVar3;
                    if (p10 < e10) {
                        nVarArr[i10] = B1.n.f606a;
                    } else {
                        long j14 = n10;
                        j11 = j14;
                        nVarArr[i10] = new c(lVar.s(i10), p10, g10, j14);
                        i12 = i10 + 1;
                        lVar2 = lVar;
                        length = i11;
                        nVarArr2 = nVarArr;
                        z11 = z10;
                        mVar2 = mVar;
                        n10 = j11;
                    }
                }
                j11 = n10;
                i12 = i10 + 1;
                lVar2 = lVar;
                length = i11;
                nVarArr2 = nVarArr;
                z11 = z10;
                mVar2 = mVar;
                n10 = j11;
            }
            l lVar3 = lVar2;
            B1.m mVar4 = mVar2;
            boolean z13 = z11;
            long j15 = n10;
            lVar3.f21062i.n(j12, j13, lVar3.l(a13, j12), list, nVarArr2);
            int d10 = lVar3.f21062i.d();
            f.C0047f h10 = lVar3.f21061h == null ? null : new f.C0047f(lVar3.f21061h, W9.d.f13160a).n(lVar3.f21062i).e(Math.max(0L, j13)).m(kVar.f21353b).i(lVar3.f21063j.f62903d).g(kVar.b(lVar3.f21067n)).h(list.isEmpty());
            lVar3.f21067n = SystemClock.elapsedRealtime();
            b s10 = lVar3.s(d10);
            B1.f fVar = s10.f21071a;
            if (fVar != null) {
                p1.j jVar = s10.f21072b;
                p1.i n11 = fVar.e() == null ? jVar.n() : null;
                p1.i m10 = s10.f21074d == null ? jVar.m() : null;
                if (n11 != null || m10 != null) {
                    gVar.f565a = lVar3.q(s10, lVar3.f21057d, lVar3.f21062i.r(), lVar3.f21062i.s(), lVar3.f21062i.j(), n11, m10, h10);
                    return;
                }
            }
            long j16 = s10.f21075e;
            C6033c c6033c = lVar3.f21063j;
            boolean z14 = (c6033c.f62903d && lVar3.f21064k == c6033c.e() + (-1)) ? z13 : false;
            boolean z15 = (z14 && j16 == -9223372036854775807L) ? false : z13;
            if (s10.h() == 0) {
                gVar.f566b = z15;
                return;
            }
            long e11 = s10.e(a13);
            long g11 = s10.g(a13);
            if (z14) {
                long i13 = s10.i(g11);
                z15 &= i13 + (i13 - s10.k(g11)) >= j16 ? z13 : false;
            }
            boolean z16 = z15;
            long p11 = lVar3.p(s10, mVar4, j10, e11, g11);
            if (p11 < e11) {
                lVar3.f21065l = new C2201b();
                return;
            }
            if (p11 > g11 || (lVar3.f21066m && p11 >= g11)) {
                gVar.f566b = z16;
                return;
            }
            if (z16 && s10.k(p11) >= j16) {
                gVar.f566b = z13;
                return;
            }
            int min = (int) Math.min(lVar3.f21059f, (g11 - p11) + 1);
            if (j16 != -9223372036854775807L) {
                while (min > 1 && s10.k((min + p11) - 1) >= j16) {
                    min--;
                }
            }
            gVar.f565a = lVar3.r(s10, lVar3.f21057d, lVar3.f21056c, lVar3.f21062i.r(), lVar3.f21062i.s(), lVar3.f21062i.j(), p11, min, list.isEmpty() ? j10 : -9223372036854775807L, j15, h10);
        }
    }

    @Override // B1.i
    public boolean i(B1.e eVar, boolean z10, k.c cVar, D1.k kVar) {
        k.b a10;
        if (!z10) {
            return false;
        }
        n.c cVar2 = this.f21060g;
        if (cVar2 != null && cVar2.k(eVar)) {
            return true;
        }
        if (!this.f21063j.f62903d && (eVar instanceof B1.m)) {
            IOException iOException = cVar.f2452c;
            if ((iOException instanceof C4428x) && ((C4428x) iOException).f47621d == 404) {
                b bVar = this.representationHolders[this.f21062i.c(eVar.f559d)];
                long h10 = bVar.h();
                if (h10 != -1 && h10 != 0) {
                    if (((B1.m) eVar).g() > (bVar.f() + h10) - 1) {
                        this.f21066m = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.representationHolders[this.f21062i.c(eVar.f559d)];
        C6032b j10 = this.f21055b.j(bVar2.f21072b.f62948c);
        if (j10 != null && !bVar2.f21073c.equals(j10)) {
            return true;
        }
        k.a e10 = e(this.f21062i, bVar2.f21072b.f62948c);
        if ((e10.a(2) || e10.a(1)) && (a10 = kVar.a(e10, cVar)) != null && e10.a(a10.f2448a)) {
            int i10 = a10.f2448a;
            if (i10 == 2) {
                y yVar = this.f21062i;
                return yVar.h(yVar.c(eVar.f559d), a10.f2449b);
            }
            if (i10 == 1) {
                this.f21055b.e(bVar2.f21073c, a10.f2449b);
                return true;
            }
        }
        return false;
    }

    @Override // B1.i
    public int j(long j10, List list) {
        return (this.f21065l != null || this.f21062i.length() < 2) ? list.size() : this.f21062i.p(j10, list);
    }

    @Override // B1.i
    public void k(B1.e eVar) {
        C1174g b10;
        if (eVar instanceof B1.l) {
            int c10 = this.f21062i.c(((B1.l) eVar).f559d);
            b bVar = this.representationHolders[c10];
            if (bVar.f21074d == null && (b10 = ((B1.f) AbstractC4134a.i(bVar.f21071a)).b()) != null) {
                this.representationHolders[c10] = bVar.c(new k(b10, bVar.f21072b.f62949d));
            }
        }
        n.c cVar = this.f21060g;
        if (cVar != null) {
            cVar.j(eVar);
        }
    }

    public final long l(long j10, long j11) {
        if (!this.f21063j.f62903d || this.representationHolders[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j10), this.representationHolders[0].i(this.representationHolders[0].g(j10))) - j11);
    }

    public final Pair m(long j10, p1.i iVar, b bVar) {
        long j11 = j10 + 1;
        if (j11 >= bVar.h()) {
            return null;
        }
        p1.i l10 = bVar.l(j11);
        String a10 = U.a(iVar.b(bVar.f21073c.f62896a), l10.b(bVar.f21073c.f62896a));
        String str = l10.f62942a + "-";
        if (l10.f62943b != -1) {
            str = str + (l10.f62942a + l10.f62943b);
        }
        return new Pair(a10, str);
    }

    public final long n(long j10) {
        C6033c c6033c = this.f21063j;
        long j11 = c6033c.f62900a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - Z.a1(j11 + c6033c.d(this.f21064k).f62933b);
    }

    public final ArrayList o() {
        List list = this.f21063j.d(this.f21064k).f62934c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.adaptationSetIndices) {
            arrayList.addAll(((C6031a) list.get(i10)).f62892c);
        }
        return arrayList;
    }

    public final long p(b bVar, B1.m mVar, long j10, long j11, long j12) {
        return mVar != null ? mVar.g() : Z.p(bVar.j(j10), j11, j12);
    }

    public B1.e q(b bVar, InterfaceC4411g interfaceC4411g, androidx.media3.common.a aVar, int i10, Object obj, p1.i iVar, p1.i iVar2, f.C0047f c0047f) {
        p1.j jVar = bVar.f21072b;
        if (iVar != null) {
            p1.i a10 = iVar.a(iVar2, bVar.f21073c.f62896a);
            if (a10 != null) {
                iVar = a10;
            }
        } else {
            iVar = (p1.i) AbstractC4134a.e(iVar2);
        }
        C4418n a11 = j.a(jVar, bVar.f21073c.f62896a, iVar, 0, B.m());
        if (c0047f != null) {
            a11 = c0047f.l(com.google.android.material.shape.i.f35755A).a().a(a11);
        }
        return new B1.l(interfaceC4411g, a11, aVar, i10, obj, bVar.f21071a);
    }

    public B1.e r(b bVar, InterfaceC4411g interfaceC4411g, int i10, androidx.media3.common.a aVar, int i11, Object obj, long j10, int i12, long j11, long j12, f.C0047f c0047f) {
        p1.j jVar = bVar.f21072b;
        long k10 = bVar.k(j10);
        p1.i l10 = bVar.l(j10);
        if (bVar.f21071a == null) {
            long i13 = bVar.i(j10);
            C4418n a10 = j.a(jVar, bVar.f21073c.f62896a, l10, bVar.m(j10, j12) ? 0 : 8, B.m());
            if (c0047f != null) {
                c0047f.f(i13 - k10);
                Pair m10 = m(j10, l10, bVar);
                if (m10 != null) {
                    c0047f.j((String) m10.first).k((String) m10.second);
                }
                a10 = c0047f.a().a(a10);
            }
            return new o(interfaceC4411g, a10, aVar, i11, obj, k10, i13, j10, i10, aVar);
        }
        int i14 = 1;
        int i15 = 1;
        while (i14 < i12) {
            p1.i a11 = l10.a(bVar.l(i14 + j10), bVar.f21073c.f62896a);
            if (a11 == null) {
                break;
            }
            i15++;
            i14++;
            l10 = a11;
        }
        long j13 = (i15 + j10) - 1;
        int i16 = i15;
        long i17 = bVar.i(j13);
        long j14 = bVar.f21075e;
        if (j14 == -9223372036854775807L || j14 > i17) {
            j14 = -9223372036854775807L;
        }
        C4418n a12 = j.a(jVar, bVar.f21073c.f62896a, l10, bVar.m(j13, j12) ? 0 : 8, B.m());
        if (c0047f != null) {
            c0047f.f(i17 - k10);
            Pair m11 = m(j10, l10, bVar);
            if (m11 != null) {
                c0047f.j((String) m11.first).k((String) m11.second);
            }
            a12 = c0047f.a().a(a12);
        }
        C4418n c4418n = a12;
        long j15 = -jVar.f62949d;
        if (AbstractC2335D.q(aVar.f20543o)) {
            j15 += k10;
        }
        return new B1.j(interfaceC4411g, c4418n, aVar, i11, obj, k10, i17, j11, j14, j10, i16, j15, bVar.f21071a);
    }

    @Override // B1.i
    public void release() {
        for (b bVar : this.representationHolders) {
            B1.f fVar = bVar.f21071a;
            if (fVar != null) {
                fVar.release();
            }
        }
    }

    public final b s(int i10) {
        b bVar = this.representationHolders[i10];
        C6032b j10 = this.f21055b.j(bVar.f21072b.f62948c);
        if (j10 == null || j10.equals(bVar.f21073c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.representationHolders[i10] = d10;
        return d10;
    }
}
