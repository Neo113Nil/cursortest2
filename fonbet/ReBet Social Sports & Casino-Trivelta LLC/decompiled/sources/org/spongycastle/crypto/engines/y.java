package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class y implements org.spongycastle.crypto.e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f62615b;

    /* renamed from: a, reason: collision with root package name */
    public int f62614a = 12;
    private int[] _S = null;

    private int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        for (int i12 = this.f62614a; i12 >= 1; i12--) {
            int i13 = i12 * 2;
            b11 = f(b11 - this._S[i13 + 1], b10) ^ b10;
            b10 = f(b10 - this._S[i13], b11) ^ b11;
        }
        h(b10 - this._S[0], bArr2, i11);
        h(b11 - this._S[1], bArr2, i11 + 4);
        return 8;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10) + this._S[0];
        int b11 = b(bArr, i10 + 4) + this._S[1];
        for (int i12 = 1; i12 <= this.f62614a; i12++) {
            int i13 = i12 * 2;
            b10 = e(b10 ^ b11, b11) + this._S[i13];
            b11 = e(b11 ^ b10, b10) + this._S[i13 + 1];
        }
        h(b10, bArr2, i11);
        h(b11, bArr2, i11 + 4);
        return 8;
    }

    private int e(int i10, int i11) {
        int i12 = i11 & 31;
        return (i10 >>> (32 - i12)) | (i10 << i12);
    }

    private int f(int i10, int i11) {
        int i12 = i11 & 31;
        return (i10 << (32 - i12)) | (i10 >>> i12);
    }

    private void g(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            int i11 = i10 / 4;
            iArr2[i11] = iArr2[i11] + ((bArr[i10] & UByte.MAX_VALUE) << ((i10 % 4) * 8));
        }
        int[] iArr3 = new int[(this.f62614a + 1) * 2];
        this._S = iArr3;
        iArr3[0] = -1209970333;
        int i12 = 1;
        while (true) {
            iArr = this._S;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = iArr[i12 - 1] - 1640531527;
            i12++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length2; i17++) {
            int[] iArr4 = this._S;
            i14 = e(iArr4[i13] + i14 + i15, 3);
            iArr4[i13] = i14;
            i15 = e(iArr2[i16] + i14 + i15, i15 + i14);
            iArr2[i16] = i15;
            i13 = (i13 + 1) % this._S.length;
            i16 = (i16 + 1) % length;
        }
    }

    private void h(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.D) {
            org.spongycastle.crypto.params.D d10 = (org.spongycastle.crypto.params.D) jVar;
            this.f62614a = d10.b();
            g(d10.a());
        } else {
            if (!(jVar instanceof org.spongycastle.crypto.params.w)) {
                throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + jVar.getClass().getName());
            }
            g(((org.spongycastle.crypto.params.w) jVar).a());
        }
        this.f62615b = z10;
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f62615b ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
