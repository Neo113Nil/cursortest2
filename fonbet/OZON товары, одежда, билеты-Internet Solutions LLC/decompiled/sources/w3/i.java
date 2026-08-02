package w3;

import E.a0;
import E.b0;
import F3.InterfaceC3018x;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.N;
import w3.i;

/* loaded from: classes.dex */
public interface i {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f103476a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC3018x.b f103477b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C2244a> f103478c;

        /* renamed from: w3.i$a$a, reason: collision with other inner class name */
        private static final class C2244a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f103479a;

            /* renamed from: b, reason: collision with root package name */
            public i f103480b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(Handler handler, i iVar) {
            handler.getClass();
            iVar.getClass();
            C2244a c2244a = new C2244a();
            c2244a.f103479a = handler;
            c2244a.f103480b = iVar;
            this.f103478c.add(c2244a);
        }

        public final void b() {
            Iterator<C2244a> it = this.f103478c.iterator();
            while (it.hasNext()) {
                C2244a next = it.next();
                N.V(next.f103479a, new b0(5, this, next.f103480b));
            }
        }

        public final void c() {
            Iterator<C2244a> it = this.f103478c.iterator();
            while (it.hasNext()) {
                C2244a next = it.next();
                N.V(next.f103479a, new a0(4, this, next.f103480b));
            }
        }

        public final void d(final int i11) {
            Iterator<C2244a> it = this.f103478c.iterator();
            while (it.hasNext()) {
                C2244a next = it.next();
                final i iVar = next.f103480b;
                N.V(next.f103479a, new Runnable() { // from class: w3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.a aVar = i.a.this;
                        int i12 = aVar.f103476a;
                        iVar.A(i12, aVar.f103477b, i11);
                    }
                });
            }
        }

        public final void e(Exception exc) {
            Iterator<C2244a> it = this.f103478c.iterator();
            while (it.hasNext()) {
                C2244a next = it.next();
                N.V(next.f103479a, new VW.b(this, next.f103480b, exc, 1));
            }
        }

        public final void f() {
            Iterator<C2244a> it = this.f103478c.iterator();
            while (it.hasNext()) {
                C2244a next = it.next();
                N.V(next.f103479a, new J2.b(6, this, next.f103480b));
            }
        }

        public final void g(i iVar) {
            CopyOnWriteArrayList<C2244a> copyOnWriteArrayList = this.f103478c;
            Iterator<C2244a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C2244a next = it.next();
                if (next.f103480b == iVar) {
                    copyOnWriteArrayList.remove(next);
                }
            }
        }

        public final a h(int i11, InterfaceC3018x.b bVar) {
            return new a(this.f103478c, i11, bVar);
        }

        private a(CopyOnWriteArrayList<C2244a> copyOnWriteArrayList, int i11, InterfaceC3018x.b bVar) {
            this.f103478c = copyOnWriteArrayList;
            this.f103476a = i11;
            this.f103477b = bVar;
        }
    }

    default void A(int i11, InterfaceC3018x.b bVar, int i12) {
    }

    default void F(int i11, InterfaceC3018x.b bVar) {
    }

    default void P(int i11, InterfaceC3018x.b bVar) {
    }

    default void V(int i11, InterfaceC3018x.b bVar) {
    }

    default void q(int i11, InterfaceC3018x.b bVar, Exception exc) {
    }
}
