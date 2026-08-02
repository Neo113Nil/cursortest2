package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzakj implements zzafp {
    public static final /* synthetic */ int zza = 0;
    private final zzes zzb;
    private final zzagm zzc;
    private final zzagi zzd;
    private final zzagk zze;
    private final zzahb zzf;
    private zzafs zzg;
    private zzahb zzh;
    private zzahb zzi;
    private int zzj;
    private zzap zzk;
    private zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private zzakn zzr;
    private boolean zzs;

    static {
        int i = zzakh.zza;
    }

    public zzakj() {
        throw null;
    }

    public zzakj(int i) {
        this.zzb = new zzes(10);
        this.zzc = new zzagm();
        this.zzd = new zzagi();
        this.zzm = C.TIME_UNSET;
        this.zze = new zzagk();
        zzafm zzafmVar = new zzafm();
        this.zzf = zzafmVar;
        this.zzi = zzafmVar;
        this.zzp = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzi(zzafq zzafqVar) throws IOException {
        long j;
        Throwable th;
        int i;
        zzagi zzagiVar;
        int i2;
        zzakn zzakeVar;
        int i3;
        int i4;
        zzap zzapVar;
        long zzn;
        zzajk zzajkVar;
        zzakg zze;
        zzap zzapVar2;
        if (this.zzj == 0) {
            try {
                zzk(zzafqVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzr == null) {
            zzagm zzagmVar = this.zzc;
            zzes zzesVar = new zzes(zzagmVar.zzc);
            zzafqVar.zzi(zzesVar.zzi(), 0, zzagmVar.zzc);
            int i5 = 21;
            if ((zzagmVar.zza & 1) != 0) {
                if (zzagmVar.zze != 1) {
                    i5 = 36;
                }
            } else if (zzagmVar.zze == 1) {
                i5 = 13;
            }
            th = null;
            if (zzesVar.zze() >= i5 + 4) {
                zzesVar.zzh(i5);
                i = zzesVar.zzB();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        zzakeVar = zzako.zze(zzafqVar.zzo(), zzafqVar.zzn(), zzagmVar, zzesVar);
                        zzagmVar = zzagmVar;
                        zzafqVar.zzf(zzagmVar.zzc);
                        j = -9223372036854775807L;
                        zzapVar = this.zzk;
                        zzn = zzafqVar.zzn();
                        if (zzapVar == null) {
                            zzajm zzajmVar = (zzajm) zzapVar.zzc(zzajm.class, zzaki.zza);
                            zze = zzakg.zze(zzn, zzajkVar, zzajmVar != null ? j : zzfk.zzs(Long.parseLong((String) zzajmVar.zzb.get(0))));
                            if (this.zzs) {
                            }
                            this.zzr = zzakeVar;
                            this.zzg.zzw(zzakeVar);
                            zzapVar2 = this.zzk;
                            if (zzapVar2 != null) {
                            }
                            zzt zztVar = new zzt();
                            zztVar.zzn(MimeTypes.AUDIO_MPEG);
                            zztVar.zzo(zzagmVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzG(zzagmVar.zze);
                            zztVar.zzH(zzagmVar.zzd);
                            zzagi zzagiVar2 = this.zzd;
                            zztVar.zzJ(zzagiVar2.zza);
                            zztVar.zzK(zzagiVar2.zzb);
                            zztVar.zzl(zzapVar2);
                            if (this.zzr.zzh() != -2147483647) {
                            }
                            this.zzi.zzA(zztVar.zzO());
                            this.zzo = zzafqVar.zzn();
                        }
                        zze = null;
                        if (this.zzs) {
                        }
                        this.zzr = zzakeVar;
                        this.zzg.zzw(zzakeVar);
                        zzapVar2 = this.zzk;
                        if (zzapVar2 != null) {
                        }
                        zzt zztVar2 = new zzt();
                        zztVar2.zzn(MimeTypes.AUDIO_MPEG);
                        zztVar2.zzo(zzagmVar.zzb);
                        zztVar2.zzp(4096);
                        zztVar2.zzG(zzagmVar.zze);
                        zztVar2.zzH(zzagmVar.zzd);
                        zzagi zzagiVar22 = this.zzd;
                        zztVar2.zzJ(zzagiVar22.zza);
                        zztVar2.zzK(zzagiVar22.zzb);
                        zztVar2.zzl(zzapVar2);
                        if (this.zzr.zzh() != -2147483647) {
                        }
                        this.zzi.zzA(zztVar2.zzO());
                        this.zzo = zzafqVar.zzn();
                    } else if (i != 1483304551) {
                        zzafqVar.zzl();
                        j = -9223372036854775807L;
                        zzakeVar = null;
                        zzapVar = this.zzk;
                        zzn = zzafqVar.zzn();
                        if (zzapVar == null || (zzajkVar = (zzajk) zzapVar.zzc(zzajk.class, zzgta.zza())) == null) {
                            zze = null;
                        } else {
                            zzajm zzajmVar2 = (zzajm) zzapVar.zzc(zzajm.class, zzaki.zza);
                            zze = zzakg.zze(zzn, zzajkVar, zzajmVar2 != null ? j : zzfk.zzs(Long.parseLong((String) zzajmVar2.zzb.get(0))));
                        }
                        if (this.zzs) {
                            zzakeVar = new zzakm();
                        } else {
                            if (zze != null) {
                                zzakeVar = zze;
                            } else if (zzakeVar == null) {
                                zzakeVar = null;
                            }
                            if (zzakeVar == null) {
                                zzes zzesVar2 = this.zzb;
                                zzafqVar.zzi(zzesVar2.zzi(), 0, 4);
                                zzesVar2.zzh(0);
                                zzagmVar.zza(zzesVar2.zzB());
                                zzakeVar = new zzake(zzafqVar.zzo(), zzafqVar.zzn(), zzagmVar, false);
                            }
                            this.zzh.zzO(zzakeVar.zza());
                        }
                        this.zzr = zzakeVar;
                        this.zzg.zzw(zzakeVar);
                        zzapVar2 = this.zzk;
                        if (zzapVar2 != null) {
                            zzap zzapVar3 = this.zzl;
                            if (zzapVar3 != null) {
                                zzapVar2 = zzapVar2.zzf(zzapVar3);
                            }
                        } else {
                            zzapVar2 = this.zzl;
                        }
                        zzt zztVar22 = new zzt();
                        zztVar22.zzn(MimeTypes.AUDIO_MPEG);
                        zztVar22.zzo(zzagmVar.zzb);
                        zztVar22.zzp(4096);
                        zztVar22.zzG(zzagmVar.zze);
                        zztVar22.zzH(zzagmVar.zzd);
                        zzagi zzagiVar222 = this.zzd;
                        zztVar22.zzJ(zzagiVar222.zza);
                        zztVar22.zzK(zzagiVar222.zzb);
                        zztVar22.zzl(zzapVar2);
                        if (this.zzr.zzh() != -2147483647) {
                            zztVar22.zzi(this.zzr.zzh());
                        }
                        this.zzi.zzA(zztVar22.zzO());
                        this.zzo = zzafqVar.zzn();
                    }
                }
                zzakp zza2 = zzakp.zza(zzagmVar, zzesVar);
                zzagiVar = this.zzd;
                if (!zzagiVar.zzb() && (i3 = zza2.zze) != -1 && (i4 = zza2.zzf) != -1) {
                    zzagiVar.zza = i3;
                    zzagiVar.zzb = i4;
                }
                zzakl zzaklVar = zza2.zzd;
                this.zzl = zzaklVar != null ? new zzap(C.TIME_UNSET, zzaklVar) : null;
                long zzn2 = zzafqVar.zzn();
                if (zzafqVar.zzo() != -1) {
                    long j2 = zza2.zzc;
                    if (j2 != -1) {
                        long j3 = j2 + zzn2;
                        if (zzafqVar.zzo() != j3) {
                            j = -9223372036854775807L;
                            long zzo = zzafqVar.zzo();
                            StringBuilder sb = new StringBuilder(String.valueOf(zzo).length() + 53 + String.valueOf(j3).length() + 20);
                            sb.append("Data size mismatch between stream (");
                            sb.append(zzo);
                            sb.append(") and Xing frame (");
                            sb.append(j3);
                            sb.append("), using Xing value.");
                            zzef.zzb("Mp3Extractor", sb.toString());
                            zzafqVar.zzf(zzagmVar.zzc);
                            if (i != 1483304551) {
                                zzakeVar = zzakq.zze(zza2, zzn2);
                            } else {
                                long zzo2 = zzafqVar.zzo();
                                long zzb = zza2.zzb();
                                if (zzb != j) {
                                    long j4 = zza2.zzc;
                                    if (j4 != -1) {
                                        zzo2 = zzn2 + j4;
                                        i2 = zza2.zza.zzc;
                                    } else if (zzo2 != -1) {
                                        j4 = zzo2 - zzn2;
                                        i2 = zza2.zza.zzc;
                                    }
                                    long j5 = j4 - i2;
                                    zzakeVar = new zzake(zzo2, zzn2 + zza2.zza.zzc, zzgzt.zza(zzfk.zzv(j5, 8000000L, zzb, RoundingMode.HALF_UP)), zzgzt.zza(zzgzo.zza(j5, zza2.zzb, RoundingMode.HALF_UP)), false);
                                }
                                zzakeVar = null;
                            }
                            zzapVar = this.zzk;
                            zzn = zzafqVar.zzn();
                            if (zzapVar == null) {
                            }
                            zze = null;
                            if (this.zzs) {
                            }
                            this.zzr = zzakeVar;
                            this.zzg.zzw(zzakeVar);
                            zzapVar2 = this.zzk;
                            if (zzapVar2 != null) {
                            }
                            zzt zztVar222 = new zzt();
                            zztVar222.zzn(MimeTypes.AUDIO_MPEG);
                            zztVar222.zzo(zzagmVar.zzb);
                            zztVar222.zzp(4096);
                            zztVar222.zzG(zzagmVar.zze);
                            zztVar222.zzH(zzagmVar.zzd);
                            zzagi zzagiVar2222 = this.zzd;
                            zztVar222.zzJ(zzagiVar2222.zza);
                            zztVar222.zzK(zzagiVar2222.zzb);
                            zztVar222.zzl(zzapVar2);
                            if (this.zzr.zzh() != -2147483647) {
                            }
                            this.zzi.zzA(zztVar222.zzO());
                            this.zzo = zzafqVar.zzn();
                        }
                    }
                }
                j = -9223372036854775807L;
                zzafqVar.zzf(zzagmVar.zzc);
                if (i != 1483304551) {
                }
                zzapVar = this.zzk;
                zzn = zzafqVar.zzn();
                if (zzapVar == null) {
                }
                zze = null;
                if (this.zzs) {
                }
                this.zzr = zzakeVar;
                this.zzg.zzw(zzakeVar);
                zzapVar2 = this.zzk;
                if (zzapVar2 != null) {
                }
                zzt zztVar2222 = new zzt();
                zztVar2222.zzn(MimeTypes.AUDIO_MPEG);
                zztVar2222.zzo(zzagmVar.zzb);
                zztVar2222.zzp(4096);
                zztVar2222.zzG(zzagmVar.zze);
                zztVar2222.zzH(zzagmVar.zzd);
                zzagi zzagiVar22222 = this.zzd;
                zztVar2222.zzJ(zzagiVar22222.zza);
                zztVar2222.zzK(zzagiVar22222.zzb);
                zztVar2222.zzl(zzapVar2);
                if (this.zzr.zzh() != -2147483647) {
                }
                this.zzi.zzA(zztVar2222.zzO());
                this.zzo = zzafqVar.zzn();
            }
            if (zzesVar.zze() >= 40) {
                zzesVar.zzh(36);
                if (zzesVar.zzB() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    zzakp zza22 = zzakp.zza(zzagmVar, zzesVar);
                    zzagiVar = this.zzd;
                    if (!zzagiVar.zzb()) {
                        zzagiVar.zza = i3;
                        zzagiVar.zzb = i4;
                    }
                    zzakl zzaklVar2 = zza22.zzd;
                    this.zzl = zzaklVar2 != null ? new zzap(C.TIME_UNSET, zzaklVar2) : null;
                    long zzn22 = zzafqVar.zzn();
                    if (zzafqVar.zzo() != -1) {
                    }
                    j = -9223372036854775807L;
                    zzafqVar.zzf(zzagmVar.zzc);
                    if (i != 1483304551) {
                    }
                    zzapVar = this.zzk;
                    zzn = zzafqVar.zzn();
                    if (zzapVar == null) {
                    }
                    zze = null;
                    if (this.zzs) {
                    }
                    this.zzr = zzakeVar;
                    this.zzg.zzw(zzakeVar);
                    zzapVar2 = this.zzk;
                    if (zzapVar2 != null) {
                    }
                    zzt zztVar22222 = new zzt();
                    zztVar22222.zzn(MimeTypes.AUDIO_MPEG);
                    zztVar22222.zzo(zzagmVar.zzb);
                    zztVar22222.zzp(4096);
                    zztVar22222.zzG(zzagmVar.zze);
                    zztVar22222.zzH(zzagmVar.zzd);
                    zzagi zzagiVar222222 = this.zzd;
                    zztVar22222.zzJ(zzagiVar222222.zza);
                    zztVar22222.zzK(zzagiVar222222.zzb);
                    zztVar22222.zzl(zzapVar2);
                    if (this.zzr.zzh() != -2147483647) {
                    }
                    this.zzi.zzA(zztVar22222.zzO());
                    this.zzo = zzafqVar.zzn();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            zzakp zza222 = zzakp.zza(zzagmVar, zzesVar);
            zzagiVar = this.zzd;
            if (!zzagiVar.zzb()) {
            }
            zzakl zzaklVar22 = zza222.zzd;
            this.zzl = zzaklVar22 != null ? new zzap(C.TIME_UNSET, zzaklVar22) : null;
            long zzn222 = zzafqVar.zzn();
            if (zzafqVar.zzo() != -1) {
            }
            j = -9223372036854775807L;
            zzafqVar.zzf(zzagmVar.zzc);
            if (i != 1483304551) {
            }
            zzapVar = this.zzk;
            zzn = zzafqVar.zzn();
            if (zzapVar == null) {
            }
            zze = null;
            if (this.zzs) {
            }
            this.zzr = zzakeVar;
            this.zzg.zzw(zzakeVar);
            zzapVar2 = this.zzk;
            if (zzapVar2 != null) {
            }
            zzt zztVar222222 = new zzt();
            zztVar222222.zzn(MimeTypes.AUDIO_MPEG);
            zztVar222222.zzo(zzagmVar.zzb);
            zztVar222222.zzp(4096);
            zztVar222222.zzG(zzagmVar.zze);
            zztVar222222.zzH(zzagmVar.zzd);
            zzagi zzagiVar2222222 = this.zzd;
            zztVar222222.zzJ(zzagiVar2222222.zza);
            zztVar222222.zzK(zzagiVar2222222.zzb);
            zztVar222222.zzl(zzapVar2);
            if (this.zzr.zzh() != -2147483647) {
            }
            this.zzi.zzA(zztVar222222.zzO());
            this.zzo = zzafqVar.zzn();
        } else {
            j = -9223372036854775807L;
            th = null;
            long j6 = this.zzo;
            if (j6 != 0) {
                long zzn3 = zzafqVar.zzn();
                if (zzn3 < j6) {
                    zzafqVar.zzf((int) (j6 - zzn3));
                }
            }
        }
        int i6 = this.zzq;
        if (i6 == 0) {
            zzafqVar.zzl();
            if (zzl(zzafqVar)) {
                return -1;
            }
            zzes zzesVar3 = this.zzb;
            zzesVar3.zzh(0);
            int zzB = zzesVar3.zzB();
            if (!zzn(zzB, this.zzj) || zzagn.zza(zzB) == -1) {
                zzafqVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzagm zzagmVar2 = this.zzc;
            zzagmVar2.zza(zzB);
            if (this.zzm == j) {
                this.zzm = this.zzr.zzf(zzafqVar.zzn());
            }
            i6 = zzagmVar2.zzc;
            this.zzq = i6;
            this.zzp = zzafqVar.zzn() + i6;
            zzakn zzaknVar = this.zzr;
            if (zzaknVar instanceof zzakf) {
                zzj(this.zzn + zzagmVar2.zzg);
                throw th;
            }
        }
        int zza3 = this.zzi.zza(zzafqVar, i6, true);
        if (zza3 == -1) {
            return -1;
        }
        int i7 = this.zzq - zza3;
        this.zzq = i7;
        if (i7 > 0) {
            return 0;
        }
        this.zzi.zze(zzj(this.zzn), 1, this.zzc.zzc, 0, null);
        this.zzn += r1.zzg;
        this.zzq = 0;
        return 0;
    }

    private final long zzj(long j) {
        return this.zzm + ((j * 1000000) / this.zzc.zzd);
    }

    private final boolean zzk(zzafq zzafqVar, boolean z) throws IOException {
        int i;
        int i2;
        int zza2;
        zzafqVar.zzl();
        if (zzafqVar.zzn() == 0) {
            zzap zza3 = this.zze.zza(zzafqVar, null, 131072);
            this.zzk = zza3;
            if (zza3 != null) {
                this.zzd.zza(zza3);
            }
            i = (int) zzafqVar.zzm();
            if (!z) {
                zzafqVar.zzf(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!zzl(zzafqVar)) {
                zzes zzesVar = this.zzb;
                zzesVar.zzh(0);
                int zzB = zzesVar.zzB();
                if ((i2 == 0 || zzn(zzB, i2)) && (zza2 = zzagn.zza(zzB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(zzB);
                        i2 = zzB;
                    }
                    zzafqVar.zzk(zza2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z) {
                        zzafqVar.zzl();
                        zzafqVar.zzk(i + i5);
                    } else {
                        zzafqVar.zzf(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z) {
            zzafqVar.zzf(i + i4);
        } else {
            zzafqVar.zzl();
        }
        this.zzj = i2;
        return true;
    }

    private final boolean zzl(zzafq zzafqVar) throws IOException {
        zzakn zzaknVar = this.zzr;
        if (zzaknVar != null) {
            long zzg = zzaknVar.zzg();
            if (zzg != -1 && zzafqVar.zzm() > zzg - 4) {
                return true;
            }
        }
        try {
            return !zzafqVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzakn zzaknVar = this.zzr;
        if ((zzaknVar instanceof zzake) && zzaknVar.zzb()) {
            long j = this.zzp;
            if (j == -1 || j == this.zzr.zzg()) {
                return;
            }
            this.zzr = ((zzake) this.zzr).zzi(this.zzp);
            zzafs zzafsVar = this.zzg;
            zzafsVar.getClass();
            zzafsVar.zzw(this.zzr);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        return zzk(zzafqVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzg = zzafsVar;
        zzahb zzu = zzafsVar.zzu(0, 1);
        this.zzh = zzu;
        this.zzi = zzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        this.zzh.getClass();
        String str = zzfk.zza;
        int zzi = zzi(zzafqVar);
        if (zzi == -1 && (this.zzr instanceof zzakf)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzm = C.TIME_UNSET;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        zzakn zzaknVar = this.zzr;
        if (zzaknVar instanceof zzakf) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    public final void zzh() {
        this.zzs = true;
    }
}
