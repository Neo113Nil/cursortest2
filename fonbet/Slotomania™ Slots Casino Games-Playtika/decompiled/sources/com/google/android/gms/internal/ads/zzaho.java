package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaho implements zzafp {
    private final zzes zza;
    private final zzahn zzb;
    private final boolean zzc;
    private final zzanc zzd;
    private int zze;
    private zzafs zzf;
    private zzahp zzg;
    private long zzh;
    private zzahr[] zzi;
    private long zzj;
    private zzahr zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaho() {
        this(1, zzanc.zza);
    }

    private final zzahr zzi(int i) {
        for (zzahr zzahrVar : this.zzi) {
            if (zzahrVar.zzc(i)) {
                return zzahrVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzafqVar.zzi(zzesVar.zzi(), 0, 12);
        zzesVar.zzh(0);
        if (zzesVar.zzC() != 1179011410) {
            return false;
        }
        zzesVar.zzk(4);
        return zzesVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zze = 0;
        if (this.zzc) {
            zzafsVar = new zzanf(zzafsVar, this.zzd);
        }
        this.zzf = zzafsVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzahr zzahrVar : this.zzi) {
            zzahrVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    final /* synthetic */ zzahr[] zzh() {
        return this.zzi;
    }

    public zzaho(int i, zzanc zzancVar) {
        this.zzd = zzancVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzes(12);
        this.zzb = new zzahn(null);
        this.zzf = new zzago();
        this.zzi = new zzahr[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        boolean z;
        ?? r20;
        long j;
        long j2 = this.zzj;
        if (j2 != -1) {
            long zzn = zzafqVar.zzn();
            if (j2 < zzn || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + zzn) {
                zzagpVar.zza = j2;
                z = true;
                this.zzj = -1L;
                if (!z) {
                    return 1;
                }
                int i = this.zze;
                zzahr zzahrVar = null;
                if (i == 0) {
                    if (!zza(zzafqVar)) {
                        throw zzat.zzb("AVI Header List not found", null);
                    }
                    zzafqVar.zzf(12);
                    this.zze = 1;
                    return 0;
                }
                if (i == 1) {
                    zzes zzesVar = this.zza;
                    zzafqVar.zzc(zzesVar.zzi(), 0, 12);
                    zzesVar.zzh(0);
                    zzahn zzahnVar = this.zzb;
                    zzahnVar.zza(zzesVar);
                    int i2 = zzahnVar.zza;
                    if (i2 != 1414744396) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                        sb.append("LIST expected, found: ");
                        sb.append(i2);
                        throw zzat.zzb(sb.toString(), null);
                    }
                    int zzC = zzesVar.zzC();
                    if (zzC == 1819436136) {
                        this.zzl = zzahnVar.zzb;
                        this.zze = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzC).length() + 22);
                    sb2.append("hdrl expected, found: ");
                    sb2.append(zzC);
                    throw zzat.zzb(sb2.toString(), null);
                }
                if (i == 2) {
                    int i3 = this.zzl - 4;
                    zzes zzesVar2 = new zzes(i3);
                    zzafqVar.zzc(zzesVar2.zzi(), 0, i3);
                    zzahs zzb = zzahs.zzb(AviExtractor.FOURCC_hdrl, zzesVar2);
                    if (zzb.zza() != 1819436136) {
                        int zza = zzb.zza();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zza).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(zza);
                        throw zzat.zzb(sb3.toString(), null);
                    }
                    zzahp zzahpVar = (zzahp) zzb.zzc(zzahp.class);
                    if (zzahpVar == null) {
                        throw zzat.zzb("AviHeader not found", null);
                    }
                    this.zzg = zzahpVar;
                    this.zzh = zzahpVar.zzc * zzahpVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzgvz zzgvzVar = zzb.zza;
                    int size = zzgvzVar.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size) {
                        zzahl zzahlVar = (zzahl) zzgvzVar.get(i4);
                        if (zzahlVar.zza() == 1819440243) {
                            zzahs zzahsVar = (zzahs) zzahlVar;
                            int i6 = i5 + 1;
                            zzahq zzahqVar = (zzahq) zzahsVar.zzc(zzahq.class);
                            zzaht zzahtVar = (zzaht) zzahsVar.zzc(zzaht.class);
                            if (zzahqVar == null) {
                                zzef.zzc("AviExtractor", "Missing Stream Header");
                            } else if (zzahtVar == null) {
                                zzef.zzc("AviExtractor", "Missing Stream Format");
                            } else {
                                long zzd = zzahqVar.zzd();
                                zzv zzvVar = zzahtVar.zza;
                                zzt zza2 = zzvVar.zza();
                                zza2.zzb(i5);
                                int i7 = zzahqVar.zze;
                                if (i7 != 0) {
                                    zza2.zzp(i7);
                                }
                                zzahu zzahuVar = (zzahu) zzahsVar.zzc(zzahu.class);
                                if (zzahuVar != null) {
                                    zza2.zzc(zzahuVar.zza);
                                }
                                int zzf = zzas.zzf(zzvVar.zzp);
                                if (zzf != 1) {
                                    if (zzf == 2) {
                                        zzf = 2;
                                    } else {
                                        zzahrVar = null;
                                    }
                                }
                                zzahb zzu = this.zzf.zzu(i5, zzf);
                                zzu.zzA(zza2.zzO());
                                zzu.zzO(zzd);
                                this.zzh = Math.max(this.zzh, zzd);
                                zzahrVar = new zzahr(i5, zzahqVar, zzu);
                            }
                            if (zzahrVar != null) {
                                arrayList.add(zzahrVar);
                            }
                            i5 = i6;
                        }
                        i4++;
                        zzahrVar = null;
                    }
                    this.zzi = (zzahr[]) arrayList.toArray(new zzahr[0]);
                    this.zzf.zzv();
                    this.zze = 3;
                    return 0;
                }
                if (i == 3) {
                    long j3 = this.zzm;
                    if (j3 != -1 && zzafqVar.zzn() != j3) {
                        this.zzj = j3;
                        return 0;
                    }
                    zzes zzesVar3 = this.zza;
                    zzafqVar.zzi(zzesVar3.zzi(), 0, 12);
                    zzafqVar.zzl();
                    zzesVar3.zzh(0);
                    zzahn zzahnVar2 = this.zzb;
                    zzahnVar2.zza(zzesVar3);
                    int zzC2 = zzesVar3.zzC();
                    int i8 = zzahnVar2.zza;
                    if (i8 == 1179011410) {
                        zzafqVar.zzf(12);
                        return 0;
                    }
                    if (i8 != 1414744396 || zzC2 != 1769369453) {
                        this.zzj = zzafqVar.zzn() + zzahnVar2.zzb + 8;
                        return 0;
                    }
                    long zzn2 = zzafqVar.zzn();
                    this.zzm = zzn2;
                    long j4 = zzn2 + zzahnVar2.zzb + 8;
                    this.zzn = j4;
                    if (!this.zzp) {
                        zzahp zzahpVar2 = this.zzg;
                        zzahpVar2.getClass();
                        if ((zzahpVar2.zzb & 16) == 16) {
                            this.zze = 4;
                            this.zzj = j4;
                            return 0;
                        }
                        this.zzf.zzw(new zzagr(this.zzh, 0L));
                        this.zzp = true;
                    }
                    this.zzj = zzafqVar.zzn() + 12;
                    this.zze = 6;
                    return 0;
                }
                if (i == 4) {
                    zzes zzesVar4 = this.zza;
                    zzafqVar.zzc(zzesVar4.zzi(), 0, 8);
                    zzesVar4.zzh(0);
                    int zzC3 = zzesVar4.zzC();
                    int zzC4 = zzesVar4.zzC();
                    if (zzC3 != 829973609) {
                        this.zzj = zzafqVar.zzn() + zzC4;
                        return 0;
                    }
                    this.zze = 5;
                    this.zzo = zzC4;
                    return 0;
                }
                if (i != 5) {
                    if (zzafqVar.zzn() >= this.zzn) {
                        return -1;
                    }
                    zzahr zzahrVar2 = this.zzk;
                    if (zzahrVar2 != null) {
                        if (!zzahrVar2.zze(zzafqVar)) {
                            return 0;
                        }
                        this.zzk = null;
                        return 0;
                    }
                    if ((zzafqVar.zzn() & 1) == 1) {
                        zzafqVar.zzf(1);
                    }
                    zzes zzesVar5 = this.zza;
                    zzafqVar.zzi(zzesVar5.zzi(), 0, 12);
                    zzesVar5.zzh(0);
                    int zzC5 = zzesVar5.zzC();
                    if (zzC5 == 1414744396) {
                        zzesVar5.zzh(8);
                        zzafqVar.zzf(zzesVar5.zzC() != 1769369453 ? 8 : 12);
                        zzafqVar.zzl();
                        return 0;
                    }
                    int zzC6 = zzesVar5.zzC();
                    if (zzC5 == 1263424842) {
                        this.zzj = zzafqVar.zzn() + zzC6 + 8;
                        return 0;
                    }
                    zzafqVar.zzf(8);
                    zzafqVar.zzl();
                    zzahr zzi = zzi(zzC5);
                    if (zzi == null) {
                        this.zzj = zzafqVar.zzn() + zzC6;
                        return 0;
                    }
                    zzi.zzd(zzC6);
                    this.zzk = zzi;
                    return 0;
                }
                zzes zzesVar6 = new zzes(this.zzo);
                zzafqVar.zzc(zzesVar6.zzi(), 0, this.zzo);
                if (zzesVar6.zzd() < 16) {
                    r20 = 0;
                    j = 0;
                } else {
                    int zzg = zzesVar6.zzg();
                    zzesVar6.zzk(8);
                    long zzC7 = zzesVar6.zzC();
                    r20 = 0;
                    long j5 = this.zzm;
                    j = zzC7 > j5 ? 0L : j5 + 8;
                    zzesVar6.zzh(zzg);
                }
                while (zzesVar6.zzd() >= 16) {
                    int zzC8 = zzesVar6.zzC();
                    int zzC9 = zzesVar6.zzC();
                    long zzC10 = zzesVar6.zzC() + j;
                    zzesVar6.zzk(4);
                    zzahr zzi2 = zzi(zzC8);
                    if (zzi2 != null) {
                        zzi2.zza(zzC10, (zzC9 & 16) == 16 ? true : r20);
                    }
                }
                zzahr[] zzahrVarArr = this.zzi;
                int length = zzahrVarArr.length;
                for (int i9 = r20; i9 < length; i9++) {
                    zzahrVarArr[i9].zzb();
                }
                this.zzp = true;
                if (this.zzi.length == 0) {
                    this.zzf.zzw(new zzagr(this.zzh, 0L));
                } else {
                    this.zzf.zzw(new zzahm(this, this.zzh));
                }
                this.zze = 6;
                this.zzj = this.zzm;
                return r20;
            }
            zzafqVar.zzf((int) (j2 - zzn));
        }
        z = false;
        this.zzj = -1L;
        if (!z) {
        }
    }
}
