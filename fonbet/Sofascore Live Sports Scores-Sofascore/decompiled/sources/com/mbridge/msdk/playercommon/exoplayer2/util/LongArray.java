package com.mbridge.msdk.playercommon.exoplayer2.util;

import defpackage.lnb;
import defpackage.pvd;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray(int i) {
        this.values = new long[i];
    }

    public void add(long j) {
        int i = this.size;
        long[] jArr = this.values;
        if (i == jArr.length) {
            jArr = Arrays.copyOf(jArr, i * 2);
            this.values = jArr;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        jArr[i2] = j;
    }

    public long get(int i) {
        if (i >= 0 && i < this.size) {
            return this.values[i];
        }
        pvd.m(this.size, lnb.t(i, "Invalid index ", ", size is "));
        return 0L;
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray() {
        this(32);
    }
}
