package uf;

import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes6.dex */
final class l {

    /* renamed from: d, reason: collision with root package name */
    static final l[] f100770d = {new l("", 0, ""), new l("", 0, " "), new l(" ", 0, " "), new l("", 12, ""), new l("", 10, " "), new l("", 0, " the "), new l(" ", 0, ""), new l("s ", 0, " "), new l("", 0, " of "), new l("", 10, ""), new l("", 0, " and "), new l("", 13, ""), new l("", 1, ""), new l(", ", 0, " "), new l("", 0, ", "), new l(" ", 10, " "), new l("", 0, " in "), new l("", 0, " to "), new l("e ", 0, " "), new l("", 0, "\""), new l("", 0, "."), new l("", 0, "\">"), new l("", 0, "\n"), new l("", 3, ""), new l("", 0, "]"), new l("", 0, " for "), new l("", 14, ""), new l("", 2, ""), new l("", 0, " a "), new l("", 0, " that "), new l(" ", 10, ""), new l("", 0, ". "), new l(".", 0, ""), new l(" ", 0, ", "), new l("", 15, ""), new l("", 0, " with "), new l("", 0, "'"), new l("", 0, " from "), new l("", 0, " by "), new l("", 16, ""), new l("", 17, ""), new l(" the ", 0, ""), new l("", 4, ""), new l("", 0, ". The "), new l("", 11, ""), new l("", 0, " on "), new l("", 0, " as "), new l("", 0, " is "), new l("", 7, ""), new l("", 1, "ing "), new l("", 0, "\n\t"), new l("", 0, ProductContainerDTO.RATIO_DELIMITER), new l(" ", 0, ". "), new l("", 0, "ed "), new l("", 20, ""), new l("", 18, ""), new l("", 6, ""), new l("", 0, "("), new l("", 10, ", "), new l("", 8, ""), new l("", 0, " at "), new l("", 0, "ly "), new l(" the ", 0, " of "), new l("", 5, ""), new l("", 9, ""), new l(" ", 10, ", "), new l("", 10, "\""), new l(".", 0, "("), new l("", 11, " "), new l("", 10, "\">"), new l("", 0, "=\""), new l(" ", 0, "."), new l(".com/", 0, ""), new l(" the ", 0, " of the "), new l("", 10, "'"), new l("", 0, ". This "), new l("", 0, ","), new l(".", 0, " "), new l("", 10, "("), new l("", 10, "."), new l("", 0, " not "), new l(" ", 0, "=\""), new l("", 0, "er "), new l(" ", 11, " "), new l("", 0, "al "), new l(" ", 11, ""), new l("", 0, "='"), new l("", 11, "\""), new l("", 10, ". "), new l(" ", 0, "("), new l("", 0, "ful "), new l(" ", 10, ". "), new l("", 0, "ive "), new l("", 0, "less "), new l("", 11, "'"), new l("", 0, "est "), new l(" ", 10, "."), new l("", 11, "\">"), new l(" ", 0, "='"), new l("", 10, ","), new l("", 0, "ize "), new l("", 11, "."), new l("Â ", 0, ""), new l(" ", 0, ","), new l("", 10, "=\""), new l("", 11, "=\""), new l("", 0, "ous "), new l("", 11, ", "), new l("", 10, "='"), new l(" ", 10, ","), new l(" ", 11, "=\""), new l(" ", 11, ", "), new l("", 11, ","), new l("", 11, "("), new l("", 11, ". "), new l(" ", 11, "."), new l("", 11, "='"), new l(" ", 11, ". "), new l(" ", 10, "=\""), new l(" ", 11, "='"), new l(" ", 10, "='")};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f100771a;

    /* renamed from: b, reason: collision with root package name */
    private final int f100772b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f100773c;

    l(String str, int i11, String str2) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = (byte) str.charAt(i12);
        }
        this.f100771a = bArr;
        this.f100772b = i11;
        int length2 = str2.length();
        byte[] bArr2 = new byte[length2];
        for (int i13 = 0; i13 < length2; i13++) {
            bArr2[i13] = (byte) str2.charAt(i13);
        }
        this.f100773c = bArr2;
    }

    static int a(byte[] bArr, int i11, byte[] bArr2, int i12, int i13, l lVar) {
        int i14 = i11;
        for (byte b11 : lVar.f100771a) {
            bArr[i14] = b11;
            i14++;
        }
        int i15 = lVar.f100772b;
        int i16 = i15 >= 12 ? i15 - 11 : 0;
        if (i16 > i13) {
            i16 = i13;
        }
        int i17 = i12 + i16;
        int i18 = (i13 - i16) - (i15 <= 9 ? i15 : 0);
        int i19 = i18;
        while (i19 > 0) {
            bArr[i14] = bArr2[i17];
            i19--;
            i14++;
            i17++;
        }
        if (i15 == 11 || i15 == 10) {
            int i21 = i14 - i18;
            if (i15 == 10) {
                i18 = 1;
            }
            while (i18 > 0) {
                byte b12 = bArr[i21];
                int i22 = b12 & 255;
                if (i22 < 192) {
                    if (i22 >= 97 && i22 <= 122) {
                        bArr[i21] = (byte) (b12 ^ 32);
                    }
                    i21++;
                    i18--;
                } else if (i22 < 224) {
                    int i23 = i21 + 1;
                    bArr[i23] = (byte) (bArr[i23] ^ 32);
                    i21 += 2;
                    i18 -= 2;
                } else {
                    int i24 = i21 + 2;
                    bArr[i24] = (byte) (bArr[i24] ^ 5);
                    i21 += 3;
                    i18 -= 3;
                }
            }
        }
        for (byte b13 : lVar.f100773c) {
            bArr[i14] = b13;
            i14++;
        }
        return i14 - i11;
    }
}
