package com.google.android.gms.internal.cast;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import defpackage.bap;
import defpackage.cap;
import defpackage.dap;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.hap;
import defpackage.hbo;
import defpackage.iap;
import defpackage.sha;
import defpackage.wt3;
import defpackage.x5n;
import defpackage.yhk;
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
/* loaded from: classes3.dex */
public abstract class zzwa<V> extends iap {
    public static Object c(Object obj) {
        if (obj instanceof bap) {
            Throwable th = ((bap) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof cap) {
            throw new ExecutionException(((cap) obj).a);
        }
        if (obj == iap.d) {
            return null;
        }
        return obj;
    }

    public static Object f(zzwa zzwaVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = zzwaVar.get();
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

    public static void g(zzwa zzwaVar) {
        for (hap e0 = iap.g.e0(zzwaVar); e0 != null; e0 = e0.b) {
            Thread thread = e0.a;
            if (thread != null) {
                e0.a = null;
                LockSupport.unpark(thread);
            }
        }
        zzwaVar.d();
        dap g0 = iap.g.g0(zzwaVar);
        dap dapVar = null;
        while (g0 != null) {
            dap dapVar2 = g0.c;
            g0.c = dapVar;
            dapVar = g0;
            g0 = dapVar2;
        }
        while (dapVar != null) {
            Runnable runnable = dapVar.a;
            dap dapVar3 = dapVar.c;
            Objects.requireNonNull(runnable);
            Executor executor = dapVar.b;
            Objects.requireNonNull(executor);
            i(runnable, executor);
            dapVar = dapVar3;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger b = iap.e.b();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            b.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", fc6.o(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        dap dapVar;
        dap dapVar2 = dap.d;
        if (runnable == null) {
            yhk.s("Runnable was null.");
            return;
        }
        if (executor == null) {
            yhk.s("Executor was null.");
            return;
        }
        if (!isDone() && (dapVar = this.b) != dapVar2) {
            dap dapVar3 = new dap(runnable, executor);
            do {
                dapVar3.c = dapVar;
                if (iap.g.d0(this, dapVar, dapVar3)) {
                    return;
                } else {
                    dapVar = this.b;
                }
            } while (dapVar != dapVar2);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        bap bapVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (iap.f) {
            bapVar = new bap(new CancellationException("Future.cancel() was called."), z);
        } else {
            bapVar = z ? bap.c : bap.d;
            Objects.requireNonNull(bapVar);
        }
        if (!iap.g.h0(this, obj, bapVar)) {
            return false;
        }
        g(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String e() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        return fn0.l(delay, "remaining delay=[", " ms]", new StringBuilder(String.valueOf(delay).length() + 21));
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        hap hapVar = hap.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            hbo.k();
            return null;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return c(obj2);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            hap hapVar2 = this.c;
            if (hapVar2 != hapVar) {
                hap hapVar3 = new hap();
                obj = null;
                do {
                    sha shaVar = iap.g;
                    shaVar.b0(hapVar3, hapVar2);
                    if (shaVar.c0(this, hapVar2, hapVar3)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(hapVar3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if (obj3 != null) {
                                return c(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(hapVar3);
                    } else {
                        hapVar2 = this.c;
                    }
                } while (hapVar2 != hapVar);
            }
            Object obj4 = this.a;
            Objects.requireNonNull(obj4);
            return c(obj4);
        }
        obj = null;
        while (nanos > 0) {
            Object obj5 = this.a;
            if (obj5 != null) {
                return c(obj5);
            }
            if (Thread.interrupted()) {
                hbo.k();
                return obj;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzwaVar = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        fn0.t(j, "Waited ", " ", sb);
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(convert).length() + concat.length() + 1 + String.valueOf(lowerCase).length());
                fn0.t(convert, concat, " ", sb3);
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                concat = sb4.concat(" ");
            }
            if (z) {
                concat = fn0.l(nanos2, concat, " nanoseconds ", new StringBuilder(x5n.f(concat.length(), nanos2) + 13));
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(wt3.m(sb2, " for ", new StringBuilder(sb2.length() + 5 + zzwaVar.length()), zzwaVar));
    }

    public final void h(StringBuilder sb) {
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            if (f == null) {
                sb.append("null");
            } else if (f == this) {
                sb.append("this future");
            } else {
                sb.append(f.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f)));
            }
            sb.append(U3.j.e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(U3.j.e);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof bap;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
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
        if (this.a instanceof bap) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                concat = e();
                if (concat != null) {
                }
                concat = null;
            } catch (Throwable th) {
                if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                    throw th;
                }
                concat = "Exception thrown from implementation: ".concat(String.valueOf(th.getClass()));
            }
            if (concat != null) {
                wt3.A(", info=[", concat, sb, U3.j.e);
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                h(sb);
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        hap hapVar = hap.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return c(obj2);
            }
            hap hapVar2 = this.c;
            if (hapVar2 != hapVar) {
                hap hapVar3 = new hap();
                do {
                    sha shaVar = iap.g;
                    shaVar.b0(hapVar3, hapVar2);
                    if (shaVar.c0(this, hapVar2, hapVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                b(hapVar3);
                                hbo.k();
                                return null;
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    hapVar2 = this.c;
                } while (hapVar2 != hapVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return c(obj3);
        }
        hbo.k();
        return null;
    }
}
