package i8;

import T7.Y;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class w implements S7.a {

    /* renamed from: a, reason: collision with root package name */
    private final U7.v f66151a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f66152b;

    private w(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f66151a = new U7.v(bArr);
        this.f66152b = bArr2;
    }

    public static w c(Y y11) throws GeneralSecurityException {
        return new w(y11.h().d(S7.e.a()), y11.e().d());
    }

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.f66151a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] a11 = H.a(24);
        allocate.put(a11);
        this.f66151a.b(allocate, a11, bArr, bArr2);
        byte[] array = allocate.array();
        byte[] bArr3 = this.f66152b;
        return bArr3.length == 0 ? array : h.a(bArr3, array);
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f66152b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (M.b(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
