package com.google.android.gms.internal.cast;

import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.internal.cast.zzwa;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import xsna.e630;
import xsna.tdj;
import xsna.tj0;
import xsna.ugz;
import xsna.wr01;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
abstract class zzwb<V> extends zzwx implements ugz<V> {
    static final Object zza = new Object();
    static final zzwn zzb = new zzwn(zzwa.class);
    static final boolean zzc;
    private static final zza zzd;
    volatile zzwa.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzwb zzwbVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzd(zzwb zzwbVar, zzwa.zzd zzdVar, zzwa.zzd zzdVar2);

        public abstract zze zze(zzwb zzwbVar, zze zzeVar);

        public abstract zzwa.zzd zzf(zzwb zzwbVar, zzwa.zzd zzdVar);

        public abstract boolean zzg(zzwb zzwbVar, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzwb<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzwb.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzwb<?>, zzwa.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzwb.class, zzwa.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzwb<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzwb.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzc(zzwb zzwbVar, zze zzeVar, zze zzeVar2) {
            AtomicReferenceFieldUpdater<? super zzwb<?>, zze> atomicReferenceFieldUpdater = zzc;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzwbVar, zzeVar, zzeVar2)) {
                if (atomicReferenceFieldUpdater.get(zzwbVar) != zzeVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzd(zzwb zzwbVar, zzwa.zzd zzdVar, zzwa.zzd zzdVar2) {
            AtomicReferenceFieldUpdater<? super zzwb<?>, zzwa.zzd> atomicReferenceFieldUpdater = zzd;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzwbVar, zzdVar, zzdVar2)) {
                if (atomicReferenceFieldUpdater.get(zzwbVar) != zzdVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final zze zze(zzwb zzwbVar, zze zzeVar) {
            return zzc.getAndSet(zzwbVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final zzwa.zzd zzf(zzwb zzwbVar, zzwa.zzd zzdVar) {
            return zzd.getAndSet(zzwbVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzg(zzwb zzwbVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super zzwb<?>, Object> atomicReferenceFieldUpdater = zze;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzwbVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(zzwbVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzc(zzwb zzwbVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzwbVar) {
                try {
                    if (zzwbVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzwbVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzd(zzwb zzwbVar, zzwa.zzd zzdVar, zzwa.zzd zzdVar2) {
            synchronized (zzwbVar) {
                try {
                    if (zzwbVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzwbVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final zze zze(zzwb zzwbVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzwbVar) {
                try {
                    zzeVar2 = zzwbVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzwbVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final zzwa.zzd zzf(zzwb zzwbVar, zzwa.zzd zzdVar) {
            zzwa.zzd zzdVar2;
            synchronized (zzwbVar) {
                try {
                    zzdVar2 = zzwbVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzwbVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzg(zzwb zzwbVar, Object obj, Object obj2) {
            synchronized (zzwbVar) {
                try {
                    if (zzwbVar.valueField != obj) {
                        return false;
                    }
                    zzwbVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(zzwc.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzwb.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzwb.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzwb.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzc(zzwb zzwbVar, zze zzeVar, zze zzeVar2) {
            return wr01.a(zza, zzwbVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzd(zzwb zzwbVar, zzwa.zzd zzdVar, zzwa.zzd zzdVar2) {
            return wr01.a(zza, zzwbVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final zze zze(zzwb zzwbVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzwbVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzwbVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final zzwa.zzd zzf(zzwb zzwbVar, zzwa.zzd zzdVar) {
            zzwa.zzd zzdVar2;
            do {
                zzdVar2 = zzwbVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzwbVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzwb.zza
        public final boolean zzg(zzwb zzwbVar, Object obj, Object obj2) {
            return wr01.a(zza, zzwbVar, zzd, obj, obj2);
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z) {
        }

        public zze() {
            zzwb.zzn(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", CredentialEntry.FALSE_STRING));
        } catch (SecurityException unused) {
            z = false;
        }
        zzc = z;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains(X3.d)) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e;
                } catch (Error | Exception e2) {
                    th = e2;
                    th2 = e;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zzd = zzcVar;
        if (th != null) {
            zzwn zzwnVar = zzb;
            Logger zza2 = zzwnVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzwnVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzd.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static boolean zzj(zzwb zzwbVar, Object obj, Object obj2) {
        return zzd.zzg(zzwbVar, obj, obj2);
    }

    public static /* synthetic */ void zzn(zze zzeVar, Thread thread) {
        zzd.zza(zzeVar, thread);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    public final boolean zzh(zzwa.zzd zzdVar, zzwa.zzd zzdVar2) {
        return zzd.zzd(this, zzdVar, zzdVar2);
    }

    public final zzwa.zzd zzi(zzwa.zzd zzdVar) {
        return zzd.zzf(this, zzdVar);
    }

    public final void zzk() {
        for (zze zze2 = zzd.zze(this, zze.zza); zze2 != null; zze2 = zze2.next) {
            Thread thread = zze2.thread;
            if (thread != null) {
                zze2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzl(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzwa.zzb(obj)) {
            return zzwa.zza(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzd;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzwa.zzb(obj2)) {
                                return zzwa.zza(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzwa.zza(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzwa.zzb(obj4)) {
                return zzwa.zza(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        tj0.d(sb, "Waited ", j, " ");
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
                tj0.d(sb3, concat, convert, " ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(StringUtils.COMMA);
                }
                concat = sb4.concat(" ");
            }
            if (z) {
                concat = e630.c(new StringBuilder(String.valueOf(nanos2).length() + concat.length() + 13), concat, nanos2, " nanoseconds ");
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(tdj.a(new StringBuilder(sb2.length() + 5 + String.valueOf(obj5).length()), sb2, " for ", obj5));
    }

    public final Object zzm() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzwa.zzb(obj2)) {
            return zzwa.zza(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzd;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzwa.zzb(obj)));
                    return zzwa.zza(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzwa.zza(obj3);
    }
}
