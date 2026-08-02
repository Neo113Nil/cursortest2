package org.spongycastle.pqc.jcajce.provider.mceliece;

import Li.f;
import Qi.z;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.params.A;
import org.spongycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher;
import wj.AbstractC6765h;
import wj.C6763f;
import xj.AbstractC6833b;

/* loaded from: classes5.dex */
public class McEliecePKCSCipherSpi extends AsymmetricBlockCipher implements f, z {
    private C6763f cipher;

    public static class McEliecePKCS extends McEliecePKCSCipherSpi {
        public McEliecePKCS() {
            super(new C6763f());
        }
    }

    public McEliecePKCSCipherSpi(C6763f c6763f) {
        this.cipher = c6763f;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(Key key) {
        return this.cipher.b(key instanceof PublicKey ? (AbstractC6765h) AbstractC6833b.b((PublicKey) key) : (AbstractC6765h) AbstractC6833b.a((PrivateKey) key));
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return "McEliecePKCS";
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        this.cipher.c(false, AbstractC6833b.a((PrivateKey) key));
        C6763f c6763f = this.cipher;
        this.maxPlainTextSize = c6763f.f67778e;
        this.cipherTextSize = c6763f.f67779f;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        this.cipher.c(true, new A(AbstractC6833b.b((PublicKey) key), secureRandom));
        C6763f c6763f = this.cipher;
        this.maxPlainTextSize = c6763f.f67778e;
        this.cipherTextSize = c6763f.f67779f;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageDecrypt(byte[] bArr) {
        try {
            return this.cipher.f(bArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageEncrypt(byte[] bArr) {
        try {
            return this.cipher.g(bArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
