package co.nstant.in.cbor.decoder;

import g3.C4319a;
import h3.C4448q;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public class h extends a {
    public h(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public C4448q g(int i10) {
        byte[] f10 = f(4);
        return new C4448q(Float.intBitsToFloat((f10[3] & UByte.MAX_VALUE) | ((((((f10[0] & UByte.MAX_VALUE) << 8) | (f10[1] & UByte.MAX_VALUE)) << 8) | (f10[2] & UByte.MAX_VALUE)) << 8)));
    }
}
