package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzlo implements Handler.Callback, zzwz, zzaay, zzmk, zzjb, zzmo, zzcc, zzadj {
    private static final long zza = zzfk.zzr(10000);
    private final boolean zzA;
    private zznc zzB;
    private boolean zzD;
    private boolean zzE;
    private zzln zzF;
    private int zzG;
    private zzmm zzH;
    private zzll zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzM;
    private boolean zzO;
    private boolean zzR;
    private int zzS;
    private zzln zzT;
    private long zzU;
    private long zzV;
    private int zzW;
    private boolean zzX;
    private zzje zzY;
    private zzjo zzaa;
    private boolean zzac;
    private final zzix zzae;
    private final zzmy[] zzb;
    private final zzmw[] zzc;
    private final boolean[] zzd;
    private final zzaaz zze;
    private final zzaba zzf;
    private final zzls zzg;
    private final zzabi zzh;
    private final zzdy zzi;
    private final zzmn zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zzjc zzo;
    private final ArrayList zzp;
    private final zzdo zzq;
    private final zzlm zzr;
    private final zzlz zzs;
    private final zzml zzt;
    private final long zzu;
    private final zzpz zzv;
    private final zzng zzw;
    private final zzdy zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzab = C.TIME_UNSET;
    private int zzP = 0;
    private boolean zzQ = false;
    private boolean zzK = false;
    private float zzad = 1.0f;
    private zznb zzC = zznb.zza;
    private long zzZ = C.TIME_UNSET;
    private long zzN = C.TIME_UNSET;

    public zzlo(Context context, zzmu[] zzmuVarArr, zzmu[] zzmuVarArr2, zzaaz zzaazVar, zzaba zzabaVar, zzls zzlsVar, zzabi zzabiVar, int i, boolean z, zzng zzngVar, zznc zzncVar, zzix zzixVar, long j, boolean z2, boolean z3, Looper looper, zzdo zzdoVar, zzlm zzlmVar, zzpz zzpzVar, zzmn zzmnVar, zzjo zzjoVar, final zzadj zzadjVar, boolean z4) {
        this.zzr = zzlmVar;
        this.zze = zzaazVar;
        this.zzf = zzabaVar;
        this.zzg = zzlsVar;
        this.zzh = zzabiVar;
        int i2 = 0;
        this.zzB = zzncVar;
        this.zzae = zzixVar;
        this.zzu = j;
        this.zzq = zzdoVar;
        this.zzv = zzpzVar;
        this.zzaa = zzjoVar;
        this.zzw = zzngVar;
        this.zzA = z4;
        this.zzn = zzlsVar.zzf(zzpzVar);
        zzlsVar.zzg(zzpzVar);
        zzbf zzbfVar = zzbf.zza;
        this.zzH = zzmm.zza(zzabaVar);
        this.zzI = new zzll(this.zzH);
        int length = zzmuVarArr.length;
        this.zzc = new zzmw[2];
        this.zzd = new boolean[2];
        zzmv zzg = zzaazVar.zzg();
        this.zzb = new zzmy[2];
        boolean z5 = false;
        while (true) {
            int length2 = zzmuVarArr.length;
            if (i2 >= 2) {
                this.zzy = z5;
                this.zzo = new zzjc(this, zzdoVar);
                this.zzp = new ArrayList();
                this.zzl = new zzbe();
                this.zzm = new zzbd();
                zzaazVar.zzs(this, zzabiVar);
                this.zzX = true;
                zzdy zzd = zzdoVar.zzd(looper, null);
                this.zzx = zzd;
                this.zzs = new zzlz(zzngVar, zzd, new zzlh(this), zzjoVar);
                this.zzt = new zzml(this, zzngVar, zzd, zzpzVar);
                zzmn zzmnVar2 = new zzmn(null);
                this.zzj = zzmnVar2;
                Looper zza2 = zzmnVar2.zza();
                this.zzk = zza2;
                zzdy zzd2 = zzdoVar.zzd(zza2, this);
                this.zzi = zzd2;
                this.zzz = new zzcd(context, zza2, this);
                zzd2.zzd(35, new zzadj() { // from class: com.google.android.gms.internal.ads.zzld
                    @Override // com.google.android.gms.internal.ads.zzadj
                    public final /* synthetic */ void zzcS(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
                        zzlo.this.zzcS(j2, j3, zzvVar, mediaFormat);
                    }
                }).zza();
                return;
            }
            zzmuVarArr[i2].zzc(i2, zzpzVar, zzdoVar);
            this.zzc[i2] = zzmuVarArr[i2].zzb();
            this.zzc[i2].zzv(zzg);
            zzmu zzmuVar = zzmuVarArr2[i2];
            if (zzmuVar != null) {
                zzmuVar.zzc(i2, zzpzVar, zzdoVar);
                z5 = true;
            }
            this.zzb[i2] = new zzmy(zzmuVarArr[i2], zzmuVarArr2[i2], i2);
            i2++;
        }
    }

    private final void zzA(IOException iOException, int i) {
        zzlz zzlzVar = this.zzs;
        zzje zza2 = zzje.zza(iOException, i);
        zzlw zzm = zzlzVar.zzm();
        if (zzm != null) {
            zza2 = zza2.zzd(zzm.zzg.zza);
        }
        zzef.zzf("ExoPlayerImplInternal", "Playback error", zza2);
        zzW(false, false);
        this.zzH = this.zzH.zzf(zza2);
    }

    private final void zzB(int i) {
        zzmm zzmmVar = this.zzH;
        if (zzmmVar.zze != i) {
            if (i != 2) {
                this.zzZ = C.TIME_UNSET;
            }
            if (i != 3) {
                boolean z = zzmmVar.zzp;
            }
            this.zzH = this.zzH.zze(i);
        }
    }

    private final void zzC() {
        this.zzI.zzb(this.zzH);
        if (this.zzI.zzd()) {
            this.zzr.zza(this.zzI);
            this.zzI = new zzll(this.zzH);
        }
    }

    private final void zzD(float f) throws zzje {
        this.zzad = f;
        float zza2 = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmyVarArr[i].zzL(zza2);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws zzje {
        this.zzI.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws zzje {
        zzmm zzmmVar = this.zzH;
        zzG(zzmmVar.zzl, zzmmVar.zzn, zzmmVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws zzje {
        zzH(z, this.zzz.zzc(z, this.zzH.zze), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzH(boolean z, int i, int i2, int i3) throws zzje {
        boolean z2;
        zzmm zzmmVar;
        zzlw zzm;
        if (z) {
            if (i != -1) {
                z2 = true;
                if (i != -1) {
                    i3 = 2;
                } else if (i3 == 2) {
                    i3 = 1;
                }
                boolean z3 = this.zzD;
                if (i != 0) {
                    i2 = 1;
                } else if (i2 == 1) {
                    i2 = z3 ? 4 : 0;
                }
                zzmmVar = this.zzH;
                if (zzmmVar.zzl != z2 && zzmmVar.zzn == i2 && zzmmVar.zzm == i3) {
                    return;
                }
                this.zzH = zzmmVar.zzi(z2, i3, i2);
                zzaD(false, false);
                zzlz zzlzVar = this.zzs;
                for (zzm = zzlzVar.zzm(); zzm != null; zzm = zzm.zzp()) {
                    for (zzaas zzaasVar : zzm.zzr().zzc) {
                    }
                }
                if (zzay()) {
                    zzK();
                    zzL();
                    boolean z4 = this.zzH.zzp;
                    zzlzVar.zzf(this.zzU);
                    return;
                }
                int i4 = this.zzH.zze;
                if (i4 == 3) {
                    this.zzo.zza();
                    zzJ();
                    this.zzi.zzh(2);
                    return;
                } else {
                    if (i4 == 2) {
                        this.zzi.zzh(2);
                        return;
                    }
                    return;
                }
            }
            i = -1;
        }
        z2 = false;
        if (i != -1) {
        }
        boolean z32 = this.zzD;
        if (i != 0) {
        }
        zzmmVar = this.zzH;
        if (zzmmVar.zzl != z2) {
        }
        this.zzH = zzmmVar.zzi(z2, i3, i2);
        zzaD(false, false);
        zzlz zzlzVar2 = this.zzs;
        while (zzm != null) {
        }
        if (zzay()) {
        }
    }

    private final void zzI(boolean z) throws zzje {
        zzxc zzxcVar = this.zzs.zzm().zzg.zza;
        long zzT = zzT(zzxcVar, this.zzH.zzs, true, false);
        if (zzT != this.zzH.zzs) {
            zzmm zzmmVar = this.zzH;
            this.zzH = zzap(zzxcVar, zzT, zzmmVar.zzc, zzmmVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws zzje {
        zzlw zzm = this.zzs.zzm();
        if (zzm == null) {
            return;
        }
        zzaba zzr = zzm.zzr();
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzr.zza(i)) {
                zzmyVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zzje {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmyVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() throws zzje {
        zzlk zzlkVar;
        zzlz zzlzVar = this.zzs;
        zzlw zzm = zzlzVar.zzm();
        if (zzm == null) {
            return;
        }
        long zzh = zzm.zze ? zzm.zza.zzh() : -9223372036854775807L;
        if (zzh != C.TIME_UNSET) {
            if (!zzm.zzd()) {
                zzlzVar.zzs(zzm);
                zzat(false);
                zzan();
            }
            zzU(zzh, true);
            if (zzh != this.zzH.zzs) {
                zzmm zzmmVar = this.zzH;
                long j = zzh;
                this.zzH = zzap(zzmmVar.zzb, j, zzmmVar.zzc, j, true, 5);
            }
        } else {
            zzjc zzjcVar = this.zzo;
            long zzf = zzjcVar.zzf(zzm != zzlzVar.zzn());
            this.zzU = zzf;
            long zza2 = zzf - zzm.zza();
            long j2 = this.zzH.zzs;
            ArrayList arrayList = this.zzp;
            if (!arrayList.isEmpty() && !this.zzH.zzb.zzb()) {
                if (this.zzX) {
                    j2--;
                    this.zzX = false;
                }
                zzmm zzmmVar2 = this.zzH;
                int zze = zzmmVar2.zza.zze(zzmmVar2.zzb.zza);
                int min = Math.min(this.zzW, arrayList.size());
                if (min > 0) {
                    zzlkVar = (zzlk) arrayList.get(min - 1);
                    while (zzlkVar != null && (zze < 0 || (zze == 0 && j2 < 0))) {
                        int i = min - 1;
                        if (i > 0) {
                            zzlkVar = (zzlk) arrayList.get(min - 2);
                            min = i;
                        } else {
                            min = i;
                        }
                    }
                    if (min < arrayList.size()) {
                    }
                    this.zzW = min;
                }
                zzlkVar = null;
            }
            if (zzjcVar.zzh()) {
                boolean z = !this.zzI.zzc;
                zzmm zzmmVar3 = this.zzH;
                this.zzH = zzap(zzmmVar3.zzb, zza2, zzmmVar3.zzc, zza2, z, 6);
            } else {
                zzmm zzmmVar4 = this.zzH;
                zzmmVar4.zzs = zza2;
                zzmmVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzH.zzq = zzlzVar.zzk().zzf();
        this.zzH.zzr = zzau();
        zzmm zzmmVar5 = this.zzH;
        if (zzmmVar5.zzl && zzmmVar5.zze == 3 && zzP(zzmmVar5.zza, zzmmVar5.zzb)) {
            zzmm zzmmVar6 = this.zzH;
            if (zzmmVar6.zzo.zzb == 1.0f) {
                float zzd = this.zzae.zzd(zzO(zzmmVar6.zza, zzmmVar6.zzb.zza, zzmmVar6.zzs), this.zzH.zzr);
                zzjc zzjcVar2 = this.zzo;
                if (zzjcVar2.zzj().zzb != zzd) {
                    zzM(new zzav(zzd, this.zzH.zzo.zzc));
                    zzam(this.zzH.zzo, zzjcVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlo.this.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == C.TIME_UNSET || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return C.TIME_UNSET;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfk.zza;
        return zzfk.zzs((j2 == C.TIME_UNSET ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzxc zzxcVar) {
        if (!zzxcVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzxcVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != C.TIME_UNSET) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            r2 = this.zzH.zze != 3 ? zza : 1000L;
            zzmy[] zzmyVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                r2 = Math.min(r2, zzfk.zzr(zzmyVarArr[i].zzk(this.zzU, this.zzV)));
            }
            if (this.zzH.zzj()) {
                zzlz zzlzVar = this.zzs;
                if ((zzlzVar.zzm() != null ? zzlzVar.zzm().zzp() : null) != null) {
                    if (this.zzU + (zzfk.zzs(r2) * this.zzH.zzo.zzb) >= r0.zzc()) {
                        r2 = Math.min(r2, zza);
                    }
                }
            }
        } else if (this.zzH.zze != 3 || zzay()) {
            r2 = zza;
        }
        this.zzi.zzj(2, j + r2);
    }

    private final void zzR(zzln zzlnVar) throws zzje {
        long longValue;
        long j;
        zzxc zzy;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzmm zzmmVar;
        int i;
        if (this.zzE) {
            if (this.zzF != null) {
                this.zzG++;
                this.zzI.zza(1);
            }
            this.zzF = zzlnVar;
            return;
        }
        this.zzI.zza(1);
        zzbf zzbfVar = this.zzH.zza;
        int i2 = this.zzP;
        boolean z3 = this.zzQ;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair zzaE = zzaE(zzbfVar, zzlnVar, true, i2, z3, zzbeVar, zzbdVar);
        long j7 = C.TIME_UNSET;
        if (zzaE == null) {
            Pair zzY = zzY(this.zzH.zza);
            zzxc zzxcVar = (zzxc) zzY.first;
            longValue = ((Long) zzY.second).longValue();
            z = !this.zzH.zza.zzg();
            zzy = zzxcVar;
            j = -9223372036854775807L;
        } else {
            Object obj = zzaE.first;
            longValue = ((Long) zzaE.second).longValue();
            long j8 = zzlnVar.zzc;
            if (j8 == C.TIME_UNSET) {
                j = -9223372036854775807L;
            } else {
                j = -9223372036854775807L;
                j7 = longValue;
            }
            zzy = this.zzs.zzy(this.zzH.zza, obj, longValue);
            if (zzy.zzb()) {
                this.zzH.zza.zzo(zzy.zza, zzbdVar);
                int i3 = zzy.zzb;
                if (zzbdVar.zzd(i3) == zzy.zzc) {
                    zzbdVar.zzj();
                }
                zza zza2 = zzbdVar.zzg.zza(i3);
                long j9 = zza2.zza;
                long j10 = zza2.zzi;
                j7 = Math.max(j7, 0L);
                longValue = 0;
            } else if (j8 != C.TIME_UNSET) {
                z = false;
            }
            z = true;
        }
        try {
            if (this.zzH.zza.zzg()) {
                this.zzT = zzlnVar;
            } else if (zzaE == null) {
                if (this.zzH.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzy.equals(this.zzH.zzb)) {
                    zzlw zzm = this.zzs.zzm();
                    if (zzm == null || !zzm.zze || longValue == 0) {
                        j6 = longValue;
                    } else {
                        zzxa zzxaVar = zzm.zza;
                        long j11 = zzbeVar.zzm;
                        if (this.zzD && j11 != j) {
                            Double d = this.zzC.zzc;
                        }
                        j6 = zzxaVar.zzk(longValue, this.zzB);
                    }
                    long j12 = j6;
                    if (zzfk.zzr(j6) == zzfk.zzr(this.zzH.zzs) && ((i = (zzmmVar = this.zzH).zze) == 2 || i == 3)) {
                        longValue = zzmmVar.zzs;
                    } else {
                        j3 = j12;
                    }
                } else {
                    j3 = longValue;
                }
                if (this.zzD) {
                    zzmy[] zzmyVarArr = this.zzb;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 2) {
                            break;
                        }
                        zzmy zzmyVar = zzmyVarArr[i4];
                        if (zzmyVar.zzM() && zzmyVar.zze() == 2) {
                            this.zzE = true;
                            break;
                        }
                        i4++;
                    }
                }
                long zzS = zzS(zzy, j3, this.zzH.zze == 4);
                z2 = (longValue != zzS) | z;
                try {
                    zzmm zzmmVar2 = this.zzH;
                    zzxc zzxcVar2 = zzy;
                    try {
                        zzbf zzbfVar2 = zzmmVar2.zza;
                        long j13 = j7;
                        try {
                            zzag(zzbfVar2, zzxcVar2, zzbfVar2, zzmmVar2.zzb, j13, true);
                            zzy = zzxcVar2;
                            j4 = j13;
                            j5 = zzS;
                            this.zzH = zzap(zzy, j5, j4, j5, z2, 2);
                        } catch (Throwable th) {
                            th = th;
                            zzy = zzxcVar2;
                            j7 = j13;
                            j2 = zzS;
                            this.zzH = zzap(zzy, j2, j7, j2, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzy = zzxcVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z2 = z;
            j4 = j7;
            j5 = longValue;
            this.zzH = zzap(zzy, j5, j4, j5, z2, 2);
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            j2 = longValue;
        }
    }

    private final long zzS(zzxc zzxcVar, long j, boolean z) throws zzje {
        zzlz zzlzVar = this.zzs;
        return zzT(zzxcVar, j, zzlzVar.zzm() != zzlzVar.zzn(), z);
    }

    private final long zzT(zzxc zzxcVar, long j, boolean z, boolean z2) throws zzje {
        zzK();
        boolean z3 = true;
        zzaD(false, true);
        if (z2 || this.zzH.zze == 3) {
            zzB(2);
        }
        zzlz zzlzVar = this.zzs;
        zzlw zzm = zzlzVar.zzm();
        zzlw zzlwVar = zzm;
        while (zzlwVar != null && !zzxcVar.equals(zzlwVar.zzg.zza)) {
            zzlwVar = zzlwVar.zzp();
        }
        if (z || zzm != zzlwVar || (zzlwVar != null && zzlwVar.zza() + j < 0)) {
            zzaa();
            if (zzlwVar != null) {
                while (zzlzVar.zzm() != zzlwVar) {
                    zzlzVar.zzr();
                }
                zzlzVar.zzs(zzlwVar);
                zzlwVar.zzb(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                zzaq();
                zzlwVar.zzh = true;
            }
        }
        zzab();
        if (zzlwVar != null) {
            zzlzVar.zzs(zzlwVar);
            if (!zzlwVar.zze) {
                zzlwVar.zzg = zzlwVar.zzg.zza(j, C.TIME_UNSET);
            } else if (zzlwVar.zzf) {
                if (this.zzD) {
                    boolean z4 = this.zzC.zzi;
                    if (!this.zzH.zza.zzg() && zzlwVar.zzg.zza.equals(this.zzH.zzb)) {
                        long zza2 = zzlwVar.zza() + j;
                        zzmy[] zzmyVarArr = this.zzb;
                        boolean z5 = true;
                        for (int i = 0; i < 2; i++) {
                            zzmy zzmyVar = zzmyVarArr[i];
                            if (zzmyVar.zzM()) {
                                z5 &= zzmyVar.zzF(zzlwVar, zza2);
                            }
                        }
                        if (z5) {
                            zzxa zzxaVar = zzlwVar.zza;
                            long j2 = this.zzH.zzs;
                            zznc zzncVar = zznc.zzb;
                            if (zzxaVar.zzk(j2, zzncVar) == zzxaVar.zzk(j, zzncVar)) {
                                z3 = false;
                            }
                        }
                    }
                }
                zzxa zzxaVar2 = zzlwVar.zza;
                j = zzxaVar2.zzj(j);
                zzxaVar2.zzf(j - this.zzn, false);
            }
            zzU(j, z3);
            zzan();
        } else {
            zzlzVar.zzv();
            zzU(j, true);
        }
        zzat(false);
        this.zzi.zzh(2);
        return j;
    }

    private final void zzU(long j, boolean z) throws zzje {
        zzlw zzm = this.zzs.zzm();
        long zza2 = j + (zzm == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : zzm.zza());
        this.zzU = zza2;
        this.zzo.zzc(zza2);
        zzmy[] zzmyVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmyVarArr[i].zzE(zzm, this.zzU, z);
        }
        for (zzlw zzm2 = r0.zzm(); zzm2 != null; zzm2 = zzm2.zzp()) {
            for (zzaas zzaasVar : zzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzje {
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmyVarArr[i].zzz(this.zzD ? this.zzC : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzR, false, true, false);
        this.zzI.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzH.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(boolean z, boolean z2, boolean z3, boolean z4) {
        zzxc zzxcVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzE = false;
        boolean z5 = true;
        if (this.zzF != null) {
            this.zzI.zza(1);
            this.zzF = null;
        }
        this.zzY = null;
        zzaD(false, true);
        this.zzo.zzb();
        this.zzU = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        try {
            zzaa();
        } catch (zzje | RuntimeException e) {
            zzef.zzf("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            zzmy[] zzmyVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzmyVarArr[i].zzG();
                } catch (RuntimeException e2) {
                    zzef.zzf("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzS = 0;
        zzmm zzmmVar = this.zzH;
        zzxc zzxcVar2 = zzmmVar.zzb;
        long j = zzmmVar.zzs;
        long j2 = (this.zzH.zzb.zzb() || zzaC(this.zzH, this.zzm)) ? this.zzH.zzc : this.zzH.zzs;
        if (z2) {
            this.zzT = null;
            Pair zzY = zzY(this.zzH.zza);
            zzxcVar2 = (zzxc) zzY.first;
            j = ((Long) zzY.second).longValue();
            boolean equals = zzxcVar2.equals(this.zzH.zzb);
            j2 = C.TIME_UNSET;
        }
        z5 = false;
        long j3 = j;
        long j4 = j2;
        zzlz zzlzVar = this.zzs;
        zzlzVar.zzv();
        this.zzO = false;
        zzbf zzbfVar2 = this.zzH.zza;
        if (z3 && (zzbfVar2 instanceof zzms)) {
            zzbfVar2 = ((zzms) zzbfVar2).zzx(this.zzt.zzq());
            if (zzxcVar2.zzb != -1) {
                Object obj = zzxcVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVar2.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVar2;
                    zzxcVar = new zzxc(obj, zzxcVar2.zzd);
                    zzmm zzmmVar2 = this.zzH;
                    int i2 = zzmmVar2.zze;
                    zzje zzjeVar = z4 ? null : zzmmVar2.zzf;
                    zzzf zzzfVar = !z5 ? zzzf.zza : zzmmVar2.zzh;
                    zzaba zzabaVar = !z5 ? this.zzf : this.zzH.zzi;
                    List zzi = !z5 ? zzgvz.zzi() : this.zzH.zzj;
                    zzmm zzmmVar3 = this.zzH;
                    this.zzH = new zzmm(zzbfVar, zzxcVar, j4, j3, i2, zzjeVar, false, zzzfVar, zzabaVar, zzi, zzxcVar, zzmmVar3.zzl, zzmmVar3.zzm, zzmmVar3.zzn, zzmmVar3.zzo, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    zzlzVar.zzj();
                    this.zzt.zzg();
                    return;
                }
            }
        }
        zzxcVar = zzxcVar2;
        zzbfVar = zzbfVar2;
        zzmm zzmmVar22 = this.zzH;
        int i22 = zzmmVar22.zze;
        zzje zzjeVar2 = z4 ? null : zzmmVar22.zzf;
        zzzf zzzfVar2 = !z5 ? zzzf.zza : zzmmVar22.zzh;
        zzaba zzabaVar2 = !z5 ? this.zzf : this.zzH.zzi;
        List zzi2 = !z5 ? zzgvz.zzi() : this.zzH.zzj;
        zzmm zzmmVar32 = this.zzH;
        this.zzH = new zzmm(zzbfVar, zzxcVar, j4, j3, i22, zzjeVar2, false, zzzfVar2, zzabaVar2, zzi2, zzxcVar, zzmmVar32.zzl, zzmmVar32.zzm, zzmmVar32.zzn, zzmmVar32.zzo, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmm.zzb(), 0L);
        }
        int zzk = zzbfVar.zzk(this.zzQ);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzk, C.TIME_UNSET);
        zzxc zzy = this.zzs.zzy(zzbfVar, zzm.first, 0L);
        long longValue = ((Long) zzm.second).longValue();
        if (zzy.zzb()) {
            zzbfVar.zzo(zzy.zza, zzbdVar);
            if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        zzlk zzlkVar = (zzlk) arrayList.get(size);
        Object obj = zzlkVar.zzb;
        zzmq zzmqVar = zzlkVar.zza;
        String str = zzfk.zza;
        throw null;
    }

    private final boolean zzaA() {
        if (!this.zzy) {
            return false;
        }
        zzmy[] zzmyVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzmyVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaB, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzD) {
            return false;
        }
        boolean z = this.zzC.zzg;
        return true;
    }

    private static boolean zzaC(zzmm zzmmVar, zzbd zzbdVar) {
        zzxc zzxcVar = zzmmVar.zzb;
        zzbf zzbfVar = zzmmVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxcVar.zza, zzbdVar).zzf;
    }

    private final void zzaD(boolean z, boolean z2) {
        this.zzM = z;
        long j = C.TIME_UNSET;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzN = j;
    }

    private static Pair zzaE(zzbf zzbfVar, zzln zzlnVar, boolean z, int i, boolean z2, zzbe zzbeVar, zzbd zzbdVar) {
        Pair zzm;
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzlnVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar3 = zzbfVar;
        }
        try {
            zzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzlnVar.zzb, zzlnVar.zzc);
            zzbfVar2 = zzbfVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!zzbfVar.equals(zzbfVar2)) {
            if (zzbfVar.zze(zzm.first) == -1) {
                int zzr = zzr(zzbeVar, zzbdVar, i, z2, zzm.first, zzbfVar2, zzbfVar);
                if (zzr != -1) {
                    return zzbfVar.zzm(zzbeVar, zzbdVar, zzr, C.TIME_UNSET);
                }
                return null;
            }
            if (zzbfVar2.zzo(zzm.first, zzbdVar).zzf && zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(zzm.first)) {
                return zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(zzm.first, zzbdVar).zzc, zzlnVar.zzc);
            }
        }
        return zzm;
    }

    private static final void zzaF(zzmq zzmqVar) throws zzje {
        zzmqVar.zzh();
        try {
            zzmqVar.zza().zzx(zzmqVar.zzc(), zzmqVar.zze());
        } finally {
            zzmqVar.zzi(true);
        }
    }

    private static final boolean zzaG(zzlw zzlwVar) {
        if (zzlwVar != null) {
            try {
                if (zzlwVar.zze) {
                    zzyu[] zzyuVarArr = zzlwVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzyu zzyuVar = zzyuVarArr[i];
                        if (zzyuVar != null) {
                            zzyuVar.zzc();
                        }
                    }
                } else {
                    zzlwVar.zza.zzc();
                }
                if (zzlwVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzje {
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                this.zzab = C.TIME_UNSET;
                return;
            }
            int zzd = zzmyVarArr[i].zzd();
            zzmyVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzS -= zzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaA()) {
            zzmy[] zzmyVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzmy zzmyVar = zzmyVarArr[i];
                int zzd = zzmyVar.zzd();
                zzmyVar.zzC(this.zzo);
                this.zzS -= zzd - zzmyVar.zzd();
            }
            this.zzab = C.TIME_UNSET;
        }
    }

    private final void zzac() throws zzje {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzje {
        zzlo zzloVar;
        int i;
        boolean z;
        zzjc zzjcVar = this.zzo;
        float f = zzjcVar.zzj().zzb;
        zzlz zzlzVar = this.zzs;
        zzlw zzm = zzlzVar.zzm();
        zzlw zzn = zzlzVar.zzn();
        zzaba zzabaVar = null;
        boolean z2 = true;
        while (zzm != null && zzm.zze) {
            zzmm zzmmVar = this.zzH;
            zzaba zzk = zzm.zzk(f, zzmmVar.zza, zzmmVar.zzl);
            zzaba zzabaVar2 = zzm == zzlzVar.zzm() ? zzk : zzabaVar;
            zzaba zzr = zzm.zzr();
            boolean z3 = false;
            if (zzr != null) {
                zzaas[] zzaasVarArr = zzk.zzc;
                if (zzr.zzc.length == zzaasVarArr.length) {
                    for (int i2 = 0; i2 < zzaasVarArr.length; i2++) {
                        if (zzk.zzb(zzr, i2)) {
                        }
                    }
                    if (zzm != zzn) {
                        z3 = true;
                    }
                    z2 &= z3;
                    zzm = zzm.zzp();
                    zzabaVar = zzabaVar2;
                }
            }
            if (z2) {
                zzlw zzm2 = zzlzVar.zzm();
                int zzs = zzlzVar.zzs(zzm2) & 1;
                zzmy[] zzmyVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzabaVar2.getClass();
                long zzm3 = zzm2.zzm(zzabaVar2, this.zzH.zzs, 1 == zzs, zArr);
                zzmm zzmmVar2 = this.zzH;
                if (zzmmVar2.zze == 4 || zzm3 == zzmmVar2.zzs) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                zzmm zzmmVar3 = this.zzH;
                boolean z4 = z;
                i = 2;
                zzloVar = this;
                zzloVar.zzH = zzap(zzmmVar3.zzb, zzm3, zzmmVar3.zzc, zzmmVar3.zzd, z3, 5);
                if (z3) {
                    zzloVar.zzU(zzm3, true);
                }
                zzloVar.zzab();
                boolean[] zArr2 = new boolean[2];
                for (int i3 = z4; i3 < 2; i3++) {
                    int zzd = zzmyVarArr[i3].zzd();
                    zArr2[i3] = zzmyVarArr[i3].zzM();
                    zzmyVarArr[i3].zzD(zzm2.zzc[i3], zzjcVar, zzloVar.zzU, zArr[i3]);
                    if (zzd - zzmyVarArr[i3].zzd() > 0) {
                        zzloVar.zzN(i3, z4);
                    }
                    zzloVar.zzS -= zzd - zzmyVarArr[i3].zzd();
                }
                zzloVar.zzar(zArr2, zzloVar.zzU);
                zzm2.zzh = true;
            } else {
                zzloVar = this;
                i = 2;
                zzlzVar.zzs(zzm);
                if (zzm.zze) {
                    long max = Math.max(zzm.zzg.zzb, zzloVar.zzU - zzm.zza());
                    if (zzloVar.zzy && zzloVar.zzaA() && zzlzVar.zzo() == zzm) {
                        zzloVar.zzab();
                    }
                    zzm.zzl(zzk, max, false);
                }
            }
            zzloVar.zzat(true);
            if (zzloVar.zzH.zze != 4) {
                zzloVar.zzan();
                zzloVar.zzL();
                zzloVar.zzi.zzh(i);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzlw zzm = this.zzs.zzm();
        long j = zzm.zzg.zzf;
        if (zzm.zze) {
            return j == C.TIME_UNSET || this.zzH.zzs < j || !zzay();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0218, code lost:
    
        if (r9 >= 0) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d5 A[Catch: all -> 0x03a1, TRY_ENTER, TryCatch #0 {all -> 0x03a1, blocks: (B:80:0x02d5, B:81:0x02d9, B:83:0x02df, B:19:0x02f3, B:21:0x02fc, B:23:0x0304, B:25:0x030e, B:27:0x0319, B:30:0x031e), top: B:17:0x0291 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d9 A[Catch: all -> 0x03a1, TryCatch #0 {all -> 0x03a1, blocks: (B:80:0x02d5, B:81:0x02d9, B:83:0x02df, B:19:0x02f3, B:21:0x02fc, B:23:0x0304, B:25:0x030e, B:27:0x0319, B:30:0x031e), top: B:17:0x0291 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x041b  */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [int] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf(zzbf zzbfVar, boolean z) throws zzje {
        long j;
        boolean zzaC;
        zzxc zzxcVar;
        zzbe zzbeVar;
        zzbf zzbfVar2;
        long j2;
        int i;
        long j3;
        Object obj;
        long j4;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        long j5;
        long j6;
        long j7;
        zzxc zzxcVar2;
        long j8;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3;
        Object obj2;
        long longValue;
        int i4;
        boolean z9;
        boolean z10;
        boolean z11;
        int i5;
        boolean z12;
        int i6;
        zzxc zzxcVar3;
        boolean z13;
        long j9;
        int zzw;
        zzmm zzmmVar = this.zzH;
        zzln zzlnVar = this.zzT;
        int i7 = this.zzP;
        boolean z14 = this.zzQ;
        if (zzbfVar.zzg()) {
            zzbfVar2 = zzbfVar;
            zzxcVar2 = zzmm.zzb();
            z6 = true;
            z8 = false;
            z7 = false;
            j8 = 0;
            j = C.TIME_UNSET;
            j6 = 0;
            j5 = C.TIME_UNSET;
        } else {
            zzbd zzbdVar = this.zzm;
            zzxc zzxcVar4 = zzmmVar.zzb;
            j = C.TIME_UNSET;
            Object obj3 = zzxcVar4.zza;
            zzaC = zzaC(zzmmVar, zzbdVar);
            long j10 = (zzxcVar4.zzb() || zzaC) ? zzmmVar.zzc : zzmmVar.zzs;
            zzbe zzbeVar2 = this.zzl;
            if (zzlnVar != null) {
                zzxcVar = zzxcVar4;
                zzbfVar2 = zzbfVar;
                Pair zzaE = zzaE(zzbfVar2, zzlnVar, true, i7, z14, zzbeVar2, zzbdVar);
                if (zzaE == null) {
                    i4 = zzbfVar2.zzk(z14);
                    obj2 = obj3;
                    longValue = j10;
                    z11 = true;
                    z10 = false;
                    z9 = false;
                } else {
                    if (zzlnVar.zzc == C.TIME_UNSET) {
                        i4 = zzbfVar2.zzo(zzaE.first, zzbdVar).zzc;
                        obj2 = obj3;
                        longValue = j10;
                        z9 = false;
                    } else {
                        obj2 = zzaE.first;
                        longValue = ((Long) zzaE.second).longValue();
                        i4 = -1;
                        z9 = true;
                    }
                    z10 = zzmmVar.zze == 4;
                    z11 = false;
                }
                int i8 = i4;
                obj = obj2;
                zzbeVar = zzbeVar2;
                j3 = longValue;
                i = i8;
                boolean z15 = z9;
                z2 = z11;
                z5 = z10;
                z3 = z15;
                j2 = j10;
            } else {
                zzxcVar = zzxcVar4;
                zzbeVar = zzbeVar2;
                zzbfVar2 = zzbfVar;
                zzbf zzbfVar3 = zzmmVar.zza;
                if (zzbfVar3.zzg()) {
                    i2 = zzbfVar2.zzk(z14);
                } else if (zzbfVar2.zze(obj3) == -1) {
                    int zzr = zzr(zzbeVar, zzbdVar, i7, z14, obj3, zzbfVar3, zzbfVar2);
                    zzbeVar = zzbeVar;
                    zzbfVar2 = zzbfVar2;
                    zzbdVar = zzbdVar;
                    obj3 = obj3;
                    if (zzr == -1) {
                        zzr = zzbfVar2.zzk(z14);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i = zzr;
                    z2 = z4;
                    obj = obj3;
                    j3 = j10;
                    j2 = j3;
                    z3 = false;
                    z5 = false;
                } else if (j10 == C.TIME_UNSET) {
                    i2 = zzbfVar2.zzo(obj3, zzbdVar).zzc;
                } else if (zzaC) {
                    zzbfVar3.zzo(obj3, zzbdVar);
                    if (zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(obj3)) {
                        Pair zzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzbfVar2.zzo(obj3, zzbdVar).zzc, j10);
                        j2 = j10;
                        obj = zzm.first;
                        j4 = ((Long) zzm.second).longValue();
                    } else {
                        j2 = j10;
                        if (zzbfVar2.zzo(obj3, zzbdVar).zzd != C.TIME_UNSET) {
                            long j11 = zzbdVar.zzd - 1;
                            String str = zzfk.zza;
                            j4 = Math.max(0L, Math.min(j2, j11));
                        } else {
                            j4 = j2;
                        }
                        obj = obj3;
                    }
                    i = -1;
                    j3 = j4;
                    z2 = false;
                    z3 = true;
                    z5 = false;
                } else {
                    j2 = j10;
                    i = -1;
                    j3 = j2;
                    obj = obj3;
                    z2 = false;
                    z3 = false;
                    z5 = false;
                }
                i = i2;
                obj = obj3;
                j3 = j10;
                j2 = j3;
                z2 = false;
                z3 = false;
                z5 = false;
            }
            if (i != -1) {
                Pair zzm2 = zzbfVar2.zzm(zzbeVar, zzbdVar, i, C.TIME_UNSET);
                obj = zzm2.first;
                j3 = ((Long) zzm2.second).longValue();
                j5 = -9223372036854775807L;
            } else {
                j5 = j3;
            }
            zzxc zzy = this.zzs.zzy(zzbfVar2, obj, j3);
            int i9 = zzy.zze;
            boolean z16 = i9 == -1 || ((i3 = zzxcVar.zze) != -1 && i9 >= i3);
            boolean equals = obj3.equals(obj);
            boolean z17 = equals && !zzxcVar.zzb() && !zzy.zzb() && z16;
            zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
            if (!zzaC && j2 == j5 && obj3.equals(zzy.zza)) {
                if (zzxcVar.zzb()) {
                    zzo.zzk(zzxcVar.zzb);
                }
                if (zzy.zzb()) {
                    zzo.zzk(zzy.zzb);
                }
            }
            if (true == z17) {
                zzy = zzxcVar;
            }
            if (zzy.zzb()) {
                if (zzy.equals(zzxcVar)) {
                    j7 = zzmmVar.zzs;
                } else {
                    zzbfVar2.zzo(zzy.zza, zzbdVar);
                    if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                        zzbdVar.zzj();
                    }
                    j7 = 0;
                }
                j6 = 0;
            } else {
                if (equals && zzxcVar.zzb()) {
                    zza zza2 = zzbfVar2.zzo(obj, zzbdVar).zzg.zza(zzxcVar.zzb);
                    long j12 = zza2.zzi;
                    long j13 = zzmmVar.zzc;
                    if (j13 != C.TIME_UNSET) {
                        long j14 = zza2.zza;
                        j6 = 0;
                    } else {
                        j6 = 0;
                    }
                    int i10 = zza2.zzb;
                    int i11 = zzxcVar.zzc;
                    if (i10 > i11 && zza2.zze[i11] == 2) {
                        long j15 = zzbfVar2.zzo(obj, zzbdVar).zzd;
                        if (j15 != C.TIME_UNSET) {
                            j3 = Math.min(j15 - 1, j3);
                        }
                        j5 = j3;
                        j7 = j5;
                    }
                } else {
                    j6 = 0;
                }
                j7 = j3;
            }
            zzxcVar2 = zzy;
            j8 = j7;
            z6 = z2;
            z7 = z3;
            z8 = z5;
        }
        boolean z18 = (this.zzH.zzb.equals(zzxcVar2) && j8 == this.zzH.zzs) ? false : true;
        if (z6) {
            try {
                if (this.zzH.zze != 1) {
                    i5 = 4;
                    try {
                        zzB(4);
                    } catch (Throwable th) {
                        th = th;
                        i6 = 4;
                        zzxcVar3 = zzxcVar2;
                        zzaC = false;
                        zzmm zzmmVar2 = this.zzH;
                        zzbf zzbfVar4 = zzmmVar2.zza;
                        zzxc zzxcVar5 = zzmmVar2.zzb;
                        zzxc zzxcVar6 = zzxcVar3;
                        zzag(zzbfVar, zzxcVar6, zzbfVar4, zzxcVar5, true != z7 ? j : j8, false);
                        if (!z18) {
                        }
                        zzmm zzmmVar3 = this.zzH;
                        Object obj4 = zzmmVar3.zzb.zza;
                        zzbf zzbfVar5 = zzmmVar3.zza;
                        if (z18) {
                        }
                        this.zzH = zzap(zzxcVar6, j8, j5, r9 ? j8 : this.zzH.zzd, r9, zzbfVar.zze(obj4) == -1 ? i6 : 3);
                        zzak();
                        zzZ(zzbfVar, this.zzH.zza);
                        this.zzH = this.zzH.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                        }
                        zzat(zzaC);
                        this.zzi.zzh(2);
                        throw th;
                    }
                } else {
                    i5 = 4;
                }
                z12 = false;
                try {
                    zzX(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i6 = i5;
                    zzaC = z12;
                    zzxcVar3 = zzxcVar2;
                    zzmm zzmmVar22 = this.zzH;
                    zzbf zzbfVar42 = zzmmVar22.zza;
                    zzxc zzxcVar52 = zzmmVar22.zzb;
                    zzxc zzxcVar62 = zzxcVar3;
                    zzag(zzbfVar, zzxcVar62, zzbfVar42, zzxcVar52, true != z7 ? j : j8, false);
                    if (!z18) {
                    }
                    zzmm zzmmVar32 = this.zzH;
                    Object obj42 = zzmmVar32.zzb.zza;
                    zzbf zzbfVar52 = zzmmVar32.zza;
                    if (z18) {
                    }
                    this.zzH = zzap(zzxcVar62, j8, j5, r9 ? j8 : this.zzH.zzd, r9, zzbfVar.zze(obj42) == -1 ? i6 : 3);
                    zzak();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzat(zzaC);
                    this.zzi.zzh(2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i5 = 4;
                z12 = false;
                i6 = i5;
                zzaC = z12;
                zzxcVar3 = zzxcVar2;
                zzmm zzmmVar222 = this.zzH;
                zzbf zzbfVar422 = zzmmVar222.zza;
                zzxc zzxcVar522 = zzmmVar222.zzb;
                zzxc zzxcVar622 = zzxcVar3;
                zzag(zzbfVar, zzxcVar622, zzbfVar422, zzxcVar522, true != z7 ? j : j8, false);
                if (!z18) {
                }
                zzmm zzmmVar322 = this.zzH;
                Object obj422 = zzmmVar322.zzb.zza;
                zzbf zzbfVar522 = zzmmVar322.zza;
                if (z18) {
                }
                this.zzH = zzap(zzxcVar622, j8, j5, r9 ? j8 : this.zzH.zzd, r9, zzbfVar.zze(obj422) == -1 ? i6 : 3);
                zzak();
                zzZ(zzbfVar, this.zzH.zza);
                this.zzH = this.zzH.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                }
                zzat(zzaC);
                this.zzi.zzh(2);
                throw th;
            }
        } else {
            i5 = 4;
            z12 = false;
        }
        zzmy[] zzmyVarArr = this.zzb;
        for (?? r6 = z12; r6 < 2; r6++) {
            zzmyVarArr[r6].zzn(zzbfVar2);
        }
        try {
            if (z18) {
                i6 = i5;
                zzaC = z12;
                if (!zzbfVar2.zzg()) {
                    zzlz zzlzVar = this.zzs;
                    for (zzlw zzm3 = zzlzVar.zzm(); zzm3 != null; zzm3 = zzm3.zzp()) {
                        if (zzm3.zzg.zza.equals(zzxcVar2)) {
                            zzm3.zzg = zzlzVar.zzx(zzbfVar2, zzm3.zzg);
                            zzm3.zzs();
                        }
                    }
                    j8 = zzS(zzxcVar2, j8, z8);
                }
            } else {
                try {
                    zzlz zzlzVar2 = this.zzs;
                    long zzah = zzlzVar2.zzn() == null ? j6 : zzah(zzlzVar2.zzn());
                    try {
                        try {
                            if (zzaA() && zzlzVar2.zzo() != null) {
                                j9 = zzah(zzlzVar2.zzo());
                                i6 = i5;
                                z13 = z12;
                                zzaC = z13;
                                zzw = zzlzVar2.zzw(zzbfVar, this.zzU, zzah, j9);
                                zzbfVar2 = zzbfVar;
                                if ((zzw & 1) == 0) {
                                    zzI(zzaC);
                                } else if ((zzw & 2) != 0) {
                                    zzab();
                                }
                            }
                            zzw = zzlzVar2.zzw(zzbfVar, this.zzU, zzah, j9);
                            zzbfVar2 = zzbfVar;
                            if ((zzw & 1) == 0) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zzxcVar3 = zzxcVar2;
                            zzmm zzmmVar2222 = this.zzH;
                            zzbf zzbfVar4222 = zzmmVar2222.zza;
                            zzxc zzxcVar5222 = zzmmVar2222.zzb;
                            zzxc zzxcVar6222 = zzxcVar3;
                            zzag(zzbfVar, zzxcVar6222, zzbfVar4222, zzxcVar5222, true != z7 ? j : j8, false);
                            if (!z18 || j5 != this.zzH.zzc) {
                                zzmm zzmmVar3222 = this.zzH;
                                Object obj4222 = zzmmVar3222.zzb.zza;
                                zzbf zzbfVar5222 = zzmmVar3222.zza;
                                boolean z19 = (z18 || !z || zzbfVar5222.zzg() || zzbfVar5222.zzo(obj4222, this.zzm).zzf) ? zzaC : true;
                                this.zzH = zzap(zzxcVar6222, j8, j5, z19 ? j8 : this.zzH.zzd, z19, zzbfVar.zze(obj4222) == -1 ? i6 : 3);
                            }
                            zzak();
                            zzZ(zzbfVar, this.zzH.zza);
                            this.zzH = this.zzH.zzd(zzbfVar);
                            if (!zzbfVar.zzg()) {
                                this.zzT = null;
                            }
                            zzat(zzaC);
                            this.zzi.zzh(2);
                            throw th;
                        }
                        zzaC = z13;
                    } catch (Throwable th5) {
                        th = th5;
                        zzaC = z13;
                    }
                    i6 = i5;
                    z13 = z12;
                    j9 = j6;
                } catch (Throwable th6) {
                    th = th6;
                    i6 = i5;
                    zzaC = z12;
                    zzxcVar3 = zzxcVar2;
                    zzmm zzmmVar22222 = this.zzH;
                    zzbf zzbfVar42222 = zzmmVar22222.zza;
                    zzxc zzxcVar52222 = zzmmVar22222.zzb;
                    zzxc zzxcVar62222 = zzxcVar3;
                    zzag(zzbfVar, zzxcVar62222, zzbfVar42222, zzxcVar52222, true != z7 ? j : j8, false);
                    if (!z18) {
                    }
                    zzmm zzmmVar32222 = this.zzH;
                    Object obj42222 = zzmmVar32222.zzb.zza;
                    zzbf zzbfVar52222 = zzmmVar32222.zza;
                    if (z18) {
                    }
                    this.zzH = zzap(zzxcVar62222, j8, j5, z19 ? j8 : this.zzH.zzd, z19, zzbfVar.zze(obj42222) == -1 ? i6 : 3);
                    zzak();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzat(zzaC);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            zzmm zzmmVar4 = this.zzH;
            zzxc zzxcVar7 = zzxcVar2;
            zzag(zzbfVar2, zzxcVar7, zzmmVar4.zza, zzmmVar4.zzb, true != z7 ? j : j8, false);
            zzbf zzbfVar6 = zzbfVar2;
            if (z18 || j5 != this.zzH.zzc) {
                zzmm zzmmVar5 = this.zzH;
                Object obj5 = zzmmVar5.zzb.zza;
                zzbf zzbfVar7 = zzmmVar5.zza;
                boolean z20 = (!z18 || !z || zzbfVar7.zzg() || zzbfVar7.zzo(obj5, this.zzm).zzf) ? zzaC : true;
                this.zzH = zzap(zzxcVar7, j8, j5, z20 ? j8 : this.zzH.zzd, z20, zzbfVar6.zze(obj5) == -1 ? i6 : 3);
            }
            zzak();
            zzZ(zzbfVar6, this.zzH.zza);
            this.zzH = this.zzH.zzd(zzbfVar6);
            if (!zzbfVar6.zzg()) {
                this.zzT = null;
            }
            zzat(zzaC);
            this.zzi.zzh(2);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private final void zzag(zzbf zzbfVar, zzxc zzxcVar, zzbf zzbfVar2, zzxc zzxcVar2, long j, boolean z) throws zzje {
        if (!zzP(zzbfVar, zzxcVar)) {
            zzav zzavVar = zzxcVar.zzb() ? zzav.zza : this.zzH.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzam(this.zzH.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzxcVar.zza;
        zzbd zzbdVar = this.zzm;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        zzix zzixVar = this.zzae;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfk.zza;
        zzixVar.zza(zzafVar);
        if (j != C.TIME_UNSET) {
            zzixVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxcVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzixVar.zzb(C.TIME_UNSET);
        }
    }

    private final long zzah(zzlw zzlwVar) {
        if (zzlwVar == null) {
            return 0L;
        }
        long zza2 = zzlwVar.zza();
        if (zzlwVar.zze) {
            int i = 0;
            while (true) {
                zzmy[] zzmyVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzmyVarArr[i].zzp(zzlwVar)) {
                    long zzf = zzmyVarArr[i].zzf(zzlwVar);
                    if (zzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zza2 = Math.max(zzf, zza2);
                }
                i++;
            }
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0355 A[LOOP:4: B:120:0x0353->B:121:0x0355, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027c A[LOOP:1: B:73:0x0278->B:75:0x027c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029c A[EDGE_INSN: B:76:0x029c->B:77:0x029c BREAK  A[LOOP:1: B:73:0x0278->B:75:0x027c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzai() throws zzje {
        int i;
        boolean z;
        zzlw zzn;
        boolean z2;
        zzlw zzm;
        zzlw zzp;
        zzlw zzr;
        boolean z3;
        int i2;
        int i3;
        zzlw zzn2;
        zzaba zzr2;
        int i4;
        int i5;
        zzmy[] zzmyVarArr;
        zzlw zzo;
        zzlx zzh;
        if (this.zzH.zza.zzg() || !this.zzt.zzb()) {
            return;
        }
        zzlz zzlzVar = this.zzs;
        zzlzVar.zzf(this.zzU);
        if (zzlzVar.zzg() && (zzh = zzlzVar.zzh(this.zzU, this.zzH)) != null) {
            zzlw zzi = zzlzVar.zzi(zzh);
            if (!zzi.zzd) {
                zzi.zzt(this, zzh.zzb);
            } else if (zzi.zze) {
                this.zzi.zzd(8, zzi.zza).zza();
            }
            if (zzlzVar.zzm() == zzi) {
                zzU(zzh.zzb, true);
            }
            zzat(false);
        }
        if (this.zzO) {
            this.zzO = zzaG(zzlzVar.zzk());
            zzao();
        } else {
            zzan();
        }
        if (!this.zzL && this.zzy && !this.zzac && !zzaA() && (zzo = zzlzVar.zzo()) != null && zzo == zzlzVar.zzn() && zzo.zzp() != null && zzo.zzp().zze && zzaw(zzo.zzp()) <= 10000000) {
            zzlzVar.zzq();
            zzlw zzo2 = zzlzVar.zzo();
            if (zzo2 != null) {
                zzaba zzr3 = zzo2.zzr();
                int i6 = 0;
                while (true) {
                    zzmy[] zzmyVarArr2 = this.zzb;
                    if (i6 >= 2) {
                        break;
                    }
                    if (zzr3.zza(i6) && zzmyVarArr2[i6].zza() && !zzmyVarArr2[i6].zzc()) {
                        zzmyVarArr2[i6].zzb();
                        zzas(zzo2, i6, false, zzo2.zzc());
                    }
                    i6++;
                }
                if (zzaA()) {
                    this.zzab = zzo2.zza.zzh();
                    if (!zzo2.zzd()) {
                        zzlzVar.zzs(zzo2);
                        zzat(false);
                        zzan();
                    }
                }
            }
        }
        zzlw zzn3 = zzlzVar.zzn();
        if (zzn3 != null) {
            if (zzn3.zzp() == null || this.zzL) {
                i = 1;
                if (zzn3.zzg.zzk || this.zzL) {
                    zzmy[] zzmyVarArr3 = this.zzb;
                    for (int i7 = 0; i7 < 2; i7++) {
                        zzmy zzmyVar = zzmyVarArr3[i7];
                        if (zzmyVar.zzp(zzn3) && zzmyVar.zzg(zzn3)) {
                            long j = zzn3.zzg.zzf;
                            zzmyVar.zzh(zzn3, (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? -9223372036854775807L : zzn3.zza() + j);
                        }
                    }
                }
            } else {
                zzlw zzn4 = zzlzVar.zzn();
                if (zzn4.zze) {
                    int i8 = 0;
                    while (true) {
                        zzmy[] zzmyVarArr4 = this.zzb;
                        if (i8 < 2) {
                            if (!zzmyVarArr4[i8].zzr(zzn4)) {
                                break;
                            } else {
                                i8++;
                            }
                        } else if ((!zzaA() || zzlzVar.zzo() != zzlzVar.zzn()) && ((zzn3.zzp().zze || this.zzU >= zzn3.zzp().zzc()) && (!zzn3.zzp().zze || zzaw(zzn3.zzp()) <= 10000000))) {
                            zzaba zzr4 = zzn3.zzr();
                            zzlw zzp2 = zzlzVar.zzp();
                            zzaba zzr5 = zzp2.zzr();
                            zzbf zzbfVar = this.zzH.zza;
                            i = 1;
                            zzag(zzbfVar, zzp2.zzg.zza, zzbfVar, zzn3.zzg.zza, C.TIME_UNSET, false);
                            if (zzp2.zze && (((z = this.zzy) && this.zzab != C.TIME_UNSET) || zzp2.zza.zzh() != C.TIME_UNSET)) {
                                this.zzab = C.TIME_UNSET;
                                if (z && !this.zzac) {
                                    for (int i9 = 0; i9 < 2; i9++) {
                                        if (zzr5.zza(i9)) {
                                            zzmyVarArr4[i9].zze();
                                            zzaas[] zzaasVarArr = zzr5.zzc;
                                            if (!zzas.zzd(zzaasVarArr[i9].zzc().zzp, zzaasVarArr[i9].zzc().zzk) && !zzmyVarArr4[i9].zzc()) {
                                            }
                                        }
                                    }
                                }
                                long zzc = zzp2.zzc();
                                for (int i10 = 0; i10 < 2; i10++) {
                                    zzmyVarArr4[i10].zzj(zzc);
                                }
                                if (!zzp2.zzd()) {
                                    zzlzVar.zzs(zzp2);
                                    zzat(false);
                                    zzan();
                                }
                            }
                            for (int i11 = 0; i11 < 2; i11++) {
                                zzmyVarArr4[i11].zzi(zzr4, zzr5, zzp2.zzc());
                            }
                        }
                    }
                }
            }
            zzn = zzlzVar.zzn();
            if (zzn != null && zzlzVar.zzm() != zzn && !zzn.zzh) {
                zzn2 = zzlzVar.zzn();
                zzr2 = zzn2.zzr();
                i4 = i;
                i5 = 0;
                while (true) {
                    zzmyVarArr = this.zzb;
                    if (i5 < 2) {
                        break;
                    }
                    int zzd = zzmyVarArr[i5].zzd();
                    int zzH = zzmyVarArr[i5].zzH(zzn2, zzr2, this.zzo);
                    this.zzS -= zzd - zzmyVarArr[i5].zzd();
                    i4 &= zzH & 1;
                    i5++;
                }
                if (i4 != 0) {
                    for (int i12 = 0; i12 < 2; i12++) {
                        if (zzr2.zza(i12) && !zzmyVarArr[i12].zzp(zzn2)) {
                            zzas(zzn2, i12, false, zzn2.zzc());
                        }
                    }
                    zzlzVar.zzn().zzh = i;
                }
            }
            z2 = false;
            while (zzay() && !this.zzL && (zzm = zzlzVar.zzm()) != null && (zzp = zzm.zzp()) != null && this.zzU >= zzp.zzc() && zzp.zzh) {
                if (z2) {
                    zzC();
                }
                this.zzac = false;
                zzr = zzlzVar.zzr();
                zzr.getClass();
                if (this.zzH.zzb.zza.equals(zzr.zzg.zza.zza)) {
                    zzxc zzxcVar = this.zzH.zzb;
                    if (zzxcVar.zzb == -1) {
                        zzxc zzxcVar2 = zzr.zzg.zza;
                        if (zzxcVar2.zzb == -1 && zzxcVar.zze != zzxcVar2.zze) {
                            z3 = true;
                            zzlx zzlxVar = zzr.zzg;
                            boolean z4 = z3;
                            zzxc zzxcVar3 = zzlxVar.zza;
                            long j2 = zzlxVar.zzb;
                            this.zzH = zzap(zzxcVar3, j2, zzlxVar.zzd, j2, !z4, 0);
                            zzak();
                            zzL();
                            if (zzaA() && zzr == zzlzVar.zzo()) {
                                zzmy[] zzmyVarArr5 = this.zzb;
                                for (i3 = 0; i3 < 2; i3++) {
                                    zzmyVarArr5[i3].zzB();
                                }
                            }
                            if (this.zzH.zze == 3) {
                                zzJ();
                            }
                            zzaba zzr6 = zzlzVar.zzm().zzr();
                            i2 = 0;
                            while (true) {
                                zzmy[] zzmyVarArr6 = this.zzb;
                                if (i2 < 2) {
                                    if (zzr6.zza(i2)) {
                                        zzmyVarArr6[i2].zzl();
                                    }
                                    i2++;
                                }
                            }
                            z2 = true;
                        }
                    }
                }
                z3 = false;
                zzlx zzlxVar2 = zzr.zzg;
                boolean z42 = z3;
                zzxc zzxcVar32 = zzlxVar2.zza;
                long j22 = zzlxVar2.zzb;
                this.zzH = zzap(zzxcVar32, j22, zzlxVar2.zzd, j22, !z42, 0);
                zzak();
                zzL();
                if (zzaA()) {
                    zzmy[] zzmyVarArr52 = this.zzb;
                    while (i3 < 2) {
                    }
                }
                if (this.zzH.zze == 3) {
                }
                zzaba zzr62 = zzlzVar.zzm().zzr();
                i2 = 0;
                while (true) {
                    zzmy[] zzmyVarArr62 = this.zzb;
                    if (i2 < 2) {
                        break;
                    }
                    i2++;
                }
                z2 = true;
            }
            long j3 = this.zzaa.zzb;
        }
        i = 1;
        zzn = zzlzVar.zzn();
        if (zzn != null) {
            zzn2 = zzlzVar.zzn();
            zzr2 = zzn2.zzr();
            i4 = i;
            i5 = 0;
            while (true) {
                zzmyVarArr = this.zzb;
                if (i5 < 2) {
                }
                int zzd2 = zzmyVarArr[i5].zzd();
                int zzH2 = zzmyVarArr[i5].zzH(zzn2, zzr2, this.zzo);
                this.zzS -= zzd2 - zzmyVarArr[i5].zzd();
                i4 &= zzH2 & 1;
                i5++;
            }
            if (i4 != 0) {
            }
        }
        z2 = false;
        while (zzay()) {
            if (z2) {
            }
            this.zzac = false;
            zzr = zzlzVar.zzr();
            zzr.getClass();
            if (this.zzH.zzb.zza.equals(zzr.zzg.zza.zza)) {
            }
            z3 = false;
            zzlx zzlxVar22 = zzr.zzg;
            boolean z422 = z3;
            zzxc zzxcVar322 = zzlxVar22.zza;
            long j222 = zzlxVar22.zzb;
            this.zzH = zzap(zzxcVar322, j222, zzlxVar22.zzd, j222, !z422, 0);
            zzak();
            zzL();
            if (zzaA()) {
            }
            if (this.zzH.zze == 3) {
            }
            zzaba zzr622 = zzlzVar.zzm().zzr();
            i2 = 0;
            while (true) {
                zzmy[] zzmyVarArr622 = this.zzb;
                if (i2 < 2) {
                }
                i2++;
            }
            z2 = true;
        }
        long j32 = this.zzaa.zzb;
    }

    private final void zzaj() {
        zzlz zzlzVar = this.zzs;
        zzlzVar.zzt();
        zzlw zzl = zzlzVar.zzl();
        if (zzl != null) {
            if (!zzl.zzd || zzl.zze) {
                zzxa zzxaVar = zzl.zza;
                if (zzxaVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzH.zza, zzl.zzg.zza, zzl.zze ? zzxaVar.zzi() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzt(this, zzl.zzg.zzb);
                        return;
                    }
                    zzlt zzltVar = new zzlt();
                    zzltVar.zza(this.zzU - zzl.zza());
                    zzltVar.zzb(this.zzo.zzj().zzb);
                    zzltVar.zzc(this.zzN);
                    zzl.zzj(new zzlu(zzltVar, null));
                }
            }
        }
    }

    private final void zzak() {
        zzlw zzm = this.zzs.zzm();
        boolean z = false;
        if (zzm != null && zzm.zzg.zzj && this.zzK) {
            z = true;
        }
        this.zzL = z;
    }

    private final void zzal(zzav zzavVar, boolean z) throws zzje {
        zzam(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzam(zzav zzavVar, float f, boolean z, boolean z2) throws zzje {
        int i;
        if (z) {
            if (z2) {
                this.zzI.zza(1);
            }
            zzmm zzmmVar = this.zzH;
            zzbf zzbfVar = zzmmVar.zza;
            zzxc zzxcVar = zzmmVar.zzb;
            long j = zzmmVar.zzc;
            long j2 = zzmmVar.zzd;
            int i2 = zzmmVar.zze;
            zzje zzjeVar = zzmmVar.zzf;
            boolean z3 = zzmmVar.zzg;
            zzzf zzzfVar = zzmmVar.zzh;
            zzaba zzabaVar = zzmmVar.zzi;
            List list = zzmmVar.zzj;
            zzxc zzxcVar2 = zzmmVar.zzk;
            boolean z4 = zzmmVar.zzl;
            int i3 = zzmmVar.zzm;
            int i4 = zzmmVar.zzn;
            long j3 = zzmmVar.zzq;
            long j4 = zzmmVar.zzr;
            long j5 = zzmmVar.zzs;
            long j6 = zzmmVar.zzt;
            boolean z5 = zzmmVar.zzp;
            this.zzH = new zzmm(zzbfVar, zzxcVar, j, j2, i2, zzjeVar, z3, zzzfVar, zzabaVar, list, zzxcVar2, z4, i3, i4, zzavVar, j3, j4, j5, j6, false);
        }
        float f2 = zzavVar.zzb;
        zzlw zzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzm == null) {
                break;
            }
            zzaas[] zzaasVarArr = zzm.zzr().zzc;
            int length = zzaasVarArr.length;
            while (i < length) {
                zzaas zzaasVar = zzaasVarArr[i];
                i++;
            }
            zzm = zzm.zzp();
        }
        zzmy[] zzmyVarArr = this.zzb;
        while (i < 2) {
            zzmyVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzan() {
        long zza2;
        long j;
        zzlz zzlzVar = this.zzs;
        boolean z = false;
        if (zzaG(zzlzVar.zzk())) {
            zzlw zzk = zzlzVar.zzk();
            long zzav = zzav(zzk.zzg());
            if (zzk == zzlzVar.zzm()) {
                zza2 = this.zzU;
                j = zzk.zza();
            } else {
                zza2 = this.zzU - zzk.zza();
                j = zzk.zzg.zzb;
            }
            zzlr zzlrVar = new zzlr(this.zzv, this.zzH.zza, zzk.zzg.zza, zza2 - j, zzav, this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzk.zzg.zza) ? this.zzae.zze() : C.TIME_UNSET, this.zzN);
            zzls zzlsVar = this.zzg;
            boolean zzh = zzlsVar.zzh(zzlrVar);
            zzlw zzm = zzlzVar.zzm();
            if (zzh || !zzm.zze || zzav >= 500000 || this.zzn <= 0) {
                z = zzh;
            } else {
                zzm.zza.zzf(this.zzH.zzs, false);
                z = zzlsVar.zzh(zzlrVar);
            }
        }
        this.zzO = z;
        if (z) {
            zzlw zzk2 = zzlzVar.zzk();
            zzk2.getClass();
            zzlt zzltVar = new zzlt();
            zzltVar.zza(this.zzU - zzk2.zza());
            zzltVar.zzb(this.zzo.zzj().zzb);
            zzltVar.zzc(this.zzN);
            zzk2.zzj(new zzlu(zzltVar, null));
        }
        zzao();
    }

    private final void zzao() {
        zzlw zzk = this.zzs.zzk();
        boolean z = true;
        if (!this.zzO && (zzk == null || !zzk.zza.zzn())) {
            z = false;
        }
        zzmm zzmmVar = this.zzH;
        if (z != zzmmVar.zzg) {
            this.zzH = zzmmVar.zzg(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[EDGE_INSN: B:51:0x00ce->B:52:0x00ce BREAK  A[LOOP:1: B:39:0x00af->B:47:0x00cb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmm zzap(zzxc zzxcVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzaba zzabaVar;
        zzlw zzm;
        int i2 = 0;
        this.zzX = (!this.zzX && j == this.zzH.zzs && zzxcVar.equals(this.zzH.zzb)) ? false : true;
        zzak();
        zzmm zzmmVar = this.zzH;
        zzzf zzzfVar = zzmmVar.zzh;
        zzaba zzabaVar2 = zzmmVar.zzi;
        List list2 = zzmmVar.zzj;
        if (this.zzt.zzb()) {
            zzlz zzlzVar = this.zzs;
            zzlw zzm2 = zzlzVar.zzm();
            zzzf zzq = zzm2 == null ? zzzf.zza : zzm2.zzq();
            zzaba zzr = zzm2 == null ? this.zzf : zzm2.zzr();
            zzaas[] zzaasVarArr = zzr.zzc;
            zzgvw zzgvwVar = new zzgvw();
            boolean z2 = false;
            for (zzaas zzaasVar : zzaasVarArr) {
                if (zzaasVar != null) {
                    zzap zzapVar = zzaasVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgvwVar.zzf(new zzap(C.TIME_UNSET, new zzao[0]));
                    } else {
                        zzgvwVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            zzgvz zzi = z2 ? zzgvwVar.zzi() : zzgvz.zzi();
            if (zzm2 != null) {
                zzlx zzlxVar = zzm2.zzg;
                if (zzlxVar.zzd != j2) {
                    zzm2.zzg = zzlxVar.zzb(j2);
                    if (zzlzVar.zzm() == zzlzVar.zzn() && (zzm = zzlzVar.zzm()) != null) {
                        zzaba zzr2 = zzm.zzr();
                        while (true) {
                            zzmy[] zzmyVarArr = this.zzb;
                            if (i2 >= 2) {
                                break;
                            }
                            if (zzr2.zza(i2)) {
                                if (zzmyVarArr[i2].zze() != 1) {
                                    break;
                                }
                                int i3 = zzr2.zzb[i2].zzb;
                            }
                            i2++;
                        }
                    }
                    list = zzi;
                    zzzfVar = zzq;
                    zzabaVar = zzr;
                }
            }
            if (zzlzVar.zzm() == zzlzVar.zzn()) {
                zzaba zzr22 = zzm.zzr();
                while (true) {
                    zzmy[] zzmyVarArr2 = this.zzb;
                    if (i2 >= 2) {
                    }
                    i2++;
                }
            }
            list = zzi;
            zzzfVar = zzq;
            zzabaVar = zzr;
        } else {
            if (!zzxcVar.equals(this.zzH.zzb)) {
                zzabaVar2 = this.zzf;
                zzzfVar = zzzf.zza;
                list2 = zzgvz.zzi();
            }
            list = list2;
            zzabaVar = zzabaVar2;
        }
        if (z) {
            this.zzI.zzc(i);
        }
        return this.zzH.zzc(zzxcVar, j, j2, j3, zzau(), zzzfVar, zzabaVar, list);
    }

    private final void zzaq() throws zzje {
        zzar(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzar(boolean[] zArr, long j) throws zzje {
        zzmy[] zzmyVarArr;
        long j2;
        zzlw zzn = this.zzs.zzn();
        zzaba zzr = zzn.zzr();
        int i = 0;
        while (true) {
            zzmyVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzr.zza(i)) {
                zzmyVarArr[i].zzG();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (!zzr.zza(i2) || zzmyVarArr[i2].zzp(zzn)) {
                j2 = j;
            } else {
                j2 = j;
                zzas(zzn, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void zzas(zzlw zzlwVar, int i, boolean z, long j) throws zzje {
        zzmy zzmyVar = this.zzb[i];
        if (zzmyVar.zzM()) {
            return;
        }
        boolean z2 = zzlwVar == this.zzs.zzm();
        zzaba zzr = zzlwVar.zzr();
        zzmx zzmxVar = zzr.zzb[i];
        zzaas zzaasVar = zzr.zzc[i];
        boolean z3 = zzay() && this.zzH.zze == 3;
        boolean z4 = !z && z3;
        this.zzS++;
        zzmyVar.zzx(zzmxVar, zzaasVar, zzlwVar.zzc[i], this.zzU, z4, z2, j, zzlwVar.zza(), zzlwVar.zzg.zza, this.zzo);
        zzmyVar.zzy(11, new zzlc(this), zzlwVar);
        if (z3 && z2) {
            zzmyVar.zzv();
        }
    }

    private final void zzat(boolean z) {
        zzlw zzk = this.zzs.zzk();
        zzxc zzxcVar = zzk == null ? this.zzH.zzb : zzk.zzg.zza;
        boolean equals = this.zzH.zzk.equals(zzxcVar);
        if (!equals) {
            this.zzH = this.zzH.zzh(zzxcVar);
        }
        zzmm zzmmVar = this.zzH;
        zzmmVar.zzq = zzk == null ? zzmmVar.zzs : zzk.zzf();
        this.zzH.zzr = zzau();
        if ((!equals || z) && zzk != null && zzk.zze) {
            zzax(zzk.zzg.zza, zzk.zzq(), zzk.zzr());
        }
    }

    private final long zzau() {
        return zzav(this.zzH.zzq);
    }

    private final long zzav(long j) {
        zzlw zzk = this.zzs.zzk();
        if (zzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzU - zzk.zza()));
    }

    private final long zzaw(zzlw zzlwVar) {
        zzgsw.zzi(zzlwVar.zze);
        return (long) ((zzlwVar.zzc() - this.zzU) / this.zzo.zzj().zzb);
    }

    private final void zzax(zzxc zzxcVar, zzzf zzzfVar, zzaba zzabaVar) {
        long zza2;
        long j;
        zzlz zzlzVar = this.zzs;
        zzlw zzk = zzlzVar.zzk();
        zzk.getClass();
        if (zzk == zzlzVar.zzm()) {
            zza2 = this.zzU;
            j = zzk.zza();
        } else {
            zza2 = this.zzU - zzk.zza();
            j = zzk.zzg.zzb;
        }
        this.zzg.zzb(new zzlr(this.zzv, this.zzH.zza, zzxcVar, zza2 - j, zzav(zzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzk.zzg.zza) ? this.zzae.zze() : C.TIME_UNSET, this.zzN), zzzfVar, zzabaVar.zzc);
    }

    private final boolean zzay() {
        zzmm zzmmVar = this.zzH;
        return zzmmVar.zzl && zzmmVar.zzn == 0;
    }

    private final void zzaz(int i) throws IOException, zzje {
        zzmy zzmyVar = this.zzb[i];
        try {
            zzlw zzm = this.zzs.zzm();
            if (zzm == null) {
                throw null;
            }
            zzlw zzlwVar = zzm;
            zzmyVar.zzu(zzm);
        } catch (IOException | RuntimeException e) {
            zzmyVar.zze();
            throw e;
        }
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zze = zzbfVar3.zze(obj);
        int zzc = zzbfVar3.zzc();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            if (i4 >= zzc || i3 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int zzl = zzbfVar4.zzl(zze, zzbdVar, zzbeVar2, i, z);
            if (zzl == -1) {
                i3 = -1;
                break;
            }
            i3 = zzbfVar2.zze(zzbfVar4.zzf(zzl));
            i4++;
            zzbfVar3 = zzbfVar4;
            zze = zzl;
            zzbeVar2 = zzbeVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(i3, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzmq zzmqVar) {
        try {
            zzaF(zzmqVar);
        } catch (zzje e) {
            zzef.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x0638, code lost:
    
        if (r14 == false) goto L297;
     */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x071a: MOVE (r11 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:453:0x071a */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06d1 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:202:0x0531, B:205:0x053a, B:207:0x053e, B:208:0x0549, B:210:0x054f, B:211:0x066b, B:214:0x0672, B:216:0x0676, B:218:0x067e, B:220:0x0681, B:223:0x0684, B:225:0x068a, B:227:0x0693, B:229:0x069d, B:231:0x06a3, B:233:0x06a9, B:234:0x06cb, B:236:0x06d1, B:239:0x06db, B:242:0x06f5, B:248:0x06ee, B:250:0x06f2, B:252:0x06b0, B:255:0x06be, B:256:0x06c6, B:257:0x06c7, B:258:0x055c, B:260:0x0562, B:262:0x0566, B:265:0x0609, B:267:0x0616, B:268:0x0626, B:270:0x062d, B:272:0x0631, B:275:0x063a, B:277:0x0649, B:279:0x064f, B:281:0x0659, B:283:0x065e, B:285:0x0663, B:286:0x0668, B:290:0x0573, B:292:0x0577, B:294:0x0589, B:295:0x0594, B:297:0x059e, B:300:0x05a7, B:302:0x05b1, B:307:0x05bc, B:372:0x06ff, B:375:0x0708), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0616 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:202:0x0531, B:205:0x053a, B:207:0x053e, B:208:0x0549, B:210:0x054f, B:211:0x066b, B:214:0x0672, B:216:0x0676, B:218:0x067e, B:220:0x0681, B:223:0x0684, B:225:0x068a, B:227:0x0693, B:229:0x069d, B:231:0x06a3, B:233:0x06a9, B:234:0x06cb, B:236:0x06d1, B:239:0x06db, B:242:0x06f5, B:248:0x06ee, B:250:0x06f2, B:252:0x06b0, B:255:0x06be, B:256:0x06c6, B:257:0x06c7, B:258:0x055c, B:260:0x0562, B:262:0x0566, B:265:0x0609, B:267:0x0616, B:268:0x0626, B:270:0x062d, B:272:0x0631, B:275:0x063a, B:277:0x0649, B:279:0x064f, B:281:0x0659, B:283:0x065e, B:285:0x0663, B:286:0x0668, B:290:0x0573, B:292:0x0577, B:294:0x0589, B:295:0x0594, B:297:0x059e, B:300:0x05a7, B:302:0x05b1, B:307:0x05bc, B:372:0x06ff, B:375:0x0708), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x062d A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:202:0x0531, B:205:0x053a, B:207:0x053e, B:208:0x0549, B:210:0x054f, B:211:0x066b, B:214:0x0672, B:216:0x0676, B:218:0x067e, B:220:0x0681, B:223:0x0684, B:225:0x068a, B:227:0x0693, B:229:0x069d, B:231:0x06a3, B:233:0x06a9, B:234:0x06cb, B:236:0x06d1, B:239:0x06db, B:242:0x06f5, B:248:0x06ee, B:250:0x06f2, B:252:0x06b0, B:255:0x06be, B:256:0x06c6, B:257:0x06c7, B:258:0x055c, B:260:0x0562, B:262:0x0566, B:265:0x0609, B:267:0x0616, B:268:0x0626, B:270:0x062d, B:272:0x0631, B:275:0x063a, B:277:0x0649, B:279:0x064f, B:281:0x0659, B:283:0x065e, B:285:0x0663, B:286:0x0668, B:290:0x0573, B:292:0x0577, B:294:0x0589, B:295:0x0594, B:297:0x059e, B:300:0x05a7, B:302:0x05b1, B:307:0x05bc, B:372:0x06ff, B:375:0x0708), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07d9 A[ADDED_TO_REGION, LOOP:8: B:338:0x07d9->B:341:0x07e1, LOOP_START, PHI: r2
      0x07d9: PHI (r2v33 com.google.android.gms.internal.ads.zzlw) = (r2v31 com.google.android.gms.internal.ads.zzlw), (r2v34 com.google.android.gms.internal.ads.zzlw) binds: [B:337:0x07d6, B:341:0x07e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0808  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        zzje zzjeVar;
        boolean z;
        int i;
        zzxc zzxcVar;
        zzlz zzlzVar;
        zzlw zzo;
        zzlw zzn;
        zzd zzdVar;
        String str;
        boolean z2;
        long uptimeMillis;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        long j;
        boolean z6;
        boolean zzi;
        int i3;
        int i4;
        String str2 = "Playback error";
        try {
            try {
                try {
                    zzdVar = null;
                } catch (RuntimeException e) {
                    e = e;
                }
            } catch (zzje e2) {
                e = e2;
            }
            try {
            } catch (zzje e3) {
                e = e3;
                str2 = str;
            } catch (RuntimeException e4) {
                e = e4;
                zzje zzc = zzje.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                zzef.zzf("ExoPlayerImplInternal", "Playback error", zzc);
                zzW(true, false);
                this.zzH = this.zzH.zzf(zzc);
                z = true;
                zzC();
                return z;
            }
        } catch (zzat e5) {
            e = e5;
        } catch (zzhk e6) {
            e = e6;
        } catch (zztx e7) {
            e = e7;
        } catch (zzwc e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        }
        switch (message.what) {
            case 1:
                zzE(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                z = true;
                zzC();
                return z;
            case 2:
                z2 = true;
                boolean z7 = false;
                try {
                    uptimeMillis = SystemClock.uptimeMillis();
                    this.zzi.zzk(2);
                    z3 = this.zzA;
                    if (!z3) {
                        zzai();
                    }
                    i2 = this.zzH.zze;
                } catch (zzje e10) {
                    e = e10;
                    if (e.zzc == 1 && (zzn = this.zzs.zzn()) != null && e.zzh == null) {
                        e = e.zzd(zzn.zzg.zza);
                    }
                    if (e.zzc == 1 && (zzxcVar = e.zzh) != null) {
                        int i5 = e.zze;
                        zzlzVar = this.zzs;
                        if (zzlzVar.zzo() != null && zzlzVar.zzo().zzg.zza.equals(zzxcVar) && this.zzb[i5].zzq(zzlzVar.zzo())) {
                            this.zzac = true;
                            zzab();
                            zzo = zzlzVar.zzo();
                            zzlw zzm = zzlzVar.zzm();
                            if (zzlzVar.zzm() != zzo) {
                                while (zzm != null && zzm.zzp() != zzo) {
                                    zzm = zzm.zzp();
                                }
                            }
                            zzlzVar.zzs(zzm);
                            if (this.zzH.zze != 4) {
                                zzan();
                                this.zzi.zzh(2);
                            }
                            z = true;
                            zzC();
                            return z;
                        }
                    }
                    zzjeVar = this.zzY;
                    if (zzjeVar != null) {
                        zzjeVar.addSuppressed(e);
                        e = this.zzY;
                    }
                    if (e.zzc == 1) {
                        zzlz zzlzVar2 = this.zzs;
                        if (zzlzVar2.zzm() != zzlzVar2.zzn()) {
                            while (zzlzVar2.zzm() != zzlzVar2.zzn()) {
                                zzlzVar2.zzr();
                            }
                            zzlw zzm2 = zzlzVar2.zzm();
                            zzm2.getClass();
                            zzC();
                            zzlx zzlxVar = zzm2.zzg;
                            zzxc zzxcVar2 = zzlxVar.zza;
                            long j2 = zzlxVar.zzb;
                            this.zzH = zzap(zzxcVar2, j2, zzlxVar.zzd, j2, true, 0);
                        }
                    }
                    if (e.zzi || !(this.zzY == null || (i = e.zza) == 5004 || i == 5003)) {
                        zzef.zzf("ExoPlayerImplInternal", str2, e);
                        z = true;
                        zzW(true, false);
                        this.zzH = this.zzH.zzf(e);
                        zzC();
                        return z;
                    }
                    zzef.zzd("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.zzY == null) {
                        this.zzY = e;
                    }
                    zzdy zzdyVar = this.zzi;
                    zzdyVar.zzg(zzdyVar.zzd(25, e));
                    z = true;
                    zzC();
                    return z;
                }
                if (i2 != 1 && i2 != 4) {
                    if (z3) {
                        zzai();
                    }
                    zzlz zzlzVar3 = this.zzs;
                    zzlw zzm3 = zzlzVar3.zzm();
                    if (zzm3 != null) {
                        Trace.beginSection("doSomeWork");
                        zzL();
                        if (zzm3.zze) {
                            this.zzV = zzfk.zzs(SystemClock.elapsedRealtime());
                            zzm3.zza.zzf(this.zzH.zzs - this.zzn, false);
                            z4 = true;
                            z5 = true;
                            int i6 = 0;
                            while (true) {
                                zzmy[] zzmyVarArr = this.zzb;
                                if (i6 < 2) {
                                    zzmy zzmyVar = zzmyVarArr[i6];
                                    if (zzmyVar.zzd() == 0) {
                                        zzN(i6, z7);
                                        i4 = i6;
                                    } else {
                                        int i7 = i6;
                                        zzmyVar.zzs(this.zzU, this.zzV);
                                        z4 = z4 && zzmyVar.zzo();
                                        boolean zzt = zzmyVar.zzt(zzm3);
                                        i4 = i7;
                                        zzN(i4, zzt);
                                        z5 = z5 && zzt;
                                        if (!zzt) {
                                            zzaz(i4);
                                        }
                                    }
                                    i6 = i4 + 1;
                                    z7 = false;
                                }
                            }
                        } else {
                            zzm3.zza.zzc();
                            z4 = true;
                            z5 = true;
                        }
                        long j3 = zzm3.zzg.zzf;
                        if (z4 && zzm3.zze) {
                            if (j3 != C.TIME_UNSET) {
                                if (j3 <= this.zzH.zzs) {
                                }
                            }
                            if (this.zzL) {
                                this.zzL = false;
                                zzE(false, this.zzH.zzn, false, 5);
                            }
                            if (zzm3.zzg.zzk) {
                                zzB(4);
                                zzK();
                                j = -9223372036854775807L;
                                if (this.zzH.zze == 2) {
                                    int i8 = 0;
                                    while (true) {
                                        zzmy[] zzmyVarArr2 = this.zzb;
                                        if (i8 < 2) {
                                            if (zzmyVarArr2[i8].zzp(zzm3)) {
                                                zzaz(i8);
                                            }
                                            i8++;
                                        } else {
                                            zzmm zzmmVar = this.zzH;
                                            if (!zzmmVar.zzg && zzmmVar.zzr < 500000 && zzaG(zzlzVar3.zzk()) && zzay()) {
                                                if (this.zzZ == j) {
                                                    this.zzZ = SystemClock.elapsedRealtime();
                                                } else if (SystemClock.elapsedRealtime() - this.zzZ >= 4000) {
                                                    throw new zzfc(0, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
                                                }
                                                boolean z8 = !zzay() && this.zzH.zze == 3;
                                                boolean z9 = this.zzH.zzp;
                                                i3 = this.zzH.zze;
                                                if (i3 != 4 && (z8 || i3 == 2 || (i3 == 3 && this.zzS != 0))) {
                                                    zzQ(uptimeMillis);
                                                }
                                                Trace.endSection();
                                                z = true;
                                                zzC();
                                                return z;
                                            }
                                        }
                                    }
                                }
                                this.zzZ = j;
                                if (zzay()) {
                                }
                                boolean z92 = this.zzH.zzp;
                                i3 = this.zzH.zze;
                                if (i3 != 4) {
                                    zzQ(uptimeMillis);
                                }
                                Trace.endSection();
                                z = true;
                                zzC();
                                return z;
                            }
                        }
                        zzmm zzmmVar2 = this.zzH;
                        if (zzmmVar2.zze == 2) {
                            if (this.zzS == 0) {
                                zzi = zzae();
                                j = -9223372036854775807L;
                                z6 = z5;
                            } else if (z5) {
                                if (zzmmVar2.zzg) {
                                    zzlw zzm4 = zzlzVar3.zzm();
                                    long zze = zzP(this.zzH.zza, zzm4.zzg.zza) ? this.zzae.zze() : -9223372036854775807L;
                                    zzlw zzk = zzlzVar3.zzk();
                                    boolean z10 = zzk.zzd() && zzk.zzg.zzk;
                                    boolean z11 = zzk.zzg.zza.zzb() && !zzk.zze;
                                    if (!z10 && !z11) {
                                        j = -9223372036854775807L;
                                        z6 = z5;
                                        zzi = this.zzg.zzi(new zzlr(this.zzv, this.zzH.zza, zzm4.zzg.zza, this.zzU - zzm4.zza(), zzav(zzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zze, this.zzN));
                                    }
                                }
                                j = -9223372036854775807L;
                                zzB(3);
                                this.zzY = null;
                                if (zzay()) {
                                    zzaD(false, false);
                                    this.zzo.zza();
                                    zzJ();
                                }
                                if (this.zzH.zze == 2) {
                                }
                                this.zzZ = j;
                                if (zzay()) {
                                }
                                boolean z922 = this.zzH.zzp;
                                i3 = this.zzH.zze;
                                if (i3 != 4) {
                                }
                                Trace.endSection();
                                z = true;
                                zzC();
                                return z;
                            }
                            if (zzi) {
                                zzB(3);
                                this.zzY = null;
                                if (zzay()) {
                                }
                                if (this.zzH.zze == 2) {
                                }
                                this.zzZ = j;
                                if (zzay()) {
                                }
                                boolean z9222 = this.zzH.zzp;
                                i3 = this.zzH.zze;
                                if (i3 != 4) {
                                }
                                Trace.endSection();
                                z = true;
                                zzC();
                                return z;
                            }
                            if (this.zzH.zze == 3) {
                                if (this.zzS == 0) {
                                    if (!zzae()) {
                                        zzaD(zzay(), false);
                                        zzB(2);
                                        if (this.zzM) {
                                            for (zzlw zzm5 = zzlzVar3.zzm(); zzm5 != null; zzm5 = zzm5.zzp()) {
                                                for (zzaas zzaasVar : zzm5.zzr().zzc) {
                                                }
                                            }
                                            this.zzae.zzc();
                                        }
                                        zzK();
                                    }
                                }
                                zzC();
                                return z;
                            }
                            if (this.zzH.zze == 2) {
                            }
                            this.zzZ = j;
                            if (zzay()) {
                            }
                            boolean z92222 = this.zzH.zzp;
                            i3 = this.zzH.zze;
                            if (i3 != 4) {
                            }
                            Trace.endSection();
                            z = true;
                            zzC();
                            return z;
                        }
                        j = -9223372036854775807L;
                        z6 = z5;
                        if (this.zzH.zze == 3) {
                        }
                        if (this.zzH.zze == 2) {
                        }
                        this.zzZ = j;
                        if (zzay()) {
                        }
                        boolean z922222 = this.zzH.zzp;
                        i3 = this.zzH.zze;
                        if (i3 != 4) {
                        }
                        Trace.endSection();
                        z = true;
                        zzC();
                        return z;
                    }
                    zzQ(uptimeMillis);
                }
                z = z2;
                zzC();
                return z;
            case 3:
                z2 = true;
                zzR((zzln) message.obj);
                z = z2;
                zzC();
                return z;
            case 4:
                z2 = true;
                zzM((zzav) message.obj);
                zzal(this.zzo.zzj(), true);
                z = z2;
                zzC();
                return z;
            case 5:
                z2 = true;
                this.zzB = (zznc) message.obj;
                z = z2;
                zzC();
                return z;
            case 6:
                z2 = true;
                zzW(false, true);
                z = z2;
                zzC();
                return z;
            case 7:
                zzdr zzdrVar = (zzdr) message.obj;
                try {
                    zzX(true, false, true, false);
                    int i9 = 0;
                    while (true) {
                        zzmy[] zzmyVarArr3 = this.zzb;
                        if (i9 >= 2) {
                            this.zzg.zzd(this.zzv);
                            this.zzz.zzd();
                            this.zze.zzb();
                            zzB(1);
                            return true;
                        }
                        this.zzc[i9].zzw();
                        zzmyVarArr3[i9].zzI();
                        i9++;
                    }
                } finally {
                    this.zzi.zzl(null);
                    this.zzj.zzb();
                    zzdrVar.zza();
                }
            case 8:
                try {
                    zzxa zzxaVar = (zzxa) message.obj;
                    zzlz zzlzVar4 = this.zzs;
                    if (zzlzVar4.zzd(zzxaVar)) {
                        zzlw zzk2 = zzlzVar4.zzk();
                        if (zzk2 == null) {
                            throw null;
                        }
                        zzlw zzlwVar = zzk2;
                        if (!zzk2.zze) {
                            float f = this.zzo.zzj().zzb;
                            zzmm zzmmVar3 = this.zzH;
                            zzk2.zzh(f, zzmmVar3.zza, zzmmVar3.zzl);
                        }
                        zzax(zzk2.zzg.zza, zzk2.zzq(), zzk2.zzr());
                        if (zzk2 == zzlzVar4.zzm()) {
                            zzU(zzk2.zzg.zzb, true);
                            zzaq();
                            zzk2.zzh = true;
                            zzmm zzmmVar4 = this.zzH;
                            try {
                                zzxc zzxcVar3 = zzmmVar4.zzb;
                                long j4 = zzk2.zzg.zzb;
                                z2 = true;
                                this.zzH = zzap(zzxcVar3, j4, zzmmVar4.zzc, j4, false, 5);
                            } catch (zzat e11) {
                                e = e11;
                                zzA(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
                                z = true;
                                zzC();
                                return z;
                            } catch (zzhk e12) {
                                e = e12;
                                zzA(e, e.zza);
                                z = true;
                                zzC();
                                return z;
                            } catch (zzje e13) {
                                e = e13;
                                if (e.zzc == 1) {
                                    e = e.zzd(zzn.zzg.zza);
                                    break;
                                }
                                if (e.zzc == 1) {
                                    int i52 = e.zze;
                                    zzlzVar = this.zzs;
                                    if (zzlzVar.zzo() != null) {
                                        this.zzac = true;
                                        zzab();
                                        zzo = zzlzVar.zzo();
                                        zzlw zzm6 = zzlzVar.zzm();
                                        if (zzlzVar.zzm() != zzo) {
                                        }
                                        zzlzVar.zzs(zzm6);
                                        if (this.zzH.zze != 4) {
                                        }
                                        z = true;
                                        zzC();
                                        return z;
                                    }
                                    break;
                                }
                                zzjeVar = this.zzY;
                                if (zzjeVar != null) {
                                }
                                if (e.zzc == 1) {
                                }
                                if (e.zzi) {
                                    break;
                                }
                                zzef.zzf("ExoPlayerImplInternal", str2, e);
                                z = true;
                                zzW(true, false);
                                this.zzH = this.zzH.zzf(e);
                                zzC();
                                return z;
                            } catch (zztx e14) {
                                e = e14;
                                zzA(e, e.zza);
                                z = true;
                                zzC();
                                return z;
                            } catch (zzwc e15) {
                                e = e15;
                                zzA(e, 1002);
                                z = true;
                                zzC();
                                return z;
                            } catch (IOException e16) {
                                e = e16;
                                zzA(e, 2000);
                                z = true;
                                zzC();
                                return z;
                            } catch (RuntimeException e17) {
                                e = e17;
                                if (e instanceof IllegalStateException) {
                                    break;
                                }
                                zzje zzc2 = zzje.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                zzef.zzf("ExoPlayerImplInternal", "Playback error", zzc2);
                                zzW(true, false);
                                this.zzH = this.zzH.zzf(zzc2);
                                z = true;
                                zzC();
                                return z;
                            }
                        } else {
                            z2 = true;
                        }
                        zzan();
                    } else {
                        z2 = true;
                        zzlw zzu = zzlzVar4.zzu(zzxaVar);
                        if (zzu != null) {
                            zzgsw.zzi(!zzu.zze);
                            float f2 = this.zzo.zzj().zzb;
                            zzmm zzmmVar5 = this.zzH;
                            zzu.zzh(f2, zzmmVar5.zza, zzmmVar5.zzl);
                            if (zzlzVar4.zze(zzxaVar)) {
                                zzaj();
                            }
                        }
                    }
                    z = z2;
                } catch (zzat e18) {
                    e = e18;
                } catch (zzhk e19) {
                    e = e19;
                } catch (zzje e20) {
                    e = e20;
                } catch (zztx e21) {
                    e = e21;
                } catch (zzwc e22) {
                    e = e22;
                } catch (IOException e23) {
                    e = e23;
                } catch (RuntimeException e24) {
                    e = e24;
                }
                zzC();
                return z;
            case 9:
                zzxa zzxaVar2 = (zzxa) message.obj;
                zzlz zzlzVar5 = this.zzs;
                if (zzlzVar5.zzd(zzxaVar2)) {
                    zzlzVar5.zzf(this.zzU);
                    zzan();
                } else if (zzlzVar5.zze(zzxaVar2)) {
                    zzaj();
                }
                z = true;
                zzC();
                return z;
            case 10:
                zzad();
                z = true;
                zzC();
                return z;
            case 11:
                int i10 = message.arg1;
                this.zzP = i10;
                int zza2 = this.zzs.zza(this.zzH.zza, i10);
                if ((zza2 & 1) != 0) {
                    zzI(true);
                } else if ((zza2 & 2) != 0) {
                    zzab();
                }
                zzat(false);
                z = true;
                zzC();
                return z;
            case 12:
                boolean z12 = message.arg1 != 0;
                this.zzQ = z12;
                int zzb = this.zzs.zzb(this.zzH.zza, z12);
                if ((zzb & 1) != 0) {
                    zzI(true);
                } else if ((zzb & 2) != 0) {
                    zzab();
                }
                zzat(false);
                z = true;
                zzC();
                return z;
            case 13:
                boolean z13 = message.arg1 != 0;
                zzdr zzdrVar2 = (zzdr) message.obj;
                if (this.zzR != z13) {
                    this.zzR = z13;
                    if (!z13) {
                        zzmy[] zzmyVarArr4 = this.zzb;
                        for (int i11 = 0; i11 < 2; i11++) {
                            zzmyVarArr4[i11].zzG();
                        }
                    }
                }
                if (zzdrVar2 != null) {
                    zzdrVar2.zza();
                }
                z = true;
                zzC();
                return z;
            case 14:
                zzmq zzmqVar = (zzmq) message.obj;
                if (zzmqVar.zzf() == this.zzk) {
                    zzaF(zzmqVar);
                    int i12 = this.zzH.zze;
                    if (i12 == 3 || i12 == 2) {
                        this.zzi.zzh(2);
                    }
                } else {
                    this.zzi.zzd(15, zzmqVar).zza();
                }
                z = true;
                zzC();
                return z;
            case 15:
                final zzmq zzmqVar2 = (zzmq) message.obj;
                Looper zzf = zzmqVar2.zzf();
                if (zzf.getThread().isAlive()) {
                    this.zzq.zzd(zzf, null).zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzlg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzlo.zzz(zzmqVar2);
                        }
                    });
                } else {
                    zzef.zzc("TAG", "Trying to send message on a dead thread.");
                    zzmqVar2.zzi(false);
                }
                z = true;
                zzC();
                return z;
            case 16:
                zzal((zzav) message.obj, false);
                z = true;
                zzC();
                return z;
            case 17:
                zzli zzliVar = (zzli) message.obj;
                this.zzI.zza(1);
                if (zzliVar.zzb() != -1) {
                    this.zzT = new zzln(new zzms(zzliVar.zza(), zzliVar.zzd()), zzliVar.zzb(), zzliVar.zzc());
                }
                zzaf(this.zzt.zzl(zzliVar.zza(), zzliVar.zzd()), false);
                z = true;
                zzC();
                return z;
            case 18:
                zzli zzliVar2 = (zzli) message.obj;
                int i13 = message.arg1;
                this.zzI.zza(1);
                zzml zzmlVar = this.zzt;
                if (i13 == -1) {
                    i13 = zzmlVar.zzc();
                }
                zzaf(zzmlVar.zzm(i13, zzliVar2.zza(), zzliVar2.zzd()), false);
                z = true;
                zzC();
                return z;
            case 19:
                zzlj zzljVar = (zzlj) message.obj;
                this.zzI.zza(1);
                zzml zzmlVar2 = this.zzt;
                int i14 = zzljVar.zza;
                int i15 = zzljVar.zzb;
                int i16 = zzljVar.zzc;
                zzyx zzyxVar = zzljVar.zzd;
                zzaf(zzmlVar2.zzo(0, 0, 0, null), false);
                z = true;
                zzC();
                return z;
            case 20:
                int i17 = message.arg1;
                int i18 = message.arg2;
                zzyx zzyxVar2 = (zzyx) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzt.zzn(i17, i18, zzyxVar2), false);
                z = true;
                zzC();
                return z;
            case 21:
                zzyx zzyxVar3 = (zzyx) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzt.zzp(zzyxVar3), false);
                z = true;
                zzC();
                return z;
            case 22:
                zzaf(this.zzt.zzh(), true);
                z = true;
                zzC();
                return z;
            case 23:
                this.zzK = message.arg1 != 0;
                zzak();
                if (this.zzL) {
                    zzlz zzlzVar6 = this.zzs;
                    if (zzlzVar6.zzn() != zzlzVar6.zzm()) {
                        zzI(true);
                        zzat(false);
                    }
                }
                z = true;
                zzC();
                return z;
            case 24:
            default:
                return false;
            case 25:
                zzac();
                z = true;
                zzC();
                return z;
            case 26:
                zzac();
                z = true;
                zzC();
                return z;
            case 27:
                int i19 = message.arg1;
                int i20 = message.arg2;
                List list = (List) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzt.zza(i19, i20, list), false);
                z = true;
                zzC();
                return z;
            case 28:
                zzjo zzjoVar = (zzjo) message.obj;
                this.zzaa = zzjoVar;
                this.zzs.zzc(this.zzH.zza, zzjoVar);
                z = true;
                zzC();
                return z;
            case 29:
                this.zzI.zza(1);
                zzX(false, false, false, true);
                this.zzg.zza(this.zzv);
                zzB(true != this.zzH.zza.zzg() ? 2 : 4);
                zzF();
                this.zzt.zzd(this.zzh.zze());
                this.zzi.zzh(2);
                z = true;
                zzC();
                return z;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                zzdr zzdrVar3 = (zzdr) pair.second;
                zzmy[] zzmyVarArr5 = this.zzb;
                for (int i21 = 0; i21 < 2; i21++) {
                    zzmyVarArr5[i21].zzJ(obj);
                }
                int i22 = this.zzH.zze;
                if (i22 == 3 || i22 == 2) {
                    this.zzi.zzh(2);
                }
                if (zzdrVar3 != null) {
                    zzdrVar3.zza();
                }
                z = true;
                zzC();
                return z;
            case 31:
                zzd zzdVar2 = (zzd) message.obj;
                int i23 = message.arg1;
                this.zze.zze(zzdVar2);
                zzcd zzcdVar = this.zzz;
                if (i23 != 0) {
                    zzdVar = zzdVar2;
                }
                zzcdVar.zzb(zzdVar);
                zzF();
                z = true;
                zzC();
                return z;
            case 32:
                zzD(((Float) message.obj).floatValue());
                z = true;
                zzC();
                return z;
            case 33:
                int i24 = message.arg1;
                zzmm zzmmVar6 = this.zzH;
                zzH(zzmmVar6.zzl, i24, zzmmVar6.zzn, zzmmVar6.zzm);
                z = true;
                zzC();
                return z;
            case 34:
                zzD(this.zzad);
                z = true;
                zzC();
                return z;
            case 35:
                zzadj zzadjVar = (zzadj) message.obj;
                zzmy[] zzmyVarArr6 = this.zzb;
                for (int i25 = 0; i25 < 2; i25++) {
                    zzmyVarArr6[i25].zzK(zzadjVar);
                }
                z = true;
                zzC();
                return z;
            case 36:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                if (!booleanValue) {
                    if (this.zzF != null && this.zzE && !this.zzi.zzb(37)) {
                        this.zzG++;
                    }
                    final int i26 = this.zzG;
                    if (i26 > 0) {
                        this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzlo.this.zzv(i26);
                            }
                        });
                    }
                    this.zzG = 0;
                    this.zzE = false;
                    this.zzi.zzk(37);
                    zzln zzlnVar = this.zzF;
                    if (zzlnVar != null) {
                        zzR(zzlnVar);
                        this.zzF = null;
                        this.zzE = false;
                    }
                }
                this.zzD = booleanValue;
                zzV();
                z = true;
                zzC();
                return z;
            case 37:
                this.zzE = false;
                zzln zzlnVar2 = this.zzF;
                if (zzlnVar2 != null) {
                    zzR(zzlnVar2);
                    this.zzF = null;
                }
                z = true;
                zzC();
                return z;
            case 38:
                this.zzC = (zznb) message.obj;
                zzV();
                z = true;
                zzC();
                return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzE) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzi.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i, long j) {
        this.zzi.zzd(3, new zzln(zzbfVar, i, j)).zza();
    }

    public final void zzg(zznb zznbVar) {
        this.zzi.zzd(38, zznbVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmo
    public final void zzk(zzmq zzmqVar) {
        if (!this.zzJ && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmqVar).zza();
        } else {
            zzef.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmqVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdr zzdrVar = new zzdr(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdrVar)).zza();
        if (j != C.TIME_UNSET) {
            return zzdrVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzJ = true;
        zzdr zzdrVar = new zzdr(this.zzq);
        this.zzi.zzd(7, zzdrVar).zza();
        return zzdrVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzo() {
        zzdy zzdyVar = this.zzi;
        zzdyVar.zzk(2);
        zzdyVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzp(zzxa zzxaVar) {
        this.zzi.zzd(8, zzxaVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final /* bridge */ /* synthetic */ void zzs(zzyw zzywVar) {
        this.zzi.zzd(9, (zzxa) zzywVar).zza();
    }

    final /* synthetic */ zzlw zzt(zzlx zzlxVar, long j) {
        zzabd zze = this.zzg.zze(this.zzv);
        long j2 = this.zzaa.zzb;
        zzaba zzabaVar = this.zzf;
        zzml zzmlVar = this.zzt;
        return new zzlw(this.zzc, j, this.zze, zze, zzmlVar, zzlxVar, zzabaVar, C.TIME_UNSET);
    }

    final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    final /* synthetic */ zzdy zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i, long j, zzyx zzyxVar) {
        this.zzi.zzd(17, new zzli(list, zzyxVar, i, j, null)).zza();
    }
}
