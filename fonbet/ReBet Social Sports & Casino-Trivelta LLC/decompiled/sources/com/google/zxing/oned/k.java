package com.google.zxing.oned;

import java.util.Map;

/* loaded from: classes3.dex */
public final class k extends q {
    @Override // com.google.zxing.oned.n, com.google.zxing.g
    public Lb.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.EAN_8) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (com.google.zxing.d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (com.google.zxing.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int b10 = n.b(zArr, 0, p.START_END_PATTERN, true);
        for (int i10 = 0; i10 <= 3; i10++) {
            b10 += n.b(zArr, b10, p.f38425a[Character.digit(str.charAt(i10), 10)], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.MIDDLE_PATTERN, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            b11 += n.b(zArr, b11, p.f38425a[Character.digit(str.charAt(i11), 10)], true);
        }
        n.b(zArr, b11, p.START_END_PATTERN, true);
        return zArr;
    }
}
