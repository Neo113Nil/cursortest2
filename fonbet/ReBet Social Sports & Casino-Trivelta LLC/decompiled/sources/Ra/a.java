package Ra;

/* loaded from: classes3.dex */
public final class a extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10126a = new a();
    private static final long serialVersionUID = 0;

    public static k f() {
        return f10126a;
    }

    private Object readResolve() {
        return f10126a;
    }

    @Override // Ra.k
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // Ra.k
    public boolean c() {
        return false;
    }

    @Override // Ra.k
    public Object e(Object obj) {
        return n.l(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
