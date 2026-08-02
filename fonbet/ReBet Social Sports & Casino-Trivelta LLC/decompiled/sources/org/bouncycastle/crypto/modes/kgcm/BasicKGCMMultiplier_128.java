package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes5.dex */
public class BasicKGCMMultiplier_128 implements KGCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private final long[] f61748H = new long[2];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_128.copy(jArr, this.f61748H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_128.multiply(jArr, this.f61748H, jArr);
    }
}
