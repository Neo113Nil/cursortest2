package com.google.android.gms.internal.play_billing;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class r5 implements z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5559d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5560e = Logger.getLogger(r5.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final d3 f5561f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5562g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5563a;

    /* renamed from: b, reason: collision with root package name */
    public volatile f4 f5564b;

    /* renamed from: c, reason: collision with root package name */
    public volatile q5 f5565c;

    static {
        d3 p5Var;
        try {
            p5Var = new d5(AtomicReferenceFieldUpdater.newUpdater(q5.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q5.class, q5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r5.class, q5.class, "c"), AtomicReferenceFieldUpdater.newUpdater(r5.class, f4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r5.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            p5Var = new p5(9);
        }
        Throwable th3 = th;
        f5561f = p5Var;
        if (th3 != null) {
            f5560e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f5562g = new Object();
    }

    public static void d(r5 r5Var) {
        q5 q5Var;
        f4 f4Var;
        f4 f4Var2;
        f4 f4Var3;
        do {
            q5Var = r5Var.f5565c;
        } while (!f5561f.B(r5Var, q5Var, q5.f5554c));
        while (true) {
            f4Var = null;
            if (q5Var == null) {
                break;
            }
            Thread thread = q5Var.f5555a;
            if (thread != null) {
                q5Var.f5555a = null;
                LockSupport.unpark(thread);
            }
            q5Var = q5Var.f5556b;
        }
        do {
            f4Var2 = r5Var.f5564b;
        } while (!f5561f.u(r5Var, f4Var2, f4.f5451d));
        while (true) {
            f4Var3 = f4Var;
            f4Var = f4Var2;
            if (f4Var == null) {
                break;
            }
            f4Var2 = f4Var.f5454c;
            f4Var.f5454c = f4Var3;
        }
        while (f4Var3 != null) {
            Runnable runnable = f4Var3.f5452a;
            f4 f4Var4 = f4Var3.f5454c;
            f(runnable, f4Var3.f5453b);
            f4Var3 = f4Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f5560e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", androidx.appcompat.widget.c1.o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    public static final Object h(Object obj) {
        if (obj instanceof w2) {
            Throwable th2 = ((w2) obj).f5616a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof p3) {
            throw new ExecutionException(((p3) obj).f5548a);
        }
        if (obj == f5562g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        f4 f4Var = this.f5564b;
        f4 f4Var2 = f4.f5451d;
        if (f4Var != f4Var2) {
            f4 f4Var3 = new f4(runnable, executor);
            do {
                f4Var3.f5454c = f4Var;
                if (f5561f.u(this, f4Var, f4Var3)) {
                    return;
                } else {
                    f4Var = this.f5564b;
                }
            } while (f4Var != f4Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f5563a;
        if (obj != null) {
            return false;
        }
        if (!f5561f.w(this, obj, f5559d ? new w2(new CancellationException("Future.cancel() was called.")) : z5 ? w2.f5614b : w2.f5615c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb2) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                } catch (Throwable th2) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e7) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e7.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e9) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e9.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    public final void g(q5 q5Var) {
        q5Var.f5555a = null;
        while (true) {
            q5 q5Var2 = this.f5565c;
            if (q5Var2 != q5.f5554c) {
                q5 q5Var3 = null;
                while (q5Var2 != null) {
                    q5 q5Var4 = q5Var2.f5556b;
                    if (q5Var2.f5555a != null) {
                        q5Var3 = q5Var2;
                    } else if (q5Var3 != null) {
                        q5Var3.f5556b = q5Var4;
                        if (q5Var3.f5555a == null) {
                            break;
                        }
                    } else if (!f5561f.B(this, q5Var2, q5Var4)) {
                        break;
                    }
                    q5Var2 = q5Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        q5 q5Var = q5.f5554c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5563a;
        if (obj2 != null) {
            return h(obj2);
        }
        q5 q5Var2 = this.f5565c;
        if (q5Var2 != q5Var) {
            q5 q5Var3 = new q5();
            do {
                d3 d3Var = f5561f;
                d3Var.j(q5Var3, q5Var2);
                if (d3Var.B(this, q5Var2, q5Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(q5Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f5563a;
                    } while (obj == null);
                    return h(obj);
                }
                q5Var2 = this.f5565c;
            } while (q5Var2 != q5Var);
        }
        return h(this.f5563a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5563a instanceof w2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5563a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f5563a instanceof w2) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            e(sb2);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e7) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e7.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(concat);
                sb2.append("]");
            } else if (isDone()) {
                e(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        q5 q5Var = q5.f5554c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f5563a;
            if (obj != null) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                q5 q5Var2 = this.f5565c;
                if (q5Var2 != q5Var) {
                    q5 q5Var3 = new q5();
                    do {
                        d3 d3Var = f5561f;
                        d3Var.j(q5Var3, q5Var2);
                        if (d3Var.B(this, q5Var2, q5Var3)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5563a;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    long nanoTime2 = nanoTime - System.nanoTime();
                                    if (nanoTime2 < 1000) {
                                        g(q5Var3);
                                        nanos = nanoTime2;
                                        break;
                                    }
                                    nanos = nanoTime2;
                                } else {
                                    g(q5Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            q5Var2 = this.f5565c;
                        }
                    } while (q5Var2 != q5Var);
                }
                return h(this.f5563a);
            }
            while (nanos > 0) {
                Object obj3 = this.f5563a;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String r5Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                boolean z5 = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z5 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z5) {
                        str2 = str2.concat(StringUtils.COMMA);
                    }
                    concat = str2.concat(" ");
                }
                if (z5) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(r4.k.m(str, " for ", r5Var));
        }
        throw new InterruptedException();
    }
}
