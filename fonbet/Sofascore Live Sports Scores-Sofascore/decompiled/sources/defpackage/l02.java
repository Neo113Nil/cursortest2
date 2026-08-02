package defpackage;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class l02 extends Provider {
    public static final String b;
    public static final Class c;
    public static final String[] d;
    public static final String[] e;
    public static final k02[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public final ConcurrentHashMap a;

    static {
        Class<?> cls;
        Logger.getLogger(l02.class.getName());
        AtomicReference atomicReference = g74.a;
        b = "BouncyCastle APIs (LTS edition) v2.73.10".replace("APIs", "Security Provider");
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        new HashMap();
        try {
            ClassLoader classLoader = l02.class.getClassLoader();
            cls = classLoader != null ? classLoader.loadClass("java.security.cert.PKIXRevocationChecker") : (Class) AccessController.doPrivileged(new wv2("java.security.cert.PKIXRevocationChecker", 0));
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        c = cls;
        d = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        e = new String[]{"SipHash", "SipHash128", "Poly1305"};
        f = new k02[]{new k02("AES"), new k02("ARC4"), new k02("ARIA"), new k02("Blowfish"), new k02("Camellia"), new k02("CAST5"), new k02("CAST6"), new k02("ChaCha"), new k02("DES"), new k02("DESede"), new k02("GOST28147"), new k02("Grainv1"), new k02("Grain128"), new k02("HC128"), new k02("HC256"), new k02("IDEA"), new k02("Noekeon"), new k02("RC2"), new k02("RC5"), new k02("RC6"), new k02("Rijndael"), new k02("Salsa20"), new k02("SEED"), new k02("Serpent"), new k02("Shacal2"), new k02("Skipjack"), new k02("SM4"), new k02("TEA"), new k02("Twofish"), new k02("Threefish"), new k02("VMPC"), new k02("VMPCKSA3"), new k02("XTEA"), new k02("XSalsa20"), new k02("OpenSSLPBKDF"), new k02("DSTU7624"), new k02("GOST3412_2015"), new k02("Zuc")};
        g = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures"};
        h = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "CONTEXT", "SLHDSA", "MLDSA", "MLKEM"};
        i = new String[]{"GOST3411", "Keccak", "MD2", "MD4", SameMD5.TAG, "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        j = new String[]{"BC", "BCFKS", "PKCS12"};
        k = new String[]{"DRBG"};
    }

    public l02() {
        super("BC", 2.731d, b);
        this.a = new ConcurrentHashMap();
        AccessController.doPrivileged(new i02(0, this));
    }

    public static void d(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            e(str, strArr[i2]);
        }
    }

    public static void e(String str, String str2) {
        Class<?> cls;
        String o = lnb.o(str, str2, "$Mappings");
        try {
            ClassLoader classLoader = l02.class.getClassLoader();
            cls = classLoader != null ? classLoader.loadClass(o) : (Class) AccessController.doPrivileged(new wv2(o, 0));
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return;
        }
        try {
            if (cls.newInstance() != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (Exception e2) {
            throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e2);
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Provider.Service service;
        int i2 = aii.a;
        char[] charArray = str2.toCharArray();
        boolean z = false;
        for (int i3 = 0; i3 != charArray.length; i3++) {
            char c2 = charArray[i3];
            if ('a' <= c2 && 'z' >= c2) {
                charArray[i3] = (char) (c2 - ' ');
                z = true;
            }
        }
        String i4 = wv8.i(str, ".", z ? new String(charArray) : str2);
        Provider.Service service2 = (Provider.Service) this.a.get(i4);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            try {
                service = (Provider.Service) (!this.a.containsKey(i4) ? AccessController.doPrivileged(new j02(this, str, str2, i4)) : this.a.get(i4));
            } catch (Throwable th) {
                throw th;
            }
        }
        return service;
    }
}
