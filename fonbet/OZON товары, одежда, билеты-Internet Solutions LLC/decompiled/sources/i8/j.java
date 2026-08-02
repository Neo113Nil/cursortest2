package i8;

import T7.C4023e;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class j implements S7.a {

    /* renamed from: a, reason: collision with root package name */
    private final C7020b f66111a;

    /* renamed from: b, reason: collision with root package name */
    private final q f66112b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66113c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f66114d;

    private j(C7020b c7020b, q qVar, int i11, byte[] bArr) {
        this.f66111a = c7020b;
        this.f66112b = qVar;
        this.f66113c = i11;
        this.f66114d = bArr;
    }

    public static j c(C4023e c4023e) throws GeneralSecurityException {
        return new j(new C7020b(c4023e.j().f(), c4023e.h().d(S7.e.a())), new q(new p("HMAC" + c4023e.j().d(), new SecretKeySpec(c4023e.i().d(S7.e.a()), "HMAC")), c4023e.j().g()), c4023e.j().g(), c4023e.e().d());
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] c11 = this.f66111a.c(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return h.a(this.f66114d, c11, this.f66112b.a(h.a(bArr2, c11, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f66114d;
        int length2 = bArr3.length;
        int i11 = this.f66113c;
        if (length < length2 + i11) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!M.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i11);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i11, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(this.f66112b.a(h.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.f66111a.a(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
