package s9;

import h9.h;
import o9.C8660b;
import o9.C8663e;
import q9.C8999a;

/* renamed from: s9.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9631d {

    /* renamed from: a, reason: collision with root package name */
    private final q9.c f98372a = new q9.c(C8999a.f81746m);

    public final C8663e a(C8660b c8660b) throws h, h9.d {
        C9628a c9628a = new C9628a(c8660b);
        C9629b[] b11 = C9629b.b(c9628a.b(), c9628a.a());
        int i11 = 0;
        for (C9629b c9629b : b11) {
            i11 += c9629b.c();
        }
        byte[] bArr = new byte[i11];
        int length = b11.length;
        for (int i12 = 0; i12 < length; i12++) {
            C9629b c9629b2 = b11[i12];
            byte[] a11 = c9629b2.a();
            int c11 = c9629b2.c();
            int length2 = a11.length;
            int[] iArr = new int[length2];
            for (int i13 = 0; i13 < length2; i13++) {
                iArr[i13] = a11[i13] & 255;
            }
            try {
                this.f98372a.a(iArr, a11.length - c11);
                for (int i14 = 0; i14 < c11; i14++) {
                    a11[i14] = (byte) iArr[i14];
                }
                for (int i15 = 0; i15 < c11; i15++) {
                    bArr[(i15 * length) + i12] = a11[i15];
                }
            } catch (q9.e unused) {
                throw h9.d.a();
            }
        }
        return C9630c.a(bArr);
    }
}
