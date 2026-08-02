package androidx.media3.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.a;
import androidx.media3.effect.DefaultVideoFrameProcessor;
import androidx.media3.effect.j;
import androidx.media3.effect.q;
import b1.C2345N;
import b1.C2357k;
import b1.C2368w;
import b1.InterfaceC2336E;
import b1.InterfaceC2360n;
import b1.InterfaceC2367v;
import b1.U;
import b1.V;
import b1.W;
import b1.X;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.L;
import e1.S;
import e1.Z;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l1.AbstractC5366l;
import l1.C5376q;
import l1.Z0;

/* loaded from: classes.dex */
public final class l implements X {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20801a;

    /* renamed from: b, reason: collision with root package name */
    public final C2357k f20802b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2367v f20803c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2360n f20804d;

    /* renamed from: e, reason: collision with root package name */
    public final X.b f20805e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f20806f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f20807g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f20808h;

    /* renamed from: i, reason: collision with root package name */
    public final DefaultVideoFrameProcessor.Factory f20809i;

    /* renamed from: j, reason: collision with root package name */
    public final Queue f20810j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f20811k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f20812l;

    /* renamed from: m, reason: collision with root package name */
    public List f20813m;

    /* renamed from: n, reason: collision with root package name */
    public U f20814n;

    /* renamed from: o, reason: collision with root package name */
    public W f20815o;

    /* renamed from: p, reason: collision with root package name */
    public q f20816p;

    /* renamed from: q, reason: collision with root package name */
    public L f20817q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20818r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20819s;

    /* renamed from: t, reason: collision with root package name */
    public long f20820t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f20821u;

    public class a implements W.c {
        public a() {
        }

        @Override // b1.W.c
        public void a(V v10) {
            l.this.C(v10);
        }

        @Override // b1.W.c
        public void b(final long j10, final boolean z10) {
            if (j10 == 0) {
                l.this.f20821u = true;
            }
            l.this.f20820t = j10;
            l.this.f20806f.execute(new Runnable() { // from class: l1.J0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.l.this.f20805e.b(j10, z10);
                }
            });
        }

