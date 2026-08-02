package o9;

/* renamed from: o9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5840b extends AbstractC5849k {

    /* renamed from: a, reason: collision with root package name */
    public final long f59534a;

    /* renamed from: b, reason: collision with root package name */
    public final g9.o f59535b;

    /* renamed from: c, reason: collision with root package name */
    public final g9.i f59536c;

    public C5840b(long j10, g9.o oVar, g9.i iVar) {
        this.f59534a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f59535b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f59536c = iVar;
    }

    @Override // o9.AbstractC5849k
    public g9.i b() {
        return this.f59536c;
    }

    @Override // o9.AbstractC5849k
    public long c() {
        return this.f59534a;
    }

    @Override // o9.AbstractC5849k
    public g9.o d() {
        return this.f59535b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5849k) {
            AbstractC5849k abstractC5849k = (AbstractC5849k) obj;
            if (this.f59534a == abstractC5849k.c() && this.f59535b.equals(abstractC5849k.d()) && this.f59536c.equals(abstractC5849k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f59534a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f59535b.hashCode()) * 1000003) ^ this.f59536c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f59534a + ", transportContext=" + this.f59535b + ", event=" + this.f59536c + "}";
    }
}
