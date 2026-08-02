package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.ljg;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public o(String str, long j, long j2, int i, int i2, int i3, int i4, int i5) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.c(this.a, oVar.a) && this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.e == oVar.e && this.f == oVar.f && this.g == oVar.g && this.h == oVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + wv8.a(this.g, wv8.a(this.f, wv8.a(this.e, wv8.a(this.d, ljg.c(ljg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IlrdSignal(sessionId=");
        sb.append(this.a);
        sb.append(", sessionStartTs=");
        sb.append(this.b);
        sb.append(", lastImpressionTs=");
        sb.append(this.c);
        sb.append(", bannerImpressionCount=");
        sb.append(this.d);
        sb.append(", mrecImpressionCount=");
        sb.append(this.e);
        sb.append(", nativeImpressionCount=");
        sb.append(this.f);
        sb.append(", interstitialImpressionCount=");
        sb.append(this.g);
        sb.append(", rewardedImpressionCount=");
        return wv8.j(sb, this.h, ')');
    }
}
