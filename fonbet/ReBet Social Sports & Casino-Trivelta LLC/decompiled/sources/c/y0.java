package c;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26727a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26728b;

    /* renamed from: c, reason: collision with root package name */
    public final B0 f26729c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f26730d;

    /* renamed from: e, reason: collision with root package name */
    public final C2451k0 f26731e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f26732f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26733g;

    /* renamed from: h, reason: collision with root package name */
    public final C2447i0 f26734h;

    /* renamed from: i, reason: collision with root package name */
    public final N f26735i;

    /* renamed from: j, reason: collision with root package name */
    public final F0 f26736j;

    /* renamed from: k, reason: collision with root package name */
    public final C2437d0 f26737k;

    /* renamed from: l, reason: collision with root package name */
    public final C2464r0 f26738l;

    /* renamed from: m, reason: collision with root package name */
    public final double f26739m;

    public y0(String fingerprint, long j10, B0 device, z0 integrity, C2451k0 security, x0 software, String timezone, C2447i0 c2447i0, N n10, F0 f02, C2437d0 c2437d0, C2464r0 c2464r0, double d10) {
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(integrity, "integrity");
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(software, "software");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.f26727a = fingerprint;
        this.f26728b = j10;
        this.f26729c = device;
        this.f26730d = integrity;
        this.f26731e = security;
        this.f26732f = software;
        this.f26733g = timezone;
        this.f26734h = c2447i0;
        this.f26735i = n10;
        this.f26736j = f02;
        this.f26737k = c2437d0;
        this.f26738l = c2464r0;
        this.f26739m = d10;
    }

    public final C2447i0 a() {
        return this.f26734h;
    }

    public final double b() {
        return this.f26739m;
    }

    public final B0 c() {
        return this.f26729c;
    }

    public final String d() {
        return this.f26727a;
    }

    public final z0 e() {
        return this.f26730d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.areEqual(this.f26727a, y0Var.f26727a) && this.f26728b == y0Var.f26728b && Intrinsics.areEqual(this.f26729c, y0Var.f26729c) && Intrinsics.areEqual(this.f26730d, y0Var.f26730d) && Intrinsics.areEqual(this.f26731e, y0Var.f26731e) && Intrinsics.areEqual(this.f26732f, y0Var.f26732f) && Intrinsics.areEqual(this.f26733g, y0Var.f26733g) && Intrinsics.areEqual(this.f26734h, y0Var.f26734h) && Intrinsics.areEqual(this.f26735i, y0Var.f26735i) && Intrinsics.areEqual(this.f26736j, y0Var.f26736j) && Intrinsics.areEqual(this.f26737k, y0Var.f26737k) && Intrinsics.areEqual(this.f26738l, y0Var.f26738l) && Double.compare(this.f26739m, y0Var.f26739m) == 0;
    }

    public final F0 f() {
        return this.f26736j;
    }

    public final N g() {
        return this.f26735i;
    }

    public final C2451k0 h() {
        return this.f26731e;
    }

    public final int hashCode() {
        int hashCode = (this.f26733g.hashCode() + ((this.f26732f.hashCode() + ((this.f26731e.hashCode() + ((this.f26730d.hashCode() + ((this.f26729c.hashCode() + ((Long.hashCode(this.f26728b) + (this.f26727a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        C2447i0 c2447i0 = this.f26734h;
        int hashCode2 = (hashCode + (c2447i0 == null ? 0 : c2447i0.hashCode())) * 31;
        N n10 = this.f26735i;
        int hashCode3 = (hashCode2 + (n10 == null ? 0 : n10.hashCode())) * 31;
        F0 f02 = this.f26736j;
        int hashCode4 = (hashCode3 + (f02 == null ? 0 : f02.hashCode())) * 31;
        C2437d0 c2437d0 = this.f26737k;
        int hashCode5 = (hashCode4 + (c2437d0 == null ? 0 : c2437d0.hashCode())) * 31;
        C2464r0 c2464r0 = this.f26738l;
        return Double.hashCode(this.f26739m) + ((hashCode5 + (c2464r0 != null ? c2464r0.hashCode() : 0)) * 31);
    }

    public final C2464r0 i() {
        return this.f26738l;
    }

    public final x0 j() {
        return this.f26732f;
    }

    public final String k() {
        return this.f26733g;
    }

    public final C2437d0 l() {
        return this.f26737k;
    }

    public final String toString() {
        return "DeviceData(fingerprint=" + this.f26727a + ", timestamp=" + this.f26728b + ", device=" + this.f26729c + ", integrity=" + this.f26730d + ", security=" + this.f26731e + ", software=" + this.f26732f + ", timezone=" + this.f26733g + ", battery=" + this.f26734h + ", network=" + this.f26735i + ", location=" + this.f26736j + ", wifi=" + this.f26737k + ", simCard=" + this.f26738l + ", confidence=" + this.f26739m + ')';
    }
}
