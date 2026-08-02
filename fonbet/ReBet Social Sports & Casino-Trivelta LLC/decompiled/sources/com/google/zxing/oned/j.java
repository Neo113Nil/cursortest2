package com.google.zxing.oned;

import java.util.Map;

/* loaded from: classes3.dex */
public final class j extends q {
    @Override // com.google.zxing.oned.n, com.google.zxing.g
    public Lb.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.EAN_13) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (com.google.zxing.d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (com.google.zxing.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i10 = i.FIRST_DIGIT_ENCODINGS[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b10 = n.b(zArr, 0, p.START_END_PATTERN, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            b10 += n.b(zArr, b10, p.f38426b[digit], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.MIDDLE_PATTERN, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            b11 += n.b(zArr, b11, p.f38425a[Character.digit(str.charAt(i12), 10)], true);
        }
        n.b(zArr, b11, p.START_END_PATTERN, true);
        return zArr;
    }
}
