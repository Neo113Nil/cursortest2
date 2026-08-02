package org.spongycastle.jce.provider;

import Li.g;
import Qi.u;
import hj.InterfaceC4511a;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import jj.InterfaceC5138a;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.asn1.C5936n;

/* loaded from: classes5.dex */
public final class a extends Provider {

    /* renamed from: a, reason: collision with root package name */
    public static String f62710a = "BouncyCastle Security Provider v1.56";

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC4511a f62711b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f62712c = new HashMap();
    private static final String[] SYMMETRIC_GENERIC = {"PBEPBKDF2", "PBEPKCS12", "TLSKDF"};
    private static final String[] SYMMETRIC_MACS = {"SipHash", "Poly1305"};
    private static final String[] SYMMETRIC_CIPHERS = {"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF"};
    private static final String[] ASYMMETRIC_GENERIC = {"X509", "IES"};
    private static final String[] ASYMMETRIC_CIPHERS = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145"};
    private static final String[] DIGESTS = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b"};
    private static final String[] KEYSTORES = {BouncyCastleProvider.PROVIDER_NAME, "BCFKS", "PKCS12"};
    private static final String[] SECURE_RANDOMS = {"DRBG"};

    /* renamed from: org.spongycastle.jce.provider.a$a, reason: collision with other inner class name */
    public class C0866a implements PrivilegedAction {
        public C0866a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            a.this.f();
            return null;
        }
    }

    public a() {
        super("SC", 1.56d, f62710a);
        AccessController.doPrivileged(new C0866a());
    }

    public static InterfaceC5138a b(C5936n c5936n) {
        Map map = f62712c;
        synchronized (map) {
            android.support.v4.media.session.b.a(map.get(c5936n));
        }
        return null;
    }

    public static PrivateKey c(g gVar) {
        b(gVar.f().c());
        return null;
    }

    public static PublicKey d(u uVar) {
        b(uVar.c().c());
        return null;
    }

    public final void e(String str, String[] strArr) {
        Class<?> cls;
        for (int i10 = 0; i10 != strArr.length; i10++) {
            try {
                ClassLoader classLoader = a.class.getClassLoader();
                cls = classLoader != null ? classLoader.loadClass(str + strArr[i10] + "$Mappings") : Class.forName(str + strArr[i10] + "$Mappings");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.newInstance());
                    throw null;
                } catch (Exception e10) {
                    throw new InternalError("cannot create instance of " + str + strArr[i10] + "$Mappings : " + e10);
                }
            }
        }
    }

    public final void f() {
        e("org.spongycastle.jcajce.provider.digest.", DIGESTS);
        e("org.spongycastle.jcajce.provider.symmetric.", SYMMETRIC_GENERIC);
        e("org.spongycastle.jcajce.provider.symmetric.", SYMMETRIC_MACS);
        e("org.spongycastle.jcajce.provider.symmetric.", SYMMETRIC_CIPHERS);
        e("org.spongycastle.jcajce.provider.asymmetric.", ASYMMETRIC_GENERIC);
        e("org.spongycastle.jcajce.provider.asymmetric.", ASYMMETRIC_CIPHERS);
        e("org.spongycastle.jcajce.provider.keystore.", KEYSTORES);
        e("org.spongycastle.jcajce.provider.drbg.", SECURE_RANDOMS);
        put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
}
