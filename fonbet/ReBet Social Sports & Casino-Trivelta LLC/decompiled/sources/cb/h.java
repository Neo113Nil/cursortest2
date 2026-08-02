package cb;

import com.google.crypto.tink.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h implements com.google.crypto.tink.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f27671a;

    /* renamed from: b, reason: collision with root package name */
    public final t f27672b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27673c;

    public h(l lVar, t tVar, int i10) {
        this.f27671a = lVar;
        this.f27672b = tVar;
        this.f27673c = i10;
    }

    @Override // com.google.crypto.tink.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] encrypt = this.f27671a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(encrypt, this.f27672b.b(f.a(bArr2, encrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // com.google.crypto.tink.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f27673c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f27673c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f27672b.a(copyOfRange2, f.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f27671a.a(copyOfRange);
    }
}
