package o1;

import android.os.Handler;
import e1.AbstractC4134a;
import m1.C5507g;
import m1.C5509h;
import o1.InterfaceC5772y;
import o1.InterfaceC5773z;

/* renamed from: o1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5772y {

    /* renamed from: o1.y$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f58883a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC5772y f58884b;

        public a(Handler handler, InterfaceC5772y interfaceC5772y) {
            this.f58883a = interfaceC5772y != null ? (Handler) AbstractC4134a.e(handler) : null;
            this.f58884b = interfaceC5772y;
        }

        public static /* synthetic */ void d(a aVar, C5507g c5507g) {
            aVar.getClass();
            c5507g.c();
            ((InterfaceC5772y) e1.Z.i(aVar.f58884b)).i(c5507g);
        }

        public void n(final Exception exc) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).x(exc);
                    }
                });
            }
        }

        public void o(final int i10) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).a(i10);
                    }
                });
            }
        }

        public void p(final Exception exc) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).d(exc);
                    }
                });
            }
        }

        public void q(final InterfaceC5773z.a aVar) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).e(aVar);
                    }
                });
            }
        }

        public void r(final InterfaceC5773z.a aVar) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).f(aVar);
                    }
                });
            }
        }

        public void s(final String str, final long j10, final long j11) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).k(str, j10, j11);
                    }
                });
            }
        }

        public void t(final String str) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).j(str);
                    }
                });
            }
        }

        public void u(final C5507g c5507g) {
            c5507g.c();
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5772y.a.d(InterfaceC5772y.a.this, c5507g);
                    }
                });
            }
        }

        public void v(final C5507g c5507g) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).q(c5507g);
                    }
                });
            }
        }

        public void w(final androidx.media3.common.a aVar, final C5509h c5509h) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).r(aVar, c5509h);
                    }
                });
            }
        }

        public void x(final long j10) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).o(j10);
                    }
                });
            }
        }

        public void y(final boolean z10) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).b(z10);
                    }
                });
            }
        }

        public void z(final int i10, final long j10, final long j11) {
            Handler handler = this.f58883a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC5772y) e1.Z.i(InterfaceC5772y.a.this.f58884b)).A(i10, j10, j11);
                    }
                });
            }
        }
    }

    void A(int i10, long j10, long j11);

    void a(int i10);

    void b(boolean z10);

    void d(Exception exc);

    void e(InterfaceC5773z.a aVar);

    void f(InterfaceC5773z.a aVar);

    void i(C5507g c5507g);

    void j(String str);

    void k(String str, long j10, long j11);

    void o(long j10);

    void q(C5507g c5507g);

    void r(androidx.media3.common.a aVar, C5509h c5509h);

    void x(Exception exc);
}
