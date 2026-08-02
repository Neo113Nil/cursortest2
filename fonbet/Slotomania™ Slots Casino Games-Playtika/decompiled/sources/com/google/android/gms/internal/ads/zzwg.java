package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzwg implements zzxa, zzwz {
    public final zzxa zza;
    long zzb;
    private zzwz zzc;
    private zzwf[] zzd = new zzwf[0];
    private long zze = 0;
    private long zzf = C.TIME_UNSET;

    public zzwg(zzxa zzxaVar, boolean z, long j, long j2) {
        this.zza = zzxaVar;
        this.zzb = j2;
    }

    private static long zzt(long j, long j2, long j3) {
        long max = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwz zzwzVar, long j) {
        this.zzc = zzwzVar;
        this.zza.zzb(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final zzzf zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zze(zzaas[] zzaasVarArr, boolean[] zArr, zzyu[] zzyuVarArr, boolean[] zArr2, long j) {
        int length = zzyuVarArr.length;
        this.zzd = new zzwf[length];
        zzyu[] zzyuVarArr2 = new zzyu[length];
        int i = 0;
        while (true) {
            zzyu zzyuVar = null;
            if (i >= zzyuVarArr.length) {
                break;
            }
            zzwf[] zzwfVarArr = this.zzd;
            zzwf zzwfVar = (zzwf) zzyuVarArr[i];
            zzwfVarArr[i] = zzwfVar;
            if (zzwfVar != null) {
                zzyuVar = zzwfVar.zza;
            }
            zzyuVarArr2[i] = zzyuVar;
            i++;
        }
        long zze = this.zza.zze(zzaasVarArr, zArr, zzyuVarArr2, zArr2, j);
        long zzt = zzt(zze, j, this.zzb);
        boolean zzo = zzo();
        long j2 = C.TIME_UNSET;
        if (zzo) {
            if (zze >= j) {
                if (zze != 0) {
                    for (zzaas zzaasVar : zzaasVarArr) {
                        if (zzaasVar != null) {
                            zzv zzc = zzaasVar.zzc();
                            if (!zzas.zzd(zzc.zzp, zzc.zzk)) {
                            }
                        }
                    }
                }
            }
            j2 = zzt;
            break;
        }
        this.zze = j2;
        for (int i2 = 0; i2 < zzyuVarArr.length; i2++) {
            zzyu zzyuVar2 = zzyuVarArr2[i2];
            if (zzyuVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzwf[] zzwfVarArr2 = this.zzd;
                zzwf zzwfVar2 = zzwfVarArr2[i2];
                if (zzwfVar2 == null || zzwfVar2.zza != zzyuVar2) {
                    zzwfVarArr2[i2] = new zzwf(this, zzyuVar2);
                }
            }
            zzyuVarArr[i2] = this.zzd[i2];
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzh() {
        if (zzo()) {
            long j = this.zze;
            this.zze = C.TIME_UNSET;
            this.zzf = j;
            long zzh = zzh();
            return zzh != C.TIME_UNSET ? zzh : j;
        }
        long zzh2 = this.zza.zzh();
        if (zzh2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long zzt = zzt(zzh2, 0L, this.zzb);
        if (zzt == this.zzf) {
            return C.TIME_UNSET;
        }
        this.zzf = zzt;
        return zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzi < j) {
                return zzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzj(long j) {
        this.zze = C.TIME_UNSET;
        for (zzwf zzwfVar : this.zzd) {
            if (zzwfVar != null) {
                zzwfVar.zza();
            }
        }
        return zzt(this.zza.zzj(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzk(long j, zznc zzncVar) {
        if (j == 0) {
            return 0L;
        }
        long j2 = zzncVar.zzd;
        String str = zzfk.zza;
        long max = Math.max(0L, Math.min(j2, j));
        long j3 = zzncVar.zze;
        long j4 = this.zzb;
        long max2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (max != j2 || max2 != j3) {
            zzncVar = new zznc(max, max2);
        }
        return this.zza.zzk(j, zzncVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzl < j) {
                return zzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        return this.zza.zzm(zzluVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        return this.zza.zzn();
    }

    final boolean zzo() {
        return this.zze != C.TIME_UNSET;
    }

    final /* synthetic */ long zzq() {
        return this.zzf;
    }

    final /* synthetic */ void zzr(long j) {
        this.zzf = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final /* bridge */ /* synthetic */ void zzs(zzyw zzywVar) {
        zzwz zzwzVar = this.zzc;
        zzwzVar.getClass();
        zzwzVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzp(zzxa zzxaVar) {
        zzwz zzwzVar = this.zzc;
        zzwzVar.getClass();
        zzwzVar.zzp(this);
    }
}
