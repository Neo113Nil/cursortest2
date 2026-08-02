package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzyi implements zzxa, zzafs, zzabn, zzabs, zzys {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzyh zzB;
    private zzags zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhj zze;
    private final zzuf zzf;
    private final zzxm zzg;
    private final zzua zzh;
    private final zzya zzi;
    private final zzabd zzj;
    private final long zzk;
    private final long zzl;
    private final zzxv zzn;
    private zzwz zzs;
    private zzaiw zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabv zzm = new zzabv("ProgressiveMediaPeriod");
    private final zzdr zzo = new zzdr(zzdo.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzye
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzyi.this.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyb
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzyi.this.zzE();
        }
    };
    private final Handler zzr = zzfk.zzd(null);
    private zzyg[] zzw = new zzyg[0];
    private zzyt[] zzv = new zzyt[0];
    private zzxy[] zzu = new zzxy[0];
    private long zzM = C.TIME_UNSET;
    private int zzF = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzo(MimeTypes.APPLICATION_ICY);
        zzc = zztVar.zzO();
    }

    public zzyi(Uri uri, zzhj zzhjVar, zzxv zzxvVar, zzuf zzufVar, zzua zzuaVar, zzabm zzabmVar, zzxm zzxmVar, zzya zzyaVar, zzabd zzabdVar, String str, int i, boolean z, int i2, zzv zzvVar, long j, zzacb zzacbVar) {
        this.zzd = uri;
        this.zze = zzhjVar;
        this.zzf = zzufVar;
        this.zzh = zzuaVar;
        this.zzg = zzxmVar;
        this.zzi = zzyaVar;
        this.zzj = zzabdVar;
        this.zzk = i;
        this.zzn = zzxvVar;
        this.zzl = j;
    }

    private final void zzR(int i) {
        zzaa();
        zzyh zzyhVar = this.zzB;
        boolean[] zArr = zzyhVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzv zza = zzyhVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzwy(1, zzas.zzf(zza.zzp), zza, 0, null, zzfk.zzr(this.zzL), C.TIME_UNSET));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i]) && !this.zzv[i].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyt zzytVar : this.zzv) {
                    zzytVar.zzg(false);
                }
                zzwz zzwzVar = this.zzs;
                zzwzVar.getClass();
                zzwzVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzahb zzU(zzyg zzygVar) {
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            if (zzygVar.equals(this.zzw[i])) {
                return this.zzv[i];
            }
        }
        if (this.zzx) {
            int i2 = zzygVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzef.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzafm();
        }
        zzyt zzytVar = new zzyt(this.zzj, this.zzf, this.zzh);
        zzxy zzxyVar = new zzxy(zzytVar);
        zzytVar.zzz(this);
        int i3 = length + 1;
        zzyg[] zzygVarArr = (zzyg[]) Arrays.copyOf(this.zzw, i3);
        zzygVarArr[length] = zzygVar;
        String str = zzfk.zza;
        this.zzw = zzygVarArr;
        zzyt[] zzytVarArr = (zzyt[]) Arrays.copyOf(this.zzv, i3);
        zzytVarArr[length] = zzytVar;
        this.zzv = zzytVarArr;
        zzxy[] zzxyVarArr = (zzxy[]) Arrays.copyOf(this.zzu, i3);
        zzxyVarArr[length] = zzxyVar;
        this.zzu = zzxyVarArr;
        return zzxyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyt zzytVar : this.zzv) {
            if (zzytVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            zzv zzo = this.zzv[i4].zzo();
            zzo.getClass();
            int zzf = zzas.zzf(zzo.zzp);
            int zzab = zzab(zzf);
            int zzab2 = zzab(i2);
            if (zzab > zzab2) {
                i2 = zzf;
            }
            if (zzab > zzab2) {
                i3 = i4;
            }
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zzv zzo2 = this.zzv[i5].zzo();
            zzo2.getClass();
            String str = zzo2.zzp;
            boolean zza = zzas.zza(str);
            boolean z = zza || zzas.zzb(str);
            zArr[i5] = z;
            this.zzz = z | this.zzz;
            this.zzA = this.zzl != C.TIME_UNSET && length == 1 && zzas.zzc(str);
            zzaiw zzaiwVar = this.zzt;
            if (zzaiwVar != null) {
                if (zza || this.zzw[i5].zzb) {
                    zzap zzapVar = zzo2.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(C.TIME_UNSET, zzaiwVar) : zzapVar.zzg(zzaiwVar);
                    zzt zza2 = zzo2.zza();
                    zza2.zzl(zzapVar2);
                    zzo2 = zza2.zzO();
                }
                if (zza && zzo2.zzh == -1 && zzo2.zzi == -1 && (i = zzaiwVar.zza) != -1) {
                    zzt zza3 = zzo2.zza();
                    zza3.zzi(i);
                    zzo2 = zza3.zzO();
                }
            }
            zzv zzb2 = zzo2.zzb(this.zzf.zzb(zzo2));
            if (i5 != i3) {
                zzt zza4 = zzb2.zza();
                zza4.zzm(Integer.toString(i3));
                zzb2 = zza4.zzO();
            }
            zzbgVarArr[i5] = new zzbg(Integer.toString(i5), zzb2);
            this.zzI = zzb2.zzv | this.zzI;
            this.zzv[i5].zzi(Long.MIN_VALUE);
        }
        this.zzB = new zzyh(new zzzf(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == C.TIME_UNSET) {
            this.zzD = this.zzl;
            this.zzC = new zzxw(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwz zzwzVar = this.zzs;
        zzwzVar.getClass();
        zzwzVar.zzp(this);
    }

    private final void zzW() {
        zzxz zzxzVar = new zzxz(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgsw.zzi(zzZ());
            long j = this.zzD;
            if (j != C.TIME_UNSET && this.zzM > j) {
                this.zzP = true;
                this.zzM = C.TIME_UNSET;
                return;
            }
            zzags zzagsVar = this.zzC;
            zzagsVar.getClass();
            zzxzVar.zzd(zzagsVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyt zzytVar : this.zzv) {
                zzytVar.zzh(this.zzM);
            }
            this.zzM = C.TIME_UNSET;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxzVar, this, zzabm.zza(this.zzF));
    }

    private final int zzX() {
        int i = 0;
        for (zzyt zzytVar : this.zzv) {
            i += zzytVar.zzj();
        }
        return i;
    }

    private final long zzY(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzyt[] zzytVarArr = this.zzv;
            if (i >= zzytVarArr.length) {
                return j;
            }
            if (!z) {
                zzyh zzyhVar = this.zzB;
                zzyhVar.getClass();
                i = zzyhVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzytVarArr[i].zzp());
        }
    }

    private final boolean zzZ() {
        return this.zzM != C.TIME_UNSET;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        zzgsw.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ void zzA(zzabr zzabrVar, long j, long j2, boolean z) {
        zzxz zzxzVar = (zzxz) zzabrVar;
        zzig zzf = zzxzVar.zzf();
        zzwt zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxzVar.zze();
        this.zzg.zzf(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)));
        if (z) {
            return;
        }
        for (zzyt zzytVar : this.zzv) {
            zzytVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwz zzwzVar = this.zzs;
            zzwzVar.getClass();
            zzwzVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ void zzB(zzabr zzabrVar, long j, long j2) {
        zzxz zzxzVar = (zzxz) zzabrVar;
        if (this.zzD == C.TIME_UNSET && this.zzC != null) {
            long zzY = zzY(true);
            long j3 = zzY == Long.MIN_VALUE ? 0L : zzY + 10000;
            this.zzD = j3;
            this.zzi.zzb(j3, this.zzC, this.zzE);
        }
        zzig zzf = zzxzVar.zzf();
        zzwt zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxzVar.zze();
        this.zzg.zze(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)));
        this.zzP = true;
        zzwz zzwzVar = this.zzs;
        zzwzVar.getClass();
        zzwzVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ void zzC(zzabr zzabrVar, long j, long j2, int i) {
        zzwt zzwtVar;
        zzxz zzxzVar = (zzxz) zzabrVar;
        zzig zzf = zzxzVar.zzf();
        if (i == 0) {
            long zze = zzxzVar.zze();
            zzhn zzh = zzxzVar.zzh();
            zzwtVar = new zzwt(zze, zzh, zzh.zza, Collections.emptyMap(), j, 0L, 0L);
        } else {
            zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        }
        this.zzg.zzd(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)), i);
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzyi.this.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzaiw zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzaiw zzaiwVar) {
        this.zzt = zzaiwVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyt zzytVar : this.zzv) {
                zzytVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwz zzwzVar, long j) {
        this.zzs = zzwzVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final zzzf zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zze(zzaas[] zzaasVarArr, boolean[] zArr, zzyu[] zzyuVarArr, boolean[] zArr2, long j) {
        zzaas zzaasVar;
        zzaa();
        zzyh zzyhVar = this.zzB;
        zzzf zzzfVar = zzyhVar.zza;
        boolean[] zArr3 = zzyhVar.zzc;
        int i = this.zzJ;
        int i2 = 0;
        for (int i3 = 0; i3 < zzaasVarArr.length; i3++) {
            zzyu zzyuVar = zzyuVarArr[i3];
            if (zzyuVar != null && (zzaasVarArr[i3] == null || !zArr[i3])) {
                int zza = ((zzyf) zzyuVar).zza();
                zzgsw.zzi(zArr3[zza]);
                this.zzJ--;
                zArr3[zza] = false;
                zzyuVarArr[i3] = null;
            }
        }
        boolean z = !this.zzG ? j == 0 || this.zzA : i != 0;
        for (int i4 = 0; i4 < zzaasVarArr.length; i4++) {
            if (zzyuVarArr[i4] == null && (zzaasVar = zzaasVarArr[i4]) != null) {
                zzgsw.zzi(zzaasVar.zze() == 1);
                zzgsw.zzi(zzaasVar.zzf(0) == 0);
                int zzb2 = zzzfVar.zzb(zzaasVar.zza());
                zzgsw.zzi(!zArr3[zzb2]);
                this.zzJ++;
                zArr3[zzb2] = true;
                this.zzI = zzaasVar.zzc().zzv | this.zzI;
                zzyuVarArr[i4] = new zzyf(this, zzb2);
                zArr2[i4] = true;
                if (!z) {
                    zzyt zzytVar = this.zzv[zzb2];
                    z = (zzytVar.zzn() == 0 || zzytVar.zzu(j, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabv zzabvVar = this.zzm;
            if (zzabvVar.zze()) {
                zzyt[] zzytVarArr = this.zzv;
                int length = zzytVarArr.length;
                while (i2 < length) {
                    zzytVarArr[i2].zzy();
                    i2++;
                }
                zzabvVar.zzf();
            } else {
                this.zzP = false;
                for (zzyt zzytVar2 : this.zzv) {
                    zzytVar2.zzg(false);
                }
            }
        } else if (z) {
            j = zzj(j);
            while (i2 < zzyuVarArr.length) {
                if (zzyuVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzG = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzf(long j, boolean z) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            this.zzv[i].zzx(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return C.TIME_UNSET;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return C.TIME_UNSET;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        long j;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzyh zzyhVar = this.zzB;
                if (zzyhVar.zzb[i] && zzyhVar.zzc[i] && !this.zzv[i].zzq()) {
                    j = Math.min(j, this.zzv[i].zzp());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzY(false);
        }
        return j == Long.MIN_VALUE ? this.zzL : j;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzj(long j) {
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j = 0;
        }
        this.zzH = false;
        long j2 = this.zzL;
        this.zzL = j;
        if (zzZ()) {
            this.zzM = j;
            return j;
        }
        if (this.zzF != 7 && (this.zzP || this.zzm.zze())) {
            int length = this.zzv.length;
            for (int i = 0; i < length; i++) {
                zzyt zzytVar = this.zzv[i];
                if (this.zzu[i].zzf() && (zzytVar.zzn() != 0 || j2 != j)) {
                    if (this.zzA ? zzytVar.zzt(zzytVar.zzm()) : zzytVar.zzu(j, this.zzP)) {
                        continue;
                    } else if (!zArr[i] && this.zzz) {
                    }
                }
            }
            return j;
        }
        this.zzN = false;
        this.zzM = j;
        this.zzP = false;
        this.zzI = false;
        zzabv zzabvVar = this.zzm;
        if (zzabvVar.zze()) {
            for (zzyt zzytVar2 : this.zzv) {
                zzytVar2.zzy();
            }
            zzabvVar.zzf();
            return j;
        }
        zzabvVar.zzc();
        for (zzyt zzytVar3 : this.zzv) {
            zzytVar3.zzg(false);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r23 == Long.MIN_VALUE) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080  */
    @Override // com.google.android.gms.internal.ads.zzxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzk(long j, zznc zzncVar) {
        long j2;
        long j3;
        boolean z;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzagq zzc2 = this.zzC.zzc(j);
        zzagt zzagtVar = zzc2.zza;
        zzagt zzagtVar2 = zzc2.zzb;
        long j4 = zzncVar.zzd;
        if (j4 == 0) {
            if (zzncVar.zze == 0) {
                return j;
            }
            j4 = 0;
        }
        String str = zzfk.zza;
        long j5 = j - j4;
        long j6 = Long.MAX_VALUE;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j5) > 0L ? 1 : ((j ^ j5) == 0L ? 0 : -1)) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j8 = Long.MIN_VALUE;
        if (j7 == Long.MIN_VALUE) {
            if (j5 == Long.MIN_VALUE) {
                j5 = Long.MIN_VALUE;
            }
            j7 = Long.MIN_VALUE;
            long j9 = zzncVar.zze;
            long j10 = j + j9;
            j2 = !((((j ^ j10) > 0L ? 1 : ((j ^ j10) == 0L ? 0 : -1)) < 0) | (((j9 ^ j) > 0L ? 1 : ((j9 ^ j) == 0L ? 0 : -1)) >= 0)) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
            if (j2 == Long.MIN_VALUE) {
                j8 = j10;
            }
            if (j2 != Long.MAX_VALUE) {
                int i = (j8 > Long.MAX_VALUE ? 1 : (j8 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j6 = j2;
            }
            j3 = zzagtVar.zzb;
            z = j7 > j3 && j3 <= j6;
            long j11 = zzagtVar2.zzb;
            boolean z2 = j7 > j11 && j11 <= j6;
            if (z || !z2) {
                if (!z) {
                    return z2 ? j11 : j7;
                }
                return j3;
            }
            if (Math.abs(j3 - j) <= Math.abs(j11 - j)) {
                return j3;
            }
        }
        if (j7 == Long.MAX_VALUE) {
            if (j5 == Long.MAX_VALUE) {
                j7 = Long.MAX_VALUE;
            }
            j7 = Long.MIN_VALUE;
        }
        long j92 = zzncVar.zze;
        long j102 = j + j92;
        if (!((((j ^ j102) > 0L ? 1 : ((j ^ j102) == 0L ? 0 : -1)) < 0) | (((j92 ^ j) > 0L ? 1 : ((j92 ^ j) == 0L ? 0 : -1)) >= 0))) {
        }
        if (j2 == Long.MIN_VALUE) {
        }
        if (j2 != Long.MAX_VALUE) {
        }
        j3 = zzagtVar.zzb;
        if (j7 > j3) {
        }
        long j112 = zzagtVar2.zzb;
        if (j7 > j112) {
        }
        if (z) {
        }
        if (!z) {
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        if (this.zzP) {
            return false;
        }
        zzabv zzabvVar = this.zzm;
        if (zzabvVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zza = this.zzo.zza();
        if (zzabvVar.zze()) {
            return zza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzo() {
        for (zzyt zzytVar : this.zzv) {
            zzytVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzp(int i) {
        return !zzT() && this.zzv[i].zzr(this.zzP);
    }

    final void zzq(int i) throws IOException {
        this.zzv[i].zzl();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzm.zzh(zzabm.zza(this.zzF));
    }

    final int zzs(int i, zzlq zzlqVar, zzip zzipVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int zzs = this.zzv[i].zzs(zzlqVar, zzipVar, i2, this.zzP);
        if (zzs == -3) {
            zzS(i);
        }
        return zzs;
    }

    final int zzt(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzyt zzytVar = this.zzv[i];
        int zzv = zzytVar.zzv(j, this.zzP);
        zzytVar.zzw(zzv);
        if (zzv != 0) {
            return zzv;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzahb zzu(int i, int i2) {
        return zzU(new zzyg(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzw(final zzags zzagsVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzyi.this.zzF(zzagsVar);
            }
        });
    }

    final zzahb zzx() {
        return zzU(new zzyg(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ zzabp zzz(zzabr zzabrVar, long j, long j2, IOException iOException, int i) {
        long min;
        zzabp zza;
        zzags zzagsVar;
        zzxz zzxzVar = (zzxz) zzabrVar;
        zzig zzf = zzxzVar.zzf();
        zzwt zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxzVar.zzg();
        String str = zzfk.zza;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof zzat) || (th instanceof FileNotFoundException) || (th instanceof zzhx) || (th instanceof zzabu) || ((th instanceof zzhk) && ((zzhk) th).zza == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == C.TIME_UNSET) {
            zza = zzabv.zzb;
        } else {
            int zzX = zzX();
            boolean z = zzX > this.zzO;
            if (this.zzK || !((zzagsVar = this.zzC) == null || zzagsVar.zza() == C.TIME_UNSET)) {
                this.zzO = zzX;
            } else {
                boolean z2 = this.zzy;
                if (!z2 || zzT()) {
                    this.zzH = z2;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzyt zzytVar : this.zzv) {
                        zzytVar.zzg(false);
                    }
                    zzxzVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zza = zzabv.zza;
                }
            }
            zza = zzabv.zza(z, min);
        }
        boolean zza2 = zza.zza();
        this.zzg.zzg(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)), iOException, !zza2);
        if (!zza2) {
            zzxzVar.zze();
        }
        return zza;
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwz zzwzVar = this.zzs;
        zzwzVar.getClass();
        zzwzVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzags zzagsVar) {
        this.zzC = this.zzt == null ? zzagsVar : new zzagr(C.TIME_UNSET, 0L);
        this.zzD = zzagsVar.zza();
        boolean z = false;
        if (!this.zzK && zzagsVar.zza() == C.TIME_UNSET) {
            z = true;
        }
        this.zzE = z;
        this.zzF = true == z ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzagsVar, z);
        } else {
            zzD();
        }
    }
}
