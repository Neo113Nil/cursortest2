package xj;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.spongycastle.crypto.params.AbstractC5975b;

/* renamed from: xj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6832a {
    public static AbstractC5975b a(PrivateKey privateKey) {
        throw new InvalidKeyException("can't identify McElieceCCA2 private key.");
    }

    public static AbstractC5975b b(PublicKey publicKey) {
        throw new InvalidKeyException("can't identify McElieceCCA2 public key: " + publicKey.getClass().getName());
    }
}
