package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzalj {
    public final zzahb zza;
    public zzame zzd;
    public zzale zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzv zzj;
    private boolean zzm;
    public final zzamd zzb = new zzamd();
    public final zzes zzc = new zzes();
    private final zzes zzk = new zzes(1);
    private final zzes zzl = new zzes();

    public zzalj(zzahb zzahbVar, zzame zzameVar, zzale zzaleVar, zzv zzvVar) {
        this.zza = zzahbVar;
        this.zzd = zzameVar;
        this.zze = zzaleVar;
        this.zzj = zzvVar;
        zza(zzameVar, zzaleVar);
    }

    public final void zza(zzame zzameVar, zzale zzaleVar) {
        this.zzd = zzameVar;
        this.zze = zzaleVar;
        this.zza.zzA(this.zzj);
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzamb zzambVar = this.zzd.zza;
        zzale zzaleVar = this.zzb.zza;
        String str = zzfk.zza;
        zzamc zza = zzambVar.zza(zzaleVar.zza);
        zzq zzb = zzqVar.zzb(zza != null ? zza.zzb : null);
        zzt zza2 = this.zzj.zza();
        zza2.zzs(zzb);
        this.zza.zzA(zza2.zzO());
    }

    public final void zzc() {
        zzamd zzamdVar = this.zzb;
        zzamdVar.zzd = 0;
        zzamdVar.zzp = 0L;
        zzamdVar.zzq = false;
        zzamdVar.zzk = false;
        zzamdVar.zzo = false;
        zzamdVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzamd zzamdVar = this.zzb;
        return zzamdVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i = !this.zzm ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzj() != null ? i | 1073741824 : i;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i, int i2) {
        zzes zzesVar;
        zzamc zzj = zzj();
        if (zzj == null) {
            return 0;
        }
        int i3 = zzj.zzd;
        if (i3 != 0) {
            zzesVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzj.zze;
            String str = zzfk.zza;
            zzes zzesVar2 = this.zzl;
            byte[] bArr2 = bArr;
            int length = bArr2.length;
            zzesVar2.zzb(bArr2, length);
            zzesVar = zzesVar2;
            i3 = length;
        }
        zzamd zzamdVar = this.zzb;
        boolean zzb = zzamdVar.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzes zzesVar3 = this.zzk;
        zzesVar3.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzesVar3.zzh(0);
        zzahb zzahbVar = this.zza;
        zzahbVar.zzd(zzesVar3, 1, 1);
        zzahbVar.zzd(zzesVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb) {
            zzes zzesVar4 = this.zzc;
            zzesVar4.zza(8);
            byte[] zzi = zzesVar4.zzi();
            zzi[0] = 0;
            zzi[1] = 1;
            zzi[2] = 0;
            zzi[3] = (byte) i2;
            zzi[4] = (byte) ((i >> 24) & 255);
            zzi[5] = (byte) ((i >> 16) & 255);
            zzi[6] = (byte) ((i >> 8) & 255);
            zzi[7] = (byte) (i & 255);
            zzahbVar.zzd(zzesVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        zzes zzesVar5 = zzamdVar.zzn;
        int zzt = zzesVar5.zzt();
        zzesVar5.zzk(-2);
        int i5 = (zzt * 6) + 2;
        if (i2 != 0) {
            zzes zzesVar6 = this.zzc;
            zzesVar6.zza(i5);
            byte[] zzi2 = zzesVar6.zzi();
            zzesVar5.zzm(zzi2, 0, i5);
            int i6 = (((zzi2[2] & 255) << 8) | (zzi2[3] & 255)) + i2;
            zzi2[2] = (byte) ((i6 >> 8) & 255);
            zzi2[3] = (byte) (i6 & 255);
            zzesVar5 = zzesVar6;
        }
        zzahbVar.zzd(zzesVar5, i5, 1);
        return i4 + i5;
    }

    public final zzamc zzj() {
        if (!this.zzm) {
            return null;
        }
        zzamd zzamdVar = this.zzb;
        zzale zzaleVar = zzamdVar.zza;
        String str = zzfk.zza;
        int i = zzaleVar.zza;
        zzamc zzamcVar = zzamdVar.zzm;
        if (zzamcVar == null) {
            zzamcVar = this.zzd.zza.zza(i);
        }
        if (zzamcVar == null || !zzamcVar.zza) {
            return null;
        }
        return zzamcVar;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzm = true;
    }
}
