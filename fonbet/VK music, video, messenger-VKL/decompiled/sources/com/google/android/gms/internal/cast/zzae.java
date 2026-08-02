package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzae {
    final long zza;
    long zzb;
    private long zzc;
    private final AtomicInteger zzd;
    private final int zze;

    public zzae(zzad zzadVar) {
        this.zze = zzadVar.zza();
        long currentTimeMillis = System.currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzb = currentTimeMillis;
        this.zzd = new AtomicInteger(1);
    }

    public final zzrb zza() {
        zzra zza = zzrb.zza();
        zza.zzd(this.zze);
        zza.zza(this.zzd.get());
        zza.zzb((int) (this.zza - this.zzc));
        zza.zzc((int) (this.zzb - this.zzc));
        return (zzrb) zza.zzu();
    }

    public final void zzb(long j) {
        this.zzc = j;
    }

    public final void zzc() {
        this.zzd.incrementAndGet();
        this.zzb = System.currentTimeMillis();
    }
}
