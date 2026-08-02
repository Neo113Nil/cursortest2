package v3;

import Li.f;
import Qi.m;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.C5936n;
import rj.InterfaceC6305a;
import sj.C6370a;
import tj.C6481a;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6631a {

    /* renamed from: v3.a$a, reason: collision with other inner class name */
    public static class C0935a implements InterfaceC6305a {

        /* renamed from: d, reason: collision with root package name */
        public static Map f67006d;

        /* renamed from: a, reason: collision with root package name */
        public String f67007a;

        /* renamed from: b, reason: collision with root package name */
        public Signature f67008b;

        /* renamed from: c, reason: collision with root package name */
        public ByteArrayOutputStream f67009c;

        static {
            HashMap hashMap = new HashMap();
            f67006d = hashMap;
            hashMap.put("SHA256withECDSA".toLowerCase(), new Qi.a(new C5936n("1.2.840.10045.4.3.2")));
            f67006d.put("SHA256withRSA".toLowerCase(), new Qi.a(new C5936n("1.2.840.113549.1.1.11")));
            f67006d.put("SHA1withRSA".toLowerCase(), new Qi.a(new C5936n("1.2.840.113549.1.1.5")));
        }

        public C0935a(String str, String str2) {
            this.f67007a = str.toLowerCase();
            try {
                KeyStore.Entry c10 = c(str2);
                this.f67009c = new ByteArrayOutputStream();
                this.f67008b = Signature.getInstance(str);
                this.f67008b.initSign(((KeyStore.PrivateKeyEntry) c10).getPrivateKey());
            } catch (IOException e10) {
                Log.e("generateCSR", "IOException: " + e10.getMessage());
                throw new IllegalArgumentException(e10.getMessage());
            } catch (GeneralSecurityException e11) {
                Log.e("generateCSR", "generateCSR: " + e11.getMessage());
                throw new IllegalArgumentException(e11.getMessage());
            }
        }

        @Override // rj.InterfaceC6305a
        public OutputStream a() {
            return this.f67009c;
        }

        @Override // rj.InterfaceC6305a
        public Qi.a b() {
            Qi.a aVar = (Qi.a) f67006d.get(this.f67007a);
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalArgumentException("Does not support algo: " + this.f67007a);
        }

        public KeyStore.Entry c(String str) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getEntry(str, null);
        }

        @Override // rj.InterfaceC6305a
        public byte[] getSignature() {
            try {
                this.f67008b.update(this.f67009c.toByteArray());
                return this.f67008b.sign();
            } catch (GeneralSecurityException e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    public static C6370a a(PublicKey publicKey, String str, String str2, String str3) {
        String format = String.format("CN=%s", str);
        C0935a c0935a = new C0935a(str3, str2);
        C6481a c6481a = new C6481a(new Oi.c(format), publicKey);
        c6481a.a(f.f7307h1, new m().a());
        return c6481a.b(c0935a);
    }

    public static C6370a b(PublicKey publicKey, String str, String str2) {
        return a(publicKey, str, str2, "SHA256withECDSA");
    }
}
