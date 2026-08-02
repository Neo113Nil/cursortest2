package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhbg {
    public long[] a;
    public int b;

    public final void a(long j) {
        int i = this.b;
        int i2 = i + 1;
        long[] jArr = this.a;
        int length = jArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            jArr = Arrays.copyOf(jArr, i3);
            this.a = jArr;
        }
        int i4 = this.b;
        jArr[i4] = j;
        this.b = i4 + 1;
    }
}
