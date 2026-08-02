package com.google.android.gms.internal.ads;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import defpackage.alo;
import defpackage.b0a;
import defpackage.ddb;
import defpackage.fc6;
import defpackage.flo;
import defpackage.fn0;
import defpackage.glo;
import defpackage.hbo;
import defpackage.slo;
import defpackage.w3a;
import defpackage.wko;
import defpackage.wt3;
import defpackage.x5n;
import defpackage.xko;
import defpackage.yko;
import defpackage.zko;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhbr<V> extends glo {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ddb ddbVar) {
        Object obj;
        Throwable b;
        if (ddbVar instanceof alo) {
            Object obj2 = ((zzhbr) ddbVar).a;
            if (obj2 instanceof wko) {
                wko wkoVar = (wko) obj2;
                if (wkoVar.a) {
                    Throwable th = wkoVar.b;
                    obj2 = th != null ? new wko(th, false) : wko.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((ddbVar instanceof zzhea) && (b = ((zzhea) ddbVar).b()) != null) {
            return new yko(b);
        }
        boolean isCancelled = ddbVar.isCancelled();
        boolean z = true;
        if ((!glo.f) && isCancelled) {
            wko wkoVar2 = wko.d;
            Objects.requireNonNull(wkoVar2);
            return wkoVar2;
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
                        return new yko(e);
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
                return new yko(e);
            } catch (CancellationException e3) {
                return !isCancelled ? new yko(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ddbVar)), e3)) : new wko(e3, false);
            } catch (ExecutionException e4) {
                return isCancelled ? new wko(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ddbVar)), e4), false) : new yko(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? glo.d : obj;
        }
        String valueOf = String.valueOf(ddbVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 84);
        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb.append(valueOf);
        return new wko(new IllegalArgumentException(sb.toString()), false);
    }

    public static Object i(Object obj) {
        if (obj instanceof wko) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((wko) obj).b);
            throw cancellationException;
        }
        if (obj instanceof yko) {
            throw new ExecutionException(((yko) obj).a);
        }
        if (obj == glo.d) {
            return null;
        }
        return obj;
    }

    public static boolean j(Object obj) {
        return !(obj instanceof xko);
    }

    public static void o(zzhbr zzhbrVar, boolean z) {
        zko zkoVar = null;
        while (true) {
            for (flo b0 = glo.g.b0(zzhbrVar); b0 != null; b0 = b0.b) {
                Thread thread = b0.a;
                if (thread != null) {
                    b0.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzhbrVar.k();
            }
            zzhbrVar.f();
            zko zkoVar2 = zkoVar;
            zko d0 = glo.g.d0(zzhbrVar);
            zko zkoVar3 = zkoVar2;
            while (d0 != null) {
                zko zkoVar4 = d0.c;
                d0.c = zkoVar3;
                zkoVar3 = d0;
                d0 = zkoVar4;
            }
            while (zkoVar3 != null) {
                Runnable runnable = zkoVar3.a;
                zkoVar = zkoVar3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof xko) {
                    xko xkoVar = (xko) runnable;
                    zzhbrVar = xkoVar.a;
                    if (zzhbrVar.a == xkoVar) {
                        if (glo.g.e0(zzhbrVar, xkoVar, h(xkoVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zkoVar3.b;
                    Objects.requireNonNull(executor);
                    q(runnable, executor);
                }
                zkoVar3 = zkoVar;
            }
            return;
            z = false;
        }
    }

    public static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger b = glo.e.b();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            b.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", fc6.o(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    @Override // defpackage.ddb
    public void addListener(Runnable runnable, Executor executor) {
        zko zkoVar;
        zko zkoVar2 = zko.d;
        zzguk.h(runnable, "Runnable was null.");
        zzguk.h(executor, "Executor was null.");
        if (!isDone() && (zkoVar = this.b) != zkoVar2) {
            zko zkoVar3 = new zko(runnable, executor);
            do {
                zkoVar3.c = zkoVar;
                if (glo.g.a0(this, zkoVar, zkoVar3)) {
                    return;
                } else {
                    zkoVar = this.b;
                }
            } while (zkoVar != zkoVar2);
        }
        q(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final Throwable b() {
        if (!(this instanceof alo)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof yko) {
            return ((yko) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        wko wkoVar;
        Object obj = this.a;
        if (!(obj instanceof xko) && !(obj == null)) {
            return false;
        }
        if (glo.f) {
            wkoVar = new wko(new CancellationException("Future.cancel() was called."), z);
        } else {
            wkoVar = z ? wko.c : wko.d;
            Objects.requireNonNull(wkoVar);
        }
        boolean z2 = false;
        while (true) {
            if (glo.g.e0(this, obj, wkoVar)) {
                o(this, z);
                if (!(obj instanceof xko)) {
                    break;
                }
                ddb ddbVar = ((xko) obj).b;
                if (!(ddbVar instanceof alo)) {
                    ddbVar.cancel(z);
                    break;
                }
                this = (zzhbr) ddbVar;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof xko)) {
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
            obj = glo.d;
        }
        if (!glo.g.e0(this, null, obj)) {
            return false;
        }
        o(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        if (!glo.g.e0(this, null, new yko(th))) {
            return false;
        }
        o(this, false);
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
        flo floVar = flo.c;
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
            flo floVar2 = this.c;
            if (floVar2 != floVar) {
                obj = null;
                flo floVar3 = new flo();
                while (true) {
                    w3a w3aVar = glo.g;
                    w3aVar.Y(floVar3, floVar2);
                    if (w3aVar.Z(this, floVar2, floVar3)) {
                        j2 = j3;
                        i = 1;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(floVar3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if ((obj3 != null) && j(obj3)) {
                                return i(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(floVar3);
                    } else {
                        long j4 = j3;
                        flo floVar4 = this.c;
                        if (floVar4 == floVar) {
                            break;
                        }
                        floVar2 = floVar4;
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
        String zzhbrVar = toString();
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
        throw new TimeoutException(wt3.m(sb2, " for ", new StringBuilder(sb2.length() + 5 + String.valueOf(zzhbrVar).length()), zzhbrVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof wko;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (obj != null) & j(obj);
    }

    public final boolean l() {
        Object obj = this.a;
        return (obj instanceof wko) && ((wko) obj).a;
    }

    public final void m(ddb ddbVar) {
        yko ykoVar;
        ddbVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (ddbVar.isDone()) {
                if (glo.g.e0(this, null, h(ddbVar))) {
                    o(this, false);
                    return;
                }
                return;
            }
            xko xkoVar = new xko(this, ddbVar);
            if (glo.g.e0(this, null, xkoVar)) {
                try {
                    ddbVar.addListener(xkoVar, slo.a);
                    return;
                } catch (Throwable th) {
                    try {
                        ykoVar = new yko(th);
                    } catch (Error | Exception unused) {
                        ykoVar = yko.b;
                    }
                    glo.g.e0(this, xkoVar, ykoVar);
                    return;
                }
            }
            obj = this.a;
        }
        if (obj instanceof wko) {
            ddbVar.cancel(((wko) obj).a);
        }
    }

    public final void n(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(l());
        }
    }

    public final void p(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
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
        if (v == null) {
            sb.append("null");
        } else if (v == this) {
            sb.append("this future");
        } else {
            sb.append(v.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(v)));
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
            p(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof xko) {
                sb.append(", setFuture=[");
                ddb ddbVar = ((xko) obj).b;
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
                    if (b0a.U(concat)) {
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
                p(sb);
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
        flo floVar = flo.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & j(obj2)) {
                return i(obj2);
            }
            flo floVar2 = this.c;
            if (floVar2 != floVar) {
                flo floVar3 = new flo();
                do {
                    w3a w3aVar = glo.g;
                    w3aVar.Y(floVar3, floVar2);
                    if (w3aVar.Z(this, floVar2, floVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                c(floVar3);
                                hbo.k();
                                return null;
                            }
                        } while (!((obj != null) & j(obj)));
                        return i(obj);
                    }
                    floVar2 = this.c;
                } while (floVar2 != floVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        hbo.k();
        return null;
    }
}
