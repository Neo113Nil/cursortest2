package yh;

/* renamed from: yh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6892a extends AbstractC6897f {

    /* renamed from: b, reason: collision with root package name */
    public final String f68406b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68407c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68408d;

    /* renamed from: e, reason: collision with root package name */
    public final oh.g f68409e;

    public C6892a(String str, String str2, String str3, oh.g gVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f68406b = str;
        this.f68407c = str2;
        this.f68408d = str3;
        if (gVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f68409e = gVar;
    }

    @Override // yh.AbstractC6897f
    public oh.g d() {
        return this.f68409e;
    }

    @Override // yh.AbstractC6897f
    public String e() {
        return this.f68406b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6897f) {
            AbstractC6897f abstractC6897f = (AbstractC6897f) obj;
            if (this.f68406b.equals(abstractC6897f.e()) && ((str = this.f68407c) != null ? str.equals(abstractC6897f.g()) : abstractC6897f.g() == null) && ((str2 = this.f68408d) != null ? str2.equals(abstractC6897f.f()) : abstractC6897f.f() == null) && this.f68409e.equals(abstractC6897f.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // yh.AbstractC6897f
    public String f() {
        return this.f68408d;
    }

    @Override // yh.AbstractC6897f
    public String g() {
        return this.f68407c;
    }

    public int hashCode() {
        int hashCode = (this.f68406b.hashCode() ^ 1000003) * 1000003;
        String str = this.f68407c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f68408d;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f68409e.hashCode();
    }

    public String toString() {
        return "InstrumentationScopeInfo{name=" + this.f68406b + ", version=" + this.f68407c + ", schemaUrl=" + this.f68408d + ", attributes=" + this.f68409e + "}";
    }
}
