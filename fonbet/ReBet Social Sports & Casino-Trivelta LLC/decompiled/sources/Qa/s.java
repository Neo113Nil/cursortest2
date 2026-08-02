package Qa;

/* loaded from: classes3.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final int f9598a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9599b;

    public s(int i10, long j10) {
        this.f9598a = i10;
        this.f9599b = j10;
    }

    @Override // Qa.t
    public final int a() {
        return this.f9598a;
    }

    @Override // Qa.t
    public final long b() {
        return this.f9599b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f9598a == tVar.a() && this.f9599b == tVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9599b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f9598a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f9598a + ", eventTimestamp=" + this.f9599b + "}";
    }
}
