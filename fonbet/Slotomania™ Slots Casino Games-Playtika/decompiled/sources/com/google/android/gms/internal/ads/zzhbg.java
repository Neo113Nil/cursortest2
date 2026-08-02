package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhbg implements Runnable {
    final Future zza;
    final zzhbf zzb;

    zzhbg(Future future, zzhbf zzhbfVar) {
        this.zza = future;
        this.zzb = zzhbfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzhck) && (zza = zzhcl.zza((zzhck) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzhbi.zzs(future));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgss zzb = zzgst.zzb(this);
        zzb.zza(this.zzb);
        return zzb.toString();
    }
}
