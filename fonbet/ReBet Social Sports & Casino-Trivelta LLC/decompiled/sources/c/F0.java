package c;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final double f26412a;

    /* renamed from: b, reason: collision with root package name */
    public final double f26413b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26414c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26415d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f26416e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f26417f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26418g;

    public F0(double d10, double d11, float f10, long j10, Double d12, Float f11, String str) {
        this.f26412a = d10;
        this.f26413b = d11;
        this.f26414c = f10;
        this.f26415d = j10;
        this.f26416e = d12;
        this.f26417f = f11;
        this.f26418g = str;
    }

    public final float a() {
        return this.f26414c;
    }

    public final Double b() {
        return this.f26416e;
    }

    public final double c() {
        return this.f26412a;
    }

    public final double d() {
        return this.f26413b;
    }

    public final String e() {
        return this.f26418g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return Double.compare(this.f26412a, f02.f26412a) == 0 && Double.compare(this.f26413b, f02.f26413b) == 0 && Float.compare(this.f26414c, f02.f26414c) == 0 && this.f26415d == f02.f26415d && Intrinsics.areEqual((Object) this.f26416e, (Object) f02.f26416e) && Intrinsics.areEqual((Object) this.f26417f, (Object) f02.f26417f) && Intrinsics.areEqual(this.f26418g, f02.f26418g);
    }

    public final Float f() {
        return this.f26417f;
    }

    public final long g() {
        return this.f26415d;
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.f26415d) + ((Float.hashCode(this.f26414c) + ((Double.hashCode(this.f26413b) + (Double.hashCode(this.f26412a) * 31)) * 31)) * 31)) * 31;
        Double d10 = this.f26416e;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Float f10 = this.f26417f;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.f26418g;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LocationInfo(latitude=" + this.f26412a + ", longitude=" + this.f26413b + ", accuracy=" + this.f26414c + ", timestamp=" + this.f26415d + ", altitude=" + this.f26416e + ", speed=" + this.f26417f + ", provider=" + this.f26418g + ')';
    }
}
