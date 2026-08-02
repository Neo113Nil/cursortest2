package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.a;
import java.util.Locale;
import java.util.Objects;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class g4 implements ddb {
    public static final boolean d;
    public static final nsa e;
    public static final hkg f;
    public static final Object g;
    public volatile Object a;
    public volatile x3 b;
    public volatile f4 c;

    static {
        boolean z;
        Throwable th;
        hkg a4Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new nsa(0, g4.class);
        Throwable th2 = null;
        try {
            a4Var = new e4();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                a4Var = new y3(AtomicReferenceFieldUpdater.newUpdater(f4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f4.class, f4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, f4.class, a.q), AtomicReferenceFieldUpdater.newUpdater(g4.class, x3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                a4Var = new a4();
            }
        }
        f = a4Var;
        if (th2 != null) {
            nsa nsaVar = e;
            Logger a = nsaVar.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            nsaVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void e(g4 g4Var, boolean z) {
        x3 x3Var = null;
        while (true) {
            for (f4 N = f.N(g4Var); N != null; N = N.b) {
                Thread thread = N.a;
                if (thread != null) {
                    N.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                g4Var.i();
                z = false;
            }
            g4Var.c();
            x3 x3Var2 = x3Var;
            x3 M = f.M(g4Var);
            x3 x3Var3 = x3Var2;
            while (M != null) {
                x3 x3Var4 = M.c;
                M.c = x3Var3;
                x3Var3 = M;
                M = x3Var4;
            }
            while (x3Var3 != null) {
                x3Var = x3Var3.c;
                Runnable runnable = x3Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof z3) {
                    z3 z3Var = (z3) runnable;
                    g4Var = z3Var.a;
                    if (g4Var.a == z3Var) {
                        if (f.x(g4Var, z3Var, h(z3Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = x3Var3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                x3Var3 = x3Var;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof u3) {
            Throwable th = ((u3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof w3) {
            throw new ExecutionException(((w3) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object h(ddb ddbVar) {
        Object obj;
        Throwable o;
        if (ddbVar instanceof b4) {
            Object obj2 = ((g4) ddbVar).a;
            if (obj2 instanceof u3) {
                u3 u3Var = (u3) obj2;
                if (u3Var.a) {
                    obj2 = u3Var.b != null ? new u3(u3Var.b, false) : u3.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((ddbVar instanceof g4) && (o = ((g4) ddbVar).o()) != null) {
            return new w3(o);
        }
        boolean isCancelled = ddbVar.isCancelled();
        boolean z = true;
        if ((!d) && isCancelled) {
            u3 u3Var2 = u3.d;
            Objects.requireNonNull(u3Var2);
            return u3Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = ddbVar.get();
                        break;
                    } catch (Error e2) {
                        e = e2;
                        return new w3(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e3) {
                e = e3;
                return new w3(e);
            } catch (CancellationException e4) {
                if (isCancelled) {
                    return new u3(e4, false);
                }
                return new w3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ddbVar, e4));
            } catch (ExecutionException e5) {
                if (!isCancelled) {
                    return new w3(e5.getCause());
                }
                return new u3(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ddbVar, e5), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? g : obj;
        }
        return new u3(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ddbVar), false);
    }

    @Override // defpackage.ddb
    public void addListener(Runnable runnable, Executor executor) {
        x3 x3Var;
        x3 x3Var2 = x3.d;
        z1a.y(runnable, "Runnable was null.");
        z1a.y(executor, "Executor was null.");
        if (!isDone() && (x3Var = this.b) != x3Var2) {
            x3 x3Var3 = new x3(runnable, executor);
            do {
                x3Var3.c = x3Var;
                if (f.w(this, x3Var, x3Var3)) {
                    return;
                } else {
                    x3Var = this.b;
                }
            } while (x3Var != x3Var2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append(U3.j.e);
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append(U3.j.e);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        u3 u3Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof z3)) {
            return false;
        }
        if (d) {
            u3Var = new u3(new CancellationException("Future.cancel() was called."), z);
        } else {
            u3Var = z ? u3.c : u3.d;
            Objects.requireNonNull(u3Var);
        }
        boolean z2 = false;
        while (true) {
            if (f.x(this, obj, u3Var)) {
                e(this, z);
                if (!(obj instanceof z3)) {
                    break;
                }
                ddb ddbVar = ((z3) obj).b;
                if (!(ddbVar instanceof b4)) {
                    ddbVar.cancel(z);
                    break;
                }
                this = (g4) ddbVar;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof z3)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof z3)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        Object obj;
        f4 f4Var = f4.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            hbo.k();
            return null;
        }
        Object obj2 = this.a;
        boolean z2 = true;
        if ((obj2 != null) && (!(obj2 instanceof z3))) {
            return g(obj2);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f4 f4Var2 = this.c;
            if (f4Var2 != f4Var) {
                obj = null;
                f4 f4Var3 = new f4();
                while (true) {
                    hkg hkgVar = f;
                    hkgVar.m0(f4Var3, f4Var2);
                    if (hkgVar.y(this, f4Var2, f4Var3)) {
                        z = z2;
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(f4Var3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if ((obj3 != null ? z : false) && ((obj3 instanceof z3) ^ z)) {
                                return g(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(f4Var3);
                    } else {
                        boolean z3 = z2;
                        long j4 = j3;
                        f4 f4Var4 = this.c;
                        if (f4Var4 == f4Var) {
                            break;
                        }
                        z2 = z3;
                        f4Var2 = f4Var4;
                        j3 = j4;
                    }
                }
            }
            Object obj4 = this.a;
            Objects.requireNonNull(obj4);
            return g(obj4);
        }
        z = true;
        j2 = 0;
        obj = null;
        while (nanos > j2) {
            Object obj5 = this.a;
            if ((obj5 != null ? z : false) && ((obj5 instanceof z3) ^ z)) {
                return g(obj5);
            }
            if (Thread.interrupted()) {
                hbo.k();
                return obj;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String g4Var = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        StringBuilder o = ljg.o("Waited ", j, " ");
        o.append(timeUnit.toString().toLowerCase(locale));
        String sb = o.toString();
        if (nanos + 1000 < j2) {
            String concat = sb.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z4 = (convert == j2 || nanos2 > 1000) ? z : false;
            if (convert > j2) {
                String str = concat + convert + " " + lowerCase;
                if (z4) {
                    str = str.concat(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                concat = str.concat(" ");
            }
            if (z4) {
                concat = vxd.m(concat, nanos2, " nanoseconds ");
            }
            sb = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(lnb.o(sb, " for ", g4Var));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof u3;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof z3)) & (this.a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(f4 f4Var) {
        f4Var.a = null;
        while (true) {
            f4 f4Var2 = this.c;
            if (f4Var2 == f4.c) {
                return;
            }
            f4 f4Var3 = null;
            while (f4Var2 != null) {
                f4 f4Var4 = f4Var2.b;
                if (f4Var2.a != null) {
                    f4Var3 = f4Var2;
                } else if (f4Var3 != null) {
                    f4Var3.b = f4Var4;
                    if (f4Var3.a == null) {
                        break;
                    }
                } else if (!f.y(this, f4Var2, f4Var4)) {
                    break;
                }
                f4Var2 = f4Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.x(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!f.x(this, null, new w3(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean n(ddb ddbVar) {
        w3 w3Var;
        ddbVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (ddbVar.isDone()) {
                if (f.x(this, null, h(ddbVar))) {
                    e(this, false);
                    return true;
                }
                return false;
            }
            z3 z3Var = new z3(this, ddbVar);
            if (f.x(this, null, z3Var)) {
                try {
                    ddbVar.addListener(z3Var, f35.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        w3Var = new w3(th);
                    } catch (Error | Exception unused) {
                        w3Var = w3.b;
                    }
                    f.x(this, z3Var, w3Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof u3) {
            ddbVar.cancel(((u3) obj).a);
        }
        return false;
    }

    public final Throwable o() {
        if (!(this instanceof b4)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof w3) {
            return ((w3) obj).a;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.a;
        return (obj instanceof u3) && ((u3) obj).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof z3) {
                sb.append(", setFuture=[");
                ddb ddbVar = ((z3) obj).b;
                try {
                    if (ddbVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ddbVar);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append(U3.j.e);
                    if (isDone()) {
                    }
                    sb.append(U3.j.e);
                    return sb.toString();
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append(U3.j.e);
                    if (isDone()) {
                    }
                    sb.append(U3.j.e);
                    return sb.toString();
                }
                sb.append(U3.j.e);
            } else {
                try {
                    str = j();
                    if (vha.M(str)) {
                        str = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    str = "Exception thrown from implementation: " + e4.getClass();
                }
                if (str != null) {
                    wt3.A(", info=[", str, sb, U3.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    public void c() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        f4 f4Var = f4.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof z3))) {
                return g(obj2);
            }
            f4 f4Var2 = this.c;
            if (f4Var2 != f4Var) {
                f4 f4Var3 = new f4();
                do {
                    hkg hkgVar = f;
                    hkgVar.m0(f4Var3, f4Var2);
                    if (hkgVar.y(this, f4Var2, f4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(f4Var3);
                                hbo.k();
                                return null;
                            }
                        } while (!((obj != null) & (!(obj instanceof z3))));
                        return g(obj);
                    }
                    f4Var2 = this.c;
                } while (f4Var2 != f4Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        hbo.k();
        return null;
    }
}
