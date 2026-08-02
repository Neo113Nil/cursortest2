package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapc implements zzapm {
    private final zzer zza;
    private final zzes zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzahb zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzapc(String str, int i, String str2) {
        zzer zzerVar = new zzer(new byte[128], 128);
        this.zza = zzerVar;
        this.zzb = new zzes(zzerVar.zza);
        this.zzh = 0;
        this.zzn = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (true) {
                    if (zzesVar.zzd() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int zzs = zzesVar.zzs();
                        if (zzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzes zzesVar2 = this.zzb;
                            zzesVar2.zzi()[0] = Ascii.VT;
                            zzesVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = zzs == 11;
                    } else {
                        this.zzj = zzesVar.zzs() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzesVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzesVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzm) {
                    zzgsw.zzi(this.zzn != C.TIME_UNSET);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzes zzesVar3 = this.zzb;
                byte[] zzi = zzesVar3.zzi();
                int min2 = Math.min(zzesVar.zzd(), 128 - this.zzi);
                zzesVar.zzm(zzi, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 128) {
                    zzer zzerVar = this.zza;
                    zzerVar.zzf(0);
                    zzaep zzc = zzaeq.zzc(zzerVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzc.zzc != zzvVar.zzH || zzc.zzb != zzvVar.zzI || !Objects.equals(zzc.zza, zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        String str = zzc.zza;
                        zztVar.zzo(str);
                        zztVar.zzG(zzc.zzc);
                        zztVar.zzH(zzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i4 = zzc.zzf;
                        zztVar.zzj(i4);
                        if (MimeTypes.AUDIO_AC3.equals(str)) {
                            zztVar.zzi(i4);
                        }
                        zzv zzO = zztVar.zzO();
                        this.zzl = zzO;
                        this.zzg.zzA(zzO);
                    }
                    this.zzm = zzc.zzd;
                    this.zzk = (zzc.zze * 1000000) / this.zzl.zzI;
                    zzesVar3.zzh(0);
                    this.zzg.zzc(zzesVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
