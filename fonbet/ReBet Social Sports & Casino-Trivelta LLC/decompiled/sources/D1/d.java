package D1;

import D1.d;
import android.os.Handler;
import e1.AbstractC4134a;
import h1.InterfaceC4403F;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface d {

    public interface a {

        /* renamed from: D1.d$a$a, reason: collision with other inner class name */
        public static final class C0045a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f2339a = new CopyOnWriteArrayList();

            /* renamed from: D1.d$a$a$a, reason: collision with other inner class name */
            public static final class C0046a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f2340a;

                /* renamed from: b, reason: collision with root package name */
                public final a f2341b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f2342c;

                public C0046a(Handler handler, a aVar) {
                    this.f2340a = handler;
                    this.f2341b = aVar;
                }

                public void d() {
                    this.f2342c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                AbstractC4134a.e(handler);
                AbstractC4134a.e(aVar);
                d(aVar);
                this.f2339a.add(new C0046a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                Iterator it = this.f2339a.iterator();
                while (it.hasNext()) {
                    final C0046a c0046a = (C0046a) it.next();
                    if (c0046a.f2342c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0046a.f2340a.post(new Runnable() { // from class: D1.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0045a.C0046a.this.f2341b.G(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                Iterator it = this.f2339a.iterator();
                while (it.hasNext()) {
                    C0046a c0046a = (C0046a) it.next();
                    if (c0046a.f2341b == aVar) {
                        c0046a.d();
                        this.f2339a.remove(c0046a);
                    }
                }
            }
        }

        void G(int i10, long j10, long j11);
    }

    default long b() {
        return -9223372036854775807L;
    }

    void d(Handler handler, a aVar);

    void e(a aVar);

    InterfaceC4403F g();

    long h();
}
