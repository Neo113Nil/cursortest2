package org.spongycastle.crypto.engines;

/* loaded from: classes5.dex */
public class W extends K {
    @Override // org.spongycastle.crypto.engines.K
    public int d() {
        return 24;
    }

    @Override // org.spongycastle.crypto.engines.K, org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "XSalsa20";
    }

    @Override // org.spongycastle.crypto.engines.K
    public void k(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException(getAlgorithmName() + " doesn't support re-init with null key");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires a 256 bit key");
        }
        super.k(bArr, bArr2);
        Aj.f.j(bArr2, 8, this.engineState, 8, 2);
        int[] iArr = this.engineState;
        int[] iArr2 = new int[iArr.length];
        K.j(20, iArr, iArr2);
        int[] iArr3 = this.engineState;
        iArr3[1] = iArr2[0] - iArr3[0];
        iArr3[2] = iArr2[5] - iArr3[5];
        iArr3[3] = iArr2[10] - iArr3[10];
        iArr3[4] = iArr2[15] - iArr3[15];
        iArr3[11] = iArr2[6] - iArr3[6];
        iArr3[12] = iArr2[7] - iArr3[7];
        iArr3[13] = iArr2[8] - iArr3[8];
        iArr3[14] = iArr2[9] - iArr3[9];
        Aj.f.j(bArr2, 16, iArr3, 6, 2);
    }
}
