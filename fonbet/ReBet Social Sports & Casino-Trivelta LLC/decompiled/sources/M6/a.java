package M6;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class a implements M6.c {

    /* renamed from: a, reason: collision with root package name */
    public Map f7508a;

    /* renamed from: d, reason: collision with root package name */
    public Object f7511d = null;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f7512e = null;

    /* renamed from: f, reason: collision with root package name */
    public float f7513f = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7510c = false;

    /* renamed from: b, reason: collision with root package name */
    public d f7509b = d.IN_PROGRESS;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7514g = new ConcurrentLinkedQueue();

    /* renamed from: M6.a$a, reason: collision with other inner class name */
    public class RunnableC0151a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7515a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f7516b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f7517c;

        public RunnableC0151a(boolean z10, e eVar, boolean z11) {
            this.f7515a = z10;
            this.f7516b = eVar;
            this.f7517c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7515a) {
                this.f7516b.onFailure(a.this);
            } else if (this.f7517c) {
                this.f7516b.onCancellation(a.this);
            } else {
                this.f7516b.onNewResult(a.this);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f7519a;

        public b(e eVar) {
            this.f7519a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7519a.onProgressUpdate(a.this);
        }
    }

    public interface c {
    }

    public enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    public static c b() {
        return null;
    }

    public synchronized boolean c() {
        return this.f7509b == d.FAILURE;
    }

    @Override // M6.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f7510c) {
                    return false;
                }
                this.f7510c = true;
                Object obj = this.f7511d;
                this.f7511d = null;
                if (obj != null) {
                    a(obj);
                }
                if (!d()) {
                    l();
                }
                synchronized (this) {
                    this.f7514g.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // M6.c
    public synchronized boolean d() {
        return this.f7509b != d.IN_PROGRESS;
    }

    @Override // M6.c
    public synchronized boolean e() {
        return this.f7511d != null;
    }

    @Override // M6.c
    public synchronized Throwable f() {
        return this.f7512e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // M6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(e eVar, Executor executor) {
        boolean z10;
        D6.k.g(eVar);
        D6.k.g(executor);
        synchronized (this) {
            try {
                if (this.f7510c) {
                    return;
                }
                if (this.f7509b == d.IN_PROGRESS) {
                    this.f7514g.add(Pair.create(eVar, executor));
                }
                if (!e() && !d() && !v()) {
                    z10 = false;
                    if (z10) {
                        return;
                    }
                    k(eVar, executor, c(), v());
                    return;
                }
                z10 = true;
                if (z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // M6.c
    public Map getExtras() {
        return this.f7508a;
    }

    @Override // M6.c
    public synchronized Object getResult() {
        return this.f7511d;
    }

    @Override // M6.c
    public synchronized float h() {
        return this.f7513f;
    }

    @Override // M6.c
    public boolean i() {
        return false;
    }

    public synchronized boolean j() {
        return this.f7510c;
    }

    public void k(e eVar, Executor executor, boolean z10, boolean z11) {
        RunnableC0151a runnableC0151a = new RunnableC0151a(z10, eVar, z11);
        b();
        executor.execute(runnableC0151a);
    }

    public final void l() {
        boolean c10 = c();
        boolean v10 = v();
        Iterator it = this.f7514g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            k((e) pair.first, (Executor) pair.second, c10, v10);
        }
    }

    public void m() {
        Iterator it = this.f7514g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    public void n(Map map) {
        this.f7508a = map;
    }

    public boolean o(Throwable th2) {
        return p(th2, null);
    }

    public boolean p(Throwable th2, Map map) {
        boolean q10 = q(th2, map);
        if (q10) {
            l();
        }
        return q10;
    }

    public final synchronized boolean q(Throwable th2, Map map) {
        if (!this.f7510c && this.f7509b == d.IN_PROGRESS) {
            this.f7509b = d.FAILURE;
            this.f7512e = th2;
            this.f7508a = map;
            return true;
        }
        return false;
    }

    public boolean r(float f10) {
        boolean s10 = s(f10);
        if (s10) {
            m();
        }
        return s10;
    }

    public final synchronized boolean s(float f10) {
        if (!this.f7510c && this.f7509b == d.IN_PROGRESS) {
            if (f10 < this.f7513f) {
                return false;
            }
            this.f7513f = f10;
            return true;
        }
        return false;
    }

    public boolean t(Object obj, boolean z10, Map map) {
        n(map);
        boolean u10 = u(obj, z10);
        if (u10) {
            l();
        }
        return u10;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0019 -> B:28:0x003a). Please report as a decompilation issue!!! */
    public final boolean u(Object obj, boolean z10) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f7510c && this.f7509b == d.IN_PROGRESS) {
                            if (z10) {
                                this.f7509b = d.SUCCESS;
                                this.f7513f = 1.0f;
                            }
                            Object obj4 = this.f7511d;
                            if (obj4 != obj) {
                                try {
                                    this.f7511d = obj;
                                    obj2 = obj4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj3 = obj4;
                                    throw th;
                                }
                            } else {
                                obj2 = null;
                            }
                            return true;
                        }
                        if (obj != null) {
                            a(obj);
                        }
                        return false;
                    } catch (Throwable th3) {
                        obj3 = obj;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } finally {
            if (obj3 != null) {
                a(obj3);
            }
        }
    }

    public final synchronized boolean v() {
        boolean z10;
        if (j()) {
            z10 = d() ? false : true;
        }
        return z10;
    }

    public void a(Object obj) {
    }
}
