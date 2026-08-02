package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class Tables4kGCMMultiplier implements GCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f61742H;

    /* renamed from: T, reason: collision with root package name */
    private long[][] f61743T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f61743T == null) {
            this.f61743T = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (Arrays.areEqual(this.f61742H, bArr)) {
            return;
        }
        byte[] clone = Arrays.clone(bArr);
        this.f61742H = clone;
        GCMUtil.asLongs(clone, this.f61743T[1]);
        long[] jArr = this.f61743T[1];
        GCMUtil.multiplyP7(jArr, jArr);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr2 = this.f61743T;
            GCMUtil.divideP(jArr2[i10 >> 1], jArr2[i10]);
            long[][] jArr3 = this.f61743T;
            GCMUtil.xor(jArr3[i10], jArr3[1], jArr3[i10 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.f61743T[bArr[15] & UByte.MAX_VALUE];
        long j10 = jArr[0];
        long j11 = jArr[1];
        for (int i10 = 14; i10 >= 0; i10--) {
            long[] jArr2 = this.f61743T[bArr[i10] & UByte.MAX_VALUE];
            long j12 = j11 << 56;
            j11 = ((j11 >>> 8) | (j10 << 56)) ^ jArr2[1];
            j10 = (((((j10 >>> 8) ^ jArr2[0]) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2)) ^ (j12 >>> 7);
        }
        Pack.longToBigEndian(j10, bArr, 0);
        Pack.longToBigEndian(j11, bArr, 8);
    }
}
