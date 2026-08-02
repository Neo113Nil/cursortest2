package y9;

import h9.EnumC6876a;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f106347a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f106348b = new StringBuilder();

    v() {
    }

    final h9.q a(int i11, C8659a c8659a, int[] iArr) throws h9.m {
        EnumMap enumMap;
        StringBuilder sb2 = this.f106348b;
        sb2.setLength(0);
        int[] iArr2 = this.f106347a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j11 = c8659a.j();
        int i12 = iArr[1];
        int i13 = 0;
        for (int i14 = 0; i14 < 2 && i12 < j11; i14++) {
            int i15 = y.i(c8659a, iArr2, i12, y.f106359h);
            sb2.append((char) ((i15 % 10) + 48));
            for (int i16 : iArr2) {
                i12 += i16;
            }
            if (i15 >= 10) {
                i13 |= 1 << (1 - i14);
            }
            if (i14 != 1) {
                i12 = c8659a.i(c8659a.h(i12));
            }
        }
        if (sb2.length() != 2) {
            throw h9.m.a();
        }
        if (Integer.parseInt(sb2.toString()) % 4 != i13) {
            throw h9.m.a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() != 2) {
            enumMap = null;
        } else {
            enumMap = new EnumMap(h9.r.class);
            enumMap.put((EnumMap) h9.r.ISSUE_NUMBER, (h9.r) Integer.valueOf(sb3));
        }
        float f7 = i11;
        h9.q qVar = new h9.q(sb3, null, new h9.s[]{new h9.s((iArr[0] + iArr[1]) / 2.0f, f7), new h9.s(i12, f7)}, EnumC6876a.UPC_EAN_EXTENSION);
        if (enumMap != null) {
            qVar.g(enumMap);
        }
        return qVar;
    }
}
