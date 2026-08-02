package com.bumptech.glide.load.engine;

import P4.a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class l implements h.b, a.f {

    /* renamed from: z, reason: collision with root package name */
    public static final c f29854z = new c();

    /* renamed from: a, reason: collision with root package name */
    public final e f29855a;

    /* renamed from: b, reason: collision with root package name */
    public final P4.c f29856b;

    /* renamed from: c, reason: collision with root package name */
    public final p.a f29857c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6775d f29858d;

    /* renamed from: e, reason: collision with root package name */
    public final c f29859e;

    /* renamed from: f, reason: collision with root package name */
    public final m f29860f;

    /* renamed from: g, reason: collision with root package name */
    public final A4.a f29861g;

    /* renamed from: h, reason: collision with root package name */
    public final A4.a f29862h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.a f29863i;

    /* renamed from: j, reason: collision with root package name */
    public final A4.a f29864j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f29865k;

    /* renamed from: l, reason: collision with root package name */
    public com.bumptech.glide.load.g f29866l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29867m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29868n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29869o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29870p;

    /* renamed from: q, reason: collision with root package name */
    public v f29871q;

    /* renamed from: r, reason: collision with root package name */
    public com.bumptech.glide.load.a f29872r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f29873s;

    /* renamed from: t, reason: collision with root package name */
    public q f29874t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29875u;

    /* renamed from: v, reason: collision with root package name */
    public p f29876v;

    /* renamed from: w, reason: collision with root package name */
    public h f29877w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f29878x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29879y;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final L4.i f29880a;

        public a(L4.i iVar) {
            this.f29880a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f29880a.f()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f29855a.b(this.f29880a)) {
                            l.this.f(this.f29880a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final L4.i f29882a;

        public b(L4.i iVar) {
            this.f29882a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f29882a.f()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f29855a.b(this.f29882a)) {
                            l.this.f29876v.b();
                            l.this.g(this.f29882a);
                            l.this.r(this.f29882a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static class c {
        public p a(v vVar, boolean z10, com.bumptech.glide.load.g gVar, p.a aVar) {
            return new p(vVar, z10, true, gVar, aVar);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final L4.i f29884a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f29885b;

        public d(L4.i iVar, Executor executor) {
            this.f29884a = iVar;
            this.f29885b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f29884a.equals(((d) obj).f29884a);
            }
            return false;
        }

        public int hashCode() {
            return this.f29884a.hashCode();
        }
    }

    public static final class e implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        public final List f29886a;

        public e() {
            this(new ArrayList(2));
        }

        public static d e(L4.i iVar) {
            return new d(iVar, com.bumptech.glide.util.e.a());
        }

        public void a(L4.i iVar, Executor executor) {
            this.f29886a.add(new d(iVar, executor));
        }

        public boolean b(L4.i iVar) {
            return this.f29886a.contains(e(iVar));
        }

        public e c() {
            return new e(new ArrayList(this.f29886a));
        }

        public void clear() {
            this.f29886a.clear();
        }

        public void f(L4.i iVar) {
            this.f29886a.remove(e(iVar));
        }

        public boolean isEmpty() {
            return this.f29886a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f29886a.iterator();
        }

        public int size() {
            return this.f29886a.size();
        }

        public e(List list) {
            this.f29886a = list;
        }
    }

    public l(A4.a aVar, A4.a aVar2, A4.a aVar3, A4.a aVar4, m mVar, p.a aVar5, InterfaceC6775d interfaceC6775d) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, interfaceC6775d, f29854z);
    }

    private synchronized void q() {
        if (this.f29866l == null) {
            throw new IllegalArgumentException();
        }
        this.f29855a.clear();
        this.f29866l = null;
        this.f29876v = null;
        this.f29871q = null;
        this.f29875u = false;
        this.f29878x = false;
        this.f29873s = false;
        this.f29879y = false;
        this.f29877w.w(false);
        this.f29877w = null;
        this.f29874t = null;
        this.f29872r = null;
        this.f29858d.release(this);
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(h hVar) {
        j().execute(hVar);
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(v vVar, com.bumptech.glide.load.a aVar, boolean z10) {
        synchronized (this) {
            this.f29871q = vVar;
            this.f29872r = aVar;
            this.f29879y = z10;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(q qVar) {
        synchronized (this) {
            this.f29874t = qVar;
        }
        n();
    }

    @Override // P4.a.f
    public P4.c d() {
        return this.f29856b;
    }

    public synchronized void e(L4.i iVar, Executor executor) {
        try {
            this.f29856b.c();
            this.f29855a.a(iVar, executor);
            if (this.f29873s) {
                k(1);
                executor.execute(new b(iVar));
            } else if (this.f29875u) {
                k(1);
                executor.execute(new a(iVar));
            } else {
                com.bumptech.glide.util.k.a(!this.f29878x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void f(L4.i iVar) {
        try {
            iVar.c(this.f29874t);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    public void g(L4.i iVar) {
        try {
            iVar.b(this.f29876v, this.f29872r, this.f29879y);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    public void h() {
        if (m()) {
            return;
        }
        this.f29878x = true;
        this.f29877w.b();
        this.f29860f.c(this, this.f29866l);
    }

    public void i() {
        p pVar;
        synchronized (this) {
            try {
                this.f29856b.c();
                com.bumptech.glide.util.k.a(m(), "Not yet complete!");
                int decrementAndGet = this.f29865k.decrementAndGet();
                com.bumptech.glide.util.k.a(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    pVar = this.f29876v;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            pVar.e();
        }
    }

    public final A4.a j() {
        return this.f29868n ? this.f29863i : this.f29869o ? this.f29864j : this.f29862h;
    }

    public synchronized void k(int i10) {
        p pVar;
        com.bumptech.glide.util.k.a(m(), "Not yet complete!");
        if (this.f29865k.getAndAdd(i10) == 0 && (pVar = this.f29876v) != null) {
            pVar.b();
        }
    }

    public synchronized l l(com.bumptech.glide.load.g gVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f29866l = gVar;
        this.f29867m = z10;
        this.f29868n = z11;
        this.f29869o = z12;
        this.f29870p = z13;
        return this;
    }

    public final boolean m() {
        return this.f29875u || this.f29873s || this.f29878x;
    }

    public void n() {
        synchronized (this) {
            try {
                this.f29856b.c();
                if (this.f29878x) {
                    q();
                    return;
                }
                if (this.f29855a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f29875u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f29875u = true;
                com.bumptech.glide.load.g gVar = this.f29866l;
                e c10 = this.f29855a.c();
                k(c10.size() + 1);
                this.f29860f.b(this, gVar, null);
                Iterator it = c10.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f29885b.execute(new a(dVar.f29884a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o() {
        synchronized (this) {
            try {
                this.f29856b.c();
                if (this.f29878x) {
                    this.f29871q.recycle();
                    q();
                    return;
                }
                if (this.f29855a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f29873s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f29876v = this.f29859e.a(this.f29871q, this.f29867m, this.f29866l, this.f29857c);
                this.f29873s = true;
                e c10 = this.f29855a.c();
                k(c10.size() + 1);
                this.f29860f.b(this, this.f29866l, this.f29876v);
                Iterator it = c10.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f29885b.execute(new b(dVar.f29884a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean p() {
        return this.f29870p;
    }

    public synchronized void r(L4.i iVar) {
        try {
            this.f29856b.c();
            this.f29855a.f(iVar);
            if (this.f29855a.isEmpty()) {
                h();
                if (!this.f29873s) {
                    if (this.f29875u) {
                    }
                }
                if (this.f29865k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f29877w = hVar;
            (hVar.D() ? this.f29861g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public l(A4.a aVar, A4.a aVar2, A4.a aVar3, A4.a aVar4, m mVar, p.a aVar5, InterfaceC6775d interfaceC6775d, c cVar) {
        this.f29855a = new e();
        this.f29856b = P4.c.a();
        this.f29865k = new AtomicInteger();
        this.f29861g = aVar;
        this.f29862h = aVar2;
        this.f29863i = aVar3;
        this.f29864j = aVar4;
        this.f29860f = mVar;
        this.f29857c = aVar5;
        this.f29858d = interfaceC6775d;
        this.f29859e = cVar;
    }
}
