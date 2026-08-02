package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapk implements zzapm {
    private final zzes zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzahb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = C.TIME_UNSET;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = MimeTypes.VIDEO_MP2T;

    public zzapk(String str, int i, int i2, String str2) {
        this.zza = new zzes(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzf(zzes zzesVar, byte[] bArr, int i) {
        int min = Math.min(zzesVar.zzd(), i - this.zzi);
        zzesVar.zzm(bArr, this.zzi, min);
        int i2 = this.zzi + min;
        this.zzi = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    private final void zzg(zzafn zzafnVar) {
        int i;
        int i2 = zzafnVar.zzb;
        if (i2 == -2147483647 || (i = zzafnVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i == zzvVar.zzH && i2 == zzvVar.zzI && Objects.equals(zzafnVar.zza, zzvVar.zzp)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzn(this.zze);
        zztVar.zzo(zzafnVar.zza);
        zztVar.zzG(i);
        zztVar.zzH(i2);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzO = zztVar.zzO();
        this.zzl = zzO;
        this.zzg.zzA(zzO);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = C.TIME_UNSET;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        byte b;
        int i2;
        byte b2;
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i3 = this.zzh;
            if (i3 == 0) {
                while (true) {
                    if (zzesVar.zzd() > 0) {
                        int i4 = this.zzj << 8;
                        this.zzj = i4;
                        int zzs = i4 | zzesVar.zzs();
                        this.zzj = zzs;
                        int zza = zzafo.zza(zzs);
                        this.zzn = zza;
                        if (zza != 0) {
                            byte[] zzi = this.zza.zzi();
                            int i5 = this.zzj;
                            zzi[0] = (byte) ((i5 >> 24) & 255);
                            zzi[1] = (byte) ((i5 >> 16) & 255);
                            zzi[2] = (byte) ((i5 >> 8) & 255);
                            zzi[3] = (byte) (i5 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            int i6 = this.zzn;
                            if (i6 == 3 || i6 == 4) {
                                this.zzh = 4;
                            } else if (i6 == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i3 == 1) {
                zzes zzesVar2 = this.zza;
                if (zzf(zzesVar, zzesVar2.zzi(), 18)) {
                    byte[] zzi2 = zzesVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzb = zzafo.zzb(zzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzb;
                        this.zzg.zzA(zzb);
                    }
                    this.zzm = zzafo.zzc(zzi2);
                    byte b3 = zzi2[0];
                    if (b3 != -2) {
                        if (b3 == -1) {
                            i = (zzi2[4] & 7) << 4;
                            b2 = zzi2[7];
                        } else if (b3 != 31) {
                            i = (zzi2[4] & 1) << 6;
                            b = zzi2[5];
                        } else {
                            i = (zzi2[5] & 7) << 4;
                            b2 = zzi2[6];
                        }
                        i2 = b2 & 60;
                        this.zzk = zzgzt.zza(zzfk.zzt(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzI));
                        zzesVar2.zzh(0);
                        this.zzg.zzc(zzesVar2, 18);
                        this.zzh = 6;
                    } else {
                        i = (zzi2[5] & 1) << 6;
                        b = zzi2[4];
                    }
                    i2 = b & 252;
                    this.zzk = zzgzt.zza(zzfk.zzt(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzI));
                    zzesVar2.zzh(0);
                    this.zzg.zzc(zzesVar2, 18);
                    this.zzh = 6;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    zzes zzesVar3 = this.zza;
                    if (zzf(zzesVar, zzesVar3.zzi(), this.zzo)) {
                        zzafn zzd = zzafo.zzd(zzesVar3.zzi());
                        zzg(zzd);
                        this.zzm = zzd.zzd;
                        long j = zzd.zze;
                        this.zzk = j != C.TIME_UNSET ? j : 0L;
                        zzesVar3.zzh(0);
                        this.zzg.zzc(zzesVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i3 == 4) {
                    zzes zzesVar4 = this.zza;
                    if (zzf(zzesVar, zzesVar4.zzi(), 6)) {
                        int zzg = zzafo.zzg(zzesVar4.zzi());
                        this.zzp = zzg;
                        int i7 = this.zzi;
                        if (i7 > zzg) {
                            int i8 = i7 - zzg;
                            this.zzi = i7 - i8;
                            zzesVar.zzh(zzesVar.zzg() - i8);
                        }
                        this.zzh = 5;
                    }
                } else if (i3 != 5) {
                    int min = Math.min(zzesVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzesVar, min);
                    int i9 = this.zzi + min;
                    this.zzi = i9;
                    if (i9 == this.zzm) {
                        zzgsw.zzi(this.zzq != C.TIME_UNSET);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzes zzesVar5 = this.zza;
                    if (zzf(zzesVar, zzesVar5.zzi(), this.zzp)) {
                        zzafn zzf = zzafo.zzf(zzesVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzf);
                        }
                        this.zzm = zzf.zzd;
                        long j2 = zzf.zze;
                        this.zzk = j2 != C.TIME_UNSET ? j2 : 0L;
                        zzesVar5.zzh(0);
                        this.zzg.zzc(zzesVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzes zzesVar6 = this.zza;
                if (zzf(zzesVar, zzesVar6.zzi(), 7)) {
                    this.zzo = zzafo.zze(zzesVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
