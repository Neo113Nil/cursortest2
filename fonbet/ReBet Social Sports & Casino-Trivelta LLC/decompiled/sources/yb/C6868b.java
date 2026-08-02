package yb;

import yb.AbstractC6872f;

/* renamed from: yb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6868b extends AbstractC6872f {

    /* renamed from: a, reason: collision with root package name */
    public final String f68311a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68312b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC6872f.b f68313c;

    /* renamed from: yb.b$b, reason: collision with other inner class name */
    public static final class C0974b extends AbstractC6872f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f68314a;

        /* renamed from: b, reason: collision with root package name */
        public long f68315b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC6872f.b f68316c;

        /* renamed from: d, reason: collision with root package name */
        public byte f68317d;

        @Override // yb.AbstractC6872f.a
        public AbstractC6872f a() {
            if (this.f68317d == 1) {
                return new C6868b(this.f68314a, this.f68315b, this.f68316c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // yb.AbstractC6872f.a
        public AbstractC6872f.a b(AbstractC6872f.b bVar) {
            this.f68316c = bVar;
            return this;
        }

        @Override // yb.AbstractC6872f.a
        public AbstractC6872f.a c(String str) {
            this.f68314a = str;
            return this;
        }

        @Override // yb.AbstractC6872f.a
        public AbstractC6872f.a d(long j10) {
            this.f68315b = j10;
            this.f68317d = (byte) (this.f68317d | 1);
            return this;
        }
    }

    @Override // yb.AbstractC6872f
    public AbstractC6872f.b b() {
        return this.f68313c;
    }

    @Override // yb.AbstractC6872f
    public String c() {
        return this.f68311a;
    }

    @Override // yb.AbstractC6872f
    public long d() {
        return this.f68312b;
    }

    public boolean equals(Object obj) {
        AbstractC6872f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6872f) {
            AbstractC6872f abstractC6872f = (AbstractC6872f) obj;
            String str = this.f68311a;
            if (str != null ? str.equals(abstractC6872f.c()) : abstractC6872f.c() == null) {
                if (this.f68312b == abstractC6872f.d() && ((bVar = this.f68313c) != null ? bVar.equals(abstractC6872f.b()) : abstractC6872f.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f68311a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f68312b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        AbstractC6872f.b bVar = this.f68313c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f68311a + ", tokenExpirationTimestamp=" + this.f68312b + ", responseCode=" + this.f68313c + "}";
    }

    public C6868b(String str, long j10, AbstractC6872f.b bVar) {
        this.f68311a = str;
        this.f68312b = j10;
        this.f68313c = bVar;
    }
}
