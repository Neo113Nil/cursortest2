package N4;

/* loaded from: classes2.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f7895a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7896b;

    /* renamed from: c, reason: collision with root package name */
    public b f7897c;

    /* renamed from: N4.a$a, reason: collision with other inner class name */
    public static class C0159a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7898a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7899b;

        public C0159a() {
            this(300);
        }

        public a a() {
            return new a(this.f7898a, this.f7899b);
        }

        public C0159a b(boolean z10) {
            this.f7899b = z10;
            return this;
        }

        public C0159a(int i10) {
            this.f7898a = i10;
        }
    }

    public a(int i10, boolean z10) {
        this.f7895a = i10;
        this.f7896b = z10;
    }

    @Override // N4.e
    public d a(com.bumptech.glide.load.a aVar, boolean z10) {
        return aVar == com.bumptech.glide.load.a.MEMORY_CACHE ? c.b() : b();
    }

    public final d b() {
        if (this.f7897c == null) {
            this.f7897c = new b(this.f7895a, this.f7896b);
        }
        return this.f7897c;
    }
}
