package f9;

import f9.o;

/* loaded from: classes2.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final o.c f46540a;

    /* renamed from: b, reason: collision with root package name */
    public final o.b f46541b;

    public static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public o.c f46542a;

        /* renamed from: b, reason: collision with root package name */
        public o.b f46543b;

        @Override // f9.o.a
        public o a() {
            return new i(this.f46542a, this.f46543b);
        }

        @Override // f9.o.a
        public o.a b(o.b bVar) {
            this.f46543b = bVar;
            return this;
        }

        @Override // f9.o.a
        public o.a c(o.c cVar) {
            this.f46542a = cVar;
            return this;
        }
    }

    @Override // f9.o
    public o.b b() {
        return this.f46541b;
    }

    @Override // f9.o
    public o.c c() {
        return this.f46540a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f46540a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f46541b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f46540a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f46541b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f46540a + ", mobileSubtype=" + this.f46541b + "}";
    }

    public i(o.c cVar, o.b bVar) {
        this.f46540a = cVar;
        this.f46541b = bVar;
    }
}
