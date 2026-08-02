package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzlz {
    private final zzng zzc;
    private final zzdy zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjo zzh;
    private zzlw zzi;
    private zzlw zzj;
    private zzlw zzk;
    private zzlw zzl;
    private zzlw zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzlh zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzlz(zzng zzngVar, zzdy zzdyVar, zzlh zzlhVar, zzjo zzjoVar) {
        this.zzc = zzngVar;
        this.zzd = zzdyVar;
        this.zzr = zzlhVar;
        this.zzh = zzjoVar;
    }

    private static zzxc zzA(zzbf zzbfVar, Object obj, long j, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int zze = zzbdVar.zze(j);
        return zze == -1 ? new zzxc(obj, j2, zzbdVar.zzf(j)) : new zzxc(obj, zze, zzbdVar.zzd(zze), j2);
    }

    private final void zzB() {
        int i = zzgvz.zzd;
        final zzgvw zzgvwVar = new zzgvw();
        for (zzlw zzlwVar = this.zzi; zzlwVar != null; zzlwVar = zzlwVar.zzp()) {
            zzgvwVar.zzf(zzlwVar.zzg.zza);
        }
        zzlw zzlwVar2 = this.zzj;
        final zzxc zzxcVar = zzlwVar2 == null ? null : zzlwVar2.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzly
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzlz.this.zzz(zzgvwVar, zzxcVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlw zzlwVar = (zzlw) this.zzq.get(i);
            if (zzlwVar.zzb.equals(obj)) {
                return zzlwVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzlw zzlwVar = this.zzi;
        if (zzlwVar == null) {
            return 0;
        }
        int zze = zzbfVar.zze(zzlwVar.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            zze = zzbfVar2.zzl(zze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlwVar.getClass();
                if (zzlwVar.zzp() == null || zzlwVar.zzg.zzi) {
                    break;
                }
                zzlwVar = zzlwVar.zzp();
            }
            zzlw zzp = zzlwVar.zzp();
            if (zze == -1 || zzp == null || zzbfVar2.zze(zzp.zzb) != zze) {
                break;
            }
            zzlwVar = zzp;
            zzbfVar = zzbfVar2;
        }
        int zzs = zzs(zzlwVar);
        zzlwVar.zzg = zzx(zzbfVar2, zzlwVar.zzg);
        return zzs;
    }

    private final zzlx zzE(zzbf zzbfVar, zzlw zzlwVar, long j) {
        zzbf zzbfVar2;
        long j2;
        long j3;
        zzbf zzbfVar3;
        zzbd zzbdVar;
        zzbe zzbeVar;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        zzlx zzlxVar = zzlwVar.zzg;
        long zza = zzlwVar.zza();
        long j8 = zzlxVar.zzf;
        long j9 = (zza + j8) - j;
        long j10 = 0;
        if (!zzlxVar.zzi) {
            zzxc zzxcVar = zzlxVar.zza;
            Object obj2 = zzxcVar.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj2, zzbdVar2);
            boolean z = zzlxVar.zzh;
            if (!zzxcVar.zzb()) {
                int i = zzxcVar.zze;
                if (i != -1) {
                    zzbdVar2.zzi(i);
                }
                int zzd = zzbdVar2.zzd(i);
                zzbdVar2.zzk(i);
                if (zzd != zzbdVar2.zzg(i)) {
                    return zzG(zzbfVar, obj2, i, zzd, j8, zzxcVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i);
                return zzH(zzbfVar, obj2, 0L, C.TIME_UNSET, j8, zzxcVar.zzd, false);
            }
            int i2 = zzxcVar.zzb;
            if (zzbdVar2.zzg(i2) == -1) {
                return null;
            }
            int zza2 = zzbdVar2.zzg.zza(i2).zza(zzxcVar.zzc);
            if (zza2 < 0) {
                return zzG(zzbfVar, obj2, i2, zza2, zzlxVar.zzd, zzxcVar.zzd, false);
            }
            long j11 = zzlxVar.zzd;
            if (j11 == C.TIME_UNSET) {
                zzbe zzbeVar2 = this.zzb;
                long max = zzL(zzbfVar, zzbdVar2.zzc, zzbdVar2.zzd, zzbeVar2) ? Math.max(0L, j9) : -9223372036854775807L;
                zzbfVar2 = zzbfVar;
                Pair zzn = zzbfVar2.zzn(zzbeVar2, zzbdVar2, zzbdVar2.zzc, C.TIME_UNSET, max);
                if (zzn == null) {
                    return null;
                }
                j11 = ((Long) zzn.second).longValue();
                j3 = max;
                j2 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j2 = j11;
                j3 = -9223372036854775807L;
            }
            zzK(zzbfVar2, obj2, i2);
            return zzH(zzbfVar2, obj2, Math.max(0L, j11), j3, j2, zzxcVar.zzd, false);
        }
        zzxc zzxcVar2 = zzlxVar.zza;
        Object obj3 = zzxcVar2.zza;
        int zze = zzbfVar.zze(obj3);
        int i3 = this.zzf;
        boolean z2 = this.zzg;
        zzbe zzbeVar3 = this.zzb;
        zzbd zzbdVar3 = this.zza;
        int zzl = zzbfVar.zzl(zze, zzbdVar3, zzbeVar3, i3, z2);
        if (zzl == -1) {
            return null;
        }
        int i4 = zzbfVar.zzd(zzl, zzbdVar3, true).zzc;
        Object obj4 = zzbdVar3.zzb;
        obj4.getClass();
        long j12 = zzxcVar2.zzd;
        if (zzbfVar.zzb(i4, zzbeVar3, 0L).zzn == zzl) {
            long max2 = zzL(zzbfVar, zzbdVar3.zzc, zzbdVar3.zzd, zzbeVar3) ? Math.max(0L, j9) : -9223372036854775807L;
            Pair zzn2 = zzbfVar.zzn(zzbeVar3, zzbdVar3, i4, C.TIME_UNSET, max2);
            if (zzn2 == null) {
                return null;
            }
            Object obj5 = zzn2.first;
            long longValue = ((Long) zzn2.second).longValue();
            zzlw zzp = zzlwVar.zzp();
            if (zzp == null || !zzp.zzb.equals(obj5)) {
                long zzC = zzC(obj5);
                if (zzC == -1) {
                    zzC = this.zze;
                    this.zze = 1 + zzC;
                }
                j7 = zzC;
            } else {
                j7 = zzp.zzg.zza.zzd;
            }
            long j13 = max2;
            zzbeVar = zzbeVar3;
            obj = obj5;
            j4 = j7;
            j6 = j13;
            zzbfVar3 = zzbfVar;
            zzbdVar = zzbdVar3;
            j5 = longValue;
            j10 = -9223372036854775807L;
        } else {
            zzbfVar3 = zzbfVar;
            zzbdVar = zzbdVar3;
            zzbeVar = zzbeVar3;
            j4 = j12;
            j5 = 0;
            obj = obj4;
            j6 = -9223372036854775807L;
        }
        zzxc zzA = zzA(zzbfVar3, obj, j5, j4, zzbeVar, zzbdVar);
        long j14 = j5;
        zzbd zzbdVar4 = zzbdVar;
        if (j10 != C.TIME_UNSET && zzlxVar.zzd != C.TIME_UNSET) {
            zzbfVar3.zzo(obj3, zzbdVar4).zzb();
            int i5 = zzbdVar4.zzg.zzd;
        }
        return zzF(zzbfVar3, zzA, j10, j14, j6);
    }

    private final zzlx zzF(zzbf zzbfVar, zzxc zzxcVar, long j, long j2, long j3) {
        Object obj = zzxcVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzxcVar.zzb() ? zzG(zzbfVar, obj, zzxcVar.zzb, zzxcVar.zzc, j, zzxcVar.zzd, false) : zzH(zzbfVar, obj, j2, j3, j, zzxcVar.zzd, false);
    }

    private final zzlx zzG(zzbf zzbfVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzxc zzxcVar = new zzxc(obj, i, i2, j2);
        Object obj2 = zzxcVar.zza;
        int i3 = zzxcVar.zzb;
        int i4 = zzxcVar.zzc;
        zzbd zzbdVar = this.zza;
        long zzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i3, i4);
        if (i2 == zzbdVar.zzd(i)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i3);
        long j3 = 0;
        if (zzh != C.TIME_UNSET && zzh <= 0) {
            j3 = Math.max(0L, (-1) + zzh);
        }
        return new zzlx(zzxcVar, j3, C.TIME_UNSET, j, C.TIME_UNSET, zzh, false, false, false, false, false);
    }

    private final zzlx zzH(zzbf zzbfVar, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        long j6;
        long j7;
        long j8 = j;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int zzf = zzbdVar.zzf(j8);
        if (zzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(zzf);
        }
        zzxc zzxcVar = new zzxc(obj, j4, zzf);
        boolean zzM = zzM(zzxcVar);
        boolean zzI = zzI(zzbfVar, zzxcVar);
        boolean zzJ = zzJ(zzbfVar, zzxcVar, zzM);
        if (zzf != -1) {
            zzbdVar.zzk(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzi(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzc(zzf);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        if (j5 != C.TIME_UNSET) {
            j7 = j5;
            j6 = j7;
        } else {
            j6 = zzbdVar.zzd;
            j7 = -9223372036854775807L;
        }
        if (j6 != C.TIME_UNSET && j8 >= j6) {
            j8 = Math.max(0L, j6 - 1);
        }
        return new zzlx(zzxcVar, j8, j2, j3, j7, j6, false, false, zzM, zzI, zzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzxc zzxcVar) {
        if (!zzM(zzxcVar)) {
            return false;
        }
        Object obj = zzxcVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzxc zzxcVar, boolean z) {
        int zze = zzbfVar.zze(zzxcVar.zza);
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzd(zze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i, zzbeVar, 0L).zzi && zzbfVar.zzl(zze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i);
        long j = zzbdVar.zzg.zza(i).zzi;
        return 0L;
    }

    private static boolean zzL(zzbf zzbfVar, int i, long j, zzbe zzbeVar) {
        if (j == C.TIME_UNSET) {
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzi && !zzbeVar.zzk) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzM(zzxc zzxcVar) {
        return !zzxcVar.zzb() && zzxcVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i) {
        this.zzf = i;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z) {
        this.zzg = z;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjo zzjoVar) {
        this.zzh = zzjoVar;
        long j = zzjoVar.zzb;
        zzj();
    }

    public final boolean zzd(zzxa zzxaVar) {
        zzlw zzlwVar = this.zzl;
        return zzlwVar != null && zzlwVar.zza == zzxaVar;
    }

    public final boolean zze(zzxa zzxaVar) {
        zzlw zzlwVar = this.zzm;
        return zzlwVar != null && zzlwVar.zza == zzxaVar;
    }

    public final void zzf(long j) {
        zzlw zzlwVar = this.zzl;
        if (zzlwVar != null) {
            zzlwVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzlw zzlwVar = this.zzl;
        if (zzlwVar != null) {
            return !zzlwVar.zzg.zzk && zzlwVar.zzd() && this.zzl.zzg.zzf != C.TIME_UNSET && this.zzn < 100;
        }
        return true;
    }

    public final zzlx zzh(long j, zzmm zzmmVar) {
        zzlw zzlwVar = this.zzl;
        return zzlwVar == null ? zzF(zzmmVar.zza, zzmmVar.zzb, zzmmVar.zzc, zzmmVar.zzs, C.TIME_UNSET) : zzE(zzmmVar.zza, zzlwVar, j);
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzlw) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzlw zzk() {
        return this.zzl;
    }

    public final zzlw zzl() {
        return this.zzm;
    }

    public final zzlw zzm() {
        return this.zzi;
    }

    public final zzlw zzn() {
        return this.zzj;
    }

    public final zzlw zzo() {
        return this.zzk;
    }

    public final zzlw zzp() {
        zzlw zzlwVar = this.zzk;
        zzlw zzlwVar2 = this.zzj;
        if (zzlwVar == zzlwVar2) {
            zzlwVar2.getClass();
            this.zzk = zzlwVar2.zzp();
        }
        zzlwVar2.getClass();
        this.zzj = zzlwVar2.zzp();
        zzB();
        zzlw zzlwVar3 = this.zzj;
        zzlwVar3.getClass();
        return zzlwVar3;
    }

    public final zzlw zzq() {
        zzlw zzlwVar = this.zzk;
        zzlwVar.getClass();
        this.zzk = zzlwVar.zzp();
        zzB();
        zzlw zzlwVar2 = this.zzk;
        zzlwVar2.getClass();
        return zzlwVar2;
    }

    public final zzlw zzr() {
        zzlw zzlwVar = this.zzi;
        if (zzlwVar == null) {
            return null;
        }
        if (zzlwVar == this.zzj) {
            this.zzj = zzlwVar.zzp();
        }
        if (zzlwVar == this.zzk) {
            this.zzk = zzlwVar.zzp();
        }
        zzlwVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzlw zzlwVar2 = this.zzi;
            this.zzo = zzlwVar2.zzb;
            this.zzp = zzlwVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzlw zzlwVar = this.zzm;
        if (zzlwVar == null || zzlwVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzlw zzlwVar2 = (zzlw) this.zzq.get(i);
                if (!zzlwVar2.zze()) {
                    this.zzm = zzlwVar2;
                    return;
                }
            }
        }
    }

    public final zzlw zzu(zzxa zzxaVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlw zzlwVar = (zzlw) this.zzq.get(i);
            if (zzlwVar.zza == zzxaVar) {
                return zzlwVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzlw zzlwVar = this.zzi;
        zzlwVar.getClass();
        this.zzo = zzlwVar.zzb;
        this.zzp = zzlwVar.zzg.zza.zzd;
        while (zzlwVar != null) {
            zzlwVar.zzn();
            zzlwVar = zzlwVar.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzw(zzbf zzbfVar, long j, long j2, long j3) {
        zzlx zzE;
        long j4;
        zzlx zzlxVar;
        int i;
        zzlx zzlxVar2;
        int i2;
        int zzs;
        zzlw zzlwVar = this.zzi;
        zzlw zzlwVar2 = null;
        while (zzlwVar != null) {
            zzlx zzlxVar3 = zzlwVar.zzg;
            if (zzlwVar2 != null) {
                zzE = zzE(zzbfVar, zzlwVar2, j);
                if (zzE != null && zzlxVar3.zza.equals(zzE.zza)) {
                    long j5 = zzlxVar3.zzb;
                    long j6 = zzE.zzb;
                    if (j5 == j6) {
                        zzlxVar = zzlxVar3;
                        j4 = C.TIME_UNSET;
                        i = 0;
                    } else {
                        j4 = C.TIME_UNSET;
                        long j7 = zzlxVar3.zzc;
                        if (j7 != C.TIME_UNSET) {
                            zzlxVar = zzlxVar3;
                            i = 0;
                            long j8 = zzE.zzc;
                            if (j8 != C.TIME_UNSET) {
                                if (Math.abs((j6 - j8) - (j5 - j7)) >= 5000000) {
                                }
                            }
                        }
                    }
                    if (j5 != j6) {
                        zzlxVar2 = zzlxVar;
                        zzE = zzE.zza(j5, zzlxVar2.zzc);
                    } else {
                        zzlxVar2 = zzlxVar;
                    }
                }
                return zzs(zzlwVar2);
            }
            zzE = zzx(zzbfVar, zzlxVar3);
            zzlxVar2 = zzlxVar3;
            j4 = C.TIME_UNSET;
            i = 0;
            zzlwVar.zzg = zzE.zzb(zzlxVar2.zzd);
            long j9 = zzlxVar2.zzf;
            long j10 = zzE.zzf;
            if (j9 != j10) {
                zzlwVar.zzs();
                long zza = j10 == j4 ? Long.MAX_VALUE : j10 + zzlwVar.zza();
                if (zzlwVar == this.zzj) {
                    boolean z = zzlwVar.zzg.zzh;
                    if (j2 == Long.MIN_VALUE || j2 >= zza) {
                        i2 = 1;
                        int i3 = (zzlwVar == this.zzk || (j3 != Long.MIN_VALUE && j3 < zza)) ? i : 1;
                        zzs = zzs(zzlwVar);
                        if (zzs == 0) {
                            return zzs;
                        }
                        if (j9 == j4) {
                            long j11 = zzlxVar2.zze;
                            j9 = j4;
                        }
                        int i4 = (i2 == 0 || j9 == j4) ? i : 1;
                        return i3 != 0 ? i4 | 2 : i4;
                    }
                }
                i2 = i;
                if (zzlwVar == this.zzk) {
                }
                zzs = zzs(zzlwVar);
                if (zzs == 0) {
                }
            } else {
                zzlwVar2 = zzlwVar;
                zzlwVar = zzlwVar.zzp();
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzlx zzx(zzbf zzbfVar, zzlx zzlxVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzxc zzxcVar = zzlxVar.zza;
        boolean zzM = zzM(zzxcVar);
        boolean zzI = zzI(zzbfVar, zzxcVar);
        boolean zzJ = zzJ(zzbfVar, zzxcVar, zzM);
        Object obj = zzxcVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxcVar.zzb() || (i = zzxcVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i);
            j = 0;
        }
        if (zzxcVar.zzb()) {
            j2 = zzbdVar.zzh(zzxcVar.zzb, zzxcVar.zzc);
        } else {
            if (j != C.TIME_UNSET) {
                j3 = 0;
                j4 = 0;
                if (zzxcVar.zzb()) {
                    int i2 = zzxcVar.zze;
                    if (i2 != -1) {
                        zzbdVar.zzk(i2);
                    }
                } else {
                    zzbdVar.zzk(zzxcVar.zzb);
                }
                long j5 = zzlxVar.zzb;
                long j6 = zzlxVar.zzc;
                long j7 = zzlxVar.zzd;
                boolean z = zzlxVar.zzg;
                return new zzlx(zzxcVar, j5, j6, j7, j3, j4, false, false, zzM, zzI, zzJ);
            }
            j2 = zzbdVar.zzd;
        }
        j3 = j;
        j4 = j2;
        if (zzxcVar.zzb()) {
        }
        long j52 = zzlxVar.zzb;
        long j62 = zzlxVar.zzc;
        long j72 = zzlxVar.zzd;
        boolean z2 = zzlxVar.zzg;
        return new zzlx(zzxcVar, j52, j62, j72, j3, j4, false, false, zzM, zzI, zzJ);
    }

    public final zzxc zzy(zzbf zzbfVar, Object obj, long j) {
        long zzC;
        int zze;
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(zze, zzbdVar, false).zzc != i) {
            zzlw zzlwVar = this.zzi;
            while (true) {
                if (zzlwVar == null) {
                    zzlw zzlwVar2 = this.zzi;
                    while (true) {
                        if (zzlwVar2 != null) {
                            int zze2 = zzbfVar.zze(zzlwVar2.zzb);
                            if (zze2 != -1 && zzbfVar.zzd(zze2, zzbdVar, false).zzc == i) {
                                zzC = zzlwVar2.zzg.zza.zzd;
                                break;
                            }
                            zzlwVar2 = zzlwVar2.zzp();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzlwVar.zzb.equals(obj)) {
                        zzC = zzlwVar.zzg.zza.zzd;
                        break;
                    }
                    zzlwVar = zzlwVar.zzp();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i2 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        Object obj3 = obj;
        for (int zze3 = zzbfVar.zze(obj); zze3 >= zzbeVar.zzn; zze3--) {
            zzbfVar.zzd(zze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(zzgvw zzgvwVar, zzxc zzxcVar) {
        this.zzc.zzz(zzgvwVar.zzi(), zzxcVar);
    }

    public final zzlw zzi(zzlx zzlxVar) {
        zzlw zzlwVar;
        zzlw zzlwVar2 = this.zzl;
        long zza = zzlwVar2 == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : (zzlwVar2.zza() + zzlwVar2.zzg.zzf) - zzlxVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzlwVar = null;
                break;
            }
            zzlx zzlxVar2 = ((zzlw) this.zzq.get(i)).zzg;
            long j = zzlxVar2.zzf;
            long j2 = zzlxVar.zzf;
            if ((j == C.TIME_UNSET || j == j2) && zzlxVar2.zzb == zzlxVar.zzb && zzlxVar2.zza.equals(zzlxVar.zza)) {
                zzlwVar = (zzlw) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzlwVar == null) {
            zzlwVar = this.zzr.zza(zzlxVar, zza);
        } else {
            zzlwVar.zzg = zzlxVar;
            zzlwVar.zzb(zza);
        }
        zzlw zzlwVar3 = this.zzl;
        if (zzlwVar3 != null) {
            zzlwVar3.zzo(zzlwVar);
        } else {
            this.zzi = zzlwVar;
            this.zzj = zzlwVar;
            this.zzk = zzlwVar;
        }
        this.zzo = null;
        this.zzl = zzlwVar;
        this.zzn++;
        zzB();
        return zzlwVar;
    }

    public final int zzs(zzlw zzlwVar) {
        zzlwVar.getClass();
        int i = 0;
        if (zzlwVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlwVar;
        while (zzlwVar.zzp() != null) {
            zzlwVar = zzlwVar.zzp();
            zzlwVar.getClass();
            if (zzlwVar == this.zzj) {
                zzlw zzlwVar2 = this.zzi;
                this.zzj = zzlwVar2;
                this.zzk = zzlwVar2;
                i = 3;
            }
            if (zzlwVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzlwVar.zzn();
            this.zzn--;
        }
        zzlw zzlwVar3 = this.zzl;
        zzlwVar3.getClass();
        zzlwVar3.zzo(null);
        zzB();
        return i;
    }
}
