package org.spongycastle.jcajce.provider.asymmetric.ec;

import Ti.b;
import Xi.g;
import Xi.h;
import Yi.f;
import cj.C2930b;
import ej.AbstractC4217a;
import fj.AbstractC4310a;
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
import lj.C5474a;
import lj.InterfaceC5475b;
import nj.C5745f;
import org.spongycastle.crypto.e;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.crypto.engines.C5969t;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.k;
import org.spongycastle.crypto.params.l;
import org.spongycastle.crypto.params.m;
import org.spongycastle.crypto.params.o;
import org.spongycastle.crypto.params.u;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.s;
import org.spongycastle.jcajce.provider.asymmetric.util.c;
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
    private int ivLength;
    private AbstractC5975b key;
    private AbstractC5975b otherKeyParameter;
    private SecureRandom random;
    private int state;

    public static class ECIES extends IESCipher {
        public ECIES() {
            super(new C5969t(new b(), new h(AbstractC4217a.b()), new f(AbstractC4217a.b())));
        }
    }

    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new Zi.b(new C5951a()), 16);
        }
    }

    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(e eVar, int i10) {
            super(new C5969t(new b(), new h(AbstractC4217a.b()), new f(AbstractC4217a.b()), new bj.e(eVar)), i10);
        }
    }

    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new Zi.b(new C5961k()), 8);
        }
    }

    public class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f62689a;

        public a(boolean z10) {
            this.f62689a = z10;
        }

        @Override // org.spongycastle.crypto.s
        public byte[] a(AbstractC5975b abstractC5975b) {
            return ((o) abstractC5975b).c().j(this.f62689a);
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
        k b10 = ((m) this.key).b();
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
            Xi.f fVar = new Xi.f();
            fVar.b(new l(b10, this.random));
            try {
                this.engine.g(this.key, uVar, new g(fVar, new a(this.engineSpec.f())));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e11) {
                throw new BadBlockException("unable to process block", e11);
            }
        }
        if (i13 != 2 && i13 != 4) {
            throw new IllegalStateException("cipher not initialised");
        }
        try {
            this.engine.h(this.key, uVar, new C2930b(b10));
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
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        int size;
        if (this.key == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        int macSize = this.engine.f().getMacSize();
        int t10 = this.otherKeyParameter == null ? ((((m) this.key).b().a().t() + 7) * 2) / 8 : 0;
        if (this.engine.d() != null) {
            int i11 = this.state;
            if (i11 == 1 || i11 == 3) {
                i10 = this.engine.d().c(i10);
            } else {
                if (i11 != 2 && i11 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                i10 = this.engine.d().c((i10 - macSize) - t10);
            }
        }
        int i12 = this.state;
        if (i12 == 1 || i12 == 3) {
            size = this.buffer.size() + macSize + 1 + t10;
        } else {
            if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("cipher not initialised");
            }
            size = (this.buffer.size() - macSize) - t10;
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
        byte[] bArr = null;
        this.otherKeyParameter = null;
        if (algorithmParameterSpec == null) {
            int i11 = this.ivLength;
            if (i11 != 0 && i10 == 1) {
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
            if (key instanceof PublicKey) {
                this.key = AbstractC4310a.a((PublicKey) key);
            } else {
                throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
            }
        } else {
            if (i10 != 2 && i10 != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (key instanceof PrivateKey) {
                this.key = c.b((PrivateKey) key);
            } else {
                throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
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
