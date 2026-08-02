package com.google.android.gms.internal.play_billing;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import defpackage.fc6;
import defpackage.fwn;
import defpackage.gwn;
import defpackage.hbo;
import defpackage.hwn;
import defpackage.iwn;
import defpackage.lnb;
import defpackage.qwn;
import defpackage.twn;
import defpackage.uzn;
import defpackage.vxd;
import defpackage.wca;
import defpackage.wt3;
import defpackage.yhk;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcu<V> extends twn {
    public static Object d(Object obj) {
        if (obj instanceof fwn) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((fwn) obj).b);
            throw cancellationException;
        }
        if (obj instanceof hwn) {
            throw new ExecutionException(((hwn) obj).a);
        }
        if (obj == twn.d) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof gwn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(zzdk zzdkVar) {
        Object obj;
        Throwable b;
        if (zzdkVar instanceof uzn) {
            Object obj2 = ((zzcu) zzdkVar).a;
            if (obj2 instanceof fwn) {
                fwn fwnVar = (fwn) obj2;
                if (fwnVar.a) {
                    Throwable th = fwnVar.b;
                    obj2 = th != null ? new fwn(th, false) : fwn.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((zzdkVar instanceof zzdq) && (b = ((zzdq) zzdkVar).b()) != null) {
            return new hwn(b);
        }
        boolean isCancelled = zzdkVar.isCancelled();
        boolean z = true;
        if ((!twn.f) && isCancelled) {
            fwn fwnVar2 = fwn.d;
            Objects.requireNonNull(fwnVar2);
            return fwnVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = zzdkVar.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new hwn(e);
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
                return new hwn(e);
            } catch (CancellationException e3) {
                return !isCancelled ? new hwn(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzdkVar)), e3)) : new fwn(e3, false);
            } catch (ExecutionException e4) {
                return isCancelled ? new fwn(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzdkVar)), e4), false) : new hwn(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new fwn(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzdkVar))), false) : obj == null ? twn.d : obj;
    }

    public static void j(zzcu zzcuVar) {
        iwn iwnVar;
        iwn iwnVar2 = null;
        while (true) {
            zzcuVar.getClass();
            for (qwn M = twn.g.M(zzcuVar); M != null; M = M.b) {
                Thread thread = M.a;
                if (thread != null) {
                    M.a = null;
                    LockSupport.unpark(thread);
                }
            }
            zzcuVar.f();
            iwn iwnVar3 = iwnVar2;
            iwn L = twn.g.L(zzcuVar);
            iwn iwnVar4 = iwnVar3;
            while (L != null) {
                iwn iwnVar5 = L.c;
                L.c = iwnVar4;
                iwnVar4 = L;
                L = iwnVar5;
            }
            while (iwnVar4 != null) {
                Runnable runnable = iwnVar4.a;
                iwnVar = iwnVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof gwn) {
                    gwn gwnVar = (gwn) runnable;
                    zzcuVar = gwnVar.a;
                    if (zzcuVar.a == gwnVar) {
                        if (twn.g.S(zzcuVar, gwnVar, h(gwnVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = iwnVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                iwnVar4 = iwnVar;
            }
            return;
            iwnVar2 = iwnVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            twn.e.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", fc6.n("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void a(Runnable runnable, Executor executor) {
        iwn iwnVar;
        iwn iwnVar2 = iwn.d;
        if (executor == null) {
            yhk.s("Executor was null.");
            return;
        }
        if (!isDone() && (iwnVar = this.b) != iwnVar2) {
            iwn iwnVar3 = new iwn(runnable, executor);
            do {
                iwnVar3.c = iwnVar;
                if (twn.g.R(this, iwnVar, iwnVar3)) {
                    return;
                } else {
                    iwnVar = this.b;
                }
            } while (iwnVar != iwnVar2);
        }
        k(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final Throwable b() {
        if (!(this instanceof uzn)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof hwn) {
            return ((hwn) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        fwn fwnVar;
        Object obj = this.a;
        if (!(obj instanceof gwn) && !(obj == null)) {
            return false;
        }
        if (twn.f) {
            fwnVar = new fwn(new CancellationException("Future.cancel() was called."), z);
        } else {
            fwnVar = z ? fwn.c : fwn.d;
            Objects.requireNonNull(fwnVar);
        }
        boolean z2 = false;
        while (true) {
            if (twn.g.S(this, obj, fwnVar)) {
                j(this);
                if (!(obj instanceof gwn)) {
                    break;
                }
                zzdk zzdkVar = ((gwn) obj).b;
                if (!(zzdkVar instanceof uzn)) {
                    zzdkVar.cancel(z);
                    break;
                }
                this = (zzcu) zzdkVar;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof gwn)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (g(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public String e() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        Object obj;
        qwn qwnVar = qwn.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            hbo.k();
            return null;
        }
        Object obj2 = this.a;
        if ((obj2 != null) && g(obj2)) {
            return d(obj2);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            qwn qwnVar2 = this.c;
            if (qwnVar2 != qwnVar) {
                obj = null;
                qwn qwnVar3 = new qwn();
                while (true) {
                    wca wcaVar = twn.g;
                    wcaVar.N(qwnVar3, qwnVar2);
                    if (wcaVar.T(this, qwnVar2, qwnVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(qwnVar3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if ((obj3 != null) && g(obj3)) {
                                return d(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(qwnVar3);
                    } else {
                        long j4 = j3;
                        qwn qwnVar4 = this.c;
                        if (qwnVar4 == qwnVar) {
                            break;
                        }
                        qwnVar2 = qwnVar4;
                        j3 = j4;
                    }
                }
            }
            Object obj4 = this.a;
            Objects.requireNonNull(obj4);
            return d(obj4);
        }
        j2 = 0;
        obj = null;
        while (nanos > j2) {
            Object obj5 = this.a;
            if ((obj5 != null) && g(obj5)) {
                return d(obj5);
            }
            if (Thread.interrupted()) {
                hbo.k();
                return obj;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzcuVar = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String concat = str.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z = convert == j2 || nanos2 > 1000;
            if (convert > j2) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = vxd.m(concat, nanos2, " nanoseconds ");
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(lnb.o(str, " for ", zzcuVar));
    }

    public final void i(StringBuilder sb) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof fwn;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & g(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof fwn) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof gwn) {
                sb.append(", setFuture=[");
                zzdk zzdkVar = ((gwn) obj).b;
                try {
                    if (zzdkVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zzdkVar);
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
                    concat = e();
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    if (!concat.isEmpty()) {
                        z = false;
                        if (z) {
                            concat = null;
                        }
                        if (concat != null) {
                            wt3.A(", info=[", concat, sb, U3.j.e);
                        }
                    }
                }
                z = true;
                if (z) {
                }
                if (concat != null) {
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    public void f() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        qwn qwnVar = qwn.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & g(obj2)) {
                return d(obj2);
            }
            qwn qwnVar2 = this.c;
            if (qwnVar2 != qwnVar) {
                qwn qwnVar3 = new qwn();
                do {
                    wca wcaVar = twn.g;
                    wcaVar.N(qwnVar3, qwnVar2);
                    if (wcaVar.T(this, qwnVar2, qwnVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                c(qwnVar3);
                                hbo.k();
                                return null;
                            }
                        } while (!((obj != null) & g(obj)));
                        return d(obj);
                    }
                    qwnVar2 = this.c;
                } while (qwnVar2 != qwnVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        hbo.k();
        return null;
    }
}
