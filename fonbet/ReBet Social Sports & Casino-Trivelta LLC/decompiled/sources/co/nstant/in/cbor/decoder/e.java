package co.nstant.in.cbor.decoder;

import g3.C4319a;
import h3.C4439h;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public class e extends a {
    public e(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public static float h(int i10) {
        int i11 = (32768 & i10) >> 15;
        int i12 = (i10 & 31744) >> 10;
        int i13 = i10 & 1023;
        if (i12 == 0) {
            return (float) ((i11 != 0 ? -1 : 1) * Math.pow(2.0d, -14.0d) * (i13 / Math.pow(2.0d, 10.0d)));
        }
        if (i12 != 31) {
            return (float) ((i11 != 0 ? -1 : 1) * Math.pow(2.0d, i12 - 15) * ((i13 / Math.pow(2.0d, 10.0d)) + 1.0d));
        }
        if (i13 != 0) {
            return Float.NaN;
        }
        return (i11 != 0 ? -1 : 1) * Float.POSITIVE_INFINITY;
    }

    public C4439h g(int i10) {
        byte[] f10 = f(2);
        return new C4439h(h((f10[1] & UByte.MAX_VALUE) | ((f10[0] & UByte.MAX_VALUE) << 8)));
    }
}
