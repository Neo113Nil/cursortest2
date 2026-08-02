package m1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: i, reason: collision with root package name */
    public static final n1 f56279i = new b().h();

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.E f56280a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f56281b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f56282c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f56283d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56284e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56285f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56286g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56287h;

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public Double f56289b;

        /* renamed from: c, reason: collision with root package name */
        public Double f56290c;

        /* renamed from: a, reason: collision with root package name */
        public com.google.common.collect.E f56288a = com.google.common.collect.E.s(1, 5);

        /* renamed from: d, reason: collision with root package name */
        public boolean f56291d = true;

        /* renamed from: e, reason: collision with root package name */
        public boolean f56292e = true;

        /* renamed from: f, reason: collision with root package name */
        public boolean f56293f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f56294g = true;

        public n1 h() {
            return new n1(this);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f56280a.equals(n1Var.f56280a) && this.f56285f == n1Var.f56285f && Objects.equals(this.f56281b, n1Var.f56281b) && Objects.equals(this.f56282c, n1Var.f56282c) && this.f56283d == n1Var.f56283d && this.f56286g == n1Var.f56286g && this.f56287h == n1Var.f56287h;
    }

    public int hashCode() {
        return Objects.hash(this.f56280a, this.f56281b, this.f56282c, Boolean.valueOf(this.f56283d), Boolean.valueOf(this.f56285f), Boolean.valueOf(this.f56286g), Boolean.valueOf(this.f56287h));
    }

    public n1(b bVar) {
        this.f56280a = bVar.f56288a;
        this.f56281b = bVar.f56289b;
        this.f56282c = bVar.f56290c;
        this.f56283d = bVar.f56291d;
        this.f56284e = !bVar.f56292e;
        this.f56285f = bVar.f56292e;
        this.f56286g = bVar.f56293f;
        this.f56287h = bVar.f56294g;
    }
}
