package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzaim implements zzafp {
    private zzafs zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaiq zzg;
    private zzafq zzh;
    private zzagx zzi;
    private zzalv zzj;
    private final zzes zza = new zzes(2);
    private long zzf = -1;

    private final int zzh(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzesVar.zza(2);
        ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, 2, false);
        return zzesVar.zzt();
    }

    private final int zzi(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzesVar.zza(2);
        zzafqVar.zzi(zzesVar.zzi(), 0, 2);
        return zzesVar.zzt() - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        int zzi;
        if (zzh(zzafqVar) == 65496) {
            while (true) {
                int zzh = zzh(zzafqVar);
                this.zzd = zzh;
                if (zzh == 65498 || (zzi = zzi(zzafqVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzafg) zzafqVar).zzj(zzi, false);
                } else {
                    zzes zzesVar = this.zza;
                    zzesVar.zza(zzi);
                    ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, zzi, false);
                    if (!Objects.equals(zzesVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaip.zzb(zzesVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzb = zzafsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x019e  */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        String zzM;
        zzaio zza;
        zzaiq zzaiqVar;
        long j;
        int i = this.zzc;
        long j2 = -1;
        if (i == 0) {
            zzes zzesVar = this.zza;
            zzesVar.zza(2);
            zzafqVar.zzc(zzesVar.zzi(), 0, 2);
            int zzt = zzesVar.zzt();
            this.zzd = zzt;
            if (zzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((zzt < 65488 || zzt > 65497) && zzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.zze = zzi(zzafqVar);
            zzafqVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzafqVar != this.zzh) {
                    this.zzh = zzafqVar;
                    this.zzi = new zzagx(zzafqVar, this.zzf);
                }
                zzalv zzalvVar = this.zzj;
                zzalvVar.getClass();
                int zzd = zzalvVar.zzd(this.zzi, zzagpVar);
                if (zzd == 1) {
                    zzagpVar.zza += this.zzf;
                }
                return zzd;
            }
            long zzn = zzafqVar.zzn();
            long j3 = this.zzf;
            if (zzn != j3) {
                zzagpVar.zza = j3;
                return 1;
            }
            if (zzafqVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzafqVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzalv(zzanc.zza, 8);
                }
                zzagx zzagxVar = new zzagx(zzafqVar, this.zzf);
                this.zzi = zzagxVar;
                if (this.zzj.zza(zzagxVar)) {
                    zzalv zzalvVar2 = this.zzj;
                    long j4 = this.zzf;
                    zzafs zzafsVar = this.zzb;
                    zzafsVar.getClass();
                    zzalvVar2.zzc(new zzagz(j4, zzafsVar));
                    zzaiq zzaiqVar2 = this.zzg;
                    zzaiqVar2.getClass();
                    zzafs zzafsVar2 = this.zzb;
                    zzafsVar2.getClass();
                    zzahb zzu = zzafsVar2.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new zzap(C.TIME_UNSET, zzaiqVar2));
                    zzu.zzA(zztVar.zzO());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzes zzesVar2 = new zzes(this.zze);
            zzafqVar.zzc(zzesVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzesVar2.zzM((char) 0)) && (zzM = zzesVar2.zzM((char) 0)) != null) {
                long zzo = zzafqVar.zzo();
                if (zzo != -1 && (zza = zzaip.zza(zzM)) != null) {
                    List list = zza.zzb;
                    if (list.size() >= 2) {
                        int size = list.size() - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (size >= 0) {
                            zzain zzainVar = (zzain) list.get(size);
                            String str = zzainVar.zza;
                            long j9 = j2;
                            boolean z = str.equals(MimeTypes.VIDEO_MP4) || str.equals("video/quicktime");
                            if (size == 0) {
                                zzo -= zzainVar.zzc;
                                j = 0;
                            } else {
                                j = zzo - zzainVar.zzb;
                            }
                            long j10 = j;
                            long j11 = zzo;
                            zzo = j10;
                            if (z && zzo != j11) {
                                j8 = j11 - zzo;
                                j7 = zzo;
                            }
                            if (size == 0) {
                                j6 = j11;
                            }
                            if (size == 0) {
                                j5 = zzo;
                            }
                            size--;
                            j2 = j9;
                        }
                        long j12 = j2;
                        if (j7 != j12 && j8 != j12 && j5 != j12 && j6 != j12) {
                            zzaiqVar = new zzaiq(j5, j6, zza.zza, j7, j8);
                            this.zzg = zzaiqVar;
                            if (zzaiqVar != null) {
                                this.zzf = zzaiqVar.zzd;
                            }
                        }
                    }
                }
                zzaiqVar = null;
                this.zzg = zzaiqVar;
                if (zzaiqVar != null) {
                }
            }
        } else {
            zzafqVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzalv zzalvVar = this.zzj;
            zzalvVar.getClass();
            zzalvVar.zze(j, j2);
        }
    }

    private final void zzj() {
        zzafs zzafsVar = this.zzb;
        zzafsVar.getClass();
        zzafsVar.zzv();
        this.zzb.zzw(new zzagr(C.TIME_UNSET, 0L));
        this.zzc = 6;
    }
}
