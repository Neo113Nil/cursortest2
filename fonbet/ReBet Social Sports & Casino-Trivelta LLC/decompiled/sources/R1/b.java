package R1;

import Q1.c;
import b1.C2334C;
import e1.I;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends c {
    public static C2334C c(I i10) {
        i10.r(12);
        int d10 = (i10.d() + i10.h(12)) - 4;
        i10.r(44);
        i10.s(i10.h(12));
        i10.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (i10.d() >= d10) {
                break;
            }
            i10.r(48);
            int h10 = i10.h(8);
            i10.r(4);
            int d11 = i10.d() + i10.h(12);
            String str2 = null;
            while (i10.d() < d11) {
                int h11 = i10.h(8);
                int h12 = i10.h(8);
                int d12 = i10.d() + h12;
                if (h11 == 2) {
                    int h13 = i10.h(16);
                    i10.r(8);
                    if (h13 == 3) {
                        while (i10.d() < d12) {
                            str = i10.l(i10.h(8), StandardCharsets.US_ASCII);
                            int h14 = i10.h(8);
                            for (int i11 = 0; i11 < h14; i11++) {
                                i10.s(i10.h(8));
                            }
                        }
                    }
                } else if (h11 == 21) {
                    str2 = i10.l(h12, StandardCharsets.US_ASCII);
                }
                i10.p(d12 * 8);
            }
            i10.p(d11 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h10, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2334C(arrayList);
    }

    @Override // Q1.c
    public C2334C b(Q1.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new I(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
