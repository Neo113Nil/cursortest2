package org.bouncycastle.crypto.macs;

import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        this.f61704m = ((this.f61704m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.f61707v2 ^= 238;
        applySipRounds(this.f61701d);
        long j10 = this.f61705v0;
        long j11 = this.f61706v1;
        long j12 = ((j10 ^ j11) ^ this.f61707v2) ^ this.f61708v3;
        this.f61706v1 = j11 ^ 221;
        applySipRounds(this.f61701d);
        long j13 = ((this.f61705v0 ^ this.f61706v1) ^ this.f61707v2) ^ this.f61708v3;
        reset();
        Pack.longToLittleEndian(j12, bArr, i10);
        Pack.longToLittleEndian(j13, bArr, i10 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f61700c + "-" + this.f61701d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f61706v1 ^= 238;
    }

    public SipHash128(int i10, int i11) {
        super(i10, i11);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
