package a5;

import Q5.b;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1920b {

    /* renamed from: a, reason: collision with root package name */
    public final String f15069a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15070b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15071c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15072d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15073e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15074f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15075g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15076h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15077i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15078j;

    /* renamed from: k, reason: collision with root package name */
    public final long f15079k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15080l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f15081m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f15082n;

    /* renamed from: o, reason: collision with root package name */
    public final String f15083o;

    /* renamed from: p, reason: collision with root package name */
    public final String f15084p;

    public C1920b(String str, String str2, String method, int i10, String url, String fragments, String host, String schema, String statusText, long j10, long j11, String str3, Map map, Map map2, String str4, String str5) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(schema, "schema");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        this.f15069a = str;
        this.f15070b = str2;
        this.f15071c = method;
        this.f15072d = i10;
        this.f15073e = url;
        this.f15074f = fragments;
        this.f15075g = host;
        this.f15076h = schema;
        this.f15077i = statusText;
        this.f15078j = j10;
        this.f15079k = j11;
        this.f15080l = str3;
        this.f15081m = map;
        this.f15082n = map2;
        this.f15083o = str4;
        this.f15084p = str5;
    }

    public final C1920b a(String str, String str2, String method, int i10, String url, String fragments, String host, String schema, String statusText, long j10, long j11, String str3, Map map, Map map2, String str4, String str5) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(schema, "schema");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        return new C1920b(str, str2, method, i10, url, fragments, host, schema, statusText, j10, j11, str3, map, map2, str4, str5);
    }

    public final long c() {
        return this.f15078j;
    }

    public final String d() {
        return this.f15080l;
    }

    public final String e() {
        return this.f15074f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1920b)) {
            return false;
        }
        C1920b c1920b = (C1920b) obj;
        return Intrinsics.areEqual(this.f15069a, c1920b.f15069a) && Intrinsics.areEqual(this.f15070b, c1920b.f15070b) && Intrinsics.areEqual(this.f15071c, c1920b.f15071c) && this.f15072d == c1920b.f15072d && Intrinsics.areEqual(this.f15073e, c1920b.f15073e) && Intrinsics.areEqual(this.f15074f, c1920b.f15074f) && Intrinsics.areEqual(this.f15075g, c1920b.f15075g) && Intrinsics.areEqual(this.f15076h, c1920b.f15076h) && Intrinsics.areEqual(this.f15077i, c1920b.f15077i) && this.f15078j == c1920b.f15078j && this.f15079k == c1920b.f15079k && Intrinsics.areEqual(this.f15080l, c1920b.f15080l) && Intrinsics.areEqual(this.f15081m, c1920b.f15081m) && Intrinsics.areEqual(this.f15082n, c1920b.f15082n) && Intrinsics.areEqual(this.f15083o, c1920b.f15083o) && Intrinsics.areEqual(this.f15084p, c1920b.f15084p);
    }

    public final String f() {
        return this.f15075g;
    }

    public final String g() {
        return this.f15071c;
    }

    public final Map h() {
        return this.f15081m;
    }

    public int hashCode() {
        String str = this.f15069a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15070b;
        int hashCode2 = (((((((((((((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15071c.hashCode()) * 31) + Integer.hashCode(this.f15072d)) * 31) + this.f15073e.hashCode()) * 31) + this.f15074f.hashCode()) * 31) + this.f15075g.hashCode()) * 31) + this.f15076h.hashCode()) * 31) + this.f15077i.hashCode()) * 31) + Long.hashCode(this.f15078j)) * 31) + Long.hashCode(this.f15079k)) * 31;
        String str3 = this.f15080l;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.f15081m;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f15082n;
        int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str4 = this.f15083o;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15084p;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.f15083o;
    }

    public final long j() {
        return this.f15079k;
    }

    public final Map k() {
        return this.f15082n;
    }

    public final String l() {
        return this.f15084p;
    }

    public final String m() {
        return this.f15076h;
    }

    public final Q5.b n() {
        return this.f15072d >= 400 ? b.e.f9376b : b.f.f9377b;
    }

    public final String o() {
        return this.f15070b;
    }

    public final int p() {
        return this.f15072d;
    }

    public final String q() {
        return this.f15077i;
    }

    public final String r() {
        return this.f15069a;
    }

    public final String s() {
        return this.f15073e;
    }

    public String toString() {
        return "NetworkRequestDetails(traceId=" + this.f15069a + ", spanId=" + this.f15070b + ", method=" + this.f15071c + ", statusCode=" + this.f15072d + ", url=" + this.f15073e + ", fragments=" + this.f15074f + ", host=" + this.f15075g + ", schema=" + this.f15076h + ", statusText=" + this.f15077i + ", duration=" + this.f15078j + ", responseContentLength=" + this.f15079k + ", errorMessage=" + this.f15080l + ", requestHeaders=" + this.f15081m + ", responseHeaders=" + this.f15082n + ", requestPayload=" + this.f15083o + ", responsePayload=" + this.f15084p + ")";
    }

    public /* synthetic */ C1920b(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, long j10, long j11, String str9, Map map, Map map2, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? "" : str6, (i11 & 128) != 0 ? "" : str7, (i11 & 256) == 0 ? str8 : "", (i11 & 512) != 0 ? 0L : j10, (i11 & 1024) == 0 ? j11 : 0L, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : map, (i11 & 8192) != 0 ? null : map2, (i11 & 16384) != 0 ? null : str10, (i11 & 32768) != 0 ? null : str11);
    }
}
