package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u99 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public u99(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static u99 a(nkk nkkVar) {
        boolean z;
        int i;
        try {
            nkkVar.F(21);
            int s = nkkVar.s() & 3;
            int s2 = nkkVar.s();
            int i2 = nkkVar.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z = true;
                if (i4 >= s2) {
                    break;
                }
                nkkVar.F(1);
                int x = nkkVar.x();
                for (int i6 = 0; i6 < x; i6++) {
                    int x2 = nkkVar.x();
                    i5 += x2 + 4;
                    nkkVar.F(x2);
                }
                i4++;
            }
            nkkVar.E(i2);
            byte[] bArr = new byte[i5];
            float f = 1.0f;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < s2) {
                int s3 = nkkVar.s() & 63;
                int x3 = nkkVar.x();
                int i9 = i3;
                while (i9 < x3) {
                    int x4 = nkkVar.x();
                    boolean z2 = z;
                    System.arraycopy(hkg.r, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(nkkVar.a, nkkVar.b, bArr, i10, x4);
                    if (s3 == 33 && i9 == 0) {
                        b3d i0 = hkg.i0(i10, i10 + x4, bArr);
                        float f2 = i0.g;
                        i = s;
                        str = pco.v(i0.a, i0.b, i0.c, i0.d, i0.e, i0.f);
                        f = f2;
                    } else {
                        i = s;
                    }
                    i8 = i10 + x4;
                    nkkVar.F(x4);
                    i9++;
                    z = z2;
                    s = i;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return new u99(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), s + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw r9e.a("Error parsing HEVC config", e);
        }
    }
}
