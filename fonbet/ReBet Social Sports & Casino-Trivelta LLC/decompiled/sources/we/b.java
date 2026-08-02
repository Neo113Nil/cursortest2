package we;

/* loaded from: classes4.dex */
public abstract class b extends we.d {

    /* renamed from: h0, reason: collision with root package name */
    public final int f67607h0;

    /* renamed from: i0, reason: collision with root package name */
    public final String f67608i0;

    public static final class a extends b {

        /* renamed from: j0, reason: collision with root package name */
        public final String f67609j0;

        public a(String str) {
            super(5000, str);
            this.f67609j0 = str;
        }

        @Override // we.b, we.d
        public String b() {
            return this.f67609j0;
        }
    }

    /* renamed from: we.b$b, reason: collision with other inner class name */
    public static final class C0961b extends b {

        /* renamed from: j0, reason: collision with root package name */
        public static final C0961b f67610j0 = new C0961b();

        public C0961b() {
            super(5001, we.d.f67652e0.b());
        }
    }

    public static final class c extends b {

        /* renamed from: j0, reason: collision with root package name */
        public final String f67611j0;

        public c(String str) {
            super(5003, str);
            this.f67611j0 = str;
        }

        @Override // we.b, we.d
        public String b() {
            return this.f67611j0;
        }
    }

    public static final class d extends b {

        /* renamed from: j0, reason: collision with root package name */
        public static final d f67612j0 = new d();

        public d() {
            super(5004, "Socket connection failed on creating a new conversation");
        }
    }

    public static final class e extends b {

        /* renamed from: j0, reason: collision with root package name */
        public final String f67613j0;

        public e(String str) {
            super(5005, str);
            this.f67613j0 = str;
        }

        @Override // we.b, we.d
        public String b() {
            return this.f67613j0;
        }
    }

    public static final class f extends b {
        public f() {
            super(5002, "Trigger timed out");
        }
    }

    public b(int i10, String str) {
        super(i10, str);
        this.f67607h0 = i10;
        this.f67608i0 = str;
    }

    @Override // we.d
    public int a() {
        return this.f67607h0;
    }

    @Override // we.d
    public String b() {
        return this.f67608i0;
    }
}
