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
import wj.C6767j;
import xj.AbstractC6832a;

/* loaded from: classes5.dex */
public class McEliecePointchevalCipherSpi extends AsymmetricHybridCipher implements f, z {
    private ByteArrayOutputStream buf;
    private C6767j cipher;
    private o digest;

    public static class McEliecePointcheval extends McEliecePointchevalCipherSpi {
        public McEliecePointcheval() {
            super(AbstractC4217a.b(), new C6767j());
        }
    }

    public static class McEliecePointcheval224 extends McEliecePointchevalCipherSpi {
        public McEliecePointcheval224() {
            super(AbstractC4217a.c(), new C6767j());
        }
    }

    public static class McEliecePointcheval256 extends McEliecePointchevalCipherSpi {
        public McEliecePointcheval256() {
            super(AbstractC4217a.d(), new C6767j());
        }
    }

    public static class McEliecePointcheval384 extends McEliecePointchevalCipherSpi {
        public McEliecePointcheval384() {
            super(AbstractC4217a.e(), new C6767j());
        }
    }

    public static class McEliecePointcheval512 extends McEliecePointchevalCipherSpi {
        public McEliecePointcheval512() {
            super(AbstractC4217a.j(), new C6767j());
        }
    }

    public McEliecePointchevalCipherSpi(o oVar, C6767j c6767j) {
        this.buf = new ByteArrayOutputStream();
        this.digest = oVar;
        this.cipher = c6767j;
        this.buf = new ByteArrayOutputStream();
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
        return "McEliecePointchevalCipher";
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
