package org.brotli.dec;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.UByte;

/* loaded from: classes5.dex */
public final class l {
    static final l[] TRANSFORMS = {new l("", 0, ""), new l("", 0, " "), new l(" ", 0, " "), new l("", 12, ""), new l("", 10, " "), new l("", 0, " the "), new l(" ", 0, ""), new l("s ", 0, " "), new l("", 0, " of "), new l("", 10, ""), new l("", 0, " and "), new l("", 13, ""), new l("", 1, ""), new l(", ", 0, " "), new l("", 0, ", "), new l(" ", 10, " "), new l("", 0, " in "), new l("", 0, " to "), new l("e ", 0, " "), new l("", 0, "\""), new l("", 0, "."), new l("", 0, "\">"), new l("", 0, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE), new l("", 3, ""), new l("", 0, "]"), new l("", 0, " for "), new l("", 14, ""), new l("", 2, ""), new l("", 0, " a "), new l("", 0, " that "), new l(" ", 10, ""), new l("", 0, ". "), new l(".", 0, ""), new l(" ", 0, ", "), new l("", 15, ""), new l("", 0, " with "), new l("", 0, "'"), new l("", 0, " from "), new l("", 0, " by "), new l("", 16, ""), new l("", 17, ""), new l(" the ", 0, ""), new l("", 4, ""), new l("", 0, ". The "), new l("", 11, ""), new l("", 0, " on "), new l("", 0, " as "), new l("", 0, " is "), new l("", 7, ""), new l("", 1, "ing "), new l("", 0, "\n\t"), new l("", 0, ":"), new l(" ", 0, ". "), new l("", 0, "ed "), new l("", 20, ""), new l("", 18, ""), new l("", 6, ""), new l("", 0, "("), new l("", 10, ", "), new l("", 8, ""), new l("", 0, " at "), new l("", 0, "ly "), new l(" the ", 0, " of "), new l("", 5, ""), new l("", 9, ""), new l(" ", 10, ", "), new l("", 10, "\""), new l(".", 0, "("), new l("", 11, " "), new l("", 10, "\">"), new l("", 0, "=\""), new l(" ", 0, "."), new l(".com/", 0, ""), new l(" the ", 0, " of the "), new l("", 10, "'"), new l("", 0, ". This "), new l("", 0, ","), new l(".", 0, " "), new l("", 10, "("), new l("", 10, "."), new l("", 0, " not "), new l(" ", 0, "=\""), new l("", 0, "er "), new l(" ", 11, " "), new l("", 0, "al "), new l(" ", 11, ""), new l("", 0, "='"), new l("", 11, "\""), new l("", 10, ". "), new l(" ", 0, "("), new l("", 0, "ful "), new l(" ", 10, ". "), new l("", 0, "ive "), new l("", 0, "less "), new l("", 11, "'"), new l("", 0, "est "), new l(" ", 10, "."), new l("", 11, "\">"), new l(" ", 0, "='"), new l("", 10, ","), new l("", 0, "ize "), new l("", 11, "."), new l("Â ", 0, ""), new l(" ", 0, ","), new l("", 10, "=\""), new l("", 11, "=\""), new l("", 0, "ous "), new l("", 11, ", "), new l("", 10, "='"), new l(" ", 10, ","), new l(" ", 11, "=\""), new l(" ", 11, ", "), new l("", 11, ","), new l("", 11, "("), new l("", 11, ". "), new l(" ", 11, "."), new l("", 11, "='"), new l(" ", 11, ". "), new l(" ", 10, "=\""), new l(" ", 11, "='"), new l(" ", 10, "='")};

    /* renamed from: a, reason: collision with root package name */
    public final int f62200a;
    private final byte[] prefix;
    private final byte[] suffix;

    public l(String str, int i10, String str2) {
        this.prefix = a(str);
        this.f62200a = i10;
        this.suffix = a(str2);
    }

    public static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static int b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, l lVar) {
        int i13 = i10;
        for (byte b10 : lVar.prefix) {
            bArr[i13] = b10;
            i13++;
        }
        int i14 = lVar.f62200a;
        int a10 = n.a(i14);
        if (a10 > i12) {
            a10 = i12;
        }
        int i15 = i11 + a10;
        int b11 = (i12 - a10) - n.b(i14);
        int i16 = b11;
        while (i16 > 0) {
            bArr[i13] = bArr2[i15];
            i16--;
            i13++;
            i15++;
        }
        if (i14 == 11 || i14 == 10) {
            int i17 = i13 - b11;
            if (i14 == 10) {
                b11 = 1;
            }
            while (b11 > 0) {
                byte b12 = bArr[i17];
                int i18 = b12 & UByte.MAX_VALUE;
                if (i18 < 192) {
                    if (i18 >= 97 && i18 <= 122) {
                        bArr[i17] = (byte) (b12 ^ 32);
                    }
                    i17++;
                    b11--;
                } else if (i18 < 224) {
                    int i19 = i17 + 1;
                    bArr[i19] = (byte) (bArr[i19] ^ 32);
                    i17 += 2;
                    b11 -= 2;
                } else {
                    int i20 = i17 + 2;
                    bArr[i20] = (byte) (bArr[i20] ^ 5);
                    i17 += 3;
                    b11 -= 3;
                }
            }
        }
        for (byte b13 : lVar.suffix) {
            bArr[i13] = b13;
            i13++;
        }
        return i13 - i10;
    }
}
