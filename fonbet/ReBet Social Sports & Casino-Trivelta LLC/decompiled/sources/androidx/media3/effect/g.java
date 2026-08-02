package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import androidx.media3.effect.i;
import androidx.media3.effect.j;
import androidx.media3.effect.n;
import androidx.media3.effect.r;
import b1.C2345N;
import b1.C2357k;
import b1.C2368w;
import b1.InterfaceC2367v;
import b1.V;
import b1.W;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.C4158z;
import e1.InterfaceC4143j;
import e1.L;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import l1.A0;
import l1.AbstractC5366l;
import l1.C5381t;
import l1.L0;
import l1.Y0;
import l1.Z0;

/* loaded from: classes.dex */
public final class g implements i, j {

    /* renamed from: A, reason: collision with root package name */
    public C2345N f20749A;

    /* renamed from: C, reason: collision with root package name */
    public EGLSurface f20751C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20752a;

    /* renamed from: d, reason: collision with root package name */
    public final EGLDisplay f20755d;

    /* renamed from: e, reason: collision with root package name */
    public final EGLContext f20756e;

    /* renamed from: f, reason: collision with root package name */
    public final EGLSurface f20757f;

    /* renamed from: g, reason: collision with root package name */
    public final C2357k f20758g;

    /* renamed from: h, reason: collision with root package name */
    public final r f20759h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f20760i;

    /* renamed from: j, reason: collision with root package name */
    public final W.c f20761j;

    /* renamed from: l, reason: collision with root package name */
    public final Y0 f20763l;

    /* renamed from: m, reason: collision with root package name */
    public final C4158z f20764m;

    /* renamed from: n, reason: collision with root package name */
    public final C4158z f20765n;

    /* renamed from: o, reason: collision with root package name */
    public final j.a f20766o;

    /* renamed from: p, reason: collision with root package name */
    public final int f20767p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f20768q;

    /* renamed from: r, reason: collision with root package name */
    public int f20769r;

    /* renamed from: s, reason: collision with root package name */
    public int f20770s;

    /* renamed from: t, reason: collision with root package name */
    public C5381t f20771t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20772u;

    /* renamed from: w, reason: collision with root package name */
    public L f20774w;

    /* renamed from: x, reason: collision with root package name */
    public b f20775x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20776y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20777z;

    /* renamed from: b, reason: collision with root package name */
    public final List f20753b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final List f20754c = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public i.b f20773v = new a();

    /* renamed from: k, reason: collision with root package name */
    public final Queue f20762k = new ConcurrentLinkedQueue();

    /* renamed from: B, reason: collision with root package name */
    public long f20750B = -9223372036854775807L;

    public class a implements i.b {
        public a() {
        }
    }

    public interface b {
        void a();

        void b(long j10);
    }

    public g(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, C2357k c2357k, r rVar, Executor executor, W.c cVar, j.a aVar, int i10, int i11, boolean z10) {
        this.f20752a = context;
        this.f20755d = eGLDisplay;
        this.f20756e = eGLContext;
        this.f20757f = eGLSurface;
        this.f20758g = c2357k;
        this.f20759h = rVar;
        this.f20760i = executor;
        this.f20761j = cVar;
        this.f20766o = aVar;
        this.f20767p = i11;
        this.f20768q = z10;
        this.f20763l = new Y0(C2357k.i(c2357k), i10);
        this.f20764m = new C4158z(i10);
        this.f20765n = new C4158z(i10);
    }

    public final boolean A() {
        return this.f20750B != -9223372036854775807L;
    }

    public void B(long j10) {
        this.f20750B = j10;
        for (int i10 = 0; i10 < this.f20762k.size(); i10++) {
            this.f20773v.b(((Z0) this.f20762k.remove()).f55483a);
        }
    }

