package Xi;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.C5980g;
import org.spongycastle.math.ec.t;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f13872a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f13873b = BigInteger.valueOf(1);

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f13874c = BigInteger.valueOf(2);

    public BigInteger a(C5980g c5980g, SecureRandom secureRandom) {
        BigInteger c10;
        BigInteger bit;
        int c11 = c5980g.c();
        if (c11 != 0) {
            int i10 = c11 >>> 2;
            do {
                bit = new BigInteger(c11, secureRandom).setBit(c11 - 1);
            } while (t.e(bit) < i10);
            return bit;
        }
        BigInteger bigInteger = f13874c;
        int d10 = c5980g.d();
        BigInteger shiftLeft = d10 != 0 ? f13873b.shiftLeft(d10 - 1) : bigInteger;
        BigInteger f10 = c5980g.f();
        if (f10 == null) {
            f10 = c5980g.e();
        }
        BigInteger subtract = f10.subtract(bigInteger);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            c10 = Aj.b.c(shiftLeft, subtract, secureRandom);
        } while (t.e(c10) < bitLength);
        return c10;
    }

    public BigInteger b(C5980g c5980g, BigInteger bigInteger) {
        return c5980g.b().modPow(bigInteger, c5980g.e());
    }
}
