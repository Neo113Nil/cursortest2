package i8;

import T7.C4040w;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class i implements S7.a {

    /* renamed from: a, reason: collision with root package name */
    private final U7.s f66109a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f66110b;

    private i(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f66109a = new U7.s(bArr);
        this.f66110b = bArr2;
    }

    public static i c(C4040w c4040w) throws GeneralSecurityException {
        return new i(c4040w.h().d(S7.e.a()), c4040w.e().d());
    }

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f66109a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] a11 = H.a(12);
        allocate.put(a11);
        this.f66109a.b(allocate, a11, bArr, bArr2);
        byte[] array = allocate.array();
        byte[] bArr3 = this.f66110b;
        return bArr3.length == 0 ? array : h.a(bArr3, array);
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f66110b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (M.b(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
