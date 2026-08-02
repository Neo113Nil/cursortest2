package Y4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14060a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14061b;

    public a(String name, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f14060a = name;
        this.f14061b = j10;
    }

    public final String a() {
        return this.f14060a;
    }

    public final long b() {
        return this.f14061b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f14060a, aVar.f14060a) && this.f14061b == aVar.f14061b;
    }

    public int hashCode() {
        return (this.f14060a.hashCode() * 31) + Long.hashCode(this.f14061b);
    }

    public String toString() {
        return "CustomMeasurementDetails(name=" + this.f14060a + ", value=" + this.f14061b + ")";
    }
}
