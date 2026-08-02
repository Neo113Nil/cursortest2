package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26471b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26472c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26473d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f26474e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26475f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26476g;

    public N0(String provider, String str, String str2, String str3, Long l10, String str4, String str5) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f26470a = provider;
        this.f26471b = str;
        this.f26472c = str2;
        this.f26473d = str3;
        this.f26474e = l10;
        this.f26475f = str4;
        this.f26476g = str5;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("provider", this.f26470a), TuplesKt.to("token", this.f26471b), TuplesKt.to("key_id", this.f26472c), TuplesKt.to("nonce", this.f26473d), TuplesKt.to("timestamp_ms", this.f26474e), TuplesKt.to("environment", this.f26475f), TuplesKt.to("error", this.f26476g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return Intrinsics.areEqual(this.f26470a, n02.f26470a) && Intrinsics.areEqual(this.f26471b, n02.f26471b) && Intrinsics.areEqual(this.f26472c, n02.f26472c) && Intrinsics.areEqual(this.f26473d, n02.f26473d) && Intrinsics.areEqual(this.f26474e, n02.f26474e) && Intrinsics.areEqual(this.f26475f, n02.f26475f) && Intrinsics.areEqual(this.f26476g, n02.f26476g);
    }

    public final int hashCode() {
        int hashCode = this.f26470a.hashCode() * 31;
        String str = this.f26471b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26472c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26473d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f26474e;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str4 = this.f26475f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26476g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "Attestation(provider=" + this.f26470a + ", token=" + this.f26471b + ", key_id=" + this.f26472c + ", nonce=" + this.f26473d + ", timestamp_ms=" + this.f26474e + ", environment=" + this.f26475f + ", error=" + this.f26476g + ')';
    }
}
