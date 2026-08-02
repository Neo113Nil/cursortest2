package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* renamed from: org.spongycastle.crypto.engines.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5968s implements org.spongycastle.crypto.e {
    private int[] workingKey = null;

    private int[] e(boolean z10, byte[] bArr) {
        return z10 ? d(bArr) : g(d(bArr));
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.workingKey = e(z10, ((org.spongycastle.crypto.params.w) jVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + jVar.getClass().getName());
    }

    public int b(int i10) {
        return (0 - i10) & 65535;
    }

    public final int c(byte[] bArr, int i10) {
        return ((bArr[i10] << 8) & 65280) + (bArr[i10 + 1] & UByte.MAX_VALUE);
    }

    public final int[] d(byte[] bArr) {
        int i10;
        int[] iArr = new int[52];
        int i11 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i11 >= 8) {
                break;
            }
            iArr[i11] = c(bArr, i11 * 2);
            i11++;
        }
        for (i10 = 8; i10 < 52; i10++) {
            int i12 = i10 & 7;
            if (i12 < 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 6] >> 7)) & 65535;
            } else if (i12 == 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            } else {
                iArr[i10] = (((iArr[i10 - 15] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    public final void f(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 2);
        int c12 = c(bArr, i10 + 4);
        int c13 = c(bArr, i10 + 6);
        int i12 = 0;
        int i13 = c12;
        int i14 = c11;
        int i15 = c10;
        int i16 = 0;
        while (i12 < 8) {
            int h10 = h(i15, iArr[i16]);
            int i17 = (i14 + iArr[i16 + 1]) & 65535;
            int i18 = (i13 + iArr[i16 + 2]) & 65535;
            int h11 = h(c13, iArr[i16 + 3]);
            int i19 = i16 + 5;
            int h12 = h(i18 ^ h10, iArr[i16 + 4]);
            i16 += 6;
            int h13 = h(((i17 ^ h11) + h12) & 65535, iArr[i19]);
            int i20 = 65535 & (h12 + h13);
            i15 = h10 ^ h13;
            c13 = h11 ^ i20;
            int i21 = i18 ^ h13;
            i12++;
            i13 = i17 ^ i20;
            i14 = i21;
        }
        j(h(i15, iArr[i16]), bArr2, i11);
        j(i13 + iArr[i16 + 1], bArr2, i11 + 2);
        j(i14 + iArr[i16 + 2], bArr2, i11 + 4);
        j(h(c13, iArr[i16 + 3]), bArr2, i11 + 6);
    }

    public final int[] g(int[] iArr) {
        int[] iArr2 = new int[52];
        int i10 = i(iArr[0]);
        int b10 = b(iArr[1]);
        int b11 = b(iArr[2]);
        iArr2[51] = i(iArr[3]);
        iArr2[50] = b11;
        iArr2[49] = b10;
        int i11 = 48;
        iArr2[48] = i10;
        int i12 = 4;
        for (int i13 = 1; i13 < 8; i13++) {
            int i14 = iArr[i12];
            iArr2[i11 - 1] = iArr[i12 + 1];
            iArr2[i11 - 2] = i14;
            int i15 = i(iArr[i12 + 2]);
            int b12 = b(iArr[i12 + 3]);
            int i16 = i12 + 5;
            int b13 = b(iArr[i12 + 4]);
            i12 += 6;
            iArr2[i11 - 3] = i(iArr[i16]);
            iArr2[i11 - 4] = b12;
            iArr2[i11 - 5] = b13;
            i11 -= 6;
            iArr2[i11] = i15;
        }
        int i17 = iArr[i12];
        iArr2[i11 - 1] = iArr[i12 + 1];
        iArr2[i11 - 2] = i17;
        int i18 = i(iArr[i12 + 2]);
        int b14 = b(iArr[i12 + 3]);
        int b15 = b(iArr[i12 + 4]);
        iArr2[i11 - 3] = i(iArr[i12 + 5]);
        iArr2[i11 - 4] = b15;
        iArr2[i11 - 5] = b14;
        iArr2[i11 - 6] = i18;
        return iArr2;
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    public final int h(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = 65537 - i11;
        } else if (i11 == 0) {
            i12 = 65537 - i10;
        } else {
            int i13 = i10 * i11;
            int i14 = i13 & 65535;
            int i15 = i13 >>> 16;
            i12 = (i14 - i15) + (i14 < i15 ? 1 : 0);
        }
        return i12 & 65535;
    }

    public final int i(int i10) {
        if (i10 < 2) {
            return i10;
        }
        int i11 = 65537 / i10;
        int i12 = 65537 % i10;
        int i13 = 1;
        while (i12 != 1) {
            int i14 = i10 / i12;
            i10 %= i12;
            i13 = (i13 + (i14 * i11)) & 65535;
            if (i10 == 1) {
                return i13;
            }
            int i15 = i12 / i10;
            i12 %= i10;
            i11 = (i11 + (i15 * i13)) & 65535;
        }
        return (1 - i11) & 65535;
    }

    public final void j(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        f(iArr, bArr, i10, bArr2, i11);
        return 8;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
