package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.C2224z;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.e0;
import b1.AbstractC2346O;
import b1.z;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4152t;
import e1.Z;
import h1.InterfaceC4403F;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m1.AbstractC5492a;
import m1.T0;
import m1.j1;
import n1.G1;
import n1.InterfaceC5605a;
import q1.t;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final G1 f21390a;

    /* renamed from: e, reason: collision with root package name */
    public final d f21394e;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC5605a f21397h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC4152t f21398i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21400k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC4403F f21401l;

    /* renamed from: j, reason: collision with root package name */
    public e0 f21399j = new e0.a(0);

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f21392c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f21393d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List f21391b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f21395f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Set f21396g = new HashSet();

    public final class a implements L, t {

        /* renamed from: a, reason: collision with root package name */
        public final c f21402a;

        public a(c cVar) {
            this.f21402a = cVar;
        }

        public final Pair J(int i10, D.b bVar) {
            D.b bVar2 = null;
            if (bVar != null) {
                D.b n10 = n.n(this.f21402a, bVar);
                if (n10 == null) {
                    return null;
                }
                bVar2 = n10;
            }
            return Pair.create(Integer.valueOf(n.s(this.f21402a, i10)), bVar2);
        }

        @Override // q1.t
        public void O(int i10, D.b bVar) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.X0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.O(((Integer) r1.first).intValue(), (D.b) J10.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void R(int i10, D.b bVar, final C2223y c2223y, final B b10, final int i11) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.R(((Integer) r1.first).intValue(), (D.b) J10.second, c2223y, b10, i11);
                    }
                });
            }
        }

        @Override // q1.t
        public void T(int i10, D.b bVar, final int i11) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.T(((Integer) r1.first).intValue(), (D.b) J10.second, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void U(int i10, D.b bVar, final C2223y c2223y, final B b10, final IOException iOException, final boolean z10) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.U(((Integer) r1.first).intValue(), (D.b) J10.second, c2223y, b10, iOException, z10);
                    }
                });
            }
        }

        @Override // q1.t
        public void Y(int i10, D.b bVar) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.Y(((Integer) r1.first).intValue(), (D.b) J10.second);
                    }
                });
            }
        }

        @Override // q1.t
        public void Z(int i10, D.b bVar, final Exception exc) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.Z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.Z(((Integer) r1.first).intValue(), (D.b) J10.second, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void a0(int i10, D.b bVar, final C2223y c2223y, final B b10) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.Y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.a0(((Integer) r1.first).intValue(), (D.b) J10.second, c2223y, b10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void h0(int i10, D.b bVar, final C2223y c2223y, final B b10) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.h0(((Integer) r1.first).intValue(), (D.b) J10.second, c2223y, b10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void j0(int i10, D.b bVar, final B b10) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.j0(((Integer) r1.first).intValue(), (D.b) J10.second, b10);
                    }
                });
            }
        }

        @Override // q1.t
        public void k0(int i10, D.b bVar) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.W0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.k0(((Integer) r1.first).intValue(), (D.b) J10.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.L
        public void m(int i10, D.b bVar, final B b10) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.V0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.m(((Integer) r1.first).intValue(), (D.b) AbstractC4134a.e((D.b) J10.second), b10);
                    }
                });
            }
        }

        @Override // q1.t
        public void p0(int i10, D.b bVar) {
            final Pair J10 = J(i10, bVar);
            if (J10 != null) {
                n.this.f21398i.j(new Runnable() { // from class: m1.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.n.this.f21397h.p0(((Integer) r1.first).intValue(), (D.b) J10.second);
                    }
                });
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final D f21404a;

        /* renamed from: b, reason: collision with root package name */
        public final D.c f21405b;

        /* renamed from: c, reason: collision with root package name */
        public final a f21406c;

        public b(D d10, D.c cVar, a aVar) {
            this.f21404a = d10;
            this.f21405b = cVar;
            this.f21406c = aVar;
        }
    }

    public static final class c implements T0 {

        /* renamed from: a, reason: collision with root package name */
        public final A f21407a;

        /* renamed from: d, reason: collision with root package name */
        public int f21410d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f21411e;

        /* renamed from: c, reason: collision with root package name */
        public final List f21409c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f21408b = new Object();

        public c(D d10, boolean z10) {
            this.f21407a = new A(d10, z10);
        }

        @Override // m1.T0
        public Object a() {
            return this.f21408b;
        }

        @Override // m1.T0
        public AbstractC2346O b() {
            return this.f21407a.Z();
        }

        public void c(int i10) {
            this.f21410d = i10;
            this.f21411e = false;
            this.f21409c.clear();
        }
    }

    public interface d {
        void d();
    }

    public n(d dVar, InterfaceC5605a interfaceC5605a, InterfaceC4152t interfaceC4152t, G1 g12) {
        this.f21390a = g12;
        this.f21394e = dVar;
        this.f21397h = interfaceC5605a;
        this.f21398i = interfaceC4152t;
    }

    public static Object m(Object obj) {
        return AbstractC5492a.v(obj);
    }

    public static D.b n(c cVar, D.b bVar) {
        for (int i10 = 0; i10 < cVar.f21409c.size(); i10++) {
            if (((D.b) cVar.f21409c.get(i10)).f21519d == bVar.f21519d) {
                return bVar.a(p(cVar, bVar.f21516a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return AbstractC5492a.w(obj);
    }

    public static Object p(c cVar, Object obj) {
        return AbstractC5492a.y(cVar.f21408b, obj);
    }

    public static int s(c cVar, int i10) {
        return i10 + cVar.f21410d;
    }

    public final void A(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f21391b.remove(i12);
            this.f21393d.remove(cVar.f21408b);
            g(i12, -cVar.f21407a.Z().p());
            cVar.f21411e = true;
            if (this.f21400k) {
                u(cVar);
            }
        }
    }

    public AbstractC2346O B(List list, e0 e0Var) {
        A(0, this.f21391b.size());
        return f(this.f21391b.size(), list, e0Var);
    }

    public AbstractC2346O C(e0 e0Var) {
        int r10 = r();
        if (e0Var.getLength() != r10) {
            e0Var = e0Var.e().g(0, r10);
        }
        this.f21399j = e0Var;
        return i();
    }

    public AbstractC2346O D(int i10, int i11, List list) {
        AbstractC4134a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        AbstractC4134a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f21391b.get(i12)).f21407a.n((z) list.get(i12 - i10));
        }
        return i();
    }

    public AbstractC2346O f(int i10, List list, e0 e0Var) {
        if (!list.isEmpty()) {
            this.f21399j = e0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f21391b.get(i11 - 1);
                    cVar.c(cVar2.f21410d + cVar2.f21407a.Z().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f21407a.Z().p());
                this.f21391b.add(i11, cVar);
                this.f21393d.put(cVar.f21408b, cVar);
                if (this.f21400k) {
                    w(cVar);
                    if (this.f21392c.isEmpty()) {
                        this.f21396g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i10, int i11) {
        while (i10 < this.f21391b.size()) {
            ((c) this.f21391b.get(i10)).f21410d += i11;
            i10++;
        }
    }

    public C h(D.b bVar, D1.b bVar2, long j10) {
        Object o10 = o(bVar.f21516a);
        D.b a10 = bVar.a(m(bVar.f21516a));
        c cVar = (c) AbstractC4134a.e((c) this.f21393d.get(o10));
        l(cVar);
        cVar.f21409c.add(a10);
        C2224z c10 = cVar.f21407a.c(a10, bVar2, j10);
        this.f21392c.put(c10, cVar);
        k();
        return c10;
    }

    public AbstractC2346O i() {
        if (this.f21391b.isEmpty()) {
            return AbstractC2346O.f24345a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21391b.size(); i11++) {
            c cVar = (c) this.f21391b.get(i11);
            cVar.f21410d = i10;
            i10 += cVar.f21407a.Z().p();
        }
        return new j1(this.f21391b, this.f21399j);
    }

    public final void j(c cVar) {
        b bVar = (b) this.f21395f.get(cVar);
        if (bVar != null) {
            bVar.f21404a.m(bVar.f21405b);
        }
    }

    public final void k() {
        Iterator it = this.f21396g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f21409c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.f21396g.add(cVar);
        b bVar = (b) this.f21395f.get(cVar);
        if (bVar != null) {
            bVar.f21404a.g(bVar.f21405b);
        }
    }

    public e0 q() {
        return this.f21399j;
    }

    public int r() {
        return this.f21391b.size();
    }

    public boolean t() {
        return this.f21400k;
    }

    public final void u(c cVar) {
        if (cVar.f21411e && cVar.f21409c.isEmpty()) {
            b bVar = (b) AbstractC4134a.e((b) this.f21395f.remove(cVar));
            bVar.f21404a.k(bVar.f21405b);
            bVar.f21404a.b(bVar.f21406c);
            bVar.f21404a.t(bVar.f21406c);
            this.f21396g.remove(cVar);
        }
    }

    public void v(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.g(!this.f21400k);
        this.f21401l = interfaceC4403F;
        for (int i10 = 0; i10 < this.f21391b.size(); i10++) {
            c cVar = (c) this.f21391b.get(i10);
            w(cVar);
            this.f21396g.add(cVar);
        }
        this.f21400k = true;
    }

    public final void w(c cVar) {
        A a10 = cVar.f21407a;
        D.c cVar2 = new D.c() { // from class: m1.U0
            @Override // androidx.media3.exoplayer.source.D.c
            public final void a(androidx.media3.exoplayer.source.D d10, AbstractC2346O abstractC2346O) {
                androidx.media3.exoplayer.n.this.f21394e.d();
            }
        };
        a aVar = new a(cVar);
        this.f21395f.put(cVar, new b(a10, cVar2, aVar));
        a10.a(Z.B(), aVar);
        a10.u(Z.B(), aVar);
        a10.p(cVar2, this.f21401l, this.f21390a);
    }

    public void x() {
        for (b bVar : this.f21395f.values()) {
            try {
                bVar.f21404a.k(bVar.f21405b);
            } catch (RuntimeException e10) {
                AbstractC4156x.e("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f21404a.b(bVar.f21406c);
            bVar.f21404a.t(bVar.f21406c);
        }
        this.f21395f.clear();
        this.f21396g.clear();
        this.f21400k = false;
    }

    public void y(C c10) {
        c cVar = (c) AbstractC4134a.e((c) this.f21392c.remove(c10));
        cVar.f21407a.f(c10);
        cVar.f21409c.remove(((C2224z) c10).f21895a);
        if (!this.f21392c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public AbstractC2346O z(int i10, int i11, e0 e0Var) {
        AbstractC4134a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f21399j = e0Var;
        A(i10, i11);
        return i();
    }
}
