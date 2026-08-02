package Ya;

import ab.InterfaceC1929b;
import com.google.crypto.tink.e;
import com.google.crypto.tink.internal.f;
import com.google.crypto.tink.internal.g;
import com.google.crypto.tink.v;
import com.google.crypto.tink.w;
import com.google.crypto.tink.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class c implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14105a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final c f14106b = new c();

    public static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final v f14107a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1929b.a f14108b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1929b.a f14109c;

        public a(v vVar) {
            this.f14107a = vVar;
            if (!vVar.i()) {
                InterfaceC1929b.a aVar = f.f37054a;
                this.f14108b = aVar;
                this.f14109c = aVar;
            } else {
                InterfaceC1929b a10 = g.b().a();
                ab.c a11 = f.a(vVar);
                this.f14108b = a10.a(a11, "daead", "encrypt");
                this.f14109c = a10.a(a11, "daead", "decrypt");
            }
        }

        @Override // com.google.crypto.tink.e
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = cb.f.a(this.f14107a.e().b(), ((e) this.f14107a.e().g()).a(bArr, bArr2));
                this.f14108b.a(this.f14107a.e().d(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f14108b.b();
                throw e10;
            }
        }

        @Override // com.google.crypto.tink.e
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f14107a.f(copyOf)) {
                    try {
                        byte[] b10 = ((e) cVar.g()).b(copyOfRange, bArr2);
                        this.f14109c.a(cVar.d(), copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        c.f14105a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c cVar2 : this.f14107a.h()) {
                try {
                    byte[] b11 = ((e) cVar2.g()).b(bArr, bArr2);
                    this.f14109c.a(cVar2.d(), bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f14109c.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public static void e() {
        x.n(f14106b);
    }

    @Override // com.google.crypto.tink.w
    public Class b() {
        return e.class;
    }

    @Override // com.google.crypto.tink.w
    public Class c() {
        return e.class;
    }

    @Override // com.google.crypto.tink.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e a(v vVar) {
        return new a(vVar);
    }
}
