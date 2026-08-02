package com.google.android.gms.internal.play_billing;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import defpackage.a2o;
import defpackage.dvo;
import defpackage.dxo;
import defpackage.fbo;
import defpackage.fc6;
import defpackage.hbo;
import defpackage.hda;
import defpackage.lnb;
import defpackage.rro;
import defpackage.vjo;
import defpackage.vxd;
import defpackage.wt3;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzo implements zzdk {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(zzo.class.getName());
    public static final hda f;
    public static final Object g;
    public volatile Object a;
    public volatile vjo b;
    public volatile dxo c;

    static {
        hda dvoVar;
        try {
            dvoVar = new rro(AtomicReferenceFieldUpdater.newUpdater(dxo.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(dxo.class, dxo.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, dxo.class, com.mbridge.msdk.foundation.controller.a.q), AtomicReferenceFieldUpdater.newUpdater(zzo.class, vjo.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            dvoVar = new dvo();
        }
        Throwable th2 = th;
        f = dvoVar;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void c(zzo zzoVar) {
        dxo dxoVar;
        hda hdaVar;
        vjo vjoVar;
        vjo vjoVar2;
        vjo vjoVar3;
        do {
            dxoVar = zzoVar.c;
            hdaVar = f;
        } while (!hdaVar.c0(zzoVar, dxoVar, dxo.c));
        while (true) {
            vjoVar = null;
            if (dxoVar == null) {
                break;
            }
            Thread thread = dxoVar.a;
            if (thread != null) {
                dxoVar.a = null;
                LockSupport.unpark(thread);
            }
            dxoVar = dxoVar.b;
        }
        do {
            vjoVar2 = zzoVar.b;
        } while (!hdaVar.a0(zzoVar, vjoVar2, vjo.d));
        while (true) {
            vjoVar3 = vjoVar;
            vjoVar = vjoVar2;
            if (vjoVar == null) {
                break;
            }
            vjoVar2 = vjoVar.c;
            vjoVar.c = vjoVar3;
        }
        while (vjoVar3 != null) {
            Runnable runnable = vjoVar3.a;
            vjo vjoVar4 = vjoVar3.c;
            e(runnable, vjoVar3.b);
            vjoVar3 = vjoVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", fc6.n("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object g(Object obj) {
        if (obj instanceof a2o) {
            Throwable th = ((a2o) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof fbo) {
            throw new ExecutionException(((fbo) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        vjo vjoVar = this.b;
        vjo vjoVar2 = vjo.d;
        if (vjoVar != vjoVar2) {
            vjo vjoVar3 = new vjo(runnable, executor);
            do {
                vjoVar3.c = vjoVar;
                if (f.a0(this, vjoVar, vjoVar3)) {
                    return;
                } else {
                    vjoVar = this.b;
                }
            } while (vjoVar != vjoVar2);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return vxd.m("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.b0(this, obj, d ? new a2o(new CancellationException("Future.cancel() was called.")) : z ? a2o.b : a2o.c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(StringBuilder sb) {
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
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append(U3.j.e);
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v == this ? "this future" : String.valueOf(v));
        sb.append(U3.j.e);
    }

    public final void f(dxo dxoVar) {
        dxoVar.a = null;
        while (true) {
            dxo dxoVar2 = this.c;
            if (dxoVar2 != dxo.c) {
                dxo dxoVar3 = null;
                while (dxoVar2 != null) {
                    dxo dxoVar4 = dxoVar2.b;
                    if (dxoVar2.a != null) {
                        dxoVar3 = dxoVar2;
                    } else if (dxoVar3 != null) {
                        dxoVar3.b = dxoVar4;
                        if (dxoVar3.a == null) {
                            break;
                        }
                    } else if (!f.c0(this, dxoVar2, dxoVar4)) {
                        break;
                    }
                    dxoVar2 = dxoVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            hbo.k();
            return null;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return g(obj2);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            dxo dxoVar = this.c;
            dxo dxoVar2 = dxo.c;
            if (dxoVar != dxoVar2) {
                dxo dxoVar3 = new dxo();
                obj = null;
                do {
                    hda hdaVar = f;
                    hdaVar.W(dxoVar3, dxoVar);
                    if (hdaVar.c0(this, dxoVar, dxoVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(dxoVar3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if (obj3 != null) {
                                return g(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(dxoVar3);
                    } else {
                        dxoVar = this.c;
                    }
                } while (dxoVar != dxoVar2);
            }
            return g(this.a);
        }
        obj = null;
        while (nanos > 0) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return g(obj4);
            }
            if (Thread.interrupted()) {
                hbo.k();
                return obj;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzoVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
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
        throw new TimeoutException(lnb.o(str, " for ", zzoVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof a2o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof a2o) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                wt3.A("PENDING, info=[", concat, sb, U3.j.e);
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return g(obj2);
            }
            dxo dxoVar = this.c;
            dxo dxoVar2 = dxo.c;
            if (dxoVar != dxoVar2) {
                dxo dxoVar3 = new dxo();
                do {
                    hda hdaVar = f;
                    hdaVar.W(dxoVar3, dxoVar);
                    if (hdaVar.c0(this, dxoVar, dxoVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                f(dxoVar3);
                                hbo.k();
                                return null;
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    dxoVar = this.c;
                } while (dxoVar != dxoVar2);
            }
            return g(this.a);
        }
        hbo.k();
        return null;
    }
}
