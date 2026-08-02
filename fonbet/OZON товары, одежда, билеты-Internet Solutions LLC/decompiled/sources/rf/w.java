package rf;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final long f83484a;

    /* renamed from: b, reason: collision with root package name */
    private final long f83485b;

    public w(long j11, long j12) {
        this.f83484a = j11;
        this.f83485b = j12;
    }

    public final long a() {
        return this.f83485b;
    }

    public final long b() {
        return this.f83484a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f83484a == wVar.f83484a && this.f83485b == wVar.f83485b;
    }

    public final int hashCode() {
        return (((int) this.f83484a) * 31) + ((int) this.f83485b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Validity(notBefore=");
        sb2.append(this.f83484a);
        sb2.append(", notAfter=");
        return P4.f.a(this.f83485b, ")", sb2);
    }
}
