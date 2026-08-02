package v3;

import android.os.Handler;
import j3.C7272n;
import t3.C9737c;
import t3.C9738d;
import v3.o;

/* loaded from: classes.dex */
public interface o {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f101930a;

        /* renamed from: b, reason: collision with root package name */
        private final o f101931b;

        public a(Handler handler, o oVar) {
            this.f101930a = handler;
            this.f101931b = oVar;
        }

        public static void a(a aVar, boolean z11) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.r(z11);
        }

        public static void b(a aVar, int i11, long j11, long j12) {
            aVar.getClass();
            int i12 = m3.N.f74289a;
            aVar.f101931b.z(i11, j11, j12);
        }

        public static void c(a aVar, C9737c c9737c) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.h(c9737c);
        }

        public static void d(a aVar, C9737c c9737c) {
            aVar.getClass();
            synchronized (c9737c) {
            }
            o oVar = aVar.f101931b;
            int i11 = m3.N.f74289a;
            oVar.y(c9737c);
        }

        public static void e(a aVar, long j11) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.u(j11);
        }

        public static void f(a aVar, p pVar) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.w(pVar);
        }

        public static void g(a aVar, Exception exc) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.n(exc);
        }

        public static void h(a aVar, C7272n c7272n, C9738d c9738d) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.o(c7272n, c9738d);
        }

        public static void i(a aVar, p pVar) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.l(pVar);
        }

        public static void j(a aVar, int i11) {
            aVar.getClass();
            int i12 = m3.N.f74289a;
            aVar.f101931b.c(i11);
        }

        public static void k(a aVar, Exception exc) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.s(exc);
        }

        public static void l(a aVar, String str, long j11, long j12) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.e(str, j11, j12);
        }

        public static void m(a aVar, String str) {
            aVar.getClass();
            int i11 = m3.N.f74289a;
            aVar.f101931b.d(str);
        }

        public final void n(Exception exc) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new L3.D(3, this, exc));
            }
        }

        public final void o(final int i11) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.j(o.a.this, i11);
                    }
                });
            }
        }

        public final void p(Exception exc) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new HS.a(3, this, exc));
            }
        }

        public final void q(final p pVar) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.i(o.a.this, pVar);
                    }
                });
            }
        }

        public final void r(final p pVar) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.f(o.a.this, pVar);
                    }
                });
            }
        }

        public final void s(final String str, final long j11, final long j12) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.l(o.a.this, str, j11, j12);
                    }
                });
            }
        }

        public final void t(String str) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new io.sentry.cache.j(1, this, str));
            }
        }

        public final void u(final C9737c c9737c) {
            synchronized (c9737c) {
            }
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.d(o.a.this, c9737c);
                    }
                });
            }
        }

        public final void v(C9737c c9737c) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new L3.J(2, this, c9737c));
            }
        }

        public final void w(final C7272n c7272n, final C9738d c9738d) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.h(o.a.this, c7272n, c9738d);
                    }
                });
            }
        }

        public final void x(final long j11) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.e(o.a.this, j11);
                    }
                });
            }
        }

        public final void y(final boolean z11) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.a(o.a.this, z11);
                    }
                });
            }
        }

        public final void z(final int i11, final long j11, final long j12) {
            Handler handler = this.f101930a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.b(o.a.this, i11, j11, j12);
                    }
                });
            }
        }
    }

    default void c(int i11) {
    }

    default void d(String str) {
    }

    default void e(String str, long j11, long j12) {
    }

    default void h(C9737c c9737c) {
    }

    default void l(p pVar) {
    }

    default void n(Exception exc) {
    }

    default void o(C7272n c7272n, C9738d c9738d) {
    }

    default void r(boolean z11) {
    }

    default void s(Exception exc) {
    }

    default void u(long j11) {
    }

    default void w(p pVar) {
    }

    default void y(C9737c c9737c) {
    }

    default void z(int i11, long j11, long j12) {
    }
}
