package f9;

import f9.k;

/* renamed from: f9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4272e extends k {

    /* renamed from: a, reason: collision with root package name */
    public final k.b f46509a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4268a f46510b;

    /* renamed from: f9.e$b */
    public static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        public k.b f46511a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC4268a f46512b;

        @Override // f9.k.a
        public k a() {
            return new C4272e(this.f46511a, this.f46512b);
        }

        @Override // f9.k.a
        public k.a b(AbstractC4268a abstractC4268a) {
            this.f46512b = abstractC4268a;
            return this;
        }

        @Override // f9.k.a
        public k.a c(k.b bVar) {
            this.f46511a = bVar;
            return this;
        }
    }

    @Override // f9.k
    public AbstractC4268a b() {
        return this.f46510b;
    }

    @Override // f9.k
    public k.b c() {
        return this.f46509a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f46509a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                AbstractC4268a abstractC4268a = this.f46510b;
                if (abstractC4268a != null ? abstractC4268a.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f46509a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC4268a abstractC4268a = this.f46510b;
        return hashCode ^ (abstractC4268a != null ? abstractC4268a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f46509a + ", androidClientInfo=" + this.f46510b + "}";
    }

    public C4272e(k.b bVar, AbstractC4268a abstractC4268a) {
        this.f46509a = bVar;
        this.f46510b = abstractC4268a;
    }
}
