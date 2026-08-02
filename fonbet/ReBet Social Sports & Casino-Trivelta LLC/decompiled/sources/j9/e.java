package j9;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f53848c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f53849a;

    /* renamed from: b, reason: collision with root package name */
    public final long f53850b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f53851a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f53852b = 0;

        public e a() {
            return new e(this.f53851a, this.f53852b);
        }

        public a b(long j10) {
            this.f53851a = j10;
            return this;
        }

        public a c(long j10) {
            this.f53852b = j10;
            return this;
        }
    }

    public e(long j10, long j11) {
        this.f53849a = j10;
        this.f53850b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f53849a;
    }

    public long b() {
        return this.f53850b;
    }
}
