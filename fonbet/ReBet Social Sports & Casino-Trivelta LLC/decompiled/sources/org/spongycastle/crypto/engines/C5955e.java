package org.spongycastle.crypto.engines;

/* renamed from: org.spongycastle.crypto.engines.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5955e extends C5954d {
    protected int[] _Kr = new int[48];
    protected int[] _Km = new int[48];
    protected int[] _Tr = new int[192];
    protected int[] _Tm = new int[192];
    private int[] _workingKey = new int[8];

    @Override // org.spongycastle.crypto.engines.C5954d, org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // org.spongycastle.crypto.engines.C5954d, org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.engines.C5954d
    public int k(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[4];
        n(d(bArr, i10), d(bArr, i10 + 4), d(bArr, i10 + 8), d(bArr, i10 + 12), iArr);
        b(iArr[0], bArr2, i11);
        b(iArr[1], bArr2, i11 + 4);
        b(iArr[2], bArr2, i11 + 8);
        b(iArr[3], bArr2, i11 + 12);
        return 16;
    }

    @Override // org.spongycastle.crypto.engines.C5954d
    public int l(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[4];
        o(d(bArr, i10), d(bArr, i10 + 4), d(bArr, i10 + 8), d(bArr, i10 + 12), iArr);
        b(iArr[0], bArr2, i11);
        b(iArr[1], bArr2, i11 + 4);
        b(iArr[2], bArr2, i11 + 8);
        b(iArr[3], bArr2, i11 + 12);
        return 16;
    }

    @Override // org.spongycastle.crypto.engines.C5954d
    public void m(byte[] bArr) {
        int i10 = 1518500249;
        int i11 = 19;
        boolean z10 = false;
        for (int i12 = 0; i12 < 24; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = (i12 * 8) + i13;
                this._Tm[i14] = i10;
                i10 += 1859775393;
                this._Tr[i14] = i11;
                i11 = (i11 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i15 = 0; i15 < 8; i15++) {
            this._workingKey[i15] = d(bArr2, i15 * 4);
        }
        int i16 = 0;
        while (i16 < 12) {
            int i17 = i16 * 16;
            int[] iArr = this._workingKey;
            iArr[6] = iArr[6] ^ g(iArr[7], this._Tm[i17], this._Tr[i17]);
            int[] iArr2 = this._workingKey;
            int i18 = i17 + 1;
            iArr2[5] = iArr2[5] ^ h(iArr2[6], this._Tm[i18], this._Tr[i18]);
            int[] iArr3 = this._workingKey;
            int i19 = i17 + 2;
            iArr3[4] = iArr3[4] ^ i(iArr3[5], this._Tm[i19], this._Tr[i19]);
            int[] iArr4 = this._workingKey;
            int i20 = i17 + 3;
            boolean z11 = z10;
            iArr4[3] = g(iArr4[4], this._Tm[i20], this._Tr[i20]) ^ iArr4[3];
            int[] iArr5 = this._workingKey;
            int i21 = i17 + 4;
            iArr5[2] = h(iArr5[3], this._Tm[i21], this._Tr[i21]) ^ iArr5[2];
            int[] iArr6 = this._workingKey;
            int i22 = i17 + 5;
            iArr6[1] = i(iArr6[2], this._Tm[i22], this._Tr[i22]) ^ iArr6[1];
            int[] iArr7 = this._workingKey;
            int i23 = i17 + 6;
            iArr7[z11 ? 1 : 0] = iArr7[z11 ? 1 : 0] ^ g(iArr7[1], this._Tm[i23], this._Tr[i23]);
            int[] iArr8 = this._workingKey;
            int i24 = i17 + 7;
            iArr8[7] = h(iArr8[z11 ? 1 : 0], this._Tm[i24], this._Tr[i24]) ^ iArr8[7];
            int i25 = ((i16 * 2) + 1) * 8;
            int[] iArr9 = this._workingKey;
            iArr9[6] = iArr9[6] ^ g(iArr9[7], this._Tm[i25], this._Tr[i25]);
            int[] iArr10 = this._workingKey;
            int i26 = i25 + 1;
            iArr10[5] = iArr10[5] ^ h(iArr10[6], this._Tm[i26], this._Tr[i26]);
            int[] iArr11 = this._workingKey;
            int i27 = i25 + 2;
            iArr11[4] = iArr11[4] ^ i(iArr11[5], this._Tm[i27], this._Tr[i27]);
            int[] iArr12 = this._workingKey;
            int i28 = i25 + 3;
            iArr12[3] = iArr12[3] ^ g(iArr12[4], this._Tm[i28], this._Tr[i28]);
            int[] iArr13 = this._workingKey;
            int i29 = i25 + 4;
            iArr13[2] = iArr13[2] ^ h(iArr13[3], this._Tm[i29], this._Tr[i29]);
            int[] iArr14 = this._workingKey;
            int i30 = i25 + 5;
            iArr14[1] = iArr14[1] ^ i(iArr14[2], this._Tm[i30], this._Tr[i30]);
            int[] iArr15 = this._workingKey;
            int i31 = i25 + 6;
            iArr15[z11 ? 1 : 0] = iArr15[z11 ? 1 : 0] ^ g(iArr15[1], this._Tm[i31], this._Tr[i31]);
            int[] iArr16 = this._workingKey;
            int i32 = i25 + 7;
            iArr16[7] = h(iArr16[z11 ? 1 : 0], this._Tm[i32], this._Tr[i32]) ^ iArr16[7];
            int[] iArr17 = this._Kr;
            int i33 = i16 * 4;
            int[] iArr18 = this._workingKey;
            iArr17[i33] = iArr18[z11 ? 1 : 0] & 31;
            int i34 = i33 + 1;
            iArr17[i34] = iArr18[2] & 31;
            int i35 = i33 + 2;
            iArr17[i35] = iArr18[4] & 31;
            int i36 = i33 + 3;
            iArr17[i36] = iArr18[6] & 31;
            int[] iArr19 = this._Km;
            iArr19[i33] = iArr18[7];
            iArr19[i34] = iArr18[5];
            iArr19[i35] = iArr18[3];
            iArr19[i36] = iArr18[1];
            i16++;
            z10 = z11 ? 1 : 0;
        }
    }

    public final void n(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = 0;
        while (true) {
            if (i15 >= 6) {
                break;
            }
            int i16 = (11 - i15) * 4;
            i12 ^= g(i13, this._Km[i16], this._Kr[i16]);
            int i17 = i16 + 1;
            i11 ^= h(i12, this._Km[i17], this._Kr[i17]);
            int i18 = i16 + 2;
            i10 ^= i(i11, this._Km[i18], this._Kr[i18]);
            int i19 = i16 + 3;
            i13 ^= g(i10, this._Km[i19], this._Kr[i19]);
            i15++;
        }
        for (i14 = 6; i14 < 12; i14++) {
            int i20 = (11 - i14) * 4;
            int i21 = i20 + 3;
            i13 ^= g(i10, this._Km[i21], this._Kr[i21]);
            int i22 = i20 + 2;
            i10 ^= i(i11, this._Km[i22], this._Kr[i22]);
            int i23 = i20 + 1;
            i11 ^= h(i12, this._Km[i23], this._Kr[i23]);
            i12 ^= g(i13, this._Km[i20], this._Kr[i20]);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
    }

    public final void o(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = 0;
        while (true) {
            if (i15 >= 6) {
                break;
            }
            int i16 = i15 * 4;
            i12 ^= g(i13, this._Km[i16], this._Kr[i16]);
            int i17 = i16 + 1;
            i11 ^= h(i12, this._Km[i17], this._Kr[i17]);
            int i18 = i16 + 2;
            i10 ^= i(i11, this._Km[i18], this._Kr[i18]);
            int i19 = i16 + 3;
            i13 ^= g(i10, this._Km[i19], this._Kr[i19]);
            i15++;
        }
        for (i14 = 6; i14 < 12; i14++) {
            int i20 = i14 * 4;
            int i21 = i20 + 3;
            i13 ^= g(i10, this._Km[i21], this._Kr[i21]);
            int i22 = i20 + 2;
            i10 ^= i(i11, this._Km[i22], this._Kr[i22]);
            int i23 = i20 + 1;
            i11 ^= h(i12, this._Km[i23], this._Kr[i23]);
            i12 ^= g(i13, this._Km[i20], this._Kr[i20]);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
    }

    @Override // org.spongycastle.crypto.engines.C5954d, org.spongycastle.crypto.e
    public void reset() {
    }
}
