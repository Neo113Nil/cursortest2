package y9;

import h9.EnumC6876a;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class k extends y {

    /* renamed from: i, reason: collision with root package name */
    private final int[] f106329i = new int[4];

    @Override // y9.y
    protected final int k(C8659a c8659a, int[] iArr, StringBuilder sb2) throws h9.m {
        int[][] iArr2;
        int[] iArr3 = this.f106329i;
        iArr3[0] = 0;
        iArr3[1] = 0;
        iArr3[2] = 0;
        iArr3[3] = 0;
        int j11 = c8659a.j();
        int i11 = iArr[1];
        int i12 = 0;
        while (true) {
            iArr2 = y.f106358g;
            if (i12 >= 4 || i11 >= j11) {
                break;
            }
            sb2.append((char) (y.i(c8659a, iArr3, i11, iArr2) + 48));
            for (int i13 : iArr3) {
                i11 += i13;
            }
            i12++;
        }
        int i14 = y.m(c8659a, i11, true, y.f106356e)[1];
        for (int i15 = 0; i15 < 4 && i14 < j11; i15++) {
            sb2.append((char) (y.i(c8659a, iArr3, i14, iArr2) + 48));
            for (int i16 : iArr3) {
                i14 += i16;
            }
        }
        return i14;
    }

    @Override // y9.y
    final EnumC6876a p() {
        return EnumC6876a.EAN_8;
    }
}
