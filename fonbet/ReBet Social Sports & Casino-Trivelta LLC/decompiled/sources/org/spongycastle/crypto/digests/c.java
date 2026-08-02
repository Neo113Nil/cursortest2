package org.spongycastle.crypto.digests;

/* loaded from: classes5.dex */
public final class c extends b {
    private static final byte[] IV = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public c() {
        super(IV);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new c(this);
    }

    @Override // org.spongycastle.crypto.digests.b, org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i10, 32);
        return 32;
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 32;
    }

    public c(c cVar) {
        super(IV);
        a(cVar);
    }
}
