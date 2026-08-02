package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class Tables8kGCMMultiplier implements GCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f61746H;

    /* renamed from: T, reason: collision with root package name */
    private long[][][] f61747T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f61747T == null) {
            this.f61747T = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, 32, 16, 2);
        } else if (Arrays.areEqual(this.f61746H, bArr)) {
            return;
        }
        this.f61746H = Arrays.clone(bArr);
        for (int i10 = 0; i10 < 32; i10++) {
            long[][][] jArr = this.f61747T;
            long[][] jArr2 = jArr[i10];
            if (i10 == 0) {
                GCMUtil.asLongs(this.f61746H, jArr2[1]);
                long[] jArr3 = jArr2[1];
                GCMUtil.multiplyP3(jArr3, jArr3);
            } else {
                GCMUtil.multiplyP4(jArr[i10 - 1][1], jArr2[1]);
            }
            for (int i11 = 2; i11 < 16; i11 += 2) {
                GCMUtil.divideP(jArr2[i11 >> 1], jArr2[i11]);
                GCMUtil.xor(jArr2[i11], jArr2[1], jArr2[i11 + 1]);
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 15; i10 >= 0; i10--) {
            long[][][] jArr = this.f61747T;
            int i11 = i10 + i10;
            long[][] jArr2 = jArr[i11 + 1];
            byte b10 = bArr[i10];
            long[] jArr3 = jArr2[b10 & 15];
            long[] jArr4 = jArr[i11][(b10 & 240) >>> 4];
            j10 ^= jArr3[0] ^ jArr4[0];
            j11 ^= jArr4[1] ^ jArr3[1];
        }
        Pack.longToBigEndian(j10, bArr, 0);
        Pack.longToBigEndian(j11, bArr, 8);
    }
}
