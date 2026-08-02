package j9;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f53853c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f53854a;

    /* renamed from: b, reason: collision with root package name */
    public final long f53855b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f53856a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f53857b = 0;

        public f a() {
            return new f(this.f53856a, this.f53857b);
        }

        public a b(long j10) {
            this.f53857b = j10;
            return this;
        }

        public a c(long j10) {
            this.f53856a = j10;
            return this;
        }
    }

    public f(long j10, long j11) {
        this.f53854a = j10;
        this.f53855b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f53855b;
    }

    public long b() {
        return this.f53854a;
    }
}
