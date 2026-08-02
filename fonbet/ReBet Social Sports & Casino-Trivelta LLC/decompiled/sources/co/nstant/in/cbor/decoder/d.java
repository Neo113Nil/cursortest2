package co.nstant.in.cbor.decoder;

import g3.C4319a;
import h3.C4438g;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public class d extends a {
    public d(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public C4438g g(int i10) {
        byte[] f10 = f(8);
        return new C4438g(Double.longBitsToDouble(((((((((((((((f10[0] & UByte.MAX_VALUE) << 8) | (f10[1] & UByte.MAX_VALUE)) << 8) | (f10[2] & UByte.MAX_VALUE)) << 8) | (f10[3] & UByte.MAX_VALUE)) << 8) | (f10[4] & UByte.MAX_VALUE)) << 8) | (f10[5] & UByte.MAX_VALUE)) << 8) | (f10[6] & UByte.MAX_VALUE)) << 8) | (f10[7] & UByte.MAX_VALUE)));
    }
}
