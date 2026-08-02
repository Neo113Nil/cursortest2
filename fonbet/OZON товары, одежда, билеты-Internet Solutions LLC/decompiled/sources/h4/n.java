package h4;

import N3.C3659j;
import N3.L;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f64909a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i11, boolean z11) {
        if ((i11 >>> 8) == 3368816) {
            return true;
        }
        if (i11 == 1751476579 && z11) {
            return true;
        }
        int[] iArr = f64909a;
        for (int i12 = 0; i12 < 29; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    public static L b(C3659j c3659j) throws IOException {
        return c(c3659j, true, false);
    }

    private static L c(N3.q qVar, boolean z11, boolean z12) throws IOException {
        L l11;
        int i11;
        long j11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        long length = qVar.getLength();
        long j12 = -1;
        long j13 = 4096;
        if (length != -1 && length <= 4096) {
            j13 = length;
        }
        int i15 = (int) j13;
        C8050C c8050c = new C8050C(64);
        int i16 = 0;
        int i17 = 0;
        boolean z13 = false;
        while (i17 < i15) {
            c8050c.O(8);
            boolean z14 = true;
            if (!qVar.d(c8050c.e(), i16, 8, true)) {
                break;
            }
            long G11 = c8050c.G();
            int p11 = c8050c.p();
            if (G11 == 1) {
                j11 = j12;
                qVar.a(8, 8, c8050c.e());
                i13 = 16;
                c8050c.Q(16);
                G11 = c8050c.y();
                i12 = i17;
            } else {
                j11 = j12;
                if (G11 == 0) {
                    long length2 = qVar.getLength();
                    if (length2 != j11) {
                        i12 = i17;
                        G11 = (length2 - qVar.f()) + 8;
                        i13 = 8;
                    }
                }
                i12 = i17;
                i13 = 8;
            }
            long j14 = G11;
            long j15 = i13;
            if (j14 < j15) {
                return new com.google.common.primitives.f();
            }
            int i18 = i12 + i13;
            l11 = null;
            if (p11 == 1836019574) {
                i15 += (int) j14;
                if (length != -1 && i15 > length) {
                    i15 = (int) length;
                }
                i17 = i18;
                j12 = j11;
                i16 = 0;
            } else {
                if (p11 == 1836019558 || p11 == 1836475768) {
                    i11 = 1;
                    break;
                }
                if (p11 == 1835295092) {
                    z13 = true;
                }
                long j16 = length;
                if ((i18 + j14) - j15 >= i15) {
                    i11 = 0;
                    break;
                }
                int i19 = (int) (j14 - j15);
                i17 = i18 + i19;
                if (p11 != 1718909296) {
                    i14 = 0;
                    if (i19 != 0) {
                        qVar.g(i19);
                    }
                } else {
                    if (i19 < 8) {
                        return new com.google.common.primitives.f();
                    }
                    c8050c.O(i19);
                    i14 = 0;
                    qVar.a(0, i19, c8050c.e());
                    if (a(c8050c.p(), z12)) {
                        z13 = true;
                    }
                    c8050c.S(4);
                    int a11 = c8050c.a() / 4;
                    if (!z13 && a11 > 0) {
                        iArr = new int[a11];
                        int i21 = 0;
                        while (true) {
                            if (i21 >= a11) {
                                z14 = z13;
                                break;
                            }
                            int p12 = c8050c.p();
                            iArr[i21] = p12;
                            if (a(p12, z12)) {
                                break;
                            }
                            i21++;
                        }
                    } else {
                        z14 = z13;
                        iArr = null;
                    }
                    if (!z14) {
                        return new s(iArr);
                    }
                    z13 = z14;
                }
                i16 = i14;
                j12 = j11;
                length = j16;
            }
        }
        l11 = null;
        i11 = i16;
        return !z13 ? j.f64897a : z11 != i11 ? i11 != 0 ? e.f64858a : e.f64859b : l11;
    }

    public static L d(N3.q qVar, boolean z11) throws IOException {
        return c(qVar, false, z11);
    }
}
