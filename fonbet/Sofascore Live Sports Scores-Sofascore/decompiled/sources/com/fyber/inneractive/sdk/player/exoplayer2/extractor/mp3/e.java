package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.unity3d.services.UnityAdsConstants;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e implements b {
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;
    public final long e;
    public final int f;

    public e(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.f = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        if (!a()) {
            return this.a;
        }
        float f = (j * 100.0f) / this.b;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f >= 100.0f) {
                f2 = 256.0f;
            } else {
                int i = (int) f;
                if (i != 0) {
                    f2 = this.d[i - 1];
                }
                f2 = me4.b(f, i, (i < 99 ? this.d[i] : 256.0f) - f2, f2);
            }
        }
        long round = Math.round(f2 * 0.00390625d * this.e);
        long j2 = this.a;
        long j3 = round + j2;
        long j4 = this.c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - this.f) + this.e) - 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j) {
        if (a()) {
            if (j >= this.a) {
                double d = ((j - r4) * 256.0d) / this.e;
                int a = z.a(this.d, (long) d, false);
                int i = a + 1;
                long j2 = (i * this.b) / 100;
                long j3 = i == 0 ? 0L : this.d[a];
                return j2 + ((i == 99 ? 256L : this.d[i]) != j3 ? (long) (((d - j3) * (((r7 * (a + 2)) / 100) - j2)) / (r16 - j3)) : 0L);
            }
        }
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.d != null;
    }
}
