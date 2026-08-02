package o9;

import h9.m;

/* renamed from: o9.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8664f {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C8660b a(C8660b c8660b, int i11, int i12, C8667i c8667i) throws m {
        if (i11 <= 0 || i12 <= 0) {
            throw m.a();
        }
        C8660b c8660b2 = new C8660b(i11, i12);
        int i13 = i11 * 2;
        float[] fArr = new float[i13];
        for (int i14 = 0; i14 < i12; i14++) {
            float f7 = i14 + 0.5f;
            for (int i15 = 0; i15 < i13; i15 += 2) {
                fArr[i15] = (i15 / 2) + 0.5f;
                fArr[i15 + 1] = f7;
            }
            c8667i.c(fArr);
            int j11 = c8660b.j();
            int g10 = c8660b.g();
            int i16 = i13 - 1;
            boolean z11 = true;
            for (int i17 = 0; i17 < i16 && z11; i17 += 2) {
                int i18 = (int) fArr[i17];
                int i19 = i17 + 1;
                int i21 = (int) fArr[i19];
                if (i18 < -1 || i18 > j11 || i21 < -1 || i21 > g10) {
                    throw m.a();
                }
                if (i18 == -1) {
                    fArr[i17] = 0.0f;
                } else if (i18 == j11) {
                    fArr[i17] = j11 - 1;
                } else {
                    z11 = false;
                    if (i21 != -1) {
                        fArr[i19] = 0.0f;
                    } else if (i21 == g10) {
                        fArr[i19] = g10 - 1;
                    }
                    z11 = true;
                }
                z11 = true;
                if (i21 != -1) {
                }
                z11 = true;
            }
            boolean z12 = true;
            for (int i22 = i13 - 2; i22 >= 0 && z12; i22 -= 2) {
                int i23 = (int) fArr[i22];
                int i24 = i22 + 1;
                int i25 = (int) fArr[i24];
                if (i23 < -1 || i23 > j11 || i25 < -1 || i25 > g10) {
                    throw m.a();
                }
                if (i23 == -1) {
                    fArr[i22] = 0.0f;
                } else if (i23 == j11) {
                    fArr[i22] = j11 - 1;
                } else {
                    z12 = false;
                    if (i25 != -1) {
                        fArr[i24] = 0.0f;
                    } else if (i25 == g10) {
                        fArr[i24] = g10 - 1;
                    }
                    z12 = true;
                }
                z12 = true;
                if (i25 != -1) {
                }
                z12 = true;
            }
            for (int i26 = 0; i26 < i13; i26 += 2) {
                try {
                    if (c8660b.d((int) fArr[i26], (int) fArr[i26 + 1])) {
                        c8660b2.l(i26 / 2, i14);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw m.a();
                }
            }
        }
        return c8660b2;
    }
}
