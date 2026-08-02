package co.nstant.in.cbor.decoder;

import g3.C4319a;
import h3.C4443l;
import java.io.InputStream;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class g extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f27896d = BigInteger.valueOf(-1);

    public g(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public C4443l g(int i10) {
        return new C4443l(f27896d.subtract(c(i10)));
    }
}
