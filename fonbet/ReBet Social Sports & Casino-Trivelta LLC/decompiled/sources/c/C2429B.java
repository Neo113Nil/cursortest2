package c;

import com.appsflyer.AdRevenueScheme;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2429B {

    /* renamed from: a, reason: collision with root package name */
    public final String f26370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26371b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26372c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26373d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f26374e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f26375f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f26376g;

    public C2429B(String str, String str2, String str3, String str4, Long l10, Long l11, Long l12) {
        this.f26370a = str;
        this.f26371b = str2;
        this.f26372c = str3;
        this.f26373d = str4;
        this.f26374e = l10;
        this.f26375f = l11;
        this.f26376g = l12;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("build_fingerprint", this.f26370a), TuplesKt.to("build_id", this.f26371b), TuplesKt.to("language", this.f26372c), TuplesKt.to(AdRevenueScheme.COUNTRY, this.f26373d), TuplesKt.to("app_install_time", this.f26374e), TuplesKt.to("app_update_time", this.f26375f), TuplesKt.to("days_since_install", this.f26376g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2429B)) {
            return false;
        }
        C2429B c2429b = (C2429B) obj;
        return Intrinsics.areEqual(this.f26370a, c2429b.f26370a) && Intrinsics.areEqual(this.f26371b, c2429b.f26371b) && Intrinsics.areEqual(this.f26372c, c2429b.f26372c) && Intrinsics.areEqual(this.f26373d, c2429b.f26373d) && Intrinsics.areEqual(this.f26374e, c2429b.f26374e) && Intrinsics.areEqual(this.f26375f, c2429b.f26375f) && Intrinsics.areEqual(this.f26376g, c2429b.f26376g);
    }

    public final int hashCode() {
        String str = this.f26370a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26371b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26372c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26373d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.f26374e;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f26375f;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f26376g;
        return hashCode6 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        return "Software(build_fingerprint=" + this.f26370a + ", build_id=" + this.f26371b + ", language=" + this.f26372c + ", country=" + this.f26373d + ", app_install_time=" + this.f26374e + ", app_update_time=" + this.f26375f + ", days_since_install=" + this.f26376g + ')';
    }
}
