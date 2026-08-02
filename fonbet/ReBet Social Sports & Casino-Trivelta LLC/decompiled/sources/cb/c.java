package cb;

import Xa.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c implements com.google.crypto.tink.a {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0280b f27656b = b.EnumC0280b.f13670b;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.aead.internal.b f27657a;

    public c(byte[] bArr) {
        if (!f27656b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f27657a = new com.google.crypto.tink.aead.internal.b(bArr, true);
    }

    @Override // com.google.crypto.tink.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f27657a.b(p.c(12), bArr, bArr2);
    }

    @Override // com.google.crypto.tink.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f27657a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
