package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzlw {
    public final zzxa zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzlx zzg;
    public boolean zzh;
    private final zzmw[] zzj;
    private final zzaaz zzk;
    private final zzml zzl;
    private zzlw zzm;
    private zzaba zzo;
    private long zzp;
    private zzzf zzn = zzzf.zza;
    public final zzyu[] zzc = new zzyu[2];
    private final boolean[] zzi = new boolean[2];

    public zzlw(zzmw[] zzmwVarArr, long j, zzaaz zzaazVar, zzabd zzabdVar, zzml zzmlVar, zzlx zzlxVar, zzaba zzabaVar, long j2) {
        this.zzj = zzmwVarArr;
        this.zzp = j;
        this.zzk = zzaazVar;
        this.zzl = zzmlVar;
        this.zzb = zzlxVar.zza.zza;
        this.zzg = zzlxVar;
        this.zzo = zzabaVar;
        zzxc zzxcVar = zzlxVar.zza;
        long j3 = zzlxVar.zzb;
        long j4 = zzlxVar.zze;
        zzxa zze = zzmlVar.zze(zzxcVar, zzabdVar, j3);
        this.zza = j4 != C.TIME_UNSET ? new zzwg(zze, true, 0L, j4) : zze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzaba zzabaVar = this.zzo;
            if (i >= zzabaVar.zza) {
                return;
            }
            zzabaVar.zza(i);
            zzaas zzaasVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzaba zzabaVar = this.zzo;
            if (i >= zzabaVar.zza) {
                return;
            }
            zzabaVar.zza(i);
            zzaas zzaasVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= C.TIME_UNSET;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return zzi == Long.MIN_VALUE ? this.zzg.zzf : zzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f, zzbf zzbfVar, boolean z) throws zzje {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzaba zzk = zzk(f, zzbfVar, z);
        zzlx zzlxVar = this.zzg;
        long j = zzlxVar.zzb;
        long j2 = zzlxVar.zzf;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zzl = zzl(zzk, j, false);
        long j3 = this.zzp;
        zzlx zzlxVar2 = this.zzg;
        this.zzp = j3 + (zzlxVar2.zzb - zzl);
        this.zzg = zzlxVar2.zza(zzl, zzlxVar2.zzc);
    }

    public final void zzi(long j) {
        zzgsw.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j - this.zzp);
        }
    }

    public final void zzj(zzlu zzluVar) {
        zzgsw.zzi(zzw());
        this.zza.zzm(zzluVar);
    }

    public final zzaba zzk(float f, zzbf zzbfVar, boolean z) throws zzje {
        zzzf zzzfVar = this.zzn;
        zzxc zzxcVar = this.zzg.zza;
        zzaaz zzaazVar = this.zzk;
        zzmw[] zzmwVarArr = this.zzj;
        zzaba zzr = zzaazVar.zzr(zzmwVarArr, zzzfVar, zzxcVar, zzbfVar);
        for (int i = 0; i < zzr.zza; i++) {
            if (zzr.zza(i)) {
                if (zzr.zzc[i] == null) {
                    zzmwVarArr[i].zza();
                    r2 = false;
                }
                zzgsw.zzi(r2);
            } else {
                zzgsw.zzi(zzr.zzc[i] == null);
            }
        }
        for (zzaas zzaasVar : zzr.zzc) {
        }
        return zzr;
    }

    public final long zzl(zzaba zzabaVar, long j, boolean z) {
        return zzm(zzabaVar, j, false, new boolean[2]);
    }

    public final long zzm(zzaba zzabaVar, long j, boolean z, boolean[] zArr) {
        zzmw[] zzmwVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzabaVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzabaVar.zzb(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzmwVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzmwVarArr[i2].zza();
            i2++;
        }
        zzv();
        this.zzo = zzabaVar;
        zzu();
        zzxa zzxaVar = this.zza;
        zzaas[] zzaasVarArr = zzabaVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzyu[] zzyuVarArr = this.zzc;
        long zze = zzxaVar.zze(zzaasVarArr, zArr3, zzyuVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzmwVarArr[i3].zza();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzyuVarArr[i4] != null) {
                zzgsw.zzi(zzabaVar.zza(i4));
                zzmwVarArr[i4].zza();
                this.zzf = true;
            } else {
                zzgsw.zzi(zzaasVarArr[i4] == null);
            }
        }
        return zze;
    }

    public final void zzn() {
        zzv();
        zzxa zzxaVar = this.zza;
        try {
            boolean z = zzxaVar instanceof zzwg;
            zzml zzmlVar = this.zzl;
            if (z) {
                zzmlVar.zzf(((zzwg) zzxaVar).zza);
            } else {
                zzmlVar.zzf(zzxaVar);
            }
        } catch (RuntimeException e) {
            zzef.zzf("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzlw zzlwVar) {
        if (zzlwVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzlwVar;
        zzu();
    }

    public final zzlw zzp() {
        return this.zzm;
    }

    public final zzzf zzq() {
        return this.zzn;
    }

    public final zzaba zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzxa zzxaVar = this.zza;
        if (zzxaVar instanceof zzwg) {
            long j = this.zzg.zze;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((zzwg) zzxaVar).zza(0L, j);
        }
    }

    public final void zzt(zzwz zzwzVar, long j) {
        this.zzd = true;
        this.zza.zzb(zzwzVar, j);
    }
}
