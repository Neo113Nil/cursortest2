package Pb;

import Lb.b;
import com.google.zxing.c;
import com.google.zxing.g;
import com.google.zxing.qrcode.encoder.f;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a implements g {
    public static b b(f fVar, int i10, int i11, int i12) {
        com.google.zxing.qrcode.encoder.b a10 = fVar.a();
        if (a10 == null) {
            throw new IllegalStateException();
        }
        int e10 = a10.e();
        int d10 = a10.d();
        int i13 = i12 << 1;
        int i14 = e10 + i13;
        int i15 = i13 + d10;
        int max = Math.max(i10, i14);
        int max2 = Math.max(i11, i15);
        int min = Math.min(max / i14, max2 / i15);
        int i16 = (max - (e10 * min)) / 2;
        int i17 = (max2 - (d10 * min)) / 2;
        b bVar = new b(max, max2);
        int i18 = 0;
        while (i18 < d10) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < e10) {
                if (a10.b(i19, i18) == 1) {
                    bVar.h(i20, i17, min, min);
                }
                i19++;
                i20 += min;
            }
            i18++;
            i17 += min;
        }
        return bVar;
    }

    @Override // com.google.zxing.g
    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        Qb.a aVar2 = Qb.a.L;
        int i12 = 4;
        if (map != null) {
            c cVar = c.ERROR_CORRECTION;
            if (map.containsKey(cVar)) {
                aVar2 = Qb.a.valueOf(map.get(cVar).toString());
            }
            c cVar2 = c.MARGIN;
            if (map.containsKey(cVar2)) {
                i12 = Integer.parseInt(map.get(cVar2).toString());
            }
        }
        return b(com.google.zxing.qrcode.encoder.c.n(str, aVar2, map), i10, i11, i12);
    }
}