        @Override // b1.W.c
        public void c() {
            l.this.f20806f.execute(new Runnable() { // from class: l1.H0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.l.this.f20805e.c(androidx.media3.effect.l.this.f20820t);
                }
            });
        }

        @Override // b1.W.c
        public void d(final int i10, final int i11) {
            l.this.f20806f.execute(new Runnable() { // from class: l1.I0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.l.this.f20805e.d(i10, i11);
                }
            });
        }

        @Override // b1.W.c
        public void e(final float f10) {
            l.this.f20806f.execute(new Runnable() { // from class: l1.G0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.l.this.f20805e.e(f10);
                }
            });
        }

        @Override // b1.W.c
        public void f(int i10, androidx.media3.common.a aVar, List list) {
            l.this.H();
        }
    }

    public class b implements q.a {
        public b() {
        }

        @Override // androidx.media3.effect.q.a
        public void a(V v10) {
            l.this.C(v10);
        }

        @Override // androidx.media3.effect.q.a
        public void c() {
            l.this.F();
        }
    }

    public class c implements W.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20824a;

        public c(int i10) {
            this.f20824a = i10;
        }

        @Override // b1.W.c
        public void a(V v10) {
            l.this.C(v10);
        }

        @Override // b1.W.c
        public void c() {
            l.this.E(this.f20824a);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final j f20826a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20827b;

        public d(j jVar, long j10) {
            this.f20826a = jVar;
            this.f20827b = j10;
        }

        public void a() {
            this.f20826a.k(this.f20827b);
        }
    }

    public static final class e implements X.a {

        /* renamed from: a, reason: collision with root package name */
        public final W.b f20828a;

        public e(W.b bVar) {
            this.f20828a = bVar;
        }

        @Override // b1.X.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(Context context, C2357k c2357k, InterfaceC2360n interfaceC2360n, X.b bVar, Executor executor, long j10, boolean z10) {
            return new l(context, this.f20828a, c2357k, interfaceC2360n, bVar, executor, z10, null);
        }
    }

    public static final class f implements InterfaceC2367v {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2367v f20829a = new C5376q();

        /* renamed from: b, reason: collision with root package name */
        public EGLContext f20830b;

        @Override // b1.InterfaceC2367v
        public EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) {
            return this.f20829a.a(eGLDisplay, obj, i10, z10);
        }

        @Override // b1.InterfaceC2367v
        public C2368w b(int i10, int i11, int i12) {
            return this.f20829a.b(i10, i11, i12);
        }

        @Override // b1.InterfaceC2367v
        public EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) {
            return this.f20829a.c(eGLContext, eGLDisplay);
        }

        @Override // b1.InterfaceC2367v
        public EGLContext d(EGLDisplay eGLDisplay, int i10, int[] iArr) {
            if (this.f20830b == null) {
                this.f20830b = this.f20829a.d(eGLDisplay, i10, iArr);
            }
            return this.f20830b;
        }

        @Override // b1.InterfaceC2367v
        public void e(EGLDisplay eGLDisplay) {
            EGLContext eGLContext = this.f20830b;
            if (eGLContext != null) {
                AbstractC4151s.A(eGLDisplay, eGLContext);
            }
        }
    }

    public /* synthetic */ l(Context context, W.b bVar, C2357k c2357k, InterfaceC2360n interfaceC2360n, X.b bVar2, Executor executor, boolean z10, a aVar) {
        this(context, bVar, c2357k, interfaceC2360n, bVar2, executor, z10);
    }

    public static /* synthetic */ void p(l lVar) {
        lVar.getClass();
        try {
            lVar.f20803c.e(AbstractC4151s.I());
        } catch (Exception e10) {
            AbstractC4156x.e("MultiInputVG", "Error releasing GlObjectsProvider", e10);
        }
    }

    public final W B(int i10) {
        AbstractC4134a.g(Z.q(this.f20807g, i10));
        return (W) this.f20807g.get(i10);
    }

    public final void C(final Exception exc) {
        this.f20806f.execute(new Runnable() { // from class: l1.B0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.effect.l.this.f20805e.a(r2 instanceof b1.V ? (b1.V) r1 : b1.V.a(exc));
            }
        });
    }

    public final void D(int i10, long j10) {
        AbstractC4134a.g(Z.q(this.f20811k, i10));
        ((d) this.f20811k.get(i10)).a();
        this.f20811k.remove(i10);
        H();
    }

    public final void E(int i10) {
        ((q) AbstractC4134a.e(this.f20816p)).e(i10);
    }

    public final void F() {
        this.f20818r = true;
        if (this.f20810j.isEmpty()) {
            ((W) AbstractC4134a.e(this.f20815o)).f();
        } else {
            H();
        }
    }

    public final void G(j jVar, C2368w c2368w, long j10, long j11) {
        AbstractC4134a.g(!this.f20818r);
        AbstractC5366l.e("Compositor", "OutputTextureRendered", j10);
        this.f20810j.add(new Z0(c2368w, j10));
        this.f20811k.put(c2368w.f24635a, new d(jVar, j10));
        H();
    }

    public final void H() {
        Z0 z02 = (Z0) this.f20810j.peek();
        if (z02 == null) {
            return;
        }
        W w10 = (W) AbstractC4134a.i(this.f20815o);
        C2368w c2368w = z02.f55483a;
        int i10 = c2368w.f24638d;
        int i11 = c2368w.f24639e;
        if (i10 != this.f20817q.b() || i11 != this.f20817q.a()) {
            w10.i(3, new a.b().V(this.f20802b).F0(i10).h0(i11).P(), this.f20813m, 0L);
            this.f20817q = new L(i10, i11);
        }
        if (w10.g(z02.f55483a.f24635a, z02.f55484b)) {
            this.f20810j.remove();
            if (this.f20818r && this.f20810j.isEmpty()) {
                w10.f();
            }
        }
    }

    public final void I(int i10, j jVar, C2368w c2368w, long j10) {
        AbstractC5366l.e("VideoFrameProcessor", "OutputTextureRendered", j10);
        ((q) AbstractC4134a.e(this.f20816p)).i(i10, jVar, c2368w, this.f20802b, j10);
    }

    @Override // b1.X
    public void a(long j10) {
        ((W) AbstractC4134a.e(this.f20815o)).a(j10);
    }

    @Override // b1.X
    public boolean b(int i10) {
        return B(i10).j();
    }

    @Override // b1.X
    public void c(C2345N c2345n) {
        ((W) AbstractC4134a.e(this.f20815o)).c(c2345n);
    }

    @Override // b1.X
    public void d(int i10, int i11, androidx.media3.common.a aVar, List list, long j10) {
        B(i10).i(i11, aVar, list, j10);
    }

    @Override // b1.X
    public void e() {
        throw new UnsupportedOperationException();
    }

    @Override // b1.X
    public void f(List list) {
        this.f20813m = list;
    }

    @Override // b1.X
    public void flush() {
        for (int i10 = 0; i10 < this.f20807g.size(); i10++) {
            SparseArray sparseArray = this.f20807g;
            ((W) sparseArray.get(sparseArray.keyAt(i10))).flush();
        }
    }

    @Override // b1.X
    public Surface g(int i10) {
        return B(i10).d();
    }

    @Override // b1.X
    public boolean h() {
        return this.f20821u;
    }

    @Override // b1.X
    public int i(int i10) {
        return B(i10).k();
    }

    @Override // b1.X
    public void initialize() {
        AbstractC4134a.g(this.f20807g.size() == 0 && this.f20816p == null && this.f20815o == null && !this.f20819s);
        DefaultVideoFrameProcessor a10 = this.f20809i.a(this.f20801a, this.f20804d, this.f20802b, this.f20812l, Ta.r.a(), new a());
        this.f20815o = a10;
        a10.h(new InterfaceC2336E() { // from class: l1.C0
            @Override // b1.InterfaceC2336E
            public final void a(int i10, long j10) {
                androidx.media3.effect.l.this.D(i10, j10);
            }
        });
        androidx.media3.effect.e eVar = new androidx.media3.effect.e(this.f20801a, this.f20803c, this.f20808h, new b(), new j.a() { // from class: l1.D0
            @Override // androidx.media3.effect.j.a
            public final void a(androidx.media3.effect.j jVar, C2368w c2368w, long j10, long j11) {
                androidx.media3.effect.l.this.G(jVar, c2368w, j10, j11);
            }
        }, 1);
        this.f20816p = eVar;
        eVar.d(this.f20814n);
    }

    @Override // b1.X
    public void j(U u10) {
        this.f20814n = u10;
        q qVar = this.f20816p;
        if (qVar != null) {
            qVar.d(u10);
        }
    }

    @Override // b1.X
    public void k(final int i10) {
        AbstractC4134a.g(!Z.q(this.f20807g, i10));
        ((q) AbstractC4134a.e(this.f20816p)).b(i10);
        this.f20807g.put(i10, this.f20809i.l().c(new j.a() { // from class: l1.E0
            @Override // androidx.media3.effect.j.a
            public final void a(androidx.media3.effect.j jVar, C2368w c2368w, long j10, long j11) {
                androidx.media3.effect.l.this.I(i10, jVar, c2368w, j10);
            }
        }, 2).build().a(this.f20801a, InterfaceC2360n.f24615a, this.f20802b, true, this.f20806f, new c(i10)));
    }

    @Override // b1.X
    public void l(int i10) {
        B(i10).f();
    }

    @Override // b1.X
    public boolean m(int i10, Bitmap bitmap, S s10) {
        return B(i10).b(bitmap, s10);
    }

    @Override // b1.X
    public void release() {
        if (this.f20819s) {
            return;
        }
        for (int i10 = 0; i10 < this.f20807g.size(); i10++) {
            SparseArray sparseArray = this.f20807g;
            ((W) sparseArray.get(sparseArray.keyAt(i10))).release();
        }
        q qVar = this.f20816p;
        if (qVar != null) {
            qVar.release();
            this.f20816p = null;
        }
        W w10 = this.f20815o;
        if (w10 != null) {
            w10.release();
            this.f20815o = null;
        }
        this.f20808h.submit(new Runnable() { // from class: l1.F0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.effect.l.p(androidx.media3.effect.l.this);
            }
        });
        this.f20808h.shutdown();
        try {
            this.f20808h.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            AbstractC4156x.d("MultiInputVG", "Thread interrupted while waiting for executor service termination");
        }
        this.f20819s = true;
    }

    public l(Context context, W.b bVar, C2357k c2357k, InterfaceC2360n interfaceC2360n, X.b bVar2, Executor executor, boolean z10) {
        AbstractC4134a.a(bVar instanceof DefaultVideoFrameProcessor.Factory);
        this.f20801a = context;
        this.f20802b = c2357k;
        this.f20804d = interfaceC2360n;
        this.f20805e = bVar2;
        this.f20806f = executor;
        this.f20812l = z10;
        this.f20820t = -9223372036854775807L;
        this.f20807g = new SparseArray();
        ScheduledExecutorService c12 = Z.c1("Effect:MultipleInputVideoGraph:Thread");
        this.f20808h = c12;
        f fVar = new f();
        this.f20803c = fVar;
        this.f20809i = ((DefaultVideoFrameProcessor.Factory) bVar).l().b(fVar).a(c12).build();
        this.f20810j = new ArrayDeque();
        this.f20811k = new SparseArray();
        this.f20817q = L.f45487c;
        this.f20813m = AbstractC3445z.t();
        this.f20814n = U.f24521a;
    }
}
