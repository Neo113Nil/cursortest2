package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzacp {
    private boolean zzc;
    private int zze;
    private zzaco zza = new zzaco();
    private zzaco zzb = new zzaco();
    private long zzd = C.TIME_UNSET;

    public final void zza() {
        this.zza.zza();
        this.zzb.zza();
        this.zzc = false;
        this.zzd = C.TIME_UNSET;
        this.zze = 0;
    }

    public final void zzb(long j) {
        this.zza.zzf(j);
        if (this.zza.zzb()) {
            this.zzc = false;
        } else if (this.zzd != C.TIME_UNSET) {
            if (!this.zzc || this.zzb.zzc()) {
                this.zzb.zza();
                this.zzb.zzf(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzf(j);
        }
        if (this.zzc && this.zzb.zzb()) {
            zzaco zzacoVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzacoVar;
            this.zzc = false;
        }
        this.zzd = j;
        this.zze = this.zza.zzb() ? 0 : this.zze + 1;
    }

    public final boolean zzc() {
        return this.zza.zzb();
    }

    public final int zzd() {
        return this.zze;
    }

    public final long zze() {
        return this.zza.zzb() ? this.zza.zzd() : C.TIME_UNSET;
    }

    public final long zzf() {
        return this.zza.zzb() ? this.zza.zze() : C.TIME_UNSET;
    }

    public final float zzg() {
        if (this.zza.zzb()) {
            return (float) (1.0E9d / this.zza.zze());
        }
        return -1.0f;
    }
}
