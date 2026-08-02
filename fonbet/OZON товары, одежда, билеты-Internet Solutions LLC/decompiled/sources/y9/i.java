package y9;

import h9.EnumC6876a;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class i extends y {

    /* renamed from: j, reason: collision with root package name */
    static final int[] f106327j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i, reason: collision with root package name */
    private final int[] f106328i = new int[4];

    @Override // y9.y
    protected final int k(C8659a c8659a, int[] iArr, StringBuilder sb2) throws h9.m {
        int[] iArr2 = this.f106328i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j11 = c8659a.j();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 6 && i11 < j11; i13++) {
            int i14 = y.i(c8659a, iArr2, i11, y.f106359h);
            sb2.append((char) ((i14 % 10) + 48));
            for (int i15 : iArr2) {
                i11 += i15;
            }
            if (i14 >= 10) {
                i12 |= 1 << (5 - i13);
            }
        }
        for (int i16 = 0; i16 < 10; i16++) {
            if (i12 == f106327j[i16]) {
                sb2.insert(0, (char) (i16 + 48));
                int i17 = y.m(c8659a, i11, true, y.f106356e)[1];
                for (int i18 = 0; i18 < 6 && i17 < j11; i18++) {
                    sb2.append((char) (y.i(c8659a, iArr2, i17, y.f106358g) + 48));
                    for (int i19 : iArr2) {
                        i17 += i19;
                    }
                }
                return i17;
            }
        }
        throw h9.m.a();
    }

    @Override // y9.y
    final EnumC6876a p() {
        return EnumC6876a.EAN_13;
    }
}
