package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.a;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class p7 implements ddb {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(p7.class.getName());
    public static final rd0 f;
    public static final Object g;
    public volatile Object a;
    public volatile l7 b;
    public volatile o7 c;

    static {
        rd0 n7Var;
        try {
            n7Var = new m7(AtomicReferenceFieldUpdater.newUpdater(o7.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(o7.class, o7.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p7.class, o7.class, a.q), AtomicReferenceFieldUpdater.newUpdater(p7.class, l7.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p7.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            n7Var = new n7();
        }
        f = n7Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void d(p7 p7Var) {
        o7 o7Var;
        l7 l7Var;
        l7 l7Var2;
        l7 l7Var3;
        do {
            o7Var = p7Var.c;
        } while (!f.x(p7Var, o7Var, o7.c));
        while (true) {
            l7Var = null;
            if (o7Var == null) {
                break;
            }
            Thread thread = o7Var.a;
            if (thread != null) {
                o7Var.a = null;
                LockSupport.unpark(thread);
            }
            o7Var = o7Var.b;
        }
        p7Var.c();
        do {
            l7Var2 = p7Var.b;
        } while (!f.v(p7Var, l7Var2, l7.d));
        while (true) {
            l7Var3 = l7Var;
            l7Var = l7Var2;
            if (l7Var == null) {
                break;
            }
            l7Var2 = l7Var.c;
            l7Var.c = l7Var3;
        }
        while (l7Var3 != null) {
            l7 l7Var4 = l7Var3.c;
            e(l7Var3.a, l7Var3.b);
            l7Var3 = l7Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof j7) {
            Throwable th = ((j7) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof k7) {
            throw new ExecutionException(((k7) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        l7 l7Var = this.b;
        l7 l7Var2 = l7.d;
        if (l7Var != l7Var2) {
            l7 l7Var3 = new l7(runnable, executor);
            do {
                l7Var3.c = l7Var;
                if (f.v(this, l7Var, l7Var3)) {
                    return;
                } else {
                    l7Var = this.b;
                }
            } while (l7Var != l7Var2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g2 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g2 == this ? "this future" : String.valueOf(g2));
            sb.append(U3.j.e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(U3.j.e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            if (f.w(this, obj, d ? new j7(new CancellationException("Future.cancel() was called."), z) : z ? j7.c : j7.d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        o7 o7Var = o7.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            hbo.k();
            return null;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return f(obj2);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o7 o7Var2 = this.c;
            if (o7Var2 != o7Var) {
                o7 o7Var3 = new o7();
                obj = null;
                do {
                    rd0 rd0Var = f;
                    rd0Var.P(o7Var3, o7Var2);
                    if (rd0Var.x(this, o7Var2, o7Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(o7Var3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if (obj3 != null) {
                                return f(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(o7Var3);
                    } else {
                        o7Var2 = this.c;
                    }
                } while (o7Var2 != o7Var);
            }
            return f(this.a);
        }
        obj = null;
        while (nanos > 0) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return f(obj4);
            }
            if (Thread.interrupted()) {
                hbo.k();
                return obj;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String p7Var = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder o = ljg.o("Waited ", j, " ");
        o.append(timeUnit.toString().toLowerCase(locale));
        String sb = o.toString();
        if (nanos + 1000 < 0) {
            String concat = sb.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = concat + convert + " " + lowerCase;
                if (z) {
                    str = str.concat(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                concat = str.concat(" ");
            }
            if (z) {
                concat = vxd.m(concat, nanos2, " nanoseconds ");
            }
            sb = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(lnb.o(sb, " for ", p7Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(o7 o7Var) {
        o7Var.a = null;
        while (true) {
            o7 o7Var2 = this.c;
            if (o7Var2 == o7.c) {
                return;
            }
            o7 o7Var3 = null;
            while (o7Var2 != null) {
                o7 o7Var4 = o7Var2.b;
                if (o7Var2.a != null) {
                    o7Var3 = o7Var2;
                } else if (o7Var3 != null) {
                    o7Var3.b = o7Var4;
                    if (o7Var3.a == null) {
                        break;
                    }
                } else if (!f.x(this, o7Var2, o7Var4)) {
                    break;
                }
                o7Var2 = o7Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof j7;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.w(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        if (!f.w(this, null, new k7(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof j7) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                wt3.A("PENDING, info=[", str, sb, U3.j.e);
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        o7 o7Var = o7.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            o7 o7Var2 = this.c;
            if (o7Var2 != o7Var) {
                o7 o7Var3 = new o7();
                do {
                    rd0 rd0Var = f;
                    rd0Var.P(o7Var3, o7Var2);
                    if (rd0Var.x(this, o7Var2, o7Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(o7Var3);
                                hbo.k();
                                return null;
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    o7Var2 = this.c;
                } while (o7Var2 != o7Var);
            }
            return f(this.a);
        }
        hbo.k();
        return null;
    }
}
