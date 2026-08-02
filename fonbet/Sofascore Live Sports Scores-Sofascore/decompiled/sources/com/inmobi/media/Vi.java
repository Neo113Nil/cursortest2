package com.inmobi.media;

import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vi {
    public final int a;
    public final long b;

    public Vi(int i, long j, int i2) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vi)) {
            return false;
        }
        Vi vi = (Vi) obj;
        return this.a == vi.a && this.b == vi.b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + ljg.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.a + ", retryInterval=" + this.b + ", delayFactor=1.0)";
    }

    public Vi(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
