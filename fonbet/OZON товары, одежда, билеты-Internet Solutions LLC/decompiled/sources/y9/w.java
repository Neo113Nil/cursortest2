package y9;

import h9.EnumC6876a;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
final class w {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f106349c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f106350a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f106351b = new StringBuilder();

    w() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final h9.q a(int i11, C8659a c8659a, int[] iArr) throws h9.m {
        String str;
        String str2;
        EnumMap enumMap;
        char c11 = 2;
        StringBuilder sb2 = this.f106351b;
        sb2.setLength(0);
        int[] iArr2 = this.f106350a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j11 = c8659a.j();
        int i12 = iArr[1];
        int i13 = 0;
        int i14 = 0;
        while (i13 < 5 && i12 < j11) {
            int i15 = y.i(c8659a, iArr2, i12, y.f106359h);
            sb2.append((char) ((i15 % 10) + 48));
            char c12 = c11;
            for (int i16 : iArr2) {
                i12 += i16;
            }
            if (i15 >= 10) {
                i14 |= 1 << (4 - i13);
            }
            if (i13 != 4) {
                i12 = c8659a.i(c8659a.h(i12));
            }
            i13++;
            c11 = c12;
        }
        char c13 = c11;
        if (sb2.length() != 5) {
            throw h9.m.a();
        }
        for (int i17 = 0; i17 < 10; i17++) {
            if (i14 == f106349c[i17]) {
                String sb3 = sb2.toString();
                int length = sb3.length();
                int i18 = 0;
                for (int i19 = length - 2; i19 >= 0; i19 -= 2) {
                    i18 += sb3.charAt(i19) - '0';
                }
                int i21 = i18 * 3;
                for (int i22 = length - 1; i22 >= 0; i22 -= 2) {
                    i21 += sb3.charAt(i22) - '0';
                }
                if ((i21 * 3) % 10 != i17) {
                    throw h9.m.a();
                }
                String sb4 = sb2.toString();
                if (sb4.length() == 5) {
                    char charAt = sb4.charAt(0);
                    if (charAt == '0') {
                        str = "£";
                    } else if (charAt != '5') {
                        str = "";
                        if (charAt == '9') {
                            char c14 = 65535;
                            switch (sb4.hashCode()) {
                                case 54118329:
                                    if (sb4.equals("90000")) {
                                        c14 = 0;
                                        break;
                                    }
                                    break;
                                case 54395376:
                                    if (sb4.equals("99990")) {
                                        c14 = 1;
                                        break;
                                    }
                                    break;
                                case 54395377:
                                    if (sb4.equals("99991")) {
                                        c14 = c13;
                                        break;
                                    }
                                    break;
                            }
                            switch (c14) {
                                case 0:
                                    str2 = null;
                                    break;
                                case 1:
                                    str2 = "Used";
                                    break;
                                case 2:
                                    str2 = "0.00";
                                    break;
                            }
                            if (str2 != null) {
                                enumMap = new EnumMap(h9.r.class);
                                enumMap.put((EnumMap) h9.r.SUGGESTED_PRICE, (h9.r) str2);
                                float f7 = i11;
                                h9.q qVar = new h9.q(sb4, null, new h9.s[]{new h9.s((iArr[0] + iArr[1]) / 2.0f, f7), new h9.s(i12, f7)}, EnumC6876a.UPC_EAN_EXTENSION);
                                if (enumMap != null) {
                                    qVar.g(enumMap);
                                }
                                return qVar;
                            }
                        }
                    } else {
                        str = "$";
                    }
                    int parseInt = Integer.parseInt(sb4.substring(1));
                    String valueOf = String.valueOf(parseInt / 100);
                    int i23 = parseInt % 100;
                    str2 = str + valueOf + '.' + (i23 < 10 ? "0".concat(String.valueOf(i23)) : String.valueOf(i23));
                    if (str2 != null) {
                    }
                }
                enumMap = null;
                float f72 = i11;
                h9.q qVar2 = new h9.q(sb4, null, new h9.s[]{new h9.s((iArr[0] + iArr[1]) / 2.0f, f72), new h9.s(i12, f72)}, EnumC6876a.UPC_EAN_EXTENSION);
                if (enumMap != null) {
                }
                return qVar2;
            }
        }
        throw h9.m.a();
    }
}
