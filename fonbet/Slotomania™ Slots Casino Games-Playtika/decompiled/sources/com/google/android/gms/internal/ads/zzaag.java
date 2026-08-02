package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzaag extends zzaai implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaag(int i, zzbg zzbgVar, int i2, zzaae zzaaeVar, int i3, String str, String str2) {
        super(i, zzbgVar, i2);
        int i4;
        int i5;
        boolean z;
        int i6 = 0;
        this.zzf = zzmw.zzac(i3, false);
        int i7 = this.zzd.zze;
        int i8 = zzaaeVar.zzC;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        zzgvz zzj = str2 != null ? zzgvz.zzj(str2) : zzaaeVar.zzy.isEmpty() ? zzgvz.zzj("") : zzaaeVar.zzy;
        int i9 = 0;
        while (true) {
            if (i9 >= zzj.size()) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            }
            zzv zzvVar = this.zzd;
            String str3 = (String) zzj.get(i9);
            boolean z2 = zzaaeVar.zzD;
            i4 = zzaaq.zzj(zzvVar, str3, false);
            if (i4 > 0) {
                break;
            } else {
                i9++;
            }
        }
        this.zzi = i9;
        this.zzj = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            int i10 = zzaaeVar.zzA;
            i5 = 0;
        }
        int zzm = zzaaq.zzm(this.zzd.zzf, i5);
        this.zzk = zzm;
        zzv zzvVar2 = this.zzd;
        this.zzn = (1088 & zzvVar2.zzf) != 0;
        int zzn = zzaaq.zzn(zzvVar2, zzaaeVar.zzz);
        this.zzl = zzn;
        int zzj2 = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
        this.zzm = zzj2;
        if (i4 > 0 || ((zzaaeVar.zzy.isEmpty() && zzm > 0) || ((zzaaeVar.zzy.isEmpty() && zzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && zzj2 > 0)))) {
            z = true;
        } else {
            boolean z3 = zzaaeVar.zzx;
            z = false;
        }
        if (zzmw.zzac(i3, zzaaeVar.zzV) && z) {
            i6 = 1;
        }
        this.zze = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaag zzaagVar) {
        zzgvm zza = zzgvm.zzg().zzd(this.zzf, zzaagVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaagVar.zzi), zzgxt.zzb().zza());
        int i = this.zzj;
        zzgvm zzb = zza.zzb(i, zzaagVar.zzj);
        int i2 = this.zzk;
        zzgvm zzb2 = zzb.zzb(i2, zzaagVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaagVar.zzl), zzgxt.zzb().zza()).zzd(this.zzg, zzaagVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaagVar.zzh), i == 0 ? zzgxt.zzb() : zzgxt.zzb().zza()).zzb(this.zzm, zzaagVar.zzm);
        if (i2 == 0) {
            zzb2 = zzb2.zzc(this.zzn, zzaagVar.zzn);
        }
        return zzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        return false;
    }
}
