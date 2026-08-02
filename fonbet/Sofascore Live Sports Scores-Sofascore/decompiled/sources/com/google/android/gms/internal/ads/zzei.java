package com.google.android.gms.internal.ads;

import defpackage.x5n;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzei {
    public int a;
    public long[] b;

    public zzei(int i) {
        this.b = new long[i];
    }

    public final void a(long[] jArr) {
        int i = this.a;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = this.b;
        int length2 = jArr2.length;
        if (i2 > length2) {
            jArr2 = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
            this.b = jArr2;
        }
        System.arraycopy(jArr, 0, jArr2, this.a, length);
        this.a = i2;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        int i2 = this.a;
        defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i2).length()), i, "Invalid index ", i2, ", size is "));
        return 0L;
    }

    public zzei() {
        this(32);
    }
}
