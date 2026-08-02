package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes5.dex */
class SeedDerive {

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f62069I;
    private final Digest digest;

    /* renamed from: j, reason: collision with root package name */
    private int f62070j;
    private final byte[] masterSeed;

    /* renamed from: q, reason: collision with root package name */
    private int f62071q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f62069I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z10) {
        deriveSeed(bArr, z10, 0);
    }

    public byte[] getI() {
        return this.f62069I;
    }

    public int getJ() {
        return this.f62070j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f62071q;
    }

    public void setJ(int i10) {
        this.f62070j = i10;
    }

    public void setQ(int i10) {
        this.f62071q = i10;
    }

    public void deriveSeed(byte[] bArr, boolean z10, int i10) {
        deriveSeed(bArr, i10);
        if (z10) {
            this.f62070j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i10) {
        if (bArr.length < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f62069I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f62071q >>> 24));
        this.digest.update((byte) (this.f62071q >>> 16));
        this.digest.update((byte) (this.f62071q >>> 8));
        this.digest.update((byte) this.f62071q);
        this.digest.update((byte) (this.f62070j >>> 8));
        this.digest.update((byte) this.f62070j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i10);
        return bArr;
    }
}
