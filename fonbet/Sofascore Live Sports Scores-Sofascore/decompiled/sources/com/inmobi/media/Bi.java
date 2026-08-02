package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.vxd;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Bi {
    public final C3845w0 a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final C3716r1 j;
    public final Gi k;
    public final String l;
    public final InlineParams m;

    public Bi(C3845w0 c3845w0, String str, String str2, String str3, int i, String str4, String str5, boolean z, int i2, C3716r1 c3716r1, Gi gi, String str6, InlineParams inlineParams) {
        c3845w0.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = c3845w0;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = i2;
        this.j = c3716r1;
        this.k = gi;
        this.l = str6;
        this.m = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bi)) {
            return false;
        }
        Bi bi = (Bi) obj;
        return Intrinsics.c(this.a, bi.a) && Intrinsics.c(this.b, bi.b) && Intrinsics.c(this.c, bi.c) && Intrinsics.c(this.d, bi.d) && this.e == bi.e && Intrinsics.c(this.f, bi.f) && Intrinsics.c(this.g, bi.g) && this.h == bi.h && this.i == bi.i && Intrinsics.c(this.j, bi.j) && Intrinsics.c(this.k, bi.k) && Intrinsics.c(this.l, bi.l) && Intrinsics.c(this.m, bi.m);
    }

    public final int hashCode() {
        int a = Ai.a(this.i, dmi.e(dmi.c(dmi.c(Ai.a(this.e, dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31);
        C3716r1 c3716r1 = this.j;
        int hashCode = (a + (c3716r1 == null ? 0 : c3716r1.hashCode())) * 31;
        Gi gi = this.k;
        int hashCode2 = (hashCode + (gi == null ? 0 : Integer.hashCode(gi.a))) * 31;
        String str = this.l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.m;
        return hashCode3 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        C3845w0 c3845w0 = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        int i = this.e;
        String str4 = this.f;
        String str5 = this.g;
        boolean z = this.h;
        int i2 = this.i;
        C3716r1 c3716r1 = this.j;
        Gi gi = this.k;
        String str6 = this.l;
        InlineParams inlineParams = this.m;
        StringBuilder sb = new StringBuilder("RenderViewMetaData(placement=");
        sb.append(c3845w0);
        sb.append(", markupType=");
        sb.append(str);
        sb.append(", impressionId=");
        bf3.v(sb, str2, ", telemetryMetadataBlob=", str3, ", internetAvailabilityAdRetryCount=");
        vxd.p(i, ", creativeType=", str4, ", creativeId=", sb);
        dmi.w(sb, str5, ", isRewarded=", z, ", adIndex=");
        sb.append(i2);
        sb.append(", adUnitTelemetryData=");
        sb.append(c3716r1);
        sb.append(", renderViewTelemetryData=");
        sb.append(gi);
        sb.append(", renderViewId=");
        sb.append(str6);
        sb.append(", inlineParams=");
        sb.append(inlineParams);
        sb.append(")");
        return sb.toString();
    }
}
