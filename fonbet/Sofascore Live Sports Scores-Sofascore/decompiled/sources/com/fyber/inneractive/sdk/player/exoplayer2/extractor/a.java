package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements q {
    public final long[] a;
    public final long[] b;
    public final long c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.c = 0L;
        } else {
            int i = length - 1;
            this.c = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        return this.a[z.a(this.b, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }
}
