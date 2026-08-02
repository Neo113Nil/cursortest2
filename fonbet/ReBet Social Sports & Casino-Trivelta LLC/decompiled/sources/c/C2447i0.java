package c;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2447i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26584a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26585b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f26586c;

    public C2447i0(float f10, boolean z10, Float f11) {
        this.f26584a = f10;
        this.f26585b = z10;
        this.f26586c = f11;
    }

    public final float a() {
        return this.f26584a;
    }

    public final Float b() {
        return this.f26586c;
    }

    public final boolean c() {
        return this.f26585b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2447i0)) {
            return false;
        }
        C2447i0 c2447i0 = (C2447i0) obj;
        return Float.compare(this.f26584a, c2447i0.f26584a) == 0 && this.f26585b == c2447i0.f26585b && Intrinsics.areEqual((Object) this.f26586c, (Object) c2447i0.f26586c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Float.hashCode(this.f26584a) * 31;
        boolean z10 = this.f26585b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        Float f10 = this.f26586c;
        return i11 + (f10 == null ? 0 : f10.hashCode());
    }

    public final String toString() {
        return "BatteryInfo(level=" + this.f26584a + ", isCharging=" + this.f26585b + ", temperature=" + this.f26586c + ')';
    }
}
