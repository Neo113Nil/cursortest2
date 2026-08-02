package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.InterfaceC4152t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import m1.R0;
import m1.h1;
import n1.InterfaceC5605a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5605a f21374c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4152t f21375d;

    /* renamed from: e, reason: collision with root package name */
    public final l.a f21376e;

    /* renamed from: f, reason: collision with root package name */
    public long f21377f;

    /* renamed from: g, reason: collision with root package name */
    public int f21378g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21379h;

    /* renamed from: i, reason: collision with root package name */
    public ExoPlayer.c f21380i;

    /* renamed from: j, reason: collision with root package name */
    public l f21381j;

    /* renamed from: k, reason: collision with root package name */
    public l f21382k;

    /* renamed from: l, reason: collision with root package name */
    public l f21383l;

    /* renamed from: m, reason: collision with root package name */
    public l f21384m;

    /* renamed from: n, reason: collision with root package name */
    public l f21385n;

    /* renamed from: o, reason: collision with root package name */
    public int f21386o;

    /* renamed from: p, reason: collision with root package name */
    public Object f21387p;

    /* renamed from: q, reason: collision with root package name */
    public long f21388q;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2346O.b f21372a = new AbstractC2346O.b();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2346O.c f21373b = new AbstractC2346O.c();

    /* renamed from: r, reason: collision with root package name */
    public List f21389r = new ArrayList();

    public m(InterfaceC5605a interfaceC5605a, InterfaceC4152t interfaceC4152t, l.a aVar, ExoPlayer.c cVar) {
        this.f21374c = interfaceC5605a;
        this.f21375d = interfaceC4152t;
        this.f21376e = aVar;
        this.f21380i = cVar;
    }

    public static boolean H(AbstractC2346O.b bVar) {
        int c10 = bVar.c();
        if (c10 != 0 && ((c10 != 1 || !bVar.r(0)) && bVar.s(bVar.p()))) {
            long j10 = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f24357d == 0) {
                    return true;
                }
                int i10 = c10 - (bVar.r(c10 + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    j10 += bVar.i(i11);
                }
                if (bVar.f24357d <= j10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static D.b P(AbstractC2346O abstractC2346O, Object obj, long j10, long j11, AbstractC2346O.c cVar, AbstractC2346O.b bVar) {
        abstractC2346O.h(obj, bVar);
        abstractC2346O.n(bVar.f24356c, cVar);
        for (int b10 = abstractC2346O.b(obj); H(bVar) && b10 <= cVar.f24391o; b10++) {
            abstractC2346O.g(b10, bVar, true);
            obj = AbstractC4134a.e(bVar.f24355b);
        }
        abstractC2346O.h(obj, bVar);
        int e10 = bVar.e(j10);
        return e10 == -1 ? new D.b(obj, j11, bVar.d(j10)) : new D.b(obj, e10, bVar.l(e10), j11);
    }

    public static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public final boolean A(Object obj, AbstractC2346O abstractC2346O) {
        int c10 = abstractC2346O.h(obj, this.f21372a).c();
        int p10 = this.f21372a.p();
        if (c10 <= 0 || !this.f21372a.s(p10)) {
            return false;
        }
        return c10 > 1 || this.f21372a.f(p10) != Long.MIN_VALUE;
    }

    public void B(AbstractC2346O abstractC2346O) {
        l lVar;
        if (this.f21380i.f20891a == -9223372036854775807L || (lVar = this.f21384m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair i10 = i(abstractC2346O, lVar.f21364g.f56123a.f21516a, 0L);
        if (i10 != null && !abstractC2346O.n(abstractC2346O.h(i10.first, this.f21372a).f24356c, this.f21373b).f()) {
            long S10 = S(i10.first);
            if (S10 == -1) {
                S10 = this.f21377f;
                this.f21377f = 1 + S10;
            }
            R0 r10 = r(abstractC2346O, i10.first, ((Long) i10.second).longValue(), S10);
            l O10 = O(r10);
            if (O10 == null) {
                O10 = this.f21376e.a(r10, (lVar.m() + lVar.f21364g.f56127e) - r10.f56124b);
            }
            arrayList.add(O10);
        }
        L(arrayList);
    }

    public final boolean C(D.b bVar) {
        return !bVar.b() && bVar.f21520e == -1;
    }

    public final boolean D(AbstractC2346O abstractC2346O, D.b bVar, boolean z10) {
        int b10 = abstractC2346O.b(bVar.f21516a);
        return !abstractC2346O.n(abstractC2346O.f(b10, this.f21372a).f24356c, this.f21373b).f24385i && abstractC2346O.r(b10, this.f21372a, this.f21373b, this.f21378g, this.f21379h) && z10;
    }

    public final boolean E(AbstractC2346O abstractC2346O, D.b bVar) {
        if (C(bVar)) {
            return abstractC2346O.n(abstractC2346O.h(bVar.f21516a, this.f21372a).f24356c, this.f21373b).f24391o == abstractC2346O.b(bVar.f21516a);
        }
        return false;
    }

    public boolean F(C c10) {
        l lVar = this.f21384m;
        return lVar != null && lVar.f21358a == c10;
    }

    public boolean G(C c10) {
        l lVar = this.f21385n;
        return lVar != null && lVar.f21358a == c10;
    }

    public void I() {
        l lVar = this.f21385n;
        if (lVar == null || lVar.t()) {
            this.f21385n = null;
            for (int i10 = 0; i10 < this.f21389r.size(); i10++) {
                l lVar2 = (l) this.f21389r.get(i10);
                if (!lVar2.t()) {
                    this.f21385n = lVar2;
                    return;
                }
            }
        }
    }

    public final void J() {
        final AbstractC3445z.a k10 = AbstractC3445z.k();
        for (l lVar = this.f21381j; lVar != null; lVar = lVar.k()) {
            k10.a(lVar.f21364g.f56123a);
        }
        l lVar2 = this.f21382k;
        final D.b bVar = lVar2 == null ? null : lVar2.f21364g.f56123a;
        this.f21375d.j(new Runnable() { // from class: m1.S0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.exoplayer.m.this.f21374c.E(k10.m(), bVar);
            }
        });
    }

    public void K(long j10) {
        l lVar = this.f21384m;
        if (lVar != null) {
            lVar.w(j10);
        }
    }

    public final void L(List list) {
        for (int i10 = 0; i10 < this.f21389r.size(); i10++) {
            ((l) this.f21389r.get(i10)).x();
        }
        this.f21389r = list;
        this.f21385n = null;
        I();
    }

    public void M() {
        if (this.f21389r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(l lVar) {
        AbstractC4134a.i(lVar);
        int i10 = 0;
        if (lVar.equals(this.f21384m)) {
            return 0;
        }
        this.f21384m = lVar;
        while (lVar.k() != null) {
            lVar = (l) AbstractC4134a.e(lVar.k());
            if (lVar == this.f21382k) {
                l lVar2 = this.f21381j;
                this.f21382k = lVar2;
                this.f21383l = lVar2;
                i10 = 3;
            }
            if (lVar == this.f21383l) {
                this.f21383l = this.f21382k;
                i10 |= 2;
            }
            lVar.x();
            this.f21386o--;
        }
        ((l) AbstractC4134a.e(this.f21384m)).A(null);
        J();
        return i10;
    }

    public final l O(R0 r02) {
        for (int i10 = 0; i10 < this.f21389r.size(); i10++) {
            if (((l) this.f21389r.get(i10)).d(r02)) {
                return (l) this.f21389r.remove(i10);
            }
        }
        return null;
    }

    public D.b Q(AbstractC2346O abstractC2346O, Object obj, long j10) {
        long R10 = R(abstractC2346O, obj);
        abstractC2346O.h(obj, this.f21372a);
        abstractC2346O.n(this.f21372a.f24356c, this.f21373b);
        boolean z10 = false;
        for (int b10 = abstractC2346O.b(obj); b10 >= this.f21373b.f24390n; b10--) {
            abstractC2346O.g(b10, this.f21372a, true);
            boolean z11 = this.f21372a.c() > 0;
            z10 |= z11;
            AbstractC2346O.b bVar = this.f21372a;
            if (bVar.e(bVar.f24357d) != -1) {
                obj = AbstractC4134a.e(this.f21372a.f24355b);
            }
            if (z10 && (!z11 || this.f21372a.f24357d != 0)) {
                break;
            }
        }
        return P(abstractC2346O, obj, j10, R10, this.f21373b, this.f21372a);
    }

    public final long R(AbstractC2346O abstractC2346O, Object obj) {
        int b10;
        int i10 = abstractC2346O.h(obj, this.f21372a).f24356c;
        Object obj2 = this.f21387p;
        if (obj2 != null && (b10 = abstractC2346O.b(obj2)) != -1 && abstractC2346O.f(b10, this.f21372a).f24356c == i10) {
            return this.f21388q;
        }
        for (l lVar = this.f21381j; lVar != null; lVar = lVar.k()) {
            if (lVar.f21359b.equals(obj)) {
                return lVar.f21364g.f56123a.f21519d;
            }
        }
        for (l lVar2 = this.f21381j; lVar2 != null; lVar2 = lVar2.k()) {
            int b11 = abstractC2346O.b(lVar2.f21359b);
            if (b11 != -1 && abstractC2346O.f(b11, this.f21372a).f24356c == i10) {
                return lVar2.f21364g.f56123a.f21519d;
            }
        }
        long S10 = S(obj);
        if (S10 != -1) {
            return S10;
        }
        long j10 = this.f21377f;
        this.f21377f = 1 + j10;
        if (this.f21381j == null) {
            this.f21387p = obj;
            this.f21388q = j10;
        }
        return j10;
    }

    public final long S(Object obj) {
        for (int i10 = 0; i10 < this.f21389r.size(); i10++) {
            l lVar = (l) this.f21389r.get(i10);
            if (lVar.f21359b.equals(obj)) {
                return lVar.f21364g.f56123a.f21519d;
            }
        }
        return -1L;
    }

    public boolean T() {
        l lVar = this.f21384m;
        if (lVar != null) {
            return !lVar.f21364g.f56132j && lVar.s() && this.f21384m.f21364g.f56127e != -9223372036854775807L && this.f21386o < 100;
        }
        return true;
    }

    public final int U(AbstractC2346O abstractC2346O) {
        AbstractC2346O abstractC2346O2;
        l lVar = this.f21381j;
        if (lVar == null) {
            return 0;
        }
        int b10 = abstractC2346O.b(lVar.f21359b);
        while (true) {
            abstractC2346O2 = abstractC2346O;
            b10 = abstractC2346O2.d(b10, this.f21372a, this.f21373b, this.f21378g, this.f21379h);
            while (((l) AbstractC4134a.e(lVar)).k() != null && !lVar.f21364g.f56130h) {
                lVar = lVar.k();
            }
            l k10 = lVar.k();
            if (b10 == -1 || k10 == null || abstractC2346O2.b(k10.f21359b) != b10) {
                break;
            }
            lVar = k10;
            abstractC2346O = abstractC2346O2;
        }
        int N10 = N(lVar);
        lVar.f21364g = z(abstractC2346O2, lVar.f21364g);
        return N10;
    }

    public void V(AbstractC2346O abstractC2346O, ExoPlayer.c cVar) {
        this.f21380i = cVar;
        B(abstractC2346O);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int W(AbstractC2346O abstractC2346O, long j10, long j11, long j12) {
        R0 r02;
        boolean z10;
        l lVar = this.f21381j;
        l lVar2 = null;
        while (lVar != null) {
            R0 r03 = lVar.f21364g;
            if (lVar2 == null) {
                r02 = z(abstractC2346O, r03);
            } else {
                R0 l10 = l(abstractC2346O, lVar2, j10);
                if (l10 == null || !f(r03, l10)) {
                    return N(lVar2);
                }
                r02 = l10;
            }
            lVar.f21364g = r02.a(r03.f56125c);
            if (r03.f56127e != r02.f56127e) {
                lVar.E();
                long j13 = r02.f56127e;
                long D10 = j13 == -9223372036854775807L ? LongCompanionObject.MAX_VALUE : lVar.D(j13);
                boolean z11 = lVar == this.f21382k && !lVar.f21364g.f56129g && (j11 == Long.MIN_VALUE || j11 >= D10);
                boolean z12 = lVar == this.f21383l && (j12 == Long.MIN_VALUE || j12 >= D10);
                int N10 = N(lVar);
                if (N10 != 0) {
                    return N10;
                }
                long j14 = r03.f56127e;
                if (j14 == -9223372036854775807L && r03.f56126d == Long.MIN_VALUE) {
                    long j15 = r02.f56126d;
                    if (j15 != -9223372036854775807L && j15 != Long.MIN_VALUE) {
                        z10 = true;
                        int i10 = (z11 || (j14 == -9223372036854775807L && !z10)) ? 0 : 1;
                        return !z12 ? i10 | 2 : i10;
                    }
                }
                z10 = false;
                if (z11) {
                }
                if (!z12) {
                }
            } else {
                lVar2 = lVar;
                lVar = lVar.k();
            }
        }
        return 0;
    }

    public int X(AbstractC2346O abstractC2346O, int i10) {
        this.f21378g = i10;
        return U(abstractC2346O);
    }

    public int Y(AbstractC2346O abstractC2346O, boolean z10) {
        this.f21379h = z10;
        return U(abstractC2346O);
    }

    public l b() {
        l lVar = this.f21381j;
        if (lVar == null) {
            return null;
        }
        if (lVar == this.f21382k) {
            this.f21382k = lVar.k();
        }
        l lVar2 = this.f21381j;
        if (lVar2 == this.f21383l) {
            this.f21383l = lVar2.k();
        }
        this.f21381j.x();
        int i10 = this.f21386o - 1;
        this.f21386o = i10;
        if (i10 == 0) {
            this.f21384m = null;
            l lVar3 = this.f21381j;
            this.f21387p = lVar3.f21359b;
            this.f21388q = lVar3.f21364g.f56123a.f21519d;
        }
        this.f21381j = this.f21381j.k();
        J();
        return this.f21381j;
    }

    public l c() {
        this.f21383l = ((l) AbstractC4134a.i(this.f21383l)).k();
        J();
        return (l) AbstractC4134a.i(this.f21383l);
    }

    public l d() {
        l lVar = this.f21383l;
        l lVar2 = this.f21382k;
        if (lVar == lVar2) {
            this.f21383l = ((l) AbstractC4134a.i(lVar2)).k();
        }
        this.f21382k = ((l) AbstractC4134a.i(this.f21382k)).k();
        J();
        return (l) AbstractC4134a.i(this.f21382k);
    }

    public final boolean f(R0 r02, R0 r03) {
        return r02.f56124b == r03.f56124b && r02.f56123a.equals(r03.f56123a);
    }

    public void g() {
        if (this.f21386o == 0) {
            return;
        }
        l lVar = (l) AbstractC4134a.i(this.f21381j);
        this.f21387p = lVar.f21359b;
        this.f21388q = lVar.f21364g.f56123a.f21519d;
        while (lVar != null) {
            lVar.x();
            lVar = lVar.k();
        }
        this.f21381j = null;
        this.f21384m = null;
        this.f21382k = null;
        this.f21383l = null;
        this.f21386o = 0;
        J();
    }

    public l h(R0 r02) {
        l lVar = this.f21384m;
        long m10 = lVar == null ? 1000000000000L : (lVar.m() + this.f21384m.f21364g.f56127e) - r02.f56124b;
        l O10 = O(r02);
        if (O10 == null) {
            O10 = this.f21376e.a(r02, m10);
        } else {
            O10.f21364g = r02;
            O10.B(m10);
        }
        l lVar2 = this.f21384m;
        if (lVar2 != null) {
            lVar2.A(O10);
        } else {
            this.f21381j = O10;
            this.f21382k = O10;
            this.f21383l = O10;
        }
        this.f21387p = null;
        this.f21384m = O10;
        this.f21386o++;
        J();
        return O10;
    }

    public final Pair i(AbstractC2346O abstractC2346O, Object obj, long j10) {
        int e10 = abstractC2346O.e(abstractC2346O.h(obj, this.f21372a).f24356c, this.f21378g, this.f21379h);
        if (e10 != -1) {
            return abstractC2346O.k(this.f21373b, this.f21372a, e10, -9223372036854775807L, j10);
        }
        return null;
    }

    public final R0 j(h1 h1Var) {
        return o(h1Var.f56218a, h1Var.f56219b, h1Var.f56220c, h1Var.f56236s);
    }

    public final R0 k(AbstractC2346O abstractC2346O, l lVar, long j10) {
        Object obj;
        long j11;
        R0 r02 = lVar.f21364g;
        int d10 = abstractC2346O.d(abstractC2346O.b(r02.f56123a.f21516a), this.f21372a, this.f21373b, this.f21378g, this.f21379h);
        if (d10 == -1) {
            return null;
        }
        int i10 = abstractC2346O.g(d10, this.f21372a, true).f24356c;
        Object e10 = AbstractC4134a.e(this.f21372a.f24355b);
        long j12 = r02.f56123a.f21519d;
        long j13 = 0;
        if (abstractC2346O.n(i10, this.f21373b).f24390n == d10) {
            Pair k10 = abstractC2346O.k(this.f21373b, this.f21372a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (k10 == null) {
                return null;
            }
            Object obj2 = k10.first;
            long longValue = ((Long) k10.second).longValue();
            l k11 = lVar.k();
            if (k11 == null || !k11.f21359b.equals(obj2)) {
                long S10 = S(obj2);
                if (S10 == -1) {
                    S10 = this.f21377f;
                    this.f21377f = 1 + S10;
                }
                j12 = S10;
            } else {
                j12 = k11.f21364g.f56123a.f21519d;
            }
            obj = obj2;
            j11 = longValue;
            j13 = -9223372036854775807L;
        } else {
            obj = e10;
            j11 = 0;
        }
        D.b P10 = P(abstractC2346O, obj, j11, j12, this.f21373b, this.f21372a);
        if (j13 != -9223372036854775807L && r02.f56125c != -9223372036854775807L) {
            boolean A10 = A(r02.f56123a.f21516a, abstractC2346O);
            if (P10.b() && A10) {
                j13 = r02.f56125c;
            } else if (A10) {
                j11 = r02.f56125c;
            }
        }
        return o(abstractC2346O, P10, j13, j11);
    }

    public final R0 l(AbstractC2346O abstractC2346O, l lVar, long j10) {
        R0 r02 = lVar.f21364g;
        long m10 = (lVar.m() + r02.f56127e) - j10;
        return r02.f56130h ? k(abstractC2346O, lVar, m10) : m(abstractC2346O, lVar, m10);
    }

    public final R0 m(AbstractC2346O abstractC2346O, l lVar, long j10) {
        R0 r02 = lVar.f21364g;
        D.b bVar = r02.f56123a;
        abstractC2346O.h(bVar.f21516a, this.f21372a);
        boolean z10 = r02.f56129g;
        if (!bVar.b()) {
            int i10 = bVar.f21520e;
            if (i10 != -1 && this.f21372a.r(i10)) {
                return k(abstractC2346O, lVar, j10);
            }
            int l10 = this.f21372a.l(bVar.f21520e);
            boolean z11 = this.f21372a.s(bVar.f21520e) && this.f21372a.h(bVar.f21520e, l10) == 3;
            if (l10 == this.f21372a.a(bVar.f21520e) || z11) {
                return q(abstractC2346O, bVar.f21516a, s(abstractC2346O, bVar.f21516a, bVar.f21520e), r02.f56127e, bVar.f21519d, false);
            }
            return p(abstractC2346O, bVar.f21516a, bVar.f21520e, l10, r02.f56127e, bVar.f21519d, z10);
        }
        int i11 = bVar.f21517b;
        int a10 = this.f21372a.a(i11);
        if (a10 == -1) {
            return null;
        }
        int m10 = this.f21372a.m(i11, bVar.f21518c);
        if (m10 < a10) {
            return p(abstractC2346O, bVar.f21516a, i11, m10, r02.f56125c, bVar.f21519d, z10);
        }
        long j11 = r02.f56125c;
        if (j11 == -9223372036854775807L) {
            AbstractC2346O.c cVar = this.f21373b;
            AbstractC2346O.b bVar2 = this.f21372a;
            Pair k10 = abstractC2346O.k(cVar, bVar2, bVar2.f24356c, -9223372036854775807L, Math.max(0L, j10));
            if (k10 == null) {
                return null;
            }
            j11 = ((Long) k10.second).longValue();
        }
        return q(abstractC2346O, bVar.f21516a, Math.max(s(abstractC2346O, bVar.f21516a, bVar.f21517b), j11), r02.f56125c, bVar.f21519d, z10);
    }

    public l n() {
        return this.f21384m;
    }

    public final R0 o(AbstractC2346O abstractC2346O, D.b bVar, long j10, long j11) {
        abstractC2346O.h(bVar.f21516a, this.f21372a);
        return bVar.b() ? p(abstractC2346O, bVar.f21516a, bVar.f21517b, bVar.f21518c, j10, bVar.f21519d, false) : q(abstractC2346O, bVar.f21516a, j11, j10, bVar.f21519d, false);
    }

    public final R0 p(AbstractC2346O abstractC2346O, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        D.b bVar = new D.b(obj, i10, i11, j11);
        long b10 = abstractC2346O.h(bVar.f21516a, this.f21372a).b(bVar.f21517b, bVar.f21518c);
        long g10 = i11 == this.f21372a.l(i10) ? this.f21372a.g() : 0L;
        boolean s10 = this.f21372a.s(bVar.f21517b);
        if (b10 != -9223372036854775807L && g10 >= b10) {
            g10 = Math.max(0L, b10 - 1);
        }
        return new R0(bVar, g10, j10, -9223372036854775807L, b10, z10, s10, false, false, false);
    }

    public final R0 q(AbstractC2346O abstractC2346O, Object obj, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        abstractC2346O.h(obj, this.f21372a);
        int d10 = this.f21372a.d(j16);
        int i10 = 1;
        if (d10 == -1) {
            if (this.f21372a.c() > 0) {
                AbstractC2346O.b bVar = this.f21372a;
                if (bVar.s(bVar.p())) {
                    z11 = true;
                }
            }
            z11 = false;
        } else {
            if (this.f21372a.s(d10)) {
                long f10 = this.f21372a.f(d10);
                AbstractC2346O.b bVar2 = this.f21372a;
                if (f10 == bVar2.f24357d && bVar2.q(d10)) {
                    z11 = true;
                    d10 = -1;
                }
            }
            z11 = false;
        }
        D.b bVar3 = new D.b(obj, j12, d10);
        boolean C10 = C(bVar3);
        boolean E10 = E(abstractC2346O, bVar3);
        boolean D10 = D(abstractC2346O, bVar3, C10);
        boolean z12 = (d10 == -1 || !this.f21372a.s(d10) || this.f21372a.r(d10)) ? false : true;
        boolean z13 = d10 != -1 && this.f21372a.r(d10) && this.f21372a.s(d10);
        if (d10 != -1 && !z13) {
            j14 = this.f21372a.f(d10);
        } else {
            if (!z11) {
                j13 = -9223372036854775807L;
                j15 = (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) ? this.f21372a.f24357d : j13;
                if (j15 != -9223372036854775807L && j16 >= j15) {
                    if (!D10 && z11) {
                        i10 = 0;
                    }
                    j16 = Math.max(0L, j15 - i10);
                }
                return new R0(bVar3, j16, j11, j13, j15, z10, z12, C10, E10, D10);
            }
            j14 = this.f21372a.f24357d;
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
        }
        if (j15 != -9223372036854775807L) {
            if (!D10) {
                i10 = 0;
            }
            j16 = Math.max(0L, j15 - i10);
        }
        return new R0(bVar3, j16, j11, j13, j15, z10, z12, C10, E10, D10);
    }

    public final R0 r(AbstractC2346O abstractC2346O, Object obj, long j10, long j11) {
        D.b P10 = P(abstractC2346O, obj, j10, j11, this.f21373b, this.f21372a);
        return P10.b() ? p(abstractC2346O, P10.f21516a, P10.f21517b, P10.f21518c, j10, P10.f21519d, false) : q(abstractC2346O, P10.f21516a, j10, -9223372036854775807L, P10.f21519d, false);
    }

    public final long s(AbstractC2346O abstractC2346O, Object obj, int i10) {
        abstractC2346O.h(obj, this.f21372a);
        long f10 = this.f21372a.f(i10);
        return f10 == Long.MIN_VALUE ? this.f21372a.f24357d : f10 + this.f21372a.i(i10);
    }

    public R0 t(long j10, h1 h1Var) {
        l lVar = this.f21384m;
        return lVar == null ? j(h1Var) : l(h1Var.f56218a, lVar, j10);
    }

    public l u() {
        return this.f21381j;
    }

    public l v(C c10) {
        for (int i10 = 0; i10 < this.f21389r.size(); i10++) {
            l lVar = (l) this.f21389r.get(i10);
            if (lVar.f21358a == c10) {
                return lVar;
            }
        }
        return null;
    }

    public l w() {
        return this.f21385n;
    }

    public l x() {
        return this.f21383l;
    }

    public l y() {
        return this.f21382k;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R0 z(AbstractC2346O abstractC2346O, R0 r02) {
        long k10;
        long j10;
        boolean z10;
        int i10;
        D.b bVar = r02.f56123a;
        boolean C10 = C(bVar);
        boolean E10 = E(abstractC2346O, bVar);
        boolean D10 = D(abstractC2346O, bVar, C10);
        abstractC2346O.h(r02.f56123a.f21516a, this.f21372a);
        long f10 = (bVar.b() || (i10 = bVar.f21520e) == -1) ? -9223372036854775807L : this.f21372a.f(i10);
        if (bVar.b()) {
            k10 = this.f21372a.b(bVar.f21517b, bVar.f21518c);
        } else {
            if (f10 != -9223372036854775807L && f10 != Long.MIN_VALUE) {
                j10 = f10;
                if (bVar.b()) {
                    int i11 = bVar.f21520e;
                    z10 = i11 != -1 && this.f21372a.s(i11);
                } else {
                    z10 = this.f21372a.s(bVar.f21517b);
                }
                return new R0(bVar, r02.f56124b, r02.f56125c, f10, j10, r02.f56128f, z10, C10, E10, D10);
            }
            k10 = this.f21372a.k();
        }
        j10 = k10;
        if (bVar.b()) {
        }
        return new R0(bVar, r02.f56124b, r02.f56125c, f10, j10, r02.f56128f, z10, C10, E10, D10);
    }
}
