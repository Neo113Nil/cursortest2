package com.google.android.gms.internal.cast;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzac {
    final int zza;
    final long zzb = System.currentTimeMillis();
    private long zzc;

    public zzac(zzab zzabVar) {
        this.zza = zzabVar.zza;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    public final zzrd zzb() {
        zzrc zza = zzrd.zza();
        zza.zza((int) (this.zzb - this.zzc));
        int i = this.zza;
        zza.zzb(i != 1 ? i != 2 ? i != 3 ? 1 : 4 : 3 : 2);
        return (zzrd) zza.zzu();
    }
}
