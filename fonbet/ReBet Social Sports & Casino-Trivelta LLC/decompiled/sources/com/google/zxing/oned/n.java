package com.google.zxing.oned;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class n implements com.google.zxing.g {
    public static int b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public static Lb.b e(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int max = Math.max(i10, i13);
        int max2 = Math.max(1, i11);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        Lb.b bVar = new Lb.b(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.h(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    @Override // com.google.zxing.g
    public Lb.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        int d10 = d();
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.MARGIN;
            if (map.containsKey(cVar)) {
                d10 = Integer.parseInt(map.get(cVar).toString());
            }
        }
        return e(c(str), i10, i11, d10);
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
