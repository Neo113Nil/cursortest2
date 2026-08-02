package com.inmobi.media;

import defpackage.dmi;
import defpackage.ljg;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3612n0 {
    public final String a;
    public final Map b;
    public final long c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final boolean h;

    public C3612n0(String str, Map map, long j, String str2, String str3, Map map2, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = map;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = map2;
        this.g = str4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3612n0)) {
            return false;
        }
        C3612n0 c3612n0 = (C3612n0) obj;
        return Intrinsics.c(this.a, c3612n0.a) && Intrinsics.c(this.b, c3612n0.b) && this.c == c3612n0.c && Intrinsics.c(this.d, c3612n0.d) && Intrinsics.c(this.e, c3612n0.e) && Intrinsics.c(this.f, c3612n0.f) && Intrinsics.c(this.g, c3612n0.g) && this.h == c3612n0.h;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + 3364) * 31;
        Map map = this.b;
        int c = dmi.c(ljg.c((hashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode2 = (((c + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.g;
        return dmi.e((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.a + ", integrationTypeString=im, extras=" + this.b + ", imPlacementId=" + this.c + ", monetizationContext=" + this.d + ", adType=" + this.e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f + ", keywords=" + this.g + ", isApplicationMutedByPub=" + this.h + ", extraInfo=null)";
    }
}
