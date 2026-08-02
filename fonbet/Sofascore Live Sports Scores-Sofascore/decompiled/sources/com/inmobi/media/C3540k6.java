package com.inmobi.media;

import defpackage.fn0;
import defpackage.ljg;
import defpackage.me4;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3540k6 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public String k;

    public C3540k6(int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, long j4, long j5) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3540k6)) {
            return false;
        }
        C3540k6 c3540k6 = (C3540k6) obj;
        return this.a == c3540k6.a && this.b == c3540k6.b && this.c == c3540k6.c && this.d == c3540k6.d && this.e == c3540k6.e && this.f == c3540k6.f && this.g == c3540k6.g && this.h == c3540k6.h && this.i == c3540k6.i && this.j == c3540k6.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ljg.c(Ai.a(this.h, Ai.a(this.g, Ai.a(this.f, Ai.a(this.e, ljg.c(ljg.c(ljg.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31), 31, this.i);
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        long j4 = this.i;
        long j5 = this.j;
        StringBuilder sb = new StringBuilder("EventConfig(maxRetryCount=");
        sb.append(i);
        sb.append(", timeToLiveInSec=");
        sb.append(j);
        fn0.t(j2, ", processingInterval=", ", ingestionLatencyInSec=", sb);
        sb.append(j3);
        sb.append(", minBatchSizeWifi=");
        sb.append(i2);
        me4.r(sb, ", maxBatchSizeWifi=", i3, ", minBatchSizeMobile=", i4);
        wt3.u(i5, ", maxBatchSizeMobile=", ", retryIntervalWifi=", sb);
        sb.append(j4);
        return fn0.l(j5, ", retryIntervalMobile=", ")", sb);
    }
}
