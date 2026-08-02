package com.google.android.gms.internal.ads;

import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzej {
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;

    public zzej() {
        throw null;
    }

    public final long a() {
        int i = this.c;
        if (i == 0) {
            yhk.d();
            return 0L;
        }
        long[] jArr = this.d;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.e & (i2 + 1);
        this.c = i - 1;
        return j;
    }
}
