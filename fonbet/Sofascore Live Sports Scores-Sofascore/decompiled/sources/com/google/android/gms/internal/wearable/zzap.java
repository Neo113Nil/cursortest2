package com.google.android.gms.internal.wearable;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import defpackage.fn0;
import defpackage.haa;
import defpackage.hbo;
import defpackage.hin;
import defpackage.iin;
import defpackage.jin;
import defpackage.vin;
import defpackage.wt3;
import defpackage.x5n;
import defpackage.yin;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzap<V> extends yin {
    public static Object c(Object obj) {
        if (obj instanceof hin) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((hin) obj).b);
            throw cancellationException;
        }
        if (obj instanceof iin) {
            throw new ExecutionException(((iin) obj).a);
        }
        if (obj == yin.d) {
            return null;
        }
        return obj;
    }

    public static Object f(zzap zzapVar) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = zzapVar.get();
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

    public static void g(zzap zzapVar) {
        for (vin U = yin.g.U(zzapVar); U != null; U = U.b) {
            Thread thread = U.a;
            if (thread != null) {
                U.a = null;
                LockSupport.unpark(thread);
            }
        }
        zzapVar.d();
        jin W = yin.g.W(zzapVar);
        jin jinVar = null;
        while (W != null) {
            jin jinVar2 = W.a;
            W.a = jinVar;
            jinVar = W;
            W = jinVar2;
        }
        if (jinVar != null) {
            throw null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        hin hinVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (yin.f) {
            hinVar = new hin(new CancellationException("Future.cancel() was called."), z);
        } else {
            hinVar = z ? hin.c : hin.d;
            Objects.requireNonNull(hinVar);
        }
        if (!yin.g.Z(this, obj, hinVar)) {
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
        vin vinVar = vin.c;
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
            vin vinVar2 = this.c;
            if (vinVar2 != vinVar) {
                vin vinVar3 = new vin();
                obj = null;
                do {
                    haa haaVar = yin.g;
                    haaVar.R(vinVar3, vinVar2);
                    if (haaVar.T(this, vinVar2, vinVar3)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(vinVar3);
                                hbo.k();
                                return null;
                            }
                            Object obj3 = this.a;
                            if (obj3 != null) {
                                return c(obj3);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(vinVar3);
                    } else {
                        vinVar2 = this.c;
                    }
                } while (vinVar2 != vinVar);
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
        String zzapVar = toString();
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
        throw new TimeoutException(wt3.m(sb2, " for ", new StringBuilder(sb2.length() + 5 + zzapVar.length()), zzapVar));
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
        return this.a instanceof hin;
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
        if (this.a instanceof hin) {
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
        vin vinVar = vin.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return c(obj2);
            }
            vin vinVar2 = this.c;
            if (vinVar2 != vinVar) {
                vin vinVar3 = new vin();
                do {
                    haa haaVar = yin.g;
                    haaVar.R(vinVar3, vinVar2);
                    if (haaVar.T(this, vinVar2, vinVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                b(vinVar3);
                                hbo.k();
                                return null;
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    vinVar2 = this.c;
                } while (vinVar2 != vinVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return c(obj3);
        }
        hbo.k();
        return null;
    }
}
