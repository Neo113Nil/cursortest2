package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes5.dex */
public class BasicGCMMultiplier implements GCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private long[] f61740H;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.f61740H = GCMUtil.asLongs(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] asLongs = GCMUtil.asLongs(bArr);
        GCMUtil.multiply(asLongs, this.f61740H);
        GCMUtil.asBytes(asLongs, bArr);
    }
}
