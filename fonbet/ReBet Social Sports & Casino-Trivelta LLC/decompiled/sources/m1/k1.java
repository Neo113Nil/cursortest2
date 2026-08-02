package m1;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f56265c = new k1(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f56266a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56267b;

    public k1(int i10, boolean z10) {
        this.f56266a = i10;
        this.f56267b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f56266a == k1Var.f56266a && this.f56267b == k1Var.f56267b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f56266a << 1) + (this.f56267b ? 1 : 0);
    }
}
