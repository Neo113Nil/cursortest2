package com.google.crypto.tink.aead;

import ab.InterfaceC1929b;
import com.google.crypto.tink.v;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.aead.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3449d implements com.google.crypto.tink.w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f36921a = Logger.getLogger(C3449d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C3449d f36922b = new C3449d();

    /* renamed from: com.google.crypto.tink.aead.d$b */
    public static class b implements com.google.crypto.tink.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.crypto.tink.v f36923a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1929b.a f36924b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1929b.a f36925c;

        @Override // com.google.crypto.tink.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = cb.f.a(this.f36923a.e().b(), ((com.google.crypto.tink.a) this.f36923a.e().g()).a(bArr, bArr2));
                this.f36924b.a(this.f36923a.e().d(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f36924b.b();
                throw e10;
            }
        }

        @Override // com.google.crypto.tink.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f36923a.f(copyOf)) {
                    try {
                        byte[] b10 = ((com.google.crypto.tink.a) cVar.g()).b(copyOfRange, bArr2);
                        this.f36925c.a(cVar.d(), copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        C3449d.f36921a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c cVar2 : this.f36923a.h()) {
                try {
                    byte[] b11 = ((com.google.crypto.tink.a) cVar2.g()).b(bArr, bArr2);
                    this.f36925c.a(cVar2.d(), bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f36925c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(com.google.crypto.tink.v vVar) {
            this.f36923a = vVar;
            if (!vVar.i()) {
                InterfaceC1929b.a aVar = com.google.crypto.tink.internal.f.f37054a;
                this.f36924b = aVar;
                this.f36925c = aVar;
            } else {
                InterfaceC1929b a10 = com.google.crypto.tink.internal.g.b().a();
                ab.c a11 = com.google.crypto.tink.internal.f.a(vVar);
                this.f36924b = a10.a(a11, "aead", "encrypt");
                this.f36925c = a10.a(a11, "aead", "decrypt");
            }
        }
    }

    public static void e() {
        com.google.crypto.tink.x.n(f36922b);
    }

    @Override // com.google.crypto.tink.w
    public Class b() {
        return com.google.crypto.tink.a.class;
    }

    @Override // com.google.crypto.tink.w
    public Class c() {
        return com.google.crypto.tink.a.class;
    }

    @Override // com.google.crypto.tink.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.google.crypto.tink.a a(com.google.crypto.tink.v vVar) {
        return new b(vVar);
    }
}
