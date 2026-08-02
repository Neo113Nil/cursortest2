package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
abstract class zzams {
    private zzahb zzb;
    private zzafs zzc;
    private zzamo zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzamm zza = new zzamm();
    private zzamq zzj = new zzamq();

    protected void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzamq();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzes zzesVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzes zzesVar, long j, zzamq zzamqVar) throws IOException;

    final void zze(zzafs zzafsVar, zzahb zzahbVar) {
        this.zzc = zzafsVar;
        this.zzb = zzahbVar;
        zza(true);
    }

    final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzi(j2);
            zzamo zzamoVar = this.zzd;
            String str = zzfk.zza;
            zzamoVar.zzb(this.zze);
            this.zzh = 2;
        }
    }

    final int zzg(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        this.zzb.getClass();
        String str = zzfk.zza;
        int i = this.zzh;
        if (i != 0) {
            if (i == 1) {
                zzafqVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i != 2) {
                return -1;
            }
            long zza = this.zzd.zza(zzafqVar);
            if (zza >= 0) {
                zzagpVar.zza = zza;
                return 1;
            }
            if (zza < -1) {
                zzj(-(zza + 2));
            }
            if (!this.zzl) {
                zzags zzc = this.zzd.zzc();
                zzc.getClass();
                this.zzc.zzw(zzc);
                this.zzb.zzO(zzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzafqVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzes zzd = this.zza.zzd();
            long zzb = zzb(zzd);
            if (zzb >= 0) {
                long j = this.zzg;
                if (j + zzb >= this.zze) {
                    long zzh = zzh(j);
                    this.zzb.zzc(zzd, zzd.zze());
                    this.zzb.zze(zzh, 1, zzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zzb;
            return 0;
        }
        while (true) {
            zzamm zzammVar = this.zza;
            if (!zzammVar.zzb(zzafqVar)) {
                this.zzh = 3;
                return -1;
            }
            long zzn = zzafqVar.zzn();
            long j2 = this.zzf;
            this.zzk = zzn - j2;
            if (!zzc(zzammVar.zzd(), j2, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzI;
                if (!this.zzm) {
                    this.zzb.zzA(zzvVar);
                    this.zzm = true;
                }
                zzamo zzamoVar = this.zzj.zzb;
                if (zzamoVar != null) {
                    this.zzd = zzamoVar;
                } else if (zzafqVar.zzo() == -1) {
                    this.zzd = new zzamr(null);
                } else {
                    zzamn zzc2 = zzammVar.zzc();
                    this.zzd = new zzamh(this, this.zzf, zzafqVar.zzo(), zzc2.zzd + zzc2.zze, zzc2.zzb, (zzc2.zza & 4) != 0);
                }
                this.zzh = 2;
                zzammVar.zze();
                return 0;
            }
            this.zzf = zzafqVar.zzn();
        }
    }

    protected final long zzh(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzi(long j) {
        return (this.zzi * j) / 1000000;
    }

    protected void zzj(long j) {
        this.zzg = j;
    }
}
