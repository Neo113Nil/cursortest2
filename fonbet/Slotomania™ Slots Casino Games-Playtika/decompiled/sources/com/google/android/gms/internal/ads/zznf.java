package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zznf implements zzlv {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzav zzd = zzav.zza;

    public zznf(zzdo zzdoVar) {
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzg());
            this.zza = false;
        }
    }

    public final void zzc(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final long zzg() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzav zzavVar = this.zzd;
        return j + (zzavVar.zzb == 1.0f ? zzfk.zzs(elapsedRealtime) : zzavVar.zza(elapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzi(zzav zzavVar) {
        if (this.zza) {
            zzc(zzg());
        }
        this.zzd = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final zzav zzj() {
        return this.zzd;
    }
}
