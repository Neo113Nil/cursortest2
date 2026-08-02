package com.google.zxing.oned;

import java.util.Map;

/* loaded from: classes3.dex */
public final class l extends n {
    private static final int[] START_PATTERN = {1, 1, 1, 1};
    private static final int[] END_PATTERN = {3, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f38423a = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.oned.n, com.google.zxing.g
    public Lb.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.ITF) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int b10 = n.b(zArr, 0, START_PATTERN, true);
        for (int i10 = 0; i10 < length; i10 += 2) {
            int digit = Character.digit(str.charAt(i10), 10);
            int digit2 = Character.digit(str.charAt(i10 + 1), 10);
            int[] iArr = new int[10];
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                int[][] iArr2 = f38423a;
                iArr[i12] = iArr2[digit][i11];
                iArr[i12 + 1] = iArr2[digit2][i11];
            }
            b10 += n.b(zArr, b10, iArr, true);
        }
        n.b(zArr, b10, END_PATTERN, true);
        return zArr;
    }
}
