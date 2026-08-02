package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
final class zzadc implements zzaem {
    final /* synthetic */ zzadi zza;
    private zzgvz zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzadc(zzadi zzadiVar, Context context, int i) {
        Objects.requireNonNull(zzadiVar);
        this.zza = zzadiVar;
        zzfk.zzT(context);
        this.zzb = zzgvz.zzi();
        this.zze = C.TIME_UNSET;
        zzaej zzaejVar = zzaej.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzi zzC;
        zzt zza = zzvVar.zza();
        zzC = zzadi.zzC(zzvVar.zzF);
        zza.zzE(zzC);
        zza.zzO();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zza() {
        zzadi zzadiVar = this.zza;
        if (zzadiVar.zzt()) {
            zzadiVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzb() {
        zzadi zzadiVar = this.zza;
        if (zzadiVar.zzt()) {
            zzadiVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzc(zzaej zzaejVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean zzd(zzv zzvVar) throws zzael {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzg(boolean z) {
        this.zze = C.TIME_UNSET;
        this.zza.zzm(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean zzh(boolean z) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzi() {
        zzadi zzadiVar = this.zza;
        zzadiVar.zzA(this.zze);
        if (zzadiVar.zzy() >= zzadiVar.zzz()) {
            zzadiVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final Surface zzk() {
        zzgsw.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzl(zzadj zzadjVar) {
        this.zza.zzp(zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzm(float f) {
        this.zza.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgvz.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzo(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzp(Surface surface, zzet zzetVar) {
        this.zza.zzc(surface, zzetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzr(int i) {
        this.zza.zzr(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzs(int i, zzv zzvVar, long j, int i2, List list) {
        zzgsw.zzi(false);
        this.zzb = zzgvz.zzq(list);
        this.zzc = zzvVar;
        zzadi zzadiVar = this.zza;
        zzadiVar.zzA(C.TIME_UNSET);
        zzy(zzvVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzadiVar.zzt()) {
            if (j2 != C.TIME_UNSET) {
                j3 = j2 + 1;
            }
        } else if (j2 != C.TIME_UNSET) {
            return;
        }
        long j4 = j3;
        zzadiVar.zzw().zza(j4, new zzadh(j + this.zzd, i2, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzt() {
        zzadi zzadiVar = this.zza;
        if (zzadiVar.zzw().zzc() == 0) {
            zzadiVar.zzo();
            return;
        }
        zzfg zzfgVar = new zzfg(10);
        boolean z = true;
        while (zzadiVar.zzw().zzc() > 0) {
            zzadh zzadhVar = (zzadh) zzadiVar.zzw().zzd();
            zzadhVar.getClass();
            if (z) {
                int i = zzadhVar.zzb;
                if (i == 0 || i == 1) {
                    zzadhVar = new zzadh(zzadhVar.zza, 0, zzadhVar.zzc);
                } else {
                    zzadiVar.zzo();
                }
            }
            zzfgVar.zza(zzadhVar.zzc, zzadhVar);
            z = false;
        }
        zzadiVar.zzx(zzfgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean zzu(long j, zzaek zzaekVar) {
        int i;
        zzgsw.zzi(false);
        long j2 = j + this.zzd;
        zzadi zzadiVar = this.zza;
        long zzb = zzadiVar.zzv().zzb(j2);
        if (zzb == C.TIME_UNSET || zzb >= zzadiVar.zzu() || (i = this.zzf) >= 2) {
            if (zzadiVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i + 1;
        zzaekVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzv(long j, long j2) throws zzael {
        this.zza.zzl(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzw(boolean z) {
        zzadi zzadiVar = this.zza;
        if (zzadiVar.zzt()) {
            zzadiVar.zzn(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzx() {
        this.zza.zzg();
    }
}
