package org.spongycastle.jcajce.provider.symmetric.util;

import Aj.h;
import Zi.f;
import Zi.i;
import Zi.k;
import Zi.m;
import Zi.n;
import bj.InterfaceC2427a;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import kj.AbstractC5262a;
import org.spongycastle.crypto.e;
import org.spongycastle.crypto.g;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.l;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.params.C;
import org.spongycastle.crypto.params.C5974a;
import org.spongycastle.crypto.params.D;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.x;
import org.spongycastle.jcajce.PBKDF1Key;
import org.spongycastle.jcajce.PBKDF1KeyWithParameters;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.PKCS12KeyWithParameters;
import org.spongycastle.jcajce.spec.AEADParameterSpec;
import org.spongycastle.jcajce.spec.RepeatedSecretKeySpec;

/* loaded from: classes5.dex */
public class BaseBlockCipher extends BaseWrapCipher {
    private static final Class gcmSpecClass = lookup("javax.crypto.spec.GCMParameterSpec");
    private C5974a aeadParams;
    private Class[] availableSpecs;
    private e baseEngine;
    private c cipher;
    private int digest;
    private org.spongycastle.jcajce.provider.symmetric.util.a engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private z ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    public static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final Constructor f62702b;

        /* renamed from: a, reason: collision with root package name */
        public Zi.a f62703a;

        static {
            Class lookup = BaseBlockCipher.lookup("javax.crypto.AEADBadTagException");
            if (lookup != null) {
                f62702b = c(lookup);
            } else {
                f62702b = null;
            }
        }

        public a(Zi.a aVar) {
            this.f62703a = aVar;
        }

