package ve;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24910a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24911b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24912c;

    public u0(int i5, int i10, boolean z5) {
        boolean z7 = (i10 & 2) == 0;
        z5 = (i10 & 4) != 0 ? false : z5;
        this.f24910a = i5;
        this.f24911b = z7;
        this.f24912c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f24910a == u0Var.f24910a && this.f24911b == u0Var.f24911b && this.f24912c == u0Var.f24912c;
    }

    public final int hashCode() {
        return (((this.f24910a * 31) + (this.f24911b ? 1231 : 1237)) * 31) + (this.f24912c ? 1231 : 1237);
    }

    public final String toString() {
        return "MenuItem(id=" + this.f24910a + ", animOrange=" + this.f24911b + ", unReadRed=" + this.f24912c + ')';
    }
}
