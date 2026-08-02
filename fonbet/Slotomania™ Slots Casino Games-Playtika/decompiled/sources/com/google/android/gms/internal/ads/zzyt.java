package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzyt implements zzahb {
    private zzv zzA;
    private boolean zzC;
    private final zzyo zza;
    private final zzuf zzd;
    private final zzua zze;
    private zzys zzf;
    private zzv zzg;
    private zzty zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzx;
    private final zzyp zzb = new zzyp();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzaha[] zzo = new zzaha[1000];
    private final zzza zzc = new zzza(zzyq.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzz = true;
    private boolean zzy = true;
    private boolean zzB = true;
    private int zzw = -1;

    protected zzyt(zzabd zzabdVar, zzuf zzufVar, zzua zzuaVar) {
        this.zzd = zzufVar;
        this.zze = zzuaVar;
        this.zza = new zzyo(zzabdVar);
    }

    private final synchronized void zzB() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized boolean zzD(zzv zzvVar) {
        this.zzz = false;
        if (Objects.equals(zzvVar, this.zzA)) {
            return false;
        }
        zzza zzzaVar = this.zzc;
        if (zzzaVar.zzf() || !((zzyr) zzzaVar.zzc()).zza.equals(zzvVar)) {
            this.zzA = zzvVar;
        } else {
            this.zzA = ((zzyr) zzzaVar.zzc()).zza;
        }
        boolean z = this.zzB;
        zzv zzvVar2 = this.zzA;
        String str = zzvVar2.zzp;
        this.zzB = z & (zzas.zzf(str) == 1 && zzas.zzd(str, zzvVar2.zzk));
        this.zzC = false;
        return true;
    }

    private final synchronized long zzE(long j, boolean z, boolean z2) {
        Throwable th;
        try {
            try {
                int i = this.zzp;
                if (i != 0) {
                    long[] jArr = this.zzn;
                    int i2 = this.zzr;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.zzs;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int zzL = zzL(i2, i, j, false);
                        if (zzL != -1) {
                            return zzM(zzL);
                        }
                        return -1L;
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzF() {
        int i = this.zzp;
        if (i == 0) {
            return -1L;
        }
        return zzM(i);
    }

    private final void zzG() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzH(long j, int i, long j2, int i2, zzaha zzahaVar) {
        int i3 = this.zzp;
        if (i3 > 0) {
            int zzN = zzN(i3 - 1);
            zzgsw.zza(this.zzk[zzN] + ((long) this.zzl[zzN]) <= j2);
        }
        this.zzx = (536870912 & i) != 0;
        this.zzv = Math.max(this.zzv, j);
        int zzN2 = zzN(this.zzp);
        this.zzn[zzN2] = j;
        this.zzk[zzN2] = j2;
        this.zzl[zzN2] = i2;
        this.zzm[zzN2] = i;
        this.zzo[zzN2] = zzahaVar;
        this.zzj[zzN2] = 0;
        zzza zzzaVar = this.zzc;
        if (zzzaVar.zzf() || !((zzyr) zzzaVar.zzc()).zza.equals(this.zzA)) {
            zzv zzvVar = this.zzA;
            if (zzvVar == null) {
                throw null;
            }
            zzv zzvVar2 = zzvVar;
            zzzaVar.zzb(this.zzq + this.zzp, new zzyr(zzvVar, zzue.zzb, null));
        }
        int i4 = this.zzp + 1;
        this.zzp = i4;
        int i5 = this.zzi;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            zzaha[] zzahaVarArr = new zzaha[i6];
            int i7 = this.zzr;
            int i8 = i5 - i7;
            System.arraycopy(this.zzk, i7, jArr2, 0, i8);
            System.arraycopy(this.zzn, this.zzr, jArr3, 0, i8);
            System.arraycopy(this.zzm, this.zzr, iArr, 0, i8);
            System.arraycopy(this.zzl, this.zzr, iArr2, 0, i8);
            System.arraycopy(this.zzo, this.zzr, zzahaVarArr, 0, i8);
            System.arraycopy(this.zzj, this.zzr, jArr, 0, i8);
            int i9 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr2, i8, i9);
            System.arraycopy(this.zzn, 0, jArr3, i8, i9);
            System.arraycopy(this.zzm, 0, iArr, i8, i9);
            System.arraycopy(this.zzl, 0, iArr2, i8, i9);
            System.arraycopy(this.zzo, 0, zzahaVarArr, i8, i9);
            System.arraycopy(this.zzj, 0, jArr, i8, i9);
            this.zzk = jArr2;
            this.zzn = jArr3;
            this.zzm = iArr;
            this.zzl = iArr2;
            this.zzo = zzahaVarArr;
            this.zzj = jArr;
            this.zzr = 0;
            this.zzi = i6;
        }
    }

    private final boolean zzI() {
        return this.zzs != this.zzp;
    }

    private final void zzJ(zzv zzvVar, zzlq zzlqVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzt;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzt;
        zzuf zzufVar = this.zzd;
        zzlqVar.zzb = zzvVar.zzb(zzufVar.zzb(zzvVar));
        zzlqVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzty zza = zzufVar.zza(this.zze, zzvVar);
            this.zzh = zza;
            zzlqVar.zza = zza;
        }
    }

    private final boolean zzK(int i) {
        if (this.zzh == null) {
            return true;
        }
        int i2 = this.zzm[i];
        return false;
    }

    private final int zzL(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzn[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzm[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.zzi) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzN(int i) {
        int i2 = this.zzr + i;
        int i3 = this.zzi;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzA(zzv zzvVar) {
        boolean zzD = zzD(zzvVar);
        zzys zzysVar = this.zzf;
        if (zzysVar == null || !zzD) {
            return;
        }
        zzysVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zzg(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzd(zzes zzesVar, int i, int i2) {
        this.zza.zzh(zzesVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zze(long j, int i, int i2, int i3, zzaha zzahaVar) {
        if (this.zzy) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzy = false;
            }
        }
        if (this.zzB) {
            if (j < this.zzt) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzC) {
                    String valueOf = String.valueOf(this.zzA);
                    String.valueOf(valueOf);
                    zzef.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(valueOf)));
                    this.zzC = true;
                }
                i |= 1;
            }
        }
        zzH(j, i, (this.zza.zzf() - i2) - i3, i2, zzahaVar);
    }

    public final void zzf() {
        zzg(true);
        zzG();
    }

    public final void zzg(boolean z) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzw = -1;
        this.zzy = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzx = false;
        this.zzc.zze();
        if (z) {
            this.zzA = null;
            this.zzz = true;
            this.zzB = true;
        }
    }

    public final void zzh(long j) {
        this.zzt = j;
    }

    public final synchronized void zzi(long j) {
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    public final void zzk() {
        zzy();
        zzG();
    }

    public final void zzl() throws IOException {
        zzty zztyVar = this.zzh;
        if (zztyVar != null) {
            throw zztyVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq;
    }

    public final int zzn() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzo() {
        if (this.zzz) {
            return null;
        }
        return this.zzA;
    }

    public final synchronized long zzp() {
        return this.zzv;
    }

    public final synchronized boolean zzq() {
        return this.zzx;
    }

    public final synchronized boolean zzr(boolean z) {
        int i = this.zzq + this.zzs;
        boolean z2 = true;
        if (this.zzw != -1 && i >= 0) {
            return true;
        }
        if (zzI()) {
            if (((zzyr) this.zzc.zza(i)).zza != this.zzg) {
                return true;
            }
            return zzK(zzN(this.zzs));
        }
        if (!z && !this.zzx) {
            zzv zzvVar = this.zzA;
            if (zzvVar == null) {
                z2 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final int zzs(zzlq zzlqVar, zzip zzipVar, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        zzyp zzypVar = this.zzb;
        int zzC = zzC(zzlqVar, zzipVar, z2, z, zzypVar);
        if (zzC != -4) {
            return zzC;
        }
        if (!zzipVar.zzb()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 != 0) {
                    this.zza.zzd(zzipVar, zzypVar);
                    return -4;
                }
                this.zza.zzc(zzipVar, zzypVar);
            } else if (i2 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzt(int i) {
        zzB();
        int i2 = this.zzq;
        if (i >= i2 && i <= this.zzp + i2 && (this.zzw == -1 || i < 0)) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzu(long j, boolean z) {
        Throwable th;
        zzyt zzytVar;
        long j2;
        int i;
        try {
            try {
                zzB();
                int i2 = this.zzs;
                int zzN = zzN(i2);
                long j3 = this.zzv;
                if (zzI() && j >= this.zzn[zzN]) {
                    if (j > j3) {
                        if (z) {
                            z = true;
                        }
                    }
                    if (this.zzB) {
                        try {
                            int i3 = this.zzp - i2;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    if (this.zzn[zzN] >= j) {
                                        zzytVar = this;
                                        j2 = j;
                                        i = i4;
                                        break;
                                    }
                                    zzN++;
                                    if (zzN == this.zzi) {
                                        zzN = 0;
                                    }
                                    i4++;
                                } else if (z) {
                                    j2 = j;
                                    i = i3;
                                    zzytVar = this;
                                } else {
                                    zzytVar = this;
                                    j2 = j;
                                    i = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzytVar = this;
                        j2 = j;
                        i = zzytVar.zzL(zzN, this.zzp - i2, j2, true);
                    }
                    if (i == -1) {
                        return false;
                    }
                    zzytVar.zzt = j2;
                    zzytVar.zzs += i;
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized int zzv(long j, boolean z) {
        Throwable th;
        try {
            try {
                int i = this.zzs;
                int zzN = zzN(i);
                if (zzI() && j >= this.zzn[zzN]) {
                    if (j <= this.zzv || !z) {
                        int zzL = zzL(zzN, this.zzp - i, j, true);
                        if (zzL == -1) {
                            return 0;
                        }
                        return zzL;
                    }
                    try {
                        return this.zzp - i;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void zzw(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzs + i <= this.zzp) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgsw.zza(z);
        this.zzs += i;
    }

    public final void zzx(long j, boolean z, boolean z2) {
        this.zza.zze(zzE(j, false, z2));
    }

    public final void zzy() {
        this.zza.zze(zzF());
    }

    public final void zzz(zzys zzysVar) {
        this.zzf = zzysVar;
    }

    private final long zzM(int i) {
        long j = this.zzu;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzN = zzN(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzn[zzN]);
                if ((this.zzm[zzN] & 1) != 0) {
                    break;
                }
                zzN--;
                if (zzN == -1) {
                    zzN = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j, j2);
        this.zzp -= i;
        int i3 = this.zzq + i;
        this.zzq = i3;
        int i4 = this.zzr + i;
        this.zzr = i4;
        int i5 = this.zzi;
        if (i4 >= i5) {
            this.zzr = i4 - i5;
        }
        int i6 = this.zzs - i;
        this.zzs = i6;
        if (i6 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i3);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i7 = this.zzr;
        if (i7 == 0) {
            i7 = this.zzi;
        }
        return this.zzk[i7 - 1] + this.zzl[r12];
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r8.zzx != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r0 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        r10 = r8.zzA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r11 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r10 == r8.zzg) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        r11 = r10;
        zzJ(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        return -5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        return -3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized int zzC(zzlq zzlqVar, zzip zzipVar, boolean z, boolean z2, zzyp zzypVar) {
        boolean z3 = false;
        zzipVar.zzd = false;
        int i = this.zzq + this.zzs;
        if (this.zzw != -1 && i >= 0) {
            z3 = true;
        }
        if (zzI() && !z3) {
            zzv zzvVar = ((zzyr) this.zzc.zza(i)).zza;
            if (!z && zzvVar == this.zzg) {
                int zzN = zzN(this.zzs);
                if (!zzK(zzN)) {
                    zzipVar.zzd = true;
                    return -3;
                }
                zzipVar.zzg(this.zzm[zzN]);
                if (this.zzs == this.zzp - 1 && (z2 || this.zzx)) {
                    zzipVar.zzh(536870912);
                }
                zzipVar.zze = this.zzn[zzN];
                zzypVar.zza = this.zzl[zzN];
                zzypVar.zzb = this.zzk[zzN];
                zzypVar.zzc = this.zzo[zzN];
                return -4;
            }
            zzJ(zzvVar, zzlqVar);
            return -5;
        }
        zzipVar.zzg(4);
        zzipVar.zze = Long.MIN_VALUE;
        return -4;
    }
}
