package com.inmobi.media;

import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.ljg;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3638o0 {
    public final String a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final AbstractC3587m1 i;
    public final String j;
    public final LinkedHashMap k;
    public final Boolean l;
    public final WatermarkData m;
    public final AdQualityControl n;
    public final byte o;
    public final LinkedHashSet p;
    public final String q;
    public final String r;
    public final Bi s;
    public final C3906y9 t;

    public C3638o0(String str, boolean z, long j, boolean z2, String str2, String str3, String str4, String str5, AbstractC3587m1 abstractC3587m1, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b, LinkedHashSet linkedHashSet, String str7, String str8, Bi bi, C3906y9 c3906y9) {
        str8.getClass();
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = abstractC3587m1;
        this.j = str6;
        this.k = linkedHashMap;
        this.l = bool;
        this.m = watermarkData;
        this.n = adQualityControl;
        this.o = b;
        this.p = linkedHashSet;
        this.q = str7;
        this.r = str8;
        this.s = bi;
        this.t = c3906y9;
    }

    public static C3638o0 a(C3638o0 c3638o0, Bi bi, int i) {
        String str;
        Bi bi2;
        String str2 = c3638o0.a;
        boolean z = c3638o0.b;
        long j = c3638o0.c;
        boolean z2 = c3638o0.d;
        String str3 = c3638o0.e;
        String str4 = c3638o0.f;
        String str5 = c3638o0.g;
        String str6 = c3638o0.h;
        String str7 = c3638o0.j;
        LinkedHashMap linkedHashMap = c3638o0.k;
        Boolean bool = c3638o0.l;
        WatermarkData watermarkData = (i & 4096) != 0 ? c3638o0.m : null;
        AdQualityControl adQualityControl = c3638o0.n;
        byte b = c3638o0.o;
        LinkedHashSet linkedHashSet = c3638o0.p;
        String str8 = c3638o0.q;
        String str9 = c3638o0.r;
        if ((i & 524288) != 0) {
            str = str9;
            bi2 = c3638o0.s;
        } else {
            str = str9;
            bi2 = bi;
        }
        C3906y9 c3906y9 = c3638o0.t;
        str.getClass();
        return new C3638o0(str2, z, j, z2, str3, str4, str5, str6, null, str7, linkedHashMap, bool, watermarkData, adQualityControl, b, linkedHashSet, str8, str, bi2, c3906y9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3638o0)) {
            return false;
        }
        C3638o0 c3638o0 = (C3638o0) obj;
        return Intrinsics.c(this.a, c3638o0.a) && this.b == c3638o0.b && this.c == c3638o0.c && this.d == c3638o0.d && Intrinsics.c(this.e, c3638o0.e) && Intrinsics.c(this.f, c3638o0.f) && Intrinsics.c(this.g, c3638o0.g) && Intrinsics.c(this.h, c3638o0.h) && Intrinsics.c(this.i, c3638o0.i) && Intrinsics.c(this.j, c3638o0.j) && Intrinsics.c(this.k, c3638o0.k) && Intrinsics.c(this.l, c3638o0.l) && Intrinsics.c(this.m, c3638o0.m) && Intrinsics.c(this.n, c3638o0.n) && this.o == c3638o0.o && Intrinsics.c(this.p, c3638o0.p) && Intrinsics.c(this.q, c3638o0.q) && Intrinsics.c(this.r, c3638o0.r) && Intrinsics.c(this.s, c3638o0.s) && Intrinsics.c(this.t, c3638o0.t);
    }

    public final int hashCode() {
        String str = this.a;
        int e = dmi.e(ljg.c(dmi.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str2 = this.e;
        int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int c = dmi.c((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        int hashCode2 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC3587m1 abstractC3587m1 = this.i;
        int hashCode3 = (hashCode2 + (abstractC3587m1 == null ? 0 : abstractC3587m1.hashCode())) * 31;
        String str5 = this.j;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.k;
        int hashCode5 = (this.l.hashCode() + ((hashCode4 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        WatermarkData watermarkData = this.m;
        int hashCode6 = (hashCode5 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.n;
        int hashCode7 = (this.p.hashCode() + ((Byte.hashCode(this.o) + ((hashCode6 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.q;
        int c2 = dmi.c(dmi.e((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, false), 31, this.r);
        Bi bi = this.s;
        int hashCode8 = (c2 + (bi == null ? 0 : bi.hashCode())) * 31;
        C3906y9 c3906y9 = this.t;
        return Long.hashCode(-1L) + ((hashCode8 + (c3906y9 != null ? c3906y9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        long j = this.c;
        boolean z2 = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        AbstractC3587m1 abstractC3587m1 = this.i;
        String str6 = this.j;
        LinkedHashMap linkedHashMap = this.k;
        Boolean bool = this.l;
        WatermarkData watermarkData = this.m;
        AdQualityControl adQualityControl = this.n;
        byte b = this.o;
        LinkedHashSet linkedHashSet = this.p;
        String str7 = this.q;
        String str8 = this.r;
        Bi bi = this.s;
        C3906y9 c3906y9 = this.t;
        StringBuilder sb = new StringBuilder("AdMetaData(adType=");
        sb.append(str);
        sb.append(", isImmersiveMode=");
        sb.append(z);
        sb.append(", placementId=");
        sb.append(j);
        sb.append(", allowAutoRedirection=");
        sb.append(z2);
        bf3.v(sb, ", creativeId=", str2, ", creativeType=", str3);
        bf3.v(sb, ", markupTypeAdUnit=", str4, ", adSize=", str5);
        sb.append(", adPodHandler=");
        sb.append(abstractC3587m1);
        sb.append(", contentURL=");
        sb.append(str6);
        sb.append(", telemetryManagerMap=");
        sb.append(linkedHashMap);
        sb.append(", isHardwareAccelerationDisabled=");
        sb.append(bool);
        sb.append(", watermarkData=");
        sb.append(watermarkData);
        sb.append(", adQualityControl=");
        sb.append(adQualityControl);
        sb.append(", placementType=");
        sb.append((int) b);
        sb.append(", viewabilityTrackers=");
        sb.append(linkedHashSet);
        bf3.v(sb, ", impressionId=", str7, ", isInAppBrowser=false, landingScheme=", str8);
        sb.append(", renderViewMetaData=");
        sb.append(bi);
        sb.append(", logger=");
        sb.append(c3906y9);
        sb.append(", viewTouchTimestamp=-1)");
        return sb.toString();
    }
}
