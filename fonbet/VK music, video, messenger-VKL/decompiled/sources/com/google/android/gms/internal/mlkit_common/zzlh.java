package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzlh {
    private zzlt zza;
    private Long zzb;
    private zzlc zzc;
    private Long zzd;
    private zzli zze;
    private Long zzf;

    public final zzlh zzb(Long l) {
        this.zzf = l;
        return this;
    }

    public final zzlh zzc(zzli zzliVar) {
        this.zze = zzliVar;
        return this;
    }

    public final zzlh zzd(zzlc zzlcVar) {
        this.zzc = zzlcVar;
        return this;
    }

    public final zzlh zze(Long l) {
        this.zzd = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzlh zzf(zzlt zzltVar) {
        this.zza = zzltVar;
        return this;
    }

    public final zzlh zzg(Long l) {
        this.zzb = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzlk zzi() {
        return new zzlk(this, null);
    }
}
