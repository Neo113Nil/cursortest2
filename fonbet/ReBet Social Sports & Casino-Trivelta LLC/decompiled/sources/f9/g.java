package f9;

import f9.m;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    public final long f46525a;

    /* renamed from: b, reason: collision with root package name */
    public final long f46526b;

    /* renamed from: c, reason: collision with root package name */
    public final k f46527c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f46528d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46529e;

    /* renamed from: f, reason: collision with root package name */
    public final List f46530f;

    /* renamed from: g, reason: collision with root package name */
    public final p f46531g;

    public static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f46532a;

        /* renamed from: b, reason: collision with root package name */
        public Long f46533b;

        /* renamed from: c, reason: collision with root package name */
        public k f46534c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f46535d;

        /* renamed from: e, reason: collision with root package name */
        public String f46536e;

        /* renamed from: f, reason: collision with root package name */
        public List f46537f;

        /* renamed from: g, reason: collision with root package name */
        public p f46538g;

        @Override // f9.m.a
        public m a() {
            String str = "";
            if (this.f46532a == null) {
                str = " requestTimeMs";
            }
            if (this.f46533b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f46532a.longValue(), this.f46533b.longValue(), this.f46534c, this.f46535d, this.f46536e, this.f46537f, this.f46538g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f9.m.a
        public m.a b(k kVar) {
            this.f46534c = kVar;
            return this;
        }

        @Override // f9.m.a
        public m.a c(List list) {
            this.f46537f = list;
            return this;
        }

        @Override // f9.m.a
        public m.a d(Integer num) {
            this.f46535d = num;
            return this;
        }

        @Override // f9.m.a
        public m.a e(String str) {
            this.f46536e = str;
            return this;
        }

        @Override // f9.m.a
        public m.a f(p pVar) {
            this.f46538g = pVar;
            return this;
        }

        @Override // f9.m.a
        public m.a g(long j10) {
            this.f46532a = Long.valueOf(j10);
            return this;
        }

        @Override // f9.m.a
        public m.a h(long j10) {
            this.f46533b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // f9.m
    public k b() {
        return this.f46527c;
    }

    @Override // f9.m
    public List c() {
        return this.f46530f;
    }

    @Override // f9.m
    public Integer d() {
        return this.f46528d;
    }

    @Override // f9.m
    public String e() {
        return this.f46529e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f46525a == mVar.g() && this.f46526b == mVar.h() && ((kVar = this.f46527c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f46528d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f46529e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f46530f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f46531g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // f9.m
    public p f() {
        return this.f46531g;
    }

    @Override // f9.m
    public long g() {
        return this.f46525a;
    }

    @Override // f9.m
    public long h() {
        return this.f46526b;
    }

    public int hashCode() {
        long j10 = this.f46525a;
        long j11 = this.f46526b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f46527c;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f46528d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f46529e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f46530f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f46531g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f46525a + ", requestUptimeMs=" + this.f46526b + ", clientInfo=" + this.f46527c + ", logSource=" + this.f46528d + ", logSourceName=" + this.f46529e + ", logEvents=" + this.f46530f + ", qosTier=" + this.f46531g + "}";
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f46525a = j10;
        this.f46526b = j11;
        this.f46527c = kVar;
        this.f46528d = num;
        this.f46529e = str;
        this.f46530f = list;
        this.f46531g = pVar;
    }
}
