package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.util.MimeTypes;
import io.sentry.SentryReplayEvent;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzalv implements zzafp {
    public static final /* synthetic */ int zza = 0;
    private zzafs zzA;
    private zzalu[] zzB;
    private long[][] zzC;
    private int zzD;
    private zzaiq zzE;
    private final zzanc zzb;
    private final int zzc;
    private final zzes zzd;
    private final zzes zze;
    private final zzes zzf;
    private final zzes zzg;
    private final ArrayDeque zzh;
    private final zzalz zzi;
    private final List zzj;
    private zzgvz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzes zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    static {
        int i = zzalr.zza;
    }

    @Deprecated
    public zzalv() {
        this(zzanc.zza, 16);
    }

    static /* synthetic */ long zzh(zzame zzameVar, long j, long j2) {
        int zzl = zzl(zzameVar, j);
        return zzl == -1 ? j2 : Math.min(zzameVar.zzc[zzl], j2);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(long j) throws zzat {
        zzap zzapVar;
        ArrayDeque arrayDeque;
        zzap zzapVar2;
        ArrayList arrayList;
        boolean z;
        ArrayDeque arrayDeque2;
        List list;
        ArrayList arrayList2;
        int i;
        ArrayList arrayList3;
        int i2;
        long j2;
        int i3;
        int i4;
        ArrayList arrayList4;
        zzfu zzfuVar;
        while (true) {
            ArrayDeque arrayDeque3 = this.zzh;
            if (arrayDeque3.isEmpty() || ((zzfw) arrayDeque3.peek()).zza != j) {
                break;
            }
            zzfw zzfwVar = (zzfw) arrayDeque3.pop();
            if (zzfwVar.zzd == 1836019574) {
                zzfw zzd = zzfwVar.zzd(Atom.TYPE_meta);
                ArrayList arrayList5 = new ArrayList();
                if (zzd != null) {
                    zzapVar = zzald.zze(zzd);
                    if (this.zzy) {
                        zzapVar.getClass();
                        zzfu zzfuVar2 = (zzfu) zzapVar.zzc(zzfu.class, zzalp.zza);
                        if (zzfuVar2 != null && zzfuVar2.zzb[0] == 0) {
                            this.zzz = this.zzx + 16;
                        }
                        zzfu zzfuVar3 = (zzfu) zzapVar.zzc(zzfu.class, zzalq.zza);
                        zzfuVar3.getClass();
                        List zzb = zzfuVar3.zzb();
                        ArrayList arrayList6 = new ArrayList(zzb.size());
                        for (int i5 = 0; i5 < zzb.size(); i5++) {
                            int intValue = ((Integer) zzb.get(i5)).intValue();
                            arrayList6.add(Integer.valueOf(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1));
                        }
                        arrayList5 = arrayList6;
                    } else if (zzapVar != null && (this.zzc & 64) != 0 && (zzfuVar = (zzfu) zzapVar.zzc(zzfu.class, zzalo.zza)) != null) {
                        long zzJ = new zzes(zzfuVar.zzb).zzJ();
                        if (zzJ > 0) {
                            this.zzx = zzJ;
                            this.zzw = true;
                            arrayDeque = arrayDeque3;
                            arrayDeque.clear();
                            if (this.zzw) {
                                this.zzl = 2;
                            }
                        }
                    }
                } else {
                    zzapVar = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z2 = this.zzD == 1;
                ArrayList arrayList8 = arrayList5;
                zzagi zzagiVar = new zzagi();
                zzfx zzc = zzfwVar.zzc(Atom.TYPE_udta);
                if (zzc != null) {
                    zzap zzc2 = zzald.zzc(zzc);
                    zzagiVar.zza(zzc2);
                    zzapVar2 = zzc2;
                } else {
                    zzapVar2 = null;
                }
                zzfx zzc3 = zzfwVar.zzc(Atom.TYPE_mvhd);
                zzc3.getClass();
                zzap zzapVar3 = new zzap(C.TIME_UNSET, zzald.zzd(zzc3.zza));
                int i6 = this.zzc;
                if (1 != (i6 & 1)) {
                    arrayList = arrayList8;
                    z = false;
                } else {
                    arrayList = arrayList8;
                    z = true;
                }
                ArrayList arrayList9 = arrayList;
                ArrayList arrayList10 = arrayList7;
                List zzb2 = zzald.zzb(zzfwVar, zzagiVar, C.TIME_UNSET, null, z, z2, zzals.zza, false);
                if (this.zzy) {
                    zzgsw.zzj(arrayList9.size() == zzb2.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(arrayList9.size()), Integer.valueOf(zzb2.size())));
                }
                String zza2 = zzaln.zza(zzb2);
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i7 = 0;
                int i8 = 0;
                int i9 = -1;
                while (i7 < zzb2.size()) {
                    zzame zzameVar = (zzame) zzb2.get(i7);
                    int i10 = zzameVar.zzb;
                    if (i10 == 0) {
                        arrayDeque2 = arrayDeque3;
                        list = zzb2;
                        i4 = i9;
                        arrayList3 = arrayList9;
                        arrayList4 = arrayList10;
                        i = i7;
                    } else {
                        zzamb zzambVar = zzameVar.zza;
                        zzafs zzafsVar = this.zzA;
                        int i11 = i8 + 1;
                        arrayDeque2 = arrayDeque3;
                        int i12 = zzambVar.zzb;
                        zzalu zzaluVar = new zzalu(zzambVar, zzameVar, zzafsVar.zzu(i8, i12));
                        List list2 = zzb2;
                        long j5 = zzambVar.zze;
                        if (j5 == j4) {
                            j5 = zzameVar.zzi;
                        }
                        list = list2;
                        zzahb zzahbVar = zzaluVar.zzc;
                        zzahbVar.zzO(j5);
                        long max = Math.max(j3, j5);
                        zzv zzvVar = zzambVar.zzg;
                        String str = zzvVar.zzp;
                        int i13 = MimeTypes.AUDIO_TRUEHD.equals(str) ? zzameVar.zze * 16 : zzameVar.zze + 30;
                        zzt zza3 = zzvVar.zza();
                        zza3.zzp(i13);
                        if (i12 == 2) {
                            int i14 = zzvVar.zzf;
                            if ((i6 & 8) != 0) {
                                i14 |= i9 == -1 ? 1 : 2;
                            }
                            if (this.zzy) {
                                arrayList2 = arrayList9;
                                zza3.zzh(((Integer) arrayList2.get(i7)).intValue());
                                i14 |= 32768;
                            } else {
                                arrayList2 = arrayList9;
                            }
                            zza3.zzg(i14);
                            i12 = 2;
                        } else {
                            arrayList2 = arrayList9;
                        }
                        if (zzas.zzb(str)) {
                            i = i7;
                            boolean z3 = zzameVar.zzj;
                            arrayList3 = arrayList2;
                            int min = Math.min(!z3 ? zzameVar.zzh.length : i10, 20);
                            zzgsw.zzi(j5 != j4);
                            i2 = i9;
                            long min2 = Math.min(j5, 10000000L);
                            int i15 = 0;
                            int i16 = -1;
                            for (int i17 = 0; i17 < min; i17++) {
                                int i18 = z3 ? i17 : zzameVar.zzh[i17];
                                long j6 = zzameVar.zzf[i18];
                                if (j6 > min2) {
                                    break;
                                }
                                if (j6 >= 0 && (i3 = zzameVar.zzd[i18]) > i15) {
                                    i15 = i3;
                                    i16 = i18;
                                }
                            }
                            if (i16 != -1) {
                                j2 = zzameVar.zzf[i16];
                                zzap zzapVar4 = j2 == j4 ? new zzap(j4, new zzais(j2)) : null;
                                zzalm.zzb(i12, zzagiVar, zza3);
                                zzap zzapVar5 = zzvVar.zzl;
                                zzap[] zzapVarArr = new zzap[4];
                                List list3 = this.zzj;
                                zzapVarArr[0] = !list3.isEmpty() ? null : new zzap(list3);
                                zzapVarArr[1] = zzapVar2;
                                zzapVarArr[2] = zzapVar3;
                                zzapVarArr[3] = zzapVar4;
                                zzalm.zza(i12, zzapVar, zza3, zzapVar5, zzapVarArr);
                                zza3.zzn(zza2);
                                if (Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                                    zzahbVar.zzA(zza3.zzO());
                                } else {
                                    zzaluVar.zzf = zza3.zzO();
                                }
                                i4 = i2;
                                if (i12 == 2 && i4 == -1) {
                                    i4 = arrayList10.size();
                                }
                                arrayList4 = arrayList10;
                                arrayList4.add(zzaluVar);
                                i8 = i11;
                                j3 = max;
                            }
                        } else {
                            i = i7;
                            arrayList3 = arrayList2;
                            i2 = i9;
                        }
                        j2 = j4;
                        if (j2 == j4) {
                        }
                        zzalm.zzb(i12, zzagiVar, zza3);
                        zzap zzapVar52 = zzvVar.zzl;
                        zzap[] zzapVarArr2 = new zzap[4];
                        List list32 = this.zzj;
                        zzapVarArr2[0] = !list32.isEmpty() ? null : new zzap(list32);
                        zzapVarArr2[1] = zzapVar2;
                        zzapVarArr2[2] = zzapVar3;
                        zzapVarArr2[3] = zzapVar4;
                        zzalm.zza(i12, zzapVar, zza3, zzapVar52, zzapVarArr2);
                        zza3.zzn(zza2);
                        if (Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                        }
                        i4 = i2;
                        if (i12 == 2) {
                            i4 = arrayList10.size();
                        }
                        arrayList4 = arrayList10;
                        arrayList4.add(zzaluVar);
                        i8 = i11;
                        j3 = max;
                    }
                    i7 = i + 1;
                    i9 = i4;
                    arrayList10 = arrayList4;
                    arrayDeque3 = arrayDeque2;
                    zzb2 = list;
                    arrayList9 = arrayList3;
                    j4 = C.TIME_UNSET;
                }
                arrayDeque = arrayDeque3;
                int i19 = i9;
                int i20 = -1;
                zzalu[] zzaluVarArr = (zzalu[]) arrayList10.toArray(new zzalu[0]);
                this.zzB = zzaluVarArr;
                int length = zzaluVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i21 = 0; i21 < zzaluVarArr.length; i21++) {
                    jArr[i21] = new long[zzaluVarArr[i21].zzb.zzb];
                    jArr2[i21] = zzaluVarArr[i21].zzb.zzf[0];
                }
                int i22 = 0;
                long j7 = 0;
                while (i22 < zzaluVarArr.length) {
                    long j8 = Long.MAX_VALUE;
                    int i23 = i20;
                    for (int i24 = 0; i24 < zzaluVarArr.length; i24++) {
                        if (!zArr[i24]) {
                            long j9 = jArr2[i24];
                            if (j9 <= j8) {
                                i23 = i24;
                                j8 = j9;
                            }
                        }
                    }
                    int i25 = iArr[i23];
                    long[] jArr3 = jArr[i23];
                    jArr3[i25] = j7;
                    zzame zzameVar2 = zzaluVarArr[i23].zzb;
                    zzalu[] zzaluVarArr2 = zzaluVarArr;
                    j7 += zzameVar2.zzd[i25];
                    int i26 = i25 + 1;
                    iArr[i23] = i26;
                    if (i26 < jArr3.length) {
                        jArr2[i23] = zzameVar2.zzf[i26];
                    } else {
                        zArr[i23] = true;
                        i22++;
                    }
                    zzaluVarArr = zzaluVarArr2;
                    i20 = -1;
                }
                this.zzC = jArr;
                this.zzA.zzv();
                this.zzA.zzw(new zzalt(j3, this.zzB, i19));
                arrayDeque.clear();
                if (this.zzw) {
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((zzfw) arrayDeque3.peek()).zzb(zzfwVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzame zzameVar, long j) {
        int zza2 = zzameVar.zza(j);
        return zza2 == -1 ? zzameVar.zzb(j) : zza2;
    }

    private static int zzm(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzagw zzb = zzama.zzb(zzafqVar, (this.zzc & 2) != 0);
        this.zzk = zzb != null ? zzgvz.zzj(zzb) : zzgvz.zzi();
        return zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        if ((this.zzc & 16) == 0) {
            zzafsVar = new zzanf(zzafsVar, this.zzb);
        }
        this.zzA = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzalu zzaluVar : this.zzB) {
            zzame zzameVar = zzaluVar.zzb;
            int zza2 = zzameVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzameVar.zzb(j2);
            }
            zzaluVar.zze = zza2;
            zzahc zzahcVar = zzaluVar.zzd;
            if (zzahcVar != null) {
                zzahcVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    public zzalv(zzanc zzancVar, int i) {
        this.zzb = zzancVar;
        this.zzc = i;
        this.zzk = zzgvz.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzalz();
        this.zzj = new ArrayList();
        this.zzg = new zzes(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzes(zzgo.zza);
        this.zze = new zzes(6);
        this.zzf = new zzes();
        this.zzq = -1;
        this.zzA = zzafs.zza;
        this.zzB = new zzalu[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x04d8, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0425, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x034f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x009a A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        long j;
        long j2;
        zzahb zzahbVar;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        while (true) {
            int i4 = this.zzl;
            long j3 = 0;
            if (i4 == 0) {
                if (this.zzo == 0) {
                    zzes zzesVar = this.zzg;
                    if (!zzafqVar.zzb(zzesVar.zzi(), 0, 8, true)) {
                        if (this.zzD != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzahb zzu = this.zzA.zzu(0, 4);
                        zzaiq zzaiqVar = this.zzE;
                        zzap zzapVar = zzaiqVar == null ? null : new zzap(C.TIME_UNSET, zzaiqVar);
                        zzt zztVar = new zzt();
                        zztVar.zzl(zzapVar);
                        zzu.zzA(zztVar.zzO());
                        this.zzA.zzv();
                        this.zzA.zzw(new zzagr(C.TIME_UNSET, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzesVar.zzh(0);
                    this.zzn = zzesVar.zzz();
                    this.zzm = zzesVar.zzB();
                }
                long j4 = this.zzn;
                if (j4 == 1) {
                    zzes zzesVar2 = this.zzg;
                    zzafqVar.zzc(zzesVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzesVar2.zzJ();
                } else if (j4 == 0) {
                    long zzo = zzafqVar.zzo();
                    if (zzo == -1) {
                        zzfw zzfwVar = (zzfw) this.zzh.peek();
                        zzo = zzfwVar != null ? zzfwVar.zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzn = (zzo - zzafqVar.zzn()) + this.zzo;
                    }
                }
                long j5 = this.zzn;
                int i5 = this.zzo;
                long j6 = i5;
                if (j5 < j6) {
                    if (this.zzm != 1718773093 || i5 != 8) {
                        break;
                    }
                    this.zzn = j6;
                    i5 = 8;
                }
                int i6 = this.zzm;
                if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1701082227 || i6 == 1835365473 || i6 == 1635284069) {
                    long zzn = zzafqVar.zzn();
                    long j7 = this.zzn;
                    long j8 = zzn + j7;
                    long j9 = this.zzo;
                    if (j7 != j9 && this.zzm == 1835365473) {
                        zzes zzesVar3 = this.zzf;
                        zzesVar3.zza(8);
                        zzafqVar.zzi(zzesVar3.zzi(), 0, 8);
                        zzald.zzf(zzesVar3);
                        zzafqVar.zzf(zzesVar3.zzg());
                        zzafqVar.zzl();
                    }
                    long j10 = j8 - j9;
                    this.zzh.push(new zzfw(this.zzm, j10));
                    if (this.zzn == this.zzo) {
                        zzk(j10);
                    } else {
                        zzj();
                    }
                } else if (i6 == 1835296868 || i6 == 1836476516 || i6 == 1751411826 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1937011571 || i6 == 1668576371 || i6 == 1701606260 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1953196132 || i6 == 1718909296 || i6 == 1969517665 || i6 == 1801812339 || i6 == 1768715124) {
                    boolean z3 = false;
                    zzgsw.zzi(z3);
                    zzgsw.zzi(this.zzn <= 2147483647L);
                    zzes zzesVar4 = new zzes((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzesVar4.zzi(), 0, 8);
                    this.zzp = zzesVar4;
                    this.zzl = 1;
                } else {
                    long zzn2 = zzafqVar.zzn();
                    long j11 = this.zzo;
                    long j12 = zzn2 - j11;
                    if (this.zzm == 1836086884) {
                        this.zzE = new zzaiq(0L, j12, C.TIME_UNSET, j12 + j11, this.zzn - j11);
                    }
                    this.zzp = null;
                    this.zzl = 1;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        this.zzi.zzb(zzafqVar, zzagpVar, this.zzj);
                        if (zzagpVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long zzn3 = zzafqVar.zzn();
                    int i7 = this.zzq;
                    if (i7 == -1) {
                        int i8 = -1;
                        int i9 = -1;
                        boolean z4 = true;
                        boolean z5 = true;
                        long j13 = Long.MAX_VALUE;
                        long j14 = Long.MAX_VALUE;
                        long j15 = Long.MAX_VALUE;
                        int i10 = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        while (true) {
                            zzalu[] zzaluVarArr = this.zzB;
                            if (i10 >= zzaluVarArr.length) {
                                break;
                            }
                            zzalu zzaluVar = zzaluVarArr[i10];
                            int i11 = zzaluVar.zze;
                            zzame zzameVar = zzaluVar.zzb;
                            long j16 = j3;
                            if (i11 != zzameVar.zzb) {
                                long j17 = zzameVar.zzc[i11];
                                long[][] jArr = this.zzC;
                                jArr.getClass();
                                long j18 = jArr[i10][i11];
                                long j19 = j17 - zzn3;
                                boolean z6 = j19 < j16 || j19 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z6) {
                                    z = z5;
                                } else {
                                    if (!z5) {
                                        z = false;
                                    }
                                    z5 = z6;
                                    i9 = i10;
                                    j14 = j18;
                                    j15 = j19;
                                    if (j18 < j13) {
                                        z4 = z6;
                                        i8 = i10;
                                        j13 = j18;
                                    }
                                }
                                if (z6 != z || j19 >= j15) {
                                    z5 = z;
                                    if (j18 < j13) {
                                    }
                                }
                                z5 = z6;
                                i9 = i10;
                                j14 = j18;
                                j15 = j19;
                                if (j18 < j13) {
                                }
                            }
                            i10++;
                            j3 = j16;
                        }
                        j = j3;
                        i7 = (j13 == Long.MAX_VALUE || !z4 || j14 < j13 + SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE) ? i9 : i8;
                        this.zzq = i7;
                        if (i7 == -1) {
                            return -1;
                        }
                    } else {
                        j = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    zzalu zzaluVar2 = this.zzB[i7];
                    zzahb zzahbVar2 = zzaluVar2.zzc;
                    int i12 = zzaluVar2.zze;
                    zzame zzameVar2 = zzaluVar2.zzb;
                    long j20 = zzameVar2.zzc[i12] + this.zzz;
                    int[] iArr = zzameVar2.zzd;
                    int i13 = iArr[i12];
                    zzahc zzahcVar = zzaluVar2.zzd;
                    zzahb zzahbVar3 = zzahbVar2;
                    int i14 = 0;
                    long j21 = (j20 - zzn3) + this.zzr;
                    if (j21 < j || j21 >= j2) {
                        zzagpVar.zza = j20;
                        return 1;
                    }
                    zzamb zzambVar = zzaluVar2.zza;
                    if (zzambVar.zzh == 1) {
                        j21 += 8;
                        i13 -= 8;
                    }
                    int i15 = i13;
                    zzafqVar.zzf((int) j21);
                    zzv zzvVar = zzambVar.zzg;
                    String str = zzvVar.zzp;
                    if (!Objects.equals(str, "video/avc") ? !Objects.equals(str, "video/hevc") || (this.zzc & 128) == 0 : (this.zzc & 32) == 0) {
                        this.zzu = true;
                    }
                    int i16 = zzambVar.zzk;
                    if (i16 == 0) {
                        zzahbVar = zzahbVar3;
                        if (MimeTypes.AUDIO_AC4.equals(str)) {
                            if (this.zzs == 0) {
                                zzes zzesVar5 = this.zzf;
                                zzaet.zzc(i15, zzesVar5);
                                zzahbVar.zzc(zzesVar5, 7);
                                this.zzs += 7;
                            }
                            i15 += 7;
                        } else if (zzaluVar2.zzf != null && Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                            zzv zzvVar2 = zzaluVar2.zzf;
                            zzes zzesVar6 = this.zzf;
                            zzesVar6.zza(4);
                            zzafqVar.zzi(zzesVar6.zzi(), 0, 4);
                            zzafqVar.zzl();
                            zzagm zzagmVar = new zzagm();
                            if (zzagmVar.zza(zzesVar6.zzB()) && !Objects.equals(zzvVar2.zzp, zzagmVar.zzb)) {
                                zzt zza2 = zzvVar2.zza();
                                String str2 = zzagmVar.zzb;
                                str2.getClass();
                                zza2.zzo(str2);
                                zzvVar2 = zza2.zzO();
                            }
                            zzahbVar.zzA(zzvVar2);
                            zzaluVar2.zzf = null;
                        } else if (zzahcVar != null) {
                            zzahcVar.zzb(zzafqVar);
                        }
                        while (true) {
                            int i17 = this.zzs;
                            if (i17 >= i15) {
                                break;
                            }
                            int zza3 = zzahbVar.zza(zzafqVar, i15 - i17, false);
                            this.zzr += zza3;
                            this.zzs += zza3;
                            this.zzt -= zza3;
                        }
                    } else {
                        zzes zzesVar7 = this.zze;
                        byte[] zzi = zzesVar7.zzi();
                        zzi[0] = 0;
                        zzi[1] = 0;
                        zzi[2] = 0;
                        int i18 = 4 - i16;
                        i15 += i18;
                        while (this.zzs < i15) {
                            int i19 = this.zzt;
                            if (i19 == 0) {
                                if (this.zzu || zzgo.zzc(zzvVar) + i16 > iArr[i12] - this.zzr) {
                                    i2 = i16;
                                    i3 = i14;
                                } else {
                                    i3 = zzgo.zzc(zzvVar);
                                    i2 = i16 + i3;
                                }
                                zzafqVar.zzc(zzi, i18, i2);
                                this.zzr += i2;
                                int i20 = i14;
                                zzesVar7.zzh(i20);
                                int zzB = zzesVar7.zzB();
                                if (zzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = zzB - i3;
                                zzes zzesVar8 = this.zzd;
                                zzesVar8.zzh(i20);
                                i = i16;
                                zzahb zzahbVar4 = zzahbVar3;
                                zzahbVar4.zzc(zzesVar8, 4);
                                this.zzs += 4;
                                if (i3 > 0) {
                                    zzahbVar4.zzc(zzesVar7, i3);
                                    this.zzs += i3;
                                    if (zzgo.zzd(zzi, 4, i3, zzvVar)) {
                                        this.zzu = true;
                                        zzahbVar3 = zzahbVar4;
                                        i16 = i;
                                        i14 = 0;
                                    }
                                }
                                zzahbVar3 = zzahbVar4;
                            } else {
                                i = i16;
                                int zza4 = zzahbVar3.zza(zzafqVar, i19, i14);
                                this.zzr += zza4;
                                this.zzs += zza4;
                                this.zzt -= zza4;
                            }
                            i16 = i;
                            i14 = 0;
                        }
                        zzahbVar = zzahbVar3;
                    }
                    int i21 = i15;
                    long j22 = zzameVar2.zzf[i12];
                    int i22 = zzameVar2.zzg[i12];
                    if (!this.zzu) {
                        i22 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    int i23 = i22;
                    if (zzahcVar != null) {
                        zzahb zzahbVar5 = zzahbVar;
                        zzahcVar.zzc(zzahbVar5, j22, i23, i21, 0, null);
                        if (i12 + 1 == zzameVar2.zzb) {
                            zzahcVar.zzd(zzahbVar5, null);
                        }
                    } else {
                        zzahbVar.zze(j22, i23, i21, 0, null);
                    }
                    zzaluVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j23 = this.zzn - this.zzo;
                long zzn4 = zzafqVar.zzn() + j23;
                zzes zzesVar9 = this.zzp;
                if (zzesVar9 != null) {
                    zzafqVar.zzc(zzesVar9.zzi(), this.zzo, (int) j23);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzesVar9.zzh(8);
                        int zzm = zzm(zzesVar9.zzB());
                        if (zzm == 0) {
                            zzesVar9.zzk(4);
                            while (true) {
                                if (zzesVar9.zzd() <= 0) {
                                    zzm = 0;
                                    break;
                                }
                                zzm = zzm(zzesVar9.zzB());
                                if (zzm != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzD = zzm;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfw) arrayDeque.peek()).zza(new zzfx(this.zzm, zzesVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzD = 1;
                    }
                    if (j23 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzafqVar.zzf((int) j23);
                    } else {
                        zzagpVar.zza = zzafqVar.zzn() + j23;
                        z2 = true;
                        zzk(zzn4);
                        if (!this.zzw) {
                            this.zzy = true;
                            zzagpVar.zza = this.zzx;
                            this.zzw = false;
                        } else if (!z2) {
                            continue;
                        }
                        if (this.zzl == 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                zzk(zzn4);
                if (!this.zzw) {
                }
                if (this.zzl == 2) {
                }
            }
        }
    }
}
