package Kb;

import Lb.b;
import com.google.zxing.aztec.encoder.c;
import com.google.zxing.g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a implements g {
    public static b b(String str, com.google.zxing.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == com.google.zxing.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    public static b c(com.google.zxing.aztec.encoder.a aVar, int i10, int i11) {
        b a10 = aVar.a();
        if (a10 == null) {
            throw new IllegalStateException();
        }
        int f10 = a10.f();
        int e10 = a10.e();
        int max = Math.max(i10, f10);
        int max2 = Math.max(i11, e10);
        int min = Math.min(max / f10, max2 / e10);
        int i12 = (max - (f10 * min)) / 2;
        int i13 = (max2 - (e10 * min)) / 2;
        b bVar = new b(max, max2);
        int i14 = 0;
        while (i14 < e10) {
            int i15 = 0;
            int i16 = i12;
            while (i15 < f10) {
                if (a10.d(i15, i14)) {
                    bVar.h(i16, i13, min, min);
                }
                i15++;
                i16 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar;
    }

    @Override // com.google.zxing.g
    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i12 = 0;
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset = Charset.forName(map.get(cVar).toString());
            }
            com.google.zxing.c cVar2 = com.google.zxing.c.ERROR_CORRECTION;
            r1 = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            com.google.zxing.c cVar3 = com.google.zxing.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i12 = Integer.parseInt(map.get(cVar3).toString());
            }
        }
        return b(str, aVar, i10, i11, charset, r1, i12);
    }
}
