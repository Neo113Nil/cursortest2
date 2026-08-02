package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzama {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzagw zza(zzafq zzafqVar) throws IOException {
        return zzc(zzafqVar, true, false);
    }

    public static zzagw zzb(zzafq zzafqVar, boolean z) throws IOException {
        return zzc(zzafqVar, false, z);
    }

    private static zzagw zzc(zzafq zzafqVar, boolean z, boolean z2) throws IOException {
        zzagw zzagwVar;
        long j;
        zzes zzesVar;
        int i;
        int i2;
        zzes zzesVar2;
        long j2;
        int i3;
        int[] iArr;
        long zzo = zzafqVar.zzo();
        long j3 = -1;
        long j4 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (zzo != -1 && zzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j4 = zzo;
        }
        zzes zzesVar3 = new zzes(64);
        int i4 = (int) j4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            zzesVar3.zza(8);
            if (!zzafqVar.zzh(zzesVar3.zzi(), i5, 8, true)) {
                break;
            }
            long zzz = zzesVar3.zzz();
            int zzB = zzesVar3.zzB();
            if (zzz == 1) {
                j = j3;
                zzafqVar.zzi(zzesVar3.zzi(), 8, 8);
                i = 16;
                zzesVar3.zzf(16);
                zzz = zzesVar3.zzD();
                zzesVar = zzesVar3;
            } else {
                j = j3;
                if (zzz == 0) {
                    long zzo2 = zzafqVar.zzo();
                    if (zzo2 != j) {
                        zzz = (zzo2 - zzafqVar.zzm()) + 8;
                    }
                }
                zzesVar = zzesVar3;
                i = 8;
            }
            long j5 = zzz;
            zzagwVar = null;
            long j6 = i;
            if (j5 < j6) {
                i2 = 1;
                if (zzB == 1718773093) {
                    if (i == 8) {
                        j5 = 8;
                        zzB = 1718773093;
                    } else {
                        zzB = 1718773093;
                    }
                }
                return new zzakr(zzB, j5, i);
            }
            i2 = 1;
            i6 += i;
            if (zzB != 1836019574) {
                if (zzB == 1970628964) {
                    zzB = 1970628964;
                } else {
                    zzesVar2 = zzesVar;
                    if (zzB != 1953653099 || zzB == 1835297121 || zzB == 1835626086) {
                        j2 = zzo;
                        i3 = 0;
                    } else {
                        if (zzB == 1836019558 || zzB == 1836475768) {
                            i5 = i2;
                            break;
                        }
                        i7 |= (zzB == 1835295092 ? 0 : i2) ^ 1;
                        if (zzB == 1937007212) {
                            if (j5 > 1000000) {
                                i5 = 0;
                                break;
                            }
                            zzB = 1937007212;
                        }
                        j2 = zzo;
                        if ((i6 + j5) - j6 >= i4) {
                            i5 = 0;
                            break;
                        }
                        int i8 = (int) (j5 - j6);
                        i6 += i8;
                        if (zzB != 1718909296) {
                            i3 = 0;
                            if (i8 != 0) {
                                zzafqVar.zzk(i8);
                            }
                        } else {
                            if (i8 < 8) {
                                return new zzakr(Atom.TYPE_ftyp, i8, 8);
                            }
                            zzesVar2.zza(i8);
                            i3 = 0;
                            zzafqVar.zzi(zzesVar2.zzi(), 0, i8);
                            int zzB2 = zzesVar2.zzB();
                            int i9 = (zzd(zzB2, z2) ? 1 : 0) | i7;
                            zzesVar2.zzk(4);
                            int zzd = zzesVar2.zzd() / 4;
                            if (i9 == 0 && zzd > 0) {
                                iArr = new int[zzd];
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= zzd) {
                                        break;
                                    }
                                    int zzB3 = zzesVar2.zzB();
                                    iArr[i10] = zzB3;
                                    if (zzd(zzB3, z2)) {
                                        i9 = i2;
                                        break;
                                    }
                                    i10++;
                                }
                            } else {
                                iArr = null;
                            }
                            if (i9 == 0) {
                                return new zzamf(zzB2, iArr);
                            }
                            i7 = i9;
                        }
                    }
                    i5 = i3;
                    zzesVar3 = zzesVar2;
                    zzo = j2;
                    j3 = j;
                }
            }
            i4 += (int) j5;
            zzesVar2 = zzesVar;
            if (zzo != -1 && i4 > zzo) {
                i4 = (int) zzo;
            }
            if (zzB == 1836019574) {
                zzesVar3 = zzesVar2;
                j3 = j;
                i5 = 0;
            } else {
                if (zzB != 1953653099) {
                }
                j2 = zzo;
                i3 = 0;
                i5 = i3;
                zzesVar3 = zzesVar2;
                zzo = j2;
                j3 = j;
            }
        }
        zzagwVar = null;
        return i7 == 0 ? zzalw.zza : z != i5 ? i5 != 0 ? zzall.zza : zzall.zzb : zzagwVar;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
