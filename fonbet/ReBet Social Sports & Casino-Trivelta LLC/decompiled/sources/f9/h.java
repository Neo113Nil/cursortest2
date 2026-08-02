package f9;

/* loaded from: classes2.dex */
public final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    public final long f46539a;

    public h(long j10) {
        this.f46539a = j10;
    }

    @Override // f9.n
    public long c() {
        return this.f46539a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f46539a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f46539a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f46539a + "}";
    }
}
