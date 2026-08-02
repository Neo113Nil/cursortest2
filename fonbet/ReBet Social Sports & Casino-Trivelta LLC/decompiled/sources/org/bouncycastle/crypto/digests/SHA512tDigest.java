package org.bouncycastle.crypto.digests;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.MemoableResetException;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SHA512tDigest extends LongDigest {
    private long H1t;
    private long H2t;
    private long H3t;
    private long H4t;
    private long H5t;
    private long H6t;
    private long H7t;
    private long H8t;
    private int digestLength;

    public SHA512tDigest(int i10) {
        if (i10 >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i10 == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i11 = i10 / 8;
        this.digestLength = i11;
        tIvGenerate(i11 * 8);
        reset();
    }

    private static void intToBigEndian(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(4, i12);
        while (true) {
            min--;
            if (min < 0) {
                return;
            } else {
                bArr[i11 + min] = (byte) (i10 >>> ((3 - min) * 8));
            }
        }
    }

    private static void longToBigEndian(long j10, byte[] bArr, int i10, int i11) {
        if (i11 > 0) {
            intToBigEndian((int) (j10 >>> 32), bArr, i10, i11);
            if (i11 > 4) {
                intToBigEndian((int) (j10 & BodyPartID.bodyIdMax), bArr, i10 + 4, i11 - 4);
            }
        }
    }

    private static int readDigestLength(byte[] bArr) {
        return Pack.bigEndianToInt(bArr, bArr.length - 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x007f, code lost:
    
        if (r4 > 10) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void tIvGenerate(int i10) {
        this.f61458H1 = -3482333909917012819L;
        this.f61459H2 = 2216346199247487646L;
        this.f61460H3 = -7364697282686394994L;
        this.f61461H4 = 65953792586715988L;
        this.f61462H5 = -816286391624063116L;
        this.f61463H6 = 4512832404995164602L;
        this.f61464H7 = -5033199132376557362L;
        this.f61465H8 = -124578254951840548L;
        update((byte) 83);
        update((byte) 72);
        update((byte) 65);
        update((byte) 45);
        update((byte) 53);
        update((byte) 49);
        update((byte) 50);
        update((byte) 47);
        if (i10 > 100) {
            update((byte) ((i10 / 100) + 48));
            i10 %= 100;
        }
        update((byte) ((i10 / 10) + 48));
        i10 %= 10;
        update((byte) (i10 + 48));
        finish();
        this.H1t = this.f61458H1;
        this.H2t = this.f61459H2;
        this.H3t = this.f61460H3;
        this.H4t = this.f61461H4;
        this.H5t = this.f61462H5;
        this.H6t = this.f61463H6;
        this.H7t = this.f61464H7;
        this.H8t = this.f61465H8;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA512tDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        longToBigEndian(this.f61458H1, bArr, i10, this.digestLength);
        longToBigEndian(this.f61459H2, bArr, i10 + 8, this.digestLength - 8);
        longToBigEndian(this.f61460H3, bArr, i10 + 16, this.digestLength - 16);
        longToBigEndian(this.f61461H4, bArr, i10 + 24, this.digestLength - 24);
        longToBigEndian(this.f61462H5, bArr, i10 + 32, this.digestLength - 32);
        longToBigEndian(this.f61463H6, bArr, i10 + 40, this.digestLength - 40);
        longToBigEndian(this.f61464H7, bArr, i10 + 48, this.digestLength - 48);
        longToBigEndian(this.f61465H8, bArr, i10 + 56, this.digestLength - 56);
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.digestLength * 8);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int encodedStateSize = getEncodedStateSize();
        byte[] bArr = new byte[encodedStateSize + 4];
        populateState(bArr);
        Pack.intToBigEndian(this.digestLength * 8, bArr, encodedStateSize);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f61458H1 = this.H1t;
        this.f61459H2 = this.H2t;
        this.f61460H3 = this.H3t;
        this.f61461H4 = this.H4t;
        this.f61462H5 = this.H5t;
        this.f61463H6 = this.H6t;
        this.f61464H7 = this.H7t;
        this.f61465H8 = this.H8t;
    }

    public SHA512tDigest(SHA512tDigest sHA512tDigest) {
        super(sHA512tDigest);
        this.digestLength = sHA512tDigest.digestLength;
        reset(sHA512tDigest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA512tDigest sHA512tDigest = (SHA512tDigest) memoable;
        if (this.digestLength != sHA512tDigest.digestLength) {
            throw new MemoableResetException("digestLength inappropriate in other");
        }
        super.copyIn(sHA512tDigest);
        this.H1t = sHA512tDigest.H1t;
        this.H2t = sHA512tDigest.H2t;
        this.H3t = sHA512tDigest.H3t;
        this.H4t = sHA512tDigest.H4t;
        this.H5t = sHA512tDigest.H5t;
        this.H6t = sHA512tDigest.H6t;
        this.H7t = sHA512tDigest.H7t;
        this.H8t = sHA512tDigest.H8t;
    }

    public SHA512tDigest(byte[] bArr) {
        this(readDigestLength(bArr));
        restoreState(bArr);
    }
}
