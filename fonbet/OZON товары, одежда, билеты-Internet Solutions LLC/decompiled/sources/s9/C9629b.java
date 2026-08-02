package s9;

import s9.e;

/* renamed from: s9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9629b {

    /* renamed from: a, reason: collision with root package name */
    private final int f98364a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f98365b;

    private C9629b(int i11, byte[] bArr) {
        this.f98364a = i11;
        this.f98365b = bArr;
    }

    static C9629b[] b(byte[] bArr, e eVar) {
        e.b c11 = eVar.c();
        e.a[] a11 = c11.a();
        int i11 = 0;
        for (e.a aVar : a11) {
            i11 += aVar.a();
        }
        C9629b[] c9629bArr = new C9629b[i11];
        int i12 = 0;
        for (e.a aVar2 : a11) {
            int i13 = 0;
            while (i13 < aVar2.a()) {
                int b11 = aVar2.b();
                c9629bArr[i12] = new C9629b(b11, new byte[c11.b() + b11]);
                i13++;
                i12++;
            }
        }
        int length = c9629bArr[0].f98365b.length - c11.b();
        int i14 = length - 1;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = 0;
            while (i17 < i12) {
                c9629bArr[i17].f98365b[i16] = bArr[i15];
                i17++;
                i15++;
            }
        }
        boolean z11 = eVar.h() == 24;
        int i18 = z11 ? 8 : i12;
        int i19 = 0;
        while (i19 < i18) {
            c9629bArr[i19].f98365b[i14] = bArr[i15];
            i19++;
            i15++;
        }
        int length2 = c9629bArr[0].f98365b.length;
        while (length < length2) {
            int i21 = 0;
            while (i21 < i12) {
                int i22 = z11 ? (i21 + 8) % i12 : i21;
                c9629bArr[i22].f98365b[(!z11 || i22 <= 7) ? length : length - 1] = bArr[i15];
                i21++;
                i15++;
            }
            length++;
        }
        if (i15 == bArr.length) {
            return c9629bArr;
        }
        throw new IllegalArgumentException();
    }

    final byte[] a() {
        return this.f98365b;
    }

    final int c() {
        return this.f98364a;
    }
}
