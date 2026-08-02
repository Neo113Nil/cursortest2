package cb;

import bb.InterfaceC2415a;
import com.google.crypto.tink.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2415a f27693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27694b;

    public o(InterfaceC2415a interfaceC2415a, int i10) {
        this.f27693a = interfaceC2415a;
        this.f27694b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC2415a.a(new byte[0], i10);
    }

    @Override // com.google.crypto.tink.t
    public void a(byte[] bArr, byte[] bArr2) {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.crypto.tink.t
    public byte[] b(byte[] bArr) {
        return this.f27693a.a(bArr, this.f27694b);
    }
}
