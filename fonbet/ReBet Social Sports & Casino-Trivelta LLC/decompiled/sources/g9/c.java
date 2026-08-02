package g9;

import d9.AbstractC4041d;
import d9.C4040c;
import d9.InterfaceC4044g;
import g9.n;

/* loaded from: classes2.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final o f47175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47176b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4041d f47177c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4044g f47178d;

    /* renamed from: e, reason: collision with root package name */
    public final C4040c f47179e;

    public static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public o f47180a;

        /* renamed from: b, reason: collision with root package name */
        public String f47181b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC4041d f47182c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC4044g f47183d;

        /* renamed from: e, reason: collision with root package name */
        public C4040c f47184e;

        @Override // g9.n.a
        public n a() {
            String str = "";
            if (this.f47180a == null) {
                str = " transportContext";
            }
            if (this.f47181b == null) {
                str = str + " transportName";
            }
            if (this.f47182c == null) {
                str = str + " event";
            }
            if (this.f47183d == null) {
                str = str + " transformer";
            }
            if (this.f47184e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f47180a, this.f47181b, this.f47182c, this.f47183d, this.f47184e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g9.n.a
        public n.a b(C4040c c4040c) {
            if (c4040c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f47184e = c4040c;
            return this;
        }

        @Override // g9.n.a
        public n.a c(AbstractC4041d abstractC4041d) {
            if (abstractC4041d == null) {
                throw new NullPointerException("Null event");
            }
            this.f47182c = abstractC4041d;
            return this;
        }

        @Override // g9.n.a
        public n.a d(InterfaceC4044g interfaceC4044g) {
            if (interfaceC4044g == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f47183d = interfaceC4044g;
            return this;
        }

        @Override // g9.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f47180a = oVar;
            return this;
        }

        @Override // g9.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f47181b = str;
            return this;
        }
    }

    @Override // g9.n
    public C4040c b() {
        return this.f47179e;
    }

    @Override // g9.n
    public AbstractC4041d c() {
        return this.f47177c;
    }

    @Override // g9.n
    public InterfaceC4044g e() {
        return this.f47178d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f47175a.equals(nVar.f()) && this.f47176b.equals(nVar.g()) && this.f47177c.equals(nVar.c()) && this.f47178d.equals(nVar.e()) && this.f47179e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // g9.n
    public o f() {
        return this.f47175a;
    }

    @Override // g9.n
    public String g() {
        return this.f47176b;
    }

    public int hashCode() {
        return ((((((((this.f47175a.hashCode() ^ 1000003) * 1000003) ^ this.f47176b.hashCode()) * 1000003) ^ this.f47177c.hashCode()) * 1000003) ^ this.f47178d.hashCode()) * 1000003) ^ this.f47179e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f47175a + ", transportName=" + this.f47176b + ", event=" + this.f47177c + ", transformer=" + this.f47178d + ", encoding=" + this.f47179e + "}";
    }

    public c(o oVar, String str, AbstractC4041d abstractC4041d, InterfaceC4044g interfaceC4044g, C4040c c4040c) {
        this.f47175a = oVar;
        this.f47176b = str;
        this.f47177c = abstractC4041d;
        this.f47178d = interfaceC4044g;
        this.f47179e = c4040c;
    }
}
