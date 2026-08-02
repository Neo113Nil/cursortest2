package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g {
    public int a;
    public long[] b = new long[32];

    public final void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            jArr = Arrays.copyOf(jArr, i * 2);
            this.b = jArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        jArr[i2] = j;
    }
}
