package je;

/* loaded from: classes.dex */
public abstract class z0 implements y0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return a() == y0Var.a() && b() == y0Var.b() && getType().equals(y0Var.getType());
    }

    public final int hashCode() {
        int hashCode = b().hashCode();
        if (H0.q(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (a() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (a()) {
            return "*";
        }
        if (b() == L0.INVARIANT) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}
