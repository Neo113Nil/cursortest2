package c;

import com.twilio.voice.PublisherMetadata;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436d {

    /* renamed from: a, reason: collision with root package name */
    public final String f26522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26523b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26524c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26525d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f26526e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f26527f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f26528g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26529h;

    /* renamed from: i, reason: collision with root package name */
    public final Float f26530i;

    /* renamed from: j, reason: collision with root package name */
    public final Float f26531j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f26532k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f26533l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f26534m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f26535n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f26536o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f26537p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f26538q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f26539r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f26540s;

    public C2436d(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, String str5, Float f10, Float f11, Long l10, Long l11, Object obj, Object obj2, Boolean bool, Boolean bool2, Integer num4, Long l12, Boolean bool3) {
        this.f26522a = str;
        this.f26523b = str2;
        this.f26524c = str3;
        this.f26525d = str4;
        this.f26526e = num;
        this.f26527f = num2;
        this.f26528g = num3;
        this.f26529h = str5;
        this.f26530i = f10;
        this.f26531j = f11;
        this.f26532k = l10;
        this.f26533l = l11;
        this.f26534m = obj;
        this.f26535n = obj2;
        this.f26536o = bool;
        this.f26537p = bool2;
        this.f26538q = num4;
        this.f26539r = l12;
        this.f26540s = bool3;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("manufacturer", this.f26522a), TuplesKt.to("model", this.f26523b), TuplesKt.to("brand", this.f26524c), TuplesKt.to(PublisherMetadata.OS_VERSION, this.f26525d), TuplesKt.to("sdk_int", this.f26526e), TuplesKt.to("screen_width", this.f26527f), TuplesKt.to("screen_height", this.f26528g), TuplesKt.to("screen_resolution", this.f26529h), TuplesKt.to("screen_density", this.f26530i), TuplesKt.to("screen_refresh_rate", this.f26531j), TuplesKt.to("total_memory", this.f26532k), TuplesKt.to("total_storage", this.f26533l), TuplesKt.to("available_sensors", this.f26534m), TuplesKt.to("system_features", this.f26535n), TuplesKt.to("has_nfc", this.f26536o), TuplesKt.to("has_fingerprint", this.f26537p), TuplesKt.to("camera_count", this.f26538q), TuplesKt.to("device_uptime", this.f26539r), TuplesKt.to("dark_mode", this.f26540s));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2436d)) {
            return false;
        }
        C2436d c2436d = (C2436d) obj;
        return Intrinsics.areEqual(this.f26522a, c2436d.f26522a) && Intrinsics.areEqual(this.f26523b, c2436d.f26523b) && Intrinsics.areEqual(this.f26524c, c2436d.f26524c) && Intrinsics.areEqual(this.f26525d, c2436d.f26525d) && Intrinsics.areEqual(this.f26526e, c2436d.f26526e) && Intrinsics.areEqual(this.f26527f, c2436d.f26527f) && Intrinsics.areEqual(this.f26528g, c2436d.f26528g) && Intrinsics.areEqual(this.f26529h, c2436d.f26529h) && Intrinsics.areEqual((Object) this.f26530i, (Object) c2436d.f26530i) && Intrinsics.areEqual((Object) this.f26531j, (Object) c2436d.f26531j) && Intrinsics.areEqual(this.f26532k, c2436d.f26532k) && Intrinsics.areEqual(this.f26533l, c2436d.f26533l) && Intrinsics.areEqual(this.f26534m, c2436d.f26534m) && Intrinsics.areEqual(this.f26535n, c2436d.f26535n) && Intrinsics.areEqual(this.f26536o, c2436d.f26536o) && Intrinsics.areEqual(this.f26537p, c2436d.f26537p) && Intrinsics.areEqual(this.f26538q, c2436d.f26538q) && Intrinsics.areEqual(this.f26539r, c2436d.f26539r) && Intrinsics.areEqual(this.f26540s, c2436d.f26540s);
    }

    public final int hashCode() {
        String str = this.f26522a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26523b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26524c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26525d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f26526e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f26527f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f26528g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.f26529h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f10 = this.f26530i;
        int hashCode9 = (hashCode8 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f26531j;
        int hashCode10 = (hashCode9 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Long l10 = this.f26532k;
        int hashCode11 = (hashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f26533l;
        int hashCode12 = (hashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Object obj = this.f26534m;
        int hashCode13 = (hashCode12 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f26535n;
        int hashCode14 = (hashCode13 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Boolean bool = this.f26536o;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f26537p;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.f26538q;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l12 = this.f26539r;
        int hashCode18 = (hashCode17 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool3 = this.f26540s;
        return hashCode18 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "Hardware(manufacturer=" + this.f26522a + ", model=" + this.f26523b + ", brand=" + this.f26524c + ", os_version=" + this.f26525d + ", sdk_int=" + this.f26526e + ", screen_width=" + this.f26527f + ", screen_height=" + this.f26528g + ", screen_resolution=" + this.f26529h + ", screen_density=" + this.f26530i + ", screen_refresh_rate=" + this.f26531j + ", total_memory=" + this.f26532k + ", total_storage=" + this.f26533l + ", available_sensors=" + this.f26534m + ", system_features=" + this.f26535n + ", has_nfc=" + this.f26536o + ", has_fingerprint=" + this.f26537p + ", camera_count=" + this.f26538q + ", device_uptime=" + this.f26539r + ", dark_mode=" + this.f26540s + ')';
    }
}
