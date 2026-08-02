package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574w7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14823a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14824b;

    public C0574w7(long j, int i5) {
        this.f14823a = j;
        this.f14824b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0574w7)) {
            return false;
        }
        C0574w7 c0574w7 = (C0574w7) obj;
        return this.f14823a == c0574w7.f14823a && this.f14824b == c0574w7.f14824b;
    }

    public final int hashCode() {
        long j = this.f14823a;
        return this.f14824b + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecimalProtoModel(mantissa=");
        sb2.append(this.f14823a);
        sb2.append(", exponent=");
        return d9.e.i(sb2, this.f14824b, ')');
    }
}
