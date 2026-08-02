package eb;

/* renamed from: eb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4191a extends o {

    /* renamed from: a, reason: collision with root package name */
    public final long f45865a;

    /* renamed from: b, reason: collision with root package name */
    public final long f45866b;

    /* renamed from: c, reason: collision with root package name */
    public final long f45867c;

    public C4191a(long j10, long j11, long j12) {
        this.f45865a = j10;
        this.f45866b = j11;
        this.f45867c = j12;
    }

    @Override // eb.o
    public long b() {
        return this.f45866b;
    }

    @Override // eb.o
    public long c() {
        return this.f45865a;
    }

    @Override // eb.o
    public long d() {
        return this.f45867c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f45865a == oVar.c() && this.f45866b == oVar.b() && this.f45867c == oVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f45865a;
        long j11 = this.f45866b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f45867c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f45865a + ", elapsedRealtime=" + this.f45866b + ", uptimeMillis=" + this.f45867c + "}";
    }
}
