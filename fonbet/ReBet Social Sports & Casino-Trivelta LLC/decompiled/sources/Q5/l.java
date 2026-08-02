package Q5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f9437a;

    /* renamed from: b, reason: collision with root package name */
    public final double f9438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9439c;

    public l(String name, double d10, String units) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(units, "units");
        this.f9437a = name;
        this.f9438b = d10;
        this.f9439c = units;
    }

    public final String a() {
        return this.f9437a;
    }

    public final String b() {
        return this.f9439c;
    }

    public final double c() {
        return this.f9438b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f9437a, lVar.f9437a) && Double.compare(this.f9438b, lVar.f9438b) == 0 && Intrinsics.areEqual(this.f9439c, lVar.f9439c);
    }

    public int hashCode() {
        return (((this.f9437a.hashCode() * 31) + Double.hashCode(this.f9438b)) * 31) + this.f9439c.hashCode();
    }

    public String toString() {
        return "HybridMetric(name=" + this.f9437a + ", value=" + this.f9438b + ", units=" + this.f9439c + ")";
    }
}
