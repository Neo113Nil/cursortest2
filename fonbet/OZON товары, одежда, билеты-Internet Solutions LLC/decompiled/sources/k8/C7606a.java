package k8;

/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7606a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final long f71061a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71062b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71063c;

    C7606a(long j11, long j12, long j13) {
        this.f71061a = j11;
        this.f71062b = j12;
        this.f71063c = j13;
    }

    @Override // k8.g
    public final long a() {
        return this.f71062b;
    }

    @Override // k8.g
    public final long b() {
        return this.f71061a;
    }

    @Override // k8.g
    public final long c() {
        return this.f71063c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f71061a == gVar.b() && this.f71062b == gVar.a() && this.f71063c == gVar.c();
    }

    public final int hashCode() {
        long j11 = this.f71061a;
        long j12 = this.f71062b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f71063c;
        return i11 ^ ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f71061a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f71062b);
        sb2.append(", uptimeMillis=");
        return P4.f.a(this.f71063c, "}", sb2);
    }
}
