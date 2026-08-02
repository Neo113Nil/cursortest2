package b2;

import H1.InterfaceC1184q;
import H1.N;
import e1.J;

/* loaded from: classes.dex */
public abstract class s {
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : COMPATIBLE_BRANDS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static N b(InterfaceC1184q interfaceC1184q) {
        return c(interfaceC1184q, true, false);
    }

    public static N c(InterfaceC1184q interfaceC1184q, boolean z10, boolean z11) {
        N n10;
        int i10;
        long j10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        long length = interfaceC1184q.getLength();
        long j11 = -1;
        long j12 = 4096;
        if (length != -1 && length <= 4096) {
            j12 = length;
        }
        int i14 = (int) j12;
        J j13 = new J(64);
        int i15 = 0;
        int i16 = 0;
        boolean z12 = false;
        while (i16 < i14) {
            j13.X(8);
            boolean z13 = true;
            if (!interfaceC1184q.e(j13.f(), i15, 8, true)) {
                break;
            }
            long O10 = j13.O();
            int v10 = j13.v();
            if (O10 == 1) {
                j10 = j11;
                interfaceC1184q.n(j13.f(), 8, 8);
                i12 = 16;
                j13.a0(16);
                O10 = j13.F();
                i11 = i16;
            } else {
                j10 = j11;
                if (O10 == 0) {
                    long length2 = interfaceC1184q.getLength();
                    if (length2 != j10) {
                        i11 = i16;
                        O10 = (length2 - interfaceC1184q.i()) + 8;
                        i12 = 8;
                    }
                }
                i11 = i16;
                i12 = 8;
            }
            long j14 = O10;
            long j15 = i12;
            if (j14 < j15) {
                return new C2371a(v10, j14, i12);
            }
            int i17 = i11 + i12;
            n10 = null;
            if (v10 == 1836019574) {
                i14 += (int) j14;
                if (length != -1 && i14 > length) {
                    i14 = (int) length;
                }
                i16 = i17;
                j11 = j10;
                i15 = 0;
            } else {
                if (v10 == 1836019558 || v10 == 1836475768) {
                    i10 = 1;
                    break;
                }
                if (v10 == 1835295092) {
                    z12 = true;
                }
                long j16 = length;
                if ((i17 + j14) - j15 >= i14) {
                    i10 = 0;
                    break;
                }
                int i18 = (int) (j14 - j15);
                i16 = i17 + i18;
                if (v10 != 1718909296) {
                    i13 = 0;
                    if (i18 != 0) {
                        interfaceC1184q.j(i18);
                    }
                } else {
                    if (i18 < 8) {
                        return new C2371a(v10, i18, 8);
                    }
                    j13.X(i18);
                    i13 = 0;
                    interfaceC1184q.n(j13.f(), 0, i18);
                    int v11 = j13.v();
                    if (a(v11, z11)) {
                        z12 = true;
                    }
                    j13.c0(4);
                    int a10 = j13.a() / 4;
                    if (!z12 && a10 > 0) {
                        iArr = new int[a10];
                        int i19 = 0;
                        while (true) {
                            if (i19 >= a10) {
                                z13 = z12;
                                break;
                            }
                            int v12 = j13.v();
                            iArr[i19] = v12;
                            if (a(v12, z11)) {
                                break;
                            }
                            i19++;
                        }
                    } else {
                        z13 = z12;
                        iArr = null;
                    }
                    if (!z13) {
                        return new x(v11, iArr);
                    }
                    z12 = z13;
                }
                i15 = i13;
                j11 = j10;
                length = j16;
            }
        }
        n10 = null;
        i10 = i15;
        return !z12 ? o.f24937a : z10 != i10 ? i10 != 0 ? C2379i.f24897b : C2379i.f24898c : n10;
    }

    public static N d(InterfaceC1184q interfaceC1184q, boolean z10) {
        return c(interfaceC1184q, false, z10);
    }
}
