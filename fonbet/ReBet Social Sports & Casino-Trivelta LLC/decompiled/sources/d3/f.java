package d3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class f {

    /* renamed from: i, reason: collision with root package name */
    public static final ExecutorService f44927i = C3997b.a();

    /* renamed from: j, reason: collision with root package name */
    public static final Executor f44928j = C3997b.b();

    /* renamed from: k, reason: collision with root package name */
    public static final Executor f44929k = C3996a.c();

    /* renamed from: l, reason: collision with root package name */
    public static f f44930l = new f((Object) null);

    /* renamed from: m, reason: collision with root package name */
    public static f f44931m = new f(Boolean.TRUE);

    /* renamed from: n, reason: collision with root package name */
    public static f f44932n = new f(Boolean.FALSE);

    /* renamed from: o, reason: collision with root package name */
    public static f f44933o = new f(true);

    /* renamed from: b, reason: collision with root package name */
    public boolean f44935b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44936c;

    /* renamed from: d, reason: collision with root package name */
    public Object f44937d;

    /* renamed from: e, reason: collision with root package name */
    public Exception f44938e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44939f;

    /* renamed from: g, reason: collision with root package name */
    public h f44940g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f44934a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public List f44941h = new ArrayList();

    public class a implements d3.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44942a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d3.d f44943b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Executor f44944c;

        public a(g gVar, d3.d dVar, Executor executor, d3.c cVar) {
            this.f44942a = gVar;
            this.f44943b = dVar;
            this.f44944c = executor;
        }

        @Override // d3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(f fVar) {
            f.d(this.f44942a, this.f44943b, fVar, this.f44944c, null);
            return null;
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44946a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d3.d f44947b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f44948c;

        public b(d3.c cVar, g gVar, d3.d dVar, f fVar) {
            this.f44946a = gVar;
            this.f44947b = dVar;
            this.f44948c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f44946a.d(this.f44947b.a(this.f44948c));
            } catch (CancellationException unused) {
                this.f44946a.b();
            } catch (Exception e10) {
                this.f44946a.c(e10);
            }
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44949a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f44950b;

        public c(d3.c cVar, g gVar, Callable callable) {
            this.f44949a = gVar;
            this.f44950b = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f44949a.d(this.f44950b.call());
            } catch (CancellationException unused) {
                this.f44949a.b();
            } catch (Exception e10) {
                this.f44949a.c(e10);
            }
        }
    }

    public interface d {
    }

    public f() {
    }

    public static f b(Callable callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static f c(Callable callable, Executor executor, d3.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
        return gVar.a();
    }

    public static void d(g gVar, d3.d dVar, f fVar, Executor executor, d3.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
    }

    public static f g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static f h(Object obj) {
        if (obj == null) {
            return f44930l;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f44931m : f44932n;
        }
        g gVar = new g();
        gVar.d(obj);
        return gVar.a();
    }

    public static d k() {
        return null;
    }

    public f e(d3.d dVar) {
        return f(dVar, f44928j, null);
    }

    public f f(d3.d dVar, Executor executor, d3.c cVar) {
        d3.d dVar2;
        Executor executor2;
        d3.c cVar2;
        g gVar = new g();
        synchronized (this.f44934a) {
            try {
                try {
                    boolean m10 = m();
                    if (m10) {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                    } else {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                        this.f44941h.add(new a(gVar, dVar2, executor2, cVar2));
                    }
                    if (m10) {
                        d(gVar, dVar2, this, executor2, cVar2);
                    }
                    return gVar.a();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f44934a) {
            try {
                if (this.f44938e != null) {
                    this.f44939f = true;
                }
                exc = this.f44938e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f44934a) {
            obj = this.f44937d;
        }
        return obj;
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f44934a) {
            z10 = this.f44936c;
        }
        return z10;
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f44934a) {
            z10 = this.f44935b;
        }
        return z10;
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f44934a) {
            z10 = i() != null;
        }
        return z10;
    }

    public final void o() {
        synchronized (this.f44934a) {
            Iterator it = this.f44941h.iterator();
            while (it.hasNext()) {
                try {
                    ((d3.d) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f44941h = null;
        }
    }

    public boolean p() {
        synchronized (this.f44934a) {
            try {
                if (this.f44935b) {
                    return false;
                }
                this.f44935b = true;
                this.f44936c = true;
                this.f44934a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean q(Exception exc) {
        synchronized (this.f44934a) {
            try {
                if (this.f44935b) {
                    return false;
                }
                this.f44935b = true;
                this.f44938e = exc;
                this.f44939f = false;
                this.f44934a.notifyAll();
                o();
                if (!this.f44939f) {
                    k();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r(Object obj) {
        synchronized (this.f44934a) {
            try {
                if (this.f44935b) {
                    return false;
                }
                this.f44935b = true;
                this.f44937d = obj;
                this.f44934a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public f(Object obj) {
        r(obj);
    }

    public f(boolean z10) {
        if (z10) {
            p();
        } else {
            r(null);
        }
    }
}
