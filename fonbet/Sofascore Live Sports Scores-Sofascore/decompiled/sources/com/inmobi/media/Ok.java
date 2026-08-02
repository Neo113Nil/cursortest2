package com.inmobi.media;

import defpackage.fn0;
import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ok {
    public final long a;
    public final long b;
    public final long c;

    public Ok(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ok)) {
            return false;
        }
        Ok ok = (Ok) obj;
        return this.a == ok.a && this.b == ok.b && this.c == ok.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ljg.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder o = ljg.o("TimeoutConfig(connectTimeoutInSec=", j, ", readTimeoutInSec=");
        o.append(j2);
        return fn0.l(j3, ", callTimeoutInSec=", ")", o);
    }
}
