package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes5.dex */
public class BasicKGCMMultiplier_512 implements KGCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private final long[] f61750H = new long[8];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_512.copy(jArr, this.f61750H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_512.multiply(jArr, this.f61750H, jArr);
    }
}
