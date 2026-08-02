package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SHA512Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 64;

    public SHA512Digest() {
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA512Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.longToBigEndian(this.f61458H1, bArr, i10);
        Pack.longToBigEndian(this.f61459H2, bArr, i10 + 8);
        Pack.longToBigEndian(this.f61460H3, bArr, i10 + 16);
        Pack.longToBigEndian(this.f61461H4, bArr, i10 + 24);
        Pack.longToBigEndian(this.f61462H5, bArr, i10 + 32);
        Pack.longToBigEndian(this.f61463H6, bArr, i10 + 40);
        Pack.longToBigEndian(this.f61464H7, bArr, i10 + 48);
        Pack.longToBigEndian(this.f61465H8, bArr, i10 + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f61458H1 = 7640891576956012808L;
        this.f61459H2 = -4942790177534073029L;
        this.f61460H3 = 4354685564936845355L;
        this.f61461H4 = -6534734903238641935L;
        this.f61462H5 = 5840696475078001361L;
        this.f61463H6 = -7276294671716946913L;
        this.f61464H7 = 2270897969802886507L;
        this.f61465H8 = 6620516959819538809L;
    }

    public SHA512Digest(SHA512Digest sHA512Digest) {
        super(sHA512Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA512Digest) memoable);
    }

    public SHA512Digest(byte[] bArr) {
        restoreState(bArr);
    }
}
