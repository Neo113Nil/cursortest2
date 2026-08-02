package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3628ng {
    public final C3473hg a;
    public final int b;
    public final String c;
    public final long d;

    public C3628ng(C3473hg c3473hg, int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        c3473hg.getClass();
        this.a = c3473hg;
        this.b = i;
        this.c = str;
        this.d = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3628ng)) {
            return false;
        }
        C3628ng c3628ng = (C3628ng) obj;
        return Intrinsics.c(this.a, c3628ng.a) && this.b == c3628ng.b && Intrinsics.c(this.c, c3628ng.c) && this.d == c3628ng.d;
    }

    public final int hashCode() {
        int a = Ai.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Long.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        C3473hg c3473hg = this.a;
        int i = this.b;
        String str = this.c;
        long j = this.d;
        StringBuilder sb = new StringBuilder("PingResult(ping=");
        sb.append(c3473hg);
        sb.append(", statusCode=");
        sb.append(i);
        sb.append(", error=");
        com.appsflyer.internal.i.n(j, str, ", timestamp=", sb);
        sb.append(")");
        return sb.toString();
    }
}
