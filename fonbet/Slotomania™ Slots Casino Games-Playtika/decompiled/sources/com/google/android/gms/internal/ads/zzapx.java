package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzapx implements zzapm {
    private final String zza;
    private final int zzb;
    private final String zzc = MimeTypes.VIDEO_MP2T;
    private final zzes zzd;
    private final zzer zze;
    private zzahb zzf;
    private String zzg;
    private zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzapx(String str, int i, String str2) {
        this.zza = str;
        this.zzb = i;
        zzes zzesVar = new zzes(1024);
        this.zzd = zzesVar;
        byte[] zzi = zzesVar.zzi();
        this.zze = new zzer(zzi, zzi.length);
        this.zzm = C.TIME_UNSET;
    }

    private final int zzf(zzer zzerVar) throws zzat {
        int zzc = zzerVar.zzc();
        zzaen zzb = zzaeo.zzb(zzerVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zzc - zzerVar.zzc();
    }

    private static long zzg(zzer zzerVar) {
        return zzerVar.zzj((zzerVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzi = 0;
        this.zzm = C.TIME_UNSET;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzafsVar.zzu(zzaraVar.zzb(), 1);
        this.zzg = zzaraVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015a, code lost:
    
        if (r14.zzn == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzapm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        int i2;
        int i3;
        boolean zzi;
        this.zzf.getClass();
        while (zzesVar.zzd() > 0) {
            int i4 = this.zzi;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzs = zzesVar.zzs();
                    if ((zzs & 224) == 224) {
                        this.zzl = zzs;
                        this.zzi = 2;
                    } else if (zzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzesVar.zzd(), this.zzk - this.zzj);
                    zzer zzerVar = this.zze;
                    zzesVar.zzm(zzerVar.zza, this.zzj, min);
                    int i5 = this.zzj + min;
                    this.zzj = i5;
                    if (i5 == this.zzk) {
                        zzerVar.zzf(0);
                        if (!zzerVar.zzi()) {
                            this.zzn = true;
                            int zzj = zzerVar.zzj(1);
                            if (zzj == 1) {
                                i3 = zzerVar.zzj(1);
                                i2 = 1;
                            } else {
                                i2 = zzj;
                                i3 = 0;
                            }
                            this.zzo = i3;
                            if (i3 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzerVar);
                                i2 = 1;
                            }
                            if (!zzerVar.zzi()) {
                                throw zzat.zzb(null, null);
                            }
                            this.zzp = zzerVar.zzj(6);
                            int zzj2 = zzerVar.zzj(4);
                            int zzj3 = zzerVar.zzj(3);
                            if (zzj2 != 0 || zzj3 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 0) {
                                int zzd = zzerVar.zzd();
                                int zzf = zzf(zzerVar);
                                zzerVar.zzf(zzd);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzerVar.zzl(bArr, 0, zzf);
                                zzt zztVar = new zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzn(this.zzc);
                                zztVar.zzo(MimeTypes.AUDIO_AAC);
                                zztVar.zzk(this.zzw);
                                zztVar.zzG(this.zzv);
                                zztVar.zzH(this.zzt);
                                zztVar.zzr(Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                zzv zzO = zztVar.zzO();
                                if (!zzO.equals(this.zzh)) {
                                    this.zzh = zzO;
                                    this.zzu = 1024000000 / zzO.zzI;
                                    this.zzf.zzA(zzO);
                                }
                            } else {
                                zzerVar.zzh(((int) zzg(zzerVar)) - zzf(zzerVar));
                            }
                            int zzj4 = zzerVar.zzj(3);
                            this.zzq = zzj4;
                            if (zzj4 == 0) {
                                zzerVar.zzh(8);
                            } else if (zzj4 == 1) {
                                zzerVar.zzh(9);
                            } else if (zzj4 == 3 || zzj4 == 4 || zzj4 == 5) {
                                zzerVar.zzh(6);
                            } else {
                                if (zzj4 != 6 && zzj4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzerVar.zzh(1);
                            }
                            boolean zzi2 = zzerVar.zzi();
                            this.zzr = zzi2;
                            this.zzs = 0L;
                            if (zzi2) {
                                if (i2 != 1) {
                                    do {
                                        zzi = zzerVar.zzi();
                                        this.zzs = (this.zzs << 8) + zzerVar.zzj(8);
                                    } while (zzi);
                                } else {
                                    this.zzs = zzg(zzerVar);
                                }
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzat.zzb(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzj5 = zzerVar.zzj(8);
                            i = i6 + zzj5;
                            if (zzj5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzd2 = zzerVar.zzd();
                        if ((zzd2 & 7) == 0) {
                            this.zzd.zzh(zzd2 >> 3);
                        } else {
                            zzes zzesVar2 = this.zzd;
                            zzerVar.zzl(zzesVar2.zzi(), 0, i * 8);
                            zzesVar2.zzh(0);
                        }
                        this.zzf.zzc(this.zzd, i);
                        zzgsw.zzi(this.zzm != C.TIME_UNSET);
                        this.zzf.zze(this.zzm, 1, i, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzerVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzs2 = ((this.zzl & (-225)) << 8) | zzesVar.zzs();
                    this.zzk = zzs2;
                    zzes zzesVar3 = this.zzd;
                    if (zzs2 > zzesVar3.zzi().length) {
                        zzesVar3.zza(zzs2);
                        zzer zzerVar2 = this.zze;
                        byte[] zzi3 = zzesVar3.zzi();
                        zzerVar2.zzb(zzi3, zzi3.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzesVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
