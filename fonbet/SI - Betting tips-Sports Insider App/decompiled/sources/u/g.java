package u;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g implements g8.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f23991d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f23992e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final a.a f23993f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f23994g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f23995a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f23996b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f23997c;

    static {
        a.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e(18);
        }
        f23993f = eVar;
        if (th != null) {
            f23992e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23994g = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f23997c;
        } while (!f23993f.e(gVar, fVar, f.f23988c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f23989a;
            if (thread != null) {
                fVar.f23989a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f23990b;
        }
        gVar.d();
        do {
            cVar2 = gVar.f23996b;
        } while (!f23993f.c(gVar, cVar2, c.f23979d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f23982c;
            cVar.f23982c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f23982c;
            f(cVar3.f23980a, cVar3.f23981b);
            cVar3 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f23992e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f23977b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f23978a);
        }
        if (obj == f23994g) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // g8.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f23996b;
        c cVar2 = c.f23979d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f23982c = cVar;
                if (f23993f.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f23996b;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        try {
            Object h10 = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(h10 == this ? "this future" : String.valueOf(h10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e7.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e9.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f23995a;
        if (obj == null) {
            if (f23993f.d(this, obj, f23991d ? new a(new CancellationException("Future.cancel() was called."), z5) : z5 ? a.f23974c : a.f23975d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        f fVar = f.f23988c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23995a;
        if (obj != null) {
            return g(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f23997c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    a.a aVar = f23993f;
                    aVar.w(fVar3, fVar2);
                    if (aVar.e(this, fVar2, fVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23995a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            long nanoTime2 = nanoTime - System.nanoTime();
                            if (nanoTime2 < 1000) {
                                j(fVar3);
                                nanos = nanoTime2;
                                break;
                            }
                            nanos = nanoTime2;
                        }
                    } else {
                        fVar2 = this.f23997c;
                    }
                } while (fVar2 != fVar);
            }
            return g(this.f23995a);
        }
        while (nanos > 0) {
            Object obj3 = this.f23995a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder p10 = r4.k.p(j, "Waited ", " ");
        p10.append(timeUnit.toString().toLowerCase(locale));
        String sb2 = p10.toString();
        if (nanos + 1000 < 0) {
            String l6 = r4.k.l(sb2, " (plus ");
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z5 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = l6 + convert + " " + lowerCase;
                if (z5) {
                    str = r4.k.l(str, StringUtils.COMMA);
                }
                l6 = r4.k.l(str, " ");
            }
            if (z5) {
                l6 = l6 + nanos2 + " nanoseconds ";
            }
            sb2 = r4.k.l(l6, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(r4.k.l(sb2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(r4.k.m(sb2, " for ", gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23995a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23995a != null;
    }

    public final void j(f fVar) {
        fVar.f23989a = null;
        while (true) {
            f fVar2 = this.f23997c;
            if (fVar2 == f.f23988c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f23990b;
                if (fVar2.f23989a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f23990b = fVar4;
                    if (fVar3.f23989a == null) {
                        break;
                    }
                } else if (!f23993f.e(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = f23994g;
        }
        if (!f23993f.d(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th2) {
        th2.getClass();
        if (!f23993f.d(this, null, new b(th2))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f23995a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                str = i();
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.f23988c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23995a;
            if (obj2 != null) {
                return g(obj2);
            }
            f fVar2 = this.f23997c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    a.a aVar = f23993f;
                    aVar.w(fVar3, fVar2);
                    if (aVar.e(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23995a;
                            } else {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    fVar2 = this.f23997c;
                } while (fVar2 != fVar);
            }
            return g(this.f23995a);
        }
        throw new InterruptedException();
    }
}
