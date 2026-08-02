package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.SignedBytes;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapf implements zzapm {
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
    private boolean zzk;
    private long zzl;
    private zzv zzm;
    private int zzn;
    private long zzo;

    public zzapf(String str, int i, String str2) {
        zzer zzerVar = new zzer(new byte[16], 16);
        this.zza = zzerVar;
        this.zzb = new zzes(zzerVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzo = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012c  */
    @Override // com.google.android.gms.internal.ads.zzapm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzes zzesVar) {
        boolean z;
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (zzesVar.zzd() > 0) {
                    if (this.zzj) {
                        int zzs = zzesVar.zzs();
                        this.zzj = zzs == 172;
                        byte b = SignedBytes.MAX_POWER_OF_TWO;
                        if (zzs != 64) {
                            if (zzs == 65) {
                            }
                        } else if (zzs != 65) {
                            z = false;
                            this.zzk = z;
                            this.zzh = 1;
                            zzes zzesVar2 = this.zzb;
                            zzesVar2.zzi()[0] = -84;
                            byte[] zzi = zzesVar2.zzi();
                            if (true == this.zzk) {
                                b = 65;
                            }
                            zzi[1] = b;
                            this.zzi = 2;
                        }
                        z = true;
                        this.zzk = z;
                        this.zzh = 1;
                        zzes zzesVar22 = this.zzb;
                        zzesVar22.zzi()[0] = -84;
                        byte[] zzi2 = zzesVar22.zzi();
                        if (true == this.zzk) {
                        }
                        zzi2[1] = b;
                        this.zzi = 2;
                    } else {
                        this.zzj = zzesVar.zzs() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzesVar.zzd(), this.zzn - this.zzi);
                this.zzg.zzc(zzesVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzn) {
                    zzgsw.zzi(this.zzo != C.TIME_UNSET);
                    this.zzg.zze(this.zzo, 1, this.zzn, 0, null);
                    this.zzo += this.zzl;
                    this.zzh = 0;
                }
            } else {
                zzes zzesVar3 = this.zzb;
                byte[] zzi3 = zzesVar3.zzi();
                int min2 = Math.min(zzesVar.zzd(), 16 - this.zzi);
                zzesVar.zzm(zzi3, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 16) {
                    zzer zzerVar = this.zza;
                    zzerVar.zzf(0);
                    zzaes zzb = zzaet.zzb(zzerVar);
                    zzv zzvVar = this.zzm;
                    if (zzvVar == null || zzvVar.zzH != 2 || zzb.zza != zzvVar.zzI || !MimeTypes.AUDIO_AC4.equals(zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        zztVar.zzo(MimeTypes.AUDIO_AC4);
                        zztVar.zzG(2);
                        zztVar.zzH(zzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        zzv zzO = zztVar.zzO();
                        this.zzm = zzO;
                        this.zzg.zzA(zzO);
                    }
                    this.zzn = zzb.zzb;
                    this.zzl = (zzb.zzc * 1000000) / this.zzm.zzI;
                    zzesVar3.zzh(0);
                    this.zzg.zzc(zzesVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
