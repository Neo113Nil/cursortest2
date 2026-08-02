package org.spongycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.C5980g;
import org.spongycastle.crypto.params.h;
import org.spongycastle.crypto.params.i;
import org.spongycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey;

/* loaded from: classes5.dex */
public abstract class a {
    public static AbstractC5975b a(PrivateKey privateKey) {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify DH private key.");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new h(dHPrivateKey.getX(), new C5980g(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), null, dHPrivateKey.getParams().getL()));
    }

    public static AbstractC5975b b(PublicKey publicKey) {
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
        }
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify DH public key.");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new i(dHPublicKey.getY(), new C5980g(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), null, dHPublicKey.getParams().getL()));
    }
}