        public static Constructor c(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public void a(boolean z10, j jVar) {
            this.f62703a.a(z10, jVar);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int doFinal(byte[] bArr, int i10) {
            BadPaddingException badPaddingException;
            try {
                return this.f62703a.doFinal(bArr, i10);
            } catch (r e10) {
                Constructor constructor = f62702b;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e10.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e10.getMessage());
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public String getAlgorithmName() {
            return this.f62703a.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int getOutputSize(int i10) {
            return this.f62703a.getOutputSize(i10);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public e getUnderlyingCipher() {
            return this.f62703a.getUnderlyingCipher();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int getUpdateOutputSize(int i10) {
            return this.f62703a.getUpdateOutputSize(i10);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            return this.f62703a.processBytes(bArr, i10, i11, bArr2, i12);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public void updateAAD(byte[] bArr, int i10, int i11) {
            this.f62703a.processAADBytes(bArr, i10, i11);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public interface c {
        void a(boolean z10, j jVar);

        int doFinal(byte[] bArr, int i10);

        String getAlgorithmName();

        int getOutputSize(int i10);

        e getUnderlyingCipher();

        int getUpdateOutputSize(int i10);

        int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

        void updateAAD(byte[] bArr, int i10, int i11);

        boolean wrapOnNoPadding();
    }

    public static class d extends InvalidKeyException {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f62705a;

        public d(String str, Throwable th2) {
            super(str);
            this.f62705a = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f62705a;
        }
    }

    public BaseBlockCipher(e eVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, AbstractC5262a.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.cipher = new b(eVar);
    }

    private j adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, j jVar) {
        if (!(jVar instanceof z)) {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                return jVar;
            }
            z zVar = new z(jVar, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = zVar;
            return zVar;
        }
        j b10 = ((z) jVar).b();
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            return jVar;
        }
        z zVar2 = new z(b10, ((IvParameterSpec) algorithmParameterSpec).getIV());
        this.ivParam = zVar2;
        return zVar2;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class lookup(String str) {
        try {
            return BaseBlockCipher.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        int engineGetOutputSize = engineGetOutputSize(i11);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i11 != 0 ? this.cipher.processBytes(bArr, i10, i11, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (l e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.baseEngine.getBlockSize();
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        C5974a c5974a = this.aeadParams;
        if (c5974a != null) {
            return c5974a.d();
        }
        z zVar = this.ivParam;
        if (zVar != null) {
            return zVar.a();
        }
        return null;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return this.cipher.getOutputSize(i10);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = createParametersInstance;
                    createParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                try {
                    AlgorithmParameters createParametersInstance2 = createParametersInstance("GCM");
                    this.engineParams = createParametersInstance2;
                    createParametersInstance2.init(new Di.b(this.aeadParams.d(), this.aeadParams.c() / 8).a());
                } catch (Exception e10) {
                    throw new RuntimeException(e10.toString());
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters createParametersInstance3 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance3;
                    createParametersInstance3.init(this.ivParam.a());
                } catch (Exception e11) {
                    throw new RuntimeException(e11.toString());
                }
            }
        }
        return this.engineParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v60, types: [org.spongycastle.crypto.params.z] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [org.spongycastle.crypto.params.z] */
    /* JADX WARN: Type inference failed for: r7v24, types: [org.spongycastle.crypto.j] */
    /* JADX WARN: Type inference failed for: r7v29, types: [org.spongycastle.crypto.params.a] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v9, types: [org.spongycastle.crypto.j] */
    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        j jVar;
        w wVar;
        j d10;
        z zVar;
        c cVar;
        j jVar2;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if (!(key instanceof SecretKey)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key for algorithm ");
            sb2.append(key != null ? key.getAlgorithm() : null);
            sb2.append(" not suitable for symmetric enryption.");
            throw new InvalidKeyException(sb2.toString());
        }
        if (algorithmParameterSpec == null && this.baseEngine.getAlgorithmName().startsWith("RC5-64")) {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        int i11 = this.scheme;
        if (i11 == 2 || (key instanceof PKCS12Key)) {
            try {
                SecretKey secretKey = (SecretKey) key;
                if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z10 = secretKey instanceof PBEKey;
                if (z10 && this.pbeSpec == null) {
                    PBEKey pBEKey = (PBEKey) secretKey;
                    if (pBEKey.getSalt() == null) {
                        throw new InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt");
                    }
                    this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.pbeSpec == null && !z10) {
                    throw new InvalidKeyException("Algorithm requires a PBE key");
                }
                if (key instanceof BCPBEKey) {
                    j param = ((BCPBEKey) key).getParam();
                    if (!(param instanceof z)) {
                        if (param != null) {
                            throw new InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
                        }
                        param = org.spongycastle.jcajce.provider.symmetric.util.b.h(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                    }
                    jVar = param;
                } else {
                    jVar = org.spongycastle.jcajce.provider.symmetric.util.b.h(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                }
                boolean z11 = jVar instanceof z;
                wVar = jVar;
                if (z11) {
                    this.ivParam = (z) jVar;
                    wVar = jVar;
                }
            } catch (Exception unused) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof PBKDF1Key) {
            PBKDF1Key pBKDF1Key = (PBKDF1Key) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            }
            if ((pBKDF1Key instanceof PBKDF1KeyWithParameters) && this.pbeSpec == null) {
                PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (PBKDF1KeyWithParameters) pBKDF1Key;
                this.pbeSpec = new PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
            }
            j h10 = org.spongycastle.jcajce.provider.symmetric.util.b.h(pBKDF1Key.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z12 = h10 instanceof z;
            wVar = h10;
            if (z12) {
                this.ivParam = (z) h10;
                wVar = h10;
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getOID() != null) {
                this.pbeAlgorithm = bCPBEKey.getOID().o();
            } else {
                this.pbeAlgorithm = bCPBEKey.getAlgorithm();
            }
            if (bCPBEKey.getParam() != null) {
                jVar2 = adjustParameters(algorithmParameterSpec, bCPBEKey.getParam());
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                jVar2 = org.spongycastle.jcajce.provider.symmetric.util.b.g(bCPBEKey, algorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
            }
            boolean z13 = jVar2 instanceof z;
            wVar = jVar2;
            if (z13) {
                this.ivParam = (z) jVar2;
                wVar = jVar2;
            }
        } else if (key instanceof PBEKey) {
            PBEKey pBEKey2 = (PBEKey) key;
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.pbeSpec = pBEParameterSpec;
            if ((pBEKey2 instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                this.pbeSpec = new PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
            }
            j h11 = org.spongycastle.jcajce.provider.symmetric.util.b.h(pBEKey2.getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z14 = h11 instanceof z;
            wVar = h11;
            if (z14) {
                this.ivParam = (z) h11;
                wVar = h11;
            }
        } else if (key instanceof RepeatedSecretKeySpec) {
            wVar = 0;
        } else {
            if (i11 == 0 || i11 == 4 || i11 == 1 || i11 == 5) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
            wVar = new w(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            if (!isAEADModeName(this.modeName) && !(this.cipher instanceof a)) {
                throw new InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes.");
            }
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            wVar = new C5974a(wVar instanceof z ? (w) ((z) wVar).b() : wVar, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
            this.aeadParams = wVar;
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            if (this.ivLength != 0) {
                IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                if (ivParameterSpec.getIV().length != this.ivLength && !(this.cipher instanceof a) && this.fixedIv) {
                    throw new InvalidAlgorithmParameterException("IV must be " + this.ivLength + " bytes long.");
                }
                wVar = wVar instanceof z ? new z(((z) wVar).b(), ivParameterSpec.getIV()) : new z(wVar, ivParameterSpec.getIV());
                this.ivParam = wVar;
            } else {
                String str = this.modeName;
                if (str != null && str.equals("ECB")) {
                    throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                }
            }
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            d10 = new C(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
            if (rC2ParameterSpec.getIV() != null && this.ivLength != 0) {
                zVar = new z(d10, rC2ParameterSpec.getIV());
                this.ivParam = zVar;
                wVar = zVar;
            }
            wVar = d10;
        } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
            RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
            d10 = new D(key.getEncoded(), rC5ParameterSpec.getRounds());
            if (!this.baseEngine.getAlgorithmName().startsWith("RC5")) {
                throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
            }
            if (this.baseEngine.getAlgorithmName().equals("RC5-32")) {
                if (rC5ParameterSpec.getWordSize() != 32) {
                    throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + ".");
                }
            } else if (this.baseEngine.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + ".");
            }
            if (rC5ParameterSpec.getIV() != null && this.ivLength != 0) {
                zVar = new z(d10, rC5ParameterSpec.getIV());
                this.ivParam = zVar;
                wVar = zVar;
            }
            wVar = d10;
        } else {
            Class cls = gcmSpecClass;
            if (cls == null || !cls.isInstance(algorithmParameterSpec)) {
                if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
            } else {
                if (!isAEADModeName(this.modeName) && !(this.cipher instanceof a)) {
                    throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                }
                try {
                    C5974a c5974a = new C5974a(wVar instanceof z ? (w) ((z) wVar).b() : wVar, ((Integer) cls.getDeclaredMethod("getTLen", null).invoke(algorithmParameterSpec, null)).intValue(), (byte[]) cls.getDeclaredMethod("getIV", null).invoke(algorithmParameterSpec, null));
                    this.aeadParams = c5974a;
                    wVar = c5974a;
                } catch (Exception unused2) {
                    throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
                }
            }
        }
        A a10 = wVar;
        if (this.ivLength != 0) {
            boolean z15 = wVar instanceof z;
            a10 = wVar;
            if (!z15) {
                boolean z16 = wVar instanceof C5974a;
                a10 = wVar;
                if (!z16) {
                    SecureRandom secureRandom2 = secureRandom == null ? new SecureRandom() : secureRandom;
                    if (i10 == 1 || i10 == 3) {
                        byte[] bArr = new byte[this.ivLength];
                        secureRandom2.nextBytes(bArr);
                        ?? zVar2 = new z(wVar, bArr);
                        this.ivParam = zVar2;
                        a10 = zVar2;
                    } else {
                        a10 = wVar;
                        if (this.cipher.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
                            throw new InvalidAlgorithmParameterException("no IV set when one expected");
                        }
                    }
                }
            }
        }
        if (secureRandom != null && this.padded) {
            a10 = new A(a10, secureRandom);
        }
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new InvalidParameterException("unknown opmode " + i10 + " passed");
                        }
                    }
                }
                this.cipher.a(false, a10);
                cVar = this.cipher;
                if ((cVar instanceof a) || this.aeadParams != null) {
                }
                this.aeadParams = new C5974a((w) this.ivParam.b(), ((a) cVar).f62703a.getMac().length * 8, this.ivParam.a());
                return;
            }
            this.cipher.a(true, a10);
            cVar = this.cipher;
            if (cVar instanceof a) {
            }
        } catch (Exception e10) {
            throw new d(e10.getMessage(), e10);
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String k10 = h.k(str);
        this.modeName = k10;
        if (k10.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new b(this.baseEngine);
            return;
        }
        if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new b(new Zi.b(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new b(new k(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                e eVar = this.baseEngine;
                this.cipher = new b(new k(eVar, eVar.getBlockSize() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new b(new Zi.d(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                e eVar2 = this.baseEngine;
                this.cipher = new b(new Zi.d(eVar2, eVar2.getBlockSize() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("PGP")) {
            boolean equalsIgnoreCase = this.modeName.equalsIgnoreCase("PGPCFBwithIV");
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new b(new m(this.baseEngine, equalsIgnoreCase));
            return;
        }
        if (this.modeName.equalsIgnoreCase("OpenPGPCFB")) {
            this.ivLength = 0;
            this.cipher = new b(new Zi.l(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("SIC")) {
            int blockSize = this.baseEngine.getBlockSize();
            this.ivLength = blockSize;
            if (blockSize < 16) {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.fixedIv = false;
            this.cipher = new b(new g(new n(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("CTR")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.fixedIv = false;
            this.cipher = new b(new g(new n(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("GOFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new b(new g(new i(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("GCFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new b(new g(new Zi.g(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("CTS")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new b(new Zi.e(new Zi.b(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("CCM")) {
            this.ivLength = 13;
            this.cipher = new a(new Zi.c(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OCB")) {
            if (this.engineProvider != null) {
                this.ivLength = 15;
                this.cipher = new a(new Zi.j(this.baseEngine, this.engineProvider.get()));
                return;
            } else {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
        }
        if (this.modeName.startsWith("EAX")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new a(new f(this.baseEngine));
        } else if (this.modeName.startsWith("GCM")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new a(new Zi.h(this.baseEngine));
        } else {
            throw new NoSuchAlgorithmException("can't support mode " + str);
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        String k10 = h.k(str);
        if (k10.equals("NOPADDING")) {
            if (this.cipher.wrapOnNoPadding()) {
                this.cipher = new b(new g(this.cipher.getUnderlyingCipher()));
                return;
            }
            return;
        }
        if (k10.equals("WITHCTS")) {
            this.cipher = new b(new Zi.e(this.cipher.getUnderlyingCipher()));
            return;
        }
        this.padded = true;
        if (isAEADModeName(this.modeName)) {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (k10.equals("PKCS5PADDING") || k10.equals("PKCS7PADDING")) {
            this.cipher = new b(this.cipher.getUnderlyingCipher());
            return;
        }
        if (k10.equals("ZEROBYTEPADDING")) {
            this.cipher = new b(this.cipher.getUnderlyingCipher(), new bj.h());
            return;
        }
        if (k10.equals("ISO10126PADDING") || k10.equals("ISO10126-2PADDING")) {
            this.cipher = new b(this.cipher.getUnderlyingCipher(), new bj.b());
            return;
        }
        if (k10.equals("X9.23PADDING") || k10.equals("X923PADDING")) {
            this.cipher = new b(this.cipher.getUnderlyingCipher(), new bj.g());
            return;
        }
        if (k10.equals("ISO7816-4PADDING") || k10.equals("ISO9797-1PADDING")) {
            this.cipher = new b(this.cipher.getUnderlyingCipher(), new bj.c());
            return;
        }
        if (k10.equals("TBCPADDING")) {
            this.cipher = new b(this.cipher.getUnderlyingCipher(), new bj.f());
            return;
        }
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i11);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i10, i11, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int processBytes = this.cipher.processBytes(bArr, i10, i11, bArr2, 0);
        if (processBytes == 0) {
            return null;
        }
        if (processBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[processBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(byte[] bArr, int i10, int i11) {
        this.cipher.updateAAD(bArr, i10, i11);
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public g f62704a;

        public b(g gVar) {
            this.f62704a = gVar;
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public void a(boolean z10, j jVar) {
            this.f62704a.f(z10, jVar);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int doFinal(byte[] bArr, int i10) {
            try {
                return this.f62704a.a(bArr, i10);
            } catch (r e10) {
                throw new BadPaddingException(e10.getMessage());
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public String getAlgorithmName() {
            return this.f62704a.d().getAlgorithmName();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int getOutputSize(int i10) {
            return this.f62704a.c(i10);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public e getUnderlyingCipher() {
            return this.f62704a.d();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int getUpdateOutputSize(int i10) {
            return this.f62704a.e(i10);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            return this.f62704a.g(bArr, i10, i11, bArr2, i12);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public void updateAAD(byte[] bArr, int i10, int i11) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public boolean wrapOnNoPadding() {
            return !(this.f62704a instanceof Zi.e);
        }

        public b(e eVar) {
            this.f62704a = new bj.e(eVar);
        }

        public b(e eVar, InterfaceC2427a interfaceC2427a) {
            this.f62704a = new bj.e(eVar, interfaceC2427a);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] bArr3;
        int i13;
        int processBytes;
        if (engineGetOutputSize(i11) + i12 <= bArr2.length) {
            if (i11 != 0) {
                try {
                    bArr3 = bArr2;
                    i13 = i12;
                    processBytes = this.cipher.processBytes(bArr, i10, i11, bArr3, i13);
                } catch (x e10) {
                    throw new IllegalBlockSizeException(e10.getMessage());
                } catch (l e11) {
                    throw new IllegalBlockSizeException(e11.getMessage());
                }
            } else {
                bArr3 = bArr2;
                i13 = i12;
                processBytes = 0;
            }
            return processBytes + this.cipher.doFinal(bArr3, i13 + processBytes);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (this.cipher.getUpdateOutputSize(i11) + i12 <= bArr2.length) {
            try {
                return this.cipher.processBytes(bArr, i10, i11, bArr2, i12);
            } catch (l e10) {
                throw new IllegalStateException(e10.toString());
            }
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    public BaseBlockCipher(e eVar, int i10, int i11, int i12, int i13) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, AbstractC5262a.class};
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.scheme = i10;
        this.digest = i11;
        this.keySizeInBits = i12;
        this.ivLength = i13;
        this.cipher = new b(eVar);
    }

    public BaseBlockCipher(org.spongycastle.jcajce.provider.symmetric.util.a aVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, AbstractC5262a.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aVar.get();
        this.engineProvider = aVar;
        this.cipher = new b(aVar.get());
    }

    public BaseBlockCipher(Zi.a aVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, AbstractC5262a.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        e underlyingCipher = aVar.getUnderlyingCipher();
        this.baseEngine = underlyingCipher;
        this.ivLength = underlyingCipher.getBlockSize();
        this.cipher = new a(aVar);
    }

    public BaseBlockCipher(Zi.a aVar, boolean z10, int i10) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, AbstractC5262a.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aVar.getUnderlyingCipher();
        this.fixedIv = z10;
        this.ivLength = i10;
        this.cipher = new a(aVar);
    }

    public BaseBlockCipher(e eVar, int i10) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, AbstractC5262a.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.cipher = new b(eVar);
        this.ivLength = i10 / 8;
    }

    public BaseBlockCipher(g gVar, int i10) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, AbstractC5262a.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = gVar.d();
        this.cipher = new b(gVar);
        this.ivLength = i10 / 8;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i11 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i11 == clsArr.length) {
                    break;
                }
                Class cls = clsArr[i11];
                if (cls != null) {
                    try {
                        algorithmParameterSpec = algorithmParameters.getParameterSpec(cls);
                        break;
                    } catch (Exception unused) {
                        continue;
                    }
                }
                i11++;
            }
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        engineInit(i10, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidKeyException(e10.getMessage());
        }
    }
}
