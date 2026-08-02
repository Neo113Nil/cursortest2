package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class U implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f30694a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f30695b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30696c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30697d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30698e;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f30699a;

        /* renamed from: b, reason: collision with root package name */
        public final CopyOnWriteArraySet f30700b = D6.m.a();

        /* renamed from: c, reason: collision with root package name */
        public Closeable f30701c;

        /* renamed from: d, reason: collision with root package name */
        public float f30702d;

        /* renamed from: e, reason: collision with root package name */
        public int f30703e;

        /* renamed from: f, reason: collision with root package name */
        public C3021e f30704f;

        /* renamed from: g, reason: collision with root package name */
        public b f30705g;

        /* renamed from: com.facebook.imagepipeline.producers.U$a$a, reason: collision with other inner class name */
        public class C0479a extends AbstractC3022f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Pair f30707a;

            public C0479a(Pair pair) {
                this.f30707a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3022f, com.facebook.imagepipeline.producers.f0
            public void a() {
                C3021e.b(a.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                boolean remove;
                List list;
                C3021e c3021e;
                List list2;
                List list3;
                synchronized (a.this) {
                    try {
                        remove = a.this.f30700b.remove(this.f30707a);
                        list = null;
                        if (!remove) {
                            c3021e = null;
                            list2 = null;
                        } else if (a.this.f30700b.isEmpty()) {
                            c3021e = a.this.f30704f;
                            list2 = null;
                        } else {
                            List s10 = a.this.s();
                            list2 = a.this.t();
                            list3 = a.this.r();
                            c3021e = null;
                            list = s10;
                        }
                        list3 = list2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C3021e.c(list);
                C3021e.e(list2);
                C3021e.b(list3);
                if (c3021e != null) {
                    if (!U.this.f30696c || c3021e.n1()) {
                        c3021e.f();
                    } else {
                        C3021e.e(c3021e.j(B7.f.f844b));
                    }
                }
                if (remove) {
                    ((InterfaceC3030n) this.f30707a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3022f, com.facebook.imagepipeline.producers.f0
            public void c() {
                C3021e.e(a.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3022f, com.facebook.imagepipeline.producers.f0
            public void d() {
                C3021e.c(a.this.s());
            }
        }

        public class b extends AbstractC3019c {
            @Override // com.facebook.imagepipeline.producers.AbstractC3019c
            public void f() {
                try {
                    if (N7.b.d()) {
                        N7.b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                } catch (Throwable th2) {
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3019c
            public void g(Throwable th2) {
                try {
                    if (N7.b.d()) {
                        N7.b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th2);
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                } catch (Throwable th3) {
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                    throw th3;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3019c
            public void i(float f10) {
                try {
                    if (N7.b.d()) {
                        N7.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f10);
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                } catch (Throwable th2) {
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3019c
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public void h(Closeable closeable, int i10) {
                try {
                    if (N7.b.d()) {
                        N7.b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, closeable, i10);
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                } catch (Throwable th2) {
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                    throw th2;
                }
            }

            public b() {
            }
        }

        public a(Object obj) {
            this.f30699a = obj;
        }

        public final void g(Pair pair, e0 e0Var) {
            e0Var.k(new C0479a(pair));
        }

        public boolean h(InterfaceC3030n interfaceC3030n, e0 e0Var) {
            Pair create = Pair.create(interfaceC3030n, e0Var);
            synchronized (this) {
                try {
                    if (U.this.i(this.f30699a) != this) {
                        return false;
                    }
                    this.f30700b.add(create);
                    List s10 = s();
                    List t10 = t();
                    List r10 = r();
                    Closeable closeable = this.f30701c;
                    float f10 = this.f30702d;
                    int i10 = this.f30703e;
                    C3021e.c(s10);
                    C3021e.e(t10);
                    C3021e.b(r10);
                    synchronized (create) {
                        try {
                            synchronized (this) {
                                if (closeable != this.f30701c) {
                                    closeable = null;
                                } else if (closeable != null) {
                                    closeable = U.this.g(closeable);
                                }
                            }
                            if (closeable != null) {
                                if (f10 > 0.0f) {
                                    interfaceC3030n.c(f10);
                                }
                                interfaceC3030n.b(closeable, i10);
                                i(closeable);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        } finally {
                        }
                    }
                    g(create, e0Var);
                    return true;
                } finally {
                }
            }
        }

        public final void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        public final synchronized boolean j() {
            Iterator it = this.f30700b.iterator();
            while (it.hasNext()) {
                if (((e0) ((Pair) it.next()).second).A0()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean k() {
            Iterator it = this.f30700b.iterator();
            while (it.hasNext()) {
                if (!((e0) ((Pair) it.next()).second).n1()) {
                    return false;
                }
            }
            return true;
        }

        public final synchronized B7.f l() {
            B7.f fVar;
            fVar = B7.f.f844b;
            Iterator it = this.f30700b.iterator();
            while (it.hasNext()) {
                fVar = B7.f.b(fVar, ((e0) ((Pair) it.next()).second).getPriority());
            }
            return fVar;
        }

        public void m(b bVar) {
            synchronized (this) {
                try {
                    if (this.f30705g != bVar) {
                        return;
                    }
                    this.f30705g = null;
                    this.f30704f = null;
                    i(this.f30701c);
                    this.f30701c = null;
                    q(com.facebook.common.util.e.UNSET);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void n(b bVar, Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f30705g != bVar) {
                        return;
                    }
                    Iterator it = this.f30700b.iterator();
                    this.f30700b.clear();
                    U.this.k(this.f30699a, this);
                    i(this.f30701c);
                    this.f30701c = null;
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            try {
                                ((e0) pair.second).z0().k((e0) pair.second, U.this.f30697d, th2, null);
                                C3021e c3021e = this.f30704f;
                                if (c3021e != null) {
                                    ((e0) pair.second).m1(c3021e.getExtras());
                                }
                                ((InterfaceC3030n) pair.first).onFailure(th2);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void o(b bVar, Closeable closeable, int i10) {
            synchronized (this) {
                try {
                    if (this.f30705g != bVar) {
                        return;
                    }
                    i(this.f30701c);
                    this.f30701c = null;
                    Iterator it = this.f30700b.iterator();
                    int size = this.f30700b.size();
                    if (AbstractC3019c.e(i10)) {
                        this.f30701c = U.this.g(closeable);
                        this.f30703e = i10;
                    } else {
                        this.f30700b.clear();
                        U.this.k(this.f30699a, this);
                    }
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            try {
                                if (AbstractC3019c.d(i10)) {
                                    ((e0) pair.second).z0().j((e0) pair.second, U.this.f30697d, null);
                                    C3021e c3021e = this.f30704f;
                                    if (c3021e != null) {
                                        ((e0) pair.second).m1(c3021e.getExtras());
                                    }
                                    ((e0) pair.second).U(U.this.f30698e, Integer.valueOf(size));
                                }
                                ((InterfaceC3030n) pair.first).b(closeable, i10);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void p(b bVar, float f10) {
            synchronized (this) {
                try {
                    if (this.f30705g != bVar) {
                        return;
                    }
                    this.f30702d = f10;
                    Iterator it = this.f30700b.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            ((InterfaceC3030n) pair.first).c(f10);
                        }
                    }
                } finally {
                }
            }
        }

        public final void q(com.facebook.common.util.e eVar) {
            synchronized (this) {
                try {
                    D6.k.b(Boolean.valueOf(this.f30704f == null));
                    D6.k.b(Boolean.valueOf(this.f30705g == null));
                    if (this.f30700b.isEmpty()) {
                        U.this.k(this.f30699a, this);
                        return;
                    }
                    e0 e0Var = (e0) ((Pair) this.f30700b.iterator().next()).second;
                    C3021e c3021e = new C3021e(e0Var.D0(), e0Var.getId(), e0Var.z0(), e0Var.d(), e0Var.T1(), k(), j(), l(), e0Var.r());
                    this.f30704f = c3021e;
                    c3021e.m1(e0Var.getExtras());
                    if (eVar.b()) {
                        this.f30704f.U("started_as_prefetch", Boolean.valueOf(eVar.a()));
                    }
                    b bVar = new b();
                    this.f30705g = bVar;
                    U.this.f30695b.b(bVar, this.f30704f);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final synchronized List r() {
            C3021e c3021e = this.f30704f;
            if (c3021e == null) {
                return null;
            }
            return c3021e.h(j());
        }

        public final synchronized List s() {
            C3021e c3021e = this.f30704f;
            if (c3021e == null) {
                return null;
            }
            return c3021e.i(k());
        }

        public final synchronized List t() {
            C3021e c3021e = this.f30704f;
            if (c3021e == null) {
                return null;
            }
            return c3021e.j(l());
        }
    }

    public U(d0 d0Var, String str, String str2) {
        this(d0Var, str, str2, false);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        a i10;
        boolean z10;
        try {
            if (N7.b.d()) {
                N7.b.a("MultiplexProducer#produceResults");
            }
            e0Var.z0().d(e0Var, this.f30697d);
            Object j10 = j(e0Var);
            do {
                synchronized (this) {
                    try {
                        i10 = i(j10);
                        if (i10 == null) {
                            i10 = h(j10);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } finally {
                    }
                }
            } while (!i10.h(interfaceC3030n, e0Var));
            if (z10) {
                i10.q(com.facebook.common.util.e.c(e0Var.n1()));
            }
            if (N7.b.d()) {
                N7.b.b();
            }
        } catch (Throwable th2) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th2;
        }
    }

    public abstract Closeable g(Closeable closeable);

    public final synchronized a h(Object obj) {
        a aVar;
        aVar = new a(obj);
        this.f30694a.put(obj, aVar);
        return aVar;
    }

    public synchronized a i(Object obj) {
        return (a) this.f30694a.get(obj);
    }

    public abstract Object j(e0 e0Var);

    public synchronized void k(Object obj, a aVar) {
        if (this.f30694a.get(obj) == aVar) {
            this.f30694a.remove(obj);
        }
    }

    public U(d0 d0Var, String str, String str2, boolean z10) {
        this.f30695b = d0Var;
        this.f30694a = new HashMap();
        this.f30696c = z10;
        this.f30697d = str;
        this.f30698e = str2;
    }
}
