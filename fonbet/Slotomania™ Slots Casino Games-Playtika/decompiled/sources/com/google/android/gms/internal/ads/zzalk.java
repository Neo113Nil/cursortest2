package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzalk implements zzafp {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzalj zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzafs zzI;
    private zzahb[] zzJ;
    private zzahb[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzanc zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzes zzg;
    private final zzes zzh;
    private final zzes zzi;
    private final byte[] zzj;
    private final zzes zzk;
    private final zzaiu zzl;
    private final zzes zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgy zzp;
    private final zzafe zzq;
    private zzgvz zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzes zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = zzalg.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzo(MimeTypes.APPLICATION_EMSG);
        zzb = zztVar.zzO();
    }

    @Deprecated
    public zzalk() {
        this(zzanc.zza, 32, null, null, zzgvz.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03da, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfk.zzv(r42, 1000000, r5.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzfk.zzv(r2[0], 1000000, r5.zzc, java.math.RoundingMode.DOWN)) < r5.zze) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0781, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0784, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(long j) throws zzat {
        zzap zzapVar;
        int i;
        List list;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        long[] jArr;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfw) arrayDeque.peek()).zza != j) {
                break;
            }
            zzfw zzfwVar = (zzfw) arrayDeque.pop();
            int i22 = zzfwVar.zzd;
            int i23 = 12;
            int i24 = 8;
            boolean z5 = true;
            if (i22 == 1836019574) {
                zzq zzn = zzn(zzfwVar.zzb);
                zzfw zzd = zzfwVar.zzd(Atom.TYPE_mvex);
                zzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzd.zzb;
                int size = list2.size();
                int i25 = 0;
                long j2 = C.TIME_UNSET;
                while (i25 < size) {
                    zzfx zzfxVar = (zzfx) list2.get(i25);
                    int i26 = zzfxVar.zzd;
                    if (i26 == 1953654136) {
                        zzes zzesVar = zzfxVar.zza;
                        zzesVar.zzh(i23);
                        Pair create = Pair.create(Integer.valueOf(zzesVar.zzB()), new zzale(zzesVar.zzB() - 1, zzesVar.zzB(), zzesVar.zzB(), zzesVar.zzB()));
                        sparseArray.put(((Integer) create.first).intValue(), (zzale) create.second);
                    } else if (i26 == 1835362404) {
                        zzes zzesVar2 = zzfxVar.zza;
                        zzesVar2.zzh(8);
                        j2 = zzald.zza(zzesVar2.zzB()) == 0 ? zzesVar2.zzz() : zzesVar2.zzJ();
                    }
                    i25++;
                    i23 = 12;
                }
                zzfw zzd2 = zzfwVar.zzd(Atom.TYPE_meta);
                zzap zze = zzd2 != null ? zzald.zze(zzd2) : null;
                zzagi zzagiVar = new zzagi();
                zzfx zzc = zzfwVar.zzc(Atom.TYPE_udta);
                if (zzc != null) {
                    zzap zzc2 = zzald.zzc(zzc);
                    zzagiVar.zza(zzc2);
                    zzapVar = zzc2;
                } else {
                    zzapVar = null;
                }
                zzfx zzc3 = zzfwVar.zzc(Atom.TYPE_mvhd);
                zzc3.getClass();
                zzap zzapVar2 = new zzap(C.TIME_UNSET, zzald.zzd(zzc3.zza));
                List zzb2 = zzald.zzb(zzfwVar, zzagiVar, j2, zzn, (this.zzd & 16) != 0, false, new zzgsn(this) { // from class: com.google.android.gms.internal.ads.zzalf
                    @Override // com.google.android.gms.internal.ads.zzgsn
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzamb) obj;
                    }
                }, false);
                int size2 = zzb2.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String zza2 = zzaln.zza(zzb2);
                    int i27 = 0;
                    while (i27 < size2) {
                        zzame zzameVar = (zzame) zzb2.get(i27);
                        zzamb zzambVar = zzameVar.zza;
                        zzafs zzafsVar = this.zzI;
                        int i28 = zzambVar.zzb;
                        zzahb zzu = zzafsVar.zzu(i27, i28);
                        boolean z6 = z5;
                        long j3 = zzambVar.zze;
                        zzu.zzO(j3);
                        int i29 = i27;
                        zzv zzvVar = zzambVar.zzg;
                        zzap zzapVar3 = zzapVar2;
                        zzt zza3 = zzvVar.zza();
                        zza3.zzn(zza2);
                        zzalm.zzb(i28, zzagiVar, zza3);
                        zzagi zzagiVar2 = zzagiVar;
                        String str = zza2;
                        zzap[] zzapVarArr = new zzap[2];
                        zzapVarArr[0] = zzapVar;
                        zzapVarArr[z6 ? 1 : 0] = zzapVar3;
                        zzalm.zza(i28, zze, zza3, zzvVar.zzl, zzapVarArr);
                        int i30 = zzambVar.zza;
                        sparseArray2.put(i30, new zzalj(zzu, zzameVar, zzo(sparseArray, i30), zza3.zzO()));
                        this.zzA = Math.max(this.zzA, j3);
                        i27 = i29 + 1;
                        z5 = z6 ? 1 : 0;
                        zzagiVar = zzagiVar2;
                        zzapVar2 = zzapVar3;
                        zza2 = str;
                    }
                    this.zzI.zzv();
                } else {
                    zzgsw.zzi(sparseArray2.size() == size2);
                    for (int i31 = 0; i31 < size2; i31++) {
                        zzame zzameVar2 = (zzame) zzb2.get(i31);
                        int i32 = zzameVar2.zza.zza;
                        ((zzalj) sparseArray2.get(i32)).zza(zzameVar2, zzo(sparseArray, i32));
                    }
                }
            } else {
                boolean z7 = true;
                int i33 = 16;
                int i34 = 0;
                if (i22 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i35 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list3 = zzfwVar.zzc;
                    int size3 = list3.size();
                    int i36 = 0;
                    while (i36 < size3) {
                        zzfw zzfwVar2 = (zzfw) list3.get(i36);
                        if (zzfwVar2.zzd == 1953653094) {
                            zzfx zzc4 = zzfwVar2.zzc(Atom.TYPE_tfhd);
                            zzc4.getClass();
                            zzes zzesVar3 = zzc4.zza;
                            zzesVar3.zzh(i24);
                            int zzB = zzesVar3.zzB();
                            int i37 = zzald.zza;
                            zzalj zzaljVar = (zzalj) sparseArray3.get(zzesVar3.zzB());
                            if (zzaljVar == null) {
                                zzaljVar = null;
                            } else {
                                if ((zzB & 1) != 0) {
                                    long zzJ = zzesVar3.zzJ();
                                    zzamd zzamdVar = zzaljVar.zzb;
                                    zzamdVar.zzb = zzJ;
                                    zzamdVar.zzc = zzJ;
                                }
                                zzale zzaleVar = zzaljVar.zze;
                                zzaljVar.zzb.zza = new zzale((zzB & 2) != 0 ? zzesVar3.zzB() - 1 : zzaleVar.zza, (zzB & 8) != 0 ? zzesVar3.zzB() : zzaleVar.zzb, (zzB & 16) != 0 ? zzesVar3.zzB() : zzaleVar.zzc, (zzB & 32) != 0 ? zzesVar3.zzB() : zzaleVar.zzd);
                            }
                            if (zzaljVar == null) {
                                i = i35;
                                list = list3;
                                i2 = size3;
                                i3 = i36;
                                z = z7;
                                i5 = i33;
                                i6 = i34;
                                i4 = 8;
                            } else {
                                zzamd zzamdVar2 = zzaljVar.zzb;
                                long j4 = zzamdVar2.zzp;
                                boolean z8 = zzamdVar2.zzq;
                                zzaljVar.zzc();
                                boolean z9 = z7;
                                zzaljVar.zzl(z9);
                                zzfx zzc5 = zzfwVar2.zzc(Atom.TYPE_tfdt);
                                if (zzc5 == null || (i35 & 2) != 0) {
                                    zzamdVar2.zzp = j4;
                                    zzamdVar2.zzq = z8;
                                } else {
                                    zzes zzesVar4 = zzc5.zza;
                                    zzesVar4.zzh(8);
                                    zzamdVar2.zzp = zzald.zza(zzesVar4.zzB()) == z9 ? zzesVar4.zzJ() : zzesVar4.zzz();
                                    zzamdVar2.zzq = z9;
                                }
                                List list4 = zzfwVar2.zzb;
                                int size4 = list4.size();
                                i = i35;
                                int i38 = i34;
                                int i39 = i38;
                                int i40 = i39;
                                while (true) {
                                    i7 = Atom.TYPE_trun;
                                    if (i38 >= size4) {
                                        break;
                                    }
                                    List list5 = list3;
                                    zzfx zzfxVar2 = (zzfx) list4.get(i38);
                                    int i41 = size3;
                                    if (zzfxVar2.zzd == 1953658222) {
                                        zzes zzesVar5 = zzfxVar2.zza;
                                        zzesVar5.zzh(12);
                                        int zzH = zzesVar5.zzH();
                                        if (zzH > 0) {
                                            i40 += zzH;
                                            i39++;
                                        }
                                    }
                                    i38++;
                                    size3 = i41;
                                    list3 = list5;
                                }
                                list = list3;
                                i2 = size3;
                                int i42 = i34;
                                zzaljVar.zzh = i42;
                                zzaljVar.zzg = i42;
                                zzaljVar.zzf = i42;
                                zzamdVar2.zzd = i39;
                                zzamdVar2.zze = i40;
                                if (zzamdVar2.zzg.length < i39) {
                                    zzamdVar2.zzf = new long[i39];
                                    zzamdVar2.zzg = new int[i39];
                                }
                                if (zzamdVar2.zzh.length < i40) {
                                    int i43 = (i40 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    zzamdVar2.zzh = new int[i43];
                                    zzamdVar2.zzi = new long[i43];
                                    zzamdVar2.zzj = new boolean[i43];
                                    zzamdVar2.zzl = new boolean[i43];
                                }
                                int i44 = 0;
                                int i45 = 0;
                                int i46 = 0;
                                while (i44 < size4) {
                                    long j5 = 0;
                                    zzfx zzfxVar3 = (zzfx) list4.get(i44);
                                    if (zzfxVar3.zzd == i7) {
                                        int i47 = i45 + 1;
                                        zzes zzesVar6 = zzfxVar3.zza;
                                        zzesVar6.zzh(8);
                                        int zzB2 = zzesVar6.zzB();
                                        i9 = i44;
                                        zzamb zzambVar2 = zzaljVar.zzd.zza;
                                        int i48 = i45;
                                        zzale zzaleVar2 = zzamdVar2.zza;
                                        String str2 = zzfk.zza;
                                        i10 = i36;
                                        zzamdVar2.zzg[i48] = zzesVar6.zzH();
                                        long[] jArr2 = zzamdVar2.zzf;
                                        int i49 = i46;
                                        long j6 = zzamdVar2.zzb;
                                        jArr2[i48] = j6;
                                        if ((zzB2 & 1) != 0) {
                                            jArr2[i48] = j6 + zzesVar6.zzB();
                                        }
                                        boolean z10 = (zzB2 & 4) != 0;
                                        int i50 = zzaleVar2.zzd;
                                        int zzB3 = z10 ? zzesVar6.zzB() : i50;
                                        boolean z11 = z10;
                                        int i51 = zzB2 & 256;
                                        int i52 = zzB2 & 512;
                                        int i53 = zzB2 & 1024;
                                        int i54 = zzB2 & 2048;
                                        long[] jArr3 = zzambVar2.zzi;
                                        if (jArr3 != null) {
                                            i11 = i53;
                                            if (jArr3.length == 1 && (jArr = zzambVar2.zzj) != null) {
                                                long j7 = jArr3[0];
                                                if (j7 == 0) {
                                                    i12 = i50;
                                                    i13 = zzB3;
                                                } else {
                                                    i12 = i50;
                                                    i13 = zzB3;
                                                }
                                                j5 = jArr[0];
                                                int[] iArr = zzamdVar2.zzh;
                                                long[] jArr4 = zzamdVar2.zzi;
                                                boolean[] zArr = zzamdVar2.zzj;
                                                int i55 = i12;
                                                boolean z12 = (zzambVar2.zzb == 2 || (i & 1) == 0) ? false : true;
                                                i14 = i49 + zzamdVar2.zzg[i48];
                                                long j8 = zzambVar2.zzc;
                                                long j9 = zzamdVar2.zzp;
                                                i15 = i49;
                                                while (i15 < i14) {
                                                    if (i51 != 0) {
                                                        z3 = z12;
                                                        i16 = zzesVar6.zzB();
                                                    } else {
                                                        z3 = z12;
                                                        i16 = zzaleVar2.zzb;
                                                    }
                                                    zzk(i16);
                                                    if (i52 != 0) {
                                                        i17 = i15;
                                                        i18 = zzesVar6.zzB();
                                                    } else {
                                                        i17 = i15;
                                                        i18 = zzaleVar2.zzc;
                                                    }
                                                    zzk(i18);
                                                    if (i11 != 0) {
                                                        i19 = zzesVar6.zzB();
                                                    } else {
                                                        if (i17 == 0) {
                                                            if (z11) {
                                                                i19 = i13;
                                                                i17 = 0;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                        }
                                                        i19 = i55;
                                                    }
                                                    if (i54 != 0) {
                                                        i20 = i18;
                                                        i21 = zzesVar6.zzB();
                                                    } else {
                                                        i20 = i18;
                                                        i21 = 0;
                                                    }
                                                    zzale zzaleVar3 = zzaleVar2;
                                                    long zzv = zzfk.zzv((i21 + j9) - j5, 1000000L, j8, RoundingMode.DOWN);
                                                    jArr4[i17] = zzv;
                                                    if (!zzamdVar2.zzq) {
                                                        jArr4[i17] = zzv + zzaljVar.zzd.zzi;
                                                    }
                                                    iArr[i17] = i20;
                                                    if (((i19 >> 16) & 1) == 0) {
                                                        if (!z3) {
                                                            z4 = true;
                                                        } else if (i17 == 0) {
                                                            z4 = true;
                                                            i17 = 0;
                                                        }
                                                        zArr[i17] = z4;
                                                        j9 += i16;
                                                        i15 = i17 + 1;
                                                        z12 = z3;
                                                        zzaleVar2 = zzaleVar3;
                                                    }
                                                    z4 = false;
                                                    zArr[i17] = z4;
                                                    j9 += i16;
                                                    i15 = i17 + 1;
                                                    z12 = z3;
                                                    zzaleVar2 = zzaleVar3;
                                                }
                                                zzamdVar2.zzp = j9;
                                                i46 = i14;
                                                i45 = i47;
                                            }
                                        } else {
                                            i11 = i53;
                                        }
                                        i12 = i50;
                                        i13 = zzB3;
                                        int[] iArr2 = zzamdVar2.zzh;
                                        long[] jArr42 = zzamdVar2.zzi;
                                        boolean[] zArr2 = zzamdVar2.zzj;
                                        int i552 = i12;
                                        if (zzambVar2.zzb == 2) {
                                        }
                                        i14 = i49 + zzamdVar2.zzg[i48];
                                        long j82 = zzambVar2.zzc;
                                        long j92 = zzamdVar2.zzp;
                                        i15 = i49;
                                        while (i15 < i14) {
                                        }
                                        zzamdVar2.zzp = j92;
                                        i46 = i14;
                                        i45 = i47;
                                    } else {
                                        i9 = i44;
                                        i10 = i36;
                                    }
                                    i44 = i9 + 1;
                                    i36 = i10;
                                    i7 = Atom.TYPE_trun;
                                }
                                i3 = i36;
                                zzamb zzambVar3 = zzaljVar.zzd.zza;
                                zzale zzaleVar4 = zzamdVar2.zza;
                                zzaleVar4.getClass();
                                zzamc zza4 = zzambVar3.zza(zzaleVar4.zza);
                                zzfx zzc6 = zzfwVar2.zzc(Atom.TYPE_saiz);
                                if (zzc6 != null) {
                                    zza4.getClass();
                                    int i56 = zza4.zzd;
                                    zzes zzesVar7 = zzc6.zza;
                                    zzesVar7.zzh(8);
                                    if ((zzesVar7.zzB() & 1) == 1) {
                                        zzesVar7.zzk(8);
                                    }
                                    int zzs = zzesVar7.zzs();
                                    int zzH2 = zzesVar7.zzH();
                                    int i57 = zzamdVar2.zze;
                                    if (zzH2 > i57) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzH2).length() + 56 + String.valueOf(i57).length());
                                        sb.append("Saiz sample count ");
                                        sb.append(zzH2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i57);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    if (zzs == 0) {
                                        boolean[] zArr3 = zzamdVar2.zzl;
                                        i8 = 0;
                                        for (int i58 = 0; i58 < zzH2; i58++) {
                                            int zzs2 = zzesVar7.zzs();
                                            i8 += zzs2;
                                            zArr3[i58] = zzs2 > i56;
                                        }
                                        z2 = false;
                                    } else {
                                        boolean z13 = zzs > i56;
                                        i8 = zzs * zzH2;
                                        z2 = false;
                                        Arrays.fill(zzamdVar2.zzl, 0, zzH2, z13);
                                    }
                                    Arrays.fill(zzamdVar2.zzl, zzH2, zzamdVar2.zze, z2);
                                    if (i8 > 0) {
                                        zzamdVar2.zza(i8);
                                    }
                                }
                                zzfx zzc7 = zzfwVar2.zzc(Atom.TYPE_saio);
                                if (zzc7 != null) {
                                    zzes zzesVar8 = zzc7.zza;
                                    zzesVar8.zzh(8);
                                    int zzB4 = zzesVar8.zzB();
                                    if ((zzB4 & 1) == 1) {
                                        zzesVar8.zzk(8);
                                    }
                                    int zzH3 = zzesVar8.zzH();
                                    if (zzH3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzH3).length() + 29);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(zzH3);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    zzamdVar2.zzc += zzald.zza(zzB4) == 0 ? zzesVar8.zzz() : zzesVar8.zzJ();
                                }
                                zzfx zzc8 = zzfwVar2.zzc(Atom.TYPE_senc);
                                if (zzc8 != null) {
                                    zzl(zzc8.zza, 0, zzamdVar2);
                                }
                                String str3 = zza4 != null ? zza4.zzb : null;
                                zzes zzesVar9 = null;
                                zzes zzesVar10 = null;
                                for (int i59 = 0; i59 < list4.size(); i59++) {
                                    zzfx zzfxVar4 = (zzfx) list4.get(i59);
                                    zzes zzesVar11 = zzfxVar4.zza;
                                    int i60 = zzfxVar4.zzd;
                                    if (i60 == 1935828848) {
                                        zzesVar11.zzh(12);
                                        if (zzesVar11.zzB() == 1936025959) {
                                            zzesVar9 = zzesVar11;
                                        }
                                    } else if (i60 == 1936158820) {
                                        zzesVar11.zzh(12);
                                        if (zzesVar11.zzB() == 1936025959) {
                                            zzesVar10 = zzesVar11;
                                        }
                                    }
                                }
                                if (zzesVar9 == null || zzesVar10 == null) {
                                    z = true;
                                } else {
                                    zzesVar9.zzh(8);
                                    int zza5 = zzald.zza(zzesVar9.zzB());
                                    zzesVar9.zzk(4);
                                    if (zza5 == 1) {
                                        zzesVar9.zzk(4);
                                    }
                                    if (zzesVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzesVar10.zzh(8);
                                    int zza6 = zzald.zza(zzesVar10.zzB());
                                    zzesVar10.zzk(4);
                                    if (zza6 == 1) {
                                        if (zzesVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zza6 >= 2) {
                                        zzesVar10.zzk(4);
                                    }
                                    if (zzesVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    z = true;
                                    zzesVar10.zzk(1);
                                    int zzs3 = zzesVar10.zzs();
                                    int i61 = (zzs3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    int i62 = zzs3 & 15;
                                    if (zzesVar10.zzs() == 1) {
                                        int zzs4 = zzesVar10.zzs();
                                        int i63 = i33;
                                        byte[] bArr3 = new byte[i63];
                                        zzesVar10.zzm(bArr3, 0, i63);
                                        if (zzs4 == 0) {
                                            int zzs5 = zzesVar10.zzs();
                                            byte[] bArr4 = new byte[zzs5];
                                            zzesVar10.zzm(bArr4, 0, zzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzamdVar2.zzk = true;
                                        zzamdVar2.zzm = new zzamc(true, str3, zzs4, bArr3, i61, i62, bArr);
                                    }
                                }
                                int size5 = list4.size();
                                for (int i64 = 0; i64 < size5; i64++) {
                                    zzfx zzfxVar5 = (zzfx) list4.get(i64);
                                    if (zzfxVar5.zzd == 1970628964) {
                                        zzes zzesVar12 = zzfxVar5.zza;
                                        zzesVar12.zzh(8);
                                        zzesVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzesVar12, 16, zzamdVar2);
                                        }
                                    }
                                }
                                i4 = 8;
                                i6 = 0;
                                i5 = 16;
                                i36 = i3 + 1;
                                i24 = i4;
                                i34 = i6;
                                z7 = z;
                                i33 = i5;
                                i35 = i;
                                size3 = i2;
                                list3 = list;
                            }
                        } else {
                            i = i35;
                            list = list3;
                            i2 = size3;
                            i3 = i36;
                            i4 = i24;
                            z = z7;
                            i5 = i33;
                            i6 = i34;
                        }
                        i36 = i3 + 1;
                        i24 = i4;
                        i34 = i6;
                        z7 = z;
                        i33 = i5;
                        i35 = i;
                        size3 = i2;
                        list3 = list;
                    }
                    int i65 = i34;
                    zzq zzn2 = zzn(zzfwVar.zzb);
                    if (zzn2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i66 = i65; i66 < size6; i66++) {
                            ((zzalj) sparseArray3.valueAt(i66)).zzb(zzn2);
                        }
                    }
                    if (this.zzz != C.TIME_UNSET) {
                        int size7 = sparseArray3.size();
                        for (int i67 = i65; i67 < size7; i67++) {
                            zzalj zzaljVar2 = (zzalj) sparseArray3.valueAt(i67);
                            long j10 = this.zzz;
                            int i68 = zzaljVar2.zzf;
                            while (true) {
                                zzamd zzamdVar3 = zzaljVar2.zzb;
                                if (i68 < zzamdVar3.zze && zzamdVar3.zzi[i68] <= j10) {
                                    if (zzamdVar3.zzj[i68]) {
                                        zzaljVar2.zzi = i68;
                                    }
                                    i68++;
                                }
                            }
                        }
                        this.zzz = C.TIME_UNSET;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzfw) arrayDeque.peek()).zzb(zzfwVar);
                }
            }
        }
    }

    private static int zzk(int i) throws zzat {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzes zzesVar, int i, zzamd zzamdVar) throws zzat {
        zzesVar.zzh(i + 8);
        int zzB = zzesVar.zzB();
        int i2 = zzald.zza;
        if ((zzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzB & 2) != 0;
        int zzH = zzesVar.zzH();
        if (zzH == 0) {
            Arrays.fill(zzamdVar.zzl, 0, zzamdVar.zze, false);
            return;
        }
        int i3 = zzamdVar.zze;
        if (zzH != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzH).length() + 58 + String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(zzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        Arrays.fill(zzamdVar.zzl, 0, zzH, z);
        zzamdVar.zza(zzesVar.zzd());
        zzes zzesVar2 = zzamdVar.zzn;
        zzesVar.zzm(zzesVar2.zzi(), 0, zzesVar2.zze());
        zzesVar2.zzh(0);
        zzamdVar.zzo = false;
    }

    private static Pair zzm(zzes zzesVar, long j) throws zzat {
        long zzJ;
        long zzJ2;
        zzes zzesVar2 = zzesVar;
        zzesVar2.zzh(8);
        int zza2 = zzald.zza(zzesVar2.zzB());
        zzesVar2.zzk(4);
        long zzz = zzesVar2.zzz();
        if (zza2 == 0) {
            zzJ = zzesVar2.zzz();
            zzJ2 = zzesVar2.zzz();
        } else {
            zzJ = zzesVar2.zzJ();
            zzJ2 = zzesVar2.zzJ();
        }
        long j2 = j + zzJ2;
        long zzv = zzfk.zzv(zzJ, 1000000L, zzz, RoundingMode.DOWN);
        zzesVar2.zzk(2);
        int zzt = zzesVar2.zzt();
        int[] iArr = new int[zzt];
        long[] jArr = new long[zzt];
        long[] jArr2 = new long[zzt];
        long[] jArr3 = new long[zzt];
        long j3 = j2;
        long j4 = zzv;
        int i = 0;
        while (i < zzt) {
            int zzB = zzesVar2.zzB();
            if ((Integer.MIN_VALUE & zzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long zzz2 = zzesVar2.zzz();
            iArr[i] = zzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            zzJ += zzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long zzv2 = zzfk.zzv(zzJ, 1000000L, zzz, RoundingMode.DOWN);
            jArr4[i] = zzv2 - jArr5[i];
            zzesVar2.zzk(4);
            j3 += iArr[i];
            i++;
            zzesVar2 = zzesVar;
            zzt = zzt;
            j4 = zzv2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(zzv), new zzafd(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzq zzn(List list) {
        int i;
        UUID[] uuidArr;
        zzalx zzalxVar;
        UUID uuid;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            zzfx zzfxVar = (zzfx) list.get(i2);
            if (zzfxVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzi = zzfxVar.zza.zzi();
                zzes zzesVar = new zzes(zzi);
                if (zzesVar.zze() >= 32) {
                    zzesVar.zzh(0);
                    int zzd = zzesVar.zzd();
                    int zzB = zzesVar.zzB();
                    if (zzB != zzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 52 + String.valueOf(zzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(zzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(zzd);
                        zzef.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int zzB2 = zzesVar.zzB();
                        if (zzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(zzB2);
                            zzef.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int zza2 = zzald.zza(zzesVar.zzB());
                            if (zza2 > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(zza2).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(zza2);
                                zzef.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid2 = new UUID(zzesVar.zzD(), zzesVar.zzD());
                                if (zza2 == 1) {
                                    int zzH = zzesVar.zzH();
                                    uuidArr = new UUID[zzH];
                                    int i3 = 0;
                                    while (i3 < zzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(zzesVar.zzD(), zzesVar.zzD());
                                        i3 = i4 + 1;
                                        i2 = i2;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i = i2;
                                int zzH2 = zzesVar.zzH();
                                int zzd2 = zzesVar.zzd();
                                if (zzH2 != zzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(zzH2).length() + 49 + String.valueOf(zzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(zzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(zzd2);
                                    zzef.zzc("PsshAtomUtil", sb4.toString());
                                    zzalxVar = null;
                                    uuid = zzalxVar == null ? null : zzalxVar.zza;
                                    if (uuid == null) {
                                        zzef.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                    } else {
                                        arrayList.add(new zzp(uuid, null, MimeTypes.VIDEO_MP4, zzi));
                                        i2 = i + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzH2];
                                    zzesVar.zzm(bArr, 0, zzH2);
                                    zzalxVar = new zzalx(uuid2, zza2, bArr, uuidArr);
                                    if (zzalxVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                zzalxVar = null;
                if (zzalxVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private static final zzale zzo(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzale) sparseArray.valueAt(0);
        }
        zzale zzaleVar = (zzale) sparseArray.get(i);
        zzaleVar.getClass();
        return zzaleVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzagw zza2 = zzama.zza(zzafqVar);
        this.zzr = zza2 != null ? zzgvz.zzj(zza2) : zzgvz.zzi();
        return zza2 == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzafsVar = new zzanf(zzafsVar, this.zzc);
        }
        this.zzI = zzafsVar;
        zzi();
        zzahb[] zzahbVarArr = new zzahb[2];
        this.zzJ = zzahbVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzahbVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzahb[] zzahbVarArr2 = (zzahb[]) zzfk.zzb(this.zzJ, i);
        this.zzJ = zzahbVarArr2;
        for (zzahb zzahbVar : zzahbVarArr2) {
            zzahbVar.zzA(zzb);
        }
        List list = this.zze;
        this.zzK = new zzahb[list.size()];
        while (i4 < this.zzK.length) {
            zzahb zzu = this.zzI.zzu(i3, 3);
            zzu.zzA((zzv) list.get(i4));
            this.zzK[i4] = zzu;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x009c, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x009f, code lost:
    
        if (r30.zzs != 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x00a1, code lost:
    
        r30.zzD = r2.zzf();
        r3 = r2.zzd.zza.zzg.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x00b6, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x00bc, code lost:
    
        if ((r30.zzd & 64) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x00be, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x00d1, code lost:
    
        r30.zzG = !r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x00d8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x00da, code lost:
    
        r31.zzf(r30.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x00e3, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x00e6, code lost:
    
        r3 = r2.zzb;
        r5 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00ec, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00ee, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x00f7, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x00f9, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0106, code lost:
    
        if (r2.zzh() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0108, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x010a, code lost:
    
        r30.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x010c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0116, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0118, code lost:
    
        r30.zzD -= 8;
        r31.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x012f, code lost:
    
        if (com.google.android.exoplayer2.util.MimeTypes.AUDIO_AC4.equals(r2.zzd.zza.zzg.zzp) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0131, code lost:
    
        r30.zzE = r2.zzi(r30.zzD, 7);
        r3 = r30.zzD;
        r8 = r30.zzk;
        com.google.android.gms.internal.ads.zzaet.zzc(r3, r8);
        r2.zza.zzc(r8, 7);
        r3 = r30.zzE + 7;
        r30.zzE = r3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0156, code lost:
    
        r30.zzD += r3;
        r30.zzs = 4;
        r30.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x014d, code lost:
    
        r6 = 0;
        r3 = r2.zzi(r30.zzD, 0);
        r30.zzE = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x00d0, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x00c7, code lost:
    
        if (java.util.Objects.equals(r3, "video/hevc") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00cd, code lost:
    
        if ((r30.zzd & 128) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x015f, code lost:
    
        r3 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x016b, code lost:
    
        if (r8 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x016d, code lost:
    
        r3 = r30.zzE;
        r5 = r30.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0171, code lost:
    
        if (r3 >= r5) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0173, code lost:
    
        r30.zzE += r6.zza(r31, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0283, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0289, code lost:
    
        if (r30.zzG != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x028b, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x028e, code lost:
    
        r22 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0294, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0296, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x029d, code lost:
    
        r6.zze(r10, r22, r30.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x02aa, code lost:
    
        r1 = r30.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x02b0, code lost:
    
        if (r1.isEmpty() != false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x02b2, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzali) r1.removeFirst();
        r3 = r30.zzy;
        r8 = r1.zzc;
        r30.zzy = r3 - r8;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x02c3, code lost:
    
        if (r1.zzb == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x02c5, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x02c7, code lost:
    
        r5 = r3;
        r1 = r30.zzJ;
        r3 = r1.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x02cc, code lost:
    
        if (r11 >= r3) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x02ce, code lost:
    
        r1[r11].zze(r5, 1, r8, r30.zzy, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x02de, code lost:
    
        if (r2.zzh() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x02e0, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x02e3, code lost:
    
        r30.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x029b, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x017f, code lost:
    
        r13 = r30.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[r17] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0192, code lost:
    
        if (r30.zzE >= r30.zzD) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0194, code lost:
    
        r4 = r30.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0196, code lost:
    
        if (r4 != 0) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x019b, code lost:
    
        if (r30.zzK.length > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x019f, code lost:
    
        if (r30.zzG != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01b0, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01b1, code lost:
    
        r31.zzc(r14, r12, r8 + r4);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01be, code lost:
    
        if (r9 < 0) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01c0, code lost:
    
        r30.zzF = r9 - r4;
        r9 = r30.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r30.zzE += r5;
        r30.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01d8, code lost:
    
        if (r30.zzK.length <= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01da, code lost:
    
        if (r4 <= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01e2, code lost:
    
        if (com.google.android.gms.internal.ads.zzgo.zzb(r3.zzg, r14, r5) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01e4, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01e7, code lost:
    
        r30.zzH = r7;
        r6.zzc(r13, r4);
        r30.zzE += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01f1, code lost:
    
        if (r4 <= 0) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01f5, code lost:
    
        if (r30.zzG != false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x01fd, code lost:
    
        if (com.google.android.gms.internal.ads.zzgo.zzd(r14, r5, r4, r3.zzg) == false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01ff, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x01e6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x020d, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x01a1, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgo.zzc(r3.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x01ae, code lost:
    
        if ((r8 + r4) <= (r30.zzD - r30.zzE)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0210, code lost:
    
        if (r30.zzH == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0212, code lost:
    
        r7 = r30.zzi;
        r7.zza(r4);
        r31.zzc(r7.zzi(), 0, r30.zzF);
        r6.zzc(r7, r30.zzF);
        r4 = r30.zzF;
        r32 = r5;
        r5 = com.google.android.gms.internal.ads.zzgo.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r3.zzg.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0241, code lost:
    
        if (r5 != (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0243, code lost:
    
        r5 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0249, code lost:
    
        if (r5.zzb() == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x024b, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x025a, code lost:
    
        r5 = r30.zzp;
        r5.zzc(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0265, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0267, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0272, code lost:
    
        r30.zzE += r4;
        r30.zzF -= r4;
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x024f, code lost:
    
        r9 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0255, code lost:
    
        if (r9.zzb() == r5) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0257, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x026b, code lost:
    
        r32 = r5;
        r4 = r6.zza(r31, r4, false);
     */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        char c;
        String zzM;
        String zzM2;
        long zzv;
        long zzz;
        long j;
        long j2;
        while (true) {
            int i = this.zzs;
            char c2 = 2;
            if (i == 0) {
                if (this.zzv == 0) {
                    zzes zzesVar = this.zzm;
                    if (!zzafqVar.zzb(zzesVar.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzagpVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzesVar.zzh(0);
                    this.zzu = zzesVar.zzz();
                    this.zzt = zzesVar.zzB();
                }
                long j3 = this.zzu;
                if (j3 == 1) {
                    zzes zzesVar2 = this.zzm;
                    zzafqVar.zzc(zzesVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzesVar2.zzJ();
                } else if (j3 == 0) {
                    long zzo = zzafqVar.zzo();
                    if (zzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        zzo = !arrayDeque.isEmpty() ? ((zzfw) arrayDeque.peek()).zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzu = (zzo - zzafqVar.zzn()) + this.zzv;
                    }
                }
                long j4 = this.zzu;
                int i2 = this.zzv;
                long j5 = i2;
                if (j4 < j5) {
                    if (this.zzt != 1718773093 || i2 != 8) {
                        break;
                    }
                    this.zzu = j5;
                    j4 = j5;
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzes zzesVar3 = this.zzk;
                        zzesVar3.zza((int) j4);
                        System.arraycopy(this.zzm.zzi(), 0, zzesVar3.zzi(), 0, 8);
                        zzafqVar.zzc(zzesVar3.zzi(), 8, (int) (this.zzu - this.zzv));
                        this.zzq.zza((zzafd) zzm(new zzfx(Atom.TYPE_sidx, zzesVar3).zza, zzafqVar.zzm()).second);
                    } else {
                        zzafqVar.zze((int) (j4 - j5), true);
                    }
                    zzi();
                } else {
                    long zzn = zzafqVar.zzn() - j5;
                    int i3 = this.zzt;
                    if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzagr(this.zzA, zzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            zzamd zzamdVar = ((zzalj) sparseArray.valueAt(i4)).zzb;
                            zzamdVar.zzc = zzn;
                            zzamdVar.zzb = zzn;
                        }
                    }
                    int i5 = this.zzt;
                    if (i5 == 1835295092) {
                        this.zzC = null;
                        this.zzx = zzn + this.zzu;
                        this.zzs = 2;
                    } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227 || i5 == 1835365473) {
                        long zzn2 = zzafqVar.zzn();
                        long j6 = this.zzu;
                        long j7 = zzn2 + j6;
                        if (j6 != this.zzv && i5 == 1835365473) {
                            zzes zzesVar4 = this.zzk;
                            zzesVar4.zza(8);
                            zzafqVar.zzi(zzesVar4.zzi(), 0, 8);
                            zzald.zzf(zzesVar4);
                            zzafqVar.zzf(zzesVar4.zzg());
                            zzafqVar.zzl();
                        }
                        long j8 = j7 - 8;
                        this.zzn.push(new zzfw(this.zzt, j8));
                        if (this.zzu == this.zzv) {
                            zzj(j8);
                        } else {
                            zzi();
                        }
                    } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783 || i5 == 1969517665 || i5 == 1801812339 || i5 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzes zzesVar5 = new zzes((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzesVar5.zzi(), 0, 8);
                        this.zzw = zzesVar5;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i != 1) {
                long j9 = Long.MAX_VALUE;
                if (i != 2) {
                    zzalj zzaljVar = this.zzC;
                    if (zzaljVar != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j10 = Long.MAX_VALUE;
                    int i6 = 0;
                    zzalj zzaljVar2 = null;
                    while (i6 < size2) {
                        char c3 = c2;
                        zzalj zzaljVar3 = (zzalj) sparseArray2.valueAt(i6);
                        if ((zzaljVar3.zzk() || zzaljVar3.zzf != zzaljVar3.zzd.zzb) && (!zzaljVar3.zzk() || zzaljVar3.zzh != zzaljVar3.zzb.zzd)) {
                            long zze = zzaljVar3.zze();
                            if (zze < j10) {
                                zzaljVar2 = zzaljVar3;
                                j10 = zze;
                            }
                        }
                        i6++;
                        c2 = c3;
                    }
                    c = c2;
                    if (zzaljVar2 == null) {
                        int zzn3 = (int) (this.zzx - zzafqVar.zzn());
                        if (zzn3 < 0) {
                            throw zzat.zzb("Offset to end of mdat was negative.", null);
                        }
                        zzafqVar.zzf(zzn3);
                        zzi();
                    } else {
                        int zze2 = (int) (zzaljVar2.zze() - zzafqVar.zzn());
                        if (zze2 < 0) {
                            zzef.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zze2 = 0;
                        }
                        zzafqVar.zzf(zze2);
                        this.zzC = zzaljVar2;
                        zzaljVar = zzaljVar2;
                    }
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzalj zzaljVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzamd zzamdVar2 = ((zzalj) sparseArray3.valueAt(i7)).zzb;
                        if (zzamdVar2.zzo) {
                            long j11 = zzamdVar2.zzc;
                            if (j11 < j9) {
                                zzaljVar4 = (zzalj) sparseArray3.valueAt(i7);
                                j9 = j11;
                            }
                        }
                    }
                    if (zzaljVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int zzn4 = (int) (j9 - zzafqVar.zzn());
                        if (zzn4 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzafqVar.zzf(zzn4);
                        zzamd zzamdVar3 = zzaljVar4.zzb;
                        zzes zzesVar6 = zzamdVar3.zzn;
                        zzafqVar.zzc(zzesVar6.zzi(), 0, zzesVar6.zze());
                        zzesVar6.zzh(0);
                        zzamdVar3.zzo = false;
                    }
                }
            } else {
                long j12 = this.zzu - this.zzv;
                zzes zzesVar7 = this.zzw;
                int i8 = (int) j12;
                if (zzesVar7 != null) {
                    zzafqVar.zzc(zzesVar7.zzi(), 8, i8);
                    zzfx zzfxVar = new zzfx(this.zzt, zzesVar7);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i9 = zzfxVar.zzd;
                        if (i9 == 1936286840) {
                            Pair zzm = zzm(zzfxVar.zza, zzafqVar.zzn());
                            this.zzq.zza((zzafd) zzm.second);
                            this.zzB = ((Long) zzm.first).longValue();
                            if (!this.zzL) {
                                this.zzI.zzw((zzags) zzm.second);
                                this.zzL = true;
                            }
                        } else if (i9 == 1701671783) {
                            zzes zzesVar8 = zzfxVar.zza;
                            if (this.zzJ.length != 0) {
                                zzesVar8.zzh(8);
                                int zza2 = zzald.zza(zzesVar8.zzB());
                                if (zza2 == 0) {
                                    zzM = zzesVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzesVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    long zzz2 = zzesVar8.zzz();
                                    long zzv2 = zzfk.zzv(zzesVar8.zzz(), 1000000L, zzz2, RoundingMode.DOWN);
                                    long j13 = this.zzB;
                                    long j14 = j13 != C.TIME_UNSET ? j13 + zzv2 : -9223372036854775807L;
                                    zzv = zzfk.zzv(zzesVar8.zzz(), 1000L, zzz2, RoundingMode.DOWN);
                                    zzz = zzesVar8.zzz();
                                    j = zzv2;
                                    j2 = j14;
                                } else if (zza2 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(zza2);
                                    zzef.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long zzz3 = zzesVar8.zzz();
                                    long zzv3 = zzfk.zzv(zzesVar8.zzJ(), 1000000L, zzz3, RoundingMode.DOWN);
                                    long zzv4 = zzfk.zzv(zzesVar8.zzz(), 1000L, zzz3, RoundingMode.DOWN);
                                    long zzz4 = zzesVar8.zzz();
                                    zzM = zzesVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzesVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    zzv = zzv4;
                                    zzz = zzz4;
                                    j = -9223372036854775807L;
                                    j2 = zzv3;
                                }
                                String str = zzM;
                                String str2 = zzM2;
                                byte[] bArr = new byte[zzesVar8.zzd()];
                                zzesVar8.zzm(bArr, 0, zzesVar8.zzd());
                                zzes zzesVar9 = new zzes(this.zzl.zza(new zzait(str, str2, zzv, zzz, bArr)));
                                int zzd = zzesVar9.zzd();
                                for (zzahb zzahbVar : this.zzJ) {
                                    zzesVar9.zzh(0);
                                    zzahbVar.zzc(zzesVar9, zzd);
                                }
                                if (j2 == C.TIME_UNSET) {
                                    this.zzo.addLast(new zzali(j, true, zzd));
                                    this.zzy += zzd;
                                } else {
                                    ArrayDeque arrayDeque3 = this.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzahb zzahbVar2 : this.zzJ) {
                                            zzahbVar2.zze(j2, 1, zzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzali(j2, false, zzd));
                                        this.zzy += zzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfw) arrayDeque2.peek()).zza(zzfxVar);
                    }
                } else {
                    zzafqVar.zzf(i8);
                }
                zzj(zzafqVar.zzn());
            }
        }
        throw zzat.zzc("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzalj) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    final /* synthetic */ void zzh(long j, zzes zzesVar) {
        zzafc.zza(j, zzesVar, this.zzK);
    }

    public zzalk(zzanc zzancVar, int i, zzfh zzfhVar, zzamb zzambVar, List list, zzahb zzahbVar) {
        this.zzc = zzancVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzaiu();
        this.zzm = new zzes(16);
        this.zzg = new zzes(zzgo.zza);
        this.zzh = new zzes(6);
        this.zzi = new zzes();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzes(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgvz.zzi();
        this.zzA = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzI = zzafs.zza;
        this.zzJ = new zzahb[0];
        this.zzK = new zzahb[0];
        this.zzp = new zzgy(new zzgx() { // from class: com.google.android.gms.internal.ads.zzalh
            @Override // com.google.android.gms.internal.ads.zzgx
            public final /* synthetic */ void zza(long j, zzes zzesVar) {
                zzalk.this.zzh(j, zzesVar);
            }
        });
        this.zzq = new zzafe();
        this.zzM = -1L;
    }
}
