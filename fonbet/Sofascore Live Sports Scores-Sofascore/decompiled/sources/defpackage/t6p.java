package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class t6p extends z6p {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ddb ddbVar) {
        Object obj;
        Throwable b;
        if (ddbVar instanceof r6p) {
            Object obj2 = ((t6p) ddbVar).a;
            if (obj2 instanceof n6p) {
                n6p n6pVar = (n6p) obj2;
                if (n6pVar.a) {
                    Throwable th = n6pVar.b;
                    obj2 = th != null ? new n6p(th, false) : n6p.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((ddbVar instanceof z8p) && (b = ((z8p) ddbVar).b()) != null) {
            return new p6p(b);
        }
        boolean isCancelled = ddbVar.isCancelled();
        boolean z = true;
        if ((!z6p.f) && isCancelled) {
            n6p n6pVar2 = n6p.d;
            Objects.requireNonNull(n6pVar2);
            return n6pVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = ddbVar.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new p6p(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new p6p(e);
            } catch (CancellationException e3) {
                return !isCancelled ? new p6p(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ddbVar)), e3)) : new n6p(e3, false);
            } catch (ExecutionException e4) {
                return isCancelled ? new n6p(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ddbVar)), e4), false) : new p6p(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? z6p.d : obj;
        }
        String valueOf = String.valueOf(ddbVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 84);
        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb.append(valueOf);
        return new n6p(new IllegalArgumentException(sb.toString()), false);
    }

    public static Object i(Object obj) {
        if (obj instanceof n6p) {
            Throwable th = ((n6p) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p6p) {
            throw new ExecutionException(((p6p) obj).a);
        }
        if (obj == z6p.d) {
            return null;
        }
        return obj;
    }

    public static boolean j(Object obj) {
        return !(obj instanceof o6p);
    }

    public static void n(t6p t6pVar, boolean z) {
        q6p q6pVar = null;
        while (true) {
            for (y6p e = z6p.g.e(t6pVar); e != null; e = e.b) {
                Thread thread = e.a;
                if (thread != null) {
                    e.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                t6pVar.k();
            }
            t6pVar.f();
            q6p q6pVar2 = q6pVar;
            q6p f = z6p.g.f(t6pVar, q6p.d);
            q6p q6pVar3 = q6pVar2;
            while (f != null) {
                q6p q6pVar4 = f.c;
                f.c = q6pVar3;
                q6pVar3 = f;
                f = q6pVar4;
            }
            while (q6pVar3 != null) {
                Runnable runnable = q6pVar3.a;
                q6pVar = q6pVar3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof o6p) {
                    o6p o6pVar = (o6p) runnable;
                    t6pVar = o6pVar.a;
                    if (t6pVar.a == o6pVar) {
                        if (z6p.g.g(t6pVar, o6pVar, h(o6pVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = q6pVar3.b;
                    Objects.requireNonNull(executor);
                    p(runnable, executor);
                }
                q6pVar3 = q6pVar;
            }
            return;
            z = false;
        }
    }

    public static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger b = z6p.e.b();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            b.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", fc6.o(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    @Override // defpackage.ddb
    public void addListener(Runnable runnable, Executor executor) {
        q6p q6pVar;
        if (runnable == null) {
            yhk.s("Runnable was null.");
            return;
        }
        if (executor == null) {
            yhk.s("Executor was null.");
            return;
        }
        if (!isDone() && (q6pVar = this.b) != q6p.d) {
            q6p q6pVar2 = new q6p(runnable, executor);
            do {
                q6pVar2.c = q6pVar;
                if (z6p.g.d(this, q6pVar, q6pVar2)) {
                    return;
                } else {
                    q6pVar = this.b;
                }
            } while (q6pVar != q6p.d);
        }
        p(runnable, executor);
    }

    @Override // defpackage.z8p
    public final Throwable b() {
        if (!(this instanceof r6p)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof p6p) {
            return ((p6p) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        n6p n6pVar;
        Object obj = this.a;
        if (!(obj instanceof o6p) && !(obj == null)) {
            return false;
        }
        if (z6p.f) {
            n6pVar = new n6p(new CancellationException("Future.cancel() was called."), z);
        } else {
            n6pVar = z ? n6p.c : n6p.d;
            Objects.requireNonNull(n6pVar);
        }
        boolean z2 = false;
        while (true) {
            if (z6p.g.g(this, obj, n6pVar)) {
                n(this, z);
                if (!(obj instanceof o6p)) {
                    break;
                }
                ddb ddbVar = ((o6p) obj).b;
                if (!(ddbVar instanceof r6p)) {
                    ddbVar.cancel(z);
                    break;
                }
                this = (t6p) ddbVar;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof o6p)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (j(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = z6p.d;
        }
        if (!z6p.g.g(this, null, obj)) {
            return false;
        }
        n(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        th.getClass();
        if (!z6p.g.g(this, null, new p6p(th))) {
            return false;
        }
        n(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        return fn0.l(delay, "remaining delay=[", " ms]", new StringBuilder(String.valueOf(delay).length() + 21));
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long j2;
        int i;
        Object obj;
        y6p y6pVar = y6p.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            hbo.k();
            return null;
        }
        Object obj2 = this.a;
        if ((obj2 != null) && j(obj2)) {
            return i(obj2);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            y6p y6pVar2 = this.c;
            if (y6pVar2 != y6pVar) {
                obj = null;
                y6p y6pVar3 = new y6p();
                while (true) {
                    u6p u6pVar = z6p.g;
                    u6pVar.b(y6pVar3, y6pVar2);
                    if (u6pVar.c(this, y6pVar2, y6pVar3)) {
                        j2 = j3;
                        i = 1;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(y6pVar3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if ((obj3 != null) && j(obj3)) {
                                return i(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(y6pVar3);
                    } else {
                        long j4 = j3;
                        y6p y6pVar4 = this.c;
                        if (y6pVar4 == y6pVar) {
                            break;
                        }
                        y6pVar2 = y6pVar4;
                        j3 = j4;
                    }
                }
            }
            Object obj4 = this.a;
            Objects.requireNonNull(obj4);
            return i(obj4);
        }
        j2 = 0;
        i = 1;
        obj = null;
        while (nanos > j2) {
            Object obj5 = this.a;
            if (((obj5 != null ? i : 0) & (j(obj5) ? 1 : 0)) != 0) {
                return i(obj5);
            }
            if (Thread.interrupted()) {
                hbo.k();
                return obj;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String t6pVar = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        fn0.t(j, "Waited ", " ", sb);
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < j2) {
            String concat = sb2.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            int i2 = (convert == j2 || nanos2 > 1000) ? i : 0;
            if (convert > j2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(convert).length() + concat.length() + i + String.valueOf(lowerCase).length());
                fn0.t(convert, concat, " ", sb3);
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (i2 != 0) {
                    sb4 = sb4.concat(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                concat = sb4.concat(" ");
            }
            if (i2 != 0) {
                concat = fn0.l(nanos2, concat, " nanoseconds ", new StringBuilder(x5n.f(concat.length(), nanos2) + 13));
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(wt3.m(sb2, " for ", new StringBuilder(sb2.length() + 5 + String.valueOf(t6pVar).length()), t6pVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof n6p;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (obj != null) & j(obj);
    }

    public final boolean l() {
        Object obj = this.a;
        return (obj instanceof n6p) && ((n6p) obj).a;
    }

    public final void m(ddb ddbVar) {
        p6p p6pVar;
        ddbVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (ddbVar.isDone()) {
                if (z6p.g.g(this, null, h(ddbVar))) {
                    n(this, false);
                    return;
                }
                return;
            }
            o6p o6pVar = new o6p(this, ddbVar);
            if (z6p.g.g(this, null, o6pVar)) {
                try {
                    ddbVar.addListener(o6pVar, q7p.a);
                    return;
                } catch (Throwable th) {
                    try {
                        p6pVar = new p6p(th);
                    } catch (Error | Exception unused) {
                        p6pVar = p6p.b;
                    }
                    z6p.g.g(this, o6pVar, p6pVar);
                    return;
                }
            }
            obj = this.a;
        }
        if (obj instanceof n6p) {
            ddbVar.cancel(((n6p) obj).a);
        }
    }

    public final void o(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append(U3.j.e);
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append(U3.j.e);
    }

    public String toString() {
        String concat;
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
            o(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof o6p) {
                sb.append(", setFuture=[");
                ddb ddbVar = ((o6p) obj).b;
                try {
                    if (ddbVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ddbVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(U3.j.e);
            } else {
                try {
                    concat = g();
                    if (wba.Y(concat)) {
                        concat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    wt3.A(", info=[", concat, sb, U3.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                o(sb);
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    public void f() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        y6p y6pVar = y6p.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & j(obj2)) {
                return i(obj2);
            }
            y6p y6pVar2 = this.c;
            if (y6pVar2 != y6pVar) {
                y6p y6pVar3 = new y6p();
                do {
                    u6p u6pVar = z6p.g;
                    u6pVar.b(y6pVar3, y6pVar2);
                    if (u6pVar.c(this, y6pVar2, y6pVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                c(y6pVar3);
                                hbo.k();
                                return null;
                            }
                        } while (!((obj != null) & j(obj)));
                        return i(obj);
                    }
                    y6pVar2 = this.c;
                } while (y6pVar2 != y6pVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        hbo.k();
        return null;
    }
}
