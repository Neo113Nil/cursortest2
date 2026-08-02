package com.google.android.gms.internal.play_billing;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
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
public abstract class o1 extends l2 implements z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5528d;

    /* renamed from: e, reason: collision with root package name */
    public static final y1 f5529e;

    /* renamed from: f, reason: collision with root package name */
    public static final d3 f5530f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5531g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5532a;

    /* renamed from: b, reason: collision with root package name */
    public volatile g1 f5533b;

    /* renamed from: c, reason: collision with root package name */
    public volatile n1 f5534c;

    static {
        boolean z5;
        d3 j1Var;
        Throwable th2;
        try {
            z5 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z5 = false;
        }
        f5528d = z5;
        f5529e = new y1(o1.class);
        int i5 = 7;
        Throwable th3 = null;
        try {
            j1Var = new m1(i5);
            th2 = null;
        } catch (Error | Exception e7) {
            try {
                th2 = e7;
                j1Var = new h1(AtomicReferenceFieldUpdater.newUpdater(n1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n1.class, n1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o1.class, n1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(o1.class, g1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "a"));
            } catch (Error | Exception e9) {
                th3 = e9;
                j1Var = new j1(i5);
                th2 = e7;
            }
        }
        f5530f = j1Var;
        if (th3 != null) {
            y1 y1Var = f5529e;
            Logger a7 = y1Var.a();
            Level level = Level.SEVERE;
            a7.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            y1Var.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f5531g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(z1 z1Var) {
        Object obj;
        Throwable th2;
        if (z1Var instanceof k1) {
            Object obj2 = ((o1) z1Var).f5532a;
            if (obj2 instanceof d1) {
                d1 d1Var = (d1) obj2;
                if (d1Var.f5423a) {
                    Throwable th3 = d1Var.f5424b;
                    obj2 = th3 != null ? new d1(th3, false) : d1.f5422d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (z1Var instanceof l2) {
            o1 o1Var = (o1) ((l2) z1Var);
            if (o1Var instanceof k1) {
                Object obj3 = o1Var.f5532a;
                if (obj3 instanceof f1) {
                    th2 = ((f1) obj3).f5447a;
                    if (th2 != null) {
                        return new f1(th2);
                    }
                }
            } else {
                o1Var.getClass();
            }
            th2 = null;
            if (th2 != null) {
            }
        }
        boolean isCancelled = z1Var.isCancelled();
        boolean z5 = true;
        if ((!f5528d) && isCancelled) {
            d1 d1Var2 = d1.f5422d;
            Objects.requireNonNull(d1Var2);
            return d1Var2;
        }
        boolean z7 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = z1Var.get();
                        break;
                    } catch (Error e7) {
                        e = e7;
                        return new f1(e);
                    }
                } catch (InterruptedException unused) {
                    z7 = z5;
                } catch (Throwable th4) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th4;
                }
            } catch (Error | Exception e9) {
                e = e9;
                return new f1(e);
            } catch (CancellationException e10) {
                return !isCancelled ? new f1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(z1Var)), e10)) : new d1(e10, false);
            } catch (ExecutionException e11) {
                return isCancelled ? new d1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(z1Var)), e11), false) : new f1(e11.getCause());
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new d1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(z1Var))), false) : obj == null ? f5531g : obj;
    }

    public static void h(o1 o1Var) {
        g1 g1Var;
        g1 g1Var2 = null;
        while (true) {
            for (n1 p10 = f5530f.p(o1Var); p10 != null; p10 = p10.f5523b) {
                Thread thread = p10.f5522a;
                if (thread != null) {
                    p10.f5522a = null;
                    LockSupport.unpark(thread);
                }
            }
            o1Var.d();
            g1 g1Var3 = g1Var2;
            g1 e7 = f5530f.e(o1Var);
            g1 g1Var4 = g1Var3;
            while (e7 != null) {
                g1 g1Var5 = e7.f5459c;
                e7.f5459c = g1Var4;
                g1Var4 = e7;
                e7 = g1Var5;
            }
            while (g1Var4 != null) {
                Runnable runnable = g1Var4.f5457a;
                g1Var = g1Var4.f5459c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof i1) {
                    i1 i1Var = (i1) runnable;
                    o1Var = i1Var.f5480a;
                    if (o1Var.f5532a == i1Var) {
                        if (f5530f.E(o1Var, i1Var, f(i1Var.f5481b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = g1Var4.f5458b;
                    Objects.requireNonNull(executor);
                    i(runnable, executor);
                }
                g1Var4 = g1Var;
            }
            return;
            g1Var2 = g1Var;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            f5529e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", androidx.appcompat.widget.c1.o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof d1) {
            Throwable th2 = ((d1) obj).f5424b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof f1) {
            throw new ExecutionException(((f1) obj).f5447a);
        }
        if (obj == f5531g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void b(Runnable runnable, Executor executor) {
        g1 g1Var;
        g1 g1Var2 = g1.f5456d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (g1Var = this.f5533b) != g1Var2) {
            g1 g1Var3 = new g1(runnable, executor);
            do {
                g1Var3.f5459c = g1Var;
                if (f5530f.A(this, g1Var, g1Var3)) {
                    return;
                } else {
                    g1Var = this.f5533b;
                }
            } while (g1Var != g1Var2);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z5) {
        d1 d1Var;
        Object obj = this.f5532a;
        if (!(obj instanceof i1) && !(obj == null)) {
            return false;
        }
        if (f5528d) {
            d1Var = new d1(new CancellationException("Future.cancel() was called."), z5);
        } else {
            d1Var = z5 ? d1.f5421c : d1.f5422d;
            Objects.requireNonNull(d1Var);
        }
        o1 o1Var = this;
        boolean z7 = false;
        while (true) {
            if (f5530f.E(o1Var, obj, d1Var)) {
                h(o1Var);
                if (!(obj instanceof i1)) {
                    break;
                }
                z1 z1Var = ((i1) obj).f5481b;
                if (!(z1Var instanceof k1)) {
                    z1Var.cancel(z5);
                    break;
                }
                o1Var = (o1) z1Var;
                obj = o1Var.f5532a;
                if (!(obj == null) && !(obj instanceof i1)) {
                    break;
                }
                z7 = true;
            } else {
                obj = o1Var.f5532a;
                if (!(obj instanceof i1)) {
                    return z7;
                }
            }
        }
    }

    public final void e(Throwable th2) {
        if (f5530f.E(this, null, new f1(th2))) {
            h(this);
        }
    }

    public final void g(StringBuilder sb2) {
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
            } catch (ExecutionException e7) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e7.getCause());
                sb2.append("]");
                return;
            } catch (Exception e9) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e9.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        n1 n1Var = n1.f5521c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5532a;
        if ((obj2 != null) && (!(obj2 instanceof i1))) {
            return k(obj2);
        }
        n1 n1Var2 = this.f5534c;
        if (n1Var2 != n1Var) {
            n1 n1Var3 = new n1();
            do {
                d3 d3Var = f5530f;
                d3Var.t(n1Var3, n1Var2);
                if (d3Var.G(this, n1Var2, n1Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(n1Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f5532a;
                    } while (!((obj != null) & (!(obj instanceof i1))));
                    return k(obj);
                }
                n1Var2 = this.f5534c;
            } while (n1Var2 != n1Var);
        }
        Object obj3 = this.f5532a;
        Objects.requireNonNull(obj3);
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5532a instanceof d1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f5532a != null) & (!(r0 instanceof i1));
    }

    public final void j(n1 n1Var) {
        n1Var.f5522a = null;
        while (true) {
            n1 n1Var2 = this.f5534c;
            if (n1Var2 != n1.f5521c) {
                n1 n1Var3 = null;
                while (n1Var2 != null) {
                    n1 n1Var4 = n1Var2.f5523b;
                    if (n1Var2.f5522a != null) {
                        n1Var3 = n1Var2;
                    } else if (n1Var3 != null) {
                        n1Var3.f5523b = n1Var4;
                        if (n1Var3.f5522a == null) {
                            break;
                        }
                    } else if (!f5530f.G(this, n1Var2, n1Var4)) {
                        break;
                    }
                    n1Var2 = n1Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f5532a instanceof d1) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            g(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f5532a;
            if (obj instanceof i1) {
                sb2.append(", setFuture=[");
                z1 z1Var = ((i1) obj).f5481b;
                try {
                    if (z1Var == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(z1Var);
                    }
                } catch (Exception e7) {
                    e = e7;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                    sb2.append("]");
                    if (isDone()) {
                    }
                    sb2.append("]");
                    return sb2.toString();
                } catch (StackOverflowError e9) {
                    e = e9;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                    sb2.append("]");
                    if (isDone()) {
                    }
                    sb2.append("]");
                    return sb2.toString();
                }
                sb2.append("]");
            } else {
                try {
                    concat = c();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Exception | StackOverflowError e10) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
                }
                if (concat != null) {
                    sb2.append(", info=[");
                    sb2.append(concat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                g(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c6 -> B:34:0x0083). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z5;
        long j6;
        long nanoTime;
        n1 n1Var = n1.f5521c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f5532a;
            if ((obj != null) & (!(obj instanceof i1))) {
                return k(obj);
            }
            long j10 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                n1 n1Var2 = this.f5534c;
                if (n1Var2 != n1Var) {
                    n1 n1Var3 = new n1();
                    z5 = true;
                    while (true) {
                        d3 d3Var = f5530f;
                        d3Var.t(n1Var3, n1Var2);
                        if (d3Var.G(this, n1Var2, n1Var3)) {
                            j6 = j10;
                            while (true) {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5532a;
                                    if ((obj2 != null) & (!(obj2 instanceof i1))) {
                                        return k(obj2);
                                    }
                                    nanoTime = nanoTime2 - System.nanoTime();
                                    if (nanoTime < 1000) {
                                        j(n1Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    j(n1Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j11 = j10;
                            n1Var2 = this.f5534c;
                            if (n1Var2 == n1Var) {
                                break;
                            }
                            j10 = j11;
                        }
                    }
                    nanos = nanoTime;
                    if (nanos > j6) {
                        Object obj3 = this.f5532a;
                        if ((obj3 != null ? z5 : false) & (!(obj3 instanceof i1))) {
                            return k(obj3);
                        }
                        if (!Thread.interrupted()) {
                            nanoTime = nanoTime2 - System.nanoTime();
                            nanos = nanoTime;
                            if (nanos > j6) {
                            }
                        } else {
                            throw new InterruptedException();
                        }
                    } else {
                        String o1Var = toString();
                        String obj4 = timeUnit.toString();
                        Locale locale = Locale.ROOT;
                        String lowerCase = obj4.toLowerCase(locale);
                        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
                        if (nanos + 1000 < j6) {
                            String concat = str.concat(" (plus ");
                            long j12 = -nanos;
                            long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                            long nanos2 = j12 - timeUnit.toNanos(convert);
                            if (convert != j6 && nanos2 <= 1000) {
                                z5 = false;
                            }
                            if (convert > j6) {
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
                        throw new TimeoutException(r4.k.m(str, " for ", o1Var));
                    }
                }
                Object obj5 = this.f5532a;
                Objects.requireNonNull(obj5);
                return k(obj5);
            }
            z5 = true;
            j6 = 0;
            if (nanos > j6) {
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void d() {
    }
}
