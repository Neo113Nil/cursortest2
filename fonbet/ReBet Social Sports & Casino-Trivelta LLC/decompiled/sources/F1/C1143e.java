package F1;

import F1.D;
import F1.P;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.a;
import b1.Y;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: F1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143e implements P {

    /* renamed from: a, reason: collision with root package name */
    public final z f3304a;

    /* renamed from: b, reason: collision with root package name */
    public final D f3305b;

    /* renamed from: c, reason: collision with root package name */
    public final Queue f3306c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f3307d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.media3.common.a f3308e;

    /* renamed from: f, reason: collision with root package name */
    public long f3309f;

    /* renamed from: g, reason: collision with root package name */
    public P.a f3310g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f3311h;

    /* renamed from: i, reason: collision with root package name */
    public y f3312i;

    /* renamed from: F1.e$b */
    public final class b implements D.a {

        /* renamed from: a, reason: collision with root package name */
        public androidx.media3.common.a f3313a;

        public b() {
        }

        @Override // F1.D.a
        public void a() {
            C1143e.this.f3311h.execute(new Runnable() { // from class: F1.g
                @Override // java.lang.Runnable
                public final void run() {
                    C1143e.this.f3310g.onFrameDropped();
                }
            });
            ((P.b) C1143e.this.f3306c.remove()).b();
        }

        @Override // F1.D.a
        public void b(long j10, long j11, boolean z10) {
            if (z10 && C1143e.this.f3307d != null) {
                C1143e.this.f3311h.execute(new Runnable() { // from class: F1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1143e.this.f3310g.f();
                    }
                });
            }
            androidx.media3.common.a aVar = this.f3313a;
            if (aVar == null) {
                aVar = new a.b().P();
            }
            C1143e.this.f3312i.e(j11, j10, aVar, null);
            ((P.b) C1143e.this.f3306c.remove()).a(j10);
        }

        @Override // F1.D.a
        public void c(final Y y10) {
            this.f3313a = new a.b().F0(y10.f24529a).h0(y10.f24530b).y0("video/raw").P();
            C1143e.this.f3311h.execute(new Runnable() { // from class: F1.h
                @Override // java.lang.Runnable
                public final void run() {
                    C1143e.this.f3310g.c(y10);
                }
            });
        }
    }

    public C1143e(z zVar, InterfaceC4143j interfaceC4143j) {
        this.f3304a = zVar;
        zVar.m(interfaceC4143j);
        this.f3305b = new D(new b(), zVar);
        this.f3306c = new ArrayDeque();
        this.f3308e = new a.b().P();
        this.f3309f = -9223372036854775807L;
        this.f3310g = P.a.f3300a;
        this.f3311h = new Executor() { // from class: F1.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C1143e.a(runnable);
            }
        };
        this.f3312i = new y() { // from class: F1.c
            @Override // F1.y
            public final void e(long j10, long j11, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
                C1143e.f(j10, j11, aVar, mediaFormat);
            }
        };
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void f(long j10, long j11, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
    }

    @Override // F1.P
    public boolean b() {
        return this.f3305b.d();
    }

    @Override // F1.P
    public Surface d() {
        return (Surface) AbstractC4134a.i(this.f3307d);
    }

    @Override // F1.P
    public void e() {
        throw new UnsupportedOperationException();
    }

    @Override // F1.P
    public void g() {
        this.f3305b.l();
    }

    @Override // F1.P
    public void h(long j10, long j11) {
        try {
            this.f3305b.j(j10, j11);
        } catch (m1.I e10) {
            throw new P.c(e10, this.f3308e);
        }
    }

    @Override // F1.P
    public boolean isInitialized() {
        return true;
    }

    @Override // F1.P
    public void j(P.a aVar, Executor executor) {
        this.f3310g = aVar;
        this.f3311h = executor;
    }

    @Override // F1.P
    public void k(int i10, androidx.media3.common.a aVar, long j10, int i11, List list) {
        AbstractC4134a.g(list.isEmpty());
        int i12 = aVar.f20550v;
        androidx.media3.common.a aVar2 = this.f3308e;
        if (i12 != aVar2.f20550v || aVar.f20551w != aVar2.f20551w) {
            this.f3305b.i(i12, aVar.f20551w);
        }
        float f10 = aVar.f20554z;
        if (f10 != this.f3308e.f20554z) {
            this.f3304a.n(f10);
        }
        this.f3308e = aVar;
        if (j10 != this.f3309f) {
            this.f3305b.h(i11, j10);
            this.f3309f = j10;
        }
    }

    @Override // F1.P
    public void l(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // F1.P
    public void m(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // F1.P
    public boolean n(boolean z10) {
        return this.f3304a.d(z10);
    }

    @Override // F1.P
    public boolean o(androidx.media3.common.a aVar) {
        return true;
    }

    @Override // F1.P
    public void p() {
        this.f3304a.a();
    }

    @Override // F1.P
    public void q() {
        this.f3304a.i();
    }

    @Override // F1.P
    public void r() {
        this.f3304a.h();
    }

    @Override // F1.P
    public boolean s(long j10, P.b bVar) {
        this.f3306c.add(bVar);
        this.f3305b.g(j10);
        this.f3311h.execute(new Runnable() { // from class: F1.d
            @Override // java.lang.Runnable
            public final void run() {
                C1143e.this.f3310g.i();
            }
        });
        return true;
    }

    @Override // F1.P
    public void t(y yVar) {
        this.f3312i = yVar;
    }

    @Override // F1.P
    public void u(int i10) {
        this.f3304a.l(i10);
    }

    @Override // F1.P
    public void v(float f10) {
        this.f3304a.p(f10);
    }

    @Override // F1.P
    public void w() {
        this.f3307d = null;
        this.f3304a.o(null);
    }

    @Override // F1.P
    public void x(Surface surface, e1.L l10) {
        this.f3307d = surface;
        this.f3304a.o(surface);
    }

    @Override // F1.P
    public void y(boolean z10) {
        if (z10) {
            this.f3304a.k();
        }
        this.f3305b.b();
        this.f3306c.clear();
    }

    @Override // F1.P
    public void z(boolean z10) {
        this.f3304a.e(z10);
    }

    @Override // F1.P
    public void release() {
    }
}
