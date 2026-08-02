package x9;

import h9.d;
import h9.h;
import o9.C8660b;
import o9.C8663e;
import q9.C8999a;
import q9.e;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final q9.c f105146a = new q9.c(C8999a.f81748o);

    private void a(byte[] bArr, int i11, int i12, int i13, int i14) throws d {
        int i15 = i12 + i13;
        int i16 = i14 == 0 ? 1 : 2;
        int[] iArr = new int[i15 / i16];
        for (int i17 = 0; i17 < i15; i17++) {
            if (i14 == 0 || i17 % 2 == i14 - 1) {
                iArr[i17 / i16] = bArr[i17 + i11] & 255;
            }
        }
        try {
            this.f105146a.a(iArr, i13 / i16);
            for (int i18 = 0; i18 < i12; i18++) {
                if (i14 == 0 || i18 % 2 == i14 - 1) {
                    bArr[i18 + i11] = (byte) iArr[i18 / i16];
                }
            }
        } catch (e unused) {
            throw d.a();
        }
    }

    public final C8663e b(C8660b c8660b) throws h, d {
        byte[] bArr;
        byte[] a11 = new a(c8660b).a();
        a(a11, 0, 10, 10, 0);
        int i11 = a11[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            a(a11, 20, 84, 40, 1);
            a(a11, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i11 != 5) {
                throw h.a();
            }
            a(a11, 20, 68, 56, 1);
            a(a11, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(a11, 0, bArr, 0, 10);
        System.arraycopy(a11, 20, bArr, 10, bArr.length - 10);
        return b.a(i11, bArr);
    }
}
