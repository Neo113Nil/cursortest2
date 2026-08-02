package com.google.android.gms.internal.cast;

import com.ironsource.X3;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.e630;
import xsna.h5s;
import xsna.jh;
import xsna.ugz;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzwa<V> extends zzwb<V> {

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzwb.zzc) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        public zza(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zzb<V> implements Runnable {
        final zzwa<V> zza;
        final ugz<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.cast.zzwa.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    interface zze<V> extends ugz<V> {
        @Override // xsna.ugz
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    abstract class zzf<V> extends zzwa<V> implements zze<V> {
    }

    public static Object zza(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzwb.zza) {
            return null;
        }
        return obj;
    }

    public static boolean zzb(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object zzo(ugz ugzVar) {
        Throwable zzf2;
        if (ugzVar instanceof zze) {
            Object obj = ((zzwa) ugzVar).valueField;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    obj = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((ugzVar instanceof zzwx) && (zzf2 = ((zzwx) ugzVar).zzf()) != null) {
            return new zzc(zzf2);
        }
        boolean isCancelled = ugzVar.isCancelled();
        if ((!zzwb.zzc) && isCancelled) {
            zza zzaVar2 = zza.zzb;
            Objects.requireNonNull(zzaVar2);
            return zzaVar2;
        }
        try {
            Object zzp = zzp(ugzVar);
            if (!isCancelled) {
                return zzp == null ? zzwb.zza : zzp;
            }
            String valueOf = String.valueOf(ugzVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e) {
            return new zzc(e);
        } catch (CancellationException e2) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ugzVar)), e2)) : new zza(false, e2);
        } catch (ExecutionException e3) {
            return isCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ugzVar)), e3)) : new zzc(e3.getCause());
        }
    }

    private static Object zzp(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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

    private static void zzq(zzwa zzwaVar, boolean z) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            zzwaVar.zzk();
            zzwaVar.zze();
            zzd zzdVar3 = zzdVar2;
            zzd zzi = zzwaVar.zzi(zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zzi != null) {
                zzd zzdVar5 = zzi.next;
                zzi.next = zzdVar4;
                zzdVar4 = zzi;
                zzi = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzwaVar = zzbVar.zza;
                    if (zzwaVar.valueField == zzbVar && zzwb.zzj(zzwaVar, zzbVar, zzo(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    Executor executor = zzdVar4.zzc;
                    Objects.requireNonNull(executor);
                    zzs(runnable2, executor);
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private final void zzr(StringBuilder sb) {
        try {
            Object zzp = zzp(this);
            sb.append("SUCCESS, result=[");
            if (zzp == null) {
                sb.append("null");
            } else if (zzp == this) {
                sb.append("this future");
            } else {
                sb.append(zzp.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzp)));
            }
            sb.append(X3.j.e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(X3.j.e);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void zzs(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzwb.zzb.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", h5s.d(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwb, xsna.ugz
    public final void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzhd.zza(runnable, "Runnable was null.");
        zzhd.zza(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzh(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzs(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzwb.zzc) {
            zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzwa<V> zzwaVar = this;
        boolean z2 = false;
        while (true) {
            if (zzwb.zzj(zzwaVar, obj, zzaVar)) {
                zzq(zzwaVar, z);
                if (!(obj instanceof zzb)) {
                    break;
                }
                ugz<? extends V> ugzVar = ((zzb) obj).zzb;
                if (!(ugzVar instanceof zze)) {
                    ugzVar.cancel(z);
                    break;
                }
                zzwaVar = (zzwa) ugzVar;
                obj = zzwaVar.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = zzwaVar.valueField;
                if (zzb(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return zzm();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzb(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r3.isEmpty() != false) goto L27;
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
        if (this.valueField instanceof zza) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzr(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                ugz<? extends V> ugzVar = ((zzb) obj).zzb;
                try {
                    if (ugzVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ugzVar);
                    }
                } catch (Throwable th) {
                    zzwu.zza(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(X3.j.e);
            } else {
                try {
                    concat = zzg();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Throwable th2) {
                    zzwu.zza(th2);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    jh.f(sb, ", info=[", concat, X3.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzr(sb);
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    public final boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzwb.zza;
        }
        if (!zzwb.zzj(this, null, obj)) {
            return false;
        }
        zzq(this, false);
        return true;
    }

    public final boolean zzd(Throwable th) {
        if (!zzwb.zzj(this, null, new zzc(th))) {
            return false;
        }
        zzq(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.cast.zzwx
    public final Throwable zzf() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzg() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        return e630.c(new StringBuilder(String.valueOf(delay).length() + 21), "remaining delay=[", delay, " ms]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzl(j, timeUnit);
    }

    public void zze() {
    }
}
