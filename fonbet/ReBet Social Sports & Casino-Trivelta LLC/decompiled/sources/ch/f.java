package ch;

import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class f {

    @NotNull
    private static final int[] BASE64_INVERSE_ALPHABET;

    static {
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = StringsKt.indexOf$default((CharSequence) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i10, 0, false, 6, (Object) null);
        }
        BASE64_INVERSE_ALPHABET = iArr;
    }

    public static final String a(byte[] bArr) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i12 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i13 + 3;
            if (i15 > bArr.length) {
                break;
            }
            byte b10 = bArr[i13];
            byte b11 = bArr[i13 + 1];
            int i16 = (bArr[i13 + 2] & UByte.MAX_VALUE) | ((b10 & UByte.MAX_VALUE) << 16) | ((b11 & UByte.MAX_VALUE) << 8);
            int i17 = 3;
            while (-1 < i17) {
                cArr[i14] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i16 >> (i17 * 6)) & 63);
                i17--;
                i14++;
            }
            i13 = i15;
        }
        int length = bArr.length - i13;
        if (length == 0) {
            return StringsKt.concatToString(cArr, 0, i14);
        }
        if (length == 1) {
            i10 = (bArr[i13] & UByte.MAX_VALUE) << 16;
        } else {
            i10 = ((bArr[i13 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i13] & UByte.MAX_VALUE) << 16);
        }
        int i18 = ((3 - length) * 8) / 6;
        if (i18 <= 3) {
            while (true) {
                i11 = i14 + 1;
                cArr[i14] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i10 >> (i12 * 6)) & 63);
                if (i12 == i18) {
                    break;
                }
                i12--;
                i14 = i11;
            }
            i14 = i11;
        }
        int i19 = 0;
        while (i19 < i18) {
            cArr[i14] = '=';
            i19++;
            i14++;
        }
        return StringsKt.concatToString(cArr, 0, i14);
    }
}
