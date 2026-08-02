package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaib implements zzafp {
    private final byte[] zza;
    private final zzes zzb;
    private final zzafw zzc;
    private zzafs zzd;
    private zzahb zze;
    private int zzf;
    private zzap zzg;
    private zzagc zzh;
    private int zzi;
    private int zzj;
    private zzahz zzk;
    private int zzl;
    private long zzm;

    static {
        int i = zzaia.zza;
    }

    public zzaib() {
        throw null;
    }

    public zzaib(int i) {
        this.zza = new byte[42];
        this.zzb = new zzes(new byte[32768], 0);
        this.zzc = new zzafw();
        this.zzf = 0;
    }

    private final long zzh(zzes zzesVar, boolean z) {
        boolean z2;
        this.zzh.getClass();
        int zzg = zzesVar.zzg();
        while (zzg <= zzesVar.zze() - 16) {
            zzesVar.zzh(zzg);
            zzagc zzagcVar = this.zzh;
            int i = this.zzj;
            zzafw zzafwVar = this.zzc;
            if (zzafx.zza(zzesVar, zzagcVar, i, zzafwVar)) {
                zzesVar.zzh(zzg);
                return zzafwVar.zza;
            }
            zzg++;
        }
        if (!z) {
            zzesVar.zzh(zzg);
            return -1L;
        }
        while (zzg <= zzesVar.zze() - this.zzi) {
            zzesVar.zzh(zzg);
            try {
                z2 = zzafx.zza(zzesVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzesVar.zzg() <= zzesVar.zze() && z2) {
                zzesVar.zzh(zzg);
                return this.zzc.zza;
            }
            zzg++;
        }
        zzesVar.zzh(zzesVar.zze());
        return -1L;
    }

    private final void zzi() {
        long j = this.zzm * 1000000;
        zzagc zzagcVar = this.zzh;
        String str = zzfk.zza;
        this.zze.zze(j / zzagcVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzafz.zza(zzafqVar, false);
        zzes zzesVar = new zzes(4);
        ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, 4, false);
        return zzesVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzd = zzafsVar;
        this.zze = zzafsVar.zzu(0, 1);
        zzafsVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzahz zzahzVar = this.zzk;
            if (zzahzVar != null) {
                zzahzVar.zzb(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        boolean zzb;
        zzagc zzagcVar;
        zzags zzagrVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzafqVar.zzl();
            long zzm = zzafqVar.zzm();
            zzap zza = zzafz.zza(zzafqVar, true);
            zzafqVar.zzf((int) (zzafqVar.zzm() - zzm));
            this.zzg = zza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzafqVar.zzi(this.zza, 0, 42);
            zzafqVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzes zzesVar = new zzes(4);
            zzafqVar.zzc(zzesVar.zzi(), 0, 4);
            if (zzesVar.zzz() != 1716281667) {
                throw zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzafy zzafyVar = new zzafy(this.zzh);
            do {
                zzb = zzafz.zzb(zzafqVar, zzafyVar);
                zzagcVar = zzafyVar.zza;
                String str = zzfk.zza;
                this.zzh = zzagcVar;
            } while (!zzb);
            zzagcVar.getClass();
            this.zzi = Math.max(zzagcVar.zzc, 6);
            zzv zzc = this.zzh.zzc(this.zza, this.zzg);
            zzahb zzahbVar = this.zze;
            zzt zza2 = zzc.zza();
            zza2.zzn(MimeTypes.AUDIO_FLAC);
            zzahbVar.zzA(zza2.zzO());
            this.zze.zzO(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzafqVar.zzl();
            zzes zzesVar2 = new zzes(2);
            zzafqVar.zzi(zzesVar2.zzi(), 0, 2);
            int zzt = zzesVar2.zzt();
            if ((zzt >> 2) != 16382) {
                zzafqVar.zzl();
                throw zzat.zzb("First frame does not start with sync code.", null);
            }
            zzafqVar.zzl();
            this.zzj = zzt;
            zzafs zzafsVar = this.zzd;
            String str2 = zzfk.zza;
            long zzn = zzafqVar.zzn();
            long zzo = zzafqVar.zzo();
            zzagc zzagcVar2 = this.zzh;
            zzagcVar2.getClass();
            zzagb zzagbVar = zzagcVar2.zzk;
            if (zzagbVar != null && zzagbVar.zza.length > 0) {
                zzagrVar = new zzaga(zzagcVar2, zzn);
            } else if (zzo == -1 || zzagcVar2.zzj <= 0) {
                zzagrVar = new zzagr(zzagcVar2.zza(), 0L);
            } else {
                zzahz zzahzVar = new zzahz(zzagcVar2, this.zzj, zzn, zzo);
                this.zzk = zzahzVar;
                zzagrVar = zzahzVar.zza();
            }
            zzafsVar.zzw(zzagrVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzagc zzagcVar3 = this.zzh;
        zzagcVar3.getClass();
        zzahz zzahzVar2 = this.zzk;
        if (zzahzVar2 != null && zzahzVar2.zzc()) {
            return zzahzVar2.zzd(zzafqVar, zzagpVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzafx.zzb(zzafqVar, zzagcVar3);
            return 0;
        }
        zzes zzesVar3 = this.zzb;
        int zze = zzesVar3.zze();
        if (zze < 32768) {
            int zza3 = zzafqVar.zza(zzesVar3.zzi(), zze, 32768 - zze);
            z = zza3 == -1;
            if (!z) {
                zzesVar3.zzf(zze + zza3);
            } else if (zzesVar3.zzd() == 0) {
                zzi();
                return -1;
            }
        } else {
            z = false;
        }
        int zzg = zzesVar3.zzg();
        int i2 = this.zzl;
        int i3 = this.zzi;
        if (i2 < i3) {
            zzesVar3.zzk(Math.min(i3 - i2, zzesVar3.zzd()));
        }
        long zzh = zzh(zzesVar3, z);
        int zzg2 = zzesVar3.zzg() - zzg;
        zzesVar3.zzh(zzg);
        this.zze.zzc(zzesVar3, zzg2);
        this.zzl += zzg2;
        if (zzh != -1) {
            zzi();
            this.zzl = 0;
            this.zzm = zzh;
        }
        int length = zzesVar3.zzi().length - zzesVar3.zze();
        if (zzesVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int zzd = zzesVar3.zzd();
        System.arraycopy(zzesVar3.zzi(), zzesVar3.zzg(), zzesVar3.zzi(), 0, zzd);
        zzesVar3.zzh(0);
        zzesVar3.zzf(zzd);
        return 0;
    }
}
