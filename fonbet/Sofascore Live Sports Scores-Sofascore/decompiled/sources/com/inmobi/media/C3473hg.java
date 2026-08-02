package com.inmobi.media;

import defpackage.dmi;
import defpackage.ljg;
import defpackage.mz1;
import defpackage.vxd;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3473hg {
    public final String a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;
    public final String h;
    public final long i;
    public final Long j;
    public final Bi k;

    public C3473hg(String str, String str2, Map map, boolean z, String str3, boolean z2, int i, String str4, long j, Long l, Bi bi) {
        str.getClass();
        str2.getClass();
        map.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = str3;
        this.f = z2;
        this.g = i;
        this.h = str4;
        this.i = j;
        this.j = l;
        this.k = bi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3473hg)) {
            return false;
        }
        C3473hg c3473hg = (C3473hg) obj;
        return Intrinsics.c(this.a, c3473hg.a) && Intrinsics.c(this.b, c3473hg.b) && Intrinsics.c(this.c, c3473hg.c) && this.d == c3473hg.d && Intrinsics.c(this.e, c3473hg.e) && this.f == c3473hg.f && this.g == c3473hg.g && Intrinsics.c(this.h, c3473hg.h) && this.i == c3473hg.i && Intrinsics.c(this.j, c3473hg.j) && Intrinsics.c(this.k, c3473hg.k);
    }

    public final int hashCode() {
        int c = ljg.c(dmi.c(Ai.a(this.g, dmi.e(dmi.c(dmi.e(dmi.g(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i);
        Long l = this.j;
        int hashCode = (c + (l == null ? 0 : l.hashCode())) * 31;
        Bi bi = this.k;
        return hashCode + (bi != null ? bi.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        Map map = this.c;
        boolean z = this.d;
        String str3 = this.e;
        boolean z2 = this.f;
        int i = this.g;
        String str4 = this.h;
        long j = this.i;
        Long l = this.j;
        Bi bi = this.k;
        StringBuilder s = mz1.s("Ping(url=", str, ", id=", str2, ", headers=");
        s.append(map);
        s.append(", allowRedirects=");
        s.append(z);
        s.append(", priority=");
        dmi.w(s, str3, ", ackRequired=", z2, ", retryCount=");
        vxd.p(i, ", ownerId=", str4, ", createdAt=", s);
        s.append(j);
        s.append(", retryAfterTimestamp=");
        s.append(l);
        s.append(", telemetryData=");
        s.append(bi);
        s.append(")");
        return s.toString();
    }
}
