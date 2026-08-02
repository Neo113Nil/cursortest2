package org.spongycastle.crypto.engines;

/* renamed from: org.spongycastle.crypto.engines.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5958h extends K {
    @Override // org.spongycastle.crypto.engines.K
    public void b() {
        int[] iArr = this.engineState;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // org.spongycastle.crypto.engines.K
    public void c(byte[] bArr) {
        C5959i.l(this.f62495a, this.engineState, this.f62501x);
        Aj.f.h(this.f62501x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.engines.K
    public int d() {
        return 12;
    }

    @Override // org.spongycastle.crypto.engines.K
    public void g() {
        this.engineState[12] = 0;
    }

    @Override // org.spongycastle.crypto.engines.K, org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "ChaCha7539-" + this.f62495a;
    }

    @Override // org.spongycastle.crypto.engines.K
    public void k(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 256 bit key");
            }
            f(bArr.length, this.engineState, 0);
            Aj.f.j(bArr, 0, this.engineState, 4, 8);
        }
        Aj.f.j(bArr2, 0, this.engineState, 13, 3);
    }
}
