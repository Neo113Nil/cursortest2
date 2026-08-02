package Cg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2280b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2281c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2282d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2283e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2284f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2285g;

    /* renamed from: h, reason: collision with root package name */
    public String f2286h;

    /* renamed from: i, reason: collision with root package name */
    public String f2287i;

    /* renamed from: j, reason: collision with root package name */
    public String f2288j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2289k;

    /* renamed from: l, reason: collision with root package name */
    public String f2290l;

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f2279a = str;
        this.f2280b = str2;
        this.f2281c = str3;
        this.f2282d = str4;
        this.f2283e = str5;
        this.f2284f = str6;
        this.f2285g = str7;
        this.f2286h = str8;
        this.f2287i = str9;
        this.f2288j = str10;
        this.f2289k = z10;
        this.f2290l = baseUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f2279a, cVar.f2279a) && Intrinsics.areEqual(this.f2280b, cVar.f2280b) && Intrinsics.areEqual(this.f2281c, cVar.f2281c) && Intrinsics.areEqual(this.f2282d, cVar.f2282d) && Intrinsics.areEqual(this.f2283e, cVar.f2283e) && Intrinsics.areEqual(this.f2284f, cVar.f2284f) && Intrinsics.areEqual(this.f2285g, cVar.f2285g) && Intrinsics.areEqual(this.f2286h, cVar.f2286h) && Intrinsics.areEqual(this.f2287i, cVar.f2287i) && Intrinsics.areEqual(this.f2288j, cVar.f2288j) && this.f2289k == cVar.f2289k && Intrinsics.areEqual(this.f2290l, cVar.f2290l);
    }

    public int hashCode() {
        String str = this.f2279a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2280b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2281c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2282d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2283e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2284f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2285g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f2286h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f2287i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f2288j;
        return ((((hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31) + Boolean.hashCode(this.f2289k)) * 31) + this.f2290l.hashCode();
    }

    public String toString() {
        return "ZSIQAVRtcpData(userName=" + this.f2279a + ", appName=" + this.f2280b + ", packageName=" + this.f2281c + ", clientOtp=" + this.f2282d + ", callKey=" + this.f2283e + ", userId=" + this.f2284f + ", conversationId=" + this.f2285g + ", mediaId=" + this.f2286h + ", authToken=" + this.f2287i + ", recordingType=" + this.f2288j + ", isIncoming=" + this.f2289k + ", baseUrl=" + this.f2290l + ')';
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? false : z10, str11);
    }
}
