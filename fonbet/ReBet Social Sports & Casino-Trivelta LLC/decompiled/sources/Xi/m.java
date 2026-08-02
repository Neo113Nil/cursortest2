package Xi;

import org.spongycastle.crypto.t;

/* loaded from: classes5.dex */
public class m extends org.spongycastle.crypto.i {
    public static void c(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        bArr[3] = (byte) (bArr[3] & 15);
        bArr[7] = (byte) (bArr[7] & 15);
        bArr[11] = (byte) (bArr[11] & 15);
        bArr[15] = (byte) (bArr[15] & 15);
        bArr[4] = (byte) (bArr[4] & (-4));
        bArr[8] = (byte) (bArr[8] & (-4));
        bArr[12] = (byte) (bArr[12] & (-4));
    }

    @Override // org.spongycastle.crypto.i
    public byte[] a() {
        byte[] a10 = super.a();
        c(a10);
        return a10;
    }

    @Override // org.spongycastle.crypto.i
    public void b(t tVar) {
        super.b(new t(tVar.a(), 256));
    }
}
