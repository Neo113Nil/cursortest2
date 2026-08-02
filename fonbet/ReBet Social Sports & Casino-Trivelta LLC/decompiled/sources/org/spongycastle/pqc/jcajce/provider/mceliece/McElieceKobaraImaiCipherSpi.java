package org.spongycastle.pqc.jcajce.provider.mceliece;

import Li.f;
import Qi.z;
import android.support.v4.media.session.b;
import ej.AbstractC4217a;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;
import wj.C6766i;
import xj.AbstractC6832a;

/* loaded from: classes5.dex */
public class McElieceKobaraImaiCipherSpi extends AsymmetricHybridCipher implements f, z {
    private ByteArrayOutputStream buf;
    private C6766i cipher;
    private o digest;

    public static class McElieceKobaraImai extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai() {
            super(AbstractC4217a.b(), new C6766i());
        }
    }

    public static class McElieceKobaraImai224 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai224() {
            super(AbstractC4217a.c(), new C6766i());
        }
    }

    public static class McElieceKobaraImai256 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai256() {
            super(AbstractC4217a.d(), new C6766i());
        }
    }

    public static class McElieceKobaraImai384 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai384() {
            super(AbstractC4217a.e(), new C6766i());
        }
    }

    public static class McElieceKobaraImai512 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai512() {
            super(AbstractC4217a.j(), new C6766i());
        }
    }

    public McElieceKobaraImaiCipherSpi() {
        this.buf = new ByteArrayOutputStream();
        this.buf = new ByteArrayOutputStream();
    }

    private byte[] pad() {
        this.buf.write(1);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        return byteArray;
    }

    private byte[] unpad(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] != 1) {
            throw new BadPaddingException("invalid ciphertext");
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int decryptOutputSize(int i10) {
        return 0;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i10, int i11) {
        update(bArr, i10, i11);
        int i12 = this.opMode;
        if (i12 == 1) {
            try {
                return this.cipher.f(pad());
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        if (i12 != 2) {
            return null;
        }
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        try {
            return unpad(this.cipher.e(byteArray));
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
            return this.cipher.a(null);
        }
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException();
        }
        b.a(AbstractC6832a.a((PrivateKey) key));
        return this.cipher.a(null);
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return "McElieceKobaraImaiCipher";
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        this.buf.reset();
        AbstractC5975b a10 = AbstractC6832a.a((PrivateKey) key);
        this.digest.reset();
        this.cipher.b(false, a10);
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        this.buf.reset();
        A a10 = new A(AbstractC6832a.b((PublicKey) key), secureRandom);
        this.digest.reset();
        this.cipher.b(true, a10);
    }

    public byte[] messageDecrypt() {
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        try {
            return unpad(this.cipher.e(byteArray));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public byte[] messageEncrypt() {
        try {
            return this.cipher.f(pad());
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

    public McElieceKobaraImaiCipherSpi(o oVar, C6766i c6766i) {
        this.buf = new ByteArrayOutputStream();
        this.digest = oVar;
        this.cipher = c6766i;
        this.buf = new ByteArrayOutputStream();
    }
}
