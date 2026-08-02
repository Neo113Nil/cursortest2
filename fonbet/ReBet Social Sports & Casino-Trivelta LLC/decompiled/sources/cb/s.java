package cb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s implements com.google.crypto.tink.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.aead.internal.h f27698a;

    public s(byte[] bArr) {
        this.f27698a = new com.google.crypto.tink.aead.internal.h(bArr);
    }

    @Override // com.google.crypto.tink.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] c10 = p.c(24);
        allocate.put(c10);
        this.f27698a.b(allocate, c10, bArr, bArr2);
        return allocate.array();
    }

    @Override // com.google.crypto.tink.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.f27698a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
