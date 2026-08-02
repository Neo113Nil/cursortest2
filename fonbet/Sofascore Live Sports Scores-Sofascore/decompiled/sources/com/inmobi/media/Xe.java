package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xe extends AbstractC3291af {
    public final String a;
    public final Map b;
    public final Ok c;
    public final Map d;
    public final Vi e;
    public final boolean f;

    public Xe(String str, HashMap hashMap, Ok ok, Map map, Vi vi, boolean z, int i) {
        hashMap = (i & 2) != 0 ? null : hashMap;
        ok = (i & 4) != 0 ? null : ok;
        map = (i & 8) != 0 ? null : map;
        vi = (i & 16) != 0 ? null : vi;
        z = (i & 32) != 0 ? true : z;
        str.getClass();
        this.a = str;
        this.b = hashMap;
        this.c = ok;
        this.d = map;
        this.e = vi;
        this.f = z;
        String a = AbstractC3446gf.a(str, map);
        a.getClass();
        this.a = a;
    }

    @Override // com.inmobi.media.AbstractC3291af
    public final Map a() {
        return this.b;
    }

    @Override // com.inmobi.media.AbstractC3291af
    public final Vi b() {
        return this.e;
    }

    @Override // com.inmobi.media.AbstractC3291af
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xe)) {
            return false;
        }
        Xe xe = (Xe) obj;
        return Intrinsics.c(this.a, xe.a) && Intrinsics.c(this.b, xe.b) && Intrinsics.c(this.c, xe.c) && Intrinsics.c(this.d, xe.d) && Intrinsics.c(this.e, xe.e) && this.f == xe.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Ok ok = this.c;
        int hashCode3 = (hashCode2 + (ok == null ? 0 : ok.hashCode())) * 31;
        Map map2 = this.d;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Vi vi = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (vi != null ? vi.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.a + "', headers=" + this.b + ", queryParams=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
