package org.spongycastle.crypto.digests;

/* loaded from: classes5.dex */
public class s extends f {
    public s(int i10) {
        super(x(i10));
    }

    public static int x(int i10) {
        if (i10 == 224 || i10 == 256 || i10 == 384 || i10 == 512) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHA-3");
    }

    @Override // org.spongycastle.crypto.digests.f, org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        e(new byte[]{2}, 0, 2L);
        return super.doFinal(bArr, i10);
    }

    @Override // org.spongycastle.crypto.digests.f, org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "SHA3-" + this.f62321c;
    }
}
