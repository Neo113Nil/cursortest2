package cb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g implements com.google.crypto.tink.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.aead.internal.e f27670a;

    public g(byte[] bArr) {
        this.f27670a = new com.google.crypto.tink.aead.internal.e(bArr);
    }

    @Override // com.google.crypto.tink.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] c10 = p.c(12);
        allocate.put(c10);
        this.f27670a.b(allocate, c10, bArr, bArr2);
        return allocate.array();
    }

    @Override // com.google.crypto.tink.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f27670a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }
}
