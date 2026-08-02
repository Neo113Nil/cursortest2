package h9;

import h9.g;

/* renamed from: h9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4490b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final g.a f47829a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47830b;

    public C4490b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f47829a = aVar;
        this.f47830b = j10;
    }

    @Override // h9.g
    public long b() {
        return this.f47830b;
    }

    @Override // h9.g
    public g.a c() {
        return this.f47829a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f47829a.equals(gVar.c()) && this.f47830b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f47829a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f47830b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f47829a + ", nextRequestWaitMillis=" + this.f47830b + "}";
    }
}
