package Fh;

/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public final h f3678d;

    /* renamed from: e, reason: collision with root package name */
    public final oh.g f3679e;

    public c(h hVar, oh.g gVar) {
        if (hVar == null) {
            throw new NullPointerException("Null decision");
        }
        this.f3678d = hVar;
        if (gVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f3679e = gVar;
    }

    @Override // Fh.d, Fh.i
    public h b() {
        return this.f3678d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f3678d.equals(dVar.b()) && this.f3679e.equals(dVar.getAttributes())) {
                return true;
            }
        }
        return false;
    }

    @Override // Fh.d, Fh.i
    public oh.g getAttributes() {
        return this.f3679e;
    }

    public int hashCode() {
        return ((this.f3678d.hashCode() ^ 1000003) * 1000003) ^ this.f3679e.hashCode();
    }

    public String toString() {
        return "ImmutableSamplingResult{decision=" + this.f3678d + ", attributes=" + this.f3679e + "}";
    }
}
