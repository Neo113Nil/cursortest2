package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzamu {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00cd, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0088, code lost:
    
        return new com.google.android.gms.internal.ads.zzalj(r13, r3, r15);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaho a(zzagi zzagiVar, boolean z) {
        zzaho zzahoVar;
        long j;
        zzeu zzeuVar;
        int i;
        int i2;
        zzeu zzeuVar2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        long zzo = zzagiVar.zzo();
        long j2 = -1;
        long j3 = 4096;
        if (zzo != -1 && zzo <= 4096) {
            j3 = zzo;
        }
        zzeu zzeuVar3 = new zzeu(64);
        int i6 = (int) j3;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= i6) {
                zzahoVar = null;
                break;
            }
            zzeuVar3.y(8);
            if (!zzagiVar.f(zzeuVar3.a, i7, 8, true)) {
                zzahoVar = null;
                break;
            }
            long N = zzeuVar3.N();
            int b = zzeuVar3.b();
            if (N == 1) {
                zzagiVar.h(8, 8, zzeuVar3.a);
                i = 16;
                zzeuVar3.C(16);
                j = zzeuVar3.d();
                zzeuVar = zzeuVar3;
            } else {
                if (N == 0) {
                    long zzo2 = zzagiVar.zzo();
                    if (zzo2 != j2) {
                        N = (zzo2 - zzagiVar.zzm()) + 8;
                    }
                }
                j = N;
                zzeuVar = zzeuVar3;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                zzahoVar = null;
                if (b != 1718773093) {
                    break;
                }
                if (i != 8) {
                    b = 1718773093;
                    break;
                }
                b = 1718773093;
                j = 8;
            } else {
                zzahoVar = null;
            }
            i8 += i;
            if (b != 1836019574) {
                if (b == 1970628964) {
                    b = 1970628964;
                } else {
                    i2 = 1;
                    if (b != 1953653099 || b == 1835297121 || b == 1835626086) {
                        zzeuVar2 = zzeuVar;
                    } else {
                        if (b == 1836019558 || b == 1836475768) {
                            break;
                        }
                        i9 |= (b == 1835295092 ? 0 : i2) ^ 1;
                        if (b == 1937007212) {
                            if (j > 1000000) {
                                break;
                            }
                            b = 1937007212;
                        }
                        int i10 = b;
                        if ((i8 + j) - j4 >= i6) {
                            break;
                        }
                        int i11 = (int) (j - j4);
                        i8 += i11;
                        if (i10 != 1718909296) {
                            zzeuVar2 = zzeuVar;
                            if (i11 != 0) {
                                zzagiVar.d(i11);
                            }
                        } else {
                            if (i11 < 8) {
                                return new zzalj(1718909296, i11, 8);
                            }
                            zzeuVar2 = zzeuVar;
                            zzeuVar2.y(i11);
                            zzagiVar.h(0, i11, zzeuVar2.a);
                            int b2 = zzeuVar2.b();
                            int i12 = b2 >>> 8;
                            int[] iArr2 = a;
                            int i13 = 3368816;
                            if (i12 != 3368816) {
                                for (int i14 = 0; i14 < 29; i14++) {
                                    if (iArr2[i14] != b2) {
                                    }
                                }
                                i3 = 0;
                                i4 = i3 | i9;
                                zzeuVar2.E(4);
                                int B = zzeuVar2.B() / 4;
                                if (i4 == 0 || B <= 0) {
                                    i5 = i4;
                                    iArr = zzahoVar;
                                } else {
                                    int[] iArr3 = new int[B];
                                    int i15 = 0;
                                    while (i15 < B) {
                                        int b3 = zzeuVar2.b();
                                        iArr3[i15] = b3;
                                        if ((b3 >>> 8) != i13) {
                                            for (int i16 = 0; i16 < 29; i16++) {
                                                if (iArr2[i16] != b3) {
                                                }
                                            }
                                            i15++;
                                            i13 = 3368816;
                                        }
                                        iArr = iArr3;
                                        i5 = i2;
                                        break;
                                    }
                                    i5 = i4;
                                    iArr = iArr3;
                                }
                                if (i5 != 0) {
                                    return new zzana(b2, iArr);
                                }
                                i9 = i5;
                            }
                            i3 = i2;
                            i4 = i3 | i9;
                            zzeuVar2.E(4);
                            int B2 = zzeuVar2.B() / 4;
                            if (i4 == 0) {
                            }
                            i5 = i4;
                            iArr = zzahoVar;
                            if (i5 != 0) {
                            }
                        }
                    }
                    zzeuVar3 = zzeuVar2;
                    j2 = -1;
                    i7 = 0;
                }
            }
            i6 += (int) j;
            i2 = 1;
            if (zzo != -1 && i6 > zzo) {
                i6 = (int) zzo;
            }
            if (b == 1836019574) {
                zzeuVar3 = zzeuVar;
                j2 = -1;
                i7 = 0;
            }
            if (b != 1953653099) {
            }
            zzeuVar2 = zzeuVar;
            zzeuVar3 = zzeuVar2;
            j2 = -1;
            i7 = 0;
        }
        i7 = 0;
        return i9 == 0 ? zzamq.a : z != i7 ? i7 != 0 ? zzame.b : zzame.c : zzahoVar;
    }
}
