package org.spongycastle.crypto.digests;

/* loaded from: classes5.dex */
public class v extends f implements org.spongycastle.crypto.q {
    public v(int i10) {
        super(x(i10));
    }

    private static int x(int i10) {
        if (i10 == 128 || i10 == 256) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHAKE");
    }

    @Override // org.spongycastle.crypto.digests.f, org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        return y(bArr, i10, getDigestSize());
    }

    @Override // org.spongycastle.crypto.digests.f, org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "SHAKE" + this.f62321c;
    }

    public int y(byte[] bArr, int i10, int i11) {
        int z10 = z(bArr, i10, i11);
        reset();
        return z10;
    }

    public int z(byte[] bArr, int i10, int i11) {
        if (!this.f62322d) {
            e(new byte[]{15}, 0, 4L);
        }
        v(bArr, i10, i11 * 8);
        return i11;
    }
}
