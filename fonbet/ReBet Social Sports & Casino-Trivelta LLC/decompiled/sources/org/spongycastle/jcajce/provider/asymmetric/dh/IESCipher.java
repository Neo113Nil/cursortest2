package org.spongycastle.jcajce.provider.asymmetric.dh;

import Xi.g;
import Xi.h;
import Yi.f;
import Zi.b;
import bj.e;
import cj.C2929a;
import ej.AbstractC4217a;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import lj.C5474a;
import lj.InterfaceC5475b;
import nj.C5745f;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.crypto.engines.C5969t;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.AbstractC5979f;
import org.spongycastle.crypto.params.C5978e;
import org.spongycastle.crypto.params.C5980g;
import org.spongycastle.crypto.params.i;
import org.spongycastle.crypto.params.u;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.s;
import org.spongycastle.jcajce.provider.asymmetric.util.d;
import org.spongycastle.jcajce.provider.util.BadBlockException;

/* loaded from: classes5.dex */
public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private C5969t engine;
    private AlgorithmParameters engineParam;
    private C5745f engineSpec;
    private final InterfaceC5475b helper;
    private final int ivLength;
    private AbstractC5975b key;
    private AbstractC5975b otherKeyParameter;
    private SecureRandom random;
    private int state;

    public static class IES extends IESCipher {
        public IES() {
            super(new C5969t(new Ti.a(), new h(AbstractC4217a.b()), new f(AbstractC4217a.b())));
        }
    }

    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new C5969t(new Ti.a(), new h(AbstractC4217a.b()), new f(AbstractC4217a.b()), new e(new b(new C5951a()))), 16);
        }
    }

    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new C5969t(new Ti.a(), new h(AbstractC4217a.b()), new f(AbstractC4217a.b()), new e(new b(new C5961k()))), 8);
        }
    }

    public class a implements s {
        public a() {
        }

        @Override // org.spongycastle.crypto.s
        public byte[] a(AbstractC5975b abstractC5975b) {
            int bitLength = (((AbstractC5979f) abstractC5975b).b().e().bitLength() + 7) / 8;
            byte[] bArr = new byte[bitLength];
            byte[] b10 = Aj.b.b(((i) abstractC5975b).c());
            if (b10.length > bitLength) {
                throw new IllegalArgumentException("Senders's public key longer than expected.");
            }
            System.arraycopy(b10, 0, bArr, bitLength - b10.length, b10.length);
            return bArr;
        }
    }

    public IESCipher(C5969t c5969t) {
        this.helper = new C5474a();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c5969t;
        this.ivLength = 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            this.buffer.write(bArr, i10, i11);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        j uVar = new u(this.engineSpec.b(), this.engineSpec.c(), this.engineSpec.d(), this.engineSpec.a());
        if (this.engineSpec.e() != null) {
            uVar = new z(uVar, this.engineSpec.e());
        }
        C5980g b10 = ((AbstractC5979f) this.key).b();
        AbstractC5975b abstractC5975b = this.otherKeyParameter;
        if (abstractC5975b != null) {
            try {
                int i12 = this.state;
                if (i12 != 1 && i12 != 3) {
                    this.engine.i(false, this.key, abstractC5975b, uVar);
                    return this.engine.j(byteArray, 0, byteArray.length);
                }
                this.engine.i(true, abstractC5975b, this.key, uVar);
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e10) {
                throw new BadBlockException("unable to process block", e10);
            }
        }
        int i13 = this.state;
        if (i13 == 1 || i13 == 3) {
            Xi.e eVar = new Xi.e();
            eVar.a(new C5978e(this.random, b10));
            try {
                this.engine.g(this.key, uVar, new g(eVar, new a()));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e11) {
                throw new BadBlockException("unable to process block", e11);
            }
        }
        if (i13 != 2 && i13 != 4) {
            throw new IllegalStateException("IESCipher not initialised");
        }
        try {
            C5969t c5969t = this.engine;
            AbstractC5975b abstractC5975b2 = this.key;
            c5969t.h(abstractC5975b2, uVar, new C2929a(((AbstractC5979f) abstractC5975b2).b()));
            return this.engine.j(byteArray, 0, byteArray.length);
        } catch (r e12) {
            throw new BadBlockException("unable to process block", e12);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.engine.d() != null) {
            return this.engine.d().b();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        C5745f c5745f = this.engineSpec;
        if (c5745f != null) {
            return c5745f.e();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        int size;
        if (this.key == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        int macSize = this.engine.f().getMacSize();
        int bitLength = this.otherKeyParameter == null ? (((((AbstractC5979f) this.key).b().e().bitLength() + 7) * 2) / 8) + 1 : 0;
        if (this.engine.d() != null) {
            int i11 = this.state;
            if (i11 == 1 || i11 == 3) {
                i10 = this.engine.d().c(i10);
            } else {
                if (i11 != 2 && i11 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                i10 = this.engine.d().c((i10 - macSize) - bitLength);
            }
        }
        int i12 = this.state;
        if (i12 == 1 || i12 == 3) {
            size = this.buffer.size() + macSize + bitLength;
        } else {
            if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("IESCipher not initialised");
            }
            size = (this.buffer.size() - macSize) - bitLength;
        }
        return size + i10;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("IES");
                this.engineParam = createAlgorithmParameters;
                createAlgorithmParameters.init(this.engineSpec);
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(C5745f.class);
            } catch (Exception e10) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e10.toString());
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String k10 = Aj.h.k(str);
        if (k10.equals("NONE")) {
            this.dhaesMode = false;
        } else {
            if (k10.equals("DHAES")) {
                this.dhaesMode = true;
                return;
            }
            throw new IllegalArgumentException("can't support mode " + str);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        String k10 = Aj.h.k(str);
        if (!k10.equals("NOPADDING") && !k10.equals("PKCS5PADDING") && !k10.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        this.buffer.write(bArr, i10, i11);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        this.buffer.write(bArr, i10, i11);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        byte[] bArr;
        if (algorithmParameterSpec == null) {
            int i11 = this.ivLength;
            if (i11 == 0 || i10 != 1) {
                bArr = null;
            } else {
                bArr = new byte[i11];
                secureRandom.nextBytes(bArr);
            }
            this.engineSpec = d.a(this.engine.d(), bArr);
        } else if (algorithmParameterSpec instanceof C5745f) {
            this.engineSpec = (C5745f) algorithmParameterSpec;
        } else {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        byte[] e10 = this.engineSpec.e();
        int i12 = this.ivLength;
        if (i12 != 0 && (e10 == null || e10.length != i12)) {
            throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.ivLength + " bytes long");
        }
        if (i10 == 1 || i10 == 3) {
            if (key instanceof DHPublicKey) {
                this.key = org.spongycastle.jcajce.provider.asymmetric.util.a.b((PublicKey) key);
            } else {
                throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
            }
        } else {
            if (i10 != 2 && i10 != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (key instanceof DHPrivateKey) {
                this.key = org.spongycastle.jcajce.provider.asymmetric.util.a.a((PrivateKey) key);
            } else {
                throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
            }
        }
        this.random = secureRandom;
        this.state = i10;
        this.buffer.reset();
    }

    public IESCipher(C5969t c5969t, int i10) {
        this.helper = new C5474a();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c5969t;
        this.ivLength = i10;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e10.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] engineDoFinal = engineDoFinal(bArr, i10, i11);
        System.arraycopy(engineDoFinal, 0, bArr2, i12, engineDoFinal.length);
        return engineDoFinal.length;
    }
}
