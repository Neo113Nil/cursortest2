package v3;

import Cj.e;
import Cj.f;
import Li.g;
import Li.h;
import Qi.u;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.asn1.C5932j;
import qj.C6192f;
import sj.C6370a;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6633c {

    /* renamed from: e, reason: collision with root package name */
    public static Charset f67010e;

    /* renamed from: a, reason: collision with root package name */
    public String f67011a;

    /* renamed from: b, reason: collision with root package name */
    public PublicKey f67012b;

    /* renamed from: c, reason: collision with root package name */
    public PrivateKey f67013c;

    /* renamed from: d, reason: collision with root package name */
    public C6370a f67014d;

    public C6633c() {
        x();
    }

    public String A(String str, String str2) {
        return z(Base64.decode(str, 0), str2);
    }

    public boolean B(String str, String str2, String str3) {
        Signature.getInstance(str3).initVerify(this.f67012b);
        return C(Base64.decode(str, 0), str2.getBytes(f67010e), str3);
    }

    public final boolean C(byte[] bArr, byte[] bArr2, String str) {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(this.f67012b);
        signature.update(bArr2);
        return signature.verify(bArr);
    }

    public boolean D(String str, String str2, String str3) {
        Signature.getInstance(str3).initVerify(this.f67012b);
        return C(Base64.decode(str, 0), Base64.decode(str2, 0), str3);
    }

    public final String a(String str, byte[] bArr) {
        Cj.b bVar = new Cj.b(str, bArr);
        StringWriter stringWriter = new StringWriter();
        f fVar = new f(stringWriter);
        fVar.k(bVar);
        fVar.close();
        return stringWriter.toString();
    }

    public String b(String str) {
        return new String(c(Base64.decode(str, 0)), f67010e);
    }

    public final byte[] c(byte[] bArr) {
        Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(2, this.f67013c);
        return cipher.doFinal(bArr);
    }

    public String d(String str) {
        return Base64.encodeToString(c(Base64.decode(str, 0)), 0);
    }

    public void e() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.f67011a);
        this.f67013c = null;
        this.f67012b = null;
    }

    public String f(String str) {
        return Base64.encodeToString(g(str.getBytes(f67010e)), 0);
    }

    public final byte[] g(byte[] bArr) {
        Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(1, this.f67012b);
        return cipher.doFinal(bArr);
    }

    public String h(String str) {
        return Base64.encodeToString(g(Base64.decode(str, 0)), 0);
    }

    public void i(int i10) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(i10);
        KeyPair genKeyPair = keyPairGenerator.genKeyPair();
        this.f67012b = genKeyPair.getPublic();
        this.f67013c = genKeyPair.getPrivate();
    }

    public void j(String str, int i10, Context context) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 15).setKeySize(i10).setDigests("SHA-256", "SHA-512", McElieceCCA2KeyGenParameterSpec.SHA1).setEncryptionPaddings("PKCS1Padding").setSignaturePaddings("PKCS1").build());
        this.f67012b = keyPairGenerator.genKeyPair().getPublic();
    }

    public void k(String str, String str2, Context context) {
        this.f67014d = AbstractC6631a.a(this.f67012b, str, this.f67011a, str2);
    }

    public void l(String str, String str2, int i10, Context context) {
        e();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str2, 12).setDigests("SHA-256", "SHA-512", McElieceCCA2KeyGenParameterSpec.SHA384, "NONE").setKeySize(i10).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setEncryptionPaddings("PKCS7Padding").build());
        PublicKey publicKey = keyPairGenerator.genKeyPair().getPublic();
        this.f67012b = publicKey;
        this.f67014d = AbstractC6631a.b(publicKey, str, str2);
    }

    public String m() {
        return a("CERTIFICATE REQUEST", this.f67014d.a());
    }

    public String n() {
        return a("RSA PRIVATE KEY", t(this.f67013c));
    }

    public String o() {
        return a("RSA PUBLIC KEY", u(this.f67012b));
    }

    public void p() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(this.f67011a, null);
        if (privateKeyEntry != null) {
            this.f67013c = privateKeyEntry.getPrivateKey();
            this.f67012b = privateKeyEntry.getCertificate().getPublicKey();
        }
    }

    public final byte[] q(String str) {
        return new e(new StringReader(str)).k().a();
    }

    public final PrivateKey r(byte[] bArr) {
        h g10 = h.g(new C5932j(bArr).D0());
        return KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateKeySpec(g10.h(), g10.k()));
    }

    public final PublicKey s(String str) {
        StringReader stringReader = null;
        try {
            StringReader stringReader2 = new StringReader(str);
            try {
                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(((u) new C6192f(stringReader2).readObject()).a()));
                stringReader2.close();
                return generatePublic;
            } catch (Throwable th2) {
                th = th2;
                stringReader = stringReader2;
                if (stringReader != null) {
                    stringReader.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final byte[] t(PrivateKey privateKey) {
        return g.e(privateKey.getEncoded()).g().toASN1Primitive().a();
    }

    public final byte[] u(PublicKey publicKey) {
        return u.f(publicKey.getEncoded()).g().a();
    }

    public void v(String str) {
        this.f67013c = r(q(str));
    }

    public void w(String str) {
        this.f67012b = s(str);
    }

    public final void x() {
        f67010e = StandardCharsets.UTF_8;
    }

    public String y(String str, String str2) {
        return z(str.getBytes(f67010e), str2);
    }

    public final String z(byte[] bArr, String str) {
        Signature signature = Signature.getInstance(str);
        signature.initSign(this.f67013c);
        signature.update(bArr);
        return Base64.encodeToString(signature.sign(), 0);
    }

    public C6633c(String str) {
        x();
        this.f67011a = str;
        p();
    }
}
