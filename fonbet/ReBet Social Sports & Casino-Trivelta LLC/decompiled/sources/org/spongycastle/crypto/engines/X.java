package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class X implements org.spongycastle.crypto.e {
    private int[] _S = new int[4];
    private int[] _sum0 = new int[32];
    private int[] _sum1 = new int[32];

    /* renamed from: a, reason: collision with root package name */
    public boolean f62528a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62529b;

    private int b(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | (bArr[i10] << 24);
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | i11 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        for (int i12 = 31; i12 >= 0; i12--) {
            b11 -= (((b10 << 4) ^ (b10 >>> 5)) + b10) ^ this._sum1[i12];
            b10 -= (((b11 << 4) ^ (b11 >>> 5)) + b11) ^ this._sum0[i12];
        }
        f(b10, bArr2, i11);
        f(b11, bArr2, i11 + 4);
        return 8;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        for (int i12 = 0; i12 < 32; i12++) {
            b10 += (((b11 << 4) ^ (b11 >>> 5)) + b11) ^ this._sum0[i12];
            b11 += (((b10 << 4) ^ (b10 >>> 5)) + b10) ^ this._sum1[i12];
        }
        f(b10, bArr2, i11);
        f(b11, bArr2, i11 + 4);
        return 8;
    }

    private void e(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 4) {
            this._S[i10] = b(bArr, i11);
            i10++;
            i11 += 4;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            int[] iArr = this._sum0;
            int[] iArr2 = this._S;
            iArr[i13] = iArr2[i12 & 3] + i12;
            i12 -= 1640531527;
            this._sum1[i13] = iArr2[(i12 >>> 11) & 3] + i12;
        }
    }

    private void f(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62529b = z10;
            this.f62528a = true;
            e(((org.spongycastle.crypto.params.w) jVar).a());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + jVar.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "XTEA";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f62528a) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 8 <= bArr2.length) {
            return this.f62529b ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
        }
        throw new org.spongycastle.crypto.x("output buffer too short");
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
