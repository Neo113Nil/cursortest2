package h3;

import g3.C4320b;
import java.math.BigInteger;

/* renamed from: h3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4445n extends C4434c {
    public C4445n(AbstractC4444m abstractC4444m, AbstractC4444m abstractC4444m2) {
        d(30L);
        if (abstractC4444m == null) {
            throw new C4320b("Numerator is null");
        }
        if (abstractC4444m2 == null) {
            throw new C4320b("Denominator is null");
        }
        if (abstractC4444m2.f().equals(BigInteger.ZERO)) {
            throw new C4320b("Denominator is zero");
        }
        h(abstractC4444m);
        h(abstractC4444m2);
    }
}
