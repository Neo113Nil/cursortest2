package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2467t {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f26673a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f26674b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f26675c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f26676d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f26677e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f26678f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f26679g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f26680h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f26681i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f26682j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f26683k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f26684l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f26685m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f26686n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f26687o;

    /* renamed from: p, reason: collision with root package name */
    public final String f26688p;

    public C2467t(Boolean bool, Double d10, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Object obj, Boolean bool13, String str) {
        this.f26673a = bool;
        this.f26674b = d10;
        this.f26675c = bool2;
        this.f26676d = bool3;
        this.f26677e = bool4;
        this.f26678f = bool5;
        this.f26679g = bool6;
        this.f26680h = bool7;
        this.f26681i = bool8;
        this.f26682j = bool9;
        this.f26683k = bool10;
        this.f26684l = bool11;
        this.f26685m = bool12;
        this.f26686n = obj;
        this.f26687o = bool13;
        this.f26688p = str;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("is_emulator", this.f26673a), TuplesKt.to("emulator_confidence", this.f26674b), TuplesKt.to("is_vpn_active", this.f26675c), TuplesKt.to("developer_options_enabled", this.f26676d), TuplesKt.to("unknown_sources_enabled", this.f26678f), TuplesKt.to("adb_enabled", this.f26677e), TuplesKt.to("debugger_attached", this.f26679g), TuplesKt.to("frida_detected", this.f26680h), TuplesKt.to("xposed_detected", this.f26681i), TuplesKt.to("substrate_detected", this.f26682j), TuplesKt.to("magisk_detected", this.f26683k), TuplesKt.to("app_cloned", this.f26684l), TuplesKt.to("jailbroken_advanced", this.f26685m), TuplesKt.to("suspicious_apps", this.f26686n), TuplesKt.to("signature_valid", this.f26687o), TuplesKt.to("threat_level", this.f26688p));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2467t)) {
            return false;
        }
        C2467t c2467t = (C2467t) obj;
        return Intrinsics.areEqual(this.f26673a, c2467t.f26673a) && Intrinsics.areEqual((Object) this.f26674b, (Object) c2467t.f26674b) && Intrinsics.areEqual(this.f26675c, c2467t.f26675c) && Intrinsics.areEqual(this.f26676d, c2467t.f26676d) && Intrinsics.areEqual(this.f26677e, c2467t.f26677e) && Intrinsics.areEqual(this.f26678f, c2467t.f26678f) && Intrinsics.areEqual(this.f26679g, c2467t.f26679g) && Intrinsics.areEqual(this.f26680h, c2467t.f26680h) && Intrinsics.areEqual(this.f26681i, c2467t.f26681i) && Intrinsics.areEqual(this.f26682j, c2467t.f26682j) && Intrinsics.areEqual(this.f26683k, c2467t.f26683k) && Intrinsics.areEqual(this.f26684l, c2467t.f26684l) && Intrinsics.areEqual(this.f26685m, c2467t.f26685m) && Intrinsics.areEqual(this.f26686n, c2467t.f26686n) && Intrinsics.areEqual(this.f26687o, c2467t.f26687o) && Intrinsics.areEqual(this.f26688p, c2467t.f26688p);
    }

    public final int hashCode() {
        Boolean bool = this.f26673a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f26674b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool2 = this.f26675c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f26676d;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f26677e;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f26678f;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f26679g;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f26680h;
        int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f26681i;
        int hashCode9 = (hashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f26682j;
        int hashCode10 = (hashCode9 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.f26683k;
        int hashCode11 = (hashCode10 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.f26684l;
        int hashCode12 = (hashCode11 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.f26685m;
        int hashCode13 = (hashCode12 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Object obj = this.f26686n;
        int hashCode14 = (hashCode13 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool13 = this.f26687o;
        int hashCode15 = (hashCode14 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        String str = this.f26688p;
        return hashCode15 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Security(is_emulator=" + this.f26673a + ", emulator_confidence=" + this.f26674b + ", is_vpn_active=" + this.f26675c + ", developer_options_enabled=" + this.f26676d + ", adb_enabled=" + this.f26677e + ", unknown_sources_enabled=" + this.f26678f + ", debugger_attached=" + this.f26679g + ", frida_detected=" + this.f26680h + ", xposed_detected=" + this.f26681i + ", substrate_detected=" + this.f26682j + ", magisk_detected=" + this.f26683k + ", app_cloned=" + this.f26684l + ", jailbroken_advanced=" + this.f26685m + ", suspicious_apps=" + this.f26686n + ", signature_valid=" + this.f26687o + ", threat_level=" + this.f26688p + ')';
    }
}
