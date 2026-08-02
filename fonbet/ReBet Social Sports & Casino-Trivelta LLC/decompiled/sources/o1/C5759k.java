package o1;

/* renamed from: o1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5759k {

    /* renamed from: d, reason: collision with root package name */
    public static final C5759k f58845d = new b().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58846a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58848c;

    /* renamed from: o1.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f58849a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f58850b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f58851c;

        public C5759k d() {
            if (this.f58849a || !(this.f58850b || this.f58851c)) {
                return new C5759k(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f58849a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f58850b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f58851c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5759k.class == obj.getClass()) {
            C5759k c5759k = (C5759k) obj;
            if (this.f58846a == c5759k.f58846a && this.f58847b == c5759k.f58847b && this.f58848c == c5759k.f58848c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f58846a ? 1 : 0) << 2) + ((this.f58847b ? 1 : 0) << 1) + (this.f58848c ? 1 : 0);
    }

    public C5759k(b bVar) {
        this.f58846a = bVar.f58849a;
        this.f58847b = bVar.f58850b;
        this.f58848c = bVar.f58851c;
    }
}
