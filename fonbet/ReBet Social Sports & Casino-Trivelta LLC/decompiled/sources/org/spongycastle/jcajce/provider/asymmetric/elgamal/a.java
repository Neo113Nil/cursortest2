package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.q;
import org.spongycastle.crypto.params.r;
import org.spongycastle.crypto.params.s;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;

/* loaded from: classes5.dex */
public abstract class a {
    public static AbstractC5975b a(PrivateKey privateKey) {
        if (privateKey instanceof ElGamalPrivateKey) {
            ElGamalPrivateKey elGamalPrivateKey = (ElGamalPrivateKey) privateKey;
            return new r(elGamalPrivateKey.getX(), new q(elGamalPrivateKey.getParameters().b(), elGamalPrivateKey.getParameters().a()));
        }
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new r(dHPrivateKey.getX(), new q(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
    }

    public static AbstractC5975b b(PublicKey publicKey) {
        if (publicKey instanceof ElGamalPublicKey) {
            ElGamalPublicKey elGamalPublicKey = (ElGamalPublicKey) publicKey;
            return new s(elGamalPublicKey.getY(), new q(elGamalPublicKey.getParameters().b(), elGamalPublicKey.getParameters().a()));
        }
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new s(dHPublicKey.getY(), new q(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
    }
}
