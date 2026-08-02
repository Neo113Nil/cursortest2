package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2444h {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f26564a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f26565b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26566c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f26567d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26568e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26569f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26570g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26571h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26572i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26573j;

    public C2444h(Boolean bool, Double d10, Object obj, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f26564a = bool;
        this.f26565b = d10;
        this.f26566c = obj;
        this.f26567d = bool2;
        this.f26568e = str;
        this.f26569f = str2;
        this.f26570g = str3;
        this.f26571h = str4;
        this.f26572i = str5;
        this.f26573j = str6;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("is_jailbroken", this.f26564a), TuplesKt.to("confidence", this.f26565b), TuplesKt.to("jailbreak_paths", this.f26566c), TuplesKt.to("test_keys_present", this.f26567d), TuplesKt.to("bootloader", this.f26568e), TuplesKt.to("build_tags", this.f26569f), TuplesKt.to("build_type", this.f26570g), TuplesKt.to("build_user", this.f26571h), TuplesKt.to("build_host", this.f26572i), TuplesKt.to("build_fingerprint", this.f26573j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2444h)) {
            return false;
        }
        C2444h c2444h = (C2444h) obj;
        return Intrinsics.areEqual(this.f26564a, c2444h.f26564a) && Intrinsics.areEqual((Object) this.f26565b, (Object) c2444h.f26565b) && Intrinsics.areEqual(this.f26566c, c2444h.f26566c) && Intrinsics.areEqual(this.f26567d, c2444h.f26567d) && Intrinsics.areEqual(this.f26568e, c2444h.f26568e) && Intrinsics.areEqual(this.f26569f, c2444h.f26569f) && Intrinsics.areEqual(this.f26570g, c2444h.f26570g) && Intrinsics.areEqual(this.f26571h, c2444h.f26571h) && Intrinsics.areEqual(this.f26572i, c2444h.f26572i) && Intrinsics.areEqual(this.f26573j, c2444h.f26573j);
    }

    public final int hashCode() {
        Boolean bool = this.f26564a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f26565b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Object obj = this.f26566c;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool2 = this.f26567d;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f26568e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26569f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26570g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26571h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26572i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26573j;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "Integrity(is_jailbroken=" + this.f26564a + ", confidence=" + this.f26565b + ", jailbreak_paths=" + this.f26566c + ", test_keys_present=" + this.f26567d + ", bootloader=" + this.f26568e + ", build_tags=" + this.f26569f + ", build_type=" + this.f26570g + ", build_user=" + this.f26571h + ", build_host=" + this.f26572i + ", build_fingerprint=" + this.f26573j + ')';
    }
}
