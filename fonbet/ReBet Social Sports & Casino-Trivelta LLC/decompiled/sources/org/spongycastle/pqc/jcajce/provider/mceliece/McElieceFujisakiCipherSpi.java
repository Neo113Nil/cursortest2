package org.spongycastle.pqc.jcajce.provider.mceliece;

import Li.f;
import Qi.z;
import android.support.v4.media.session.b;
import ej.AbstractC4217a;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;
import wj.C6764g;
import xj.AbstractC6832a;

/* loaded from: classes5.dex */
public class McElieceFujisakiCipherSpi extends AsymmetricHybridCipher implements f, z {
    private ByteArrayOutputStream buf = new ByteArrayOutputStream();
    private C6764g cipher;
    private o digest;

    public static class McElieceFujisaki extends McElieceFujisakiCipherSpi {
        public McElieceFujisaki() {
            super(AbstractC4217a.b(), new C6764g());
        }
    }

    public McElieceFujisakiCipherSpi(o oVar, C6764g c6764g) {
        this.digest = oVar;
        this.cipher = c6764g;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int decryptOutputSize(int i10) {
        return 0;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i10, int i11) {
        update(bArr, i10, i11);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        int i12 = this.opMode;
        if (i12 == 1) {
            try {
                return this.cipher.f(byteArray);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        if (i12 != 2) {
            return null;
        }
        try {
            return this.cipher.e(byteArray);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int encryptOutputSize(int i10) {
        return 0;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(Key key) {
        if (key instanceof PublicKey) {
            b.a(AbstractC6832a.b((PublicKey) key));
        } else {
            b.a(AbstractC6832a.a((PrivateKey) key));
        }
        return this.cipher.a(null);
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return "McElieceFujisakiCipher";
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        AbstractC5975b a10 = AbstractC6832a.a((PrivateKey) key);
        this.digest.reset();
        this.cipher.b(false, a10);
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        A a10 = new A(AbstractC6832a.b((PublicKey) key), secureRandom);
        this.digest.reset();
        this.cipher.b(true, a10);
    }

    public byte[] messageDecrypt(byte[] bArr) {
        try {
            return this.cipher.e(bArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public byte[] messageEncrypt(byte[] bArr) {
        try {
            return this.cipher.f(bArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] update(byte[] bArr, int i10, int i11) {
        this.buf.write(bArr, i10, i11);
        return new byte[0];
    }
}
