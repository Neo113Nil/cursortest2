package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzaqw implements zzafp {
    private final int zza;
    private final List zzb;
    private final zzes zzc;
    private final SparseIntArray zzd;
    private final zzaqz zze;
    private final zzanc zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaqs zzj;
    private zzaqr zzk;
    private zzafs zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i = zzaqv.zza;
    }

    @Deprecated
    public zzaqw() {
        this(1, 1, zzanc.zza, new zzfh(0L), new zzapj(0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzafq zzafqVar) throws IOException {
        byte[] zzi = this.zzc.zzi();
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(zzi, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzi[(i2 * TsExtractor.TS_PACKET_SIZE) + i] != 71) {
                    break;
                }
            }
            zzafgVar.zze(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        if (this.zza == 0) {
            zzafsVar = new zzanf(zzafsVar, this.zzf);
        }
        this.zzl = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        long j;
        long j2;
        long zzo = zzafqVar.zzo();
        if (this.zzn) {
            if (zzo != -1) {
                zzaqs zzaqsVar = this.zzj;
                if (!zzaqsVar.zza()) {
                    return zzaqsVar.zzb(zzafqVar, zzagpVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = -1;
                j2 = 0;
            } else {
                this.zzo = true;
                zzaqs zzaqsVar2 = this.zzj;
                if (zzaqsVar2.zzc() != C.TIME_UNSET) {
                    j = -1;
                    j2 = 0;
                    zzaqr zzaqrVar = new zzaqr(zzaqsVar2.zzd(), zzaqsVar2.zzc(), zzo, this.zzr, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
                    this.zzk = zzaqrVar;
                    this.zzl.zzw(zzaqrVar.zza());
                } else {
                    j = -1;
                    j2 = 0;
                    this.zzl.zzw(new zzagr(zzaqsVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j2, j2);
                if (zzafqVar.zzn() != j2) {
                    zzagpVar.zza = j2;
                    return 1;
                }
            }
            zzaqr zzaqrVar2 = this.zzk;
            if (zzaqrVar2 != null && zzaqrVar2.zzc()) {
                return zzaqrVar2.zzd(zzafqVar, zzagpVar);
            }
        } else {
            j = -1;
        }
        zzes zzesVar = this.zzc;
        byte[] zzi = zzesVar.zzi();
        if (9400 - zzesVar.zzg() < 188) {
            int zzd = zzesVar.zzd();
            if (zzd > 0) {
                System.arraycopy(zzi, zzesVar.zzg(), zzi, 0, zzd);
            }
            zzesVar.zzb(zzi, zzd);
        }
        while (zzesVar.zzd() < 188) {
            int zze = zzesVar.zze();
            int zza = zzafqVar.zza(zzi, zze, 9400 - zze);
            if (zza == -1) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzarb zzarbVar = (zzarb) sparseArray.valueAt(i);
                    if (zzarbVar instanceof zzaqf) {
                        zzaqf zzaqfVar = (zzaqf) zzarbVar;
                        if (zzaqfVar.zzd(false)) {
                            zzaqfVar.zzc(new zzes(), 1);
                        }
                    }
                    i++;
                }
            } else {
                zzesVar.zzf(zze + zza);
            }
        }
        int zzg = zzesVar.zzg();
        int zze2 = zzesVar.zze();
        int zza2 = zzarc.zza(zzesVar.zzi(), zzg, zze2);
        zzesVar.zzh(zza2);
        int i2 = zza2 + TsExtractor.TS_PACKET_SIZE;
        if (i2 > zze2) {
            this.zzq += zza2 - zzg;
        } else {
            this.zzq = 0;
        }
        int zze3 = zzesVar.zze();
        if (i2 > zze3) {
            return 0;
        }
        int zzB = zzesVar.zzB();
        if ((8388608 & zzB) != 0) {
            zzesVar.zzh(i2);
            return 0;
        }
        int i3 = (4194304 & zzB) != 0 ? 1 : 0;
        int i4 = zzB & 32;
        int i5 = (zzB >> 8) & 8191;
        zzarb zzarbVar2 = (zzB & 16) != 0 ? (zzarb) this.zzg.get(i5) : null;
        if (zzarbVar2 == null) {
            zzesVar.zzh(i2);
            return 0;
        }
        int i6 = zzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i7 = sparseIntArray.get(i5, i6 - 1);
        sparseIntArray.put(i5, i6);
        if (i7 == i6) {
            zzesVar.zzh(i2);
            return 0;
        }
        if (i6 != ((i7 + 1) & 15)) {
            zzarbVar2.zzb();
        }
        if (i4 != 0) {
            int zzs = zzesVar.zzs();
            i3 |= (zzesVar.zzs() & 64) != 0 ? 2 : 0;
            zzesVar.zzk(zzs - 1);
        }
        boolean z = this.zzn;
        if (z || !this.zzi.get(i5, false)) {
            zzesVar.zzf(i2);
            zzarbVar2.zzc(zzesVar, i3);
            zzesVar.zzf(zze3);
        }
        if (!z && this.zzn && zzo != j) {
            this.zzp = true;
        }
        zzesVar.zzh(i2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        zzaqr zzaqrVar;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzfh zzfhVar = (zzfh) list.get(i);
            if (zzfhVar.zzc() != C.TIME_UNSET) {
                long zza = zzfhVar.zza();
                if (zza != C.TIME_UNSET) {
                    if (zza != 0) {
                        if (zza == j2) {
                        }
                    }
                }
            }
            zzfhVar.zzd(j2);
        }
        if (j2 != 0 && (zzaqrVar = this.zzk) != null) {
            zzaqrVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i2 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzarb) sparseArray.valueAt(i2)).zzb();
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzaqz zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzafs zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzp(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzr = i;
    }

    public zzaqw(int i, int i2, zzanc zzancVar, zzfh zzfhVar, zzaqz zzaqzVar, int i3) {
        this.zze = zzaqzVar;
        this.zza = i2;
        this.zzf = zzancVar;
        this.zzb = Collections.singletonList(zzfhVar);
        this.zzc = new zzes(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaqs(TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
        this.zzl = zzafs.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzaqzVar.zza();
        int size = zza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(zza.keyAt(i4), (zzarb) zza.valueAt(i4));
        }
        this.zzg.put(0, new zzaqn(new zzaqt(this)));
    }
}
