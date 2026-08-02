package Bh;

import Bh.v;

/* loaded from: classes3.dex */
public final class b extends v.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f919d;

    /* renamed from: e, reason: collision with root package name */
    public final int f920e;

    /* renamed from: f, reason: collision with root package name */
    public final int f921f;

    /* renamed from: g, reason: collision with root package name */
    public final int f922g;

    public b(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f917b = i10;
        this.f918c = i11;
        this.f919d = i12;
        this.f920e = i13;
        this.f921f = i14;
        this.f922g = i15;
    }

    @Override // Bh.v.a, Bh.v
    public int c() {
        return this.f922g;
    }

    @Override // Bh.v
    public int d() {
        return this.f917b;
    }

    @Override // Bh.v
    public int e() {
        return this.f920e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v.a) {
            v.a aVar = (v.a) obj;
            if (this.f917b == aVar.d() && this.f918c == aVar.g() && this.f919d == aVar.h() && this.f920e == aVar.e() && this.f921f == aVar.f() && this.f922g == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // Bh.v
    public int f() {
        return this.f921f;
    }

    @Override // Bh.v
    public int g() {
        return this.f918c;
    }

    @Override // Bh.v
    public int h() {
        return this.f919d;
    }

    public int hashCode() {
        return ((((((((((this.f917b ^ 1000003) * 1000003) ^ this.f918c) * 1000003) ^ this.f919d) * 1000003) ^ this.f920e) * 1000003) ^ this.f921f) * 1000003) ^ this.f922g;
    }

    public String toString() {
        return "SpanLimitsValue{maxNumberOfAttributes=" + this.f917b + ", maxNumberOfEvents=" + this.f918c + ", maxNumberOfLinks=" + this.f919d + ", maxNumberOfAttributesPerEvent=" + this.f920e + ", maxNumberOfAttributesPerLink=" + this.f921f + ", maxAttributeValueLength=" + this.f922g + "}";
    }
}
