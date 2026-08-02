package v3;

/* renamed from: v3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10209e {

    /* renamed from: d, reason: collision with root package name */
    public static final C10209e f101900d = new a().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f101901a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f101902b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f101903c;

    /* renamed from: v3.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f101904a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f101905b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f101906c;

        public final C10209e d() {
            if (this.f101904a || !(this.f101905b || this.f101906c)) {
                return new C10209e(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public final void e() {
            this.f101904a = true;
        }

        public final void f(boolean z11) {
            this.f101905b = z11;
        }

        public final void g(boolean z11) {
            this.f101906c = z11;
        }
    }

    C10209e(a aVar) {
        this.f101901a = aVar.f101904a;
        this.f101902b = aVar.f101905b;
        this.f101903c = aVar.f101906c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10209e.class == obj.getClass()) {
            C10209e c10209e = (C10209e) obj;
            if (this.f101901a == c10209e.f101901a && this.f101902b == c10209e.f101902b && this.f101903c == c10209e.f101903c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f101901a ? 1 : 0) << 2) + ((this.f101902b ? 1 : 0) << 1) + (this.f101903c ? 1 : 0);
    }
}
