package com.google.android.gms.internal.cast;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzcs {
    final long zza = System.currentTimeMillis();

    @Nullable
    private final Integer zzb;

    @Nullable
    private final Boolean zzc;
    private long zzd;
    private final int zze;

    public zzcs(zzcr zzcrVar) {
        this.zze = zzcrVar.zze();
        this.zzb = zzcrVar.zzc();
        this.zzc = zzcrVar.zzd();
    }

    public final void zza(long j) {
        this.zzd = j;
    }

    public final zzqx zzb() {
        zzqw zza = zzqx.zza();
        zza.zze(this.zze);
        int i = (int) (this.zza - this.zzd);
        zza.zzd(i);
        zza.zza(i);
        Integer num = this.zzb;
        if (num != null) {
            zza.zzb(num.intValue());
        }
        Boolean bool = this.zzc;
        if (bool != null) {
            zza.zzc(bool.booleanValue());
        }
        return (zzqx) zza.zzu();
    }

    public final int zzc() {
        return this.zze;
    }
}