    public final void C(long j10) {
        AbstractC4134a.g(this.f20766o != null);
        while (this.f20763l.h() < this.f20763l.a() && this.f20764m.d() <= j10) {
            this.f20763l.f();
            this.f20764m.f();
            AbstractC4151s.x(this.f20765n.f());
            this.f20773v.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001a, code lost:
    
        if (r10 != r7.f20750B) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(InterfaceC2367v interfaceC2367v, C2368w c2368w, long j10, long j11) {
        final Exception exc;
        final long j12;
        C2368w c2368w2;
        g gVar;
        try {
        } catch (V e10) {
            e = e10;
        } catch (AbstractC4151s.a e11) {
            e = e11;
        }
        if (j11 != -2) {
            try {
            } catch (V e12) {
                e = e12;
                gVar = this;
                c2368w2 = c2368w;
                j12 = j10;
                exc = e;
                gVar.f20760i.execute(new Runnable() { // from class: l1.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.effect.g.this.f20761j.a(b1.V.b(exc, j12));
                    }
                });
                gVar.f20773v.b(c2368w2);
                return;
            } catch (AbstractC4151s.a e13) {
                e = e13;
                gVar = this;
                c2368w2 = c2368w;
                j12 = j10;
                exc = e;
                gVar.f20760i.execute(new Runnable() { // from class: l1.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.effect.g.this.f20761j.a(b1.V.b(exc, j12));
                    }
                });
                gVar.f20773v.b(c2368w2);
                return;
            }
            if (y(interfaceC2367v, c2368w.f24638d, c2368w.f24639e)) {
                if (A()) {
                    try {
                    } catch (V | AbstractC4151s.a e14) {
                        exc = e14;
                        gVar = this;
                        c2368w2 = c2368w;
                        j12 = j10;
                        gVar.f20760i.execute(new Runnable() { // from class: l1.e0
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.media3.effect.g.this.f20761j.a(b1.V.b(exc, j12));
                            }
                        });
                        gVar.f20773v.b(c2368w2);
                        return;
                    }
                }
                if (this.f20749A != null) {
                    gVar = this;
                    c2368w2 = c2368w;
                    gVar.E(c2368w2, j10, j11);
                } else {
                    gVar = this;
                    c2368w2 = c2368w;
                    if (gVar.f20766o != null) {
                        F(c2368w2, j10);
                    }
                }
                gVar.f20773v.b(c2368w2);
                return;
            }
        }
        this.f20773v.b(c2368w);
        if (j11 == -2) {
            ((b) AbstractC4134a.e(this.f20775x)).b(j10);
        }
    }

    public final void E(C2368w c2368w, long j10, long j11) {
        EGLSurface eGLSurface = (EGLSurface) AbstractC4134a.e(this.f20751C);
        C2345N c2345n = (C2345N) AbstractC4134a.e(this.f20749A);
        C5381t c5381t = (C5381t) AbstractC4134a.e(this.f20771t);
        AbstractC4151s.C(this.f20755d, this.f20756e, eGLSurface, c2345n.f24341b, c2345n.f24342c);
        AbstractC4151s.f();
        c5381t.i(c2368w.f24635a, j10);
        if (j11 == -3) {
            AbstractC4134a.g(j10 != -9223372036854775807L);
            j11 = 1000 * j10;
        }
        EGLExt.eglPresentationTimeANDROID(this.f20755d, eGLSurface, j11);
        EGL14.eglSwapBuffers(this.f20755d, eGLSurface);
        ((b) AbstractC4134a.e(this.f20775x)).b(j10);
        AbstractC5366l.e("VideoFrameProcessor", "RenderedToOutputSurface", j10);
    }

    public final void F(C2368w c2368w, long j10) {
        C2368w m10 = this.f20763l.m();
        this.f20764m.a(j10);
        AbstractC4151s.D(m10.f24636b, m10.f24638d, m10.f24639e);
        AbstractC4151s.f();
        ((C5381t) AbstractC4134a.e(this.f20771t)).i(c2368w.f24635a, j10);
        long p10 = AbstractC4151s.p();
        this.f20765n.a(p10);
        ((j.a) AbstractC4134a.e(this.f20766o)).a(this, m10, j10, p10);
    }

    public void G(InterfaceC2367v interfaceC2367v, long j10) {
        this.f20759h.m();
        if (this.f20766o == null) {
            AbstractC4134a.g(!this.f20768q);
            if (!this.f20762k.isEmpty()) {
                Z0 z02 = (Z0) this.f20762k.remove();
                D(interfaceC2367v, z02.f55483a, z02.f55484b, j10);
                if (this.f20762k.isEmpty() && this.f20772u) {
                    ((b) AbstractC4134a.e(this.f20775x)).a();
                    this.f20772u = false;
                }
            }
        }
    }

    public void H(b bVar) {
        this.f20759h.m();
        this.f20775x = bVar;
    }

    public void I(List list, List list2) {
        this.f20759h.m();
        this.f20753b.clear();
        this.f20753b.addAll(list);
        this.f20754c.clear();
        this.f20754c.addAll(list2);
        this.f20776y = true;
    }

    public void J(final C2345N c2345n) {
        try {
            this.f20759h.g(new r.b() { // from class: l1.c0
                @Override // androidx.media3.effect.r.b
                public final void run() {
                    androidx.media3.effect.g.this.K(c2345n);
                }
            });
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f20760i.execute(new Runnable() { // from class: l1.d0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.g.this.f20761j.a(b1.V.a(e10));
                }
            });
        }
    }

    public final void K(C2345N c2345n) {
        if (this.f20766o == null && !Objects.equals(this.f20749A, c2345n)) {
            C2345N c2345n2 = this.f20749A;
            if (c2345n2 != null && (c2345n == null || !c2345n2.f24340a.equals(c2345n.f24340a))) {
                x();
            }
            C2345N c2345n3 = this.f20749A;
            this.f20777z = (c2345n3 != null && c2345n != null && c2345n3.f24341b == c2345n.f24341b && c2345n3.f24342c == c2345n.f24342c && c2345n3.f24343d == c2345n.f24343d) ? false : true;
            this.f20749A = c2345n;
        }
    }

    @Override // androidx.media3.effect.i
    public void c(InterfaceC2367v interfaceC2367v, C2368w c2368w, final long j10) {
        g gVar;
        this.f20759h.m();
        if (!A()) {
            this.f20760i.execute(new Runnable() { // from class: l1.i0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.g.this.f20761j.b(j10, false);
                }
            });
        }
        if (this.f20766o != null) {
            AbstractC4134a.g(this.f20763l.h() > 0);
            D(interfaceC2367v, c2368w, j10, j10 * 1000);
            return;
        }
        if (this.f20768q) {
            D(interfaceC2367v, c2368w, j10, j10 * 1000);
            gVar = this;
        } else {
            gVar = this;
            gVar.f20762k.add(new Z0(c2368w, j10));
            if (A()) {
                if (j10 == gVar.f20750B) {
                    gVar.f20750B = -9223372036854775807L;
                    gVar.f20760i.execute(new Runnable() { // from class: l1.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.media3.effect.g.this.f20761j.b(j10, true);
                        }
                    });
                    gVar.D(interfaceC2367v, c2368w, j10, InterfaceC4143j.f45530a.nanoTime());
                    gVar.f20762k.clear();
                } else {
                    gVar.f20773v.b(c2368w);
                }
            }
        }
        gVar.f20773v.e();
    }

    @Override // androidx.media3.effect.i
    public void f(Executor executor, i.a aVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.effect.i
    public void flush() {
        this.f20759h.m();
        if (this.f20766o != null) {
            this.f20763l.e();
            this.f20764m.b();
            this.f20765n.b();
        }
        this.f20762k.clear();
        this.f20772u = false;
        C5381t c5381t = this.f20771t;
        if (c5381t != null) {
            c5381t.flush();
        }
        this.f20773v.a();
        for (int i10 = 0; i10 < z(); i10++) {
            this.f20773v.e();
        }
    }

    @Override // androidx.media3.effect.i
    public void g() {
        this.f20759h.m();
        if (this.f20762k.isEmpty()) {
            ((b) AbstractC4134a.e(this.f20775x)).a();
            this.f20772u = false;
        } else {
            AbstractC4134a.g(!this.f20768q);
            this.f20772u = true;
        }
    }

    @Override // androidx.media3.effect.j
    public void k(final long j10) {
        this.f20759h.j(new r.b() { // from class: l1.h0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.g.this.C(j10);
            }
        });
    }

    @Override // androidx.media3.effect.i
    public void l(i.c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.effect.i
    public void m(C2368w c2368w) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.effect.i
    public void n(i.b bVar) {
        this.f20759h.m();
        this.f20773v = bVar;
        for (int i10 = 0; i10 < z(); i10++) {
            bVar.e();
        }
    }

    @Override // androidx.media3.effect.i
    public void release() {
        this.f20759h.m();
        C5381t c5381t = this.f20771t;
        if (c5381t != null) {
            c5381t.release();
        }
        try {
            this.f20763l.c();
            AbstractC4151s.B(this.f20755d, this.f20751C);
            AbstractC4151s.d();
        } catch (AbstractC4151s.a e10) {
            throw new V(e10);
        }
    }

    public final C5381t w(int i10, int i11, int i12) {
        AbstractC3445z.a k10 = new AbstractC3445z.a().k(this.f20753b);
        if (i10 != 0) {
            k10.a(new n.b().b(i10).a());
        }
        k10.a(L0.j(i11, i12, 0));
        C5381t r10 = C5381t.r(this.f20752a, k10.m(), this.f20754c, this.f20758g, this.f20767p);
        L e10 = r10.e(this.f20769r, this.f20770s);
        C2345N c2345n = this.f20749A;
        if (c2345n != null) {
            C2345N c2345n2 = (C2345N) AbstractC4134a.e(c2345n);
            AbstractC4134a.g(e10.b() == c2345n2.f24341b);
            AbstractC4134a.g(e10.a() == c2345n2.f24342c);
        }
        return r10;
    }

    public final void x() {
        if (this.f20751C == null) {
            return;
        }
        try {
            AbstractC4151s.C(this.f20755d, this.f20756e, this.f20757f, 1, 1);
            AbstractC4151s.B(this.f20755d, this.f20751C);
        } catch (AbstractC4151s.a e10) {
            this.f20760i.execute(new Runnable() { // from class: l1.f0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.g.this.f20761j.a(b1.V.a(e10));
                }
            });
        } finally {
            this.f20751C = null;
        }
    }

    public final boolean y(InterfaceC2367v interfaceC2367v, int i10, int i11) {
        boolean z10 = (this.f20769r == i10 && this.f20770s == i11 && this.f20774w != null) ? false : true;
        if (z10) {
            this.f20769r = i10;
            this.f20770s = i11;
            final L c10 = A0.c(i10, i11, this.f20753b);
            if (!Objects.equals(this.f20774w, c10)) {
                this.f20774w = c10;
                this.f20760i.execute(new Runnable() { // from class: l1.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.effect.g.this.f20761j.d(r1.b(), c10.a());
                    }
                });
            }
        }
        AbstractC4134a.e(this.f20774w);
        C2345N c2345n = this.f20749A;
        if (c2345n == null && this.f20766o == null) {
            AbstractC4134a.g(this.f20751C == null);
            C5381t c5381t = this.f20771t;
            if (c5381t != null) {
                c5381t.release();
                this.f20771t = null;
            }
            AbstractC4156x.i("FinalShaderWrapper", "Output surface and size not set, dropping frame.");
            return false;
        }
        int b10 = c2345n == null ? this.f20774w.b() : c2345n.f24341b;
        C2345N c2345n2 = this.f20749A;
        int a10 = c2345n2 == null ? this.f20774w.a() : c2345n2.f24342c;
        C2345N c2345n3 = this.f20749A;
        if (c2345n3 != null && this.f20751C == null) {
            this.f20751C = interfaceC2367v.a(this.f20755d, c2345n3.f24340a, this.f20758g.f24606c, c2345n3.f24344e);
        }
        if (this.f20766o != null) {
            this.f20763l.d(interfaceC2367v, b10, a10);
        }
        C5381t c5381t2 = this.f20771t;
        if (c5381t2 != null && (this.f20777z || z10 || this.f20776y)) {
            c5381t2.release();
            this.f20771t = null;
            this.f20777z = false;
            this.f20776y = false;
        }
        if (this.f20771t == null) {
            C2345N c2345n4 = this.f20749A;
            this.f20771t = w(c2345n4 == null ? 0 : c2345n4.f24343d, b10, a10);
            this.f20777z = false;
        }
        return true;
    }

    public final int z() {
        if (this.f20766o == null) {
            return 1;
        }
        return this.f20763l.h();
    }
}
