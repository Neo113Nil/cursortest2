package c;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2446i {

    /* renamed from: a, reason: collision with root package name */
    public final String f26576a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26578c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26579d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26580e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26581f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26582g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f26583h;

    public C2446i(String eventType, String sdkVersion, String deviceModel, String osVersion, long j10, String str, String str2, Map map) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.f26576a = eventType;
        this.f26577b = sdkVersion;
        this.f26578c = deviceModel;
        this.f26579d = osVersion;
        this.f26580e = j10;
        this.f26581f = str;
        this.f26582g = str2;
        this.f26583h = map;
    }

    public final String a() {
        return this.f26578c;
    }

    public final String b() {
        return this.f26581f;
    }

    public final String c() {
        return this.f26582g;
    }

    public final String d() {
        return this.f26576a;
    }

    public final Map e() {
        return this.f26583h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2446i)) {
            return false;
        }
        C2446i c2446i = (C2446i) obj;
        return Intrinsics.areEqual(this.f26576a, c2446i.f26576a) && Intrinsics.areEqual(this.f26577b, c2446i.f26577b) && Intrinsics.areEqual(this.f26578c, c2446i.f26578c) && Intrinsics.areEqual(this.f26579d, c2446i.f26579d) && this.f26580e == c2446i.f26580e && Intrinsics.areEqual(this.f26581f, c2446i.f26581f) && Intrinsics.areEqual(this.f26582g, c2446i.f26582g) && Intrinsics.areEqual(this.f26583h, c2446i.f26583h);
    }

    public final String f() {
        return this.f26579d;
    }

    public final String g() {
        return this.f26577b;
    }

    public final long h() {
        return this.f26580e;
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.f26580e) + ((this.f26579d.hashCode() + ((this.f26578c.hashCode() + ((this.f26577b.hashCode() + (this.f26576a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f26581f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26582g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f26583h;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TelemetryEvent(eventType=" + this.f26576a + ", sdkVersion=" + this.f26577b + ", deviceModel=" + this.f26578c + ", osVersion=" + this.f26579d + ", timestamp=" + this.f26580e + ", errorMessage=" + this.f26581f + ", errorStackTrace=" + this.f26582g + ", metadata=" + this.f26583h + ')';
    }
}
