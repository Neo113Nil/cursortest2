package R2;

import Q2.AbstractC1508t;
import Q2.C1498i;
import R2.d0;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import l0.AbstractC5338c;

/* renamed from: R2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1543t implements W2.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f10054l = AbstractC1508t.i("Processor");

    /* renamed from: b, reason: collision with root package name */
    public Context f10056b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.a f10057c;

    /* renamed from: d, reason: collision with root package name */
    public Z2.b f10058d;

    /* renamed from: e, reason: collision with root package name */
    public WorkDatabase f10059e;

    /* renamed from: g, reason: collision with root package name */
    public Map f10061g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f10060f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Set f10063i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final List f10064j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f10055a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f10065k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public Map f10062h = new HashMap();

    public C1543t(Context context, androidx.work.a aVar, Z2.b bVar, WorkDatabase workDatabase) {
        this.f10056b = context;
        this.f10057c = aVar;
        this.f10058d = bVar;
        this.f10059e = workDatabase;
    }

    public static /* synthetic */ WorkSpec b(C1543t c1543t, ArrayList arrayList, String str) {
        arrayList.addAll(c1543t.f10059e.m().a(str));
        return c1543t.f10059e.l().i(str);
    }

    public static /* synthetic */ void c(C1543t c1543t, X2.h hVar, boolean z10) {
        synchronized (c1543t.f10065k) {
            try {
                Iterator it = c1543t.f10064j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1530f) it.next()).c(hVar, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void d(C1543t c1543t, Ta.o oVar, d0 d0Var) {
        boolean z10;
        c1543t.getClass();
        try {
            z10 = ((Boolean) oVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z10 = true;
        }
        c1543t.l(d0Var, z10);
    }

    public static boolean i(String str, d0 d0Var, int i10) {
        if (d0Var == null) {
            AbstractC1508t.e().a(f10054l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        d0Var.o(i10);
        AbstractC1508t.e().a(f10054l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // W2.a
    public void a(String str, C1498i c1498i) {
        synchronized (this.f10065k) {
            try {
                AbstractC1508t.e().f(f10054l, "Moving WorkSpec (" + str + ") to the foreground");
                d0 d0Var = (d0) this.f10061g.remove(str);
                if (d0Var != null) {
                    if (this.f10055a == null) {
                        PowerManager.WakeLock b10 = Y2.F.b(this.f10056b, "ProcessorForegroundLck");
                        this.f10055a = b10;
                        b10.acquire();
                    }
                    this.f10060f.put(str, d0Var);
                    AbstractC5338c.startForegroundService(this.f10056b, androidx.work.impl.foreground.a.f(this.f10056b, d0Var.l(), c1498i));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(InterfaceC1530f interfaceC1530f) {
        synchronized (this.f10065k) {
            this.f10064j.add(interfaceC1530f);
        }
    }

    public final d0 f(String str) {
        d0 d0Var = (d0) this.f10060f.remove(str);
        boolean z10 = d0Var != null;
        if (!z10) {
            d0Var = (d0) this.f10061g.remove(str);
        }
        this.f10062h.remove(str);
        if (z10) {
            r();
        }
        return d0Var;
    }

    public WorkSpec g(String str) {
        synchronized (this.f10065k) {
            try {
                d0 h10 = h(str);
                if (h10 == null) {
                    return null;
                }
                return h10.m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d0 h(String str) {
        d0 d0Var = (d0) this.f10060f.get(str);
        return d0Var == null ? (d0) this.f10061g.get(str) : d0Var;
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f10065k) {
            contains = this.f10063i.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f10065k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public final void l(d0 d0Var, boolean z10) {
        synchronized (this.f10065k) {
            try {
                X2.h l10 = d0Var.l();
                String b10 = l10.b();
                if (h(b10) == d0Var) {
                    f(b10);
                }
                AbstractC1508t.e().a(f10054l, getClass().getSimpleName() + " " + b10 + " executed; reschedule = " + z10);
                Iterator it = this.f10064j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1530f) it.next()).c(l10, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(InterfaceC1530f interfaceC1530f) {
        synchronized (this.f10065k) {
            this.f10064j.remove(interfaceC1530f);
        }
    }

    public final void n(final X2.h hVar, final boolean z10) {
        this.f10058d.a().execute(new Runnable() { // from class: R2.s
            @Override // java.lang.Runnable
            public final void run() {
                C1543t.c(C1543t.this, hVar, z10);
            }
        });
    }

    public boolean o(C1549z c1549z) {
        return p(c1549z, null);
    }

    public boolean p(C1549z c1549z, WorkerParameters.a aVar) {
        Throwable th2;
        X2.h a10 = c1549z.a();
        final String b10 = a10.b();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.f10059e.runInTransaction(new Callable() { // from class: R2.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1543t.b(C1543t.this, arrayList, b10);
            }
        });
        if (workSpec == null) {
            AbstractC1508t.e().k(f10054l, "Didn't find WorkSpec for id " + a10);
            n(a10, false);
            return false;
        }
        synchronized (this.f10065k) {
            try {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
            try {
                if (k(b10)) {
                    Set set = (Set) this.f10062h.get(b10);
                    if (((C1549z) set.iterator().next()).a().a() == a10.a()) {
                        set.add(c1549z);
                        AbstractC1508t.e().a(f10054l, "Work " + a10 + " is already enqueued for processing");
                    } else {
                        n(a10, false);
                    }
                    return false;
                }
                if (workSpec.getGeneration() != a10.a()) {
                    n(a10, false);
                    return false;
                }
                final d0 a11 = new d0.a(this.f10056b, this.f10057c, this.f10058d, this, this.f10059e, workSpec, arrayList).k(aVar).a();
                final Ta.o q10 = a11.q();
                q10.l(new Runnable() { // from class: R2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1543t.d(C1543t.this, q10, a11);
                    }
                }, this.f10058d.a());
                this.f10061g.put(b10, a11);
                HashSet hashSet = new HashSet();
                hashSet.add(c1549z);
                this.f10062h.put(b10, hashSet);
                AbstractC1508t.e().a(f10054l, getClass().getSimpleName() + ": processing " + a10);
                return true;
            } catch (Throwable th5) {
                th2 = th5;
                throw th2;
            }
        }
    }

    public boolean q(String str, int i10) {
        d0 f10;
        synchronized (this.f10065k) {
            AbstractC1508t.e().a(f10054l, "Processor cancelling " + str);
            this.f10063i.add(str);
            f10 = f(str);
        }
        return i(str, f10, i10);
    }

    public final void r() {
        synchronized (this.f10065k) {
            try {
                if (this.f10060f.isEmpty()) {
                    try {
                        this.f10056b.startService(androidx.work.impl.foreground.a.g(this.f10056b));
                    } catch (Throwable th2) {
                        AbstractC1508t.e().d(f10054l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f10055a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f10055a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean s(C1549z c1549z, int i10) {
        d0 f10;
        String b10 = c1549z.a().b();
        synchronized (this.f10065k) {
            f10 = f(b10);
        }
        return i(b10, f10, i10);
    }

    public boolean t(C1549z c1549z, int i10) {
        String b10 = c1549z.a().b();
        synchronized (this.f10065k) {
            try {
                if (this.f10060f.get(b10) == null) {
                    Set set = (Set) this.f10062h.get(b10);
                    if (set != null && set.contains(c1549z)) {
                        return i(b10, f(b10), i10);
                    }
                    return false;
                }
                AbstractC1508t.e().a(f10054l, "Ignored stopWork. WorkerWrapper " + b10 + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
