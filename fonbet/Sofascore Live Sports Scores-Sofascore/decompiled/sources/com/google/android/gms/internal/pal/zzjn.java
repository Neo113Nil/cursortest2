package com.google.android.gms.internal.pal;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import defpackage.bro;
import defpackage.haa;
import defpackage.hbo;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.oso;
import defpackage.pso;
import defpackage.qso;
import defpackage.rso;
import defpackage.sso;
import defpackage.tso;
import defpackage.uso;
import defpackage.vxd;
import defpackage.wt3;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzjn<V> extends zzjs implements zzjq<V> {
    public static final boolean d;
    public static final Logger e;
    public static final haa f;
    public static final Object g;
    public volatile Object a;
    public volatile qso b;
    public volatile uso c;

    static {
        boolean z;
        haa ssoVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(zzjn.class.getName());
        try {
            ssoVar = new tso();
            th = null;
            th2 = null;
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                ssoVar = new rso(AtomicReferenceFieldUpdater.newUpdater(uso.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(uso.class, uso.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzjn.class, uso.class, com.mbridge.msdk.foundation.controller.a.q), AtomicReferenceFieldUpdater.newUpdater(zzjn.class, qso.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzjn.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e3) {
                ssoVar = new sso();
                th = e3;
                th2 = e2;
            }
        }
        f = ssoVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static Object b(zzjn zzjnVar) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = zzjnVar.get();
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
        return v;
    }

    public static void d(zzjn zzjnVar) {
        for (uso Q = f.Q(zzjnVar); Q != null; Q = Q.b) {
            Thread thread = Q.a;
            if (thread != null) {
                Q.a = null;
                LockSupport.unpark(thread);
            }
        }
        qso O = f.O(zzjnVar);
        qso qsoVar = null;
        while (O != null) {
            qso qsoVar2 = O.a;
            O.a = qsoVar;
            qsoVar = O;
            O = qsoVar2;
        }
        if (qsoVar != null) {
            throw null;
        }
    }

    public static final Object f(Object obj) {
        if (obj instanceof oso) {
            Throwable th = ((oso) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof pso) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public final void c(StringBuilder sb) {
        try {
            Object b = b(this);
            sb.append("SUCCESS, result=[");
            if (b == null) {
                sb.append("null");
            } else if (b == this) {
                sb.append("this future");
            } else {
                sb.append(b.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(b)));
            }
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
        oso osoVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            osoVar = new oso(new CancellationException("Future.cancel() was called."), z);
        } else {
            osoVar = z ? oso.b : oso.c;
            osoVar.getClass();
        }
        if (!f.X(this, obj, osoVar)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(uso usoVar) {
        usoVar.a = null;
        while (true) {
            uso usoVar2 = this.c;
            if (usoVar2 != uso.c) {
                uso usoVar3 = null;
                while (usoVar2 != null) {
                    uso usoVar4 = usoVar2.b;
                    if (usoVar2.a != null) {
                        usoVar3 = usoVar2;
                    } else if (usoVar3 != null) {
                        usoVar3.b = usoVar4;
                        if (usoVar3.a == null) {
                            break;
                        }
                    } else if (!f.Y(this, usoVar2, usoVar4)) {
                        break;
                    }
                    usoVar2 = usoVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        uso usoVar = uso.c;
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
            uso usoVar2 = this.c;
            if (usoVar2 != usoVar) {
                uso usoVar3 = new uso();
                obj = null;
                do {
                    haa haaVar = f;
                    haaVar.S(usoVar3, usoVar2);
                    if (haaVar.Y(this, usoVar2, usoVar3)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                e(usoVar3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if (obj3 != null) {
                                return f(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(usoVar3);
                    } else {
                        usoVar2 = this.c;
                    }
                } while (usoVar2 != usoVar);
            }
            Object obj4 = this.a;
            obj4.getClass();
            return f(obj4);
        }
        obj = null;
        while (nanos > 0) {
            Object obj5 = this.a;
            if (obj5 != null) {
                return f(obj5);
            }
            if (Thread.interrupted()) {
                hbo.k();
                return obj;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzjnVar = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        StringBuilder o = ljg.o("Waited ", j, " ");
        o.append(timeUnit.toString().toLowerCase(locale));
        String sb = o.toString();
        if (nanos + 1000 < 0) {
            String concat = sb.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
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
        throw new TimeoutException(lnb.o(sb, " for ", zzjnVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof oso;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
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
        if (this.a instanceof oso) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                concat = null;
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
                int i = bro.a;
                if (str != null) {
                    if (!str.isEmpty()) {
                        concat = str;
                    }
                }
            } catch (RuntimeException e2) {
                e = e2;
                Class<?> cls = e.getClass();
                cls.toString();
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
                if (concat != null) {
                }
                if (isDone()) {
                }
                sb.append(U3.j.e);
                return sb.toString();
            } catch (StackOverflowError e3) {
                e = e3;
                Class<?> cls2 = e.getClass();
                cls2.toString();
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls2));
                if (concat != null) {
                }
                if (isDone()) {
                }
                sb.append(U3.j.e);
                return sb.toString();
            }
            if (concat != null) {
                wt3.A(", info=[", concat, sb, U3.j.e);
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                c(sb);
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        uso usoVar = uso.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            uso usoVar2 = this.c;
            if (usoVar2 != usoVar) {
                uso usoVar3 = new uso();
                do {
                    haa haaVar = f;
                    haaVar.S(usoVar3, usoVar2);
                    if (haaVar.Y(this, usoVar2, usoVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                e(usoVar3);
                                hbo.k();
                                return null;
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    usoVar2 = this.c;
                } while (usoVar2 != usoVar);
            }
            Object obj3 = this.a;
            obj3.getClass();
            return f(obj3);
        }
        hbo.k();
        return null;
    }
}
