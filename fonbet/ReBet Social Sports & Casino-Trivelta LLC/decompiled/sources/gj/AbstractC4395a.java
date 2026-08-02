package gj;

import Li.f;
import Qi.z;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.crypto.params.E;
import org.spongycastle.crypto.params.F;

/* renamed from: gj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4395a {
    public static final C5936n[] rsaOids = {f.f7277U, z.f9887g3, f.f7302f0, f.f7309i0};

    public static E a(RSAPrivateKey rSAPrivateKey) {
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new E(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new F(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    public static E b(RSAPublicKey rSAPublicKey) {
        return new E(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }
}
