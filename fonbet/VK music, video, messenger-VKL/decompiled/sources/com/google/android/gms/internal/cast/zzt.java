package com.google.android.gms.internal.cast;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzt {
    private final int zza;
    private final long zzb = System.currentTimeMillis();
    private long zzc;

    public zzt(zzs zzsVar) {
        this.zza = zzsVar.zza();
    }

    public final boolean zza() {
        return this.zza == 2;
    }

    public final void zzb(long j) {
        this.zzc = j;
    }

    public final zzqv zzc() {
        int i = this.zza;
        zzqu zza = zzqv.zza();
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 4;
                if (i != 3) {
                    i2 = i != 4 ? 1 : 5;
                }
            } else {
                i2 = 3;
            }
        }
        zza.zzb(i2);
        zza.zza((int) (this.zzb - this.zzc));
        return (zzqv) zza.zzu();
    }
}
