package F1;

import F1.O;
import android.os.Handler;
import android.os.SystemClock;
import b1.Y;
import e1.AbstractC4134a;
import e1.Z;
import m1.C5507g;
import m1.C5509h;

/* loaded from: classes.dex */
public interface O {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f3298a;

        /* renamed from: b, reason: collision with root package name */
        public final O f3299b;

        public a(Handler handler, O o10) {
            this.f3298a = o10 != null ? (Handler) AbstractC4134a.e(handler) : null;
            this.f3299b = o10;
        }

        public static /* synthetic */ void d(a aVar, C5507g c5507g) {
            aVar.getClass();
            c5507g.c();
            ((O) Z.i(aVar.f3299b)).l(c5507g);
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).h(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).g(str);
                    }
                });
            }
        }

        public void m(final C5507g c5507g) {
            c5507g.c();
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.a.d(O.a.this, c5507g);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).t(i10, j10);
                    }
                });
            }
        }

        public void o(final C5507g c5507g) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).z(c5507g);
                    }
                });
            }
        }

        public void p(final androidx.media3.common.a aVar, final C5509h c5509h) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).s(aVar, c5509h);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f3298a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f3298a.post(new Runnable() { // from class: F1.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).v(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).B(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).p(exc);
                    }
                });
            }
        }

        public void t(final Y y10) {
            Handler handler = this.f3298a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: F1.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((O) Z.i(O.a.this.f3299b)).c(y10);
                    }
                });
            }
        }
    }

    void B(long j10, int i10);

    void c(Y y10);

    void g(String str);

    void h(String str, long j10, long j11);

    void l(C5507g c5507g);

    void p(Exception exc);

    void s(androidx.media3.common.a aVar, C5509h c5509h);

    void t(int i10, long j10);

    void v(Object obj, long j10);

    void z(C5507g c5507g);
}
