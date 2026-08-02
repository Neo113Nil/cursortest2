package yb;

import yb.AbstractC6870d;

/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6867a extends AbstractC6870d {

    /* renamed from: a, reason: collision with root package name */
    public final String f68301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68303c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC6872f f68304d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC6870d.b f68305e;

    /* renamed from: yb.a$b */
    public static final class b extends AbstractC6870d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f68306a;

        /* renamed from: b, reason: collision with root package name */
        public String f68307b;

        /* renamed from: c, reason: collision with root package name */
        public String f68308c;

        /* renamed from: d, reason: collision with root package name */
        public AbstractC6872f f68309d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC6870d.b f68310e;

        @Override // yb.AbstractC6870d.a
        public AbstractC6870d a() {
            return new C6867a(this.f68306a, this.f68307b, this.f68308c, this.f68309d, this.f68310e);
        }

        @Override // yb.AbstractC6870d.a
        public AbstractC6870d.a b(AbstractC6872f abstractC6872f) {
            this.f68309d = abstractC6872f;
            return this;
        }

        @Override // yb.AbstractC6870d.a
        public AbstractC6870d.a c(String str) {
            this.f68307b = str;
            return this;
        }

        @Override // yb.AbstractC6870d.a
        public AbstractC6870d.a d(String str) {
            this.f68308c = str;
            return this;
        }

        @Override // yb.AbstractC6870d.a
        public AbstractC6870d.a e(AbstractC6870d.b bVar) {
            this.f68310e = bVar;
            return this;
        }

        @Override // yb.AbstractC6870d.a
        public AbstractC6870d.a f(String str) {
            this.f68306a = str;
            return this;
        }
    }

    @Override // yb.AbstractC6870d
    public AbstractC6872f b() {
        return this.f68304d;
    }

    @Override // yb.AbstractC6870d
    public String c() {
        return this.f68302b;
    }

    @Override // yb.AbstractC6870d
    public String d() {
        return this.f68303c;
    }

    @Override // yb.AbstractC6870d
    public AbstractC6870d.b e() {
        return this.f68305e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6870d) {
            AbstractC6870d abstractC6870d = (AbstractC6870d) obj;
            String str = this.f68301a;
            if (str != null ? str.equals(abstractC6870d.f()) : abstractC6870d.f() == null) {
                String str2 = this.f68302b;
                if (str2 != null ? str2.equals(abstractC6870d.c()) : abstractC6870d.c() == null) {
                    String str3 = this.f68303c;
                    if (str3 != null ? str3.equals(abstractC6870d.d()) : abstractC6870d.d() == null) {
                        AbstractC6872f abstractC6872f = this.f68304d;
                        if (abstractC6872f != null ? abstractC6872f.equals(abstractC6870d.b()) : abstractC6870d.b() == null) {
                            AbstractC6870d.b bVar = this.f68305e;
                            if (bVar != null ? bVar.equals(abstractC6870d.e()) : abstractC6870d.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // yb.AbstractC6870d
    public String f() {
        return this.f68301a;
    }

    public int hashCode() {
        String str = this.f68301a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f68302b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f68303c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC6872f abstractC6872f = this.f68304d;
        int hashCode4 = (hashCode3 ^ (abstractC6872f == null ? 0 : abstractC6872f.hashCode())) * 1000003;
        AbstractC6870d.b bVar = this.f68305e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f68301a + ", fid=" + this.f68302b + ", refreshToken=" + this.f68303c + ", authToken=" + this.f68304d + ", responseCode=" + this.f68305e + "}";
    }

    public C6867a(String str, String str2, String str3, AbstractC6872f abstractC6872f, AbstractC6870d.b bVar) {
        this.f68301a = str;
        this.f68302b = str2;
        this.f68303c = str3;
        this.f68304d = abstractC6872f;
        this.f68305e = bVar;
    }
}
