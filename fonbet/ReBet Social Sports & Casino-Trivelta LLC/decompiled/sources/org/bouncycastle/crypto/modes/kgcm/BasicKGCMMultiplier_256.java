package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes5.dex */
public class BasicKGCMMultiplier_256 implements KGCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private final long[] f61749H = new long[4];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_256.copy(jArr, this.f61749H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_256.multiply(jArr, this.f61749H, jArr);
    }
}
