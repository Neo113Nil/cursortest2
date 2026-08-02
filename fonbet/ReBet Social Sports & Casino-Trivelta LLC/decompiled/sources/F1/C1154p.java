package F1;

import F1.C1154p;
import F1.P;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.a;
import androidx.media3.effect.DefaultVideoFrameProcessor;
import androidx.media3.effect.SingleInputVideoGraph;
import b1.C2345N;
import b1.C2357k;
import b1.InterfaceC2360n;
import b1.U;
import b1.V;
import b1.W;
import b1.X;
import b1.Y;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;
import e1.Z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: F1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154p implements X.b {

    /* renamed from: B, reason: collision with root package name */
    public static final Executor f3407B = new Executor() { // from class: F1.n
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C1154p.f(runnable);
        }
    };

    /* renamed from: A, reason: collision with root package name */
    public int f3408A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3409a;

    /* renamed from: b, reason: collision with root package name */
    public final X.a f3410b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f3411c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3412d;

    /* renamed from: e, reason: collision with root package name */
    public final P f3413e;

    /* renamed from: f, reason: collision with root package name */
    public final P.b f3414f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4143j f3415g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f3416h;

    /* renamed from: i, reason: collision with root package name */
    public e1.P f3417i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.media3.common.a f3418j;

    /* renamed from: k, reason: collision with root package name */
    public U f3419k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC3445z f3420l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC4152t f3421m;

    /* renamed from: n, reason: collision with root package name */
    public X f3422n;

    /* renamed from: o, reason: collision with root package name */
    public y f3423o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3424p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3425q;

    /* renamed from: r, reason: collision with root package name */
    public long f3426r;

    /* renamed from: s, reason: collision with root package name */
    public int f3427s;

    /* renamed from: t, reason: collision with root package name */
    public Pair f3428t;

    /* renamed from: u, reason: collision with root package name */
    public int f3429u;

    /* renamed from: v, reason: collision with root package name */
    public int f3430v;

    /* renamed from: w, reason: collision with root package name */
    public long f3431w;

    /* renamed from: x, reason: collision with root package name */
    public long f3432x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3433y;

    /* renamed from: z, reason: collision with root package name */
    public int f3434z;

    /* renamed from: F1.p$a */
    public class a implements P.b {
        public a() {
        }

        @Override // F1.P.b
        public void a(long j10) {
            ((X) AbstractC4134a.i(C1154p.this.f3422n)).a(j10);
        }

        @Override // F1.P.b
        public void b() {
            ((X) AbstractC4134a.i(C1154p.this.f3422n)).a(-2L);
        }
    }

    /* renamed from: F1.p$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3436a;

        /* renamed from: b, reason: collision with root package name */
        public final z f3437b;

        /* renamed from: c, reason: collision with root package name */
        public X.a f3438c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3439d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC4143j f3440e = InterfaceC4143j.f45530a;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3441f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f3442g;

        public b(Context context, z zVar) {
            this.f3436a = context.getApplicationContext();
            this.f3437b = zVar;
        }

        public C1154p f() {
            AbstractC4134a.g(!this.f3441f);
            if (this.f3438c == null) {
                this.f3438c = new g(this.f3442g);
            }
            C1154p c1154p = new C1154p(this, null);
            this.f3441f = true;
            return c1154p;
        }

        public b g(InterfaceC4143j interfaceC4143j) {
            this.f3440e = interfaceC4143j;
            return this;
        }

        public b h(boolean z10) {
            this.f3439d = z10;
            return this;
        }
    }

    /* renamed from: F1.p$c */
    public final class c implements P.a {
        public c() {
        }

        @Override // F1.P.a
        public void a(P.c cVar) {
            Iterator it = C1154p.this.f3416h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(V.a(cVar));
            }
        }

        @Override // F1.P.a
        public void c(Y y10) {
            Iterator it = C1154p.this.f3416h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(y10);
            }
        }

        @Override // F1.P.a
        public void f() {
            Iterator it = C1154p.this.f3416h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).f();
            }
        }

        @Override // F1.P.a
        public void onFrameDropped() {
            Iterator it = C1154p.this.f3416h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onFrameDropped();
            }
        }

        public /* synthetic */ c(C1154p c1154p, a aVar) {
            this();
        }
    }

    /* renamed from: F1.p$d */
    public final class d implements P, e {

        /* renamed from: a, reason: collision with root package name */
        public final int f3444a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3445b;

        /* renamed from: d, reason: collision with root package name */
        public androidx.media3.common.a f3447d;

        /* renamed from: e, reason: collision with root package name */
        public int f3448e;

        /* renamed from: f, reason: collision with root package name */
        public long f3449f;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3453j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3454k;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC3445z f3446c = AbstractC3445z.t();

        /* renamed from: g, reason: collision with root package name */
        public long f3450g = -9223372036854775807L;

        /* renamed from: h, reason: collision with root package name */
        public P.a f3451h = P.a.f3300a;

        /* renamed from: i, reason: collision with root package name */
        public Executor f3452i = C1154p.f3407B;

        public d(Context context, int i10) {
            this.f3445b = i10;
            this.f3444a = Z.k0(context);
        }

        public static /* synthetic */ void B(d dVar, P.a aVar, V v10) {
            dVar.getClass();
            aVar.a(new P.c(v10, (androidx.media3.common.a) AbstractC4134a.i(dVar.f3447d)));
        }

        public final void C(androidx.media3.common.a aVar) {
            ((X) AbstractC4134a.e(C1154p.this.f3422n)).d(this.f3445b, this.f3448e != 1 ? 2 : 1, aVar.b().V(C1154p.this.J(aVar.f20516D)).P(), this.f3446c, 0L);
        }

        @Override // F1.C1154p.e
        public void a(final V v10) {
            final P.a aVar = this.f3451h;
            this.f3452i.execute(new Runnable() { // from class: F1.q
                @Override // java.lang.Runnable
                public final void run() {
                    C1154p.d.B(C1154p.d.this, aVar, v10);
                }
            });
        }

        @Override // F1.P
        public boolean b() {
            return isInitialized() && C1154p.this.L();
        }

        @Override // F1.C1154p.e
        public void c(final Y y10) {
            final P.a aVar = this.f3451h;
            this.f3452i.execute(new Runnable() { // from class: F1.u
                @Override // java.lang.Runnable
                public final void run() {
                    P.a.this.c(y10);
                }
            });
        }

        @Override // F1.P
        public Surface d() {
            AbstractC4134a.g(isInitialized());
            return ((X) AbstractC4134a.e(C1154p.this.f3422n)).g(this.f3445b);
        }

        @Override // F1.P
        public void e() {
            if (isInitialized()) {
                boolean z10 = this.f3453j;
                long j10 = C1154p.this.f3431w;
                C1154p.this.I(false);
                ((X) AbstractC4134a.e(C1154p.this.f3422n)).e();
                C1154p.this.f3431w = j10;
                if (z10) {
                    g();
                }
            }
        }

        @Override // F1.C1154p.e
        public void f() {
            final P.a aVar = this.f3451h;
            Executor executor = this.f3452i;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: F1.t
                @Override // java.lang.Runnable
                public final void run() {
                    P.a.this.f();
                }
            });
        }

        @Override // F1.P
        public void g() {
            C1154p.this.f3432x = this.f3450g;
            if (C1154p.this.f3431w >= C1154p.this.f3432x) {
                C1154p.this.a0();
            }
        }

        @Override // F1.P
        public void h(long j10, long j11) {
            C1154p.this.T(j10 + this.f3449f, j11);
        }

        @Override // F1.C1154p.e
        public void i() {
            final P.a aVar = this.f3451h;
            Executor executor = this.f3452i;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: F1.r
                @Override // java.lang.Runnable
                public final void run() {
                    P.a.this.i();
                }
            });
        }

        @Override // F1.P
        public boolean isInitialized() {
            return this.f3454k;
        }

        @Override // F1.P
        public void j(P.a aVar, Executor executor) {
            this.f3451h = aVar;
            this.f3452i = executor;
        }

        @Override // F1.P
        public void k(int i10, androidx.media3.common.a aVar, long j10, int i11, List list) {
            AbstractC4134a.g(isInitialized());
            this.f3446c = AbstractC3445z.o(list);
            this.f3448e = i10;
            this.f3447d = aVar;
            C1154p.this.f3432x = -9223372036854775807L;
            C1154p.this.f3433y = false;
            C(aVar);
            boolean z10 = this.f3450g == -9223372036854775807L;
            if (C1154p.this.f3412d || (this.f3445b == 0 && z10)) {
                long j11 = z10 ? -4611686018427387904L : this.f3450g + 1;
                C1154p.this.f3417i.a(j11, new h(this.f3449f + j10, i11, j11));
            }
        }

        @Override // F1.P
        public void l(long j10) {
            this.f3449f = j10;
        }

        @Override // F1.P
        public void m(List list) {
            if (this.f3446c.equals(list)) {
                return;
            }
            this.f3446c = AbstractC3445z.o(list);
            androidx.media3.common.a aVar = this.f3447d;
            if (aVar != null) {
                C(aVar);
            }
        }

        @Override // F1.P
        public boolean n(boolean z10) {
            return C1154p.this.N(z10 && isInitialized());
        }

        @Override // F1.P
        public boolean o(androidx.media3.common.a aVar) {
            AbstractC4134a.g(!isInitialized());
            boolean R10 = C1154p.this.R(aVar, this.f3445b);
            this.f3454k = R10;
            return R10;
        }

        @Override // F1.C1154p.e
        public void onFrameDropped() {
            final P.a aVar = this.f3451h;
            Executor executor = this.f3452i;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: F1.s
                @Override // java.lang.Runnable
                public final void run() {
                    P.a.this.onFrameDropped();
                }
            });
        }

        @Override // F1.P
        public void p() {
            if (C1154p.this.f3417i.l() == 0) {
                C1154p.this.G();
                return;
            }
            e1.P p10 = new e1.P();
            boolean z10 = true;
            while (C1154p.this.f3417i.l() > 0) {
                h hVar = (h) AbstractC4134a.e((h) C1154p.this.f3417i.i());
                if (z10) {
                    int i10 = hVar.f3460b;
                    if (i10 == 0 || i10 == 1) {
                        hVar = new h(hVar.f3459a, 0, hVar.f3461c);
                    } else {
                        C1154p.this.G();
                    }
                    z10 = false;
                }
                p10.a(hVar.f3461c, hVar);
            }
            C1154p.this.f3417i = p10;
        }

        @Override // F1.P
        public void q() {
            if (C1154p.this.f3412d) {
                C1154p.this.c0();
            }
        }

        @Override // F1.P
        public void r() {
            if (C1154p.this.f3412d) {
                C1154p.this.b0();
            }
        }

        @Override // F1.P
        public void release() {
            C1154p.this.S();
        }

        @Override // F1.P
        public boolean s(long j10, P.b bVar) {
            AbstractC4134a.g(isInitialized());
            if (!C1154p.this.Z() || ((X) AbstractC4134a.e(C1154p.this.f3422n)).i(this.f3445b) >= this.f3444a || !((X) AbstractC4134a.e(C1154p.this.f3422n)).b(this.f3445b)) {
                return false;
            }
            long j11 = j10 + this.f3449f;
            this.f3450g = j11;
            bVar.a(j11 * 1000);
            return true;
        }

        @Override // F1.P
        public void t(y yVar) {
            if (this.f3445b == 0) {
                C1154p.this.Y(yVar);
            }
        }

        @Override // F1.P
        public void u(int i10) {
            if (this.f3445b == 0) {
                C1154p.this.U(i10);
            }
        }

        @Override // F1.P
        public void v(float f10) {
            if (this.f3445b == 0) {
                C1154p.this.W(f10);
            }
        }

        @Override // F1.P
        public void w() {
            C1154p.this.H();
        }

        @Override // F1.P
        public void x(Surface surface, e1.L l10) {
            C1154p.this.V(surface, l10);
        }

        @Override // F1.P
        public void y(boolean z10) {
            if (isInitialized()) {
                ((X) AbstractC4134a.e(C1154p.this.f3422n)).flush();
            }
            this.f3450g = -9223372036854775807L;
            C1154p.this.I(z10);
            this.f3453j = false;
        }

        @Override // F1.P
        public void z(boolean z10) {
            if (C1154p.this.f3412d) {
                C1154p.this.O(z10);
            }
        }
    }

    /* renamed from: F1.p$e */
    public interface e {
        void a(V v10);

        void c(Y y10);

        void f();

        void i();

        void onFrameDropped();
    }

    /* renamed from: F1.p$f */
    public static final class f implements W.b {

        /* renamed from: b, reason: collision with root package name */
        public static final Ra.t f3456b = Ra.u.a(new Ra.t() { // from class: F1.v
            @Override // Ra.t
            public final Object get() {
                return C1154p.f.b();
            }
        });

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3457a;

        public f(boolean z10) {
            this.f3457a = z10;
        }

        public static /* synthetic */ Class b() {
            return DefaultVideoFrameProcessor.Factory.Builder.class;
        }

        @Override // b1.W.b
        public W a(Context context, InterfaceC2360n interfaceC2360n, C2357k c2357k, boolean z10, Executor executor, W.c cVar) {
            try {
                Class cls = (Class) f3456b.get();
                Object newInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(newInstance, Boolean.valueOf(this.f3457a));
                return ((W.b) AbstractC4134a.e(cls.getMethod("build", null).invoke(newInstance, null))).a(context, interfaceC2360n, c2357k, z10, executor, cVar);
            } catch (Exception e10) {
                throw new V(e10);
            }
        }
    }

    /* renamed from: F1.p$g */
    public static final class g implements X.a {

        /* renamed from: a, reason: collision with root package name */
        public final W.b f3458a;

        public g(boolean z10) {
            this.f3458a = new f(z10);
        }

        @Override // b1.X.a
        public X a(Context context, C2357k c2357k, InterfaceC2360n interfaceC2360n, X.b bVar, Executor executor, long j10, boolean z10) {
            try {
                return ((X.a) SingleInputVideoGraph.Factory.class.getConstructor(W.b.class).newInstance(this.f3458a)).a(context, c2357k, interfaceC2360n, bVar, executor, j10, z10);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: F1.p$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final long f3459a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3460b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3461c;

        public h(long j10, int i10, long j11) {
            this.f3459a = j10;
            this.f3460b = i10;
            this.f3461c = j11;
        }
    }

    public /* synthetic */ C1154p(b bVar, a aVar) {
        this(bVar);
    }

    public static /* synthetic */ void f(Runnable runnable) {
    }

    public static /* synthetic */ void g(C1154p c1154p) {
        c1154p.f3429u--;
    }

    public void F(e eVar) {
        this.f3416h.add(eVar);
    }

    public final void G() {
        this.f3413e.p();
    }

    public void H() {
        e1.L l10 = e1.L.f45487c;
        P(null, l10.b(), l10.a());
        this.f3428t = null;
    }

    public final void I(boolean z10) {
        if (M()) {
            this.f3429u++;
            this.f3413e.y(z10);
            while (this.f3417i.l() > 1) {
                this.f3417i.i();
            }
            if (this.f3417i.l() == 1) {
                h hVar = (h) AbstractC4134a.e((h) this.f3417i.i());
                this.f3426r = hVar.f3459a;
                this.f3427s = hVar.f3460b;
                Q();
            }
            this.f3431w = -9223372036854775807L;
            this.f3432x = -9223372036854775807L;
            this.f3433y = false;
            ((InterfaceC4152t) AbstractC4134a.i(this.f3421m)).j(new Runnable() { // from class: F1.m
                @Override // java.lang.Runnable
                public final void run() {
                    C1154p.g(C1154p.this);
                }
            });
        }
    }

    public final C2357k J(C2357k c2357k) {
        return (c2357k == null || !c2357k.g() || this.f3425q) ? C2357k.f24596g : c2357k;
    }

    public P K(int i10) {
        if (Z.q(this.f3411c, i10)) {
            return (P) this.f3411c.get(i10);
        }
        d dVar = new d(this.f3409a, i10);
        if (i10 == 0) {
            F(dVar);
        }
        this.f3411c.put(i10, dVar);
        return dVar;
    }

    public final boolean L() {
        return this.f3429u == 0 && this.f3433y && this.f3413e.b();
    }

    public final boolean M() {
        return this.f3430v == 1;
    }

    public final boolean N(boolean z10) {
        return this.f3413e.n(z10 && this.f3429u == 0);
    }

    public final void O(boolean z10) {
        this.f3413e.z(z10);
    }

    public final void P(Surface surface, int i10, int i11) {
        X x10 = this.f3422n;
        if (x10 == null) {
            return;
        }
        if (surface != null) {
            x10.c(new C2345N(surface, i10, i11));
            this.f3413e.x(surface, new e1.L(i10, i11));
        } else {
            x10.c(null);
            this.f3413e.w();
        }
    }

    public final void Q() {
        this.f3413e.k(1, this.f3418j, this.f3426r, this.f3427s, AbstractC3445z.t());
    }

    public final boolean R(androidx.media3.common.a aVar, int i10) {
        C1154p c1154p;
        AbstractC4151s.a aVar2;
        if (i10 == 0) {
            AbstractC4134a.g(this.f3430v == 0);
            C2357k J10 = J(aVar.f20516D);
            try {
                try {
                    if (this.f3424p) {
                        J10 = C2357k.f24596g;
                    } else if (J10.f24606c == 7 && Build.VERSION.SDK_INT < 34 && AbstractC4151s.M()) {
                        J10 = J10.a().e(6).a();
                    } else if (!AbstractC4151s.N(J10.f24606c) && Build.VERSION.SDK_INT >= 29) {
                        AbstractC4156x.i("PlaybackVidGraphWrapper", Z.G("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(J10.f24606c)));
                        J10 = C2357k.f24596g;
                    }
                    C2357k c2357k = J10;
                    a aVar3 = null;
                    InterfaceC4152t d10 = this.f3415g.d((Looper) AbstractC4134a.i(Looper.myLooper()), null);
                    this.f3421m = d10;
                    try {
                        X.a aVar4 = this.f3410b;
                        Context context = this.f3409a;
                        InterfaceC2360n interfaceC2360n = InterfaceC2360n.f24615a;
                        Objects.requireNonNull(d10);
                        c1154p = this;
                        try {
                            X a10 = aVar4.a(context, c2357k, interfaceC2360n, c1154p, new ExecutorC1153o(d10), 0L, false);
                            c1154p.f3422n = a10;
                            a10.f(c1154p.f3420l);
                            c1154p.f3422n.j(c1154p.f3419k);
                            c1154p.f3422n.initialize();
                            Pair pair = c1154p.f3428t;
                            if (pair != null) {
                                Surface surface = (Surface) pair.first;
                                e1.L l10 = (e1.L) pair.second;
                                P(surface, l10.b(), l10.a());
                            }
                            c1154p.f3413e.o(aVar);
                            P p10 = c1154p.f3413e;
                            c cVar = new c(this, aVar3);
                            InterfaceC4152t interfaceC4152t = c1154p.f3421m;
                            Objects.requireNonNull(interfaceC4152t);
                            p10.j(cVar, new ExecutorC1153o(interfaceC4152t));
                            c1154p.f3430v = 1;
                        } catch (V e10) {
                            e = e10;
                            throw new P.c(e, aVar);
                        }
                    } catch (V e11) {
                        e = e11;
                    }
                } catch (AbstractC4151s.a e12) {
                    aVar2 = e12;
                    throw new P.c(aVar2, aVar);
                }
            } catch (AbstractC4151s.a e13) {
                aVar2 = e13;
            }
        } else {
            c1154p = this;
            if (!M()) {
                return false;
            }
        }
        try {
            ((X) AbstractC4134a.e(c1154p.f3422n)).k(i10);
            c1154p.f3408A++;
            return true;
        } catch (V e14) {
            throw new P.c(e14, aVar);
        }
    }

    public void S() {
        if (this.f3430v == 2) {
            return;
        }
        InterfaceC4152t interfaceC4152t = this.f3421m;
        if (interfaceC4152t != null) {
            interfaceC4152t.g(null);
        }
        X x10 = this.f3422n;
        if (x10 != null) {
            x10.release();
        }
        this.f3428t = null;
        this.f3430v = 2;
    }

    public final void T(long j10, long j11) {
        this.f3413e.h(j10, j11);
    }

    public final void U(int i10) {
        this.f3413e.u(i10);
    }

    public void V(Surface surface, e1.L l10) {
        Pair pair = this.f3428t;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e1.L) this.f3428t.second).equals(l10)) {
            return;
        }
        this.f3428t = Pair.create(surface, l10);
        P(surface, l10.b(), l10.a());
    }

    public final void W(float f10) {
        this.f3413e.v(f10);
    }

    public void X(int i10) {
        this.f3434z = i10;
    }

    public final void Y(y yVar) {
        this.f3423o = yVar;
        this.f3413e.t(yVar);
    }

    public final boolean Z() {
        int i10 = this.f3434z;
        return i10 != -1 && i10 == this.f3408A;
    }

    @Override // b1.X.b
    public void a(V v10) {
        Iterator it = this.f3416h.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(v10);
        }
    }

    public final void a0() {
        this.f3413e.g();
        this.f3433y = true;
    }

    @Override // b1.X.b
    public void b(long j10, boolean z10) {
        if (this.f3429u > 0) {
            return;
        }
        Iterator it = this.f3416h.iterator();
        while (it.hasNext()) {
            ((e) it.next()).i();
        }
        if (z10) {
            y yVar = this.f3423o;
            if (yVar != null) {
                yVar.e(j10, -9223372036854775807L, this.f3418j, null);
                return;
            }
            return;
        }
        this.f3431w = j10;
        h hVar = (h) this.f3417i.j(j10);
        if (hVar != null) {
            this.f3426r = hVar.f3459a;
            this.f3427s = hVar.f3460b;
            Q();
        }
        this.f3413e.s(j10, this.f3414f);
        long j11 = this.f3432x;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        a0();
    }

    public void b0() {
        this.f3413e.r();
    }

    public void c0() {
        this.f3413e.q();
    }

    @Override // b1.X.b
    public void d(int i10, int i11) {
        this.f3418j = this.f3418j.b().F0(i10).h0(i11).P();
        Q();
    }

    @Override // b1.X.b
    public void e(float f10) {
        this.f3418j = this.f3418j.b().f0(f10).P();
        Q();
    }

    public C1154p(b bVar) {
        this.f3409a = bVar.f3436a;
        this.f3417i = new e1.P();
        this.f3410b = (X.a) AbstractC4134a.i(bVar.f3438c);
        this.f3411c = new SparseArray();
        this.f3420l = AbstractC3445z.t();
        this.f3419k = U.f24521a;
        this.f3412d = bVar.f3439d;
        InterfaceC4143j interfaceC4143j = bVar.f3440e;
        this.f3415g = interfaceC4143j;
        this.f3413e = new C1143e(bVar.f3437b, interfaceC4143j);
        this.f3414f = new a();
        this.f3416h = new CopyOnWriteArraySet();
        this.f3418j = new a.b().P();
        this.f3426r = -9223372036854775807L;
        this.f3431w = -9223372036854775807L;
        this.f3432x = -9223372036854775807L;
        this.f3434z = -1;
        this.f3430v = 0;
    }

    @Override // b1.X.b
    public void c(long j10) {
    }
}
