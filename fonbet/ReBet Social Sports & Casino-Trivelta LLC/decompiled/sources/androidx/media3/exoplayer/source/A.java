package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import b1.C2348b;
import e1.AbstractC4134a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class A extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21496m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC2346O.c f21497n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC2346O.b f21498o;

    /* renamed from: p, reason: collision with root package name */
    public a f21499p;

    /* renamed from: q, reason: collision with root package name */
    public C2224z f21500q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21501r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21502s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21503t;

    public static final class a extends AbstractC2221w {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f21504h = new Object();

        /* renamed from: f, reason: collision with root package name */
        public final Object f21505f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f21506g;

        public a(AbstractC2346O abstractC2346O, Object obj, Object obj2) {
            super(abstractC2346O);
            this.f21505f = obj;
            this.f21506g = obj2;
        }

        public static a u(b1.z zVar) {
            return new a(new b(zVar), AbstractC2346O.c.f24367q, f21504h);
        }

        public static a v(AbstractC2346O abstractC2346O, Object obj, Object obj2) {
            return new a(abstractC2346O, obj, obj2);
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public int b(Object obj) {
            Object obj2;
            AbstractC2346O abstractC2346O = this.f21882e;
            if (f21504h.equals(obj) && (obj2 = this.f21506g) != null) {
                obj = obj2;
            }
            return abstractC2346O.b(obj);
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
            this.f21882e.g(i10, bVar, z10);
            if (Objects.equals(bVar.f24355b, this.f21506g) && z10) {
                bVar.f24355b = f21504h;
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public Object m(int i10) {
            Object m10 = this.f21882e.m(i10);
            return Objects.equals(m10, this.f21506g) ? f21504h : m10;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
            this.f21882e.o(i10, cVar, j10);
            if (Objects.equals(cVar.f24377a, this.f21505f)) {
                cVar.f24377a = AbstractC2346O.c.f24367q;
            }
            return cVar;
        }

        public a t(AbstractC2346O abstractC2346O) {
            return new a(abstractC2346O, this.f21505f, this.f21506g);
        }
    }

    public static final class b extends AbstractC2346O {

        /* renamed from: e, reason: collision with root package name */
        public final b1.z f21507e;

        public b(b1.z zVar) {
            this.f21507e = zVar;
        }

        @Override // b1.AbstractC2346O
        public int b(Object obj) {
            return obj == a.f21504h ? 0 : -1;
        }

        @Override // b1.AbstractC2346O
        public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
            bVar.u(z10 ? 0 : null, z10 ? a.f21504h : null, 0, -9223372036854775807L, 0L, C2348b.f24539f, true);
            return bVar;
        }

        @Override // b1.AbstractC2346O
        public int i() {
            return 1;
        }

        @Override // b1.AbstractC2346O
        public Object m(int i10) {
            return a.f21504h;
        }

        @Override // b1.AbstractC2346O
        public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
            cVar.g(AbstractC2346O.c.f24367q, this.f21507e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f24387k = true;
            return cVar;
        }

        @Override // b1.AbstractC2346O
        public int p() {
            return 1;
        }
    }

    public A(D d10, boolean z10) {
        super(d10);
        this.f21496m = z10 && d10.r();
        this.f21497n = new AbstractC2346O.c();
        this.f21498o = new AbstractC2346O.b();
        AbstractC2346O s10 = d10.s();
        if (s10 == null) {
            this.f21499p = a.u(d10.d());
        } else {
            this.f21499p = a.v(s10, null, null);
            this.f21503t = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h, androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        this.f21502s = false;
        this.f21501r = false;
        super.F();
    }

    @Override // androidx.media3.exoplayer.source.o0
    public D.b M(D.b bVar) {
        return bVar.a(X(bVar.f21516a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    @Override // androidx.media3.exoplayer.source.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void S(AbstractC2346O abstractC2346O) {
        long j10;
        C2224z c2224z;
        D.b a10;
        if (this.f21502s) {
            this.f21499p = this.f21499p.t(abstractC2346O);
            C2224z c2224z2 = this.f21500q;
            if (c2224z2 != null) {
                a0(c2224z2.o());
            }
        } else if (abstractC2346O.q()) {
            this.f21499p = this.f21503t ? this.f21499p.t(abstractC2346O) : a.v(abstractC2346O, AbstractC2346O.c.f24367q, a.f21504h);
        } else {
            abstractC2346O.n(0, this.f21497n);
            long c10 = this.f21497n.c();
            Object obj = this.f21497n.f24377a;
            C2224z c2224z3 = this.f21500q;
            if (c2224z3 != null) {
                long p10 = c2224z3.p();
                this.f21499p.h(this.f21500q.f21895a.f21516a, this.f21498o);
                long o10 = this.f21498o.o() + p10;
                if (o10 != this.f21499p.n(0, this.f21497n).c()) {
                    j10 = o10;
                    Pair j11 = abstractC2346O.j(this.f21497n, this.f21498o, 0, j10);
                    Object obj2 = j11.first;
                    long longValue = ((Long) j11.second).longValue();
                    this.f21499p = !this.f21503t ? this.f21499p.t(abstractC2346O) : a.v(abstractC2346O, obj, obj2);
                    c2224z = this.f21500q;
                    if (c2224z != null && a0(longValue)) {
                        D.b bVar = c2224z.f21895a;
                        a10 = bVar.a(Y(bVar.f21516a));
                        this.f21503t = true;
                        this.f21502s = true;
                        E(this.f21499p);
                        if (a10 != null) {
                            ((C2224z) AbstractC4134a.e(this.f21500q)).a(a10);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = c10;
            Pair j112 = abstractC2346O.j(this.f21497n, this.f21498o, 0, j10);
            Object obj22 = j112.first;
            long longValue2 = ((Long) j112.second).longValue();
            this.f21499p = !this.f21503t ? this.f21499p.t(abstractC2346O) : a.v(abstractC2346O, obj, obj22);
            c2224z = this.f21500q;
            if (c2224z != null) {
                D.b bVar2 = c2224z.f21895a;
                a10 = bVar2.a(Y(bVar2.f21516a));
                this.f21503t = true;
                this.f21502s = true;
                E(this.f21499p);
                if (a10 != null) {
                }
            }
        }
        a10 = null;
        this.f21503t = true;
        this.f21502s = true;
        E(this.f21499p);
        if (a10 != null) {
        }
    }

    @Override // androidx.media3.exoplayer.source.o0
    public void V() {
        if (this.f21496m) {
            return;
        }
        this.f21501r = true;
        U();
    }

    @Override // androidx.media3.exoplayer.source.D
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C2224z c(D.b bVar, D1.b bVar2, long j10) {
        C2224z c2224z = new C2224z(bVar, bVar2, j10);
        c2224z.y(this.f21842k);
        if (this.f21502s) {
            c2224z.a(bVar.a(Y(bVar.f21516a)));
            return c2224z;
        }
        this.f21500q = c2224z;
        if (!this.f21501r) {
            this.f21501r = true;
            U();
        }
        return c2224z;
    }

    public final Object X(Object obj) {
        return (this.f21499p.f21506g == null || !this.f21499p.f21506g.equals(obj)) ? obj : a.f21504h;
    }

    public final Object Y(Object obj) {
        return (this.f21499p.f21506g == null || !obj.equals(a.f21504h)) ? obj : this.f21499p.f21506g;
    }

    public AbstractC2346O Z() {
        return this.f21499p;
    }

    public final boolean a0(long j10) {
        C2224z c2224z = this.f21500q;
        int b10 = this.f21499p.b(c2224z.f21895a.f21516a);
        if (b10 == -1) {
            return false;
        }
        long j11 = this.f21499p.f(b10, this.f21498o).f24357d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c2224z.w(j10);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        ((C2224z) c10).x();
        if (c10 == this.f21500q) {
            this.f21500q = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.o0, androidx.media3.exoplayer.source.D
    public void n(b1.z zVar) {
        if (this.f21503t) {
            this.f21499p = this.f21499p.t(new k0(this.f21499p.f21882e, zVar));
        } else {
            this.f21499p = a.u(zVar);
        }
        this.f21842k.n(zVar);
    }
}
