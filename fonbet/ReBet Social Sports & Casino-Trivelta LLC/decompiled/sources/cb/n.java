package cb;

import Xa.b;
import bb.InterfaceC2415a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class n implements InterfaceC2415a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0280b f27687e = b.EnumC0280b.f13670b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f27688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27689b;

    /* renamed from: c, reason: collision with root package name */
    public final Key f27690c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27691d;

    public class a extends ThreadLocal {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) i.f27675c.a(n.this.f27689b);
                mac.init(n.this.f27690c);
                return mac;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public n(String str, Key key) {
        a aVar = new a();
        this.f27688a = aVar;
        if (!f27687e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f27689b = str;
        this.f27690c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f27691d = 20;
                break;
            case "HMACSHA224":
                this.f27691d = 28;
                break;
            case "HMACSHA256":
                this.f27691d = 32;
                break;
            case "HMACSHA384":
                this.f27691d = 48;
                break;
            case "HMACSHA512":
                this.f27691d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // bb.InterfaceC2415a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 > this.f27691d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f27688a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f27688a.get()).doFinal(), i10);
    }
}
