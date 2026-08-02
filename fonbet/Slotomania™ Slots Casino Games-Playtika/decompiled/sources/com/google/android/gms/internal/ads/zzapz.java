package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzapz implements zzapm {
    private String zzf;
    private zzahb zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = MimeTypes.VIDEO_MP2T;
    private int zze = 0;
    private final zzes zzb = new zzes(new byte[15], 2);
    private final zzer zzc = new zzer();
    private final zzes zzd = new zzes();
    private final zzaqa zzq = new zzaqa();
    private int zzr = C.RATE_UNSET_INT;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzapz(String str) {
    }

    private static final void zzf(zzes zzesVar, zzes zzesVar2, boolean z) {
        int zzg = zzesVar.zzg();
        int min = Math.min(zzesVar.zzd(), zzesVar2.zzd());
        zzesVar.zzm(zzesVar2.zzi(), zzesVar2.zzg(), min);
        zzesVar2.zzk(min);
        if (z) {
            zzesVar.zzh(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = C.RATE_UNSET_INT;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != C.TIME_UNSET) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i2 = this.zze;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzl;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (zzesVar.zzd() > 0) {
                            int i5 = this.zzm << 8;
                            this.zzm = i5;
                            int zzs = i5 | zzesVar.zzs();
                            this.zzm = zzs;
                            if ((zzs & 16777215) == 12583333) {
                                zzesVar.zzh(zzesVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzesVar.zzh(zzesVar.zze());
            } else if (i2 != 1) {
                zzaqa zzaqaVar = this.zzq;
                int i6 = zzaqaVar.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzesVar, this.zzd, true);
                }
                int min = Math.min(zzesVar.zzd(), zzaqaVar.zzc - this.zzo);
                this.zzg.zzc(zzesVar, min);
                int i7 = this.zzo + min;
                this.zzo = i7;
                if (i7 == zzaqaVar.zzc) {
                    int i8 = zzaqaVar.zza;
                    if (i8 == 1) {
                        byte[] zzi = this.zzd.zzi();
                        zzaqb zzb = zzaqc.zzb(new zzer(zzi, zzi.length));
                        this.zzr = zzb.zzb;
                        this.zzs = zzb.zzc;
                        long j = this.zzu;
                        long j2 = zzaqaVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i9 = zzb.zza;
                            String str = "mhm1";
                            if (i9 != -1) {
                                String format = String.format(".%02X", Integer.valueOf(i9));
                                String.valueOf(format);
                                str = "mhm1".concat(String.valueOf(format));
                            }
                            byte[] bArr = zzb.zzd;
                            zzgvz zzgvzVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgvzVar = zzgvz.zzk(zzfk.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzn(this.zza);
                            zztVar.zzo(MimeTypes.AUDIO_MPEGH_MHM1);
                            zztVar.zzH(this.zzr);
                            zztVar.zzk(str);
                            zztVar.zzr(zzgvzVar);
                            this.zzg.zzA(zztVar.zzO());
                        }
                        this.zzv = true;
                    } else if (i8 == 17) {
                        byte[] zzi2 = this.zzd.zzi();
                        zzer zzerVar = new zzer(zzi2, zzi2.length);
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(2);
                            i3 = zzerVar.zzj(13);
                        }
                        this.zzt = i3;
                    } else if (i8 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long round = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i10 * 1000000.0d) / d;
                        }
                        this.zzg.zze(round, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzes zzesVar2 = this.zzb;
                zzf(zzesVar, zzesVar2, false);
                if (zzesVar2.zzd() == 0) {
                    zzer zzerVar2 = this.zzc;
                    int zze = zzesVar2.zze();
                    zzerVar2.zzb(zzesVar2.zzi(), zze);
                    zzaqa zzaqaVar2 = this.zzq;
                    if (zzaqc.zza(zzerVar2, zzaqaVar2)) {
                        this.zzo = 0;
                        this.zzp += zzaqaVar2.zzc + zze;
                        zzesVar2.zzh(0);
                        this.zzg.zzc(zzesVar2, zzesVar2.zze());
                        zzesVar2.zza(2);
                        this.zzd.zza(zzaqaVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzesVar2.zze() < 15) {
                        zzesVar2.zzf(zzesVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
