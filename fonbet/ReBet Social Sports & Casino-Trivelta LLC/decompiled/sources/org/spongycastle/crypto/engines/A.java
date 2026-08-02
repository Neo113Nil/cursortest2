package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class A implements org.spongycastle.crypto.e {
    private int[] _S = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f62460a;

    private int b(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 3; i12 >= 0; i12--) {
            i11 = (i11 << 8) + (bArr[i12 + i10] & UByte.MAX_VALUE);
        }
        return i11;
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        int b12 = b(bArr, i10 + 8);
        int b13 = b(bArr, i10 + 12);
        int[] iArr = this._S;
        int i12 = b12 - iArr[43];
        int i13 = b10 - iArr[42];
        int i14 = 20;
        while (i14 >= 1) {
            int e10 = e(((i13 * 2) + 1) * i13, 5);
            int e11 = e(((i12 * 2) + 1) * i12, 5);
            int i15 = i14 * 2;
            int f10 = f(b11 - this._S[i15 + 1], e10) ^ e11;
            i14--;
            int i16 = i13;
            i13 = f(b13 - this._S[i15], e11) ^ e10;
            b13 = i12;
            i12 = f10;
            b11 = i16;
        }
        int[] iArr2 = this._S;
        int i17 = b13 - iArr2[1];
        int i18 = b11 - iArr2[0];
        h(i13, bArr2, i11);
        h(i18, bArr2, i11 + 4);
        h(i12, bArr2, i11 + 8);
        h(i17, bArr2, i11 + 12);
        return 16;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        int b12 = b(bArr, i10 + 8);
        int b13 = b(bArr, i10 + 12);
        int[] iArr = this._S;
        int i12 = b11 + iArr[0];
        int i13 = b13 + iArr[1];
        int i14 = 1;
        while (i14 <= 20) {
            int e10 = e(((i12 * 2) + 1) * i12, 5);
            int e11 = e(((i13 * 2) + 1) * i13, 5);
            int i15 = i14 * 2;
            int e12 = e(b10 ^ e10, e11) + this._S[i15];
            int e13 = e(b12 ^ e11, e10) + this._S[i15 + 1];
            i14++;
            b12 = i13;
            i13 = e12;
            b10 = i12;
            i12 = e13;
        }
        int[] iArr2 = this._S;
        int i16 = b10 + iArr2[42];
        int i17 = b12 + iArr2[43];
        h(i16, bArr2, i11);
        h(i12, bArr2, i11 + 4);
        h(i17, bArr2, i11 + 8);
        h(i13, bArr2, i11 + 12);
        return 16;
    }

    private int e(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private int f(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private void g(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i10 = length3 / 4;
            iArr2[i10] = (iArr2[i10] << 8) + (bArr[length3] & UByte.MAX_VALUE);
        }
        int[] iArr3 = new int[44];
        this._S = iArr3;
        iArr3[0] = -1209970333;
        int i11 = 1;
        while (true) {
            iArr = this._S;
            if (i11 >= iArr.length) {
                break;
            }
            iArr[i11] = iArr[i11 - 1] - 1640531527;
            i11++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length4; i16++) {
            int[] iArr4 = this._S;
            i13 = e(iArr4[i12] + i13 + i14, 3);
            iArr4[i12] = i13;
            i14 = e(iArr2[i15] + i13 + i14, i14 + i13);
            iArr2[i15] = i14;
            i12 = (i12 + 1) % this._S.length;
            i15 = (i15 + 1) % length2;
        }
    }

    private void h(int i10, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i12 + i11] = (byte) i10;
            i10 >>>= 8;
        }
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62460a = z10;
            g(((org.spongycastle.crypto.params.w) jVar).a());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + jVar.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i10 + blockSize > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (blockSize + i11 <= bArr2.length) {
            return this.f62460a ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
        }
        throw new org.spongycastle.crypto.x("output buffer too short");
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
