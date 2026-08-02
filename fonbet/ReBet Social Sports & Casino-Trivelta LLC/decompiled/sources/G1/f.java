package G1;

import G1.e;
import e1.I;
import e1.J;
import e1.Z;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList arrayList;
        J j10 = new J(bArr);
        try {
            arrayList = c(j10) ? f(j10) : e(j10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new e((e.a) arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e((e.a) arrayList.get(0), (e.a) arrayList.get(1), i10);
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    public static boolean c(J j10) {
        j10.c0(4);
        int v10 = j10.v();
        j10.b0(0);
        return v10 == 1886547818;
    }

    public static e.a d(J j10) {
        int v10 = j10.v();
        e.a aVar = null;
        if (v10 > 10000) {
            return null;
        }
        float[] fArr = new float[v10];
        for (int i10 = 0; i10 < v10; i10++) {
            fArr[i10] = j10.u();
        }
        int v11 = j10.v();
        if (v11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(v10 * 2.0d) / log);
        I i11 = new I(j10.f());
        int i12 = 8;
        i11.p(j10.g() * 8);
        float[] fArr2 = new float[v11 * 5];
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < v11) {
            e.a aVar2 = aVar;
            int i15 = 0;
            while (i15 < 5) {
                int b10 = iArr[i15] + b(i11.h(ceil));
                if (b10 >= v10 || b10 < 0) {
                    return aVar2;
                }
                fArr2[i14] = fArr[b10];
                iArr[i15] = b10;
                i15++;
                i14++;
            }
            i13++;
            aVar = aVar2;
        }
        e.a aVar3 = aVar;
        i11.p((i11.e() + 7) & (-8));
        int i16 = 32;
        int h10 = i11.h(32);
        e.b[] bVarArr = new e.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = i11.h(i12);
            int h12 = i11.h(i12);
            int h13 = i11.h(i16);
            if (h13 > 128000) {
                return aVar3;
            }
            int i18 = h10;
            int ceil2 = (int) Math.ceil(Math.log(v11 * d10) / log);
            float[] fArr3 = new float[h13 * 3];
            float[] fArr4 = new float[h13 * 2];
            int i19 = 0;
            int i20 = 0;
            while (i19 < h13) {
                int b11 = i20 + b(i11.h(ceil2));
                if (b11 < 0 || b11 >= v11) {
                    return aVar3;
                }
                int i21 = i19 * 3;
                int i22 = b11 * 5;
                fArr3[i21] = fArr2[i22];
                fArr3[i21 + 1] = fArr2[i22 + 1];
                fArr3[i21 + 2] = fArr2[i22 + 2];
                int i23 = i19 * 2;
                fArr4[i23] = fArr2[i22 + 3];
                fArr4[i23 + 1] = fArr2[i22 + 4];
                i19++;
                i20 = b11;
            }
            bVarArr[i17] = new e.b(h11, fArr3, fArr4, h12);
            i17++;
            h10 = i18;
            i16 = 32;
            d10 = 2.0d;
            i12 = 8;
        }
        return new e.a(bVarArr);
    }

    public static ArrayList e(J j10) {
        if (j10.M() != 0) {
            return null;
        }
        j10.c0(7);
        int v10 = j10.v();
        if (v10 == 1684433976) {
            J j11 = new J();
            Inflater inflater = new Inflater(true);
            try {
                if (!Z.J0(j10, j11, inflater)) {
                    return null;
                }
                inflater.end();
                j10 = j11;
            } finally {
                inflater.end();
            }
        } else if (v10 != 1918990112) {
            return null;
        }
        return g(j10);
    }

    public static ArrayList f(J j10) {
        int v10;
        j10.c0(8);
        int g10 = j10.g();
        int j11 = j10.j();
        while (g10 < j11 && (v10 = j10.v() + g10) > g10 && v10 <= j11) {
            int v11 = j10.v();
            if (v11 == 2037673328 || v11 == 1836279920) {
                j10.a0(v10);
                return e(j10);
            }
            j10.b0(v10);
            g10 = v10;
        }
        return null;
    }

    public static ArrayList g(J j10) {
        ArrayList arrayList = new ArrayList();
        int g10 = j10.g();
        int j11 = j10.j();
        while (g10 < j11) {
            int v10 = j10.v() + g10;
            if (v10 <= g10 || v10 > j11) {
                return null;
            }
            if (j10.v() == 1835365224) {
                e.a d10 = d(j10);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            j10.b0(v10);
            g10 = v10;
        }
        return arrayList;
    }
}
