package xj;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.spongycastle.crypto.params.AbstractC5975b;

/* renamed from: xj.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6833b {
    public static AbstractC5975b a(PrivateKey privateKey) {
        throw new InvalidKeyException("can't identify McEliece private key.");
    }

    public static AbstractC5975b b(PublicKey publicKey) {
        throw new InvalidKeyException("can't identify McEliece public key: " + publicKey.getClass().getName());
    }
}
