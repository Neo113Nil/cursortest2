package q1;

import android.os.Handler;
import androidx.media3.exoplayer.source.D;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q1.t;

/* loaded from: classes.dex */
public interface t {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f63345a;

        /* renamed from: b, reason: collision with root package name */
        public final D.b f63346b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f63347c;

        /* renamed from: q1.t$a$a, reason: collision with other inner class name */
        public static final class C0875a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f63348a;

            /* renamed from: b, reason: collision with root package name */
            public t f63349b;

            public C0875a(Handler handler, t tVar) {
                this.f63348a = handler;
                this.f63349b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, t tVar) {
            AbstractC4134a.e(handler);
            AbstractC4134a.e(tVar);
            this.f63347c.add(new C0875a(handler, tVar));
        }

        public void h() {
            Iterator it = this.f63347c.iterator();
            while (it.hasNext()) {
                C0875a c0875a = (C0875a) it.next();
                final t tVar = c0875a.f63349b;
                Z.l1(c0875a.f63348a, new Runnable() { // from class: q1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.O(r0.f63345a, t.a.this.f63346b);
                    }
                });
            }
        }

        public void i() {
            Iterator it = this.f63347c.iterator();
            while (it.hasNext()) {
                C0875a c0875a = (C0875a) it.next();
                final t tVar = c0875a.f63349b;
                Z.l1(c0875a.f63348a, new Runnable() { // from class: q1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.Y(r0.f63345a, t.a.this.f63346b);
                    }
                });
            }
        }

        public void j() {
            Iterator it = this.f63347c.iterator();
            while (it.hasNext()) {
                C0875a c0875a = (C0875a) it.next();
                final t tVar = c0875a.f63349b;
                Z.l1(c0875a.f63348a, new Runnable() { // from class: q1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.k0(r0.f63345a, t.a.this.f63346b);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator it = this.f63347c.iterator();
            while (it.hasNext()) {
                C0875a c0875a = (C0875a) it.next();
                final t tVar = c0875a.f63349b;
                Z.l1(c0875a.f63348a, new Runnable() { // from class: q1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.T(r0.f63345a, t.a.this.f63346b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator it = this.f63347c.iterator();
            while (it.hasNext()) {
                C0875a c0875a = (C0875a) it.next();
                final t tVar = c0875a.f63349b;
                Z.l1(c0875a.f63348a, new Runnable() { // from class: q1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.Z(r0.f63345a, t.a.this.f63346b, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator it = this.f63347c.iterator();
            while (it.hasNext()) {
                C0875a c0875a = (C0875a) it.next();
                final t tVar = c0875a.f63349b;
                Z.l1(c0875a.f63348a, new Runnable() { // from class: q1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.p0(r0.f63345a, t.a.this.f63346b);
                    }
                });
            }
        }

        public void n(t tVar) {
            Iterator it = this.f63347c.iterator();
            while (it.hasNext()) {
                C0875a c0875a = (C0875a) it.next();
                if (c0875a.f63349b == tVar) {
                    this.f63347c.remove(c0875a);
                }
            }
        }

        public a o(int i10, D.b bVar) {
            return new a(this.f63347c, i10, bVar);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, D.b bVar) {
            this.f63347c = copyOnWriteArrayList;
            this.f63345a = i10;
            this.f63346b = bVar;
        }
    }

    void O(int i10, D.b bVar);

    void T(int i10, D.b bVar, int i11);

    void Y(int i10, D.b bVar);

    void Z(int i10, D.b bVar, Exception exc);

    void k0(int i10, D.b bVar);

    void p0(int i10, D.b bVar);
}
