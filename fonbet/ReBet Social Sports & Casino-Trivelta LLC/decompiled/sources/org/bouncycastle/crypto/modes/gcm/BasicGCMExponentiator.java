package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* renamed from: x, reason: collision with root package name */
    private long[] f61739x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j10, byte[] bArr) {
        long[] oneAsLongs = GCMUtil.oneAsLongs();
        if (j10 > 0) {
            long[] clone = Arrays.clone(this.f61739x);
            do {
                if ((1 & j10) != 0) {
                    GCMUtil.multiply(oneAsLongs, clone);
                }
                GCMUtil.square(clone, clone);
                j10 >>>= 1;
            } while (j10 > 0);
        }
        GCMUtil.asBytes(oneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f61739x = GCMUtil.asLongs(bArr);
    }
}
